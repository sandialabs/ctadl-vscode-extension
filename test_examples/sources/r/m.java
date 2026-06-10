package r;

import r.i;

/* loaded from: classes.dex */
public final class m<T, V extends i> implements a<T, V> {

    /* renamed from: a  reason: collision with root package name */
    public final e0<V> f17004a;

    /* renamed from: b  reason: collision with root package name */
    public final z<T, V> f17005b;
    public final T c;

    /* renamed from: d  reason: collision with root package name */
    public final V f17006d;

    /* renamed from: e  reason: collision with root package name */
    public final V f17007e;

    /* renamed from: f  reason: collision with root package name */
    public final V f17008f;

    /* renamed from: g  reason: collision with root package name */
    public final T f17009g;

    /* renamed from: h  reason: collision with root package name */
    public final long f17010h;

    public m(n<T> nVar, z<T, V> zVar, T t10, V v3) {
        v7.g.f(nVar, "animationSpec");
        v7.g.f(zVar, "typeConverter");
        v7.g.f(v3, "initialVelocityVector");
        g0 a10 = nVar.a(zVar);
        v7.g.f(a10, "animationSpec");
        this.f17004a = a10;
        this.f17005b = zVar;
        this.c = t10;
        V U = zVar.a().U(t10);
        this.f17006d = U;
        this.f17007e = (V) a1.c.m0(v3);
        this.f17009g = zVar.b().U((V) a10.e(U, v3));
        long d5 = a10.d(U, v3);
        this.f17010h = d5;
        V v10 = (V) a1.c.m0(a10.b(d5, U, v3));
        this.f17008f = v10;
        int b5 = v10.b();
        for (int i10 = 0; i10 < b5; i10++) {
            V v11 = this.f17008f;
            v11.e(i10, a1.c.b0(v11.a(i10), -this.f17004a.a(), this.f17004a.a()));
        }
    }

    @Override // r.a
    public final boolean a() {
        return false;
    }

    @Override // r.a
    public final T b(long j2) {
        if (a4.b.b(this, j2)) {
            return this.f17009g;
        }
        return this.f17005b.b().U(this.f17004a.c(j2, this.f17006d, this.f17007e));
    }

    @Override // r.a
    public final long c() {
        return this.f17010h;
    }

    @Override // r.a
    public final z<T, V> d() {
        return this.f17005b;
    }

    @Override // r.a
    public final T e() {
        return this.f17009g;
    }

    @Override // r.a
    public final V f(long j2) {
        if (a4.b.b(this, j2)) {
            return this.f17008f;
        }
        return this.f17004a.b(j2, this.f17006d, this.f17007e);
    }

    @Override // r.a
    public final /* synthetic */ boolean g(long j2) {
        return a4.b.b(this, j2);
    }
}
