import * as path from 'path';

/**
 * Absolute path to the repository root.
 *
 * Derived from the compiled test's own location (out/test/*.js), not from
 * workspace.workspaceFolders: the test workspace is test_examples/sources, so
 * asking VS Code for the workspace root would not give the repo root.
 */
export function repoRoot(): string {
    return path.resolve(__dirname, '../../');
}

/** Absolute path to a fixture under test_examples/. */
export function fixture(...segments: string[]): string {
    return path.join(repoRoot(), 'test_examples', ...segments);
}
