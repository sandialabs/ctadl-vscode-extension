package c9;

import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.l;
import kotlin.reflect.jvm.internal.impl.types.r;
import y9.m0;
import y9.n;
import y9.v;

/* loaded from: classes.dex */
public final class d extends y9.i implements y9.f {

    /* renamed from: j  reason: collision with root package name */
    public final v f6570j;

    public d(v vVar) {
        v7.g.f(vVar, "delegate");
        this.f6570j = vVar;
    }

    public static v g1(v vVar) {
        v Y0 = vVar.Y0(false);
        if (!r.h(vVar)) {
            return Y0;
        }
        return new d(Y0);
    }

    @Override // y9.f
    public final m0 K(y9.r rVar) {
        v7.g.f(rVar, "replacement");
        m0 X0 = rVar.X0();
        v7.g.f(X0, "<this>");
        if (!r.h(X0) && !r.g(X0)) {
            return X0;
        }
        if (X0 instanceof v) {
            return g1((v) X0);
        }
        if (X0 instanceof n) {
            n nVar = (n) X0;
            return a1.b.M0(KotlinTypeFactory.c(g1(nVar.f18958j), g1(nVar.f18959k)), a1.b.W(X0));
        }
        throw new IllegalStateException(("Incorrect type: " + X0).toString());
    }

    @Override // y9.i, y9.r
    public final boolean V0() {
        return false;
    }

    @Override // y9.v, y9.m0
    public final m0 a1(l lVar) {
        v7.g.f(lVar, "newAttributes");
        return new d(this.f6570j.a1(lVar));
    }

    @Override // y9.v
    public final v b1(boolean z10) {
        return z10 ? this.f6570j.Y0(true) : this;
    }

    @Override // y9.v
    public final v c1(l lVar) {
        v7.g.f(lVar, "newAttributes");
        return new d(this.f6570j.a1(lVar));
    }

    @Override // y9.i
    public final v d1() {
        return this.f6570j;
    }

    @Override // y9.i
    public final y9.i f1(v vVar) {
        return new d(vVar);
    }

    @Override // y9.f
    public final boolean z0() {
        return true;
    }
}
