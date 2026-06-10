package androidx.compose.material3;

import a2.f;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import g0.j1;
import g0.p0;
import g0.r;
import g0.r0;
import g0.t0;
import g0.z0;
import m7.n;
import p1.p;
import u1.e;
import u1.i;
import u1.m;
import u7.l;
import u7.q;
import v7.g;

/* loaded from: classes.dex */
public final class TextKt {

    /* renamed from: a  reason: collision with root package name */
    public static final r f2573a;

    static {
        j1 j1Var = j1.f11059a;
        TextKt$LocalTextStyle$1 textKt$LocalTextStyle$1 = TextKt$LocalTextStyle$1.f2574j;
        g.f(textKt$LocalTextStyle$1, "defaultFactory");
        f2573a = new r(j1Var, textKt$LocalTextStyle$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(p pVar, u7.p<? super g0.d, ? super Integer, n> pVar2, g0.d dVar, int i10) {
        int i11;
        r0 T;
        int i12;
        int i13;
        g.f(pVar, "value");
        g.f(pVar2, "content");
        ComposerImpl p10 = dVar.p(-460300127);
        if ((i10 & 14) == 0) {
            if (p10.z(pVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (p10.z(pVar2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 91) == 18 && p10.s()) {
            p10.e();
            T = p10.T();
            if (T == null) {
                T.f11073d = new TextKt$ProvideTextStyle$1(pVar, pVar2, i10);
                return;
            }
            return;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        r rVar = f2573a;
        CompositionLocalKt.a(new p0[]{rVar.b(((p) p10.w(rVar)).b(pVar))}, pVar2, p10, (i11 & 112) | 8);
        T = p10.T();
        if (T == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x026e, code lost:
        r5 = q0.d.a.f16824i;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, q0.d dVar, long j2, long j10, i iVar, m mVar, e eVar, long j11, a2.g gVar, f fVar, long j12, int i10, boolean z10, int i11, l<? super p1.n, n> lVar, p pVar, g0.d dVar2, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        q0.d dVar3;
        long j13;
        long j14;
        f fVar2;
        i iVar2;
        m mVar2;
        e eVar2;
        long j15;
        a2.g gVar2;
        long j16;
        int i31;
        boolean z11;
        int i32;
        l<? super p1.n, n> lVar2;
        p pVar2;
        long j17;
        long a10;
        q0.d dVar4;
        boolean z12;
        f fVar3;
        i iVar3;
        l<? super p1.n, n> lVar3;
        p pVar3;
        e eVar3;
        long j18;
        a2.g gVar3;
        long j19;
        int i33;
        long j20;
        long j21;
        int i34;
        m mVar3;
        r0 T;
        g.f(str, "text");
        ComposerImpl p10 = dVar2.p(1968784669);
        if ((i14 & 1) != 0) {
            i15 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i15 = (p10.z(str) ? 4 : 2) | i12;
        } else {
            i15 = i12;
        }
        int i35 = i14 & 2;
        if (i35 != 0) {
            i15 |= 48;
        } else if ((i12 & 112) == 0) {
            i15 |= p10.z(dVar) ? 32 : 16;
            i16 = i14 & 4;
            if (i16 == 0) {
                i15 |= 384;
            } else if ((i12 & 896) == 0) {
                i15 |= p10.I(j2) ? 256 : 128;
            }
            i17 = i14 & 8;
            if (i17 == 0) {
                i15 |= 3072;
            } else if ((i12 & 7168) == 0) {
                i15 |= p10.I(j10) ? 2048 : 1024;
            }
            i18 = i14 & 16;
            if (i18 == 0) {
                i15 |= 24576;
            } else if ((i12 & 57344) == 0) {
                i15 |= p10.z(iVar) ? 16384 : 8192;
            }
            i19 = i14 & 32;
            if (i19 == 0) {
                i15 |= 196608;
            } else if ((i12 & 458752) == 0) {
                i15 |= p10.z(mVar) ? 131072 : 65536;
            }
            i20 = i14 & 64;
            if (i20 == 0) {
                i15 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                i15 |= p10.z(eVar) ? 1048576 : 524288;
            }
            i21 = i14 & 128;
            if (i21 == 0) {
                i15 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                i15 |= p10.I(j11) ? 8388608 : 4194304;
            }
            i22 = i14 & 256;
            if (i22 == 0) {
                i15 |= 100663296;
            } else if ((i12 & 234881024) == 0) {
                i15 |= p10.z(gVar) ? 67108864 : 33554432;
            }
            i23 = i14 & 512;
            if (i23 == 0) {
                i15 |= 805306368;
            } else if ((i12 & 1879048192) == 0) {
                i15 |= p10.z(fVar) ? 536870912 : 268435456;
            }
            i24 = i14 & 1024;
            if (i24 == 0) {
                i25 = i13 | 6;
            } else if ((i13 & 14) == 0) {
                i25 = i13 | (p10.I(j12) ? 4 : 2);
            } else {
                i25 = i13;
            }
            i26 = i14 & 2048;
            if (i26 == 0) {
                i25 |= 48;
            } else if ((i13 & 112) == 0) {
                i25 |= p10.H(i10) ? 32 : 16;
            }
            int i36 = i25;
            i27 = i14 & 4096;
            if (i27 == 0) {
                i36 |= 384;
            } else if ((i13 & 896) == 0) {
                i36 |= p10.c(z10) ? 256 : 128;
                i28 = i14 & 8192;
                if (i28 != 0) {
                    i36 |= 3072;
                } else if ((i13 & 7168) == 0) {
                    i36 |= p10.H(i11) ? 2048 : 1024;
                    i29 = i14 & 16384;
                    if (i29 == 0) {
                        i36 |= 24576;
                    } else if ((i13 & 57344) == 0) {
                        i30 = i29;
                        i36 |= p10.z(lVar) ? 16384 : 8192;
                        if ((i13 & 458752) == 0) {
                            i36 |= ((i14 & 32768) == 0 && p10.z(pVar)) ? 131072 : 65536;
                        }
                        if ((i15 & 1533916891) == 306783378 && (374491 & i36) == 74898 && p10.s()) {
                            p10.e();
                            dVar4 = dVar;
                            j20 = j2;
                            j18 = j10;
                            iVar3 = iVar;
                            mVar3 = mVar;
                            eVar3 = eVar;
                            j21 = j11;
                            gVar3 = gVar;
                            fVar3 = fVar;
                            j19 = j12;
                            i34 = i10;
                            z12 = z10;
                            i33 = i11;
                            lVar3 = lVar;
                            pVar3 = pVar;
                            T = p10.T();
                            if (T != null) {
                                return;
                            }
                            T.f11073d = new TextKt$Text$2(str, dVar4, j20, j18, iVar3, mVar3, eVar3, j21, gVar3, fVar3, j19, i34, z12, i33, lVar3, pVar3, i12, i13, i14);
                            return;
                        }
                        p10.t0();
                        if ((i12 & 1) != 0 && !p10.X()) {
                            p10.e();
                            if ((i14 & 32768) != 0) {
                                i36 &= -458753;
                            }
                            dVar3 = dVar;
                            j13 = j2;
                            j14 = j10;
                            iVar2 = iVar;
                            mVar2 = mVar;
                            eVar2 = eVar;
                            j15 = j11;
                            gVar2 = gVar;
                            fVar2 = fVar;
                            j16 = j12;
                            i31 = i10;
                            z11 = z10;
                            i32 = i11;
                            lVar2 = lVar;
                            pVar2 = pVar;
                            p10.R();
                            q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                            p10.f(79582607);
                            j17 = v0.r.f18133g;
                            if (j13 == j17) {
                                a10 = pVar2.f16703a.a();
                                if (!(a10 != j17)) {
                                    a10 = ((v0.r) p10.w(ContentColorKt.f2305a)).f18135a;
                                }
                            } else {
                                a10 = j13;
                            }
                            p10.Q(false);
                            int i37 = i36 << 9;
                            BasicTextKt.a(str, dVar3, pVar2.b(new p(a10, j14, mVar2, iVar2, eVar2, j15, gVar2, fVar2, j16, 175952)), lVar2, i31, z11, i32, p10, (i15 & 112) | (i15 & 14) | ((i36 >> 3) & 7168) | (i37 & 57344) | (i37 & 458752) | (i37 & 3670016), 0);
                            dVar4 = dVar3;
                            z12 = z11;
                            fVar3 = fVar2;
                            iVar3 = iVar2;
                            lVar3 = lVar2;
                            pVar3 = pVar2;
                            eVar3 = eVar2;
                            j18 = j14;
                            gVar3 = gVar2;
                            j19 = j16;
                            i33 = i32;
                            j20 = j13;
                            j21 = j15;
                            m mVar4 = mVar2;
                            i34 = i31;
                            mVar3 = mVar4;
                            T = p10.T();
                            if (T != null) {
                            }
                        }
                        dVar3 = dVar;
                        j13 = i16 != 0 ? v0.r.f18133g : j2;
                        j14 = i17 != 0 ? b2.i.c : j10;
                        fVar2 = null;
                        iVar2 = i18 != 0 ? null : iVar;
                        mVar2 = i19 != 0 ? null : mVar;
                        eVar2 = i20 != 0 ? null : eVar;
                        j15 = i21 != 0 ? b2.i.c : j11;
                        gVar2 = i22 != 0 ? null : gVar;
                        if (i23 == 0) {
                            fVar2 = fVar;
                        }
                        j16 = i24 != 0 ? b2.i.c : j12;
                        i31 = i26 != 0 ? 1 : i10;
                        z11 = i27 != 0 ? true : z10;
                        i32 = i28 != 0 ? Integer.MAX_VALUE : i11;
                        lVar2 = i30 != 0 ? TextKt$Text$1.f2578j : lVar;
                        if ((i14 & 32768) != 0) {
                            pVar2 = (p) p10.w(f2573a);
                            i36 &= -458753;
                            p10.R();
                            q<g0.c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
                            p10.f(79582607);
                            j17 = v0.r.f18133g;
                            if (j13 == j17) {
                            }
                            p10.Q(false);
                            int i372 = i36 << 9;
                            BasicTextKt.a(str, dVar3, pVar2.b(new p(a10, j14, mVar2, iVar2, eVar2, j15, gVar2, fVar2, j16, 175952)), lVar2, i31, z11, i32, p10, (i15 & 112) | (i15 & 14) | ((i36 >> 3) & 7168) | (i372 & 57344) | (i372 & 458752) | (i372 & 3670016), 0);
                            dVar4 = dVar3;
                            z12 = z11;
                            fVar3 = fVar2;
                            iVar3 = iVar2;
                            lVar3 = lVar2;
                            pVar3 = pVar2;
                            eVar3 = eVar2;
                            j18 = j14;
                            gVar3 = gVar2;
                            j19 = j16;
                            i33 = i32;
                            j20 = j13;
                            j21 = j15;
                            m mVar42 = mVar2;
                            i34 = i31;
                            mVar3 = mVar42;
                            T = p10.T();
                            if (T != null) {
                            }
                        }
                        pVar2 = pVar;
                        p10.R();
                        q<g0.c<?>, z0, t0, n> qVar22 = ComposerKt.f2737a;
                        p10.f(79582607);
                        j17 = v0.r.f18133g;
                        if (j13 == j17) {
                        }
                        p10.Q(false);
                        int i3722 = i36 << 9;
                        BasicTextKt.a(str, dVar3, pVar2.b(new p(a10, j14, mVar2, iVar2, eVar2, j15, gVar2, fVar2, j16, 175952)), lVar2, i31, z11, i32, p10, (i15 & 112) | (i15 & 14) | ((i36 >> 3) & 7168) | (i3722 & 57344) | (i3722 & 458752) | (i3722 & 3670016), 0);
                        dVar4 = dVar3;
                        z12 = z11;
                        fVar3 = fVar2;
                        iVar3 = iVar2;
                        lVar3 = lVar2;
                        pVar3 = pVar2;
                        eVar3 = eVar2;
                        j18 = j14;
                        gVar3 = gVar2;
                        j19 = j16;
                        i33 = i32;
                        j20 = j13;
                        j21 = j15;
                        m mVar422 = mVar2;
                        i34 = i31;
                        mVar3 = mVar422;
                        T = p10.T();
                        if (T != null) {
                        }
                    }
                    i30 = i29;
                    if ((i13 & 458752) == 0) {
                    }
                    if ((i15 & 1533916891) == 306783378) {
                        p10.e();
                        dVar4 = dVar;
                        j20 = j2;
                        j18 = j10;
                        iVar3 = iVar;
                        mVar3 = mVar;
                        eVar3 = eVar;
                        j21 = j11;
                        gVar3 = gVar;
                        fVar3 = fVar;
                        j19 = j12;
                        i34 = i10;
                        z12 = z10;
                        i33 = i11;
                        lVar3 = lVar;
                        pVar3 = pVar;
                        T = p10.T();
                        if (T != null) {
                        }
                    }
                    p10.t0();
                    if ((i12 & 1) != 0) {
                        p10.e();
                        if ((i14 & 32768) != 0) {
                        }
                        dVar3 = dVar;
                        j13 = j2;
                        j14 = j10;
                        iVar2 = iVar;
                        mVar2 = mVar;
                        eVar2 = eVar;
                        j15 = j11;
                        gVar2 = gVar;
                        fVar2 = fVar;
                        j16 = j12;
                        i31 = i10;
                        z11 = z10;
                        i32 = i11;
                        lVar2 = lVar;
                        pVar2 = pVar;
                        p10.R();
                        q<g0.c<?>, z0, t0, n> qVar222 = ComposerKt.f2737a;
                        p10.f(79582607);
                        j17 = v0.r.f18133g;
                        if (j13 == j17) {
                        }
                        p10.Q(false);
                        int i37222 = i36 << 9;
                        BasicTextKt.a(str, dVar3, pVar2.b(new p(a10, j14, mVar2, iVar2, eVar2, j15, gVar2, fVar2, j16, 175952)), lVar2, i31, z11, i32, p10, (i15 & 112) | (i15 & 14) | ((i36 >> 3) & 7168) | (i37222 & 57344) | (i37222 & 458752) | (i37222 & 3670016), 0);
                        dVar4 = dVar3;
                        z12 = z11;
                        fVar3 = fVar2;
                        iVar3 = iVar2;
                        lVar3 = lVar2;
                        pVar3 = pVar2;
                        eVar3 = eVar2;
                        j18 = j14;
                        gVar3 = gVar2;
                        j19 = j16;
                        i33 = i32;
                        j20 = j13;
                        j21 = j15;
                        m mVar4222 = mVar2;
                        i34 = i31;
                        mVar3 = mVar4222;
                        T = p10.T();
                        if (T != null) {
                        }
                    }
                    dVar3 = dVar;
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    fVar2 = null;
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i23 == 0) {
                    }
                    if (i24 != 0) {
                    }
                    if (i26 != 0) {
                    }
                    if (i27 != 0) {
                    }
                    if (i28 != 0) {
                    }
                    if (i30 != 0) {
                    }
                    if ((i14 & 32768) != 0) {
                    }
                    pVar2 = pVar;
                    p10.R();
                    q<g0.c<?>, z0, t0, n> qVar2222 = ComposerKt.f2737a;
                    p10.f(79582607);
                    j17 = v0.r.f18133g;
                    if (j13 == j17) {
                    }
                    p10.Q(false);
                    int i372222 = i36 << 9;
                    BasicTextKt.a(str, dVar3, pVar2.b(new p(a10, j14, mVar2, iVar2, eVar2, j15, gVar2, fVar2, j16, 175952)), lVar2, i31, z11, i32, p10, (i15 & 112) | (i15 & 14) | ((i36 >> 3) & 7168) | (i372222 & 57344) | (i372222 & 458752) | (i372222 & 3670016), 0);
                    dVar4 = dVar3;
                    z12 = z11;
                    fVar3 = fVar2;
                    iVar3 = iVar2;
                    lVar3 = lVar2;
                    pVar3 = pVar2;
                    eVar3 = eVar2;
                    j18 = j14;
                    gVar3 = gVar2;
                    j19 = j16;
                    i33 = i32;
                    j20 = j13;
                    j21 = j15;
                    m mVar42222 = mVar2;
                    i34 = i31;
                    mVar3 = mVar42222;
                    T = p10.T();
                    if (T != null) {
                    }
                }
                i29 = i14 & 16384;
                if (i29 == 0) {
                }
                i30 = i29;
                if ((i13 & 458752) == 0) {
                }
                if ((i15 & 1533916891) == 306783378) {
                }
                p10.t0();
                if ((i12 & 1) != 0) {
                }
                dVar3 = dVar;
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                fVar2 = null;
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i20 != 0) {
                }
                if (i21 != 0) {
                }
                if (i22 != 0) {
                }
                if (i23 == 0) {
                }
                if (i24 != 0) {
                }
                if (i26 != 0) {
                }
                if (i27 != 0) {
                }
                if (i28 != 0) {
                }
                if (i30 != 0) {
                }
                if ((i14 & 32768) != 0) {
                }
                pVar2 = pVar;
                p10.R();
                q<g0.c<?>, z0, t0, n> qVar22222 = ComposerKt.f2737a;
                p10.f(79582607);
                j17 = v0.r.f18133g;
                if (j13 == j17) {
                }
                p10.Q(false);
                int i3722222 = i36 << 9;
                BasicTextKt.a(str, dVar3, pVar2.b(new p(a10, j14, mVar2, iVar2, eVar2, j15, gVar2, fVar2, j16, 175952)), lVar2, i31, z11, i32, p10, (i15 & 112) | (i15 & 14) | ((i36 >> 3) & 7168) | (i3722222 & 57344) | (i3722222 & 458752) | (i3722222 & 3670016), 0);
                dVar4 = dVar3;
                z12 = z11;
                fVar3 = fVar2;
                iVar3 = iVar2;
                lVar3 = lVar2;
                pVar3 = pVar2;
                eVar3 = eVar2;
                j18 = j14;
                gVar3 = gVar2;
                j19 = j16;
                i33 = i32;
                j20 = j13;
                j21 = j15;
                m mVar422222 = mVar2;
                i34 = i31;
                mVar3 = mVar422222;
                T = p10.T();
                if (T != null) {
                }
            }
            i28 = i14 & 8192;
            if (i28 != 0) {
            }
            i29 = i14 & 16384;
            if (i29 == 0) {
            }
            i30 = i29;
            if ((i13 & 458752) == 0) {
            }
            if ((i15 & 1533916891) == 306783378) {
            }
            p10.t0();
            if ((i12 & 1) != 0) {
            }
            dVar3 = dVar;
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            fVar2 = null;
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i20 != 0) {
            }
            if (i21 != 0) {
            }
            if (i22 != 0) {
            }
            if (i23 == 0) {
            }
            if (i24 != 0) {
            }
            if (i26 != 0) {
            }
            if (i27 != 0) {
            }
            if (i28 != 0) {
            }
            if (i30 != 0) {
            }
            if ((i14 & 32768) != 0) {
            }
            pVar2 = pVar;
            p10.R();
            q<g0.c<?>, z0, t0, n> qVar222222 = ComposerKt.f2737a;
            p10.f(79582607);
            j17 = v0.r.f18133g;
            if (j13 == j17) {
            }
            p10.Q(false);
            int i37222222 = i36 << 9;
            BasicTextKt.a(str, dVar3, pVar2.b(new p(a10, j14, mVar2, iVar2, eVar2, j15, gVar2, fVar2, j16, 175952)), lVar2, i31, z11, i32, p10, (i15 & 112) | (i15 & 14) | ((i36 >> 3) & 7168) | (i37222222 & 57344) | (i37222222 & 458752) | (i37222222 & 3670016), 0);
            dVar4 = dVar3;
            z12 = z11;
            fVar3 = fVar2;
            iVar3 = iVar2;
            lVar3 = lVar2;
            pVar3 = pVar2;
            eVar3 = eVar2;
            j18 = j14;
            gVar3 = gVar2;
            j19 = j16;
            i33 = i32;
            j20 = j13;
            j21 = j15;
            m mVar4222222 = mVar2;
            i34 = i31;
            mVar3 = mVar4222222;
            T = p10.T();
            if (T != null) {
            }
        }
        i16 = i14 & 4;
        if (i16 == 0) {
        }
        i17 = i14 & 8;
        if (i17 == 0) {
        }
        i18 = i14 & 16;
        if (i18 == 0) {
        }
        i19 = i14 & 32;
        if (i19 == 0) {
        }
        i20 = i14 & 64;
        if (i20 == 0) {
        }
        i21 = i14 & 128;
        if (i21 == 0) {
        }
        i22 = i14 & 256;
        if (i22 == 0) {
        }
        i23 = i14 & 512;
        if (i23 == 0) {
        }
        i24 = i14 & 1024;
        if (i24 == 0) {
        }
        i26 = i14 & 2048;
        if (i26 == 0) {
        }
        int i362 = i25;
        i27 = i14 & 4096;
        if (i27 == 0) {
        }
        i28 = i14 & 8192;
        if (i28 != 0) {
        }
        i29 = i14 & 16384;
        if (i29 == 0) {
        }
        i30 = i29;
        if ((i13 & 458752) == 0) {
        }
        if ((i15 & 1533916891) == 306783378) {
        }
        p10.t0();
        if ((i12 & 1) != 0) {
        }
        dVar3 = dVar;
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        fVar2 = null;
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i20 != 0) {
        }
        if (i21 != 0) {
        }
        if (i22 != 0) {
        }
        if (i23 == 0) {
        }
        if (i24 != 0) {
        }
        if (i26 != 0) {
        }
        if (i27 != 0) {
        }
        if (i28 != 0) {
        }
        if (i30 != 0) {
        }
        if ((i14 & 32768) != 0) {
        }
        pVar2 = pVar;
        p10.R();
        q<g0.c<?>, z0, t0, n> qVar2222222 = ComposerKt.f2737a;
        p10.f(79582607);
        j17 = v0.r.f18133g;
        if (j13 == j17) {
        }
        p10.Q(false);
        int i372222222 = i362 << 9;
        BasicTextKt.a(str, dVar3, pVar2.b(new p(a10, j14, mVar2, iVar2, eVar2, j15, gVar2, fVar2, j16, 175952)), lVar2, i31, z11, i32, p10, (i15 & 112) | (i15 & 14) | ((i362 >> 3) & 7168) | (i372222222 & 57344) | (i372222222 & 458752) | (i372222222 & 3670016), 0);
        dVar4 = dVar3;
        z12 = z11;
        fVar3 = fVar2;
        iVar3 = iVar2;
        lVar3 = lVar2;
        pVar3 = pVar2;
        eVar3 = eVar2;
        j18 = j14;
        gVar3 = gVar2;
        j19 = j16;
        i33 = i32;
        j20 = j13;
        j21 = j15;
        m mVar42222222 = mVar2;
        i34 = i31;
        mVar3 = mVar42222222;
        T = p10.T();
        if (T != null) {
        }
    }
}
