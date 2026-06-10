package com.noto.app.settings.general;

import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.b;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TypographyKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.NotoThemeKt;
import com.noto.app.domain.model.Language;
import com.noto.app.util.ModelUtilsKt;
import e0.r;
import g0.c;
import g0.d;
import g0.h1;
import g0.p0;
import g0.t0;
import g0.v0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import q0.a;
import q0.d;
import u7.p;
import u7.q;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LanguageDialogFragment$onCreateView$1$1$1$1$1$2 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Language f9758j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageDialogFragment$onCreateView$1$1$1$1$1$2(Language language) {
        super(2);
        this.f9758j = language;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        d.a aVar;
        Language language;
        h1 h1Var;
        g0.d dVar2;
        g0.d dVar3;
        g0.d dVar4 = dVar;
        if ((num.intValue() & 11) == 2 && dVar4.s()) {
            dVar4.e();
            return n.f16010a;
        }
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        d.a aVar2 = d.a.f16824i;
        q0.d c = SizeKt.c(aVar2);
        b.f fVar = b.f2002f;
        dVar4.f(693286680);
        j1.q a10 = RowKt.a(fVar, a.C0210a.f16814d, dVar4);
        dVar4.f(-1323940314);
        h1 h1Var2 = CompositionLocalsKt.f3703e;
        b2.b bVar = (b2.b) dVar4.w(h1Var2);
        h1 h1Var3 = CompositionLocalsKt.f3709k;
        LayoutDirection layoutDirection = (LayoutDirection) dVar4.w(h1Var3);
        h1 h1Var4 = CompositionLocalsKt.f3712o;
        j1 j1Var = (j1) dVar4.w(h1Var4);
        ComposeUiNode.f3400a.getClass();
        u7.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f3402b;
        ComposableLambdaImpl a11 = androidx.compose.ui.layout.a.a(c);
        if (dVar4.y() instanceof c) {
            dVar4.r();
            if (dVar4.l()) {
                dVar4.m(aVar3);
            } else {
                dVar4.n();
            }
            dVar4.x();
            p<ComposeUiNode, j1.q, n> pVar = ComposeUiNode.Companion.f3404e;
            a1.c.s1(dVar4, a10, pVar);
            p<ComposeUiNode, b2.b, n> pVar2 = ComposeUiNode.Companion.f3403d;
            a1.c.s1(dVar4, bVar, pVar2);
            p<ComposeUiNode, LayoutDirection, n> pVar3 = ComposeUiNode.Companion.f3405f;
            a1.c.s1(dVar4, layoutDirection, pVar3);
            p<ComposeUiNode, j1, n> pVar4 = ComposeUiNode.Companion.f3406g;
            a1.c.s1(dVar4, j1Var, pVar4);
            dVar4.h();
            a11.O(new v0(dVar4), dVar4, 0);
            dVar4.f(2058660585);
            dVar4.f(-678309503);
            q0.d x3 = a4.b.x();
            dVar4.f(2054871046);
            h1 h1Var5 = NotoThemeKt.f7585h;
            dVar4.u();
            b.h g10 = b.g(((n6.b) dVar4.w(h1Var5)).f16106a);
            dVar4.f(-483455358);
            j1.q a12 = ColumnKt.a(g10, a.C0210a.f16816f, dVar4);
            dVar4.f(-1323940314);
            b2.b bVar2 = (b2.b) dVar4.w(h1Var2);
            LayoutDirection layoutDirection2 = (LayoutDirection) dVar4.w(h1Var3);
            j1 j1Var2 = (j1) dVar4.w(h1Var4);
            ComposableLambdaImpl a13 = androidx.compose.ui.layout.a.a(x3);
            if (dVar4.y() instanceof c) {
                dVar4.r();
                if (dVar4.l()) {
                    dVar4.m(aVar3);
                } else {
                    dVar4.n();
                }
                dVar4.x();
                a1.c.s1(dVar4, a12, pVar);
                a1.c.s1(dVar4, bVar2, pVar2);
                a1.c.s1(dVar4, layoutDirection2, pVar3);
                a1.c.s1(dVar4, j1Var2, pVar4);
                dVar4.h();
                a13.O(new v0(dVar4), dVar4, 0);
                dVar4.f(2058660585);
                dVar4.f(-1163856341);
                h1 h1Var6 = AndroidCompositionLocals_androidKt.f3656b;
                Language language2 = this.f9758j;
                CompositionLocalKt.a(new p0[]{h1Var6.b(ModelUtilsKt.G(language2, dVar4))}, a1.c.i0(dVar4, -525714402, new LanguageDialogFragment$onCreateView$1$1$1$1$1$2$1$1$1(language2)), dVar4, 56);
                dVar4.f(183732847);
                if (language2 != Language.System) {
                    language = language2;
                    aVar = aVar2;
                    h1Var = h1Var5;
                    dVar2 = dVar4;
                    TextKt.b(ModelUtilsKt.a(language2, dVar4), null, ((e0.c) dVar4.w(ColorSchemeKt.f2278a)).s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((r) dVar4.w(TypographyKt.f2598a)).n, dVar2, 0, 0, 32762);
                } else {
                    aVar = aVar2;
                    language = language2;
                    h1Var = h1Var5;
                    dVar2 = dVar4;
                }
                dVar2.u();
                dVar2.u();
                dVar2.u();
                dVar2.v();
                dVar2.u();
                dVar2.u();
                g0.d dVar5 = dVar2;
                dVar5.f(1878535339);
                if (Language.f8182i.contains(language)) {
                    dVar5.f(2054871046);
                    dVar5.u();
                    a1.c.w(SizeKt.e(aVar, ((n6.b) dVar5.w(h1Var)).c), dVar5);
                    dVar3 = dVar5;
                    TextKt.b(m0.b.m1(R.string.not_finished, dVar5), null, ((e0.c) dVar5.w(ColorSchemeKt.f2278a)).s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, dVar3, 0, 0, 65530);
                } else {
                    dVar3 = dVar5;
                }
                dVar3.u();
                dVar3.u();
                dVar3.u();
                dVar3.v();
                dVar3.u();
                dVar3.u();
                return n.f16010a;
            }
            a1.c.L0();
            throw null;
        }
        a1.c.L0();
        throw null;
    }
}
