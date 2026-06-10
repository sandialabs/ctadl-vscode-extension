package p0;

import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;

/* loaded from: classes.dex */
public final class a0 extends f {

    /* renamed from: e  reason: collision with root package name */
    public final f f16593e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f16594f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f16595g;

    /* renamed from: h  reason: collision with root package name */
    public final u7.l<Object, m7.n> f16596h;

    public a0(f fVar, u7.l lVar, boolean z10) {
        super(0, SnapshotIdSet.f2928m);
        u7.l<Object, m7.n> lVar2;
        this.f16593e = fVar;
        this.f16594f = false;
        this.f16595g = z10;
        this.f16596h = SnapshotKt.j(lVar, (fVar == null || (lVar2 = fVar.f()) == null) ? SnapshotKt.f2945i.get().f16586e : lVar2, false);
    }

    @Override // p0.f
    public final void c() {
        f fVar;
        this.c = true;
        if (this.f16595g && (fVar = this.f16593e) != null) {
            fVar.c();
        }
    }

    @Override // p0.f
    public final int d() {
        return s().d();
    }

    @Override // p0.f
    public final SnapshotIdSet e() {
        return s().e();
    }

    @Override // p0.f
    public final u7.l<Object, m7.n> f() {
        return this.f16596h;
    }

    @Override // p0.f
    public final boolean g() {
        return s().g();
    }

    @Override // p0.f
    public final u7.l<Object, m7.n> h() {
        return null;
    }

    @Override // p0.f
    public final void j(f fVar) {
        v7.g.f(fVar, "snapshot");
        p.a();
        throw null;
    }

    @Override // p0.f
    public final void k(f fVar) {
        v7.g.f(fVar, "snapshot");
        p.a();
        throw null;
    }

    @Override // p0.f
    public final void l() {
        s().l();
    }

    @Override // p0.f
    public final void m(w wVar) {
        v7.g.f(wVar, "state");
        s().m(wVar);
    }

    @Override // p0.f
    public final f r(u7.l<Object, m7.n> lVar) {
        u7.l<Object, m7.n> j2 = SnapshotKt.j(lVar, this.f16596h, true);
        if (!this.f16594f) {
            return SnapshotKt.g(s().r(null), j2, true);
        }
        return s().r(j2);
    }

    public final f s() {
        f fVar = this.f16593e;
        if (fVar == null) {
            GlobalSnapshot globalSnapshot = SnapshotKt.f2945i.get();
            v7.g.e(globalSnapshot, "currentGlobalSnapshot.get()");
            return globalSnapshot;
        }
        return fVar;
    }
}
