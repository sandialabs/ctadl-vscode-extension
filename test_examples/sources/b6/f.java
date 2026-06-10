package b6;

/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: i  reason: collision with root package name */
    public final float f6390i;

    public f(float f10) {
        this.f6390i = f10 - 0.001f;
    }

    @Override // b6.e
    public final void b(float f10, float f11, float f12, n nVar) {
        double d5 = this.f6390i;
        float sqrt = (float) ((Math.sqrt(2.0d) * d5) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(d5, 2.0d) - Math.pow(sqrt, 2.0d));
        nVar.e(f11 - sqrt, ((float) (-((Math.sqrt(2.0d) * d5) - d5))) + sqrt2, 270.0f, 0.0f);
        nVar.d(f11, (float) (-((Math.sqrt(2.0d) * d5) - d5)));
        nVar.d(f11 + sqrt, ((float) (-((Math.sqrt(2.0d) * d5) - d5))) + sqrt2);
    }
}
