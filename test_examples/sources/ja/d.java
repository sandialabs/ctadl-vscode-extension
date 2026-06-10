package ja;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class d<T> extends a<T> {

    /* renamed from: k  reason: collision with root package name */
    public final Thread f12759k;

    /* renamed from: l  reason: collision with root package name */
    public final k0 f12760l;

    public d(CoroutineContext coroutineContext, Thread thread, k0 k0Var) {
        super(coroutineContext, true);
        this.f12759k = thread;
        this.f12760l = k0Var;
    }

    @Override // ja.y0
    public final void Q(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f12759k;
        if (v7.g.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
