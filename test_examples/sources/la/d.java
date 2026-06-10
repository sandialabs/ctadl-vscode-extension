package la;

import ja.y0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.channels.AbstractChannel;

/* loaded from: classes.dex */
public class d<E> extends ja.a<m7.n> implements c<E> {

    /* renamed from: k  reason: collision with root package name */
    public final c<E> f15876k;

    public d(CoroutineContext coroutineContext, AbstractChannel abstractChannel) {
        super(coroutineContext, true);
        this.f15876k = abstractChannel;
    }

    @Override // la.m
    public final Object E() {
        return this.f15876k.E();
    }

    @Override // la.q
    public final Object F(E e10) {
        return this.f15876k.F(e10);
    }

    @Override // la.q
    public final boolean K() {
        return this.f15876k.K();
    }

    @Override // la.m
    public final Object L(SuspendLambda suspendLambda) {
        return this.f15876k.L(suspendLambda);
    }

    @Override // ja.y0
    public final void W(CancellationException cancellationException) {
        this.f15876k.c(cancellationException);
        V(cancellationException);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    @Override // ja.y0, ja.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(CancellationException cancellationException) {
        boolean z10;
        Object i02 = i0();
        if (!(i02 instanceof ja.s) && (!(i02 instanceof y0.c) || !((y0.c) i02).d())) {
            z10 = false;
            if (!z10) {
                return;
            }
            if (cancellationException == null) {
                cancellationException = new JobCancellationException(Y(), null, this);
            }
            W(cancellationException);
            return;
        }
        z10 = true;
        if (!z10) {
        }
    }

    @Override // la.q
    public final boolean d(Throwable th) {
        return this.f15876k.d(th);
    }

    @Override // la.q
    public final Object e(E e10, p7.c<? super m7.n> cVar) {
        return this.f15876k.e(e10, cVar);
    }

    @Override // la.m
    public final e<E> iterator() {
        return this.f15876k.iterator();
    }

    @Override // la.m
    public final Object k(p7.c<? super f<? extends E>> cVar) {
        return this.f15876k.k(cVar);
    }

    @Override // la.q
    public final void l(u7.l<? super Throwable, m7.n> lVar) {
        this.f15876k.l(lVar);
    }

    @Override // la.m
    public final kotlinx.coroutines.selects.b<f<E>> x() {
        return this.f15876k.x();
    }
}
