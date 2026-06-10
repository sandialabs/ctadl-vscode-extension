package androidx.compose.runtime.snapshots;

import m7.n;
import p0.f;
import p0.p;
import p0.w;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class NestedReadonlySnapshot extends f {

    /* renamed from: e  reason: collision with root package name */
    public final f f2924e;

    /* renamed from: f  reason: collision with root package name */
    public final l<Object, n> f2925f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedReadonlySnapshot(int i10, SnapshotIdSet snapshotIdSet, l<Object, n> lVar, f fVar) {
        super(i10, snapshotIdSet);
        g.f(snapshotIdSet, "invalid");
        g.f(fVar, "parent");
        this.f2924e = fVar;
        fVar.j(this);
        if (lVar != null) {
            l<Object, n> f10 = fVar.f();
            if (f10 != null) {
                lVar = new NestedReadonlySnapshot$readObserver$1$1$1(lVar, f10);
            }
        } else {
            lVar = fVar.f();
        }
        this.f2925f = lVar;
    }

    @Override // p0.f
    public final void c() {
        if (!this.c) {
            int i10 = this.f16603b;
            f fVar = this.f2924e;
            if (i10 != fVar.d()) {
                a();
            }
            fVar.k(this);
            super.c();
        }
    }

    @Override // p0.f
    public final l<Object, n> f() {
        return this.f2925f;
    }

    @Override // p0.f
    public final boolean g() {
        return true;
    }

    @Override // p0.f
    public final l<Object, n> h() {
        return null;
    }

    @Override // p0.f
    public final void j(f fVar) {
        g.f(fVar, "snapshot");
        p.a();
        throw null;
    }

    @Override // p0.f
    public final void k(f fVar) {
        g.f(fVar, "snapshot");
        p.a();
        throw null;
    }

    @Override // p0.f
    public final void l() {
    }

    @Override // p0.f
    public final void m(w wVar) {
        g.f(wVar, "state");
        l<SnapshotIdSet, n> lVar = SnapshotKt.f2938a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // p0.f
    public final f r(l lVar) {
        return new NestedReadonlySnapshot(this.f16603b, this.f16602a, lVar, this.f2924e);
    }
}
