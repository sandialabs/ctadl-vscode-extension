package kotlinx.coroutines;

import ja.r1;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class e extends CoroutineDispatcher {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f15203k = 0;

    static {
        new e();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void T(CoroutineContext coroutineContext, Runnable runnable) {
        r1 r1Var = (r1) coroutineContext.a(r1.f12798k);
        if (r1Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        r1Var.f12799j = true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
