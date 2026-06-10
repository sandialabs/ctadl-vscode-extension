package androidx.compose.runtime;

import g0.c0;
import ja.f0;
import kotlin.coroutines.CoroutineContext;
import u7.l;
import u7.p;

/* loaded from: classes.dex */
public final class e implements c0 {

    /* renamed from: i  reason: collision with root package name */
    public static final e f2876i = new e();

    @Override // g0.c0
    public final Object D(p7.c cVar, l lVar) {
        kotlinx.coroutines.scheduling.b bVar = f0.f12766a;
        return m0.b.I1(cVar, kotlinx.coroutines.internal.l.f15491a, new SdkStubsFallbackFrameClock$withFrameNanos$2(null, lVar));
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
