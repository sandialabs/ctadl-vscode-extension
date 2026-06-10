package ma;

import kotlin.coroutines.CoroutineContext;
import u7.p;

/* loaded from: classes.dex */
public final class d implements CoroutineContext {

    /* renamed from: i  reason: collision with root package name */
    public final Throwable f16031i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f16032j;

    public d(CoroutineContext coroutineContext, Throwable th) {
        this.f16031i = th;
        this.f16032j = coroutineContext;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R J(R r3, p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        return (R) this.f16032j.J(r3, pVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext N(CoroutineContext.b<?> bVar) {
        return this.f16032j.N(bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.a> E a(CoroutineContext.b<E> bVar) {
        return (E) this.f16032j.a(bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext m(CoroutineContext coroutineContext) {
        return this.f16032j.m(coroutineContext);
    }
}
