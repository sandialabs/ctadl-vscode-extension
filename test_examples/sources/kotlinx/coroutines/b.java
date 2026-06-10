package kotlinx.coroutines;

import ja.d1;
import ja.h0;
import ja.n1;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.c;

/* loaded from: classes.dex */
public final class b extends c implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: q  reason: collision with root package name */
    public static final b f15167q;

    /* renamed from: r  reason: collision with root package name */
    public static final long f15168r;

    static {
        Long l2;
        b bVar = new b();
        f15167q = bVar;
        bVar.Y(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f15168r = timeUnit.toNanos(l2.longValue());
    }

    @Override // ja.l0
    public final Thread c0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // ja.l0
    public final void d0(long j2, c.AbstractRunnableC0171c abstractRunnableC0171c) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.c
    public final void f0(Runnable runnable) {
        boolean z10;
        if (debugStatus == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            super.f0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.c, ja.b0
    public final h0 j(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        long j10 = 0;
        if (j2 > 0) {
            j10 = j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2;
        }
        if (j10 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            c.b bVar = new c.b(runnable, j10 + nanoTime);
            j0(nanoTime, bVar);
            return bVar;
        }
        return d1.f12762i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0011 A[Catch: all -> 0x001b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:13:0x0011), top: B:19:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void k0() {
        boolean z10;
        int i10 = debugStatus;
        if (i10 != 2 && i10 != 3) {
            z10 = false;
            if (z10) {
                return;
            }
            debugStatus = 3;
            i0();
            notifyAll();
            return;
        }
        z10 = true;
        if (z10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019 A[Catch: all -> 0x0091, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0091, blocks: (B:3:0x0008, B:12:0x0019, B:23:0x003a, B:25:0x0047, B:27:0x004f, B:41:0x0072, B:52:0x008d, B:15:0x0021, B:4:0x0009, B:14:0x001c), top: B:62:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[Catch: all -> 0x0093, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0091, blocks: (B:3:0x0008, B:12:0x0019, B:23:0x003a, B:25:0x0047, B:27:0x004f, B:41:0x0072, B:52:0x008d, B:15:0x0021, B:4:0x0009, B:14:0x001c), top: B:62:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d A[Catch: all -> 0x0091, TRY_ENTER, TryCatch #2 {all -> 0x0091, blocks: (B:3:0x0008, B:12:0x0019, B:23:0x003a, B:25:0x0047, B:27:0x004f, B:41:0x0072, B:52:0x008d, B:15:0x0021, B:4:0x0009, B:14:0x001c), top: B:62:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007e A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        n1.f12787a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 != 2 && i10 != 3) {
                    z10 = false;
                    if (!z10) {
                        z11 = false;
                    } else {
                        debugStatus = 1;
                        notifyAll();
                        z11 = true;
                    }
                }
                z10 = true;
                if (!z10) {
                }
            }
            if (!z11) {
                _thread = null;
                k0();
                if (!h0()) {
                    c0();
                    return;
                }
                return;
            }
            long j2 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long a02 = a0();
                if (a02 == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j2 == Long.MAX_VALUE) {
                        j2 = f15168r + nanoTime;
                    }
                    long j10 = j2 - nanoTime;
                    if (j10 <= 0) {
                        _thread = null;
                        k0();
                        if (!h0()) {
                            c0();
                            return;
                        }
                        return;
                    } else if (a02 > j10) {
                        a02 = j10;
                    }
                } else {
                    j2 = Long.MAX_VALUE;
                }
                if (a02 > 0) {
                    int i11 = debugStatus;
                    if (i11 != 2 && i11 != 3) {
                        z12 = false;
                        if (!z12) {
                            _thread = null;
                            k0();
                            if (!h0()) {
                                c0();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, a02);
                    }
                    z12 = true;
                    if (!z12) {
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            k0();
            if (!h0()) {
                c0();
            }
            throw th;
        }
    }

    @Override // kotlinx.coroutines.c, ja.k0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
