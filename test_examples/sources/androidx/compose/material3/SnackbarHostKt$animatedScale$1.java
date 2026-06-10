package androidx.compose.material3;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import r.f;
import u7.p;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
@q7.c(c = "androidx.compose.material3.SnackbarHostKt$animatedScale$1", f = "SnackbarHost.kt", l = {447}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SnackbarHostKt$animatedScale$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f2430m;
    public final /* synthetic */ androidx.compose.animation.core.a<Float, f> n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ boolean f2431o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ r.d<Float> f2432p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$animatedScale$1(androidx.compose.animation.core.a<Float, f> aVar, boolean z10, r.d<Float> dVar, p7.c<? super SnackbarHostKt$animatedScale$1> cVar) {
        super(2, cVar);
        this.n = aVar;
        this.f2431o = z10;
        this.f2432p = dVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((SnackbarHostKt$animatedScale$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new SnackbarHostKt$animatedScale$1(this.n, this.f2431o, this.f2432p, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        float f10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2430m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            if (this.f2431o) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            Float f11 = new Float(f10);
            this.f2430m = 1;
            if (androidx.compose.animation.core.a.a(this.n, f11, this.f2432p, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}
