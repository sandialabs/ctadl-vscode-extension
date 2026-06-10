package w0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final double f18247a;

    /* renamed from: b  reason: collision with root package name */
    public final double f18248b;
    public final double c;

    /* renamed from: d  reason: collision with root package name */
    public final double f18249d;

    /* renamed from: e  reason: collision with root package name */
    public final double f18250e;

    /* renamed from: f  reason: collision with root package name */
    public final double f18251f = 0.0d;

    /* renamed from: g  reason: collision with root package name */
    public final double f18252g = 0.0d;

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0093, code lost:
        if ((r6 == 0.0d) != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(double d5, double d10, double d11, double d12, double d13) {
        this.f18247a = d5;
        this.f18248b = d10;
        this.c = d11;
        this.f18249d = d12;
        this.f18250e = d13;
        if (Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(0.0d) || Double.isNaN(0.0d) || Double.isNaN(d5)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d13 < 0.0d || d13 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d13);
        }
        boolean z10 = true;
        if (d13 == 0.0d) {
            if (!(d10 == 0.0d)) {
                if (!(d5 == 0.0d)) {
                }
            }
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d13 >= 1.0d) {
            if (d12 == 0.0d) {
                throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
            }
        }
        int i10 = (d10 > 0.0d ? 1 : (d10 == 0.0d ? 0 : -1));
        if (!(i10 == 0)) {
        }
        if (d12 != 0.0d) {
            z10 = false;
        }
        if (z10) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d12 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (i10 < 0 || d5 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return v7.g.a(Double.valueOf(this.f18247a), Double.valueOf(gVar.f18247a)) && v7.g.a(Double.valueOf(this.f18248b), Double.valueOf(gVar.f18248b)) && v7.g.a(Double.valueOf(this.c), Double.valueOf(gVar.c)) && v7.g.a(Double.valueOf(this.f18249d), Double.valueOf(gVar.f18249d)) && v7.g.a(Double.valueOf(this.f18250e), Double.valueOf(gVar.f18250e)) && v7.g.a(Double.valueOf(this.f18251f), Double.valueOf(gVar.f18251f)) && v7.g.a(Double.valueOf(this.f18252g), Double.valueOf(gVar.f18252g));
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f18247a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f18248b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f18249d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f18250e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f18251f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f18252g);
        return (((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)));
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f18247a + ", a=" + this.f18248b + ", b=" + this.c + ", c=" + this.f18249d + ", d=" + this.f18250e + ", e=" + this.f18251f + ", f=" + this.f18252g + ')';
    }
}
