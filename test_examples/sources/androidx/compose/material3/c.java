package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import g0.d;
import g0.g0;
import g0.p0;
import g0.r0;
import g0.t0;
import g0.z0;
import m7.n;
import r.e;
import u.j;
import u.k;
import u7.q;
import v.o;
import v.p;
import v0.h0;
import v0.r;
import v7.g;

/* loaded from: classes.dex */
public final class c {
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0188, code lost:
        r2 = q0.d.a.f16824i;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(u7.a aVar, q0.d dVar, boolean z10, h0 h0Var, e0.a aVar2, b bVar, o oVar, j jVar, q qVar, g0.d dVar2, int i10, int i11) {
        int i12;
        int i13;
        h0 h0Var2;
        e0.a aVar3;
        b bVar2;
        int i14;
        int i15;
        Object obj;
        int i16;
        int i17;
        q0.d dVar3;
        boolean z11;
        h0 h0Var3;
        e0.a aVar4;
        b bVar3;
        Object obj2;
        q0.d dVar4;
        boolean z12;
        h0 h0Var4;
        e0.a aVar5;
        b bVar4;
        Object obj3;
        j jVar2;
        e a10;
        ?? r13;
        e a11;
        ?? r22;
        ComposerImpl composerImpl;
        b bVar5;
        j jVar3;
        e0.a aVar6;
        boolean z13;
        q0.d dVar5;
        h0 h0Var5;
        o oVar2;
        r0 T;
        int i18;
        int i19;
        int i20;
        g.f(aVar, "onClick");
        g.f(qVar, "content");
        ComposerImpl p10 = dVar2.p(650121315);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (p10.z(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= p10.z(dVar) ? 32 : 16;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                i12 |= p10.c(z10) ? 256 : 128;
                if ((i10 & 7168) == 0) {
                    if ((i11 & 8) == 0) {
                        h0Var2 = h0Var;
                        if (p10.z(h0Var2)) {
                            i20 = 2048;
                            i12 |= i20;
                        }
                    } else {
                        h0Var2 = h0Var;
                    }
                    i20 = 1024;
                    i12 |= i20;
                } else {
                    h0Var2 = h0Var;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        aVar3 = aVar2;
                        if (p10.z(aVar3)) {
                            i19 = 16384;
                            i12 |= i19;
                        }
                    } else {
                        aVar3 = aVar2;
                    }
                    i19 = 8192;
                    i12 |= i19;
                } else {
                    aVar3 = aVar2;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        bVar2 = bVar;
                        if (p10.z(bVar2)) {
                            i18 = 131072;
                            i12 |= i18;
                        }
                    } else {
                        bVar2 = bVar;
                    }
                    i18 = 65536;
                    i12 |= i18;
                } else {
                    bVar2 = bVar;
                }
                if ((i11 & 64) != 0) {
                    i14 = 1572864;
                } else {
                    if ((3670016 & i10) == 0) {
                        i14 = p10.z(null) ? 1048576 : 524288;
                    }
                    i15 = i11 & 128;
                    if (i15 == 0) {
                        i12 |= 12582912;
                        obj = oVar;
                    } else {
                        Object obj4 = oVar;
                        obj = obj4;
                        if ((i10 & 29360128) == 0) {
                            i12 |= p10.z(obj4) ? 8388608 : 4194304;
                            obj = obj4;
                        }
                    }
                    i16 = i11 & 256;
                    if (i16 == 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        i12 |= p10.z(jVar) ? 67108864 : 33554432;
                    }
                    if ((i11 & 512) == 0) {
                        i17 = 805306368;
                    } else {
                        if ((i10 & 1879048192) == 0) {
                            i17 = p10.z(qVar) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i12) == 306783378 && p10.s()) {
                            p10.e();
                            dVar5 = dVar;
                            z13 = z10;
                            h0Var5 = h0Var2;
                            aVar6 = aVar3;
                            bVar5 = bVar2;
                            oVar2 = obj;
                            composerImpl = p10;
                            jVar3 = jVar;
                            T = composerImpl.T();
                            if (T != null) {
                                return;
                            }
                            T.f11073d = new ButtonKt$Button$3(aVar, dVar5, z13, h0Var5, aVar6, bVar5, oVar2, jVar3, qVar, i10, i11);
                            return;
                        }
                        p10.t0();
                        if ((i10 & 1) != 0 && !p10.X()) {
                            p10.e();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            dVar3 = dVar;
                            z11 = z10;
                            h0Var3 = h0Var2;
                            aVar4 = aVar3;
                            bVar3 = bVar2;
                            obj2 = obj;
                            dVar4 = dVar3;
                            z12 = z11;
                            h0Var4 = h0Var3;
                            aVar5 = aVar4;
                            bVar4 = bVar3;
                            obj3 = obj2;
                            jVar2 = jVar;
                            p10.R();
                            q<g0.c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
                            int i22 = (i12 >> 6) & 14;
                            int i23 = i12 >> 9;
                            aVar5.getClass();
                            p10.f(-754887434);
                            g0 l12 = a1.c.l1(new r(!z12 ? aVar5.f10507a : aVar5.c), p10);
                            p10.Q(false);
                            long j2 = ((r) l12.getValue()).f18135a;
                            p10.f(-360303250);
                            e0.a aVar7 = aVar5;
                            g0 l13 = a1.c.l1(new r(!z12 ? aVar5.f10508b : aVar5.f10509d), p10);
                            p10.Q(false);
                            long j10 = ((r) l13.getValue()).f18135a;
                            p10.f(823570087);
                            if (bVar4 != null) {
                                a10 = null;
                                r13 = 0;
                            } else {
                                int i24 = i22 | ((i12 >> 21) & 112) | (i23 & 896);
                                g.f(jVar2, "interactionSource");
                                p10.f(-2045116089);
                                a10 = bVar4.a(z12, jVar2, p10, (i24 & 896) | (i24 & 14) | (i24 & 112));
                                r13 = 0;
                                p10.Q(false);
                            }
                            p10.Q(r13);
                            float f10 = a10 == null ? ((b2.d) a10.getValue()).f6339i : (float) r13;
                            p10.f(823570182);
                            if (bVar4 != 0) {
                                a11 = null;
                                r22 = 0;
                            } else {
                                int i25 = i22 | ((i12 >> 21) & 112) | (i23 & 896);
                                g.f(jVar2, "interactionSource");
                                p10.f(-423890235);
                                a11 = bVar4.a(z12, jVar2, p10, (i25 & 896) | (i25 & 14) | (i25 & 112));
                                r22 = 0;
                                p10.Q(false);
                            }
                            p10.Q(r22);
                            float f11 = a11 == null ? ((b2.d) a11.getValue()).f6339i : (float) r22;
                            ComposableLambdaImpl i02 = a1.c.i0(p10, 956488494, new ButtonKt$Button$2(j10, obj3, qVar, i12));
                            int i26 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | ((i12 << 6) & 234881024) | ((i12 << 3) & 1879048192);
                            g0.r rVar = SurfaceKt.f2510a;
                            p10.f(-789752804);
                            g0.r rVar2 = SurfaceKt.f2510a;
                            float f12 = ((b2.d) p10.w(rVar2)).f6339i + f11;
                            j jVar4 = jVar2;
                            composerImpl = p10;
                            CompositionLocalKt.a(new p0[]{ContentColorKt.f2305a.b(new r(j10)), rVar2.b(new b2.d(f12))}, a1.c.i0(composerImpl, 1279702876, new SurfaceKt$Surface$3(dVar4, h0Var4, j2, f12, i26, f10, jVar4, z12, aVar, i02)), composerImpl, 56);
                            composerImpl.Q(false);
                            bVar5 = bVar4;
                            jVar3 = jVar4;
                            aVar6 = aVar7;
                            z13 = z12;
                            dVar5 = dVar4;
                            h0Var5 = h0Var4;
                            oVar2 = obj3;
                            T = composerImpl.T();
                            if (T != null) {
                            }
                        }
                        dVar3 = dVar;
                        z11 = i13 != 0 ? true : z10;
                        if ((i11 & 8) != 0) {
                            p pVar = e0.b.f10510a;
                            p10.f(-1234923021);
                            q<g0.c<?>, z0, t0, n> qVar3 = ComposerKt.f2737a;
                            h0Var3 = ShapesKt.a(f0.d.f10777b, p10);
                            p10.Q(false);
                            i12 &= -7169;
                        } else {
                            h0Var3 = h0Var2;
                        }
                        if ((i11 & 16) != 0) {
                            p pVar2 = e0.b.f10510a;
                            p10.f(-339300779);
                            float f13 = f0.d.f10776a;
                            long e10 = ColorSchemeKt.e(ColorSchemeKeyTokens.Primary, p10);
                            long e11 = ColorSchemeKt.e(f0.d.f10782h, p10);
                            long b5 = r.b(ColorSchemeKt.e(f0.d.c, p10), 0.12f);
                            long b10 = r.b(ColorSchemeKt.e(f0.d.f10779e, p10), 0.38f);
                            q<g0.c<?>, z0, t0, n> qVar4 = ComposerKt.f2737a;
                            aVar4 = new e0.a(e10, e11, b5, b10);
                            p10.Q(false);
                            i12 &= -57345;
                        } else {
                            aVar4 = aVar3;
                        }
                        if ((i11 & 32) != 0) {
                            p pVar3 = e0.b.f10510a;
                            p10.f(1827791191);
                            float f14 = f0.d.f10776a;
                            float f15 = f0.d.f10783i;
                            float f16 = f0.d.f10780f;
                            float f17 = f0.d.f10781g;
                            float f18 = f0.d.f10778d;
                            q<g0.c<?>, z0, t0, n> qVar5 = ComposerKt.f2737a;
                            bVar3 = new b(f14, f15, f16, f17, f18);
                            p10.Q(false);
                            i12 &= -458753;
                        } else {
                            bVar3 = bVar2;
                        }
                        obj2 = i15 != 0 ? e0.b.f10510a : obj;
                        if (i16 != 0) {
                            p10.f(-492369756);
                            Object a02 = p10.a0();
                            if (a02 == d.a.f11039a) {
                                a02 = new k();
                                p10.I0(a02);
                            }
                            p10.Q(false);
                            dVar4 = dVar3;
                            z12 = z11;
                            h0Var4 = h0Var3;
                            aVar5 = aVar4;
                            bVar4 = bVar3;
                            obj3 = obj2;
                            jVar2 = (j) a02;
                            p10.R();
                            q<g0.c<?>, z0, t0, n> qVar22 = ComposerKt.f2737a;
                            int i222 = (i12 >> 6) & 14;
                            int i232 = i12 >> 9;
                            aVar5.getClass();
                            p10.f(-754887434);
                            g0 l122 = a1.c.l1(new r(!z12 ? aVar5.f10507a : aVar5.c), p10);
                            p10.Q(false);
                            long j22 = ((r) l122.getValue()).f18135a;
                            p10.f(-360303250);
                            e0.a aVar72 = aVar5;
                            g0 l132 = a1.c.l1(new r(!z12 ? aVar5.f10508b : aVar5.f10509d), p10);
                            p10.Q(false);
                            long j102 = ((r) l132.getValue()).f18135a;
                            p10.f(823570087);
                            if (bVar4 != null) {
                            }
                            p10.Q(r13);
                            if (a10 == null) {
                            }
                            p10.f(823570182);
                            if (bVar4 != 0) {
                            }
                            p10.Q(r22);
                            if (a11 == null) {
                            }
                            ComposableLambdaImpl i022 = a1.c.i0(p10, 956488494, new ButtonKt$Button$2(j102, obj3, qVar, i12));
                            int i262 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | ((i12 << 6) & 234881024) | ((i12 << 3) & 1879048192);
                            g0.r rVar3 = SurfaceKt.f2510a;
                            p10.f(-789752804);
                            g0.r rVar22 = SurfaceKt.f2510a;
                            float f122 = ((b2.d) p10.w(rVar22)).f6339i + f11;
                            j jVar42 = jVar2;
                            composerImpl = p10;
                            CompositionLocalKt.a(new p0[]{ContentColorKt.f2305a.b(new r(j102)), rVar22.b(new b2.d(f122))}, a1.c.i0(composerImpl, 1279702876, new SurfaceKt$Surface$3(dVar4, h0Var4, j22, f122, i262, f10, jVar42, z12, aVar, i022)), composerImpl, 56);
                            composerImpl.Q(false);
                            bVar5 = bVar4;
                            jVar3 = jVar42;
                            aVar6 = aVar72;
                            z13 = z12;
                            dVar5 = dVar4;
                            h0Var5 = h0Var4;
                            oVar2 = obj3;
                            T = composerImpl.T();
                            if (T != null) {
                            }
                        }
                        dVar4 = dVar3;
                        z12 = z11;
                        h0Var4 = h0Var3;
                        aVar5 = aVar4;
                        bVar4 = bVar3;
                        obj3 = obj2;
                        jVar2 = jVar;
                        p10.R();
                        q<g0.c<?>, z0, t0, n> qVar222 = ComposerKt.f2737a;
                        int i2222 = (i12 >> 6) & 14;
                        int i2322 = i12 >> 9;
                        aVar5.getClass();
                        p10.f(-754887434);
                        g0 l1222 = a1.c.l1(new r(!z12 ? aVar5.f10507a : aVar5.c), p10);
                        p10.Q(false);
                        long j222 = ((r) l1222.getValue()).f18135a;
                        p10.f(-360303250);
                        e0.a aVar722 = aVar5;
                        g0 l1322 = a1.c.l1(new r(!z12 ? aVar5.f10508b : aVar5.f10509d), p10);
                        p10.Q(false);
                        long j1022 = ((r) l1322.getValue()).f18135a;
                        p10.f(823570087);
                        if (bVar4 != null) {
                        }
                        p10.Q(r13);
                        if (a10 == null) {
                        }
                        p10.f(823570182);
                        if (bVar4 != 0) {
                        }
                        p10.Q(r22);
                        if (a11 == null) {
                        }
                        ComposableLambdaImpl i0222 = a1.c.i0(p10, 956488494, new ButtonKt$Button$2(j1022, obj3, qVar, i12));
                        int i2622 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | ((i12 << 6) & 234881024) | ((i12 << 3) & 1879048192);
                        g0.r rVar32 = SurfaceKt.f2510a;
                        p10.f(-789752804);
                        g0.r rVar222 = SurfaceKt.f2510a;
                        float f1222 = ((b2.d) p10.w(rVar222)).f6339i + f11;
                        j jVar422 = jVar2;
                        composerImpl = p10;
                        CompositionLocalKt.a(new p0[]{ContentColorKt.f2305a.b(new r(j1022)), rVar222.b(new b2.d(f1222))}, a1.c.i0(composerImpl, 1279702876, new SurfaceKt$Surface$3(dVar4, h0Var4, j222, f1222, i2622, f10, jVar422, z12, aVar, i0222)), composerImpl, 56);
                        composerImpl.Q(false);
                        bVar5 = bVar4;
                        jVar3 = jVar422;
                        aVar6 = aVar722;
                        z13 = z12;
                        dVar5 = dVar4;
                        h0Var5 = h0Var4;
                        oVar2 = obj3;
                        T = composerImpl.T();
                        if (T != null) {
                        }
                    }
                    i12 |= i17;
                    if ((1533916891 & i12) == 306783378) {
                        p10.e();
                        dVar5 = dVar;
                        z13 = z10;
                        h0Var5 = h0Var2;
                        aVar6 = aVar3;
                        bVar5 = bVar2;
                        oVar2 = obj;
                        composerImpl = p10;
                        jVar3 = jVar;
                        T = composerImpl.T();
                        if (T != null) {
                        }
                    }
                    p10.t0();
                    if ((i10 & 1) != 0) {
                        p10.e();
                        if ((i11 & 8) != 0) {
                        }
                        if ((i11 & 16) != 0) {
                        }
                        if ((i11 & 32) != 0) {
                        }
                        dVar3 = dVar;
                        z11 = z10;
                        h0Var3 = h0Var2;
                        aVar4 = aVar3;
                        bVar3 = bVar2;
                        obj2 = obj;
                        dVar4 = dVar3;
                        z12 = z11;
                        h0Var4 = h0Var3;
                        aVar5 = aVar4;
                        bVar4 = bVar3;
                        obj3 = obj2;
                        jVar2 = jVar;
                        p10.R();
                        q<g0.c<?>, z0, t0, n> qVar2222 = ComposerKt.f2737a;
                        int i22222 = (i12 >> 6) & 14;
                        int i23222 = i12 >> 9;
                        aVar5.getClass();
                        p10.f(-754887434);
                        g0 l12222 = a1.c.l1(new r(!z12 ? aVar5.f10507a : aVar5.c), p10);
                        p10.Q(false);
                        long j2222 = ((r) l12222.getValue()).f18135a;
                        p10.f(-360303250);
                        e0.a aVar7222 = aVar5;
                        g0 l13222 = a1.c.l1(new r(!z12 ? aVar5.f10508b : aVar5.f10509d), p10);
                        p10.Q(false);
                        long j10222 = ((r) l13222.getValue()).f18135a;
                        p10.f(823570087);
                        if (bVar4 != null) {
                        }
                        p10.Q(r13);
                        if (a10 == null) {
                        }
                        p10.f(823570182);
                        if (bVar4 != 0) {
                        }
                        p10.Q(r22);
                        if (a11 == null) {
                        }
                        ComposableLambdaImpl i02222 = a1.c.i0(p10, 956488494, new ButtonKt$Button$2(j10222, obj3, qVar, i12));
                        int i26222 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | ((i12 << 6) & 234881024) | ((i12 << 3) & 1879048192);
                        g0.r rVar322 = SurfaceKt.f2510a;
                        p10.f(-789752804);
                        g0.r rVar2222 = SurfaceKt.f2510a;
                        float f12222 = ((b2.d) p10.w(rVar2222)).f6339i + f11;
                        j jVar4222 = jVar2;
                        composerImpl = p10;
                        CompositionLocalKt.a(new p0[]{ContentColorKt.f2305a.b(new r(j10222)), rVar2222.b(new b2.d(f12222))}, a1.c.i0(composerImpl, 1279702876, new SurfaceKt$Surface$3(dVar4, h0Var4, j2222, f12222, i26222, f10, jVar4222, z12, aVar, i02222)), composerImpl, 56);
                        composerImpl.Q(false);
                        bVar5 = bVar4;
                        jVar3 = jVar4222;
                        aVar6 = aVar7222;
                        z13 = z12;
                        dVar5 = dVar4;
                        h0Var5 = h0Var4;
                        oVar2 = obj3;
                        T = composerImpl.T();
                        if (T != null) {
                        }
                    }
                    dVar3 = dVar;
                    if (i13 != 0) {
                    }
                    if ((i11 & 8) != 0) {
                    }
                    if ((i11 & 16) != 0) {
                    }
                    if ((i11 & 32) != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    dVar4 = dVar3;
                    z12 = z11;
                    h0Var4 = h0Var3;
                    aVar5 = aVar4;
                    bVar4 = bVar3;
                    obj3 = obj2;
                    jVar2 = jVar;
                    p10.R();
                    q<g0.c<?>, z0, t0, n> qVar22222 = ComposerKt.f2737a;
                    int i222222 = (i12 >> 6) & 14;
                    int i232222 = i12 >> 9;
                    aVar5.getClass();
                    p10.f(-754887434);
                    g0 l122222 = a1.c.l1(new r(!z12 ? aVar5.f10507a : aVar5.c), p10);
                    p10.Q(false);
                    long j22222 = ((r) l122222.getValue()).f18135a;
                    p10.f(-360303250);
                    e0.a aVar72222 = aVar5;
                    g0 l132222 = a1.c.l1(new r(!z12 ? aVar5.f10508b : aVar5.f10509d), p10);
                    p10.Q(false);
                    long j102222 = ((r) l132222.getValue()).f18135a;
                    p10.f(823570087);
                    if (bVar4 != null) {
                    }
                    p10.Q(r13);
                    if (a10 == null) {
                    }
                    p10.f(823570182);
                    if (bVar4 != 0) {
                    }
                    p10.Q(r22);
                    if (a11 == null) {
                    }
                    ComposableLambdaImpl i022222 = a1.c.i0(p10, 956488494, new ButtonKt$Button$2(j102222, obj3, qVar, i12));
                    int i262222 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | ((i12 << 6) & 234881024) | ((i12 << 3) & 1879048192);
                    g0.r rVar3222 = SurfaceKt.f2510a;
                    p10.f(-789752804);
                    g0.r rVar22222 = SurfaceKt.f2510a;
                    float f122222 = ((b2.d) p10.w(rVar22222)).f6339i + f11;
                    j jVar42222 = jVar2;
                    composerImpl = p10;
                    CompositionLocalKt.a(new p0[]{ContentColorKt.f2305a.b(new r(j102222)), rVar22222.b(new b2.d(f122222))}, a1.c.i0(composerImpl, 1279702876, new SurfaceKt$Surface$3(dVar4, h0Var4, j22222, f122222, i262222, f10, jVar42222, z12, aVar, i022222)), composerImpl, 56);
                    composerImpl.Q(false);
                    bVar5 = bVar4;
                    jVar3 = jVar42222;
                    aVar6 = aVar72222;
                    z13 = z12;
                    dVar5 = dVar4;
                    h0Var5 = h0Var4;
                    oVar2 = obj3;
                    T = composerImpl.T();
                    if (T != null) {
                    }
                }
                i12 |= i14;
                i15 = i11 & 128;
                if (i15 == 0) {
                }
                i16 = i11 & 256;
                if (i16 == 0) {
                }
                if ((i11 & 512) == 0) {
                }
                i12 |= i17;
                if ((1533916891 & i12) == 306783378) {
                }
                p10.t0();
                if ((i10 & 1) != 0) {
                }
                dVar3 = dVar;
                if (i13 != 0) {
                }
                if ((i11 & 8) != 0) {
                }
                if ((i11 & 16) != 0) {
                }
                if ((i11 & 32) != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                dVar4 = dVar3;
                z12 = z11;
                h0Var4 = h0Var3;
                aVar5 = aVar4;
                bVar4 = bVar3;
                obj3 = obj2;
                jVar2 = jVar;
                p10.R();
                q<g0.c<?>, z0, t0, n> qVar222222 = ComposerKt.f2737a;
                int i2222222 = (i12 >> 6) & 14;
                int i2322222 = i12 >> 9;
                aVar5.getClass();
                p10.f(-754887434);
                g0 l1222222 = a1.c.l1(new r(!z12 ? aVar5.f10507a : aVar5.c), p10);
                p10.Q(false);
                long j222222 = ((r) l1222222.getValue()).f18135a;
                p10.f(-360303250);
                e0.a aVar722222 = aVar5;
                g0 l1322222 = a1.c.l1(new r(!z12 ? aVar5.f10508b : aVar5.f10509d), p10);
                p10.Q(false);
                long j1022222 = ((r) l1322222.getValue()).f18135a;
                p10.f(823570087);
                if (bVar4 != null) {
                }
                p10.Q(r13);
                if (a10 == null) {
                }
                p10.f(823570182);
                if (bVar4 != 0) {
                }
                p10.Q(r22);
                if (a11 == null) {
                }
                ComposableLambdaImpl i0222222 = a1.c.i0(p10, 956488494, new ButtonKt$Button$2(j1022222, obj3, qVar, i12));
                int i2622222 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | ((i12 << 6) & 234881024) | ((i12 << 3) & 1879048192);
                g0.r rVar32222 = SurfaceKt.f2510a;
                p10.f(-789752804);
                g0.r rVar222222 = SurfaceKt.f2510a;
                float f1222222 = ((b2.d) p10.w(rVar222222)).f6339i + f11;
                j jVar422222 = jVar2;
                composerImpl = p10;
                CompositionLocalKt.a(new p0[]{ContentColorKt.f2305a.b(new r(j1022222)), rVar222222.b(new b2.d(f1222222))}, a1.c.i0(composerImpl, 1279702876, new SurfaceKt$Surface$3(dVar4, h0Var4, j222222, f1222222, i2622222, f10, jVar422222, z12, aVar, i0222222)), composerImpl, 56);
                composerImpl.Q(false);
                bVar5 = bVar4;
                jVar3 = jVar422222;
                aVar6 = aVar722222;
                z13 = z12;
                dVar5 = dVar4;
                h0Var5 = h0Var4;
                oVar2 = obj3;
                T = composerImpl.T();
                if (T != null) {
                }
            }
            if ((i10 & 7168) == 0) {
            }
            if ((57344 & i10) == 0) {
            }
            if ((458752 & i10) == 0) {
            }
            if ((i11 & 64) != 0) {
            }
            i12 |= i14;
            i15 = i11 & 128;
            if (i15 == 0) {
            }
            i16 = i11 & 256;
            if (i16 == 0) {
            }
            if ((i11 & 512) == 0) {
            }
            i12 |= i17;
            if ((1533916891 & i12) == 306783378) {
            }
            p10.t0();
            if ((i10 & 1) != 0) {
            }
            dVar3 = dVar;
            if (i13 != 0) {
            }
            if ((i11 & 8) != 0) {
            }
            if ((i11 & 16) != 0) {
            }
            if ((i11 & 32) != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            dVar4 = dVar3;
            z12 = z11;
            h0Var4 = h0Var3;
            aVar5 = aVar4;
            bVar4 = bVar3;
            obj3 = obj2;
            jVar2 = jVar;
            p10.R();
            q<g0.c<?>, z0, t0, n> qVar2222222 = ComposerKt.f2737a;
            int i22222222 = (i12 >> 6) & 14;
            int i23222222 = i12 >> 9;
            aVar5.getClass();
            p10.f(-754887434);
            g0 l12222222 = a1.c.l1(new r(!z12 ? aVar5.f10507a : aVar5.c), p10);
            p10.Q(false);
            long j2222222 = ((r) l12222222.getValue()).f18135a;
            p10.f(-360303250);
            e0.a aVar7222222 = aVar5;
            g0 l13222222 = a1.c.l1(new r(!z12 ? aVar5.f10508b : aVar5.f10509d), p10);
            p10.Q(false);
            long j10222222 = ((r) l13222222.getValue()).f18135a;
            p10.f(823570087);
            if (bVar4 != null) {
            }
            p10.Q(r13);
            if (a10 == null) {
            }
            p10.f(823570182);
            if (bVar4 != 0) {
            }
            p10.Q(r22);
            if (a11 == null) {
            }
            ComposableLambdaImpl i02222222 = a1.c.i0(p10, 956488494, new ButtonKt$Button$2(j10222222, obj3, qVar, i12));
            int i26222222 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | ((i12 << 6) & 234881024) | ((i12 << 3) & 1879048192);
            g0.r rVar322222 = SurfaceKt.f2510a;
            p10.f(-789752804);
            g0.r rVar2222222 = SurfaceKt.f2510a;
            float f12222222 = ((b2.d) p10.w(rVar2222222)).f6339i + f11;
            j jVar4222222 = jVar2;
            composerImpl = p10;
            CompositionLocalKt.a(new p0[]{ContentColorKt.f2305a.b(new r(j10222222)), rVar2222222.b(new b2.d(f12222222))}, a1.c.i0(composerImpl, 1279702876, new SurfaceKt$Surface$3(dVar4, h0Var4, j2222222, f12222222, i26222222, f10, jVar4222222, z12, aVar, i02222222)), composerImpl, 56);
            composerImpl.Q(false);
            bVar5 = bVar4;
            jVar3 = jVar4222222;
            aVar6 = aVar7222222;
            z13 = z12;
            dVar5 = dVar4;
            h0Var5 = h0Var4;
            oVar2 = obj3;
            T = composerImpl.T();
            if (T != null) {
            }
        }
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        if ((i10 & 7168) == 0) {
        }
        if ((57344 & i10) == 0) {
        }
        if ((458752 & i10) == 0) {
        }
        if ((i11 & 64) != 0) {
        }
        i12 |= i14;
        i15 = i11 & 128;
        if (i15 == 0) {
        }
        i16 = i11 & 256;
        if (i16 == 0) {
        }
        if ((i11 & 512) == 0) {
        }
        i12 |= i17;
        if ((1533916891 & i12) == 306783378) {
        }
        p10.t0();
        if ((i10 & 1) != 0) {
        }
        dVar3 = dVar;
        if (i13 != 0) {
        }
        if ((i11 & 8) != 0) {
        }
        if ((i11 & 16) != 0) {
        }
        if ((i11 & 32) != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        dVar4 = dVar3;
        z12 = z11;
        h0Var4 = h0Var3;
        aVar5 = aVar4;
        bVar4 = bVar3;
        obj3 = obj2;
        jVar2 = jVar;
        p10.R();
        q<g0.c<?>, z0, t0, n> qVar22222222 = ComposerKt.f2737a;
        int i222222222 = (i12 >> 6) & 14;
        int i232222222 = i12 >> 9;
        aVar5.getClass();
        p10.f(-754887434);
        g0 l122222222 = a1.c.l1(new r(!z12 ? aVar5.f10507a : aVar5.c), p10);
        p10.Q(false);
        long j22222222 = ((r) l122222222.getValue()).f18135a;
        p10.f(-360303250);
        e0.a aVar72222222 = aVar5;
        g0 l132222222 = a1.c.l1(new r(!z12 ? aVar5.f10508b : aVar5.f10509d), p10);
        p10.Q(false);
        long j102222222 = ((r) l132222222.getValue()).f18135a;
        p10.f(823570087);
        if (bVar4 != null) {
        }
        p10.Q(r13);
        if (a10 == null) {
        }
        p10.f(823570182);
        if (bVar4 != 0) {
        }
        p10.Q(r22);
        if (a11 == null) {
        }
        ComposableLambdaImpl i022222222 = a1.c.i0(p10, 956488494, new ButtonKt$Button$2(j102222222, obj3, qVar, i12));
        int i262222222 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | ((i12 << 6) & 234881024) | ((i12 << 3) & 1879048192);
        g0.r rVar3222222 = SurfaceKt.f2510a;
        p10.f(-789752804);
        g0.r rVar22222222 = SurfaceKt.f2510a;
        float f122222222 = ((b2.d) p10.w(rVar22222222)).f6339i + f11;
        j jVar42222222 = jVar2;
        composerImpl = p10;
        CompositionLocalKt.a(new p0[]{ContentColorKt.f2305a.b(new r(j102222222)), rVar22222222.b(new b2.d(f122222222))}, a1.c.i0(composerImpl, 1279702876, new SurfaceKt$Surface$3(dVar4, h0Var4, j22222222, f122222222, i262222222, f10, jVar42222222, z12, aVar, i022222222)), composerImpl, 56);
        composerImpl.Q(false);
        bVar5 = bVar4;
        jVar3 = jVar42222222;
        aVar6 = aVar72222222;
        z13 = z12;
        dVar5 = dVar4;
        h0Var5 = h0Var4;
        oVar2 = obj3;
        T = composerImpl.T();
        if (T != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x018b, code lost:
        r1 = q0.d.a.f16824i;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(u7.a aVar, q0.d dVar, boolean z10, h0 h0Var, e0.a aVar2, b bVar, o oVar, j jVar, q qVar, g0.d dVar2, int i10, int i11) {
        int i12;
        int i13;
        Object obj;
        int i14;
        Object obj2;
        int i15;
        int i16;
        Object obj3;
        int i17;
        int i18;
        h0 h0Var2;
        e0.a aVar3;
        j jVar2;
        q0.d dVar3;
        j jVar3;
        boolean z11;
        h0 h0Var3;
        Object obj4;
        Object obj5;
        ComposerImpl composerImpl;
        q0.d dVar4;
        boolean z12;
        h0 h0Var4;
        e0.a aVar4;
        b bVar2;
        o oVar2;
        j jVar4;
        r0 T;
        int i19;
        int i20;
        g.f(aVar, "onClick");
        g.f(qVar, "content");
        ComposerImpl p10 = dVar2.p(-2106428362);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (p10.z(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= p10.z(dVar) ? 32 : 16;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                i12 |= p10.c(z10) ? 256 : 128;
                if ((i10 & 7168) == 0) {
                    if ((i11 & 8) == 0 && p10.z(h0Var)) {
                        i20 = 2048;
                        i12 |= i20;
                    }
                    i20 = 1024;
                    i12 |= i20;
                }
                if ((i10 & 57344) == 0) {
                    if ((i11 & 16) == 0) {
                        obj = aVar2;
                        if (p10.z(obj)) {
                            i19 = 16384;
                            i12 |= i19;
                        }
                    } else {
                        obj = aVar2;
                    }
                    i19 = 8192;
                    i12 |= i19;
                } else {
                    obj = aVar2;
                }
                i14 = i11 & 32;
                if (i14 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 458752) == 0) {
                    obj2 = bVar;
                    i12 |= p10.z(obj2) ? 131072 : 65536;
                    if ((i11 & 64) == 0) {
                        i15 = 1572864;
                    } else {
                        if ((i10 & 3670016) == 0) {
                            i15 = p10.z(null) ? 1048576 : 524288;
                        }
                        i16 = i11 & 128;
                        if (i16 != 0) {
                            i12 |= 12582912;
                            obj3 = oVar;
                        } else {
                            obj3 = oVar;
                            if ((i10 & 29360128) == 0) {
                                i12 |= p10.z(obj3) ? 8388608 : 4194304;
                            }
                        }
                        i17 = i11 & 256;
                        if (i17 != 0) {
                            i12 |= 100663296;
                        } else if ((i10 & 234881024) == 0) {
                            i12 |= p10.z(jVar) ? 67108864 : 33554432;
                        }
                        if ((i11 & 512) != 0) {
                            i18 = 805306368;
                        } else {
                            if ((i10 & 1879048192) == 0) {
                                i18 = p10.z(qVar) ? 536870912 : 268435456;
                            }
                            if ((1533916891 & i12) == 306783378 && p10.s()) {
                                p10.e();
                                dVar4 = dVar;
                                z12 = z10;
                                h0Var4 = h0Var;
                                jVar4 = jVar;
                                aVar4 = obj;
                                composerImpl = p10;
                                oVar2 = obj3;
                                bVar2 = obj2;
                                T = composerImpl.T();
                                if (T != null) {
                                    return;
                                }
                                T.f11073d = new ButtonKt$TextButton$2(aVar, dVar4, z12, h0Var4, aVar4, bVar2, oVar2, jVar4, qVar, i10, i11);
                                return;
                            }
                            p10.t0();
                            if ((i10 & 1) != 0 && !p10.X()) {
                                p10.e();
                                if ((i11 & 8) != 0) {
                                    i12 &= -7169;
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                dVar3 = dVar;
                                z11 = z10;
                                h0Var3 = h0Var;
                                jVar3 = jVar;
                                obj5 = obj3;
                                obj4 = obj;
                                b bVar3 = obj2;
                                p10.R();
                                q<g0.c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
                                composerImpl = p10;
                                a(aVar, dVar3, z11, h0Var3, obj4, bVar3, obj5, jVar3, qVar, p10, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), 0);
                                dVar4 = dVar3;
                                z12 = z11;
                                h0Var4 = h0Var3;
                                aVar4 = obj4;
                                bVar2 = bVar3;
                                oVar2 = obj5;
                                jVar4 = jVar3;
                                T = composerImpl.T();
                                if (T != null) {
                                }
                            }
                            q0.d dVar5 = dVar;
                            boolean z13 = i13 == 0 ? true : z10;
                            if ((i11 & 8) == 0) {
                                p pVar = e0.b.f10510a;
                                p10.f(-349121587);
                                q<g0.c<?>, z0, t0, n> qVar3 = ComposerKt.f2737a;
                                h0Var2 = ShapesKt.a(ShapeKeyTokens.CornerFull, p10);
                                p10.Q(false);
                                i12 &= -7169;
                            } else {
                                h0Var2 = h0Var;
                            }
                            if ((i11 & 16) == 0) {
                                aVar3 = e0.b.a(0L, p10, 15);
                                i12 &= -57345;
                            } else {
                                aVar3 = obj;
                            }
                            if (i14 != 0) {
                                obj2 = null;
                            }
                            Object obj6 = i16 == 0 ? e0.b.f10511b : oVar;
                            if (i17 == 0) {
                                p10.f(-492369756);
                                Object a02 = p10.a0();
                                if (a02 == d.a.f11039a) {
                                    a02 = new k();
                                    p10.I0(a02);
                                }
                                p10.Q(false);
                                jVar2 = (j) a02;
                            } else {
                                jVar2 = jVar;
                            }
                            dVar3 = dVar5;
                            jVar3 = jVar2;
                            z11 = z13;
                            h0Var3 = h0Var2;
                            obj4 = aVar3;
                            obj5 = obj6;
                            b bVar32 = obj2;
                            p10.R();
                            q<g0.c<?>, z0, t0, n> qVar22 = ComposerKt.f2737a;
                            composerImpl = p10;
                            a(aVar, dVar3, z11, h0Var3, obj4, bVar32, obj5, jVar3, qVar, p10, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), 0);
                            dVar4 = dVar3;
                            z12 = z11;
                            h0Var4 = h0Var3;
                            aVar4 = obj4;
                            bVar2 = bVar32;
                            oVar2 = obj5;
                            jVar4 = jVar3;
                            T = composerImpl.T();
                            if (T != null) {
                            }
                        }
                        i12 |= i18;
                        if ((1533916891 & i12) == 306783378) {
                            p10.e();
                            dVar4 = dVar;
                            z12 = z10;
                            h0Var4 = h0Var;
                            jVar4 = jVar;
                            aVar4 = obj;
                            composerImpl = p10;
                            oVar2 = obj3;
                            bVar2 = obj2;
                            T = composerImpl.T();
                            if (T != null) {
                            }
                        }
                        p10.t0();
                        if ((i10 & 1) != 0) {
                            p10.e();
                            if ((i11 & 8) != 0) {
                            }
                            if ((i11 & 16) != 0) {
                            }
                            dVar3 = dVar;
                            z11 = z10;
                            h0Var3 = h0Var;
                            jVar3 = jVar;
                            obj5 = obj3;
                            obj4 = obj;
                            b bVar322 = obj2;
                            p10.R();
                            q<g0.c<?>, z0, t0, n> qVar222 = ComposerKt.f2737a;
                            composerImpl = p10;
                            a(aVar, dVar3, z11, h0Var3, obj4, bVar322, obj5, jVar3, qVar, p10, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), 0);
                            dVar4 = dVar3;
                            z12 = z11;
                            h0Var4 = h0Var3;
                            aVar4 = obj4;
                            bVar2 = bVar322;
                            oVar2 = obj5;
                            jVar4 = jVar3;
                            T = composerImpl.T();
                            if (T != null) {
                            }
                        }
                        q0.d dVar52 = dVar;
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) == 0) {
                        }
                        if ((i11 & 16) == 0) {
                        }
                        if (i14 != 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        dVar3 = dVar52;
                        jVar3 = jVar2;
                        z11 = z13;
                        h0Var3 = h0Var2;
                        obj4 = aVar3;
                        obj5 = obj6;
                        b bVar3222 = obj2;
                        p10.R();
                        q<g0.c<?>, z0, t0, n> qVar2222 = ComposerKt.f2737a;
                        composerImpl = p10;
                        a(aVar, dVar3, z11, h0Var3, obj4, bVar3222, obj5, jVar3, qVar, p10, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), 0);
                        dVar4 = dVar3;
                        z12 = z11;
                        h0Var4 = h0Var3;
                        aVar4 = obj4;
                        bVar2 = bVar3222;
                        oVar2 = obj5;
                        jVar4 = jVar3;
                        T = composerImpl.T();
                        if (T != null) {
                        }
                    }
                    i12 |= i15;
                    i16 = i11 & 128;
                    if (i16 != 0) {
                    }
                    i17 = i11 & 256;
                    if (i17 != 0) {
                    }
                    if ((i11 & 512) != 0) {
                    }
                    i12 |= i18;
                    if ((1533916891 & i12) == 306783378) {
                    }
                    p10.t0();
                    if ((i10 & 1) != 0) {
                    }
                    q0.d dVar522 = dVar;
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) == 0) {
                    }
                    if ((i11 & 16) == 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    dVar3 = dVar522;
                    jVar3 = jVar2;
                    z11 = z13;
                    h0Var3 = h0Var2;
                    obj4 = aVar3;
                    obj5 = obj6;
                    b bVar32222 = obj2;
                    p10.R();
                    q<g0.c<?>, z0, t0, n> qVar22222 = ComposerKt.f2737a;
                    composerImpl = p10;
                    a(aVar, dVar3, z11, h0Var3, obj4, bVar32222, obj5, jVar3, qVar, p10, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), 0);
                    dVar4 = dVar3;
                    z12 = z11;
                    h0Var4 = h0Var3;
                    aVar4 = obj4;
                    bVar2 = bVar32222;
                    oVar2 = obj5;
                    jVar4 = jVar3;
                    T = composerImpl.T();
                    if (T != null) {
                    }
                }
                obj2 = bVar;
                if ((i11 & 64) == 0) {
                }
                i12 |= i15;
                i16 = i11 & 128;
                if (i16 != 0) {
                }
                i17 = i11 & 256;
                if (i17 != 0) {
                }
                if ((i11 & 512) != 0) {
                }
                i12 |= i18;
                if ((1533916891 & i12) == 306783378) {
                }
                p10.t0();
                if ((i10 & 1) != 0) {
                }
                q0.d dVar5222 = dVar;
                if (i13 == 0) {
                }
                if ((i11 & 8) == 0) {
                }
                if ((i11 & 16) == 0) {
                }
                if (i14 != 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                dVar3 = dVar5222;
                jVar3 = jVar2;
                z11 = z13;
                h0Var3 = h0Var2;
                obj4 = aVar3;
                obj5 = obj6;
                b bVar322222 = obj2;
                p10.R();
                q<g0.c<?>, z0, t0, n> qVar222222 = ComposerKt.f2737a;
                composerImpl = p10;
                a(aVar, dVar3, z11, h0Var3, obj4, bVar322222, obj5, jVar3, qVar, p10, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), 0);
                dVar4 = dVar3;
                z12 = z11;
                h0Var4 = h0Var3;
                aVar4 = obj4;
                bVar2 = bVar322222;
                oVar2 = obj5;
                jVar4 = jVar3;
                T = composerImpl.T();
                if (T != null) {
                }
            }
            if ((i10 & 7168) == 0) {
            }
            if ((i10 & 57344) == 0) {
            }
            i14 = i11 & 32;
            if (i14 != 0) {
            }
            obj2 = bVar;
            if ((i11 & 64) == 0) {
            }
            i12 |= i15;
            i16 = i11 & 128;
            if (i16 != 0) {
            }
            i17 = i11 & 256;
            if (i17 != 0) {
            }
            if ((i11 & 512) != 0) {
            }
            i12 |= i18;
            if ((1533916891 & i12) == 306783378) {
            }
            p10.t0();
            if ((i10 & 1) != 0) {
            }
            q0.d dVar52222 = dVar;
            if (i13 == 0) {
            }
            if ((i11 & 8) == 0) {
            }
            if ((i11 & 16) == 0) {
            }
            if (i14 != 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            dVar3 = dVar52222;
            jVar3 = jVar2;
            z11 = z13;
            h0Var3 = h0Var2;
            obj4 = aVar3;
            obj5 = obj6;
            b bVar3222222 = obj2;
            p10.R();
            q<g0.c<?>, z0, t0, n> qVar2222222 = ComposerKt.f2737a;
            composerImpl = p10;
            a(aVar, dVar3, z11, h0Var3, obj4, bVar3222222, obj5, jVar3, qVar, p10, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), 0);
            dVar4 = dVar3;
            z12 = z11;
            h0Var4 = h0Var3;
            aVar4 = obj4;
            bVar2 = bVar3222222;
            oVar2 = obj5;
            jVar4 = jVar3;
            T = composerImpl.T();
            if (T != null) {
            }
        }
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        if ((i10 & 7168) == 0) {
        }
        if ((i10 & 57344) == 0) {
        }
        i14 = i11 & 32;
        if (i14 != 0) {
        }
        obj2 = bVar;
        if ((i11 & 64) == 0) {
        }
        i12 |= i15;
        i16 = i11 & 128;
        if (i16 != 0) {
        }
        i17 = i11 & 256;
        if (i17 != 0) {
        }
        if ((i11 & 512) != 0) {
        }
        i12 |= i18;
        if ((1533916891 & i12) == 306783378) {
        }
        p10.t0();
        if ((i10 & 1) != 0) {
        }
        q0.d dVar522222 = dVar;
        if (i13 == 0) {
        }
        if ((i11 & 8) == 0) {
        }
        if ((i11 & 16) == 0) {
        }
        if (i14 != 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        dVar3 = dVar522222;
        jVar3 = jVar2;
        z11 = z13;
        h0Var3 = h0Var2;
        obj4 = aVar3;
        obj5 = obj6;
        b bVar32222222 = obj2;
        p10.R();
        q<g0.c<?>, z0, t0, n> qVar22222222 = ComposerKt.f2737a;
        composerImpl = p10;
        a(aVar, dVar3, z11, h0Var3, obj4, bVar32222222, obj5, jVar3, qVar, p10, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), 0);
        dVar4 = dVar3;
        z12 = z11;
        h0Var4 = h0Var3;
        aVar4 = obj4;
        bVar2 = bVar32222222;
        oVar2 = obj5;
        jVar4 = jVar3;
        T = composerImpl.T();
        if (T != null) {
        }
    }
}
