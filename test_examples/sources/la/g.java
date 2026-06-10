package la;

import ja.y;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* loaded from: classes.dex */
public final class g<E> extends p implements n<E> {

    /* renamed from: l  reason: collision with root package name */
    public final Throwable f15880l;

    public g(Throwable th) {
        this.f15880l = th;
    }

    @Override // la.p
    public final void M() {
    }

    @Override // la.p
    public final Object N() {
        return this;
    }

    @Override // la.p
    public final void P(g<?> gVar) {
    }

    @Override // la.p
    public final kotlinx.coroutines.internal.r Q(LockFreeLinkedListNode.c cVar) {
        kotlinx.coroutines.internal.r rVar = a1.b.K0;
        if (cVar != null) {
            cVar.d();
        }
        return rVar;
    }

    public final Throwable W() {
        Throwable th = this.f15880l;
        return th == null ? new ClosedReceiveChannelException() : th;
    }

    @Override // la.n
    public final kotlinx.coroutines.internal.r c(Object obj) {
        return a1.b.K0;
    }

    @Override // la.n
    public final void h(E e10) {
    }

    @Override // la.n
    public final Object k() {
        return this;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public final String toString() {
        return "Closed@" + y.a(this) + '[' + this.f15880l + ']';
    }
}
