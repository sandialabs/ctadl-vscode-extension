package p7;

import kotlin.coroutines.CoroutineContext;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public abstract class a implements CoroutineContext.a {

    /* renamed from: i  reason: collision with root package name */
    public final CoroutineContext.b<?> f16773i;

    public a(CoroutineContext.b<?> bVar) {
        this.f16773i = bVar;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R J(R r3, p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        g.f(pVar, "operation");
        return pVar.R(r3, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext N(CoroutineContext.b<?> bVar) {
        return CoroutineContext.a.C0140a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.a> E a(CoroutineContext.b<E> bVar) {
        return (E) CoroutineContext.a.C0140a.a(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a
    public final CoroutineContext.b<?> getKey() {
        return this.f16773i;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext m(CoroutineContext coroutineContext) {
        g.f(coroutineContext, "context");
        return CoroutineContext.DefaultImpls.a(this, coroutineContext);
    }
}
