package q;

import v7.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final float f16804a;

    /* renamed from: b  reason: collision with root package name */
    public final b2.b f16805b;
    public final float c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final float f16806a;

        /* renamed from: b  reason: collision with root package name */
        public final float f16807b;
        public final long c;

        public a(float f10, float f11, long j2) {
            this.f16806a = f10;
            this.f16807b = f11;
            this.c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return g.a(Float.valueOf(this.f16806a), Float.valueOf(aVar.f16806a)) && g.a(Float.valueOf(this.f16807b), Float.valueOf(aVar.f16807b)) && this.c == aVar.c;
            }
            return false;
        }

        public final int hashCode() {
            int e10 = androidx.activity.e.e(this.f16807b, Float.floatToIntBits(this.f16806a) * 31, 31);
            long j2 = this.c;
            return e10 + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            return "FlingInfo(initialVelocity=" + this.f16806a + ", distance=" + this.f16807b + ", duration=" + this.c + ')';
        }
    }

    public b(float f10, b2.b bVar) {
        this.f16804a = f10;
        this.f16805b = bVar;
        float density = bVar.getDensity();
        float f11 = c.f16808a;
        this.c = density * 386.0878f * 160.0f * 0.84f;
    }

    public final a a(float f10) {
        double b5 = b(f10);
        double d5 = c.f16808a;
        double d10 = d5 - 1.0d;
        return new a(f10, (float) (Math.exp((d5 / d10) * b5) * this.f16804a * this.c), (long) (Math.exp(b5 / d10) * 1000.0d));
    }

    public final double b(float f10) {
        float[] fArr = q.a.f16801a;
        return Math.log((Math.abs(f10) * 0.35f) / (this.f16804a * this.c));
    }
}
