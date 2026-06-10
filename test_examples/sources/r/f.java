package r;

/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: a  reason: collision with root package name */
    public float f16979a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16980b = 1;

    public f(float f10) {
        this.f16979a = f10;
    }

    @Override // r.i
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f16979a;
        }
        return 0.0f;
    }

    @Override // r.i
    public final int b() {
        return this.f16980b;
    }

    @Override // r.i
    public final i c() {
        return new f(0.0f);
    }

    @Override // r.i
    public final void d() {
        this.f16979a = 0.0f;
    }

    @Override // r.i
    public final void e(int i10, float f10) {
        if (i10 == 0) {
            this.f16979a = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return (((f) obj).f16979a > this.f16979a ? 1 : (((f) obj).f16979a == this.f16979a ? 0 : -1)) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f16979a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f16979a;
    }
}
