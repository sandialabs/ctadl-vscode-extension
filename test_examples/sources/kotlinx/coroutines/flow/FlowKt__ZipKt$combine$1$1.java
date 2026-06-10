package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/flow/c;", "", "", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {33, 33}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FlowKt__ZipKt$combine$1$1 extends SuspendLambda implements u7.q<c<Object>, Object[], p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f15317m;
    public /* synthetic */ c n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object[] f15318o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ u7.q<Object, Object, p7.c<Object>, Object> f15319p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$1$1(u7.q<Object, Object, ? super p7.c<Object>, ? extends Object> qVar, p7.c<? super FlowKt__ZipKt$combine$1$1> cVar) {
        super(3, cVar);
        this.f15319p = qVar;
    }

    @Override // u7.q
    public final Object O(c<Object> cVar, Object[] objArr, p7.c<? super m7.n> cVar2) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.f15319p, cVar2);
        flowKt__ZipKt$combine$1$1.n = cVar;
        flowKt__ZipKt$combine$1$1.f15318o = objArr;
        return flowKt__ZipKt$combine$1$1.k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f15317m;
        if (i10 == 0) {
            m0.b.n1(obj);
            cVar = this.n;
            Object[] objArr = this.f15318o;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.n = cVar;
            this.f15317m = 1;
            obj = this.f15319p.O(obj2, obj3, this);
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
        this.f15317m = 2;
        if (cVar.c(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return m7.n.f16010a;
    }
}
