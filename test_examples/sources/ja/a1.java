package ja;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class a1 extends k1 {

    /* renamed from: k  reason: collision with root package name */
    public final p7.c<m7.n> f12756k;

    public a1(CoroutineContext coroutineContext, u7.p<? super x, ? super p7.c<? super m7.n>, ? extends Object> pVar) {
        super(coroutineContext, false);
        this.f12756k = m0.b.P(this, this, pVar);
    }

    @Override // ja.y0
    public final void t0() {
        try {
            a1.b.z0(m0.b.y0(this.f12756k), m7.n.f16010a, null);
        } catch (Throwable th) {
            t(m0.b.Q(th));
            throw th;
        }
    }
}
