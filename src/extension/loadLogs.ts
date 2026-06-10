import * as path from 'path';
import { Uri, window, workspace, RelativePattern } from 'vscode';
import { Log, PhysicalLocation } from 'sarif';
import { isAscentLog, getPhysicalLocation, ProcessedGraph, MapsModification } from '../shared';

export async function buildMaps(workspaceUriString?: string): Promise<Map<string, { fileNameUri: string, startLine: number }>> {
    const maps = new Map<string, { fileNameUri: string, startLine: number }>();
    if (!workspaceUriString) {
        return maps;
    }

    let files: Uri[] = [];
    try {
        const workspaceUri = Uri.parse(workspaceUriString, true);
        files = await workspace.findFiles(new RelativePattern(workspaceUri, '.maps/**'));
    } catch (e) {
        console.error('Failed to find .maps files', e);
        return maps;
    }

    if (files.length === 0) {
        return maps;
    }

    for (const file of files) {
        try {
            const content = await workspace.fs.readFile(file);
            const json = JSON.parse(new TextDecoder().decode(content));
            if (json.mappings && Array.isArray(json.mappings)) {
                for (const mapping of json.mappings) {
                    if (mapping.binary && mapping.source) {
                        const binaryUri = mapping.binary[0]?.physicalLocation?.artifactLocation?.uri;
                        const byteOffset = mapping.binary[0].physicalLocation?.region?.byteOffset;
                        if (binaryUri !== undefined && byteOffset !== undefined) {
                            const fileNameUri = mapping.source[0]?.physicalLocation?.artifactLocation?.uri;
                            const startLine = mapping.source[0]?.physicalLocation?.region?.startLine;
                            if (fileNameUri !== undefined && startLine !== undefined) {
                                maps.set(`${binaryUri}:${byteOffset}`, { fileNameUri, startLine });
                            }
                        }
                    }
                }
            }
        } catch (e) {
            console.error(`Failed to parse map file ${file.fsPath}:`, e);
        }
    }

    return maps;
}

export function applyMaps(log: Log, maps: Map<string, { fileNameUri: string, startLine: number }>) {

    const oldLocations: [number, number, PhysicalLocation][] = [];
    const binaryLocationsMap = new Map<string, string[]>();
    const modifications: MapsModification[] = [];

    if (maps.size === 0) {
        return { oldLocations, binaryLocationsMap, modifications };
    }

    let replacedCount = 0;

    for (let i = 0; i < (log.runs?.length ?? 0); i++) {
        const run = log.runs[i];
        for (let j = 0; j < (run.results?.length ?? 0); j++) {
            const result = run.results![j];
            if (result.ruleId?.startsWith('C0002') || result.ruleId?.startsWith('C0003')) {
                const loc = getPhysicalLocation(result);
                const uri = loc?.artifactLocation?.uri;
                const byteOffset = loc?.region?.byteOffset;
                if (uri && byteOffset !== undefined) {
                    const key = `${path.basename(uri)}:${byteOffset}`;
                    const mapEntry = maps.get(key);
                    if (mapEntry) {
                        replacedCount++;
                        oldLocations.push([i, j, loc!]);

                        const searchKey = `${mapEntry.fileNameUri}:${mapEntry.startLine}`;
                        if (!binaryLocationsMap.has(searchKey)) {
                            binaryLocationsMap.set(searchKey, []);
                        }
                        // Add unique pairs
                        const pair = `${uri},${byteOffset}`;
                        if (!binaryLocationsMap.get(searchKey)!.includes(pair)) {
                            binaryLocationsMap.get(searchKey)!.push(pair);
                        }

                        modifications.push({
                            runIndex: i,
                            resultIndex: j,
                            newUri: mapEntry.fileNameUri,
                            startLine: mapEntry.startLine,
                            preserveByteOffset: byteOffset
                        });
                        result.locations = [{
                            ...result.locations?.[0], // Preserve logicalLocations on the location object if it exists
                            physicalLocation: {
                                artifactLocation: {
                                    uri: mapEntry.fileNameUri,
                                    uriBaseId: 'SRCROOT'
                                },
                                region: {
                                    startLine: mapEntry.startLine,
                                    byteOffset: byteOffset
                                }
                            }
                        }];
                    } else if (path.basename(uri) === 'classes.dex') {
                        // Delete the physical location entirely if not updated from .maps,
                        // except we must preserve the byteOffset for path tracing.
                        if (result.locations?.[0]?.physicalLocation) {
                            modifications.push({
                                runIndex: i,
                                resultIndex: j,
                                deletePhysicalLocation: true,
                                preserveByteOffset: byteOffset
                            });
                            result.locations[0].physicalLocation = {
                                region: {
                                    byteOffset: byteOffset
                                }
                            };
                        }
                    }
                }
            }
        }
    }

    if (replacedCount === 0) {
        window.showWarningMessage('No locations in the SARIF were replaced using the .maps files.');
    }

    return { oldLocations, binaryLocationsMap, modifications };
}

// Global maps cache to avoid reading .maps directory repeatedly
let globalMaps = new Map<string, { fileNameUri: string, startLine: number }>();

export function clearMapsCache() {
    globalMaps.clear();
}

export async function loadLog(uri: Uri): Promise<Log | undefined> {
    const primaryWorkspaceFolderUriString = workspace.workspaceFolders?.[0]?.uri.toString();

    if (globalMaps.size === 0) {
        globalMaps = await buildMaps(primaryWorkspaceFolderUriString);
    }

    try {
        const contentArray = await workspace.fs.readFile(uri);
        const content = new TextDecoder().decode(contentArray);

        let log: Log;
        try {
            log = JSON.parse(content) as Log;
        } catch {
            window.showErrorMessage(`Failed to load ${path.basename(uri.fsPath)}: Not a valid JSON file.`);
            return undefined;
        }

        // Validate that this is actually a CTADL log
        const isCtadl = log.runs?.some(run => run.tool?.driver?.name?.toLowerCase() === 'ctadl');
        if (!isCtadl) {
            window.showErrorMessage(`Failed to load ${path.basename(uri.fsPath)}: Not a recognized CTADL SARIF file (tool.driver.name is not 'ctadl').`);
            return undefined;
        }

        log._uri = uri.toString();

        if (isAscentLog(log)) {
            const { oldLocations, binaryLocationsMap, modifications } = applyMaps(log, globalMaps);

            log._old_locations = oldLocations;
            log._binary_locations_map = binaryLocationsMap;
            log._maps_modifications = modifications;

            // Pre-calculate --source and --sink arguments for get-paths
            const sources = new Set<string>();
            const sinks = new Set<string>();

            for (const run of log.runs || []) {
                for (const result of run.results || []) {
                    if (result.ruleId === 'C0003.taint-source') {
                        const taintVertex = result.properties?.taintVertex;
                        if (typeof taintVertex === 'string') {
                            sources.add(taintVertex);
                        }
                    } else if (result.ruleId === 'C0004.taint-sink') {
                        const taintVertex = result.properties?.taintVertex;
                        if (typeof taintVertex === 'string') {
                            sinks.add(taintVertex);
                        }
                    }
                }
            }

            const pathsArgs: string[] = [];
            for (const source of sources) {
                pathsArgs.push('--source', source);
            }
            for (const sink of sinks) {
                pathsArgs.push('--sink', sink);
            }
            log._get_paths_args = pathsArgs;
        } else {
            for (let i = 0; i < (log.runs?.length ?? 0); i++) {
                const run = log.runs[i];
                if (run.graphs && run.graphs.length >= 2) {
                    Object.defineProperty(run, '_forward_graph', { value: new ProcessedGraph(run.graphs[0], i, log), enumerable: false, writable: true });
                    Object.defineProperty(run, '_backward_graph', { value: new ProcessedGraph(run.graphs[1], i, log), enumerable: false, writable: true });
                } else {
                    // Create empty graphs
                    Object.defineProperty(run, '_forward_graph', { value: new ProcessedGraph(undefined, i, log), enumerable: false, writable: true });
                    Object.defineProperty(run, '_backward_graph', { value: new ProcessedGraph(undefined, i, log), enumerable: false, writable: true });
                }

                // To avoid sending massive graphs to the panel and crashing IPC, we can hide them from enumeration if we don't need them in the webview
                if (run.graphs) {
                    const originalGraphs = run.graphs;
                    delete run.graphs;
                    Object.defineProperty(run, 'graphs', { value: originalGraphs, enumerable: false, writable: true });
                }
            }
        }

        if (!isAscentLog(log)) {
            for (const run of log.runs || []) {
                run._forward_graph?.buildLinesMap(log);
                run._backward_graph?.buildLinesMap(log);
            }
        }

        return log;
    } catch (e) {
        console.error(`Failed to load log at ${uri.fsPath}`, e);
        return undefined;
    }
}
