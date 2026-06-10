package h5;

import b6.n;

/* loaded from: classes.dex */
public final class f extends b6.e implements Cloneable {

    /* renamed from: i  reason: collision with root package name */
    public float f11447i;

    /* renamed from: j  reason: collision with root package name */
    public float f11448j;

    /* renamed from: k  reason: collision with root package name */
    public float f11449k;

    /* renamed from: l  reason: collision with root package name */
    public float f11450l;

    /* renamed from: m  reason: collision with root package name */
    public float f11451m;
    public float n = -1.0f;

    public f(float f10, float f11, float f12) {
        this.f11448j = f10;
        this.f11447i = f11;
        if (f12 >= 0.0f) {
            this.f11450l = f12;
            this.f11451m = 0.0f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    @Override // b6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(float f10, float f11, float f12, n nVar) {
        boolean z10;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21 = this.f11449k;
        if (f21 == 0.0f) {
            nVar.d(f10, 0.0f);
            return;
        }
        float f22 = ((this.f11448j * 2.0f) + f21) / 2.0f;
        float f23 = f12 * this.f11447i;
        float f24 = f11 + this.f11451m;
        float f25 = a4.b.f(1.0f, f12, f22, this.f11450l * f12);
        if (f25 / f22 >= 1.0f) {
            nVar.d(f10, 0.0f);
            return;
        }
        float f26 = this.n;
        float f27 = f26 * f12;
        if (f26 != -1.0f && Math.abs((f26 * 2.0f) - f21) >= 0.1f) {
            z10 = false;
            if (z10) {
                f13 = 1.75f;
                f14 = 0.0f;
            } else {
                f13 = 0.0f;
                f14 = f25;
            }
            float f28 = f22 + f23;
            float f29 = f14 + f23;
            float sqrt = (float) Math.sqrt((f28 * f28) - (f29 * f29));
            float f30 = f24 - sqrt;
            float f31 = f24 + sqrt;
            float degrees = (float) Math.toDegrees(Math.atan(sqrt / f29));
            float f32 = (90.0f - degrees) + f13;
            nVar.d(f30, 0.0f);
            float f33 = f23 * 2.0f;
            nVar.a(f30 - f23, 0.0f, f30 + f23, f33, 270.0f, degrees);
            if (z10) {
                float f34 = this.f11448j;
                float f35 = f27 * 2.0f;
                float f36 = f24 - f22;
                float f37 = f27 + f34;
                nVar.a(f36, -f37, f36 + f34 + f35, f37, 180.0f - f32, ((f32 * 2.0f) - 180.0f) / 2.0f);
                float f38 = f24 + f22;
                float f39 = this.f11448j;
                nVar.d(f38 - ((f39 / 2.0f) + f27), f39 + f27);
                float f40 = this.f11448j;
                f15 = f38 - (f35 + f40);
                float f41 = f27 + f40;
                f16 = -f41;
                f17 = f38;
                f18 = f41;
                f19 = f32 - 90.0f;
                f20 = 90.0f;
            } else {
                f15 = f24 - f22;
                f16 = (-f22) - f14;
                f20 = 180.0f - f32;
                f18 = f22 - f14;
                f17 = f24 + f22;
                f19 = (f32 * 2.0f) - 180.0f;
            }
            nVar.a(f15, f16, f17, f18, f20, f19);
            nVar.a(f31 - f23, 0.0f, f31 + f23, f33, 270.0f - degrees, degrees);
            nVar.d(f10, 0.0f);
        }
        z10 = true;
        if (z10) {
        }
        float f282 = f22 + f23;
        float f292 = f14 + f23;
        float sqrt2 = (float) Math.sqrt((f282 * f282) - (f292 * f292));
        float f302 = f24 - sqrt2;
        float f312 = f24 + sqrt2;
        float degrees2 = (float) Math.toDegrees(Math.atan(sqrt2 / f292));
        float f322 = (90.0f - degrees2) + f13;
        nVar.d(f302, 0.0f);
        float f332 = f23 * 2.0f;
        nVar.a(f302 - f23, 0.0f, f302 + f23, f332, 270.0f, degrees2);
        if (z10) {
        }
        nVar.a(f15, f16, f17, f18, f20, f19);
        nVar.a(f312 - f23, 0.0f, f312 + f23, f332, 270.0f - degrees2, degrees2);
        nVar.d(f10, 0.0f);
    }
}
