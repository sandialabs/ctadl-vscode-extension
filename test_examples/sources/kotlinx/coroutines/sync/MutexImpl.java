package kotlinx.coroutines.sync;

import ja.h0;
import ja.i;
import ja.j;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.h;
import kotlinx.coroutines.internal.m;
import m7.n;

/* loaded from: classes.dex */
public final class MutexImpl implements kotlinx.coroutines.sync.b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15556a = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    /* loaded from: classes.dex */
    public final class LockCont extends a {
        public final i<n> n;

        public LockCont(Object obj, j jVar) {
            super(obj);
            this.n = jVar;
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.a
        public final void M() {
            this.n.r();
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.a
        public final boolean N() {
            if (!a.f15560m.compareAndSet(this, 0, 1)) {
                return false;
            }
            if (this.n.o(n.f16010a, null, new MutexImpl$LockCont$tryResumeLockWaiter$1(MutexImpl.this, this)) == null) {
                return false;
            }
            return true;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public final String toString() {
            return "LockCont[" + this.f15561l + ", " + this.n + "] for " + MutexImpl.this;
        }
    }

    /* loaded from: classes.dex */
    public abstract class a extends LockFreeLinkedListNode implements h0 {

        /* renamed from: m  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f15560m = AtomicIntegerFieldUpdater.newUpdater(a.class, "isTaken");
        private volatile /* synthetic */ int isTaken = 0;

        /* renamed from: l  reason: collision with root package name */
        public final Object f15561l;

        public a(Object obj) {
            this.f15561l = obj;
        }

        public abstract void M();

        public abstract boolean N();

        @Override // ja.h0
        public final void a() {
            I();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends h {
        public volatile Object owner;

        public b(Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public final String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends kotlinx.coroutines.internal.c<MutexImpl> {

        /* renamed from: b  reason: collision with root package name */
        public final b f15562b;

        public c(b bVar) {
            this.f15562b = bVar;
        }

        @Override // kotlinx.coroutines.internal.c
        public final void d(MutexImpl mutexImpl, Object obj) {
            Object obj2;
            MutexImpl mutexImpl2 = mutexImpl;
            if (obj == null) {
                obj2 = a1.b.X0;
            } else {
                obj2 = this.f15562b;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MutexImpl.f15556a;
            while (!atomicReferenceFieldUpdater.compareAndSet(mutexImpl2, this, obj2) && atomicReferenceFieldUpdater.get(mutexImpl2) == this) {
            }
        }

        @Override // kotlinx.coroutines.internal.c
        public final Object i(MutexImpl mutexImpl) {
            boolean z10;
            MutexImpl mutexImpl2 = mutexImpl;
            b bVar = this.f15562b;
            if (bVar.A() == bVar) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return null;
            }
            return a1.b.T0;
        }
    }

    public MutexImpl(boolean z10) {
        this._state = z10 ? a1.b.W0 : a1.b.X0;
    }

    @Override // kotlinx.coroutines.sync.b
    public final void a(Object obj) {
        boolean z10;
        boolean z11;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        boolean z12;
        while (true) {
            Object obj2 = this._state;
            boolean z13 = true;
            if (obj2 instanceof kotlinx.coroutines.sync.a) {
                kotlinx.coroutines.sync.a aVar = (kotlinx.coroutines.sync.a) obj2;
                if (obj == null) {
                    if (aVar.f15565a != a1.b.V0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    if (aVar.f15565a == obj) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new IllegalStateException(("Mutex is locked by " + aVar.f15565a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15556a;
                kotlinx.coroutines.sync.a aVar2 = a1.b.X0;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            z13 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z13) {
                    return;
                }
            } else if (obj2 instanceof m) {
                ((m) obj2).c(this);
            } else if (obj2 instanceof b) {
                if (obj != null) {
                    b bVar = (b) obj2;
                    if (bVar.owner == obj) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalStateException(("Mutex is locked by " + bVar.owner + " but expected " + obj).toString());
                    }
                }
                b bVar2 = (b) obj2;
                while (true) {
                    lockFreeLinkedListNode = (LockFreeLinkedListNode) bVar2.A();
                    if (lockFreeLinkedListNode == bVar2) {
                        lockFreeLinkedListNode = null;
                        break;
                    } else if (lockFreeLinkedListNode.I()) {
                        break;
                    } else {
                        ((kotlinx.coroutines.internal.n) lockFreeLinkedListNode.A()).f15492a.G();
                    }
                }
                if (lockFreeLinkedListNode == null) {
                    c cVar = new c(bVar2);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f15556a;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, cVar)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                z13 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z13 && cVar.c(this) == null) {
                        return;
                    }
                } else {
                    a aVar3 = (a) lockFreeLinkedListNode;
                    if (aVar3.N()) {
                        Object obj3 = aVar3.f15561l;
                        if (obj3 == null) {
                            obj3 = a1.b.U0;
                        }
                        bVar2.owner = obj3;
                        aVar3.M();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0094, code lost:
        r9.x(new ja.g1(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009c, code lost:
        r8 = r9.s();
        r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
        if (r8 != r9) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        r8 = m7.n.f16010a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
        if (r8 != r9) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a9, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ac, code lost:
        return m7.n.f16010a;
     */
    @Override // kotlinx.coroutines.sync.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, p7.c<? super n> cVar) {
        kotlinx.coroutines.sync.a aVar;
        boolean z10;
        if (c(obj)) {
            return n.f16010a;
        }
        j s02 = m0.b.s0(m0.b.y0(cVar));
        LockCont lockCont = new LockCont(obj, s02);
        while (true) {
            Object obj2 = this._state;
            boolean z11 = false;
            if (obj2 instanceof kotlinx.coroutines.sync.a) {
                kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) obj2;
                if (aVar2.f15565a != a1.b.V0) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15556a;
                    b bVar = new b(aVar2.f15565a);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, bVar) && atomicReferenceFieldUpdater.get(this) == obj2) {
                    }
                } else {
                    if (obj == null) {
                        aVar = a1.b.W0;
                    } else {
                        aVar = new kotlinx.coroutines.sync.a(obj);
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f15556a;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, aVar)) {
                            z11 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            break;
                        }
                    }
                    if (z11) {
                        s02.D(n.f16010a, s02.f12761k, new MutexImpl$lockSuspend$2$1$1(this, obj));
                        break;
                    }
                }
            } else if (obj2 instanceof b) {
                b bVar2 = (b) obj2;
                if (bVar2.owner != obj) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    do {
                    } while (!bVar2.F().x(lockCont, bVar2));
                    if (this._state == obj2 || !a.f15560m.compareAndSet(lockCont, 0, 1)) {
                        break;
                    }
                    lockCont = new LockCont(obj, s02);
                } else {
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
            } else if (obj2 instanceof m) {
                ((m) obj2).c(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    public final boolean c(Object obj) {
        while (true) {
            Object obj2 = this._state;
            boolean z10 = true;
            boolean z11 = false;
            if (obj2 instanceof kotlinx.coroutines.sync.a) {
                if (((kotlinx.coroutines.sync.a) obj2).f15565a != a1.b.V0) {
                    return false;
                }
                kotlinx.coroutines.sync.a aVar = obj == null ? a1.b.W0 : new kotlinx.coroutines.sync.a(obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15556a;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    } else {
                        z11 = true;
                        break;
                    }
                }
                if (z11) {
                    return true;
                }
            } else if (obj2 instanceof b) {
                if (((b) obj2).owner == obj) {
                    z10 = false;
                }
                if (z10) {
                    return false;
                }
                throw new IllegalStateException(("Already locked by " + obj).toString());
            } else if (!(obj2 instanceof m)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                ((m) obj2).c(this);
            }
        }
    }

    public final String toString() {
        StringBuilder sb;
        Object obj;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.a) {
                sb = new StringBuilder("Mutex[");
                obj = ((kotlinx.coroutines.sync.a) obj2).f15565a;
                break;
            } else if (obj2 instanceof m) {
                ((m) obj2).c(this);
            } else if (!(obj2 instanceof b)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                sb = new StringBuilder("Mutex[");
                obj = ((b) obj2).owner;
            }
        }
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
