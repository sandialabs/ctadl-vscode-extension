package androidx.compose.runtime;

import android.os.Trace;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import g0.c1;
import g0.d;
import g0.d0;
import g0.e0;
import g0.f0;
import g0.f1;
import g0.g1;
import g0.h1;
import g0.j;
import g0.j0;
import g0.j1;
import g0.k0;
import g0.l;
import g0.o0;
import g0.p0;
import g0.q0;
import g0.r0;
import g0.t;
import g0.t0;
import g0.u0;
import g0.v;
import g0.w;
import g0.w0;
import g0.x;
import g0.x0;
import g0.y;
import g0.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$IntRef;
import m7.n;
import u7.p;
import u7.q;

/* loaded from: classes.dex */
public final class ComposerImpl implements g0.d {
    public int A;
    public final f1 B;
    public boolean C;
    public w0 D;
    public x0 E;
    public z0 F;
    public boolean G;
    public i0.d<j<Object>, ? extends g1<? extends Object>> H;
    public ArrayList I;
    public g0.b J;
    public final ArrayList K;
    public boolean L;
    public int M;
    public int N;
    public final f1 O;
    public int P;
    public boolean Q;
    public boolean R;
    public final v S;
    public final f1 T;
    public int U;
    public int V;
    public int W;
    public int X;

    /* renamed from: a  reason: collision with root package name */
    public final g0.c<?> f2640a;

    /* renamed from: b  reason: collision with root package name */
    public final g0.g f2641b;
    public final x0 c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<u0> f2642d;

    /* renamed from: e  reason: collision with root package name */
    public List<q<g0.c<?>, z0, t0, n>> f2643e;

    /* renamed from: f  reason: collision with root package name */
    public final List<q<g0.c<?>, z0, t0, n>> f2644f;

    /* renamed from: g  reason: collision with root package name */
    public final l f2645g;

    /* renamed from: h  reason: collision with root package name */
    public final f1 f2646h;

    /* renamed from: i  reason: collision with root package name */
    public d f2647i;

    /* renamed from: j  reason: collision with root package name */
    public int f2648j;

    /* renamed from: k  reason: collision with root package name */
    public final v f2649k;

    /* renamed from: l  reason: collision with root package name */
    public int f2650l;

    /* renamed from: m  reason: collision with root package name */
    public final v f2651m;
    public int[] n;

    /* renamed from: o  reason: collision with root package name */
    public HashMap<Integer, Integer> f2652o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2653p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2654q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f2655r;

    /* renamed from: s  reason: collision with root package name */
    public final v f2656s;

    /* renamed from: t  reason: collision with root package name */
    public i0.d<j<Object>, ? extends g1<? extends Object>> f2657t;

    /* renamed from: u  reason: collision with root package name */
    public final HashMap<Integer, i0.d<j<Object>, g1<Object>>> f2658u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2659v;

    /* renamed from: w  reason: collision with root package name */
    public final v f2660w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2661x;

    /* renamed from: y  reason: collision with root package name */
    public int f2662y;

    /* renamed from: z  reason: collision with root package name */
    public int f2663z;

    /* loaded from: classes.dex */
    public static final class a implements u0 {

        /* renamed from: a  reason: collision with root package name */
        public final b f2664a;

        public a(b bVar) {
            this.f2664a = bVar;
        }

        @Override // g0.u0
        public final void a() {
        }

        @Override // g0.u0
        public final void b() {
            this.f2664a.p();
        }

        @Override // g0.u0
        public final void c() {
            this.f2664a.p();
        }
    }

    /* loaded from: classes.dex */
    public final class b extends g0.g {

        /* renamed from: a  reason: collision with root package name */
        public final int f2667a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2668b;
        public HashSet c;

        /* renamed from: d  reason: collision with root package name */
        public final LinkedHashSet f2669d = new LinkedHashSet();

        /* renamed from: e  reason: collision with root package name */
        public final k0 f2670e = a1.c.V0(a1.c.h1());

        public b(int i10, boolean z10) {
            this.f2667a = i10;
            this.f2668b = z10;
        }

        @Override // g0.g
        public final void a(l lVar, ComposableLambdaImpl composableLambdaImpl) {
            v7.g.f(lVar, "composition");
            ComposerImpl.this.f2641b.a(lVar, composableLambdaImpl);
        }

        @Override // g0.g
        public final void b(f0 f0Var) {
            ComposerImpl.this.f2641b.b(f0Var);
        }

        @Override // g0.g
        public final void c() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.f2663z--;
        }

        @Override // g0.g
        public final boolean d() {
            return this.f2668b;
        }

        @Override // g0.g
        public final i0.d<j<Object>, g1<Object>> e() {
            return (i0.d) this.f2670e.getValue();
        }

        @Override // g0.g
        public final int f() {
            return this.f2667a;
        }

        @Override // g0.g
        public final CoroutineContext g() {
            return ComposerImpl.this.f2641b.g();
        }

        @Override // g0.g
        public final void h(l lVar) {
            v7.g.f(lVar, "composition");
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.f2641b.h(composerImpl.f2645g);
            composerImpl.f2641b.h(lVar);
        }

        @Override // g0.g
        public final void i(f0 f0Var, e0 e0Var) {
            ComposerImpl.this.f2641b.i(f0Var, e0Var);
        }

        @Override // g0.g
        public final e0 j(f0 f0Var) {
            v7.g.f(f0Var, "reference");
            return ComposerImpl.this.f2641b.j(f0Var);
        }

        @Override // g0.g
        public final void k(Set<Object> set) {
            HashSet hashSet = this.c;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.c = hashSet;
            }
            hashSet.add(set);
        }

        @Override // g0.g
        public final void l(ComposerImpl composerImpl) {
            this.f2669d.add(composerImpl);
        }

        @Override // g0.g
        public final void m() {
            ComposerImpl.this.f2663z++;
        }

        @Override // g0.g
        public final void n(g0.d dVar) {
            v7.g.f(dVar, "composer");
            HashSet hashSet = this.c;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(((ComposerImpl) dVar).c);
                }
            }
            LinkedHashSet linkedHashSet = this.f2669d;
            v7.l.a(linkedHashSet);
            linkedHashSet.remove(dVar);
        }

        @Override // g0.g
        public final void o(l lVar) {
            v7.g.f(lVar, "composition");
            ComposerImpl.this.f2641b.o(lVar);
        }

        public final void p() {
            LinkedHashSet<ComposerImpl> linkedHashSet = this.f2669d;
            if (!linkedHashSet.isEmpty()) {
                HashSet hashSet = this.c;
                if (hashSet != null) {
                    for (ComposerImpl composerImpl : linkedHashSet) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((Set) it.next()).remove(composerImpl.c);
                        }
                    }
                }
                linkedHashSet.clear();
            }
        }
    }

    public ComposerImpl(g0.a aVar, g0.g gVar, x0 x0Var, HashSet hashSet, ArrayList arrayList, ArrayList arrayList2, l lVar) {
        v7.g.f(gVar, "parentContext");
        v7.g.f(lVar, "composition");
        this.f2640a = aVar;
        this.f2641b = gVar;
        this.c = x0Var;
        this.f2642d = hashSet;
        this.f2643e = arrayList;
        this.f2644f = arrayList2;
        this.f2645g = lVar;
        this.f2646h = new f1(0, 0);
        this.f2649k = new v();
        this.f2651m = new v();
        this.f2655r = new ArrayList();
        this.f2656s = new v();
        this.f2657t = a1.c.h1();
        this.f2658u = new HashMap<>();
        this.f2660w = new v();
        this.f2662y = -1;
        SnapshotKt.i();
        this.B = new f1(0, 0);
        w0 s10 = x0Var.s();
        s10.c();
        this.D = s10;
        x0 x0Var2 = new x0();
        this.E = x0Var2;
        z0 t10 = x0Var2.t();
        t10.f();
        this.F = t10;
        w0 s11 = this.E.s();
        try {
            g0.b a10 = s11.a(0);
            s11.c();
            this.J = a10;
            this.K = new ArrayList();
            this.O = new f1(0, 0);
            this.R = true;
            this.S = new v();
            this.T = new f1(0, 0);
            this.U = -1;
            this.V = -1;
            this.W = -1;
        } catch (Throwable th) {
            s11.c();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[Catch: all -> 0x006a, TryCatch #0 {all -> 0x006a, blocks: (B:3:0x000c, B:5:0x0012, B:6:0x0017, B:14:0x002e, B:15:0x003b, B:9:0x001d), top: B:21:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void E(ComposerImpl composerImpl, d0 d0Var, i0.d dVar, Object obj) {
        boolean z10;
        composerImpl.v0(126665345, d0Var);
        composerImpl.z(obj);
        int i10 = composerImpl.M;
        try {
            composerImpl.M = 126665345;
            if (composerImpl.L) {
                z0.t(composerImpl.F);
            }
            if (!composerImpl.L && !v7.g.a(composerImpl.D.e(), dVar)) {
                z10 = true;
                if (z10) {
                    composerImpl.f2658u.put(Integer.valueOf(composerImpl.D.f11095g), dVar);
                }
                composerImpl.s0(202, ComposerKt.f2743h, false, dVar);
                boolean z11 = composerImpl.L;
                boolean z12 = composerImpl.f2659v;
                composerImpl.f2659v = z10;
                ComposableLambdaImpl j02 = a1.c.j0(694380496, new ComposerImpl$invokeMovableContentLambda$1(d0Var, obj), true);
                v7.l.d(2, j02);
                j02.R(composerImpl, 1);
                composerImpl.f2659v = z12;
            }
            z10 = false;
            if (z10) {
            }
            composerImpl.s0(202, ComposerKt.f2743h, false, dVar);
            boolean z112 = composerImpl.L;
            boolean z122 = composerImpl.f2659v;
            composerImpl.f2659v = z10;
            ComposableLambdaImpl j022 = a1.c.j0(694380496, new ComposerImpl$invokeMovableContentLambda$1(d0Var, obj), true);
            v7.l.d(2, j022);
            j022.R(composerImpl, 1);
            composerImpl.f2659v = z122;
        } finally {
            composerImpl.Q(false);
            composerImpl.M = i10;
            composerImpl.Q(false);
        }
    }

    public static final void Z(z0 z0Var, g0.c<Object> cVar, int i10) {
        boolean z10;
        while (true) {
            int i11 = z0Var.f11135s;
            if ((i10 > i11 && i10 < z0Var.f11124g) || (i11 == 0 && i10 == 0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                z0Var.H();
                if (z0Var.s(z0Var.f11135s)) {
                    cVar.i();
                }
                z0Var.i();
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0147 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int q0(ComposerImpl composerImpl, int i10, boolean z10, int i11) {
        boolean z11;
        boolean z12;
        int i12;
        a aVar;
        w0 w0Var = composerImpl.D;
        int[] iArr = w0Var.f11091b;
        int i13 = i10 * 5;
        int i14 = 1;
        if ((iArr[i13 + 1] & 134217728) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            int i15 = iArr[i13];
            Object l2 = w0Var.l(iArr, i10);
            if (i15 == 126665345 && (l2 instanceof d0)) {
                d0 d0Var = (d0) l2;
                Object g10 = composerImpl.D.g(i10, 0);
                g0.b a10 = composerImpl.D.a(i10);
                int h10 = composerImpl.D.h(i10) + i10;
                ArrayList arrayList = composerImpl.f2655r;
                q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                ArrayList arrayList2 = new ArrayList();
                int d5 = ComposerKt.d(i10, arrayList);
                if (d5 < 0) {
                    d5 = -(d5 + 1);
                }
                while (d5 < arrayList.size()) {
                    w wVar = (w) arrayList.get(d5);
                    if (wVar.f11089b >= h10) {
                        break;
                    }
                    arrayList2.add(wVar);
                    d5++;
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size = arrayList2.size();
                for (int i16 = 0; i16 < size; i16++) {
                    w wVar2 = (w) arrayList2.get(i16);
                    arrayList3.add(new Pair(wVar2.f11088a, wVar2.c));
                }
                f0 f0Var = new f0(d0Var, g10, composerImpl.f2645g, composerImpl.c, a10, arrayList3, composerImpl.M(Integer.valueOf(i10)));
                composerImpl.f2641b.b(f0Var);
                composerImpl.l0();
                composerImpl.i0(new ComposerImpl$reportFreeMovableContent$reportGroup$1(composerImpl, f0Var));
                if (z10) {
                    composerImpl.c0();
                    composerImpl.e0();
                    composerImpl.b0();
                    if (!composerImpl.D.i(i10)) {
                        i14 = composerImpl.D.k(i10);
                    }
                    if (i14 <= 0) {
                        return 0;
                    }
                    composerImpl.k0(i11, i14);
                    return 0;
                }
            } else if (i15 == 206 && v7.g.a(l2, ComposerKt.f2746k)) {
                Object g11 = composerImpl.D.g(i10, 0);
                if (g11 instanceof a) {
                    aVar = (a) g11;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    for (ComposerImpl composerImpl2 : aVar.f2664a.f2669d) {
                        composerImpl2.p0();
                    }
                }
            }
        } else if (a1.c.z(iArr, i10)) {
            int h11 = composerImpl.D.h(i10) + i10;
            int i17 = i10 + 1;
            int i18 = 0;
            while (i17 < h11) {
                boolean i19 = composerImpl.D.i(i17);
                if (i19) {
                    composerImpl.c0();
                    composerImpl.O.e(composerImpl.D.j(i17));
                }
                if (!i19 && !z10) {
                    z12 = false;
                    if (!i19) {
                        i12 = 0;
                    } else {
                        i12 = i11 + i18;
                    }
                    i18 += q0(composerImpl, i17, z12, i12);
                    if (!i19) {
                        composerImpl.c0();
                        composerImpl.n0();
                    }
                    i17 += composerImpl.D.h(i17);
                }
                z12 = true;
                if (!i19) {
                }
                i18 += q0(composerImpl, i17, z12, i12);
                if (!i19) {
                }
                i17 += composerImpl.D.h(i17);
            }
            return i18;
        }
        return composerImpl.D.k(i10);
    }

    @Override // g0.d
    public final void A(q0 q0Var) {
        r0 r0Var;
        if (q0Var instanceof r0) {
            r0Var = (r0) q0Var;
        } else {
            r0Var = null;
        }
        if (r0Var != null) {
            r0Var.f11071a |= 1;
        }
    }

    public final boolean A0(r0 r0Var, Object obj) {
        v7.g.f(r0Var, "scope");
        g0.b bVar = r0Var.c;
        if (bVar == null) {
            return false;
        }
        x0 x0Var = this.c;
        v7.g.f(x0Var, "slots");
        int d5 = x0Var.d(bVar);
        if (!this.C || d5 < this.D.f11095g) {
            return false;
        }
        ArrayList arrayList = this.f2655r;
        int d10 = ComposerKt.d(d5, arrayList);
        h0.c cVar = null;
        if (d10 < 0) {
            int i10 = -(d10 + 1);
            if (obj != null) {
                cVar = new h0.c();
                cVar.add(obj);
            }
            arrayList.add(i10, new w(r0Var, d5, cVar));
        } else {
            w wVar = (w) arrayList.get(d10);
            if (obj == null) {
                wVar.c = null;
            } else {
                h0.c<Object> cVar2 = wVar.c;
                if (cVar2 != null) {
                    cVar2.add(obj);
                }
            }
        }
        return true;
    }

    @Override // g0.d
    public final void B(u7.a<n> aVar) {
        v7.g.f(aVar, "effect");
        i0(new ComposerImpl$recordSideEffect$1(aVar));
    }

    public final void B0(Object obj, int i10, Object obj2) {
        int ordinal;
        if (obj != null) {
            ordinal = obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode();
        } else if (obj2 == null || i10 != 207 || v7.g.a(obj2, d.a.f11039a)) {
            C0(i10);
            return;
        } else {
            ordinal = obj2.hashCode();
        }
        C0(ordinal);
    }

    @Override // g0.d
    public final void C(Boolean bool) {
        if (this.D.f() == 207 && !v7.g.a(this.D.e(), bool) && this.f2662y < 0) {
            this.f2662y = this.D.f11095g;
            this.f2661x = true;
        }
        s0(207, null, false, bool);
    }

    public final void C0(int i10) {
        this.M = i10 ^ Integer.rotateLeft(this.M, 3);
    }

    public final void D() {
        J();
        this.f2646h.f11050a.clear();
        this.f2649k.c = 0;
        this.f2651m.c = 0;
        this.f2656s.c = 0;
        this.f2660w.c = 0;
        this.f2658u.clear();
        w0 w0Var = this.D;
        if (!w0Var.f11094f) {
            w0Var.c();
        }
        z0 z0Var = this.F;
        if (!z0Var.f11136t) {
            z0Var.f();
        }
        ComposerKt.f(this.F.f11136t);
        x0 x0Var = new x0();
        this.E = x0Var;
        z0 t10 = x0Var.t();
        t10.f();
        this.F = t10;
        this.M = 0;
        this.f2663z = 0;
        this.f2654q = false;
        this.L = false;
        this.f2661x = false;
        this.C = false;
    }

    public final void D0(Object obj, int i10, Object obj2) {
        int ordinal;
        if (obj != null) {
            ordinal = obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode();
        } else if (obj2 == null || i10 != 207 || v7.g.a(obj2, d.a.f11039a)) {
            E0(i10);
            return;
        } else {
            ordinal = obj2.hashCode();
        }
        E0(ordinal);
    }

    public final void E0(int i10) {
        this.M = Integer.rotateRight(i10 ^ this.M, 3);
    }

    public final b F() {
        a aVar;
        u0(206, ComposerKt.f2746k);
        if (this.L) {
            z0.t(this.F);
        }
        Object a02 = a0();
        if (a02 instanceof a) {
            aVar = (a) a02;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            aVar = new a(new b(this.M, this.f2653p));
            I0(aVar);
        }
        i0.d<j<Object>, g1<Object>> M = M(null);
        b bVar = aVar.f2664a;
        bVar.getClass();
        v7.g.f(M, "scope");
        bVar.f2670e.setValue(M);
        Q(false);
        return aVar.f2664a;
    }

    public final void F0(int i10, int i11) {
        if (J0(i10) != i11) {
            if (i10 < 0) {
                HashMap<Integer, Integer> hashMap = this.f2652o;
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    this.f2652o = hashMap;
                }
                hashMap.put(Integer.valueOf(i10), Integer.valueOf(i11));
                return;
            }
            int[] iArr = this.n;
            if (iArr == null) {
                int i12 = this.D.c;
                int[] iArr2 = new int[i12];
                Arrays.fill(iArr2, 0, i12, -1);
                this.n = iArr2;
                iArr = iArr2;
            }
            iArr[i10] = i11;
        }
    }

    public final boolean G(float f10) {
        Object a02 = a0();
        if (a02 instanceof Float) {
            if (f10 == ((Number) a02).floatValue()) {
                return false;
            }
        }
        I0(Float.valueOf(f10));
        return true;
    }

    public final void G0(int i10, int i11) {
        int J0 = J0(i10);
        if (J0 != i11) {
            int i12 = i11 - J0;
            f1 f1Var = this.f2646h;
            int size = f1Var.f11050a.size() - 1;
            while (i10 != -1) {
                int J02 = J0(i10) + i12;
                F0(i10, J02);
                int i13 = size;
                while (true) {
                    if (-1 < i13) {
                        d dVar = (d) f1Var.f11050a.get(i13);
                        if (dVar != null && dVar.b(i10, J02)) {
                            size = i13 - 1;
                            break;
                        }
                        i13--;
                    } else {
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.D.f11097i;
                } else if (!this.D.i(i10)) {
                    i10 = this.D.m(i10);
                } else {
                    return;
                }
            }
        }
    }

    public final boolean H(int i10) {
        Object a02 = a0();
        if ((a02 instanceof Integer) && i10 == ((Number) a02).intValue()) {
            return false;
        }
        I0(Integer.valueOf(i10));
        return true;
    }

    public final i0.d<j<Object>, g1<Object>> H0(i0.d<j<Object>, ? extends g1<? extends Object>> dVar, i0.d<j<Object>, ? extends g1<? extends Object>> dVar2) {
        k0.e builder = dVar.builder();
        builder.putAll(dVar2);
        k0.c a10 = builder.a();
        u0(204, ComposerKt.f2745j);
        z(a10);
        z(dVar2);
        Q(false);
        return a10;
    }

    public final boolean I(long j2) {
        Object a02 = a0();
        if ((a02 instanceof Long) && j2 == ((Number) a02).longValue()) {
            return false;
        }
        I0(Long.valueOf(j2));
        return true;
    }

    public final void I0(Object obj) {
        boolean z10 = this.L;
        Set<u0> set = this.f2642d;
        if (z10) {
            this.F.M(obj);
            if (obj instanceof u0) {
                i0(new ComposerImpl$updateValue$1(obj));
                set.add(obj);
                return;
            }
            return;
        }
        w0 w0Var = this.D;
        int H = (w0Var.f11099k - a1.c.H(w0Var.f11091b, w0Var.f11097i)) - 1;
        if (obj instanceof u0) {
            set.add(obj);
        }
        m0(true, new ComposerImpl$updateValue$2(H, obj));
    }

    public final void J() {
        this.f2647i = null;
        this.f2648j = 0;
        this.f2650l = 0;
        this.P = 0;
        this.M = 0;
        this.f2654q = false;
        this.Q = false;
        this.S.c = 0;
        this.B.f11050a.clear();
        this.n = null;
        this.f2652o = null;
    }

    public final int J0(int i10) {
        int i11;
        Integer num;
        if (i10 >= 0) {
            int[] iArr = this.n;
            return (iArr == null || (i11 = iArr[i10]) < 0) ? this.D.k(i10) : i11;
        }
        HashMap<Integer, Integer> hashMap = this.f2652o;
        if (hashMap == null || (num = hashMap.get(Integer.valueOf(i10))) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final void K(h0.b bVar, ComposableLambdaImpl composableLambdaImpl) {
        v7.g.f(bVar, "invalidationsRequested");
        if (this.f2643e.isEmpty()) {
            O(bVar, composableLambdaImpl);
        } else {
            ComposerKt.c("Expected applyChanges() to have been called".toString());
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int L(int i10, int i11, int i12) {
        boolean z10;
        Object b5;
        if (i10 != i11) {
            w0 w0Var = this.D;
            int[] iArr = w0Var.f11091b;
            int i13 = i10 * 5;
            int i14 = 0;
            if ((iArr[i13 + 1] & 536870912) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                b5 = w0Var.l(iArr, i10);
                if (b5 != null) {
                    if (b5 instanceof Enum) {
                        i14 = ((Enum) b5).ordinal();
                    } else {
                        if (b5 instanceof d0) {
                            i14 = 126665345;
                        }
                        i14 = b5.hashCode();
                    }
                }
                if (i14 != 126665345) {
                    return i14;
                }
                return Integer.rotateLeft(L(this.D.m(i10), i11, i12), 3) ^ i14;
            }
            i14 = iArr[i13];
            if (i14 == 207) {
                b5 = w0Var.b(iArr, i10);
                if (b5 != null) {
                    if (v7.g.a(b5, d.a.f11039a)) {
                    }
                    i14 = b5.hashCode();
                }
            }
            if (i14 != 126665345) {
            }
        } else {
            return i12;
        }
    }

    public final i0.d<j<Object>, g1<Object>> M(Integer num) {
        int i10;
        i0.d dVar;
        boolean z10;
        Object obj;
        Object obj2;
        i0.d dVar2;
        if (num == null && (dVar2 = this.H) != null) {
            return dVar2;
        }
        if (this.L && this.G) {
            int i11 = this.F.f11135s;
            while (i11 > 0) {
                z0 z0Var = this.F;
                if (z0Var.f11120b[z0Var.n(i11) * 5] == 202) {
                    z0 z0Var2 = this.F;
                    int n = z0Var2.n(i11);
                    int[] iArr = z0Var2.f11120b;
                    int i12 = n * 5;
                    int i13 = iArr[i12 + 1];
                    if ((536870912 & i13) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        obj = z0Var2.c[a1.c.p0(i13 >> 30) + iArr[i12 + 4]];
                    } else {
                        obj = null;
                    }
                    if (v7.g.a(obj, ComposerKt.f2743h)) {
                        z0 z0Var3 = this.F;
                        int n10 = z0Var3.n(i11);
                        if (a1.c.B(z0Var3.f11120b, n10)) {
                            obj2 = z0Var3.c[z0Var3.d(z0Var3.f11120b, n10)];
                        } else {
                            obj2 = d.a.f11039a;
                        }
                        v7.g.d(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        dVar = (i0.d) obj2;
                        this.H = dVar;
                        return dVar;
                    }
                }
                i11 = this.F.z(i11);
            }
        }
        w0 w0Var = this.D;
        if (w0Var.c > 0) {
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = w0Var.f11097i;
            }
            while (i10 > 0) {
                w0 w0Var2 = this.D;
                int[] iArr2 = w0Var2.f11091b;
                if (iArr2[i10 * 5] == 202 && v7.g.a(w0Var2.l(iArr2, i10), ComposerKt.f2743h)) {
                    i0.d<j<Object>, g1<Object>> dVar3 = this.f2658u.get(Integer.valueOf(i10));
                    if (dVar3 == null) {
                        w0 w0Var3 = this.D;
                        Object b5 = w0Var3.b(w0Var3.f11091b, i10);
                        v7.g.d(b5, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        dVar3 = (i0.d) b5;
                    }
                    this.H = dVar3;
                    return dVar3;
                }
                i10 = this.D.m(i10);
            }
        }
        dVar = this.f2657t;
        this.H = dVar;
        return dVar;
    }

    public final void N() {
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.f2641b.n(this);
            this.B.f11050a.clear();
            this.f2655r.clear();
            this.f2643e.clear();
            this.f2658u.clear();
            this.f2640a.clear();
            n nVar = n.f16010a;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r4.size() <= 1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        n7.m.d2(r4, new g0.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        r9.f2648j = 0;
        r9.C = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        z0();
        r10 = a0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (r10 == r11) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
        if (r11 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        I0(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
        a1.c.X0(new androidx.compose.runtime.ComposerImpl$doCompose$2$5(r11, r9, r10), new androidx.compose.runtime.ComposerImpl$doCompose$2$3(r9), new androidx.compose.runtime.ComposerImpl$doCompose$2$4(r9));
        U();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
        r9.C = false;
        r4.clear();
        r10 = m7.n.f16010a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(h0.b bVar, ComposableLambdaImpl composableLambdaImpl) {
        if (!this.C) {
            Trace.beginSection("Compose:recompose");
            try {
                this.A = SnapshotKt.i().d();
                this.f2658u.clear();
                int i10 = bVar.c;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.f2655r;
                    if (i11 >= i10) {
                        break;
                    }
                    Object obj = bVar.f11323a[i11];
                    v7.g.d(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    h0.c cVar = (h0.c) bVar.f11324b[i11];
                    r0 r0Var = (r0) obj;
                    g0.b bVar2 = r0Var.c;
                    if (bVar2 != null) {
                        arrayList.add(new w(r0Var, bVar2.f11033a, cVar));
                        i11++;
                    } else {
                        return;
                    }
                }
            } finally {
                Trace.endSection();
            }
        } else {
            ComposerKt.c("Reentrant composition is not supported".toString());
            throw null;
        }
    }

    public final void P(int i10, int i11) {
        if (i10 > 0 && i10 != i11) {
            P(this.D.m(i10), i11);
            if (this.D.i(i10)) {
                this.O.e(this.D.j(i10));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026e A[LOOP:4: B:104:0x0257->B:115:0x026e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02a2 A[EDGE_INSN: B:192:0x02a2->B:116:0x02a2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(boolean z10) {
        Object b5;
        Object obj;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r42;
        boolean z16;
        HashSet hashSet;
        d dVar;
        ArrayList arrayList;
        LinkedHashSet linkedHashSet;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z17;
        int i16;
        boolean z18;
        boolean z19;
        int i17;
        boolean z20;
        boolean z21;
        if (this.L) {
            z0 z0Var = this.F;
            int i18 = z0Var.f11135s;
            i10 = z0Var.f11120b[z0Var.n(i18) * 5];
            z0 z0Var2 = this.F;
            int n = z0Var2.n(i18);
            int[] iArr = z0Var2.f11120b;
            int i19 = n * 5;
            int i20 = iArr[i19 + 1];
            if ((536870912 & i20) != 0) {
                z21 = true;
            } else {
                z21 = false;
            }
            if (z21) {
                obj = z0Var2.c[a1.c.p0(i20 >> 30) + iArr[i19 + 4]];
            } else {
                obj = null;
            }
            z0 z0Var3 = this.F;
            int n10 = z0Var3.n(i18);
            if (a1.c.B(z0Var3.f11120b, n10)) {
                b5 = z0Var3.c[z0Var3.d(z0Var3.f11120b, n10)];
            } else {
                b5 = d.a.f11039a;
            }
        } else {
            w0 w0Var = this.D;
            int i21 = w0Var.f11097i;
            int[] iArr2 = w0Var.f11091b;
            int i22 = iArr2[i21 * 5];
            Object l2 = w0Var.l(iArr2, i21);
            w0 w0Var2 = this.D;
            b5 = w0Var2.b(w0Var2.f11091b, i21);
            obj = l2;
            i10 = i22;
        }
        D0(obj, i10, b5);
        int i23 = this.f2650l;
        d dVar2 = this.f2647i;
        ArrayList arrayList2 = this.f2655r;
        if (dVar2 != null) {
            List<y> list = dVar2.f2871a;
            if (list.size() > 0) {
                ArrayList arrayList3 = dVar2.f2873d;
                v7.g.f(arrayList3, "<this>");
                HashSet hashSet2 = new HashSet(arrayList3.size());
                int size = arrayList3.size();
                for (int i24 = 0; i24 < size; i24++) {
                    hashSet2.add(arrayList3.get(i24));
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList3.size();
                int size3 = list.size();
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                while (i25 < size3) {
                    y yVar = list.get(i25);
                    boolean contains = hashSet2.contains(yVar);
                    int i28 = dVar2.f2872b;
                    if (!contains) {
                        k0(dVar2.a(yVar) + i28, yVar.f11112d);
                        int i29 = yVar.c;
                        dVar2.b(i29, 0);
                        w0 w0Var3 = this.D;
                        hashSet = hashSet2;
                        this.P = i29 - (w0Var3.f11095g - this.P);
                        w0Var3.n(i29);
                        q0(this, this.D.f11095g, false, 0);
                        c0();
                        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                        d0(false);
                        l0();
                        i0(qVar);
                        int i30 = this.P;
                        w0 w0Var4 = this.D;
                        this.P = a1.c.A(w0Var4.f11091b, w0Var4.f11095g) + i30;
                        this.D.o();
                        ComposerKt.a(arrayList2, i29, this.D.h(i29) + i29);
                    } else {
                        hashSet = hashSet2;
                        if (!linkedHashSet2.contains(yVar)) {
                            if (i26 < size2) {
                                y yVar2 = (y) arrayList3.get(i26);
                                HashMap<Integer, t> hashMap = dVar2.f2874e;
                                if (yVar2 != yVar) {
                                    int a10 = dVar2.a(yVar2);
                                    linkedHashSet2.add(yVar2);
                                    if (a10 != i27) {
                                        dVar = dVar2;
                                        t tVar = hashMap.get(Integer.valueOf(yVar2.c));
                                        if (tVar != null) {
                                            i15 = tVar.c;
                                        } else {
                                            i15 = yVar2.f11112d;
                                        }
                                        arrayList = arrayList3;
                                        int i31 = a10 + i28;
                                        int i32 = i28 + i27;
                                        if (i15 > 0) {
                                            linkedHashSet = linkedHashSet2;
                                            int i33 = this.X;
                                            i12 = size2;
                                            if (i33 > 0) {
                                                i13 = size3;
                                                if (this.V == i31 - i33 && this.W == i32 - i33) {
                                                    this.X = i33 + i15;
                                                }
                                            } else {
                                                i13 = size3;
                                            }
                                            c0();
                                            this.V = i31;
                                            this.W = i32;
                                            this.X = i15;
                                        } else {
                                            linkedHashSet = linkedHashSet2;
                                            i12 = size2;
                                            i13 = size3;
                                        }
                                        if (a10 > i27) {
                                            Collection<t> values = hashMap.values();
                                            v7.g.e(values, "groupInfos.values");
                                            for (t tVar2 : values) {
                                                int i34 = tVar2.f11080b;
                                                if (a10 <= i34 && i34 < a10 + i15) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                if (z19) {
                                                    i17 = (i34 - a10) + i27;
                                                } else {
                                                    if (i27 <= i34 && i34 < a10) {
                                                        z20 = true;
                                                    } else {
                                                        z20 = false;
                                                    }
                                                    if (z20) {
                                                        i17 = i34 + i15;
                                                    }
                                                }
                                                tVar2.f11080b = i17;
                                            }
                                        } else if (i27 > a10) {
                                            Collection<t> values2 = hashMap.values();
                                            v7.g.e(values2, "groupInfos.values");
                                            for (t tVar3 : values2) {
                                                int i35 = tVar3.f11080b;
                                                if (a10 <= i35 && i35 < a10 + i15) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                if (z17) {
                                                    i16 = (i35 - a10) + i27;
                                                } else {
                                                    if (a10 + 1 <= i35 && i35 < i27) {
                                                        z18 = true;
                                                    } else {
                                                        z18 = false;
                                                    }
                                                    if (z18) {
                                                        i16 = i35 - i15;
                                                    }
                                                }
                                                tVar3.f11080b = i16;
                                            }
                                        }
                                    } else {
                                        dVar = dVar2;
                                        arrayList = arrayList3;
                                        linkedHashSet = linkedHashSet2;
                                        i12 = size2;
                                        i13 = size3;
                                    }
                                } else {
                                    dVar = dVar2;
                                    arrayList = arrayList3;
                                    linkedHashSet = linkedHashSet2;
                                    i12 = size2;
                                    i13 = size3;
                                    i25++;
                                }
                                i26++;
                                v7.g.f(yVar2, "keyInfo");
                                t tVar4 = hashMap.get(Integer.valueOf(yVar2.c));
                                if (tVar4 != null) {
                                    i14 = tVar4.c;
                                } else {
                                    i14 = yVar2.f11112d;
                                }
                                i27 += i14;
                                hashSet2 = hashSet;
                                dVar2 = dVar;
                                arrayList3 = arrayList;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i12;
                                size3 = i13;
                            } else {
                                hashSet2 = hashSet;
                            }
                        }
                    }
                    i25++;
                    hashSet2 = hashSet;
                }
                c0();
                if (list.size() > 0) {
                    w0 w0Var5 = this.D;
                    this.P = w0Var5.f11096h - (w0Var5.f11095g - this.P);
                    w0Var5.p();
                }
            }
        }
        int i36 = this.f2648j;
        while (true) {
            w0 w0Var6 = this.D;
            if (w0Var6.f11098j > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && w0Var6.f11095g != w0Var6.f11096h) {
                z12 = false;
                if (!z12) {
                    break;
                }
                int i37 = w0Var6.f11095g;
                q0(this, i37, false, 0);
                c0();
                q<g0.c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
                d0(false);
                l0();
                i0(qVar2);
                int i38 = this.P;
                w0 w0Var7 = this.D;
                this.P = a1.c.A(w0Var7.f11091b, w0Var7.f11095g) + i38;
                k0(i36, this.D.o());
                ComposerKt.a(arrayList2, i37, this.D.f11095g);
            }
            z12 = true;
            if (!z12) {
            }
        }
        boolean z22 = this.L;
        int i39 = -1;
        if (z22) {
            ArrayList arrayList4 = this.K;
            if (z10) {
                arrayList4.add(this.T.d());
                i23 = 1;
            }
            w0 w0Var8 = this.D;
            int i40 = w0Var8.f11098j;
            if (i40 > 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                w0Var8.f11098j = i40 - 1;
                z0 z0Var4 = this.F;
                int i41 = z0Var4.f11135s;
                z0Var4.i();
                if (this.D.f11098j > 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    int i42 = (-2) - i41;
                    this.F.j();
                    this.F.f();
                    g0.b bVar = this.J;
                    if (arrayList4.isEmpty()) {
                        ComposerImpl$recordInsert$1 composerImpl$recordInsert$1 = new ComposerImpl$recordInsert$1(this.E, bVar);
                        d0(false);
                        l0();
                        i0(composerImpl$recordInsert$1);
                        r42 = 0;
                    } else {
                        ArrayList N2 = kotlin.collections.c.N2(arrayList4);
                        arrayList4.clear();
                        e0();
                        b0();
                        ComposerImpl$recordInsert$2 composerImpl$recordInsert$2 = new ComposerImpl$recordInsert$2(this.E, bVar, N2);
                        r42 = 0;
                        d0(false);
                        l0();
                        i0(composerImpl$recordInsert$2);
                    }
                    this.L = r42;
                    if (this.c.f11104j == 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (!z16) {
                        F0(i42, r42);
                        G0(i42, i23);
                    }
                }
            } else {
                throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
            }
        } else {
            if (z10) {
                n0();
            }
            int i43 = this.D.f11097i;
            v vVar = this.S;
            int i44 = vVar.c;
            if (i44 > 0) {
                i11 = ((int[]) vVar.f11086b)[i44 - 1];
            } else {
                i11 = -1;
            }
            if (i11 <= i43) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                if (i44 > 0) {
                    i39 = ((int[]) vVar.f11086b)[i44 - 1];
                }
                if (i39 == i43) {
                    vVar.a();
                    m0(false, ComposerKt.c);
                }
                int i45 = this.D.f11097i;
                if (i23 != J0(i45)) {
                    G0(i45, i23);
                }
                if (z10) {
                    i23 = 1;
                }
                this.D.d();
                c0();
            } else {
                ComposerKt.c("Missed recording an endGroup".toString());
                throw null;
            }
        }
        d dVar3 = (d) this.f2646h.d();
        if (dVar3 != null && !z22) {
            dVar3.c++;
        }
        this.f2647i = dVar3;
        this.f2648j = this.f2649k.a() + i23;
        this.f2650l = this.f2651m.a() + i23;
    }

    public final void R() {
        boolean z10 = false;
        Q(false);
        r0 W = W();
        if (W != null) {
            int i10 = W.f11071a;
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            if (z10) {
                W.f11071a = i10 | 2;
            }
        }
    }

    public final void S() {
        boolean z10 = false;
        Q(false);
        Q(false);
        int a10 = this.f2660w.a();
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        if (a10 != 0) {
            z10 = true;
        }
        this.f2659v = z10;
        this.H = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r0 T() {
        r0 r0Var;
        boolean z10;
        g0.b a10;
        RecomposeScopeImpl$end$1$2 recomposeScopeImpl$end$1$2;
        boolean z11;
        boolean z12;
        boolean z13;
        f1 f1Var = this.B;
        boolean z14 = true;
        r0 r0Var2 = null;
        if (!f1Var.f11050a.isEmpty()) {
            r0Var = (r0) f1Var.d();
        } else {
            r0Var = null;
        }
        if (r0Var != null) {
            r0Var.f11071a &= -9;
        }
        if (r0Var != null) {
            int i10 = this.A;
            h0.a aVar = r0Var.f11075f;
            if (aVar != null) {
                if ((r0Var.f11071a & 16) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    int i11 = aVar.f11321a;
                    int i12 = 0;
                    while (true) {
                        if (i12 < i11) {
                            v7.g.d(aVar.f11322b[i12], "null cannot be cast to non-null type kotlin.Any");
                            if (aVar.c[i12] != i10) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                z12 = true;
                                break;
                            }
                            i12++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    if (z12) {
                        recomposeScopeImpl$end$1$2 = new RecomposeScopeImpl$end$1$2(r0Var, i10, aVar);
                        if (recomposeScopeImpl$end$1$2 != null) {
                            i0(new ComposerImpl$endRestartGroup$1$1(recomposeScopeImpl$end$1$2, this));
                        }
                    }
                }
            }
            recomposeScopeImpl$end$1$2 = null;
            if (recomposeScopeImpl$end$1$2 != null) {
            }
        }
        if (r0Var != null) {
            int i13 = r0Var.f11071a;
            if ((i13 & 16) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if ((i13 & 1) == 0) {
                    z14 = false;
                }
                if (z14 || this.f2653p) {
                    if (r0Var.c == null) {
                        if (this.L) {
                            z0 z0Var = this.F;
                            a10 = z0Var.b(z0Var.f11135s);
                        } else {
                            w0 w0Var = this.D;
                            a10 = w0Var.a(w0Var.f11097i);
                        }
                        r0Var.c = a10;
                    }
                    r0Var.f11071a &= -5;
                    r0Var2 = r0Var;
                }
            }
        }
        Q(false);
        return r0Var2;
    }

    public final void U() {
        boolean z10 = false;
        Q(false);
        this.f2641b.c();
        Q(false);
        if (this.Q) {
            m0(false, ComposerKt.c);
            this.Q = false;
        }
        e0();
        if (this.f2646h.f11050a.isEmpty()) {
            if (this.S.c == 0) {
                z10 = true;
            }
            if (z10) {
                J();
                this.D.c();
                return;
            }
            ComposerKt.c("Missed recording an endGroup()".toString());
            throw null;
        }
        ComposerKt.c("Start/end imbalance".toString());
        throw null;
    }

    public final void V(boolean z10, d dVar) {
        this.f2646h.e(this.f2647i);
        this.f2647i = dVar;
        this.f2649k.b(this.f2648j);
        if (z10) {
            this.f2648j = 0;
        }
        this.f2651m.b(this.f2650l);
        this.f2650l = 0;
    }

    public final r0 W() {
        if (this.f2663z == 0) {
            f1 f1Var = this.B;
            if (!f1Var.f11050a.isEmpty()) {
                ArrayList arrayList = f1Var.f11050a;
                return (r0) arrayList.get(arrayList.size() - 1);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        boolean z10;
        boolean z11;
        if (this.f2659v) {
            return true;
        }
        r0 W = W();
        if (W != null) {
            if ((W.f11071a & 4) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                z10 = true;
                if (!z10) {
                    return true;
                }
                return false;
            }
        }
        z10 = false;
        if (!z10) {
        }
    }

    public final void Y(ArrayList arrayList) {
        x0 x0Var;
        g0.b bVar;
        int i10;
        List<q<g0.c<?>, z0, t0, n>> list;
        x0 x0Var2;
        x0 x0Var3;
        x0 x0Var4 = this.c;
        List<q<g0.c<?>, z0, t0, n>> list2 = this.f2644f;
        List<q<g0.c<?>, z0, t0, n>> list3 = this.f2643e;
        try {
            this.f2643e = list2;
            i0(ComposerKt.f2740e);
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Pair pair = (Pair) arrayList.get(i11);
                f0 f0Var = (f0) pair.f12962i;
                f0 f0Var2 = (f0) pair.f12963j;
                g0.b bVar2 = f0Var.f11047e;
                x0 x0Var5 = f0Var.f11046d;
                int d5 = x0Var5.d(bVar2);
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                e0();
                i0(new ComposerImpl$insertMovableContentGuarded$1$1$1(ref$IntRef, bVar2));
                if (f0Var2 == null) {
                    if (v7.g.a(x0Var5, this.E)) {
                        ComposerKt.f(this.F.f11136t);
                        x0 x0Var6 = new x0();
                        this.E = x0Var6;
                        z0 t10 = x0Var6.t();
                        t10.f();
                        this.F = t10;
                    }
                    w0 s10 = x0Var5.s();
                    s10.n(d5);
                    this.P = d5;
                    ArrayList arrayList2 = new ArrayList();
                    g0(null, null, null, EmptyList.f12981i, new ComposerImpl$insertMovableContentGuarded$1$1$2$1(this, arrayList2, s10, f0Var));
                    if (!arrayList2.isEmpty()) {
                        i0(new ComposerImpl$insertMovableContentGuarded$1$1$2$2(ref$IntRef, arrayList2));
                    }
                    n nVar = n.f16010a;
                    s10.c();
                    x0Var2 = x0Var4;
                    i10 = size;
                } else {
                    e0 j2 = this.f2641b.j(f0Var2);
                    if (j2 == null || (x0Var = j2.f11041a) == null) {
                        x0Var = f0Var2.f11046d;
                    }
                    if (j2 != null && (x0Var3 = j2.f11041a) != null) {
                        bVar = x0Var3.c();
                    } else {
                        bVar = f0Var2.f11047e;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    w0 s11 = x0Var.s();
                    i10 = size;
                    ComposerKt.b(s11, arrayList3, x0Var.d(bVar));
                    n nVar2 = n.f16010a;
                    s11.c();
                    if (!arrayList3.isEmpty()) {
                        i0(new ComposerImpl$insertMovableContentGuarded$1$1$3(ref$IntRef, arrayList3));
                        if (v7.g.a(x0Var5, x0Var4)) {
                            int d10 = x0Var4.d(bVar2);
                            F0(d10, J0(d10) + arrayList3.size());
                        }
                    }
                    i0(new ComposerImpl$insertMovableContentGuarded$1$1$4(j2, this, f0Var2, f0Var));
                    w0 s12 = x0Var.s();
                    w0 w0Var = this.D;
                    int[] iArr = this.n;
                    this.n = null;
                    try {
                        this.D = s12;
                        int d11 = x0Var.d(bVar);
                        s12.n(d11);
                        this.P = d11;
                        ArrayList arrayList4 = new ArrayList();
                        List<q<g0.c<?>, z0, t0, n>> list4 = this.f2643e;
                        try {
                            this.f2643e = arrayList4;
                            x0Var2 = x0Var4;
                            list = list4;
                        } catch (Throwable th) {
                            th = th;
                            list = list4;
                        }
                        try {
                            g0(f0Var2.c, f0Var.c, Integer.valueOf(s12.f11095g), f0Var2.f11048f, new ComposerImpl$insertMovableContentGuarded$1$1$5$1$1$1(this, f0Var));
                            this.f2643e = list;
                            if (!arrayList4.isEmpty()) {
                                i0(new ComposerImpl$insertMovableContentGuarded$1$1$5$1$2(ref$IntRef, arrayList4));
                            }
                            this.D = w0Var;
                            this.n = iArr;
                            s12.c();
                        } catch (Throwable th2) {
                            th = th2;
                            this.f2643e = list;
                            throw th;
                        }
                    } finally {
                        this.D = w0Var;
                        this.n = iArr;
                    }
                }
                i0(ComposerKt.f2738b);
                i11++;
                size = i10;
                x0Var4 = x0Var2;
            }
            i0(ComposerImpl$insertMovableContentGuarded$1$2.f2710j);
            this.P = 0;
            n nVar3 = n.f16010a;
            this.f2643e = list3;
        } catch (Throwable th3) {
            this.f2643e = list3;
            throw th3;
        }
    }

    @Override // g0.d
    public final void a() {
        this.f2653p = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a0() {
        d.a.C0120a c0120a;
        int i10;
        boolean z10 = this.L;
        d.a.C0120a c0120a2 = d.a.f11039a;
        if (z10) {
            if (!(!this.f2654q)) {
                ComposerKt.c("A call to createNode(), emitNode() or useNode() expected".toString());
                throw null;
            }
            return c0120a2;
        }
        w0 w0Var = this.D;
        if (w0Var.f11098j <= 0 && (i10 = w0Var.f11099k) < w0Var.f11100l) {
            w0Var.f11099k = i10 + 1;
            c0120a = w0Var.f11092d[i10];
            if (this.f2661x) {
                return c0120a;
            }
            return c0120a2;
        }
        c0120a = c0120a2;
        if (this.f2661x) {
        }
    }

    @Override // g0.d
    public final r0 b() {
        return W();
    }

    public final void b0() {
        f1 f1Var = this.O;
        if (!f1Var.f11050a.isEmpty()) {
            ArrayList arrayList = f1Var.f11050a;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = arrayList.get(i10);
            }
            i0(new ComposerImpl$realizeDowns$1(objArr));
            arrayList.clear();
        }
    }

    @Override // g0.d
    public final boolean c(boolean z10) {
        Object a02 = a0();
        if ((a02 instanceof Boolean) && z10 == ((Boolean) a02).booleanValue()) {
            return false;
        }
        I0(Boolean.valueOf(z10));
        return true;
    }

    public final void c0() {
        q<? super g0.c<?>, ? super z0, ? super t0, n> composerImpl$realizeMovement$2;
        int i10 = this.X;
        this.X = 0;
        if (i10 > 0) {
            int i11 = this.U;
            if (i11 >= 0) {
                this.U = -1;
                composerImpl$realizeMovement$2 = new ComposerImpl$realizeMovement$1(i11, i10);
            } else {
                int i12 = this.V;
                this.V = -1;
                int i13 = this.W;
                this.W = -1;
                composerImpl$realizeMovement$2 = new ComposerImpl$realizeMovement$2(i12, i13, i10);
            }
            j0(composerImpl$realizeMovement$2);
        }
    }

    @Override // g0.d
    public final void d() {
        if (this.f2661x && this.D.f11097i == this.f2662y) {
            this.f2662y = -1;
            this.f2661x = false;
        }
        Q(false);
    }

    public final void d0(boolean z10) {
        int i10;
        boolean z11;
        if (z10) {
            i10 = this.D.f11097i;
        } else {
            i10 = this.D.f11095g;
        }
        int i11 = i10 - this.P;
        if (i11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (i11 > 0) {
                i0(new ComposerImpl$realizeOperationLocation$2(i11));
                this.P = i10;
                return;
            }
            return;
        }
        ComposerKt.c("Tried to seek backward".toString());
        throw null;
    }

    @Override // g0.d
    public final void e() {
        boolean z10;
        if (this.f2650l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            r0 W = W();
            if (W != null) {
                W.f11071a |= 16;
            }
            if (this.f2655r.isEmpty()) {
                r0();
                return;
            } else {
                h0();
                return;
            }
        }
        ComposerKt.c("No nodes can be emitted before calling skipAndEndGroup".toString());
        throw null;
    }

    public final void e0() {
        int i10 = this.N;
        if (i10 > 0) {
            this.N = 0;
            i0(new ComposerImpl$realizeUps$1(i10));
        }
    }

    @Override // g0.d
    public final void f(int i10) {
        s0(i10, null, false, null);
    }

    public final boolean f0(h0.b<r0, h0.c<Object>> bVar) {
        boolean z10;
        v7.g.f(bVar, "invalidationsRequested");
        if (this.f2643e.isEmpty()) {
            if (bVar.c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !(!this.f2655r.isEmpty())) {
                return false;
            }
            O(bVar, null);
            return !this.f2643e.isEmpty();
        }
        ComposerKt.c("Expected applyChanges() to have been called".toString());
        throw null;
    }

    @Override // g0.d
    public final Object g() {
        return a0();
    }

    public final <R> R g0(l lVar, l lVar2, Integer num, List<Pair<r0, h0.c<Object>>> list, u7.a<? extends R> aVar) {
        R r3;
        int i10;
        boolean z10 = this.R;
        boolean z11 = this.C;
        int i11 = this.f2648j;
        try {
            this.R = false;
            this.C = true;
            this.f2648j = 0;
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Pair<r0, h0.c<Object>> pair = list.get(i12);
                r0 r0Var = pair.f12962i;
                h0.c<Object> cVar = pair.f12963j;
                if (cVar != null) {
                    int i13 = cVar.f11325i;
                    for (int i14 = 0; i14 < i13; i14++) {
                        A0(r0Var, cVar.get(i14));
                    }
                } else {
                    A0(r0Var, null);
                }
            }
            if (lVar != null) {
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = -1;
                }
                r3 = (R) lVar.t(lVar2, i10, aVar);
                if (r3 == null) {
                }
                return r3;
            }
            r3 = aVar.k0();
            return r3;
        } finally {
            this.R = z10;
            this.C = z11;
            this.f2648j = i11;
        }
    }

    @Override // g0.d
    public final void h() {
        this.f2661x = this.f2662y >= 0;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4 A[LOOP:5: B:31:0x0069->B:48:0x00a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0() {
        w wVar;
        boolean z10;
        boolean z11;
        boolean z12;
        h0.c<Object> cVar;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        h0.a aVar;
        int d5;
        int i10;
        n nVar;
        boolean z17;
        boolean z18 = this.C;
        this.C = true;
        w0 w0Var = this.D;
        int i11 = w0Var.f11097i;
        int h10 = w0Var.h(i11) + i11;
        int i12 = this.f2648j;
        int i13 = this.M;
        int i14 = this.f2650l;
        ArrayList arrayList = this.f2655r;
        int d10 = ComposerKt.d(this.D.f11095g, arrayList);
        if (d10 < 0) {
            d10 = -(d10 + 1);
        }
        if (d10 < arrayList.size()) {
            wVar = (w) arrayList.get(d10);
            if (wVar.f11089b < h10) {
                int i15 = i11;
                z10 = false;
                while (wVar != null) {
                    int i16 = wVar.f11089b;
                    int d11 = ComposerKt.d(i16, arrayList);
                    if (d11 >= 0) {
                        w wVar2 = (w) arrayList.remove(d11);
                    }
                    h0.c<Object> cVar2 = wVar.c;
                    r0 r0Var = wVar.f11088a;
                    if (cVar2 == null) {
                        r0Var.getClass();
                    } else {
                        h0.b<g0.n<?>, Object> bVar = r0Var.f11076g;
                        if (bVar != null) {
                            if (cVar2.f11325i > 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                if (!cVar2.isEmpty()) {
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 < cVar2.f11325i) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (!z12) {
                                            break;
                                        }
                                        int i18 = i17 + 1;
                                        Object obj = cVar2.f11326j[i17];
                                        v7.g.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                        if (obj instanceof g0.n) {
                                            g0.n<?> nVar2 = (g0.n) obj;
                                            c1<?> c = nVar2.c();
                                            if (c == null) {
                                                c = j1.f11059a;
                                            }
                                            cVar = cVar2;
                                            if (c.a(nVar2.f(), bVar.b(nVar2))) {
                                                z13 = true;
                                                if (z13) {
                                                    z14 = false;
                                                    break;
                                                } else {
                                                    i17 = i18;
                                                    cVar2 = cVar;
                                                }
                                            }
                                        } else {
                                            cVar = cVar2;
                                        }
                                        z13 = false;
                                        if (z13) {
                                        }
                                    }
                                }
                                z14 = true;
                                if (z14) {
                                    z15 = false;
                                    if (!z15) {
                                        this.D.n(i16);
                                        int i19 = this.D.f11095g;
                                        o0(i15, i19, i11);
                                        int m10 = this.D.m(i19);
                                        while (m10 != i11 && !this.D.i(m10)) {
                                            m10 = this.D.m(m10);
                                        }
                                        if (this.D.i(m10)) {
                                            i10 = 0;
                                        } else {
                                            i10 = i12;
                                        }
                                        if (m10 != i19) {
                                            int J0 = (J0(m10) - this.D.k(i19)) + i10;
                                            while (i10 < J0 && m10 != i16) {
                                                m10++;
                                                while (m10 < i16) {
                                                    int h11 = this.D.h(m10) + m10;
                                                    if (i16 >= h11) {
                                                        i10 += J0(m10);
                                                        m10 = h11;
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        this.f2648j = i10;
                                        this.M = L(this.D.m(i19), i11, i13);
                                        this.H = null;
                                        r0Var.getClass();
                                        p<? super g0.d, ? super Integer, n> pVar = r0Var.f11073d;
                                        if (pVar != null) {
                                            pVar.R(this, 1);
                                            nVar = n.f16010a;
                                        } else {
                                            nVar = null;
                                        }
                                        if (nVar != null) {
                                            this.H = null;
                                            w0 w0Var2 = this.D;
                                            int A = a1.c.A(w0Var2.f11091b, i11) + i11;
                                            int i20 = w0Var2.f11095g;
                                            if (i20 >= i11 && i20 <= A) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            if (z17) {
                                                w0Var2.f11097i = i11;
                                                w0Var2.f11096h = A;
                                                w0Var2.f11099k = 0;
                                                w0Var2.f11100l = 0;
                                                z16 = z18;
                                                i15 = i19;
                                                z10 = true;
                                            } else {
                                                ComposerKt.c(("Index " + i11 + " is not a parent of " + i20).toString());
                                                throw null;
                                            }
                                        } else {
                                            throw new IllegalStateException("Invalid restart scope".toString());
                                        }
                                    } else {
                                        f1 f1Var = this.B;
                                        f1Var.e(r0Var);
                                        androidx.compose.runtime.b bVar2 = r0Var.f11072b;
                                        if (bVar2 != null && (aVar = r0Var.f11075f) != null) {
                                            r0Var.f11071a |= 32;
                                            try {
                                                int i21 = aVar.f11321a;
                                                int i22 = 0;
                                                while (i22 < i21) {
                                                    int i23 = i21;
                                                    Object obj2 = aVar.f11322b[i22];
                                                    boolean z19 = z18;
                                                    v7.g.d(obj2, "null cannot be cast to non-null type kotlin.Any");
                                                    int i24 = aVar.c[i22];
                                                    bVar2.r(obj2);
                                                    i22++;
                                                    i21 = i23;
                                                    z18 = z19;
                                                }
                                                z16 = z18;
                                                r0Var.f11071a &= -33;
                                            } catch (Throwable th) {
                                                r0Var.f11071a &= -33;
                                                throw th;
                                            }
                                        } else {
                                            z16 = z18;
                                        }
                                        f1Var.d();
                                    }
                                    d5 = ComposerKt.d(this.D.f11095g, arrayList);
                                    if (d5 < 0) {
                                        d5 = -(d5 + 1);
                                    }
                                    if (d5 < arrayList.size()) {
                                        w wVar3 = (w) arrayList.get(d5);
                                        if (wVar3.f11089b < h10) {
                                            wVar = wVar3;
                                            z18 = z16;
                                        }
                                    }
                                    wVar = null;
                                    z18 = z16;
                                }
                            }
                        }
                    }
                    z15 = true;
                    if (!z15) {
                    }
                    d5 = ComposerKt.d(this.D.f11095g, arrayList);
                    if (d5 < 0) {
                    }
                    if (d5 < arrayList.size()) {
                    }
                    wVar = null;
                    z18 = z16;
                }
                boolean z20 = z18;
                if (!z10) {
                    o0(i15, i11, i11);
                    this.D.p();
                    int J02 = J0(i11);
                    this.f2648j = i12 + J02;
                    this.f2650l = i14 + J02;
                } else {
                    r0();
                }
                this.M = i13;
                this.C = z20;
            }
        }
        wVar = null;
        int i152 = i11;
        z10 = false;
        while (wVar != null) {
        }
        boolean z202 = z18;
        if (!z10) {
        }
        this.M = i13;
        this.C = z202;
    }

    @Override // g0.d
    public final x0 i() {
        return this.c;
    }

    public final void i0(q<? super g0.c<?>, ? super z0, ? super t0, n> qVar) {
        this.f2643e.add(qVar);
    }

    @Override // g0.d
    public final <V, T> void j(V v3, p<? super T, ? super V, n> pVar) {
        v7.g.f(pVar, "block");
        ComposerImpl$apply$operation$1 composerImpl$apply$operation$1 = new ComposerImpl$apply$operation$1(v3, pVar);
        if (this.L) {
            this.K.add(composerImpl$apply$operation$1);
        } else {
            j0(composerImpl$apply$operation$1);
        }
    }

    public final void j0(q<? super g0.c<?>, ? super z0, ? super t0, n> qVar) {
        e0();
        b0();
        i0(qVar);
    }

    @Override // g0.d
    public final CoroutineContext k() {
        return this.f2641b.g();
    }

    public final void k0(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                ComposerKt.c(("Invalid remove index " + i10).toString());
                throw null;
            } else if (this.U == i10) {
                this.X += i11;
            } else {
                c0();
                this.U = i10;
                this.X = i11;
            }
        }
    }

    @Override // g0.d
    public final boolean l() {
        return this.L;
    }

    public final void l0() {
        int i10;
        w0 w0Var = this.D;
        if (w0Var.c > 0) {
            int i11 = w0Var.f11097i;
            v vVar = this.S;
            int i12 = vVar.c;
            if (i12 > 0) {
                i10 = ((int[]) vVar.f11086b)[i12 - 1];
            } else {
                i10 = -2;
            }
            if (i10 != i11) {
                if (!this.Q && this.R) {
                    m0(false, ComposerKt.f2739d);
                    this.Q = true;
                }
                if (i11 > 0) {
                    g0.b a10 = w0Var.a(i11);
                    vVar.b(i11);
                    m0(false, new ComposerImpl$recordSlotEditing$1(a10));
                }
            }
        }
    }

    @Override // g0.d
    public final <T> void m(u7.a<? extends T> aVar) {
        v vVar;
        v7.g.f(aVar, "factory");
        if (this.f2654q) {
            this.f2654q = false;
            if (this.L) {
                int i10 = ((int[]) this.f2649k.f11086b)[vVar.c - 1];
                z0 z0Var = this.F;
                g0.b b5 = z0Var.b(z0Var.f11135s);
                this.f2650l++;
                this.K.add(new ComposerImpl$createNode$2(aVar, b5, i10));
                this.T.e(new ComposerImpl$createNode$3(i10, b5));
                return;
            }
            ComposerKt.c("createNode() can only be called when inserting".toString());
            throw null;
        }
        ComposerKt.c("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
        throw null;
    }

    public final void m0(boolean z10, q<? super g0.c<?>, ? super z0, ? super t0, n> qVar) {
        d0(z10);
        i0(qVar);
    }

    @Override // g0.d
    public final void n() {
        if (this.f2654q) {
            this.f2654q = false;
            if (!this.L) {
                w0 w0Var = this.D;
                this.O.e(w0Var.j(w0Var.f11097i));
                return;
            }
            ComposerKt.c("useNode() called while inserting".toString());
            throw null;
        }
        ComposerKt.c("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
        throw null;
    }

    public final void n0() {
        f1 f1Var = this.O;
        if (!f1Var.f11050a.isEmpty()) {
            f1Var.d();
        } else {
            this.N++;
        }
    }

    @Override // g0.d
    public final void o(boolean z10) {
        boolean z11;
        int i10;
        if (this.f2650l == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (!this.L) {
                if (!z10) {
                    r0();
                    return;
                }
                w0 w0Var = this.D;
                int i11 = w0Var.f11095g;
                int i12 = w0Var.f11096h;
                int i13 = i11;
                while (i13 < i12) {
                    w0 w0Var2 = this.D;
                    ComposerImpl$deactivateToEndGroup$2 composerImpl$deactivateToEndGroup$2 = new ComposerImpl$deactivateToEndGroup$2(this, i13);
                    w0Var2.getClass();
                    int H = a1.c.H(w0Var2.f11091b, i13);
                    i13++;
                    x0 x0Var = w0Var2.f11090a;
                    if (i13 < x0Var.f11104j) {
                        i10 = x0Var.f11103i[(i13 * 5) + 4];
                    } else {
                        i10 = x0Var.f11106l;
                    }
                    for (int i14 = H; i14 < i10; i14++) {
                        composerImpl$deactivateToEndGroup$2.R(Integer.valueOf(i14 - H), w0Var2.f11092d[i14]);
                    }
                }
                ComposerKt.a(this.f2655r, i11, i12);
                this.D.n(i11);
                this.D.p();
                return;
            }
            return;
        }
        ComposerKt.c("No nodes can be emitted before calling dactivateToEndGroup".toString());
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0(int i10, int i11, int i12) {
        w0 w0Var = this.D;
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        if (i10 != i11) {
            if (i10 != i12 && i11 != i12) {
                if (w0Var.m(i10) == i11) {
                    i12 = i11;
                } else if (w0Var.m(i11) != i10) {
                    if (w0Var.m(i10) == w0Var.m(i11)) {
                        i12 = w0Var.m(i10);
                    } else {
                        int i13 = i10;
                        int i14 = 0;
                        while (i13 > 0 && i13 != i12) {
                            i13 = w0Var.m(i13);
                            i14++;
                        }
                        int i15 = i11;
                        int i16 = 0;
                        while (i15 > 0 && i15 != i12) {
                            i15 = w0Var.m(i15);
                            i16++;
                        }
                        int i17 = i14 - i16;
                        int i18 = i10;
                        for (int i19 = 0; i19 < i17; i19++) {
                            i18 = w0Var.m(i18);
                        }
                        int i20 = i16 - i14;
                        int i21 = i11;
                        for (int i22 = 0; i22 < i20; i22++) {
                            i21 = w0Var.m(i21);
                        }
                        while (i18 != i21) {
                            i18 = w0Var.m(i18);
                            i21 = w0Var.m(i21);
                        }
                        i12 = i18;
                    }
                }
            }
            while (i10 > 0 && i10 != i12) {
                if (!w0Var.i(i10)) {
                    n0();
                }
                i10 = w0Var.m(i10);
            }
            P(i11, i12);
        }
        i12 = i10;
        while (i10 > 0) {
            if (!w0Var.i(i10)) {
            }
            i10 = w0Var.m(i10);
        }
        P(i11, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.runtime.ComposerImpl] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object[]] */
    @Override // g0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ComposerImpl p(int i10) {
        d.a.C0120a c0120a;
        r0 r0Var;
        int i11;
        int i12;
        w wVar = null;
        boolean z10 = false;
        s0(i10, null, false, null);
        boolean z11 = this.L;
        f1 f1Var = this.B;
        l lVar = this.f2645g;
        if (z11) {
            v7.g.d(lVar, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            r0Var = new r0((androidx.compose.runtime.b) lVar);
            f1Var.e(r0Var);
            I0(r0Var);
        } else {
            ArrayList arrayList = this.f2655r;
            int d5 = ComposerKt.d(this.D.f11097i, arrayList);
            if (d5 >= 0) {
                wVar = (w) arrayList.remove(d5);
            }
            w0 w0Var = this.D;
            int i13 = w0Var.f11098j;
            d.a.C0120a c0120a2 = d.a.f11039a;
            if (i13 <= 0 && (i12 = w0Var.f11099k) < w0Var.f11100l) {
                w0Var.f11099k = i12 + 1;
                c0120a = w0Var.f11092d[i12];
                if (!v7.g.a(c0120a, c0120a2)) {
                    v7.g.d(lVar, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                    r0Var = new r0((androidx.compose.runtime.b) lVar);
                    I0(r0Var);
                } else {
                    v7.g.d(c0120a, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                    r0Var = (r0) c0120a;
                }
                if (wVar != null) {
                    z10 = true;
                }
                int i14 = r0Var.f11071a;
                if (!z10) {
                    i11 = i14 | 8;
                } else {
                    i11 = i14 & (-9);
                }
                r0Var.f11071a = i11;
                f1Var.e(r0Var);
            }
            c0120a = c0120a2;
            if (!v7.g.a(c0120a, c0120a2)) {
            }
            if (wVar != null) {
            }
            int i142 = r0Var.f11071a;
            if (!z10) {
            }
            r0Var.f11071a = i11;
            f1Var.e(r0Var);
        }
        r0Var.f11074e = this.A;
        r0Var.f11071a &= -17;
        return this;
    }

    public final void p0() {
        boolean z10;
        x0 x0Var = this.c;
        if (x0Var.f11104j > 0 && a1.c.z(x0Var.f11103i, 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ArrayList arrayList = new ArrayList();
            this.I = arrayList;
            w0 s10 = x0Var.s();
            try {
                this.D = s10;
                List<q<g0.c<?>, z0, t0, n>> list = this.f2643e;
                this.f2643e = arrayList;
                q0(this, 0, false, 0);
                c0();
                e0();
                if (this.Q) {
                    i0(ComposerKt.f2738b);
                    if (this.Q) {
                        m0(false, ComposerKt.c);
                        this.Q = false;
                    }
                }
                n nVar = n.f16010a;
                this.f2643e = list;
                s10.c();
            } catch (Throwable th) {
                s10.c();
                throw th;
            }
        }
    }

    @Override // g0.d
    public final void q(Object obj) {
        I0(obj);
    }

    @Override // g0.d
    public final void r() {
        s0(125, null, true, null);
        this.f2654q = true;
    }

    public final void r0() {
        int i10;
        w0 w0Var = this.D;
        int i11 = w0Var.f11097i;
        if (i11 >= 0) {
            i10 = a1.c.F(w0Var.f11091b, i11);
        } else {
            i10 = 0;
        }
        this.f2650l = i10;
        this.D.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0024 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // g0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s() {
        boolean z10;
        boolean z11;
        if (this.L || this.f2661x || this.f2659v) {
            return false;
        }
        r0 W = W();
        if (W != null) {
            if ((W.f11071a & 8) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                z10 = true;
                if (z10) {
                    return false;
                }
                return true;
            }
        }
        z10 = false;
        if (z10) {
        }
    }

    public final void s0(int i10, Object obj, boolean z10, Object obj2) {
        d dVar;
        Object obj3;
        Object obj4 = obj;
        int i11 = 1;
        if (!this.f2654q) {
            B0(obj4, i10, obj2);
            boolean z11 = this.L;
            d.a.C0120a c0120a = d.a.f11039a;
            int i12 = 0;
            if (z11) {
                this.D.f11098j++;
                z0 z0Var = this.F;
                int i13 = z0Var.f11134r;
                d.a.C0120a c0120a2 = obj4;
                d.a.C0120a c0120a3 = obj4;
                if (z10) {
                    z0Var.L(125, c0120a, true, c0120a);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        c0120a2 = c0120a;
                    }
                    z0Var.L(i10, c0120a2, false, obj2);
                } else {
                    if (obj4 == null) {
                        c0120a3 = c0120a;
                    }
                    z0Var.L(i10, c0120a3, false, c0120a);
                }
                d dVar2 = this.f2647i;
                if (dVar2 != null) {
                    int i14 = (-2) - i13;
                    y yVar = new y(i10, -1, i14, -1);
                    dVar2.f2874e.put(Integer.valueOf(i14), new t(-1, this.f2648j - dVar2.f2872b, 0));
                    dVar2.f2873d.add(yVar);
                }
                V(z10, null);
                return;
            }
            if (this.f2647i == null) {
                if (this.D.f() == i10) {
                    w0 w0Var = this.D;
                    int i15 = w0Var.f11095g;
                    if (v7.g.a(obj4, i15 < w0Var.f11096h ? w0Var.l(w0Var.f11091b, i15) : null)) {
                        y0(obj2, z10);
                    }
                }
                w0 w0Var2 = this.D;
                w0Var2.getClass();
                ArrayList arrayList = new ArrayList();
                if (w0Var2.f11098j <= 0) {
                    int i16 = w0Var2.f11095g;
                    while (i16 < w0Var2.f11096h) {
                        int i17 = i16 * 5;
                        int[] iArr = w0Var2.f11091b;
                        int i18 = iArr[i17];
                        Object l2 = w0Var2.l(iArr, i16);
                        if (!a1.c.D(iArr, i16)) {
                            i11 = a1.c.F(iArr, i16);
                        }
                        arrayList.add(new y(i18, l2, i16, i11));
                        i16 += iArr[i17 + 3];
                        i11 = 1;
                    }
                }
                this.f2647i = new d(this.f2648j, arrayList);
            }
            d dVar3 = this.f2647i;
            if (dVar3 != null) {
                Object xVar = obj4 != null ? new x(Integer.valueOf(i10), obj4) : Integer.valueOf(i10);
                HashMap hashMap = (HashMap) dVar3.f2875f.getValue();
                q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(xVar);
                if (linkedHashSet == null || (obj3 = kotlin.collections.c.o2(linkedHashSet)) == null) {
                    obj3 = null;
                } else {
                    LinkedHashSet linkedHashSet2 = (LinkedHashSet) hashMap.get(xVar);
                    if (linkedHashSet2 != null) {
                        linkedHashSet2.remove(obj3);
                        if (linkedHashSet2.isEmpty()) {
                            hashMap.remove(xVar);
                        }
                        n nVar = n.f16010a;
                    }
                }
                y yVar2 = (y) obj3;
                HashMap<Integer, t> hashMap2 = dVar3.f2874e;
                ArrayList arrayList2 = dVar3.f2873d;
                int i19 = dVar3.f2872b;
                if (yVar2 != null) {
                    arrayList2.add(yVar2);
                    this.f2648j = dVar3.a(yVar2) + i19;
                    int i20 = yVar2.c;
                    t tVar = hashMap2.get(Integer.valueOf(i20));
                    int i21 = tVar != null ? tVar.f11079a : -1;
                    int i22 = dVar3.c;
                    int i23 = i21 - i22;
                    if (i21 > i22) {
                        Collection<t> values = hashMap2.values();
                        v7.g.e(values, "groupInfos.values");
                        for (t tVar2 : values) {
                            int i24 = tVar2.f11079a;
                            if (i24 == i21) {
                                tVar2.f11079a = i22;
                            } else if (i22 <= i24 && i24 < i21) {
                                tVar2.f11079a = i24 + 1;
                            }
                        }
                    } else if (i22 > i21) {
                        Collection<t> values2 = hashMap2.values();
                        v7.g.e(values2, "groupInfos.values");
                        for (t tVar3 : values2) {
                            int i25 = tVar3.f11079a;
                            if (i25 == i21) {
                                tVar3.f11079a = i22;
                            } else if (i21 + 1 <= i25 && i25 < i22) {
                                tVar3.f11079a = i25 - 1;
                            }
                        }
                    }
                    w0 w0Var3 = this.D;
                    this.P = i20 - (w0Var3.f11095g - this.P);
                    w0Var3.n(i20);
                    if (i23 > 0) {
                        ComposerImpl$start$2 composerImpl$start$2 = new ComposerImpl$start$2(i23);
                        d0(false);
                        l0();
                        i0(composerImpl$start$2);
                    }
                    y0(obj2, z10);
                } else {
                    this.D.f11098j++;
                    this.L = true;
                    this.H = null;
                    if (this.F.f11136t) {
                        z0 t10 = this.E.t();
                        this.F = t10;
                        t10.H();
                        this.G = false;
                        this.H = null;
                    }
                    this.F.e();
                    z0 z0Var2 = this.F;
                    int i26 = z0Var2.f11134r;
                    d.a.C0120a c0120a4 = obj4;
                    d.a.C0120a c0120a5 = obj4;
                    if (z10) {
                        z0Var2.L(125, c0120a, true, c0120a);
                    } else if (obj2 != null) {
                        if (obj4 == null) {
                            c0120a4 = c0120a;
                        }
                        z0Var2.L(i10, c0120a4, false, obj2);
                    } else {
                        if (obj4 == null) {
                            c0120a5 = c0120a;
                        }
                        z0Var2.L(i10, c0120a5, false, c0120a);
                    }
                    this.J = this.F.b(i26);
                    int i27 = (-2) - i26;
                    y yVar3 = new y(i10, -1, i27, -1);
                    hashMap2.put(Integer.valueOf(i27), new t(-1, this.f2648j - i19, 0));
                    arrayList2.add(yVar3);
                    ArrayList arrayList3 = new ArrayList();
                    if (!z10) {
                        i12 = this.f2648j;
                    }
                    dVar = new d(i12, arrayList3);
                    V(z10, dVar);
                    return;
                }
            }
            dVar = null;
            V(z10, dVar);
            return;
        }
        ComposerKt.c("A call to createNode(), emitNode() or useNode() expected".toString());
        throw null;
    }

    @Override // g0.d
    public final int t() {
        return this.M;
    }

    public final void t0() {
        s0(-127, null, false, null);
    }

    @Override // g0.d
    public final void u() {
        Q(false);
    }

    public final void u0(int i10, j0 j0Var) {
        s0(i10, j0Var, false, null);
    }

    @Override // g0.d
    public final void v() {
        Q(true);
    }

    public final void v0(int i10, Object obj) {
        s0(i10, obj, false, null);
    }

    @Override // g0.d
    public final Object w(o0 o0Var) {
        v7.g.f(o0Var, "key");
        i0.d<j<Object>, g1<Object>> M = M(null);
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        v7.g.f(M, "<this>");
        if (M.containsKey(o0Var)) {
            g1<Object> g1Var = M.get(o0Var);
            if (g1Var == null) {
                return null;
            }
            return g1Var.getValue();
        }
        return o0Var.f11057a.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r3.D.f() == 126) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0() {
        int i10 = 125;
        if (!this.L) {
            if (this.f2661x) {
                if (this.D.f() == 125) {
                    i10 = 126;
                }
            }
        }
        s0(i10, null, true, null);
        this.f2654q = true;
    }

    @Override // g0.d
    public final void x() {
        this.f2661x = false;
    }

    public final void x0(p0<?>[] p0VarArr) {
        i0.d<j<Object>, g1<Object>> H0;
        boolean a10;
        v7.g.f(p0VarArr, "values");
        i0.d<j<Object>, g1<Object>> M = M(null);
        u0(201, ComposerKt.f2742g);
        u0(203, ComposerKt.f2744i);
        ComposerImpl$startProviders$currentProviders$1 composerImpl$startProviders$currentProviders$1 = new ComposerImpl$startProviders$currentProviders$1(p0VarArr, M);
        v7.l.d(2, composerImpl$startProviders$currentProviders$1);
        i0.d<j<Object>, ? extends g1<? extends Object>> R = composerImpl$startProviders$currentProviders$1.R(this, 1);
        Q(false);
        if (this.L) {
            H0 = H0(M, R);
            this.G = true;
        } else {
            w0 w0Var = this.D;
            Object g10 = w0Var.g(w0Var.f11095g, 0);
            v7.g.d(g10, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            i0.d<j<Object>, g1<Object>> dVar = (i0.d) g10;
            w0 w0Var2 = this.D;
            Object g11 = w0Var2.g(w0Var2.f11095g, 1);
            v7.g.d(g11, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            i0.d dVar2 = (i0.d) g11;
            if (s() && v7.g.a(dVar2, R)) {
                this.f2650l = this.D.o() + this.f2650l;
                H0 = dVar;
            }
            H0 = H0(M, R);
            a10 = true ^ v7.g.a(H0, dVar);
            if (a10 && !this.L) {
                this.f2658u.put(Integer.valueOf(this.D.f11095g), H0);
            }
            this.f2660w.b(this.f2659v ? 1 : 0);
            this.f2659v = a10;
            this.H = H0;
            s0(202, ComposerKt.f2743h, false, H0);
        }
        a10 = false;
        if (a10) {
            this.f2658u.put(Integer.valueOf(this.D.f11095g), H0);
        }
        this.f2660w.b(this.f2659v ? 1 : 0);
        this.f2659v = a10;
        this.H = H0;
        s0(202, ComposerKt.f2743h, false, H0);
    }

    @Override // g0.d
    public final g0.c<?> y() {
        return this.f2640a;
    }

    public final void y0(Object obj, boolean z10) {
        if (z10) {
            w0 w0Var = this.D;
            if (w0Var.f11098j <= 0) {
                if (a1.c.D(w0Var.f11091b, w0Var.f11095g)) {
                    w0Var.q();
                    return;
                }
                throw new IllegalArgumentException("Expected a node group".toString());
            }
            return;
        }
        if (obj != null && this.D.e() != obj) {
            m0(false, new ComposerImpl$startReaderGroup$1(obj));
        }
        this.D.q();
    }

    @Override // g0.d
    public final boolean z(Object obj) {
        if (v7.g.a(a0(), obj)) {
            return false;
        }
        I0(obj);
        return true;
    }

    public final void z0() {
        Object value;
        x0 x0Var = this.c;
        this.D = x0Var.s();
        s0(100, null, false, null);
        g0.g gVar = this.f2641b;
        gVar.m();
        this.f2657t = gVar.e();
        boolean z10 = this.f2659v;
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        this.f2660w.b(z10 ? 1 : 0);
        this.f2659v = z(this.f2657t);
        this.H = null;
        if (!this.f2653p) {
            this.f2653p = gVar.d();
        }
        h1 h1Var = InspectionTablesKt.f2983a;
        i0.d<j<Object>, ? extends g1<? extends Object>> dVar = this.f2657t;
        v7.g.f(dVar, "<this>");
        v7.g.f(h1Var, "key");
        if (dVar.containsKey(h1Var)) {
            g1<? extends Object> g1Var = dVar.get(h1Var);
            if (g1Var != null) {
                value = g1Var.getValue();
            } else {
                value = null;
            }
        } else {
            value = h1Var.f11057a.getValue();
        }
        Set<Object> set = (Set) value;
        if (set != null) {
            set.add(x0Var);
            gVar.k(set);
        }
        s0(gVar.f(), null, false, null);
    }
}
