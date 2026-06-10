package kotlinx.coroutines.flow;

import ja.k1;
import ja.u0;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes.dex */
public final class m<T> implements u<T>, b, ma.f<T> {

    /* renamed from: i  reason: collision with root package name */
    public final u0 f15430i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ u<T> f15431j;

    public m(u uVar, k1 k1Var) {
        this.f15430i = k1Var;
        this.f15431j = uVar;
    }

    @Override // kotlinx.coroutines.flow.o, kotlinx.coroutines.flow.b
    public final Object a(c<? super T> cVar, p7.c<?> cVar2) {
        return this.f15431j.a(cVar, cVar2);
    }

    @Override // kotlinx.coroutines.flow.o
    public final List<T> b() {
        return this.f15431j.b();
    }

    @Override // ma.f
    public final b<T> f(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        boolean z10;
        if (i10 >= 0 && i10 < 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (((!z10 && i10 != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) && ((i10 != 0 && i10 != -3) || bufferOverflow != BufferOverflow.SUSPEND)) {
            return new ma.c(i10, coroutineContext, bufferOverflow, this);
        }
        return this;
    }

    @Override // kotlinx.coroutines.flow.u
    public final T getValue() {
        return this.f15431j.getValue();
    }
}
