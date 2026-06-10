package ja;

/* loaded from: classes.dex */
public final class l extends v0 {

    /* renamed from: m  reason: collision with root package name */
    public final j<?> f12783m;

    public l(j<?> jVar) {
        this.f12783m = jVar;
    }

    @Override // ja.u
    public final void M(Throwable th) {
        boolean l2;
        y0 N = N();
        j<?> jVar = this.f12783m;
        Throwable q10 = jVar.q(N);
        if (!jVar.y()) {
            l2 = false;
        } else {
            l2 = ((kotlinx.coroutines.internal.f) jVar.f12776l).l(q10);
        }
        if (!l2) {
            jVar.B(q10);
            if (!jVar.y()) {
                jVar.m();
            }
        }
    }

    @Override // u7.l
    public final /* bridge */ /* synthetic */ m7.n U(Throwable th) {
        M(th);
        return m7.n.f16010a;
    }
}
