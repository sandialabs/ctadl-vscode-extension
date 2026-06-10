package androidx.compose.material3;

import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import e0.f;
import g0.d;
import g0.h1;
import g0.r0;
import g0.t0;
import g0.z0;
import m7.n;
import u7.p;
import u7.q;
import v.o;
import v.v;
import v7.g;

/* loaded from: classes.dex */
public final class ScaffoldKt {

    /* renamed from: a  reason: collision with root package name */
    public static final h1 f2339a = CompositionLocalKt.c(ScaffoldKt$LocalFabPlacement$1.f2341j);

    /* renamed from: b  reason: collision with root package name */
    public static final float f2340b = 16;

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0195, code lost:
        r1 = q0.d.a.f16824i;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q0.d dVar, p<? super g0.d, ? super Integer, n> pVar, p<? super g0.d, ? super Integer, n> pVar2, p<? super g0.d, ? super Integer, n> pVar3, p<? super g0.d, ? super Integer, n> pVar4, int i10, long j2, long j10, v vVar, q<? super o, ? super g0.d, ? super Integer, n> qVar, g0.d dVar2, int i11, int i12) {
        int i13;
        int i14;
        Object obj;
        int i15;
        int i16;
        Object obj2;
        int i17;
        int i18;
        long j11;
        int i19;
        q0.d dVar3;
        p<? super g0.d, ? super Integer, n> pVar5;
        Object obj3;
        Object obj4;
        int i20;
        p<? super g0.d, ? super Integer, n> pVar6;
        long j12;
        v vVar2;
        int i21;
        p<? super g0.d, ? super Integer, n> pVar7;
        p<? super g0.d, ? super Integer, n> pVar8;
        p<? super g0.d, ? super Integer, n> pVar9;
        p<? super g0.d, ? super Integer, n> pVar10;
        p<? super g0.d, ? super Integer, n> pVar11;
        int i22;
        long j13;
        r0 T;
        int i23;
        g.f(qVar, "content");
        ComposerImpl p10 = dVar2.p(-1219521777);
        int i24 = i12 & 1;
        if (i24 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (p10.z(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i25 = i12 & 2;
        if (i25 != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= p10.z(pVar) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 896) == 0) {
                obj = pVar2;
                i13 |= p10.z(obj) ? 256 : 128;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i11 & 7168) == 0) {
                    i13 |= p10.z(pVar3) ? 2048 : 1024;
                    i16 = i12 & 16;
                    if (i16 == 0) {
                        i13 |= 24576;
                    } else if ((57344 & i11) == 0) {
                        obj2 = pVar4;
                        i13 |= p10.z(obj2) ? 16384 : 8192;
                        i17 = i12 & 32;
                        if (i17 != 0) {
                            i13 |= 196608;
                        } else if ((i11 & 458752) == 0) {
                            i13 |= p10.H(i10) ? 131072 : 65536;
                        }
                        if ((i11 & 3670016) == 0) {
                            i18 = i16;
                            i13 |= ((i12 & 64) == 0 && p10.I(j2)) ? 1048576 : 524288;
                        } else {
                            i18 = i16;
                        }
                        if ((i11 & 29360128) == 0) {
                            j11 = j10;
                            i13 |= ((i12 & 128) == 0 && p10.I(j11)) ? 8388608 : 4194304;
                        } else {
                            j11 = j10;
                        }
                        if ((234881024 & i11) == 0) {
                            if ((i12 & 256) == 0 && p10.z(vVar)) {
                                i23 = 67108864;
                                i13 |= i23;
                            }
                            i23 = 33554432;
                            i13 |= i23;
                        }
                        if ((i12 & 512) != 0) {
                            i19 = 805306368;
                        } else {
                            if ((1879048192 & i11) == 0) {
                                i19 = p10.z(qVar) ? 536870912 : 268435456;
                            }
                            if ((1533916891 & i13) == 306783378 && p10.s()) {
                                p10.e();
                                dVar3 = dVar;
                                pVar8 = pVar;
                                pVar10 = pVar3;
                                i22 = i10;
                                pVar9 = obj;
                                pVar11 = obj2;
                                j13 = j2;
                                vVar2 = vVar;
                                T = p10.T();
                                if (T != null) {
                                    return;
                                }
                                T.f11073d = new ScaffoldKt$Scaffold$2(dVar3, pVar8, pVar9, pVar10, pVar11, i22, j13, j11, vVar2, qVar, i11, i12);
                                return;
                            }
                            p10.t0();
                            if ((i11 & 1) != 0 && !p10.X()) {
                                p10.e();
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                }
                                if ((i12 & 128) != 0) {
                                    i13 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i13 &= -234881025;
                                }
                                dVar3 = dVar;
                                pVar5 = pVar;
                                i20 = i10;
                                j12 = j2;
                                i21 = i13;
                                obj3 = obj;
                                obj4 = obj2;
                                pVar7 = pVar3;
                                vVar2 = vVar;
                                p10.R();
                                q<g0.c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
                                int i26 = i21 >> 12;
                                p<? super g0.d, ? super Integer, n> pVar12 = pVar7;
                                SurfaceKt.a(dVar3, null, j12, j11, 0.0f, a1.c.i0(p10, -1979205334, new ScaffoldKt$Scaffold$1(i20, i21, vVar2, pVar5, pVar7, obj4, obj3, qVar)), p10, (i26 & 896) | (i21 & 14) | 12582912 | (i26 & 7168), 114);
                                pVar8 = pVar5;
                                pVar9 = obj3;
                                pVar10 = pVar12;
                                long j14 = j12;
                                pVar11 = obj4;
                                i22 = i20;
                                j13 = j14;
                                T = p10.T();
                                if (T != null) {
                                }
                            }
                            dVar3 = dVar;
                            pVar5 = i25 == 0 ? ComposableSingletons$ScaffoldKt.f2294a : pVar;
                            obj3 = i14 == 0 ? ComposableSingletons$ScaffoldKt.f2295b : obj;
                            p<? super g0.d, ? super Integer, n> pVar13 = i15 == 0 ? ComposableSingletons$ScaffoldKt.c : pVar3;
                            obj4 = i18 == 0 ? ComposableSingletons$ScaffoldKt.f2296d : obj2;
                            i20 = i17 == 0 ? 1 : i10;
                            if ((i12 & 64) == 0) {
                                q<g0.c<?>, z0, t0, n> qVar3 = ComposerKt.f2737a;
                                i13 &= -3670017;
                                pVar6 = pVar13;
                                j12 = ((e0.c) p10.w(ColorSchemeKt.f2278a)).a();
                            } else {
                                pVar6 = pVar13;
                                j12 = j2;
                            }
                            if ((i12 & 128) != 0) {
                                j11 = ColorSchemeKt.a(j12, p10);
                                i13 &= -29360129;
                            }
                            if ((i12 & 256) == 0) {
                                p10.f(757124140);
                                q<g0.c<?>, z0, t0, n> qVar4 = ComposerKt.f2737a;
                                vVar2 = a1.c.F0(p10);
                                p10.Q(false);
                                i13 &= -234881025;
                            } else {
                                vVar2 = vVar;
                            }
                            i21 = i13;
                            pVar7 = pVar6;
                            p10.R();
                            q<g0.c<?>, z0, t0, n> qVar22 = ComposerKt.f2737a;
                            int i262 = i21 >> 12;
                            p<? super g0.d, ? super Integer, n> pVar122 = pVar7;
                            SurfaceKt.a(dVar3, null, j12, j11, 0.0f, a1.c.i0(p10, -1979205334, new ScaffoldKt$Scaffold$1(i20, i21, vVar2, pVar5, pVar7, obj4, obj3, qVar)), p10, (i262 & 896) | (i21 & 14) | 12582912 | (i262 & 7168), 114);
                            pVar8 = pVar5;
                            pVar9 = obj3;
                            pVar10 = pVar122;
                            long j142 = j12;
                            pVar11 = obj4;
                            i22 = i20;
                            j13 = j142;
                            T = p10.T();
                            if (T != null) {
                            }
                        }
                        i13 |= i19;
                        if ((1533916891 & i13) == 306783378) {
                            p10.e();
                            dVar3 = dVar;
                            pVar8 = pVar;
                            pVar10 = pVar3;
                            i22 = i10;
                            pVar9 = obj;
                            pVar11 = obj2;
                            j13 = j2;
                            vVar2 = vVar;
                            T = p10.T();
                            if (T != null) {
                            }
                        }
                        p10.t0();
                        if ((i11 & 1) != 0) {
                            p10.e();
                            if ((i12 & 64) != 0) {
                            }
                            if ((i12 & 128) != 0) {
                            }
                            if ((i12 & 256) != 0) {
                            }
                            dVar3 = dVar;
                            pVar5 = pVar;
                            i20 = i10;
                            j12 = j2;
                            i21 = i13;
                            obj3 = obj;
                            obj4 = obj2;
                            pVar7 = pVar3;
                            vVar2 = vVar;
                            p10.R();
                            q<g0.c<?>, z0, t0, n> qVar222 = ComposerKt.f2737a;
                            int i2622 = i21 >> 12;
                            p<? super g0.d, ? super Integer, n> pVar1222 = pVar7;
                            SurfaceKt.a(dVar3, null, j12, j11, 0.0f, a1.c.i0(p10, -1979205334, new ScaffoldKt$Scaffold$1(i20, i21, vVar2, pVar5, pVar7, obj4, obj3, qVar)), p10, (i2622 & 896) | (i21 & 14) | 12582912 | (i2622 & 7168), 114);
                            pVar8 = pVar5;
                            pVar9 = obj3;
                            pVar10 = pVar1222;
                            long j1422 = j12;
                            pVar11 = obj4;
                            i22 = i20;
                            j13 = j1422;
                            T = p10.T();
                            if (T != null) {
                            }
                        }
                        dVar3 = dVar;
                        if (i25 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if ((i12 & 64) == 0) {
                        }
                        if ((i12 & 128) != 0) {
                        }
                        if ((i12 & 256) == 0) {
                        }
                        i21 = i13;
                        pVar7 = pVar6;
                        p10.R();
                        q<g0.c<?>, z0, t0, n> qVar2222 = ComposerKt.f2737a;
                        int i26222 = i21 >> 12;
                        p<? super g0.d, ? super Integer, n> pVar12222 = pVar7;
                        SurfaceKt.a(dVar3, null, j12, j11, 0.0f, a1.c.i0(p10, -1979205334, new ScaffoldKt$Scaffold$1(i20, i21, vVar2, pVar5, pVar7, obj4, obj3, qVar)), p10, (i26222 & 896) | (i21 & 14) | 12582912 | (i26222 & 7168), 114);
                        pVar8 = pVar5;
                        pVar9 = obj3;
                        pVar10 = pVar12222;
                        long j14222 = j12;
                        pVar11 = obj4;
                        i22 = i20;
                        j13 = j14222;
                        T = p10.T();
                        if (T != null) {
                        }
                    }
                    obj2 = pVar4;
                    i17 = i12 & 32;
                    if (i17 != 0) {
                    }
                    if ((i11 & 3670016) == 0) {
                    }
                    if ((i11 & 29360128) == 0) {
                    }
                    if ((234881024 & i11) == 0) {
                    }
                    if ((i12 & 512) != 0) {
                    }
                    i13 |= i19;
                    if ((1533916891 & i13) == 306783378) {
                    }
                    p10.t0();
                    if ((i11 & 1) != 0) {
                    }
                    dVar3 = dVar;
                    if (i25 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if ((i12 & 64) == 0) {
                    }
                    if ((i12 & 128) != 0) {
                    }
                    if ((i12 & 256) == 0) {
                    }
                    i21 = i13;
                    pVar7 = pVar6;
                    p10.R();
                    q<g0.c<?>, z0, t0, n> qVar22222 = ComposerKt.f2737a;
                    int i262222 = i21 >> 12;
                    p<? super g0.d, ? super Integer, n> pVar122222 = pVar7;
                    SurfaceKt.a(dVar3, null, j12, j11, 0.0f, a1.c.i0(p10, -1979205334, new ScaffoldKt$Scaffold$1(i20, i21, vVar2, pVar5, pVar7, obj4, obj3, qVar)), p10, (i262222 & 896) | (i21 & 14) | 12582912 | (i262222 & 7168), 114);
                    pVar8 = pVar5;
                    pVar9 = obj3;
                    pVar10 = pVar122222;
                    long j142222 = j12;
                    pVar11 = obj4;
                    i22 = i20;
                    j13 = j142222;
                    T = p10.T();
                    if (T != null) {
                    }
                }
                i16 = i12 & 16;
                if (i16 == 0) {
                }
                obj2 = pVar4;
                i17 = i12 & 32;
                if (i17 != 0) {
                }
                if ((i11 & 3670016) == 0) {
                }
                if ((i11 & 29360128) == 0) {
                }
                if ((234881024 & i11) == 0) {
                }
                if ((i12 & 512) != 0) {
                }
                i13 |= i19;
                if ((1533916891 & i13) == 306783378) {
                }
                p10.t0();
                if ((i11 & 1) != 0) {
                }
                dVar3 = dVar;
                if (i25 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i18 == 0) {
                }
                if (i17 == 0) {
                }
                if ((i12 & 64) == 0) {
                }
                if ((i12 & 128) != 0) {
                }
                if ((i12 & 256) == 0) {
                }
                i21 = i13;
                pVar7 = pVar6;
                p10.R();
                q<g0.c<?>, z0, t0, n> qVar222222 = ComposerKt.f2737a;
                int i2622222 = i21 >> 12;
                p<? super g0.d, ? super Integer, n> pVar1222222 = pVar7;
                SurfaceKt.a(dVar3, null, j12, j11, 0.0f, a1.c.i0(p10, -1979205334, new ScaffoldKt$Scaffold$1(i20, i21, vVar2, pVar5, pVar7, obj4, obj3, qVar)), p10, (i2622222 & 896) | (i21 & 14) | 12582912 | (i2622222 & 7168), 114);
                pVar8 = pVar5;
                pVar9 = obj3;
                pVar10 = pVar1222222;
                long j1422222 = j12;
                pVar11 = obj4;
                i22 = i20;
                j13 = j1422222;
                T = p10.T();
                if (T != null) {
                }
            }
            obj = pVar2;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            i16 = i12 & 16;
            if (i16 == 0) {
            }
            obj2 = pVar4;
            i17 = i12 & 32;
            if (i17 != 0) {
            }
            if ((i11 & 3670016) == 0) {
            }
            if ((i11 & 29360128) == 0) {
            }
            if ((234881024 & i11) == 0) {
            }
            if ((i12 & 512) != 0) {
            }
            i13 |= i19;
            if ((1533916891 & i13) == 306783378) {
            }
            p10.t0();
            if ((i11 & 1) != 0) {
            }
            dVar3 = dVar;
            if (i25 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i18 == 0) {
            }
            if (i17 == 0) {
            }
            if ((i12 & 64) == 0) {
            }
            if ((i12 & 128) != 0) {
            }
            if ((i12 & 256) == 0) {
            }
            i21 = i13;
            pVar7 = pVar6;
            p10.R();
            q<g0.c<?>, z0, t0, n> qVar2222222 = ComposerKt.f2737a;
            int i26222222 = i21 >> 12;
            p<? super g0.d, ? super Integer, n> pVar12222222 = pVar7;
            SurfaceKt.a(dVar3, null, j12, j11, 0.0f, a1.c.i0(p10, -1979205334, new ScaffoldKt$Scaffold$1(i20, i21, vVar2, pVar5, pVar7, obj4, obj3, qVar)), p10, (i26222222 & 896) | (i21 & 14) | 12582912 | (i26222222 & 7168), 114);
            pVar8 = pVar5;
            pVar9 = obj3;
            pVar10 = pVar12222222;
            long j14222222 = j12;
            pVar11 = obj4;
            i22 = i20;
            j13 = j14222222;
            T = p10.T();
            if (T != null) {
            }
        }
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        obj = pVar2;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        i16 = i12 & 16;
        if (i16 == 0) {
        }
        obj2 = pVar4;
        i17 = i12 & 32;
        if (i17 != 0) {
        }
        if ((i11 & 3670016) == 0) {
        }
        if ((i11 & 29360128) == 0) {
        }
        if ((234881024 & i11) == 0) {
        }
        if ((i12 & 512) != 0) {
        }
        i13 |= i19;
        if ((1533916891 & i13) == 306783378) {
        }
        p10.t0();
        if ((i11 & 1) != 0) {
        }
        dVar3 = dVar;
        if (i25 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i18 == 0) {
        }
        if (i17 == 0) {
        }
        if ((i12 & 64) == 0) {
        }
        if ((i12 & 128) != 0) {
        }
        if ((i12 & 256) == 0) {
        }
        i21 = i13;
        pVar7 = pVar6;
        p10.R();
        q<g0.c<?>, z0, t0, n> qVar22222222 = ComposerKt.f2737a;
        int i262222222 = i21 >> 12;
        p<? super g0.d, ? super Integer, n> pVar122222222 = pVar7;
        SurfaceKt.a(dVar3, null, j12, j11, 0.0f, a1.c.i0(p10, -1979205334, new ScaffoldKt$Scaffold$1(i20, i21, vVar2, pVar5, pVar7, obj4, obj3, qVar)), p10, (i262222222 & 896) | (i21 & 14) | 12582912 | (i262222222 & 7168), 114);
        pVar8 = pVar5;
        pVar9 = obj3;
        pVar10 = pVar122222222;
        long j142222222 = j12;
        pVar11 = obj4;
        i22 = i20;
        j13 = j142222222;
        T = p10.T();
        if (T != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(int i10, p pVar, q qVar, p pVar2, p pVar3, v vVar, p pVar4, g0.d dVar, int i11) {
        int i12;
        ComposerImpl composerImpl;
        r0 T;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ComposerImpl p10 = dVar.p(-975511942);
        if ((i11 & 14) == 0) {
            if (p10.H(i10)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (p10.z(pVar)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        if ((i11 & 896) == 0) {
            if (p10.z(qVar)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        if ((i11 & 7168) == 0) {
            if (p10.z(pVar2)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i12 |= i16;
        }
        if ((57344 & i11) == 0) {
            if (p10.z(pVar3)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
        }
        if ((458752 & i11) == 0) {
            if (p10.z(vVar)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        }
        if ((3670016 & i11) == 0) {
            if (p10.z(pVar4)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i12 |= i13;
        }
        int i20 = i12;
        if ((2995931 & i20) == 599186 && p10.s()) {
            p10.e();
            composerImpl = p10;
            T = composerImpl.T();
            if (T != null) {
                T.f11073d = new ScaffoldKt$ScaffoldLayout$2(i10, i11, vVar, pVar, pVar2, pVar3, pVar4, qVar);
                return;
            }
            return;
        }
        q<g0.c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
        Object[] objArr = {pVar, pVar2, vVar, pVar3, new f(i10), pVar4, qVar};
        p10.f(-568225417);
        int i21 = 0;
        boolean z10 = false;
        for (int i22 = 7; i21 < i22; i22 = 7) {
            z10 |= p10.z(objArr[i21]);
            i21++;
        }
        Object a02 = p10.a0();
        if (!z10 && a02 != d.a.f11039a) {
            composerImpl = p10;
            composerImpl.Q(false);
            SubcomposeLayoutKt.b(null, (p) a02, composerImpl, 0, 1);
            q<g0.c<?>, z0, t0, n> qVar3 = ComposerKt.f2737a;
            T = composerImpl.T();
            if (T != null) {
            }
        }
        composerImpl = p10;
        ScaffoldKt$ScaffoldLayout$1$1 scaffoldKt$ScaffoldLayout$1$1 = new ScaffoldKt$ScaffoldLayout$1$1(i10, i20, vVar, pVar, pVar2, pVar3, pVar4, qVar);
        composerImpl.I0(scaffoldKt$ScaffoldLayout$1$1);
        a02 = scaffoldKt$ScaffoldLayout$1$1;
        composerImpl.Q(false);
        SubcomposeLayoutKt.b(null, (p) a02, composerImpl, 0, 1);
        q<g0.c<?>, z0, t0, n> qVar32 = ComposerKt.f2737a;
        T = composerImpl.T();
        if (T != null) {
        }
    }
}
