# CTADL VSCode Extension

An extension to view results from CTADL, primarily for analyzing taint locations and taint flow paths. This extension parses SARIF files emitted by CTADL and provides a dedicated UI to analyze the results.

CTADL results can be viewed as squiggles in your source, in the Problems list, or in the dedicated **CTADL Results Panel**. The panel provides a table of all findings, and a "Paths" view to trace taint sources and sinks from a selected line of code.

## Usage

Install this extension via the .vsix file from the command palette with `Ctrl+Shift+P`: `Extensions: Install from VSIX` or from `View -> Extensions` then click the `...` in the top right and select `Install from VSIX...`.

Results (`*.sarif`) can be loaded in two ways:
* Run the `Open SARIF File` command directly.
* Manually toggle the panel with the command `Toggle Panel` command. Then click "Open SARIF File".

**Note for Ascent-based CTADL Logs:** To use the path tracing feature with the newer Ascent-based CTADL, you must configure the `CTADL: Ascent Path` setting in your VS Code User Settings to point to the directory containing the `get-paths` python script.

For detailed instructions on using this extension with CTADL output, see the [tutorial](tutorial.md).

## Features

- **Results Table**: View all taint analysis results in an interactive table with search filtering.
- **Path Tracing**: Right-click a line in your source code and select "Get Paths for Current Line" to trace forward (to sinks) and backward (from sources) taint paths related to that line.

## Development

`F5` launches this extension in a new VS Code window. Subsequent changes are watched and rebuilt. Use the command `Developer: Reload Window` to see changes.

To install npm and nodejs in Ubuntu, do `sudo apt install nodejs npm` or use [nvm](https://github.com/nvm-sh/nvm?tab=readme-ov-file#installing-and-updating): `nvm install --lts`. Afterwards, do `npm install`.

Common tasks:

| Command | Comments |
| --- | --- |
| `npx @vscode/vsce package --no-rewrite-relative-links` | Build the project to produce a VSIX package in the project root directory. |
| `npm run compile` | Webpack bundles the extension. |
| `npm run package` | Webpack bundles the extension for production. |
| `npm run compile-tests` | Compiles the typescript test files. |
| `npm run lint` | Run ESLint. |
| `npm test` | Automatically compiles tests, bundles code, runs the linter, and executes the test suite. |

`xvfb-run npm test` can be used instead in a headless environment.

# Copyright

Copyright 2026 National Technology & Engineering Solutions of Sandia, LLC (NTESS). Under the terms
of Contract DE-NA0003525 with NTESS, the U.S. Government retains certain rights in this software.
