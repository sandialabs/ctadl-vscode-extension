package ja;

/* loaded from: classes.dex */
public final class j1<T, R> extends x0 {

    /* renamed from: m  reason: collision with root package name */
    public final kotlinx.coroutines.selects.c<R> f12779m;
    public final u7.p<T, p7.c<? super R>, Object> n;

    /* JADX WARN: Multi-variable type inference failed */
    public j1(kotlinx.coroutines.selects.c<? super R> cVar, u7.p<? super T, ? super p7.c<? super R>, ? extends Object> pVar) {
        this.f12779m = cVar;
        this.n = pVar;
    }

    @Override // ja.u
    public final void M(Throwable th) {
        kotlinx.coroutines.selects.c<R> cVar = this.f12779m;
        if (cVar.m()) {
            y0 N = N();
            u7.p<T, p7.c<? super R>, Object> pVar = this.n;
            Object i02 = N.i0();
            if (i02 instanceof s) {
                cVar.i(((s) i02).f12801a);
                return;
            }
            Object T1 = a1.c.T1(i02);
            kotlinx.coroutines.selects.a e10 = cVar.e();
            try {
                a1.b.z0(m0.b.y0(m0.b.P(T1, e10, pVar)), m7.n.f16010a, null);
            } catch (Throwable th2) {
                e10.t(m0.b.Q(th2));
                throw th2;
            }
        }
    }

    @Override // u7.l
    public final /* bridge */ /* synthetic */ m7.n U(Throwable th) {
        M(th);
        return m7.n.f16010a;
    }
}
