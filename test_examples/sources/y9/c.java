package y9;

/* loaded from: classes.dex */
public final class c extends c0<c> {

    /* renamed from: a  reason: collision with root package name */
    public final m8.e f18943a;

    public c(m8.e eVar) {
        v7.g.f(eVar, "annotations");
        this.f18943a = eVar;
    }

    @Override // y9.c0
    public final c a(c0 c0Var) {
        c cVar = (c) c0Var;
        if (cVar == null) {
            return this;
        }
        return new c(m0.b.J(this.f18943a, cVar.f18943a));
    }

    @Override // y9.c0
    public final c8.b<? extends c> b() {
        return v7.i.a(c.class);
    }

    @Override // y9.c0
    public final c c(c0 c0Var) {
        if (v7.g.a((c) c0Var, this)) {
            return this;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return v7.g.a(((c) obj).f18943a, this.f18943a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18943a.hashCode();
    }
}
