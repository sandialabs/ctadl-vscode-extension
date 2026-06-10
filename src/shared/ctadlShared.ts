import { Result } from 'sarif';

export enum Direction {
    Forward,
    Backward
}

export type CtadlLine = [string, number];

export interface CtadlNodeInfo {
    var?: string;
    mth?: string;
    class?: string;
    ap?: string;
}

export interface CtadlDataResult {
    result?: Result;
    byteOffset?: number;
    inNode: CtadlNodeInfo;
    outNode: CtadlNodeInfo;
}
