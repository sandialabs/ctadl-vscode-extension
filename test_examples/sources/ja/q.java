package ja;

/* loaded from: classes.dex */
public final class q<T> extends y0 implements p<T>, kotlinx.coroutines.selects.b<T> {
    public q(u0 u0Var) {
        super(true);
        l0(u0Var);
    }

    @Override // ja.p
    public final boolean q(Throwable th) {
        return n0(new s(th, false));
    }

    @Override // kotlinx.coroutines.selects.b
    public final <R> void s(kotlinx.coroutines.selects.c<? super R> cVar, u7.p<? super T, ? super p7.c<? super R>, ? extends Object> pVar) {
        v0(cVar, pVar);
    }

    @Override // ja.p
    public final boolean u(T t10) {
        return n0(t10);
    }
}
