package r;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: a  reason: collision with root package name */
    public float f16985a;

    /* renamed from: b  reason: collision with root package name */
    public float f16986b;
    public final int c = 2;

    public g(float f10, float f11) {
        this.f16985a = f10;
        this.f16986b = f11;
    }

    @Override // r.i
    public final float a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return 0.0f;
            }
            return this.f16986b;
        }
        return this.f16985a;
    }

    @Override // r.i
    public final int b() {
        return this.c;
    }

    @Override // r.i
    public final i c() {
        return new g(0.0f, 0.0f);
    }

    @Override // r.i
    public final void d() {
        this.f16985a = 0.0f;
        this.f16986b = 0.0f;
    }

    @Override // r.i
    public final void e(int i10, float f10) {
        if (i10 == 0) {
            this.f16985a = f10;
        } else if (i10 != 1) {
        } else {
            this.f16986b = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (gVar.f16985a == this.f16985a) {
                return (gVar.f16986b > this.f16986b ? 1 : (gVar.f16986b == this.f16986b ? 0 : -1)) == 0;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f16986b) + (Float.floatToIntBits(this.f16985a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f16985a + ", v2 = " + this.f16986b;
    }
}
