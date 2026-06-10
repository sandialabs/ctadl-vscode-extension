package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.g0;
import g0.g1;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import u7.p;
import u7.q;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$4", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ScrollableKt$pointerScrollable$4 extends SuspendLambda implements q<x, Float, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ float f1796m;
    public final /* synthetic */ g0<NestedScrollDispatcher> n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ g1<ScrollingLogic> f1797o;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    @q7.c(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$4$1", f = "Scrollable.kt", l = {258}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$4$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f1798m;
        public final /* synthetic */ g1<ScrollingLogic> n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ float f1799o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g1<ScrollingLogic> g1Var, float f10, p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.n = g1Var;
            this.f1799o = f10;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass1) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass1(this.n, this.f1799o, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f1798m;
            if (i10 == 0) {
                m0.b.n1(obj);
                this.f1798m = 1;
                if (this.n.getValue().c(this.f1799o, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$pointerScrollable$4(g0<NestedScrollDispatcher> g0Var, g1<ScrollingLogic> g1Var, p7.c<? super ScrollableKt$pointerScrollable$4> cVar) {
        super(3, cVar);
        this.n = g0Var;
        this.f1797o = g1Var;
    }

    @Override // u7.q
    public final Object O(x xVar, Float f10, p7.c<? super n> cVar) {
        x xVar2 = xVar;
        float floatValue = f10.floatValue();
        ScrollableKt$pointerScrollable$4 scrollableKt$pointerScrollable$4 = new ScrollableKt$pointerScrollable$4(this.n, this.f1797o, cVar);
        scrollableKt$pointerScrollable$4.f1796m = floatValue;
        return scrollableKt$pointerScrollable$4.k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        float f10 = this.f1796m;
        x k02 = this.n.getValue().f3251a.k0();
        if (k02 != null) {
            m0.b.M0(k02, null, null, new AnonymousClass1(this.f1797o, f10, null), 3);
            return n.f16010a;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
