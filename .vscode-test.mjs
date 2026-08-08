import { defineConfig } from '@vscode/test-cli';

// Electron refuses to enable its sandbox when running as root and exits. That
// is exactly the situation inside the test container (scripts/test-container.sh),
// and only there: on a normal developer machine, and on the GitHub runner, the
// tests run as an ordinary user and keep the sandbox.
const runningAsRoot = process.platform === 'linux' && process.getuid?.() === 0;

export default defineConfig({
    files: 'out/test/**/*.test.js',
    launchArgs: runningAsRoot ? ['--no-sandbox'] : [],
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
