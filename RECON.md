# CTADL VS Code Extension - DO-NOT-MERGE

Visualizes CTADL taint-analysis results (SARIF). Three jobs:

1. **Show taint in source** — SARIF results become VS Code diagnostics (squiggles +
   Problems list).
2. **Trace paths on demand** — `Get Paths for Current Line` resolves the cursor's
   line back to taint vertices and computes the paths through it.
3. **Browse the paths** — a webview panel lists forward/backward paths; clicking a
   step jumps the editor to that location.

Only step 3 is a webview. Steps 1 and 2 run in the extension host.

## The fork that explains the codebase: two SARIF dialects

Nearly every non-trivial function branches on `isAscentLog(log)`, which is just
`log.properties.project_name !== undefined` (`src/shared/index.ts`). The two
dialects need different machinery for both diagnostics and paths.

| | **Ascent** (current CTADL) | **Legacy** (older CTADL) |
| --- | --- | --- |
| Result locations | binary (`classes.dex`) + `byteOffset`, **no `startLine`** | source uri + `startLine`, `uriBaseId: SRCROOT` |
| Rule ids | `C0002.tainted-instruction`, `C0003.taint-source`, `C0004.taint-sink` | bare `C0001`…`C0006` |
| Source mapping | `.maps/**/*.json` at the workspace root | none needed |
| Path computation | shells out to the external `get-paths` binary | in-process DFS over the SARIF `graphs` |

Rule-id checks use `startsWith('C0002')` rather than equality, so both the bare and
suffixed spellings match. The one exception is `_get_paths_args`, which matches the
full `C0003.taint-source` / `C0004.taint-sink` ids — it is Ascent-only anyway.

### Ascent: `.maps` remapping

`buildMaps()` globs `.maps/**` under `workspace.workspaceFolders[0]` and builds
`"<binary basename>:<byteOffset>" → { fileNameUri, startLine }`. The cache is
**process-global and only rebuilt when empty** — `ctadl.reloadMaps` clears it.

`applyMaps()` then rewrites the log in place:

- A C0002/C0003 result whose `basename(uri):byteOffset` hits the map gets its
  `physicalLocation` replaced with the source uri + line (byteOffset preserved).
- A `classes.dex` result that **misses** keeps only its `byteOffset`; the
  `artifactLocation` is deleted. Those become the panel's "No Location" group and
  produce no diagnostic — but they can still be path-traced.
- Every rewrite is also recorded in `log._maps_modifications`, because the webview
  fetches its own copy of the raw SARIF and has to replay them (see below).

It also builds the reverse index `log._binary_locations_map`:
`"<source uri>:<startLine>" → ["<binary uri>,<byteOffset>", …]`. This is the lookup
that turns a cursor position back into binary offsets, and it is the reason **the
workspace root must be the source root** — the key is built from the mapped source
uri and looked up with `asRelativePath(editor.document.uri)`.

Finally it precomputes `log._get_paths_args` by collecting `properties.taintVertex`
off every `C0003.taint-source` / `C0004.taint-sink` result into `--source` / `--sink`
flags.

### Ascent: the `get-paths` call

`runPathsScript()` (`src/extension/ctadl.ts`) invokes

```
<ctadl.ascentPath>/get-paths <project_name> <uri,byteOffset>… [--source V]… [--sink V]…
```

and parses stdout as `{ fwd: Step[][], bwd: Step[][] }`. Steps carry a `byteOffset`,
which is re-joined to the full SARIF `Result` through a lazily built
`log._byteOffsetMap`.

Order of checks matters: `ctadl.ascentPath` being set and the script existing are
validated *first* and each pops a modal error. Only then is `_binary_locations_map`
consulted — and if the cursor line has no entry, the binary is never spawned and the
call quietly returns an empty `{fwd: [], bwd: []}`.

### Legacy: in-process graph search

Each run's two `graphs` become `run._forward_graph` / `run._backward_graph`
(`ProcessedGraph`). `buildLinesMap()` indexes edges by source line via the
`C0002` results their labels name, and records tainted source/sink logical-location
indices. `processGraph()` then DFS-searches from the edges on the cursor line.

**The directions are crossed on purpose.** In `srcSinkPathsCommand`, the *forward*
graph's results are pushed into `combinedResults.bwd` and vice versa, so both
dialects present the same thing to the UI: `fwd` = Target → Sink, `bwd` =
Source → Target. Don't "fix" this without also changing the panel headings.

The graphs are made non-enumerable after processing so they aren't serialized
across the webview IPC boundary.

## Layout

- `src/extension.ts` — activation, command registration, the diagnostics cache
- `src/extension/` — extension-host only; may import `vscode` and node builtins
  - `loadLogs.ts` — SARIF load, validation, `.maps` discovery/remapping, graph setup
  - `panel.ts` — webview lifecycle, HTML/CSP, message protocol
  - `ctadl.ts` — `get-paths` invocation, legacy graph search, result filtering
- `src/panel/index.tsx` — Preact UI **inside the webview**; no `vscode` module, no node
- `src/shared/`
  - `ctadlShared.ts` — the only file imported by **both** sides. Types only.
  - `index.ts` — `ProcessedGraph`, helpers. Imports node `fs`, so it is
    **extension-host only** despite living in `shared/`.
- `src/test/` — mocha tests run by `@vscode/test-cli`

`webpack.config.js` exports an array of two configs: `dist/extension.js` (target
node, `vscode` external) and `dist/panel.js` (target web, Preact via `react`
aliases).

## Contributed surface

Commands (all `category: CTADL`; the last two are gated on `ctadl.sarifLoaded`):

| Command | Notes |
| --- | --- |
| `ctadl.openSarif` | Optional `Uri` arg, else prompts. This is the seam the integration tests use. |
| `ctadl.togglePanel` | Disposes the panel when visible — it does not hide it. |
| `ctadl.closeSarif` | Drops the log, clears diagnostics and paths. |
| `ctadl.srcSinkPaths` | Editor context menu + `cmd/ctrl+shift+alt+p`. |
| `ctadl.reloadMaps` | Clears the global `.maps` cache; takes effect on the next open. |

Settings: `ctadl.showDiagnostics` (re-runs `setDiags` on change),
`ctadl.ascentPath` (directory holding `get-paths`), plus two path-step filters
applied in `srcSinkPathsCommand` — `ctadl.collapsePathDuplicates` (drop a step whose
uri+line repeats the previous one) and `ctadl.hideBlankLineResults` (drop steps with
no `startLine`). Both filters run *after* the paths are computed, so they change what
you see but never what is searched.

## Webview boundary

The extension host does **not** post the log across the IPC channel — a 7.8 MB SARIF
would be serialized on every send. Instead `sendLog()` posts only
`{ webviewUri, maps_modifications }`, and the webview `fetch()`es the SARIF itself
through `asWebviewUri()` and replays the modifications onto its own copy. That is why:

- `localResourceRoots` includes `Uri.file('/')` plus every Windows drive letter — the
  SARIF can live anywhere on disk.
- the CSP has `connect-src ${webview.cspSource}` so that `fetch` is allowed.
- `maps_modifications` exists at all. Extension-side remapping is invisible to the
  webview otherwise.

Message protocol:

| Host → webview | Webview → host |
| --- | --- |
| `setLogs`, `setLoading`, `clearLogs`, `setPaths` | `ready`, `openSourceLocation`, `requestOpenSarif`, `requestCloseSarif`, `tabChanged`, `saveSplitHeights` |

The webview also handles a `ctadlData` message that nothing sends — dead branch in
`src/panel/index.tsx`.

Panel state lives in two places on purpose: `vscode.setState` (survives webview
reload) and statics on `SarifViewerPanel` (`lastActiveTab`, split heights — survive
panel dispose, since `togglePanel` disposes rather than hides).

## Commands

| Command | Purpose |
| --- | --- |
| `npm test` | **The one command that checks everything.** `pretest` runs compile-tests + webpack + lint first, so a green `npm test` means types, lint, and behavior all pass. |
| `npm run compile` | webpack build to `dist/` |
| `npm run watch` | webpack watch (the default build task; `F5` uses it) |
| `npm run lint` | eslint over `src` |

`npm test` briefly opens a real VS Code window (Electron). It exits on its own;
don't kill it early. The suite is 10 tests and runs in ~8s once VS Code is up, ~30s
wall including `pretest`.

> **Fixed (was broken out of the box on macOS).** `@vscode/test-electron@2.5.2`
> spawned `Visual Studio Code.app/Contents/MacOS/Electron`. VS Code 1.110 renamed
> that binary to `Contents/MacOS/Code` and kept a compatibility symlink until it
> was removed on 2026-07-20, so any newly-downloaded stable build died with
> `spawn … /MacOS/Electron ENOENT` before a single test ran. `.vscode-test.mjs`
> pins no `version`, so `stable` always resolves to such a build.
>
> Repaired by bumping `@vscode/test-electron` to `^3.1.0`, which resolves the
> executable from `Info.plist`'s `CFBundleExecutable` instead of hardcoding the
> old name. No version pin is needed; `nix develop -c npm test` works as-is.
>
> Do **not** paper this over by symlinking `Electron -> Code` in the app bundle.
> That gets past the `ENOENT`, but macOS then launches a process that hangs at ~0%
> CPU and never starts the extension host — the run wedges instead of failing.
>
> If a download is interrupted, `.vscode-test/vscode-darwin-*/` can be left holding
> an `is-complete` marker with no app. `vscode-test` then reports "Found existing
> install" and fails `ENOENT` forever; delete that version directory to force a
> re-download.

Nix users: `flake.nix` provides node 22; `.envrc` + direnv load it. There is no
`python3` in this shell — use `node -e` for scratch data inspection.

`activationEvents` is empty; activation is auto-generated from the contributed
commands, so the extension only wakes when a `ctadl.*` command runs.

## Testing

Tests run inside a real Extension Host, so the whole `vscode` API is available —
prefer driving real commands over mocking.

Two kinds of tests live here, and the difference matters:

- **Unit-ish** (`extension.test.ts`, `oldSarif.test.ts`) import functions directly
  and test them in isolation.
- **Integration** (`integration.test.ts`) drives registered commands and asserts on
  observable state (`vscode.languages.getDiagnostics`, etc.).

**Integration tests must not import from `../extension`.** The extension under test
runs from the webpack bundle (`dist/extension.js`), while tests run from tsc output
(`out/`). Anything imported into a test is a *separate module instance* with its own
module-level state — e.g. calling `clearMapsCache()` from a test would not touch the
running extension's cache. Commands are the only shared surface.

Async plumbing (diagnostics, config changes) does not settle synchronously — use the
`waitFor` helper in `integration.test.ts` rather than a bare assert after `await`.

### Fixtures

The test workspace root is `test_examples/sources` (set in `.vscode-test.mjs`). That
is required: `loadLog()` finds `.maps` via `workspace.workspaceFolders[0]`, and
`setDiags()` keys the diagnostic cache off `asRelativePath()`. Use `repoRoot()` /
`fixture()` from `src/test/testUtils.ts` for paths — do **not** derive the repo root
from `workspaceFolders`, which points at `test_examples/sources`.

`test_examples/results.sarif` — **Ascent** log (7.8 MB, `project_name:
com.noto_54.apk`):

- 7442 results, **all** `C0002.tainted-instruction`. There are no `C0003`/`C0004`
  results, so `_get_paths_args` comes out empty and no fixture exercises real
  `--source`/`--sink` arguments.
- Every result has a `byteOffset` and **no `startLine`**; locations are absolute
  paths (`/home/user/ctadl/examples/com.noto_54.apk/classes.dex`, 6677 of them, plus
  765 in `classes2.dex`). `applyMaps` keys on `path.basename`, which is what makes
  those absolute paths line up with the `.maps` entries.
- `test_examples/sources/.maps` holds 6736 JSON files → 412,748 mappings. They remap
  3124 of the 7442 results onto 385 distinct source files. The rest legitimately have
  no source location.
- Heaviest targets: `com/google/android/material/chip/a.java` (104 results),
  `com/google/android/material/chip/Chip.java` (85 — the one `integration.test.ts`
  asserts on), `j$/time/format/D.java` (73).
- A SARIF loaded *without* a maps workspace produces **zero** diagnostics. That is
  correct behavior, not a bug.

`test_examples/results_old_ctadl.sarif` — **legacy** format (6.2 MB): 9146 results
across rules `C0001`–`C0006`, 4117 logical locations, 2 graphs (717 nodes/1167 edges
and 2165/5322), and 10 results carrying `codeFlows`. Locations already have
`startLine`, so no `.maps` are involved.

## Conventions

- `src/shared/ctadlShared.ts` is the shared boundary and must stay dependency-free.
  `src/shared/index.ts` is *not* webview-safe (it imports node `fs`); don't import it
  from `src/panel/`.
- Inject side-effecting dependencies rather than mocking module internals. See
  `runPathsScript(log, relativeDoc, lineNum, execFn)` — the `execFn` seam is what
  makes the external `get-paths` binary testable. Keep new external calls similarly
  injectable.
- Commands that act on a file should accept an optional `vscode.Uri` and only fall
  back to `showOpenDialog()` when called without one (as `ctadl.openSarif` does).
  A command that can only prompt is a command that cannot be tested.
- Guard user-visible entry points on the `ctadl.sarifLoaded` context key. There is no
  API to read a context key back, so assert on effects (diagnostics) instead.
- `dist/` and `out/` are build output; never edit them.

## Known rough edges

- `.vscodeignore` excludes `node_modules/**`, so the `<link>` to
  `node_modules/@vscode/codicons/dist/codicon.css` that `panel.ts` injects into the
  webview HTML 404s in a packaged VSIX. Icons still render because webpack inlines
  the same CSS into `dist/panel.js` and emits the font next to it — the `<link>` is
  redundant, not load-bearing.
- `getNonce()` uses `Math.random()`, not a CSPRNG.
- `applyMaps`'s "No locations … were replaced" warning only fires when `.maps` files
  *were* found but matched nothing. The more common failure — no `.maps` at all —
  returns early and is silent, so the symptom is just an empty Problems list.
