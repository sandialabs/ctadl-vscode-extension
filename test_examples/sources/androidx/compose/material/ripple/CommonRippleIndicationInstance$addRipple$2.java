package androidx.compose.material.ripple;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import q7.c;
import u.m;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
@c(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CommonRippleIndicationInstance$addRipple$2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f2135m;
    public final /* synthetic */ RippleAnimation n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ CommonRippleIndicationInstance f2136o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ m f2137p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRippleIndicationInstance$addRipple$2(RippleAnimation rippleAnimation, CommonRippleIndicationInstance commonRippleIndicationInstance, m mVar, p7.c<? super CommonRippleIndicationInstance$addRipple$2> cVar) {
        super(2, cVar);
        this.n = rippleAnimation;
        this.f2136o = commonRippleIndicationInstance;
        this.f2137p = mVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((CommonRippleIndicationInstance$addRipple$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new CommonRippleIndicationInstance$addRipple$2(this.n, this.f2136o, this.f2137p, cVar);
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2135m;
        m mVar = this.f2137p;
        CommonRippleIndicationInstance commonRippleIndicationInstance = this.f2136o;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    m0.b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                m0.b.n1(obj);
                RippleAnimation rippleAnimation = this.n;
                this.f2135m = 1;
                if (rippleAnimation.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            commonRippleIndicationInstance.f2134f.remove(mVar);
            return n.f16010a;
        } catch (Throwable th) {
            commonRippleIndicationInstance.f2134f.remove(mVar);
            throw th;
        }
    }
}
