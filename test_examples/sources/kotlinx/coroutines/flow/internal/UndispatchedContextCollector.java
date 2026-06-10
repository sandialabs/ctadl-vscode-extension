package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.ThreadContextKt;
import m7.n;
import u7.p;

/* loaded from: classes.dex */
public final class UndispatchedContextCollector<T> implements kotlinx.coroutines.flow.c<T> {

    /* renamed from: i  reason: collision with root package name */
    public final CoroutineContext f15418i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f15419j;

    /* renamed from: k  reason: collision with root package name */
    public final p<T, p7.c<? super n>, Object> f15420k;

    public UndispatchedContextCollector(kotlinx.coroutines.flow.c<? super T> cVar, CoroutineContext coroutineContext) {
        this.f15418i = coroutineContext;
        this.f15419j = ThreadContextKt.b(coroutineContext);
        this.f15420k = new UndispatchedContextCollector$emitRef$1(cVar, null);
    }

    @Override // kotlinx.coroutines.flow.c
    public final Object c(T t10, p7.c<? super n> cVar) {
        Object L0 = a1.b.L0(this.f15418i, t10, this.f15419j, this.f15420k, cVar);
        return L0 == CoroutineSingletons.COROUTINE_SUSPENDED ? L0 : n.f16010a;
    }
}
