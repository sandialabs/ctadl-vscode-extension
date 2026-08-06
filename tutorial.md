# Tutorial
## Initial Setup

1) Install the plugin as described in the [README](README.md#usage).
1) Set the `CTADL: Ascent Path` in your VS Code settings to the directory containing the `get-paths` python script (Required for tracing paths in Ascent-based logs).
1) Run CTADL to export a sarif results file alongside its generated `.maps` directory. For example, from the `ctadl-rs` checkout, CTADL's one-shot `go` command takes the project name before the artifact path:

    ```bash
    ctadl go --sarif-profile machine --output results.sarif -m test_examples/default-query.json com.noto_54.apk xtask/tests/dex/com.noto_54.apk
    ```
1) In vscode with the extension installed, open the root folder of your project (where your source code resides) with `File -> Open Folder`. Then, as described in the [README](README.md#usage), open the exported sarif file.
    * *Note:* The extension will automatically look for and apply the `.maps` directory to map the binary locations in the sarif file back to your source code.

## Use

You can show the extension panel with the Toggle Panel command (Ctrl+Shift+P menu). Open a sarif file with the Open SARIF File command or through the button on the panel. `View -> Problems` opens the bottom panel which will show all the locations that are in the SARIF file in the vscode problems tab, which show up in the editor itself as squigglies. These will appear alongside error messages displayed by whatever language extensions you have installed.

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
