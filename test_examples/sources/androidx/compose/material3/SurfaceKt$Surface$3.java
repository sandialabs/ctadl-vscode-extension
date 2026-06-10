package androidx.compose.material3;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import d0.h;
import g0.t0;
import g0.v0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import o1.g;
import q0.a;
import u.j;
import u7.p;
import u7.q;
import v0.h0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SurfaceKt$Surface$3 extends Lambda implements p<g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ q0.d f2519j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ h0 f2520k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ long f2521l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ float f2522m;
    public final /* synthetic */ float n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ j f2523o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ boolean f2524p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ u7.a<n> f2525q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2526r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f2527s = 6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$3(q0.d dVar, h0 h0Var, long j2, float f10, int i10, float f11, j jVar, boolean z10, u7.a aVar, ComposableLambdaImpl composableLambdaImpl) {
        super(2);
        this.f2519j = dVar;
        this.f2520k = h0Var;
        this.f2521l = j2;
        this.f2522m = f10;
        this.n = f11;
        this.f2523o = jVar;
        this.f2524p = z10;
        this.f2525q = aVar;
        this.f2526r = composableLambdaImpl;
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        g0.d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        q0.d c = ClickableKt.c(SurfaceKt.c(TouchTargetKt.a(this.f2519j), this.f2520k, SurfaceKt.d(this.f2521l, this.f2522m, dVar2), this.n), this.f2523o, h.a(0.0f, 0L, dVar2, 0, 7), this.f2524p, new g(0), this.f2525q, 8);
        dVar2.f(733328855);
        j1.q c10 = BoxKt.c(a.C0210a.f16812a, true, dVar2);
        dVar2.f(-1323940314);
        b2.b bVar = (b2.b) dVar2.w(CompositionLocalsKt.f3703e);
        LayoutDirection layoutDirection = (LayoutDirection) dVar2.w(CompositionLocalsKt.f3709k);
        j1 j1Var = (j1) dVar2.w(CompositionLocalsKt.f3712o);
        ComposeUiNode.f3400a.getClass();
        u7.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3402b;
        ComposableLambdaImpl a10 = androidx.compose.ui.layout.a.a(c);
        if (dVar2.y() instanceof g0.c) {
            dVar2.r();
            if (dVar2.l()) {
                dVar2.m(aVar);
            } else {
                dVar2.n();
            }
            dVar2.x();
            a1.c.s1(dVar2, c10, ComposeUiNode.Companion.f3404e);
            a1.c.s1(dVar2, bVar, ComposeUiNode.Companion.f3403d);
            a1.c.s1(dVar2, layoutDirection, ComposeUiNode.Companion.f3405f);
            a1.c.s1(dVar2, j1Var, ComposeUiNode.Companion.f3406g);
            dVar2.h();
            a10.O(new v0(dVar2), dVar2, 0);
            dVar2.f(2058660585);
            dVar2.f(-2137368960);
            dVar2.f(-126864234);
            this.f2526r.R(dVar2, Integer.valueOf(this.f2527s & 14));
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
