package m7;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import u7.q;

/* loaded from: classes.dex */
public final class b<T, R> extends a<T, R> implements p7.c<R> {

    /* renamed from: i  reason: collision with root package name */
    public final q<? super a<?, ?>, Object, ? super p7.c<Object>, ? extends Object> f15985i;

    /* renamed from: j  reason: collision with root package name */
    public Object f15986j;

    /* renamed from: k  reason: collision with root package name */
    public p7.c<Object> f15987k;

    /* renamed from: l  reason: collision with root package name */
    public Object f15988l;

    public b(n nVar, q qVar) {
        v7.g.f(qVar, "block");
        this.f15985i = qVar;
        this.f15986j = nVar;
        this.f15987k = this;
        this.f15988l = CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // m7.a
    public final void a(n nVar, p7.c cVar) {
        this.f15987k = cVar;
        this.f15986j = nVar;
    }

    @Override // p7.c
    public final CoroutineContext f() {
        return EmptyCoroutineContext.f13021i;
    }

    @Override // p7.c
    public final void t(Object obj) {
        this.f15987k = null;
        this.f15988l = obj;
    }
}
