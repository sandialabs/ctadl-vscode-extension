package androidx.compose.runtime.snapshots;

import java.util.ArrayList;
import kotlin.collections.c;
import m7.n;
import p0.a;
import p0.f;
import p0.p;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class GlobalSnapshot extends a {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GlobalSnapshot(int i10, SnapshotIdSet snapshotIdSet) {
        super(i10, snapshotIdSet, null, r2);
        ArrayList arrayList;
        l lVar;
        synchronized (SnapshotKt.c) {
            ArrayList arrayList2 = SnapshotKt.f2944h;
            if (!arrayList2.isEmpty()) {
                arrayList = c.N2(arrayList2);
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                lVar = (l) c.E2(arrayList);
                if (lVar == null) {
                    lVar = new GlobalSnapshot$1$1$1(arrayList);
                }
            } else {
                lVar = null;
            }
        }
    }

    @Override // p0.a, p0.f
    public final void c() {
        synchronized (SnapshotKt.c) {
            int i10 = this.f16604d;
            if (i10 >= 0) {
                SnapshotKt.q(i10);
                this.f16604d = -1;
            }
            n nVar = n.f16010a;
        }
    }

    @Override // p0.a, p0.f
    public final void j(f fVar) {
        g.f(fVar, "snapshot");
        p.a();
        throw null;
    }

    @Override // p0.a, p0.f
    public final void k(f fVar) {
        g.f(fVar, "snapshot");
        p.a();
        throw null;
    }

    @Override // p0.a, p0.f
    public final void l() {
        SnapshotKt.a();
    }

    @Override // p0.a, p0.f
    public final f r(l<Object, n> lVar) {
        return (f) SnapshotKt.f(new SnapshotKt$takeNewSnapshot$1(new GlobalSnapshot$takeNestedSnapshot$1(lVar)));
    }

    @Override // p0.a
    public final p0.g t() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // p0.a
    public final a z(l<Object, n> lVar, l<Object, n> lVar2) {
        return (a) ((f) SnapshotKt.f(new SnapshotKt$takeNewSnapshot$1(new GlobalSnapshot$takeNestedMutableSnapshot$1(lVar, lVar2))));
    }
}
