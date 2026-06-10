package r;

import r.i;

/* loaded from: classes.dex */
public final class h0<V extends i> implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f0<V> f16995a;

    public h0(float f10, float f11, V v3) {
        j d0Var;
        if (v3 != null) {
            d0Var = new c0(f10, f11, v3);
        } else {
            d0Var = new d0(f10, f11);
        }
        this.f16995a = new f0<>(d0Var);
    }

    @Override // r.b0
    public final void a() {
        this.f16995a.getClass();
    }

    @Override // r.b0
    public final V b(long j2, V v3, V v10, V v11) {
        v7.g.f(v3, "initialValue");
        v7.g.f(v10, "targetValue");
        v7.g.f(v11, "initialVelocity");
        return this.f16995a.b(j2, v3, v10, v11);
    }

    @Override // r.b0
    public final V c(long j2, V v3, V v10, V v11) {
        v7.g.f(v3, "initialValue");
        v7.g.f(v10, "targetValue");
        v7.g.f(v11, "initialVelocity");
        return this.f16995a.c(j2, v3, v10, v11);
    }

    @Override // r.b0
    public final long d(V v3, V v10, V v11) {
        v7.g.f(v3, "initialValue");
        v7.g.f(v10, "targetValue");
        return this.f16995a.d(v3, v10, v11);
    }

    @Override // r.b0
    public final V e(V v3, V v10, V v11) {
        v7.g.f(v3, "initialValue");
        v7.g.f(v10, "targetValue");
        return this.f16995a.e(v3, v10, v11);
    }
}
