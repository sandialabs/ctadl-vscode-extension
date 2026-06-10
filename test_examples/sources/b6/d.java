package b6;

/* loaded from: classes.dex */
public final class d extends m0.b {

    /* renamed from: m  reason: collision with root package name */
    public final float f6389m;

    public d() {
        super(0);
        this.f6389m = -1.0f;
    }

    @Override // m0.b
    public final void k0(float f10, float f11, n nVar) {
        nVar.e(0.0f, f11 * f10, 180.0f, 90.0f);
        double d5 = f11;
        double d10 = f10;
        nVar.d((float) (Math.sin(Math.toRadians(90.0f)) * d5 * d10), (float) (Math.sin(Math.toRadians(0.0f)) * d5 * d10));
    }
}
