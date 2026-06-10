package androidx.lifecycle;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.kt", l = {337}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LifecycleCoroutineScope$launchWhenCreated$1 extends SuspendLambda implements u7.p<ja.x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f5322m;
    public final /* synthetic */ m n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ u7.p<ja.x, p7.c<? super m7.n>, Object> f5323o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleCoroutineScope$launchWhenCreated$1(m mVar, u7.p<? super ja.x, ? super p7.c<? super m7.n>, ? extends Object> pVar, p7.c<? super LifecycleCoroutineScope$launchWhenCreated$1> cVar) {
        super(2, cVar);
        this.n = mVar;
        this.f5323o = pVar;
    }

    @Override // u7.p
    public final Object R(ja.x xVar, p7.c<? super m7.n> cVar) {
        return ((LifecycleCoroutineScope$launchWhenCreated$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new LifecycleCoroutineScope$launchWhenCreated$1(this.n, this.f5323o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f5322m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            Lifecycle a10 = this.n.a();
            this.f5322m = 1;
            Lifecycle.State state = Lifecycle.State.CREATED;
            kotlinx.coroutines.scheduling.b bVar = ja.f0.f12766a;
            if (m0.b.I1(this, kotlinx.coroutines.internal.l.f15491a.W(), new PausingDispatcherKt$whenStateAtLeast$2(a10, state, this.f5323o, null)) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return m7.n.f16010a;
    }
}
