package ja;

/* loaded from: classes.dex */
public final class n extends v0 implements m {

    /* renamed from: m  reason: collision with root package name */
    public final o f12785m;

    public n(y0 y0Var) {
        this.f12785m = y0Var;
    }

    @Override // ja.u
    public final void M(Throwable th) {
        this.f12785m.i(N());
    }

    @Override // u7.l
    public final /* bridge */ /* synthetic */ m7.n U(Throwable th) {
        M(th);
        return m7.n.f16010a;
    }

    @Override // ja.m
    public final u0 getParent() {
        return N();
    }

    @Override // ja.m
    public final boolean p(Throwable th) {
        return N().Z(th);
    }
}
