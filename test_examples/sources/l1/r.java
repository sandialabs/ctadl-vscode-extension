package l1;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.LayoutDirection;
import j1.b0;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class r extends q implements j1.p {

    /* renamed from: o  reason: collision with root package name */
    public final NodeCoordinator f15760o;

    /* renamed from: p  reason: collision with root package name */
    public final j0.c f15761p;

    /* renamed from: q  reason: collision with root package name */
    public long f15762q;

    /* renamed from: r  reason: collision with root package name */
    public LinkedHashMap f15763r;

    /* renamed from: s  reason: collision with root package name */
    public final j1.n f15764s;

    /* renamed from: t  reason: collision with root package name */
    public j1.r f15765t;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f15766u;

    public r(NodeCoordinator nodeCoordinator, j0.c cVar) {
        v7.g.f(nodeCoordinator, "coordinator");
        v7.g.f(cVar, "lookaheadScope");
        this.f15760o = nodeCoordinator;
        this.f15761p = cVar;
        this.f15762q = b2.g.f6344b;
        this.f15764s = new j1.n(this);
        this.f15766u = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void H0(r rVar, j1.r rVar2) {
        m7.n nVar;
        boolean z10;
        LinkedHashMap linkedHashMap;
        if (rVar2 != null) {
            rVar.getClass();
            rVar.v0(v8.b.f(rVar2.b(), rVar2.a()));
            nVar = m7.n.f16010a;
        } else {
            nVar = null;
        }
        if (nVar == null) {
            rVar.v0(0L);
        }
        if (!v7.g.a(rVar.f15765t, rVar2) && rVar2 != null) {
            LinkedHashMap linkedHashMap2 = rVar.f15763r;
            if (linkedHashMap2 != null && !linkedHashMap2.isEmpty()) {
                z10 = false;
                if ((z10 || (!rVar2.f().isEmpty())) && !v7.g.a(rVar2.f(), rVar.f15763r)) {
                    LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = rVar.f15760o.f3499o.K.f3453l;
                    v7.g.c(lookaheadPassDelegate);
                    lookaheadPassDelegate.f3459s.g();
                    linkedHashMap = rVar.f15763r;
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap();
                        rVar.f15763r = linkedHashMap;
                    }
                    linkedHashMap.clear();
                    linkedHashMap.putAll(rVar2.f());
                }
            }
            z10 = true;
            if (z10) {
            }
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate2 = rVar.f15760o.f3499o.K.f3453l;
            v7.g.c(lookaheadPassDelegate2);
            lookaheadPassDelegate2.f3459s.g();
            linkedHashMap = rVar.f15763r;
            if (linkedHashMap == null) {
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(rVar2.f());
        }
        rVar.f15765t = rVar2;
    }

    @Override // l1.q
    public final boolean A0() {
        return this.f15765t != null;
    }

    @Override // l1.q
    public final LayoutNode B0() {
        return this.f15760o.f3499o;
    }

    @Override // l1.q
    public final j1.r C0() {
        j1.r rVar = this.f15765t;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // l1.q
    public final q D0() {
        NodeCoordinator nodeCoordinator = this.f15760o.f3501q;
        if (nodeCoordinator != null) {
            return nodeCoordinator.f3508x;
        }
        return null;
    }

    @Override // l1.q
    public final long E0() {
        return this.f15762q;
    }

    @Override // l1.q
    public final void G0() {
        s0(this.f15762q, 0.0f, null);
    }

    public void I0() {
        b0.a.C0134a c0134a = b0.a.f12644a;
        int b5 = C0().b();
        LayoutDirection layoutDirection = this.f15760o.f3499o.f3429y;
        j1.h hVar = b0.a.f12646d;
        c0134a.getClass();
        int i10 = b0.a.c;
        LayoutDirection layoutDirection2 = b0.a.f12645b;
        b0.a.c = b5;
        b0.a.f12645b = layoutDirection;
        boolean i11 = b0.a.C0134a.i(c0134a, this);
        C0().g();
        this.n = i11;
        b0.a.c = i10;
        b0.a.f12645b = layoutDirection2;
        b0.a.f12646d = hVar;
    }

    @Override // b2.b
    public final float getDensity() {
        return this.f15760o.getDensity();
    }

    @Override // j1.g
    public final LayoutDirection getLayoutDirection() {
        return this.f15760o.f3499o.f3429y;
    }

    @Override // j1.f
    public final Object n() {
        return this.f15760o.n();
    }

    @Override // j1.b0
    public final void s0(long j2, float f10, u7.l<? super v0.u, m7.n> lVar) {
        boolean z10;
        long j10 = this.f15762q;
        int i10 = b2.g.c;
        if (j10 == j2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f15762q = j2;
            NodeCoordinator nodeCoordinator = this.f15760o;
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = nodeCoordinator.f3499o.K.f3453l;
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate.y0();
            }
            q.F0(nodeCoordinator);
        }
        if (this.f15759m) {
            return;
        }
        I0();
    }

    @Override // b2.b
    public final float y() {
        return this.f15760o.y();
    }

    @Override // l1.q
    public final q y0() {
        NodeCoordinator nodeCoordinator = this.f15760o.f3500p;
        if (nodeCoordinator != null) {
            return nodeCoordinator.f3508x;
        }
        return null;
    }

    @Override // l1.q
    public final j1.h z0() {
        return this.f15764s;
    }
}
