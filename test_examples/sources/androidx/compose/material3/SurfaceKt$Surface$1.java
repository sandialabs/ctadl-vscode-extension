package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.t0;
import g0.v0;
import g0.z0;
import g1.v;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m7.n;
import o1.o;
import q0.a;
import u7.l;
import u7.p;
import u7.q;
import v0.h0;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SurfaceKt$Surface$1 extends Lambda implements p<g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ q0.d f2512j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ h0 f2513k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ long f2514l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ float f2515m;
    public final /* synthetic */ int n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ float f2516o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2517p;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
    /* renamed from: androidx.compose.material3.SurfaceKt$Surface$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements l<o, n> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass1 f2518j = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // u7.l
        public final n U(o oVar) {
            g.f(oVar, "$this$semantics");
            return n.f16010a;
        }
    }

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
    @q7.c(c = "androidx.compose.material3.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SurfaceKt$Surface$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends SuspendLambda implements p<v, p7.c<? super n>, Object> {
        public AnonymousClass2(p7.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // u7.p
        public final Object R(v vVar, p7.c<? super n> cVar) {
            v vVar2 = vVar;
            new AnonymousClass2(cVar);
            n nVar = n.f16010a;
            m0.b.n1(nVar);
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass2(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            m0.b.n1(obj);
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$1(q0.d dVar, h0 h0Var, long j2, float f10, int i10, float f11, ComposableLambdaImpl composableLambdaImpl) {
        super(2);
        this.f2512j = dVar;
        this.f2513k = h0Var;
        this.f2514l = j2;
        this.f2515m = f10;
        this.n = i10;
        this.f2516o = f11;
        this.f2517p = composableLambdaImpl;
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        g0.d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        q0.d b5 = SuspendingPointerInputFilterKt.b(m0.b.j1(SurfaceKt.c(this.f2512j, this.f2513k, SurfaceKt.d(this.f2514l, this.f2515m, dVar2), this.f2516o), false, AnonymousClass1.f2518j), n.f16010a, new AnonymousClass2(null));
        dVar2.f(733328855);
        j1.q c = BoxKt.c(a.C0210a.f16812a, true, dVar2);
        dVar2.f(-1323940314);
        b2.b bVar = (b2.b) dVar2.w(CompositionLocalsKt.f3703e);
        LayoutDirection layoutDirection = (LayoutDirection) dVar2.w(CompositionLocalsKt.f3709k);
        j1 j1Var = (j1) dVar2.w(CompositionLocalsKt.f3712o);
        ComposeUiNode.f3400a.getClass();
        u7.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3402b;
        ComposableLambdaImpl a10 = androidx.compose.ui.layout.a.a(b5);
        if (dVar2.y() instanceof g0.c) {
            dVar2.r();
            if (dVar2.l()) {
                dVar2.m(aVar);
            } else {
                dVar2.n();
            }
            dVar2.x();
            a1.c.s1(dVar2, c, ComposeUiNode.Companion.f3404e);
            a1.c.s1(dVar2, bVar, ComposeUiNode.Companion.f3403d);
            a1.c.s1(dVar2, layoutDirection, ComposeUiNode.Companion.f3405f);
            a1.c.s1(dVar2, j1Var, ComposeUiNode.Companion.f3406g);
            dVar2.h();
            a10.O(new v0(dVar2), dVar2, 0);
            dVar2.f(2058660585);
            dVar2.f(-2137368960);
            dVar2.f(1703151929);
            this.f2517p.R(dVar2, Integer.valueOf((this.n >> 21) & 14));
            dVar2.u();
            dVar2.u();
            dVar2.u();
            dVar2.v();
            dVar2.u();
            dVar2.u();
            return n.f16010a;
        }
        a1.c.L0();
        throw null;
    }
}
