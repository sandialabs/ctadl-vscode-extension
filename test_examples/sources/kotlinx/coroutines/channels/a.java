package kotlinx.coroutines.channels;

import a1.b;
import a1.c;
import ja.g1;
import ja.j;
import ja.y;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.h;
import kotlinx.coroutines.internal.r;
import la.f;
import la.g;
import la.p;
import la.q;
import la.s;
import m7.n;
import u7.l;

/* loaded from: classes.dex */
public abstract class a<E> implements q<E> {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15199k = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "onCloseHandler");

    /* renamed from: i  reason: collision with root package name */
    public final l<E, n> f15200i;

    /* renamed from: j  reason: collision with root package name */
    public final h f15201j = new h();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* renamed from: kotlinx.coroutines.channels.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0172a<E> extends p {

        /* renamed from: l  reason: collision with root package name */
        public final E f15202l;

        public C0172a(E e10) {
            this.f15202l = e10;
        }

        @Override // la.p
        public final void M() {
        }

        @Override // la.p
        public final Object N() {
            return this.f15202l;
        }

        @Override // la.p
        public final void P(g<?> gVar) {
        }

        @Override // la.p
        public final r Q(LockFreeLinkedListNode.c cVar) {
            r rVar = b.K0;
            if (cVar != null) {
                cVar.d();
            }
            return rVar;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public final String toString() {
            return "SendBuffered@" + y.a(this) + '(' + this.f15202l + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(l<? super E, n> lVar) {
        this.f15200i = lVar;
    }

    public static final void a(a aVar, j jVar, Object obj, g gVar) {
        Result.Failure Q;
        UndeliveredElementException b5;
        aVar.getClass();
        h(gVar);
        Throwable th = gVar.f15880l;
        if (th == null) {
            th = new ClosedSendChannelException("Channel was closed");
        }
        l<E, n> lVar = aVar.f15200i;
        if (lVar != null && (b5 = OnUndeliveredElementKt.b(lVar, obj, null)) != null) {
            c.M(b5, th);
            Q = m0.b.Q(b5);
        } else {
            Q = m0.b.Q(th);
        }
        jVar.t(Q);
    }

    public static void h(g gVar) {
        la.l lVar;
        Object obj = null;
        while (true) {
            LockFreeLinkedListNode F = gVar.F();
            if (F instanceof la.l) {
                lVar = (la.l) F;
            } else {
                lVar = null;
            }
            if (lVar == null) {
                break;
            } else if (!lVar.I()) {
                ((kotlinx.coroutines.internal.n) lVar.A()).f15492a.G();
            } else {
                obj = c.j1(obj, lVar);
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((la.l) obj).N(gVar);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                ((la.l) arrayList.get(size)).N(gVar);
            }
        }
    }

    @Override // la.q
    public final Object F(E e10) {
        f.a aVar;
        Object m10 = m(e10);
        if (m10 == c.P) {
            return n.f16010a;
        }
        if (m10 == c.Q) {
            g<?> g10 = g();
            if (g10 == null) {
                return f.f15877b;
            }
            h(g10);
            Throwable th = g10.f15880l;
            if (th == null) {
                th = new ClosedSendChannelException("Channel was closed");
            }
            aVar = new f.a(th);
        } else if (m10 instanceof g) {
            g gVar = (g) m10;
            h(gVar);
            Throwable th2 = gVar.f15880l;
            if (th2 == null) {
                th2 = new ClosedSendChannelException("Channel was closed");
            }
            aVar = new f.a(th2);
        } else {
            throw new IllegalStateException(("trySend returned " + m10).toString());
        }
        return aVar;
    }

    @Override // la.q
    public final boolean K() {
        return g() != null;
    }

    public Object b(la.r rVar) {
        boolean z10;
        LockFreeLinkedListNode F;
        boolean i10 = i();
        h hVar = this.f15201j;
        if (i10) {
            do {
                F = hVar.F();
                if (F instanceof la.n) {
                    return F;
                }
            } while (!F.x(rVar, hVar));
            return null;
        }
        la.a aVar = new la.a(rVar, this);
        while (true) {
            LockFreeLinkedListNode F2 = hVar.F();
            if (!(F2 instanceof la.n)) {
                int L = F2.L(rVar, hVar, aVar);
                z10 = true;
                if (L != 1) {
                    if (L == 2) {
                        z10 = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return F2;
            }
        }
        if (z10) {
            return null;
        }
        return c.S;
    }

    @Override // la.q
    public final boolean d(Throwable th) {
        boolean z10;
        boolean z11;
        Object obj;
        r rVar;
        g gVar = new g(th);
        h hVar = this.f15201j;
        while (true) {
            LockFreeLinkedListNode F = hVar.F();
            z10 = false;
            if (!(!(F instanceof g))) {
                z11 = false;
                break;
            } else if (F.x(gVar, hVar)) {
                z11 = true;
                break;
            }
        }
        if (!z11) {
            gVar = (g) this.f15201j.F();
        }
        h(gVar);
        if (z11 && (obj = this.onCloseHandler) != null && obj != (rVar = c.T)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15199k;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, rVar)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (z10) {
                v7.l.d(1, obj);
                ((l) obj).U(th);
            }
        }
        return z11;
    }

    @Override // la.q
    public final Object e(E e10, p7.c<? super n> cVar) {
        boolean z10;
        la.r sVar;
        Object m10 = m(e10);
        r rVar = c.P;
        if (m10 == rVar) {
            return n.f16010a;
        }
        j s02 = m0.b.s0(m0.b.y0(cVar));
        while (true) {
            if (!(this.f15201j.C() instanceof la.n) && j()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                l<E, n> lVar = this.f15200i;
                if (lVar == null) {
                    sVar = new la.r(e10, s02);
                } else {
                    sVar = new s(e10, s02, lVar);
                }
                Object b5 = b(sVar);
                if (b5 == null) {
                    s02.x(new g1(sVar));
                    break;
                } else if (b5 instanceof g) {
                    a(this, s02, e10, (g) b5);
                    break;
                } else if (b5 != c.S && !(b5 instanceof la.l)) {
                    throw new IllegalStateException(("enqueueSend returned " + b5).toString());
                }
            }
            Object m11 = m(e10);
            if (m11 == rVar) {
                s02.t(n.f16010a);
                break;
            } else if (m11 != c.Q) {
                if (m11 instanceof g) {
                    a(this, s02, e10, (g) m11);
                } else {
                    throw new IllegalStateException(("offerInternal returned " + m11).toString());
                }
            }
        }
        Object s10 = s02.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (s10 != coroutineSingletons) {
            s10 = n.f16010a;
        }
        if (s10 == coroutineSingletons) {
            return s10;
        }
        return n.f16010a;
    }

    public String f() {
        return "";
    }

    public final g<?> g() {
        LockFreeLinkedListNode F = this.f15201j.F();
        g<?> gVar = F instanceof g ? (g) F : null;
        if (gVar != null) {
            h(gVar);
            return gVar;
        }
        return null;
    }

    public abstract boolean i();

    public abstract boolean j();

    @Override // la.q
    public final void l(l<? super Throwable, n> lVar) {
        boolean z10;
        boolean z11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15199k;
        while (true) {
            z10 = true;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, null, lVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    z11 = false;
                    break;
                }
            } else {
                z11 = true;
                break;
            }
        }
        r rVar = c.T;
        if (!z11) {
            Object obj = this.onCloseHandler;
            if (obj == rVar) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException("Another handler was already registered: " + obj);
        }
        g<?> g10 = g();
        if (g10 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f15199k;
            while (true) {
                if (!atomicReferenceFieldUpdater2.compareAndSet(this, lVar, rVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != lVar) {
                        z10 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z10) {
                ((ProduceKt$awaitClose$4$1) lVar).U(g10.f15880l);
            }
        }
    }

    public Object m(E e10) {
        la.n<E> n;
        do {
            n = n();
            if (n == null) {
                return c.Q;
            }
        } while (n.c(e10) == null);
        n.h(e10);
        return n.k();
    }

    public la.n<E> n() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        LockFreeLinkedListNode J;
        h hVar = this.f15201j;
        while (true) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) hVar.A();
            if (lockFreeLinkedListNode == hVar || !(lockFreeLinkedListNode instanceof la.n)) {
                break;
            } else if (((((la.n) lockFreeLinkedListNode) instanceof g) && !lockFreeLinkedListNode.H()) || (J = lockFreeLinkedListNode.J()) == null) {
                break;
            } else {
                J.G();
            }
        }
        lockFreeLinkedListNode = null;
        return (la.n) lockFreeLinkedListNode;
    }

    public final p o() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        LockFreeLinkedListNode J;
        h hVar = this.f15201j;
        while (true) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) hVar.A();
            if (lockFreeLinkedListNode == hVar || !(lockFreeLinkedListNode instanceof p)) {
                break;
            } else if (((((p) lockFreeLinkedListNode) instanceof g) && !lockFreeLinkedListNode.H()) || (J = lockFreeLinkedListNode.J()) == null) {
                break;
            } else {
                J.G();
            }
        }
        lockFreeLinkedListNode = null;
        return (p) lockFreeLinkedListNode;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(y.a(this));
        sb.append('{');
        LockFreeLinkedListNode lockFreeLinkedListNode = this.f15201j;
        LockFreeLinkedListNode C = lockFreeLinkedListNode.C();
        if (C == lockFreeLinkedListNode) {
            str2 = "EmptyQueue";
        } else {
            if (C instanceof g) {
                str = C.toString();
            } else if (C instanceof la.l) {
                str = "ReceiveQueued";
            } else if (C instanceof p) {
                str = "SendQueued";
            } else {
                str = "UNEXPECTED:" + C;
            }
            LockFreeLinkedListNode F = lockFreeLinkedListNode.F();
            if (F != C) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(",queueSize=");
                int i10 = 0;
                for (LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) lockFreeLinkedListNode.A(); !v7.g.a(lockFreeLinkedListNode2, lockFreeLinkedListNode); lockFreeLinkedListNode2 = lockFreeLinkedListNode2.C()) {
                    if (lockFreeLinkedListNode2 instanceof LockFreeLinkedListNode) {
                        i10++;
                    }
                }
                sb2.append(i10);
                str2 = sb2.toString();
                if (F instanceof g) {
                    str2 = str2 + ",closedForSend=" + F;
                }
            } else {
                str2 = str;
            }
        }
        sb.append(str2);
        sb.append('}');
        sb.append(f());
        return sb.toString();
    }
}
