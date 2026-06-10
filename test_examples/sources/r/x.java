package r;

import r.i;

/* loaded from: classes.dex */
public final class x<T, V extends i> implements a<T, V> {

    /* renamed from: a  reason: collision with root package name */
    public final b0<V> f17029a;

    /* renamed from: b  reason: collision with root package name */
    public final z<T, V> f17030b;
    public final T c;

    /* renamed from: d  reason: collision with root package name */
    public final T f17031d;

    /* renamed from: e  reason: collision with root package name */
    public final V f17032e;

    /* renamed from: f  reason: collision with root package name */
    public final V f17033f;

    /* renamed from: g  reason: collision with root package name */
    public final V f17034g;

    /* renamed from: h  reason: collision with root package name */
    public final long f17035h;

    /* renamed from: i  reason: collision with root package name */
    public final V f17036i;

    public x(d<T> dVar, z<T, V> zVar, T t10, T t11, V v3) {
        V v10;
        v7.g.f(dVar, "animationSpec");
        v7.g.f(zVar, "typeConverter");
        b0<V> a10 = dVar.a(zVar);
        v7.g.f(a10, "animationSpec");
        this.f17029a = a10;
        this.f17030b = zVar;
        this.c = t10;
        this.f17031d = t11;
        V U = zVar.a().U(t10);
        this.f17032e = U;
        V U2 = zVar.a().U(t11);
        this.f17033f = U2;
        if (v3 != null) {
            v10 = (V) a1.c.m0(v3);
        } else {
            v10 = (V) a1.c.W0(zVar.a().U(t10));
        }
        this.f17034g = v10;
        this.f17035h = a10.d(U, U2, v10);
        this.f17036i = a10.e(U, U2, v10);
    }

    @Override // r.a
    public final boolean a() {
        this.f17029a.a();
        return false;
    }

    @Override // r.a
    public final T b(long j2) {
        if (a4.b.b(this, j2)) {
            return this.f17031d;
        }
        V b5 = this.f17029a.b(j2, this.f17032e, this.f17033f, this.f17034g);
        int b10 = b5.b();
        for (int i10 = 0; i10 < b10; i10++) {
            if (!(!Float.isNaN(b5.a(i10)))) {
                throw new IllegalStateException(("AnimationVector cannot contain a NaN. " + b5 + ". Animation: " + this + ", playTimeNanos: " + j2).toString());
            }
        }
        return this.f17030b.b().U(b5);
    }

    @Override // r.a
    public final long c() {
        return this.f17035h;
    }

    @Override // r.a
    public final z<T, V> d() {
        return this.f17030b;
    }

    @Override // r.a
    public final T e() {
        return this.f17031d;
    }

    @Override // r.a
    public final V f(long j2) {
        return !a4.b.b(this, j2) ? this.f17029a.c(j2, this.f17032e, this.f17033f, this.f17034g) : this.f17036i;
    }

    @Override // r.a
    public final /* synthetic */ boolean g(long j2) {
        return a4.b.b(this, j2);
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.c + " -> " + this.f17031d + ",initial velocity: " + this.f17034g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.f17029a;
    }
}
