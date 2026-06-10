package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes.dex */
public class a<T> extends kotlinx.coroutines.flow.internal.a<T> {

    /* renamed from: l  reason: collision with root package name */
    public final u7.p<la.k<? super T>, p7.c<? super m7.n>, Object> f15355l;

    /* JADX WARN: Multi-variable type inference failed */
    public a(u7.p<? super la.k<? super T>, ? super p7.c<? super m7.n>, ? extends Object> pVar, CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        super(coroutineContext, i10, bufferOverflow);
        this.f15355l = pVar;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final String toString() {
        return "block[" + this.f15355l + "] -> " + super.toString();
    }
}
