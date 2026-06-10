package com.noto.app.settings;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.b;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.ScreenBrightnessLevel;
import com.noto.app.util.ModelUtilsKt;
import g0.d;
import g0.t0;
import g0.v0;
import g0.z0;
import java.text.NumberFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import q0.a;
import q0.b;
import q0.d;
import u7.p;
import u7.q;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScreenBrightnessLevelDialogFragment$onCreateView$1$1$1$1$1$2 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ScreenBrightnessLevel f9474j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ NumberFormat f9475k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenBrightnessLevelDialogFragment$onCreateView$1$1$1$1$1$2(ScreenBrightnessLevel screenBrightnessLevel, NumberFormat numberFormat) {
        super(2);
        this.f9474j = screenBrightnessLevel;
        this.f9475k = numberFormat;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        d dVar2;
        d dVar3 = dVar;
        if ((num.intValue() & 11) == 2 && dVar3.s()) {
            dVar3.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        q0.d c = SizeKt.c(d.a.f16824i);
        b.f fVar = androidx.compose.foundation.layout.b.f2002f;
        b.C0211b c0211b = a.C0210a.f16815e;
        dVar3.f(693286680);
        j1.q a10 = RowKt.a(fVar, c0211b, dVar3);
        dVar3.f(-1323940314);
        b2.b bVar = (b2.b) dVar3.w(CompositionLocalsKt.f3703e);
        LayoutDirection layoutDirection = (LayoutDirection) dVar3.w(CompositionLocalsKt.f3709k);
        j1 j1Var = (j1) dVar3.w(CompositionLocalsKt.f3712o);
        ComposeUiNode.f3400a.getClass();
        u7.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3402b;
        ComposableLambdaImpl a11 = androidx.compose.ui.layout.a.a(c);
        if (dVar3.y() instanceof g0.c) {
            dVar3.r();
            if (dVar3.l()) {
                dVar3.m(aVar);
            } else {
                dVar3.n();
            }
            dVar3.x();
            a1.c.s1(dVar3, a10, ComposeUiNode.Companion.f3404e);
            a1.c.s1(dVar3, bVar, ComposeUiNode.Companion.f3403d);
            a1.c.s1(dVar3, layoutDirection, ComposeUiNode.Companion.f3405f);
            a1.c.s1(dVar3, j1Var, ComposeUiNode.Companion.f3406g);
            dVar3.h();
            a11.O(new v0(dVar3), dVar3, 0);
            dVar3.f(2058660585);
            dVar3.f(-678309503);
            ScreenBrightnessLevel screenBrightnessLevel = this.f9474j;
            TextKt.b(ModelUtilsKt.b(screenBrightnessLevel, dVar3), a4.b.x(), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, dVar3, 0, 0, 65532);
            dVar3.f(1674383359);
            if (screenBrightnessLevel != ScreenBrightnessLevel.System) {
                dVar3.f(1157296644);
                boolean z10 = dVar3.z(screenBrightnessLevel);
                Object g10 = dVar3.g();
                if (z10 || g10 == d.a.f11039a) {
                    g10 = this.f9475k.format(Float.valueOf(screenBrightnessLevel.f8219i));
                    dVar3.q(g10);
                }
                dVar3.u();
                String str = (String) g10;
                g.e(str, "percentage");
                dVar2 = dVar3;
                TextKt.b(str, null, ((e0.c) dVar3.w(ColorSchemeKt.f2278a)).s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, dVar2, 0, 0, 65530);
            } else {
                dVar2 = dVar3;
            }
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
