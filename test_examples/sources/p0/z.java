package p0;

import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class z extends a {

    /* renamed from: l  reason: collision with root package name */
    public final a f16637l;

    /* renamed from: m  reason: collision with root package name */
    public final u7.l<Object, m7.n> f16638m;
    public final u7.l<Object, m7.n> n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f16639o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f16640p;

    public z(a aVar, u7.l<Object, m7.n> lVar, u7.l<Object, m7.n> lVar2, boolean z10, boolean z11) {
        super(0, SnapshotIdSet.f2928m, SnapshotKt.j(lVar, (aVar == null || (r1 = aVar.f16586e) == null) ? SnapshotKt.f2945i.get().f16586e : r1, z10), SnapshotKt.b(lVar2, (aVar == null || (r2 = aVar.f16587f) == null) ? SnapshotKt.f2945i.get().f16587f : r2));
        u7.l<Object, m7.n> lVar3;
        u7.l<Object, m7.n> lVar4;
        this.f16637l = aVar;
        this.f16638m = lVar;
        this.n = lVar2;
        this.f16639o = z10;
        this.f16640p = z11;
    }

    public final a B() {
        a aVar = this.f16637l;
        if (aVar == null) {
            GlobalSnapshot globalSnapshot = SnapshotKt.f2945i.get();
            v7.g.e(globalSnapshot, "currentGlobalSnapshot.get()");
            return globalSnapshot;
        }
        return aVar;
    }

    @Override // p0.a, p0.f
    public final void c() {
        a aVar;
        this.c = true;
        if (this.f16640p && (aVar = this.f16637l) != null) {
            aVar.c();
        }
    }

    @Override // p0.f
    public final int d() {
        return B().d();
    }

    @Override // p0.f
    public final SnapshotIdSet e() {
        return B().e();
    }

    @Override // p0.a, p0.f
    public final boolean g() {
        return B().g();
    }

    @Override // p0.a, p0.f
    public final void j(f fVar) {
        v7.g.f(fVar, "snapshot");
        p.a();
        throw null;
    }

    @Override // p0.a, p0.f
    public final void k(f fVar) {
        v7.g.f(fVar, "snapshot");
        p.a();
        throw null;
    }

    @Override // p0.a, p0.f
    public final void l() {
        B().l();
    }

    @Override // p0.a, p0.f
    public final void m(w wVar) {
        v7.g.f(wVar, "state");
        B().m(wVar);
    }

    @Override // p0.f
    public final void p(int i10) {
        p.a();
        throw null;
    }

    @Override // p0.f
    public final void q(SnapshotIdSet snapshotIdSet) {
        v7.g.f(snapshotIdSet, "value");
        p.a();
        throw null;
    }

    @Override // p0.a, p0.f
    public final f r(u7.l<Object, m7.n> lVar) {
        u7.l<Object, m7.n> j2 = SnapshotKt.j(lVar, this.f16586e, true);
        if (!this.f16639o) {
            return SnapshotKt.g(B().r(null), j2, true);
        }
        return B().r(j2);
    }

    @Override // p0.a
    public final g t() {
        return B().t();
    }

    @Override // p0.a
    public final Set<w> u() {
        return B().u();
    }

    @Override // p0.a
    public final void y(HashSet hashSet) {
        p.a();
        throw null;
    }

    @Override // p0.a
    public final a z(u7.l<Object, m7.n> lVar, u7.l<Object, m7.n> lVar2) {
        u7.l<Object, m7.n> j2 = SnapshotKt.j(lVar, this.f16586e, true);
        u7.l<Object, m7.n> b5 = SnapshotKt.b(lVar2, this.f16587f);
        if (!this.f16639o) {
            return new z(B().z(null, b5), j2, b5, false, true);
        }
        return B().z(j2, b5);
    }
}
