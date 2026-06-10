package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.n0;
import b2.h;
import b2.k;
import g0.h0;
import g0.k0;
import j1.z;
import java.util.List;
import m7.n;
import s.q;
import s.r;
import u0.f;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements r {

    /* renamed from: a  reason: collision with root package name */
    public final q f1367a;

    /* renamed from: b  reason: collision with root package name */
    public final EdgeEffect f1368b;
    public final EdgeEffect c;

    /* renamed from: d  reason: collision with root package name */
    public final EdgeEffect f1369d;

    /* renamed from: e  reason: collision with root package name */
    public final EdgeEffect f1370e;

    /* renamed from: f  reason: collision with root package name */
    public final List<EdgeEffect> f1371f;

    /* renamed from: g  reason: collision with root package name */
    public final EdgeEffect f1372g;

    /* renamed from: h  reason: collision with root package name */
    public final EdgeEffect f1373h;

    /* renamed from: i  reason: collision with root package name */
    public final EdgeEffect f1374i;

    /* renamed from: j  reason: collision with root package name */
    public final EdgeEffect f1375j;

    /* renamed from: k  reason: collision with root package name */
    public final k0 f1376k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f1377l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1378m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public final k0 f1379o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1380p;

    /* renamed from: q  reason: collision with root package name */
    public final l<h, n> f1381q;

    /* renamed from: r  reason: collision with root package name */
    public final q0.d f1382r;

    public AndroidEdgeEffectOverscrollEffect(Context context, q qVar) {
        g.f(context, "context");
        this.f1367a = qVar;
        EdgeEffect N = m0.b.N(context);
        this.f1368b = N;
        EdgeEffect N2 = m0.b.N(context);
        this.c = N2;
        EdgeEffect N3 = m0.b.N(context);
        this.f1369d = N3;
        EdgeEffect N4 = m0.b.N(context);
        this.f1370e = N4;
        List<EdgeEffect> O0 = a1.c.O0(N3, N, N4, N2);
        this.f1371f = O0;
        this.f1372g = m0.b.N(context);
        this.f1373h = m0.b.N(context);
        this.f1374i = m0.b.N(context);
        this.f1375j = m0.b.N(context);
        int size = O0.size();
        for (int i10 = 0; i10 < size; i10++) {
            O0.get(i10).setColor(a1.c.I1(this.f1367a.f17224a));
        }
        this.f1376k = a1.c.U0(n.f16010a, h0.f11052a);
        this.f1377l = true;
        this.n = f.f17736b;
        this.f1379o = a1.c.V0(Boolean.FALSE);
        AndroidEdgeEffectOverscrollEffect$onNewSize$1 androidEdgeEffectOverscrollEffect$onNewSize$1 = new AndroidEdgeEffectOverscrollEffect$onNewSize$1(this);
        this.f1381q = androidEdgeEffectOverscrollEffect$onNewSize$1;
        q0.d dVar = AndroidOverscrollKt.f1385b;
        g.f(dVar, "other");
        l<n0, n> lVar = InspectableValueKt.f3744a;
        this.f1382r = dVar.Z(new z(androidEdgeEffectOverscrollEffect$onNewSize$1, lVar)).Z(new s.g(this, lVar));
    }

    @Override // s.r
    public final void a(long j2, long j10, u0.c cVar, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        long u02;
        boolean z13 = false;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (cVar != null) {
                u02 = cVar.f17724a;
            } else {
                u02 = a1.c.u0(this.n);
            }
            if (u0.c.b(j10) > 0.0f) {
                m(j10, u02);
            } else if (u0.c.b(j10) < 0.0f) {
                n(j10, u02);
            }
            if (u0.c.c(j10) > 0.0f) {
                o(j10, u02);
            } else if (u0.c.c(j10) < 0.0f) {
                l(j10, u02);
            }
            z11 = !u0.c.a(j10, u0.c.f17721b);
        } else {
            z11 = false;
        }
        EdgeEffect edgeEffect = this.f1369d;
        if (!edgeEffect.isFinished() && u0.c.b(j2) < 0.0f) {
            edgeEffect.onRelease();
            z12 = edgeEffect.isFinished();
        } else {
            z12 = false;
        }
        EdgeEffect edgeEffect2 = this.f1370e;
        if (!edgeEffect2.isFinished() && u0.c.b(j2) > 0.0f) {
            edgeEffect2.onRelease();
            if (!z12 && !edgeEffect2.isFinished()) {
                z12 = false;
            }
            z12 = true;
        }
        EdgeEffect edgeEffect3 = this.f1368b;
        if (!edgeEffect3.isFinished() && u0.c.c(j2) < 0.0f) {
            edgeEffect3.onRelease();
            if (!z12 && !edgeEffect3.isFinished()) {
                z12 = false;
            }
            z12 = true;
        }
        EdgeEffect edgeEffect4 = this.c;
        if (!edgeEffect4.isFinished() && u0.c.c(j2) > 0.0f) {
            edgeEffect4.onRelease();
            if (!z12 && !edgeEffect4.isFinished()) {
                z12 = false;
            }
            z12 = true;
        }
        if ((z12 || z11) ? true : true) {
            k();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
        if (r0.isFinished() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d8, code lost:
        if (r7.isFinished() != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ee  */
    @Override // s.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k b(long j2) {
        float f10;
        EdgeEffect edgeEffect;
        float f11;
        boolean z10;
        int i10;
        EdgeEffect edgeEffect2;
        float f12;
        boolean z11;
        int i11;
        long h10;
        float f13;
        boolean z12;
        float f14;
        boolean z13;
        float b5 = k.b(j2);
        s.a aVar = s.a.f17195a;
        boolean z14 = false;
        float f15 = 0.0f;
        if (b5 > 0.0f) {
            edgeEffect = this.f1369d;
            g.f(edgeEffect, "<this>");
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 31) {
                f14 = aVar.b(edgeEffect);
            } else {
                f14 = 0.0f;
            }
            if (f14 == 0.0f) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                i10 = m0.b.g1(k.b(j2));
                if (i12 < 31) {
                    if (edgeEffect.isFinished()) {
                    }
                    f10 = k.b(j2);
                    if (k.c(j2) > 0.0f) {
                        edgeEffect2 = this.f1368b;
                        g.f(edgeEffect2, "<this>");
                        int i13 = Build.VERSION.SDK_INT;
                        if (i13 >= 31) {
                            f13 = aVar.b(edgeEffect2);
                        } else {
                            f13 = 0.0f;
                        }
                        if (f13 == 0.0f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            i11 = m0.b.g1(k.c(j2));
                            if (i13 < 31) {
                                if (edgeEffect2.isFinished()) {
                                }
                                f15 = k.c(j2);
                                h10 = a1.b.h(f10, f15);
                                if (h10 == k.f6350b) {
                                    z14 = true;
                                }
                                if (!z14) {
                                    k();
                                }
                                return new k(h10);
                            }
                            edgeEffect2.onAbsorb(i11);
                            f15 = k.c(j2);
                            h10 = a1.b.h(f10, f15);
                            if (h10 == k.f6350b) {
                            }
                            if (!z14) {
                            }
                            return new k(h10);
                        }
                    }
                    if (k.c(j2) < 0.0f) {
                        edgeEffect2 = this.c;
                        g.f(edgeEffect2, "<this>");
                        int i14 = Build.VERSION.SDK_INT;
                        if (i14 >= 31) {
                            f12 = aVar.b(edgeEffect2);
                        } else {
                            f12 = 0.0f;
                        }
                        if (f12 == 0.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            i11 = -m0.b.g1(k.c(j2));
                            if (i14 < 31) {
                            }
                            edgeEffect2.onAbsorb(i11);
                            f15 = k.c(j2);
                        }
                    }
                    h10 = a1.b.h(f10, f15);
                    if (h10 == k.f6350b) {
                    }
                    if (!z14) {
                    }
                    return new k(h10);
                }
                edgeEffect.onAbsorb(i10);
                f10 = k.b(j2);
                if (k.c(j2) > 0.0f) {
                }
                if (k.c(j2) < 0.0f) {
                }
                h10 = a1.b.h(f10, f15);
                if (h10 == k.f6350b) {
                }
                if (!z14) {
                }
                return new k(h10);
            }
        }
        if (k.b(j2) < 0.0f) {
            edgeEffect = this.f1370e;
            g.f(edgeEffect, "<this>");
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 31) {
                f11 = aVar.b(edgeEffect);
            } else {
                f11 = 0.0f;
            }
            if (f11 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                i10 = -m0.b.g1(k.b(j2));
                if (i15 < 31) {
                }
                edgeEffect.onAbsorb(i10);
                f10 = k.b(j2);
                if (k.c(j2) > 0.0f) {
                }
                if (k.c(j2) < 0.0f) {
                }
                h10 = a1.b.h(f10, f15);
                if (h10 == k.f6350b) {
                }
                if (!z14) {
                }
                return new k(h10);
            }
        }
        f10 = 0.0f;
        if (k.c(j2) > 0.0f) {
        }
        if (k.c(j2) < 0.0f) {
        }
        h10 = a1.b.h(f10, f15);
        if (h10 == k.f6350b) {
        }
        if (!z14) {
        }
        return new k(h10);
    }

    @Override // s.r
    public final boolean c() {
        float f10;
        boolean z10;
        List<EdgeEffect> list = this.f1371f;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            EdgeEffect edgeEffect = list.get(i10);
            g.f(edgeEffect, "<this>");
            if (Build.VERSION.SDK_INT >= 31) {
                f10 = s.a.f17195a.b(edgeEffect);
            } else {
                f10 = 0.0f;
            }
            if (f10 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r5.isFinished() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
        if (r4.isFinished() != false) goto L12;
     */
    @Override // s.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n d(long j2) {
        int i10;
        EdgeEffect edgeEffect;
        int i11;
        EdgeEffect edgeEffect2;
        boolean z10 = false;
        this.f1378m = false;
        if (k.b(j2) > 0.0f) {
            i10 = m0.b.g1(k.b(j2));
            edgeEffect = this.f1369d;
            g.f(edgeEffect, "<this>");
            if (Build.VERSION.SDK_INT < 31) {
                if (edgeEffect.isFinished()) {
                }
            }
            edgeEffect.onAbsorb(i10);
        } else if (k.b(j2) < 0.0f) {
            i10 = -m0.b.g1(k.b(j2));
            edgeEffect = this.f1370e;
            g.f(edgeEffect, "<this>");
            if (Build.VERSION.SDK_INT < 31) {
            }
            edgeEffect.onAbsorb(i10);
        }
        if (k.c(j2) > 0.0f) {
            i11 = m0.b.g1(k.c(j2));
            edgeEffect2 = this.f1368b;
            g.f(edgeEffect2, "<this>");
            if (Build.VERSION.SDK_INT < 31) {
                if (edgeEffect2.isFinished()) {
                }
            }
            edgeEffect2.onAbsorb(i11);
        } else if (k.c(j2) < 0.0f) {
            i11 = -m0.b.g1(k.c(j2));
            edgeEffect2 = this.c;
            g.f(edgeEffect2, "<this>");
            if (Build.VERSION.SDK_INT < 31) {
            }
            edgeEffect2.onAbsorb(i11);
        }
        if (j2 == k.f6350b) {
            z10 = true;
        }
        if (!z10) {
            k();
        }
        g();
        return n.f16010a;
    }

    @Override // s.r
    public final q0.d e() {
        return this.f1382r;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0118  */
    @Override // s.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long f(long j2, u0.c cVar) {
        long u02;
        boolean z10;
        boolean z11;
        boolean z12;
        float l2;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        float n;
        long s10;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22 = this.f1378m;
        boolean z23 = false;
        EdgeEffect edgeEffect = this.c;
        EdgeEffect edgeEffect2 = this.f1368b;
        EdgeEffect edgeEffect3 = this.f1370e;
        EdgeEffect edgeEffect4 = this.f1369d;
        float f10 = 0.0f;
        if (!z22) {
            long u03 = a1.c.u0(this.n);
            if (m0.b.n0(edgeEffect4) == 0.0f) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (!z18) {
                m(u0.c.f17721b, u03);
            }
            if (m0.b.n0(edgeEffect3) == 0.0f) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (!z19) {
                n(u0.c.f17721b, u03);
            }
            if (m0.b.n0(edgeEffect2) == 0.0f) {
                z20 = true;
            } else {
                z20 = false;
            }
            if (!z20) {
                o(u0.c.f17721b, u03);
            }
            if (m0.b.n0(edgeEffect) == 0.0f) {
                z21 = true;
            } else {
                z21 = false;
            }
            if (!z21) {
                l(u0.c.f17721b, u03);
            }
            this.f1378m = true;
        }
        if (cVar != null) {
            u02 = cVar.f17724a;
        } else {
            u02 = a1.c.u0(this.n);
        }
        if (u0.c.c(j2) == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (m0.b.n0(edgeEffect2) == 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                l2 = o(j2, u02);
                if (m0.b.n0(edgeEffect2) == 0.0f) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    edgeEffect2.onRelease();
                }
            } else {
                if (m0.b.n0(edgeEffect) == 0.0f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    l2 = l(j2, u02);
                    if (m0.b.n0(edgeEffect) == 0.0f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        edgeEffect.onRelease();
                    }
                }
            }
            if (u0.c.b(j2) != 0.0f) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (!z15) {
                if (m0.b.n0(edgeEffect4) == 0.0f) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (!z16) {
                    n = m(j2, u02);
                    if (m0.b.n0(edgeEffect4) == 0.0f) {
                        z23 = true;
                    }
                    if (z23) {
                        edgeEffect4.onRelease();
                    }
                } else {
                    if (m0.b.n0(edgeEffect3) == 0.0f) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (!z17) {
                        n = n(j2, u02);
                        if (m0.b.n0(edgeEffect3) == 0.0f) {
                            z23 = true;
                        }
                        if (z23) {
                            edgeEffect3.onRelease();
                        }
                    }
                }
                f10 = n;
            }
            s10 = a1.c.s(f10, l2);
            if (!u0.c.a(s10, u0.c.f17721b)) {
                k();
            }
            return s10;
        }
        l2 = 0.0f;
        if (u0.c.b(j2) != 0.0f) {
        }
        if (!z15) {
        }
        s10 = a1.c.s(f10, l2);
        if (!u0.c.a(s10, u0.c.f17721b)) {
        }
        return s10;
    }

    public final void g() {
        List<EdgeEffect> list = this.f1371f;
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            EdgeEffect edgeEffect = list.get(i10);
            edgeEffect.onRelease();
            if (!edgeEffect.isFinished() && !z10) {
                z10 = false;
            }
            z10 = true;
        }
        if (z10) {
            k();
        }
    }

    public final boolean h(x0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-f.d(this.n), (-f.b(this.n)) + fVar.H(this.f1367a.f17225b.a()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final boolean i(x0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-f.b(this.n), fVar.H(this.f1367a.f17225b.b(fVar.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // s.r
    public final boolean isEnabled() {
        return ((Boolean) this.f1379o.getValue()).booleanValue();
    }

    public final boolean j(x0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        int g12 = m0.b.g1(f.d(this.n));
        float d5 = this.f1367a.f17225b.d(fVar.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, fVar.H(d5) + (-g12));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final void k() {
        if (this.f1377l) {
            this.f1376k.setValue(n.f16010a);
        }
    }

    public final float l(long j2, long j10) {
        float f10 = -(u0.c.c(j2) / f.b(this.n));
        float b5 = 1 - (u0.c.b(j10) / f.d(this.n));
        EdgeEffect edgeEffect = this.c;
        g.f(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            f10 = s.a.f17195a.c(edgeEffect, f10, b5);
        } else {
            edgeEffect.onPull(f10, b5);
        }
        return f.b(this.n) * (-f10);
    }

    public final float m(long j2, long j10) {
        float b5 = u0.c.b(j2) / f.d(this.n);
        float c = 1 - (u0.c.c(j10) / f.b(this.n));
        EdgeEffect edgeEffect = this.f1369d;
        g.f(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            b5 = s.a.f17195a.c(edgeEffect, b5, c);
        } else {
            edgeEffect.onPull(b5, c);
        }
        return f.d(this.n) * b5;
    }

    public final float n(long j2, long j10) {
        float c = u0.c.c(j10) / f.b(this.n);
        float f10 = -(u0.c.b(j2) / f.d(this.n));
        EdgeEffect edgeEffect = this.f1370e;
        g.f(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            f10 = s.a.f17195a.c(edgeEffect, f10, c);
        } else {
            edgeEffect.onPull(f10, c);
        }
        return f.d(this.n) * (-f10);
    }

    public final float o(long j2, long j10) {
        float b5 = u0.c.b(j10) / f.d(this.n);
        float c = u0.c.c(j2) / f.b(this.n);
        EdgeEffect edgeEffect = this.f1368b;
        g.f(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            c = s.a.f17195a.c(edgeEffect, c, b5);
        } else {
            edgeEffect.onPull(c, b5);
        }
        return f.b(this.n) * c;
    }

    @Override // s.r
    public final void setEnabled(boolean z10) {
        boolean z11 = this.f1380p != z10;
        this.f1379o.setValue(Boolean.valueOf(z10));
        this.f1380p = z10;
        if (z11) {
            this.f1378m = false;
            g();
        }
    }
}
