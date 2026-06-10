package r;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public double f16999a;

    /* renamed from: b  reason: collision with root package name */
    public double f17000b;

    public k(double d5, double d10) {
        this.f16999a = d5;
        this.f17000b = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return v7.g.a(Double.valueOf(this.f16999a), Double.valueOf(kVar.f16999a)) && v7.g.a(Double.valueOf(this.f17000b), Double.valueOf(kVar.f17000b));
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f16999a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f17000b);
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f16999a + ", _imaginary=" + this.f17000b + ')';
    }
}
