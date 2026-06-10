package j1;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;

/* loaded from: classes.dex */
public final class w extends o0 implements v {

    /* renamed from: j  reason: collision with root package name */
    public final u7.l<h, m7.n> f12665j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(u7.l<? super h, m7.n> lVar, u7.l<? super n0, m7.n> lVar2) {
        super(lVar2);
        v7.g.f(lVar2, "inspectorInfo");
        this.f12665j = lVar;
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return v7.g.a(this.f12665j, ((w) obj).f12665j);
        }
        return false;
    }

    @Override // q0.d
    public final Object h0(Object obj, u7.p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return this.f12665j.hashCode();
    }

    @Override // j1.v
    public final void r(NodeCoordinator nodeCoordinator) {
        this.f12665j.U(nodeCoordinator);
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(u7.l lVar) {
        return a4.b.a(this, lVar);
    }
}
