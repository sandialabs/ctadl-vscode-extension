package kotlinx.coroutines;

import ja.b0;
import ja.d0;
import ja.f;
import ja.h0;
import ja.i;
import ja.j;
import ja.k0;
import ja.l0;
import ja.n1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.r;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.internal.u;
import m7.n;
import v7.g;

/* loaded from: classes.dex */
public abstract class c extends l0 implements b0 {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15169o = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_queue");

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15170p = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* loaded from: classes.dex */
    public final class a extends AbstractRunnableC0171c {

        /* renamed from: k  reason: collision with root package name */
        public final i<n> f15171k;

        public a(long j2, j jVar) {
            super(j2);
            this.f15171k = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f15171k.v(c.this, n.f16010a);
        }

        @Override // kotlinx.coroutines.c.AbstractRunnableC0171c
        public final String toString() {
            return super.toString() + this.f15171k;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends AbstractRunnableC0171c {

        /* renamed from: k  reason: collision with root package name */
        public final Runnable f15173k;

        public b(Runnable runnable, long j2) {
            super(j2);
            this.f15173k = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f15173k.run();
        }

        @Override // kotlinx.coroutines.c.AbstractRunnableC0171c
        public final String toString() {
            return super.toString() + this.f15173k;
        }
    }

    /* renamed from: kotlinx.coroutines.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractRunnableC0171c implements Runnable, Comparable<AbstractRunnableC0171c>, h0, u {
        private volatile Object _heap;

        /* renamed from: i  reason: collision with root package name */
        public long f15174i;

        /* renamed from: j  reason: collision with root package name */
        public int f15175j = -1;

        public AbstractRunnableC0171c(long j2) {
            this.f15174i = j2;
        }

        @Override // ja.h0
        public final synchronized void a() {
            Object obj = this._heap;
            r rVar = a1.b.L0;
            if (obj == rVar) {
                return;
            }
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                dVar.d(this);
            }
            this._heap = rVar;
        }

        @Override // kotlinx.coroutines.internal.u
        public final t<?> b() {
            Object obj = this._heap;
            if (obj instanceof t) {
                return (t) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(AbstractRunnableC0171c abstractRunnableC0171c) {
            int i10 = ((this.f15174i - abstractRunnableC0171c.f15174i) > 0L ? 1 : ((this.f15174i - abstractRunnableC0171c.f15174i) == 0L ? 0 : -1));
            if (i10 > 0) {
                return 1;
            }
            if (i10 < 0) {
                return -1;
            }
            return 0;
        }

        @Override // kotlinx.coroutines.internal.u
        public final int getIndex() {
            return this.f15175j;
        }

        @Override // kotlinx.coroutines.internal.u
        public final void i(d dVar) {
            if (!(this._heap != a1.b.L0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0037, code lost:
            if ((r9 - r11.f15176b) > 0) goto L20;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [T extends kotlinx.coroutines.internal.u & java.lang.Comparable<? super T>[]] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final synchronized int j(long j2, d dVar, c cVar) {
            AbstractRunnableC0171c abstractRunnableC0171c;
            if (this._heap == a1.b.L0) {
                return 2;
            }
            synchronized (dVar) {
                ?? r02 = dVar.f15497a;
                if (r02 != 0) {
                    abstractRunnableC0171c = r02[0];
                } else {
                    abstractRunnableC0171c = null;
                }
                AbstractRunnableC0171c abstractRunnableC0171c2 = abstractRunnableC0171c;
                if (c.e0(cVar)) {
                    return 1;
                }
                if (abstractRunnableC0171c2 != null) {
                    long j10 = abstractRunnableC0171c2.f15174i;
                    if (j10 - j2 < 0) {
                        j2 = j10;
                    }
                }
                dVar.f15176b = j2;
                long j11 = this.f15174i;
                long j12 = dVar.f15176b;
                if (j11 - j12 < 0) {
                    this.f15174i = j12;
                }
                dVar.a(this);
                return 0;
            }
        }

        @Override // kotlinx.coroutines.internal.u
        public final void setIndex(int i10) {
            this.f15175j = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f15174i + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends t<AbstractRunnableC0171c> {

        /* renamed from: b  reason: collision with root package name */
        public long f15176b;

        public d(long j2) {
            this.f15176b = j2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public static final boolean e0(c cVar) {
        return cVar._isCompleted;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void T(CoroutineContext coroutineContext, Runnable runnable) {
        f0(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b9  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlinx.coroutines.c, ja.k0] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v3, types: [T extends kotlinx.coroutines.internal.u & java.lang.Comparable<? super T>[]] */
    @Override // ja.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a0() {
        long j2;
        AbstractRunnableC0171c c;
        boolean z10;
        AbstractRunnableC0171c abstractRunnableC0171c;
        boolean z11;
        boolean z12;
        AbstractRunnableC0171c abstractRunnableC0171c2;
        if (b0()) {
            return 0L;
        }
        d dVar = (d) this._delayed;
        Runnable runnable = null;
        boolean z13 = true;
        if (dVar != null && !dVar.b()) {
            long nanoTime = System.nanoTime();
            do {
                synchronized (dVar) {
                    ?? r82 = dVar.f15497a;
                    if (r82 != 0) {
                        abstractRunnableC0171c = r82[0];
                    } else {
                        abstractRunnableC0171c = null;
                    }
                    if (abstractRunnableC0171c == null) {
                        abstractRunnableC0171c2 = null;
                    } else {
                        AbstractRunnableC0171c abstractRunnableC0171c3 = abstractRunnableC0171c;
                        if (nanoTime - abstractRunnableC0171c3.f15174i >= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            z12 = g0(abstractRunnableC0171c3);
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            abstractRunnableC0171c2 = dVar.e(0);
                        } else {
                            abstractRunnableC0171c2 = null;
                        }
                    }
                }
            } while (abstractRunnableC0171c2 != null);
        }
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                break;
            } else if (obj instanceof kotlinx.coroutines.internal.j) {
                kotlinx.coroutines.internal.j jVar = (kotlinx.coroutines.internal.j) obj;
                Object f10 = jVar.f();
                if (f10 != kotlinx.coroutines.internal.j.f15486g) {
                    runnable = (Runnable) f10;
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15169o;
                kotlinx.coroutines.internal.j e10 = jVar.e();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e10) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (obj == a1.b.M0) {
                break;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f15169o;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    runnable = (Runnable) obj;
                    break;
                }
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        kotlinx.coroutines.internal.a<d0<?>> aVar = this.f12782m;
        if (aVar != null) {
            if (aVar.f15470b != aVar.c) {
                z13 = false;
            }
            if (!z13) {
                j2 = 0;
                if (j2 != 0) {
                    return 0L;
                }
                Object obj2 = this._queue;
                if (obj2 != null) {
                    if (obj2 instanceof kotlinx.coroutines.internal.j) {
                        if (!((kotlinx.coroutines.internal.j) obj2).d()) {
                            return 0L;
                        }
                    } else if (obj2 != a1.b.M0) {
                        return 0L;
                    } else {
                        return Long.MAX_VALUE;
                    }
                }
                d dVar2 = (d) this._delayed;
                if (dVar2 != null && (c = dVar2.c()) != null) {
                    long nanoTime2 = c.f15174i - System.nanoTime();
                    if (nanoTime2 < 0) {
                        return 0L;
                    }
                    return nanoTime2;
                }
                return Long.MAX_VALUE;
            }
        }
        j2 = Long.MAX_VALUE;
        if (j2 != 0) {
        }
    }

    public void f0(Runnable runnable) {
        if (g0(runnable)) {
            Thread c0 = c0();
            if (Thread.currentThread() != c0) {
                LockSupport.unpark(c0);
                return;
            }
            return;
        }
        kotlinx.coroutines.b.f15167q.f0(runnable);
    }

    public final boolean g0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            boolean z10 = false;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15169o;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.j) {
                kotlinx.coroutines.internal.j jVar = (kotlinx.coroutines.internal.j) obj;
                int a10 = jVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 != 1) {
                    if (a10 == 2) {
                        return false;
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f15169o;
                    kotlinx.coroutines.internal.j e10 = jVar.e();
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, e10) && atomicReferenceFieldUpdater2.get(this) == obj) {
                    }
                }
            } else if (obj == a1.b.M0) {
                return false;
            } else {
                kotlinx.coroutines.internal.j jVar2 = new kotlinx.coroutines.internal.j(8, true);
                jVar2.a((Runnable) obj);
                jVar2.a(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f15169o;
                while (true) {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, jVar2)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater3.get(this) != obj) {
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h0() {
        boolean z10;
        kotlinx.coroutines.internal.a<d0<?>> aVar = this.f12782m;
        if (aVar != null && aVar.f15470b != aVar.c) {
            z10 = false;
            if (z10) {
                return false;
            }
            d dVar = (d) this._delayed;
            if (dVar != null && !dVar.b()) {
                return false;
            }
            Object obj = this._queue;
            if (obj != null) {
                if (obj instanceof kotlinx.coroutines.internal.j) {
                    return ((kotlinx.coroutines.internal.j) obj).d();
                }
                if (obj != a1.b.M0) {
                    return false;
                }
            }
            return true;
        }
        z10 = true;
        if (z10) {
        }
    }

    public final void i0() {
        this._queue = null;
        this._delayed = null;
    }

    public h0 j(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return b0.a.a(j2, runnable, coroutineContext);
    }

    public final void j0(long j2, AbstractRunnableC0171c abstractRunnableC0171c) {
        int j10;
        Thread c0;
        AbstractRunnableC0171c abstractRunnableC0171c2 = null;
        boolean z10 = true;
        if (this._isCompleted != 0) {
            j10 = 1;
        } else {
            d dVar = (d) this._delayed;
            if (dVar == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15170p;
                d dVar2 = new d(j2);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, dVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = this._delayed;
                g.c(obj);
                dVar = (d) obj;
            }
            j10 = abstractRunnableC0171c.j(j2, dVar, this);
        }
        if (j10 != 0) {
            if (j10 != 1) {
                if (j10 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
            d0(j2, abstractRunnableC0171c);
            return;
        }
        d dVar3 = (d) this._delayed;
        if (dVar3 != null) {
            abstractRunnableC0171c2 = dVar3.c();
        }
        if (abstractRunnableC0171c2 != abstractRunnableC0171c) {
            z10 = false;
        }
        if (z10 && Thread.currentThread() != (c0 = c0())) {
            LockSupport.unpark(c0);
        }
    }

    @Override // ja.k0
    public void shutdown() {
        AbstractRunnableC0171c f10;
        ThreadLocal<k0> threadLocal = n1.f12787a;
        n1.f12787a.set(null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            r rVar = a1.b.M0;
            boolean z10 = false;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15169o;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, rVar)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z10) {
                    break;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.j) {
                ((kotlinx.coroutines.internal.j) obj).b();
                break;
            } else if (obj == rVar) {
                break;
            } else {
                kotlinx.coroutines.internal.j jVar = new kotlinx.coroutines.internal.j(8, true);
                jVar.a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f15169o;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, jVar)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                if (z10) {
                    break;
                }
            }
        }
        do {
        } while (a0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            if (dVar != null && (f10 = dVar.f()) != null) {
                d0(nanoTime, f10);
            }
            return;
        }
    }

    @Override // ja.b0
    public final void v(long j2, j jVar) {
        long j10 = 0;
        if (j2 > 0) {
            if (j2 >= 9223372036854L) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = 1000000 * j2;
            }
        }
        if (j10 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a aVar = new a(j10 + nanoTime, jVar);
            j0(nanoTime, aVar);
            jVar.x(new f(1, aVar));
        }
    }
}
