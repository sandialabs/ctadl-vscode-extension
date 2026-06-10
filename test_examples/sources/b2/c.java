package b2;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: i  reason: collision with root package name */
    public final float f6337i;

    /* renamed from: j  reason: collision with root package name */
    public final float f6338j;

    public c(float f10, float f11) {
        this.f6337i = f10;
        this.f6338j = f11;
    }

    @Override // b2.b
    public final float H(float f10) {
        return getDensity() * f10;
    }

    @Override // b2.b
    public final /* synthetic */ int a0(float f10) {
        return androidx.activity.e.a(f10, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (v7.g.a(Float.valueOf(this.f6337i), Float.valueOf(cVar.f6337i)) && v7.g.a(Float.valueOf(this.f6338j), Float.valueOf(cVar.f6338j))) {
            return true;
        }
        return false;
    }

    @Override // b2.b
    public final /* synthetic */ long g0(long j2) {
        return androidx.activity.e.d(j2, this);
    }

    @Override // b2.b
    public final float getDensity() {
        return this.f6337i;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6338j) + (Float.floatToIntBits(this.f6337i) * 31);
    }

    @Override // b2.b
    public final /* synthetic */ float i0(long j2) {
        return androidx.activity.e.c(j2, this);
    }

    @Override // b2.b
    public final float r0(int i10) {
        return i10 / this.f6337i;
    }

    @Override // b2.b
    public final float t0(float f10) {
        return f10 / this.f6337i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f6337i);
        sb.append(", fontScale=");
        return a4.b.n(sb, this.f6338j, ')');
    }

    @Override // b2.b
    public final float y() {
        return this.f6338j;
    }
}
