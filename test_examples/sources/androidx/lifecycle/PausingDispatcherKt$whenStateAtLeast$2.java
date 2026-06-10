package androidx.lifecycle;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.Lifecycle;
import ja.u0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lja/x;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {203}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements u7.p<ja.x, p7.c<Object>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f5343m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Lifecycle f5344o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f5345p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ u7.p<ja.x, p7.c<Object>, Object> f5346q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, u7.p<? super ja.x, ? super p7.c<Object>, ? extends Object> pVar, p7.c<? super PausingDispatcherKt$whenStateAtLeast$2> cVar) {
        super(2, cVar);
        this.f5344o = lifecycle;
        this.f5345p = state;
        this.f5346q = pVar;
    }

    @Override // u7.p
    public final Object R(ja.x xVar, p7.c<Object> cVar) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.f5344o, this.f5345p, this.f5346q, cVar);
        pausingDispatcherKt$whenStateAtLeast$2.n = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        l lVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f5343m;
        if (i10 == 0) {
            m0.b.n1(obj);
            CoroutineContext j2 = ((ja.x) this.n).j();
            int i11 = u0.c;
            u0 u0Var = (u0) j2.a(u0.b.f12806i);
            if (u0Var == null) {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
            y yVar = new y();
            l lVar2 = new l(this.f5344o, this.f5345p, yVar.f5424k, u0Var);
            try {
                u7.p<ja.x, p7.c<Object>, Object> pVar = this.f5346q;
                this.n = lVar2;
                this.f5343m = 1;
                obj = m0.b.I1(this, yVar, pVar);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lVar = lVar2;
            } catch (Throwable th) {
                th = th;
                lVar = lVar2;
                lVar.a();
                throw th;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            lVar = (l) this.n;
            try {
                m0.b.n1(obj);
            } catch (Throwable th2) {
                th = th2;
                lVar.a();
                throw th;
            }
        }
        lVar.a();
        return obj;
    }
}
