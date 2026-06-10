package androidx.compose.runtime;

import android.os.Trace;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import g0.e0;
import g0.f0;
import g0.i;
import g0.l;
import g0.r0;
import g0.t0;
import g0.u0;
import g0.x0;
import g0.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import m7.n;
import u7.p;
import u7.q;

/* loaded from: classes.dex */
public final class b implements l {
    public boolean A;
    public p<? super g0.d, ? super Integer, n> B;

    /* renamed from: i  reason: collision with root package name */
    public final g0.g f2849i;

    /* renamed from: j  reason: collision with root package name */
    public final g0.c<?> f2850j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicReference<Object> f2851k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f2852l;

    /* renamed from: m  reason: collision with root package name */
    public final HashSet<u0> f2853m;
    public final x0 n;

    /* renamed from: o  reason: collision with root package name */
    public final h0.d<r0> f2854o;

    /* renamed from: p  reason: collision with root package name */
    public final HashSet<r0> f2855p;

    /* renamed from: q  reason: collision with root package name */
    public final h0.d<g0.n<?>> f2856q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f2857r;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f2858s;

    /* renamed from: t  reason: collision with root package name */
    public final h0.d<r0> f2859t;

    /* renamed from: u  reason: collision with root package name */
    public h0.b<r0, h0.c<Object>> f2860u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2861v;

    /* renamed from: w  reason: collision with root package name */
    public b f2862w;

    /* renamed from: x  reason: collision with root package name */
    public int f2863x;

    /* renamed from: y  reason: collision with root package name */
    public final ComposerImpl f2864y;

    /* renamed from: z  reason: collision with root package name */
    public final CoroutineContext f2865z;

    /* loaded from: classes.dex */
    public static final class a implements t0 {

        /* renamed from: a  reason: collision with root package name */
        public final Set<u0> f2866a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f2867b;
        public final ArrayList c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f2868d;

        public a(HashSet hashSet) {
            v7.g.f(hashSet, "abandoning");
            this.f2866a = hashSet;
            this.f2867b = new ArrayList();
            this.c = new ArrayList();
            this.f2868d = new ArrayList();
        }

        @Override // g0.t0
        public final void a(u7.a<n> aVar) {
            v7.g.f(aVar, "effect");
            this.f2868d.add(aVar);
        }

        @Override // g0.t0
        public final void b(u0 u0Var) {
            v7.g.f(u0Var, "instance");
            ArrayList arrayList = this.f2867b;
            int lastIndexOf = arrayList.lastIndexOf(u0Var);
            if (lastIndexOf < 0) {
                this.c.add(u0Var);
                return;
            }
            arrayList.remove(lastIndexOf);
            this.f2866a.remove(u0Var);
        }

        @Override // g0.t0
        public final void c(u0 u0Var) {
            v7.g.f(u0Var, "instance");
            ArrayList arrayList = this.c;
            int lastIndexOf = arrayList.lastIndexOf(u0Var);
            if (lastIndexOf < 0) {
                this.f2867b.add(u0Var);
                return;
            }
            arrayList.remove(lastIndexOf);
            this.f2866a.remove(u0Var);
        }

        public final void d() {
            Set<u0> set = this.f2866a;
            if (!set.isEmpty()) {
                Trace.beginSection("Compose:abandons");
                try {
                    Iterator<u0> it = set.iterator();
                    while (it.hasNext()) {
                        it.remove();
                        it.next().b();
                    }
                    n nVar = n.f16010a;
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
        }

        public final void e() {
            ArrayList arrayList = this.c;
            boolean z10 = !arrayList.isEmpty();
            Set<u0> set = this.f2866a;
            if (z10) {
                Trace.beginSection("Compose:onForgotten");
                try {
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        u0 u0Var = (u0) arrayList.get(size);
                        if (!set.contains(u0Var)) {
                            u0Var.c();
                        }
                    }
                    n nVar = n.f16010a;
                    Trace.endSection();
                } finally {
                }
            }
            ArrayList arrayList2 = this.f2867b;
            if (!arrayList2.isEmpty()) {
                Trace.beginSection("Compose:onRemembered");
                try {
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        u0 u0Var2 = (u0) arrayList2.get(i10);
                        set.remove(u0Var2);
                        u0Var2.a();
                    }
                    n nVar2 = n.f16010a;
                    Trace.endSection();
                } finally {
                }
            }
        }

        public final void f() {
            ArrayList arrayList = this.f2868d;
            if (!arrayList.isEmpty()) {
                Trace.beginSection("Compose:sideeffects");
                try {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((u7.a) arrayList.get(i10)).k0();
                    }
                    arrayList.clear();
                    n nVar = n.f16010a;
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
        }
    }

    public b() {
        throw null;
    }

    public b(g0.g gVar, g0.a aVar) {
        v7.g.f(gVar, "parent");
        this.f2849i = gVar;
        this.f2850j = aVar;
        this.f2851k = new AtomicReference<>(null);
        this.f2852l = new Object();
        HashSet<u0> hashSet = new HashSet<>();
        this.f2853m = hashSet;
        x0 x0Var = new x0();
        this.n = x0Var;
        this.f2854o = new h0.d<>();
        this.f2855p = new HashSet<>();
        this.f2856q = new h0.d<>();
        ArrayList arrayList = new ArrayList();
        this.f2857r = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f2858s = arrayList2;
        this.f2859t = new h0.d<>();
        this.f2860u = new h0.b<>();
        ComposerImpl composerImpl = new ComposerImpl(aVar, gVar, x0Var, hashSet, arrayList, arrayList2, this);
        gVar.l(composerImpl);
        this.f2864y = composerImpl;
        this.f2865z = null;
        boolean z10 = gVar instanceof Recomposer;
        this.B = ComposableSingletons$CompositionKt.f2635a;
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.HashSet, T] */
    public static final void f(b bVar, boolean z10, Ref$ObjectRef<HashSet<r0>> ref$ObjectRef, Object obj) {
        InvalidationResult invalidationResult;
        boolean z11;
        HashSet<r0> hashSet;
        h0.d<r0> dVar = bVar.f2854o;
        int d5 = dVar.d(obj);
        if (d5 >= 0) {
            h0.c<r0> g10 = dVar.g(d5);
            int i10 = g10.f11325i;
            for (int i11 = 0; i11 < i10; i11++) {
                r0 r0Var = g10.get(i11);
                if (!bVar.f2859t.e(obj, r0Var)) {
                    b bVar2 = r0Var.f11072b;
                    InvalidationResult invalidationResult2 = InvalidationResult.IGNORED;
                    if (bVar2 == null || (invalidationResult = bVar2.A(r0Var, obj)) == null) {
                        invalidationResult = invalidationResult2;
                    }
                    if (invalidationResult != invalidationResult2) {
                        if (r0Var.f11076g != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11 && !z10) {
                            hashSet = bVar.f2855p;
                        } else {
                            HashSet<r0> hashSet2 = ref$ObjectRef.f13060i;
                            hashSet = hashSet2;
                            if (hashSet2 == null) {
                                ?? hashSet3 = new HashSet();
                                ref$ObjectRef.f13060i = hashSet3;
                                hashSet = hashSet3;
                            }
                        }
                        hashSet.add(r0Var);
                    }
                }
            }
        }
    }

    public final InvalidationResult A(r0 r0Var, Object obj) {
        boolean z10;
        v7.g.f(r0Var, "scope");
        int i10 = r0Var.f11071a;
        boolean z11 = true;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            r0Var.f11071a = i10 | 4;
        }
        g0.b bVar = r0Var.c;
        InvalidationResult invalidationResult = InvalidationResult.IGNORED;
        if (bVar != null && this.n.u(bVar) && bVar.a()) {
            if (!bVar.a()) {
                return invalidationResult;
            }
            if (r0Var.f11073d == null) {
                z11 = false;
            }
            if (!z11) {
                return invalidationResult;
            }
            return B(r0Var, bVar, obj);
        }
        return invalidationResult;
    }

    public final InvalidationResult B(r0 r0Var, g0.b bVar, Object obj) {
        boolean z10;
        synchronized (this.f2852l) {
            b bVar2 = this.f2862w;
            if (bVar2 == null || !this.n.g(this.f2863x, bVar)) {
                bVar2 = null;
            }
            if (bVar2 == null) {
                ComposerImpl composerImpl = this.f2864y;
                if (composerImpl.C && composerImpl.A0(r0Var, obj)) {
                    return InvalidationResult.IMMINENT;
                } else if (obj == null) {
                    this.f2860u.c(r0Var, null);
                } else {
                    h0.b<r0, h0.c<Object>> bVar3 = this.f2860u;
                    Object obj2 = i.f11053a;
                    bVar3.getClass();
                    v7.g.f(r0Var, "key");
                    if (bVar3.a(r0Var) >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        h0.c<Object> b5 = bVar3.b(r0Var);
                        if (b5 != null) {
                            b5.add(obj);
                        }
                    } else {
                        h0.c<Object> cVar = new h0.c<>();
                        cVar.add(obj);
                        n nVar = n.f16010a;
                        bVar3.c(r0Var, cVar);
                    }
                }
            }
            if (bVar2 != null) {
                return bVar2.B(r0Var, bVar, obj);
            }
            this.f2849i.h(this);
            if (this.f2864y.C) {
                return InvalidationResult.DEFERRED;
            }
            return InvalidationResult.SCHEDULED;
        }
    }

    public final void C(Object obj) {
        InvalidationResult invalidationResult;
        h0.d<r0> dVar = this.f2854o;
        int d5 = dVar.d(obj);
        if (d5 >= 0) {
            h0.c<r0> g10 = dVar.g(d5);
            int i10 = g10.f11325i;
            for (int i11 = 0; i11 < i10; i11++) {
                r0 r0Var = g10.get(i11);
                b bVar = r0Var.f11072b;
                if (bVar == null || (invalidationResult = bVar.A(r0Var, obj)) == null) {
                    invalidationResult = InvalidationResult.IGNORED;
                }
                if (invalidationResult == InvalidationResult.IMMINENT) {
                    this.f2859t.a(obj, r0Var);
                }
            }
        }
    }

    @Override // g0.f
    public final void a() {
        boolean z10;
        synchronized (this.f2852l) {
            if (!this.A) {
                this.A = true;
                this.B = ComposableSingletons$CompositionKt.f2636b;
                ArrayList arrayList = this.f2864y.I;
                if (arrayList != null) {
                    h(arrayList);
                }
                if (this.n.f11104j > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 || (true ^ this.f2853m.isEmpty())) {
                    a aVar = new a(this.f2853m);
                    if (z10) {
                        z0 t10 = this.n.t();
                        ComposerKt.e(t10, aVar);
                        n nVar = n.f16010a;
                        t10.f();
                        this.f2850j.clear();
                        aVar.e();
                    }
                    aVar.d();
                }
                this.f2864y.N();
            }
            n nVar2 = n.f16010a;
        }
        this.f2849i.o(this);
    }

    public final void b() {
        this.f2851k.set(null);
        this.f2857r.clear();
        this.f2858s.clear();
        this.f2853m.clear();
    }

    @Override // g0.l
    public final void c() {
        synchronized (this.f2852l) {
            try {
                h(this.f2857r);
                z();
                n nVar = n.f16010a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f2853m.isEmpty()) {
                            HashSet<u0> hashSet = this.f2853m;
                            v7.g.f(hashSet, "abandoning");
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!hashSet.isEmpty()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator<u0> it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        it.remove();
                                        it.next().b();
                                    }
                                    n nVar2 = n.f16010a;
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                } catch (Exception e10) {
                    b();
                    throw e10;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x009f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Set<? extends Object> set, boolean z10) {
        boolean z11;
        boolean z12;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        for (Object obj : set) {
            if (obj instanceof r0) {
                r0 r0Var = (r0) obj;
                b bVar = r0Var.f11072b;
                if (bVar != null) {
                    bVar.A(r0Var, null);
                }
            } else {
                f(this, z10, ref$ObjectRef, obj);
                h0.d<g0.n<?>> dVar = this.f2856q;
                int d5 = dVar.d(obj);
                if (d5 >= 0) {
                    h0.c<g0.n<?>> g10 = dVar.g(d5);
                    int i10 = g10.f11325i;
                    for (int i11 = 0; i11 < i10; i11++) {
                        f(this, z10, ref$ObjectRef, g10.get(i11));
                    }
                }
            }
        }
        h0.d<r0> dVar2 = this.f2854o;
        if (z10) {
            HashSet<r0> hashSet = this.f2855p;
            if (!hashSet.isEmpty()) {
                int i12 = dVar2.f11331d;
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    int i15 = dVar2.f11329a[i14];
                    h0.c<r0> cVar = dVar2.c[i15];
                    v7.g.c(cVar);
                    int i16 = cVar.f11325i;
                    int i17 = 0;
                    for (int i18 = 0; i18 < i16; i18++) {
                        Object obj2 = cVar.f11326j[i18];
                        v7.g.d(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        r0 r0Var2 = (r0) obj2;
                        if (!hashSet.contains(r0Var2)) {
                            HashSet hashSet2 = (HashSet) ref$ObjectRef.f13060i;
                            if (hashSet2 != null && hashSet2.contains(r0Var2)) {
                                z12 = true;
                                if (z12) {
                                    z11 = false;
                                    if (!z11) {
                                        if (i17 != i18) {
                                            cVar.f11326j[i17] = obj2;
                                        }
                                        i17++;
                                    }
                                }
                            }
                            z12 = false;
                            if (z12) {
                            }
                        }
                        z11 = true;
                        if (!z11) {
                        }
                    }
                    int i19 = cVar.f11325i;
                    for (int i20 = i17; i20 < i19; i20++) {
                        cVar.f11326j[i20] = null;
                    }
                    cVar.f11325i = i17;
                    if (i17 > 0) {
                        if (i13 != i14) {
                            int[] iArr = dVar2.f11329a;
                            int i21 = iArr[i13];
                            iArr[i13] = i15;
                            iArr[i14] = i21;
                        }
                        i13++;
                    }
                }
                int i22 = dVar2.f11331d;
                for (int i23 = i13; i23 < i22; i23++) {
                    dVar2.f11330b[dVar2.f11329a[i23]] = null;
                }
                dVar2.f11331d = i13;
                m();
                hashSet.clear();
                return;
            }
        }
        HashSet hashSet3 = (HashSet) ref$ObjectRef.f13060i;
        if (hashSet3 != null) {
            int i24 = dVar2.f11331d;
            int i25 = 0;
            for (int i26 = 0; i26 < i24; i26++) {
                int i27 = dVar2.f11329a[i26];
                h0.c<r0> cVar2 = dVar2.c[i27];
                v7.g.c(cVar2);
                int i28 = cVar2.f11325i;
                int i29 = 0;
                for (int i30 = 0; i30 < i28; i30++) {
                    Object obj3 = cVar2.f11326j[i30];
                    v7.g.d(obj3, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    if (!hashSet3.contains((r0) obj3)) {
                        if (i29 != i30) {
                            cVar2.f11326j[i29] = obj3;
                        }
                        i29++;
                    }
                }
                int i31 = cVar2.f11325i;
                for (int i32 = i29; i32 < i31; i32++) {
                    cVar2.f11326j[i32] = null;
                }
                cVar2.f11325i = i29;
                if (i29 > 0) {
                    if (i25 != i26) {
                        int[] iArr2 = dVar2.f11329a;
                        int i33 = iArr2[i25];
                        iArr2[i25] = i27;
                        iArr2[i26] = i33;
                    }
                    i25++;
                }
            }
            int i34 = dVar2.f11331d;
            for (int i35 = i25; i35 < i34; i35++) {
                dVar2.f11330b[dVar2.f11329a[i35]] = null;
            }
            dVar2.f11331d = i25;
            m();
        }
    }

    @Override // g0.l
    public final boolean e() {
        return this.f2864y.C;
    }

    @Override // g0.l
    public final void g(Object obj) {
        v7.g.f(obj, "value");
        synchronized (this.f2852l) {
            C(obj);
            h0.d<g0.n<?>> dVar = this.f2856q;
            int d5 = dVar.d(obj);
            if (d5 >= 0) {
                h0.c<g0.n<?>> g10 = dVar.g(d5);
                int i10 = g10.f11325i;
                for (int i11 = 0; i11 < i10; i11++) {
                    C(g10.get(i11));
                }
            }
            n nVar = n.f16010a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(ArrayList arrayList) {
        boolean z10;
        boolean z11;
        boolean isEmpty;
        g0.c<?> cVar = this.f2850j;
        ArrayList arrayList2 = this.f2858s;
        a aVar = new a(this.f2853m);
        try {
            if (arrayList.isEmpty()) {
                if (isEmpty) {
                    return;
                }
                return;
            }
            Trace.beginSection("Compose:applyChanges");
            cVar.d();
            z0 t10 = this.n.t();
            try {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((q) arrayList.get(i10)).O(cVar, t10, aVar);
                }
                arrayList.clear();
                n nVar = n.f16010a;
                t10.f();
                cVar.f();
                Trace.endSection();
                aVar.e();
                aVar.f();
                if (this.f2861v) {
                    Trace.beginSection("Compose:unobserve");
                    this.f2861v = false;
                    h0.d<r0> dVar = this.f2854o;
                    int i11 = dVar.f11331d;
                    int i12 = 0;
                    for (int i13 = 0; i13 < i11; i13++) {
                        int i14 = dVar.f11329a[i13];
                        h0.c<r0> cVar2 = dVar.c[i14];
                        v7.g.c(cVar2);
                        int i15 = cVar2.f11325i;
                        int i16 = 0;
                        for (int i17 = 0; i17 < i15; i17++) {
                            Object obj = cVar2.f11326j[i17];
                            v7.g.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            r0 r0Var = (r0) obj;
                            if (r0Var.f11072b != null) {
                                g0.b bVar = r0Var.c;
                                if (bVar != null) {
                                    z11 = bVar.a();
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    z10 = true;
                                    if (!(!z10)) {
                                        if (i16 != i17) {
                                            cVar2.f11326j[i16] = obj;
                                        }
                                        i16++;
                                    }
                                }
                            }
                            z10 = false;
                            if (!(!z10)) {
                            }
                        }
                        int i18 = cVar2.f11325i;
                        for (int i19 = i16; i19 < i18; i19++) {
                            cVar2.f11326j[i19] = null;
                        }
                        cVar2.f11325i = i16;
                        if (i16 > 0) {
                            if (i12 != i13) {
                                int[] iArr = dVar.f11329a;
                                int i20 = iArr[i12];
                                iArr[i12] = i14;
                                iArr[i13] = i20;
                            }
                            i12++;
                        }
                    }
                    int i21 = dVar.f11331d;
                    for (int i22 = i12; i22 < i21; i22++) {
                        dVar.f11330b[dVar.f11329a[i22]] = null;
                    }
                    dVar.f11331d = i12;
                    m();
                    n nVar2 = n.f16010a;
                    Trace.endSection();
                }
                if (arrayList2.isEmpty()) {
                    aVar.d();
                }
            } catch (Throwable th) {
                t10.f();
                throw th;
            }
        } finally {
            if (arrayList2.isEmpty()) {
                aVar.d();
            }
        }
    }

    @Override // g0.l
    public final void i(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (!v7.g.a(((f0) ((Pair) arrayList.get(i10)).f12962i).c, this)) {
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        ComposerKt.f(z10);
        try {
            ComposerImpl composerImpl = this.f2864y;
            composerImpl.getClass();
            composerImpl.Y(arrayList);
            composerImpl.J();
            n nVar = n.f16010a;
        } catch (Throwable th) {
            HashSet<u0> hashSet = this.f2853m;
            try {
                if (!hashSet.isEmpty()) {
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!hashSet.isEmpty()) {
                        Trace.beginSection("Compose:abandons");
                        Iterator<u0> it = hashSet.iterator();
                        while (it.hasNext()) {
                            it.remove();
                            it.next().b();
                        }
                        n nVar2 = n.f16010a;
                        Trace.endSection();
                    }
                }
                throw th;
            } catch (Exception e10) {
                b();
                throw e10;
            }
        }
    }

    @Override // g0.f
    public final void j(p<? super g0.d, ? super Integer, n> pVar) {
        if (!(!this.A)) {
            throw new IllegalStateException("The composition is disposed".toString());
        }
        this.B = pVar;
        this.f2849i.a(this, (ComposableLambdaImpl) pVar);
    }

    @Override // g0.l
    public final boolean k(h0.c cVar) {
        boolean z10;
        int i10 = 0;
        while (true) {
            if (i10 < cVar.f11325i) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            int i11 = i10 + 1;
            Object obj = cVar.f11326j[i10];
            v7.g.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (this.f2854o.c(obj) || this.f2856q.c(obj)) {
                break;
            }
            i10 = i11;
        }
        return true;
    }

    @Override // g0.l
    public final void l(e0 e0Var) {
        a aVar = new a(this.f2853m);
        z0 t10 = e0Var.f11041a.t();
        try {
            ComposerKt.e(t10, aVar);
            n nVar = n.f16010a;
            t10.f();
            aVar.e();
        } catch (Throwable th) {
            t10.f();
            throw th;
        }
    }

    public final void m() {
        boolean z10;
        h0.d<g0.n<?>> dVar = this.f2856q;
        int i10 = dVar.f11331d;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = dVar.f11329a[i12];
            h0.c<g0.n<?>> cVar = dVar.c[i13];
            v7.g.c(cVar);
            int i14 = cVar.f11325i;
            int i15 = 0;
            for (int i16 = 0; i16 < i14; i16++) {
                Object obj = cVar.f11326j[i16];
                v7.g.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!(!this.f2854o.c((g0.n) obj))) {
                    if (i15 != i16) {
                        cVar.f11326j[i15] = obj;
                    }
                    i15++;
                }
            }
            int i17 = cVar.f11325i;
            for (int i18 = i15; i18 < i17; i18++) {
                cVar.f11326j[i18] = null;
            }
            cVar.f11325i = i15;
            if (i15 > 0) {
                if (i11 != i12) {
                    int[] iArr = dVar.f11329a;
                    int i19 = iArr[i11];
                    iArr[i11] = i13;
                    iArr[i12] = i19;
                }
                i11++;
            }
        }
        int i20 = dVar.f11331d;
        for (int i21 = i11; i21 < i20; i21++) {
            dVar.f11330b[dVar.f11329a[i21]] = null;
        }
        dVar.f11331d = i11;
        Iterator<r0> it = this.f2855p.iterator();
        v7.g.e(it, "iterator()");
        while (it.hasNext()) {
            if (it.next().f11076g != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                it.remove();
            }
        }
    }

    @Override // g0.f
    public final boolean n() {
        boolean z10;
        synchronized (this.f2852l) {
            if (this.f2860u.c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // g0.l
    public final void o() {
        synchronized (this.f2852l) {
            try {
                if (!this.f2858s.isEmpty()) {
                    h(this.f2858s);
                }
                n nVar = n.f16010a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f2853m.isEmpty()) {
                            HashSet<u0> hashSet = this.f2853m;
                            v7.g.f(hashSet, "abandoning");
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!hashSet.isEmpty()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator<u0> it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        it.remove();
                                        it.next().b();
                                    }
                                    n nVar2 = n.f16010a;
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e10) {
                        b();
                        throw e10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // g0.l
    public final void p() {
        synchronized (this.f2852l) {
            try {
                this.f2864y.f2658u.clear();
                if (!this.f2853m.isEmpty()) {
                    HashSet<u0> hashSet = this.f2853m;
                    v7.g.f(hashSet, "abandoning");
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!hashSet.isEmpty()) {
                        Trace.beginSection("Compose:abandons");
                        Iterator<u0> it = hashSet.iterator();
                        while (it.hasNext()) {
                            it.remove();
                            it.next().b();
                        }
                        n nVar = n.f16010a;
                        Trace.endSection();
                    }
                }
                n nVar2 = n.f16010a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f2853m.isEmpty()) {
                            HashSet<u0> hashSet2 = this.f2853m;
                            v7.g.f(hashSet2, "abandoning");
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!hashSet2.isEmpty()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator<u0> it2 = hashSet2.iterator();
                                    while (it2.hasNext()) {
                                        it2.remove();
                                        it2.next().b();
                                    }
                                    n nVar3 = n.f16010a;
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e10) {
                        b();
                        throw e10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // g0.l
    public final void q(ComposableLambdaImpl composableLambdaImpl) {
        try {
            synchronized (this.f2852l) {
                v();
                h0.b<r0, h0.c<Object>> bVar = this.f2860u;
                this.f2860u = new h0.b<>();
                try {
                    this.f2864y.K(bVar, composableLambdaImpl);
                    n nVar = n.f16010a;
                } catch (Exception e10) {
                    this.f2860u = bVar;
                    throw e10;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f2853m.isEmpty()) {
                    HashSet<u0> hashSet = this.f2853m;
                    v7.g.f(hashSet, "abandoning");
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!hashSet.isEmpty()) {
                        Trace.beginSection("Compose:abandons");
                        Iterator<u0> it = hashSet.iterator();
                        while (it.hasNext()) {
                            it.remove();
                            it.next().b();
                        }
                        n nVar2 = n.f16010a;
                        Trace.endSection();
                    }
                }
                throw th;
            } catch (Exception e11) {
                b();
                throw e11;
            }
        }
    }

    @Override // g0.l
    public final void r(Object obj) {
        boolean z10;
        r0 W;
        Object[] h10;
        v7.g.f(obj, "value");
        ComposerImpl composerImpl = this.f2864y;
        boolean z11 = false;
        if (composerImpl.f2663z > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && (W = composerImpl.W()) != null) {
            W.f11071a |= 1;
            this.f2854o.a(obj, W);
            boolean z12 = obj instanceof g0.n;
            if (z12) {
                h0.d<g0.n<?>> dVar = this.f2856q;
                dVar.f(obj);
                for (Object obj2 : ((g0.n) obj).h()) {
                    if (obj2 == null) {
                        break;
                    }
                    dVar.a(obj2, obj);
                }
            }
            if ((W.f11071a & 32) != 0) {
                z11 = true;
            }
            if (!z11) {
                h0.a aVar = W.f11075f;
                if (aVar == null) {
                    aVar = new h0.a();
                    W.f11075f = aVar;
                }
                aVar.a(W.f11074e, obj);
                if (z12) {
                    h0.b<g0.n<?>, Object> bVar = W.f11076g;
                    if (bVar == null) {
                        bVar = new h0.b<>();
                        W.f11076g = bVar;
                    }
                    bVar.c(obj, ((g0.n) obj).f());
                }
            }
        }
    }

    @Override // g0.f
    public final boolean s() {
        return this.A;
    }

    @Override // g0.l
    public final <R> R t(l lVar, int i10, u7.a<? extends R> aVar) {
        if (lVar == null || v7.g.a(lVar, this) || i10 < 0) {
            return aVar.k0();
        }
        this.f2862w = (b) lVar;
        this.f2863x = i10;
        try {
            R k02 = aVar.k0();
            this.f2862w = null;
            this.f2863x = 0;
            return k02;
        } catch (Throwable th) {
            this.f2862w = null;
            this.f2863x = 0;
            throw th;
        }
    }

    @Override // g0.l
    public final void u(u7.a<n> aVar) {
        ComposerImpl composerImpl = this.f2864y;
        composerImpl.getClass();
        if (!composerImpl.C) {
            composerImpl.C = true;
            try {
                ((Recomposer$performRecompose$1$1) aVar).k0();
                return;
            } finally {
                composerImpl.C = false;
            }
        }
        ComposerKt.c("Preparing a composition while composing is not supported".toString());
        throw null;
    }

    public final void v() {
        AtomicReference<Object> atomicReference = this.f2851k;
        Object obj = i.f11053a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (v7.g.a(andSet, obj)) {
                ComposerKt.c("pending composition has not been applied");
                throw null;
            } else if (andSet instanceof Set) {
                d((Set) andSet, true);
            } else if (!(andSet instanceof Object[])) {
                ComposerKt.c("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            } else {
                for (Set<? extends Object> set : (Set[]) andSet) {
                    d(set, true);
                }
            }
        }
    }

    @Override // g0.l
    public final boolean w() {
        boolean f02;
        synchronized (this.f2852l) {
            v();
            h0.b<r0, h0.c<Object>> bVar = this.f2860u;
            this.f2860u = new h0.b<>();
            try {
                f02 = this.f2864y.f0(bVar);
                if (!f02) {
                    z();
                }
            } catch (Exception e10) {
                this.f2860u = bVar;
                throw e10;
            }
        }
        return f02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x004f, code lost:
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object[]] */
    @Override // g0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(Set<? extends Object> set) {
        Object obj;
        boolean z10;
        boolean a10;
        Set<? extends Object> set2;
        v7.g.f(set, "values");
        do {
            obj = this.f2851k.get();
            z10 = true;
            if (obj == null) {
                a10 = true;
            } else {
                a10 = v7.g.a(obj, i.f11053a);
            }
            if (a10) {
                set2 = set;
            } else if (obj instanceof Set) {
                set2 = new Set[]{(Set) obj, set};
            } else if (obj instanceof Object[]) {
                v7.g.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = set;
                set2 = copyOf;
            } else {
                throw new IllegalStateException(("corrupt pendingModifications: " + this.f2851k).toString());
            }
            AtomicReference<Object> atomicReference = this.f2851k;
            while (true) {
                if (!atomicReference.compareAndSet(obj, set2)) {
                    if (atomicReference.get() != obj) {
                        z10 = false;
                        continue;
                        break;
                    }
                }
            }
        } while (!z10);
        if (obj == null) {
            synchronized (this.f2852l) {
                z();
                n nVar = n.f16010a;
            }
        }
    }

    @Override // g0.l
    public final void y() {
        Object[] objArr;
        r0 r0Var;
        synchronized (this.f2852l) {
            for (Object obj : this.n.f11105k) {
                if (obj instanceof r0) {
                    r0Var = (r0) obj;
                } else {
                    r0Var = null;
                }
                if (r0Var != null) {
                    r0Var.invalidate();
                }
            }
            n nVar = n.f16010a;
        }
    }

    public final void z() {
        AtomicReference<Object> atomicReference = this.f2851k;
        Object andSet = atomicReference.getAndSet(null);
        if (v7.g.a(andSet, i.f11053a)) {
            return;
        }
        if (andSet instanceof Set) {
            d((Set) andSet, false);
        } else if (!(andSet instanceof Object[])) {
            if (andSet == null) {
                ComposerKt.c("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw null;
            } else {
                ComposerKt.c("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            }
        } else {
            for (Set<? extends Object> set : (Set[]) andSet) {
                d(set, false);
            }
        }
    }
}
