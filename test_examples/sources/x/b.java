package x;

import androidx.compose.foundation.relocation.BringIntoViewKt;
import androidx.compose.ui.node.NodeCoordinator;
import j1.h;
import j1.x;
import u7.l;
import u7.p;

/* loaded from: classes.dex */
public abstract class b implements k1.d, x {

    /* renamed from: i  reason: collision with root package name */
    public final c f18544i;

    /* renamed from: j  reason: collision with root package name */
    public c f18545j;

    /* renamed from: k  reason: collision with root package name */
    public h f18546k;

    public b(a aVar) {
        v7.g.f(aVar, "defaultParent");
        this.f18544i = aVar;
    }

    @Override // k1.d
    public final void T(k1.g gVar) {
        v7.g.f(gVar, "scope");
        this.f18545j = (c) gVar.i(BringIntoViewKt.f2029a);
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    @Override // j1.x
    public final void o(NodeCoordinator nodeCoordinator) {
        v7.g.f(nodeCoordinator, "coordinates");
        this.f18546k = nodeCoordinator;
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }
}
