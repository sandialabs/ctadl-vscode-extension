package la;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* loaded from: classes.dex */
public final class b<E> extends AbstractChannel<E> {

    /* renamed from: l  reason: collision with root package name */
    public final int f15869l;

    /* renamed from: m  reason: collision with root package name */
    public final BufferOverflow f15870m;
    public final ReentrantLock n;

    /* renamed from: o  reason: collision with root package name */
    public Object[] f15871o;

    /* renamed from: p  reason: collision with root package name */
    public int f15872p;
    private volatile /* synthetic */ int size;

    public b(int i10, BufferOverflow bufferOverflow, u7.l<? super E, m7.n> lVar) {
        super(lVar);
        this.f15869l = i10;
        this.f15870m = bufferOverflow;
        boolean z10 = true;
        if (i10 < 1) {
            z10 = false;
        }
        if (z10) {
            this.n = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i10, 8)];
            n7.i.h2(objArr, a1.c.O);
            this.f15871o = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(a4.b.i("ArrayChannel capacity must be at least 1, but ", i10, " was specified").toString());
    }

    @Override // kotlinx.coroutines.channels.a
    public final Object b(r rVar) {
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            return super.b(rVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.a
    public final String f() {
        StringBuilder sb = new StringBuilder("(buffer:capacity=");
        sb.append(this.f15869l);
        sb.append(",size=");
        return androidx.activity.e.h(sb, this.size, ')');
    }

    @Override // kotlinx.coroutines.channels.a
    public final boolean i() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.a
    public final boolean j() {
        return this.size == this.f15869l && this.f15870m == BufferOverflow.SUSPEND;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0038 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    @Override // kotlinx.coroutines.channels.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(E e10) {
        kotlinx.coroutines.internal.r rVar;
        n<E> n;
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            g<?> g10 = g();
            if (g10 != null) {
                return g10;
            }
            int i11 = this.f15869l;
            kotlinx.coroutines.internal.r rVar2 = a1.c.P;
            if (i10 < i11) {
                this.size = i10 + 1;
            } else {
                int ordinal = this.f15870m.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            rVar = rVar2;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                } else {
                    rVar = a1.c.Q;
                }
                if (rVar == null) {
                    return rVar;
                }
                if (i10 == 0) {
                    do {
                        n = n();
                        if (n != null) {
                            if (n instanceof g) {
                                this.size = i10;
                                return n;
                            }
                        }
                    } while (n.c(e10) == null);
                    this.size = i10;
                    m7.n nVar = m7.n.f16010a;
                    reentrantLock.unlock();
                    n.h(e10);
                    return n.k();
                }
                z(i10, e10);
                return rVar2;
            }
            rVar = null;
            if (rVar == null) {
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    public final boolean p(l<? super E> lVar) {
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            return super.p(lVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    public final boolean q() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    public final boolean r() {
        return this.size == 0;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    public final boolean s() {
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            return super.s();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    public final void t(boolean z10) {
        u7.l<E, m7.n> lVar = this.f15200i;
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            UndeliveredElementException undeliveredElementException = null;
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = this.f15871o[this.f15872p];
                kotlinx.coroutines.internal.r rVar = a1.c.O;
                if (lVar != null && obj != rVar) {
                    undeliveredElementException = OnUndeliveredElementKt.b(lVar, obj, undeliveredElementException);
                }
                Object[] objArr = this.f15871o;
                int i12 = this.f15872p;
                objArr[i12] = rVar;
                this.f15872p = (i12 + 1) % objArr.length;
            }
            this.size = 0;
            m7.n nVar = m7.n.f16010a;
            reentrantLock.unlock();
            super.t(z10);
            if (undeliveredElementException != null) {
                throw undeliveredElementException;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    public final Object v() {
        Object obj;
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            Object obj2 = a1.c.R;
            if (i10 == 0) {
                g<?> g10 = g();
                if (g10 != null) {
                    obj2 = g10;
                }
                return obj2;
            }
            Object[] objArr = this.f15871o;
            int i11 = this.f15872p;
            Object obj3 = objArr[i11];
            p pVar = null;
            objArr[i11] = null;
            this.size = i10 - 1;
            boolean z10 = false;
            if (i10 == this.f15869l) {
                p pVar2 = null;
                while (true) {
                    p o10 = o();
                    if (o10 == null) {
                        pVar = pVar2;
                        break;
                    } else if (o10.Q(null) != null) {
                        obj = o10.N();
                        pVar = o10;
                        z10 = true;
                        break;
                    } else {
                        o10.S();
                        pVar2 = o10;
                    }
                }
            }
            obj = obj2;
            if (obj != obj2 && !(obj instanceof g)) {
                this.size = i10;
                Object[] objArr2 = this.f15871o;
                objArr2[(this.f15872p + i10) % objArr2.length] = obj;
            }
            this.f15872p = (this.f15872p + 1) % this.f15871o.length;
            m7.n nVar = m7.n.f16010a;
            if (z10) {
                v7.g.c(pVar);
                pVar.M();
            }
            return obj3;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0095 A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #0 {all -> 0x00bc, blocks: (B:3:0x0005, B:6:0x000b, B:12:0x0017, B:14:0x0029, B:16:0x0036, B:33:0x007f, B:35:0x0083, B:41:0x00a3, B:36:0x008f, B:38:0x0095, B:18:0x0045, B:20:0x0049, B:22:0x004d, B:25:0x0059, B:29:0x0060, B:30:0x007a), top: B:49:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(kotlinx.coroutines.selects.c<?> cVar) {
        boolean z10;
        Object obj;
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            Object obj2 = a1.c.R;
            if (i10 == 0) {
                g<?> g10 = g();
                if (g10 != null) {
                    obj2 = g10;
                }
                return obj2;
            }
            Object[] objArr = this.f15871o;
            int i11 = this.f15872p;
            Object obj3 = objArr[i11];
            LockFreeLinkedListNode lockFreeLinkedListNode = null;
            objArr[i11] = null;
            this.size = i10 - 1;
            if (i10 == this.f15869l) {
                while (true) {
                    AbstractChannel.g gVar = new AbstractChannel.g(this.f15201j);
                    obj = cVar.d(gVar);
                    if (obj == null) {
                        LockFreeLinkedListNode m10 = gVar.m();
                        obj = ((p) m10).N();
                        lockFreeLinkedListNode = m10;
                        break;
                    } else if (obj == obj2) {
                        break;
                    } else if (obj != a1.b.P0) {
                        if (obj == kotlinx.coroutines.selects.d.f15552b) {
                            this.size = i10;
                            this.f15871o[this.f15872p] = obj3;
                            return obj;
                        } else if (obj instanceof g) {
                            lockFreeLinkedListNode = obj;
                        } else {
                            throw new IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + obj).toString());
                        }
                    }
                }
                z10 = true;
                if (obj == obj2 && !(obj instanceof g)) {
                    this.size = i10;
                    Object[] objArr2 = this.f15871o;
                    objArr2[(this.f15872p + i10) % objArr2.length] = obj;
                } else if (!cVar.m()) {
                    this.size = i10;
                    this.f15871o[this.f15872p] = obj3;
                    return kotlinx.coroutines.selects.d.f15552b;
                }
                this.f15872p = (this.f15872p + 1) % this.f15871o.length;
                m7.n nVar = m7.n.f16010a;
                if (z10) {
                    v7.g.c(lockFreeLinkedListNode);
                    lockFreeLinkedListNode.M();
                }
                return obj3;
            }
            z10 = false;
            obj = obj2;
            if (obj == obj2) {
            }
            if (!cVar.m()) {
            }
            this.f15872p = (this.f15872p + 1) % this.f15871o.length;
            m7.n nVar2 = m7.n.f16010a;
            if (z10) {
            }
            return obj3;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void z(int i10, E e10) {
        int i11 = this.f15869l;
        if (i10 < i11) {
            Object[] objArr = this.f15871o;
            if (i10 >= objArr.length) {
                int min = Math.min(objArr.length * 2, i11);
                Object[] objArr2 = new Object[min];
                for (int i12 = 0; i12 < i10; i12++) {
                    Object[] objArr3 = this.f15871o;
                    objArr2[i12] = objArr3[(this.f15872p + i12) % objArr3.length];
                }
                Arrays.fill(objArr2, i10, min, a1.c.O);
                this.f15871o = objArr2;
                this.f15872p = 0;
            }
            Object[] objArr4 = this.f15871o;
            objArr4[(this.f15872p + i10) % objArr4.length] = e10;
            return;
        }
        Object[] objArr5 = this.f15871o;
        int i13 = this.f15872p;
        objArr5[i13 % objArr5.length] = null;
        objArr5[(i10 + i13) % objArr5.length] = e10;
        this.f15872p = (i13 + 1) % objArr5.length;
    }
}
