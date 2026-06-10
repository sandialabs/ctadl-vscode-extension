package kotlinx.coroutines.internal;

import ja.y;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.PropertyReference0Impl;

/* loaded from: classes.dex */
public class LockFreeLinkedListNode {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15452i = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next");

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15453j = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev");

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15454k = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* loaded from: classes.dex */
    public static abstract class a extends kotlinx.coroutines.internal.b {
        @Override // kotlinx.coroutines.internal.b
        public final void a(kotlinx.coroutines.internal.c<?> cVar, Object obj) {
            LockFreeLinkedListNode g10;
            boolean z10 = false;
            boolean z11 = obj == null;
            LockFreeLinkedListNode f10 = f();
            if (f10 == null || (g10 = g()) == null) {
                return;
            }
            n l2 = z11 ? l(g10) : g10;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f15452i;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(f10, cVar, l2)) {
                    if (atomicReferenceFieldUpdater.get(f10) != cVar) {
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10 && z11) {
                d(g10);
            }
        }

        @Override // kotlinx.coroutines.internal.b
        public final Object b(kotlinx.coroutines.internal.c<?> cVar) {
            boolean z10;
            while (true) {
                LockFreeLinkedListNode k3 = k(cVar);
                r rVar = a1.b.P0;
                if (k3 == null) {
                    return rVar;
                }
                Object obj = k3._next;
                if (obj == cVar || cVar.h()) {
                    return null;
                }
                if (obj instanceof m) {
                    m mVar = (m) obj;
                    if (cVar.b(mVar)) {
                        return rVar;
                    }
                    mVar.c(k3);
                } else {
                    Object c = c(k3);
                    if (c != null) {
                        return c;
                    }
                    if (j(obj)) {
                        continue;
                    } else {
                        c cVar2 = new c(k3, (LockFreeLinkedListNode) obj, this);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f15452i;
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(k3, obj, cVar2)) {
                                if (atomicReferenceFieldUpdater.get(k3) != obj) {
                                    z10 = false;
                                    break;
                                }
                            } else {
                                z10 = true;
                                break;
                            }
                        }
                        if (z10) {
                            try {
                                if (cVar2.c(k3) != a1.b.S0) {
                                    return null;
                                }
                            } catch (Throwable th) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode.f15452i;
                                while (!atomicReferenceFieldUpdater2.compareAndSet(k3, cVar2, obj) && atomicReferenceFieldUpdater2.get(k3) == cVar2) {
                                }
                                throw th;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }

        public abstract Object c(LockFreeLinkedListNode lockFreeLinkedListNode);

        public abstract void d(LockFreeLinkedListNode lockFreeLinkedListNode);

        public abstract void e(c cVar);

        public abstract LockFreeLinkedListNode f();

        public abstract LockFreeLinkedListNode g();

        public Object h(c cVar) {
            e(cVar);
            return null;
        }

        public void i(LockFreeLinkedListNode lockFreeLinkedListNode) {
        }

        public abstract boolean j(Object obj);

        public abstract LockFreeLinkedListNode k(m mVar);

        public abstract n l(LockFreeLinkedListNode lockFreeLinkedListNode);
    }

    /* loaded from: classes.dex */
    public static abstract class b extends kotlinx.coroutines.internal.c<LockFreeLinkedListNode> {

        /* renamed from: b  reason: collision with root package name */
        public final LockFreeLinkedListNode f15455b;
        public LockFreeLinkedListNode c;

        public b(LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.f15455b = lockFreeLinkedListNode;
        }

        @Override // kotlinx.coroutines.internal.c
        public final void d(LockFreeLinkedListNode lockFreeLinkedListNode, Object obj) {
            boolean z10;
            LockFreeLinkedListNode lockFreeLinkedListNode2;
            LockFreeLinkedListNode lockFreeLinkedListNode3 = lockFreeLinkedListNode;
            boolean z11 = false;
            if (obj == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            LockFreeLinkedListNode lockFreeLinkedListNode4 = this.f15455b;
            if (z10) {
                lockFreeLinkedListNode2 = lockFreeLinkedListNode4;
            } else {
                lockFreeLinkedListNode2 = this.c;
            }
            if (lockFreeLinkedListNode2 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f15452i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode3, this, lockFreeLinkedListNode2)) {
                        z11 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode3) != this) {
                        break;
                    }
                }
                if (z11 && z10) {
                    LockFreeLinkedListNode lockFreeLinkedListNode5 = this.c;
                    v7.g.c(lockFreeLinkedListNode5);
                    lockFreeLinkedListNode4.z(lockFreeLinkedListNode5);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends m {

        /* renamed from: a  reason: collision with root package name */
        public final LockFreeLinkedListNode f15456a;

        /* renamed from: b  reason: collision with root package name */
        public final LockFreeLinkedListNode f15457b;
        public final a c;

        public c(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2, a aVar) {
            this.f15456a = lockFreeLinkedListNode;
            this.f15457b = lockFreeLinkedListNode2;
            this.c = aVar;
        }

        @Override // kotlinx.coroutines.internal.m
        public final kotlinx.coroutines.internal.c<?> a() {
            kotlinx.coroutines.internal.c<?> cVar = this.c.f15471a;
            if (cVar != null) {
                return cVar;
            }
            v7.g.l("atomicOp");
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.LockFreeLinkedListNode$a] */
        /* JADX WARN: Type inference failed for: r3v0, types: [kotlinx.coroutines.internal.LockFreeLinkedListNode] */
        /* JADX WARN: Type inference failed for: r3v1, types: [kotlinx.coroutines.internal.n] */
        @Override // kotlinx.coroutines.internal.m
        public final Object c(Object obj) {
            Object f10;
            boolean z10;
            if (obj != null) {
                LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
                ?? r02 = this.c;
                Object h10 = r02.h(this);
                r rVar = a1.b.S0;
                ?? r3 = this.f15457b;
                if (h10 == rVar) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f15452i;
                    n K = r3.K();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode.f15452i;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(lockFreeLinkedListNode, this, K)) {
                            z10 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(lockFreeLinkedListNode) != this) {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        r02.i(lockFreeLinkedListNode);
                        r3.y();
                    }
                    return rVar;
                }
                if (h10 != null) {
                    f10 = a().e(h10);
                } else {
                    f10 = a().f();
                }
                kotlinx.coroutines.internal.c<?> cVar = r3;
                if (f10 == a1.b.O0) {
                    cVar = a();
                } else if (f10 == null) {
                    cVar = r02.l(r3);
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = LockFreeLinkedListNode.f15452i;
                while (!atomicReferenceFieldUpdater3.compareAndSet(lockFreeLinkedListNode, this, cVar) && atomicReferenceFieldUpdater3.get(lockFreeLinkedListNode) == this) {
                }
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        }

        public final void d() {
            this.c.e(this);
        }

        @Override // kotlinx.coroutines.internal.m
        public final String toString() {
            return "PrepareOp(op=" + a() + ')';
        }
    }

    /* loaded from: classes.dex */
    public static class d<T> extends a {
        public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_affectedNode");

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f15458d = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_originalNext");
        private volatile /* synthetic */ Object _affectedNode = null;
        private volatile /* synthetic */ Object _originalNext = null;

        /* renamed from: b  reason: collision with root package name */
        public final LockFreeLinkedListNode f15459b;

        public d(h hVar) {
            this.f15459b = hVar;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        public Object c(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (lockFreeLinkedListNode == this.f15459b) {
                return a1.c.I;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        public final void d(LockFreeLinkedListNode lockFreeLinkedListNode) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f15452i;
            lockFreeLinkedListNode.y();
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        public final void e(c cVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
            LockFreeLinkedListNode lockFreeLinkedListNode = cVar.f15456a;
            do {
                atomicReferenceFieldUpdater = c;
                if (atomicReferenceFieldUpdater.compareAndSet(this, null, lockFreeLinkedListNode)) {
                    break;
                }
            } while (atomicReferenceFieldUpdater.get(this) == null);
            do {
                atomicReferenceFieldUpdater2 = f15458d;
                if (atomicReferenceFieldUpdater2.compareAndSet(this, null, cVar.f15457b)) {
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == null);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        public final LockFreeLinkedListNode f() {
            return (LockFreeLinkedListNode) this._affectedNode;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        public final LockFreeLinkedListNode g() {
            return (LockFreeLinkedListNode) this._originalNext;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        public final boolean j(Object obj) {
            if (obj instanceof n) {
                ((n) obj).f15492a.G();
                return true;
            }
            return false;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        public final LockFreeLinkedListNode k(m mVar) {
            LockFreeLinkedListNode lockFreeLinkedListNode = this.f15459b;
            while (true) {
                Object obj = lockFreeLinkedListNode._next;
                if (!(obj instanceof m)) {
                    return (LockFreeLinkedListNode) obj;
                }
                m mVar2 = (m) obj;
                if (mVar.b(mVar2)) {
                    return null;
                }
                mVar2.c(this.f15459b);
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        public final n l(LockFreeLinkedListNode lockFreeLinkedListNode) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f15452i;
            return lockFreeLinkedListNode.K();
        }

        public final LockFreeLinkedListNode m() {
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) this._affectedNode;
            v7.g.c(lockFreeLinkedListNode);
            return lockFreeLinkedListNode;
        }
    }

    public final Object A() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof m)) {
                return obj;
            }
            ((m) obj).c(this);
        }
    }

    public final LockFreeLinkedListNode C() {
        n nVar;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object A = A();
        if (A instanceof n) {
            nVar = (n) A;
        } else {
            nVar = null;
        }
        if (nVar == null || (lockFreeLinkedListNode = nVar.f15492a) == null) {
            return (LockFreeLinkedListNode) A;
        }
        return lockFreeLinkedListNode;
    }

    public final LockFreeLinkedListNode F() {
        LockFreeLinkedListNode y10 = y();
        if (y10 == null) {
            y10 = (LockFreeLinkedListNode) this._prev;
            while (y10.H()) {
                y10 = (LockFreeLinkedListNode) y10._prev;
            }
        }
        return y10;
    }

    public final void G() {
        LockFreeLinkedListNode lockFreeLinkedListNode = this;
        while (true) {
            Object A = lockFreeLinkedListNode.A();
            if (!(A instanceof n)) {
                lockFreeLinkedListNode.y();
                return;
            }
            lockFreeLinkedListNode = ((n) A).f15492a;
        }
    }

    public boolean H() {
        return A() instanceof n;
    }

    public boolean I() {
        return J() == null;
    }

    public final LockFreeLinkedListNode J() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        boolean z10;
        do {
            Object A = A();
            if (!(A instanceof n)) {
                if (A != this) {
                    lockFreeLinkedListNode = (LockFreeLinkedListNode) A;
                    n K = lockFreeLinkedListNode.K();
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15452i;
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, A, K)) {
                            if (atomicReferenceFieldUpdater.get(this) != A) {
                                z10 = false;
                                continue;
                                break;
                            }
                        } else {
                            z10 = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    return (LockFreeLinkedListNode) A;
                }
            } else {
                return ((n) A).f15492a;
            }
        } while (!z10);
        lockFreeLinkedListNode.y();
        return null;
    }

    public final n K() {
        n nVar = (n) this._removedRef;
        if (nVar == null) {
            n nVar2 = new n(this);
            f15454k.lazySet(this, nVar2);
            return nVar2;
        }
        return nVar;
    }

    public final int L(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2, b bVar) {
        boolean z10;
        f15453j.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15452i;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        bVar.c = lockFreeLinkedListNode2;
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, lockFreeLinkedListNode2, bVar)) {
                if (atomicReferenceFieldUpdater.get(this) != lockFreeLinkedListNode2) {
                    z10 = false;
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return bVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1
            @Override // c8.h
            public final Object get() {
                return this.f13048j.getClass().getSimpleName();
            }
        } + '@' + y.a(this);
    }

    public final boolean x(LockFreeLinkedListNode lockFreeLinkedListNode, h hVar) {
        boolean z10;
        f15453j.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15452i;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, hVar);
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, hVar, lockFreeLinkedListNode)) {
                if (atomicReferenceFieldUpdater.get(this) != hVar) {
                    z10 = false;
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        if (z10) {
            lockFreeLinkedListNode.z(hVar);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x003e, code lost:
        r7 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f15452i;
        r4 = ((kotlinx.coroutines.internal.n) r4).f15492a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
        if (r7.compareAndSet(r3, r1, r4) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
        if (r7.get(r3) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0051, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0052, code lost:
        if (r5 != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LockFreeLinkedListNode y() {
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) this._prev;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = lockFreeLinkedListNode;
            while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = null;
                while (true) {
                    Object obj = lockFreeLinkedListNode2._next;
                    boolean z10 = true;
                    if (obj == this) {
                        if (lockFreeLinkedListNode == lockFreeLinkedListNode2) {
                            return lockFreeLinkedListNode2;
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15453j;
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, lockFreeLinkedListNode, lockFreeLinkedListNode2)) {
                                if (atomicReferenceFieldUpdater.get(this) != lockFreeLinkedListNode) {
                                    z10 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z10) {
                            return lockFreeLinkedListNode2;
                        }
                    } else if (H()) {
                        return null;
                    } else {
                        if (obj == null) {
                            return lockFreeLinkedListNode2;
                        }
                        if (obj instanceof m) {
                            ((m) obj).c(lockFreeLinkedListNode2);
                            break;
                        } else if (!(obj instanceof n)) {
                            lockFreeLinkedListNode3 = lockFreeLinkedListNode2;
                            lockFreeLinkedListNode2 = (LockFreeLinkedListNode) obj;
                        } else if (lockFreeLinkedListNode3 != null) {
                            break;
                        } else {
                            lockFreeLinkedListNode2 = (LockFreeLinkedListNode) lockFreeLinkedListNode2._prev;
                        }
                    }
                }
                lockFreeLinkedListNode2 = lockFreeLinkedListNode3;
            }
        }
    }

    public final void z(LockFreeLinkedListNode lockFreeLinkedListNode) {
        boolean z10;
        do {
            LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) lockFreeLinkedListNode._prev;
            if (A() == lockFreeLinkedListNode) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15453j;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, lockFreeLinkedListNode2, this)) {
                        if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) != lockFreeLinkedListNode2) {
                            z10 = false;
                            continue;
                            break;
                        }
                    } else {
                        z10 = true;
                        continue;
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z10);
        if (H()) {
            lockFreeLinkedListNode.y();
        }
    }
}
