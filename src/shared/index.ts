import { Log, PhysicalLocation, Result, Edge, Node, Graph, LogicalLocation } from 'sarif';
import { CtadlLine, Direction, CtadlNodeInfo } from './ctadlShared';
import * as fs from 'fs';

export function hasUriScheme(uriStr: string): boolean {
    const rxUriScheme = /^([^:/?#]+?):/;
    return rxUriScheme.test(uriStr);
}

export interface MapsModification {
    runIndex: number;
    resultIndex: number;
    newUri?: string;
    startLine?: number;
    deletePhysicalLocation?: boolean;
    preserveByteOffset?: number;
}

// Extend the Log type to include the fields added during load time.
declare module 'sarif' {
    interface Log {
        _text?: string;
        _uri: string;
        _old_locations?: [number, number, PhysicalLocation][];
        _binary_locations_map?: Map<string, string[]>;
        _maps_modifications?: MapsModification[];
        _get_paths_args?: string[];
        _forward_graph?: ProcessedGraph;
        _backward_graph?: ProcessedGraph;
    }
    interface Run {
        _index?: number;
        _forward_graph?: ProcessedGraph;
        _backward_graph?: ProcessedGraph;
    }
}

export function isAscentLog(log: Log): boolean {
    return log.properties?.project_name !== undefined;
}


function getLogicalLocationIndex(result: Result | undefined) {
    const loc = result?.locations;
    if (loc !== undefined) {
        const lloc = loc[0]?.logicalLocations;
        if (lloc !== undefined) {
            return lloc[0]?.index;
        }
    }
    return undefined;
}

function getLogicalLocation(result: Result | undefined, logicalLocations: LogicalLocation[] | undefined) {
    if (logicalLocations === undefined) {
        return undefined;
    }
    const idx = getLogicalLocationIndex(result);
    if (idx !== undefined) {
        return logicalLocations[idx];
    }
    return undefined;
}

export function getPhysicalLocation(result: Result | undefined): PhysicalLocation | undefined {
    const loc = result?.locations;
    let physLoc = undefined;
    if (loc !== undefined && loc.length > 0) {
        physLoc = loc[0]?.physicalLocation;
    }
    return physLoc;
}

export const asyncExists = async (p: string) => {
    try {
        await fs.promises.access(p);
        return true;
    } catch {
        return false;
    }
};

function getClassNameFromMethodName(fullyQualifiedName: string): string {
    const re = /(.*?;)\.(.*?):(.*)$/;
    const m = re.exec(fullyQualifiedName);
    return m === null ? '' : m[1];
}

enum DfsVertexState {
    Undiscovered,
    Discovered,
    Processed
}

export class ProcessedGraph {
    nodesMap: Map<string, Node>;
    edgesMap: Map<string, Edge>; // Note, currently ignores possible identical edges?
    nameToInsn: Map<string, Result>;
    taintedSrcLocs: Set<number>;
    taintedSinkLocs: Set<number>;
    // maps stringified line to array of edges
    linesMap: Map<string, Edge[]>;
    // run id
    runId: number;
    nodeToVar: Map<string, string>;
    nodeToMethod: Map<string, [string, string]>;
    forwardEdgesMap: Map<string, Edge[]>;
    backwardEdgesMap: Map<string, Edge[]>;
    nodeToChildren: Map<string, Node[]>;
    nodeToParents: Map<string, Node[]>;

    private _log!: Log;

    constructor(graph: Graph | undefined, runId: number, log: Log) {
        Object.defineProperty(this, '_log', { value: log, enumerable: false, writable: true });
        this.runId = runId;
        this.nodesMap = new Map();
        this.edgesMap = new Map();
        this.nameToInsn = new Map();
        this.taintedSrcLocs = new Set();
        this.taintedSinkLocs = new Set();
        this.linesMap = new Map();
        this.nodeToVar = new Map();
        this.nodeToMethod = new Map();
        this.forwardEdgesMap = new Map();
        this.backwardEdgesMap = new Map();
        this.nodeToChildren = new Map();
        this.nodeToParents = new Map();

        if (graph === undefined) {
            return;
        }

        const run = log.runs?.[runId];
        const logicalLocations = run?.logicalLocations || [];

        if (graph.nodes) {
            graph.nodes.forEach(node => {
                this.nodesMap.set(node.id, node);

                const index = node.location?.logicalLocations?.[0]?.index;
                if (index !== undefined && index < logicalLocations.length) {
                    const varLoc = logicalLocations[index];
                    if (varLoc.name !== undefined) {
                        this.nodeToVar.set(node.id, varLoc.name);
                    }
                    const parentIndex = varLoc.parentIndex;
                    if (parentIndex !== undefined && parentIndex >= 0 && parentIndex < logicalLocations.length) {
                        const mthLoc = logicalLocations[parentIndex];
                        if (mthLoc.name !== undefined && mthLoc.fullyQualifiedName !== undefined) {
                            this.nodeToMethod.set(node.id, [mthLoc.name, mthLoc.fullyQualifiedName]);
                        }
                    }
                }
            });
        }
        if (graph.edges) {
            graph.edges.forEach(edge => {
                this.edgesMap.set(`${edge.sourceNodeId}->${edge.targetNodeId}`, edge);

                let fwd = this.forwardEdgesMap.get(edge.sourceNodeId);
                if (!fwd) { fwd = []; this.forwardEdgesMap.set(edge.sourceNodeId, fwd); }
                fwd.push(edge);

                let bwd = this.backwardEdgesMap.get(edge.targetNodeId);
                if (!bwd) { bwd = []; this.backwardEdgesMap.set(edge.targetNodeId, bwd); }
                bwd.push(edge);

                const targetNode = this.nodesMap.get(edge.targetNodeId);
                if (targetNode) {
                    let children = this.nodeToChildren.get(edge.sourceNodeId);
                    if (!children) { children = []; this.nodeToChildren.set(edge.sourceNodeId, children); }
                    children.push(targetNode);
                }

                const sourceNode = this.nodesMap.get(edge.sourceNodeId);
                if (sourceNode) {
                    let parents = this.nodeToParents.get(edge.targetNodeId);
                    if (!parents) { parents = []; this.nodeToParents.set(edge.targetNodeId, parents); }
                    parents.push(sourceNode);
                }
                // a sarif graph has no association to original locations, but we can retrieve it with the run result
                // this.addLineMapForEdge(edge);
            });
        }
    }

    public getLine(edge: Edge | undefined): CtadlLine | undefined {
        const result = this.getInstruction(edge);
        const ploc = getPhysicalLocation(result);
        if (ploc !== undefined) {
            const line = ploc.region?.startLine;
            const file = ploc.artifactLocation?.uri;
            if (line !== undefined && file !== undefined) {
                return [file, line];
            }
        }
        return undefined;
    }

    public getInstruction(edge: Edge | undefined): Result | undefined {
        if (!edge) {
            return undefined;
        }
        const text = edge.label?.text;
        if (text !== undefined) {
            return this.nameToInsn.get(text);
        }
        return undefined;
    }

    public getEdgesForLine(line: CtadlLine): Edge[] {
        return this.linesMap.get(`${line[0]}:${line[1]}`) ?? [];
    }

    public isSourceNode(node: Node) {
        const index = node.location?.logicalLocations?.[0]?.index;
        return index !== undefined && this.taintedSrcLocs.has(index);
    }

    public isSinkNode(node: Node) {
        const index = node.location?.logicalLocations?.[0]?.index;
        return index !== undefined && this.taintedSinkLocs.has(index);
    }

    public getForwardEdges(nodeId: string): Edge[] {
        return this.forwardEdgesMap.get(nodeId) || [];
    }

    public getBackwardEdges(nodeId: string): Edge[] {
        return this.backwardEdgesMap.get(nodeId) || [];
    }

    public getChildren(node: Node): Node[] {
        return this.nodeToChildren.get(node.id) || [];
    }

    public getParents(node: Node): Node[] {
        return this.nodeToParents.get(node.id) || [];
    }

    public getEdge(sourceNode: Node | undefined, targetNode: Node | undefined): Edge | undefined {
        if (!sourceNode || !targetNode) {
            return undefined;
        }
        return this.edgesMap.get(`${sourceNode.id}->${targetNode.id}`);
    }

    public getEdgeChild(edge: Edge): Node | undefined {
        return this.nodesMap.get(edge.targetNodeId);
    }

    public getEdgeParent(edge: Edge): Node | undefined {
        return this.nodesMap.get(edge.sourceNodeId);
    }

    public getPaths(startEdges: Edge[], getEdgesCb: (nodeId: string) => Edge[], getNextNodeIdCb: (edge: Edge) => string): Node[][] {
        const paths: Node[][] = [];

        startEdges.forEach(startEdge => {
            const queue: { path: Node[], currentEdge: Edge }[] = [{
                path: [this.nodesMap.get(startEdge.sourceNodeId)!],
                currentEdge: startEdge
            }];

            let head = 0;
            while (head < queue.length) {
                const { path, currentEdge } = queue[head++];
                const nextNodeId = getNextNodeIdCb(currentEdge);
                const nextNode = this.nodesMap.get(nextNodeId);

                if (nextNode) {
                    const newPath = [...path, nextNode];
                    const nextEdges = getEdgesCb(nextNodeId);

                    if (nextEdges.length === 0) {
                        paths.push(newPath);
                    } else {
                        nextEdges.forEach(nextEdge => {
                            if (!newPath.includes(this.nodesMap.get(getNextNodeIdCb(nextEdge))!)) {
                                queue.push({ path: newPath, currentEdge: nextEdge });
                            } else {
                                paths.push(newPath);
                            }
                        });
                    }
                }
            }
        });

        return paths;
    }

    public dfsSearchFromEdges(startEdges: Edge[], direction: Direction, targetFn: (node: Node) => boolean): Node[][][] {
        const startNodes = [];
        for (const start of startEdges) {
            if (direction === Direction.Forward) {
                const child = this.getEdgeChild(start);
                startNodes.push(child);
            } else {
                const parent = this.getEdgeParent(start);
                startNodes.push(parent);
            }
        }

        const pathsPerNode = this.dfsSearch(startNodes, direction, targetFn);

        for (let i = 0; i < pathsPerNode.length; i++) {
            const start = startEdges[i];
            const pathsForNode = pathsPerNode[i];
            for (let j = 0; j < pathsForNode.length; j++) {
                if (direction === Direction.Forward) {
                    const parent = this.getEdgeParent(start);
                    if (parent) {
                        pathsForNode[j].unshift(parent);
                    }
                } else {
                    const child = this.getEdgeChild(start);
                    if (child) {
                        pathsForNode[j].push(child);
                    }
                }
            }
        }

        return pathsPerNode;
    }

    private dfsSearch(startNodes: (Node | undefined)[], direction: Direction, targetFn: (node: Node) => boolean): Node[][][] {
        const avoids = new Set<string>();
        const paths = [] as Node[][][];
        for (const start of startNodes) {
            if (!start) {
                paths.push([]);
                continue;
            }
            const pathsInner = this.dfsSearchInner(start, direction, targetFn, avoids);
            paths.push(pathsInner);
        }
        return paths;
    }

    private dfsSearchInner(start: Node, direction: Direction, targetFn: (node: Node) => boolean, avoids: Set<string>) {
        // if the start node is in the avoids list, return immediately
        let running = !avoids.has(start.id);
        const paths = [] as Node[][];
        // avoid infinite loop
        if (targetFn(start)) {
            paths.push([start]);
            running = false;
        }

        // iterate until a fixed point (avoids list will eventually cause an iteration to return no new paths)
        while (running) {
            running = false;
            const stateMap = new Map<string, DfsVertexState>();
            const workList = [] as Node[];
            const discoveredGoals = new Set<string>();
            // paths as a list of nodes that go from the goal down to the start location
            const currentPath = new Map<string, Node>();
            stateMap.set(start.id, DfsVertexState.Discovered);
            // skip exploring all avoided nodes, don't readd any avoided goal nodes
            avoids.forEach(nodeId => {
                stateMap.set(nodeId, DfsVertexState.Processed);
                discoveredGoals.add(nodeId);
            });
            workList.push(start);
            // on each iteration, iterate on the work list until there are no more nodes to explore
            while (workList.length > 0) {
                const u = workList.pop() as Node;
                const nodeState = stateMap.get(u.id);
                if (nodeState !== DfsVertexState.Discovered) {
                    throw new Error('Popped an undiscovered or processed node');
                }
                let uProcessed = true;

                const successors = direction === Direction.Forward ? this.getChildren(u) : this.getParents(u);

                for (const v of successors) {
                    currentPath.set(u.id, v);
                    // on each iteration, find each possible goal node up to one time
                    if (targetFn(v) && !discoveredGoals.has(v.id)) {
                        // found a goal, add the path
                        const path = [];
                        let node: Node | undefined = start;
                        while (node.id !== v.id) {
                            path.push(node);
                            node = currentPath.get(node.id);
                            if (node === undefined) {
                                throw new Error('Couldn\'t follow path');
                            }
                        }
                        path.push(v);
                        // add the second node in the path to be avoided in future iterations
                        if (path[1] !== undefined) {
                            avoids.add(path[1].id);
                        }
                        if (direction === Direction.Backward) {
                            path.reverse();
                        }
                        paths.push(path);
                        // we found at least one new path, so continue
                        running = true;
                        discoveredGoals.add(v.id);
                    }
                    if ((stateMap.get(v.id) ?? DfsVertexState.Undiscovered) === DfsVertexState.Undiscovered) {
                        // u is not fully processed since we found a new successor
                        // push u back on the queue
                        workList.push(u);
                        workList.push(v);
                        stateMap.set(v.id, DfsVertexState.Discovered);
                        uProcessed = false;
                        break;
                    }
                }
                if (uProcessed) {
                    stateMap.set(u.id, DfsVertexState.Processed);
                }
            }
        }
        return paths;
    }

    public getNodeInfo(node: Node): CtadlNodeInfo {
        const varName = this.nodeToVar.get(node.id) || '';
        const mthTuple = this.nodeToMethod.get(node.id);
        const mth = mthTuple ? mthTuple[0] : '';
        const mthFull = mthTuple ? mthTuple[1] : '';
        const className = getClassNameFromMethodName(mthFull);

        if (!varName && !mth && !className) {
            // Fallback for ascent-sarif paths if logical locations aren't properly mapped
            const nameParts = node.id.split(':');
            return {
                var: nameParts.length > 0 ? nameParts[nameParts.length - 1] : node.id,
                mth: '',
                class: ''
            };
        }

        return {
            var: varName,
            mth: mth,
            class: className
        };
    }

    public getForwardPaths(startEdges: Edge[]): Node[][] {
        return this.getPaths(startEdges, (nodeId) => this.getForwardEdges(nodeId), (edge) => edge.targetNodeId);
    }

    public getBackwardPaths(startEdges: Edge[]): Node[][] {
        // NOTE: we want the path list to be reversed so the start node is visually at the top
        return this.getPaths(startEdges, (nodeId) => this.getBackwardEdges(nodeId), (edge) => edge.sourceNodeId).map(path => path.reverse());
    }

    private addLineMapForEdge(edge: Edge) {
        const result = this.getInstruction(edge);
        if (result !== undefined) {
            const physLoc = getPhysicalLocation(result);
            if (physLoc !== undefined && physLoc.artifactLocation?.uri !== undefined && physLoc.region?.startLine !== undefined) {
                const key = `${physLoc.artifactLocation.uri}:${physLoc.region.startLine}`;
                if (!this.linesMap.has(key)) {
                    this.linesMap.set(key, []);
                }
                this.linesMap.get(key)!.push(edge);
            }
        }
    }

    public buildLinesMap(log: Log) {
        const run = log.runs?.[this.runId];
        if (run && run.results) {
            for (const result of run.results) {
                if (result.ruleId?.startsWith('C0002')) {
                    const lloc = getLogicalLocation(result, run.logicalLocations);
                    if (lloc !== undefined && lloc.fullyQualifiedName !== undefined) {
                        this.nameToInsn.set(lloc.fullyQualifiedName, result);
                    }
                } else if (result.ruleId?.startsWith('C0003')) {
                    const llocIndex = getLogicalLocationIndex(result);
                    if (llocIndex !== undefined) {
                        this.taintedSrcLocs.add(llocIndex);
                    }
                } else if (result.ruleId?.startsWith('C0004')) {
                    const llocIndex = getLogicalLocationIndex(result);
                    if (llocIndex !== undefined) {
                        this.taintedSinkLocs.add(llocIndex);
                    }
                }
            }
        }

        this.edgesMap.forEach(edge => {
            this.addLineMapForEdge(edge);
        });
    }
}
