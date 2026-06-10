package com.noto.app.components;

import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.ShapesKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import e0.l;
import g0.c;
import g0.r0;
import g0.t0;
import g0.z0;
import m7.n;
import q0.d;
import u7.a;
import u7.p;
import u7.q;
import v7.g;

/* loaded from: classes.dex */
public final class SelectableDialogItemKt {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(boolean z10, a<n> aVar, d dVar, boolean z11, p<? super g0.d, ? super Integer, n> pVar, g0.d dVar2, int i10, int i11) {
        int i12;
        Object obj;
        int i13;
        boolean z12;
        long a10;
        d dVar3;
        r0 T;
        g.f(aVar, "onClick");
        g.f(pVar, "content");
        ComposerImpl p10 = dVar2.p(674227071);
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
            i12 |= p10.z(aVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            obj = dVar;
            i12 |= p10.z(obj) ? 256 : 128;
            i13 = i11 & 8;
            if (i13 == 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                z12 = z11;
                i12 |= p10.c(z12) ? 2048 : 1024;
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    i12 |= p10.z(pVar) ? 16384 : 8192;
                }
                if ((46811 & i12) == 9362 && p10.s()) {
                    p10.e();
                    dVar3 = obj;
                    T = p10.T();
                    if (T == null) {
                        return;
                    }
                    T.f11073d = new SelectableDialogItemKt$SelectableDialogItem$2(z10, aVar, dVar3, z12, pVar, i10, i11);
                    return;
                }
                d.a aVar2 = d.a.f16824i;
                d.a aVar3 = i14 != 0 ? aVar2 : obj;
                boolean z13 = i13 != 0 ? true : z12;
                q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                d Y = a1.c.Y(aVar2, ((l) p10.w(ShapesKt.f2400a)).f10555b);
                if (z10) {
                    p10.f(-971215977);
                    a10 = ((e0.c) p10.w(ColorSchemeKt.f2278a)).u();
                } else {
                    p10.f(-971215938);
                    a10 = ((e0.c) p10.w(ColorSchemeKt.f2278a)).a();
                }
                p10.Q(false);
                SurfaceKt.b(z10, aVar, Y, z13, a10, a1.c.i0(p10, -1221151063, new SelectableDialogItemKt$SelectableDialogItem$1(aVar3, z13, pVar, i12)), p10, (i12 & 7168) | (i12 & 14) | (i12 & 112));
                dVar3 = aVar3;
                z12 = z13;
                T = p10.T();
                if (T == null) {
                }
            }
            z12 = z11;
            if ((i11 & 16) != 0) {
            }
            if ((46811 & i12) == 9362) {
                p10.e();
                dVar3 = obj;
                T = p10.T();
                if (T == null) {
                }
            }
            d.a aVar22 = d.a.f16824i;
            if (i14 != 0) {
            }
            if (i13 != 0) {
            }
            q<c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
            d Y2 = a1.c.Y(aVar22, ((l) p10.w(ShapesKt.f2400a)).f10555b);
            if (z10) {
            }
            p10.Q(false);
            SurfaceKt.b(z10, aVar, Y2, z13, a10, a1.c.i0(p10, -1221151063, new SelectableDialogItemKt$SelectableDialogItem$1(aVar3, z13, pVar, i12)), p10, (i12 & 7168) | (i12 & 14) | (i12 & 112));
            dVar3 = aVar3;
            z12 = z13;
            T = p10.T();
            if (T == null) {
            }
        }
        obj = dVar;
        i13 = i11 & 8;
        if (i13 == 0) {
        }
        z12 = z11;
        if ((i11 & 16) != 0) {
        }
        if ((46811 & i12) == 9362) {
        }
        d.a aVar222 = d.a.f16824i;
        if (i14 != 0) {
        }
        if (i13 != 0) {
        }
        q<c<?>, z0, t0, n> qVar22 = ComposerKt.f2737a;
        d Y22 = a1.c.Y(aVar222, ((l) p10.w(ShapesKt.f2400a)).f10555b);
        if (z10) {
        }
        p10.Q(false);
        SurfaceKt.b(z10, aVar, Y22, z13, a10, a1.c.i0(p10, -1221151063, new SelectableDialogItemKt$SelectableDialogItem$1(aVar3, z13, pVar, i12)), p10, (i12 & 7168) | (i12 & 14) | (i12 & 112));
        dVar3 = aVar3;
        z12 = z13;
        T = p10.T();
        if (T == null) {
        }
    }
}
