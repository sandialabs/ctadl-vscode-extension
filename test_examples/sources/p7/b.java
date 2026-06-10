package p7;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.a;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public abstract class b<B extends CoroutineContext.a, E extends B> implements CoroutineContext.b<E> {

    /* renamed from: i  reason: collision with root package name */
    public final l<CoroutineContext.a, E> f16774i;

    /* renamed from: j  reason: collision with root package name */
    public final CoroutineContext.b<?> f16775j;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [u7.l<? super kotlin.coroutines.CoroutineContext$a, ? extends E extends B>, u7.l<kotlin.coroutines.CoroutineContext$a, E extends B>, java.lang.Object] */
    public b(CoroutineContext.b<B> bVar, l<? super CoroutineContext.a, ? extends E> lVar) {
        g.f(bVar, "baseKey");
        g.f(lVar, "safeCast");
        this.f16774i = lVar;
        this.f16775j = bVar instanceof b ? (CoroutineContext.b<B>) ((b) bVar).f16775j : bVar;
    }
}
