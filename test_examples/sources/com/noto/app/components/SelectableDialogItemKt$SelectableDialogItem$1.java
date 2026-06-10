package com.noto.app.components;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TypographyKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.NotoThemeKt;
import e0.r;
import g0.c;
import g0.d;
import g0.p0;
import g0.t0;
import g0.v0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import n6.b;
import q0.a;
import u7.p;
import u7.q;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectableDialogItemKt$SelectableDialogItem$1 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ q0.d f7662j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f7663k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ p<d, Integer, n> f7664l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f7665m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectableDialogItemKt$SelectableDialogItem$1(q0.d dVar, boolean z10, p<? super d, ? super Integer, n> pVar, int i10) {
        super(2);
        this.f7662j = dVar;
        this.f7663k = z10;
        this.f7664l = pVar;
        this.f7665m = i10;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        long s10;
        d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        dVar2.f(2054871046);
        dVar2.u();
        q0.d c12 = a1.c.c1(this.f7662j, ((b) dVar2.w(NotoThemeKt.f7585h)).c);
        dVar2.f(733328855);
        j1.q c = BoxKt.c(a.C0210a.f16812a, false, dVar2);
        dVar2.f(-1323940314);
        b2.b bVar = (b2.b) dVar2.w(CompositionLocalsKt.f3703e);
        LayoutDirection layoutDirection = (LayoutDirection) dVar2.w(CompositionLocalsKt.f3709k);
        j1 j1Var = (j1) dVar2.w(CompositionLocalsKt.f3712o);
        ComposeUiNode.f3400a.getClass();
        u7.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3402b;
        ComposableLambdaImpl a10 = androidx.compose.ui.layout.a.a(c12);
        if (dVar2.y() instanceof c) {
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
            p0[] p0VarArr = new p0[2];
            p0VarArr[0] = TextKt.f2573a.b(((r) dVar2.w(TypographyKt.f2598a)).f10584j);
            g0.r rVar = ContentColorKt.f2305a;
            if (this.f7663k) {
                dVar2.f(-2053972793);
                s10 = ((e0.c) dVar2.w(ColorSchemeKt.f2278a)).m();
            } else {
                dVar2.f(-2053972752);
                s10 = ((e0.c) dVar2.w(ColorSchemeKt.f2278a)).s();
            }
            dVar2.u();
            p0VarArr[1] = rVar.b(new v0.r(s10));
            CompositionLocalKt.a(p0VarArr, this.f7664l, dVar2, ((this.f7665m >> 9) & 112) | 8);
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
