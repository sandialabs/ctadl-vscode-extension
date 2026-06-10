package w0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final float f18253a;

    /* renamed from: b  reason: collision with root package name */
    public final float f18254b;

    public h(float f10, float f11) {
        this.f18253a = f10;
        this.f18254b = f11;
    }

    public final float[] a() {
        float f10 = this.f18253a;
        float f11 = this.f18254b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return v7.g.a(Float.valueOf(this.f18253a), Float.valueOf(hVar.f18253a)) && v7.g.a(Float.valueOf(this.f18254b), Float.valueOf(hVar.f18254b));
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18254b) + (Float.floatToIntBits(this.f18253a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f18253a);
        sb.append(", y=");
        return a4.b.n(sb, this.f18254b, ')');
    }
}
