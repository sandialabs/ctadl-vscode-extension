package androidx.compose.material.ripple;

import d0.c;
import d0.d;
import d0.g;
import g0.g0;
import g0.g1;
import g0.u0;
import ja.x;
import java.util.Iterator;
import java.util.Map;
import m7.n;
import p0.o;
import p0.s;
import p0.t;
import u.m;
import u0.f;
import v0.r;
import x0.a;
import x0.f;

/* loaded from: classes.dex */
public final class CommonRippleIndicationInstance extends g implements u0 {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2131b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final g1<r> f2132d;

    /* renamed from: e  reason: collision with root package name */
    public final g1<c> f2133e;

    /* renamed from: f  reason: collision with root package name */
    public final o<m, RippleAnimation> f2134f;

    public CommonRippleIndicationInstance() {
        throw null;
    }

    public CommonRippleIndicationInstance(boolean z10, float f10, g0 g0Var, g0 g0Var2) {
        super(g0Var2, z10);
        this.f2131b = z10;
        this.c = f10;
        this.f2132d = g0Var;
        this.f2133e = g0Var2;
        this.f2134f = new o<>();
    }

    @Override // g0.u0
    public final void a() {
    }

    @Override // g0.u0
    public final void b() {
        this.f2134f.clear();
    }

    @Override // g0.u0
    public final void c() {
        this.f2134f.clear();
    }

    @Override // s.n
    public final void d(x0.c cVar) {
        boolean z10;
        float floatValue;
        float H;
        v7.g.f(cVar, "<this>");
        long j2 = this.f2132d.getValue().f18135a;
        cVar.o0();
        f(cVar, this.c, j2);
        Iterator it = this.f2134f.f16613j.iterator();
        while (((t) it).hasNext()) {
            RippleAnimation rippleAnimation = (RippleAnimation) ((Map.Entry) ((s) it).next()).getValue();
            float f10 = this.f2133e.getValue().f10351d;
            if (f10 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                long b5 = r.b(j2, f10);
                rippleAnimation.getClass();
                if (rippleAnimation.f2145d == null) {
                    long a10 = cVar.a();
                    float f11 = d.f10352a;
                    rippleAnimation.f2145d = Float.valueOf(Math.max(f.d(a10), f.b(a10)) * 0.3f);
                }
                Float f12 = rippleAnimation.f2146e;
                boolean z11 = rippleAnimation.c;
                if (f12 == null) {
                    float f13 = rippleAnimation.f2144b;
                    if (Float.isNaN(f13)) {
                        H = d.a(cVar, z11, cVar.a());
                    } else {
                        H = cVar.H(f13);
                    }
                    rippleAnimation.f2146e = Float.valueOf(H);
                }
                if (rippleAnimation.f2143a == null) {
                    rippleAnimation.f2143a = new u0.c(cVar.e0());
                }
                if (rippleAnimation.f2147f == null) {
                    rippleAnimation.f2147f = new u0.c(a1.c.s(f.d(cVar.a()) / 2.0f, f.b(cVar.a()) / 2.0f));
                }
                if (((Boolean) rippleAnimation.f2153l.getValue()).booleanValue() && !((Boolean) rippleAnimation.f2152k.getValue()).booleanValue()) {
                    floatValue = 1.0f;
                } else {
                    floatValue = rippleAnimation.f2148g.c().floatValue();
                }
                Float f14 = rippleAnimation.f2145d;
                v7.g.c(f14);
                float floatValue2 = f14.floatValue();
                Float f15 = rippleAnimation.f2146e;
                v7.g.c(f15);
                float y10 = v8.b.y(floatValue2, f15.floatValue(), rippleAnimation.f2149h.c().floatValue());
                u0.c cVar2 = rippleAnimation.f2143a;
                v7.g.c(cVar2);
                float b10 = u0.c.b(cVar2.f17724a);
                u0.c cVar3 = rippleAnimation.f2147f;
                v7.g.c(cVar3);
                float b11 = u0.c.b(cVar3.f17724a);
                androidx.compose.animation.core.a<Float, r.f> aVar = rippleAnimation.f2150i;
                float y11 = v8.b.y(b10, b11, aVar.c().floatValue());
                u0.c cVar4 = rippleAnimation.f2143a;
                v7.g.c(cVar4);
                float c = u0.c.c(cVar4.f17724a);
                u0.c cVar5 = rippleAnimation.f2147f;
                v7.g.c(cVar5);
                long s10 = a1.c.s(y11, v8.b.y(c, u0.c.c(cVar5.f17724a), aVar.c().floatValue()));
                long b12 = r.b(b5, r.d(b5) * floatValue);
                if (z11) {
                    float d5 = f.d(cVar.a());
                    float b13 = f.b(cVar.a());
                    a.b N = cVar.N();
                    long a11 = N.a();
                    N.b().m();
                    N.f18556a.b(0.0f, 0.0f, d5, b13, 1);
                    f.a.a(cVar, b12, y10, s10, 120);
                    N.b().l();
                    N.c(a11);
                } else {
                    f.a.a(cVar, b12, y10, s10, 120);
                }
            }
        }
    }

    @Override // d0.g
    public final void e(m mVar, x xVar) {
        u0.c cVar;
        v7.g.f(mVar, "interaction");
        v7.g.f(xVar, "scope");
        o<m, RippleAnimation> oVar = this.f2134f;
        Iterator it = oVar.f16613j.iterator();
        while (it.hasNext()) {
            RippleAnimation rippleAnimation = (RippleAnimation) ((Map.Entry) it.next()).getValue();
            rippleAnimation.f2153l.setValue(Boolean.TRUE);
            rippleAnimation.f2151j.n0(n.f16010a);
        }
        boolean z10 = this.f2131b;
        if (z10) {
            cVar = new u0.c(mVar.f17714a);
        } else {
            cVar = null;
        }
        RippleAnimation rippleAnimation2 = new RippleAnimation(cVar, this.c, z10);
        oVar.put(mVar, rippleAnimation2);
        m0.b.M0(xVar, null, null, new CommonRippleIndicationInstance$addRipple$2(rippleAnimation2, this, mVar, null), 3);
    }

    @Override // d0.g
    public final void g(m mVar) {
        v7.g.f(mVar, "interaction");
        RippleAnimation rippleAnimation = this.f2134f.get(mVar);
        if (rippleAnimation != null) {
            rippleAnimation.f2153l.setValue(Boolean.TRUE);
            rippleAnimation.f2151j.n0(n.f16010a);
        }
    }
}
