package d0;

import g0.g0;
import ja.x;
import s.n;
import u.m;
import v0.r;
import x0.a;
import x0.f;

/* loaded from: classes.dex */
public abstract class g implements n {

    /* renamed from: a  reason: collision with root package name */
    public final j f10365a;

    public g(g0 g0Var, boolean z10) {
        this.f10365a = new j(g0Var, z10);
    }

    public abstract void e(m mVar, x xVar);

    public final void f(x0.f fVar, float f10, long j2) {
        float H;
        v7.g.f(fVar, "$receiver");
        j jVar = this.f10365a;
        jVar.getClass();
        boolean isNaN = Float.isNaN(f10);
        boolean z10 = jVar.f10367a;
        if (isNaN) {
            H = d.a(fVar, z10, fVar.a());
        } else {
            H = fVar.H(f10);
        }
        float f11 = H;
        float floatValue = jVar.c.c().floatValue();
        if (floatValue > 0.0f) {
            long b5 = r.b(j2, floatValue);
            if (z10) {
                float d5 = u0.f.d(fVar.a());
                float b10 = u0.f.b(fVar.a());
                a.b N = fVar.N();
                long a10 = N.a();
                N.b().m();
                N.f18556a.b(0.0f, 0.0f, d5, b10, 1);
                f.a.a(fVar, b5, f11, 0L, 124);
                N.b().l();
                N.c(a10);
                return;
            }
            f.a.a(fVar, b5, f11, 0L, 124);
        }
    }

    public abstract void g(m mVar);
}
