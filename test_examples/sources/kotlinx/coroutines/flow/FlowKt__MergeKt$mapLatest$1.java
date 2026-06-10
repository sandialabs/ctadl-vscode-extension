package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/c;", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {214, 214}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FlowKt__MergeKt$mapLatest$1 extends SuspendLambda implements u7.q<c<Object>, Object, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f15260m;
    public /* synthetic */ c n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object f15261o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ u7.p<Object, p7.c<Object>, Object> f15262p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MergeKt$mapLatest$1(u7.p<Object, ? super p7.c<Object>, ? extends Object> pVar, p7.c<? super FlowKt__MergeKt$mapLatest$1> cVar) {
        super(3, cVar);
        this.f15262p = pVar;
    }

    @Override // u7.q
    public final Object O(c<Object> cVar, Object obj, p7.c<? super m7.n> cVar2) {
        FlowKt__MergeKt$mapLatest$1 flowKt__MergeKt$mapLatest$1 = new FlowKt__MergeKt$mapLatest$1(this.f15262p, cVar2);
        flowKt__MergeKt$mapLatest$1.n = cVar;
        flowKt__MergeKt$mapLatest$1.f15261o = obj;
        return flowKt__MergeKt$mapLatest$1.k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f15260m;
        if (i10 == 0) {
            m0.b.n1(obj);
            cVar = this.n;
            Object obj2 = this.f15261o;
            this.n = cVar;
            this.f15260m = 1;
            obj = this.f15262p.R(obj2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                m0.b.n1(obj);
                return m7.n.f16010a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            cVar = this.n;
            m0.b.n1(obj);
        }
        this.n = null;
        this.f15260m = 2;
        if (cVar.c(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return m7.n.f16010a;
    }
}
