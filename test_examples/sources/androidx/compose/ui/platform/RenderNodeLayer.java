package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import androidx.compose.ui.unit.LayoutDirection;
import v0.c0;

/* loaded from: classes.dex */
public final class RenderNodeLayer implements l1.z {

    /* renamed from: u  reason: collision with root package name */
    public static final u7.p<g0, Matrix, m7.n> f3747u = RenderNodeLayer$Companion$getMatrix$1.f3759j;

    /* renamed from: i  reason: collision with root package name */
    public final AndroidComposeView f3748i;

    /* renamed from: j  reason: collision with root package name */
    public u7.l<? super v0.o, m7.n> f3749j;

    /* renamed from: k  reason: collision with root package name */
    public u7.a<m7.n> f3750k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3751l;

    /* renamed from: m  reason: collision with root package name */
    public final r0 f3752m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3753o;

    /* renamed from: p  reason: collision with root package name */
    public v0.f f3754p;

    /* renamed from: q  reason: collision with root package name */
    public final p0<g0> f3755q;

    /* renamed from: r  reason: collision with root package name */
    public final j0.c f3756r;

    /* renamed from: s  reason: collision with root package name */
    public long f3757s;

    /* renamed from: t  reason: collision with root package name */
    public final g0 f3758t;

    public RenderNodeLayer(AndroidComposeView androidComposeView, u7.l<? super v0.o, m7.n> lVar, u7.a<m7.n> aVar) {
        g0 s0Var;
        v7.g.f(androidComposeView, "ownerView");
        v7.g.f(lVar, "drawBlock");
        v7.g.f(aVar, "invalidateParentLayer");
        this.f3748i = androidComposeView;
        this.f3749j = lVar;
        this.f3750k = aVar;
        this.f3752m = new r0(androidComposeView.getDensity());
        this.f3755q = new p0<>(f3747u);
        this.f3756r = new j0.c(1);
        this.f3757s = v0.l0.f18123a;
        if (Build.VERSION.SDK_INT >= 29) {
            s0Var = new v0(androidComposeView);
        } else {
            s0Var = new s0(androidComposeView);
        }
        s0Var.Q();
        this.f3758t = s0Var;
    }

    @Override // l1.z
    public final void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j2, v0.h0 h0Var, boolean z10, long j10, long j11, LayoutDirection layoutDirection, b2.b bVar) {
        u7.a<m7.n> aVar;
        v7.g.f(h0Var, "shape");
        v7.g.f(layoutDirection, "layoutDirection");
        v7.g.f(bVar, "density");
        this.f3757s = j2;
        g0 g0Var = this.f3758t;
        boolean K = g0Var.K();
        r0 r0Var = this.f3752m;
        boolean z11 = false;
        boolean z12 = K && !(r0Var.f3887i ^ true);
        g0Var.i(f10);
        g0Var.m(f11);
        g0Var.d(f12);
        g0Var.k(f13);
        g0Var.h(f14);
        g0Var.I(f15);
        g0Var.G(a1.c.I1(j10));
        g0Var.P(a1.c.I1(j11));
        g0Var.g(f18);
        g0Var.u(f16);
        g0Var.c(f17);
        g0Var.q(f19);
        int i10 = v0.l0.f18124b;
        g0Var.C(Float.intBitsToFloat((int) (j2 >> 32)) * g0Var.b());
        g0Var.H(Float.intBitsToFloat((int) (j2 & 4294967295L)) * g0Var.a());
        c0.a aVar2 = v0.c0.f18087a;
        g0Var.M(z10 && h0Var != aVar2);
        g0Var.D(z10 && h0Var == aVar2);
        g0Var.e();
        boolean d5 = this.f3752m.d(h0Var, g0Var.n(), g0Var.K(), g0Var.S(), layoutDirection, bVar);
        g0Var.O(r0Var.b());
        if (g0Var.K() && !(!r0Var.f3887i)) {
            z11 = true;
        }
        AndroidComposeView androidComposeView = this.f3748i;
        if (z12 == z11 && (!z11 || !d5)) {
            if (Build.VERSION.SDK_INT >= 26) {
                v1.f3913a.a(androidComposeView);
            } else {
                androidComposeView.invalidate();
            }
            if (!this.f3753o && g0Var.S() > 0.0f && (aVar = this.f3750k) != null) {
                aVar.k0();
            }
            this.f3755q.c();
        }
        if (!this.f3751l && !this.n) {
            androidComposeView.invalidate();
            j(true);
        }
        if (!this.f3753o) {
            aVar.k0();
        }
        this.f3755q.c();
    }

    @Override // l1.z
    public final long b(long j2, boolean z10) {
        g0 g0Var = this.f3758t;
        p0<g0> p0Var = this.f3755q;
        if (z10) {
            float[] a10 = p0Var.a(g0Var);
            if (a10 != null) {
                return v0.p.w(a10, j2);
            }
            int i10 = u0.c.f17723e;
            return u0.c.c;
        }
        return v0.p.w(p0Var.b(g0Var), j2);
    }

    @Override // l1.z
    public final void c(v0.o oVar) {
        v7.g.f(oVar, "canvas");
        Canvas canvas = v0.d.f18088a;
        Canvas canvas2 = ((v0.c) oVar).f18085a;
        boolean isHardwareAccelerated = canvas2.isHardwareAccelerated();
        boolean z10 = false;
        g0 g0Var = this.f3758t;
        if (isHardwareAccelerated) {
            h();
            if (g0Var.S() > 0.0f) {
                z10 = true;
            }
            this.f3753o = z10;
            if (z10) {
                oVar.p();
            }
            g0Var.z(canvas2);
            if (this.f3753o) {
                oVar.n();
                return;
            }
            return;
        }
        float B = g0Var.B();
        float A = g0Var.A();
        float J = g0Var.J();
        float w10 = g0Var.w();
        if (g0Var.n() < 1.0f) {
            v0.f fVar = this.f3754p;
            if (fVar == null) {
                fVar = new v0.f();
                this.f3754p = fVar;
            }
            fVar.d(g0Var.n());
            canvas2.saveLayer(B, A, J, w10, fVar.f18105a);
        } else {
            oVar.m();
        }
        oVar.i(B, A);
        oVar.o(this.f3755q.b(g0Var));
        if (g0Var.K() || g0Var.y()) {
            this.f3752m.a(oVar);
        }
        u7.l<? super v0.o, m7.n> lVar = this.f3749j;
        if (lVar != null) {
            lVar.U(oVar);
        }
        oVar.l();
        j(false);
    }

    @Override // l1.z
    public final void d(long j2) {
        int i10 = (int) (j2 >> 32);
        int b5 = b2.h.b(j2);
        long j10 = this.f3757s;
        int i11 = v0.l0.f18124b;
        float f10 = i10;
        g0 g0Var = this.f3758t;
        g0Var.C(Float.intBitsToFloat((int) (j10 >> 32)) * f10);
        float f11 = b5;
        g0Var.H(Float.intBitsToFloat((int) (this.f3757s & 4294967295L)) * f11);
        if (g0Var.E(g0Var.B(), g0Var.A(), g0Var.B() + i10, g0Var.A() + b5)) {
            long v3 = a1.c.v(f10, f11);
            r0 r0Var = this.f3752m;
            if (!u0.f.a(r0Var.f3882d, v3)) {
                r0Var.f3882d = v3;
                r0Var.f3886h = true;
            }
            g0Var.O(r0Var.b());
            if (!this.f3751l && !this.n) {
                this.f3748i.invalidate();
                j(true);
            }
            this.f3755q.c();
        }
    }

    @Override // l1.z
    public final void destroy() {
        g0 g0Var = this.f3758t;
        if (g0Var.N()) {
            g0Var.F();
        }
        this.f3749j = null;
        this.f3750k = null;
        this.n = true;
        j(false);
        AndroidComposeView androidComposeView = this.f3748i;
        androidComposeView.D = true;
        androidComposeView.H(this);
    }

    @Override // l1.z
    public final void e(u7.a aVar, u7.l lVar) {
        v7.g.f(lVar, "drawBlock");
        v7.g.f(aVar, "invalidateParentLayer");
        j(false);
        this.n = false;
        this.f3753o = false;
        this.f3757s = v0.l0.f18123a;
        this.f3749j = lVar;
        this.f3750k = aVar;
    }

    @Override // l1.z
    public final void f(u0.b bVar, boolean z10) {
        g0 g0Var = this.f3758t;
        p0<g0> p0Var = this.f3755q;
        if (z10) {
            float[] a10 = p0Var.a(g0Var);
            if (a10 == null) {
                bVar.f17718a = 0.0f;
                bVar.f17719b = 0.0f;
                bVar.c = 0.0f;
                bVar.f17720d = 0.0f;
                return;
            }
            v0.p.x(a10, bVar);
            return;
        }
        v0.p.x(p0Var.b(g0Var), bVar);
    }

    @Override // l1.z
    public final void g(long j2) {
        g0 g0Var = this.f3758t;
        int B = g0Var.B();
        int A = g0Var.A();
        int i10 = (int) (j2 >> 32);
        int a10 = b2.g.a(j2);
        if (B != i10 || A != a10) {
            g0Var.v(i10 - B);
            g0Var.L(a10 - A);
            int i11 = Build.VERSION.SDK_INT;
            AndroidComposeView androidComposeView = this.f3748i;
            if (i11 >= 26) {
                v1.f3913a.a(androidComposeView);
            } else {
                androidComposeView.invalidate();
            }
            this.f3755q.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // l1.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        v0.z zVar;
        u7.l<? super v0.o, m7.n> lVar;
        boolean z10 = this.f3751l;
        g0 g0Var = this.f3758t;
        if (z10 || !g0Var.N()) {
            j(false);
            if (g0Var.K()) {
                r0 r0Var = this.f3752m;
                if (!(!r0Var.f3887i)) {
                    r0Var.e();
                    zVar = r0Var.f3885g;
                    lVar = this.f3749j;
                    if (lVar == null) {
                        g0Var.x(this.f3756r, zVar, lVar);
                        return;
                    }
                    return;
                }
            }
            zVar = null;
            lVar = this.f3749j;
            if (lVar == null) {
            }
        }
    }

    @Override // l1.z
    public final boolean i(long j2) {
        float b5 = u0.c.b(j2);
        float c = u0.c.c(j2);
        g0 g0Var = this.f3758t;
        if (g0Var.y()) {
            return 0.0f <= b5 && b5 < ((float) g0Var.b()) && 0.0f <= c && c < ((float) g0Var.a());
        } else if (g0Var.K()) {
            return this.f3752m.c(j2);
        } else {
            return true;
        }
    }

    @Override // l1.z
    public final void invalidate() {
        if (this.f3751l || this.n) {
            return;
        }
        this.f3748i.invalidate();
        j(true);
    }

    public final void j(boolean z10) {
        if (z10 != this.f3751l) {
            this.f3751l = z10;
            this.f3748i.F(this, z10);
        }
    }
}
