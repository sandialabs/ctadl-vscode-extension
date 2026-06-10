package androidx.lifecycle;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl$register$1 extends SuspendLambda implements u7.p<ja.x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f5326m;
    public final /* synthetic */ LifecycleCoroutineScopeImpl n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScopeImpl$register$1(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, p7.c<? super LifecycleCoroutineScopeImpl$register$1> cVar) {
        super(2, cVar);
        this.n = lifecycleCoroutineScopeImpl;
    }

    @Override // u7.p
    public final Object R(ja.x xVar, p7.c<? super m7.n> cVar) {
        return ((LifecycleCoroutineScopeImpl$register$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.n, cVar);
        lifecycleCoroutineScopeImpl$register$1.f5326m = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        ja.x xVar = (ja.x) this.f5326m;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.n;
        if (lifecycleCoroutineScopeImpl.f5324i.b().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
            lifecycleCoroutineScopeImpl.f5324i.a(lifecycleCoroutineScopeImpl);
        } else {
            a1.b.r(xVar.j(), null);
        }
        return m7.n.f16010a;
    }
}
