package androidx.compose.runtime.snapshots;

import g0.b1;
import g0.e1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.c;
import m7.n;
import p0.a;
import p0.a0;
import p0.f;
import p0.h;
import p0.w;
import p0.x;
import p0.z;
import u7.l;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class SnapshotKt {

    /* renamed from: a  reason: collision with root package name */
    public static final l<SnapshotIdSet, n> f2938a = SnapshotKt$emptyLambda$1.f2948j;

    /* renamed from: b  reason: collision with root package name */
    public static final e1 f2939b = new e1(0);
    public static final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static SnapshotIdSet f2940d;

    /* renamed from: e  reason: collision with root package name */
    public static int f2941e;

    /* renamed from: f  reason: collision with root package name */
    public static final h f2942f;

    /* renamed from: g  reason: collision with root package name */
    public static final ArrayList f2943g;

    /* renamed from: h  reason: collision with root package name */
    public static final ArrayList f2944h;

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReference<GlobalSnapshot> f2945i;

    /* renamed from: j  reason: collision with root package name */
    public static final f f2946j;

    static {
        SnapshotIdSet snapshotIdSet = SnapshotIdSet.f2928m;
        f2940d = snapshotIdSet;
        f2941e = 1;
        f2942f = new h();
        f2943g = new ArrayList();
        f2944h = new ArrayList();
        int i10 = f2941e;
        f2941e = i10 + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i10, snapshotIdSet);
        f2940d = f2940d.t(globalSnapshot.f16603b);
        AtomicReference<GlobalSnapshot> atomicReference = new AtomicReference<>(globalSnapshot);
        f2945i = atomicReference;
        GlobalSnapshot globalSnapshot2 = atomicReference.get();
        g.e(globalSnapshot2, "currentGlobalSnapshot.get()");
        f2946j = globalSnapshot2;
    }

    public static final void a() {
        f(SnapshotKt$advanceGlobalSnapshot$2.f2947j);
    }

    public static final l b(l lVar, l lVar2) {
        return (lVar == null || lVar2 == null || g.a(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new SnapshotKt$mergedWriteObserver$1(lVar, lVar2);
    }

    public static final HashMap c(a aVar, a aVar2, SnapshotIdSet snapshotIdSet) {
        x o10;
        Set<w> u10 = aVar2.u();
        int d5 = aVar.d();
        if (u10 == null) {
            return null;
        }
        SnapshotIdSet s10 = aVar2.e().t(aVar2.d()).s(aVar2.f16589h);
        HashMap hashMap = null;
        for (w wVar : u10) {
            x d10 = wVar.d();
            x o11 = o(d10, d5, snapshotIdSet);
            if (o11 != null && (o10 = o(d10, d5, s10)) != null && !g.a(o11, o10)) {
                x o12 = o(d10, aVar2.d(), aVar2.e());
                if (o12 != null) {
                    x g10 = wVar.g(o10, o11, o12);
                    if (g10 == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(o11, g10);
                } else {
                    n();
                    throw null;
                }
            }
        }
        return hashMap;
    }

    public static final void d(f fVar) {
        if (!f2940d.g(fVar.d())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    public static final SnapshotIdSet e(int i10, int i11, SnapshotIdSet snapshotIdSet) {
        g.f(snapshotIdSet, "<this>");
        while (i10 < i11) {
            snapshotIdSet = snapshotIdSet.t(i10);
            i10++;
        }
        return snapshotIdSet;
    }

    public static final <T> T f(l<? super SnapshotIdSet, ? extends T> lVar) {
        GlobalSnapshot globalSnapshot;
        T t10;
        ArrayList N2;
        f fVar = f2946j;
        g.d(fVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        GlobalSnapshot globalSnapshot2 = (GlobalSnapshot) fVar;
        Object obj = c;
        synchronized (obj) {
            globalSnapshot = f2945i.get();
            g.e(globalSnapshot, "currentGlobalSnapshot.get()");
            t10 = (T) r(globalSnapshot, lVar);
        }
        Set<w> set = globalSnapshot.f16588g;
        if (set != null) {
            synchronized (obj) {
                N2 = c.N2(f2943g);
            }
            int size = N2.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((p) N2.get(i10)).R(set, globalSnapshot);
            }
        }
        return t10;
    }

    public static final f g(f fVar, l<Object, n> lVar, boolean z10) {
        boolean z11 = fVar instanceof a;
        if (!z11 && fVar != null) {
            return new a0(fVar, lVar, z10);
        }
        return new z(z11 ? (a) fVar : null, lVar, null, false, z10);
    }

    public static final <T extends x> T h(T t10) {
        T t11;
        g.f(t10, "r");
        f i10 = i();
        T t12 = (T) o(t10, i10.d(), i10.e());
        if (t12 == null) {
            synchronized (c) {
                f i11 = i();
                t11 = (T) o(t10, i11.d(), i11.e());
            }
            if (t11 != null) {
                return t11;
            }
            n();
            throw null;
        }
        return t12;
    }

    public static final f i() {
        f fVar = (f) f2939b.d();
        if (fVar == null) {
            GlobalSnapshot globalSnapshot = f2945i.get();
            g.e(globalSnapshot, "currentGlobalSnapshot.get()");
            return globalSnapshot;
        }
        return fVar;
    }

    public static final l<Object, n> j(l<Object, n> lVar, l<Object, n> lVar2, boolean z10) {
        if (!z10) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || g.a(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new SnapshotKt$mergedReadObserver$1(lVar, lVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (((1 << r5) & 0) != 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends x> T k(T t10, w wVar) {
        boolean z10;
        boolean z11;
        g.f(t10, "<this>");
        g.f(wVar, "state");
        x d5 = wVar.d();
        int i10 = f2941e;
        h hVar = f2942f;
        if (hVar.f16606a > 0) {
            i10 = hVar.f16607b[0];
        }
        int i11 = i10 - 1;
        T t11 = null;
        x xVar = null;
        while (true) {
            if (d5 != null) {
                int i12 = d5.f16629a;
                if (i12 == 0) {
                    break;
                }
                if (i12 != 0 && i12 <= i11) {
                    int i13 = i12 + 0;
                    z10 = true;
                    if (i13 < 0 || i13 >= 64) {
                        if (i13 >= 64 && i13 < 128 && ((1 << (i13 - 64)) & 0) != 0) {
                            z11 = true;
                        }
                        z11 = false;
                    }
                    if (!z11) {
                        if (z10) {
                            if (xVar == null) {
                                xVar = d5;
                            } else if (d5.f16629a >= xVar.f16629a) {
                                t11 = (T) xVar;
                            }
                        }
                        d5 = d5.f16630b;
                        xVar = xVar;
                    }
                }
                z10 = false;
                if (z10) {
                }
                d5 = d5.f16630b;
                xVar = xVar;
            } else {
                break;
            }
        }
        t11 = (T) d5;
        if (t11 != null) {
            t11.f16629a = Integer.MAX_VALUE;
            return t11;
        }
        T t12 = (T) t10.b();
        t12.f16629a = Integer.MAX_VALUE;
        t12.f16630b = wVar.d();
        wVar.t(t12);
        return t12;
    }

    public static final void l(f fVar, w wVar) {
        g.f(wVar, "state");
        l<Object, n> h10 = fVar.h();
        if (h10 != null) {
            h10.U(wVar);
        }
    }

    public static final x m(b1.a aVar, w wVar, f fVar, b1.a aVar2) {
        g.f(aVar, "<this>");
        g.f(wVar, "state");
        if (fVar.g()) {
            fVar.m(wVar);
        }
        int d5 = fVar.d();
        if (aVar2.f16629a == d5) {
            return aVar2;
        }
        x k3 = k(aVar, wVar);
        k3.f16629a = d5;
        fVar.m(wVar);
        return k3;
    }

    public static final void n() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final <T extends x> T o(T t10, int i10, SnapshotIdSet snapshotIdSet) {
        boolean z10;
        T t11 = null;
        while (t10 != null) {
            int i11 = t10.f16629a;
            if (i11 != 0 && i11 <= i10 && !snapshotIdSet.g(i11)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (t11 != null && t11.f16629a >= t10.f16629a) {
                }
                t11 = t10;
            }
            t10 = (T) t10.f16630b;
        }
        if (t11 == null) {
            return null;
        }
        return t11;
    }

    public static final <T extends x> T p(T t10, w wVar) {
        T t11;
        g.f(t10, "<this>");
        g.f(wVar, "state");
        f i10 = i();
        l<Object, n> f10 = i10.f();
        if (f10 != null) {
            f10.U(wVar);
        }
        T t12 = (T) o(t10, i10.d(), i10.e());
        if (t12 == null) {
            synchronized (c) {
                f i11 = i();
                t11 = (T) o(t10, i11.d(), i11.e());
            }
            if (t11 != null) {
                return t11;
            }
            n();
            throw null;
        }
        return t12;
    }

    public static final void q(int i10) {
        int i11;
        h hVar = f2942f;
        int i12 = hVar.f16608d[i10];
        hVar.b(i12, hVar.f16606a - 1);
        hVar.f16606a--;
        int[] iArr = hVar.f16607b;
        int i13 = iArr[i12];
        int i14 = i12;
        while (i14 > 0) {
            int i15 = ((i14 + 1) >> 1) - 1;
            if (iArr[i15] <= i13) {
                break;
            }
            hVar.b(i15, i14);
            i14 = i15;
        }
        int[] iArr2 = hVar.f16607b;
        int i16 = hVar.f16606a >> 1;
        while (i12 < i16) {
            int i17 = (i12 + 1) << 1;
            int i18 = i17 - 1;
            if (i17 < hVar.f16606a && (i11 = iArr2[i17]) < iArr2[i18]) {
                if (i11 >= iArr2[i12]) {
                    break;
                }
                hVar.b(i17, i12);
                i12 = i17;
            } else if (iArr2[i18] >= iArr2[i12]) {
                break;
            } else {
                hVar.b(i18, i12);
                i12 = i18;
            }
        }
        hVar.f16608d[i10] = hVar.f16609e;
        hVar.f16609e = i10;
    }

    public static final <T> T r(f fVar, l<? super SnapshotIdSet, ? extends T> lVar) {
        T U = lVar.U(f2940d.d(fVar.d()));
        synchronized (c) {
            int i10 = f2941e;
            f2941e = i10 + 1;
            SnapshotIdSet d5 = f2940d.d(fVar.d());
            f2940d = d5;
            f2945i.set(new GlobalSnapshot(i10, d5));
            fVar.c();
            f2940d = f2940d.t(i10);
            n nVar = n.f16010a;
        }
        return U;
    }

    public static final <T extends x> T s(T t10, w wVar, f fVar) {
        g.f(wVar, "state");
        if (fVar.g()) {
            fVar.m(wVar);
        }
        T t11 = (T) o(t10, fVar.d(), fVar.e());
        if (t11 != null) {
            if (t11.f16629a == fVar.d()) {
                return t11;
            }
            T t12 = (T) k(t11, wVar);
            t12.a(t11);
            t12.f16629a = fVar.d();
            fVar.m(wVar);
            return t12;
        }
        n();
        throw null;
    }
}
