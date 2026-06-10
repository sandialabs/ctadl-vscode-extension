package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.Lifecycle;
import com.noto.R;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$b;", "it", "Lm7/n;", "invoke", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class WrappedComposition$setContent$1 extends Lambda implements u7.l<AndroidComposeView.b, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ WrappedComposition f3810j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ u7.p<g0.d, Integer, m7.n> f3811k;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "(Lg0/d;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.p<g0.d, Integer, m7.n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ WrappedComposition f3812j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ u7.p<g0.d, Integer, m7.n> f3813k;

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
        @q7.c(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", f = "Wrapper.android.kt", l = {153}, m = "invokeSuspend")
        /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        final class C00251 extends SuspendLambda implements u7.p<ja.x, p7.c<? super m7.n>, Object> {

            /* renamed from: m  reason: collision with root package name */
            public int f3814m;
            public final /* synthetic */ WrappedComposition n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00251(WrappedComposition wrappedComposition, p7.c<? super C00251> cVar) {
                super(2, cVar);
                this.n = wrappedComposition;
            }

            @Override // u7.p
            public final Object R(ja.x xVar, p7.c<? super m7.n> cVar) {
                return ((C00251) a(xVar, cVar)).k(m7.n.f16010a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
                return new C00251(this.n, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object k(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f3814m;
                if (i10 != 0) {
                    if (i10 == 1) {
                        m0.b.n1(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    AndroidComposeView androidComposeView = this.n.f3805i;
                    this.f3814m = 1;
                    Object a10 = androidComposeView.f3561e0.a(this);
                    if (a10 != coroutineSingletons) {
                        a10 = m7.n.f16010a;
                    }
                    if (a10 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return m7.n.f16010a;
            }
        }

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
        @q7.c(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2", f = "Wrapper.android.kt", l = {154}, m = "invokeSuspend")
        /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass2 extends SuspendLambda implements u7.p<ja.x, p7.c<? super m7.n>, Object> {

            /* renamed from: m  reason: collision with root package name */
            public int f3815m;
            public final /* synthetic */ WrappedComposition n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(WrappedComposition wrappedComposition, p7.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.n = wrappedComposition;
            }

            @Override // u7.p
            public final Object R(ja.x xVar, p7.c<? super m7.n> cVar) {
                return ((AnonymousClass2) a(xVar, cVar)).k(m7.n.f16010a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
                return new AnonymousClass2(this.n, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object k(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f3815m;
                if (i10 != 0) {
                    if (i10 == 1) {
                        m0.b.n1(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    AndroidComposeView androidComposeView = this.n.f3805i;
                    this.f3815m = 1;
                    Object j2 = androidComposeView.f3588u.j(this);
                    if (j2 != coroutineSingletons) {
                        j2 = m7.n.f16010a;
                    }
                    if (j2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return m7.n.f16010a;
            }
        }

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$3  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass3 extends Lambda implements u7.p<g0.d, Integer, m7.n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ WrappedComposition f3816j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ u7.p<g0.d, Integer, m7.n> f3817k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass3(WrappedComposition wrappedComposition, u7.p<? super g0.d, ? super Integer, m7.n> pVar) {
                super(2);
                this.f3816j = wrappedComposition;
                this.f3817k = pVar;
            }

            @Override // u7.p
            public final m7.n R(g0.d dVar, Integer num) {
                g0.d dVar2 = dVar;
                if ((num.intValue() & 11) == 2 && dVar2.s()) {
                    dVar2.e();
                    return m7.n.f16010a;
                }
                u7.q<g0.c<?>, g0.z0, g0.t0, m7.n> qVar = ComposerKt.f2737a;
                AndroidCompositionLocals_androidKt.a(this.f3816j.f3805i, this.f3817k, dVar2, 8);
                return m7.n.f16010a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(WrappedComposition wrappedComposition, u7.p<? super g0.d, ? super Integer, m7.n> pVar) {
            super(2);
            this.f3812j = wrappedComposition;
            this.f3813k = pVar;
        }

        @Override // u7.p
        public final m7.n R(g0.d dVar, Integer num) {
            boolean z10;
            Set set;
            View view;
            Object obj;
            boolean z11;
            g0.d dVar2 = dVar;
            if ((num.intValue() & 11) == 2 && dVar2.s()) {
                dVar2.e();
                return m7.n.f16010a;
            }
            u7.q<g0.c<?>, g0.z0, g0.t0, m7.n> qVar = ComposerKt.f2737a;
            WrappedComposition wrappedComposition = this.f3812j;
            Object tag = wrappedComposition.f3805i.getTag(R.id.inspection_slot_table_set);
            if ((tag instanceof Set) && (!(tag instanceof w7.a) || (tag instanceof w7.d))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                set = (Set) tag;
            } else {
                set = null;
            }
            AndroidComposeView androidComposeView = wrappedComposition.f3805i;
            if (set == null) {
                ViewParent parent = androidComposeView.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
                if (view != null) {
                    obj = view.getTag(R.id.inspection_slot_table_set);
                } else {
                    obj = null;
                }
                if ((obj instanceof Set) && (!(obj instanceof w7.a) || (obj instanceof w7.d))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    set = (Set) obj;
                } else {
                    set = null;
                }
            }
            if (set != null) {
                set.add(dVar2.i());
                dVar2.a();
            }
            g0.s.c(androidComposeView, new C00251(wrappedComposition, null), dVar2);
            g0.s.c(androidComposeView, new AnonymousClass2(wrappedComposition, null), dVar2);
            CompositionLocalKt.a(new g0.p0[]{InspectionTablesKt.f2983a.b(set)}, a1.c.i0(dVar2, -1193460702, new AnonymousClass3(wrappedComposition, this.f3813k)), dVar2, 56);
            return m7.n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WrappedComposition$setContent$1(WrappedComposition wrappedComposition, u7.p<? super g0.d, ? super Integer, m7.n> pVar) {
        super(1);
        this.f3810j = wrappedComposition;
        this.f3811k = pVar;
    }

    @Override // u7.l
    public final m7.n U(AndroidComposeView.b bVar) {
        boolean z10;
        AndroidComposeView.b bVar2 = bVar;
        v7.g.f(bVar2, "it");
        WrappedComposition wrappedComposition = this.f3810j;
        if (!wrappedComposition.f3807k) {
            androidx.lifecycle.r i02 = bVar2.f3601a.i0();
            v7.g.e(i02, "it.lifecycleOwner.lifecycle");
            u7.p<g0.d, Integer, m7.n> pVar = this.f3811k;
            wrappedComposition.f3809m = pVar;
            if (wrappedComposition.f3808l == null) {
                wrappedComposition.f3808l = i02;
                i02.a(wrappedComposition);
            } else {
                if (i02.f5413d.compareTo(Lifecycle.State.CREATED) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    wrappedComposition.f3806j.j(a1.c.j0(-2000640158, new AnonymousClass1(wrappedComposition, pVar), true));
                }
            }
        }
        return m7.n.f16010a;
    }
}
