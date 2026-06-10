package androidx.compose.material3;

import androidx.activity.e;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.FillModifier;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SizeModifier;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.unit.LayoutDirection;
import e0.m;
import f0.h;
import g0.h1;
import g0.p0;
import g0.r;
import g0.r0;
import g0.t0;
import g0.v0;
import g0.z0;
import j1.b0;
import j1.t;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import m7.n;
import q0.a;
import q0.d;
import u7.l;
import u7.p;
import u7.q;
import v.i;
import v0.h0;
import v7.g;

/* loaded from: classes.dex */
public final class SnackbarKt {

    /* renamed from: d  reason: collision with root package name */
    public static final float f2441d;

    /* renamed from: g  reason: collision with root package name */
    public static final float f2444g;

    /* renamed from: a  reason: collision with root package name */
    public static final float f2439a = 600;

    /* renamed from: b  reason: collision with root package name */
    public static final float f2440b = 30;
    public static final float c = 16;

    /* renamed from: e  reason: collision with root package name */
    public static final float f2442e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static final float f2443f = 6;

    /* renamed from: h  reason: collision with root package name */
    public static final float f2445h = 12;

    static {
        float f10 = 8;
        f2441d = f10;
        f2444g = f10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0194, code lost:
        r1 = q0.d.a.f16824i;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q0.d dVar, p<? super g0.d, ? super Integer, n> pVar, p<? super g0.d, ? super Integer, n> pVar2, boolean z10, h0 h0Var, long j2, long j10, long j11, long j12, p<? super g0.d, ? super Integer, n> pVar3, g0.d dVar2, int i10, int i11) {
        Object obj;
        int i12;
        Object obj2;
        int i13;
        Object obj3;
        int i14;
        long j13;
        int i15;
        Object obj4;
        Object obj5;
        boolean z11;
        h0 h0Var2;
        long j14;
        long j15;
        long j16;
        p<? super g0.d, ? super Integer, n> pVar4;
        p<? super g0.d, ? super Integer, n> pVar5;
        boolean z12;
        h0 h0Var3;
        long j17;
        long j18;
        long j19;
        long j20;
        r0 T;
        int i16;
        g.f(pVar3, "content");
        ComposerImpl p10 = dVar2.p(-1235788955);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
            obj = dVar;
        } else if ((i10 & 14) == 0) {
            obj = dVar;
            i12 = (p10.z(obj) ? 4 : 2) | i10;
        } else {
            obj = dVar;
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            obj2 = pVar;
            i12 |= p10.z(obj2) ? 32 : 16;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                obj3 = pVar2;
                i12 |= p10.z(obj3) ? 256 : 128;
                i14 = i11 & 8;
                if (i14 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    i12 |= p10.c(z10) ? 2048 : 1024;
                    if ((57344 & i10) == 0) {
                        if ((i11 & 16) == 0 && p10.z(h0Var)) {
                            i16 = 16384;
                            i12 |= i16;
                        }
                        i16 = 8192;
                        i12 |= i16;
                    }
                    if ((458752 & i10) == 0) {
                        i12 |= ((i11 & 32) == 0 && p10.I(j2)) ? 131072 : 65536;
                    }
                    if ((3670016 & i10) == 0) {
                        i12 |= ((i11 & 64) == 0 && p10.I(j10)) ? 1048576 : 524288;
                    }
                    if ((29360128 & i10) == 0) {
                        i12 |= ((i11 & 128) == 0 && p10.I(j11)) ? 8388608 : 4194304;
                    }
                    if ((234881024 & i10) != 0) {
                        j13 = j12;
                        i12 |= ((i11 & 256) == 0 && p10.I(j13)) ? 67108864 : 33554432;
                    } else {
                        j13 = j12;
                    }
                    if ((i11 & 512) == 0) {
                        i15 = 805306368;
                    } else {
                        if ((1879048192 & i10) == 0) {
                            i15 = p10.z(pVar3) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i12) == 306783378 && p10.s()) {
                            p10.e();
                            z12 = z10;
                            obj4 = obj;
                            pVar5 = obj2;
                            pVar4 = obj3;
                            j20 = j13;
                            h0Var3 = h0Var;
                            j17 = j2;
                            j18 = j10;
                            j19 = j11;
                            T = p10.T();
                            if (T == null) {
                                return;
                            }
                            T.f11073d = new SnackbarKt$Snackbar$2(obj4, pVar5, pVar4, z12, h0Var3, j17, j18, j19, j20, pVar3, i10, i11);
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
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                            }
                            z11 = z10;
                            j14 = j2;
                            j15 = j10;
                            j16 = j11;
                            obj4 = obj;
                            obj5 = obj3;
                            h0Var2 = h0Var;
                            p10.R();
                            q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                            int i19 = i12 >> 9;
                            SurfaceKt.a(obj4, h0Var2, j14, j15, h.f10814a, a1.c.i0(p10, -1829663446, new SnackbarKt$Snackbar$1(obj2, pVar3, obj5, j16, j13, i12, z11)), p10, (i19 & 7168) | 12779520 | (i12 & 14) | (i19 & 112) | (i19 & 896), 80);
                            pVar4 = obj5;
                            pVar5 = obj2;
                            z12 = z11;
                            h0Var3 = h0Var2;
                            j17 = j14;
                            j18 = j15;
                            j19 = j16;
                            j20 = j13;
                            T = p10.T();
                            if (T == null) {
                            }
                        }
                        obj4 = obj;
                        obj5 = null;
                        if (i18 != 0) {
                            obj2 = null;
                        }
                        if (i13 == 0) {
                            obj5 = obj3;
                        }
                        z11 = i14 != 0 ? false : z10;
                        if ((i11 & 16) != 0) {
                            p10.f(-551629101);
                            q<g0.c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
                            h0Var2 = ShapesKt.a(h.f10815b, p10);
                            p10.Q(false);
                            i12 &= -57345;
                        } else {
                            h0Var2 = h0Var;
                        }
                        if ((i11 & 32) != 0) {
                            p10.f(987938253);
                            q<g0.c<?>, z0, t0, n> qVar3 = ComposerKt.f2737a;
                            float f10 = h.f10814a;
                            j14 = ColorSchemeKt.e(ColorSchemeKeyTokens.InverseSurface, p10);
                            p10.Q(false);
                            i12 &= -458753;
                        } else {
                            j14 = j2;
                        }
                        if ((i11 & 64) != 0) {
                            p10.f(1021310823);
                            q<g0.c<?>, z0, t0, n> qVar4 = ComposerKt.f2737a;
                            j15 = ColorSchemeKt.e(h.f10816d, p10);
                            p10.Q(false);
                            i12 &= -3670017;
                        } else {
                            j15 = j10;
                        }
                        if ((i11 & 128) != 0) {
                            p10.f(-1313141593);
                            q<g0.c<?>, z0, t0, n> qVar5 = ComposerKt.f2737a;
                            float f11 = h.f10814a;
                            j16 = ColorSchemeKt.e(ColorSchemeKeyTokens.InversePrimary, p10);
                            p10.Q(false);
                            i12 &= -29360129;
                        } else {
                            j16 = j11;
                        }
                        if ((i11 & 256) != 0) {
                            p10.f(-528602817);
                            q<g0.c<?>, z0, t0, n> qVar6 = ComposerKt.f2737a;
                            long e10 = ColorSchemeKt.e(h.c, p10);
                            p10.Q(false);
                            i12 &= -234881025;
                            j13 = e10;
                        }
                        p10.R();
                        q<g0.c<?>, z0, t0, n> qVar7 = ComposerKt.f2737a;
                        int i192 = i12 >> 9;
                        SurfaceKt.a(obj4, h0Var2, j14, j15, h.f10814a, a1.c.i0(p10, -1829663446, new SnackbarKt$Snackbar$1(obj2, pVar3, obj5, j16, j13, i12, z11)), p10, (i192 & 7168) | 12779520 | (i12 & 14) | (i192 & 112) | (i192 & 896), 80);
                        pVar4 = obj5;
                        pVar5 = obj2;
                        z12 = z11;
                        h0Var3 = h0Var2;
                        j17 = j14;
                        j18 = j15;
                        j19 = j16;
                        j20 = j13;
                        T = p10.T();
                        if (T == null) {
                        }
                    }
                    i12 |= i15;
                    if ((1533916891 & i12) == 306783378) {
                        p10.e();
                        z12 = z10;
                        obj4 = obj;
                        pVar5 = obj2;
                        pVar4 = obj3;
                        j20 = j13;
                        h0Var3 = h0Var;
                        j17 = j2;
                        j18 = j10;
                        j19 = j11;
                        T = p10.T();
                        if (T == null) {
                        }
                    }
                    p10.t0();
                    if ((i10 & 1) != 0) {
                        p10.e();
                        if ((i11 & 16) != 0) {
                        }
                        if ((i11 & 32) != 0) {
                        }
                        if ((i11 & 64) != 0) {
                        }
                        if ((i11 & 128) != 0) {
                        }
                        if ((i11 & 256) != 0) {
                        }
                        z11 = z10;
                        j14 = j2;
                        j15 = j10;
                        j16 = j11;
                        obj4 = obj;
                        obj5 = obj3;
                        h0Var2 = h0Var;
                        p10.R();
                        q<g0.c<?>, z0, t0, n> qVar72 = ComposerKt.f2737a;
                        int i1922 = i12 >> 9;
                        SurfaceKt.a(obj4, h0Var2, j14, j15, h.f10814a, a1.c.i0(p10, -1829663446, new SnackbarKt$Snackbar$1(obj2, pVar3, obj5, j16, j13, i12, z11)), p10, (i1922 & 7168) | 12779520 | (i12 & 14) | (i1922 & 112) | (i1922 & 896), 80);
                        pVar4 = obj5;
                        pVar5 = obj2;
                        z12 = z11;
                        h0Var3 = h0Var2;
                        j17 = j14;
                        j18 = j15;
                        j19 = j16;
                        j20 = j13;
                        T = p10.T();
                        if (T == null) {
                        }
                    }
                    obj4 = obj;
                    obj5 = null;
                    if (i18 != 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 != 0) {
                    }
                    if ((i11 & 16) != 0) {
                    }
                    if ((i11 & 32) != 0) {
                    }
                    if ((i11 & 64) != 0) {
                    }
                    if ((i11 & 128) != 0) {
                    }
                    if ((i11 & 256) != 0) {
                    }
                    p10.R();
                    q<g0.c<?>, z0, t0, n> qVar722 = ComposerKt.f2737a;
                    int i19222 = i12 >> 9;
                    SurfaceKt.a(obj4, h0Var2, j14, j15, h.f10814a, a1.c.i0(p10, -1829663446, new SnackbarKt$Snackbar$1(obj2, pVar3, obj5, j16, j13, i12, z11)), p10, (i19222 & 7168) | 12779520 | (i12 & 14) | (i19222 & 112) | (i19222 & 896), 80);
                    pVar4 = obj5;
                    pVar5 = obj2;
                    z12 = z11;
                    h0Var3 = h0Var2;
                    j17 = j14;
                    j18 = j15;
                    j19 = j16;
                    j20 = j13;
                    T = p10.T();
                    if (T == null) {
                    }
                }
                if ((57344 & i10) == 0) {
                }
                if ((458752 & i10) == 0) {
                }
                if ((3670016 & i10) == 0) {
                }
                if ((29360128 & i10) == 0) {
                }
                if ((234881024 & i10) != 0) {
                }
                if ((i11 & 512) == 0) {
                }
                i12 |= i15;
                if ((1533916891 & i12) == 306783378) {
                }
                p10.t0();
                if ((i10 & 1) != 0) {
                }
                obj4 = obj;
                obj5 = null;
                if (i18 != 0) {
                }
                if (i13 == 0) {
                }
                if (i14 != 0) {
                }
                if ((i11 & 16) != 0) {
                }
                if ((i11 & 32) != 0) {
                }
                if ((i11 & 64) != 0) {
                }
                if ((i11 & 128) != 0) {
                }
                if ((i11 & 256) != 0) {
                }
                p10.R();
                q<g0.c<?>, z0, t0, n> qVar7222 = ComposerKt.f2737a;
                int i192222 = i12 >> 9;
                SurfaceKt.a(obj4, h0Var2, j14, j15, h.f10814a, a1.c.i0(p10, -1829663446, new SnackbarKt$Snackbar$1(obj2, pVar3, obj5, j16, j13, i12, z11)), p10, (i192222 & 7168) | 12779520 | (i12 & 14) | (i192222 & 112) | (i192222 & 896), 80);
                pVar4 = obj5;
                pVar5 = obj2;
                z12 = z11;
                h0Var3 = h0Var2;
                j17 = j14;
                j18 = j15;
                j19 = j16;
                j20 = j13;
                T = p10.T();
                if (T == null) {
                }
            }
            obj3 = pVar2;
            i14 = i11 & 8;
            if (i14 != 0) {
            }
            if ((57344 & i10) == 0) {
            }
            if ((458752 & i10) == 0) {
            }
            if ((3670016 & i10) == 0) {
            }
            if ((29360128 & i10) == 0) {
            }
            if ((234881024 & i10) != 0) {
            }
            if ((i11 & 512) == 0) {
            }
            i12 |= i15;
            if ((1533916891 & i12) == 306783378) {
            }
            p10.t0();
            if ((i10 & 1) != 0) {
            }
            obj4 = obj;
            obj5 = null;
            if (i18 != 0) {
            }
            if (i13 == 0) {
            }
            if (i14 != 0) {
            }
            if ((i11 & 16) != 0) {
            }
            if ((i11 & 32) != 0) {
            }
            if ((i11 & 64) != 0) {
            }
            if ((i11 & 128) != 0) {
            }
            if ((i11 & 256) != 0) {
            }
            p10.R();
            q<g0.c<?>, z0, t0, n> qVar72222 = ComposerKt.f2737a;
            int i1922222 = i12 >> 9;
            SurfaceKt.a(obj4, h0Var2, j14, j15, h.f10814a, a1.c.i0(p10, -1829663446, new SnackbarKt$Snackbar$1(obj2, pVar3, obj5, j16, j13, i12, z11)), p10, (i1922222 & 7168) | 12779520 | (i12 & 14) | (i1922222 & 112) | (i1922222 & 896), 80);
            pVar4 = obj5;
            pVar5 = obj2;
            z12 = z11;
            h0Var3 = h0Var2;
            j17 = j14;
            j18 = j15;
            j19 = j16;
            j20 = j13;
            T = p10.T();
            if (T == null) {
            }
        }
        obj2 = pVar;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        obj3 = pVar2;
        i14 = i11 & 8;
        if (i14 != 0) {
        }
        if ((57344 & i10) == 0) {
        }
        if ((458752 & i10) == 0) {
        }
        if ((3670016 & i10) == 0) {
        }
        if ((29360128 & i10) == 0) {
        }
        if ((234881024 & i10) != 0) {
        }
        if ((i11 & 512) == 0) {
        }
        i12 |= i15;
        if ((1533916891 & i12) == 306783378) {
        }
        p10.t0();
        if ((i10 & 1) != 0) {
        }
        obj4 = obj;
        obj5 = null;
        if (i18 != 0) {
        }
        if (i13 == 0) {
        }
        if (i14 != 0) {
        }
        if ((i11 & 16) != 0) {
        }
        if ((i11 & 32) != 0) {
        }
        if ((i11 & 64) != 0) {
        }
        if ((i11 & 128) != 0) {
        }
        if ((i11 & 256) != 0) {
        }
        p10.R();
        q<g0.c<?>, z0, t0, n> qVar722222 = ComposerKt.f2737a;
        int i19222222 = i12 >> 9;
        SurfaceKt.a(obj4, h0Var2, j14, j15, h.f10814a, a1.c.i0(p10, -1829663446, new SnackbarKt$Snackbar$1(obj2, pVar3, obj5, j16, j13, i12, z11)), p10, (i19222222 & 7168) | 12779520 | (i12 & 14) | (i19222222 & 112) | (i19222222 & 896), 80);
        pVar4 = obj5;
        pVar5 = obj2;
        z12 = z11;
        h0Var3 = h0Var2;
        j17 = j14;
        j18 = j15;
        j19 = j16;
        j20 = j13;
        T = p10.T();
        if (T == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0180, code lost:
        r3 = q0.d.a.f16824i;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(m mVar, q0.d dVar, boolean z10, h0 h0Var, long j2, long j10, long j11, long j12, long j13, g0.d dVar2, int i10, int i11) {
        int i12;
        int i13;
        boolean z11;
        Object obj;
        long j14;
        long j15;
        long j16;
        q0.d dVar3;
        h0 h0Var2;
        long j17;
        int i14;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        ComposableLambdaImpl composableLambdaImpl;
        long j25;
        q0.d dVar4;
        h0 h0Var3;
        boolean z12;
        long j26;
        long j27;
        long j28;
        long j29;
        r0 T;
        int i15;
        int i16;
        int i17;
        int i18;
        g.f(mVar, "snackbarData");
        ComposerImpl p10 = dVar2.p(274621471);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (p10.z(mVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= p10.z(dVar) ? 32 : 16;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                z11 = z10;
                i12 |= p10.c(z11) ? 256 : 128;
                if ((i10 & 7168) == 0) {
                    if ((i11 & 8) == 0) {
                        obj = h0Var;
                        if (p10.z(obj)) {
                            i18 = 2048;
                            i12 |= i18;
                        }
                    } else {
                        obj = h0Var;
                    }
                    i18 = 1024;
                    i12 |= i18;
                } else {
                    obj = h0Var;
                }
                if ((i10 & 57344) == 0) {
                    if ((i11 & 16) == 0 && p10.I(j2)) {
                        i17 = 16384;
                        i12 |= i17;
                    }
                    i17 = 8192;
                    i12 |= i17;
                }
                if ((i10 & 458752) == 0) {
                    if ((i11 & 32) == 0) {
                        j14 = j10;
                        if (p10.I(j14)) {
                            i16 = 131072;
                            i12 |= i16;
                        }
                    } else {
                        j14 = j10;
                    }
                    i16 = 65536;
                    i12 |= i16;
                } else {
                    j14 = j10;
                }
                if ((i10 & 3670016) == 0) {
                    j15 = j11;
                    i12 |= ((i11 & 64) == 0 && p10.I(j15)) ? 1048576 : 524288;
                } else {
                    j15 = j11;
                }
                if ((i10 & 29360128) == 0) {
                    i12 |= ((i11 & 128) == 0 && p10.I(j12)) ? 8388608 : 4194304;
                }
                if ((i10 & 234881024) == 0) {
                    if ((i11 & 256) == 0) {
                        j16 = j13;
                        if (p10.I(j16)) {
                            i15 = 67108864;
                            i12 |= i15;
                        }
                    } else {
                        j16 = j13;
                    }
                    i15 = 33554432;
                    i12 |= i15;
                } else {
                    j16 = j13;
                }
                if ((i12 & 191739611) == 38347922 && p10.s()) {
                    p10.e();
                    dVar4 = dVar;
                    z12 = z11;
                    h0Var3 = obj;
                    j25 = j15;
                    j27 = j14;
                    j29 = j16;
                    j26 = j2;
                    j28 = j12;
                    T = p10.T();
                    if (T == null) {
                        return;
                    }
                    T.f11073d = new SnackbarKt$Snackbar$4(mVar, dVar4, z12, h0Var3, j26, j27, j25, j28, j29, i10, i11);
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
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                    }
                    dVar3 = dVar;
                    h0Var2 = obj;
                    j22 = j15;
                    j20 = j16;
                    j23 = j2;
                    j21 = j12;
                    p10.R();
                    q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                    String b5 = mVar.a().b();
                    ComposableLambdaImpl i02 = b5 != null ? a1.c.i0(p10, -1378313599, new SnackbarKt$Snackbar$actionComposable$1(j22, i12, mVar, b5)) : null;
                    if (mVar.a().c()) {
                        j24 = j22;
                        composableLambdaImpl = a1.c.i0(p10, -1812633777, new SnackbarKt$Snackbar$dismissActionComposable$1(mVar, i12));
                    } else {
                        j24 = j22;
                        composableLambdaImpl = null;
                    }
                    int i20 = i12 << 3;
                    a(a1.c.c1(dVar3, 12), i02, composableLambdaImpl, z11, h0Var2, j23, j14, j21, j20, a1.c.i0(p10, -1266389126, new SnackbarKt$Snackbar$3(mVar)), p10, (i20 & 3670016) | (i20 & 7168) | 805306368 | (i20 & 57344) | (i20 & 458752) | (29360128 & i12) | (i12 & 234881024), 0);
                    j25 = j24;
                    dVar4 = dVar3;
                    h0Var3 = h0Var2;
                    z12 = z11;
                    j26 = j23;
                    j27 = j14;
                    j28 = j21;
                    j29 = j20;
                    T = p10.T();
                    if (T == null) {
                    }
                }
                dVar3 = dVar;
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i11 & 8) != 0) {
                    p10.f(-551629101);
                    q<g0.c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
                    h0Var2 = ShapesKt.a(h.f10815b, p10);
                    p10.Q(false);
                    i12 &= -7169;
                } else {
                    h0Var2 = obj;
                }
                if ((i11 & 16) != 0) {
                    p10.f(987938253);
                    q<g0.c<?>, z0, t0, n> qVar3 = ComposerKt.f2737a;
                    float f10 = h.f10814a;
                    j17 = ColorSchemeKt.e(ColorSchemeKeyTokens.InverseSurface, p10);
                    p10.Q(false);
                    i12 &= -57345;
                } else {
                    j17 = j2;
                }
                if ((i11 & 32) != 0) {
                    p10.f(1021310823);
                    q<g0.c<?>, z0, t0, n> qVar4 = ComposerKt.f2737a;
                    j14 = ColorSchemeKt.e(h.f10816d, p10);
                    p10.Q(false);
                    i12 &= -458753;
                }
                i14 = i11 & 64;
                ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.InversePrimary;
                if (i14 != 0) {
                    p10.f(743425465);
                    q<g0.c<?>, z0, t0, n> qVar5 = ComposerKt.f2737a;
                    float f11 = h.f10814a;
                    j18 = ColorSchemeKt.e(colorSchemeKeyTokens, p10);
                    p10.Q(false);
                    i12 &= -3670017;
                } else {
                    j18 = j15;
                }
                if ((i11 & 128) != 0) {
                    p10.f(-1313141593);
                    q<g0.c<?>, z0, t0, n> qVar6 = ComposerKt.f2737a;
                    float f12 = h.f10814a;
                    j19 = ColorSchemeKt.e(colorSchemeKeyTokens, p10);
                    p10.Q(false);
                    i12 &= -29360129;
                } else {
                    j19 = j12;
                }
                if ((i11 & 256) != 0) {
                    p10.f(-528602817);
                    q<g0.c<?>, z0, t0, n> qVar7 = ComposerKt.f2737a;
                    j16 = ColorSchemeKt.e(h.c, p10);
                    p10.Q(false);
                    i12 &= -234881025;
                }
                j20 = j16;
                j21 = j19;
                j22 = j18;
                j23 = j17;
                p10.R();
                q<g0.c<?>, z0, t0, n> qVar8 = ComposerKt.f2737a;
                String b52 = mVar.a().b();
                if (b52 != null) {
                }
                if (mVar.a().c()) {
                }
                int i202 = i12 << 3;
                a(a1.c.c1(dVar3, 12), i02, composableLambdaImpl, z11, h0Var2, j23, j14, j21, j20, a1.c.i0(p10, -1266389126, new SnackbarKt$Snackbar$3(mVar)), p10, (i202 & 3670016) | (i202 & 7168) | 805306368 | (i202 & 57344) | (i202 & 458752) | (29360128 & i12) | (i12 & 234881024), 0);
                j25 = j24;
                dVar4 = dVar3;
                h0Var3 = h0Var2;
                z12 = z11;
                j26 = j23;
                j27 = j14;
                j28 = j21;
                j29 = j20;
                T = p10.T();
                if (T == null) {
                }
            }
            z11 = z10;
            if ((i10 & 7168) == 0) {
            }
            if ((i10 & 57344) == 0) {
            }
            if ((i10 & 458752) == 0) {
            }
            if ((i10 & 3670016) == 0) {
            }
            if ((i10 & 29360128) == 0) {
            }
            if ((i10 & 234881024) == 0) {
            }
            if ((i12 & 191739611) == 38347922) {
                p10.e();
                dVar4 = dVar;
                z12 = z11;
                h0Var3 = obj;
                j25 = j15;
                j27 = j14;
                j29 = j16;
                j26 = j2;
                j28 = j12;
                T = p10.T();
                if (T == null) {
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
                if ((i11 & 64) != 0) {
                }
                if ((i11 & 128) != 0) {
                }
                if ((i11 & 256) != 0) {
                }
                dVar3 = dVar;
                h0Var2 = obj;
                j22 = j15;
                j20 = j16;
                j23 = j2;
                j21 = j12;
                p10.R();
                q<g0.c<?>, z0, t0, n> qVar82 = ComposerKt.f2737a;
                String b522 = mVar.a().b();
                if (b522 != null) {
                }
                if (mVar.a().c()) {
                }
                int i2022 = i12 << 3;
                a(a1.c.c1(dVar3, 12), i02, composableLambdaImpl, z11, h0Var2, j23, j14, j21, j20, a1.c.i0(p10, -1266389126, new SnackbarKt$Snackbar$3(mVar)), p10, (i2022 & 3670016) | (i2022 & 7168) | 805306368 | (i2022 & 57344) | (i2022 & 458752) | (29360128 & i12) | (i12 & 234881024), 0);
                j25 = j24;
                dVar4 = dVar3;
                h0Var3 = h0Var2;
                z12 = z11;
                j26 = j23;
                j27 = j14;
                j28 = j21;
                j29 = j20;
                T = p10.T();
                if (T == null) {
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
            i14 = i11 & 64;
            ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.InversePrimary;
            if (i14 != 0) {
            }
            if ((i11 & 128) != 0) {
            }
            if ((i11 & 256) != 0) {
            }
            j20 = j16;
            j21 = j19;
            j22 = j18;
            j23 = j17;
            p10.R();
            q<g0.c<?>, z0, t0, n> qVar822 = ComposerKt.f2737a;
            String b5222 = mVar.a().b();
            if (b5222 != null) {
            }
            if (mVar.a().c()) {
            }
            int i20222 = i12 << 3;
            a(a1.c.c1(dVar3, 12), i02, composableLambdaImpl, z11, h0Var2, j23, j14, j21, j20, a1.c.i0(p10, -1266389126, new SnackbarKt$Snackbar$3(mVar)), p10, (i20222 & 3670016) | (i20222 & 7168) | 805306368 | (i20222 & 57344) | (i20222 & 458752) | (29360128 & i12) | (i12 & 234881024), 0);
            j25 = j24;
            dVar4 = dVar3;
            h0Var3 = h0Var2;
            z12 = z11;
            j26 = j23;
            j27 = j14;
            j28 = j21;
            j29 = j20;
            T = p10.T();
            if (T == null) {
            }
        }
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        z11 = z10;
        if ((i10 & 7168) == 0) {
        }
        if ((i10 & 57344) == 0) {
        }
        if ((i10 & 458752) == 0) {
        }
        if ((i10 & 3670016) == 0) {
        }
        if ((i10 & 29360128) == 0) {
        }
        if ((i10 & 234881024) == 0) {
        }
        if ((i12 & 191739611) == 38347922) {
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
        i14 = i11 & 64;
        ColorSchemeKeyTokens colorSchemeKeyTokens22 = ColorSchemeKeyTokens.InversePrimary;
        if (i14 != 0) {
        }
        if ((i11 & 128) != 0) {
        }
        if ((i11 & 256) != 0) {
        }
        j20 = j16;
        j21 = j19;
        j22 = j18;
        j23 = j17;
        p10.R();
        q<g0.c<?>, z0, t0, n> qVar8222 = ComposerKt.f2737a;
        String b52222 = mVar.a().b();
        if (b52222 != null) {
        }
        if (mVar.a().c()) {
        }
        int i202222 = i12 << 3;
        a(a1.c.c1(dVar3, 12), i02, composableLambdaImpl, z11, h0Var2, j23, j14, j21, j20, a1.c.i0(p10, -1266389126, new SnackbarKt$Snackbar$3(mVar)), p10, (i202222 & 3670016) | (i202222 & 7168) | 805306368 | (i202222 & 57344) | (i202222 & 458752) | (29360128 & i12) | (i12 & 234881024), 0);
        j25 = j24;
        dVar4 = dVar3;
        h0Var3 = h0Var2;
        z12 = z11;
        j26 = j23;
        j27 = j14;
        j28 = j21;
        j29 = j20;
        T = p10.T();
        if (T == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(p pVar, p pVar2, p pVar3, p1.p pVar4, long j2, long j10, g0.d dVar, int i10) {
        int i11;
        boolean z10;
        r0 T;
        ComposerImpl p10 = dVar.p(-1332496681);
        if ((i10 & 14) == 0) {
            i11 = (p10.z(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= p10.z(pVar2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= p10.z(pVar3) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= p10.z(pVar4) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= p10.I(j2) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= p10.I(j10) ? 131072 : 65536;
        }
        int i12 = i11;
        if ((i12 & 374491) == 74898 && p10.s()) {
            p10.e();
            T = p10.T();
            if (T != null) {
                return;
            }
            T.f11073d = new SnackbarKt$NewLineButtonSnackbar$2(pVar, pVar2, pVar3, pVar4, j2, j10, i10);
            return;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        d.a aVar = d.a.f16824i;
        float f10 = f2439a;
        FillModifier fillModifier = SizeKt.f1957a;
        l<n0, n> lVar = InspectableValueKt.f3744a;
        q0.d e12 = a1.c.e1(SizeKt.c(new SizeModifier(Float.NaN, 0.0f, f10, 0.0f, lVar, 10)), c, 0.0f, 0.0f, f2442e, 6);
        p10.f(-483455358);
        j1.q a10 = ColumnKt.a(androidx.compose.foundation.layout.b.c, a.C0210a.f16816f, p10);
        p10.f(-1323940314);
        h1 h1Var = CompositionLocalsKt.f3703e;
        b2.b bVar = (b2.b) p10.w(h1Var);
        h1 h1Var2 = CompositionLocalsKt.f3709k;
        LayoutDirection layoutDirection = (LayoutDirection) p10.w(h1Var2);
        h1 h1Var3 = CompositionLocalsKt.f3712o;
        j1 j1Var = (j1) p10.w(h1Var3);
        ComposeUiNode.f3400a.getClass();
        u7.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3402b;
        ComposableLambdaImpl a11 = androidx.compose.ui.layout.a.a(e12);
        g0.c<?> cVar = p10.f2640a;
        if (!(cVar instanceof g0.c)) {
            a1.c.L0();
            throw null;
        }
        p10.r();
        if (p10.L) {
            p10.m(aVar2);
        } else {
            p10.n();
        }
        p10.f2661x = false;
        p<ComposeUiNode, j1.q, n> pVar5 = ComposeUiNode.Companion.f3404e;
        a1.c.s1(p10, a10, pVar5);
        p<ComposeUiNode, b2.b, n> pVar6 = ComposeUiNode.Companion.f3403d;
        a1.c.s1(p10, bVar, pVar6);
        p<ComposeUiNode, LayoutDirection, n> pVar7 = ComposeUiNode.Companion.f3405f;
        a1.c.s1(p10, layoutDirection, pVar7);
        p<ComposeUiNode, j1, n> pVar8 = ComposeUiNode.Companion.f3406g;
        a1.c.s1(p10, j1Var, pVar8);
        p10.h();
        e.o(0, a11, new v0(p10), p10, 2058660585, -1163856341);
        p10.f(-363148767);
        float f11 = f2445h;
        q0.d U0 = !b2.d.a(f11, Float.NaN) ? m0.b.U0(AlignmentLineKt.f3313b, 0.0f, f11, 2) : aVar;
        float f12 = f2440b;
        q0.d Z = U0.Z(!b2.d.a(f12, Float.NaN) ? m0.b.U0(AlignmentLineKt.f3312a, f12, 0.0f, 4) : aVar);
        float f13 = f2441d;
        q0.d e13 = a1.c.e1(Z, 0.0f, 0.0f, f13, 0.0f, 11);
        p10.f(733328855);
        q0.b bVar2 = a.C0210a.f16812a;
        j1.q c10 = BoxKt.c(bVar2, false, p10);
        p10.f(-1323940314);
        b2.b bVar3 = (b2.b) p10.w(h1Var);
        LayoutDirection layoutDirection2 = (LayoutDirection) p10.w(h1Var2);
        j1 j1Var2 = (j1) p10.w(h1Var3);
        ComposableLambdaImpl a12 = androidx.compose.ui.layout.a.a(e13);
        if (!(cVar instanceof g0.c)) {
            a1.c.L0();
            throw null;
        }
        p10.r();
        if (p10.L) {
            p10.m(aVar2);
        } else {
            p10.n();
        }
        p10.f2661x = false;
        a1.c.s1(p10, c10, pVar5);
        a1.c.s1(p10, bVar3, pVar6);
        a1.c.s1(p10, layoutDirection2, pVar7);
        a1.c.s1(p10, j1Var2, pVar8);
        p10.h();
        e.o(0, a12, new v0(p10), p10, 2058660585, -2137368960);
        p10.f(74621659);
        pVar.R(p10, Integer.valueOf(i12 & 14));
        p10.Q(false);
        p10.Q(false);
        p10.Q(false);
        p10.Q(true);
        p10.Q(false);
        p10.Q(false);
        q0.d e14 = a1.c.e1(new i(a.C0210a.f16818h, lVar), 0.0f, 0.0f, pVar3 == null ? f13 : 0, 0.0f, 11);
        p10.f(733328855);
        j1.q c11 = BoxKt.c(bVar2, false, p10);
        p10.f(-1323940314);
        b2.b bVar4 = (b2.b) p10.w(h1Var);
        LayoutDirection layoutDirection3 = (LayoutDirection) p10.w(h1Var2);
        j1 j1Var3 = (j1) p10.w(h1Var3);
        ComposableLambdaImpl a13 = androidx.compose.ui.layout.a.a(e14);
        if (!(cVar instanceof g0.c)) {
            a1.c.L0();
            throw null;
        }
        p10.r();
        if (p10.L) {
            p10.m(aVar2);
        } else {
            p10.n();
        }
        p10.f2661x = false;
        a1.c.s1(p10, c11, pVar5);
        a1.c.s1(p10, bVar4, pVar6);
        a1.c.s1(p10, layoutDirection3, pVar7);
        a1.c.s1(p10, j1Var3, pVar8);
        p10.h();
        e.o(0, a13, new v0(p10), p10, 2058660585, -2137368960);
        p10.f(1640608516);
        p10.f(693286680);
        j1.q a14 = RowKt.a(androidx.compose.foundation.layout.b.f1998a, a.C0210a.f16814d, p10);
        p10.f(-1323940314);
        b2.b bVar5 = (b2.b) p10.w(h1Var);
        LayoutDirection layoutDirection4 = (LayoutDirection) p10.w(h1Var2);
        j1 j1Var4 = (j1) p10.w(h1Var3);
        ComposableLambdaImpl a15 = androidx.compose.ui.layout.a.a(aVar);
        if (cVar instanceof g0.c) {
            p10.r();
            if (p10.L) {
                p10.m(aVar2);
            } else {
                p10.n();
            }
            p10.f2661x = false;
            a1.c.s1(p10, a14, pVar5);
            a1.c.s1(p10, bVar5, pVar6);
            a1.c.s1(p10, layoutDirection4, pVar7);
            a1.c.s1(p10, j1Var4, pVar8);
            p10.h();
            e.o(0, a15, new v0(p10), p10, 2058660585, -678309503);
            p10.f(-1595822816);
            r rVar = ContentColorKt.f2305a;
            CompositionLocalKt.a(new p0[]{rVar.b(new v0.r(j2)), TextKt.f2573a.b(pVar4)}, pVar2, p10, (i12 & 112) | 8);
            if (pVar3 != null) {
                z10 = false;
                CompositionLocalKt.a(new p0[]{rVar.b(new v0.r(j10))}, pVar3, p10, ((i12 >> 3) & 112) | 8);
            } else {
                z10 = false;
            }
            p10.Q(z10);
            p10.Q(z10);
            p10.Q(z10);
            p10.Q(true);
            p10.Q(z10);
            p10.Q(z10);
            p10.Q(z10);
            p10.Q(z10);
            p10.Q(z10);
            p10.Q(true);
            p10.Q(z10);
            p10.Q(z10);
            p10.Q(z10);
            p10.Q(z10);
            p10.Q(z10);
            p10.Q(true);
            p10.Q(z10);
            p10.Q(z10);
            T = p10.T();
            if (T != null) {
            }
        } else {
            a1.c.L0();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0382  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(p pVar, p pVar2, p pVar3, p1.p pVar4, long j2, long j10, g0.d dVar, int i10) {
        int i11;
        u7.a<ComposeUiNode> aVar;
        p<ComposeUiNode, b2.b, n> pVar5;
        g0.c<?> cVar;
        p<ComposeUiNode, j1.q, n> pVar6;
        p<ComposeUiNode, LayoutDirection, n> pVar7;
        h1 h1Var;
        boolean z10;
        boolean z11;
        r0 T;
        ComposerImpl p10 = dVar.p(-903235475);
        if ((i10 & 14) == 0) {
            i11 = (p10.z(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= p10.z(pVar2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= p10.z(pVar3) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= p10.z(pVar4) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= p10.I(j2) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= p10.I(j10) ? 131072 : 65536;
        }
        int i12 = i11;
        if ((i12 & 374491) == 74898 && p10.s()) {
            p10.e();
            T = p10.T();
            if (T != null) {
                return;
            }
            T.f11073d = new SnackbarKt$OneRowSnackbar$3(pVar, pVar2, pVar3, pVar4, j2, j10, i10);
            return;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        q0.d e12 = a1.c.e1(d.a.f16824i, c, 0.0f, pVar3 == null ? f2441d : 0, 0.0f, 10);
        j1.q qVar2 = new j1.q() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2
            @Override // j1.q
            public final j1.r a(t tVar, List<? extends j1.p> list, long j11) {
                b0 b0Var;
                Object obj;
                b0 b0Var2;
                Object obj2;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                boolean z12;
                boolean z13;
                int max;
                int i18;
                int i19;
                int i20;
                j1.r m02;
                int f02;
                g.f(tVar, "$this$Layout");
                int min = Math.min(b2.a.f(j11), tVar.a0(SnackbarKt.f2439a));
                Iterator<T> it = list.iterator();
                while (true) {
                    b0Var = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (g.a(m0.b.q0((j1.p) obj), "action")) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                j1.p pVar8 = (j1.p) obj;
                if (pVar8 != null) {
                    b0Var2 = pVar8.b(j11);
                } else {
                    b0Var2 = null;
                }
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (g.a(m0.b.q0((j1.p) obj2), "dismissAction")) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                j1.p pVar9 = (j1.p) obj2;
                if (pVar9 != null) {
                    b0Var = pVar9.b(j11);
                }
                b0 b0Var3 = b0Var;
                if (b0Var2 != null) {
                    i13 = b0Var2.f12640i;
                } else {
                    i13 = 0;
                }
                if (b0Var2 != null) {
                    i14 = b0Var2.f12641j;
                } else {
                    i14 = 0;
                }
                if (b0Var3 != null) {
                    i15 = b0Var3.f12640i;
                } else {
                    i15 = 0;
                }
                if (b0Var3 != null) {
                    i16 = b0Var3.f12641j;
                } else {
                    i16 = 0;
                }
                if (i15 == 0) {
                    i17 = tVar.a0(SnackbarKt.f2444g);
                } else {
                    i17 = 0;
                }
                int i21 = ((min - i13) - i15) - i17;
                int h10 = b2.a.h(j11);
                if (i21 < h10) {
                    i21 = h10;
                }
                for (j1.p pVar10 : list) {
                    if (g.a(m0.b.q0(pVar10), "text")) {
                        b0 b5 = pVar10.b(b2.a.a(j11, 0, i21, 0, 0, 9));
                        j1.d dVar2 = AlignmentLineKt.f3312a;
                        int f03 = b5.f0(dVar2);
                        boolean z14 = true;
                        if (f03 != Integer.MIN_VALUE) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            int f04 = b5.f0(AlignmentLineKt.f3313b);
                            if (f04 != Integer.MIN_VALUE) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                if (f03 != f04) {
                                    z14 = false;
                                }
                                int i22 = min - i15;
                                int i23 = i22 - i13;
                                if (z14) {
                                    max = Math.max(tVar.a0(h.f10818f), Math.max(i14, i16));
                                    int i24 = (max - b5.f12641j) / 2;
                                    if (b0Var2 != null && (f02 = b0Var2.f0(dVar2)) != Integer.MIN_VALUE) {
                                        i18 = (f03 + i24) - f02;
                                    } else {
                                        i18 = 0;
                                    }
                                    i19 = i24;
                                } else {
                                    int a02 = tVar.a0(SnackbarKt.f2440b) - f03;
                                    max = Math.max(tVar.a0(h.f10819g), b5.f12641j + a02);
                                    if (b0Var2 != null) {
                                        i18 = (max - b0Var2.f12641j) / 2;
                                    } else {
                                        i18 = 0;
                                    }
                                    i19 = a02;
                                }
                                if (b0Var3 != null) {
                                    i20 = (max - b0Var3.f12641j) / 2;
                                } else {
                                    i20 = 0;
                                }
                                m02 = tVar.m0(min, max, kotlin.collections.d.K1(), new SnackbarKt$OneRowSnackbar$2$measure$4(b5, i19, b0Var3, i22, i20, b0Var2, i23, i18));
                                return m02;
                            }
                            throw new IllegalArgumentException("No baselines for text".toString());
                        }
                        throw new IllegalArgumentException("No baselines for text".toString());
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        };
        p10.f(-1323940314);
        h1 h1Var2 = CompositionLocalsKt.f3703e;
        b2.b bVar = (b2.b) p10.w(h1Var2);
        h1 h1Var3 = CompositionLocalsKt.f3709k;
        LayoutDirection layoutDirection = (LayoutDirection) p10.w(h1Var3);
        h1 h1Var4 = CompositionLocalsKt.f3712o;
        j1 j1Var = (j1) p10.w(h1Var4);
        ComposeUiNode.f3400a.getClass();
        u7.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3402b;
        ComposableLambdaImpl a10 = androidx.compose.ui.layout.a.a(e12);
        g0.c<?> cVar2 = p10.f2640a;
        if (!(cVar2 instanceof g0.c)) {
            a1.c.L0();
            throw null;
        }
        p10.r();
        if (p10.L) {
            p10.m(aVar2);
        } else {
            p10.n();
        }
        p10.f2661x = false;
        p<ComposeUiNode, j1.q, n> pVar8 = ComposeUiNode.Companion.f3404e;
        a1.c.s1(p10, qVar2, pVar8);
        p<ComposeUiNode, b2.b, n> pVar9 = ComposeUiNode.Companion.f3403d;
        a1.c.s1(p10, bVar, pVar9);
        p<ComposeUiNode, LayoutDirection, n> pVar10 = ComposeUiNode.Companion.f3405f;
        a1.c.s1(p10, layoutDirection, pVar10);
        p<ComposeUiNode, j1, n> pVar11 = ComposeUiNode.Companion.f3406g;
        a1.c.s1(p10, j1Var, pVar11);
        p10.h();
        e.o(0, a10, new v0(p10), p10, 2058660585, -1961334364);
        q0.d d12 = a1.c.d1(m0.b.N0("text"), 0.0f, f2443f, 1);
        p10.f(733328855);
        q0.b bVar2 = a.C0210a.f16812a;
        j1.q c10 = BoxKt.c(bVar2, false, p10);
        p10.f(-1323940314);
        b2.b bVar3 = (b2.b) p10.w(h1Var2);
        LayoutDirection layoutDirection2 = (LayoutDirection) p10.w(h1Var3);
        j1 j1Var2 = (j1) p10.w(h1Var4);
        ComposableLambdaImpl a11 = androidx.compose.ui.layout.a.a(d12);
        if (cVar2 instanceof g0.c) {
            p10.r();
            if (p10.L) {
                p10.m(aVar2);
            } else {
                p10.n();
            }
            p10.f2661x = false;
            a1.c.s1(p10, c10, pVar8);
            a1.c.s1(p10, bVar3, pVar9);
            a1.c.s1(p10, layoutDirection2, pVar10);
            a1.c.s1(p10, j1Var2, pVar11);
            p10.h();
            e.o(0, a11, new v0(p10), p10, 2058660585, -2137368960);
            p10.f(-789862614);
            pVar.R(p10, Integer.valueOf(i12 & 14));
            p10.Q(false);
            p10.Q(false);
            p10.Q(false);
            p10.Q(true);
            p10.Q(false);
            p10.Q(false);
            p10.f(-167734710);
            if (pVar2 != null) {
                q0.d N0 = m0.b.N0("action");
                p10.f(733328855);
                j1.q c11 = BoxKt.c(bVar2, false, p10);
                p10.f(-1323940314);
                b2.b bVar4 = (b2.b) p10.w(h1Var2);
                LayoutDirection layoutDirection3 = (LayoutDirection) p10.w(h1Var3);
                j1 j1Var3 = (j1) p10.w(h1Var4);
                ComposableLambdaImpl a12 = androidx.compose.ui.layout.a.a(N0);
                if (cVar2 instanceof g0.c) {
                    p10.r();
                    if (p10.L) {
                        p10.m(aVar2);
                    } else {
                        p10.n();
                    }
                    p10.f2661x = false;
                    a1.c.s1(p10, c11, pVar8);
                    a1.c.s1(p10, bVar4, pVar9);
                    pVar7 = pVar10;
                    a1.c.s1(p10, layoutDirection3, pVar7);
                    a1.c.s1(p10, j1Var3, pVar11);
                    p10.h();
                    cVar = cVar2;
                    aVar = aVar2;
                    pVar6 = pVar8;
                    h1Var = h1Var3;
                    e.o(0, a12, new v0(p10), p10, 2058660585, -2137368960);
                    p10.f(801714373);
                    z10 = false;
                    pVar5 = pVar9;
                    CompositionLocalKt.a(new p0[]{ContentColorKt.f2305a.b(new v0.r(j2)), TextKt.f2573a.b(pVar4)}, pVar2, p10, (i12 & 112) | 8);
                    p10.Q(false);
                    p10.Q(false);
                    p10.Q(false);
                    p10.Q(true);
                    p10.Q(false);
                    p10.Q(false);
                } else {
                    a1.c.L0();
                    throw null;
                }
            } else {
                aVar = aVar2;
                pVar5 = pVar9;
                cVar = cVar2;
                pVar6 = pVar8;
                pVar7 = pVar10;
                h1Var = h1Var3;
                z10 = false;
            }
            p10.Q(z10);
            u7.a<ComposeUiNode> aVar3 = aVar;
            if (pVar3 != null) {
                q0.d N02 = m0.b.N0("dismissAction");
                p10.f(733328855);
                j1.q c12 = BoxKt.c(bVar2, z10, p10);
                p10.f(-1323940314);
                b2.b bVar5 = (b2.b) p10.w(h1Var2);
                LayoutDirection layoutDirection4 = (LayoutDirection) p10.w(h1Var);
                j1 j1Var4 = (j1) p10.w(h1Var4);
                ComposableLambdaImpl a13 = androidx.compose.ui.layout.a.a(N02);
                if (cVar instanceof g0.c) {
                    p10.r();
                    if (p10.L) {
                        p10.m(aVar3);
                    } else {
                        p10.n();
                    }
                    z11 = false;
                    p10.f2661x = false;
                    a1.c.s1(p10, c12, pVar6);
                    a1.c.s1(p10, bVar5, pVar5);
                    a1.c.s1(p10, layoutDirection4, pVar7);
                    a1.c.s1(p10, j1Var4, pVar11);
                    p10.h();
                    e.o(0, a13, new v0(p10), p10, 2058660585, -2137368960);
                    p10.f(88411260);
                    CompositionLocalKt.a(new p0[]{ContentColorKt.f2305a.b(new v0.r(j10))}, pVar3, p10, ((i12 >> 3) & 112) | 8);
                    p10.Q(false);
                    p10.Q(false);
                    p10.Q(false);
                    p10.Q(true);
                    p10.Q(false);
                    p10.Q(false);
                } else {
                    a1.c.L0();
                    throw null;
                }
            } else {
                z11 = false;
            }
            p10.Q(z11);
            p10.Q(z11);
            p10.Q(true);
            p10.Q(z11);
            T = p10.T();
            if (T != null) {
            }
        } else {
            a1.c.L0();
            throw null;
        }
    }
}
