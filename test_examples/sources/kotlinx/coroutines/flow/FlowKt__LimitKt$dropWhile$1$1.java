package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes.dex */
public final class FlowKt__LimitKt$dropWhile$1$1<T> implements c {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f15253i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ c<T> f15254j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ u7.p<T, p7.c<? super Boolean>, Object> f15255k;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$dropWhile$1$1(Ref$BooleanRef ref$BooleanRef, c<? super T> cVar, u7.p<? super T, ? super p7.c<? super Boolean>, ? extends Object> pVar) {
        this.f15253i = ref$BooleanRef;
        this.f15254j = cVar;
        this.f15255k = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    @Override // kotlinx.coroutines.flow.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(T t10, p7.c<? super m7.n> cVar) {
        FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        int i10;
        FlowKt__LimitKt$dropWhile$1$1<T> flowKt__LimitKt$dropWhile$1$1;
        if (cVar instanceof FlowKt__LimitKt$dropWhile$1$1$emit$1) {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = (FlowKt__LimitKt$dropWhile$1$1$emit$1) cVar;
            int i11 = flowKt__LimitKt$dropWhile$1$1$emit$1.f15259p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.f15259p = i11 - Integer.MIN_VALUE;
                Object obj = flowKt__LimitKt$dropWhile$1$1$emit$1.n;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = flowKt__LimitKt$dropWhile$1$1$emit$1.f15259p;
                if (i10 != 0) {
                    m0.b.n1(obj);
                    if (this.f15253i.f13056i) {
                        flowKt__LimitKt$dropWhile$1$1$emit$1.f15259p = 1;
                        if (this.f15254j.c(t10, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return m7.n.f16010a;
                    }
                    flowKt__LimitKt$dropWhile$1$1$emit$1.f15256l = this;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.f15257m = t10;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.f15259p = 2;
                    obj = this.f15255k.R(t10, flowKt__LimitKt$dropWhile$1$1$emit$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    flowKt__LimitKt$dropWhile$1$1 = this;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                } else if (i10 == 1) {
                    m0.b.n1(obj);
                    return m7.n.f16010a;
                } else if (i10 == 2) {
                    t10 = (T) flowKt__LimitKt$dropWhile$1$1$emit$1.f15257m;
                    flowKt__LimitKt$dropWhile$1$1 = flowKt__LimitKt$dropWhile$1$1$emit$1.f15256l;
                    m0.b.n1(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return m7.n.f16010a;
                    }
                    flowKt__LimitKt$dropWhile$1$1.f15253i.f13056i = true;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.f15256l = null;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.f15257m = null;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.f15259p = 3;
                    if (flowKt__LimitKt$dropWhile$1$1.f15254j.c(t10, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m0.b.n1(obj);
                }
                return m7.n.f16010a;
            }
        }
        flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, cVar);
        Object obj2 = flowKt__LimitKt$dropWhile$1$1$emit$1.n;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = flowKt__LimitKt$dropWhile$1$1$emit$1.f15259p;
        if (i10 != 0) {
        }
        return m7.n.f16010a;
    }
}
