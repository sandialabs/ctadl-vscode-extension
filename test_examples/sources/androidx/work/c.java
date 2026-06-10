package androidx.work;

import androidx.work.impl.utils.futures.AbstractFuture;
import ja.u0;
import ja.w0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c<R> implements m6.a<R> {

    /* renamed from: i  reason: collision with root package name */
    public final u0 f6216i;

    /* renamed from: j  reason: collision with root package name */
    public final androidx.work.impl.utils.futures.a<R> f6217j;

    public c(w0 w0Var) {
        androidx.work.impl.utils.futures.a<R> aVar = new androidx.work.impl.utils.futures.a<>();
        this.f6216i = w0Var;
        this.f6217j = aVar;
        w0Var.O(new JobListenableFuture$1(this));
    }

    @Override // m6.a
    public final void a(Runnable runnable, Executor executor) {
        this.f6217j.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f6217j.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        return this.f6217j.get();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j2, TimeUnit timeUnit) {
        return this.f6217j.get(j2, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6217j.f6306i instanceof AbstractFuture.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f6217j.isDone();
    }
}
