package la;

import ja.y;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* loaded from: classes.dex */
public class r<E> extends p {

    /* renamed from: l  reason: collision with root package name */
    public final E f15883l;

    /* renamed from: m  reason: collision with root package name */
    public final ja.i<m7.n> f15884m;

    /* JADX WARN: Multi-variable type inference failed */
    public r(Object obj, ja.j jVar) {
        this.f15883l = obj;
        this.f15884m = jVar;
    }

    @Override // la.p
    public final void M() {
        this.f15884m.r();
    }

    @Override // la.p
    public final E N() {
        return this.f15883l;
    }

    @Override // la.p
    public final void P(g<?> gVar) {
        Throwable th = gVar.f15880l;
        if (th == null) {
            th = new ClosedSendChannelException("Channel was closed");
        }
        this.f15884m.t(m0.b.Q(th));
    }

    @Override // la.p
    public final kotlinx.coroutines.internal.r Q(LockFreeLinkedListNode.c cVar) {
        if (this.f15884m.n(m7.n.f16010a, cVar != null ? cVar.c : null) == null) {
            return null;
        }
        if (cVar != null) {
            cVar.d();
        }
        return a1.b.K0;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public final String toString() {
        return getClass().getSimpleName() + '@' + y.a(this) + '(' + this.f15883l + ')';
    }
}
