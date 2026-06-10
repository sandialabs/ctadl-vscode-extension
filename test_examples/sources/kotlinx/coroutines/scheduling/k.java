package kotlinx.coroutines.scheduling;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes.dex */
public final class k extends CoroutineDispatcher {

    /* renamed from: k  reason: collision with root package name */
    public static final k f15538k = new k();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void T(CoroutineContext coroutineContext, Runnable runnable) {
        b bVar = b.f15525l;
        bVar.f15527k.b(runnable, j.f15537g, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void U(CoroutineContext coroutineContext, Runnable runnable) {
        b bVar = b.f15525l;
        bVar.f15527k.b(runnable, j.f15537g, true);
    }
}
