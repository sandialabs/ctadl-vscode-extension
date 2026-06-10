package com.noto.app.settings;

import androidx.activity.e;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.b;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ShapesKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TypographyKt;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import com.noto.app.NotoThemeKt;
import e0.l;
import g0.h1;
import g0.r0;
import g0.t0;
import g0.v0;
import g0.z0;
import m7.n;
import q0.a;
import q0.b;
import q0.d;
import u1.m;
import u7.p;
import u7.q;
import v0.r;
import v7.g;

/* loaded from: classes.dex */
public final class SettingsSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(d dVar, String str, y0.b bVar, q<? super v.d, ? super g0.d, ? super Integer, n> qVar, g0.d dVar2, int i10, int i11) {
        d.a aVar;
        int i12;
        int i13;
        Object obj;
        int i14;
        int i15;
        int i16;
        Object obj2;
        y0.b bVar2;
        g0.c<?> cVar;
        p<ComposeUiNode, b2.b, n> pVar;
        p<ComposeUiNode, LayoutDirection, n> pVar2;
        p<ComposeUiNode, j1, n> pVar3;
        h1 h1Var;
        h1 h1Var2;
        h1 h1Var3;
        u7.a<ComposeUiNode> aVar2;
        int i17;
        b.a aVar3;
        p<ComposeUiNode, j1.q, n> pVar4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        h1 h1Var4;
        d dVar3;
        String str2;
        y0.b bVar3;
        r0 T;
        g.f(qVar, "content");
        ComposerImpl p10 = dVar2.p(-2087446805);
        int i18 = i11 & 1;
        if (i18 != 0) {
            i12 = i10 | 6;
            aVar = dVar;
        } else if ((i10 & 14) == 0) {
            aVar = dVar;
            if (p10.z(aVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            aVar = dVar;
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            obj = str;
            if (p10.z(obj)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            i15 = i11 & 4;
            if (i15 != 0) {
                i12 |= 128;
            }
            if ((i11 & 8) == 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (p10.z(qVar)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            int i20 = i12;
            if (i15 == 4 && (i20 & 5851) == 1170 && p10.s()) {
                p10.e();
                dVar3 = aVar;
                str2 = obj;
                bVar3 = bVar;
                T = p10.T();
                if (T != null) {
                    T.f11073d = new SettingsSectionKt$SettingsSection$2(dVar3, str2, bVar3, qVar, i10, i11);
                    return;
                }
                return;
            }
            d.a aVar4 = d.a.f16824i;
            if (i18 != 0) {
                aVar = aVar4;
            }
            if (i19 == 0) {
                obj2 = null;
            } else {
                obj2 = obj;
            }
            if (i15 == 0) {
                bVar2 = null;
            } else {
                bVar2 = bVar;
            }
            q<g0.c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
            b.i iVar = androidx.compose.foundation.layout.b.f1998a;
            p10.f(2054871046);
            h1 h1Var5 = NotoThemeKt.f7585h;
            p10.Q(false);
            b.h g10 = androidx.compose.foundation.layout.b.g(((n6.b) p10.w(h1Var5)).c);
            p10.f(-483455358);
            b.a aVar5 = a.C0210a.f16816f;
            j1.q a10 = ColumnKt.a(g10, aVar5, p10);
            p10.f(-1323940314);
            h1 h1Var6 = CompositionLocalsKt.f3703e;
            b2.b bVar4 = (b2.b) p10.w(h1Var6);
            h1 h1Var7 = CompositionLocalsKt.f3709k;
            LayoutDirection layoutDirection = (LayoutDirection) p10.w(h1Var7);
            h1 h1Var8 = CompositionLocalsKt.f3712o;
            j1 j1Var = (j1) p10.w(h1Var8);
            ComposeUiNode.f3400a.getClass();
            u7.a<ComposeUiNode> aVar6 = ComposeUiNode.Companion.f3402b;
            ComposableLambdaImpl a11 = androidx.compose.ui.layout.a.a(aVar);
            int i21 = (((((i20 & 14) << 3) & 112) << 9) & 7168) | 6;
            d dVar4 = aVar;
            cVar = p10.f2640a;
            if (!(cVar instanceof g0.c)) {
                p10.r();
                if (p10.L) {
                    p10.m(aVar6);
                } else {
                    p10.n();
                }
                p10.f2661x = false;
                p<ComposeUiNode, j1.q, n> pVar5 = ComposeUiNode.Companion.f3404e;
                a1.c.s1(p10, a10, pVar5);
                p<ComposeUiNode, b2.b, n> pVar6 = ComposeUiNode.Companion.f3403d;
                a1.c.s1(p10, bVar4, pVar6);
                p<ComposeUiNode, LayoutDirection, n> pVar7 = ComposeUiNode.Companion.f3405f;
                a1.c.s1(p10, layoutDirection, pVar7);
                p<ComposeUiNode, j1, n> pVar8 = ComposeUiNode.Companion.f3406g;
                a1.c.s1(p10, j1Var, pVar8);
                p10.h();
                a11.O(new v0(p10), p10, Integer.valueOf((i21 >> 3) & 112));
                p10.f(2058660585);
                p10.f(-1163856341);
                if (((i21 >> 9) & 14 & 11) == 2 && p10.s()) {
                    p10.e();
                    z12 = false;
                    z13 = true;
                    p10.Q(z12);
                    p10.Q(z12);
                    p10.Q(z13);
                    p10.Q(z12);
                    p10.Q(z12);
                    dVar3 = dVar4;
                    str2 = obj2;
                    bVar3 = bVar2;
                    T = p10.T();
                    if (T != null) {
                    }
                }
                p10.f(1592774671);
                if (obj2 != null) {
                    d c = SizeKt.c(aVar4);
                    p10.f(2054871046);
                    p10.Q(false);
                    d d12 = a1.c.d1(c, ((n6.b) p10.w(h1Var5)).f16107b, 0.0f, 2);
                    b.C0211b c0211b = a.C0210a.f16815e;
                    p10.f(2054871046);
                    p10.Q(false);
                    b.h g11 = androidx.compose.foundation.layout.b.g(((n6.b) p10.w(h1Var5)).c);
                    p10.f(693286680);
                    j1.q a12 = RowKt.a(g11, c0211b, p10);
                    p10.f(-1323940314);
                    b2.b bVar5 = (b2.b) p10.w(h1Var6);
                    LayoutDirection layoutDirection2 = (LayoutDirection) p10.w(h1Var7);
                    j1 j1Var2 = (j1) p10.w(h1Var8);
                    ComposableLambdaImpl a13 = androidx.compose.ui.layout.a.a(d12);
                    if (cVar instanceof g0.c) {
                        p10.r();
                        if (p10.L) {
                            p10.m(aVar6);
                        } else {
                            p10.n();
                        }
                        p10.f2661x = false;
                        a1.c.s1(p10, a12, pVar5);
                        a1.c.s1(p10, bVar5, pVar6);
                        a1.c.s1(p10, layoutDirection2, pVar7);
                        a1.c.s1(p10, j1Var2, pVar8);
                        p10.h();
                        pVar3 = pVar8;
                        h1Var = h1Var8;
                        pVar = pVar6;
                        e.o(0, a13, new v0(p10), p10, 2058660585, -678309503);
                        p10.f(12681120);
                        if (bVar2 != null) {
                            int i22 = (i20 & 112) | 3080;
                            h1Var2 = h1Var7;
                            h1Var4 = h1Var6;
                            IconKt.a(bVar2, obj2, a1.c.Y(aVar4, ((l) p10.w(ShapesKt.f2400a)).f10554a), r.f18133g, p10, i22, 0);
                        } else {
                            h1Var2 = h1Var7;
                            h1Var4 = h1Var6;
                        }
                        p10.Q(false);
                        aVar2 = aVar6;
                        h1Var3 = h1Var4;
                        pVar2 = pVar7;
                        pVar4 = pVar5;
                        i17 = i20;
                        aVar3 = aVar5;
                        TextKt.b(obj2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, p1.p.a(((e0.r) p10.w(TypographyKt.f2598a)).f10584j, 0L, m.f17757q, null, 262139), p10, (i20 >> 3) & 14, 0, 32766);
                        z10 = false;
                        p10.Q(false);
                        p10.Q(false);
                        z11 = true;
                        p10.Q(true);
                        p10.Q(false);
                        p10.Q(false);
                    } else {
                        a1.c.L0();
                        throw null;
                    }
                } else {
                    pVar = pVar6;
                    pVar2 = pVar7;
                    pVar3 = pVar8;
                    h1Var = h1Var8;
                    h1Var2 = h1Var7;
                    h1Var3 = h1Var6;
                    aVar2 = aVar6;
                    i17 = i20;
                    aVar3 = aVar5;
                    pVar4 = pVar5;
                    z10 = false;
                    z11 = true;
                }
                p10.Q(z10);
                d c10 = SizeKt.c(aVar4);
                h1 h1Var9 = ShapesKt.f2400a;
                d P = a1.c.P(a1.c.Y(c10, ((l) p10.w(h1Var9)).f10555b), ((e0.c) p10.w(ColorSchemeKt.f2278a)).u(), ((l) p10.w(h1Var9)).f10555b);
                int i23 = i17 & 7168;
                p10.f(-483455358);
                j1.q a14 = ColumnKt.a(androidx.compose.foundation.layout.b.c, aVar3, p10);
                p10.f(-1323940314);
                b2.b bVar6 = (b2.b) p10.w(h1Var3);
                LayoutDirection layoutDirection3 = (LayoutDirection) p10.w(h1Var2);
                j1 j1Var3 = (j1) p10.w(h1Var);
                ComposableLambdaImpl a15 = androidx.compose.ui.layout.a.a(P);
                int i24 = ((((i23 << 3) & 112) << 9) & 7168) | 6;
                if (cVar instanceof g0.c) {
                    p10.r();
                    if (p10.L) {
                        p10.m(aVar2);
                    } else {
                        p10.n();
                    }
                    p10.f2661x = z10;
                    a1.c.s1(p10, a14, pVar4);
                    a1.c.s1(p10, bVar6, pVar);
                    a1.c.s1(p10, layoutDirection3, pVar2);
                    a1.c.s1(p10, j1Var3, pVar3);
                    p10.h();
                    a15.O(new v0(p10), p10, Integer.valueOf((i24 >> 3) & 112));
                    p10.f(2058660585);
                    p10.f(-1163856341);
                    if (((i24 >> 9) & 14 & 11) == 2 && p10.s()) {
                        p10.e();
                        p10.Q(z10);
                        p10.Q(z10);
                        p10.Q(z11);
                        p10.Q(z10);
                        p10.Q(z10);
                        z12 = z10;
                        z13 = z11;
                        p10.Q(z12);
                        p10.Q(z12);
                        p10.Q(z13);
                        p10.Q(z12);
                        p10.Q(z12);
                        dVar3 = dVar4;
                        str2 = obj2;
                        bVar3 = bVar2;
                        T = p10.T();
                        if (T != null) {
                        }
                    }
                    qVar.O(v.e.f18047a, p10, Integer.valueOf(((i23 >> 6) & 112) | 6));
                    p10.Q(z10);
                    p10.Q(z10);
                    p10.Q(z11);
                    p10.Q(z10);
                    p10.Q(z10);
                    z12 = z10;
                    z13 = z11;
                    p10.Q(z12);
                    p10.Q(z12);
                    p10.Q(z13);
                    p10.Q(z12);
                    p10.Q(z12);
                    dVar3 = dVar4;
                    str2 = obj2;
                    bVar3 = bVar2;
                    T = p10.T();
                    if (T != null) {
                    }
                } else {
                    a1.c.L0();
                    throw null;
                }
            } else {
                a1.c.L0();
                throw null;
            }
        }
        obj = str;
        i15 = i11 & 4;
        if (i15 != 0) {
        }
        if ((i11 & 8) == 0) {
        }
        int i202 = i12;
        if (i15 == 4) {
            p10.e();
            dVar3 = aVar;
            str2 = obj;
            bVar3 = bVar;
            T = p10.T();
            if (T != null) {
            }
        }
        d.a aVar42 = d.a.f16824i;
        if (i18 != 0) {
        }
        if (i19 == 0) {
        }
        if (i15 == 0) {
        }
        q<g0.c<?>, z0, t0, n> qVar22 = ComposerKt.f2737a;
        b.i iVar2 = androidx.compose.foundation.layout.b.f1998a;
        p10.f(2054871046);
        h1 h1Var52 = NotoThemeKt.f7585h;
        p10.Q(false);
        b.h g102 = androidx.compose.foundation.layout.b.g(((n6.b) p10.w(h1Var52)).c);
        p10.f(-483455358);
        b.a aVar52 = a.C0210a.f16816f;
        j1.q a102 = ColumnKt.a(g102, aVar52, p10);
        p10.f(-1323940314);
        h1 h1Var62 = CompositionLocalsKt.f3703e;
        b2.b bVar42 = (b2.b) p10.w(h1Var62);
        h1 h1Var72 = CompositionLocalsKt.f3709k;
        LayoutDirection layoutDirection4 = (LayoutDirection) p10.w(h1Var72);
        h1 h1Var82 = CompositionLocalsKt.f3712o;
        j1 j1Var4 = (j1) p10.w(h1Var82);
        ComposeUiNode.f3400a.getClass();
        u7.a<ComposeUiNode> aVar62 = ComposeUiNode.Companion.f3402b;
        ComposableLambdaImpl a112 = androidx.compose.ui.layout.a.a(aVar);
        int i212 = (((((i202 & 14) << 3) & 112) << 9) & 7168) | 6;
        d dVar42 = aVar;
        cVar = p10.f2640a;
        if (!(cVar instanceof g0.c)) {
        }
    }
}
