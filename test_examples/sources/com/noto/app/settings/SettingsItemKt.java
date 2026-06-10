package com.noto.app.settings;

import a2.f;
import androidx.activity.e;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SizeModifier;
import androidx.compose.foundation.layout.b;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TypographyKt;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import com.noto.app.settings.b;
import e0.r;
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
import v0.c0;
import v7.g;

/* loaded from: classes.dex */
public final class SettingsItemKt {
    /* JADX WARN: Code restructure failed: missing block: B:97:0x012d, code lost:
        r5 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, b bVar, u7.a<n> aVar, d dVar, long j2, y0.b bVar2, long j10, String str2, g0.d dVar2, int i10, int i11) {
        int i12;
        d.a aVar2;
        long j11;
        int i13;
        int i14;
        long j12;
        int i15;
        int i16;
        int i17;
        int i18;
        y0.b bVar3;
        String str3;
        d dVar3;
        long j13;
        long j14;
        g0.c<?> cVar;
        h1 h1Var;
        ComposerImpl composerImpl;
        int i19;
        ComposerImpl composerImpl2;
        d dVar4;
        long j15;
        y0.b bVar4;
        long j16;
        String str4;
        r0 T;
        int i20;
        g.f(str, "title");
        g.f(bVar, "type");
        ComposerImpl p10 = dVar2.p(325697549);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (p10.z(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= p10.z(bVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= p10.z(aVar) ? 256 : 128;
        }
        int i21 = i11 & 8;
        if (i21 != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            aVar2 = dVar;
            i12 |= p10.z(aVar2) ? 2048 : 1024;
            if ((57344 & i10) != 0) {
                if ((i11 & 16) == 0) {
                    j11 = j2;
                    if (p10.I(j11)) {
                        i20 = 16384;
                        i12 |= i20;
                    }
                } else {
                    j11 = j2;
                }
                i20 = 8192;
                i12 |= i20;
            } else {
                j11 = j2;
            }
            i13 = i11 & 32;
            if (i13 != 0) {
                i12 |= 65536;
            }
            i14 = i11 & 64;
            if (i14 == 0) {
                i12 |= 1572864;
            } else if ((3670016 & i10) == 0) {
                j12 = j10;
                i12 |= p10.I(j12) ? 1048576 : 524288;
                i15 = i11 & 128;
                if (i15 != 0) {
                    i16 = 12582912;
                } else {
                    if ((i10 & 29360128) == 0) {
                        i16 = p10.z(str2) ? 8388608 : 4194304;
                    }
                    if (i13 == 32 && (23967451 & i12) == 4793490 && p10.s()) {
                        p10.e();
                        dVar4 = aVar2;
                        j15 = j11;
                        j16 = j12;
                        composerImpl2 = p10;
                        bVar4 = bVar2;
                        str4 = str2;
                        T = composerImpl2.T();
                        if (T != null) {
                            return;
                        }
                        T.f11073d = new SettingsItemKt$SettingsItem$2(str, bVar, aVar, dVar4, j15, bVar4, j16, str4, i10, i11);
                        return;
                    }
                    p10.t0();
                    i17 = i10 & 1;
                    d.a aVar3 = d.a.f16824i;
                    if (i17 != 0 && !p10.X()) {
                        p10.e();
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        bVar3 = bVar2;
                        str3 = str2;
                        i18 = i12;
                        dVar3 = aVar2;
                        j13 = j11;
                        j14 = j12;
                        p10.R();
                        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                        d Z = SizeKt.c(dVar3).Z(aVar == null ? ClickableKt.d(aVar) : aVar3);
                        h1 h1Var2 = ColorSchemeKt.f2278a;
                        d c12 = a1.c.c1(a1.c.P(Z, ((e0.c) p10.w(h1Var2)).u(), c0.f18087a), m0.b.m0(p10).c);
                        b.i iVar = androidx.compose.foundation.layout.b.f1998a;
                        b.h g10 = androidx.compose.foundation.layout.b.g(m0.b.m0(p10).c);
                        p10.f(693286680);
                        b.C0211b c0211b = a.C0210a.f16814d;
                        j1.q a10 = RowKt.a(g10, c0211b, p10);
                        p10.f(-1323940314);
                        h1 h1Var3 = CompositionLocalsKt.f3703e;
                        b2.b bVar5 = (b2.b) p10.w(h1Var3);
                        h1 h1Var4 = CompositionLocalsKt.f3709k;
                        LayoutDirection layoutDirection = (LayoutDirection) p10.w(h1Var4);
                        h1 h1Var5 = CompositionLocalsKt.f3712o;
                        j1 j1Var = (j1) p10.w(h1Var5);
                        ComposeUiNode.f3400a.getClass();
                        u7.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f3402b;
                        ComposableLambdaImpl a11 = androidx.compose.ui.layout.a.a(c12);
                        cVar = p10.f2640a;
                        if (cVar instanceof g0.c) {
                            a1.c.L0();
                            throw null;
                        }
                        p10.r();
                        if (p10.L) {
                            p10.m(aVar4);
                        } else {
                            p10.n();
                        }
                        p10.f2661x = false;
                        p<ComposeUiNode, j1.q, n> pVar = ComposeUiNode.Companion.f3404e;
                        a1.c.s1(p10, a10, pVar);
                        p<ComposeUiNode, b2.b, n> pVar2 = ComposeUiNode.Companion.f3403d;
                        a1.c.s1(p10, bVar5, pVar2);
                        p<ComposeUiNode, LayoutDirection, n> pVar3 = ComposeUiNode.Companion.f3405f;
                        a1.c.s1(p10, layoutDirection, pVar3);
                        p<ComposeUiNode, j1, n> pVar4 = ComposeUiNode.Companion.f3406g;
                        a1.c.s1(p10, j1Var, pVar4);
                        p10.h();
                        e.o(0, a11, new v0(p10), p10, 2058660585, -678309503);
                        p10.f(1303876703);
                        if (bVar3 != null) {
                            IconKt.a(bVar3, str, SizeKt.d(aVar3, 24), j14, p10, ((i18 << 3) & 112) | 392 | ((i18 >> 9) & 7168), 0);
                        }
                        p10.Q(false);
                        d c = SizeKt.c(aVar3);
                        b.h g11 = androidx.compose.foundation.layout.b.g(m0.b.m0(p10).f16107b);
                        p10.f(-483455358);
                        j1.q a12 = ColumnKt.a(g11, a.C0210a.f16816f, p10);
                        p10.f(-1323940314);
                        b2.b bVar6 = (b2.b) p10.w(h1Var3);
                        LayoutDirection layoutDirection2 = (LayoutDirection) p10.w(h1Var4);
                        j1 j1Var2 = (j1) p10.w(h1Var5);
                        ComposableLambdaImpl a13 = androidx.compose.ui.layout.a.a(c);
                        if (!(cVar instanceof g0.c)) {
                            a1.c.L0();
                            throw null;
                        }
                        p10.r();
                        if (p10.L) {
                            p10.m(aVar4);
                        } else {
                            p10.n();
                        }
                        p10.f2661x = false;
                        a1.c.s1(p10, a12, pVar);
                        a1.c.s1(p10, bVar6, pVar2);
                        a1.c.s1(p10, layoutDirection2, pVar3);
                        a1.c.s1(p10, j1Var2, pVar4);
                        p10.h();
                        e.o(0, a13, new v0(p10), p10, 2058660585, -1163856341);
                        d c10 = SizeKt.c(aVar3);
                        b.f fVar = androidx.compose.foundation.layout.b.f2002f;
                        p10.f(693286680);
                        j1.q a14 = RowKt.a(fVar, c0211b, p10);
                        p10.f(-1323940314);
                        b2.b bVar7 = (b2.b) p10.w(h1Var3);
                        LayoutDirection layoutDirection3 = (LayoutDirection) p10.w(h1Var4);
                        j1 j1Var3 = (j1) p10.w(h1Var5);
                        ComposableLambdaImpl a15 = androidx.compose.ui.layout.a.a(c10);
                        if (cVar instanceof g0.c) {
                            p10.r();
                            if (p10.L) {
                                p10.m(aVar4);
                            } else {
                                p10.n();
                            }
                            p10.f2661x = false;
                            a1.c.s1(p10, a14, pVar);
                            a1.c.s1(p10, bVar7, pVar2);
                            a1.c.s1(p10, layoutDirection3, pVar3);
                            a1.c.s1(p10, j1Var3, pVar4);
                            p10.h();
                            a15.O(new v0(p10), p10, 0);
                            p10.f(2058660585);
                            p10.f(-678309503);
                            d x3 = a4.b.x();
                            h1 h1Var6 = TypographyKt.f2598a;
                            TextKt.b(str, x3, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((r) p10.w(h1Var6)).f10584j, p10, (i18 & 14) | ((i18 >> 6) & 896), 0, 32760);
                            if (bVar instanceof b.a) {
                                h1Var = h1Var6;
                                composerImpl = p10;
                                i19 = -349053893;
                            } else {
                                if (bVar instanceof b.c) {
                                    p10.f(-349053842);
                                    a1.c.w(SizeKt.e(aVar3, m0.b.m0(p10).c), p10);
                                    h1Var = h1Var6;
                                    TextKt.b(((b.c) bVar).f9658a, a4.b.x(), 0L, 0L, null, null, null, 0L, null, new f(6), 0L, 0, false, 0, null, p1.p.a(((r) p10.w(h1Var)).f10584j, 0L, m.f17755o, null, 262139), p10, 0, 0, 32252);
                                    composerImpl = p10;
                                } else {
                                    h1Var = h1Var6;
                                    if (bVar instanceof b.C0091b) {
                                        composerImpl = p10;
                                        composerImpl.f(-349053366);
                                        a1.c.w(SizeKt.e(aVar3, m0.b.m0(composerImpl).c), composerImpl);
                                        boolean z10 = ((b.C0091b) bVar).f9657a;
                                        float f10 = 24;
                                        SizeModifier sizeModifier = new SizeModifier(0.0f, f10, 0.0f, f10, InspectableValueKt.f3744a, 5);
                                        aVar3.Z(sizeModifier);
                                        SwitchKt.a(z10, null, sizeModifier, null, false, null, null, composerImpl, 432, 120);
                                    } else {
                                        composerImpl = p10;
                                        i19 = -349053022;
                                    }
                                }
                                composerImpl.Q(false);
                                composerImpl.Q(false);
                                composerImpl.Q(false);
                                composerImpl.Q(true);
                                composerImpl.Q(false);
                                composerImpl.Q(false);
                                composerImpl.f(1303878396);
                                if (str3 == null) {
                                    p1.p pVar5 = ((r) composerImpl.w(h1Var)).f10587m;
                                    composerImpl2 = composerImpl;
                                    TextKt.b(str3, null, ((e0.c) composerImpl.w(h1Var2)).s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, pVar5, composerImpl2, (i18 >> 21) & 14, 0, 32762);
                                } else {
                                    composerImpl2 = composerImpl;
                                }
                                composerImpl2.Q(false);
                                composerImpl2.Q(false);
                                composerImpl2.Q(false);
                                composerImpl2.Q(true);
                                composerImpl2.Q(false);
                                composerImpl2.Q(false);
                                composerImpl2.Q(false);
                                composerImpl2.Q(false);
                                composerImpl2.Q(true);
                                composerImpl2.Q(false);
                                composerImpl2.Q(false);
                                dVar4 = dVar3;
                                j15 = j13;
                                bVar4 = bVar3;
                                j16 = j14;
                                str4 = str3;
                                T = composerImpl2.T();
                                if (T != null) {
                                }
                            }
                            composerImpl.f(i19);
                            composerImpl.Q(false);
                            composerImpl.Q(false);
                            composerImpl.Q(false);
                            composerImpl.Q(true);
                            composerImpl.Q(false);
                            composerImpl.Q(false);
                            composerImpl.f(1303878396);
                            if (str3 == null) {
                            }
                            composerImpl2.Q(false);
                            composerImpl2.Q(false);
                            composerImpl2.Q(false);
                            composerImpl2.Q(true);
                            composerImpl2.Q(false);
                            composerImpl2.Q(false);
                            composerImpl2.Q(false);
                            composerImpl2.Q(false);
                            composerImpl2.Q(true);
                            composerImpl2.Q(false);
                            composerImpl2.Q(false);
                            dVar4 = dVar3;
                            j15 = j13;
                            bVar4 = bVar3;
                            j16 = j14;
                            str4 = str3;
                            T = composerImpl2.T();
                            if (T != null) {
                            }
                        } else {
                            a1.c.L0();
                            throw null;
                        }
                    }
                    if ((i11 & 16) != 0) {
                        q<g0.c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
                        j11 = ((e0.c) p10.w(ColorSchemeKt.f2278a)).m();
                        i12 &= -57345;
                    }
                    y0.b bVar8 = i13 == 0 ? null : bVar2;
                    long j17 = i14 == 0 ? v0.r.f18133g : j12;
                    i18 = i12;
                    bVar3 = bVar8;
                    str3 = i15 == 0 ? null : str2;
                    dVar3 = aVar2;
                    j13 = j11;
                    j14 = j17;
                    p10.R();
                    q<g0.c<?>, z0, t0, n> qVar3 = ComposerKt.f2737a;
                    d Z2 = SizeKt.c(dVar3).Z(aVar == null ? ClickableKt.d(aVar) : aVar3);
                    h1 h1Var22 = ColorSchemeKt.f2278a;
                    d c122 = a1.c.c1(a1.c.P(Z2, ((e0.c) p10.w(h1Var22)).u(), c0.f18087a), m0.b.m0(p10).c);
                    b.i iVar2 = androidx.compose.foundation.layout.b.f1998a;
                    b.h g102 = androidx.compose.foundation.layout.b.g(m0.b.m0(p10).c);
                    p10.f(693286680);
                    b.C0211b c0211b2 = a.C0210a.f16814d;
                    j1.q a102 = RowKt.a(g102, c0211b2, p10);
                    p10.f(-1323940314);
                    h1 h1Var32 = CompositionLocalsKt.f3703e;
                    b2.b bVar52 = (b2.b) p10.w(h1Var32);
                    h1 h1Var42 = CompositionLocalsKt.f3709k;
                    LayoutDirection layoutDirection4 = (LayoutDirection) p10.w(h1Var42);
                    h1 h1Var52 = CompositionLocalsKt.f3712o;
                    j1 j1Var4 = (j1) p10.w(h1Var52);
                    ComposeUiNode.f3400a.getClass();
                    u7.a<ComposeUiNode> aVar42 = ComposeUiNode.Companion.f3402b;
                    ComposableLambdaImpl a112 = androidx.compose.ui.layout.a.a(c122);
                    cVar = p10.f2640a;
                    if (cVar instanceof g0.c) {
                    }
                }
                i12 |= i16;
                if (i13 == 32) {
                    p10.e();
                    dVar4 = aVar2;
                    j15 = j11;
                    j16 = j12;
                    composerImpl2 = p10;
                    bVar4 = bVar2;
                    str4 = str2;
                    T = composerImpl2.T();
                    if (T != null) {
                    }
                }
                p10.t0();
                i17 = i10 & 1;
                d.a aVar32 = d.a.f16824i;
                if (i17 != 0) {
                    p10.e();
                    if ((i11 & 16) != 0) {
                    }
                    bVar3 = bVar2;
                    str3 = str2;
                    i18 = i12;
                    dVar3 = aVar2;
                    j13 = j11;
                    j14 = j12;
                    p10.R();
                    q<g0.c<?>, z0, t0, n> qVar32 = ComposerKt.f2737a;
                    d Z22 = SizeKt.c(dVar3).Z(aVar == null ? ClickableKt.d(aVar) : aVar32);
                    h1 h1Var222 = ColorSchemeKt.f2278a;
                    d c1222 = a1.c.c1(a1.c.P(Z22, ((e0.c) p10.w(h1Var222)).u(), c0.f18087a), m0.b.m0(p10).c);
                    b.i iVar22 = androidx.compose.foundation.layout.b.f1998a;
                    b.h g1022 = androidx.compose.foundation.layout.b.g(m0.b.m0(p10).c);
                    p10.f(693286680);
                    b.C0211b c0211b22 = a.C0210a.f16814d;
                    j1.q a1022 = RowKt.a(g1022, c0211b22, p10);
                    p10.f(-1323940314);
                    h1 h1Var322 = CompositionLocalsKt.f3703e;
                    b2.b bVar522 = (b2.b) p10.w(h1Var322);
                    h1 h1Var422 = CompositionLocalsKt.f3709k;
                    LayoutDirection layoutDirection42 = (LayoutDirection) p10.w(h1Var422);
                    h1 h1Var522 = CompositionLocalsKt.f3712o;
                    j1 j1Var42 = (j1) p10.w(h1Var522);
                    ComposeUiNode.f3400a.getClass();
                    u7.a<ComposeUiNode> aVar422 = ComposeUiNode.Companion.f3402b;
                    ComposableLambdaImpl a1122 = androidx.compose.ui.layout.a.a(c1222);
                    cVar = p10.f2640a;
                    if (cVar instanceof g0.c) {
                    }
                }
                if ((i11 & 16) != 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                i18 = i12;
                bVar3 = bVar8;
                str3 = i15 == 0 ? null : str2;
                dVar3 = aVar2;
                j13 = j11;
                j14 = j17;
                p10.R();
                q<g0.c<?>, z0, t0, n> qVar322 = ComposerKt.f2737a;
                d Z222 = SizeKt.c(dVar3).Z(aVar == null ? ClickableKt.d(aVar) : aVar32);
                h1 h1Var2222 = ColorSchemeKt.f2278a;
                d c12222 = a1.c.c1(a1.c.P(Z222, ((e0.c) p10.w(h1Var2222)).u(), c0.f18087a), m0.b.m0(p10).c);
                b.i iVar222 = androidx.compose.foundation.layout.b.f1998a;
                b.h g10222 = androidx.compose.foundation.layout.b.g(m0.b.m0(p10).c);
                p10.f(693286680);
                b.C0211b c0211b222 = a.C0210a.f16814d;
                j1.q a10222 = RowKt.a(g10222, c0211b222, p10);
                p10.f(-1323940314);
                h1 h1Var3222 = CompositionLocalsKt.f3703e;
                b2.b bVar5222 = (b2.b) p10.w(h1Var3222);
                h1 h1Var4222 = CompositionLocalsKt.f3709k;
                LayoutDirection layoutDirection422 = (LayoutDirection) p10.w(h1Var4222);
                h1 h1Var5222 = CompositionLocalsKt.f3712o;
                j1 j1Var422 = (j1) p10.w(h1Var5222);
                ComposeUiNode.f3400a.getClass();
                u7.a<ComposeUiNode> aVar4222 = ComposeUiNode.Companion.f3402b;
                ComposableLambdaImpl a11222 = androidx.compose.ui.layout.a.a(c12222);
                cVar = p10.f2640a;
                if (cVar instanceof g0.c) {
                }
            }
            j12 = j10;
            i15 = i11 & 128;
            if (i15 != 0) {
            }
            i12 |= i16;
            if (i13 == 32) {
            }
            p10.t0();
            i17 = i10 & 1;
            d.a aVar322 = d.a.f16824i;
            if (i17 != 0) {
            }
            if ((i11 & 16) != 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            i18 = i12;
            bVar3 = bVar8;
            str3 = i15 == 0 ? null : str2;
            dVar3 = aVar2;
            j13 = j11;
            j14 = j17;
            p10.R();
            q<g0.c<?>, z0, t0, n> qVar3222 = ComposerKt.f2737a;
            d Z2222 = SizeKt.c(dVar3).Z(aVar == null ? ClickableKt.d(aVar) : aVar322);
            h1 h1Var22222 = ColorSchemeKt.f2278a;
            d c122222 = a1.c.c1(a1.c.P(Z2222, ((e0.c) p10.w(h1Var22222)).u(), c0.f18087a), m0.b.m0(p10).c);
            b.i iVar2222 = androidx.compose.foundation.layout.b.f1998a;
            b.h g102222 = androidx.compose.foundation.layout.b.g(m0.b.m0(p10).c);
            p10.f(693286680);
            b.C0211b c0211b2222 = a.C0210a.f16814d;
            j1.q a102222 = RowKt.a(g102222, c0211b2222, p10);
            p10.f(-1323940314);
            h1 h1Var32222 = CompositionLocalsKt.f3703e;
            b2.b bVar52222 = (b2.b) p10.w(h1Var32222);
            h1 h1Var42222 = CompositionLocalsKt.f3709k;
            LayoutDirection layoutDirection4222 = (LayoutDirection) p10.w(h1Var42222);
            h1 h1Var52222 = CompositionLocalsKt.f3712o;
            j1 j1Var4222 = (j1) p10.w(h1Var52222);
            ComposeUiNode.f3400a.getClass();
            u7.a<ComposeUiNode> aVar42222 = ComposeUiNode.Companion.f3402b;
            ComposableLambdaImpl a112222 = androidx.compose.ui.layout.a.a(c122222);
            cVar = p10.f2640a;
            if (cVar instanceof g0.c) {
            }
        }
        aVar2 = dVar;
        if ((57344 & i10) != 0) {
        }
        i13 = i11 & 32;
        if (i13 != 0) {
        }
        i14 = i11 & 64;
        if (i14 == 0) {
        }
        j12 = j10;
        i15 = i11 & 128;
        if (i15 != 0) {
        }
        i12 |= i16;
        if (i13 == 32) {
        }
        p10.t0();
        i17 = i10 & 1;
        d.a aVar3222 = d.a.f16824i;
        if (i17 != 0) {
        }
        if ((i11 & 16) != 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        i18 = i12;
        bVar3 = bVar8;
        str3 = i15 == 0 ? null : str2;
        dVar3 = aVar2;
        j13 = j11;
        j14 = j17;
        p10.R();
        q<g0.c<?>, z0, t0, n> qVar32222 = ComposerKt.f2737a;
        d Z22222 = SizeKt.c(dVar3).Z(aVar == null ? ClickableKt.d(aVar) : aVar3222);
        h1 h1Var222222 = ColorSchemeKt.f2278a;
        d c1222222 = a1.c.c1(a1.c.P(Z22222, ((e0.c) p10.w(h1Var222222)).u(), c0.f18087a), m0.b.m0(p10).c);
        b.i iVar22222 = androidx.compose.foundation.layout.b.f1998a;
        b.h g1022222 = androidx.compose.foundation.layout.b.g(m0.b.m0(p10).c);
        p10.f(693286680);
        b.C0211b c0211b22222 = a.C0210a.f16814d;
        j1.q a1022222 = RowKt.a(g1022222, c0211b22222, p10);
        p10.f(-1323940314);
        h1 h1Var322222 = CompositionLocalsKt.f3703e;
        b2.b bVar522222 = (b2.b) p10.w(h1Var322222);
        h1 h1Var422222 = CompositionLocalsKt.f3709k;
        LayoutDirection layoutDirection42222 = (LayoutDirection) p10.w(h1Var422222);
        h1 h1Var522222 = CompositionLocalsKt.f3712o;
        j1 j1Var42222 = (j1) p10.w(h1Var522222);
        ComposeUiNode.f3400a.getClass();
        u7.a<ComposeUiNode> aVar422222 = ComposeUiNode.Companion.f3402b;
        ComposableLambdaImpl a1122222 = androidx.compose.ui.layout.a.a(c1222222);
        cVar = p10.f2640a;
        if (cVar instanceof g0.c) {
        }
    }
}
