import * as vscode from 'vscode';
import * as util from 'util';
import * as path from 'path';
import { execFile } from 'child_process';
import { Log, Node, Result } from 'sarif';
import { isAscentLog, ProcessedGraph, asyncExists } from '../shared';
import { Direction, CtadlDataResult } from '../shared/ctadlShared';

const defaultExecFilePromise = util.promisify(execFile);

export async function runPathsScript(log: Log, relativeDoc: string, lineNum: number, execFn: (file: string, args: string[]) => Promise<{stdout: string, stderr: string}> = defaultExecFilePromise): Promise<{ fwd: CtadlDataResult[][], bwd: CtadlDataResult[][] } | undefined> {
    let ret: { fwd: CtadlDataResult[][], bwd: CtadlDataResult[][] } = { fwd: [], bwd: [] };
    if (isAscentLog(log)) {
        const ctadlPath = vscode.workspace.getConfiguration('ctadl').get<string>('ascentPath');
        if (!ctadlPath) {
            vscode.window.showErrorMessage('Need to set \'ctadl.ascentPath\' to get paths (Ctrl+Shift+P -> User Settings)', {modal: true});
            return undefined;
        }

        let scriptPath = path.join(ctadlPath, process.platform === 'win32' ? 'get-paths.exe' : 'get-paths');
        if (process.platform === 'win32' && !(await asyncExists(scriptPath))) {
            // fallback if it's a batch file or just get-paths
            const fallbackPath = path.join(ctadlPath, 'get-paths');
            if (await asyncExists(fallbackPath)) {
                scriptPath = fallbackPath;
            }
        }

        if (!(await asyncExists(scriptPath))) {
            vscode.window.showErrorMessage(`Expected script not found at ${scriptPath}. Please check your 'ctadl.ascentPath' setting.`, {modal: true});
            return undefined;
        }

        const pairs = log._binary_locations_map?.get(`${relativeDoc}:${lineNum}`) || [];
        if (pairs.length > 0) {
            const projectName = log.properties?.project_name;
            if (!projectName) {
                vscode.window.showErrorMessage('SARIF log does not contain a project_name property.', {modal: true});
                return undefined;
            }

            const args = [projectName, ...pairs];
            if (log._get_paths_args) {
                args.push(...log._get_paths_args);
            }

            try {
                const { stdout, stderr: _stderr } = await execFn(scriptPath, args);
                const parsed = JSON.parse(stdout);

                let byteOffsetMap: Map<number, Result> | undefined = (log as any)._byteOffsetMap;
                if (!byteOffsetMap) {
                    byteOffsetMap = new Map<number, Result>();
                    for (const run of log.runs || []) {
                        for (const result of run.results || []) {
                            const offset = result.locations?.[0]?.physicalLocation?.region?.byteOffset;
                            if (offset !== undefined) {
                                byteOffsetMap.set(offset, result);
                            }
                        }
                    }
                    (log as any)._byteOffsetMap = byteOffsetMap;
                }

                const normalizePaths = (paths: unknown): CtadlDataResult[][] => {
                    if (!Array.isArray(paths)) {
                        return [];
                    }
                    return paths.map((group: unknown) => {
                        if (!Array.isArray(group)) {
                            return [];
                        }
                        return group.map((step: unknown) => {
                            const dataStep = step as CtadlDataResult;
                            if (dataStep.byteOffset !== undefined && !dataStep.result && byteOffsetMap) {
                                dataStep.result = byteOffsetMap.get(dataStep.byteOffset);
                            }
                            return dataStep;
                        });
                    });
                };

                ret = {
                    fwd: normalizePaths(parsed.fwd),
                    bwd: normalizePaths(parsed.bwd)
                };
            } catch (error: any) {
                // If get-paths fails, it likely returns error messages about missing paths in stderr or stdout
                vscode.window.showErrorMessage(`Failed to execute script ${scriptPath}, err: ${error.message || error}.`, {modal: true});
                return undefined;
            }
        }
    }
    return ret;
}

function processGraph(graph: ProcessedGraph | undefined, relativeDoc: string, lineNum: number, graphKind: Direction): CtadlDataResult[][] {
    const results = [] as CtadlDataResult[][];
    if (!graph) { return results; }

    const edges = graph.getEdgesForLine([relativeDoc, lineNum]);
    let allPathsGroups: Node[][][] = [];

    const targetFn = graphKind === Direction.Forward ? graph.isSourceNode.bind(graph) : graph.isSinkNode.bind(graph);

    // In legacy ctadl, we search from edges using dfsSearchFromEdges
    // Forward direction searches backward to source. Backward direction searches forward to sink.
    allPathsGroups = graph.dfsSearchFromEdges(edges, graphKind === Direction.Forward ? Direction.Backward : Direction.Forward, targetFn);

    // Grouping by original edges
    for (const pathGroup of allPathsGroups) {
        for (const path of pathGroup) {
            const pathResult = [] as CtadlDataResult[];
            let pathNodes = path;
            for (let nodeIdx = 0; nodeIdx < pathNodes.length - 1; nodeIdx++) {
                const node = pathNodes[nodeIdx];
                const nextNode = pathNodes[nodeIdx + 1];
                // Order of parameters depends on direction graph was constructed
                const edge = graph.getEdge(node, nextNode) || graph.getEdge(nextNode, node);
                const insn = graph.getInstruction(edge);

                if (insn !== undefined) {
                    // To keep parity with ascent script paths output, we pass the instruction directly
                    pathResult.push({
                        result: insn,
                        inNode: graph.getNodeInfo(node),
                        outNode: graph.getNodeInfo(nextNode)
                    });
                }
            }

            if (pathResult.length > 0) {
                results.push(pathResult);
            }
        }
    }

    // Deduplicate paths (matching legacy implementation)
    const seenInstructions = new Set<string>();
    const newResults = [];
    for (const result of results) {
        const res = result.length > 1 ? result[1] : result[0];
        if (res !== undefined) {
            const loc = res.result?.locations?.[0]?.physicalLocation;
            const uri = loc?.artifactLocation?.uri || '';
            const startLine = loc?.region?.startLine || '';
            const ruleId = res.result?.ruleId || '';
            const inNode = res.inNode ? `${res.inNode.var}:${res.inNode.mth}:${res.inNode.class}` : '';
            const outNode = res.outNode ? `${res.outNode.var}:${res.outNode.mth}:${res.outNode.class}` : '';
            const resStr = `${uri}:${startLine}:${ruleId}:${inNode}:${outNode}`;
            if (!seenInstructions.has(resStr)) {
                newResults.push(result);
                seenInstructions.add(resStr);
            }
        }
    }

    return newResults;
}

export async function srcSinkPathsCommand(log: Log | undefined) {
    if (!log) {
        return { fwd: [], bwd: [] };
    }

    const editor = vscode.window.activeTextEditor;
    if (!editor) {
        return { fwd: [], bwd: [] };
    }

    const doc = editor.document;
    const pos = editor.selection.active;
    const relativeDoc = vscode.workspace.asRelativePath(doc.uri);

    if (relativeDoc === doc.uri.fsPath) {
        vscode.window.showErrorMessage(`Failed to get relative path for file:\n\n${doc.uri}\n\nHave you set workspace to the source directory?`, {modal: true});
        return;
    }

    const lineNum = pos.line + 1;
    let combinedResults = { fwd: [] as CtadlDataResult[][], bwd: [] as CtadlDataResult[][] };

    const config = vscode.workspace.getConfiguration('ctadl');
    const collapseDuplicates = config.get<boolean>('collapsePathDuplicates', false);
    const hideBlankLine = config.get<boolean>('hideBlankLineResults', false);

    const processPathGroup = (group: CtadlDataResult[]) => {
        let processed = [...group];

        if (hideBlankLine) {
            processed = processed.filter(step => {
                const res = step.result;
                const loc = res?.locations?.[0]?.physicalLocation;
                return loc?.region?.startLine !== undefined;
            });
        }

        if (collapseDuplicates) {
            processed = processed.filter((step, index, arr) => {
                if (index === 0) {
                    return true;
                }
                const prev = arr[index - 1].result;
                const curr = step.result;

                const prevLoc = prev?.locations?.[0]?.physicalLocation;
                const currLoc = curr?.locations?.[0]?.physicalLocation;

                const isSameUri = prevLoc?.artifactLocation?.uri === currLoc?.artifactLocation?.uri;
                const isSameLine = prevLoc?.region?.startLine === currLoc?.region?.startLine;

                return !(isSameUri && isSameLine);
            });
        }

        return processed;
    };

    if (isAscentLog(log)) {
        const results = await runPathsScript(log, relativeDoc, lineNum);

        if (!results) {
            return undefined;
        }

        const forwardResults: CtadlDataResult[][] = results.fwd;
        const backwardResults: CtadlDataResult[][] = results.bwd;

        if (forwardResults && forwardResults.length > 0) {
            const processedFwd = forwardResults.map((group: CtadlDataResult[]) => processPathGroup(group)).filter((g: CtadlDataResult[]) => g.length > 0);
            for (const p of processedFwd) {
                combinedResults.fwd.push(p);
            }
        }
        if (backwardResults && backwardResults.length > 0) {
            const processedBwd = backwardResults.map((group: CtadlDataResult[]) => processPathGroup(group)).filter((g: CtadlDataResult[]) => g.length > 0);
            for (const p of processedBwd) {
                combinedResults.bwd.push(p);
            }
        }
    } else {
        for (const run of log.runs || []) {
            const fwdGraphResults = processGraph(run._forward_graph, relativeDoc, lineNum, Direction.Forward);
            const bwdGraphResults = processGraph(run._backward_graph, relativeDoc, lineNum, Direction.Backward);

            // Forward graph (direction forward) -> maps to backward results (Source -> Target)
            // Backward graph (direction backward) -> maps to forward results (Target -> Sink)
            if (bwdGraphResults && bwdGraphResults.length > 0) {
                const processedFwd = bwdGraphResults.map((group: CtadlDataResult[]) => processPathGroup(group)).filter((g: CtadlDataResult[]) => g.length > 0);
                for (const p of processedFwd) {
                    combinedResults.fwd.push(p);
                }
            }
            if (fwdGraphResults && fwdGraphResults.length > 0) {
                const processedBwd = fwdGraphResults.map((group: CtadlDataResult[]) => processPathGroup(group)).filter((g: CtadlDataResult[]) => g.length > 0);
                for (const p of processedBwd) {
                    combinedResults.bwd.push(p);
                }
            }
        }
    }

    return combinedResults;
}
