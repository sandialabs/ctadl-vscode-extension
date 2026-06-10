package androidx.compose.ui.draw;

import androidx.activity.e;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import androidx.compose.ui.unit.LayoutDirection;
import j1.b0;
import j1.c;
import j1.k;
import j1.r;
import j1.t;
import m7.n;
import q0.d;
import s0.f;
import u7.l;
import u7.p;
import v0.o;
import v0.s;
import v7.g;

/* loaded from: classes.dex */
public final class PainterModifier extends o0 implements k, f {

    /* renamed from: j  reason: collision with root package name */
    public final y0.b f2996j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f2997k;

    /* renamed from: l  reason: collision with root package name */
    public final q0.a f2998l;

    /* renamed from: m  reason: collision with root package name */
    public final c f2999m;
    public final float n;

    /* renamed from: o  reason: collision with root package name */
    public final s f3000o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PainterModifier(y0.b bVar, boolean z10, q0.a aVar, c cVar, float f10, s sVar, l<? super n0, n> lVar) {
        super(lVar);
        g.f(bVar, "painter");
        g.f(lVar, "inspectorInfo");
        this.f2996j = bVar;
        this.f2997k = z10;
        this.f2998l = aVar;
        this.f2999m = cVar;
        this.n = f10;
        this.f3000o = sVar;
    }

    public static boolean c(long j2) {
        boolean z10;
        if (u0.f.a(j2, u0.f.c)) {
            return false;
        }
        float b5 = u0.f.b(j2);
        if (!Float.isInfinite(b5) && !Float.isNaN(b5)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public static boolean d(long j2) {
        boolean z10;
        if (u0.f.a(j2, u0.f.c)) {
            return false;
        }
        float d5 = u0.f.d(j2);
        if (!Float.isInfinite(d5) && !Float.isNaN(d5)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // q0.d
    public final /* synthetic */ d Z(d dVar) {
        return e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        PainterModifier painterModifier = obj instanceof PainterModifier ? (PainterModifier) obj : null;
        if (painterModifier != null && g.a(this.f2996j, painterModifier.f2996j) && this.f2997k == painterModifier.f2997k && g.a(this.f2998l, painterModifier.f2998l) && g.a(this.f2999m, painterModifier.f2999m)) {
            return ((this.n > painterModifier.n ? 1 : (this.n == painterModifier.n ? 0 : -1)) == 0) && g.a(this.f3000o, painterModifier.f3000o);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
    @Override // s0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(x0.c cVar) {
        float d5;
        boolean z10;
        long j2;
        float f10;
        float f11;
        boolean z11;
        s sVar;
        s sVar2;
        LayoutDirection layoutDirection;
        boolean z12;
        boolean z13;
        g.f(cVar, "<this>");
        y0.b bVar = this.f2996j;
        long c = bVar.c();
        if (d(c)) {
            d5 = u0.f.d(c);
        } else {
            d5 = u0.f.d(cVar.a());
        }
        if (!c(c)) {
            c = cVar.a();
        }
        long v3 = a1.c.v(d5, u0.f.b(c));
        boolean z14 = false;
        if (u0.f.d(cVar.a()) == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (u0.f.b(cVar.a()) == 0.0f) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                j2 = m0.b.o1(v3, this.f2999m.a(v3, cVar.a()));
                long a10 = this.f2998l.a(v8.b.f(m0.b.g1(u0.f.d(j2)), m0.b.g1(u0.f.b(j2))), v8.b.f(m0.b.g1(u0.f.d(cVar.a())), m0.b.g1(u0.f.b(cVar.a()))), cVar.getLayoutDirection());
                float f12 = (int) (a10 >> 32);
                float a11 = b2.g.a(a10);
                cVar.N().f18556a.f(f12, a11);
                f10 = bVar.f18784d;
                f11 = this.n;
                if (f10 != f11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    if (!bVar.a(f11)) {
                        if (f11 == 1.0f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            v0.f fVar = bVar.f18782a;
                            if (fVar != null) {
                                fVar.d(f11);
                            }
                            bVar.f18783b = false;
                        } else {
                            v0.f fVar2 = bVar.f18782a;
                            if (fVar2 == null) {
                                fVar2 = new v0.f();
                                bVar.f18782a = fVar2;
                            }
                            fVar2.d(f11);
                            bVar.f18783b = true;
                        }
                    }
                    bVar.f18784d = f11;
                }
                sVar = bVar.c;
                sVar2 = this.f3000o;
                if (!g.a(sVar, sVar2)) {
                    if (!bVar.b(sVar2)) {
                        if (sVar2 == null) {
                            v0.f fVar3 = bVar.f18782a;
                            if (fVar3 != null) {
                                fVar3.g(null);
                            }
                        } else {
                            v0.f fVar4 = bVar.f18782a;
                            if (fVar4 == null) {
                                fVar4 = new v0.f();
                                bVar.f18782a = fVar4;
                            }
                            fVar4.g(sVar2);
                            z14 = true;
                        }
                        bVar.f18783b = z14;
                    }
                    bVar.c = sVar2;
                }
                layoutDirection = cVar.getLayoutDirection();
                if (bVar.f18785e != layoutDirection) {
                    g.f(layoutDirection, "layoutDirection");
                    bVar.f18785e = layoutDirection;
                }
                float d10 = u0.f.d(cVar.a()) - u0.f.d(j2);
                float b5 = u0.f.b(cVar.a()) - u0.f.b(j2);
                cVar.N().f18556a.c(0.0f, 0.0f, d10, b5);
                if (f11 > 0.0f && u0.f.d(j2) > 0.0f && u0.f.b(j2) > 0.0f) {
                    if (!bVar.f18783b) {
                        u0.d t10 = a1.c.t(u0.c.f17721b, a1.c.v(u0.f.d(j2), u0.f.b(j2)));
                        o b10 = cVar.N().b();
                        v0.f fVar5 = bVar.f18782a;
                        if (fVar5 == null) {
                            fVar5 = new v0.f();
                            bVar.f18782a = fVar5;
                        }
                        try {
                            b10.q(t10, fVar5);
                            bVar.d(cVar);
                            b10.l();
                        } catch (Throwable th) {
                            b10.l();
                            throw th;
                        }
                    } else {
                        bVar.d(cVar);
                    }
                }
                cVar.N().f18556a.c(-0.0f, -0.0f, -d10, -b5);
                cVar.N().f18556a.f(-f12, -a11);
                cVar.o0();
            }
        }
        j2 = u0.f.f17736b;
        long a102 = this.f2998l.a(v8.b.f(m0.b.g1(u0.f.d(j2)), m0.b.g1(u0.f.b(j2))), v8.b.f(m0.b.g1(u0.f.d(cVar.a())), m0.b.g1(u0.f.b(cVar.a()))), cVar.getLayoutDirection());
        float f122 = (int) (a102 >> 32);
        float a112 = b2.g.a(a102);
        cVar.N().f18556a.f(f122, a112);
        f10 = bVar.f18784d;
        f11 = this.n;
        if (f10 != f11) {
        }
        if (!z11) {
        }
        sVar = bVar.c;
        sVar2 = this.f3000o;
        if (!g.a(sVar, sVar2)) {
        }
        layoutDirection = cVar.getLayoutDirection();
        if (bVar.f18785e != layoutDirection) {
        }
        float d102 = u0.f.d(cVar.a()) - u0.f.d(j2);
        float b52 = u0.f.b(cVar.a()) - u0.f.b(j2);
        cVar.N().f18556a.c(0.0f, 0.0f, d102, b52);
        if (f11 > 0.0f) {
            if (!bVar.f18783b) {
            }
        }
        cVar.N().f18556a.c(-0.0f, -0.0f, -d102, -b52);
        cVar.N().f18556a.f(-f122, -a112);
        cVar.o0();
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f2996j.hashCode() * 31;
        if (this.f2997k) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode2 = this.f2998l.hashCode();
        int hashCode3 = this.f2999m.hashCode();
        int e10 = e.e(this.n, (hashCode3 + ((hashCode2 + ((hashCode + i10) * 31)) * 31)) * 31, 31);
        s sVar = this.f3000o;
        if (sVar != null) {
            i11 = sVar.hashCode();
        } else {
            i11 = 0;
        }
        return e10 + i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    @Override // j1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r n(t tVar, j1.p pVar, long j2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long c;
        int h10;
        int g10;
        boolean z15;
        float d5;
        float b5;
        boolean z16;
        int q10;
        int p10;
        boolean z17;
        r m02;
        boolean z18;
        boolean z19;
        g.f(tVar, "$this$measure");
        boolean z20 = true;
        if (b2.a.d(j2) && b2.a.c(j2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (b2.a.f(j2) == b2.a.h(j2)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (b2.a.e(j2) == b2.a.g(j2)) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (z19) {
                z12 = true;
                z13 = this.f2997k;
                y0.b bVar = this.f2996j;
                if (z13) {
                    if (bVar.c() != u0.f.c) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        z14 = true;
                        if ((z14 && z10) || z12) {
                            q10 = b2.a.f(j2);
                            p10 = b2.a.e(j2);
                        } else {
                            c = bVar.c();
                            if (d(c)) {
                                h10 = m0.b.g1(u0.f.d(c));
                            } else {
                                h10 = b2.a.h(j2);
                            }
                            if (c(c)) {
                                g10 = m0.b.g1(u0.f.b(c));
                            } else {
                                g10 = b2.a.g(j2);
                            }
                            long v3 = a1.c.v(v8.b.q(j2, h10), v8.b.p(j2, g10));
                            if (z13) {
                                if (bVar.c() != u0.f.c) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    z15 = true;
                                    if (z15) {
                                        if (!d(bVar.c())) {
                                            d5 = u0.f.d(v3);
                                        } else {
                                            d5 = u0.f.d(bVar.c());
                                        }
                                        if (!c(bVar.c())) {
                                            b5 = u0.f.b(v3);
                                        } else {
                                            b5 = u0.f.b(bVar.c());
                                        }
                                        long v10 = a1.c.v(d5, b5);
                                        if (u0.f.d(v3) == 0.0f) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if (!z16) {
                                            if (u0.f.b(v3) != 0.0f) {
                                                z20 = false;
                                            }
                                            if (!z20) {
                                                v3 = m0.b.o1(v10, this.f2999m.a(v10, v3));
                                            }
                                        }
                                        v3 = u0.f.f17736b;
                                    }
                                    q10 = v8.b.q(j2, m0.b.g1(u0.f.d(v3)));
                                    p10 = v8.b.p(j2, m0.b.g1(u0.f.b(v3)));
                                }
                            }
                            z15 = false;
                            if (z15) {
                            }
                            q10 = v8.b.q(j2, m0.b.g1(u0.f.d(v3)));
                            p10 = v8.b.p(j2, m0.b.g1(u0.f.b(v3)));
                        }
                        b0 b10 = pVar.b(b2.a.a(j2, q10, 0, p10, 0, 10));
                        m02 = tVar.m0(b10.f12640i, b10.f12641j, kotlin.collections.d.K1(), new PainterModifier$measure$1(b10));
                        return m02;
                    }
                }
                z14 = false;
                if (z14) {
                }
                c = bVar.c();
                if (d(c)) {
                }
                if (c(c)) {
                }
                long v32 = a1.c.v(v8.b.q(j2, h10), v8.b.p(j2, g10));
                if (z13) {
                }
                z15 = false;
                if (z15) {
                }
                q10 = v8.b.q(j2, m0.b.g1(u0.f.d(v32)));
                p10 = v8.b.p(j2, m0.b.g1(u0.f.b(v32)));
                b0 b102 = pVar.b(b2.a.a(j2, q10, 0, p10, 0, 10));
                m02 = tVar.m0(b102.f12640i, b102.f12641j, kotlin.collections.d.K1(), new PainterModifier$measure$1(b102));
                return m02;
            }
        }
        z12 = false;
        z13 = this.f2997k;
        y0.b bVar2 = this.f2996j;
        if (z13) {
        }
        z14 = false;
        if (z14) {
        }
        c = bVar2.c();
        if (d(c)) {
        }
        if (c(c)) {
        }
        long v322 = a1.c.v(v8.b.q(j2, h10), v8.b.p(j2, g10));
        if (z13) {
        }
        z15 = false;
        if (z15) {
        }
        q10 = v8.b.q(j2, m0.b.g1(u0.f.d(v322)));
        p10 = v8.b.p(j2, m0.b.g1(u0.f.b(v322)));
        b0 b1022 = pVar.b(b2.a.a(j2, q10, 0, p10, 0, 10));
        m02 = tVar.m0(b1022.f12640i, b1022.f12641j, kotlin.collections.d.K1(), new PainterModifier$measure$1(b1022));
        return m02;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f2996j + ", sizeToIntrinsics=" + this.f2997k + ", alignment=" + this.f2998l + ", alpha=" + this.n + ", colorFilter=" + this.f3000o + ')';
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }
}
