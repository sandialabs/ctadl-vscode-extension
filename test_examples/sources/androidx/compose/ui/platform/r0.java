package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import v0.x;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public b2.b f3880a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3881b;
    public final Outline c;

    /* renamed from: d  reason: collision with root package name */
    public long f3882d;

    /* renamed from: e  reason: collision with root package name */
    public v0.h0 f3883e;

    /* renamed from: f  reason: collision with root package name */
    public v0.h f3884f;

    /* renamed from: g  reason: collision with root package name */
    public v0.z f3885g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3886h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3887i;

    /* renamed from: j  reason: collision with root package name */
    public v0.z f3888j;

    /* renamed from: k  reason: collision with root package name */
    public u0.e f3889k;

    /* renamed from: l  reason: collision with root package name */
    public float f3890l;

    /* renamed from: m  reason: collision with root package name */
    public long f3891m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3892o;

    /* renamed from: p  reason: collision with root package name */
    public LayoutDirection f3893p;

    /* renamed from: q  reason: collision with root package name */
    public v0.x f3894q;

    public r0(b2.b bVar) {
        v7.g.f(bVar, "density");
        this.f3880a = bVar;
        this.f3881b = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.c = outline;
        long j2 = u0.f.f17736b;
        this.f3882d = j2;
        this.f3883e = v0.c0.f18087a;
        this.f3891m = u0.c.f17721b;
        this.n = j2;
        this.f3893p = LayoutDirection.Ltr;
    }

    public final void a(v0.o oVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        v7.g.f(oVar, "canvas");
        e();
        v0.z zVar = this.f3885g;
        if (zVar != null) {
            oVar.j(zVar, 1);
            return;
        }
        float f10 = this.f3890l;
        if (f10 > 0.0f) {
            v0.z zVar2 = this.f3888j;
            u0.e eVar = this.f3889k;
            if (zVar2 != null) {
                long j2 = this.f3891m;
                long j10 = this.n;
                boolean z15 = false;
                if (eVar != null && a1.c.M0(eVar)) {
                    if (eVar.f17729a == u0.c.b(j2)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        if (eVar.f17730b == u0.c.c(j2)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            if (eVar.c == u0.f.d(j10) + u0.c.b(j2)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                if (eVar.f17731d == u0.f.b(j10) + u0.c.c(j2)) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    if (u0.a.b(eVar.f17732e) == f10) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        z15 = true;
                                    }
                                }
                            }
                        }
                    }
                }
                oVar.j(zVar2, 1);
                return;
            }
            float b5 = u0.c.b(this.f3891m);
            float c = u0.c.c(this.f3891m);
            float d5 = u0.f.d(this.n) + u0.c.b(this.f3891m);
            float b10 = u0.f.b(this.n) + u0.c.c(this.f3891m);
            float f11 = this.f3890l;
            u0.e u10 = a1.c.u(b5, c, d5, b10, a1.c.m(f11, f11));
            if (zVar2 == null) {
                zVar2 = m0.b.k();
            } else {
                zVar2.l();
            }
            zVar2.b(u10);
            this.f3889k = u10;
            this.f3888j = zVar2;
            oVar.j(zVar2, 1);
            return;
        }
        oVar.h(u0.c.b(this.f3891m), u0.c.c(this.f3891m), u0.f.d(this.n) + u0.c.b(this.f3891m), u0.f.b(this.n) + u0.c.c(this.f3891m), 1);
    }

    public final Outline b() {
        e();
        if (this.f3892o && this.f3881b) {
            return this.c;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0130, code lost:
        if ((((r4 * r4) / (r2 * r2)) + ((r3 * r3) / (r1 * r1))) <= 1.0f) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(long j2) {
        v0.x xVar;
        boolean z10;
        if (!this.f3892o || (xVar = this.f3894q) == null) {
            return true;
        }
        float b5 = u0.c.b(j2);
        float c = u0.c.c(j2);
        if (xVar instanceof x.b) {
            u0.d dVar = ((x.b) xVar).f18140a;
            if (dVar.f17726a <= b5 && b5 < dVar.c && dVar.f17727b <= c && c < dVar.f17728d) {
                return true;
            }
        } else if (xVar instanceof x.c) {
            u0.e eVar = ((x.c) xVar).f18141a;
            if (b5 >= eVar.f17729a) {
                float f10 = eVar.c;
                if (b5 < f10) {
                    float f11 = eVar.f17730b;
                    if (c >= f11) {
                        float f12 = eVar.f17731d;
                        if (c < f12) {
                            long j10 = eVar.f17732e;
                            float b10 = u0.a.b(j10);
                            long j11 = eVar.f17733f;
                            float b11 = u0.a.b(j11) + b10;
                            float f13 = eVar.f17729a;
                            float f14 = f10 - f13;
                            long j12 = eVar.f17735h;
                            long j13 = eVar.f17734g;
                            if (b11 <= f14) {
                                if (u0.a.b(j13) + u0.a.b(j12) <= f14) {
                                    float f15 = f12 - f11;
                                    if (u0.a.c(j12) + u0.a.c(j10) <= f15) {
                                        if (u0.a.c(j13) + u0.a.c(j11) <= f15) {
                                            z10 = true;
                                            if (z10) {
                                                v0.h k3 = m0.b.k();
                                                k3.b(eVar);
                                                return m0.b.F0(k3, b5, c);
                                            }
                                            float b12 = u0.a.b(j10) + f13;
                                            float c10 = u0.a.c(j10) + f11;
                                            float b13 = f10 - u0.a.b(j11);
                                            float c11 = u0.a.c(j11) + f11;
                                            float b14 = f10 - u0.a.b(j13);
                                            float c12 = f12 - u0.a.c(j13);
                                            float c13 = f12 - u0.a.c(j12);
                                            float b15 = u0.a.b(j12) + f13;
                                            if (b5 >= b12 || c >= c10) {
                                                if (b5 < b15 && c > c13) {
                                                    j10 = j12;
                                                    c10 = c13;
                                                    b12 = b15;
                                                } else if (b5 > b13 && c < c11) {
                                                    j10 = j11;
                                                    b12 = b13;
                                                    c10 = c11;
                                                } else {
                                                    if (b5 > b14 && c > c12) {
                                                        b12 = b14;
                                                        j10 = j13;
                                                        c10 = c12;
                                                    }
                                                    return true;
                                                }
                                            }
                                            float f16 = b5 - b12;
                                            float f17 = c - c10;
                                            float b16 = u0.a.b(j10);
                                            float c14 = u0.a.c(j10);
                                        }
                                    }
                                }
                            }
                            z10 = false;
                            if (z10) {
                            }
                        }
                    }
                }
            }
        } else if (xVar instanceof x.a) {
            x.a aVar = (x.a) xVar;
            return m0.b.F0(null, b5, c);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(v0.h0 h0Var, float f10, boolean z10, float f11, LayoutDirection layoutDirection, b2.b bVar) {
        boolean z11;
        v7.g.f(h0Var, "shape");
        v7.g.f(layoutDirection, "layoutDirection");
        v7.g.f(bVar, "density");
        this.c.setAlpha(f10);
        boolean z12 = !v7.g.a(this.f3883e, h0Var);
        if (z12) {
            this.f3883e = h0Var;
            this.f3886h = true;
        }
        if (!z10 && f11 <= 0.0f) {
            z11 = false;
            if (this.f3892o != z11) {
                this.f3892o = z11;
                this.f3886h = true;
            }
            if (this.f3893p != layoutDirection) {
                this.f3893p = layoutDirection;
                this.f3886h = true;
            }
            if (!v7.g.a(this.f3880a, bVar)) {
                this.f3880a = bVar;
                this.f3886h = true;
            }
            return z12;
        }
        z11 = true;
        if (this.f3892o != z11) {
        }
        if (this.f3893p != layoutDirection) {
        }
        if (!v7.g.a(this.f3880a, bVar)) {
        }
        return z12;
    }

    public final void e() {
        if (this.f3886h) {
            this.f3891m = u0.c.f17721b;
            long j2 = this.f3882d;
            this.n = j2;
            this.f3890l = 0.0f;
            this.f3885g = null;
            this.f3886h = false;
            this.f3887i = false;
            boolean z10 = this.f3892o;
            Outline outline = this.c;
            if (z10 && u0.f.d(j2) > 0.0f && u0.f.b(this.f3882d) > 0.0f) {
                this.f3881b = true;
                v0.x a10 = this.f3883e.a(this.f3882d, this.f3893p, this.f3880a);
                this.f3894q = a10;
                if (a10 instanceof x.b) {
                    u0.d dVar = ((x.b) a10).f18140a;
                    float f10 = dVar.f17726a;
                    float f11 = dVar.f17727b;
                    this.f3891m = a1.c.s(f10, f11);
                    float f12 = dVar.c;
                    float f13 = dVar.f17726a;
                    float f14 = dVar.f17728d;
                    this.n = a1.c.v(f12 - f13, f14 - f11);
                    outline.setRect(m0.b.g1(f13), m0.b.g1(f11), m0.b.g1(f12), m0.b.g1(f14));
                    return;
                } else if (a10 instanceof x.c) {
                    u0.e eVar = ((x.c) a10).f18141a;
                    float b5 = u0.a.b(eVar.f17732e);
                    float f15 = eVar.f17729a;
                    float f16 = eVar.f17730b;
                    this.f3891m = a1.c.s(f15, f16);
                    float f17 = eVar.c;
                    float f18 = eVar.f17731d;
                    this.n = a1.c.v(f17 - f15, f18 - f16);
                    if (a1.c.M0(eVar)) {
                        this.c.setRoundRect(m0.b.g1(f15), m0.b.g1(f16), m0.b.g1(f17), m0.b.g1(f18), b5);
                        this.f3890l = b5;
                        return;
                    }
                    v0.h hVar = this.f3884f;
                    if (hVar == null) {
                        hVar = m0.b.k();
                        this.f3884f = hVar;
                    }
                    hVar.l();
                    hVar.b(eVar);
                    f(hVar);
                    return;
                } else if (a10 instanceof x.a) {
                    ((x.a) a10).getClass();
                    f(null);
                    return;
                } else {
                    return;
                }
            }
            outline.setEmpty();
        }
    }

    public final void f(v0.z zVar) {
        int i10 = Build.VERSION.SDK_INT;
        Outline outline = this.c;
        if (i10 <= 28 && !zVar.a()) {
            this.f3881b = false;
            outline.setEmpty();
            this.f3887i = true;
            this.f3885g = zVar;
            return;
        }
        if (zVar instanceof v0.h) {
            outline.setConvexPath(((v0.h) zVar).f18115a);
            this.f3887i = !outline.canClip();
            this.f3885g = zVar;
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
