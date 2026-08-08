import * as assert from 'assert';
import * as vscode from 'vscode';
import { fixture } from './testUtils';

/**
 * End-to-end tests that drive the extension the way a user does: through
 * registered commands, asserting on observable VS Code state.
 *
 * These deliberately import nothing from ../extension. The extension under test
 * runs from the webpack bundle (dist/extension.js) while these tests run from
 * tsc output (out/), so any module imported here would be a *separate instance*
 * with separate module state. Commands are the only shared surface.
 *
 * The workspace root is test_examples/sources (see .vscode-test.mjs), which is
 * what lets .maps discovery and relative-path diagnostics resolve.
 */

/** Poll until `predicate` holds, so tests don't race VS Code's async plumbing. */
async function waitFor(predicate: () => boolean, message: string, timeoutMs = 20000): Promise<void> {
    const deadline = Date.now() + timeoutMs;
    while (Date.now() < deadline) {
        if (predicate()) {
            return;
        }
        await new Promise(resolve => setTimeout(resolve, 100));
    }
    assert.fail(`Timed out after ${timeoutMs}ms waiting for: ${message}`);
}

// A source file the .maps fixtures remap real results.sarif byte offsets onto.
const MAPPED_SOURCE = 'com/google/android/material/chip/Chip.java';

suite('Integration Test Suite', () => {
    let doc: vscode.TextDocument;

    suiteSetup(async function () {
        this.timeout(60000);
        doc = await vscode.workspace.openTextDocument(vscode.Uri.file(fixture('sources', MAPPED_SOURCE)));
    });

    suiteTeardown(async () => {
        await vscode.commands.executeCommand('ctadl.closeSarif');
    });

    test('openSarif publishes CTADL diagnostics onto mapped source files', async function () {
        this.timeout(60000);

        assert.strictEqual(
            vscode.languages.getDiagnostics(doc.uri).length, 0,
            'Precondition: no diagnostics before a SARIF is loaded'
        );

        await vscode.commands.executeCommand('ctadl.openSarif', vscode.Uri.file(fixture('results.sarif')));

        await waitFor(
            () => vscode.languages.getDiagnostics(doc.uri).length > 0,
            `diagnostics to appear on ${MAPPED_SOURCE}`
        );

        const diags = vscode.languages.getDiagnostics(doc.uri);
        assert.ok(diags.every(d => d.source === 'CTADL'), 'All diagnostics should be sourced from CTADL');
        assert.ok(
            diags.some(d => String(d.code).startsWith('C0002')),
            'Expected at least one C0002.tainted-instruction diagnostic'
        );
        assert.ok(
            diags.every(d => d.range.start.line < doc.lineCount),
            'Diagnostics should land on lines that exist in the document'
        );
    });

    test('showDiagnostics=false clears diagnostics without unloading the SARIF', async function () {
        this.timeout(60000);

        const config = vscode.workspace.getConfiguration('ctadl');
        try {
            await config.update('showDiagnostics', false, vscode.ConfigurationTarget.Workspace);
            await waitFor(
                () => vscode.languages.getDiagnostics(doc.uri).length === 0,
                'diagnostics to clear when showDiagnostics is disabled'
            );
        } finally {
            await config.update('showDiagnostics', undefined, vscode.ConfigurationTarget.Workspace);
        }

        // The log is still loaded, so re-enabling restores diagnostics.
        await waitFor(
            () => vscode.languages.getDiagnostics(doc.uri).length > 0,
            'diagnostics to return when showDiagnostics is re-enabled'
        );
    });

    test('closeSarif clears diagnostics', async function () {
        this.timeout(60000);

        assert.ok(
            vscode.languages.getDiagnostics(doc.uri).length > 0,
            'Precondition: diagnostics are present before closing'
        );

        await vscode.commands.executeCommand('ctadl.closeSarif');

        await waitFor(
            () => vscode.languages.getDiagnostics(doc.uri).length === 0,
            'diagnostics to clear after closeSarif'
        );
    });
});
