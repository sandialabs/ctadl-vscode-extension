package androidx.lifecycle;

import ja.b1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes.dex */
public final class y extends CoroutineDispatcher {

    /* renamed from: k  reason: collision with root package name */
    public final f f5424k = new f();

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // kotlinx.coroutines.CoroutineDispatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(CoroutineContext coroutineContext, Runnable runnable) {
        boolean z10;
        v7.g.f(coroutineContext, "context");
        v7.g.f(runnable, "block");
        f fVar = this.f5424k;
        fVar.getClass();
        kotlinx.coroutines.scheduling.b bVar = ja.f0.f12766a;
        b1 W = kotlinx.coroutines.internal.l.f15491a.W();
        if (!W.V(coroutineContext)) {
            if (!fVar.f5384b && fVar.f5383a) {
                z10 = false;
                if (z10) {
                    if (fVar.f5385d.offer(runnable)) {
                        fVar.a();
                        return;
                    }
                    throw new IllegalStateException("cannot enqueue any more runnables".toString());
                }
            }
            z10 = true;
            if (z10) {
            }
        }
        W.T(coroutineContext, new p2.g(fVar, 1, runnable));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean V(CoroutineContext coroutineContext) {
        boolean z10;
        v7.g.f(coroutineContext, "context");
        kotlinx.coroutines.scheduling.b bVar = ja.f0.f12766a;
        if (kotlinx.coroutines.internal.l.f15491a.W().V(coroutineContext)) {
            return true;
        }
        f fVar = this.f5424k;
        if (!fVar.f5384b && fVar.f5383a) {
            z10 = false;
            return !z10;
        }
        z10 = true;
        return !z10;
    }
}
