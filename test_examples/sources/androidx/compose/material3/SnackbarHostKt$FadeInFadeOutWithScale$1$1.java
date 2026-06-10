package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import e0.h;
import e0.m;
import g0.d;
import g0.g1;
import g0.s;
import g0.t0;
import g0.v0;
import g0.z0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import q0.a;
import q0.d;
import r.l;
import r.q;
import r.y;
import u7.p;
import u7.q;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarHostKt$FadeInFadeOutWithScale$1$1 extends Lambda implements q<p<? super g0.d, ? super Integer, ? extends n>, g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ m f2404j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ m f2405k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ List<m> f2406l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ h<m> f2407m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$1$1(m mVar, m mVar2, ArrayList arrayList, h hVar) {
        super(3);
        this.f2404j = mVar;
        this.f2405k = mVar2;
        this.f2406l = arrayList;
        this.f2407m = hVar;
    }

    @Override // u7.q
    public final n O(p<? super g0.d, ? super Integer, ? extends n> pVar, g0.d dVar, Integer num) {
        int i10;
        int i11;
        float f10;
        int i12;
        p<? super g0.d, ? super Integer, ? extends n> pVar2 = pVar;
        g0.d dVar2 = dVar;
        int intValue = num.intValue();
        g.f(pVar2, "children");
        if ((intValue & 14) == 0) {
            if (dVar2.z(pVar2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            intValue |= i12;
        }
        if ((intValue & 91) == 18 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        m mVar = this.f2405k;
        m mVar2 = this.f2404j;
        boolean a10 = g.a(mVar2, mVar);
        if (a10) {
            i10 = 150;
        } else {
            i10 = 75;
        }
        if (a10 && kotlin.collections.c.l2(this.f2406l).size() != 1) {
            i11 = 75;
        } else {
            i11 = 0;
        }
        q.a aVar = r.q.c;
        g.f(aVar, "easing");
        y yVar = new y(i10, i11, aVar);
        SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1 snackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1 = new SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1(mVar2, this.f2407m);
        dVar2.f(1431889134);
        dVar2.f(-492369756);
        Object g10 = dVar2.g();
        Object obj = d.a.f11039a;
        float f11 = 1.0f;
        if (g10 == obj) {
            if (!a10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            g10 = a1.c.h(f10);
            dVar2.q(g10);
        }
        dVar2.u();
        androidx.compose.animation.core.a aVar2 = (androidx.compose.animation.core.a) g10;
        s.c(Boolean.valueOf(a10), new SnackbarHostKt$animatedOpacity$2(aVar2, a10, yVar, snackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1, null), dVar2);
        g1 g1Var = aVar2.c;
        dVar2.u();
        l lVar = r.q.f17012a;
        g.f(lVar, "easing");
        y yVar2 = new y(i10, i11, lVar);
        dVar2.f(1966809761);
        dVar2.f(-492369756);
        Object g11 = dVar2.g();
        if (g11 == obj) {
            if (a10) {
                f11 = 0.8f;
            }
            g11 = a1.c.h(f11);
            dVar2.q(g11);
        }
        dVar2.u();
        androidx.compose.animation.core.a aVar3 = (androidx.compose.animation.core.a) g11;
        s.c(Boolean.valueOf(a10), new SnackbarHostKt$animatedScale$1(aVar3, a10, yVar2, null), dVar2);
        g1 g1Var2 = aVar3.c;
        dVar2.u();
        q0.d I0 = a1.c.I0(d.a.f16824i, ((Number) g1Var2.getValue()).floatValue(), ((Number) g1Var2.getValue()).floatValue(), ((Number) g1Var.getValue()).floatValue(), null, false, 65528);
        dVar2.f(1157296644);
        boolean z10 = dVar2.z(mVar2);
        Object g12 = dVar2.g();
        if (z10 || g12 == obj) {
            g12 = new SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1(mVar2);
            dVar2.q(g12);
        }
        dVar2.u();
        q0.d j12 = m0.b.j1(I0, false, (u7.l) g12);
        dVar2.f(733328855);
        j1.q c = BoxKt.c(a.C0210a.f16812a, false, dVar2);
        dVar2.f(-1323940314);
        b2.b bVar = (b2.b) dVar2.w(CompositionLocalsKt.f3703e);
        LayoutDirection layoutDirection = (LayoutDirection) dVar2.w(CompositionLocalsKt.f3709k);
        j1 j1Var = (j1) dVar2.w(CompositionLocalsKt.f3712o);
        ComposeUiNode.f3400a.getClass();
        u7.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f3402b;
        ComposableLambdaImpl a11 = androidx.compose.ui.layout.a.a(j12);
        if (dVar2.y() instanceof g0.c) {
            dVar2.r();
            if (dVar2.l()) {
                dVar2.m(aVar4);
            } else {
                dVar2.n();
            }
            dVar2.x();
            a1.c.s1(dVar2, c, ComposeUiNode.Companion.f3404e);
            a1.c.s1(dVar2, bVar, ComposeUiNode.Companion.f3403d);
            a1.c.s1(dVar2, layoutDirection, ComposeUiNode.Companion.f3405f);
            a1.c.s1(dVar2, j1Var, ComposeUiNode.Companion.f3406g);
            dVar2.h();
            a11.O(new v0(dVar2), dVar2, 0);
            dVar2.f(2058660585);
            dVar2.f(-2137368960);
            dVar2.f(-208740163);
            pVar2.R(dVar2, Integer.valueOf(intValue & 14));
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
