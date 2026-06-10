package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class DistinctFlowImpl$collect$2<T> implements c {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ DistinctFlowImpl<T> f15214i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef<Object> f15215j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ c<T> f15216k;

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl$collect$2(DistinctFlowImpl<T> distinctFlowImpl, Ref$ObjectRef<Object> ref$ObjectRef, c<? super T> cVar) {
        this.f15214i = distinctFlowImpl;
        this.f15215j = ref$ObjectRef;
        this.f15216k = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // kotlinx.coroutines.flow.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(T t10, p7.c<? super m7.n> cVar) {
        DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
        int i10;
        if (cVar instanceof DistinctFlowImpl$collect$2$emit$1) {
            distinctFlowImpl$collect$2$emit$1 = (DistinctFlowImpl$collect$2$emit$1) cVar;
            int i11 = distinctFlowImpl$collect$2$emit$1.n;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                distinctFlowImpl$collect$2$emit$1.n = i11 - Integer.MIN_VALUE;
                Object obj = distinctFlowImpl$collect$2$emit$1.f15217l;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = distinctFlowImpl$collect$2$emit$1.n;
                if (i10 != 0) {
                    m0.b.n1(obj);
                    DistinctFlowImpl<T> distinctFlowImpl = this.f15214i;
                    T t11 = (T) distinctFlowImpl.f15212j.U(t10);
                    Ref$ObjectRef<Object> ref$ObjectRef = this.f15215j;
                    Object obj2 = ref$ObjectRef.f13060i;
                    if (obj2 != ma.i.f16036b && distinctFlowImpl.f15213k.R(obj2, t11).booleanValue()) {
                        return m7.n.f16010a;
                    }
                    ref$ObjectRef.f13060i = t11;
                    distinctFlowImpl$collect$2$emit$1.n = 1;
                    if (this.f15216k.c(t10, distinctFlowImpl$collect$2$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m0.b.n1(obj);
                }
                return m7.n.f16010a;
            }
        }
        distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, cVar);
        Object obj3 = distinctFlowImpl$collect$2$emit$1.f15217l;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = distinctFlowImpl$collect$2$emit$1.n;
        if (i10 != 0) {
        }
        return m7.n.f16010a;
    }
}
