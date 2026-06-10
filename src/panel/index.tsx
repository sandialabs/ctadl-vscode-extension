import { render } from 'preact';
import { useState, useEffect, useMemo, useRef, useCallback } from 'preact/hooks';
import debounce from 'lodash.debounce';
import { Log, Result, Run } from 'sarif';
import { CtadlDataResult } from '../shared/ctadlShared';
import '@vscode/codicons/dist/codicon.css';
import './index.css';

// Declare vscode API
interface WebviewApi<T> {
    postMessage(msg: unknown): void;
    getState(): T | undefined;
    setState(state: T): void;
}
declare function acquireVsCodeApi(): WebviewApi<any>;
const vscode = acquireVsCodeApi();

interface InitialState {
    hasLog?: boolean;
    isLoading?: boolean;
    resultsSplitHeight?: number;
    pathsSplitHeight?: number;
    sortCol?: string;
    sortDir?: 'asc' | 'desc';
}

declare global {
    interface Window {
        initialState: InitialState;
    }
}

function App() {
    const [logs, setLogs] = useState<Log[]>([]);
    const [paths, setPaths] = useState<{ fwd: CtadlDataResult[][], bwd: CtadlDataResult[][] } | null>(null);
    const [selectedResult, setSelectedResult] = useState<{result: Result, run: Run} | null>(null);
    const [selectedPathStep, setSelectedPathStep] = useState<CtadlDataResult | null>(null);
    const [searchQuery, setSearchQuery] = useState('');
    const [debouncedSearchQuery, setDebouncedSearchQuery] = useState('');

    const [activeTab, setActiveTab] = useState<'results' | 'paths'>('results');

    // Tab-specific expansion state
    const [resultsExpandedGroups, setResultsExpandedGroups] = useState<Set<string>>(new Set());
    const [pathsExpandedGroups, setPathsExpandedGroups] = useState<Set<string>>(new Set());
    // Overall "all collapsed" tracking for the toggle button state.
    // If true, the next click of the button will Expand All.
    const [resultsAllCollapsed, setResultsAllCollapsed] = useState(true);
    const [pathsAllCollapsed, setPathsAllCollapsed] = useState(false); // Default paths to expanded

    const pathsAllCollapsedRef = useRef(pathsAllCollapsed);
    useEffect(() => {
        pathsAllCollapsedRef.current = pathsAllCollapsed;
    }, [pathsAllCollapsed]);

    // Debounce the search query
    const updateSearch = useMemo(() =>
        debounce((query: string) => {
            setDebouncedSearchQuery(query);
        }, 250),
        []
    );

    useEffect(() => {
        return () => {
            updateSearch.cancel();
        };
    }, [updateSearch]);

    const handleSearchInput = (e: Event) => {
        const value = (e.target as HTMLInputElement).value;
        setSearchQuery(value);
        updateSearch(value);
    };

    const initialState = window.initialState || { hasLog: false, isLoading: false, resultsSplitHeight: 50, pathsSplitHeight: 75, sortCol: 'File', sortDir: 'asc' };
    const [isLoading, setIsLoading] = useState(initialState.isLoading || initialState.hasLog);
    const [isReady, setIsReady] = useState(initialState.isLoading || initialState.hasLog);

    const [resultsSplitHeight, setResultsSplitHeight] = useState<number>(initialState.resultsSplitHeight ?? 50);
    const [pathsSplitHeight, setPathsSplitHeight] = useState<number>(initialState.pathsSplitHeight ?? 75);
    const [isDragging, setIsDragging] = useState(false);
    const splitsContainerRef = useRef<HTMLDivElement>(null);

    const [sortCol, setSortCol] = useState<string>(initialState.sortCol || 'File');
    const [sortDir, setSortDir] = useState<'asc' | 'desc'>(initialState.sortDir || 'asc');

    // Save and restore state on mount
    useEffect(() => {
        const state = vscode.getState();
        if (state) {
            if (state.paths) setPaths(state.paths);
            if (state.activeTab) setActiveTab(state.activeTab);
            if (state.resultsSplitHeight) setResultsSplitHeight(state.resultsSplitHeight);
            if (state.pathsSplitHeight) setPathsSplitHeight(state.pathsSplitHeight);
            if (state.sortCol) setSortCol(state.sortCol);
            if (state.sortDir) setSortDir(state.sortDir);
            if (state.resultsExpandedGroups) setResultsExpandedGroups(new Set(state.resultsExpandedGroups));
            if (state.pathsExpandedGroups) setPathsExpandedGroups(new Set(state.pathsExpandedGroups));
            if (state.resultsAllCollapsed !== undefined) setResultsAllCollapsed(state.resultsAllCollapsed);
            if (state.pathsAllCollapsed !== undefined) setPathsAllCollapsed(state.pathsAllCollapsed);
        }
    }, []);

    // Save state to webview (debounced to avoid rate limits during resize)
    useEffect(() => {
        const timeoutId = setTimeout(() => {
            vscode.setState({
                paths,
                activeTab,
                resultsSplitHeight,
                pathsSplitHeight,
                sortCol,
                sortDir,
                resultsExpandedGroups: Array.from(resultsExpandedGroups),
                pathsExpandedGroups: Array.from(pathsExpandedGroups),
                resultsAllCollapsed,
                pathsAllCollapsed
            });
        }, 150);

        return () => clearTimeout(timeoutId);
    }, [paths, activeTab, resultsSplitHeight, pathsSplitHeight, sortCol, sortDir, resultsExpandedGroups, pathsExpandedGroups, resultsAllCollapsed, pathsAllCollapsed]);

    // Save split heights to extension host
    useEffect(() => {
        const timeoutId = setTimeout(() => {
            vscode.postMessage({ command: 'saveSplitHeights', resultsSplitHeight, pathsSplitHeight });
        }, 150);

        return () => clearTimeout(timeoutId);
    }, [resultsSplitHeight, pathsSplitHeight]);

    useEffect(() => {
        if (!isDragging) return;

        const onMouseMove = (e: MouseEvent) => {
            if (!splitsContainerRef.current) return;
            const rect = splitsContainerRef.current.getBoundingClientRect();
            let newHeight = ((e.clientY - rect.top) / rect.height) * 100;
            if (newHeight < 10) newHeight = 10;
            if (newHeight > 90) newHeight = 90;

            if (activeTab === 'results') {
                setResultsSplitHeight(newHeight);
            } else {
                setPathsSplitHeight(newHeight);
            }
        };

        const onMouseUp = () => setIsDragging(false);

        // Add an overlay to prevent iframe stealing events or text selection while dragging
        document.body.style.userSelect = 'none';

        window.addEventListener('mousemove', onMouseMove);
        window.addEventListener('mouseup', onMouseUp);

        return () => {
            document.body.style.userSelect = '';
            window.removeEventListener('mousemove', onMouseMove);
            window.removeEventListener('mouseup', onMouseUp);
        };
    }, [isDragging, activeTab]);

    useEffect(() => {
        const handler = async (event: MessageEvent) => {
            const message = event.data;
            switch (message.command) {
                case 'setLogs':
                    if (message.logsPayload) {
                        const parsedLogs: Log[] = [];
                        for (const payload of message.logsPayload) {
                            if (payload.webviewUri) {
                                try {
                                    const response = await fetch(payload.webviewUri);
                                    const log = await response.json();

                                    // Memory Optimization: Immediately delete graphs if they exist
                                    if (log.runs) {
                                        for (const run of log.runs) {
                                            if (run.graphs) {
                                                delete run.graphs;
                                            }
                                        }
                                    }

                                    // Apply any maps modifications provided by the extension host
                                    if (payload.maps_modifications) {
                                        for (const mod of payload.maps_modifications) {
                                            const result = log.runs[mod.runIndex]?.results?.[mod.resultIndex];
                                            if (result && result.locations?.[0]) {
                                                if (mod.deletePhysicalLocation) {
                                                    result.locations[0].physicalLocation = {
                                                        region: {
                                                            byteOffset: mod.preserveByteOffset
                                                        }
                                                    };
                                                } else if (mod.newUri && mod.startLine !== undefined) {
                                                    result.locations[0] = {
                                                        ...result.locations[0],
                                                        physicalLocation: {
                                                            artifactLocation: {
                                                                uri: mod.newUri,
                                                                uriBaseId: 'SRCROOT'
                                                            },
                                                            region: {
                                                                startLine: mod.startLine,
                                                                byteOffset: mod.preserveByteOffset
                                                            }
                                                        }
                                                    };
                                                }
                                            }
                                        }
                                    }

                                    parsedLogs.push(log);
                                } catch (e) {
                                    console.error("Failed to fetch or parse log from webviewUri", e);
                                }
                            }
                        }
                        setLogs(parsedLogs);
                    } else if (message.logsString) {
                        setLogs(JSON.parse(message.logsString));
                    } else if (message.logs) {
                        setLogs(message.logs);
                    }
                    setIsLoading(false);
                    setIsReady(true);
                    // Reset search and expansion state for new logs
                    setSearchQuery('');
                    setDebouncedSearchQuery('');
                    setResultsExpandedGroups(new Set());
                    setPathsExpandedGroups(new Set());
                    setResultsAllCollapsed(true);
                    setPathsAllCollapsed(false);
                    if (message.activeTab) {
                        setActiveTab(message.activeTab);
                    }
                    // Do not clear paths or tab here. setLoading does that for new logs.
                    // If we receive setLogs during toggle, we want to preserve paths and tab.
                    break;
                case 'ctadlData': {
                    const newPaths = { fwd: message.fwd, bwd: message.bwd };
                    setPaths(newPaths);
                    setSelectedPathStep(null);
                    setActiveTab('paths');
                    vscode.postMessage({ command: 'tabChanged', tab: 'paths' });

                    if (!pathsAllCollapsedRef.current) {
                        const allPathIds = new Set<string>();
                        newPaths.fwd?.forEach((_: CtadlDataResult[], idx: number) => allPathIds.add(`fwd-${idx}`));
                        newPaths.bwd?.forEach((_: CtadlDataResult[], idx: number) => allPathIds.add(`bwd-${idx}`));
                        setPathsExpandedGroups(allPathIds);
                    } else {
                        setPathsExpandedGroups(new Set());
                    }
                    break;
                }
                case 'setPaths': {
                    setPaths(message.paths);
                    setSelectedPathStep(null);
                    if (message.autoSwitchTab !== false) {
                        if (message.paths) {
                            setActiveTab('paths');
                            vscode.postMessage({ command: 'tabChanged', tab: 'paths' });
                        } else {
                            setActiveTab('results');
                            vscode.postMessage({ command: 'tabChanged', tab: 'results' });
                        }
                    } else if (message.activeTab) {
                        setActiveTab(message.activeTab);
                    } else if (vscode.getState()?.activeTab) {
                        setActiveTab(vscode.getState().activeTab);
                    }

                    if (message.paths) {
                        if (!pathsAllCollapsedRef.current) {
                            const allPathIds = new Set<string>();
                            message.paths.fwd?.forEach((_: CtadlDataResult[], idx: number) => allPathIds.add(`fwd-${idx}`));
                            message.paths.bwd?.forEach((_: CtadlDataResult[], idx: number) => allPathIds.add(`bwd-${idx}`));
                            setPathsExpandedGroups(allPathIds);
                        } else {
                            setPathsExpandedGroups(new Set());
                        }
                    } else {
                        setPathsExpandedGroups(new Set());
                    }
                    break;
                }
                case 'setLoading':
                    setIsLoading(true);
                    setIsReady(true);
                    setSelectedResult(null);
                    break;
                case 'clearLogs':
                    setLogs([]);
                    setPaths(null);
                    setSelectedResult(null);
                    setSelectedPathStep(null);
                    setIsLoading(false);
                    setSearchQuery('');
                    setDebouncedSearchQuery('');
                    setResultsExpandedGroups(new Set());
                    setPathsExpandedGroups(new Set());
                    setResultsAllCollapsed(true);
                    setPathsAllCollapsed(false);
                    break;
            }
        };
        window.addEventListener('message', handler);
        vscode.postMessage({ command: 'ready' });
        return () => window.removeEventListener('message', handler);
    }, []);

    // Pre-flatten results for the table, but do not cache search strings to save memory
    const allFlatResults = useMemo(() => {
        const arr: {
            result: Result,
            run: Run,
            uri: string,
            file: string,
            sortLine: number,
            sortRuleId: string,
            sortMessage: string
        }[] = [];
        logs.forEach(log => {
            log.runs?.forEach(run => {
                run.results?.forEach(result => {
                    const loc = result.locations?.[0]?.physicalLocation;
                    const uri = loc?.artifactLocation?.uri || '';
                    const file = uri ? getFileName(uri) : '';

                    arr.push({
                        result,
                        run,
                        uri,
                        file,
                        sortLine: loc?.region?.startLine ?? Number.MAX_SAFE_INTEGER,
                        sortRuleId: result.ruleId ?? '\uFFFF',
                        sortMessage: result.message?.text ?? '\uFFFF'
                    });
                });
            });
        });
        return arr;
    }, [logs]);

    // Filter the pre-flattened results on the fly
    const flatResults = useMemo(() => {
        if (!debouncedSearchQuery) {
            return allFlatResults;
        }
        const q = debouncedSearchQuery.toLowerCase();
        return allFlatResults.filter(item => {
            const searchRuleId = (item.result.ruleId || '').toLowerCase();
            const searchMessage = (item.result.message?.text || '').toLowerCase();
            const searchFile = item.file.toLowerCase();
            return searchRuleId.includes(q) || searchMessage.includes(q) || searchFile.includes(q);
        });
    }, [allFlatResults, debouncedSearchQuery]);

    const handleResultClick = (item: {result: Result, run: Run}) => {
        setSelectedResult(item);

        // Open the source file
        const loc = item.result.locations?.[0]?.physicalLocation;
        if (loc?.artifactLocation?.uri) {
            vscode.postMessage({
                command: 'openSourceLocation',
                uri: loc.artifactLocation.uri,
                startLine: loc.region?.startLine || 1
            });
        }
    };

    const toggleCollapseAll = () => {
        if (activeTab === 'results') {
            const nextCollapsedState = !resultsAllCollapsed;
            setResultsAllCollapsed(nextCollapsedState);
            // If we are now fully expanded, add all files to the set. Otherwise clear it.
            if (!nextCollapsedState) {
                const allFiles = new Set<string>();
                flatResults.forEach(item => {
                    const loc = item.result.locations?.[0]?.physicalLocation;
                    const uri = loc?.artifactLocation?.uri || 'unknown';
                    allFiles.add(uri);
                });
                setResultsExpandedGroups(allFiles);
            } else {
                setResultsExpandedGroups(new Set());
            }
        } else {
            const nextCollapsedState = !pathsAllCollapsed;
            setPathsAllCollapsed(nextCollapsedState);
            if (!nextCollapsedState) {
                const allPathIds = new Set<string>();
                paths?.fwd?.forEach((_: CtadlDataResult[], idx: number) => allPathIds.add(`fwd-${idx}`));
                paths?.bwd?.forEach((_: CtadlDataResult[], idx: number) => allPathIds.add(`bwd-${idx}`));
                setPathsExpandedGroups(allPathIds);
            } else {
                setPathsExpandedGroups(new Set());
            }
        }
    };

    const toggleGroup = (groupId: string, isResults: boolean) => {
        if (isResults) {
            setResultsExpandedGroups(prev => {
                const next = new Set(prev);
                if (next.has(groupId)) next.delete(groupId);
                else next.add(groupId);
                return next;
            });
        } else {
            setPathsExpandedGroups(prev => {
                const next = new Set(prev);
                if (next.has(groupId)) next.delete(groupId);
                else next.add(groupId);
                return next;
            });
        }
    };

    if (!isReady) {
        return null;
    }

    if (logs.length === 0 && !isLoading) {
        return (
            <div class="empty-state-container">
                <button
                    class="vscode-button"
                    onClick={() => vscode.postMessage({ command: 'requestOpenSarif' })}
                >
                    Open SARIF File
                </button>
            </div>
        );
    }

    return (
        <div class="app-container">
            {isLoading && (
                <div class="loader-overlay">
                    <div class="loader">Loading SARIF File...</div>
                </div>
            )}
            <div class="toolbar">
                <input
                    type="text"
                    placeholder="Search Rule ID, Message, or File..."
                    value={searchQuery}
                    onInput={handleSearchInput}
                    class="search-input"
                />
            </div>
            <div class="tabs">
                <button class={`tab-button ${activeTab === 'results' ? 'active' : ''}`} onClick={() => { setActiveTab('results'); vscode.postMessage({ command: 'tabChanged', tab: 'results' }); }}>Results</button>
                <button class={`tab-button ${activeTab === 'paths' ? 'active' : ''}`} onClick={() => { setActiveTab('paths'); vscode.postMessage({ command: 'tabChanged', tab: 'paths' }); }}>Paths</button>
                <button class="tab-icon-button" title={activeTab === 'results' ? (resultsAllCollapsed ? 'Expand All' : 'Collapse All') : (pathsAllCollapsed ? 'Expand All' : 'Collapse All')} onClick={toggleCollapseAll}>
                    <span class={`codicon codicon-${activeTab === 'results' ? (resultsAllCollapsed ? 'expand-all' : 'collapse-all') : (pathsAllCollapsed ? 'expand-all' : 'collapse-all')}`}></span>
                </button>
                <button class="tab-icon-button tab-close-button" title="Close SARIF File" onClick={() => vscode.postMessage({ command: 'requestCloseSarif' })}>
                    <span class="codicon codicon-close"></span>
                </button>
            </div>
            <div class="splits-container" ref={splitsContainerRef}>
                <div class="split-top" style={{ flexBasis: `${activeTab === 'paths' ? pathsSplitHeight : resultsSplitHeight}%` }}>
                    <div style={{ display: activeTab === 'results' ? 'block' : 'none', height: '100%' }}>
                        <ResultsTable results={flatResults} onSelect={handleResultClick} selectedResult={selectedResult?.result} sortCol={sortCol} sortDir={sortDir} setSortCol={setSortCol} setSortDir={setSortDir} expandedGroups={resultsExpandedGroups} onToggleGroup={(id) => toggleGroup(id, true)} />
                    </div>
                    <div style={{ display: activeTab === 'paths' ? 'flex' : 'none', height: '100%' }}>
                        <PathsView paths={paths} selectedPathStep={selectedPathStep} onSelectPathStep={setSelectedPathStep} expandedGroups={pathsExpandedGroups} onToggleGroup={(id) => toggleGroup(id, false)} />
                    </div>
                </div>
                <div class="resizer" onMouseDown={() => setIsDragging(true)}></div>
                <div class="split-bottom" style={{ flexBasis: `${100 - (activeTab === 'paths' ? pathsSplitHeight : resultsSplitHeight)}%` }}>
                    <div style={{ display: activeTab === 'results' ? 'block' : 'none', height: '100%', overflow: 'hidden' }}>
                        <DetailsPane selectedItem={selectedResult} />
                    </div>
                    <div style={{ display: activeTab === 'paths' ? 'block' : 'none', height: '100%', overflow: 'hidden' }}>
                        <PathDetailsPane selectedStep={selectedPathStep} />
                    </div>
                </div>
            </div>
        </div>
        );
    }

function ResultsTable({
    results,
    onSelect,
    selectedResult,
    sortCol,
    sortDir,
    setSortCol,
    setSortDir,
    expandedGroups,
    onToggleGroup
}: {
    results: {result: Result, run: Run, uri: string, file: string, sortLine?: number, sortRuleId?: string, sortMessage?: string}[],
    onSelect: (item: {result: Result, run: Run}) => void,
    selectedResult: Result | undefined,
    sortCol: string,
    sortDir: 'asc' | 'desc',
    setSortCol: (col: string) => void,
    setSortDir: (dir: 'asc' | 'desc') => void,
    expandedGroups: Set<string>,
    onToggleGroup: (id: string) => void
}) {
    const handleSort = (col: string) => {
        if (sortCol === col) {
            setSortDir(sortDir === 'asc' ? 'desc' : 'asc');
        } else {
            setSortCol(col);
            setSortDir('asc');
        }
    };

    const getSortIndicator = (col: string) => {
        if (sortCol !== col) return '';
        return sortDir === 'asc' ? ' ▲' : ' ▼';
    };

    const sortedResults = useMemo(() => {
        // Pre-instantiate Collator for massive performance gains over String.localeCompare
        const collator = new Intl.Collator(undefined, { numeric: true, sensitivity: 'base' });

        const MAX_STR = '\uFFFF'; // A string that sorts after almost everything
        const MAX_NUM = Number.MAX_SAFE_INTEGER;

        const getVal = (item: {sortLine?: number, sortMessage?: string, sortRuleId?: string}, col: string): string | number => {
            switch (col) {
                case 'Line':
                    return item.sortLine ?? MAX_NUM;
                case 'Message':
                    return item.sortMessage ?? MAX_STR;
                case 'Rule ID':
                    return item.sortRuleId ?? MAX_STR;
                default:
                    return MAX_STR;
            }
        };

        return [...results].sort((a, b) => {
            if (sortCol === 'File') {
                const fileA = a.uri ? a.file : MAX_STR;
                const fileB = b.uri ? b.file : MAX_STR;

                // 1. Sort by file name
                let cmp = collator.compare(fileA, fileB);
                if (cmp !== 0) {
                    return sortDir === 'asc' ? cmp : -cmp;
                }

                // 2. Tie-breaker: Full path
                const pathA = a.uri || MAX_STR;
                const pathB = b.uri || MAX_STR;
                cmp = collator.compare(pathA, pathB);
                if (cmp !== 0) {
                    return sortDir === 'asc' ? cmp : -cmp;
                }

                // 3. Tie-breaker: Line number (always ascending)
                const lineA = a.sortLine ?? MAX_NUM;
                const lineB = b.sortLine ?? MAX_NUM;
                return lineA - lineB;
            }

            const valA = getVal(a, sortCol);
            const valB = getVal(b, sortCol);

            // Handle empty values (MAX_NUM or MAX_STR) to always sort as largest
            if (valA === valB) return 0;
            if (valA === MAX_NUM || valA === MAX_STR) return sortDir === 'asc' ? 1 : -1;
            if (valB === MAX_NUM || valB === MAX_STR) return sortDir === 'asc' ? -1 : 1;

            if (typeof valA === 'number' && typeof valB === 'number') {
                return sortDir === 'asc' ? valA - valB : valB - valA;
            }

            const strA = String(valA);
            const strB = String(valB);

            // Handle embedded numbers gracefully using optimized Intl.Collator
            const cmp = collator.compare(strA, strB);
            return sortDir === 'asc' ? cmp : -cmp;
        });
    }, [results, sortCol, sortDir]);

    if (results.length === 0) {
        return <div class="empty-message">No results to display.</div>;
    }

    // Group sorted results by File
    const groupedResults = useMemo(() => {
        const groups = new Map<string, {uri: string, file: string, items: {result: Result, run: Run}[]}>();

        sortedResults.forEach(item => {
            const uri = item.uri || 'unknown';

            let group = groups.get(uri);
            if (!group) {
                const file = uri !== 'unknown' ? item.file : 'unknown';
                group = { uri, file, items: [] };
                groups.set(uri, group);
            }
            group.items.push(item);
        });

        // Map preserves insertion order, so the groups are automatically ordered
        // by the first appearance of each file in sortedResults.
        return Array.from(groups.values());
    }, [sortedResults]);

    return (
        <div class="table-container">
            <table>
                <thead>
                    <tr>
                        <th onClick={() => handleSort('File')} style={{cursor: 'pointer'}}>File{getSortIndicator('File')}</th>
                        <th onClick={() => handleSort('Line')} style={{cursor: 'pointer'}}>Line{getSortIndicator('Line')}</th>
                        <th onClick={() => handleSort('Message')} style={{cursor: 'pointer'}}>Message{getSortIndicator('Message')}</th>
                        <th onClick={() => handleSort('Rule ID')} style={{cursor: 'pointer'}}>Rule ID{getSortIndicator('Rule ID')}</th>
                    </tr>
                </thead>
                <tbody>
                    {groupedResults.map(group => {
                        const isExpanded = expandedGroups.has(group.uri);
                        return (
                            <>
                                <tr key={`group-${group.uri}`} class="result-group-header" onClick={() => onToggleGroup(group.uri)}>
                                    <td colSpan={4}>
                                        <span style={{ display: 'flex', alignItems: 'center', gap: '8px' }}>
                                            <span style={{ fontSize: '10px', width: '12px', textAlign: 'center' }}>{isExpanded ? '▼' : '▶'}</span>
                                            {group.uri === 'unknown' ? (
                                                <span class="no-location-text">No Location</span>
                                            ) : (
                                                <span>{group.file}</span>
                                            )}
                                            <span style={{
                                                backgroundColor: 'var(--vscode-badge-background)',
                                                color: 'var(--vscode-badge-foreground)',
                                                padding: '2px 6px',
                                                borderRadius: '10px',
                                                fontSize: '11px',
                                                fontWeight: 'normal'
                                            }}>{group.items.length}</span>
                                        </span>
                                    </td>
                                </tr>
                                {isExpanded && group.items.map((item, idx) => {
                                    const { result } = item;
                                    const loc = result.locations?.[0]?.physicalLocation;
                                    const startLine = loc?.region?.startLine ?? '—';
                                    const uri = group.uri !== 'unknown' ? group.uri : undefined;
                                    const file = group.file !== 'unknown' ? group.file : '—';
                                    const message = result.message?.text ?? '—';
                                    const ruleId = result.ruleId ?? '—';
                                    const rule = item.run.tool.driver.rules?.find(r => r.id === result.ruleId);
                                    const ruleTitle = rule?.fullDescription?.text || rule?.shortDescription?.text || rule?.name;

                                    const isSelected = selectedResult === result;

                                    return (
                                        <tr key={`${group.uri}-${idx}`} class={isSelected ? 'selected' : ''} onClick={() => onSelect(item)}>
                                            <td title={uri || undefined} style={{ paddingLeft: '24px' }}>{file}</td>
                                            <td>{startLine}</td>
                                            <td>{message}</td>
                                            <td title={ruleTitle}>{ruleId}</td>
                                        </tr>
                                    );
                                })}
                            </>
                        );
                    })}
                </tbody>
            </table>
        </div>
    );
}

function DetailsPane({ selectedItem }: { selectedItem: {result: Result, run: Run} | null }) {
    const [selectedLocationIdx, setSelectedLocationIdx] = useState<number | null>(null);

    // Reset selected location when result changes
    useEffect(() => {
        setSelectedLocationIdx(null);
    }, [selectedItem?.result]);

    if (!selectedItem) {
        return <div class="details-empty">Select a result to view details</div>;
    }

    const result = selectedItem.result;
    const run = selectedItem.run;
    const rule = run.tool.driver.rules?.find(r => r.id === result.ruleId);

    // Extract logical location if present
    let logicalLocationInfo = null;
    const loc = result.locations?.[0];
    if (loc?.logicalLocations && loc.logicalLocations.length > 0) {
        const logicalLocRef = loc.logicalLocations[0];
        const index = logicalLocRef.index;
        if (index !== undefined && run.logicalLocations && index < run.logicalLocations.length) {
            const logicalLoc = run.logicalLocations[index];
            if (logicalLoc) {
                logicalLocationInfo = {
                    name: logicalLoc.name || logicalLocRef.name,
                    fullyQualifiedName: logicalLoc.fullyQualifiedName || logicalLocRef.fullyQualifiedName
                };
            }
        } else if (logicalLocRef.name || logicalLocRef.fullyQualifiedName) {
            logicalLocationInfo = {
                name: logicalLocRef.name,
                fullyQualifiedName: logicalLocRef.fullyQualifiedName
            };
        }
    }

    let displayLogicalLocation: { name?: string, fullyQualifiedName?: string } | null = null;
    if (logicalLocationInfo) {
        displayLogicalLocation = { ...logicalLocationInfo };
        if (displayLogicalLocation.name) {
            displayLogicalLocation.name = displayLogicalLocation.name.replace(/::@/g, '/@').replace(/::/g, '/');
        }
        if (displayLogicalLocation.fullyQualifiedName) {
            displayLogicalLocation.fullyQualifiedName = displayLogicalLocation.fullyQualifiedName.replace(/::@/g, '/@').replace(/::/g, '/');
        }
    }

    return (
        <div class="details-pane">
            <div class="details-header">
                <h3 title={rule?.fullDescription?.text || rule?.shortDescription?.text || rule?.name}>{result.ruleId}: {rule?.name || 'Rule'}</h3>
            </div>
            <div class="details-content">
                <p><strong>Message:</strong> {result.message?.text}</p>
                {loc?.physicalLocation?.region?.byteOffset !== undefined && (
                    <p style={{margin: '4px 0'}}><strong>Byte Offset:</strong> {loc.physicalLocation.region.byteOffset}</p>
                )}
                {displayLogicalLocation && (
                    <div class="logical-location-section" style={{marginBottom: '12px'}}>
                        <h4>Logical Location</h4>
                        <p style={{margin: '4px 0'}}><strong>Name:</strong> {displayLogicalLocation.name || '—'}</p>
                        <p style={{margin: '4px 0'}}><strong>Full Name:</strong> {displayLogicalLocation.fullyQualifiedName || '—'}</p>
                    </div>
                )}
                {result.properties && (
                    <div class="properties-section">
                        <h4>Properties</h4>
                        <pre>{JSON.stringify(
                            Object.fromEntries(
                                Object.entries(result.properties).filter(([key]) => key !== 'additionalProperties')
                            ),
                            null, 2
                        )}</pre>
                    </div>
                )}
                {result.codeFlows && result.codeFlows.length > 0 && (
                    <div class="codeflows-section">
                        <h4>Code Flows</h4>
                        {result.codeFlows.map((cf, i) => (
                            <div key={i} class="codeflow">
                                {cf.threadFlows?.map((tf, j) => (
                                    <div key={j} class="threadflow">
                                        <ul>
                                            {tf.locations?.map((loc, k) => {
                                                const uri = loc.location?.physicalLocation?.artifactLocation?.uri;
                                                const line = loc.location?.physicalLocation?.region?.startLine;
                                                const file = uri ? getFileName(uri) : 'unknown';
                                                const msg = loc.location?.message?.text || '';
                                                const isSelected = selectedLocationIdx === k;
                                                return (
                                                    <li key={k} class={`threadflow-location ${isSelected ? 'selected' : ''}`} style={{display: 'flex', justifyContent: 'space-between', gap: '1em', cursor: uri ? 'pointer' : 'default'}} onClick={() => {
                                                        if (uri) {
                                                            setSelectedLocationIdx(k);
                                                            vscode.postMessage({
                                                                command: 'openSourceLocation',
                                                                uri: uri,
                                                                startLine: line || 1
                                                            });
                                                        }
                                                    }}>
                                                        <span class="loc-msg" style={{flex: 1, minWidth: 0, overflowWrap: 'anywhere'}}>{msg}</span>
                                                        <span class="loc-file" style={{ flexShrink: 1, textAlign: 'right', minWidth: 0, maxWidth: '50%' }}>{uri ? `${file}:${line}` : '—'}</span>
                                                    </li>
                                                );
                                            })}
                                        </ul>
                                    </div>
                                ))}
                            </div>
                        ))}
                    </div>
                )}
            </div>
        </div>
    );
}

function PathDetailsPane({ selectedStep }: { selectedStep: CtadlDataResult | null }) {
    if (!selectedStep) {
        return <div class="details-empty">Select a path step to view details</div>;
    }

    const { inNode, outNode } = selectedStep;

    const formatNode = (node: import('../shared/ctadlShared').CtadlNodeInfo | undefined) => {
        if (!node) return null;
        const varName = node.var || '';
        const ap = node.ap || '';
        const method = node.mth || '';
        const className = node.class || '';

        return `'${varName}${ap}' in '${method}' in '${className}'`;
    };

    const inStr = formatNode(inNode);
    const outStr = formatNode(outNode);

    const result = selectedStep.result;

    return (
        <div class="details-pane">
            <div class="details-header">
                <h3>Path Step Details</h3>
            </div>
            <div class="details-content">
                {inStr && <p><strong>In:</strong> {inStr}</p>}
                {outStr && <p><strong>Out:</strong> {outStr}</p>}
                {result?.locations?.[0]?.physicalLocation?.region?.byteOffset !== undefined && (
                    <p style={{margin: '4px 0'}}><strong>Byte Offset:</strong> {result.locations[0].physicalLocation.region.byteOffset}</p>
                )}
                {result?.properties && Object.keys(result.properties).length > 0 && (
                    <div class="properties-section" style={{marginTop: '12px'}}>
                        <h4>Properties</h4>
                        <pre>{JSON.stringify(
                            Object.fromEntries(
                                Object.entries(result.properties).filter(([key]) => key !== 'additionalProperties')
                            ),
                            null, 2
                        )}</pre>
                    </div>
                )}
            </div>
        </div>
    );
}

function PathsView({ paths, selectedPathStep, onSelectPathStep, expandedGroups, onToggleGroup }: { paths: { fwd: CtadlDataResult[][], bwd: CtadlDataResult[][] } | null, selectedPathStep: CtadlDataResult | null, onSelectPathStep: (step: CtadlDataResult) => void, expandedGroups: Set<string>, onToggleGroup: (id: string) => void }) {

    if (!paths) {
        return <div class="empty-message">No paths to display. Run "Get Paths" on a result.</div>;
    }

    return (
        <div class="paths-view" style={{display: 'flex', flexDirection: 'column', height: '100%'}}>
            <div class="path-groups" style={{overflow: 'auto', flexGrow: 1, minHeight: 0}}>
                <div class="path-fwd">
                    <h4>Forward Paths (Target → Sink) ({paths.fwd?.length || 0})</h4>
                    {paths.fwd?.map((pathGroup: CtadlDataResult[], idx: number) => (
                        <PathGroup key={`fwd-${idx}`} groupId={`fwd-${idx}`} title={`Forward Path ${idx + 1}`} steps={pathGroup} isExpanded={expandedGroups.has(`fwd-${idx}`)} onToggleGroup={onToggleGroup} selectedPathStep={selectedPathStep} onSelect={onSelectPathStep} />
                    ))}
                </div>
                <div class="path-bwd">
                    <h4>Backward Paths (Source → Target) ({paths.bwd?.length || 0})</h4>
                    {paths.bwd?.map((pathGroup: CtadlDataResult[], idx: number) => (
                        <PathGroup key={`bwd-${idx}`} groupId={`bwd-${idx}`} title={`Backward Path ${idx + 1}`} steps={pathGroup} isExpanded={expandedGroups.has(`bwd-${idx}`)} onToggleGroup={onToggleGroup} selectedPathStep={selectedPathStep} onSelect={onSelectPathStep} />
                    ))}
                </div>
            </div>
        </div>
    );
}

function PathGroup({
    groupId,
    title,
    steps,
    isExpanded,
    onToggleGroup,
    selectedPathStep,
    onSelect
}: {
    groupId: string,
    title: string,
    steps: CtadlDataResult[],
    isExpanded: boolean,
    onToggleGroup: (id: string) => void,
    selectedPathStep: CtadlDataResult | null,
    onSelect: (step: CtadlDataResult) => void
}) {
    return (
        <div class="path-group">
            <div class="path-group-header path-group-header-clickable" onClick={() => onToggleGroup(groupId)}>
                {isExpanded ? '▼' : '▶'} {title} ({steps.length} steps)
            </div>
            {isExpanded && (
                <div class="codeflows-section">
                    <div class="codeflow">
                        <div class="threadflow">
                            <ul>
                            {steps.map((step, i) => {
                                const result = step.result;
                                const loc = result?.locations?.[0]?.physicalLocation;
                                const uri = loc?.artifactLocation?.uri;
                                const line = loc?.region?.startLine;
                                const file = uri ? getFileName(uri) : '—';
                                const message = result?.message?.text || '';
                                const isSelected = selectedPathStep === step;

                                return (
                                    <li key={i} class={`threadflow-location threadflow-location-item ${isSelected ? 'selected' : ''} ${uri ? 'threadflow-location-pointer' : 'threadflow-location-default'}`} onClick={() => {
                                        onSelect(step);
                                        if (uri) {
                                            vscode.postMessage({
                                                command: 'openSourceLocation',
                                                uri: uri,
                                                startLine: line || 1
                                            });
                                        }
                                    }}>
                                        <span class="loc-msg loc-msg-flex"><span class="step-num">{i + 1}. </span>{message}</span>
                                        <span class="loc-file loc-file-shrink">{uri ? `${file}:${line}` : '—'}</span>
                                    </li>
                                );
                            })}
                            </ul>
                        </div>
                    </div>
                </div>
            )}
        </div>
    );
}

function getFileName(uri: string) {
    const lastSlash = Math.max(uri.lastIndexOf('/'), uri.lastIndexOf('\\'));
    return lastSlash !== -1 ? uri.substring(lastSlash + 1) : uri;
}

render(<App />, document.getElementById('root') as HTMLElement);
