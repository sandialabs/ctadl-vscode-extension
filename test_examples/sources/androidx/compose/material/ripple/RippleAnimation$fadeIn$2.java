package androidx.compose.material.ripple;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.u0;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import q7.c;
import r.f;
import r.q;
import r.y;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lja/u0;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
@c(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class RippleAnimation$fadeIn$2 extends SuspendLambda implements p<x, p7.c<? super u0>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f2157m;
    public final /* synthetic */ RippleAnimation n;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
    @c(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", f = "RippleAnimation.kt", l = {89}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f2158m;
        public final /* synthetic */ RippleAnimation n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RippleAnimation rippleAnimation, p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.n = rippleAnimation;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass1) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass1(this.n, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f2158m;
            if (i10 != 0) {
                if (i10 == 1) {
                    m0.b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                m0.b.n1(obj);
                androidx.compose.animation.core.a<Float, f> aVar = this.n.f2148g;
                Float f10 = new Float(1.0f);
                y R1 = a1.c.R1(75, q.c, 2);
                this.f2158m = 1;
                if (androidx.compose.animation.core.a.a(aVar, f10, R1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
    @c(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", f = "RippleAnimation.kt", l = {95}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f2159m;
        public final /* synthetic */ RippleAnimation n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RippleAnimation rippleAnimation, p7.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.n = rippleAnimation;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass2) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass2(this.n, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f2159m;
            if (i10 != 0) {
                if (i10 == 1) {
                    m0.b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                m0.b.n1(obj);
                androidx.compose.animation.core.a<Float, f> aVar = this.n.f2149h;
                Float f10 = new Float(1.0f);
                y R1 = a1.c.R1(225, q.f17012a, 2);
                this.f2159m = 1;
                if (androidx.compose.animation.core.a.a(aVar, f10, R1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
    @c(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", l = {101}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f2160m;
        public final /* synthetic */ RippleAnimation n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RippleAnimation rippleAnimation, p7.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.n = rippleAnimation;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass3) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass3(this.n, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f2160m;
            if (i10 != 0) {
                if (i10 == 1) {
                    m0.b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                m0.b.n1(obj);
                androidx.compose.animation.core.a<Float, f> aVar = this.n.f2150i;
                Float f10 = new Float(1.0f);
                y R1 = a1.c.R1(225, q.c, 2);
                this.f2160m = 1;
                if (androidx.compose.animation.core.a.a(aVar, f10, R1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleAnimation$fadeIn$2(RippleAnimation rippleAnimation, p7.c<? super RippleAnimation$fadeIn$2> cVar) {
        super(2, cVar);
        this.n = rippleAnimation;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super u0> cVar) {
        return ((RippleAnimation$fadeIn$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        RippleAnimation$fadeIn$2 rippleAnimation$fadeIn$2 = new RippleAnimation$fadeIn$2(this.n, cVar);
        rippleAnimation$fadeIn$2.f2157m = obj;
        return rippleAnimation$fadeIn$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        x xVar = (x) this.f2157m;
        RippleAnimation rippleAnimation = this.n;
        m0.b.M0(xVar, null, null, new AnonymousClass1(rippleAnimation, null), 3);
        m0.b.M0(xVar, null, null, new AnonymousClass2(rippleAnimation, null), 3);
        return m0.b.M0(xVar, null, null, new AnonymousClass3(rippleAnimation, null), 3);
    }
}
