import * as vscode from 'vscode';
import { Log } from 'sarif';
import { CtadlDataResult } from '../shared/ctadlShared';
import { hasUriScheme } from '../shared';

export class SarifViewerPanel {
    public static currentPanel: SarifViewerPanel | undefined;
    public static lastActiveTab: 'results' | 'paths' | undefined;
    public static resultsSplitHeight: number = 50;
    public static pathsSplitHeight: number = 75;
    private readonly _panel: vscode.WebviewPanel;
    private readonly _extensionUri: vscode.Uri;
    private _disposables: vscode.Disposable[] = [];
    private _log: Log | undefined;
    private _isLoading: boolean = false;
    private _paths: { fwd: CtadlDataResult[][], bwd: CtadlDataResult[][] } | null = null;

    private constructor(panel: vscode.WebviewPanel, extensionUri: vscode.Uri, initialLog?: Log, initialLoading?: boolean) {
        this._panel = panel;
        this._extensionUri = extensionUri;
        this._log = initialLog;
        this._isLoading = initialLoading || false;

        this._update();

        this._panel.onDidDispose(() => this.dispose(), null, this._disposables);

        this._panel.webview.onDidReceiveMessage(
            message => {
                switch (message.command) {
                    case 'ready':
                        if (this._log) {
                            this.sendLog(this._log);
                        } else if (this._isLoading) {
                            this.setLoading();
                        } else {
                            if (this._panel && this._panel.webview) {
                                this._panel.webview.postMessage({ command: 'setLogs', logsPayload: [], activeTab: SarifViewerPanel.lastActiveTab });
                            }
                        }
                        if (this._paths) {
                            this.sendPaths(this._paths, false);
                        }
                        return;
                    case 'openSourceLocation':
                        this.openSourceLocation(message.uri, message.startLine);
                        return;
                    case 'requestOpenSarif':
                        vscode.commands.executeCommand('ctadl.openSarif');
                        return;
                    case 'requestCloseSarif':
                        vscode.commands.executeCommand('ctadl.closeSarif');
                        return;
                    case 'tabChanged':
                        SarifViewerPanel.lastActiveTab = message.tab;
                        return;
                    case 'saveSplitHeights':
                        if (message.resultsSplitHeight !== undefined) {
                            SarifViewerPanel.resultsSplitHeight = message.resultsSplitHeight;
                        }
                        if (message.pathsSplitHeight !== undefined) {
                            SarifViewerPanel.pathsSplitHeight = message.pathsSplitHeight;
                        }
                        return;
                }
            },
            null,
            this._disposables
        );
    }

    public static createOrShow(extensionUri: vscode.Uri, initialLog?: Log, initialLoading?: boolean) {
        if (SarifViewerPanel.currentPanel) {
            SarifViewerPanel.currentPanel._panel.reveal(undefined, true);
            return;
        }

        const panel = vscode.window.createWebviewPanel(
            'ctadl',
            'CTADL',
            { preserveFocus: true, viewColumn: vscode.ViewColumn.Two },
            {
                enableScripts: true,
                localResourceRoots: [
                    vscode.Uri.joinPath(extensionUri, 'dist'),
                    vscode.Uri.joinPath(extensionUri, 'node_modules', '@vscode', 'codicons', 'dist'),
                    vscode.Uri.file('/'),
                    ...'abcdefghijklmnopqrstuvwxyz'.split('').map(c => vscode.Uri.file(`${c}:`))
                ],
                retainContextWhenHidden: true
            }
        );

        SarifViewerPanel.currentPanel = new SarifViewerPanel(panel, extensionUri, initialLog, initialLoading);
    }

    public static toggle(extensionUri: vscode.Uri, log: Log | undefined) {
        if (SarifViewerPanel.currentPanel && SarifViewerPanel.currentPanel._panel.visible) {
            SarifViewerPanel.currentPanel.dispose();
        } else {
            SarifViewerPanel.createOrShow(extensionUri, log);
            // We no longer need to call updateLog(log) here since it's passed as initialLog
            // and the webview will request it via the 'ready' command.
        }
    }

    public isVisible(): boolean {
        return this._panel ? this._panel.visible : false;
    }

    public updateLog(log: Log) {
        this._log = log;
        this._paths = null;
        this.sendLog(log);
    }

    public sendLog(log: Log) {
        this._isLoading = false;
        if (this._panel && this._panel.webview) {
            let webviewUri = '';
            if (log._uri) {
                const parsedUri = vscode.Uri.parse(log._uri, true);
                webviewUri = this._panel.webview.asWebviewUri(parsedUri).toString();
            }

            this._panel.webview.postMessage({
                command: 'setLogs',
                logsPayload: [{
                    webviewUri,
                    maps_modifications: log._maps_modifications
                }],
                activeTab: SarifViewerPanel.lastActiveTab
            });
        }
    }

    public setLoading() {
        this._isLoading = true;
        if (this._panel && this._panel.webview) {
            this._panel.webview.postMessage({ command: 'setLoading' });
        }
    }

    public clearLogs() {
        this._log = undefined;
        this._paths = null;
        if (this._panel && this._panel.webview) {
            this._panel.webview.postMessage({ command: 'clearLogs' });
        }
    }

    public sendPaths(paths: { fwd: CtadlDataResult[][], bwd: CtadlDataResult[][] } | null, autoSwitchTab: boolean = true) {
        this._paths = paths;
        if (this._panel && this._panel.webview) {
            this._panel.webview.postMessage({ command: 'setPaths', paths, autoSwitchTab });
        }
    }

    private async openSourceLocation(uriStr: string, startLine: number) {
        if (!uriStr || uriStr.trim() === '') {
            return;
        }

        try {
            let uri: vscode.Uri | undefined;
            const hasScheme = hasUriScheme(uriStr);

            if (!hasScheme) {
                // Try to open as local path
                let found = false;
                if (vscode.workspace.workspaceFolders) {
                    for (const folder of vscode.workspace.workspaceFolders) {
                        const testUri = vscode.Uri.joinPath(folder.uri, uriStr);
                        try {
                            await vscode.workspace.fs.stat(testUri);
                            uri = testUri;
                            found = true;
                            break;
                        } catch {
                            // File doesn't exist in this folder, continue searching
                        }
                    }
                }

                if (!found) {
                    try {
                        const absoluteUri = vscode.Uri.file(uriStr);
                        await vscode.workspace.fs.stat(absoluteUri);
                        uri = absoluteUri;
                        found = true;
                    } catch {
                        // File doesn't exist as absolute path either
                    }
                }

                if (!found) {
                    vscode.window.showErrorMessage(`File does not exist: ${uriStr}`);
                    return;
                }
            } else {
                uri = vscode.Uri.parse(uriStr, true);
            }

            if (!uri) {
                return;
            }

            const doc = await vscode.workspace.openTextDocument(uri);
            const editor = await vscode.window.showTextDocument(doc, vscode.ViewColumn.One, true);

            // SARIF lines are 1-based, VS Code lines are 0-based
            const line = Math.max(0, startLine - 1);
            const range = new vscode.Range(line, 0, line, 0);

            editor.selection = new vscode.Selection(range.start, range.end);
            editor.revealRange(range, vscode.TextEditorRevealType.InCenterIfOutsideViewport);
        } catch (e) {
            vscode.window.showErrorMessage(`Failed to open location: ${e}`);
        }
    }

    public dispose() {
        SarifViewerPanel.currentPanel = undefined;
        this._panel.dispose();

        while (this._disposables.length) {
            const x = this._disposables.pop();
            if (x) {
                x.dispose();
            }
        }
    }

    private _update() {
        const webview = this._panel.webview;
        this._panel.title = 'CTADL';
        this._panel.webview.html = this._getHtmlForWebview(webview);
    }

    private _getHtmlForWebview(webview: vscode.Webview) {
        const scriptUri = webview.asWebviewUri(vscode.Uri.joinPath(this._extensionUri, 'dist', 'panel.js'));
        const codiconsUri = webview.asWebviewUri(vscode.Uri.joinPath(this._extensionUri, 'node_modules', '@vscode', 'codicons', 'dist', 'codicon.css'));

        const nonce = getNonce();

        return `<!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <!--
                    Use a content security policy to only allow loading images from https or from our extension directory,
                    and only allow scripts that have a specific nonce.
                -->
                <meta http-equiv="Content-Security-Policy" content="default-src 'none'; font-src ${webview.cspSource}; style-src ${webview.cspSource} 'unsafe-inline'; script-src 'nonce-${nonce}'; connect-src ${webview.cspSource};">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <link href="${codiconsUri}" rel="stylesheet" />
                <title>CTADL</title>
                <script nonce="${nonce}">
                    window.initialState = {
                        hasLog: ${this._log ? 'true' : 'false'},
                        isLoading: ${this._isLoading ? 'true' : 'false'},
                        resultsSplitHeight: ${SarifViewerPanel.resultsSplitHeight},
                        pathsSplitHeight: ${SarifViewerPanel.pathsSplitHeight}
                    };
                </script>
            </head>
            <body>
                <div id="root"></div>
                <script nonce="${nonce}" src="${scriptUri}"></script>
            </body>
            </html>`;
    }
}

function getNonce() {
    let text = '';
    const possible = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    for (let i = 0; i < 32; i++) {
        text += possible.charAt(Math.floor(Math.random() * possible.length));
    }
    return text;
}
