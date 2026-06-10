package g0;

/* loaded from: classes.dex */
public final class o implements u0 {

    /* renamed from: a  reason: collision with root package name */
    public final u7.l<q, p> f11066a;

    /* renamed from: b  reason: collision with root package name */
    public p f11067b;

    /* JADX WARN: Multi-variable type inference failed */
    public o(u7.l<? super q, ? extends p> lVar) {
        v7.g.f(lVar, "effect");
        this.f11066a = lVar;
    }

    @Override // g0.u0
    public final void a() {
        this.f11067b = this.f11066a.U(s.f11077a);
    }

    @Override // g0.u0
    public final void b() {
    }

    @Override // g0.u0
    public final void c() {
        p pVar = this.f11067b;
        if (pVar != null) {
            pVar.a();
        }
        this.f11067b = null;
    }
}
