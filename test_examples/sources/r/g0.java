package r;

import r.i;

/* loaded from: classes.dex */
public final class g0<V extends i> implements e0<V> {

    /* renamed from: a  reason: collision with root package name */
    public final s f16987a;

    /* renamed from: b  reason: collision with root package name */
    public V f16988b;
    public V c;

    /* renamed from: d  reason: collision with root package name */
    public V f16989d;

    /* renamed from: e  reason: collision with root package name */
    public final float f16990e;

    public g0(s sVar) {
        v7.g.f(sVar, "floatDecaySpec");
        this.f16987a = sVar;
        sVar.a();
        this.f16990e = 0.0f;
    }

    @Override // r.e0
    public final float a() {
        return this.f16990e;
    }

    @Override // r.e0
    public final V b(long j2, V v3, V v10) {
        v7.g.f(v3, "initialValue");
        v7.g.f(v10, "initialVelocity");
        if (this.c == null) {
            this.c = (V) a1.c.W0(v3);
        }
        V v11 = this.c;
        if (v11 == null) {
            v7.g.l("velocityVector");
            throw null;
        }
        int b5 = v11.b();
        for (int i10 = 0; i10 < b5; i10++) {
            V v12 = this.c;
            if (v12 == null) {
                v7.g.l("velocityVector");
                throw null;
            }
            v3.a(i10);
            v12.e(i10, this.f16987a.d(v10.a(i10), j2));
        }
        V v13 = this.c;
        if (v13 != null) {
            return v13;
        }
        v7.g.l("velocityVector");
        throw null;
    }

    @Override // r.e0
    public final V c(long j2, V v3, V v10) {
        v7.g.f(v3, "initialValue");
        v7.g.f(v10, "initialVelocity");
        if (this.f16988b == null) {
            this.f16988b = (V) a1.c.W0(v3);
        }
        V v11 = this.f16988b;
        if (v11 == null) {
            v7.g.l("valueVector");
            throw null;
        }
        int b5 = v11.b();
        for (int i10 = 0; i10 < b5; i10++) {
            V v12 = this.f16988b;
            if (v12 == null) {
                v7.g.l("valueVector");
                throw null;
            }
            v12.e(i10, this.f16987a.e(v3.a(i10), v10.a(i10), j2));
        }
        V v13 = this.f16988b;
        if (v13 != null) {
            return v13;
        }
        v7.g.l("valueVector");
        throw null;
    }

    public final long d(V v3, V v10) {
        v7.g.f(v3, "initialValue");
        v7.g.f(v10, "initialVelocity");
        if (this.c == null) {
            this.c = (V) a1.c.W0(v3);
        }
        V v11 = this.c;
        if (v11 == null) {
            v7.g.l("velocityVector");
            throw null;
        }
        int b5 = v11.b();
        long j2 = 0;
        for (int i10 = 0; i10 < b5; i10++) {
            v3.a(i10);
            j2 = Math.max(j2, this.f16987a.b(v10.a(i10)));
        }
        return j2;
    }

    public final V e(V v3, V v10) {
        v7.g.f(v3, "initialValue");
        v7.g.f(v10, "initialVelocity");
        if (this.f16989d == null) {
            this.f16989d = (V) a1.c.W0(v3);
        }
        V v11 = this.f16989d;
        if (v11 == null) {
            v7.g.l("targetVector");
            throw null;
        }
        int b5 = v11.b();
        for (int i10 = 0; i10 < b5; i10++) {
            V v12 = this.f16989d;
            if (v12 == null) {
                v7.g.l("targetVector");
                throw null;
            }
            v12.e(i10, this.f16987a.c(v3.a(i10), v10.a(i10)));
        }
        V v13 = this.f16989d;
        if (v13 != null) {
            return v13;
        }
        v7.g.l("targetVector");
        throw null;
    }
}
