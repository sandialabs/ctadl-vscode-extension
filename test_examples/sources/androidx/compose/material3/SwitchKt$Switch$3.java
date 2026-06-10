package androidx.compose.material3;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.p;
import g0.q;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m7.n;
import r.f;
import r.y;
import u7.l;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchKt$Switch$3 extends Lambda implements l<q, p> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ androidx.compose.animation.core.a<Float, f> f2545j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ float f2546k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ x f2547l;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
    @q7.c(c = "androidx.compose.material3.SwitchKt$Switch$3$1", f = "Switch.kt", l = {125}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SwitchKt$Switch$3$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends SuspendLambda implements u7.p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f2548m;
        public final /* synthetic */ androidx.compose.animation.core.a<Float, f> n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ float f2549o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(androidx.compose.animation.core.a<Float, f> aVar, float f10, p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.n = aVar;
            this.f2549o = f10;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass1) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass1(this.n, this.f2549o, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f2548m;
            if (i10 != 0) {
                if (i10 == 1) {
                    m0.b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                m0.b.n1(obj);
                Float f10 = new Float(this.f2549o);
                y<Float> yVar = SwitchKt.f2542f;
                this.f2548m = 1;
                if (androidx.compose.animation.core.a.a(this.n, f10, yVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$3(androidx.compose.animation.core.a<Float, f> aVar, float f10, x xVar) {
        super(1);
        this.f2545j = aVar;
        this.f2546k = f10;
        this.f2547l = xVar;
    }

    @Override // u7.l
    public final p U(q qVar) {
        boolean z10;
        g.f(qVar, "$this$DisposableEffect");
        androidx.compose.animation.core.a<Float, f> aVar = this.f2545j;
        float floatValue = ((Number) aVar.f1356e.getValue()).floatValue();
        float f10 = this.f2546k;
        if (floatValue == f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            m0.b.M0(this.f2547l, null, null, new AnonymousClass1(aVar, f10, null), 3);
        }
        return new e0.p();
    }
}
