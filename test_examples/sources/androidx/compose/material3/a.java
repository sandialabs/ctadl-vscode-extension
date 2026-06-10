package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.b;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import f0.k;
import g0.d;
import g0.h1;
import g0.p0;
import g0.r0;
import g0.s;
import g0.t0;
import g0.v0;
import g0.z0;
import j1.b0;
import j1.t;
import java.util.List;
import java.util.NoSuchElementException;
import m7.n;
import ma.i;
import o1.l;
import q0.a;
import q0.d;
import r.e;
import u7.p;
import u7.q;
import v.v;
import v0.r;
import v7.g;
import w0.f;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final float f2600a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f2601b;

    static {
        boolean z10;
        float f10 = 16;
        if (!Float.isNaN(0.8f) && !Float.isNaN(0.0f) && !Float.isNaN(0.8f) && !Float.isNaN(0.15f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float f11 = 4;
            f2600a = f11;
            f2601b = f10 - f11;
            return;
        }
        throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.8, 0.0, 0.8, 0.15.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q0.d dVar, p pVar, p1.p pVar2, boolean z10, p pVar3, q qVar, v vVar, e0.q qVar2, g0.d dVar2, int i10, int i11) {
        d.a aVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11;
        Object a02;
        r0 T;
        ComposerImpl p10 = dVar2.p(1841601619);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
            aVar = dVar;
        } else if ((i10 & 14) == 0) {
            aVar = dVar;
            i12 = (p10.z(aVar) ? 4 : 2) | i10;
        } else {
            aVar = dVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= p10.z(pVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= p10.z(pVar2) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= p10.c(z10) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            i12 |= p10.z(pVar3) ? 16384 : 8192;
        }
        if ((i11 & 32) != 0) {
            i13 = 196608;
        } else {
            if ((458752 & i10) == 0) {
                i13 = p10.z(qVar) ? 131072 : 65536;
            }
            if ((i11 & 64) == 0) {
                i12 |= 1572864;
            } else if ((3670016 & i10) == 0) {
                i12 |= p10.z(vVar) ? 1048576 : 524288;
            }
            if ((i11 & 128) == 0) {
                i14 = 12582912;
            } else {
                if ((29360128 & i10) == 0) {
                    i14 = p10.z(qVar2) ? 8388608 : 4194304;
                }
                if ((i11 & 256) != 0) {
                    i15 = 100663296;
                } else {
                    if ((234881024 & i10) == 0) {
                        i15 = p10.z(null) ? 67108864 : 33554432;
                    }
                    i16 = i12;
                    if ((191739611 & i16) == 38347922 && p10.s()) {
                        p10.e();
                        q0.d dVar3 = aVar;
                        T = p10.T();
                        if (T != null) {
                            return;
                        }
                        T.f11073d = new AppBarKt$SingleRowTopAppBar$3(dVar3, pVar, pVar2, z10, pVar3, qVar, vVar, qVar2, i10, i11);
                        return;
                    }
                    d.a aVar2 = d.a.f16824i;
                    if (i17 != 0) {
                        aVar = aVar2;
                    }
                    q<g0.c<?>, z0, t0, n> qVar3 = ComposerKt.f2737a;
                    float f10 = -((b2.b) p10.w(CompositionLocalsKt.f3703e)).H(k.f10828a);
                    Float valueOf = Float.valueOf(f10);
                    p10.f(511388516);
                    z11 = p10.z(null) | p10.z(valueOf);
                    a02 = p10.a0();
                    d.a.C0120a c0120a = d.a.f11039a;
                    if (!z11 || a02 == c0120a) {
                        a02 = new AppBarKt$SingleRowTopAppBar$1$1(f10);
                        p10.I0(a02);
                    }
                    p10.Q(false);
                    s.d((u7.a) a02, p10);
                    qVar2.getClass();
                    p10.f(-1456204135);
                    float a10 = r.q.f17013b.a(0.0f);
                    f fVar = ColorSpaces.f3113t;
                    q0.d dVar4 = aVar;
                    long a11 = r.a(qVar2.f10572a, fVar);
                    long j2 = qVar2.f10573b;
                    long a12 = r.a(j2, fVar);
                    float d5 = r.d(a11);
                    float h10 = r.h(a11);
                    float g10 = r.g(a11);
                    float e10 = r.e(a11);
                    float d10 = r.d(a12);
                    long a13 = r.a(a1.c.j(v8.b.y(h10, r.h(a12), a10), v8.b.y(g10, r.g(a12), a10), v8.b.y(e10, r.e(a12), a10), v8.b.y(d5, d10, a10), fVar), r.f(j2));
                    p10.Q(false);
                    e a14 = androidx.compose.animation.a.a(a13, a1.c.z1(400.0f, null, 5), p10);
                    ComposableLambdaImpl i02 = a1.c.i0(p10, 1520880938, new AppBarKt$SingleRowTopAppBar$actionsRow$1(qVar, i16));
                    p10.f(-1008378188);
                    p10.Q(false);
                    aVar = dVar4;
                    SurfaceKt.a(aVar.Z(aVar2), null, ((r) a14.getValue()).f18135a, 0L, 0.0f, a1.c.i0(p10, 376925230, new AppBarKt$SingleRowTopAppBar$2(vVar, qVar2, pVar, pVar2, z10, pVar3, i02, i16)), p10, 12582912, 122);
                    q0.d dVar32 = aVar;
                    T = p10.T();
                    if (T != null) {
                    }
                }
                i12 |= i15;
                i16 = i12;
                if ((191739611 & i16) == 38347922) {
                    p10.e();
                    q0.d dVar322 = aVar;
                    T = p10.T();
                    if (T != null) {
                    }
                }
                d.a aVar22 = d.a.f16824i;
                if (i17 != 0) {
                }
                q<g0.c<?>, z0, t0, n> qVar32 = ComposerKt.f2737a;
                float f102 = -((b2.b) p10.w(CompositionLocalsKt.f3703e)).H(k.f10828a);
                Float valueOf2 = Float.valueOf(f102);
                p10.f(511388516);
                z11 = p10.z(null) | p10.z(valueOf2);
                a02 = p10.a0();
                d.a.C0120a c0120a2 = d.a.f11039a;
                if (!z11) {
                }
                a02 = new AppBarKt$SingleRowTopAppBar$1$1(f102);
                p10.I0(a02);
                p10.Q(false);
                s.d((u7.a) a02, p10);
                qVar2.getClass();
                p10.f(-1456204135);
                float a102 = r.q.f17013b.a(0.0f);
                f fVar2 = ColorSpaces.f3113t;
                q0.d dVar42 = aVar;
                long a112 = r.a(qVar2.f10572a, fVar2);
                long j22 = qVar2.f10573b;
                long a122 = r.a(j22, fVar2);
                float d52 = r.d(a112);
                float h102 = r.h(a112);
                float g102 = r.g(a112);
                float e102 = r.e(a112);
                float d102 = r.d(a122);
                long a132 = r.a(a1.c.j(v8.b.y(h102, r.h(a122), a102), v8.b.y(g102, r.g(a122), a102), v8.b.y(e102, r.e(a122), a102), v8.b.y(d52, d102, a102), fVar2), r.f(j22));
                p10.Q(false);
                e a142 = androidx.compose.animation.a.a(a132, a1.c.z1(400.0f, null, 5), p10);
                ComposableLambdaImpl i022 = a1.c.i0(p10, 1520880938, new AppBarKt$SingleRowTopAppBar$actionsRow$1(qVar, i16));
                p10.f(-1008378188);
                p10.Q(false);
                aVar = dVar42;
                SurfaceKt.a(aVar.Z(aVar22), null, ((r) a142.getValue()).f18135a, 0L, 0.0f, a1.c.i0(p10, 376925230, new AppBarKt$SingleRowTopAppBar$2(vVar, qVar2, pVar, pVar2, z10, pVar3, i022, i16)), p10, 12582912, 122);
                q0.d dVar3222 = aVar;
                T = p10.T();
                if (T != null) {
                }
            }
            i12 |= i14;
            if ((i11 & 256) != 0) {
            }
            i12 |= i15;
            i16 = i12;
            if ((191739611 & i16) == 38347922) {
            }
            d.a aVar222 = d.a.f16824i;
            if (i17 != 0) {
            }
            q<g0.c<?>, z0, t0, n> qVar322 = ComposerKt.f2737a;
            float f1022 = -((b2.b) p10.w(CompositionLocalsKt.f3703e)).H(k.f10828a);
            Float valueOf22 = Float.valueOf(f1022);
            p10.f(511388516);
            z11 = p10.z(null) | p10.z(valueOf22);
            a02 = p10.a0();
            d.a.C0120a c0120a22 = d.a.f11039a;
            if (!z11) {
            }
            a02 = new AppBarKt$SingleRowTopAppBar$1$1(f1022);
            p10.I0(a02);
            p10.Q(false);
            s.d((u7.a) a02, p10);
            qVar2.getClass();
            p10.f(-1456204135);
            float a1022 = r.q.f17013b.a(0.0f);
            f fVar22 = ColorSpaces.f3113t;
            q0.d dVar422 = aVar;
            long a1122 = r.a(qVar2.f10572a, fVar22);
            long j222 = qVar2.f10573b;
            long a1222 = r.a(j222, fVar22);
            float d522 = r.d(a1122);
            float h1022 = r.h(a1122);
            float g1022 = r.g(a1122);
            float e1022 = r.e(a1122);
            float d1022 = r.d(a1222);
            long a1322 = r.a(a1.c.j(v8.b.y(h1022, r.h(a1222), a1022), v8.b.y(g1022, r.g(a1222), a1022), v8.b.y(e1022, r.e(a1222), a1022), v8.b.y(d522, d1022, a1022), fVar22), r.f(j222));
            p10.Q(false);
            e a1422 = androidx.compose.animation.a.a(a1322, a1.c.z1(400.0f, null, 5), p10);
            ComposableLambdaImpl i0222 = a1.c.i0(p10, 1520880938, new AppBarKt$SingleRowTopAppBar$actionsRow$1(qVar, i16));
            p10.f(-1008378188);
            p10.Q(false);
            aVar = dVar422;
            SurfaceKt.a(aVar.Z(aVar222), null, ((r) a1422.getValue()).f18135a, 0L, 0.0f, a1.c.i0(p10, 376925230, new AppBarKt$SingleRowTopAppBar$2(vVar, qVar2, pVar, pVar2, z10, pVar3, i0222, i16)), p10, 12582912, 122);
            q0.d dVar32222 = aVar;
            T = p10.T();
            if (T != null) {
            }
        }
        i12 |= i13;
        if ((i11 & 64) == 0) {
        }
        if ((i11 & 128) == 0) {
        }
        i12 |= i14;
        if ((i11 & 256) != 0) {
        }
        i12 |= i15;
        i16 = i12;
        if ((191739611 & i16) == 38347922) {
        }
        d.a aVar2222 = d.a.f16824i;
        if (i17 != 0) {
        }
        q<g0.c<?>, z0, t0, n> qVar3222 = ComposerKt.f2737a;
        float f10222 = -((b2.b) p10.w(CompositionLocalsKt.f3703e)).H(k.f10828a);
        Float valueOf222 = Float.valueOf(f10222);
        p10.f(511388516);
        z11 = p10.z(null) | p10.z(valueOf222);
        a02 = p10.a0();
        d.a.C0120a c0120a222 = d.a.f11039a;
        if (!z11) {
        }
        a02 = new AppBarKt$SingleRowTopAppBar$1$1(f10222);
        p10.I0(a02);
        p10.Q(false);
        s.d((u7.a) a02, p10);
        qVar2.getClass();
        p10.f(-1456204135);
        float a10222 = r.q.f17013b.a(0.0f);
        f fVar222 = ColorSpaces.f3113t;
        q0.d dVar4222 = aVar;
        long a11222 = r.a(qVar2.f10572a, fVar222);
        long j2222 = qVar2.f10573b;
        long a12222 = r.a(j2222, fVar222);
        float d5222 = r.d(a11222);
        float h10222 = r.h(a11222);
        float g10222 = r.g(a11222);
        float e10222 = r.e(a11222);
        float d10222 = r.d(a12222);
        long a13222 = r.a(a1.c.j(v8.b.y(h10222, r.h(a12222), a10222), v8.b.y(g10222, r.g(a12222), a10222), v8.b.y(e10222, r.e(a12222), a10222), v8.b.y(d5222, d10222, a10222), fVar222), r.f(j2222));
        p10.Q(false);
        e a14222 = androidx.compose.animation.a.a(a13222, a1.c.z1(400.0f, null, 5), p10);
        ComposableLambdaImpl i02222 = a1.c.i0(p10, 1520880938, new AppBarKt$SingleRowTopAppBar$actionsRow$1(qVar, i16));
        p10.f(-1008378188);
        p10.Q(false);
        aVar = dVar4222;
        SurfaceKt.a(aVar.Z(aVar2222), null, ((r) a14222.getValue()).f18135a, 0L, 0.0f, a1.c.i0(p10, 376925230, new AppBarKt$SingleRowTopAppBar$2(vVar, qVar2, pVar, pVar2, z10, pVar3, i02222, i16)), p10, 12582912, 122);
        q0.d dVar322222 = aVar;
        T = p10.T();
        if (T != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0118, code lost:
        r1 = q0.d.a.f16824i;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(p pVar, q0.d dVar, p pVar2, q qVar, v vVar, e0.q qVar2, g0.d dVar2, int i10, int i11) {
        int i12;
        Object obj;
        int i13;
        Object obj2;
        int i14;
        ComposableLambdaImpl composableLambdaImpl;
        v.n nVar;
        Object obj3;
        Object obj4;
        Object obj5;
        q0.d dVar3;
        p pVar3;
        q qVar3;
        v vVar2;
        e0.q qVar4;
        r0 T;
        int i15;
        int i16;
        g.f(pVar, "title");
        ComposerImpl p10 = dVar2.p(1906353009);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (p10.z(pVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            obj = dVar;
            i12 |= p10.z(obj) ? 32 : 16;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                obj2 = pVar2;
                i12 |= p10.z(obj2) ? 256 : 128;
                i14 = i11 & 8;
                if (i14 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    composableLambdaImpl = qVar;
                    i12 |= p10.z(composableLambdaImpl) ? 2048 : 1024;
                    if ((i10 & 57344) != 0) {
                        if ((i11 & 16) == 0) {
                            nVar = vVar;
                            if (p10.z(nVar)) {
                                i16 = 16384;
                                i12 |= i16;
                            }
                        } else {
                            nVar = vVar;
                        }
                        i16 = 8192;
                        i12 |= i16;
                    } else {
                        nVar = vVar;
                    }
                    if ((i10 & 458752) != 0) {
                        if ((i11 & 32) == 0) {
                            obj3 = qVar2;
                            if (p10.z(obj3)) {
                                i15 = 131072;
                                i12 |= i15;
                            }
                        } else {
                            obj3 = qVar2;
                        }
                        i15 = 65536;
                        i12 |= i15;
                    } else {
                        obj3 = qVar2;
                    }
                    if ((i11 & 64) == 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        i12 |= p10.z(null) ? 1048576 : 524288;
                    }
                    if ((2995931 & i12) == 599186 && p10.s()) {
                        p10.e();
                        dVar3 = obj;
                        pVar3 = obj2;
                        qVar3 = composableLambdaImpl;
                        vVar2 = nVar;
                        qVar4 = obj3;
                        T = p10.T();
                        if (T != null) {
                            return;
                        }
                        T.f11073d = new AppBarKt$TopAppBar$1(pVar, dVar3, pVar3, qVar3, vVar2, qVar4, i10, i11);
                        return;
                    }
                    p10.t0();
                    if ((i10 & 1) != 0 && !p10.X()) {
                        p10.e();
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        obj4 = obj;
                        obj5 = obj2;
                        q0.d dVar4 = obj4;
                        q qVar5 = composableLambdaImpl;
                        v vVar3 = nVar;
                        e0.q qVar6 = obj3;
                        p pVar4 = obj5;
                        p10.R();
                        q<g0.c<?>, z0, t0, n> qVar7 = ComposerKt.f2737a;
                        int i18 = i12 << 6;
                        a(dVar4, pVar, TypographyKt.a((e0.r) p10.w(TypographyKt.f2598a), k.c), false, pVar4, qVar5, vVar3, qVar6, p10, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112) | (57344 & i18) | (458752 & i18) | (i18 & 3670016) | (29360128 & i18) | (i18 & 234881024), 0);
                        dVar3 = dVar4;
                        pVar3 = pVar4;
                        qVar3 = qVar5;
                        vVar2 = vVar3;
                        qVar4 = qVar6;
                        T = p10.T();
                        if (T != null) {
                        }
                    }
                    obj4 = obj;
                    obj5 = i13 == 0 ? ComposableSingletons$AppBarKt.f2280a : obj2;
                    if (i14 != 0) {
                        composableLambdaImpl = ComposableSingletons$AppBarKt.f2281b;
                    }
                    if ((i11 & 16) != 0) {
                        p10.f(2143182847);
                        q<g0.c<?>, z0, t0, n> qVar8 = ComposerKt.f2737a;
                        v.a F0 = a1.c.F0(p10);
                        g.f(F0, "$this$only");
                        v.n nVar2 = new v.n(F0, 16 | i.f16049q);
                        p10.Q(false);
                        i12 &= -57345;
                        nVar = nVar2;
                    }
                    if ((i11 & 32) != 0) {
                        p10.f(-1717201472);
                        float f10 = k.f10828a;
                        long e10 = ColorSchemeKt.e(ColorSchemeKeyTokens.Surface, p10);
                        q<g0.c<?>, z0, t0, n> qVar9 = ComposerKt.f2737a;
                        e0.c cVar = (e0.c) p10.w(ColorSchemeKt.f2278a);
                        float f11 = k.f10831e;
                        g.f(cVar, "$this$applyTonalElevation");
                        e0.q qVar10 = new e0.q(e10, r.c(e10, cVar.u()) ? ColorSchemeKt.d(cVar, f11) : e10, ColorSchemeKt.e(k.f10830d, p10), ColorSchemeKt.e(k.f10829b, p10), ColorSchemeKt.e(k.f10832f, p10));
                        p10.Q(false);
                        i12 &= -458753;
                        obj3 = qVar10;
                    }
                    q0.d dVar42 = obj4;
                    q qVar52 = composableLambdaImpl;
                    v vVar32 = nVar;
                    e0.q qVar62 = obj3;
                    p pVar42 = obj5;
                    p10.R();
                    q<g0.c<?>, z0, t0, n> qVar72 = ComposerKt.f2737a;
                    int i182 = i12 << 6;
                    a(dVar42, pVar, TypographyKt.a((e0.r) p10.w(TypographyKt.f2598a), k.c), false, pVar42, qVar52, vVar32, qVar62, p10, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112) | (57344 & i182) | (458752 & i182) | (i182 & 3670016) | (29360128 & i182) | (i182 & 234881024), 0);
                    dVar3 = dVar42;
                    pVar3 = pVar42;
                    qVar3 = qVar52;
                    vVar2 = vVar32;
                    qVar4 = qVar62;
                    T = p10.T();
                    if (T != null) {
                    }
                }
                composableLambdaImpl = qVar;
                if ((i10 & 57344) != 0) {
                }
                if ((i10 & 458752) != 0) {
                }
                if ((i11 & 64) == 0) {
                }
                if ((2995931 & i12) == 599186) {
                    p10.e();
                    dVar3 = obj;
                    pVar3 = obj2;
                    qVar3 = composableLambdaImpl;
                    vVar2 = nVar;
                    qVar4 = obj3;
                    T = p10.T();
                    if (T != null) {
                    }
                }
                p10.t0();
                if ((i10 & 1) != 0) {
                    p10.e();
                    if ((i11 & 16) != 0) {
                    }
                    if ((i11 & 32) != 0) {
                    }
                    obj4 = obj;
                    obj5 = obj2;
                    q0.d dVar422 = obj4;
                    q qVar522 = composableLambdaImpl;
                    v vVar322 = nVar;
                    e0.q qVar622 = obj3;
                    p pVar422 = obj5;
                    p10.R();
                    q<g0.c<?>, z0, t0, n> qVar722 = ComposerKt.f2737a;
                    int i1822 = i12 << 6;
                    a(dVar422, pVar, TypographyKt.a((e0.r) p10.w(TypographyKt.f2598a), k.c), false, pVar422, qVar522, vVar322, qVar622, p10, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112) | (57344 & i1822) | (458752 & i1822) | (i1822 & 3670016) | (29360128 & i1822) | (i1822 & 234881024), 0);
                    dVar3 = dVar422;
                    pVar3 = pVar422;
                    qVar3 = qVar522;
                    vVar2 = vVar322;
                    qVar4 = qVar622;
                    T = p10.T();
                    if (T != null) {
                    }
                }
                obj4 = obj;
                if (i13 == 0) {
                }
                if (i14 != 0) {
                }
                if ((i11 & 16) != 0) {
                }
                if ((i11 & 32) != 0) {
                }
                q0.d dVar4222 = obj4;
                q qVar5222 = composableLambdaImpl;
                v vVar3222 = nVar;
                e0.q qVar6222 = obj3;
                p pVar4222 = obj5;
                p10.R();
                q<g0.c<?>, z0, t0, n> qVar7222 = ComposerKt.f2737a;
                int i18222 = i12 << 6;
                a(dVar4222, pVar, TypographyKt.a((e0.r) p10.w(TypographyKt.f2598a), k.c), false, pVar4222, qVar5222, vVar3222, qVar6222, p10, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112) | (57344 & i18222) | (458752 & i18222) | (i18222 & 3670016) | (29360128 & i18222) | (i18222 & 234881024), 0);
                dVar3 = dVar4222;
                pVar3 = pVar4222;
                qVar3 = qVar5222;
                vVar2 = vVar3222;
                qVar4 = qVar6222;
                T = p10.T();
                if (T != null) {
                }
            }
            obj2 = pVar2;
            i14 = i11 & 8;
            if (i14 != 0) {
            }
            composableLambdaImpl = qVar;
            if ((i10 & 57344) != 0) {
            }
            if ((i10 & 458752) != 0) {
            }
            if ((i11 & 64) == 0) {
            }
            if ((2995931 & i12) == 599186) {
            }
            p10.t0();
            if ((i10 & 1) != 0) {
            }
            obj4 = obj;
            if (i13 == 0) {
            }
            if (i14 != 0) {
            }
            if ((i11 & 16) != 0) {
            }
            if ((i11 & 32) != 0) {
            }
            q0.d dVar42222 = obj4;
            q qVar52222 = composableLambdaImpl;
            v vVar32222 = nVar;
            e0.q qVar62222 = obj3;
            p pVar42222 = obj5;
            p10.R();
            q<g0.c<?>, z0, t0, n> qVar72222 = ComposerKt.f2737a;
            int i182222 = i12 << 6;
            a(dVar42222, pVar, TypographyKt.a((e0.r) p10.w(TypographyKt.f2598a), k.c), false, pVar42222, qVar52222, vVar32222, qVar62222, p10, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112) | (57344 & i182222) | (458752 & i182222) | (i182222 & 3670016) | (29360128 & i182222) | (i182222 & 234881024), 0);
            dVar3 = dVar42222;
            pVar3 = pVar42222;
            qVar3 = qVar52222;
            vVar2 = vVar32222;
            qVar4 = qVar62222;
            T = p10.T();
            if (T != null) {
            }
        }
        obj = dVar;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        obj2 = pVar2;
        i14 = i11 & 8;
        if (i14 != 0) {
        }
        composableLambdaImpl = qVar;
        if ((i10 & 57344) != 0) {
        }
        if ((i10 & 458752) != 0) {
        }
        if ((i11 & 64) == 0) {
        }
        if ((2995931 & i12) == 599186) {
        }
        p10.t0();
        if ((i10 & 1) != 0) {
        }
        obj4 = obj;
        if (i13 == 0) {
        }
        if (i14 != 0) {
        }
        if ((i11 & 16) != 0) {
        }
        if ((i11 & 32) != 0) {
        }
        q0.d dVar422222 = obj4;
        q qVar522222 = composableLambdaImpl;
        v vVar322222 = nVar;
        e0.q qVar622222 = obj3;
        p pVar422222 = obj5;
        p10.R();
        q<g0.c<?>, z0, t0, n> qVar722222 = ComposerKt.f2737a;
        int i1822222 = i12 << 6;
        a(dVar422222, pVar, TypographyKt.a((e0.r) p10.w(TypographyKt.f2598a), k.c), false, pVar422222, qVar522222, vVar322222, qVar622222, p10, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112) | (57344 & i1822222) | (458752 & i1822222) | (i1822222 & 3670016) | (29360128 & i1822222) | (i1822222 & 234881024), 0);
        dVar3 = dVar422222;
        pVar3 = pVar422222;
        qVar3 = qVar522222;
        vVar2 = vVar322222;
        qVar4 = qVar622222;
        T = p10.T();
        if (T != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x043c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(q0.d dVar, final float f10, long j2, long j10, long j11, p pVar, p1.p pVar2, float f11, final b.k kVar, final b.d dVar2, final int i10, boolean z10, p pVar3, p pVar4, g0.d dVar3, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        boolean z11;
        q0.d dVar4;
        boolean z12;
        r0 T;
        ComposerImpl p10 = dVar3.p(-6794037);
        int i16 = 4;
        if ((i11 & 14) == 0) {
            i13 = i11 | (p10.z(dVar) ? 4 : 2);
        } else {
            i13 = i11;
        }
        int i17 = 32;
        if ((i11 & 112) == 0) {
            i13 |= p10.G(f10) ? 32 : 16;
        }
        int i18 = 256;
        if ((i11 & 896) == 0) {
            i13 |= p10.I(j2) ? 256 : 128;
        }
        int i19 = 2048;
        if ((i11 & 7168) == 0) {
            i13 |= p10.I(j10) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i13 |= p10.I(j11) ? 16384 : 8192;
        }
        if ((458752 & i11) == 0) {
            i13 |= p10.z(pVar) ? 131072 : 65536;
        }
        if ((i11 & 3670016) == 0) {
            i13 |= p10.z(pVar2) ? 1048576 : 524288;
        }
        if ((i11 & 29360128) == 0) {
            i13 |= p10.G(f11) ? 8388608 : 4194304;
        }
        if ((234881024 & i11) == 0) {
            i13 |= p10.z(kVar) ? 67108864 : 33554432;
        }
        if ((1879048192 & i11) == 0) {
            i13 |= p10.z(dVar2) ? 536870912 : 268435456;
        }
        int i20 = i13;
        if ((i12 & 14) == 0) {
            if (!p10.H(i10)) {
                i16 = 2;
            }
            i14 = i12 | i16;
        } else {
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            if (!p10.c(z10)) {
                i17 = 16;
            }
            i14 |= i17;
        }
        if ((i12 & 896) == 0) {
            if (!p10.z(pVar3)) {
                i18 = 128;
            }
            i14 |= i18;
        }
        if ((i12 & 7168) == 0) {
            if (!p10.z(pVar4)) {
                i19 = 1024;
            }
            i14 |= i19;
        }
        int i21 = i14;
        if ((i20 & 1533916891) == 306783378 && (i21 & 5851) == 1170 && p10.s()) {
            p10.e();
            T = p10.T();
            if (T == null) {
                return;
            }
            T.f11073d = new AppBarKt$TopAppBarLayout$3(dVar, f10, j2, j10, j11, pVar, pVar2, f11, kVar, dVar2, i10, z10, pVar3, pVar4, i11, i12);
            return;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        j1.q qVar2 = new j1.q() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2
            /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
            @Override // j1.q
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final j1.r a(t tVar, List<? extends j1.p> list, long j12) {
                int f12;
                int i22;
                int i23;
                j1.r m02;
                AppBarKt$TopAppBarLayout$2 appBarKt$TopAppBarLayout$2 = this;
                g.f(tVar, "$this$Layout");
                for (j1.p pVar5 : list) {
                    if (g.a(m0.b.q0(pVar5), "navigationIcon")) {
                        b0 b5 = pVar5.b(b2.a.a(j12, 0, 0, 0, 0, 14));
                        for (j1.p pVar6 : list) {
                            if (g.a(m0.b.q0(pVar6), "actionIcons")) {
                                b0 b10 = pVar6.b(b2.a.a(j12, 0, 0, 0, 0, 14));
                                if (b2.a.f(j12) == Integer.MAX_VALUE) {
                                    f12 = b2.a.f(j12);
                                } else {
                                    f12 = (b2.a.f(j12) - b5.f12640i) - b10.f12640i;
                                    if (f12 < 0) {
                                        i22 = 0;
                                        for (j1.p pVar7 : list) {
                                            if (g.a(m0.b.q0(pVar7), "title")) {
                                                b0 b11 = pVar7.b(b2.a.a(j12, 0, i22, 0, 0, 12));
                                                j1.d dVar5 = AlignmentLineKt.f3313b;
                                                if (b11.f0(dVar5) != Integer.MIN_VALUE) {
                                                    i23 = b11.f0(dVar5);
                                                } else {
                                                    i23 = 0;
                                                }
                                                int g12 = m0.b.g1(f10);
                                                m02 = tVar.m0(b2.a.f(j12), g12, kotlin.collections.d.K1(), new AppBarKt$TopAppBarLayout$2$measure$1(b5, g12, b11, dVar2, j12, b10, tVar, kVar, i10, i23));
                                                return m02;
                                            }
                                            appBarKt$TopAppBarLayout$2 = this;
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                }
                                i22 = f12;
                                while (r1.hasNext()) {
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            appBarKt$TopAppBarLayout$2 = this;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    appBarKt$TopAppBarLayout$2 = this;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        };
        p10.f(-1323940314);
        h1 h1Var = CompositionLocalsKt.f3703e;
        b2.b bVar = (b2.b) p10.w(h1Var);
        h1 h1Var2 = CompositionLocalsKt.f3709k;
        LayoutDirection layoutDirection = (LayoutDirection) p10.w(h1Var2);
        h1 h1Var3 = CompositionLocalsKt.f3712o;
        j1 j1Var = (j1) p10.w(h1Var3);
        ComposeUiNode.f3400a.getClass();
        u7.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3402b;
        ComposableLambdaImpl a10 = androidx.compose.ui.layout.a.a(dVar);
        int i22 = ((((i20 << 3) & 112) << 9) & 7168) | 6;
        g0.c<?> cVar = p10.f2640a;
        if (!(cVar instanceof g0.c)) {
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
        p<ComposeUiNode, j1.q, n> pVar5 = ComposeUiNode.Companion.f3404e;
        a1.c.s1(p10, qVar2, pVar5);
        p<ComposeUiNode, b2.b, n> pVar6 = ComposeUiNode.Companion.f3403d;
        a1.c.s1(p10, bVar, pVar6);
        p<ComposeUiNode, LayoutDirection, n> pVar7 = ComposeUiNode.Companion.f3405f;
        a1.c.s1(p10, layoutDirection, pVar7);
        p<ComposeUiNode, j1, n> pVar8 = ComposeUiNode.Companion.f3406g;
        a1.c.s1(p10, j1Var, pVar8);
        p10.h();
        a10.O(new v0(p10), p10, Integer.valueOf((i22 >> 3) & 112));
        p10.f(2058660585);
        p10.f(1688650562);
        if (((i22 >> 9) & 14 & 11) == 2 && p10.s()) {
            p10.e();
            z12 = false;
            p10.Q(z12);
            p10.Q(z12);
            p10.Q(true);
            p10.Q(z12);
            T = p10.T();
            if (T == null) {
            }
        }
        d.a aVar2 = d.a.f16824i;
        q0.d N0 = m0.b.N0("navigationIcon");
        float f12 = f2600a;
        q0.d e12 = a1.c.e1(N0, f12, 0.0f, 0.0f, 0.0f, 14);
        p10.f(733328855);
        q0.b bVar2 = a.C0210a.f16812a;
        j1.q c = BoxKt.c(bVar2, false, p10);
        p10.f(-1323940314);
        b2.b bVar3 = (b2.b) p10.w(h1Var);
        LayoutDirection layoutDirection2 = (LayoutDirection) p10.w(h1Var2);
        j1 j1Var2 = (j1) p10.w(h1Var3);
        ComposableLambdaImpl a11 = androidx.compose.ui.layout.a.a(e12);
        if (!(cVar instanceof g0.c)) {
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
        a1.c.s1(p10, c, pVar5);
        a1.c.s1(p10, bVar3, pVar6);
        a1.c.s1(p10, layoutDirection2, pVar7);
        a1.c.s1(p10, j1Var2, pVar8);
        p10.h();
        androidx.activity.e.o(0, a11, new v0(p10), p10, 2058660585, -2137368960);
        p10.f(1034743112);
        g0.r rVar = ContentColorKt.f2305a;
        CompositionLocalKt.a(new p0[]{rVar.b(new r(j2))}, pVar3, p10, ((i21 >> 3) & 112) | 8);
        p10.Q(false);
        p10.Q(false);
        p10.Q(false);
        p10.Q(true);
        p10.Q(false);
        p10.Q(false);
        q0.d d12 = a1.c.d1(m0.b.N0("title"), f12, 0.0f, 2);
        if (z10) {
            AppBarKt$TopAppBarLayout$1$2 appBarKt$TopAppBarLayout$1$2 = AppBarKt$TopAppBarLayout$1$2.f2207j;
            g.f(appBarKt$TopAppBarLayout$1$2, "properties");
            i15 = i21;
            z11 = false;
            dVar4 = new l(false, true, appBarKt$TopAppBarLayout$1$2, InspectableValueKt.f3744a);
        } else {
            i15 = i21;
            z11 = false;
            dVar4 = aVar2;
        }
        q0.d Z = d12.Z(dVar4);
        p10.f(733328855);
        j1.q c10 = BoxKt.c(bVar2, z11, p10);
        p10.f(-1323940314);
        b2.b bVar4 = (b2.b) p10.w(h1Var);
        LayoutDirection layoutDirection3 = (LayoutDirection) p10.w(h1Var2);
        j1 j1Var3 = (j1) p10.w(h1Var3);
        ComposableLambdaImpl a12 = androidx.compose.ui.layout.a.a(Z);
        if (!(cVar instanceof g0.c)) {
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
        a1.c.s1(p10, c10, pVar5);
        a1.c.s1(p10, bVar4, pVar6);
        a1.c.s1(p10, layoutDirection3, pVar7);
        a1.c.s1(p10, j1Var3, pVar8);
        p10.h();
        androidx.activity.e.o(0, a12, new v0(p10), p10, 2058660585, -2137368960);
        p10.f(-280006401);
        TextKt.a(pVar2, a1.c.i0(p10, 824316656, new AppBarKt$TopAppBarLayout$1$3$1(j10, f11, pVar, i20)), p10, ((i20 >> 18) & 14) | 48);
        p10.Q(false);
        p10.Q(false);
        p10.Q(false);
        p10.Q(true);
        p10.Q(false);
        p10.Q(false);
        q0.d e13 = a1.c.e1(m0.b.N0("actionIcons"), 0.0f, 0.0f, f12, 0.0f, 11);
        p10.f(733328855);
        j1.q c11 = BoxKt.c(bVar2, false, p10);
        p10.f(-1323940314);
        b2.b bVar5 = (b2.b) p10.w(h1Var);
        LayoutDirection layoutDirection4 = (LayoutDirection) p10.w(h1Var2);
        j1 j1Var4 = (j1) p10.w(h1Var3);
        ComposableLambdaImpl a13 = androidx.compose.ui.layout.a.a(e13);
        if (cVar instanceof g0.c) {
            p10.r();
            if (p10.L) {
                p10.m(aVar);
            } else {
                p10.n();
            }
            z12 = false;
            p10.f2661x = false;
            a1.c.s1(p10, c11, pVar5);
            a1.c.s1(p10, bVar5, pVar6);
            a1.c.s1(p10, layoutDirection4, pVar7);
            a1.c.s1(p10, j1Var4, pVar8);
            p10.h();
            androidx.activity.e.o(0, a13, new v0(p10), p10, 2058660585, -2137368960);
            p10.f(1192272192);
            CompositionLocalKt.a(new p0[]{rVar.b(new r(j11))}, pVar4, p10, ((i15 >> 6) & 112) | 8);
            p10.Q(false);
            p10.Q(false);
            p10.Q(false);
            p10.Q(true);
            p10.Q(false);
            p10.Q(false);
            p10.Q(z12);
            p10.Q(z12);
            p10.Q(true);
            p10.Q(z12);
            T = p10.T();
            if (T == null) {
            }
        } else {
            a1.c.L0();
            throw null;
        }
    }
}
