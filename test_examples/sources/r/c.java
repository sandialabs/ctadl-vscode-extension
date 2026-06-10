package r;

import g0.k0;
import r.i;

/* loaded from: classes.dex */
public final class c<T, V extends i> {

    /* renamed from: a  reason: collision with root package name */
    public final z<T, V> f16964a;

    /* renamed from: b  reason: collision with root package name */
    public final T f16965b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final u7.a<m7.n> f16966d;

    /* renamed from: e  reason: collision with root package name */
    public final k0 f16967e;

    /* renamed from: f  reason: collision with root package name */
    public V f16968f;

    /* renamed from: g  reason: collision with root package name */
    public long f16969g;

    /* renamed from: h  reason: collision with root package name */
    public long f16970h;

    /* renamed from: i  reason: collision with root package name */
    public final k0 f16971i;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Object obj, z zVar, i iVar, long j2, Object obj2, long j10, u7.a aVar) {
        v7.g.f(zVar, "typeConverter");
        v7.g.f(iVar, "initialVelocityVector");
        this.f16964a = zVar;
        this.f16965b = obj2;
        this.c = j10;
        this.f16966d = aVar;
        this.f16967e = a1.c.V0(obj);
        this.f16968f = (V) a1.c.m0(iVar);
        this.f16969g = j2;
        this.f16970h = Long.MIN_VALUE;
        this.f16971i = a1.c.V0(Boolean.TRUE);
    }

    public final T a() {
        return this.f16967e.getValue();
    }
}
