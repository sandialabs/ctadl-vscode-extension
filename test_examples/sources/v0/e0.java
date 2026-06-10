package v0;

/* loaded from: classes.dex */
public final class e0 implements u {

    /* renamed from: i  reason: collision with root package name */
    public float f18090i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f18091j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    public float f18092k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    public float f18093l;

    /* renamed from: m  reason: collision with root package name */
    public float f18094m;
    public float n;

    /* renamed from: o  reason: collision with root package name */
    public long f18095o;

    /* renamed from: p  reason: collision with root package name */
    public long f18096p;

    /* renamed from: q  reason: collision with root package name */
    public float f18097q;

    /* renamed from: r  reason: collision with root package name */
    public float f18098r;

    /* renamed from: s  reason: collision with root package name */
    public float f18099s;

    /* renamed from: t  reason: collision with root package name */
    public float f18100t;

    /* renamed from: u  reason: collision with root package name */
    public long f18101u;

    /* renamed from: v  reason: collision with root package name */
    public h0 f18102v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f18103w;

    /* renamed from: x  reason: collision with root package name */
    public b2.b f18104x;

    public e0() {
        long j2 = v.f18139a;
        this.f18095o = j2;
        this.f18096p = j2;
        this.f18100t = 8.0f;
        this.f18101u = l0.f18123a;
        this.f18102v = c0.f18087a;
        this.f18104x = new b2.c(1.0f, 1.0f);
    }

    @Override // v0.u
    public final void G(h0 h0Var) {
        v7.g.f(h0Var, "<set-?>");
        this.f18102v = h0Var;
    }

    @Override // b2.b
    public final float H(float f10) {
        return getDensity() * f10;
    }

    @Override // v0.u
    public final void I(long j2) {
        this.f18095o = j2;
    }

    @Override // v0.u
    public final void W(boolean z10) {
        this.f18103w = z10;
    }

    @Override // b2.b
    public final /* synthetic */ int a0(float f10) {
        return androidx.activity.e.a(f10, this);
    }

    @Override // v0.u
    public final void b0(long j2) {
        this.f18101u = j2;
    }

    @Override // v0.u
    public final void c(float f10) {
        this.f18098r = f10;
    }

    @Override // v0.u
    public final void c0(long j2) {
        this.f18096p = j2;
    }

    @Override // v0.u
    public final void d(float f10) {
        this.f18092k = f10;
    }

    @Override // v0.u
    public final void e() {
    }

    @Override // v0.u
    public final void g(float f10) {
        this.f18099s = f10;
    }

    @Override // b2.b
    public final /* synthetic */ long g0(long j2) {
        return androidx.activity.e.d(j2, this);
    }

    @Override // b2.b
    public final float getDensity() {
        return this.f18104x.getDensity();
    }

    @Override // v0.u
    public final void h(float f10) {
        this.f18094m = f10;
    }

    @Override // v0.u
    public final void i(float f10) {
        this.f18090i = f10;
    }

    @Override // b2.b
    public final /* synthetic */ float i0(long j2) {
        return androidx.activity.e.c(j2, this);
    }

    @Override // v0.u
    public final void k(float f10) {
        this.f18093l = f10;
    }

    @Override // v0.u
    public final void m(float f10) {
        this.f18091j = f10;
    }

    @Override // v0.u
    public final void q(float f10) {
        this.f18100t = f10;
    }

    @Override // b2.b
    public final float r0(int i10) {
        return i10 / getDensity();
    }

    @Override // b2.b
    public final float t0(float f10) {
        return f10 / getDensity();
    }

    @Override // v0.u
    public final void u(float f10) {
        this.f18097q = f10;
    }

    @Override // b2.b
    public final float y() {
        return this.f18104x.y();
    }

    @Override // v0.u
    public final void z(float f10) {
        this.n = f10;
    }
}
