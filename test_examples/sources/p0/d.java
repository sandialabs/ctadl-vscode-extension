package p0;

import androidx.compose.runtime.snapshots.NestedReadonlySnapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;

/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: e  reason: collision with root package name */
    public final u7.l<Object, m7.n> f16599e;

    /* renamed from: f  reason: collision with root package name */
    public int f16600f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i10, SnapshotIdSet snapshotIdSet, u7.l<Object, m7.n> lVar) {
        super(i10, snapshotIdSet);
        v7.g.f(snapshotIdSet, "invalid");
        this.f16599e = lVar;
        this.f16600f = 1;
    }

    @Override // p0.f
    public final void c() {
        if (!this.c) {
            k(this);
            super.c();
        }
    }

    @Override // p0.f
    public final u7.l<Object, m7.n> f() {
        return this.f16599e;
    }

    @Override // p0.f
    public final boolean g() {
        return true;
    }

    @Override // p0.f
    public final u7.l<Object, m7.n> h() {
        return null;
    }

    @Override // p0.f
    public final void j(f fVar) {
        v7.g.f(fVar, "snapshot");
        this.f16600f++;
    }

    @Override // p0.f
    public final void k(f fVar) {
        v7.g.f(fVar, "snapshot");
        int i10 = this.f16600f - 1;
        this.f16600f = i10;
        if (i10 == 0) {
            a();
        }
    }

    @Override // p0.f
    public final void l() {
    }

    @Override // p0.f
    public final void m(w wVar) {
        v7.g.f(wVar, "state");
        u7.l<SnapshotIdSet, m7.n> lVar = SnapshotKt.f2938a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // p0.f
    public final f r(u7.l<Object, m7.n> lVar) {
        SnapshotKt.d(this);
        return new NestedReadonlySnapshot(this.f16603b, this.f16602a, lVar, this);
    }
}
