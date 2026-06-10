package androidx.compose.material3;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.n0;
import f0.e;
import g0.d;
import g0.r0;
import g0.t0;
import g0.z0;
import j1.c;
import m7.n;
import q0.d;
import u0.f;
import u7.q;
import v0.l;
import v0.r;
import v0.s;
import v7.g;

/* loaded from: classes.dex */
public final class IconKt {

    /* renamed from: a  reason: collision with root package name */
    public static final q0.d f2314a;

    static {
        int i10 = q0.d.f16823g;
        d.a aVar = d.a.f16824i;
        float f10 = e.f10784a;
        f2314a = SizeKt.d(aVar, e.f10784a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
        if (r3 != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(y0.b bVar, String str, q0.d dVar, long j2, g0.d dVar2, int i10, int i11) {
        q0.d dVar3;
        long j10;
        ColorFilter porterDuffColorFilter;
        s sVar;
        q0.d dVar4;
        boolean z10;
        g.f(bVar, "painter");
        ComposerImpl p10 = dVar2.p(-2142239481);
        int i12 = i11 & 4;
        q0.d dVar5 = d.a.f16824i;
        if (i12 != 0) {
            dVar3 = dVar5;
        } else {
            dVar3 = dVar;
        }
        if ((i11 & 8) != 0) {
            j10 = ((r) p10.w(ContentColorKt.f2305a)).f18135a;
        } else {
            j10 = j2;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        if (r.c(j10, r.f18133g)) {
            sVar = null;
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                porterDuffColorFilter = l.f18122a.a(j10, 5);
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(a1.c.I1(j10), a1.c.N1(5));
            }
            sVar = new s(porterDuffColorFilter);
        }
        p10.f(69355216);
        if (str != null) {
            p10.f(1157296644);
            boolean z11 = p10.z(str);
            Object a02 = p10.a0();
            if (z11 || a02 == d.a.f11039a) {
                a02 = new IconKt$Icon$semantics$1$1(str);
                p10.I0(a02);
            }
            p10.Q(false);
            dVar4 = m0.b.j1(dVar5, false, (u7.l) a02);
        } else {
            dVar4 = dVar5;
        }
        p10.Q(false);
        g.f(dVar3, "<this>");
        u7.l<n0, n> lVar = InspectableValueKt.f3744a;
        q0.d dVar6 = dVar4;
        if (!f.a(bVar.c(), f.c)) {
            long c = bVar.c();
            if (Float.isInfinite(f.d(c)) && Float.isInfinite(f.b(c))) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        dVar5 = f2314a;
        BoxKt.a(a1.c.f1(dVar3.Z(dVar5), bVar, null, c.a.f12647a, 0.0f, sVar, 22).Z(dVar6), p10, 0);
        r0 T = p10.T();
        if (T != null) {
            T.f11073d = new IconKt$Icon$3(bVar, str, dVar3, j10, i10, i11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00aa, code lost:
        r4 = q0.d.a.f16824i;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(z0.c cVar, String str, q0.d dVar, long j2, g0.d dVar2, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        Object obj;
        int i16;
        long j10;
        Object obj2;
        long j11;
        r0 T;
        int i17;
        g.f(cVar, "imageVector");
        ComposerImpl p10 = dVar2.p(-126890956);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (p10.z(cVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (p10.z(str)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            i15 = i11 & 4;
            if (i15 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                obj = dVar;
                if (p10.z(obj)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i12 |= i16;
                if ((i10 & 7168) == 0) {
                    if ((i11 & 8) == 0) {
                        j10 = j2;
                        if (p10.I(j10)) {
                            i17 = 2048;
                            i12 |= i17;
                        }
                    } else {
                        j10 = j2;
                    }
                    i17 = 1024;
                    i12 |= i17;
                } else {
                    j10 = j2;
                }
                if ((i12 & 5851) == 1170 && p10.s()) {
                    p10.e();
                    obj2 = obj;
                    j11 = j10;
                    T = p10.T();
                    if (T != null) {
                        T.f11073d = new IconKt$Icon$1(cVar, str, obj2, j11, i10, i11);
                        return;
                    }
                    return;
                }
                p10.t0();
                if ((i10 & 1) != 0 && !p10.X()) {
                    p10.e();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    obj2 = obj;
                    j11 = j10;
                    p10.R();
                    q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                    a(VectorPainterKt.b(cVar, p10), str, obj2, j11, p10, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168), 0);
                    T = p10.T();
                    if (T != null) {
                    }
                }
                obj2 = obj;
                if ((i11 & 8) != 0) {
                    j10 = ((r) p10.w(ContentColorKt.f2305a)).f18135a;
                    i12 &= -7169;
                }
                j11 = j10;
                p10.R();
                q<g0.c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
                a(VectorPainterKt.b(cVar, p10), str, obj2, j11, p10, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168), 0);
                T = p10.T();
                if (T != null) {
                }
            }
            obj = dVar;
            if ((i10 & 7168) == 0) {
            }
            if ((i12 & 5851) == 1170) {
                p10.e();
                obj2 = obj;
                j11 = j10;
                T = p10.T();
                if (T != null) {
                }
            }
            p10.t0();
            if ((i10 & 1) != 0) {
                p10.e();
                if ((i11 & 8) != 0) {
                }
                obj2 = obj;
                j11 = j10;
                p10.R();
                q<g0.c<?>, z0, t0, n> qVar22 = ComposerKt.f2737a;
                a(VectorPainterKt.b(cVar, p10), str, obj2, j11, p10, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168), 0);
                T = p10.T();
                if (T != null) {
                }
            }
            obj2 = obj;
            if ((i11 & 8) != 0) {
            }
            j11 = j10;
            p10.R();
            q<g0.c<?>, z0, t0, n> qVar222 = ComposerKt.f2737a;
            a(VectorPainterKt.b(cVar, p10), str, obj2, j11, p10, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168), 0);
            T = p10.T();
            if (T != null) {
            }
        }
        i15 = i11 & 4;
        if (i15 == 0) {
        }
        obj = dVar;
        if ((i10 & 7168) == 0) {
        }
        if ((i12 & 5851) == 1170) {
        }
        p10.t0();
        if ((i10 & 1) != 0) {
        }
        obj2 = obj;
        if ((i11 & 8) != 0) {
        }
        j11 = j10;
        p10.R();
        q<g0.c<?>, z0, t0, n> qVar2222 = ComposerKt.f2737a;
        a(VectorPainterKt.b(cVar, p10), str, obj2, j11, p10, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168), 0);
        T = p10.T();
        if (T != null) {
        }
    }
}
