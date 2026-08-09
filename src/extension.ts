import * as vscode from 'vscode';
import { loadLog, clearMapsCache } from './extension/loadLogs';
import { SarifViewerPanel } from './extension/panel';
import { Log } from 'sarif';
import { srcSinkPathsCommand } from './extension/ctadl';
import { getPhysicalLocation, hasUriScheme } from './shared';
import { CtadlDataResult } from './shared/ctadlShared';

interface CachedDiagnostic {
    line: number;
    message: string;
    severity: vscode.DiagnosticSeverity;
    ruleId: string;
}

let loadedLog: Log | undefined = undefined;
let lastPaths: { fwd: CtadlDataResult[][], bwd: CtadlDataResult[][] } | null = null;
let diagsCache = new Map<string, CachedDiagnostic[]>();

function updateDiagsCache() {
    diagsCache.clear();
    const severities: Record<string, vscode.DiagnosticSeverity> = {
        error: vscode.DiagnosticSeverity.Error,
        warning: vscode.DiagnosticSeverity.Warning,
        note: vscode.DiagnosticSeverity.Information
    };

    if (loadedLog) {
        for (const run of loadedLog.runs || []) {
            const rulesMap = new Map<string, string>();
            for (const r of run.tool?.driver?.rules || []) {
                if (r.id) {
                    rulesMap.set(r.id, r.name || r.id);
                }
            }

            for (const result of run.results || []) {
                const loc = getPhysicalLocation(result);
                if (!loc || !loc.artifactLocation || !loc.artifactLocation.uri || !loc.region || loc.region.startLine === undefined) {
                    continue;
                }

                const uriStr = loc.artifactLocation.uri;
                const line = Math.max(0, loc.region.startLine - 1);
                const ruleName = result.ruleId ? rulesMap.get(result.ruleId) : undefined;
                const message = result.message?.text || ruleName || 'SARIF Result';

                const severity = severities[result.level || 'warning'] ?? vscode.DiagnosticSeverity.Warning;

                const diag: CachedDiagnostic = {
                    line, message, severity, ruleId: result.ruleId || ''
                };

                let cacheKey = uriStr;
                if (hasUriScheme(uriStr)) {
                    try {
                        const parsedUri = vscode.Uri.parse(uriStr, true);
                        if (parsedUri.scheme === 'file') {
                            cacheKey = parsedUri.fsPath;
                        }
                    } catch {
                        // Keep cacheKey as uriStr if parsing fails
                    }
                }

                let diags = diagsCache.get(cacheKey);
                if (!diags) {
                    diags = [];
                    diagsCache.set(cacheKey, diags);
                }
                diags.push(diag);
            }
        }
    }
}

let _sarifLoaded: boolean | undefined = undefined;
function setSarifLoadedContext(value: boolean) {
    if (_sarifLoaded !== value) {
        _sarifLoaded = value;
        vscode.commands.executeCommand('setContext', 'ctadl.sarifLoaded', value);
    }
}

export function activate(context: vscode.ExtensionContext) {
    setSarifLoadedContext(false);

    const diagsAll = vscode.languages.createDiagnosticCollection('SARIF');
    context.subscriptions.push(diagsAll);

    const setDiags = (doc: vscode.TextDocument) => {
        if (doc.uri.scheme === 'output' || doc.uri.scheme === 'vscode' || doc.uri.scheme === 'comment' || doc.uri.scheme === 'vscode-terminal') {
            return;
        }

        const showDiagnostics = vscode.workspace.getConfiguration('ctadl').get<boolean>('showDiagnostics', true);

        if (!showDiagnostics || !loadedLog) {
            diagsAll.set(doc.uri, []);
            return;
        }

        const docRelativePath = vscode.workspace.asRelativePath(doc.uri);
        const diags: vscode.Diagnostic[] = [];
        const addDiags = (cds: CachedDiagnostic[]) => {
            for (const cd of cds) {
                // Determine the first non-whitespace character's column if the line exists
                let startCol = 0;
                if (cd.line < doc.lineCount) {
                    startCol = doc.lineAt(cd.line).firstNonWhitespaceCharacterIndex;
                }

                // By providing a very large end column, VS Code will automatically clamp
                // the diagnostic squiggle to highlight to the end of the line.
                const range = new vscode.Range(cd.line, startCol, cd.line, 1000000);
                const diag = new vscode.Diagnostic(range, cd.message, cd.severity);
                diag.code = cd.ruleId;
                diag.source = 'CTADL';
                diags.push(diag);
            }
        };

        const cds1 = diagsCache.get(docRelativePath);
        if (cds1) {
            addDiags(cds1);
        }

        if (docRelativePath !== doc.uri.fsPath) {
            const cds2 = diagsCache.get(doc.uri.fsPath);
            if (cds2) {
                addDiags(cds2);
            }
        }

        diagsAll.set(doc.uri, diags);
    };

    const refreshAllDiags = () => {
        vscode.workspace.textDocuments.forEach(setDiags);
    };

    vscode.workspace.textDocuments.forEach(setDiags);

    // Intentionally do NOT listen to workspace.onDidChangeTextDocument here.
    // VS Code natively tracks diagnostics and visually shifts their squiggle anchors automatically
    // when a user adds or removes text above the diagnostic line. Because we use a massive actualEndCol,
    // we don't have to manually extend the diagnostic bounds on every keystroke either.
    context.subscriptions.push(vscode.workspace.onDidOpenTextDocument(setDiags));
    context.subscriptions.push(vscode.workspace.onDidCloseTextDocument(doc => diagsAll.delete(doc.uri)));
    context.subscriptions.push(vscode.workspace.onDidChangeConfiguration(e => {
        if (e.affectsConfiguration('ctadl.showDiagnostics')) {
            refreshAllDiags();
        }
    }));

    const srcSinkPathsDisposable = vscode.commands.registerCommand('ctadl.srcSinkPaths', async () => {
        if (!loadedLog) {
            vscode.window.showInformationMessage('No SARIF file loaded.');
            return;
        }

        await vscode.window.withProgress({
            location: vscode.ProgressLocation.Notification,
            title: 'Getting paths...',
            cancellable: false
        }, async () => {
            const results = await srcSinkPathsCommand(loadedLog);
            if (results) {
                lastPaths = results;
                if (SarifViewerPanel.currentPanel) {
                    const isVisible = SarifViewerPanel.currentPanel.isVisible();
                    SarifViewerPanel.currentPanel.sendPaths(results, isVisible);
                }
            }
        });
    });

    // Register a command to open a SARIF file. Invoked with no argument (command
    // palette, webview) it prompts; callers that already know the file pass a Uri.
    const openSarifDisposable = vscode.commands.registerCommand('ctadl.openSarif', async (target?: vscode.Uri) => {
        let uri = target;

        if (!uri) {
            const uris = await vscode.window.showOpenDialog({
                canSelectMany: false,
                filters: {
                    'SARIF files': ['sarif', 'json']
                }
            });
            uri = uris?.[0];
        }

        if (!uri) {
            return;
        }

        const fileUri = uri;
        await vscode.window.withProgress({
            location: vscode.ProgressLocation.Notification,
            title: "Loading SARIF File...",
            cancellable: false
        }, async () => {
            SarifViewerPanel.createOrShow(context.extensionUri, undefined, true);
            SarifViewerPanel.currentPanel?.setLoading();
            loadedLog = await loadLog(fileUri);
            updateDiagsCache();
            lastPaths = null;
            SarifViewerPanel.currentPanel?.sendPaths(null);
            refreshAllDiags();
            if (loadedLog) {
                SarifViewerPanel.currentPanel?.updateLog(loadedLog);
                setSarifLoadedContext(true);
            } else {
                setSarifLoadedContext(false);
            }
        });
    });

    const togglePanelDisposable = vscode.commands.registerCommand('ctadl.togglePanel', () => {
        SarifViewerPanel.toggle(context.extensionUri, loadedLog);
        if (lastPaths && SarifViewerPanel.currentPanel) {
            SarifViewerPanel.currentPanel.sendPaths(lastPaths, false);
        }
    });

    const closeSarifDisposable = vscode.commands.registerCommand('ctadl.closeSarif', () => {
        if (!loadedLog) {
            return;
        }
        loadedLog = undefined;
        updateDiagsCache();
        lastPaths = null;
        diagsAll.clear();
        if (SarifViewerPanel.currentPanel) {
            SarifViewerPanel.currentPanel.clearLogs();
        }
        setSarifLoadedContext(false);
    });

    const reloadMapsDisposable = vscode.commands.registerCommand('ctadl.reloadMaps', () => {
        clearMapsCache();
        vscode.window.showInformationMessage('Maps cache cleared. Will reload on next SARIF open.');
    });

    context.subscriptions.push(srcSinkPathsDisposable, openSarifDisposable, togglePanelDisposable, closeSarifDisposable, reloadMapsDisposable);
}

export function deactivate() {}
