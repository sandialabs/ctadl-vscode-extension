package g0;

import androidx.compose.runtime.ComposerKt;
import g0.d;

/* loaded from: classes.dex */
public final class r<T> extends o0<T> {

    /* renamed from: b  reason: collision with root package name */
    public final c1<T> f11070b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(c1<T> c1Var, u7.a<? extends T> aVar) {
        super(aVar);
        v7.g.f(c1Var, "policy");
        v7.g.f(aVar, "defaultFactory");
        this.f11070b = c1Var;
    }

    @Override // g0.j
    public final g1 a(Object obj, d dVar) {
        dVar.f(-84026900);
        u7.q<c<?>, z0, t0, m7.n> qVar = ComposerKt.f2737a;
        dVar.f(-492369756);
        Object g10 = dVar.g();
        if (g10 == d.a.f11039a) {
            g10 = a1.c.U0(obj, this.f11070b);
            dVar.q(g10);
        }
        dVar.u();
        g0 g0Var = (g0) g10;
        g0Var.setValue(obj);
        dVar.u();
        return g0Var;
    }
}
