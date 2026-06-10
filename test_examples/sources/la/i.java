package la;

import java.util.ArrayList;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* loaded from: classes.dex */
public final class i<E> extends AbstractChannel<E> {
    public i(u7.l<? super E, m7.n> lVar) {
        super(lVar);
    }

    @Override // kotlinx.coroutines.channels.a
    public final boolean i() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.a
    public final boolean j() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.a
    public final Object m(E e10) {
        n nVar;
        do {
            Object m10 = super.m(e10);
            kotlinx.coroutines.internal.r rVar = a1.c.P;
            if (m10 == rVar) {
                return rVar;
            }
            if (m10 == a1.c.Q) {
                kotlinx.coroutines.internal.h hVar = this.f15201j;
                a.C0172a c0172a = new a.C0172a(e10);
                while (true) {
                    LockFreeLinkedListNode F = hVar.F();
                    if (F instanceof n) {
                        nVar = (n) F;
                        break;
                    } else if (F.x(c0172a, hVar)) {
                        nVar = null;
                        break;
                    }
                }
                if (nVar == null) {
                    return rVar;
                }
            } else if (m10 instanceof g) {
                return m10;
            } else {
                throw new IllegalStateException(("Invalid offerInternal result " + m10).toString());
            }
        } while (!(nVar instanceof g));
        return nVar;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    public final boolean q() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    public final boolean r() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    public final void u(Object obj, g<?> gVar) {
        UndeliveredElementException undeliveredElementException = null;
        if (obj != null) {
            boolean z10 = obj instanceof ArrayList;
            u7.l<E, m7.n> lVar = this.f15200i;
            if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                UndeliveredElementException undeliveredElementException2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    p pVar = (p) arrayList.get(size);
                    if (pVar instanceof a.C0172a) {
                        undeliveredElementException2 = lVar != null ? OnUndeliveredElementKt.b(lVar, ((a.C0172a) pVar).f15202l, undeliveredElementException2) : null;
                    } else {
                        pVar.P(gVar);
                    }
                }
                undeliveredElementException = undeliveredElementException2;
            } else {
                p pVar2 = (p) obj;
                if (!(pVar2 instanceof a.C0172a)) {
                    pVar2.P(gVar);
                } else if (lVar != null) {
                    undeliveredElementException = OnUndeliveredElementKt.b(lVar, ((a.C0172a) pVar2).f15202l, null);
                }
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }
}
