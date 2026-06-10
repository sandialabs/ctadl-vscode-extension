package la;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.AbstractChannel;

/* loaded from: classes.dex */
public final class j<E> extends d<E> implements k<E> {
    public j(CoroutineContext coroutineContext, AbstractChannel abstractChannel) {
        super(coroutineContext, abstractChannel);
    }

    @Override // ja.a
    public final void B0(Throwable th, boolean z10) {
        if (this.f15876k.d(th) || z10) {
            return;
        }
        m0.b.v0(this.f12755j, th);
    }

    @Override // ja.a
    public final void C0(m7.n nVar) {
        m7.n nVar2 = nVar;
        this.f15876k.d(null);
    }

    @Override // ja.a, ja.y0, ja.u0
    public final boolean b() {
        return super.b();
    }
}
