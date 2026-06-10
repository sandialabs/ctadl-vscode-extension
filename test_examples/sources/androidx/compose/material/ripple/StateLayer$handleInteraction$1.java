package androidx.compose.material.ripple;

import androidx.datastore.preferences.PreferencesProto$Value;
import d0.j;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import q7.c;
import r.d;
import r.f;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
@c(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", l = {275}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class StateLayer$handleInteraction$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f2166m;
    public final /* synthetic */ j n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ float f2167o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ d<Float> f2168p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateLayer$handleInteraction$1(j jVar, float f10, d<Float> dVar, p7.c<? super StateLayer$handleInteraction$1> cVar) {
        super(2, cVar);
        this.n = jVar;
        this.f2167o = f10;
        this.f2168p = dVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((StateLayer$handleInteraction$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new StateLayer$handleInteraction$1(this.n, this.f2167o, this.f2168p, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2166m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            androidx.compose.animation.core.a<Float, f> aVar = this.n.c;
            Float f10 = new Float(this.f2167o);
            this.f2166m = 1;
            if (androidx.compose.animation.core.a.a(aVar, f10, this.f2168p, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}
