package h1;

import v7.g;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static final d f11347e;

    /* renamed from: a  reason: collision with root package name */
    public final long f11348a;

    /* renamed from: b  reason: collision with root package name */
    public final float f11349b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11350d;

    static {
        long j2 = u0.c.f17721b;
        f11347e = new d(j2, 1.0f, 0L, j2);
    }

    public d(long j2, float f10, long j10, long j11) {
        this.f11348a = j2;
        this.f11349b = f10;
        this.c = j10;
        this.f11350d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return u0.c.a(this.f11348a, dVar.f11348a) && g.a(Float.valueOf(this.f11349b), Float.valueOf(dVar.f11349b)) && this.c == dVar.c && u0.c.a(this.f11350d, dVar.f11350d);
        }
        return false;
    }

    public final int hashCode() {
        int e10 = androidx.activity.e.e(this.f11349b, u0.c.d(this.f11348a) * 31, 31);
        long j2 = this.c;
        return u0.c.d(this.f11350d) + ((e10 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        return "VelocityEstimate(pixelsPerSecond=" + ((Object) u0.c.h(this.f11348a)) + ", confidence=" + this.f11349b + ", durationMillis=" + this.c + ", offset=" + ((Object) u0.c.h(this.f11350d)) + ')';
    }
}
