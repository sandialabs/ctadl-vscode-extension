package com.airbnb.epoxy;

/* loaded from: classes.dex */
public final class e0 extends d0 implements c0<l0> {
    public e0() {
    }

    public e0(int i10) {
        super(i10);
    }

    @Override // com.airbnb.epoxy.x, com.airbnb.epoxy.z
    public final void C(l0 l0Var) {
        super.u(l0Var);
    }

    @Override // com.airbnb.epoxy.x
    public final void E(l0 l0Var) {
        super.u(l0Var);
    }

    @Override // com.airbnb.epoxy.c0
    public final void a(Object obj, int i10) {
        l0 l0Var = (l0) obj;
        v("The model was changed between being added to the controller and being bound.", i10);
    }

    @Override // com.airbnb.epoxy.c0
    public final void b(int i10, Object obj) {
        l0 l0Var = (l0) obj;
        v("The model was changed during the bind call.", i10);
    }

    @Override // com.airbnb.epoxy.r
    public final void c(m mVar) {
        mVar.addInternal(this);
        d(mVar);
    }

    @Override // com.airbnb.epoxy.x, com.airbnb.epoxy.r
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof e0) && super.equals(obj)) {
            ((e0) obj).getClass();
            return true;
        }
        return false;
    }

    @Override // com.airbnb.epoxy.x, com.airbnb.epoxy.r
    public final int hashCode() {
        return (((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0;
    }

    @Override // com.airbnb.epoxy.r
    public final r k(long j2) {
        super.k(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final void n(int i10) {
        super.n(i10);
    }

    @Override // com.airbnb.epoxy.r
    public final String toString() {
        return "GroupModel_{}" + super.toString();
    }

    @Override // com.airbnb.epoxy.x, com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final void u(Object obj) {
        super.u((l0) obj);
    }
}
