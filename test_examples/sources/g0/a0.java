package g0;

import ja.k1;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class a0 implements u0 {

    /* renamed from: a  reason: collision with root package name */
    public final u7.p<ja.x, p7.c<? super m7.n>, Object> f11028a;

    /* renamed from: b  reason: collision with root package name */
    public final kotlinx.coroutines.internal.e f11029b;
    public k1 c;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(CoroutineContext coroutineContext, u7.p<? super ja.x, ? super p7.c<? super m7.n>, ? extends Object> pVar) {
        v7.g.f(coroutineContext, "parentCoroutineContext");
        v7.g.f(pVar, "task");
        this.f11028a = pVar;
        this.f11029b = a1.b.g(coroutineContext);
    }

    @Override // g0.u0
    public final void a() {
        k1 k1Var = this.c;
        if (k1Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            k1Var.c(cancellationException);
        }
        this.c = m0.b.M0(this.f11029b, null, null, this.f11028a, 3);
    }

    @Override // g0.u0
    public final void b() {
        k1 k1Var = this.c;
        if (k1Var != null) {
            k1Var.c(null);
        }
        this.c = null;
    }

    @Override // g0.u0
    public final void c() {
        k1 k1Var = this.c;
        if (k1Var != null) {
            k1Var.c(null);
        }
        this.c = null;
    }
}
