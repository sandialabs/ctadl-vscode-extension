package com.noto.app.components;

import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.noto.app.NotoThemeKt;
import g0.c;
import g0.d;
import g0.h1;
import g0.r0;
import g0.t0;
import g0.z0;
import m7.n;
import n6.b;
import q0.d;
import r.e;
import r.y;
import u.j;
import u.k;
import u7.a;
import u7.q;
import v0.r;
import v7.g;

/* loaded from: classes.dex */
public final class TopAppBarKt {
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b2, code lost:
        r21 = q0.d.a.f16824i;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, a<n> aVar, int i10, d dVar, a<n> aVar2, g0.d dVar2, int i11, int i12) {
        int i13;
        Object obj;
        int i14;
        Object obj2;
        int i15;
        Object a02;
        float f10;
        a<n> aVar3;
        r0 T;
        g.f(str, "title");
        g.f(aVar, "onClick");
        ComposerImpl p10 = dVar2.p(1526658547);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (p10.z(str) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= p10.z(aVar) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            i13 |= p10.H(i10) ? 256 : 128;
        }
        int i16 = i12 & 8;
        if (i16 != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            obj = dVar;
            i13 |= p10.z(obj) ? 2048 : 1024;
            i14 = i12 & 16;
            if (i14 == 0) {
                i13 |= 24576;
            } else if ((57344 & i11) == 0) {
                obj2 = aVar2;
                i13 |= p10.z(obj2) ? 16384 : 8192;
                i15 = i13;
                if ((46811 & i15) == 9362 && p10.s()) {
                    p10.e();
                    aVar3 = obj2;
                    T = p10.T();
                    if (T == null) {
                        return;
                    }
                    T.f11073d = new TopAppBarKt$NotoTopAppbar$3(str, aVar, i10, obj, aVar3, i11, i12);
                    return;
                }
                d.a aVar4 = obj;
                a<n> aVar5 = i14 != 0 ? null : obj2;
                q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                p10.f(-492369756);
                a02 = p10.a0();
                if (a02 == d.a.f11039a) {
                    a02 = new k();
                    p10.I0(a02);
                }
                p10.Q(false);
                j jVar = (j) a02;
                p10.f(482422704);
                if (i10 > 0) {
                    p10.f(2054871046);
                    p10.Q(false);
                    f10 = ((b) p10.w(NotoThemeKt.f7585h)).f16106a;
                } else {
                    f10 = 0;
                }
                p10.Q(false);
                y R1 = a1.c.R1(150, null, 6);
                int i17 = androidx.compose.animation.core.b.f1364a;
                p10.f(-1407150062);
                e a10 = androidx.compose.animation.core.b.a(new b2.d(f10), VectorConvertersKt.c, R1, "DpAnimation", null, p10, 384);
                p10.Q(false);
                ComposableLambdaImpl i02 = a1.c.i0(p10, -355000393, new TopAppBarKt$NotoTopAppbar$1(str, i15));
                q0.d a11 = androidx.compose.ui.draw.b.a(ClickableKt.c(aVar4, jVar, null, false, null, aVar, 28), ((b2.d) a10.getValue()).f6339i, null, 30);
                ComposableLambdaImpl i03 = a1.c.i0(p10, -1061596999, new TopAppBarKt$NotoTopAppbar$2(i15, aVar5));
                h1 h1Var = ColorSchemeKt.f2278a;
                long a12 = ((e0.c) p10.w(h1Var)).a();
                p10.f(-1471507700);
                e0.c cVar = (e0.c) p10.w(h1Var);
                float f11 = f0.k.f10831e;
                g.f(cVar, "$this$applyTonalElevation");
                a<n> aVar6 = aVar5;
                e0.q qVar2 = new e0.q(a12, r.c(a12, cVar.u()) ? ColorSchemeKt.d(cVar, f11) : a12, ColorSchemeKt.e(f0.j.f10827b, p10), ColorSchemeKt.e(f0.j.f10826a, p10), ColorSchemeKt.e(f0.j.c, p10));
                p10.Q(false);
                androidx.compose.material3.a.b(i02, a11, i03, null, null, qVar2, p10, 390, 88);
                aVar3 = aVar6;
                obj = aVar4;
                T = p10.T();
                if (T == null) {
                }
            }
            obj2 = aVar2;
            i15 = i13;
            if ((46811 & i15) == 9362) {
                p10.e();
                aVar3 = obj2;
                T = p10.T();
                if (T == null) {
                }
            }
            d.a aVar42 = obj;
            if (i14 != 0) {
            }
            q<c<?>, z0, t0, n> qVar3 = ComposerKt.f2737a;
            p10.f(-492369756);
            a02 = p10.a0();
            if (a02 == d.a.f11039a) {
            }
            p10.Q(false);
            j jVar2 = (j) a02;
            p10.f(482422704);
            if (i10 > 0) {
            }
            p10.Q(false);
            y R12 = a1.c.R1(150, null, 6);
            int i172 = androidx.compose.animation.core.b.f1364a;
            p10.f(-1407150062);
            e a102 = androidx.compose.animation.core.b.a(new b2.d(f10), VectorConvertersKt.c, R12, "DpAnimation", null, p10, 384);
            p10.Q(false);
            ComposableLambdaImpl i022 = a1.c.i0(p10, -355000393, new TopAppBarKt$NotoTopAppbar$1(str, i15));
            q0.d a112 = androidx.compose.ui.draw.b.a(ClickableKt.c(aVar42, jVar2, null, false, null, aVar, 28), ((b2.d) a102.getValue()).f6339i, null, 30);
            ComposableLambdaImpl i032 = a1.c.i0(p10, -1061596999, new TopAppBarKt$NotoTopAppbar$2(i15, aVar5));
            h1 h1Var2 = ColorSchemeKt.f2278a;
            long a122 = ((e0.c) p10.w(h1Var2)).a();
            p10.f(-1471507700);
            e0.c cVar2 = (e0.c) p10.w(h1Var2);
            float f112 = f0.k.f10831e;
            g.f(cVar2, "$this$applyTonalElevation");
            a<n> aVar62 = aVar5;
            e0.q qVar22 = new e0.q(a122, r.c(a122, cVar2.u()) ? ColorSchemeKt.d(cVar2, f112) : a122, ColorSchemeKt.e(f0.j.f10827b, p10), ColorSchemeKt.e(f0.j.f10826a, p10), ColorSchemeKt.e(f0.j.c, p10));
            p10.Q(false);
            androidx.compose.material3.a.b(i022, a112, i032, null, null, qVar22, p10, 390, 88);
            aVar3 = aVar62;
            obj = aVar42;
            T = p10.T();
            if (T == null) {
            }
        }
        obj = dVar;
        i14 = i12 & 16;
        if (i14 == 0) {
        }
        obj2 = aVar2;
        i15 = i13;
        if ((46811 & i15) == 9362) {
        }
        d.a aVar422 = obj;
        if (i14 != 0) {
        }
        q<c<?>, z0, t0, n> qVar32 = ComposerKt.f2737a;
        p10.f(-492369756);
        a02 = p10.a0();
        if (a02 == d.a.f11039a) {
        }
        p10.Q(false);
        j jVar22 = (j) a02;
        p10.f(482422704);
        if (i10 > 0) {
        }
        p10.Q(false);
        y R122 = a1.c.R1(150, null, 6);
        int i1722 = androidx.compose.animation.core.b.f1364a;
        p10.f(-1407150062);
        e a1022 = androidx.compose.animation.core.b.a(new b2.d(f10), VectorConvertersKt.c, R122, "DpAnimation", null, p10, 384);
        p10.Q(false);
        ComposableLambdaImpl i0222 = a1.c.i0(p10, -355000393, new TopAppBarKt$NotoTopAppbar$1(str, i15));
        q0.d a1122 = androidx.compose.ui.draw.b.a(ClickableKt.c(aVar422, jVar22, null, false, null, aVar, 28), ((b2.d) a1022.getValue()).f6339i, null, 30);
        ComposableLambdaImpl i0322 = a1.c.i0(p10, -1061596999, new TopAppBarKt$NotoTopAppbar$2(i15, aVar5));
        h1 h1Var22 = ColorSchemeKt.f2278a;
        long a1222 = ((e0.c) p10.w(h1Var22)).a();
        p10.f(-1471507700);
        e0.c cVar22 = (e0.c) p10.w(h1Var22);
        float f1122 = f0.k.f10831e;
        g.f(cVar22, "$this$applyTonalElevation");
        a<n> aVar622 = aVar5;
        e0.q qVar222 = new e0.q(a1222, r.c(a1222, cVar22.u()) ? ColorSchemeKt.d(cVar22, f1122) : a1222, ColorSchemeKt.e(f0.j.f10827b, p10), ColorSchemeKt.e(f0.j.f10826a, p10), ColorSchemeKt.e(f0.j.c, p10));
        p10.Q(false);
        androidx.compose.material3.a.b(i0222, a1122, i0322, null, null, qVar222, p10, 390, 88);
        aVar3 = aVar622;
        obj = aVar422;
        T = p10.T();
        if (T == null) {
        }
    }
}
