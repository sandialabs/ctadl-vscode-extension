# Plan for VSCode Plugin Implementation - DO-NOT-MERGE

Read the README and the RECON. Use macOS headless testing.

I want to implement the testable (non-GUI) part of this plugin. This has to cooperate with ctadl and definitely needs extra functionality in ctadl. ctadl is available at ../ct-update-vscode-extension.

The plugin should use the "highlights" profile initially and the "human" profile when generating paths?

1. When this plugin receives a request to generate paths, it needs to call out to ctadl. It should call 'query' to generate paths for a narrow request.
