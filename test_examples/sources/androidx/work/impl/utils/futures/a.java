package androidx.work.impl.utils.futures;

import androidx.work.impl.utils.futures.AbstractFuture;

/* loaded from: classes.dex */
public final class a<V> extends AbstractFuture<V> {
    public final boolean i(V v3) {
        if (v3 == null) {
            v3 = (V) AbstractFuture.f6305o;
        }
        if (AbstractFuture.n.b(this, null, v3)) {
            AbstractFuture.c(this);
            return true;
        }
        return false;
    }

    public final boolean j(Throwable th) {
        th.getClass();
        if (AbstractFuture.n.b(this, null, new AbstractFuture.Failure(th))) {
            AbstractFuture.c(this);
            return true;
        }
        return false;
    }

    public final boolean k(m6.a<? extends V> aVar) {
        AbstractFuture.Failure failure;
        aVar.getClass();
        Object obj = this.f6306i;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!AbstractFuture.n.b(this, null, AbstractFuture.f(aVar))) {
                    return false;
                }
                AbstractFuture.c(this);
            } else {
                AbstractFuture.e eVar = new AbstractFuture.e(this, aVar);
                if (AbstractFuture.n.b(this, null, eVar)) {
                    try {
                        aVar.a(eVar, DirectExecutor.f6325i);
                    } catch (Throwable th) {
                        try {
                            failure = new AbstractFuture.Failure(th);
                        } catch (Throwable unused) {
                            failure = AbstractFuture.Failure.f6309b;
                        }
                        AbstractFuture.n.b(this, eVar, failure);
                    }
                } else {
                    obj = this.f6306i;
                }
            }
            return true;
        }
        if (!(obj instanceof AbstractFuture.b)) {
            return false;
        }
        aVar.cancel(((AbstractFuture.b) obj).f6312a);
        return false;
    }
}
