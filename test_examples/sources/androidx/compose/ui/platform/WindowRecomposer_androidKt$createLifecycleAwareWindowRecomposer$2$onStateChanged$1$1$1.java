package androidx.compose.ui.platform;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@q7.c(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {386}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 extends SuspendLambda implements u7.p<ja.x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f3795m;
    public final /* synthetic */ kotlinx.coroutines.flow.u<Float> n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ q0 f3796o;

    /* loaded from: classes.dex */
    public static final class a implements kotlinx.coroutines.flow.c<Float> {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ q0 f3797i;

        public a(q0 q0Var) {
            this.f3797i = q0Var;
        }

        @Override // kotlinx.coroutines.flow.c
        public final Object c(Float f10, p7.c cVar) {
            this.f3797i.f3877i.setValue(Float.valueOf(f10.floatValue()));
            return m7.n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(kotlinx.coroutines.flow.u<Float> uVar, q0 q0Var, p7.c<? super WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1> cVar) {
        super(2, cVar);
        this.n = uVar;
        this.f3796o = q0Var;
    }

    @Override // u7.p
    public final Object R(ja.x xVar, p7.c<? super m7.n> cVar) {
        ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1) a(xVar, cVar)).k(m7.n.f16010a);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(this.n, this.f3796o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f3795m;
        if (i10 == 0) {
            m0.b.n1(obj);
            a aVar = new a(this.f3796o);
            this.f3795m = 1;
            if (this.n.a(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            m0.b.n1(obj);
        }
        throw new KotlinNothingValueException();
    }
}
