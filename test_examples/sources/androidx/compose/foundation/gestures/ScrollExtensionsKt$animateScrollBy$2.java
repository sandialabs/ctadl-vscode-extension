package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;
import m7.n;
import r.d;
import t.i;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lt/i;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScrollExtensionsKt$animateScrollBy$2 extends SuspendLambda implements p<i, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f1776m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ float f1777o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ d<Float> f1778p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Ref$FloatRef f1779q;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "currentValue", "<anonymous parameter 1>", "Lm7/n;", "invoke", "(FF)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements p<Float, Float, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Ref$FloatRef f1780j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ i f1781k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref$FloatRef ref$FloatRef, i iVar) {
            super(2);
            this.f1780j = ref$FloatRef;
            this.f1781k = iVar;
        }

        @Override // u7.p
        public final n R(Float f10, Float f11) {
            float floatValue = f10.floatValue();
            f11.floatValue();
            Ref$FloatRef ref$FloatRef = this.f1780j;
            float f12 = ref$FloatRef.f13057i;
            ref$FloatRef.f13057i = this.f1781k.a(floatValue - f12) + f12;
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$animateScrollBy$2(float f10, d<Float> dVar, Ref$FloatRef ref$FloatRef, p7.c<? super ScrollExtensionsKt$animateScrollBy$2> cVar) {
        super(2, cVar);
        this.f1777o = f10;
        this.f1778p = dVar;
        this.f1779q = ref$FloatRef;
    }

    @Override // u7.p
    public final Object R(i iVar, p7.c<? super n> cVar) {
        return ((ScrollExtensionsKt$animateScrollBy$2) a(iVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.f1777o, this.f1778p, this.f1779q, cVar);
        scrollExtensionsKt$animateScrollBy$2.n = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1776m;
        if (i10 == 0) {
            m0.b.n1(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f1779q, (i) this.n);
            this.f1776m = 1;
            if (SuspendAnimationKt.b(this.f1777o, this.f1778p, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            m0.b.n1(obj);
        }
        return n.f16010a;
    }
}
