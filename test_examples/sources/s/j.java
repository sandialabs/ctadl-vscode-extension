package s;

import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.ui.node.NodeCoordinator;
import j1.v;

/* loaded from: classes.dex */
public final class j implements k1.d, v {

    /* renamed from: i  reason: collision with root package name */
    public u7.l<? super j1.h, m7.n> f17214i;

    /* renamed from: j  reason: collision with root package name */
    public j1.h f17215j;

    @Override // k1.d
    public final void T(k1.g gVar) {
        u7.l<? super j1.h, m7.n> lVar;
        v7.g.f(gVar, "scope");
        u7.l<? super j1.h, m7.n> lVar2 = (u7.l) gVar.i(FocusedBoundsKt.f1501a);
        if (lVar2 == null && (lVar = this.f17214i) != null) {
            lVar.U(null);
        }
        this.f17214i = lVar2;
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    @Override // q0.d
    public final Object h0(Object obj, u7.p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    @Override // j1.v
    public final void r(NodeCoordinator nodeCoordinator) {
        u7.l<? super j1.h, m7.n> lVar;
        this.f17215j = nodeCoordinator;
        if (nodeCoordinator.P()) {
            j1.h hVar = this.f17215j;
            if (hVar != null && hVar.P() && (lVar = this.f17214i) != null) {
                lVar.U(this.f17215j);
                return;
            }
            return;
        }
        u7.l<? super j1.h, m7.n> lVar2 = this.f17214i;
        if (lVar2 != null) {
            lVar2.U(null);
        }
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(u7.l lVar) {
        return a4.b.a(this, lVar);
    }
}
