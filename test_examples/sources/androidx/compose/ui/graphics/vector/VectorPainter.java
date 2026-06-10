package androidx.compose.ui.graphics.vector;

import a1.c;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.LayoutDirection;
import g0.d;
import g0.i;
import g0.k0;
import g0.r0;
import g0.t0;
import g0.z0;
import m7.n;
import u0.f;
import u7.q;
import u7.r;
import v0.s;
import v7.g;
import x0.a;
import y0.b;

/* loaded from: classes.dex */
public final class VectorPainter extends b {

    /* renamed from: f  reason: collision with root package name */
    public final k0 f3226f = c.V0(new f(f.f17736b));

    /* renamed from: g  reason: collision with root package name */
    public final k0 f3227g = c.V0(Boolean.FALSE);

    /* renamed from: h  reason: collision with root package name */
    public final VectorComponent f3228h;

    /* renamed from: i  reason: collision with root package name */
    public g0.f f3229i;

    /* renamed from: j  reason: collision with root package name */
    public final k0 f3230j;

    /* renamed from: k  reason: collision with root package name */
    public float f3231k;

    /* renamed from: l  reason: collision with root package name */
    public s f3232l;

    public VectorPainter() {
        VectorComponent vectorComponent = new VectorComponent();
        vectorComponent.f3164e = new VectorPainter$vector$1$1(this);
        this.f3228h = vectorComponent;
        this.f3230j = c.V0(Boolean.TRUE);
        this.f3231k = 1.0f;
    }

    @Override // y0.b
    public final boolean a(float f10) {
        this.f3231k = f10;
        return true;
    }

    @Override // y0.b
    public final boolean b(s sVar) {
        this.f3232l = sVar;
        return true;
    }

    @Override // y0.b
    public final long c() {
        return ((f) this.f3226f.getValue()).f17738a;
    }

    @Override // y0.b
    public final void d(x0.f fVar) {
        g.f(fVar, "<this>");
        s sVar = this.f3232l;
        VectorComponent vectorComponent = this.f3228h;
        if (sVar == null) {
            sVar = (s) vectorComponent.f3165f.getValue();
        }
        if (((Boolean) this.f3227g.getValue()).booleanValue() && fVar.getLayoutDirection() == LayoutDirection.Rtl) {
            long e02 = fVar.e0();
            a.b N = fVar.N();
            long a10 = N.a();
            N.b().m();
            N.f18556a.d(e02);
            vectorComponent.e(fVar, this.f3231k, sVar);
            N.b().l();
            N.c(a10);
        } else {
            vectorComponent.e(fVar, this.f3231k, sVar);
        }
        k0 k0Var = this.f3230j;
        if (((Boolean) k0Var.getValue()).booleanValue()) {
            k0Var.setValue(Boolean.FALSE);
        }
    }

    public final void e(String str, float f10, float f11, r<? super Float, ? super Float, ? super d, ? super Integer, n> rVar, d dVar, int i10) {
        boolean z10;
        g.f(str, "name");
        g.f(rVar, "content");
        ComposerImpl p10 = dVar.p(1264894527);
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        VectorComponent vectorComponent = this.f3228h;
        vectorComponent.getClass();
        z0.b bVar = vectorComponent.f3162b;
        bVar.getClass();
        bVar.f18985i = str;
        bVar.c();
        boolean z11 = false;
        if (vectorComponent.f3166g == f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            vectorComponent.f3166g = f10;
            vectorComponent.c = true;
            vectorComponent.f3164e.k0();
        }
        if (vectorComponent.f3167h == f11) {
            z11 = true;
        }
        if (!z11) {
            vectorComponent.f3167h = f11;
            vectorComponent.c = true;
            vectorComponent.f3164e.k0();
        }
        p10.f(-1165786124);
        ComposerImpl.b F = p10.F();
        p10.u();
        g0.f fVar = this.f3229i;
        if (fVar == null || fVar.s()) {
            fVar = i.a(new z0.g(bVar), F);
        }
        this.f3229i = fVar;
        fVar.j(c.j0(-1916507005, new VectorPainter$composeVector$1(rVar, this), true));
        g0.s.a(fVar, new VectorPainter$RenderVector$2(fVar), p10);
        r0 T = p10.T();
        if (T != null) {
            T.f11073d = new VectorPainter$RenderVector$3(this, str, f10, f11, rVar, i10);
        }
    }
}
