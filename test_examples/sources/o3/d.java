package o3;

import o3.b;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public double f16267a;

    /* renamed from: b  reason: collision with root package name */
    public double f16268b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public double f16269d;

    /* renamed from: e  reason: collision with root package name */
    public double f16270e;

    /* renamed from: f  reason: collision with root package name */
    public double f16271f;

    /* renamed from: g  reason: collision with root package name */
    public double f16272g;

    /* renamed from: h  reason: collision with root package name */
    public double f16273h;

    /* renamed from: i  reason: collision with root package name */
    public double f16274i;

    /* renamed from: j  reason: collision with root package name */
    public final b.i f16275j;

    public d() {
        this.f16267a = Math.sqrt(1500.0d);
        this.f16268b = 0.5d;
        this.c = false;
        this.f16274i = Double.MAX_VALUE;
        this.f16275j = new b.i();
    }

    public d(float f10) {
        this.f16267a = Math.sqrt(1500.0d);
        this.f16268b = 0.5d;
        this.c = false;
        this.f16275j = new b.i();
        this.f16274i = f10;
    }

    public final void a(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f16268b = f10;
        this.c = false;
    }

    public final void b(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f16267a = Math.sqrt(f10);
        this.c = false;
    }

    public final b.i c(double d5, double d10, long j2) {
        double cos;
        double d11;
        if (!this.c) {
            if (this.f16274i != Double.MAX_VALUE) {
                double d12 = this.f16268b;
                if (d12 > 1.0d) {
                    double d13 = this.f16267a;
                    this.f16271f = (Math.sqrt((d12 * d12) - 1.0d) * d13) + ((-d12) * d13);
                    double d14 = this.f16268b;
                    double d15 = this.f16267a;
                    this.f16272g = ((-d14) * d15) - (Math.sqrt((d14 * d14) - 1.0d) * d15);
                } else if (d12 >= 0.0d && d12 < 1.0d) {
                    this.f16273h = Math.sqrt(1.0d - (d12 * d12)) * this.f16267a;
                }
                this.c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d16 = j2 / 1000.0d;
        double d17 = d5 - this.f16274i;
        double d18 = this.f16268b;
        if (d18 > 1.0d) {
            double d19 = this.f16272g;
            double d20 = this.f16271f;
            double d21 = d17 - (((d19 * d17) - d10) / (d19 - d20));
            double d22 = ((d17 * d19) - d10) / (d19 - d20);
            d11 = (Math.pow(2.718281828459045d, this.f16271f * d16) * d22) + (Math.pow(2.718281828459045d, d19 * d16) * d21);
            double d23 = this.f16272g;
            double pow = Math.pow(2.718281828459045d, d23 * d16) * d21 * d23;
            double d24 = this.f16271f;
            cos = (Math.pow(2.718281828459045d, d24 * d16) * d22 * d24) + pow;
        } else if (d18 == 1.0d) {
            double d25 = this.f16267a;
            double d26 = (d25 * d17) + d10;
            double d27 = (d26 * d16) + d17;
            double pow2 = Math.pow(2.718281828459045d, (-d25) * d16) * d27;
            double pow3 = Math.pow(2.718281828459045d, (-this.f16267a) * d16) * d27;
            double d28 = this.f16267a;
            cos = (Math.pow(2.718281828459045d, (-d28) * d16) * d26) + (pow3 * (-d28));
            d11 = pow2;
        } else {
            double d29 = 1.0d / this.f16273h;
            double d30 = this.f16267a;
            double d31 = ((d18 * d30 * d17) + d10) * d29;
            double sin = ((Math.sin(this.f16273h * d16) * d31) + (Math.cos(this.f16273h * d16) * d17)) * Math.pow(2.718281828459045d, (-d18) * d30 * d16);
            double d32 = this.f16267a;
            double d33 = this.f16268b;
            double d34 = (-d32) * sin * d33;
            double pow4 = Math.pow(2.718281828459045d, (-d33) * d32 * d16);
            double d35 = this.f16273h;
            double d36 = (-d35) * d17;
            double d37 = this.f16273h;
            cos = (((Math.cos(d37 * d16) * d31 * d37) + (Math.sin(d35 * d16) * d36)) * pow4) + d34;
            d11 = sin;
        }
        b.i iVar = this.f16275j;
        iVar.f16262a = (float) (d11 + this.f16274i);
        iVar.f16263b = (float) cos;
        return iVar;
    }
}
