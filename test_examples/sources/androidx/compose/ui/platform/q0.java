package androidx.compose.ui.platform;

import kotlin.coroutines.CoroutineContext;
import q0.e;

/* loaded from: classes.dex */
public final class q0 implements q0.e {

    /* renamed from: i  reason: collision with root package name */
    public final g0.k0 f3877i = a1.c.V0(Float.valueOf(1.0f));

    @Override // q0.e
    public final float H() {
        return ((Number) this.f3877i.getValue()).floatValue();
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
        return e.a.f16831i;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext m(CoroutineContext coroutineContext) {
        v7.g.f(coroutineContext, "context");
        return CoroutineContext.DefaultImpls.a(this, coroutineContext);
    }
}
