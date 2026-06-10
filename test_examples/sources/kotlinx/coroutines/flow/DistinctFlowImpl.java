package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class DistinctFlowImpl<T> implements b<T> {

    /* renamed from: i  reason: collision with root package name */
    public final b<T> f15211i;

    /* renamed from: j  reason: collision with root package name */
    public final u7.l<T, Object> f15212j;

    /* renamed from: k  reason: collision with root package name */
    public final u7.p<Object, Object, Boolean> f15213k;

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl(b<? extends T> bVar, u7.l<? super T, ? extends Object> lVar, u7.p<Object, Object, Boolean> pVar) {
        this.f15211i = bVar;
        this.f15212j = lVar;
        this.f15213k = pVar;
    }

    @Override // kotlinx.coroutines.flow.b
    public final Object a(c<? super T> cVar, p7.c<? super m7.n> cVar2) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f13060i = (T) ma.i.f16036b;
        Object a10 = this.f15211i.a(new DistinctFlowImpl$collect$2(this, ref$ObjectRef, cVar), cVar2);
        return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
    }
}
