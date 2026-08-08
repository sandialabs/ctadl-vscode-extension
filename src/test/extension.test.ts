import * as assert from 'assert';
import * as vscode from 'vscode';
import * as path from 'path';
import * as fs from 'fs';
import * as os from 'os';
import { isAscentLog, getPhysicalLocation } from '../shared';
import { buildMaps, applyMaps } from '../extension/loadLogs';
import { runPathsScript } from '../extension/ctadl';
import { Log, Result } from 'sarif';
import { repoRoot } from './testUtils';

suite('Extension Test Suite', () => {
    vscode.window.showInformationMessage('Start all tests.');

    test('isAscentLog correctly identifies Ascent logs', () => {
        const regularLog: Log = {
            version: '2.1.0',
            runs: [],
            _uri: 'file:///test.sarif'
        };

        const ascentLog: Log = {
            version: '2.1.0',
            runs: [],
            _uri: 'file:///test.sarif',
            properties: {
                project_name: 'test.apk'
            }
        };

        assert.strictEqual(isAscentLog(regularLog), false);
        assert.strictEqual(isAscentLog(ascentLog), true);
    });

    test('getPhysicalLocation extracts location correctly', () => {
        const resultWithLocation: Result = {
            message: { text: "test" },
            locations: [{
                physicalLocation: {
                    artifactLocation: { uri: "file:///test.ts" },
                    region: { startLine: 1 }
                }
            }]
        };

        const resultWithoutLocation: Result = {
            message: { text: "test" },
            locations: []
        };

        const loc1 = getPhysicalLocation(resultWithLocation);
        assert.strictEqual(loc1?.artifactLocation?.uri, "file:///test.ts");
        assert.strictEqual(loc1?.region?.startLine, 1);

        const loc2 = getPhysicalLocation(resultWithoutLocation);
        assert.strictEqual(loc2, undefined);

        const loc3 = getPhysicalLocation(undefined);
        assert.strictEqual(loc3, undefined);
    });

    test('buildMaps parses .maps directory correctly', async function() {
        this.timeout(60000);
        const rootPath = repoRoot();
        const backflashSrc = path.join(rootPath, 'test_examples', 'sources');
        const maps = await buildMaps(vscode.Uri.file(backflashSrc).toString());

        assert.ok(maps.size > 0, 'Maps should not be empty');

        // Check a specific mapping we know exists from a6/a.json
        const key = 'classes.dex:1200658';
        const mapped = maps.get(key);
        assert.ok(mapped, 'Should find specific binary mapping key');
        assert.strictEqual(mapped?.fileNameUri, 'a6/a.java');
        assert.strictEqual(mapped?.startLine, 38);
    });

    test('applyMaps modifies SARIF log and populates _old_locations', async function() {
        this.timeout(60000);
        const rootPath = repoRoot();
        const sarifPath = path.join(rootPath, 'test_examples', 'results.sarif');
        const logContent = await fs.promises.readFile(sarifPath, 'utf8');
        const log = JSON.parse(logContent) as Log;

        const backflashSrc = path.join(rootPath, 'test_examples', 'sources');
        const maps = await buildMaps(vscode.Uri.file(backflashSrc).toString());

        const { oldLocations } = applyMaps(log, maps);

        assert.ok(oldLocations.length > 0, '_old_locations should be populated');

        // applyMaps overrides locations with the SRCROOT mapping for C0002/C0003 rules
        const mappedResult = log.runs[0].results?.find(r => r.locations?.[0]?.physicalLocation?.artifactLocation?.uriBaseId === 'SRCROOT');
        assert.ok(mappedResult, 'At least one result should be remapped to SRCROOT');
    });

    test('runPathsScript executes and parses paths using injected execFn', async () => {
        const tempDir = fs.mkdtempSync(path.join(os.tmpdir(), 'ctadl-test-'));
        const scriptPath = path.join(tempDir, 'get-paths');
        fs.writeFileSync(scriptPath, '# mock script');

        const mockLog: Log = {
            version: '2.1.0',
            runs: [{
                tool: { driver: { name: 'test' } },
                results: [{
                    message: { text: "test" },
                    locations: [{
                        physicalLocation: {
                            artifactLocation: { uri: 'test.java' },
                            region: { startLine: 10 }
                        }
                    }]
                }]
            }],
            _uri: 'file:///test.sarif',
            properties: {
                project_name: 'test.apk'
            },
            _old_locations: [
                [0, 0, {
                    artifactLocation: { uri: 'test.dex' },
                    region: { byteOffset: 1234 }
                }]
            ],
            _binary_locations_map: new Map<string, string[]>([['test.java:10', ['test.dex,1234']]])
        };

        // Set the configuration for the test
        await vscode.workspace.getConfiguration('ctadl').update('ascentPath', tempDir, vscode.ConfigurationTarget.Global);

        const mockExecFn = async (file: string, args: string[]) => {
            assert.ok(file.includes('get-paths'), 'Should call get-paths script');
            assert.ok(args.includes('test.dex,1234'), 'Should include the correct uri,byteOffset pairs');

            const mockOutput = {
                fwd: [[{ result: { message: { text: "fwd path step" } } }]],
                bwd: [[{ result: { message: { text: "bwd path step" } } }]]
            };
            return { stdout: JSON.stringify(mockOutput), stderr: '' };
        };

        // Pass the injected mockExecFn to the test subject
        const paths = await runPathsScript(mockLog, 'test.java', 10, mockExecFn);

        assert.ok(paths, 'Paths should not be undefined');
        assert.ok(paths.fwd, 'Should have fwd paths');
        assert.strictEqual(paths.fwd[0][0].result?.message?.text, 'fwd path step');
        assert.ok(paths.bwd, 'Should have bwd paths');
        assert.strictEqual(paths.bwd[0][0].result?.message?.text, 'bwd path step');

        fs.rmSync(tempDir, { recursive: true, force: true });
    });
});