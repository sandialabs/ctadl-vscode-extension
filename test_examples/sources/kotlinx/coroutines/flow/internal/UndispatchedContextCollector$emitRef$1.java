package kotlinx.coroutines.flow.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UndispatchedContextCollector$emitRef$1 extends SuspendLambda implements p<T, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f15421m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.c<T> f15422o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UndispatchedContextCollector$emitRef$1(kotlinx.coroutines.flow.c<? super T> cVar, p7.c<? super UndispatchedContextCollector$emitRef$1> cVar2) {
        super(2, cVar2);
        this.f15422o = cVar;
    }

    @Override // u7.p
    public final Object R(Object obj, p7.c<? super n> cVar) {
        return ((UndispatchedContextCollector$emitRef$1) a(obj, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.f15422o, cVar);
        undispatchedContextCollector$emitRef$1.n = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f15421m;
        if (i10 == 0) {
            m0.b.n1(obj);
            Object obj2 = this.n;
            this.f15421m = 1;
            if (this.f15422o.c(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            m0.b.n1(obj);
        }
        return n.f16010a;
    }
}
