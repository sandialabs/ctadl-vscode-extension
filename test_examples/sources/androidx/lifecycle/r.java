package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.b;

/* loaded from: classes.dex */
public final class r extends Lifecycle {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5412b;
    public l.a<p, a> c;

    /* renamed from: d  reason: collision with root package name */
    public Lifecycle.State f5413d;

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference<q> f5414e;

    /* renamed from: f  reason: collision with root package name */
    public int f5415f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5416g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5417h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<Lifecycle.State> f5418i;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Lifecycle.State f5419a;

        /* renamed from: b  reason: collision with root package name */
        public final o f5420b;

        public a(p pVar, Lifecycle.State state) {
            o reflectiveGenericLifecycleObserver;
            v7.g.c(pVar);
            HashMap hashMap = u.f5422a;
            boolean z10 = pVar instanceof o;
            boolean z11 = pVar instanceof e;
            if (z10 && z11) {
                reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((e) pVar, (o) pVar);
            } else if (z11) {
                reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((e) pVar, null);
            } else if (z10) {
                reflectiveGenericLifecycleObserver = (o) pVar;
            } else {
                Class<?> cls = pVar.getClass();
                if (u.b(cls) == 2) {
                    Object obj = u.f5423b.get(cls);
                    v7.g.c(obj);
                    List list = (List) obj;
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(u.a((Constructor) list.get(0), pVar));
                    } else {
                        int size = list.size();
                        h[] hVarArr = new h[size];
                        for (int i10 = 0; i10 < size; i10++) {
                            hVarArr[i10] = u.a((Constructor) list.get(i10), pVar);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(hVarArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(pVar);
                }
            }
            this.f5420b = reflectiveGenericLifecycleObserver;
            this.f5419a = state;
        }

        public final void a(q qVar, Lifecycle.Event event) {
            Lifecycle.State a10 = event.a();
            Lifecycle.State state = this.f5419a;
            v7.g.f(state, "state1");
            if (a10.compareTo(state) < 0) {
                state = a10;
            }
            this.f5419a = state;
            this.f5420b.f(qVar, event);
            this.f5419a = a10;
        }
    }

    public r(q qVar) {
        v7.g.f(qVar, "provider");
        this.f5412b = true;
        this.c = new l.a<>();
        this.f5413d = Lifecycle.State.INITIALIZED;
        this.f5418i = new ArrayList<>();
        this.f5414e = new WeakReference<>(qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[LOOP:0: B:20:0x0044->B:26:0x006a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b A[SYNTHETIC] */
    @Override // androidx.lifecycle.Lifecycle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(p pVar) {
        q qVar;
        boolean z10;
        Lifecycle.State d5;
        Lifecycle.Event a10;
        v7.g.f(pVar, "observer");
        e("addObserver");
        Lifecycle.State state = this.f5413d;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        a aVar = new a(pVar, state2);
        if (this.c.d(pVar, aVar) != null || (qVar = this.f5414e.get()) == null) {
            return;
        }
        if (this.f5415f == 0 && !this.f5416g) {
            z10 = false;
            d5 = d(pVar);
            this.f5415f++;
            while (aVar.f5419a.compareTo(d5) < 0 && this.c.f15704m.containsKey(pVar)) {
                Lifecycle.State state3 = aVar.f5419a;
                ArrayList<Lifecycle.State> arrayList = this.f5418i;
                arrayList.add(state3);
                Lifecycle.Event.a aVar2 = Lifecycle.Event.Companion;
                Lifecycle.State state4 = aVar.f5419a;
                aVar2.getClass();
                a10 = Lifecycle.Event.a.a(state4);
                if (a10 == null) {
                    aVar.a(qVar, a10);
                    arrayList.remove(arrayList.size() - 1);
                    d5 = d(pVar);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f5419a);
                }
            }
            if (!z10) {
                i();
            }
            this.f5415f--;
        }
        z10 = true;
        d5 = d(pVar);
        this.f5415f++;
        while (aVar.f5419a.compareTo(d5) < 0) {
            Lifecycle.State state32 = aVar.f5419a;
            ArrayList<Lifecycle.State> arrayList2 = this.f5418i;
            arrayList2.add(state32);
            Lifecycle.Event.a aVar22 = Lifecycle.Event.Companion;
            Lifecycle.State state42 = aVar.f5419a;
            aVar22.getClass();
            a10 = Lifecycle.Event.a.a(state42);
            if (a10 == null) {
            }
        }
        if (!z10) {
        }
        this.f5415f--;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State b() {
        return this.f5413d;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void c(p pVar) {
        v7.g.f(pVar, "observer");
        e("removeObserver");
        this.c.g(pVar);
    }

    public final Lifecycle.State d(p pVar) {
        b.c<p, a> cVar;
        Lifecycle.State state;
        a aVar;
        l.a<p, a> aVar2 = this.c;
        Lifecycle.State state2 = null;
        if (aVar2.f15704m.containsKey(pVar)) {
            cVar = aVar2.f15704m.get(pVar).f15712l;
        } else {
            cVar = null;
        }
        if (cVar != null && (aVar = cVar.f15710j) != null) {
            state = aVar.f5419a;
        } else {
            state = null;
        }
        ArrayList<Lifecycle.State> arrayList = this.f5418i;
        if (!arrayList.isEmpty()) {
            state2 = arrayList.get(arrayList.size() - 1);
        }
        Lifecycle.State state3 = this.f5413d;
        v7.g.f(state3, "state1");
        if (state == null || state.compareTo(state3) >= 0) {
            state = state3;
        }
        if (state2 == null || state2.compareTo(state) >= 0) {
            return state;
        }
        return state2;
    }

    @SuppressLint({"RestrictedApi"})
    public final void e(String str) {
        boolean z10;
        if (this.f5412b) {
            k.c.L0().f12824i.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException(a4.b.m("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void f(Lifecycle.Event event) {
        v7.g.f(event, "event");
        e("handleLifecycleEvent");
        g(event.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Lifecycle.State state) {
        boolean z10;
        Lifecycle.State state2 = this.f5413d;
        if (state2 == state) {
            return;
        }
        Lifecycle.State state3 = Lifecycle.State.INITIALIZED;
        Lifecycle.State state4 = Lifecycle.State.DESTROYED;
        if (state2 == state3 && state == state4) {
            z10 = false;
            if (z10) {
                throw new IllegalStateException(("no event down from " + this.f5413d + " in component " + this.f5414e.get()).toString());
            }
            this.f5413d = state;
            if (!this.f5416g && this.f5415f == 0) {
                this.f5416g = true;
                i();
                this.f5416g = false;
                if (this.f5413d == state4) {
                    this.c = new l.a<>();
                    return;
                }
                return;
            }
            this.f5417h = true;
            return;
        }
        z10 = true;
        if (z10) {
        }
    }

    public final void h(Lifecycle.State state) {
        v7.g.f(state, "state");
        e("setCurrentState");
        g(state);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        boolean z10;
        Lifecycle.Event event;
        q qVar = this.f5414e.get();
        if (qVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            l.a<p, a> aVar = this.c;
            if (aVar.f15708l != 0) {
                b.c<p, a> cVar = aVar.f15705i;
                v7.g.c(cVar);
                Lifecycle.State state = cVar.f15710j.f5419a;
                b.c<p, a> cVar2 = this.c.f15706j;
                v7.g.c(cVar2);
                Lifecycle.State state2 = cVar2.f15710j.f5419a;
                if (state != state2 || this.f5413d != state2) {
                    z10 = false;
                    this.f5417h = false;
                    if (z10) {
                        Lifecycle.State state3 = this.f5413d;
                        b.c<p, a> cVar3 = this.c.f15705i;
                        v7.g.c(cVar3);
                        int compareTo = state3.compareTo(cVar3.f15710j.f5419a);
                        ArrayList<Lifecycle.State> arrayList = this.f5418i;
                        if (compareTo < 0) {
                            l.a<p, a> aVar2 = this.c;
                            b.C0178b c0178b = new b.C0178b(aVar2.f15706j, aVar2.f15705i);
                            aVar2.f15707k.put(c0178b, Boolean.FALSE);
                            while (c0178b.hasNext() && !this.f5417h) {
                                Map.Entry entry = (Map.Entry) c0178b.next();
                                v7.g.e(entry, "next()");
                                p pVar = (p) entry.getKey();
                                a aVar3 = (a) entry.getValue();
                                while (aVar3.f5419a.compareTo(this.f5413d) > 0 && !this.f5417h && this.c.f15704m.containsKey(pVar)) {
                                    Lifecycle.Event.a aVar4 = Lifecycle.Event.Companion;
                                    Lifecycle.State state4 = aVar3.f5419a;
                                    aVar4.getClass();
                                    v7.g.f(state4, "state");
                                    int ordinal = state4.ordinal();
                                    if (ordinal != 2) {
                                        if (ordinal != 3) {
                                            if (ordinal != 4) {
                                                event = null;
                                            } else {
                                                event = Lifecycle.Event.ON_PAUSE;
                                            }
                                        } else {
                                            event = Lifecycle.Event.ON_STOP;
                                        }
                                    } else {
                                        event = Lifecycle.Event.ON_DESTROY;
                                    }
                                    if (event != null) {
                                        arrayList.add(event.a());
                                        aVar3.a(qVar, event);
                                        arrayList.remove(arrayList.size() - 1);
                                    } else {
                                        throw new IllegalStateException("no event down from " + aVar3.f5419a);
                                    }
                                }
                            }
                        }
                        b.c<p, a> cVar4 = this.c.f15706j;
                        if (!this.f5417h && cVar4 != null && this.f5413d.compareTo(cVar4.f15710j.f5419a) > 0) {
                            l.a<p, a> aVar5 = this.c;
                            aVar5.getClass();
                            b.d dVar = new b.d();
                            aVar5.f15707k.put(dVar, Boolean.FALSE);
                            while (dVar.hasNext() && !this.f5417h) {
                                Map.Entry entry2 = (Map.Entry) dVar.next();
                                p pVar2 = (p) entry2.getKey();
                                a aVar6 = (a) entry2.getValue();
                                while (aVar6.f5419a.compareTo(this.f5413d) < 0 && !this.f5417h && this.c.f15704m.containsKey(pVar2)) {
                                    arrayList.add(aVar6.f5419a);
                                    Lifecycle.Event.a aVar7 = Lifecycle.Event.Companion;
                                    Lifecycle.State state5 = aVar6.f5419a;
                                    aVar7.getClass();
                                    Lifecycle.Event a10 = Lifecycle.Event.a.a(state5);
                                    if (a10 != null) {
                                        aVar6.a(qVar, a10);
                                        arrayList.remove(arrayList.size() - 1);
                                    } else {
                                        throw new IllegalStateException("no event up from " + aVar6.f5419a);
                                    }
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
            z10 = true;
            this.f5417h = false;
            if (z10) {
            }
        }
    }
}
