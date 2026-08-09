# Tutorial
## Initial Setup

1) Install the plugin as described in the [README](README.md#usage).
1) If you already have a SARIF file, you can skip this step: viewing SARIF results does **not** require a local `ctadl-rs` checkout or CTADL build. If you need to generate a new SARIF file, run CTADL separately. For example, CTADL's one-shot `go` command takes the project name with `--name`:

    ```bash
    ctadl go \
      --name my-project \
      --sarif-profile machine \
      --output results.sarif \
      --models /path/to/query.json \
      /path/to/artifact.apk
    ```
1) If you want to use **Get Paths for Current Line**, build or install CTADL locally so the extension can run `get-paths`. From your local `ctadl-rs` checkout:

    ```bash
    cargo build --release -p ctadl-ascent --bins
    ```

    This produces `ctadl` and `get-paths` in Cargo's release output directory, usually `target/release/` under the `ctadl-rs` checkout.
1) Set the `CTADL: Ascent Path` in your VS Code settings to the absolute path of the directory containing `get-paths` (required only for tracing paths in Ascent-based logs).
1) For path tracing, make sure CTADL has an indexed project whose name matches the SARIF `properties.project_name` value:

    ```bash
    /path/to/ctadl import /path/to/artifact.apk --name my-project
    /path/to/ctadl index my-project
    ```

    To regenerate the SARIF from that separate import/index flow, run:

    ```bash
    /path/to/ctadl query my-project \
      --sarif-profile machine \
      --output /path/to/results.sarif \
      --models /path/to/query.json
    ```
1) In VS Code with the extension installed, open the root folder of your project (where your source code resides) with `File -> Open Folder`. Then, as described in the [README](README.md#usage), open the exported SARIF file.
    * *Note:* The extension will automatically look for and apply the `.maps` directory to map the binary locations in the SARIF file back to your source code.

## Use

You can show the extension panel with the Toggle Panel command (Ctrl+Shift+P menu). Open a SARIF file with the Open SARIF File command or through the button on the panel. `View -> Problems` opens the bottom panel, where mapped SARIF locations appear in the VS Code Problems tab and as editor squiggles. These will appear alongside error messages displayed by whatever language extensions you have installed.

The CTADL Results Panel has two main views controlled by the tabs at the top: **Results** and **Paths**.

### Results View

By default, you start on the Results view. This shows a table of all the taint flows discovered. You can click on any row to jump to the relevant source location. A details pane at the bottom of the table will display more information about the selected result.

Some results may have a file and line associated with them, in that case clicking on them will jump to the associated source location. In some cases, in the No Locations group, there is no source line information that was able to be associated with it.

The search bar at the top can be used to filter the results tab. It doesn't affect the paths tab.

### Paths View

By default the Paths tab will be empty. You can show path results for a specific line of code by right-clicking on that line in the editor and selecting the `Get Paths for Current Line` command.

The output will show a series of paths (if any) in the Paths tab. It displays paths going forward (`Target -> Sink`) and backward (`Source -> Target`). A given line may have multiple vertices (locations, e.g. a variable, where taint can flow to or from) associated with it. All of them in the current line will be used for the search.

You can expand each path group to view the sequential instructions in that path. When you click on an instruction in a path, the extension will jump to the location in the file it is present in. A details pane at the bottom will open to show more info about that specific instruction.

If you see an instruction with a line number of `-`, it means that no associated line information could be mapped for it.

## Settings

Any settings for the extension can be set by going to `File -> Preferences -> Settings` and searching for `CTADL`.

## Keyboard Shortcuts

If you go to `File -> Preferences -> Keyboard Shortcuts` and search for `CTADL`, you can see all the commands that you can run from this extension and assign a shortcut to them if you want. Any of these can also be run from the command palette by searching for the command name.
