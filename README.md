# CTADL VS Code Extension

View [CTADL](https://github.com/sandialabs/ctadl-rs) SARIF results in VS Code. The extension shows findings as editor squiggles, Problems entries, and rows in the **CTADL Results Panel**. For Ascent-based logs, it can also trace taint paths from the current source line when `get-paths` and the indexed CTADL project are available.

## Usage

Install the extension from a `.vsix` file with **Extensions: Install from VSIX** in the command palette (`Ctrl+Shift+P`), or use **View > Extensions > ... > Install from VSIX...**.

Open a CTADL `*.sarif` file in either of these ways:

- Run **CTADL: Open SARIF File**.
- Run **CTADL: Toggle Panel**, then click **Open SARIF File** in the panel.

You do **not** need CTADL or a `ctadl-rs` checkout to open an existing SARIF file. You only need a local CTADL build to generate new output or to use **Get Paths for Current Line** with Ascent-based logs.

To generate SARIF with CTADL's one-shot `go` command, include `--name`; path tracing uses this project name later:

```bash
ctadl go --name my-project --sarif-profile machine --output results.sarif --models /path/to/query.json /path/to/artifact.apk
```

For a step-by-step workflow, see the [tutorial](TUTORIAL.md).

## Features

- **Results view:** Browse CTADL findings in a searchable table and jump to mapped source locations.
- **Diagnostics:** Show mapped findings as editor squiggles and Problems entries.
- **Path tracing:** Right-click a source line and run **Get Paths for Current Line** to trace forward to sinks and backward to sources.

## Commands

- **CTADL: Open SARIF File** (`ctadl.openSarif`): load a CTADL `*.sarif` file.
- **CTADL: Toggle Panel** (`ctadl.togglePanel`): open or close the CTADL Results Panel.
- **CTADL: Close SARIF File** (`ctadl.closeSarif`): clear the loaded SARIF, diagnostics, and path state.
- **CTADL: Get Paths for Current Line** (`ctadl.srcSinkPaths`): compute taint paths for the cursor's current line.
- **CTADL: Reload Maps Cache** (`ctadl.reloadMaps`): clear cached `.maps` remapping data.

## Configuration

Configure the extension in VS Code settings by searching for `CTADL`.

- `ctadl.showDiagnostics` (boolean, default: `true`): show CTADL results as squiggles and Problems entries.
- `ctadl.ascentPath` (string, default: `""`): absolute path to the directory containing `get-paths`.
- `ctadl.collapsePathDuplicates` (boolean, default: `false`): collapse consecutive path steps on the same file and line.
- `ctadl.hideBlankLineResults` (boolean, default: `false`): hide path steps with no mapped line number.

For Ascent-based SARIF logs:

- Source mapping uses `.maps/**` files in the first VS Code workspace folder. Open the source root that contains the matching `.maps` directory before loading SARIF. If the maps change, run **CTADL: Reload Maps Cache** and reopen the SARIF file.
- Path tracing runs `get-paths` from `ctadl.ascentPath`.
- `get-paths` loads the project named by the SARIF `properties.project_name` value from your local CTADL state store. If that project is missing, import and index it before tracing paths.

### Preparing CTADL for path tracing

Path tracing for Ascent-based logs requires a `get-paths` executable and an indexed CTADL project whose name matches `properties.project_name` in the SARIF.

From a local `ctadl-rs` checkout, build the CTADL binaries used by this workflow:

```bash
cargo build --release -p ctadl-ascent --bins
```

This produces `ctadl` and `get-paths` in Cargo's release output directory, usually `target/release/` under the checkout. Set **CTADL: Ascent Path** to the absolute path of that directory.

If the project is not already indexed, import and index the artifact using the same project name as the SARIF:

```bash
/path/to/ctadl import /path/to/artifact.apk --name my-project
/path/to/ctadl index my-project
```

To generate SARIF from an indexed project, run:

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

## Development and Testing

`F5` launches the extension in a new VS Code window. Changes are watched and rebuilt; run **Developer: Reload Window** in the extension host to pick them up.

| Command | Description |
| --- | --- |
| `npm run compile` | Bundle the extension into `dist/` for development. |
| `npm run webpack:prod` | Bundle a production build into `dist/`. |
| `npm run vsix` | Build a distributable VSIX in the project root. |
| `npm run compile-tests` | Compile TypeScript tests into `out/`. |
| `npm run lint` | Run ESLint for `src/`. |
| `npm test` | Compile, bundle, lint, and run the test suite in a VS Code Extension Host. |

Notes:

- `npm test` opens a real VS Code window and closes it when the run finishes.
- In Linux CI or other headless environments, use `xvfb-run npm test`.

## Copyright

Copyright 2026 National Technology & Engineering Solutions of Sandia, LLC (NTESS). Under the terms of Contract DE-NA0003525 with NTESS, the U.S. Government retains certain rights in this software.
