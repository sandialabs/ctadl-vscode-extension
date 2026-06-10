package r;

import r.i;

/* loaded from: classes.dex */
public final class i0<V extends i> implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f16996a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16997b;
    public final f0<V> c;

    public i0(int i10, int i11, p pVar) {
        v7.g.f(pVar, "easing");
        this.f16996a = i10;
        this.f16997b = i11;
        this.c = new f0<>(new t(i10, i11, pVar));
    }

    @Override // r.b0
    public final /* synthetic */ void a() {
    }

    @Override // r.b0
    public final V b(long j2, V v3, V v10, V v11) {
        v7.g.f(v3, "initialValue");
        v7.g.f(v10, "targetValue");
        v7.g.f(v11, "initialVelocity");
        return this.c.b(j2, v3, v10, v11);
    }

    @Override // r.b0
    public final V c(long j2, V v3, V v10, V v11) {
        v7.g.f(v3, "initialValue");
        v7.g.f(v10, "targetValue");
        v7.g.f(v11, "initialVelocity");
        return this.c.c(j2, v3, v10, v11);
    }

    @Override // r.b0
    public final long d(i iVar, i iVar2, i iVar3) {
        v7.g.f(iVar, "initialValue");
        v7.g.f(iVar2, "targetValue");
        return (this.f16997b + this.f16996a) * 1000000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r.b0
    public final i e(i iVar, i iVar2, i iVar3) {
        v7.g.f(iVar, "initialValue");
        v7.g.f(iVar2, "targetValue");
        return c(d(iVar, iVar2, iVar3), iVar, iVar2, iVar3);
    }
}
