# CTADL VS Code Extension

An extension to view results from CTADL, primarily for analyzing taint locations and taint flow paths. This extension parses SARIF files emitted by CTADL and provides a dedicated UI to analyze the results.

CTADL results can be viewed as squiggles in your source, in the Problems list, or in the dedicated **CTADL Results Panel**. The panel provides a table of all findings, and a "Paths" view to trace taint sources and sinks from a selected line of code.

## Usage

Install this extension via the .vsix file from the command palette with `Ctrl+Shift+P`: `Extensions: Install from VSIX` or from `View -> Extensions` then click the `...` in the top right and select `Install from VSIX...`.

Results (`*.sarif`) can be loaded in two ways:
* Run the `Open SARIF File` command directly.
* Manually toggle the panel with the `Toggle Panel` command. Then click "Open SARIF File".

To generate a SARIF file from CTADL's one-shot `go` command, provide the project name with `--name`:

```bash
ctadl go --name my-project --sarif-profile machine --output results.sarif --models /path/to/query.json /path/to/artifact.apk
```

You do **not** need a local `ctadl-rs` checkout to load and view an existing SARIF file. A local CTADL build is only required for generating new CTADL output or for the **Get Paths for Current Line** feature, which shells out to `get-paths`.

**Note for Ascent-based CTADL Logs:** To use the path tracing feature with the newer Ascent-based CTADL, you must configure the `CTADL: Ascent Path` setting in your VS Code User Settings to point to the directory containing the `get-paths` executable/script. This usually means building or otherwise installing CTADL locally; it is not required for simply opening SARIF results.

For detailed instructions on using this extension with CTADL output, see the [tutorial](tutorial.md).

## Features

- **Results Table**: View all taint analysis results in an interactive table with search filtering.
- **Path Tracing**: Right-click a line in your source code and select **Get Paths for Current Line** to trace forward (to sinks) and backward (from sources).

## Commands

- **Open SARIF File** (`ctadl.openSarif`): load a `*.sarif` produced by CTADL.
- **Toggle Panel** (`ctadl.togglePanel`): open/close the CTADL Results Panel (it disposes when toggling off).
- **Close SARIF File** (`ctadl.closeSarif`): clear the currently loaded SARIF, diagnostics, and path state.
- **Get Paths for Current Line** (`ctadl.srcSinkPaths`): compute taint paths for the cursor’s current line.
- **Reload Maps Cache** (`ctadl.reloadMaps`): clear the cached `.maps` remapping tables.

## Configuration

- `ctadl.showDiagnostics` (boolean, default: `true`): show CTADL results as VS Code diagnostics (squiggles + Problems list).
- `ctadl.ascentPath` (string): directory containing the external `get-paths` binary used for Ascent-based CTADL logs.
- `ctadl.collapsePathDuplicates` (boolean, default: `false`): collapse consecutive duplicate steps in the path view.
- `ctadl.hideBlankLineResults` (boolean, default: `false`): hide path steps that have no mapped line number.

**Important for Ascent-based logs:** diagnostic squiggles and path location mapping rely on `*.maps/**` files. Make sure your VS Code *workspace root* contains the `.maps` directory that corresponds to the SARIF you load.

For Ascent path tracing, set `ctadl.ascentPath` so the extension can run `get-paths`.

Also note: `get-paths` loads an indexed CTADL project from your local CTADL state store using the SARIF `properties.project_name` value. If that project is missing (e.g., you get an error about `project_config.json` not found), you must create it by running CTADL `import` + `index` for that project name before using path tracing.

### Preparing CTADL for path tracing

Opening and browsing an existing SARIF file does not require CTADL or a `ctadl-rs` checkout. Path tracing does require a local `get-paths` executable, plus a CTADL store containing an indexed project whose name matches the SARIF `properties.project_name` value.

From your local `ctadl-rs` checkout, build both CTADL binaries used by the path-tracing workflow:

```bash
cargo build --release -p ctadl-ascent --bins
```

This produces `ctadl` and `get-paths` in Cargo's release output directory, usually `target/release/` under the `ctadl-rs` checkout. Set `CTADL: Ascent Path` to the absolute path of the directory containing `get-paths`.

Import and index the artifact under the same project name that appears in the SARIF:

```bash
/path/to/ctadl import /path/to/artifact.apk --name my-project
/path/to/ctadl index my-project
```

If you also want to regenerate the SARIF from the separately imported/indexed project, run:

```bash
/path/to/ctadl query my-project \
  --sarif-profile machine \
  --output /path/to/results.sarif \
  --models /path/to/query.json
```

The one-shot equivalent is:

```bash
/path/to/ctadl go \
  --name my-project \
  --sarif-profile machine \
  --output /path/to/results.sarif \
  --models /path/to/query.json \
  /path/to/artifact.apk
```

## Development & Testing

`F5` launches this extension in a new VS Code window. Subsequent changes are watched and rebuilt. Use **Developer: Reload Window** to see changes.

Build & quality checks:

| Command | Comments |
| --- | --- |
| `npm run compile` | Webpack bundles the extension into `dist/` (development build). |
| `npm run webpack:prod` | Production webpack build into `dist/` (used by prepublish). |
| `npm run vsix` | Produces a distributable VSIX in the project root. |
| `npm run compile-tests` | TypeScript-compile tests into `out/`. |
| `npm run lint` | ESLint for `src/`. |
| `npm test` | Compiles tests, bundles code, runs lint, then executes the test suite in a real VS Code Extension Host. |

Notes:
- `npm test` launches a real VS Code instance; don’t kill it early. You will see a new VS Code window open, and it will close itself when the test run finishes.
- In Linux CI/headless environments, you can use `xvfb-run npm test`.

## Test coverage expectations

The test suite exercises command wiring and observable behavior (diagnostics + panel state) against fixtures under `test_examples/`.

Testing tips for contributors:
- Prefer driving behavior through the VS Code commands (this keeps the tests aligned with how users interact with the extension).
- Don’t rely on importing extension modules into tests for shared state; tests run against the compiled extension bundle.
- The test workspace root is controlled by `.vscode-test.mjs` and should not be “derived” from VS Code’s `workspaceFolders` inside the code under test.

# Copyright

Copyright 2026 National Technology & Engineering Solutions of Sandia, LLC (NTESS). Under the terms
of Contract DE-NA0003525 with NTESS, the U.S. Government retains certain rights in this software.
