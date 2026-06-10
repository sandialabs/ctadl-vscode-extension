package b6;

/* loaded from: classes.dex */
public final class h extends e {

    /* renamed from: i  reason: collision with root package name */
    public final e f6428i;

    /* renamed from: j  reason: collision with root package name */
    public final float f6429j;

    public h(f fVar, float f10) {
        this.f6428i = fVar;
        this.f6429j = f10;
    }

    @Override // b6.e
    public final boolean a() {
        return this.f6428i.a();
    }

    @Override // b6.e
    public final void b(float f10, float f11, float f12, n nVar) {
        this.f6428i.b(f10, f11 - this.f6429j, f12, nVar);
    }
}
