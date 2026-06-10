package r;

/* loaded from: classes.dex */
public final class v {
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public double f17023d;

    /* renamed from: e  reason: collision with root package name */
    public double f17024e;

    /* renamed from: f  reason: collision with root package name */
    public double f17025f;

    /* renamed from: a  reason: collision with root package name */
    public float f17021a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    public double f17022b = Math.sqrt(50.0d);

    /* renamed from: g  reason: collision with root package name */
    public float f17026g = 1.0f;

    public final long a(float f10, float f11, long j2) {
        boolean z10;
        float f12;
        double cos;
        double d5;
        boolean z11 = false;
        if (!this.c) {
            if (this.f17021a == Float.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                float f13 = this.f17026g;
                double d10 = f13;
                double d11 = d10 * d10;
                if (f13 > 1.0f) {
                    double d12 = this.f17022b;
                    double d13 = d11 - 1;
                    this.f17023d = (Math.sqrt(d13) * d12) + ((-f13) * d12);
                    double d14 = this.f17022b;
                    this.f17024e = ((-this.f17026g) * d14) - (Math.sqrt(d13) * d14);
                } else if (f13 >= 0.0f && f13 < 1.0f) {
                    this.f17025f = Math.sqrt(1 - d11) * this.f17022b;
                }
                this.c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        float f14 = f10 - this.f17021a;
        double d15 = j2 / 1000.0d;
        float f15 = this.f17026g;
        if (f15 > 1.0f) {
            double d16 = f14;
            double d17 = this.f17024e;
            double d18 = f11;
            double d19 = this.f17023d;
            double d20 = d16 - (((d17 * d16) - d18) / (d17 - d19));
            double d21 = ((d16 * d17) - d18) / (d17 - d19);
            d5 = (Math.exp(this.f17023d * d15) * d21) + (Math.exp(d17 * d15) * d20);
            double d22 = this.f17024e;
            double exp = Math.exp(d22 * d15) * d20 * d22;
            double d23 = this.f17023d;
            cos = (Math.exp(d23 * d15) * d21 * d23) + exp;
        } else {
            if (f15 == 1.0f) {
                z11 = true;
            }
            if (z11) {
                double d24 = this.f17022b;
                double d25 = f14;
                double d26 = (d24 * d25) + f11;
                double d27 = (d26 * d15) + d25;
                double exp2 = Math.exp((-d24) * d15) * d27;
                double exp3 = Math.exp((-this.f17022b) * d15) * d27;
                double d28 = this.f17022b;
                cos = (Math.exp((-d28) * d15) * d26) + (exp3 * (-d28));
                d5 = exp2;
            } else {
                double d29 = 1 / this.f17025f;
                double d30 = this.f17022b;
                double d31 = f14;
                double d32 = ((f15 * d30 * d31) + f11) * d29;
                double exp4 = Math.exp((-f15) * d30 * d15) * ((Math.sin(this.f17025f * d15) * d32) + (Math.cos(this.f17025f * d15) * d31));
                double d33 = this.f17022b;
                double d34 = (-d33) * exp4 * this.f17026g;
                double exp5 = Math.exp((-f12) * d33 * d15);
                double d35 = this.f17025f;
                double d36 = this.f17025f;
                cos = (((Math.cos(d36 * d15) * d32 * d36) + (Math.sin(d35 * d15) * (-d35) * d31)) * exp5) + d34;
                d5 = exp4;
            }
        }
        return (Float.floatToIntBits((float) cos) & 4294967295L) | (Float.floatToIntBits((float) (d5 + this.f17021a)) << 32);
    }
}
