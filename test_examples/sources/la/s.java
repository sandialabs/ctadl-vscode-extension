package la;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* loaded from: classes.dex */
public final class s<E> extends r<E> {
    public final u7.l<E, m7.n> n;

    public s(Object obj, ja.j jVar, u7.l lVar) {
        super(obj, jVar);
        this.n = lVar;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public final boolean I() {
        if (super.I()) {
            S();
            return true;
        }
        return false;
    }

    @Override // la.p
    public final void S() {
        CoroutineContext f10 = this.f15884m.f();
        UndeliveredElementException b5 = OnUndeliveredElementKt.b(this.n, this.f15883l, null);
        if (b5 != null) {
            m0.b.v0(f10, b5);
        }
    }
}
