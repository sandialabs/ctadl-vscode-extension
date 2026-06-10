package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Lla/k;", "", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", l = {211}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FlowKt__DelayKt$debounceInternal$1$values$1 extends SuspendLambda implements u7.p<la.k<? super Object>, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f15237m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b<Object> f15238o;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1<T> implements c {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ la.k<Object> f15239i;

        public AnonymousClass1(la.k<Object> kVar) {
            this.f15239i = kVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // kotlinx.coroutines.flow.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(T t10, p7.c<? super m7.n> cVar) {
            FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1;
            int i10;
            if (cVar instanceof FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) {
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = (FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) cVar;
                int i11 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.n;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.n = i11 - Integer.MIN_VALUE;
                    Object obj = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f15240l;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.n;
                    if (i10 != 0) {
                        m0.b.n1(obj);
                        if (t10 == null) {
                            t10 = (T) ma.i.f16036b;
                        }
                        flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.n = 1;
                        if (this.f15239i.e(t10, flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) == coroutineSingletons) {
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
            flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = new FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(this, cVar);
            Object obj2 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f15240l;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i10 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.n;
            if (i10 != 0) {
            }
            return m7.n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$values$1(b<Object> bVar, p7.c<? super FlowKt__DelayKt$debounceInternal$1$values$1> cVar) {
        super(2, cVar);
        this.f15238o = bVar;
    }

    @Override // u7.p
    public final Object R(la.k<? super Object> kVar, p7.c<? super m7.n> cVar) {
        return ((FlowKt__DelayKt$debounceInternal$1$values$1) a(kVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        FlowKt__DelayKt$debounceInternal$1$values$1 flowKt__DelayKt$debounceInternal$1$values$1 = new FlowKt__DelayKt$debounceInternal$1$values$1(this.f15238o, cVar);
        flowKt__DelayKt$debounceInternal$1$values$1.n = obj;
        return flowKt__DelayKt$debounceInternal$1$values$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f15237m;
        if (i10 == 0) {
            m0.b.n1(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((la.k) this.n);
            this.f15237m = 1;
            if (this.f15238o.a(anonymousClass1, this) == coroutineSingletons) {
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
