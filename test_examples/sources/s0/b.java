package s0;

import m7.n;
import u7.l;

/* loaded from: classes.dex */
public final class b implements b2.b {

    /* renamed from: i  reason: collision with root package name */
    public a f17227i = h.f17233i;

    /* renamed from: j  reason: collision with root package name */
    public g f17228j;

    @Override // b2.b
    public final float H(float f10) {
        return getDensity() * f10;
    }

    public final long a() {
        return this.f17227i.a();
    }

    @Override // b2.b
    public final /* synthetic */ int a0(float f10) {
        return androidx.activity.e.a(f10, this);
    }

    public final g b(l<? super x0.c, n> lVar) {
        v7.g.f(lVar, "block");
        g gVar = new g(lVar);
        this.f17228j = gVar;
        return gVar;
    }

    @Override // b2.b
    public final /* synthetic */ long g0(long j2) {
        return androidx.activity.e.d(j2, this);
    }

    @Override // b2.b
    public final float getDensity() {
        return this.f17227i.getDensity().getDensity();
    }

    @Override // b2.b
    public final /* synthetic */ float i0(long j2) {
        return androidx.activity.e.c(j2, this);
    }

    @Override // b2.b
    public final float r0(int i10) {
        return i10 / getDensity();
    }

    @Override // b2.b
    public final float t0(float f10) {
        return f10 / getDensity();
    }

    @Override // b2.b
    public final float y() {
        return this.f17227i.getDensity().y();
    }
}
