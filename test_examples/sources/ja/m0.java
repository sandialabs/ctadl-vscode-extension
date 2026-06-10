package ja;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class m0 extends kotlinx.coroutines.d implements b0 {

    /* renamed from: k  reason: collision with root package name */
    public final Executor f12784k;

    public m0(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f12784k = executor;
        Method method2 = kotlinx.coroutines.internal.d.f15473a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = kotlinx.coroutines.internal.d.f15473a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void T(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.f12784k.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            a1.b.r(coroutineContext, cancellationException);
            f0.f12767b.T(coroutineContext, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f12784k;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof m0) && ((m0) obj).f12784k == this.f12784k) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f12784k);
    }

    @Override // ja.b0
    public final h0 j(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f12784k;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j2, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                a1.b.r(coroutineContext, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            return new g0(scheduledFuture);
        }
        return kotlinx.coroutines.b.f15167q.j(j2, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return this.f12784k.toString();
    }

    @Override // ja.b0
    public final void v(long j2, j jVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f12784k;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new i1(this, jVar), j2, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                a1.b.r(jVar.f12777m, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            jVar.x(new f(0, scheduledFuture));
        } else {
            kotlinx.coroutines.b.f15167q.v(j2, jVar);
        }
    }
}
