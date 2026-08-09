import { defineConfig } from '@vscode/test-cli';

export default defineConfig({
    files: 'out/test/**/*.test.js',
    // Integration tests need a real workspace root: loadLog() discovers .maps via
    // workspace.workspaceFolders[0], and setDiags() keys diagnostics off
    // asRelativePath(), so results.sarif only resolves onto source files when
    // test_examples/sources is the workspace.
    workspaceFolder: 'test_examples/sources',
    mocha: {
        // The first SARIF load reads 6736 .maps files to build the cache.
        timeout: 60000,
    },
});
