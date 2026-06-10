package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes.dex */
public final class FlowKt__ReduceKt$first$$inlined$collectWhile$2 implements c<Object> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ u7.p f15263i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f15264j;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    @q7.c(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {142}, m = "emit")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* renamed from: l  reason: collision with root package name */
        public FlowKt__ReduceKt$first$$inlined$collectWhile$2 f15265l;

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f15266m;
        public int n;

        /* renamed from: p  reason: collision with root package name */
        public Object f15268p;

        public AnonymousClass1(p7.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            this.f15266m = obj;
            this.n |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt$first$$inlined$collectWhile$2.this.c(null, this);
        }
    }

    public FlowKt__ReduceKt$first$$inlined$collectWhile$2(u7.p pVar, Ref$ObjectRef ref$ObjectRef) {
        this.f15263i = pVar;
        this.f15264j = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    @Override // kotlinx.coroutines.flow.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, p7.c<? super m7.n> cVar) {
        AnonymousClass1 anonymousClass1;
        Object obj2;
        int i10;
        boolean z10;
        FlowKt__ReduceKt$first$$inlined$collectWhile$2 flowKt__ReduceKt$first$$inlined$collectWhile$2;
        T t10;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i11 = anonymousClass1.n;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.n = i11 - Integer.MIN_VALUE;
                obj2 = anonymousClass1.f15266m;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = anonymousClass1.n;
                z10 = true;
                if (i10 != 0) {
                    m0.b.n1(obj2);
                    anonymousClass1.f15265l = this;
                    anonymousClass1.f15268p = obj;
                    anonymousClass1.n = 1;
                    obj2 = this.f15263i.R(obj, anonymousClass1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    flowKt__ReduceKt$first$$inlined$collectWhile$2 = this;
                    t10 = obj;
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    Object obj3 = anonymousClass1.f15268p;
                    flowKt__ReduceKt$first$$inlined$collectWhile$2 = anonymousClass1.f15265l;
                    m0.b.n1(obj2);
                    t10 = obj3;
                }
                if (((Boolean) obj2).booleanValue()) {
                    flowKt__ReduceKt$first$$inlined$collectWhile$2.f15264j.f13060i = t10;
                    z10 = false;
                }
                if (z10) {
                    throw new AbortFlowException(flowKt__ReduceKt$first$$inlined$collectWhile$2);
                }
                return m7.n.f16010a;
            }
        }
        anonymousClass1 = new AnonymousClass1(cVar);
        obj2 = anonymousClass1.f15266m;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = anonymousClass1.n;
        z10 = true;
        if (i10 != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
        if (z10) {
        }
    }
}
