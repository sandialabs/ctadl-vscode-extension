package ja;

import ja.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* loaded from: classes.dex */
public class y0 implements u0, o, f1 {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12811i = AtomicReferenceFieldUpdater.newUpdater(y0.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* loaded from: classes.dex */
    public static final class a<T> extends j<T> {

        /* renamed from: q  reason: collision with root package name */
        public final y0 f12812q;

        public a(p7.c<? super T> cVar, y0 y0Var) {
            super(1, cVar);
            this.f12812q = y0Var;
        }

        @Override // ja.j
        public final String A() {
            return "AwaitContinuation";
        }

        @Override // ja.j
        public final Throwable q(y0 y0Var) {
            Throwable c;
            Object i02 = this.f12812q.i0();
            return (!(i02 instanceof c) || (c = ((c) i02).c()) == null) ? i02 instanceof s ? ((s) i02).f12801a : y0Var.C() : c;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends x0 {

        /* renamed from: m  reason: collision with root package name */
        public final y0 f12813m;
        public final c n;

        /* renamed from: o  reason: collision with root package name */
        public final n f12814o;

        /* renamed from: p  reason: collision with root package name */
        public final Object f12815p;

        public b(y0 y0Var, c cVar, n nVar, Object obj) {
            this.f12813m = y0Var;
            this.n = cVar;
            this.f12814o = nVar;
            this.f12815p = obj;
        }

        @Override // ja.u
        public final void M(Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y0.f12811i;
            y0 y0Var = this.f12813m;
            y0Var.getClass();
            n q02 = y0.q0(this.f12814o);
            c cVar = this.n;
            Object obj = this.f12815p;
            if (q02 == null || !y0Var.z0(cVar, q02, obj)) {
                y0Var.Q(y0Var.c0(cVar, obj));
            }
        }

        @Override // u7.l
        public final /* bridge */ /* synthetic */ m7.n U(Throwable th) {
            M(th);
            return m7.n.f16010a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements p0 {
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: i  reason: collision with root package name */
        public final c1 f12816i;
        private volatile /* synthetic */ int _isCompleting = 0;
        private volatile /* synthetic */ Object _exceptionsHolder = null;

        public c(c1 c1Var, Throwable th) {
            this.f12816i = c1Var;
            this._rootCause = th;
        }

        public final void a(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th == th2) {
            } else {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th == obj) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList(4);
                    arrayList.add(obj);
                    arrayList.add(th);
                    this._exceptionsHolder = arrayList;
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
        }

        @Override // ja.p0
        public final boolean b() {
            return ((Throwable) this._rootCause) == null;
        }

        public final Throwable c() {
            return (Throwable) this._rootCause;
        }

        public final boolean d() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean e() {
            return this._isCompleting;
        }

        public final boolean f() {
            if (this._exceptionsHolder == a1.c.D) {
                return true;
            }
            return false;
        }

        public final ArrayList g(Throwable th) {
            ArrayList arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && !v7.g.a(th, th2)) {
                arrayList.add(th);
            }
            this._exceptionsHolder = a1.c.D;
            return arrayList;
        }

        public final void h() {
            this._isCompleting = 1;
        }

        @Override // ja.p0
        public final c1 q() {
            return this.f12816i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
        public final String toString() {
            return "Finishing[cancelling=" + d() + ", completing=" + ((boolean) this._isCompleting) + ", rootCause=" + ((Throwable) this._rootCause) + ", exceptions=" + this._exceptionsHolder + ", list=" + this.f12816i + ']';
        }
    }

    public y0(boolean z10) {
        this._state = z10 ? a1.c.F : a1.c.E;
        this._parentHandle = null;
    }

    public static n q0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.H()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.F();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.C();
            if (!lockFreeLinkedListNode.H()) {
                if (lockFreeLinkedListNode instanceof n) {
                    return (n) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof c1) {
                    return null;
                }
            }
        }
    }

    public static String x0(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.d()) {
                return "Cancelling";
            }
            if (cVar.e()) {
                return "Completing";
            }
        } else if (!(obj instanceof p0)) {
            return obj instanceof s ? "Cancelled" : "Completed";
        } else if (!((p0) obj).b()) {
            return "New";
        }
        return "Active";
    }

    @Override // ja.f1
    public final CancellationException A() {
        Throwable th;
        Object i02 = i0();
        if (i02 instanceof c) {
            th = ((c) i02).c();
        } else if (i02 instanceof s) {
            th = ((s) i02).f12801a;
        } else if (i02 instanceof p0) {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + i02).toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(x0(i02)), th, this) : cancellationException;
    }

    @Override // ja.u0
    public final CancellationException C() {
        Object i02 = i0();
        CancellationException cancellationException = null;
        if (i02 instanceof c) {
            Throwable c10 = ((c) i02).c();
            if (c10 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (c10 instanceof CancellationException) {
                    cancellationException = (CancellationException) c10;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = Y();
                    }
                    return new JobCancellationException(concat, c10, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(i02 instanceof p0)) {
            if (i02 instanceof s) {
                Throwable th = ((s) i02).f12801a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new JobCancellationException(Y(), th, this);
                }
                return cancellationException;
            }
            return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    @Override // ja.u0
    public final m G(y0 y0Var) {
        return (m) u0.a.a(this, true, new n(y0Var), 2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R J(R r3, u7.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(r3, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext N(CoroutineContext.b<?> bVar) {
        return CoroutineContext.a.C0140a.b(this, bVar);
    }

    @Override // ja.u0
    public final h0 O(u7.l<? super Throwable, m7.n> lVar) {
        return z(false, true, lVar);
    }

    public void Q(Object obj) {
    }

    @Override // ja.u0
    public final Object R(p7.c<? super m7.n> cVar) {
        boolean z10;
        while (true) {
            Object i02 = i0();
            if (!(i02 instanceof p0)) {
                z10 = false;
                break;
            } else if (w0(i02) >= 0) {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            a1.b.L(cVar.f());
            return m7.n.f16010a;
        }
        j jVar = new j(1, m0.b.y0(cVar));
        jVar.u();
        jVar.x(new f(1, O(new h1(jVar))));
        Object s10 = jVar.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (s10 != coroutineSingletons) {
            s10 = m7.n.f16010a;
        }
        if (s10 == coroutineSingletons) {
            return s10;
        }
        return m7.n.f16010a;
    }

    public final Object U(p7.c<Object> cVar) {
        Object i02;
        do {
            i02 = i0();
            if (!(i02 instanceof p0)) {
                if (!(i02 instanceof s)) {
                    return a1.c.T1(i02);
                }
                throw ((s) i02).f12801a;
            }
        } while (w0(i02) < 0);
        a aVar = new a(m0.b.y0(cVar), this);
        aVar.u();
        aVar.x(new f(1, O(new t0(1, aVar))));
        return aVar.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c1 A[EDGE_INSN: B:94:0x00c1->B:65:0x00c1 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean V(Object obj) {
        kotlinx.coroutines.internal.r rVar;
        boolean z10;
        boolean z11;
        kotlinx.coroutines.internal.r rVar2 = a1.c.f88z;
        if (f0()) {
            do {
                Object i02 = i0();
                if ((i02 instanceof p0) && (!(i02 instanceof c) || !((c) i02).e())) {
                    rVar2 = y0(i02, new s(b0(obj), false));
                }
                rVar2 = a1.c.f88z;
                break;
            } while (rVar2 == a1.c.B);
            if (rVar2 == a1.c.A) {
                return true;
            }
        }
        if (rVar2 == a1.c.f88z) {
            Throwable th = null;
            Throwable th2 = null;
            while (true) {
                Object i03 = i0();
                if (i03 instanceof c) {
                    synchronized (i03) {
                        if (((c) i03).f()) {
                            rVar = a1.c.C;
                        } else {
                            boolean d5 = ((c) i03).d();
                            if (obj != null || !d5) {
                                if (th2 == null) {
                                    th2 = b0(obj);
                                }
                                ((c) i03).a(th2);
                            }
                            Throwable c10 = ((c) i03).c();
                            if (!d5) {
                                th = c10;
                            }
                            if (th != null) {
                                r0(((c) i03).f12816i, th);
                            }
                        }
                    }
                } else if (i03 instanceof p0) {
                    if (th2 == null) {
                        th2 = b0(obj);
                    }
                    p0 p0Var = (p0) i03;
                    if (p0Var.b()) {
                        c1 g02 = g0(p0Var);
                        if (g02 != null) {
                            c cVar = new c(g02, th2);
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12811i;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, p0Var, cVar)) {
                                    z10 = true;
                                    break;
                                } else if (atomicReferenceFieldUpdater.get(this) != p0Var) {
                                    z10 = false;
                                    break;
                                }
                            }
                            if (z10) {
                                r0(g02, th2);
                                z11 = true;
                                if (!z11) {
                                    break;
                                }
                            }
                        }
                        z11 = false;
                        if (!z11) {
                        }
                    } else {
                        Object y02 = y0(i03, new s(th2, false));
                        if (y02 != a1.c.f88z) {
                            if (y02 != a1.c.B) {
                                rVar2 = y02;
                                break;
                            }
                        } else {
                            throw new IllegalStateException(("Cannot happen in " + i03).toString());
                        }
                    }
                } else {
                    rVar = a1.c.C;
                    break;
                }
            }
            rVar = a1.c.f88z;
            rVar2 = rVar;
        }
        if (rVar2 != a1.c.f88z && rVar2 != a1.c.A) {
            if (rVar2 == a1.c.C) {
                return false;
            }
            Q(rVar2);
        }
        return true;
    }

    public void W(CancellationException cancellationException) {
        V(cancellationException);
    }

    public final boolean X(Throwable th) {
        if (m0()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        m mVar = (m) this._parentHandle;
        if (mVar != null && mVar != d1.f12762i) {
            if (mVar.p(th) || z10) {
                return true;
            }
            return false;
        }
        return z10;
    }

    public String Y() {
        return "Job was cancelled";
    }

    public boolean Z(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return V(th) && e0();
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.a> E a(CoroutineContext.b<E> bVar) {
        return (E) CoroutineContext.a.C0140a.a(this, bVar);
    }

    public final void a0(p0 p0Var, Object obj) {
        s sVar;
        Throwable th;
        m mVar = (m) this._parentHandle;
        if (mVar != null) {
            mVar.a();
            this._parentHandle = d1.f12762i;
        }
        CompletionHandlerException completionHandlerException = null;
        if (obj instanceof s) {
            sVar = (s) obj;
        } else {
            sVar = null;
        }
        if (sVar != null) {
            th = sVar.f12801a;
        } else {
            th = null;
        }
        if (p0Var instanceof x0) {
            try {
                ((x0) p0Var).M(th);
                return;
            } catch (Throwable th2) {
                k0(new CompletionHandlerException("Exception in completion handler " + p0Var + " for " + this, th2));
                return;
            }
        }
        c1 q10 = p0Var.q();
        if (q10 != null) {
            for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) q10.A(); !v7.g.a(lockFreeLinkedListNode, q10); lockFreeLinkedListNode = lockFreeLinkedListNode.C()) {
                if (lockFreeLinkedListNode instanceof x0) {
                    x0 x0Var = (x0) lockFreeLinkedListNode;
                    try {
                        x0Var.M(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            a1.c.M(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + x0Var + " for " + this, th3);
                            m7.n nVar = m7.n.f16010a;
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                k0(completionHandlerException);
            }
        }
    }

    @Override // ja.u0
    public boolean b() {
        Object i02 = i0();
        return (i02 instanceof p0) && ((p0) i02).b();
    }

    public final Throwable b0(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof Throwable;
        }
        if (z10) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new JobCancellationException(Y(), null, this);
            }
            return th;
        } else if (obj != null) {
            return ((f1) obj).A();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    @Override // ja.u0
    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(Y(), null, this);
        }
        W(cancellationException);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c0(c cVar, Object obj) {
        s sVar;
        Throwable d02;
        Object obj2;
        boolean z10;
        Throwable th = null;
        if (obj instanceof s) {
            sVar = (s) obj;
        } else {
            sVar = null;
        }
        if (sVar != null) {
            th = sVar.f12801a;
        }
        synchronized (cVar) {
            cVar.d();
            ArrayList<Throwable> g10 = cVar.g(th);
            d02 = d0(cVar, g10);
            if (d02 != null && g10.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g10.size()));
                for (Throwable th2 : g10) {
                    if (th2 != d02 && th2 != d02 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        a1.c.M(d02, th2);
                    }
                }
            }
        }
        if (d02 != null && d02 != th) {
            obj = new s(d02, false);
        }
        if (d02 != null) {
            if (!X(d02) && !j0(d02)) {
                z10 = false;
                if (z10) {
                    if (obj != null) {
                        s.f12800b.compareAndSet((s) obj, 0, 1);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    }
                }
            }
            z10 = true;
            if (z10) {
            }
        }
        s0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12811i;
        if (obj instanceof p0) {
            obj2 = new q0((p0) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, obj2) && atomicReferenceFieldUpdater.get(this) == cVar) {
        }
        a0(cVar, obj);
        return obj;
    }

    public final Throwable d0(c cVar, ArrayList arrayList) {
        Object obj;
        boolean z10;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!cVar.d()) {
                return null;
            }
            return new JobCancellationException(Y(), null, this);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean e0() {
        return true;
    }

    public boolean f0() {
        return this instanceof q;
    }

    public final c1 g0(p0 p0Var) {
        c1 q10 = p0Var.q();
        if (q10 == null) {
            if (p0Var instanceof j0) {
                return new c1();
            }
            if (p0Var instanceof x0) {
                u0((x0) p0Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + p0Var).toString());
        }
        return q10;
    }

    @Override // kotlin.coroutines.CoroutineContext.a
    public final CoroutineContext.b<?> getKey() {
        return u0.b.f12806i;
    }

    public final m h0() {
        return (m) this._parentHandle;
    }

    @Override // ja.o
    public final void i(y0 y0Var) {
        V(y0Var);
    }

    public final Object i0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.m)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.m) obj).c(this);
        }
    }

    public boolean j0(Throwable th) {
        return false;
    }

    public void k0(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final void l0(u0 u0Var) {
        d1 d1Var = d1.f12762i;
        if (u0Var == null) {
            this._parentHandle = d1Var;
            return;
        }
        u0Var.start();
        m G = u0Var.G(this);
        this._parentHandle = G;
        if (!(i0() instanceof p0)) {
            G.a();
            this._parentHandle = d1Var;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext m(CoroutineContext coroutineContext) {
        v7.g.f(coroutineContext, "context");
        return CoroutineContext.DefaultImpls.a(this, coroutineContext);
    }

    public boolean m0() {
        return this instanceof d;
    }

    public final boolean n0(Object obj) {
        Object y02;
        do {
            y02 = y0(i0(), obj);
            if (y02 == a1.c.f88z) {
                return false;
            }
            if (y02 == a1.c.A) {
                return true;
            }
        } while (y02 == a1.c.B);
        Q(y02);
        return true;
    }

    public final Object o0(Object obj) {
        Object y02;
        s sVar;
        do {
            y02 = y0(i0(), obj);
            if (y02 == a1.c.f88z) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof s) {
                    sVar = (s) obj;
                } else {
                    sVar = null;
                }
                if (sVar != null) {
                    th = sVar.f12801a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (y02 == a1.c.B);
        return y02;
    }

    public String p0() {
        return getClass().getSimpleName();
    }

    public final void r0(c1 c1Var, Throwable th) {
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) c1Var.A(); !v7.g.a(lockFreeLinkedListNode, c1Var); lockFreeLinkedListNode = lockFreeLinkedListNode.C()) {
            if (lockFreeLinkedListNode instanceof v0) {
                x0 x0Var = (x0) lockFreeLinkedListNode;
                try {
                    x0Var.M(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        a1.c.M(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + x0Var + " for " + this, th2);
                        m7.n nVar = m7.n.f16010a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            k0(completionHandlerException);
        }
        X(th);
    }

    public void s0(Object obj) {
    }

    @Override // ja.u0
    public final boolean start() {
        while (true) {
            int w02 = w0(i0());
            if (w02 == 0) {
                return false;
            }
            if (w02 == 1) {
                return true;
            }
        }
    }

    public void t0() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(p0() + '{' + x0(i0()) + '}');
        sb.append('@');
        sb.append(y.a(this));
        return sb.toString();
    }

    public final void u0(x0 x0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z10;
        c1 c1Var = new c1();
        x0Var.getClass();
        LockFreeLinkedListNode.f15453j.lazySet(c1Var, x0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode.f15452i;
        atomicReferenceFieldUpdater2.lazySet(c1Var, x0Var);
        while (true) {
            if (x0Var.A() == x0Var) {
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(x0Var, x0Var, c1Var)) {
                        z10 = true;
                        continue;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(x0Var) != x0Var) {
                        z10 = false;
                        continue;
                        break;
                    }
                }
                if (z10) {
                    c1Var.z(x0Var);
                    break;
                }
            } else {
                break;
            }
        }
        LockFreeLinkedListNode C = x0Var.C();
        do {
            atomicReferenceFieldUpdater = f12811i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, x0Var, C)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == x0Var);
    }

    public final <T, R> void v0(kotlinx.coroutines.selects.c<? super R> cVar, u7.p<? super T, ? super p7.c<? super R>, ? extends Object> pVar) {
        Object i02;
        do {
            i02 = i0();
            if (cVar.u()) {
                return;
            }
            if (!(i02 instanceof p0)) {
                if (cVar.m()) {
                    if (i02 instanceof s) {
                        cVar.i(((s) i02).f12801a);
                        return;
                    } else {
                        a1.c.A1(a1.c.T1(i02), cVar.e(), pVar);
                        return;
                    }
                }
                return;
            }
        } while (w0(i02) != 0);
        cVar.w(O(new j1(cVar, pVar)));
    }

    public final int w0(Object obj) {
        boolean z10 = obj instanceof j0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12811i;
        boolean z11 = false;
        if (z10) {
            if (((j0) obj).f12778i) {
                return 0;
            }
            j0 j0Var = a1.c.F;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, j0Var)) {
                    z11 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (!z11) {
                return -1;
            }
            t0();
            return 1;
        } else if (!(obj instanceof o0)) {
            return 0;
        } else {
            c1 c1Var = ((o0) obj).f12788i;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c1Var)) {
                    z11 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (!z11) {
                return -1;
            }
            t0();
            return 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Throwable, T] */
    public final Object y0(Object obj, Object obj2) {
        q0 q0Var;
        boolean z10;
        c cVar;
        s sVar;
        n nVar;
        kotlinx.coroutines.internal.r rVar;
        if (!(obj instanceof p0)) {
            return a1.c.f88z;
        }
        boolean z11 = false;
        if (((obj instanceof j0) || (obj instanceof x0)) && !(obj instanceof n) && !(obj2 instanceof s)) {
            p0 p0Var = (p0) obj;
            if (obj2 instanceof p0) {
                q0Var = new q0((p0) obj2);
            } else {
                q0Var = obj2;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12811i;
                if (atomicReferenceFieldUpdater.compareAndSet(this, p0Var, q0Var)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != p0Var) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                s0(obj2);
                a0(p0Var, obj2);
                z11 = true;
            }
            if (z11) {
                return obj2;
            }
            return a1.c.B;
        }
        p0 p0Var2 = (p0) obj;
        c1 g02 = g0(p0Var2);
        if (g02 == null) {
            return a1.c.B;
        }
        n nVar2 = null;
        if (p0Var2 instanceof c) {
            cVar = (c) p0Var2;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            cVar = new c(g02, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (cVar) {
            if (cVar.e()) {
                rVar = a1.c.f88z;
            } else {
                cVar.h();
                if (cVar != p0Var2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12811i;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, p0Var2, cVar)) {
                            z11 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != p0Var2) {
                            break;
                        }
                    }
                    if (!z11) {
                        rVar = a1.c.B;
                    }
                }
                boolean d5 = cVar.d();
                if (obj2 instanceof s) {
                    sVar = (s) obj2;
                } else {
                    sVar = null;
                }
                if (sVar != null) {
                    cVar.a(sVar.f12801a);
                }
                ?? c10 = Boolean.valueOf(d5 ^ true).booleanValue() ? cVar.c() : 0;
                ref$ObjectRef.f13060i = c10;
                m7.n nVar3 = m7.n.f16010a;
                if (c10 != 0) {
                    r0(g02, c10);
                }
                if (p0Var2 instanceof n) {
                    nVar = (n) p0Var2;
                } else {
                    nVar = null;
                }
                if (nVar == null) {
                    c1 q10 = p0Var2.q();
                    if (q10 != null) {
                        nVar2 = q0(q10);
                    }
                } else {
                    nVar2 = nVar;
                }
                if (nVar2 != null && z0(cVar, nVar2, obj2)) {
                    return a1.c.A;
                }
                return c0(cVar, obj2);
            }
            return rVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [ja.o0] */
    @Override // ja.u0
    public final h0 z(boolean z10, boolean z11, u7.l<? super Throwable, m7.n> lVar) {
        x0 x0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        s sVar;
        Throwable th;
        boolean z12;
        Throwable th2 = null;
        if (z10) {
            if (lVar instanceof v0) {
                x0Var = (v0) lVar;
            } else {
                x0Var = null;
            }
            if (x0Var == null) {
                x0Var = new s0(lVar);
            }
        } else {
            if (lVar instanceof x0) {
                x0Var = (x0) lVar;
            } else {
                x0Var = null;
            }
            if (x0Var == null) {
                x0Var = new t0(0, lVar);
            }
        }
        x0Var.f12809l = this;
        while (true) {
            Object i02 = i0();
            boolean z13 = true;
            if (i02 instanceof j0) {
                j0 j0Var = (j0) i02;
                if (j0Var.f12778i) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12811i;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, i02, x0Var)) {
                            if (atomicReferenceFieldUpdater2.get(this) != i02) {
                                z13 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z13) {
                        return x0Var;
                    }
                } else {
                    c1 c1Var = new c1();
                    if (!j0Var.f12778i) {
                        c1Var = new o0(c1Var);
                    }
                    do {
                        atomicReferenceFieldUpdater = f12811i;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, j0Var, c1Var)) {
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == j0Var);
                }
            } else if (i02 instanceof p0) {
                c1 q10 = ((p0) i02).q();
                if (q10 == null) {
                    if (i02 != null) {
                        u0((x0) i02);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                } else {
                    h0 h0Var = d1.f12762i;
                    if (z10 && (i02 instanceof c)) {
                        synchronized (i02) {
                            th = ((c) i02).c();
                            if (th == null || ((lVar instanceof n) && !((c) i02).e())) {
                                z0 z0Var = new z0(x0Var, this, i02);
                                while (true) {
                                    int L = q10.F().L(x0Var, q10, z0Var);
                                    if (L != 1) {
                                        if (L == 2) {
                                            z12 = false;
                                            break;
                                        }
                                    } else {
                                        z12 = true;
                                        break;
                                    }
                                }
                                if (z12) {
                                    if (th == null) {
                                        return x0Var;
                                    }
                                    h0Var = x0Var;
                                }
                            }
                            m7.n nVar = m7.n.f16010a;
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z11) {
                            lVar.U(th);
                        }
                        return h0Var;
                    }
                    z0 z0Var2 = new z0(x0Var, this, i02);
                    while (true) {
                        int L2 = q10.F().L(x0Var, q10, z0Var2);
                        if (L2 != 1) {
                            if (L2 == 2) {
                                z13 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z13) {
                        return x0Var;
                    }
                }
            } else {
                if (z11) {
                    if (i02 instanceof s) {
                        sVar = (s) i02;
                    } else {
                        sVar = null;
                    }
                    if (sVar != null) {
                        th2 = sVar.f12801a;
                    }
                    lVar.U(th2);
                }
                return d1.f12762i;
            }
        }
    }

    public final boolean z0(c cVar, n nVar, Object obj) {
        while (u0.a.a(nVar.f12785m, false, new b(this, cVar, nVar, obj), 1) == d1.f12762i) {
            nVar = q0(nVar);
            if (nVar == null) {
                return false;
            }
        }
        return true;
    }
}
