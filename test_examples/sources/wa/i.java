package wa;

/* loaded from: classes.dex */
public final class i extends f {
    public final va.a c;

    /* renamed from: d  reason: collision with root package name */
    public int f18508d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, va.a aVar) {
        super(mVar);
        v7.g.f(aVar, "json");
        this.c = aVar;
    }

    @Override // wa.f
    public final void a() {
        this.f18507b = true;
        this.f18508d++;
    }

    @Override // wa.f
    public final void b() {
        this.f18507b = false;
        g("\n");
        int i10 = this.f18508d;
        for (int i11 = 0; i11 < i10; i11++) {
            g(this.c.f18191a.f18214g);
        }
    }

    @Override // wa.f
    public final void j() {
        d(' ');
    }

    @Override // wa.f
    public final void k() {
        this.f18508d--;
    }
}
