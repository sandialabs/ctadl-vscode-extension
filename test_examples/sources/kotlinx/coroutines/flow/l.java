package kotlinx.coroutines.flow;

import ja.k1;
import ja.u0;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes.dex */
public final class l<T> implements o<T>, b, ma.f<T> {

    /* renamed from: i  reason: collision with root package name */
    public final u0 f15428i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ o<T> f15429j;

    public l(p pVar, k1 k1Var) {
        this.f15428i = k1Var;
        this.f15429j = pVar;
    }

    @Override // kotlinx.coroutines.flow.o, kotlinx.coroutines.flow.b
    public final Object a(c<? super T> cVar, p7.c<?> cVar2) {
        return this.f15429j.a(cVar, cVar2);
    }

    @Override // kotlinx.coroutines.flow.o
    public final List<T> b() {
        return this.f15429j.b();
    }

    @Override // ma.f
    public final b<T> f(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        return ((i10 == 0 || i10 == -3) && bufferOverflow == BufferOverflow.SUSPEND) ? this : new ma.c(i10, coroutineContext, bufferOverflow, this);
    }
}
