package r;

/* loaded from: classes.dex */
public final class l implements p {
    public final float c;

    /* renamed from: a  reason: collision with root package name */
    public final float f17001a = 0.4f;

    /* renamed from: b  reason: collision with root package name */
    public final float f17002b = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    public final float f17003d = 1.0f;

    public l(float f10) {
        this.c = f10;
        if ((Float.isNaN(0.4f) || Float.isNaN(0.0f) || Float.isNaN(f10) || Float.isNaN(1.0f)) ? false : true) {
            return;
        }
        throw new IllegalArgumentException(("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.4, 0.0, " + f10 + ", 1.0.").toString());
    }

    @Override // r.p
    public final float a(float f10) {
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            float f12 = 1.0f;
            if (f10 < 1.0f) {
                while (true) {
                    float f13 = (f11 + f12) / 2;
                    float f14 = 3;
                    float f15 = 1 - f13;
                    float f16 = f13 * f13 * f13;
                    float f17 = (this.c * f14 * f15 * f13 * f13) + (this.f17001a * f14 * f15 * f15 * f13) + f16;
                    if (Math.abs(f10 - f17) < 0.001f) {
                        return (f14 * this.f17003d * f15 * f13 * f13) + (this.f17002b * f14 * f15 * f15 * f13) + f16;
                    } else if (f17 < f10) {
                        f11 = f13;
                    } else {
                        f12 = f13;
                    }
                }
            }
        }
        return f10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f17001a == lVar.f17001a) {
                if (this.f17002b == lVar.f17002b) {
                    if (this.c == lVar.c) {
                        return (this.f17003d > lVar.f17003d ? 1 : (this.f17003d == lVar.f17003d ? 0 : -1)) == 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f17003d) + androidx.activity.e.e(this.c, androidx.activity.e.e(this.f17002b, Float.floatToIntBits(this.f17001a) * 31, 31), 31);
    }
}
