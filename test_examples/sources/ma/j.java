package ma;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import la.q;
import m7.n;

/* loaded from: classes.dex */
public final class j<T> implements kotlinx.coroutines.flow.c<T> {

    /* renamed from: i  reason: collision with root package name */
    public final q<T> f16057i;

    /* JADX WARN: Multi-variable type inference failed */
    public j(q<? super T> qVar) {
        this.f16057i = qVar;
    }

    @Override // kotlinx.coroutines.flow.c
    public final Object c(T t10, p7.c<? super n> cVar) {
        Object e10 = this.f16057i.e(t10, cVar);
        return e10 == CoroutineSingletons.COROUTINE_SUSPENDED ? e10 : n.f16010a;
    }
}
