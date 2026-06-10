package androidx.compose.ui.platform;

import android.view.Choreographer;
import g0.c0;
import kotlin.coroutines.CoroutineContext;
import p7.d;

/* loaded from: classes.dex */
public final class x implements g0.c0 {

    /* renamed from: i  reason: collision with root package name */
    public final Choreographer f3918i;

    public x(Choreographer choreographer) {
        this.f3918i = choreographer;
    }

    @Override // g0.c0
    public final Object D(p7.c cVar, u7.l lVar) {
        AndroidUiDispatcher androidUiDispatcher;
        u7.l<? super Throwable, m7.n> androidUiFrameClock$withFrameNanos$2$2;
        CoroutineContext.a a10 = cVar.f().a(d.a.f16777i);
        if (a10 instanceof AndroidUiDispatcher) {
            androidUiDispatcher = (AndroidUiDispatcher) a10;
        } else {
            androidUiDispatcher = null;
        }
        ja.j jVar = new ja.j(1, m0.b.y0(cVar));
        jVar.u();
        w wVar = new w(jVar, this, lVar);
        if (androidUiDispatcher != null && v7.g.a(androidUiDispatcher.f3679k, this.f3918i)) {
            synchronized (androidUiDispatcher.f3681m) {
                androidUiDispatcher.f3682o.add(wVar);
                if (!androidUiDispatcher.f3685r) {
                    androidUiDispatcher.f3685r = true;
                    androidUiDispatcher.f3679k.postFrameCallback(androidUiDispatcher.f3686s);
                }
                m7.n nVar = m7.n.f16010a;
            }
            androidUiFrameClock$withFrameNanos$2$2 = new AndroidUiFrameClock$withFrameNanos$2$1(androidUiDispatcher, wVar);
        } else {
            this.f3918i.postFrameCallback(wVar);
            androidUiFrameClock$withFrameNanos$2$2 = new AndroidUiFrameClock$withFrameNanos$2$2(this, wVar);
        }
        jVar.x(androidUiFrameClock$withFrameNanos$2$2);
        return jVar.s();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R J(R r3, u7.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(r3, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext N(CoroutineContext.b<?> bVar) {
        v7.g.f(bVar, "key");
        return CoroutineContext.a.C0140a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.a> E a(CoroutineContext.b<E> bVar) {
        v7.g.f(bVar, "key");
        return (E) CoroutineContext.a.C0140a.a(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a
    public final CoroutineContext.b getKey() {
        return c0.a.f11038i;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext m(CoroutineContext coroutineContext) {
        v7.g.f(coroutineContext, "context");
        return CoroutineContext.DefaultImpls.a(this, coroutineContext);
    }
}
