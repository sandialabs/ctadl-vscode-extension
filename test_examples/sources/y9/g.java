package y9;

import kotlin.reflect.jvm.internal.impl.types.m;

/* loaded from: classes.dex */
public final class g extends i implements f, ba.c {

    /* renamed from: j  reason: collision with root package name */
    public final v f18947j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f18948k;

    /* loaded from: classes.dex */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static g a(m0 m0Var, boolean z10) {
            boolean z11;
            o8.j0 j0Var;
            boolean z12;
            v7.g.f(m0Var, "type");
            if (m0Var instanceof g) {
                return (g) m0Var;
            }
            boolean z13 = true;
            if (!(m0Var.U0() instanceof z9.c) && !(m0Var.U0().c() instanceof l8.i0) && !(m0Var instanceof z9.b) && !(m0Var instanceof b0)) {
                z11 = false;
                if (z11) {
                    z13 = false;
                } else {
                    if (!(m0Var instanceof b0)) {
                        l8.d c = m0Var.U0().c();
                        if (c instanceof o8.j0) {
                            j0Var = (o8.j0) c;
                        } else {
                            j0Var = null;
                        }
                        if (j0Var != null && !j0Var.f16436u) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            if (!z10 || !(m0Var.U0().c() instanceof l8.i0)) {
                                z13 = true ^ kotlin.reflect.jvm.internal.impl.types.a.a(kotlin.reflect.jvm.internal.impl.types.checker.a.a(false, true, kotlin.reflect.jvm.internal.impl.types.checker.h.f15004a, null, null, 24), a1.b.q0(m0Var), m.b.C0169b.f15055a);
                            }
                        }
                    }
                    z13 = kotlin.reflect.jvm.internal.impl.types.r.g(m0Var);
                }
                if (z13) {
                    return null;
                }
                if (m0Var instanceof n) {
                    n nVar = (n) m0Var;
                    v7.g.a(nVar.f18958j.U0(), nVar.f18959k.U0());
                }
                return new g(a1.b.q0(m0Var).Y0(false), z10);
            }
            z11 = true;
            if (z11) {
            }
            if (z13) {
            }
        }
    }

    public g(v vVar, boolean z10) {
        this.f18947j = vVar;
        this.f18948k = z10;
    }

    @Override // y9.f
    public final m0 K(r rVar) {
        v7.g.f(rVar, "replacement");
        return y.a(rVar.X0(), this.f18948k);
    }

    @Override // y9.i, y9.r
    public final boolean V0() {
        return false;
    }

    @Override // y9.v
    public final v b1(boolean z10) {
        return z10 ? this.f18947j.Y0(z10) : this;
    }

    @Override // y9.v
    public final v c1(kotlin.reflect.jvm.internal.impl.types.l lVar) {
        v7.g.f(lVar, "newAttributes");
        return new g(this.f18947j.a1(lVar), this.f18948k);
    }

    @Override // y9.i
    public final v d1() {
        return this.f18947j;
    }

    @Override // y9.i
    public final i f1(v vVar) {
        return new g(vVar, this.f18948k);
    }

    @Override // y9.v
    public final String toString() {
        return this.f18947j + " & Any";
    }

    @Override // y9.f
    public final boolean z0() {
        v vVar = this.f18947j;
        if (!(vVar.U0() instanceof z9.c) && !(vVar.U0().c() instanceof l8.i0)) {
            return false;
        }
        return true;
    }
}
