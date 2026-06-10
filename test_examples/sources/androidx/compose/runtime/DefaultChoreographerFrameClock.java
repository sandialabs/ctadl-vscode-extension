package androidx.compose.runtime;

import android.view.Choreographer;
import g0.c0;
import g0.m;
import ja.f0;
import ja.j;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.l;
import u7.p;

/* loaded from: classes.dex */
public final class DefaultChoreographerFrameClock implements c0 {

    /* renamed from: i  reason: collision with root package name */
    public static final DefaultChoreographerFrameClock f2755i = new DefaultChoreographerFrameClock();

    /* renamed from: j  reason: collision with root package name */
    public static final Choreographer f2756j;

    static {
        kotlinx.coroutines.scheduling.b bVar = f0.f12766a;
        f2756j = (Choreographer) m0.b.h1(l.f15491a.W(), new DefaultChoreographerFrameClock$choreographer$1(null));
    }

    @Override // g0.c0
    public final Object D(p7.c cVar, u7.l lVar) {
        j jVar = new j(1, m0.b.y0(cVar));
        jVar.u();
        m mVar = new m(jVar, lVar);
        f2756j.postFrameCallback(mVar);
        jVar.x(new DefaultChoreographerFrameClock$withFrameNanos$2$1(mVar));
        return jVar.s();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R J(R r3, p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
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
