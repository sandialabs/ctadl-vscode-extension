package ja;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class q1 implements CoroutineContext.a, CoroutineContext.b<q1> {

    /* renamed from: i  reason: collision with root package name */
    public static final q1 f12792i = new q1();

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R J(R r3, u7.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(r3, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext N(CoroutineContext.b<?> bVar) {
        return CoroutineContext.a.C0140a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.a> E a(CoroutineContext.b<E> bVar) {
        return (E) CoroutineContext.a.C0140a.a(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a
    public final CoroutineContext.b<?> getKey() {
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext m(CoroutineContext coroutineContext) {
        v7.g.f(coroutineContext, "context");
        return CoroutineContext.DefaultImpls.a(this, coroutineContext);
    }
}
