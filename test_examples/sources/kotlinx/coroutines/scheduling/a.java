package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.internal.s;

/* loaded from: classes.dex */
public final class a extends kotlinx.coroutines.d implements Executor {

    /* renamed from: k  reason: collision with root package name */
    public static final a f15523k = new a();

    /* renamed from: l  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.g f15524l;

    static {
        k kVar = k.f15538k;
        int i10 = s.f15496a;
        if (64 >= i10) {
            i10 = 64;
        }
        boolean z10 = false;
        int E1 = a1.c.E1("kotlinx.coroutines.io.parallelism", i10, 0, 0, 12);
        kVar.getClass();
        if (E1 >= 1) {
            z10 = true;
        }
        if (z10) {
            f15524l = new kotlinx.coroutines.internal.g(kVar, E1);
            return;
        }
        throw new IllegalArgumentException(androidx.activity.e.g("Expected positive parallelism level, but got ", E1).toString());
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void T(CoroutineContext coroutineContext, Runnable runnable) {
        f15524l.T(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void U(CoroutineContext coroutineContext, Runnable runnable) {
        f15524l.U(coroutineContext, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        T(EmptyCoroutineContext.f13021i, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.IO";
    }
}
