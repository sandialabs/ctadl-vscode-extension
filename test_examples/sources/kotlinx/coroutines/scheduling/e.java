package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public class e extends kotlinx.coroutines.d {

    /* renamed from: k  reason: collision with root package name */
    public final CoroutineScheduler f15527k;

    public e(int i10, int i11, long j2) {
        this.f15527k = new CoroutineScheduler(i10, i11, j2, "DefaultDispatcher");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void T(CoroutineContext coroutineContext, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.f15501p;
        this.f15527k.b(runnable, j.f15536f, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void U(CoroutineContext coroutineContext, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.f15501p;
        this.f15527k.b(runnable, j.f15536f, true);
    }
}
