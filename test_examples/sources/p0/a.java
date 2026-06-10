package p0;

import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.NestedReadonlySnapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import p0.g;

/* loaded from: classes.dex */
public class a extends f {

    /* renamed from: e  reason: collision with root package name */
    public final u7.l<Object, m7.n> f16586e;

    /* renamed from: f  reason: collision with root package name */
    public final u7.l<Object, m7.n> f16587f;

    /* renamed from: g  reason: collision with root package name */
    public Set<w> f16588g;

    /* renamed from: h  reason: collision with root package name */
    public SnapshotIdSet f16589h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f16590i;

    /* renamed from: j  reason: collision with root package name */
    public int f16591j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f16592k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i10, SnapshotIdSet snapshotIdSet, u7.l<Object, m7.n> lVar, u7.l<Object, m7.n> lVar2) {
        super(i10, snapshotIdSet);
        v7.g.f(snapshotIdSet, "invalid");
        this.f16586e = lVar;
        this.f16587f = lVar2;
        this.f16589h = SnapshotIdSet.f2928m;
        this.f16590i = new int[0];
        this.f16591j = 1;
    }

    public final void A() {
        boolean z10;
        boolean z11 = true;
        if (this.f16592k) {
            if (this.f16604d >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                z11 = false;
            }
        }
        if (z11) {
            return;
        }
        throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
    }

    @Override // p0.f
    public final void b() {
        SnapshotKt.f2940d = SnapshotKt.f2940d.d(d()).c(this.f16589h);
    }

    @Override // p0.f
    public void c() {
        if (!this.c) {
            super.c();
            k(this);
        }
    }

    @Override // p0.f
    public final u7.l<Object, m7.n> f() {
        return this.f16586e;
    }

    @Override // p0.f
    public boolean g() {
        return false;
    }

    @Override // p0.f
    public final u7.l<Object, m7.n> h() {
        return this.f16587f;
    }

    @Override // p0.f
    public void j(f fVar) {
        v7.g.f(fVar, "snapshot");
        this.f16591j++;
    }

    @Override // p0.f
    public void k(f fVar) {
        boolean z10;
        v7.g.f(fVar, "snapshot");
        int i10 = this.f16591j;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i11 = i10 - 1;
            this.f16591j = i11;
            if (i11 == 0 && !this.f16592k) {
                Set<w> u10 = u();
                if (u10 != null) {
                    if (true ^ this.f16592k) {
                        y(null);
                        int d5 = d();
                        for (w wVar : u10) {
                            for (x d10 = wVar.d(); d10 != null; d10 = d10.f16630b) {
                                int i12 = d10.f16629a;
                                if (i12 == d5 || kotlin.collections.c.h2(this.f16589h, Integer.valueOf(i12))) {
                                    d10.f16629a = 0;
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
                    }
                }
                a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // p0.f
    public void l() {
        if (!this.f16592k && !this.c) {
            s();
        }
    }

    @Override // p0.f
    public void m(w wVar) {
        v7.g.f(wVar, "state");
        Set<w> u10 = u();
        Set<w> set = u10;
        if (u10 == null) {
            HashSet hashSet = new HashSet();
            y(hashSet);
            set = hashSet;
        }
        set.add(wVar);
    }

    @Override // p0.f
    public final void n() {
        int length = this.f16590i.length;
        for (int i10 = 0; i10 < length; i10++) {
            SnapshotKt.q(this.f16590i[i10]);
        }
        int i11 = this.f16604d;
        if (i11 >= 0) {
            SnapshotKt.q(i11);
            this.f16604d = -1;
        }
    }

    @Override // p0.f
    public f r(u7.l<Object, m7.n> lVar) {
        NestedReadonlySnapshot nestedReadonlySnapshot;
        if (!this.c) {
            A();
            int d5 = d();
            w(d());
            Object obj = SnapshotKt.c;
            synchronized (obj) {
                int i10 = SnapshotKt.f2941e;
                SnapshotKt.f2941e = i10 + 1;
                SnapshotKt.f2940d = SnapshotKt.f2940d.t(i10);
                nestedReadonlySnapshot = new NestedReadonlySnapshot(i10, SnapshotKt.e(d5 + 1, i10, e()), lVar, this);
            }
            if (!this.f16592k && !this.c) {
                int d10 = d();
                synchronized (obj) {
                    int i11 = SnapshotKt.f2941e;
                    SnapshotKt.f2941e = i11 + 1;
                    p(i11);
                    SnapshotKt.f2940d = SnapshotKt.f2940d.t(d());
                    m7.n nVar = m7.n.f16010a;
                }
                q(SnapshotKt.e(d10 + 1, d(), e()));
            }
            return nestedReadonlySnapshot;
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }

    public final void s() {
        w(d());
        m7.n nVar = m7.n.f16010a;
        if (!this.f16592k && !this.c) {
            int d5 = d();
            synchronized (SnapshotKt.c) {
                int i10 = SnapshotKt.f2941e;
                SnapshotKt.f2941e = i10 + 1;
                p(i10);
                SnapshotKt.f2940d = SnapshotKt.f2940d.t(d());
            }
            q(SnapshotKt.e(d5 + 1, d(), e()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2 A[LOOP:0: B:30:0x00c0->B:31:0x00c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd A[LOOP:1: B:36:0x00db->B:37:0x00dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g t() {
        HashMap hashMap;
        Pair pair;
        List list;
        Set set;
        int i10;
        int size;
        int size2;
        int i11;
        Set<w> u10 = u();
        if (u10 != null) {
            AtomicReference<GlobalSnapshot> atomicReference = SnapshotKt.f2945i;
            GlobalSnapshot globalSnapshot = atomicReference.get();
            v7.g.e(globalSnapshot, "currentGlobalSnapshot.get()");
            hashMap = SnapshotKt.c(globalSnapshot, this, SnapshotKt.f2940d.d(atomicReference.get().f16603b));
        } else {
            hashMap = null;
        }
        synchronized (SnapshotKt.c) {
            SnapshotKt.d(this);
            if (u10 != null && u10.size() != 0) {
                GlobalSnapshot globalSnapshot2 = SnapshotKt.f2945i.get();
                g v3 = v(SnapshotKt.f2941e, hashMap, SnapshotKt.f2940d.d(globalSnapshot2.f16603b));
                if (!v7.g.a(v3, g.b.f16605a)) {
                    return v3;
                }
                b();
                SnapshotKt.r(globalSnapshot2, SnapshotKt.f2938a);
                Set<w> set2 = globalSnapshot2.f16588g;
                y(null);
                globalSnapshot2.f16588g = null;
                pair = new Pair(kotlin.collections.c.N2(SnapshotKt.f2943g), set2);
                list = (List) pair.f12962i;
                set = (Set) pair.f12963j;
                this.f16592k = true;
                if (set != null && (!set.isEmpty())) {
                    size2 = list.size();
                    for (i11 = 0; i11 < size2; i11++) {
                        ((u7.p) list.get(i11)).R(set, this);
                    }
                }
                if (u10 != null && (!u10.isEmpty())) {
                    size = list.size();
                    for (i10 = 0; i10 < size; i10++) {
                        ((u7.p) list.get(i10)).R(u10, this);
                    }
                }
                synchronized (SnapshotKt.c) {
                    n();
                    m7.n nVar = m7.n.f16010a;
                }
                return g.b.f16605a;
            }
            b();
            GlobalSnapshot globalSnapshot3 = SnapshotKt.f2945i.get();
            v7.g.e(globalSnapshot3, "previousGlobalSnapshot");
            SnapshotKt.r(globalSnapshot3, SnapshotKt.f2938a);
            Set<w> set3 = globalSnapshot3.f16588g;
            if (set3 != null && (!set3.isEmpty())) {
                pair = new Pair(kotlin.collections.c.N2(SnapshotKt.f2943g), set3);
            } else {
                pair = new Pair(EmptyList.f12981i, null);
            }
            list = (List) pair.f12962i;
            set = (Set) pair.f12963j;
            this.f16592k = true;
            if (set != null) {
                size2 = list.size();
                while (i11 < size2) {
                }
            }
            if (u10 != null) {
                size = list.size();
                while (i10 < size) {
                }
            }
            synchronized (SnapshotKt.c) {
            }
        }
    }

    public Set<w> u() {
        return this.f16588g;
    }

    public final g v(int i10, HashMap hashMap, SnapshotIdSet snapshotIdSet) {
        x o10;
        x g10;
        Pair pair;
        v7.g.f(snapshotIdSet, "invalidSnapshots");
        SnapshotIdSet s10 = e().t(d()).s(this.f16589h);
        Set<w> u10 = u();
        v7.g.c(u10);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (w wVar : u10) {
            x d5 = wVar.d();
            x o11 = SnapshotKt.o(d5, i10, snapshotIdSet);
            if (o11 != null && (o10 = SnapshotKt.o(d5, d(), s10)) != null && !v7.g.a(o11, o10)) {
                x o12 = SnapshotKt.o(d5, d(), e());
                if (o12 != null) {
                    if (hashMap == null || (g10 = (x) hashMap.get(o11)) == null) {
                        g10 = wVar.g(o10, o11, o12);
                    }
                    if (g10 == null) {
                        return new g.a(this);
                    }
                    if (!v7.g.a(g10, o12)) {
                        if (v7.g.a(g10, o11)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(new Pair(wVar, o11.b()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(wVar);
                        } else {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            if (!v7.g.a(g10, o10)) {
                                pair = new Pair(wVar, g10);
                            } else {
                                pair = new Pair(wVar, o10.b());
                            }
                            arrayList.add(pair);
                        }
                    }
                } else {
                    SnapshotKt.n();
                    throw null;
                }
            }
        }
        if (arrayList != null) {
            s();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Pair pair2 = (Pair) arrayList.get(i11);
                w wVar2 = (w) pair2.f12962i;
                x xVar = (x) pair2.f12963j;
                xVar.f16629a = d();
                synchronized (SnapshotKt.c) {
                    xVar.f16630b = wVar2.d();
                    wVar2.t(xVar);
                    m7.n nVar = m7.n.f16010a;
                }
            }
        }
        if (arrayList2 != null) {
            u10.removeAll(arrayList2);
        }
        return g.b.f16605a;
    }

    public final void w(int i10) {
        synchronized (SnapshotKt.c) {
            this.f16589h = this.f16589h.t(i10);
            m7.n nVar = m7.n.f16010a;
        }
    }

    public final void x(SnapshotIdSet snapshotIdSet) {
        v7.g.f(snapshotIdSet, "snapshots");
        synchronized (SnapshotKt.c) {
            this.f16589h = this.f16589h.s(snapshotIdSet);
            m7.n nVar = m7.n.f16010a;
        }
    }

    public void y(HashSet hashSet) {
        this.f16588g = hashSet;
    }

    public a z(u7.l<Object, m7.n> lVar, u7.l<Object, m7.n> lVar2) {
        b bVar;
        if (!this.c) {
            A();
            w(d());
            Object obj = SnapshotKt.c;
            synchronized (obj) {
                int i10 = SnapshotKt.f2941e;
                SnapshotKt.f2941e = i10 + 1;
                SnapshotKt.f2940d = SnapshotKt.f2940d.t(i10);
                SnapshotIdSet e10 = e();
                q(e10.t(i10));
                bVar = new b(i10, SnapshotKt.e(d() + 1, i10, e10), SnapshotKt.j(lVar, this.f16586e, true), SnapshotKt.b(lVar2, this.f16587f), this);
            }
            if (!this.f16592k && !this.c) {
                int d5 = d();
                synchronized (obj) {
                    int i11 = SnapshotKt.f2941e;
                    SnapshotKt.f2941e = i11 + 1;
                    p(i11);
                    SnapshotKt.f2940d = SnapshotKt.f2940d.t(d());
                    m7.n nVar = m7.n.f16010a;
                }
                q(SnapshotKt.e(d5 + 1, d(), e()));
            }
            return bVar;
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }
}
