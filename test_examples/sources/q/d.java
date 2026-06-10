package q;

import q.b;
import r.s;

/* loaded from: classes.dex */
public final class d implements s {

    /* renamed from: a  reason: collision with root package name */
    public final b f16809a;

    public d(b2.b bVar) {
        this.f16809a = new b(e.f16810a, bVar);
    }

    @Override // r.s
    public final void a() {
    }

    @Override // r.s
    public final long b(float f10) {
        return ((long) (Math.exp(this.f16809a.b(f10) / (c.f16808a - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // r.s
    public final float c(float f10, float f11) {
        b bVar;
        double b5 = this.f16809a.b(f11);
        double d5 = c.f16808a;
        return (Math.signum(f11) * ((float) (Math.exp((d5 / (d5 - 1.0d)) * b5) * bVar.f16804a * bVar.c))) + f10;
    }

    @Override // r.s
    public final float d(float f10, long j2) {
        float f11;
        long j10 = j2 / 1000000;
        b.a a10 = this.f16809a.a(f10);
        long j11 = a10.c;
        if (j11 > 0) {
            f11 = ((float) j10) / ((float) j11);
        } else {
            f11 = 1.0f;
        }
        return (((Math.signum(a10.f16806a) * a.a(f11).f16803b) * a10.f16807b) / ((float) j11)) * 1000.0f;
    }

    @Override // r.s
    public final float e(float f10, float f11, long j2) {
        float f12;
        long j10 = j2 / 1000000;
        b.a a10 = this.f16809a.a(f11);
        long j11 = a10.c;
        if (j11 > 0) {
            f12 = ((float) j10) / ((float) j11);
        } else {
            f12 = 1.0f;
        }
        return (Math.signum(a10.f16806a) * a10.f16807b * a.a(f12).f16802a) + f10;
    }
}
