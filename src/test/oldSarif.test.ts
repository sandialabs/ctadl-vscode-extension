import * as assert from 'assert';
import * as vscode from 'vscode';
import * as path from 'path';
import * as fs from 'fs';
import { Log } from 'sarif';
import { isAscentLog } from '../shared';

suite('Old SARIF Format Test Suite', () => {
    test('isAscentLog correctly identifies old CTADL logs as false', async () => {
        const rootPath = vscode.workspace.workspaceFolders?.[0]?.uri.fsPath || path.resolve(__dirname, '../../');
        const sarifPath = path.join(rootPath, 'test_examples', 'results_old_ctadl.sarif');
        const logContent = await fs.promises.readFile(sarifPath, 'utf8');
        const log = JSON.parse(logContent) as Log;

        assert.strictEqual(isAscentLog(log), false, "Old SARIF logs should not be identified as Ascent logs");
    });

    test('Old CTADL log contains codeFlows', async () => {
        const rootPath = vscode.workspace.workspaceFolders?.[0]?.uri.fsPath || path.resolve(__dirname, '../../');
        const sarifPath = path.join(rootPath, 'test_examples', 'results_old_ctadl.sarif');
        const logContent = await fs.promises.readFile(sarifPath, 'utf8');
        const log = JSON.parse(logContent) as Log;

        assert.ok(log.runs && log.runs.length > 0, "Log should have at least one run");

        let hasCodeFlows = false;
        for (const run of log.runs) {
            for (const result of run.results || []) {
                if (result.codeFlows && result.codeFlows.length > 0) {
                    hasCodeFlows = true;
                    // Verify structure
                    const flow = result.codeFlows[0];
                    assert.ok(flow.threadFlows && flow.threadFlows.length > 0, "codeFlow should have threadFlows");
                    assert.ok(flow.threadFlows[0].locations && flow.threadFlows[0].locations.length > 0, "threadFlow should have locations");
                    break;
                }
            }
            if (hasCodeFlows) {break;}
        }

        assert.ok(hasCodeFlows, "At least one result should contain codeFlows in the old CTADL SARIF format");
    });
});
