package ja;

import ja.u0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* loaded from: classes.dex */
public class j<T> extends d0<T> implements i<T>, q7.b {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12774o = AtomicIntegerFieldUpdater.newUpdater(j.class, "_decision");

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12775p = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: l  reason: collision with root package name */
    public final p7.c<T> f12776l;

    /* renamed from: m  reason: collision with root package name */
    public final CoroutineContext f12777m;
    public h0 n;

    public j(int i10, p7.c cVar) {
        super(i10);
        this.f12776l = cVar;
        this.f12777m = cVar.f();
        this._decision = 0;
        this._state = b.f12757i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x000f, code lost:
        if (r11 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object E(e1 e1Var, Object obj, int i10, u7.l lVar, Object obj2) {
        if (obj instanceof s) {
            return obj;
        }
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        }
        if (lVar != null || (((e1Var instanceof g) && !(e1Var instanceof c)) || obj2 != null)) {
            return new r(obj, e1Var instanceof g ? (g) e1Var : null, lVar, obj2, null, 16);
        }
        return obj;
    }

    public static void z(Object obj, u7.l lVar) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0020, code lost:
        continue;
     */
    @Override // ja.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(Throwable th) {
        Object obj;
        boolean z10;
        boolean z11;
        g gVar;
        do {
            obj = this._state;
            z10 = false;
            if (!(obj instanceof e1)) {
                return false;
            }
            z11 = obj instanceof g;
            k kVar = new k(this, th, z11);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12775p;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, kVar)) {
                    z10 = true;
                    continue;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        } while (!z10);
        if (z11) {
            gVar = (g) obj;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            j(gVar, th);
        }
        if (!y()) {
            m();
        }
        p(this.f12761k);
        return true;
    }

    public final boolean C() {
        Object obj = this._state;
        if ((obj instanceof r) && ((r) obj).f12795d != null) {
            m();
            return false;
        }
        this._decision = 0;
        this._state = b.f12757i;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0020, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(Object obj, int i10, u7.l<? super Throwable, m7.n> lVar) {
        boolean z10;
        do {
            Object obj2 = this._state;
            z10 = true;
            if (obj2 instanceof e1) {
                Object E = E((e1) obj2, obj, i10, lVar, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12775p;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            z10 = false;
                            continue;
                            break;
                        }
                    }
                }
            } else {
                if (obj2 instanceof k) {
                    k kVar = (k) obj2;
                    kVar.getClass();
                    if (k.c.compareAndSet(kVar, 0, 1)) {
                        if (lVar != null) {
                            l(lVar, kVar.f12801a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        } while (!z10);
        if (!y()) {
            m();
        }
        p(i10);
    }

    public final kotlinx.coroutines.internal.r F(Object obj, Object obj2, u7.l<? super Throwable, m7.n> lVar) {
        kotlinx.coroutines.internal.r rVar;
        boolean z10;
        do {
            Object obj3 = this._state;
            boolean z11 = obj3 instanceof e1;
            rVar = a1.b.K0;
            if (z11) {
                Object E = E((e1) obj3, obj, this.f12761k, lVar, obj2);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12775p;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, E)) {
                        z10 = true;
                        continue;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        z10 = false;
                        continue;
                        break;
                    }
                }
            } else if (!(obj3 instanceof r)) {
                return null;
            } else {
                if (obj2 == null || ((r) obj3).f12795d != obj2) {
                    return null;
                }
                return rVar;
            }
        } while (!z10);
        if (!y()) {
            m();
        }
        return rVar;
    }

    @Override // ja.i
    public final kotlinx.coroutines.internal.r T(Throwable th) {
        return F(new s(th, false), null, null);
    }

    @Override // ja.d0
    public final void a(Object obj, CancellationException cancellationException) {
        boolean z10;
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof e1)) {
                if (obj2 instanceof s) {
                    return;
                }
                boolean z11 = false;
                if (obj2 instanceof r) {
                    r rVar = (r) obj2;
                    if (rVar.f12796e != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        r a10 = r.a(rVar, null, cancellationException, 15);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12775p;
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, a10)) {
                                z11 = true;
                                break;
                            } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        }
                        if (z11) {
                            g gVar = rVar.f12794b;
                            if (gVar != null) {
                                j(gVar, cancellationException);
                            }
                            u7.l<Throwable, m7.n> lVar = rVar.c;
                            if (lVar != null) {
                                l(lVar, cancellationException);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12775p;
                    r rVar2 = new r(obj2, null, null, null, cancellationException, 14);
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, rVar2)) {
                            z11 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            break;
                        }
                    }
                    if (z11) {
                        return;
                    }
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // ja.i
    public final boolean b() {
        return this._state instanceof e1;
    }

    @Override // ja.d0
    public final p7.c<T> c() {
        return this.f12776l;
    }

    @Override // ja.d0
    public final Throwable d(Object obj) {
        Throwable d5 = super.d(obj);
        if (d5 != null) {
            return d5;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ja.d0
    public final <T> T e(Object obj) {
        return obj instanceof r ? (T) ((r) obj).f12793a : obj;
    }

    @Override // p7.c
    public final CoroutineContext f() {
        return this.f12777m;
    }

    @Override // q7.b
    public final q7.b g() {
        p7.c<T> cVar = this.f12776l;
        if (cVar instanceof q7.b) {
            return (q7.b) cVar;
        }
        return null;
    }

    @Override // ja.d0
    public final Object i() {
        return this._state;
    }

    public final void j(g gVar, Throwable th) {
        try {
            gVar.a(th);
        } catch (Throwable th2) {
            m0.b.v0(this.f12777m, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(u7.l<? super Throwable, m7.n> lVar, Throwable th) {
        try {
            lVar.U(th);
        } catch (Throwable th2) {
            m0.b.v0(this.f12777m, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(u7.l<? super Throwable, m7.n> lVar, Throwable th) {
        try {
            lVar.U(th);
        } catch (Throwable th2) {
            m0.b.v0(this.f12777m, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m() {
        h0 h0Var = this.n;
        if (h0Var == null) {
            return;
        }
        h0Var.a();
        this.n = d1.f12762i;
    }

    @Override // ja.i
    public final kotlinx.coroutines.internal.r n(Object obj, Object obj2) {
        return F(obj, obj2, null);
    }

    @Override // ja.i
    public final kotlinx.coroutines.internal.r o(Object obj, LockFreeLinkedListNode.a aVar, u7.l lVar) {
        return F(obj, aVar, lVar);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        while (true) {
            int i12 = this._decision;
            boolean z13 = false;
            if (i12 != 0) {
                if (i12 == 1) {
                    z10 = false;
                } else {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (f12774o.compareAndSet(this, 0, 2)) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return;
        }
        p7.c<T> cVar = this.f12776l;
        if (i10 == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && (cVar instanceof kotlinx.coroutines.internal.f)) {
            if (i10 != 1 && i10 != 2) {
                z12 = false;
                i11 = this.f12761k;
                if (z12 == ((i11 != 1 || i11 == 2) ? true : true)) {
                    CoroutineDispatcher coroutineDispatcher = ((kotlinx.coroutines.internal.f) cVar).f15476l;
                    CoroutineContext f10 = cVar.f();
                    if (coroutineDispatcher.V(f10)) {
                        coroutineDispatcher.T(f10, this);
                        return;
                    }
                    k0 a10 = n1.a();
                    if (a10.Z()) {
                        a10.X(this);
                        return;
                    }
                    a10.Y(true);
                    try {
                        a1.b.y0(this, this.f12776l, true);
                        do {
                        } while (a10.b0());
                    } catch (Throwable th) {
                        try {
                            h(th, null);
                        } catch (Throwable th2) {
                            a10.W(true);
                            throw th2;
                        }
                    }
                    a10.W(true);
                    return;
                }
            }
            z12 = true;
            i11 = this.f12761k;
            if (z12 == ((i11 != 1 || i11 == 2) ? true : true)) {
            }
        }
        a1.b.y0(this, cVar, z11);
    }

    public Throwable q(y0 y0Var) {
        return y0Var.C();
    }

    @Override // ja.i
    public final void r() {
        p(this.f12761k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r1 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r6.n != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r0 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
        r0 = r6.f12776l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
        if ((r0 instanceof kotlinx.coroutines.internal.f) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
        r5 = (kotlinx.coroutines.internal.f) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r5 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
        r0 = r5.p(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
        if (r0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
        m();
        B(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
        return kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        if (r0 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
        r0 = r6.f12776l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
        if ((r0 instanceof kotlinx.coroutines.internal.f) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
        r5 = (kotlinx.coroutines.internal.f) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
        if (r5 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
        r0 = r5.p(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
        if (r0 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
        m();
        B(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
        r0 = r6._state;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0069, code lost:
        if ((r0 instanceof ja.s) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006b, code lost:
        r1 = r6.f12761k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006d, code lost:
        if (r1 == 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006f, code lost:
        if (r1 != 2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0072, code lost:
        if (r3 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0074, code lost:
        r1 = (ja.u0) r6.f12777m.a(ja.u0.b.f12806i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007e, code lost:
        if (r1 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0084, code lost:
        if (r1.b() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0087, code lost:
        r1 = r1.C();
        a(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008e, code lost:
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
        return e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0098, code lost:
        throw ((ja.s) r0).f12801a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s() {
        boolean z10;
        boolean y10 = y();
        while (true) {
            int i10 = this._decision;
            boolean z11 = false;
            if (i10 != 0) {
                if (i10 == 2) {
                    z10 = false;
                } else {
                    throw new IllegalStateException("Already suspended".toString());
                }
            } else if (f12774o.compareAndSet(this, 0, 1)) {
                z10 = true;
                break;
            }
        }
    }

    @Override // p7.c
    public final void t(Object obj) {
        Throwable a10 = Result.a(obj);
        if (a10 != null) {
            obj = new s(a10, false);
        }
        D(obj, this.f12761k, null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(y.b(this.f12776l));
        sb.append("){");
        Object obj = this._state;
        if (obj instanceof e1) {
            str = "Active";
        } else if (obj instanceof k) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(y.a(this));
        return sb.toString();
    }

    public final void u() {
        h0 w10 = w();
        if (w10 != null && (!(this._state instanceof e1))) {
            w10.a();
            this.n = d1.f12762i;
        }
    }

    @Override // ja.i
    public final void v(CoroutineDispatcher coroutineDispatcher, m7.n nVar) {
        kotlinx.coroutines.internal.f fVar;
        CoroutineDispatcher coroutineDispatcher2;
        int i10;
        p7.c<T> cVar = this.f12776l;
        if (cVar instanceof kotlinx.coroutines.internal.f) {
            fVar = (kotlinx.coroutines.internal.f) cVar;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            coroutineDispatcher2 = fVar.f15476l;
        } else {
            coroutineDispatcher2 = null;
        }
        if (coroutineDispatcher2 == coroutineDispatcher) {
            i10 = 4;
        } else {
            i10 = this.f12761k;
        }
        D(nVar, i10, null);
    }

    public final h0 w() {
        u0 u0Var = (u0) this.f12777m.a(u0.b.f12806i);
        if (u0Var == null) {
            return null;
        }
        h0 a10 = u0.a.a(u0Var, true, new l(this), 2);
        this.n = a10;
        return a10;
    }

    public final void x(u7.l<? super Throwable, m7.n> lVar) {
        g r0Var;
        boolean z10;
        if (lVar instanceof g) {
            r0Var = (g) lVar;
        } else {
            r0Var = new r0(lVar);
        }
        while (true) {
            Object obj = this._state;
            boolean z11 = false;
            if (obj instanceof b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12775p;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, r0Var)) {
                        z11 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (z11) {
                    return;
                }
            } else {
                Throwable th = null;
                if (!(obj instanceof g)) {
                    boolean z12 = obj instanceof s;
                    if (z12) {
                        s sVar = (s) obj;
                        sVar.getClass();
                        if (s.f12800b.compareAndSet(sVar, 0, 1)) {
                            if (obj instanceof k) {
                                if (!z12) {
                                    sVar = null;
                                }
                                if (sVar != null) {
                                    th = sVar.f12801a;
                                }
                                k(lVar, th);
                                return;
                            }
                            return;
                        }
                        z(obj, lVar);
                        throw null;
                    } else if (obj instanceof r) {
                        r rVar = (r) obj;
                        if (rVar.f12794b == null) {
                            if (r0Var instanceof c) {
                                return;
                            }
                            Throwable th2 = rVar.f12796e;
                            if (th2 != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                k(lVar, th2);
                                return;
                            }
                            r a10 = r.a(rVar, r0Var, null, 29);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12775p;
                            while (true) {
                                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, a10)) {
                                    z11 = true;
                                    break;
                                } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                                    break;
                                }
                            }
                            if (z11) {
                                return;
                            }
                        } else {
                            z(obj, lVar);
                            throw null;
                        }
                    } else if (r0Var instanceof c) {
                        return;
                    } else {
                        r rVar2 = new r(obj, r0Var, null, null, null, 28);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f12775p;
                        while (true) {
                            if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, rVar2)) {
                                z11 = true;
                                break;
                            } else if (atomicReferenceFieldUpdater3.get(this) != obj) {
                                break;
                            }
                        }
                        if (z11) {
                            return;
                        }
                    }
                } else {
                    z(obj, lVar);
                    throw null;
                }
            }
        }
    }

    public final boolean y() {
        return (this.f12761k == 2) && ((kotlinx.coroutines.internal.f) this.f12776l).k();
    }
}
