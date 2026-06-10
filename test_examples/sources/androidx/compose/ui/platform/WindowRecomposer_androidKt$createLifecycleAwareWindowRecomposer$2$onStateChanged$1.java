package androidx.compose.ui.platform;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@q7.c(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {391}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends SuspendLambda implements u7.p<ja.x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f3789m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef<q0> f3790o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Recomposer f3791p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.q f3792q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 f3793r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ View f3794s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(Ref$ObjectRef<q0> ref$ObjectRef, Recomposer recomposer, androidx.lifecycle.q qVar, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, p7.c<? super WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1> cVar) {
        super(2, cVar);
        this.f3790o = ref$ObjectRef;
        this.f3791p = recomposer;
        this.f3792q = qVar;
        this.f3793r = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.f3794s = view;
    }

    @Override // u7.p
    public final Object R(ja.x xVar, p7.c<? super m7.n> cVar) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.f3790o, this.f3791p, this.f3792q, this.f3793r, this.f3794s, cVar);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.n = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        ja.u0 u0Var;
        ja.k1 k1Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f3789m;
        WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 = this.f3793r;
        androidx.lifecycle.q qVar = this.f3792q;
        if (i10 != 0) {
            if (i10 == 1) {
                u0Var = (ja.u0) this.n;
                try {
                    m0.b.n1(obj);
                } catch (Throwable th) {
                    th = th;
                    if (u0Var != null) {
                        u0Var.c(null);
                    }
                    qVar.i0().c(windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2);
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            ja.x xVar = (ja.x) this.n;
            try {
                q0 q0Var = this.f3790o.f13060i;
                if (q0Var != null) {
                    Context applicationContext = this.f3794s.getContext().getApplicationContext();
                    v7.g.e(applicationContext, "context.applicationContext");
                    kotlinx.coroutines.flow.u a10 = u1.a(applicationContext);
                    q0Var.f3877i.setValue(Float.valueOf(((Number) a10.getValue()).floatValue()));
                    k1Var = m0.b.M0(xVar, null, null, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(a10, q0Var, null), 3);
                } else {
                    k1Var = null;
                }
            } catch (Throwable th2) {
                th = th2;
                u0Var = null;
            }
            try {
                Recomposer recomposer = this.f3791p;
                this.n = k1Var;
                this.f3789m = 1;
                if (recomposer.F(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                u0Var = k1Var;
            } catch (Throwable th3) {
                u0Var = k1Var;
                th = th3;
                if (u0Var != null) {
                }
                qVar.i0().c(windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2);
                throw th;
            }
        }
        if (u0Var != null) {
            u0Var.c(null);
        }
        qVar.i0().c(windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2);
        return m7.n.f16010a;
    }
}
