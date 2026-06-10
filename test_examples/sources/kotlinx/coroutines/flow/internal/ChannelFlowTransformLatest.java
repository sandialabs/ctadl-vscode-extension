package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import m7.n;
import u7.q;

/* loaded from: classes.dex */
public final class ChannelFlowTransformLatest<T, R> extends b<T, R> {

    /* renamed from: m  reason: collision with root package name */
    public final q<kotlinx.coroutines.flow.c<? super R>, T, p7.c<? super n>, Object> f15374m;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest(q<? super kotlinx.coroutines.flow.c<? super R>, ? super T, ? super p7.c<? super n>, ? extends Object> qVar, kotlinx.coroutines.flow.b<? extends T> bVar, CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        super(i10, coroutineContext, bufferOverflow, bVar);
        this.f15374m = qVar;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final a<R> g(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.f15374m, this.f15426l, coroutineContext, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.b
    public final Object j(kotlinx.coroutines.flow.c<? super R> cVar, p7.c<? super n> cVar2) {
        Object H = a1.b.H(new ChannelFlowTransformLatest$flowCollect$3(this, cVar, null), cVar2);
        return H == CoroutineSingletons.COROUTINE_SUSPENDED ? H : n.f16010a;
    }
}
