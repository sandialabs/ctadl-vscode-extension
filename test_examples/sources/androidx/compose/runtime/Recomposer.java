package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d0;
import g0.e0;
import g0.f0;
import g0.l;
import ja.i;
import ja.j;
import ja.u0;
import ja.w0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import m7.n;
import p0.g;

/* loaded from: classes.dex */
public final class Recomposer extends g0.g {

    /* renamed from: s  reason: collision with root package name */
    public static final StateFlowImpl f2773s;

    /* renamed from: t  reason: collision with root package name */
    public static final AtomicReference<Boolean> f2774t;

    /* renamed from: a  reason: collision with root package name */
    public final androidx.compose.runtime.a f2775a;

    /* renamed from: b  reason: collision with root package name */
    public final w0 f2776b;
    public final CoroutineContext c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f2777d;

    /* renamed from: e  reason: collision with root package name */
    public u0 f2778e;

    /* renamed from: f  reason: collision with root package name */
    public Throwable f2779f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f2780g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f2781h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f2782i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f2783j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f2784k;

    /* renamed from: l  reason: collision with root package name */
    public final LinkedHashMap f2785l;

    /* renamed from: m  reason: collision with root package name */
    public final LinkedHashMap f2786m;
    public ArrayList n;

    /* renamed from: o  reason: collision with root package name */
    public i<? super n> f2787o;

    /* renamed from: p  reason: collision with root package name */
    public b f2788p;

    /* renamed from: q  reason: collision with root package name */
    public final StateFlowImpl f2789q;

    /* renamed from: r  reason: collision with root package name */
    public final c f2790r;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "runtime_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* loaded from: classes.dex */
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* loaded from: classes.dex */
    public static final class a {
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b(Exception exc) {
        }
    }

    /* loaded from: classes.dex */
    public final class c {
    }

    static {
        new a();
        f2773s = kotlinx.coroutines.flow.f.a(l0.b.f15720l);
        f2774t = new AtomicReference<>(Boolean.FALSE);
    }

    public Recomposer(CoroutineContext coroutineContext) {
        v7.g.f(coroutineContext, "effectCoroutineContext");
        androidx.compose.runtime.a aVar = new androidx.compose.runtime.a(new Recomposer$broadcastFrameClock$1(this));
        this.f2775a = aVar;
        w0 w0Var = new w0((u0) coroutineContext.a(u0.b.f12806i));
        w0Var.O(new Recomposer$effectJob$1$1(this));
        this.f2776b = w0Var;
        this.c = coroutineContext.m(aVar).m(w0Var);
        this.f2777d = new Object();
        this.f2780g = new ArrayList();
        this.f2781h = new ArrayList();
        this.f2782i = new ArrayList();
        this.f2783j = new ArrayList();
        this.f2784k = new ArrayList();
        this.f2785l = new LinkedHashMap();
        this.f2786m = new LinkedHashMap();
        this.f2789q = kotlinx.coroutines.flow.f.a(State.Inactive);
        this.f2790r = new c();
    }

    public static final void B(ArrayList arrayList, Recomposer recomposer, l lVar) {
        arrayList.clear();
        synchronized (recomposer.f2777d) {
            Iterator it = recomposer.f2784k.iterator();
            while (it.hasNext()) {
                f0 f0Var = (f0) it.next();
                if (v7.g.a(f0Var.c, lVar)) {
                    arrayList.add(f0Var);
                    it.remove();
                }
            }
            n nVar = n.f16010a;
        }
    }

    public static /* synthetic */ void E(Recomposer recomposer, Exception exc, boolean z10, int i10) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        recomposer.D(exc, null, z10);
    }

    public static final Object p(Recomposer recomposer, p7.c cVar) {
        if (!recomposer.y()) {
            j jVar = new j(1, m0.b.y0(cVar));
            jVar.u();
            synchronized (recomposer.f2777d) {
                if (recomposer.y()) {
                    jVar.t(n.f16010a);
                } else {
                    recomposer.f2787o = jVar;
                }
                n nVar = n.f16010a;
            }
            Object s10 = jVar.s();
            if (s10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return s10;
            }
        }
        return n.f16010a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(Recomposer recomposer) {
        int i10;
        EmptyList emptyList;
        synchronized (recomposer.f2777d) {
            if (!recomposer.f2785l.isEmpty()) {
                ArrayList a22 = n7.l.a2(recomposer.f2785l.values());
                recomposer.f2785l.clear();
                ArrayList arrayList = new ArrayList(a22.size());
                int size = a22.size();
                for (int i11 = 0; i11 < size; i11++) {
                    f0 f0Var = (f0) a22.get(i11);
                    arrayList.add(new Pair(f0Var, recomposer.f2786m.get(f0Var)));
                }
                recomposer.f2786m.clear();
                emptyList = arrayList;
            } else {
                emptyList = EmptyList.f12981i;
            }
        }
        int size2 = emptyList.size();
        for (i10 = 0; i10 < size2; i10++) {
            Pair pair = (Pair) emptyList.get(i10);
            f0 f0Var2 = (f0) pair.f12962i;
            e0 e0Var = (e0) pair.f12963j;
            if (e0Var != null) {
                f0Var2.c.l(e0Var);
            }
        }
    }

    public static final void r(Recomposer recomposer) {
        synchronized (recomposer.f2777d) {
        }
    }

    public static final l s(Recomposer recomposer, l lVar, h0.c cVar) {
        p0.a aVar;
        p0.a z10;
        boolean z11;
        if (!lVar.e() && !lVar.s()) {
            Recomposer$readObserverOf$1 recomposer$readObserverOf$1 = new Recomposer$readObserverOf$1(lVar);
            Recomposer$writeObserverOf$1 recomposer$writeObserverOf$1 = new Recomposer$writeObserverOf$1(lVar, cVar);
            p0.f i10 = SnapshotKt.i();
            if (i10 instanceof p0.a) {
                aVar = (p0.a) i10;
            } else {
                aVar = null;
            }
            if (aVar != null && (z10 = aVar.z(recomposer$readObserverOf$1, recomposer$writeObserverOf$1)) != null) {
                try {
                    p0.f i11 = z10.i();
                    boolean z12 = true;
                    if (cVar.f11325i > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        z12 = false;
                    }
                    if (z12) {
                        lVar.u(new Recomposer$performRecompose$1$1(lVar, cVar));
                    }
                    boolean w10 = lVar.w();
                    p0.f.o(i11);
                    if (!w10) {
                        lVar = null;
                    }
                    return lVar;
                } finally {
                    v(z10);
                }
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }
        return null;
    }

    public static final void t(Recomposer recomposer) {
        ArrayList arrayList = recomposer.f2781h;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Set<? extends Object> set = (Set) arrayList.get(i10);
                ArrayList arrayList2 = recomposer.f2780g;
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((l) arrayList2.get(i11)).x(set);
                }
            }
            arrayList.clear();
            if (recomposer.x() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
    }

    public static final void u(Recomposer recomposer, u0 u0Var) {
        synchronized (recomposer.f2777d) {
            Throwable th = recomposer.f2779f;
            if (th == null) {
                if (((State) recomposer.f2789q.getValue()).compareTo(State.ShuttingDown) > 0) {
                    if (recomposer.f2778e == null) {
                        recomposer.f2778e = u0Var;
                        recomposer.x();
                    } else {
                        throw new IllegalStateException("Recomposer already running".toString());
                    }
                } else {
                    throw new IllegalStateException("Recomposer shut down".toString());
                }
            } else {
                throw th;
            }
        }
    }

    public static void v(p0.a aVar) {
        try {
            if (aVar.t() instanceof g.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            aVar.c();
        }
    }

    public final void A(l lVar) {
        synchronized (this.f2777d) {
            ArrayList arrayList = this.f2784k;
            int size = arrayList.size();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (v7.g.a(((f0) arrayList.get(i10)).c, lVar)) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (!z10) {
                return;
            }
            n nVar = n.f16010a;
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                B(arrayList2, this, lVar);
                if (!arrayList2.isEmpty()) {
                    C(arrayList2, null);
                } else {
                    return;
                }
            }
        }
    }

    public final List<l> C(List<f0> list, h0.c<Object> cVar) {
        p0.a aVar;
        p0.a z10;
        ArrayList arrayList;
        Object obj;
        Recomposer recomposer = this;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            f0 f0Var = list.get(i10);
            l lVar = f0Var.c;
            Object obj2 = hashMap.get(lVar);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(lVar, obj2);
            }
            ((ArrayList) obj2).add(f0Var);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            l lVar2 = (l) entry.getKey();
            List list2 = (List) entry.getValue();
            ComposerKt.f(!lVar2.e());
            Recomposer$readObserverOf$1 recomposer$readObserverOf$1 = new Recomposer$readObserverOf$1(lVar2);
            Recomposer$writeObserverOf$1 recomposer$writeObserverOf$1 = new Recomposer$writeObserverOf$1(lVar2, cVar);
            p0.f i11 = SnapshotKt.i();
            if (i11 instanceof p0.a) {
                aVar = (p0.a) i11;
            } else {
                aVar = null;
            }
            if (aVar != null && (z10 = aVar.z(recomposer$readObserverOf$1, recomposer$writeObserverOf$1)) != null) {
                try {
                    p0.f i12 = z10.i();
                    synchronized (recomposer.f2777d) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            f0 f0Var2 = (f0) list2.get(i13);
                            LinkedHashMap linkedHashMap = recomposer.f2785l;
                            d0<Object> d0Var = f0Var2.f11044a;
                            v7.g.f(linkedHashMap, "<this>");
                            List list3 = (List) linkedHashMap.get(d0Var);
                            if (list3 != null) {
                                if (!list3.isEmpty()) {
                                    Object remove = list3.remove(0);
                                    if (list3.isEmpty()) {
                                        linkedHashMap.remove(d0Var);
                                    }
                                    obj = remove;
                                } else {
                                    throw new NoSuchElementException("List is empty.");
                                }
                            } else {
                                obj = null;
                            }
                            arrayList.add(new Pair(f0Var2, obj));
                            i13++;
                            recomposer = this;
                        }
                    }
                    lVar2.i(arrayList);
                    n nVar = n.f16010a;
                    p0.f.o(i12);
                    v(z10);
                    recomposer = this;
                } catch (Throwable th) {
                    v(z10);
                    throw th;
                }
            } else {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
        }
        return kotlin.collections.c.L2(hashMap.keySet());
    }

    public final void D(Exception exc, l lVar, boolean z10) {
        Boolean bool = f2774t.get();
        v7.g.e(bool, "_hotReloadEnabled.get()");
        if (!bool.booleanValue() || (exc instanceof ComposeRuntimeError)) {
            throw exc;
        }
        synchronized (this.f2777d) {
            this.f2783j.clear();
            this.f2782i.clear();
            this.f2781h.clear();
            this.f2784k.clear();
            this.f2785l.clear();
            this.f2786m.clear();
            this.f2788p = new b(exc);
            if (lVar != null) {
                ArrayList arrayList = this.n;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.n = arrayList;
                }
                if (!arrayList.contains(lVar)) {
                    arrayList.add(lVar);
                }
                this.f2780g.remove(lVar);
            }
            x();
        }
    }

    public final Object F(p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f2775a, new Recomposer$recompositionRunner$2(this, new Recomposer$runRecomposeAndApplyChanges$2(this, null), a1.c.C0(cVar.f()), null));
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (I1 != coroutineSingletons) {
            I1 = n.f16010a;
        }
        if (I1 == coroutineSingletons) {
            return I1;
        }
        return n.f16010a;
    }

    @Override // g0.g
    public final void a(l lVar, ComposableLambdaImpl composableLambdaImpl) {
        p0.a z10;
        v7.g.f(lVar, "composition");
        boolean e10 = lVar.e();
        try {
            Recomposer$readObserverOf$1 recomposer$readObserverOf$1 = new Recomposer$readObserverOf$1(lVar);
            p0.a aVar = null;
            Recomposer$writeObserverOf$1 recomposer$writeObserverOf$1 = new Recomposer$writeObserverOf$1(lVar, null);
            p0.f i10 = SnapshotKt.i();
            if (i10 instanceof p0.a) {
                aVar = (p0.a) i10;
            }
            if (aVar != null && (z10 = aVar.z(recomposer$readObserverOf$1, recomposer$writeObserverOf$1)) != null) {
                p0.f i11 = z10.i();
                lVar.q(composableLambdaImpl);
                n nVar = n.f16010a;
                p0.f.o(i11);
                v(z10);
                if (!e10) {
                    SnapshotKt.i().l();
                }
                synchronized (this.f2777d) {
                    if (((State) this.f2789q.getValue()).compareTo(State.ShuttingDown) > 0 && !this.f2780g.contains(lVar)) {
                        this.f2780g.add(lVar);
                    }
                }
                try {
                    A(lVar);
                    try {
                        lVar.c();
                        lVar.o();
                        if (!e10) {
                            SnapshotKt.i().l();
                            return;
                        }
                        return;
                    } catch (Exception e11) {
                        E(this, e11, false, 6);
                        return;
                    }
                } catch (Exception e12) {
                    D(e12, lVar, true);
                    return;
                }
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        } catch (Exception e13) {
            D(e13, lVar, true);
        }
    }

    @Override // g0.g
    public final void b(f0 f0Var) {
        synchronized (this.f2777d) {
            LinkedHashMap linkedHashMap = this.f2785l;
            d0<Object> d0Var = f0Var.f11044a;
            v7.g.f(linkedHashMap, "<this>");
            Object obj = linkedHashMap.get(d0Var);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(d0Var, obj);
            }
            ((List) obj).add(f0Var);
        }
    }

    @Override // g0.g
    public final boolean d() {
        return false;
    }

    @Override // g0.g
    public final int f() {
        return 1000;
    }

    @Override // g0.g
    public final CoroutineContext g() {
        return this.c;
    }

    @Override // g0.g
    public final void h(l lVar) {
        i<n> iVar;
        v7.g.f(lVar, "composition");
        synchronized (this.f2777d) {
            if (this.f2782i.contains(lVar)) {
                iVar = null;
            } else {
                this.f2782i.add(lVar);
                iVar = x();
            }
        }
        if (iVar != null) {
            iVar.t(n.f16010a);
        }
    }

    @Override // g0.g
    public final void i(f0 f0Var, e0 e0Var) {
        synchronized (this.f2777d) {
            this.f2786m.put(f0Var, e0Var);
            n nVar = n.f16010a;
        }
    }

    @Override // g0.g
    public final e0 j(f0 f0Var) {
        e0 e0Var;
        v7.g.f(f0Var, "reference");
        synchronized (this.f2777d) {
            e0Var = (e0) this.f2786m.remove(f0Var);
        }
        return e0Var;
    }

    @Override // g0.g
    public final void k(Set<Object> set) {
    }

    @Override // g0.g
    public final void o(l lVar) {
        v7.g.f(lVar, "composition");
        synchronized (this.f2777d) {
            this.f2780g.remove(lVar);
            this.f2782i.remove(lVar);
            this.f2783j.remove(lVar);
            n nVar = n.f16010a;
        }
    }

    public final void w() {
        synchronized (this.f2777d) {
            if (((State) this.f2789q.getValue()).compareTo(State.Idle) >= 0) {
                this.f2789q.setValue(State.ShuttingDown);
            }
            n nVar = n.f16010a;
        }
        this.f2776b.c(null);
    }

    public final i<n> x() {
        StateFlowImpl stateFlowImpl = this.f2789q;
        int compareTo = ((State) stateFlowImpl.getValue()).compareTo(State.ShuttingDown);
        ArrayList arrayList = this.f2784k;
        ArrayList arrayList2 = this.f2783j;
        ArrayList arrayList3 = this.f2782i;
        ArrayList arrayList4 = this.f2781h;
        if (compareTo <= 0) {
            this.f2780g.clear();
            arrayList4.clear();
            arrayList3.clear();
            arrayList2.clear();
            arrayList.clear();
            this.n = null;
            i<? super n> iVar = this.f2787o;
            if (iVar != null) {
                iVar.B(null);
            }
            this.f2787o = null;
            this.f2788p = null;
            return null;
        }
        b bVar = this.f2788p;
        State state = State.PendingWork;
        State state2 = State.Inactive;
        if (bVar == null) {
            u0 u0Var = this.f2778e;
            androidx.compose.runtime.a aVar = this.f2775a;
            if (u0Var == null) {
                arrayList4.clear();
                arrayList3.clear();
                if (aVar.e()) {
                    state2 = State.InactivePendingWork;
                }
            } else {
                if (!(!arrayList3.isEmpty()) && !(!arrayList4.isEmpty()) && !(!arrayList2.isEmpty()) && !(!arrayList.isEmpty()) && !aVar.e()) {
                    state2 = State.Idle;
                }
                state2 = state;
            }
        }
        stateFlowImpl.setValue(state2);
        if (state2 != state) {
            return null;
        }
        i iVar2 = this.f2787o;
        this.f2787o = null;
        return iVar2;
    }

    public final boolean y() {
        boolean z10;
        synchronized (this.f2777d) {
            z10 = true;
            if (!(!this.f2781h.isEmpty()) && !(!this.f2782i.isEmpty())) {
                if (!this.f2775a.e()) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    public final Object z(p7.c<? super n> cVar) {
        Object b5 = FlowKt__ReduceKt.b(this.f2789q, new Recomposer$join$2(null), cVar);
        if (b5 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b5;
        }
        return n.f16010a;
    }
}
