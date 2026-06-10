package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@"}, d2 = {"T", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {233}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FlowKt__DelayKt$debounceInternal$1$3$1 extends SuspendLambda implements u7.l<p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f15231m;
    public final /* synthetic */ c<Object> n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef<Object> f15232o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$1(p7.c cVar, Ref$ObjectRef ref$ObjectRef, c cVar2) {
        super(1, cVar);
        this.n = cVar2;
        this.f15232o = ref$ObjectRef;
    }

    @Override // u7.l
    public final Object U(p7.c<? super m7.n> cVar) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$1) i(cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> i(p7.c<?> cVar) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(cVar, this.f15232o, this.n);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f15231m;
        Ref$ObjectRef<Object> ref$ObjectRef = this.f15232o;
        if (i10 == 0) {
            m0.b.n1(obj);
            kotlinx.coroutines.internal.r rVar = ma.i.f16036b;
            Object obj2 = ref$ObjectRef.f13060i;
            if (obj2 == rVar) {
                obj2 = null;
            }
            this.f15231m = 1;
            if (this.n.c(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            m0.b.n1(obj);
        }
        ref$ObjectRef.f13060i = null;
        return m7.n.f16010a;
    }
}
