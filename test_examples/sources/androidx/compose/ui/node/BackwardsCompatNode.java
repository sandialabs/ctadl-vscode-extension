package androidx.compose.ui.node;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.LayoutDirection;
import g1.u;
import j1.a0;
import j1.n;
import j1.o;
import j1.r;
import j1.t;
import j1.x;
import j1.y;
import java.util.HashSet;
import k1.c;
import k1.e;
import k1.f;
import kotlin.Pair;
import l1.b0;
import l1.c0;
import l1.d0;
import l1.e0;
import l1.g;
import l1.h0;
import l1.j;
import l1.k;
import l1.l;
import l1.v;
import q0.d;
import t0.h;
import v0.p;

/* loaded from: classes.dex */
public final class BackwardsCompatNode extends d.c implements k, g, l1.d, h0, e0, e, k1.g, d0, j, l1.e, c0, s0.a {

    /* renamed from: p  reason: collision with root package name */
    public d.b f3381p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3382q;

    /* renamed from: r  reason: collision with root package name */
    public h f3383r;

    /* renamed from: s  reason: collision with root package name */
    public k1.a f3384s;

    /* renamed from: t  reason: collision with root package name */
    public final HashSet<c<?>> f3385t;

    /* renamed from: u  reason: collision with root package name */
    public j1.h f3386u;

    /* loaded from: classes.dex */
    public static final class a implements b0.a {
        public a() {
        }

        @Override // l1.b0.a
        public final void a() {
            BackwardsCompatNode backwardsCompatNode = BackwardsCompatNode.this;
            if (backwardsCompatNode.f3386u == null) {
                backwardsCompatNode.o(p.D(backwardsCompatNode, 128));
            }
        }
    }

    public BackwardsCompatNode(d.b bVar) {
        v7.g.f(bVar, "element");
        this.f16826j = m0.b.A(bVar);
        this.f3381p = bVar;
        this.f3382q = true;
        this.f3385t = new HashSet<>();
    }

    public final void A(f<?> fVar) {
        v7.g.f(fVar, "element");
        k1.a aVar = this.f3384s;
        if (aVar != null && aVar.r0(fVar.getKey())) {
            aVar.f12866i = fVar;
            ModifierLocalManager modifierLocalManager = p.F(this).getModifierLocalManager();
            k1.h<?> key = fVar.getKey();
            modifierLocalManager.getClass();
            v7.g.f(key, "key");
            modifierLocalManager.c.b(new Pair(this, key));
            modifierLocalManager.a();
            return;
        }
        this.f3384s = new k1.a(fVar);
        if (p.E(this).J.f15780d.f16830o) {
            ModifierLocalManager modifierLocalManager2 = p.F(this).getModifierLocalManager();
            k1.h<?> key2 = fVar.getKey();
            modifierLocalManager2.getClass();
            v7.g.f(key2, "key");
            modifierLocalManager2.f3368b.b(new Pair(this, key2));
            modifierLocalManager2.a();
        }
    }

    @Override // s0.a
    public final long a() {
        return v8.b.M(p.D(this, 128).f12642k);
    }

    @Override // l1.j
    public final void b(long j2) {
        d.b bVar = this.f3381p;
        if (bVar instanceof y) {
            ((y) bVar).b(j2);
        }
    }

    @Override // k1.e
    public final androidx.datastore.preferences.protobuf.k c() {
        k1.a aVar = this.f3384s;
        if (aVar == null) {
            return k1.b.f12867i;
        }
        return aVar;
    }

    @Override // l1.e0
    public final void d(g1.k kVar, PointerEventPass pointerEventPass, long j2) {
        d.b bVar = this.f3381p;
        v7.g.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((u) bVar).q0().w(kVar, pointerEventPass, j2);
    }

    @Override // l1.d
    public final void f(x0.c cVar) {
        v7.g.f(cVar, "<this>");
        d.b bVar = this.f3381p;
        v7.g.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        s0.f fVar = (s0.f) bVar;
        if (this.f3382q && (bVar instanceof s0.d)) {
            d.b bVar2 = this.f3381p;
            if (bVar2 instanceof s0.d) {
                p.F(this).getSnapshotObserver().b(this, BackwardsCompatNodeKt.f3395b, new BackwardsCompatNode$updateDrawCache$1(bVar2, this));
            }
            this.f3382q = false;
        }
        fVar.f(cVar);
    }

    @Override // l1.j
    public final void g(n nVar) {
        v7.g.f(nVar, "coordinates");
        d.b bVar = this.f3381p;
        if (!(bVar instanceof o)) {
            return;
        }
        ((o) bVar).getClass();
        throw null;
    }

    @Override // s0.a
    public final b2.b getDensity() {
        return p.E(this).f3427w;
    }

    @Override // s0.a
    public final LayoutDirection getLayoutDirection() {
        return p.E(this).f3429y;
    }

    @Override // l1.e0
    public final void h() {
        d.b bVar = this.f3381p;
        v7.g.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((u) bVar).q0().getClass();
    }

    @Override // k1.g
    public final Object i(k1.h hVar) {
        v vVar;
        v7.g.f(hVar, "<this>");
        this.f3385t.add(hVar);
        d.c cVar = this.f16825i;
        if (cVar.f16830o) {
            d.c cVar2 = cVar.f16828l;
            LayoutNode E = p.E(this);
            while (E != null) {
                if ((E.J.f15781e.f16827k & 32) != 0) {
                    while (cVar2 != null) {
                        if ((cVar2.f16826j & 32) != 0 && (cVar2 instanceof e)) {
                            e eVar = (e) cVar2;
                            if (eVar.c().r0(hVar)) {
                                return eVar.c().v0(hVar);
                            }
                        }
                        cVar2 = cVar2.f16828l;
                    }
                }
                E = E.p();
                if (E != null && (vVar = E.J) != null) {
                    cVar2 = vVar.f15780d;
                } else {
                    cVar2 = null;
                }
            }
            return hVar.f12868a.k0();
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // l1.d0
    public final Object j(b2.b bVar, Object obj) {
        v7.g.f(bVar, "<this>");
        d.b bVar2 = this.f3381p;
        v7.g.d(bVar2, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((a0) bVar2).j(bVar, obj);
    }

    @Override // l1.e0
    public final void k() {
        d.b bVar = this.f3381p;
        v7.g.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((u) bVar).q0().s();
    }

    @Override // l1.d
    public final void l() {
        this.f3382q = true;
        p.E(this).u();
    }

    @Override // l1.e0
    public final void m() {
        d.b bVar = this.f3381p;
        v7.g.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((u) bVar).q0().getClass();
    }

    @Override // l1.k
    public final r n(t tVar, j1.p pVar, long j2) {
        v7.g.f(tVar, "$this$measure");
        d.b bVar = this.f3381p;
        v7.g.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((j1.k) bVar).n(tVar, pVar, j2);
    }

    @Override // l1.j
    public final void o(NodeCoordinator nodeCoordinator) {
        v7.g.f(nodeCoordinator, "coordinates");
        this.f3386u = nodeCoordinator;
        d.b bVar = this.f3381p;
        if (bVar instanceof x) {
            ((x) bVar).o(nodeCoordinator);
        }
    }

    @Override // q0.d.c
    public final void q() {
        u(true);
    }

    @Override // l1.e
    public final void r(NodeCoordinator nodeCoordinator) {
        d.b bVar = this.f3381p;
        v7.g.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((j1.v) bVar).r(nodeCoordinator);
    }

    @Override // q0.d.c
    public final void s() {
        x();
    }

    @Override // l1.h0
    public final o1.j t() {
        d.b bVar = this.f3381p;
        v7.g.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        return ((o1.k) bVar).t();
    }

    public final String toString() {
        return this.f3381p.toString();
    }

    public final void u(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        if (this.f16830o) {
            d.b bVar = this.f3381p;
            boolean z17 = false;
            if ((this.f16826j & 32) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (bVar instanceof f) {
                    A((f) bVar);
                }
                if (bVar instanceof k1.d) {
                    if (z10) {
                        z();
                    } else {
                        p.F(this).s(new BackwardsCompatNode$initializeModifier$1(this));
                    }
                }
                if (bVar instanceof t0.e) {
                    h hVar = new h(new t0.f((t0.e) bVar), InspectableValueKt.f3744a);
                    this.f3383r = hVar;
                    A(hVar);
                    if (z10) {
                        y();
                    } else {
                        p.F(this).s(new BackwardsCompatNode$initializeModifier$3(this));
                    }
                }
            }
            if ((this.f16826j & 4) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                if (bVar instanceof s0.d) {
                    this.f3382q = true;
                }
                p.D(this, 2).a1();
            }
            if ((this.f16826j & 2) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                if (p.E(this).J.f15780d.f16830o) {
                    NodeCoordinator nodeCoordinator = this.n;
                    v7.g.c(nodeCoordinator);
                    ((l) nodeCoordinator).M = this;
                    nodeCoordinator.e1();
                }
                p.D(this, 2).a1();
                p.E(this).x();
            }
            if (bVar instanceof j1.c0) {
                ((j1.c0) bVar).P();
            }
            if ((this.f16826j & 128) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                if ((bVar instanceof y) && p.E(this).J.f15780d.f16830o) {
                    p.E(this).x();
                }
                if (bVar instanceof x) {
                    this.f3386u = null;
                    if (p.E(this).J.f15780d.f16830o) {
                        p.F(this).g(new a());
                    }
                }
            }
            if ((this.f16826j & 256) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15 && (bVar instanceof j1.v) && p.E(this).J.f15780d.f16830o) {
                p.E(this).x();
            }
            if ((this.f16826j & 16) != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16 && (bVar instanceof u)) {
                ((u) bVar).q0().f11191i = this.n;
            }
            if ((this.f16826j & 8) != 0) {
                z17 = true;
            }
            if (z17) {
                p.F(this).l();
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // l1.g
    public final void v(long j2) {
        d.b bVar = this.f3381p;
        v7.g.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.IntermediateLayoutModifier");
        ((j1.e) bVar).v(j2);
    }

    @Override // l1.c0
    public final boolean w() {
        return this.f16830o;
    }

    public final void x() {
        boolean z10;
        h hVar;
        if (this.f16830o) {
            d.b bVar = this.f3381p;
            boolean z11 = false;
            if ((this.f16826j & 32) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (bVar instanceof f) {
                    ModifierLocalManager modifierLocalManager = p.F(this).getModifierLocalManager();
                    k1.h key = ((f) bVar).getKey();
                    modifierLocalManager.getClass();
                    v7.g.f(key, "key");
                    modifierLocalManager.f3369d.b(new Pair(p.E(this), key));
                    modifierLocalManager.a();
                }
                if (bVar instanceof k1.d) {
                    ((k1.d) bVar).T(BackwardsCompatNodeKt.f3394a);
                }
                if ((bVar instanceof t0.e) && (hVar = this.f3383r) != null) {
                    ModifierLocalManager modifierLocalManager2 = p.F(this).getModifierLocalManager();
                    modifierLocalManager2.getClass();
                    k1.h<h> hVar2 = hVar.f17550l;
                    v7.g.f(hVar2, "key");
                    modifierLocalManager2.f3369d.b(new Pair(p.E(this), hVar2));
                    modifierLocalManager2.a();
                }
            }
            if ((this.f16826j & 8) != 0) {
                z11 = true;
            }
            if (z11) {
                p.F(this).l();
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void y() {
        if (this.f16830o) {
            p.F(this).getSnapshotObserver().b(this, BackwardsCompatNodeKt.f3396d, new BackwardsCompatNode$updateFocusOrderModifierLocalConsumer$1(this));
        }
    }

    public final void z() {
        if (this.f16830o) {
            this.f3385t.clear();
            p.F(this).getSnapshotObserver().b(this, BackwardsCompatNodeKt.c, new BackwardsCompatNode$updateModifierLocalConsumer$1(this));
        }
    }
}
