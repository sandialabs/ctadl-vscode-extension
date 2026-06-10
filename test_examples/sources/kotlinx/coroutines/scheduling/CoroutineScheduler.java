package kotlinx.coroutines.scheduling;

import ja.y;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.random.Random;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.internal.r;
import m7.n;

/* loaded from: classes.dex */
public final class CoroutineScheduler implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: i  reason: collision with root package name */
    public final int f15505i;

    /* renamed from: j  reason: collision with root package name */
    public final int f15506j;

    /* renamed from: k  reason: collision with root package name */
    public final long f15507k;

    /* renamed from: l  reason: collision with root package name */
    public final String f15508l;

    /* renamed from: m  reason: collision with root package name */
    public final c f15509m;
    public final c n;

    /* renamed from: o  reason: collision with root package name */
    public final o<a> f15510o;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: s  reason: collision with root package name */
    public static final r f15504s = new r("NOT_IN_STACK");

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f15501p = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f15502q = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15503r = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    /* loaded from: classes.dex */
    public final class a extends Thread {

        /* renamed from: p  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f15516p = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

        /* renamed from: i  reason: collision with root package name */
        public final l f15517i;
        private volatile int indexInArray;

        /* renamed from: j  reason: collision with root package name */
        public WorkerState f15518j;

        /* renamed from: k  reason: collision with root package name */
        public long f15519k;

        /* renamed from: l  reason: collision with root package name */
        public long f15520l;

        /* renamed from: m  reason: collision with root package name */
        public int f15521m;
        public boolean n;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        public a() {
            throw null;
        }

        public a(int i10) {
            setDaemon(true);
            this.f15517i = new l();
            this.f15518j = WorkerState.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.f15504s;
            this.f15521m = Random.f13065i.a();
            f(i10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0091, code lost:
            if (r0 == null) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final f a(boolean z10) {
            boolean z11;
            boolean z12;
            f d5;
            f fVar;
            f e10;
            f e11;
            WorkerState workerState = this.f15518j;
            WorkerState workerState2 = WorkerState.CPU_ACQUIRED;
            boolean z13 = true;
            if (workerState != workerState2) {
                CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                while (true) {
                    long j2 = coroutineScheduler.controlState;
                    if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                        z11 = false;
                        break;
                    } else if (CoroutineScheduler.f15502q.compareAndSet(coroutineScheduler, j2, j2 - 4398046511104L)) {
                        z11 = true;
                        break;
                    }
                }
                if (z11) {
                    this.f15518j = workerState2;
                } else {
                    z12 = false;
                    if (!z12) {
                        if (z10) {
                            if (d(CoroutineScheduler.this.f15505i * 2) != 0) {
                                z13 = false;
                            }
                            if (!z13 || (e11 = e()) == null) {
                                l lVar = this.f15517i;
                                lVar.getClass();
                                f fVar2 = (f) l.f15539b.getAndSet(lVar, null);
                                if (fVar2 == null) {
                                    fVar = lVar.d();
                                } else {
                                    fVar = fVar2;
                                }
                                if (fVar == null) {
                                    if (!z13 && (e10 = e()) != null) {
                                        return e10;
                                    }
                                } else {
                                    return fVar;
                                }
                            } else {
                                return e11;
                            }
                        } else {
                            f e12 = e();
                            if (e12 != null) {
                                return e12;
                            }
                        }
                        return i(false);
                    }
                    if (z10) {
                        l lVar2 = this.f15517i;
                        lVar2.getClass();
                        d5 = (f) l.f15539b.getAndSet(lVar2, null);
                        if (d5 == null) {
                            d5 = lVar2.d();
                        }
                    }
                    d5 = CoroutineScheduler.this.n.d();
                    if (d5 == null) {
                        return i(true);
                    }
                    return d5;
                }
            }
            z12 = true;
            if (!z12) {
            }
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i10) {
            int i11 = this.f15521m;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f15521m = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final f e() {
            c cVar;
            int d5 = d(2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            if (d5 == 0) {
                f d10 = coroutineScheduler.f15509m.d();
                if (d10 != null) {
                    return d10;
                }
                cVar = coroutineScheduler.n;
            } else {
                f d11 = coroutineScheduler.n.d();
                if (d11 != null) {
                    return d11;
                }
                cVar = coroutineScheduler.f15509m;
            }
            return cVar.d();
        }

        public final void f(int i10) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.f15508l);
            sb.append("-worker-");
            sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb.toString());
            this.indexInArray = i10;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(WorkerState workerState) {
            WorkerState workerState2 = this.f15518j;
            boolean z10 = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z10) {
                CoroutineScheduler.f15502q.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f15518j = workerState;
            }
            return z10;
        }

        public final f i(boolean z10) {
            long f10;
            int i10 = (int) (CoroutineScheduler.this.controlState & 2097151);
            if (i10 < 2) {
                return null;
            }
            int d5 = d(i10);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long j2 = Long.MAX_VALUE;
            for (int i11 = 0; i11 < i10; i11++) {
                d5++;
                if (d5 > i10) {
                    d5 = 1;
                }
                a b5 = coroutineScheduler.f15510o.b(d5);
                if (b5 != null && b5 != this) {
                    l lVar = this.f15517i;
                    l lVar2 = b5.f15517i;
                    if (z10) {
                        f10 = lVar.e(lVar2);
                    } else {
                        lVar.getClass();
                        f d10 = lVar2.d();
                        if (d10 != null) {
                            lVar.a(d10, false);
                            f10 = -1;
                        } else {
                            f10 = lVar.f(lVar2, false);
                        }
                    }
                    if (f10 == -1) {
                        l lVar3 = this.f15517i;
                        lVar3.getClass();
                        f fVar = (f) l.f15539b.getAndSet(lVar3, null);
                        if (fVar == null) {
                            return lVar3.d();
                        }
                        return fVar;
                    } else if (f10 > 0) {
                        j2 = Math.min(j2, f10);
                    }
                }
            }
            if (j2 == Long.MAX_VALUE) {
                j2 = 0;
            }
            this.f15520l = j2;
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:96:0x0062 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0061 A[SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            boolean z10;
            boolean z11;
            loop0: while (true) {
                boolean z12 = false;
                while (!CoroutineScheduler.this.isTerminated()) {
                    WorkerState workerState = this.f15518j;
                    WorkerState workerState2 = WorkerState.TERMINATED;
                    if (workerState == workerState2) {
                        break loop0;
                    }
                    f a10 = a(this.n);
                    if (a10 != null) {
                        this.f15520l = 0L;
                        int b5 = a10.f15529j.b();
                        this.f15519k = 0L;
                        WorkerState workerState3 = this.f15518j;
                        WorkerState workerState4 = WorkerState.PARKING;
                        WorkerState workerState5 = WorkerState.BLOCKING;
                        if (workerState3 == workerState4) {
                            this.f15518j = workerState5;
                        }
                        CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                        if (b5 != 0 && h(workerState5) && !coroutineScheduler.j() && !coroutineScheduler.i(coroutineScheduler.controlState)) {
                            coroutineScheduler.j();
                        }
                        coroutineScheduler.getClass();
                        try {
                            a10.run();
                        } finally {
                            if (b5 == 0) {
                            }
                        }
                        if (b5 == 0) {
                            CoroutineScheduler.f15502q.addAndGet(coroutineScheduler, -2097152L);
                            if (this.f15518j != workerState2) {
                                this.f15518j = WorkerState.DORMANT;
                            }
                        }
                    } else {
                        this.n = false;
                        if (this.f15520l != 0) {
                            if (!z12) {
                                z12 = true;
                            } else {
                                h(WorkerState.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f15520l);
                                this.f15520l = 0L;
                            }
                        } else {
                            if (this.nextParkedWorker != CoroutineScheduler.f15504s) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                CoroutineScheduler.this.c(this);
                            } else {
                                this.workerCtl = -1;
                                while (true) {
                                    if (this.nextParkedWorker != CoroutineScheduler.f15504s) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11 && this.workerCtl == -1 && !CoroutineScheduler.this.isTerminated()) {
                                        WorkerState workerState6 = this.f15518j;
                                        WorkerState workerState7 = WorkerState.TERMINATED;
                                        if (workerState6 == workerState7) {
                                            break;
                                        }
                                        h(WorkerState.PARKING);
                                        Thread.interrupted();
                                        if (this.f15519k == 0) {
                                            this.f15519k = System.nanoTime() + CoroutineScheduler.this.f15507k;
                                        }
                                        LockSupport.parkNanos(CoroutineScheduler.this.f15507k);
                                        if (System.nanoTime() - this.f15519k >= 0) {
                                            this.f15519k = 0L;
                                            CoroutineScheduler coroutineScheduler2 = CoroutineScheduler.this;
                                            synchronized (coroutineScheduler2.f15510o) {
                                                if (!coroutineScheduler2.isTerminated() && ((int) (coroutineScheduler2.controlState & 2097151)) > coroutineScheduler2.f15505i && f15516p.compareAndSet(this, -1, 1)) {
                                                    int i10 = this.indexInArray;
                                                    f(0);
                                                    coroutineScheduler2.h(this, i10, 0);
                                                    int andDecrement = (int) (CoroutineScheduler.f15502q.getAndDecrement(coroutineScheduler2) & 2097151);
                                                    if (andDecrement != i10) {
                                                        a b10 = coroutineScheduler2.f15510o.b(andDecrement);
                                                        v7.g.c(b10);
                                                        a aVar = b10;
                                                        coroutineScheduler2.f15510o.c(i10, aVar);
                                                        aVar.f(i10);
                                                        coroutineScheduler2.h(aVar, andDecrement, i10);
                                                    }
                                                    coroutineScheduler2.f15510o.c(andDecrement, null);
                                                    n nVar = n.f16010a;
                                                    this.f15518j = workerState7;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break loop0;
            }
            h(WorkerState.TERMINATED);
        }
    }

    public CoroutineScheduler(int i10, int i11, long j2, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f15505i = i10;
        this.f15506j = i11;
        this.f15507k = j2;
        this.f15508l = str;
        boolean z13 = true;
        if (i10 >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i11 <= 2097150) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (j2 <= 0) {
                        z13 = false;
                    }
                    if (z13) {
                        this.f15509m = new c();
                        this.n = new c();
                        this.parkedWorkersStack = 0L;
                        this.f15510o = new o<>(i10 + 1);
                        this.controlState = i10 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
                }
                throw new IllegalArgumentException(a4.b.i("Max pool size ", i11, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(a4.b.j("Max pool size ", i11, " should be greater than or equals to core pool size ", i10).toString());
        }
        throw new IllegalArgumentException(a4.b.i("Core pool size ", i10, " should be at least 1").toString());
    }

    public final int a() {
        boolean z10;
        synchronized (this.f15510o) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j2 = this.controlState;
            int i10 = (int) (j2 & 2097151);
            int i11 = i10 - ((int) ((j2 & 4398044413952L) >> 21));
            boolean z11 = false;
            if (i11 < 0) {
                i11 = 0;
            }
            if (i11 >= this.f15505i) {
                return 0;
            }
            if (i10 >= this.f15506j) {
                return 0;
            }
            int i12 = ((int) (this.controlState & 2097151)) + 1;
            if (i12 > 0 && this.f15510o.b(i12) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                a aVar = new a(i12);
                this.f15510o.c(i12, aVar);
                if (i12 == ((int) (2097151 & f15502q.incrementAndGet(this)))) {
                    z11 = true;
                }
                if (z11) {
                    aVar.start();
                    return i11 + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Runnable runnable, g gVar, boolean z10) {
        f iVar;
        a aVar;
        f a10;
        boolean z11;
        c cVar;
        j.f15535e.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof f) {
            iVar = (f) runnable;
            iVar.f15528i = nanoTime;
            iVar.f15529j = gVar;
        } else {
            iVar = new i(runnable, nanoTime, gVar);
        }
        Thread currentThread = Thread.currentThread();
        a aVar2 = null;
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar != null && v7.g.a(CoroutineScheduler.this, this)) {
            aVar2 = aVar;
        }
        boolean z12 = true;
        if (aVar2 != null && aVar2.f15518j != WorkerState.TERMINATED && (iVar.f15529j.b() != 0 || aVar2.f15518j != WorkerState.BLOCKING)) {
            aVar2.n = true;
            a10 = aVar2.f15517i.a(iVar, z10);
            if (a10 != null) {
                if (a10.f15529j.b() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    cVar = this.n;
                } else {
                    cVar = this.f15509m;
                }
                if (!cVar.a(a10)) {
                    throw new RejectedExecutionException(androidx.activity.e.k(new StringBuilder(), this.f15508l, " was terminated"));
                }
            }
            if (z10 || aVar2 == null) {
                z12 = false;
            }
            if (iVar.f15529j.b() != 0) {
                if (!z12 && !j() && !i(this.controlState)) {
                    j();
                    return;
                }
                return;
            }
            long addAndGet = f15502q.addAndGet(this, 2097152L);
            if (!z12 && !j() && !i(addAndGet)) {
                j();
                return;
            }
            return;
        }
        a10 = iVar;
        if (a10 != null) {
        }
        if (z10) {
        }
        z12 = false;
        if (iVar.f15529j.b() != 0) {
        }
    }

    public final void c(a aVar) {
        long j2;
        int b5;
        if (aVar.c() != f15504s) {
            return;
        }
        do {
            j2 = this.parkedWorkersStack;
            b5 = aVar.b();
            aVar.g(this.f15510o.b((int) (2097151 & j2)));
        } while (!f15501p.compareAndSet(this, j2, b5 | ((2097152 + j2) & (-2097152))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
        if (r1 == null) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073 A[LOOP:0: B:21:0x0033->B:35:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0076 A[EDGE_INSN: B:64:0x0076->B:36:0x0076 ?: BREAK  , SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        a aVar;
        int i10;
        f d5;
        boolean z10;
        if (f15503r.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            if (currentThread instanceof a) {
                aVar = (a) currentThread;
            } else {
                aVar = null;
            }
            if (aVar == null || !v7.g.a(CoroutineScheduler.this, this)) {
                aVar = null;
            }
            synchronized (this.f15510o) {
                i10 = (int) (this.controlState & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    a b5 = this.f15510o.b(i11);
                    v7.g.c(b5);
                    a aVar2 = b5;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        l lVar = aVar2.f15517i;
                        c cVar = this.n;
                        lVar.getClass();
                        f fVar = (f) l.f15539b.getAndSet(lVar, null);
                        if (fVar != null) {
                            cVar.a(fVar);
                        }
                        do {
                            f d10 = lVar.d();
                            if (d10 == null) {
                                z10 = false;
                                continue;
                            } else {
                                cVar.a(d10);
                                z10 = true;
                                continue;
                            }
                        } while (z10);
                        if (i11 != i10) {
                            break;
                        }
                        i11++;
                    } else if (i11 != i10) {
                    }
                }
            }
            this.n.b();
            this.f15509m.b();
            while (true) {
                if (aVar != null) {
                    d5 = aVar.a(true);
                }
                d5 = this.f15509m.d();
                if (d5 == null && (d5 = this.n.d()) == null) {
                    break;
                }
                try {
                    d5.run();
                } finally {
                }
            }
            if (aVar != null) {
                aVar.h(WorkerState.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, j.f15536f, false);
    }

    public final void h(a aVar, int i10, int i11) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i12 = (int) (2097151 & j2);
            long j10 = (2097152 + j2) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    a aVar2 = aVar;
                    while (true) {
                        Object c = aVar2.c();
                        if (c == f15504s) {
                            i12 = -1;
                            break;
                        } else if (c == null) {
                            i12 = 0;
                            break;
                        } else {
                            aVar2 = (a) c;
                            i12 = aVar2.b();
                            if (i12 != 0) {
                                break;
                            }
                        }
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0 && f15501p.compareAndSet(this, j2, j10 | i12)) {
                return;
            }
        }
    }

    public final boolean i(long j2) {
        int i10 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f15505i;
        if (i10 < i11) {
            int a10 = a();
            if (a10 == 1 && i11 > 1) {
                a();
            }
            if (a10 > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final boolean j() {
        r rVar;
        int i10;
        while (true) {
            long j2 = this.parkedWorkersStack;
            a b5 = this.f15510o.b((int) (2097151 & j2));
            if (b5 == null) {
                b5 = null;
            } else {
                long j10 = (2097152 + j2) & (-2097152);
                a aVar = b5;
                while (true) {
                    Object c = aVar.c();
                    rVar = f15504s;
                    if (c == rVar) {
                        i10 = -1;
                        break;
                    } else if (c == null) {
                        i10 = 0;
                        break;
                    } else {
                        aVar = (a) c;
                        i10 = aVar.b();
                        if (i10 != 0) {
                            break;
                        }
                    }
                }
                if (i10 >= 0 && f15501p.compareAndSet(this, j2, i10 | j10)) {
                    b5.g(rVar);
                }
            }
            if (b5 == null) {
                return false;
            }
            if (a.f15516p.compareAndSet(b5, -1, 0)) {
                LockSupport.unpark(b5);
                return true;
            }
        }
    }

    public final String toString() {
        StringBuilder sb;
        char c;
        ArrayList arrayList = new ArrayList();
        int a10 = this.f15510o.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            a b5 = this.f15510o.b(i15);
            if (b5 != null) {
                int c10 = b5.f15517i.c();
                int ordinal = b5.f15518j.ordinal();
                if (ordinal == 0) {
                    i10++;
                    sb = new StringBuilder();
                    sb.append(c10);
                    c = 'c';
                } else if (ordinal == 1) {
                    i11++;
                    sb = new StringBuilder();
                    sb.append(c10);
                    c = 'b';
                } else if (ordinal == 2) {
                    i12++;
                } else if (ordinal == 3) {
                    i13++;
                    if (c10 > 0) {
                        sb = new StringBuilder();
                        sb.append(c10);
                        c = 'd';
                    }
                } else if (ordinal == 4) {
                    i14++;
                }
                sb.append(c);
                arrayList.add(sb.toString());
            }
        }
        long j2 = this.controlState;
        return this.f15508l + '@' + y.a(this) + "[Pool Size {core = " + this.f15505i + ", max = " + this.f15506j + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f15509m.c() + ", global blocking queue size = " + this.n.c() + ", Control State {created workers= " + ((int) (2097151 & j2)) + ", blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", CPUs acquired = " + (this.f15505i - ((int) ((9223367638808264704L & j2) >> 42))) + "}]";
    }
}
