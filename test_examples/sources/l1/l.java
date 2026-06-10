package l1;

import android.graphics.Paint;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.LayoutDirection;
import j1.b0;
import java.util.Map;
import q0.d;

/* loaded from: classes.dex */
public final class l extends NodeCoordinator {
    public static final v0.f O;
    public k M;
    public g N;

    /* loaded from: classes.dex */
    public final class a extends r {

        /* renamed from: v  reason: collision with root package name */
        public final g f15750v;

        /* renamed from: w  reason: collision with root package name */
        public final C0179a f15751w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l f15752x;

        /* renamed from: l1.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C0179a implements j1.r {

            /* renamed from: a  reason: collision with root package name */
            public final Map<j1.a, Integer> f15753a = kotlin.collections.d.K1();

            public C0179a() {
            }

            @Override // j1.r
            public final int a() {
                NodeCoordinator nodeCoordinator = a.this.f15752x.f3500p;
                v7.g.c(nodeCoordinator);
                r rVar = nodeCoordinator.f3508x;
                v7.g.c(rVar);
                return rVar.C0().a();
            }

            @Override // j1.r
            public final int b() {
                NodeCoordinator nodeCoordinator = a.this.f15752x.f3500p;
                v7.g.c(nodeCoordinator);
                r rVar = nodeCoordinator.f3508x;
                v7.g.c(rVar);
                return rVar.C0().b();
            }

            @Override // j1.r
            public final Map<j1.a, Integer> f() {
                return this.f15753a;
            }

            @Override // j1.r
            public final void g() {
                b0.a.C0134a c0134a = b0.a.f12644a;
                NodeCoordinator nodeCoordinator = a.this.f15752x.f3500p;
                v7.g.c(nodeCoordinator);
                r rVar = nodeCoordinator.f3508x;
                v7.g.c(rVar);
                b0.a.c(c0134a, rVar, 0, 0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, j0.c cVar, g gVar) {
            super(lVar, cVar);
            v7.g.f(cVar, "scope");
            this.f15752x = lVar;
            this.f15750v = gVar;
            this.f15751w = new C0179a();
        }

        @Override // j1.p
        public final j1.b0 b(long j2) {
            w0(j2);
            NodeCoordinator nodeCoordinator = this.f15752x.f3500p;
            v7.g.c(nodeCoordinator);
            r rVar = nodeCoordinator.f3508x;
            v7.g.c(rVar);
            rVar.b(j2);
            this.f15750v.v(v8.b.f(rVar.C0().b(), rVar.C0().a()));
            r.H0(this, this.f15751w);
            return this;
        }

        @Override // l1.q
        public final int x0(j1.a aVar) {
            v7.g.f(aVar, "alignmentLine");
            int o10 = m0.b.o(this, aVar);
            this.f15766u.put(aVar, Integer.valueOf(o10));
            return o10;
        }
    }

    /* loaded from: classes.dex */
    public final class b extends r {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ l f15755v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l lVar, j0.c cVar) {
            super(lVar, cVar);
            v7.g.f(cVar, "scope");
            this.f15755v = lVar;
        }

        @Override // j1.p
        public final j1.b0 b(long j2) {
            w0(j2);
            l lVar = this.f15755v;
            k kVar = lVar.M;
            NodeCoordinator nodeCoordinator = lVar.f3500p;
            v7.g.c(nodeCoordinator);
            r rVar = nodeCoordinator.f3508x;
            v7.g.c(rVar);
            r.H0(this, kVar.n(this, rVar, j2));
            return this;
        }

        @Override // l1.q
        public final int x0(j1.a aVar) {
            v7.g.f(aVar, "alignmentLine");
            int o10 = m0.b.o(this, aVar);
            this.f15766u.put(aVar, Integer.valueOf(o10));
            return o10;
        }
    }

    static {
        v0.f fVar = new v0.f();
        fVar.f(v0.r.f18131e);
        Paint paint = fVar.f18105a;
        v7.g.f(paint, "<this>");
        paint.setStrokeWidth(1.0f);
        fVar.i(1);
        O = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(LayoutNode layoutNode, k kVar) {
        super(layoutNode);
        boolean z10;
        g gVar;
        v7.g.f(layoutNode, "layoutNode");
        this.M = kVar;
        if ((kVar.e().f16826j & 512) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (kVar instanceof g)) {
            gVar = (g) kVar;
        } else {
            gVar = null;
        }
        this.N = gVar;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final r K0(j0.c cVar) {
        v7.g.f(cVar, "scope");
        g gVar = this.N;
        return gVar != null ? new a(this, cVar, gVar) : new b(this, cVar);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final d.c U0() {
        return this.M.e();
    }

    @Override // j1.p
    public final j1.b0 b(long j2) {
        w0(j2);
        k kVar = this.M;
        NodeCoordinator nodeCoordinator = this.f3500p;
        v7.g.c(nodeCoordinator);
        j1(kVar.n(this, nodeCoordinator, j2));
        z zVar = this.F;
        if (zVar != null) {
            zVar.d(this.f12642k);
        }
        f1();
        return this;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void e1() {
        boolean z10;
        super.e1();
        k kVar = this.M;
        if ((kVar.e().f16826j & 512) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (kVar instanceof g)) {
            g gVar = (g) kVar;
            this.N = gVar;
            r rVar = this.f3508x;
            if (rVar != null) {
                this.f3508x = new a(this, rVar.f15761p, gVar);
                return;
            }
            return;
        }
        this.N = null;
        r rVar2 = this.f3508x;
        if (rVar2 != null) {
            this.f3508x = new b(this, rVar2.f15761p);
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void h1(v0.o oVar) {
        v7.g.f(oVar, "canvas");
        NodeCoordinator nodeCoordinator = this.f3500p;
        v7.g.c(nodeCoordinator);
        nodeCoordinator.M0(oVar);
        if (m0.b.b1(this.f3499o).getShowLayoutBounds()) {
            N0(oVar, O);
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, j1.b0
    public final void s0(long j2, float f10, u7.l<? super v0.u, m7.n> lVar) {
        super.s0(j2, f10, lVar);
        if (this.f15759m) {
            return;
        }
        g1();
        b0.a.C0134a c0134a = b0.a.f12644a;
        int i10 = (int) (this.f12642k >> 32);
        LayoutDirection layoutDirection = this.f3499o.f3429y;
        j1.h hVar = b0.a.f12646d;
        c0134a.getClass();
        int i11 = b0.a.c;
        LayoutDirection layoutDirection2 = b0.a.f12645b;
        b0.a.c = i10;
        b0.a.f12645b = layoutDirection;
        boolean i12 = b0.a.C0134a.i(c0134a, this);
        C0().g();
        this.n = i12;
        b0.a.c = i11;
        b0.a.f12645b = layoutDirection2;
        b0.a.f12646d = hVar;
    }

    @Override // l1.q
    public final int x0(j1.a aVar) {
        v7.g.f(aVar, "alignmentLine");
        r rVar = this.f3508x;
        if (rVar != null) {
            Integer num = (Integer) rVar.f15766u.get(aVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        return m0.b.o(this, aVar);
    }
}
