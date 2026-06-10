package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import g0.c;
import g0.r0;
import g0.t0;
import g0.z0;
import java.util.List;
import kotlin.collections.EmptyList;
import m7.n;
import u7.p;
import u7.q;
import v0.a0;
import v0.j0;
import v0.k0;
import v0.m;
import v7.g;
import z0.d;
import z0.j;

/* loaded from: classes.dex */
public final class VectorComposeKt {
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0174, code lost:
        r1 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends d> list, p<? super g0.d, ? super Integer, n> pVar, g0.d dVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        float f17;
        int i15;
        float f18;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        String str2;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        List<? extends d> list2;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        List<? extends d> list3;
        float f29;
        float f30;
        r0 T;
        g.f(pVar, "content");
        ComposerImpl p10 = dVar.p(-213417674);
        int i21 = i11 & 1;
        if (i21 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (p10.z(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= p10.G(f10) ? 32 : 16;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                i12 |= p10.G(f11) ? 256 : 128;
                i14 = i11 & 8;
                if (i14 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    f17 = f12;
                    i12 |= p10.G(f17) ? 2048 : 1024;
                    i15 = i11 & 16;
                    if (i15 == 0) {
                        i12 |= 24576;
                    } else if ((57344 & i10) == 0) {
                        f18 = f13;
                        i12 |= p10.G(f18) ? 16384 : 8192;
                        i16 = i11 & 32;
                        if (i16 != 0) {
                            i12 |= 196608;
                        } else if ((i10 & 458752) == 0) {
                            i12 |= p10.G(f14) ? 131072 : 65536;
                        }
                        i17 = i11 & 64;
                        if (i17 != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 3670016) == 0) {
                            i12 |= p10.G(f15) ? 1048576 : 524288;
                        }
                        i18 = i11 & 128;
                        if (i18 != 0) {
                            i12 |= 12582912;
                        } else if ((i10 & 29360128) == 0) {
                            i12 |= p10.G(f16) ? 8388608 : 4194304;
                        }
                        i19 = i11 & 256;
                        if (i19 != 0) {
                            i12 |= 33554432;
                        }
                        if ((i11 & 512) != 0) {
                            i20 = 805306368;
                        } else {
                            if ((1879048192 & i10) == 0) {
                                i20 = p10.z(pVar) ? 536870912 : 268435456;
                            }
                            if (i19 == 256 && (1533916891 & i12) == 306783378 && p10.s()) {
                                p10.e();
                                str2 = str;
                                f29 = f10;
                                f24 = f11;
                                f26 = f14;
                                f27 = f15;
                                f25 = f16;
                                list3 = list;
                                f30 = f17;
                                f28 = f18;
                                T = p10.T();
                                if (T == null) {
                                    return;
                                }
                                T.f11073d = new VectorComposeKt$Group$4(str2, f29, f24, f30, f28, f26, f27, f25, list3, pVar, i10, i11);
                                return;
                            }
                            p10.t0();
                            if ((i10 & 1) != 0 && !p10.X()) {
                                p10.e();
                                if (i19 != 0) {
                                    i12 &= -234881025;
                                }
                                str2 = str;
                                f20 = f10;
                                f21 = f11;
                                f22 = f14;
                                f23 = f15;
                                f19 = f16;
                                list2 = list;
                                p10.R();
                                q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                                VectorComposeKt$Group$1 vectorComposeKt$Group$1 = VectorComposeKt$Group$1.f3174j;
                                p10.f(-548224868);
                                if (p10.f2640a instanceof z0.g) {
                                    p10.w0();
                                    if (p10.L) {
                                        p10.m(vectorComposeKt$Group$1);
                                    } else {
                                        p10.n();
                                    }
                                    a1.c.s1(p10, str2, VectorComposeKt$Group$2$1.f3175j);
                                    a1.c.s1(p10, Float.valueOf(f20), VectorComposeKt$Group$2$2.f3176j);
                                    a1.c.s1(p10, Float.valueOf(f21), VectorComposeKt$Group$2$3.f3177j);
                                    a1.c.s1(p10, Float.valueOf(f17), VectorComposeKt$Group$2$4.f3178j);
                                    a1.c.s1(p10, Float.valueOf(f18), VectorComposeKt$Group$2$5.f3179j);
                                    a1.c.s1(p10, Float.valueOf(f22), VectorComposeKt$Group$2$6.f3180j);
                                    a1.c.s1(p10, Float.valueOf(f23), VectorComposeKt$Group$2$7.f3181j);
                                    a1.c.s1(p10, Float.valueOf(f19), VectorComposeKt$Group$2$8.f3182j);
                                    a1.c.s1(p10, list2, VectorComposeKt$Group$2$9.f3183j);
                                    p10.f(-983907633);
                                    pVar.R(p10, Integer.valueOf((i12 >> 27) & 14));
                                    p10.Q(false);
                                    p10.Q(true);
                                    p10.Q(false);
                                    f24 = f21;
                                    f25 = f19;
                                    f26 = f22;
                                    f27 = f23;
                                    f28 = f18;
                                    list3 = list2;
                                    f29 = f20;
                                    f30 = f17;
                                    T = p10.T();
                                    if (T == null) {
                                    }
                                } else {
                                    a1.c.L0();
                                    throw null;
                                }
                            }
                            str2 = str;
                            f19 = 0.0f;
                            f20 = i22 == 0 ? 0.0f : f10;
                            f21 = i13 == 0 ? 0.0f : f11;
                            if (i14 != 0) {
                                f17 = 0.0f;
                            }
                            f22 = 1.0f;
                            if (i15 != 0) {
                                f18 = 1.0f;
                            }
                            if (i16 != 0) {
                                f22 = f14;
                            }
                            f23 = i17 == 0 ? 0.0f : f15;
                            if (i18 != 0) {
                                f19 = f16;
                            }
                            if (i19 != 0) {
                                list2 = j.f19079a;
                                i12 &= -234881025;
                                p10.R();
                                q<c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
                                VectorComposeKt$Group$1 vectorComposeKt$Group$12 = VectorComposeKt$Group$1.f3174j;
                                p10.f(-548224868);
                                if (p10.f2640a instanceof z0.g) {
                                }
                            }
                            list2 = list;
                            p10.R();
                            q<c<?>, z0, t0, n> qVar22 = ComposerKt.f2737a;
                            VectorComposeKt$Group$1 vectorComposeKt$Group$122 = VectorComposeKt$Group$1.f3174j;
                            p10.f(-548224868);
                            if (p10.f2640a instanceof z0.g) {
                            }
                        }
                        i12 |= i20;
                        if (i19 == 256) {
                            p10.e();
                            str2 = str;
                            f29 = f10;
                            f24 = f11;
                            f26 = f14;
                            f27 = f15;
                            f25 = f16;
                            list3 = list;
                            f30 = f17;
                            f28 = f18;
                            T = p10.T();
                            if (T == null) {
                            }
                        }
                        p10.t0();
                        if ((i10 & 1) != 0) {
                            p10.e();
                            if (i19 != 0) {
                            }
                            str2 = str;
                            f20 = f10;
                            f21 = f11;
                            f22 = f14;
                            f23 = f15;
                            f19 = f16;
                            list2 = list;
                            p10.R();
                            q<c<?>, z0, t0, n> qVar222 = ComposerKt.f2737a;
                            VectorComposeKt$Group$1 vectorComposeKt$Group$1222 = VectorComposeKt$Group$1.f3174j;
                            p10.f(-548224868);
                            if (p10.f2640a instanceof z0.g) {
                            }
                        }
                        str2 = str;
                        f19 = 0.0f;
                        if (i22 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 != 0) {
                        }
                        f22 = 1.0f;
                        if (i15 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        list2 = list;
                        p10.R();
                        q<c<?>, z0, t0, n> qVar2222 = ComposerKt.f2737a;
                        VectorComposeKt$Group$1 vectorComposeKt$Group$12222 = VectorComposeKt$Group$1.f3174j;
                        p10.f(-548224868);
                        if (p10.f2640a instanceof z0.g) {
                        }
                    }
                    f18 = f13;
                    i16 = i11 & 32;
                    if (i16 != 0) {
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                    }
                    i18 = i11 & 128;
                    if (i18 != 0) {
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                    }
                    if ((i11 & 512) != 0) {
                    }
                    i12 |= i20;
                    if (i19 == 256) {
                    }
                    p10.t0();
                    if ((i10 & 1) != 0) {
                    }
                    str2 = str;
                    f19 = 0.0f;
                    if (i22 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 != 0) {
                    }
                    f22 = 1.0f;
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    list2 = list;
                    p10.R();
                    q<c<?>, z0, t0, n> qVar22222 = ComposerKt.f2737a;
                    VectorComposeKt$Group$1 vectorComposeKt$Group$122222 = VectorComposeKt$Group$1.f3174j;
                    p10.f(-548224868);
                    if (p10.f2640a instanceof z0.g) {
                    }
                }
                f17 = f12;
                i15 = i11 & 16;
                if (i15 == 0) {
                }
                f18 = f13;
                i16 = i11 & 32;
                if (i16 != 0) {
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                }
                i18 = i11 & 128;
                if (i18 != 0) {
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                }
                if ((i11 & 512) != 0) {
                }
                i12 |= i20;
                if (i19 == 256) {
                }
                p10.t0();
                if ((i10 & 1) != 0) {
                }
                str2 = str;
                f19 = 0.0f;
                if (i22 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 != 0) {
                }
                f22 = 1.0f;
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 == 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                list2 = list;
                p10.R();
                q<c<?>, z0, t0, n> qVar222222 = ComposerKt.f2737a;
                VectorComposeKt$Group$1 vectorComposeKt$Group$1222222 = VectorComposeKt$Group$1.f3174j;
                p10.f(-548224868);
                if (p10.f2640a instanceof z0.g) {
                }
            }
            i14 = i11 & 8;
            if (i14 != 0) {
            }
            f17 = f12;
            i15 = i11 & 16;
            if (i15 == 0) {
            }
            f18 = f13;
            i16 = i11 & 32;
            if (i16 != 0) {
            }
            i17 = i11 & 64;
            if (i17 != 0) {
            }
            i18 = i11 & 128;
            if (i18 != 0) {
            }
            i19 = i11 & 256;
            if (i19 != 0) {
            }
            if ((i11 & 512) != 0) {
            }
            i12 |= i20;
            if (i19 == 256) {
            }
            p10.t0();
            if ((i10 & 1) != 0) {
            }
            str2 = str;
            f19 = 0.0f;
            if (i22 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 != 0) {
            }
            f22 = 1.0f;
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 == 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            list2 = list;
            p10.R();
            q<c<?>, z0, t0, n> qVar2222222 = ComposerKt.f2737a;
            VectorComposeKt$Group$1 vectorComposeKt$Group$12222222 = VectorComposeKt$Group$1.f3174j;
            p10.f(-548224868);
            if (p10.f2640a instanceof z0.g) {
            }
        }
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        i14 = i11 & 8;
        if (i14 != 0) {
        }
        f17 = f12;
        i15 = i11 & 16;
        if (i15 == 0) {
        }
        f18 = f13;
        i16 = i11 & 32;
        if (i16 != 0) {
        }
        i17 = i11 & 64;
        if (i17 != 0) {
        }
        i18 = i11 & 128;
        if (i18 != 0) {
        }
        i19 = i11 & 256;
        if (i19 != 0) {
        }
        if ((i11 & 512) != 0) {
        }
        i12 |= i20;
        if (i19 == 256) {
        }
        p10.t0();
        if ((i10 & 1) != 0) {
        }
        str2 = str;
        f19 = 0.0f;
        if (i22 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 != 0) {
        }
        f22 = 1.0f;
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 == 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        list2 = list;
        p10.R();
        q<c<?>, z0, t0, n> qVar22222222 = ComposerKt.f2737a;
        VectorComposeKt$Group$1 vectorComposeKt$Group$122222222 = VectorComposeKt$Group$1.f3174j;
        p10.f(-548224868);
        if (p10.f2640a instanceof z0.g) {
        }
    }

    public static final void b(List<? extends d> list, int i10, String str, m mVar, float f10, m mVar2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, g0.d dVar, int i13, int i14, int i15) {
        int i16;
        int i17;
        int i18;
        g.f(list, "pathData");
        ComposerImpl p10 = dVar.p(-1478270750);
        if ((i15 & 2) != 0) {
            EmptyList emptyList = j.f19079a;
            i16 = 0;
        } else {
            i16 = i10;
        }
        String str2 = (i15 & 4) != 0 ? "" : str;
        m mVar3 = (i15 & 8) != 0 ? null : mVar;
        float f17 = (i15 & 16) != 0 ? 1.0f : f10;
        m mVar4 = (i15 & 32) != 0 ? null : mVar2;
        float f18 = (i15 & 64) != 0 ? 1.0f : f11;
        float f19 = (i15 & 128) != 0 ? 0.0f : f12;
        if ((i15 & 256) != 0) {
            EmptyList emptyList2 = j.f19079a;
            i17 = 0;
        } else {
            i17 = i11;
        }
        if ((i15 & 512) != 0) {
            EmptyList emptyList3 = j.f19079a;
            i18 = 0;
        } else {
            i18 = i12;
        }
        float f20 = (i15 & 1024) != 0 ? 4.0f : f13;
        float f21 = (i15 & 2048) != 0 ? 0.0f : f14;
        float f22 = (i15 & 4096) != 0 ? 1.0f : f15;
        float f23 = (i15 & 8192) != 0 ? 0.0f : f16;
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        VectorComposeKt$Path$1 vectorComposeKt$Path$1 = VectorComposeKt$Path$1.f3195j;
        p10.f(1886828752);
        if (p10.f2640a instanceof z0.g) {
            p10.w0();
            if (p10.L) {
                p10.m(new VectorComposeKt$Path9cdaXJ4$$inlined$ComposeNode$1(vectorComposeKt$Path$1));
            } else {
                p10.n();
            }
            a1.c.s1(p10, str2, VectorComposeKt$Path$2$1.f3196j);
            a1.c.s1(p10, list, VectorComposeKt$Path$2$2.f3202j);
            a1.c.s1(p10, new a0(i16), VectorComposeKt$Path$2$3.f3203j);
            a1.c.s1(p10, mVar3, VectorComposeKt$Path$2$4.f3204j);
            a1.c.s1(p10, Float.valueOf(f17), VectorComposeKt$Path$2$5.f3205j);
            a1.c.s1(p10, mVar4, VectorComposeKt$Path$2$6.f3206j);
            a1.c.s1(p10, Float.valueOf(f18), VectorComposeKt$Path$2$7.f3207j);
            a1.c.s1(p10, Float.valueOf(f19), VectorComposeKt$Path$2$8.f3208j);
            a1.c.s1(p10, new k0(i18), VectorComposeKt$Path$2$9.f3209j);
            a1.c.s1(p10, new j0(i17), VectorComposeKt$Path$2$10.f3197j);
            a1.c.s1(p10, Float.valueOf(f20), VectorComposeKt$Path$2$11.f3198j);
            a1.c.s1(p10, Float.valueOf(f21), VectorComposeKt$Path$2$12.f3199j);
            a1.c.s1(p10, Float.valueOf(f22), VectorComposeKt$Path$2$13.f3200j);
            a1.c.s1(p10, Float.valueOf(f23), VectorComposeKt$Path$2$14.f3201j);
            p10.Q(true);
            p10.Q(false);
            r0 T = p10.T();
            if (T == null) {
                return;
            }
            T.f11073d = new VectorComposeKt$Path$3(list, i16, str2, mVar3, f17, mVar4, f18, f19, i17, i18, f20, f21, f22, f23, i13, i14, i15);
            return;
        }
        a1.c.L0();
        throw null;
    }
}
