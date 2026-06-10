package androidx.compose.runtime.snapshots;

import g0.c1;
import g0.g1;
import g0.j1;
import h0.b;
import h0.c;
import h0.d;
import h0.e;
import java.util.HashMap;
import java.util.Set;
import m7.n;
import p0.f;
import u7.a;
import u7.l;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class SnapshotStateObserver {

    /* renamed from: a  reason: collision with root package name */
    public final l<a<n>, n> f2959a;

    /* renamed from: b  reason: collision with root package name */
    public final p<Set<? extends Object>, f, n> f2960b = new SnapshotStateObserver$applyObserver$1(this);
    public final l<Object, n> c = new SnapshotStateObserver$readObserver$1(this);

    /* renamed from: d  reason: collision with root package name */
    public final e<ObservedScopeMap> f2961d = new e<>(new ObservedScopeMap[16]);

    /* renamed from: e  reason: collision with root package name */
    public p0.e f2962e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2963f;

    /* renamed from: g  reason: collision with root package name */
    public ObservedScopeMap f2964g;

    /* loaded from: classes.dex */
    public static final class ObservedScopeMap {

        /* renamed from: a  reason: collision with root package name */
        public final l<Object, n> f2965a;

        /* renamed from: b  reason: collision with root package name */
        public Object f2966b;
        public h0.a c;

        /* renamed from: d  reason: collision with root package name */
        public int f2967d;

        /* renamed from: e  reason: collision with root package name */
        public final d<Object> f2968e;

        /* renamed from: f  reason: collision with root package name */
        public final b<Object, h0.a> f2969f;

        /* renamed from: g  reason: collision with root package name */
        public final c<Object> f2970g;

        /* renamed from: h  reason: collision with root package name */
        public final l<g1<?>, n> f2971h;

        /* renamed from: i  reason: collision with root package name */
        public final l<g1<?>, n> f2972i;

        /* renamed from: j  reason: collision with root package name */
        public int f2973j;

        /* renamed from: k  reason: collision with root package name */
        public final d<g0.n<?>> f2974k;

        /* renamed from: l  reason: collision with root package name */
        public final HashMap<g0.n<?>, Object> f2975l;

        public ObservedScopeMap(l<Object, n> lVar) {
            g.f(lVar, "onChanged");
            this.f2965a = lVar;
            this.f2967d = -1;
            this.f2968e = new d<>();
            this.f2969f = new b<>();
            this.f2970g = new c<>();
            this.f2971h = new SnapshotStateObserver$ObservedScopeMap$derivedStateEnterObserver$1(this);
            this.f2972i = new SnapshotStateObserver$ObservedScopeMap$derivedStateExitObserver$1(this);
            this.f2974k = new d<>();
            this.f2975l = new HashMap<>();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void a(ObservedScopeMap observedScopeMap, Object obj) {
            boolean z10;
            h0.a aVar = observedScopeMap.c;
            if (aVar != null) {
                int i10 = aVar.f11321a;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj2 = aVar.f11322b[i12];
                    g.d(obj2, "null cannot be cast to non-null type kotlin.Any");
                    int i13 = aVar.c[i12];
                    if (i13 != observedScopeMap.f2967d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        d<Object> dVar = observedScopeMap.f2968e;
                        dVar.e(obj2, obj);
                        if ((obj2 instanceof g0.n) && !dVar.c(obj2)) {
                            observedScopeMap.f2974k.f(obj2);
                            observedScopeMap.f2975l.remove(obj2);
                        }
                    }
                    if (!z10) {
                        if (i11 != i12) {
                            aVar.f11322b[i11] = obj2;
                            aVar.c[i11] = i13;
                        }
                        i11++;
                    }
                }
                int i14 = aVar.f11321a;
                for (int i15 = i11; i15 < i14; i15++) {
                    aVar.f11322b[i15] = null;
                }
                aVar.f11321a = i11;
            }
        }

        public final boolean b(Set<? extends Object> set) {
            int d5;
            int d10;
            g.f(set, "changes");
            boolean z10 = false;
            for (Object obj : set) {
                d<g0.n<?>> dVar = this.f2974k;
                boolean c = dVar.c(obj);
                c<Object> cVar = this.f2970g;
                d<Object> dVar2 = this.f2968e;
                if (c && (d5 = dVar.d(obj)) >= 0) {
                    c<g0.n<?>> g10 = dVar.g(d5);
                    int i10 = g10.f11325i;
                    for (int i11 = 0; i11 < i10; i11++) {
                        g0.n<?> nVar = g10.get(i11);
                        Object obj2 = this.f2975l.get(nVar);
                        c1<?> c10 = nVar.c();
                        if (c10 == null) {
                            c10 = j1.f11059a;
                        }
                        if (!c10.a(nVar.f(), obj2) && (d10 = dVar2.d(nVar)) >= 0) {
                            c<Object> g11 = dVar2.g(d10);
                            int i12 = g11.f11325i;
                            int i13 = 0;
                            while (i13 < i12) {
                                cVar.add(g11.get(i13));
                                i13++;
                                z10 = true;
                            }
                        }
                    }
                }
                int d11 = dVar2.d(obj);
                if (d11 >= 0) {
                    c<Object> g12 = dVar2.g(d11);
                    int i14 = g12.f11325i;
                    int i15 = 0;
                    while (i15 < i14) {
                        cVar.add(g12.get(i15));
                        i15++;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        public final void c(Object obj) {
            Object[] h10;
            g.f(obj, "value");
            if (this.f2973j > 0) {
                return;
            }
            Object obj2 = this.f2966b;
            g.c(obj2);
            h0.a aVar = this.c;
            if (aVar == null) {
                aVar = new h0.a();
                this.c = aVar;
                this.f2969f.c(obj2, aVar);
            }
            int a10 = aVar.a(this.f2967d, obj);
            if ((obj instanceof g0.n) && a10 != this.f2967d) {
                g0.n nVar = (g0.n) obj;
                for (Object obj3 : nVar.h()) {
                    if (obj3 == null) {
                        break;
                    }
                    this.f2974k.a(obj3, obj);
                }
                this.f2975l.put(obj, nVar.f());
            }
            if (a10 == -1) {
                this.f2968e.a(obj, obj2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void d(l<Object, Boolean> lVar) {
            b<Object, h0.a> bVar = this.f2969f;
            int i10 = bVar.c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = bVar.f11323a[i12];
                g.d(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                h0.a aVar = (h0.a) bVar.f11324b[i12];
                Boolean U = lVar.U(obj);
                if (U.booleanValue()) {
                    int i13 = aVar.f11321a;
                    for (int i14 = 0; i14 < i13; i14++) {
                        Object obj2 = aVar.f11322b[i14];
                        g.d(obj2, "null cannot be cast to non-null type kotlin.Any");
                        int i15 = aVar.c[i14];
                        d<Object> dVar = this.f2968e;
                        dVar.e(obj2, obj);
                        if ((obj2 instanceof g0.n) && !dVar.c(obj2)) {
                            this.f2974k.f(obj2);
                            this.f2975l.remove(obj2);
                        }
                    }
                }
                if (!U.booleanValue()) {
                    if (i11 != i12) {
                        bVar.f11323a[i11] = obj;
                        Object[] objArr = bVar.f11324b;
                        objArr[i11] = objArr[i12];
                    }
                    i11++;
                }
            }
            int i16 = bVar.c;
            if (i16 > i11) {
                for (int i17 = i11; i17 < i16; i17++) {
                    bVar.f11323a[i17] = null;
                    bVar.f11324b[i17] = null;
                }
                bVar.c = i11;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(l<? super a<n>, n> lVar) {
        this.f2959a = lVar;
    }

    public final <T> ObservedScopeMap a(l<? super T, n> lVar) {
        ObservedScopeMap observedScopeMap;
        boolean z10;
        e<ObservedScopeMap> eVar = this.f2961d;
        int i10 = eVar.f11334k;
        if (i10 > 0) {
            ObservedScopeMap[] observedScopeMapArr = eVar.f11332i;
            g.d(observedScopeMapArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                observedScopeMap = observedScopeMapArr[i11];
                if (observedScopeMap.f2965a == lVar) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                }
                i11++;
            } while (i11 < i10);
            observedScopeMap = null;
        } else {
            observedScopeMap = null;
        }
        ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 == null) {
            g.d(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
            v7.l.d(1, lVar);
            ObservedScopeMap observedScopeMap3 = new ObservedScopeMap(lVar);
            eVar.b(observedScopeMap3);
            return observedScopeMap3;
        }
        return observedScopeMap2;
    }

    public final <T> void b(T t10, l<? super T, n> lVar, a<n> aVar) {
        ObservedScopeMap a10;
        g.f(t10, "scope");
        g.f(lVar, "onValueChangedForScope");
        synchronized (this.f2961d) {
            a10 = a(lVar);
        }
        boolean z10 = this.f2963f;
        ObservedScopeMap observedScopeMap = this.f2964g;
        try {
            this.f2963f = false;
            this.f2964g = a10;
            Object obj = a10.f2966b;
            h0.a aVar2 = a10.c;
            int i10 = a10.f2967d;
            a10.f2966b = t10;
            a10.c = a10.f2969f.b(t10);
            if (a10.f2967d == -1) {
                a10.f2967d = SnapshotKt.i().d();
            }
            a1.c.X0(new SnapshotStateObserver$observeReads$1$1(this, aVar), a10.f2971h, a10.f2972i);
            Object obj2 = a10.f2966b;
            g.c(obj2);
            ObservedScopeMap.a(a10, obj2);
            a10.f2966b = obj;
            a10.c = aVar2;
            a10.f2967d = i10;
        } finally {
            this.f2964g = observedScopeMap;
            this.f2963f = z10;
        }
    }
}
