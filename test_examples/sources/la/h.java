package la;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* loaded from: classes.dex */
public final class h<E> extends AbstractChannel<E> {

    /* renamed from: l  reason: collision with root package name */
    public final ReentrantLock f15881l;

    /* renamed from: m  reason: collision with root package name */
    public Object f15882m;

    public h(u7.l<? super E, m7.n> lVar) {
        super(lVar);
        this.f15881l = new ReentrantLock();
        this.f15882m = a1.c.O;
    }

    @Override // kotlinx.coroutines.channels.a
    public final String f() {
        ReentrantLock reentrantLock = this.f15881l;
        reentrantLock.lock();
        try {
            return "(value=" + this.f15882m + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.a
    public final boolean i() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.a
    public final boolean j() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.a
    public final Object m(E e10) {
        u7.l<E, m7.n> lVar;
        n<E> n;
        ReentrantLock reentrantLock = this.f15881l;
        reentrantLock.lock();
        try {
            g<?> g10 = g();
            if (g10 != null) {
                return g10;
            }
            Object obj = this.f15882m;
            kotlinx.coroutines.internal.r rVar = a1.c.O;
            if (obj == rVar) {
                do {
                    n = n();
                    if (n != null) {
                        if (n instanceof g) {
                            return n;
                        }
                    }
                } while (n.c(e10) == null);
                m7.n nVar = m7.n.f16010a;
                reentrantLock.unlock();
                n.h(e10);
                return n.k();
            }
            Object obj2 = this.f15882m;
            UndeliveredElementException undeliveredElementException = null;
            if (obj2 != rVar && (lVar = this.f15200i) != null) {
                undeliveredElementException = OnUndeliveredElementKt.b(lVar, obj2, null);
            }
            this.f15882m = e10;
            if (undeliveredElementException == null) {
                return a1.c.P;
            }
            throw undeliveredElementException;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    public final boolean p(l<? super E> lVar) {
        ReentrantLock reentrantLock = this.f15881l;
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
        ReentrantLock reentrantLock = this.f15881l;
        reentrantLock.lock();
        try {
            return this.f15882m == a1.c.O;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    public final void t(boolean z10) {
        u7.l<E, m7.n> lVar;
        ReentrantLock reentrantLock = this.f15881l;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.internal.r rVar = a1.c.O;
            Object obj = this.f15882m;
            UndeliveredElementException undeliveredElementException = null;
            if (obj != rVar && (lVar = this.f15200i) != null) {
                undeliveredElementException = OnUndeliveredElementKt.b(lVar, obj, null);
            }
            this.f15882m = rVar;
            m7.n nVar = m7.n.f16010a;
            reentrantLock.unlock();
            super.t(z10);
            if (undeliveredElementException == null) {
                return;
            }
            throw undeliveredElementException;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    public final Object v() {
        ReentrantLock reentrantLock = this.f15881l;
        reentrantLock.lock();
        try {
            Object obj = this.f15882m;
            kotlinx.coroutines.internal.r rVar = a1.c.O;
            if (obj != rVar) {
                this.f15882m = rVar;
                m7.n nVar = m7.n.f16010a;
                return obj;
            }
            Object g10 = g();
            if (g10 == null) {
                g10 = a1.c.R;
            }
            return g10;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    public final Object w(kotlinx.coroutines.selects.c<?> cVar) {
        ReentrantLock reentrantLock = this.f15881l;
        reentrantLock.lock();
        try {
            Object obj = this.f15882m;
            kotlinx.coroutines.internal.r rVar = a1.c.O;
            if (obj == rVar) {
                Object g10 = g();
                if (g10 == null) {
                    g10 = a1.c.R;
                }
                return g10;
            } else if (cVar.m()) {
                Object obj2 = this.f15882m;
                this.f15882m = rVar;
                m7.n nVar = m7.n.f16010a;
                return obj2;
            } else {
                return kotlinx.coroutines.selects.d.f15552b;
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
