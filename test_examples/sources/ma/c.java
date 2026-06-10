package ma;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.BufferOverflow;
import m7.n;

/* loaded from: classes.dex */
public final class c<T> extends kotlinx.coroutines.flow.internal.b<T, T> {
    public c(int i10, CoroutineContext coroutineContext, BufferOverflow bufferOverflow, kotlinx.coroutines.flow.b bVar) {
        super(i10, coroutineContext, bufferOverflow, bVar);
    }

    public c(kotlinx.coroutines.flow.b bVar, CoroutineDispatcher coroutineDispatcher, int i10, BufferOverflow bufferOverflow, int i11) {
        super((i11 & 4) != 0 ? -3 : i10, (i11 & 2) != 0 ? EmptyCoroutineContext.f13021i : coroutineDispatcher, (i11 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow, bVar);
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final kotlinx.coroutines.flow.internal.a<T> g(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        return new c(i10, coroutineContext, bufferOverflow, this.f15426l);
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final kotlinx.coroutines.flow.b<T> i() {
        return (kotlinx.coroutines.flow.b<T>) this.f15426l;
    }

    @Override // kotlinx.coroutines.flow.internal.b
    public final Object j(kotlinx.coroutines.flow.c<? super T> cVar, p7.c<? super n> cVar2) {
        Object a10 = this.f15426l.a(cVar, cVar2);
        return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
    }
}
