package androidx.compose.material3;

import androidx.activity.e;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillModifier;
import androidx.compose.foundation.layout.OffsetPxModifier;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SizeModifier;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.unit.LayoutDirection;
import d0.h;
import e0.o;
import f0.i;
import g0.d;
import g0.g0;
import g0.g1;
import g0.h1;
import g0.k;
import g0.p0;
import g0.r0;
import g0.s;
import g0.t0;
import g0.v0;
import g0.z0;
import ja.x;
import kotlin.coroutines.EmptyCoroutineContext;
import m7.n;
import o1.g;
import q0.a;
import q0.d;
import r.p;
import r.y;
import u.j;
import u7.l;
import u7.q;
import v0.h0;
import v0.i0;
import v0.r;

/* loaded from: classes.dex */
public final class SwitchKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f2538a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f2539b;
    public static final float c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f2540d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f2541e;

    /* renamed from: f  reason: collision with root package name */
    public static final y<Float> f2542f;

    static {
        float f10 = i.f10821b;
        f2538a = f10;
        f2539b = i.f10825g;
        float f11 = i.f10824f;
        c = f11;
        float f12 = i.f10822d;
        f2540d = f12;
        f2541e = (f11 - f10) - ((f12 - f10) / 2);
        f2542f = new y<>(100, (p) null, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0112, code lost:
        r2 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0294 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(boolean z10, l<? super Boolean, n> lVar, q0.d dVar, u7.p<? super g0.d, ? super Integer, n> pVar, boolean z11, o oVar, j jVar, g0.d dVar2, int i10, int i11) {
        int i12;
        Object obj;
        int i13;
        Object obj2;
        int i14;
        boolean z12;
        Object obj3;
        int i15;
        Object obj4;
        int i16;
        d.a.C0120a c0120a;
        q0.d dVar3;
        q0.d dVar4;
        boolean z13;
        q0.d dVar5;
        boolean z14;
        j jVar2;
        u7.p<? super g0.d, ? super Integer, n> pVar2;
        Object obj5;
        boolean z15;
        Object a02;
        Object a03;
        Object a04;
        ComposerImpl composerImpl;
        q0.d dVar6;
        o oVar2;
        boolean z16;
        j jVar3;
        r0 T;
        int i17;
        ComposerImpl p10 = dVar2.p(1580463220);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (p10.c(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= p10.z(lVar) ? 32 : 16;
        }
        int i18 = i11 & 4;
        if (i18 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            obj = dVar;
            i12 |= p10.z(obj) ? 256 : 128;
            i13 = i11 & 8;
            if (i13 == 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                obj2 = pVar;
                i12 |= p10.z(obj2) ? 2048 : 1024;
                i14 = i11 & 16;
                if (i14 != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    z12 = z11;
                    i12 |= p10.c(z12) ? 16384 : 8192;
                    if ((458752 & i10) != 0) {
                        if ((i11 & 32) == 0) {
                            obj3 = oVar;
                            if (p10.z(obj3)) {
                                i17 = 131072;
                                i12 |= i17;
                            }
                        } else {
                            obj3 = oVar;
                        }
                        i17 = 65536;
                        i12 |= i17;
                    } else {
                        obj3 = oVar;
                    }
                    i15 = i11 & 64;
                    if (i15 == 0) {
                        i12 |= 1572864;
                    } else if ((3670016 & i10) == 0) {
                        obj4 = jVar;
                        i12 |= p10.z(obj4) ? 1048576 : 524288;
                        if ((2995931 & i12) == 599186 && p10.s()) {
                            p10.e();
                            dVar6 = obj;
                            z16 = z12;
                            oVar2 = obj3;
                            jVar3 = obj4;
                            composerImpl = p10;
                            T = composerImpl.T();
                            if (T == null) {
                                return;
                            }
                            T.f11073d = new SwitchKt$Switch$5(z10, lVar, dVar6, obj2, z16, oVar2, jVar3, i10, i11);
                            return;
                        }
                        p10.t0();
                        i16 = i10 & 1;
                        c0120a = d.a.f11039a;
                        dVar3 = d.a.f16824i;
                        if (i16 != 0 && !p10.X()) {
                            p10.e();
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            dVar5 = obj;
                            pVar2 = obj2;
                            obj5 = obj3;
                            jVar2 = obj4;
                            z14 = z12;
                            p10.R();
                            q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                            float f10 = pVar2 == null ? f2539b : f2538a;
                            float f11 = f2540d;
                            float f12 = (f11 - f10) / 2;
                            h1 h1Var = CompositionLocalsKt.f3703e;
                            float H = ((b2.b) p10.w(h1Var)).H(f12);
                            float f13 = f2541e;
                            float H2 = ((b2.b) p10.w(h1Var)).H(f13);
                            Float valueOf = Float.valueOf(H);
                            Float valueOf2 = Float.valueOf(H2);
                            p10.f(511388516);
                            z15 = p10.z(valueOf) | p10.z(valueOf2);
                            a02 = p10.a0();
                            if (!z15 || a02 == c0120a) {
                                a02 = new SwitchKt$Switch$valueToOffset$1$1(H2, H);
                                p10.I0(a02);
                            }
                            p10.Q(false);
                            float floatValue = ((Number) ((l) a02).U(Boolean.valueOf(z10))).floatValue();
                            p10.f(-492369756);
                            a03 = p10.a0();
                            if (a03 == c0120a) {
                                a03 = a1.c.h(floatValue);
                                p10.I0(a03);
                            }
                            p10.Q(false);
                            androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) a03;
                            p10.f(773894976);
                            p10.f(-492369756);
                            a04 = p10.a0();
                            if (a04 == c0120a) {
                                k kVar = new k(s.e(EmptyCoroutineContext.f13021i, p10));
                                p10.I0(kVar);
                                a04 = kVar;
                            }
                            p10.Q(false);
                            x xVar = ((k) a04).f11060a;
                            p10.Q(false);
                            s.d(new SwitchKt$Switch$2(aVar, H), p10);
                            s.a(Boolean.valueOf(z10), new SwitchKt$Switch$3(aVar, floatValue, xVar), p10);
                            q0.d a10 = lVar != null ? androidx.compose.foundation.selection.b.a(z10, jVar2, z14, new g(2), lVar) : dVar3;
                            if (lVar != null) {
                                dVar3 = TouchTargetKt.a(dVar3);
                            }
                            q0.d Z = dVar5.Z(dVar3).Z(a10);
                            q0.b bVar = a.C0210a.c;
                            FillModifier fillModifier = SizeKt.f1957a;
                            v7.g.f(Z, "<this>");
                            boolean a11 = v7.g.a(bVar, bVar);
                            q0.b bVar2 = a.C0210a.f16812a;
                            q0.d Z2 = Z.Z(a11 ? SizeKt.f1960e : v7.g.a(bVar, bVar2) ? SizeKt.f1961f : SizeKt.b(bVar, false));
                            float f14 = c;
                            v7.g.f(Z2, "$this$requiredSize");
                            q0.d dVar7 = dVar5;
                            q0.d Z3 = Z2.Z(new SizeModifier(f14, f11, f14, f11, false, (l) InspectableValueKt.f3744a));
                            p10.f(733328855);
                            j1.q c10 = BoxKt.c(bVar2, false, p10);
                            p10.f(-1323940314);
                            b2.b bVar3 = (b2.b) p10.w(h1Var);
                            LayoutDirection layoutDirection = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
                            j1 j1Var = (j1) p10.w(CompositionLocalsKt.f3712o);
                            ComposeUiNode.f3400a.getClass();
                            u7.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3402b;
                            ComposableLambdaImpl a12 = androidx.compose.ui.layout.a.a(Z3);
                            if (p10.f2640a instanceof g0.c) {
                                p10.r();
                                if (p10.L) {
                                    p10.m(aVar2);
                                } else {
                                    p10.n();
                                }
                                p10.f2661x = false;
                                a1.c.s1(p10, c10, ComposeUiNode.Companion.f3404e);
                                a1.c.s1(p10, bVar3, ComposeUiNode.Companion.f3403d);
                                a1.c.s1(p10, layoutDirection, ComposeUiNode.Companion.f3405f);
                                a1.c.s1(p10, j1Var, ComposeUiNode.Companion.f3406g);
                                p10.h();
                                e.o(0, a12, new v0(p10), p10, 2058660585, -2137368960);
                                m0.b bVar4 = m0.b.f15899l;
                                p10.f(1204996270);
                                g1 g1Var = aVar.c;
                                float f15 = i.f10820a;
                                int i19 = i12 >> 6;
                                composerImpl = p10;
                                b(bVar4, z10, z14, obj5, g1Var, pVar2, jVar2, ShapesKt.a(ShapeKeyTokens.CornerFull, p10), f10, f12, f13, p10, ((i12 << 3) & 112) | 6 | (i19 & 896) | (i19 & 7168) | ((i12 << 6) & 458752) | (i12 & 3670016), 6);
                                composerImpl.Q(false);
                                composerImpl.Q(false);
                                composerImpl.Q(false);
                                composerImpl.Q(true);
                                composerImpl.Q(false);
                                composerImpl.Q(false);
                                q<g0.c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
                                dVar6 = dVar7;
                                obj2 = pVar2;
                                oVar2 = obj5;
                                z16 = z14;
                                jVar3 = jVar2;
                                T = composerImpl.T();
                                if (T == null) {
                                }
                            } else {
                                a1.c.L0();
                                throw null;
                            }
                        }
                        if (i13 != 0) {
                            obj2 = null;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 32) != 0) {
                            p10.f(1937926421);
                            float f16 = i.f10820a;
                            long e10 = ColorSchemeKt.e(ColorSchemeKeyTokens.OnPrimary, p10);
                            long e11 = ColorSchemeKt.e(ColorSchemeKeyTokens.Primary, p10);
                            long j2 = r.f18132f;
                            long e12 = ColorSchemeKt.e(ColorSchemeKeyTokens.OnPrimaryContainer, p10);
                            ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Outline;
                            long e13 = ColorSchemeKt.e(colorSchemeKeyTokens, p10);
                            ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.SurfaceVariant;
                            long e14 = ColorSchemeKt.e(colorSchemeKeyTokens2, p10);
                            long e15 = ColorSchemeKt.e(colorSchemeKeyTokens, p10);
                            long e16 = ColorSchemeKt.e(colorSchemeKeyTokens2, p10);
                            dVar4 = obj;
                            long b5 = r.b(ColorSchemeKt.e(ColorSchemeKeyTokens.Surface, p10), 1.0f);
                            q<g0.c<?>, z0, t0, n> qVar3 = ComposerKt.f2737a;
                            h1 h1Var2 = ColorSchemeKt.f2278a;
                            z13 = z12;
                            long k02 = a1.c.k0(b5, ((e0.c) p10.w(h1Var2)).u());
                            ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurface;
                            o oVar3 = new o(e10, e11, j2, e12, e13, e14, e15, e16, k02, a1.c.k0(r.b(ColorSchemeKt.e(colorSchemeKeyTokens3, p10), 0.12f), ((e0.c) p10.w(h1Var2)).u()), j2, a1.c.k0(r.b(ColorSchemeKt.e(colorSchemeKeyTokens3, p10), 0.38f), ((e0.c) p10.w(h1Var2)).u()), a1.c.k0(r.b(ColorSchemeKt.e(colorSchemeKeyTokens3, p10), 0.38f), ((e0.c) p10.w(h1Var2)).u()), a1.c.k0(r.b(ColorSchemeKt.e(colorSchemeKeyTokens2, p10), 0.12f), ((e0.c) p10.w(h1Var2)).u()), a1.c.k0(r.b(ColorSchemeKt.e(colorSchemeKeyTokens3, p10), 0.12f), ((e0.c) p10.w(h1Var2)).u()), a1.c.k0(r.b(ColorSchemeKt.e(colorSchemeKeyTokens2, p10), 0.38f), ((e0.c) p10.w(h1Var2)).u()));
                            p10.Q(false);
                            i12 &= -458753;
                            obj3 = oVar3;
                        } else {
                            dVar4 = obj;
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            p10.f(-492369756);
                            Object a05 = p10.a0();
                            if (a05 == c0120a) {
                                a05 = new u.k();
                                p10.I0(a05);
                            }
                            p10.Q(false);
                            dVar5 = dVar4;
                            z14 = z13;
                            jVar2 = (j) a05;
                        } else {
                            dVar5 = dVar4;
                            z14 = z13;
                            jVar2 = jVar;
                        }
                        pVar2 = obj2;
                        obj5 = obj3;
                        p10.R();
                        q<g0.c<?>, z0, t0, n> qVar4 = ComposerKt.f2737a;
                        float f102 = pVar2 == null ? f2539b : f2538a;
                        float f112 = f2540d;
                        float f122 = (f112 - f102) / 2;
                        h1 h1Var3 = CompositionLocalsKt.f3703e;
                        float H3 = ((b2.b) p10.w(h1Var3)).H(f122);
                        float f132 = f2541e;
                        float H22 = ((b2.b) p10.w(h1Var3)).H(f132);
                        Float valueOf3 = Float.valueOf(H3);
                        Float valueOf22 = Float.valueOf(H22);
                        p10.f(511388516);
                        z15 = p10.z(valueOf3) | p10.z(valueOf22);
                        a02 = p10.a0();
                        if (!z15) {
                        }
                        a02 = new SwitchKt$Switch$valueToOffset$1$1(H22, H3);
                        p10.I0(a02);
                        p10.Q(false);
                        float floatValue2 = ((Number) ((l) a02).U(Boolean.valueOf(z10))).floatValue();
                        p10.f(-492369756);
                        a03 = p10.a0();
                        if (a03 == c0120a) {
                        }
                        p10.Q(false);
                        androidx.compose.animation.core.a aVar3 = (androidx.compose.animation.core.a) a03;
                        p10.f(773894976);
                        p10.f(-492369756);
                        a04 = p10.a0();
                        if (a04 == c0120a) {
                        }
                        p10.Q(false);
                        x xVar2 = ((k) a04).f11060a;
                        p10.Q(false);
                        s.d(new SwitchKt$Switch$2(aVar3, H3), p10);
                        s.a(Boolean.valueOf(z10), new SwitchKt$Switch$3(aVar3, floatValue2, xVar2), p10);
                        if (lVar != null) {
                        }
                        if (lVar != null) {
                        }
                        q0.d Z4 = dVar5.Z(dVar3).Z(a10);
                        q0.b bVar5 = a.C0210a.c;
                        FillModifier fillModifier2 = SizeKt.f1957a;
                        v7.g.f(Z4, "<this>");
                        boolean a112 = v7.g.a(bVar5, bVar5);
                        q0.b bVar22 = a.C0210a.f16812a;
                        q0.d Z22 = Z4.Z(a112 ? SizeKt.f1960e : v7.g.a(bVar5, bVar22) ? SizeKt.f1961f : SizeKt.b(bVar5, false));
                        float f142 = c;
                        v7.g.f(Z22, "$this$requiredSize");
                        q0.d dVar72 = dVar5;
                        q0.d Z32 = Z22.Z(new SizeModifier(f142, f112, f142, f112, false, (l) InspectableValueKt.f3744a));
                        p10.f(733328855);
                        j1.q c102 = BoxKt.c(bVar22, false, p10);
                        p10.f(-1323940314);
                        b2.b bVar32 = (b2.b) p10.w(h1Var3);
                        LayoutDirection layoutDirection2 = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
                        j1 j1Var2 = (j1) p10.w(CompositionLocalsKt.f3712o);
                        ComposeUiNode.f3400a.getClass();
                        u7.a<ComposeUiNode> aVar22 = ComposeUiNode.Companion.f3402b;
                        ComposableLambdaImpl a122 = androidx.compose.ui.layout.a.a(Z32);
                        if (p10.f2640a instanceof g0.c) {
                        }
                    }
                    obj4 = jVar;
                    if ((2995931 & i12) == 599186) {
                        p10.e();
                        dVar6 = obj;
                        z16 = z12;
                        oVar2 = obj3;
                        jVar3 = obj4;
                        composerImpl = p10;
                        T = composerImpl.T();
                        if (T == null) {
                        }
                    }
                    p10.t0();
                    i16 = i10 & 1;
                    c0120a = d.a.f11039a;
                    dVar3 = d.a.f16824i;
                    if (i16 != 0) {
                        p10.e();
                        if ((i11 & 32) != 0) {
                        }
                        dVar5 = obj;
                        pVar2 = obj2;
                        obj5 = obj3;
                        jVar2 = obj4;
                        z14 = z12;
                        p10.R();
                        q<g0.c<?>, z0, t0, n> qVar42 = ComposerKt.f2737a;
                        float f1022 = pVar2 == null ? f2539b : f2538a;
                        float f1122 = f2540d;
                        float f1222 = (f1122 - f1022) / 2;
                        h1 h1Var32 = CompositionLocalsKt.f3703e;
                        float H32 = ((b2.b) p10.w(h1Var32)).H(f1222);
                        float f1322 = f2541e;
                        float H222 = ((b2.b) p10.w(h1Var32)).H(f1322);
                        Float valueOf32 = Float.valueOf(H32);
                        Float valueOf222 = Float.valueOf(H222);
                        p10.f(511388516);
                        z15 = p10.z(valueOf32) | p10.z(valueOf222);
                        a02 = p10.a0();
                        if (!z15) {
                        }
                        a02 = new SwitchKt$Switch$valueToOffset$1$1(H222, H32);
                        p10.I0(a02);
                        p10.Q(false);
                        float floatValue22 = ((Number) ((l) a02).U(Boolean.valueOf(z10))).floatValue();
                        p10.f(-492369756);
                        a03 = p10.a0();
                        if (a03 == c0120a) {
                        }
                        p10.Q(false);
                        androidx.compose.animation.core.a aVar32 = (androidx.compose.animation.core.a) a03;
                        p10.f(773894976);
                        p10.f(-492369756);
                        a04 = p10.a0();
                        if (a04 == c0120a) {
                        }
                        p10.Q(false);
                        x xVar22 = ((k) a04).f11060a;
                        p10.Q(false);
                        s.d(new SwitchKt$Switch$2(aVar32, H32), p10);
                        s.a(Boolean.valueOf(z10), new SwitchKt$Switch$3(aVar32, floatValue22, xVar22), p10);
                        if (lVar != null) {
                        }
                        if (lVar != null) {
                        }
                        q0.d Z42 = dVar5.Z(dVar3).Z(a10);
                        q0.b bVar52 = a.C0210a.c;
                        FillModifier fillModifier22 = SizeKt.f1957a;
                        v7.g.f(Z42, "<this>");
                        boolean a1122 = v7.g.a(bVar52, bVar52);
                        q0.b bVar222 = a.C0210a.f16812a;
                        q0.d Z222 = Z42.Z(a1122 ? SizeKt.f1960e : v7.g.a(bVar52, bVar222) ? SizeKt.f1961f : SizeKt.b(bVar52, false));
                        float f1422 = c;
                        v7.g.f(Z222, "$this$requiredSize");
                        q0.d dVar722 = dVar5;
                        q0.d Z322 = Z222.Z(new SizeModifier(f1422, f1122, f1422, f1122, false, (l) InspectableValueKt.f3744a));
                        p10.f(733328855);
                        j1.q c1022 = BoxKt.c(bVar222, false, p10);
                        p10.f(-1323940314);
                        b2.b bVar322 = (b2.b) p10.w(h1Var32);
                        LayoutDirection layoutDirection22 = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
                        j1 j1Var22 = (j1) p10.w(CompositionLocalsKt.f3712o);
                        ComposeUiNode.f3400a.getClass();
                        u7.a<ComposeUiNode> aVar222 = ComposeUiNode.Companion.f3402b;
                        ComposableLambdaImpl a1222 = androidx.compose.ui.layout.a.a(Z322);
                        if (p10.f2640a instanceof g0.c) {
                        }
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if ((i11 & 32) != 0) {
                    }
                    if (i15 != 0) {
                    }
                    pVar2 = obj2;
                    obj5 = obj3;
                    p10.R();
                    q<g0.c<?>, z0, t0, n> qVar422 = ComposerKt.f2737a;
                    float f10222 = pVar2 == null ? f2539b : f2538a;
                    float f11222 = f2540d;
                    float f12222 = (f11222 - f10222) / 2;
                    h1 h1Var322 = CompositionLocalsKt.f3703e;
                    float H322 = ((b2.b) p10.w(h1Var322)).H(f12222);
                    float f13222 = f2541e;
                    float H2222 = ((b2.b) p10.w(h1Var322)).H(f13222);
                    Float valueOf322 = Float.valueOf(H322);
                    Float valueOf2222 = Float.valueOf(H2222);
                    p10.f(511388516);
                    z15 = p10.z(valueOf322) | p10.z(valueOf2222);
                    a02 = p10.a0();
                    if (!z15) {
                    }
                    a02 = new SwitchKt$Switch$valueToOffset$1$1(H2222, H322);
                    p10.I0(a02);
                    p10.Q(false);
                    float floatValue222 = ((Number) ((l) a02).U(Boolean.valueOf(z10))).floatValue();
                    p10.f(-492369756);
                    a03 = p10.a0();
                    if (a03 == c0120a) {
                    }
                    p10.Q(false);
                    androidx.compose.animation.core.a aVar322 = (androidx.compose.animation.core.a) a03;
                    p10.f(773894976);
                    p10.f(-492369756);
                    a04 = p10.a0();
                    if (a04 == c0120a) {
                    }
                    p10.Q(false);
                    x xVar222 = ((k) a04).f11060a;
                    p10.Q(false);
                    s.d(new SwitchKt$Switch$2(aVar322, H322), p10);
                    s.a(Boolean.valueOf(z10), new SwitchKt$Switch$3(aVar322, floatValue222, xVar222), p10);
                    if (lVar != null) {
                    }
                    if (lVar != null) {
                    }
                    q0.d Z422 = dVar5.Z(dVar3).Z(a10);
                    q0.b bVar522 = a.C0210a.c;
                    FillModifier fillModifier222 = SizeKt.f1957a;
                    v7.g.f(Z422, "<this>");
                    boolean a11222 = v7.g.a(bVar522, bVar522);
                    q0.b bVar2222 = a.C0210a.f16812a;
                    q0.d Z2222 = Z422.Z(a11222 ? SizeKt.f1960e : v7.g.a(bVar522, bVar2222) ? SizeKt.f1961f : SizeKt.b(bVar522, false));
                    float f14222 = c;
                    v7.g.f(Z2222, "$this$requiredSize");
                    q0.d dVar7222 = dVar5;
                    q0.d Z3222 = Z2222.Z(new SizeModifier(f14222, f11222, f14222, f11222, false, (l) InspectableValueKt.f3744a));
                    p10.f(733328855);
                    j1.q c10222 = BoxKt.c(bVar2222, false, p10);
                    p10.f(-1323940314);
                    b2.b bVar3222 = (b2.b) p10.w(h1Var322);
                    LayoutDirection layoutDirection222 = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
                    j1 j1Var222 = (j1) p10.w(CompositionLocalsKt.f3712o);
                    ComposeUiNode.f3400a.getClass();
                    u7.a<ComposeUiNode> aVar2222 = ComposeUiNode.Companion.f3402b;
                    ComposableLambdaImpl a12222 = androidx.compose.ui.layout.a.a(Z3222);
                    if (p10.f2640a instanceof g0.c) {
                    }
                }
                z12 = z11;
                if ((458752 & i10) != 0) {
                }
                i15 = i11 & 64;
                if (i15 == 0) {
                }
                obj4 = jVar;
                if ((2995931 & i12) == 599186) {
                }
                p10.t0();
                i16 = i10 & 1;
                c0120a = d.a.f11039a;
                dVar3 = d.a.f16824i;
                if (i16 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if ((i11 & 32) != 0) {
                }
                if (i15 != 0) {
                }
                pVar2 = obj2;
                obj5 = obj3;
                p10.R();
                q<g0.c<?>, z0, t0, n> qVar4222 = ComposerKt.f2737a;
                float f102222 = pVar2 == null ? f2539b : f2538a;
                float f112222 = f2540d;
                float f122222 = (f112222 - f102222) / 2;
                h1 h1Var3222 = CompositionLocalsKt.f3703e;
                float H3222 = ((b2.b) p10.w(h1Var3222)).H(f122222);
                float f132222 = f2541e;
                float H22222 = ((b2.b) p10.w(h1Var3222)).H(f132222);
                Float valueOf3222 = Float.valueOf(H3222);
                Float valueOf22222 = Float.valueOf(H22222);
                p10.f(511388516);
                z15 = p10.z(valueOf3222) | p10.z(valueOf22222);
                a02 = p10.a0();
                if (!z15) {
                }
                a02 = new SwitchKt$Switch$valueToOffset$1$1(H22222, H3222);
                p10.I0(a02);
                p10.Q(false);
                float floatValue2222 = ((Number) ((l) a02).U(Boolean.valueOf(z10))).floatValue();
                p10.f(-492369756);
                a03 = p10.a0();
                if (a03 == c0120a) {
                }
                p10.Q(false);
                androidx.compose.animation.core.a aVar3222 = (androidx.compose.animation.core.a) a03;
                p10.f(773894976);
                p10.f(-492369756);
                a04 = p10.a0();
                if (a04 == c0120a) {
                }
                p10.Q(false);
                x xVar2222 = ((k) a04).f11060a;
                p10.Q(false);
                s.d(new SwitchKt$Switch$2(aVar3222, H3222), p10);
                s.a(Boolean.valueOf(z10), new SwitchKt$Switch$3(aVar3222, floatValue2222, xVar2222), p10);
                if (lVar != null) {
                }
                if (lVar != null) {
                }
                q0.d Z4222 = dVar5.Z(dVar3).Z(a10);
                q0.b bVar5222 = a.C0210a.c;
                FillModifier fillModifier2222 = SizeKt.f1957a;
                v7.g.f(Z4222, "<this>");
                boolean a112222 = v7.g.a(bVar5222, bVar5222);
                q0.b bVar22222 = a.C0210a.f16812a;
                q0.d Z22222 = Z4222.Z(a112222 ? SizeKt.f1960e : v7.g.a(bVar5222, bVar22222) ? SizeKt.f1961f : SizeKt.b(bVar5222, false));
                float f142222 = c;
                v7.g.f(Z22222, "$this$requiredSize");
                q0.d dVar72222 = dVar5;
                q0.d Z32222 = Z22222.Z(new SizeModifier(f142222, f112222, f142222, f112222, false, (l) InspectableValueKt.f3744a));
                p10.f(733328855);
                j1.q c102222 = BoxKt.c(bVar22222, false, p10);
                p10.f(-1323940314);
                b2.b bVar32222 = (b2.b) p10.w(h1Var3222);
                LayoutDirection layoutDirection2222 = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
                j1 j1Var2222 = (j1) p10.w(CompositionLocalsKt.f3712o);
                ComposeUiNode.f3400a.getClass();
                u7.a<ComposeUiNode> aVar22222 = ComposeUiNode.Companion.f3402b;
                ComposableLambdaImpl a122222 = androidx.compose.ui.layout.a.a(Z32222);
                if (p10.f2640a instanceof g0.c) {
                }
            }
            obj2 = pVar;
            i14 = i11 & 16;
            if (i14 != 0) {
            }
            z12 = z11;
            if ((458752 & i10) != 0) {
            }
            i15 = i11 & 64;
            if (i15 == 0) {
            }
            obj4 = jVar;
            if ((2995931 & i12) == 599186) {
            }
            p10.t0();
            i16 = i10 & 1;
            c0120a = d.a.f11039a;
            dVar3 = d.a.f16824i;
            if (i16 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if ((i11 & 32) != 0) {
            }
            if (i15 != 0) {
            }
            pVar2 = obj2;
            obj5 = obj3;
            p10.R();
            q<g0.c<?>, z0, t0, n> qVar42222 = ComposerKt.f2737a;
            float f1022222 = pVar2 == null ? f2539b : f2538a;
            float f1122222 = f2540d;
            float f1222222 = (f1122222 - f1022222) / 2;
            h1 h1Var32222 = CompositionLocalsKt.f3703e;
            float H32222 = ((b2.b) p10.w(h1Var32222)).H(f1222222);
            float f1322222 = f2541e;
            float H222222 = ((b2.b) p10.w(h1Var32222)).H(f1322222);
            Float valueOf32222 = Float.valueOf(H32222);
            Float valueOf222222 = Float.valueOf(H222222);
            p10.f(511388516);
            z15 = p10.z(valueOf32222) | p10.z(valueOf222222);
            a02 = p10.a0();
            if (!z15) {
            }
            a02 = new SwitchKt$Switch$valueToOffset$1$1(H222222, H32222);
            p10.I0(a02);
            p10.Q(false);
            float floatValue22222 = ((Number) ((l) a02).U(Boolean.valueOf(z10))).floatValue();
            p10.f(-492369756);
            a03 = p10.a0();
            if (a03 == c0120a) {
            }
            p10.Q(false);
            androidx.compose.animation.core.a aVar32222 = (androidx.compose.animation.core.a) a03;
            p10.f(773894976);
            p10.f(-492369756);
            a04 = p10.a0();
            if (a04 == c0120a) {
            }
            p10.Q(false);
            x xVar22222 = ((k) a04).f11060a;
            p10.Q(false);
            s.d(new SwitchKt$Switch$2(aVar32222, H32222), p10);
            s.a(Boolean.valueOf(z10), new SwitchKt$Switch$3(aVar32222, floatValue22222, xVar22222), p10);
            if (lVar != null) {
            }
            if (lVar != null) {
            }
            q0.d Z42222 = dVar5.Z(dVar3).Z(a10);
            q0.b bVar52222 = a.C0210a.c;
            FillModifier fillModifier22222 = SizeKt.f1957a;
            v7.g.f(Z42222, "<this>");
            boolean a1122222 = v7.g.a(bVar52222, bVar52222);
            q0.b bVar222222 = a.C0210a.f16812a;
            q0.d Z222222 = Z42222.Z(a1122222 ? SizeKt.f1960e : v7.g.a(bVar52222, bVar222222) ? SizeKt.f1961f : SizeKt.b(bVar52222, false));
            float f1422222 = c;
            v7.g.f(Z222222, "$this$requiredSize");
            q0.d dVar722222 = dVar5;
            q0.d Z322222 = Z222222.Z(new SizeModifier(f1422222, f1122222, f1422222, f1122222, false, (l) InspectableValueKt.f3744a));
            p10.f(733328855);
            j1.q c1022222 = BoxKt.c(bVar222222, false, p10);
            p10.f(-1323940314);
            b2.b bVar322222 = (b2.b) p10.w(h1Var32222);
            LayoutDirection layoutDirection22222 = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
            j1 j1Var22222 = (j1) p10.w(CompositionLocalsKt.f3712o);
            ComposeUiNode.f3400a.getClass();
            u7.a<ComposeUiNode> aVar222222 = ComposeUiNode.Companion.f3402b;
            ComposableLambdaImpl a1222222 = androidx.compose.ui.layout.a.a(Z322222);
            if (p10.f2640a instanceof g0.c) {
            }
        }
        obj = dVar;
        i13 = i11 & 8;
        if (i13 == 0) {
        }
        obj2 = pVar;
        i14 = i11 & 16;
        if (i14 != 0) {
        }
        z12 = z11;
        if ((458752 & i10) != 0) {
        }
        i15 = i11 & 64;
        if (i15 == 0) {
        }
        obj4 = jVar;
        if ((2995931 & i12) == 599186) {
        }
        p10.t0();
        i16 = i10 & 1;
        c0120a = d.a.f11039a;
        dVar3 = d.a.f16824i;
        if (i16 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if ((i11 & 32) != 0) {
        }
        if (i15 != 0) {
        }
        pVar2 = obj2;
        obj5 = obj3;
        p10.R();
        q<g0.c<?>, z0, t0, n> qVar422222 = ComposerKt.f2737a;
        float f10222222 = pVar2 == null ? f2539b : f2538a;
        float f11222222 = f2540d;
        float f12222222 = (f11222222 - f10222222) / 2;
        h1 h1Var322222 = CompositionLocalsKt.f3703e;
        float H322222 = ((b2.b) p10.w(h1Var322222)).H(f12222222);
        float f13222222 = f2541e;
        float H2222222 = ((b2.b) p10.w(h1Var322222)).H(f13222222);
        Float valueOf322222 = Float.valueOf(H322222);
        Float valueOf2222222 = Float.valueOf(H2222222);
        p10.f(511388516);
        z15 = p10.z(valueOf322222) | p10.z(valueOf2222222);
        a02 = p10.a0();
        if (!z15) {
        }
        a02 = new SwitchKt$Switch$valueToOffset$1$1(H2222222, H322222);
        p10.I0(a02);
        p10.Q(false);
        float floatValue222222 = ((Number) ((l) a02).U(Boolean.valueOf(z10))).floatValue();
        p10.f(-492369756);
        a03 = p10.a0();
        if (a03 == c0120a) {
        }
        p10.Q(false);
        androidx.compose.animation.core.a aVar322222 = (androidx.compose.animation.core.a) a03;
        p10.f(773894976);
        p10.f(-492369756);
        a04 = p10.a0();
        if (a04 == c0120a) {
        }
        p10.Q(false);
        x xVar222222 = ((k) a04).f11060a;
        p10.Q(false);
        s.d(new SwitchKt$Switch$2(aVar322222, H322222), p10);
        s.a(Boolean.valueOf(z10), new SwitchKt$Switch$3(aVar322222, floatValue222222, xVar222222), p10);
        if (lVar != null) {
        }
        if (lVar != null) {
        }
        q0.d Z422222 = dVar5.Z(dVar3).Z(a10);
        q0.b bVar522222 = a.C0210a.c;
        FillModifier fillModifier222222 = SizeKt.f1957a;
        v7.g.f(Z422222, "<this>");
        boolean a11222222 = v7.g.a(bVar522222, bVar522222);
        q0.b bVar2222222 = a.C0210a.f16812a;
        q0.d Z2222222 = Z422222.Z(a11222222 ? SizeKt.f1960e : v7.g.a(bVar522222, bVar2222222) ? SizeKt.f1961f : SizeKt.b(bVar522222, false));
        float f14222222 = c;
        v7.g.f(Z2222222, "$this$requiredSize");
        q0.d dVar7222222 = dVar5;
        q0.d Z3222222 = Z2222222.Z(new SizeModifier(f14222222, f11222222, f14222222, f11222222, false, (l) InspectableValueKt.f3744a));
        p10.f(733328855);
        j1.q c10222222 = BoxKt.c(bVar2222222, false, p10);
        p10.f(-1323940314);
        b2.b bVar3222222 = (b2.b) p10.w(h1Var322222);
        LayoutDirection layoutDirection222222 = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
        j1 j1Var222222 = (j1) p10.w(CompositionLocalsKt.f3712o);
        ComposeUiNode.f3400a.getClass();
        u7.a<ComposeUiNode> aVar2222222 = ComposeUiNode.Companion.f3402b;
        ComposableLambdaImpl a12222222 = androidx.compose.ui.layout.a.a(Z3222222);
        if (p10.f2640a instanceof g0.c) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0435  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(v.c cVar, boolean z10, boolean z11, o oVar, g1<Float> g1Var, u7.p<? super g0.d, ? super Integer, n> pVar, u.i iVar, h0 h0Var, float f10, float f11, float f12, g0.d dVar, int i10, int i11) {
        int i12;
        int i13;
        float floatValue;
        boolean z12;
        r0 T;
        ComposerImpl p10 = dVar.p(-1968109941);
        int i14 = 4;
        if ((i10 & 14) == 0) {
            i12 = (p10.z(cVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            i12 |= p10.c(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i12 |= p10.c(z11) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i12 |= p10.z(oVar) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i12 |= p10.z(g1Var) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i12 |= p10.z(pVar) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i12 |= p10.z(iVar) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i12 |= p10.z(h0Var) ? 8388608 : 4194304;
        }
        if ((234881024 & i10) == 0) {
            i12 |= p10.G(f10) ? 67108864 : 33554432;
        }
        if ((1879048192 & i10) == 0) {
            i12 |= p10.G(f11) ? 536870912 : 268435456;
        }
        int i15 = i12;
        if ((i11 & 14) == 0) {
            if (!p10.G(f12)) {
                i14 = 2;
            }
            i13 = i11 | i14;
        } else {
            i13 = i11;
        }
        if ((i15 & 1533916891) == 306783378 && (i13 & 11) == 2 && p10.s()) {
            p10.e();
            T = p10.T();
            if (T != null) {
                return;
            }
            T.f11073d = new SwitchKt$SwitchImpl$2(cVar, z10, z11, oVar, g1Var, pVar, iVar, h0Var, f10, f11, f12, i10, i11);
            return;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        oVar.getClass();
        p10.f(961511844);
        g0 l12 = a1.c.l1(new r(z11 ? z10 ? oVar.f10559b : oVar.f10562f : z10 ? oVar.f10566j : oVar.n), p10);
        p10.Q(false);
        g0 b5 = androidx.compose.foundation.interaction.a.b(iVar, p10, (i15 >> 18) & 14);
        h1 h1Var = CompositionLocalsKt.f3703e;
        float t02 = ((Boolean) b5.getValue()).booleanValue() ? i.f10820a : (((((b2.b) p10.w(h1Var)).t0(g1Var.getValue().floatValue()) - f11) / (f12 - f11)) * (f2538a - f10)) + f10;
        p10.f(-993794194);
        if (((Boolean) b5.getValue()).booleanValue()) {
            b2.b bVar = (b2.b) p10.w(h1Var);
            float f13 = i.f10820a;
            floatValue = bVar.H(z10 ? f2541e - i.f10823e : i.f10823e);
        } else {
            floatValue = g1Var.getValue().floatValue();
        }
        p10.Q(false);
        float f14 = i.f10820a;
        h0 a10 = ShapesKt.a(ShapeKeyTokens.CornerFull, p10);
        q0.b bVar2 = a.C0210a.c;
        q0.d e10 = SizeKt.e(cVar.c(), c);
        float f15 = f2540d;
        v7.g.f(e10, "$this$height");
        l<n0, n> lVar = InspectableValueKt.f3744a;
        q0.d Z = e10.Z(new SizeModifier(0.0f, f15, 0.0f, f15, lVar, 5));
        p10.f(462653665);
        g0 l13 = a1.c.l1(new r(z11 ? z10 ? oVar.c : oVar.f10563g : z10 ? oVar.f10567k : oVar.f10570o), p10);
        p10.Q(false);
        long j2 = ((r) l13.getValue()).f18135a;
        v7.g.f(Z, "$this$border");
        v7.g.f(a10, "shape");
        q0.d P = a1.c.P(androidx.compose.foundation.a.a(Z, new i0(j2), a10), ((r) l12.getValue()).f18135a, a10);
        p10.f(733328855);
        j1.q c10 = BoxKt.c(a.C0210a.f16812a, false, p10);
        p10.f(-1323940314);
        b2.b bVar3 = (b2.b) p10.w(h1Var);
        h1 h1Var2 = CompositionLocalsKt.f3709k;
        LayoutDirection layoutDirection = (LayoutDirection) p10.w(h1Var2);
        h1 h1Var3 = CompositionLocalsKt.f3712o;
        j1 j1Var = (j1) p10.w(h1Var3);
        ComposeUiNode.f3400a.getClass();
        u7.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3402b;
        ComposableLambdaImpl a11 = androidx.compose.ui.layout.a.a(P);
        g0.c<?> cVar2 = p10.f2640a;
        if (!(cVar2 instanceof g0.c)) {
            a1.c.L0();
            throw null;
        }
        p10.r();
        if (p10.L) {
            p10.m(aVar);
        } else {
            p10.n();
        }
        p10.f2661x = false;
        u7.p<ComposeUiNode, j1.q, n> pVar2 = ComposeUiNode.Companion.f3404e;
        a1.c.s1(p10, c10, pVar2);
        u7.p<ComposeUiNode, b2.b, n> pVar3 = ComposeUiNode.Companion.f3403d;
        a1.c.s1(p10, bVar3, pVar3);
        u7.p<ComposeUiNode, LayoutDirection, n> pVar4 = ComposeUiNode.Companion.f3405f;
        a1.c.s1(p10, layoutDirection, pVar4);
        u7.p<ComposeUiNode, j1, n> pVar5 = ComposeUiNode.Companion.f3406g;
        a1.c.s1(p10, j1Var, pVar5);
        p10.h();
        e.o(0, a11, new v0(p10), p10, 2058660585, -2137368960);
        p10.f(968687813);
        p10.f(-1539933265);
        q<g0.c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
        g0 l14 = a1.c.l1(new r(z11 ? z10 ? oVar.f10558a : oVar.f10561e : z10 ? oVar.f10565i : oVar.f10569m), p10);
        p10.Q(false);
        long j10 = ((r) l14.getValue()).f18135a;
        v.b bVar4 = new v.b(a.C0210a.f16813b, lVar);
        Float valueOf = Float.valueOf(floatValue);
        p10.f(1157296644);
        boolean z13 = p10.z(valueOf);
        Object a02 = p10.a0();
        if (z13 || a02 == d.a.f11039a) {
            a02 = new SwitchKt$SwitchImpl$1$1$1(floatValue);
            p10.I0(a02);
        }
        p10.Q(false);
        l lVar2 = (l) a02;
        v7.g.f(lVar2, "offset");
        q0.d a12 = IndicationKt.a(e.b(bVar4, new OffsetPxModifier(lVar2, lVar)), iVar, h.a(i.c / 2, 0L, p10, 54, 4));
        v7.g.f(a12, "$this$requiredSize");
        q0.d P2 = a1.c.P(a12.Z(new SizeModifier(t02, t02, t02, t02, false, (l) lVar)), j10, h0Var);
        p10.f(733328855);
        j1.q c11 = BoxKt.c(bVar2, false, p10);
        p10.f(-1323940314);
        b2.b bVar5 = (b2.b) p10.w(h1Var);
        LayoutDirection layoutDirection2 = (LayoutDirection) p10.w(h1Var2);
        j1 j1Var2 = (j1) p10.w(h1Var3);
        ComposableLambdaImpl a13 = androidx.compose.ui.layout.a.a(P2);
        if (cVar2 instanceof g0.c) {
            p10.r();
            if (p10.L) {
                p10.m(aVar);
            } else {
                p10.n();
            }
            p10.f2661x = false;
            a1.c.s1(p10, c11, pVar2);
            a1.c.s1(p10, bVar5, pVar3);
            a1.c.s1(p10, layoutDirection2, pVar4);
            a1.c.s1(p10, j1Var2, pVar5);
            p10.h();
            e.o(0, a13, new v0(p10), p10, 2058660585, -2137368960);
            p10.f(881862015);
            if (pVar != null) {
                p10.f(-153383122);
                g0 l15 = a1.c.l1(new r(z11 ? z10 ? oVar.f10560d : oVar.f10564h : z10 ? oVar.f10568l : oVar.f10571p), p10);
                z12 = false;
                p10.Q(false);
                CompositionLocalKt.a(new p0[]{ContentColorKt.f2305a.b(l15.getValue())}, pVar, p10, ((i15 >> 12) & 112) | 8);
            } else {
                z12 = false;
            }
            p10.Q(z12);
            p10.Q(z12);
            p10.Q(z12);
            p10.Q(true);
            p10.Q(z12);
            p10.Q(z12);
            p10.Q(z12);
            p10.Q(z12);
            p10.Q(z12);
            p10.Q(true);
            p10.Q(z12);
            p10.Q(z12);
            T = p10.T();
            if (T != null) {
            }
        } else {
            a1.c.L0();
            throw null;
        }
    }
}
