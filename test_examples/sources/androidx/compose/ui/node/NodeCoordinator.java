package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.unit.LayoutDirection;
import j1.h;
import j1.p;
import j1.r;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Ref$ObjectRef;
import l1.b0;
import l1.c0;
import l1.d0;
import l1.f;
import l1.h0;
import l1.i;
import l1.q;
import l1.v;
import l1.z;
import m7.n;
import o1.j;
import q0.d;
import u0.d;
import u7.l;
import v0.e0;
import v0.l0;
import v0.o;
import v0.u;
import v7.g;

/* loaded from: classes.dex */
public abstract class NodeCoordinator extends q implements p, h, c0, l<o, n> {
    public static final l<NodeCoordinator, n> G = NodeCoordinator$Companion$onCommitAffectingLayerParams$1.f3512j;
    public static final l<NodeCoordinator, n> H = NodeCoordinator$Companion$onCommitAffectingLayer$1.f3511j;
    public static final e0 I = new e0();
    public static final i J = new i();
    public static final a K;
    public static final b L;
    public float A;
    public u0.b B;
    public i C;
    public final u7.a<n> D;
    public boolean E;
    public z F;

    /* renamed from: o  reason: collision with root package name */
    public final LayoutNode f3499o;

    /* renamed from: p  reason: collision with root package name */
    public NodeCoordinator f3500p;

    /* renamed from: q  reason: collision with root package name */
    public NodeCoordinator f3501q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3502r;

    /* renamed from: s  reason: collision with root package name */
    public l<? super u, n> f3503s;

    /* renamed from: t  reason: collision with root package name */
    public b2.b f3504t;

    /* renamed from: u  reason: collision with root package name */
    public LayoutDirection f3505u;

    /* renamed from: v  reason: collision with root package name */
    public float f3506v;

    /* renamed from: w  reason: collision with root package name */
    public r f3507w;

    /* renamed from: x  reason: collision with root package name */
    public l1.r f3508x;

    /* renamed from: y  reason: collision with root package name */
    public LinkedHashMap f3509y;

    /* renamed from: z  reason: collision with root package name */
    public long f3510z;

    /* loaded from: classes.dex */
    public static final class a implements c<l1.e0> {
        @Override // androidx.compose.ui.node.NodeCoordinator.c
        public final int a() {
            return 16;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.c
        public final boolean b(l1.e0 e0Var) {
            l1.e0 e0Var2 = e0Var;
            g.f(e0Var2, "node");
            e0Var2.m();
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.c
        public final void c(LayoutNode layoutNode, long j2, f<l1.e0> fVar, boolean z10, boolean z11) {
            g.f(fVar, "hitTestResult");
            layoutNode.s(j2, fVar, z10, z11);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.c
        public final boolean d(LayoutNode layoutNode) {
            g.f(layoutNode, "parentLayoutNode");
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c<h0> {
        @Override // androidx.compose.ui.node.NodeCoordinator.c
        public final int a() {
            return 8;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.c
        public final boolean b(h0 h0Var) {
            g.f(h0Var, "node");
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.c
        public final void c(LayoutNode layoutNode, long j2, f<h0> fVar, boolean z10, boolean z11) {
            g.f(fVar, "hitTestResult");
            v vVar = layoutNode.J;
            vVar.c.Y0(NodeCoordinator.L, vVar.c.Q0(j2), fVar, true, z11);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.c
        public final boolean d(LayoutNode layoutNode) {
            j E;
            g.f(layoutNode, "parentLayoutNode");
            h0 r3 = v0.p.r(layoutNode);
            boolean z10 = false;
            if (r3 != null && (E = m0.b.E(r3)) != null && E.f16208k) {
                z10 = true;
            }
            return !z10;
        }
    }

    /* loaded from: classes.dex */
    public interface c<N extends l1.b> {
        int a();

        boolean b(N n);

        void c(LayoutNode layoutNode, long j2, f<N> fVar, boolean z10, boolean z11);

        boolean d(LayoutNode layoutNode);
    }

    static {
        v0.p.k();
        K = new a();
        L = new b();
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        g.f(layoutNode, "layoutNode");
        this.f3499o = layoutNode;
        this.f3504t = layoutNode.f3427w;
        this.f3505u = layoutNode.f3429y;
        this.f3506v = 0.8f;
        int i10 = b2.g.c;
        this.f3510z = b2.g.f6344b;
        this.D = new NodeCoordinator$invalidateParentLayer$1(this);
    }

    @Override // l1.q
    public final boolean A0() {
        return this.f3507w != null;
    }

    @Override // l1.q
    public final LayoutNode B0() {
        return this.f3499o;
    }

    @Override // l1.q
    public final r C0() {
        r rVar = this.f3507w;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    @Override // l1.q
    public final q D0() {
        return this.f3501q;
    }

    @Override // l1.q
    public final long E0() {
        return this.f3510z;
    }

    @Override // l1.q
    public final void G0() {
        s0(this.f3510z, this.A, this.f3503s);
    }

    public final void H0(NodeCoordinator nodeCoordinator, u0.b bVar, boolean z10) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.f3501q;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.H0(nodeCoordinator, bVar, z10);
        }
        long j2 = this.f3510z;
        int i10 = b2.g.c;
        float f10 = (int) (j2 >> 32);
        bVar.f17718a -= f10;
        bVar.c -= f10;
        float a10 = b2.g.a(j2);
        bVar.f17719b -= a10;
        bVar.f17720d -= a10;
        z zVar = this.F;
        if (zVar != null) {
            zVar.f(bVar, true);
            if (this.f3502r && z10) {
                long j10 = this.f12642k;
                bVar.a(0.0f, 0.0f, (int) (j10 >> 32), b2.h.b(j10));
            }
        }
    }

    public final long I0(NodeCoordinator nodeCoordinator, long j2) {
        if (nodeCoordinator == this) {
            return j2;
        }
        NodeCoordinator nodeCoordinator2 = this.f3501q;
        if (nodeCoordinator2 != null && !g.a(nodeCoordinator, nodeCoordinator2)) {
            return Q0(nodeCoordinator2.I0(nodeCoordinator, j2));
        }
        return Q0(j2);
    }

    public final long J0(long j2) {
        return a1.c.v(Math.max(0.0f, (u0.f.d(j2) - q0()) / 2.0f), Math.max(0.0f, (u0.f.b(j2) - n0()) / 2.0f));
    }

    public abstract l1.r K0(j0.c cVar);

    public final float L0(long j2, long j10) {
        float q02;
        float n02;
        if (q0() >= u0.f.d(j10) && n0() >= u0.f.b(j10)) {
            return Float.POSITIVE_INFINITY;
        }
        long J0 = J0(j10);
        float d5 = u0.f.d(J0);
        float b5 = u0.f.b(J0);
        float b10 = u0.c.b(j2);
        if (b10 < 0.0f) {
            q02 = -b10;
        } else {
            q02 = b10 - q0();
        }
        float max = Math.max(0.0f, q02);
        float c10 = u0.c.c(j2);
        if (c10 < 0.0f) {
            n02 = -c10;
        } else {
            n02 = c10 - n0();
        }
        long s10 = a1.c.s(max, Math.max(0.0f, n02));
        if ((d5 <= 0.0f && b5 <= 0.0f) || u0.c.b(s10) > d5 || u0.c.c(s10) > b5) {
            return Float.POSITIVE_INFINITY;
        }
        return (u0.c.c(s10) * u0.c.c(s10)) + (u0.c.b(s10) * u0.c.b(s10));
    }

    public final void M0(o oVar) {
        g.f(oVar, "canvas");
        z zVar = this.F;
        if (zVar != null) {
            zVar.c(oVar);
            return;
        }
        long j2 = this.f3510z;
        float f10 = (int) (j2 >> 32);
        float a10 = b2.g.a(j2);
        oVar.i(f10, a10);
        O0(oVar);
        oVar.i(-f10, -a10);
    }

    public final void N0(o oVar, v0.f fVar) {
        g.f(oVar, "canvas");
        g.f(fVar, "paint");
        long j2 = this.f12642k;
        oVar.b(new d(0.5f, 0.5f, ((int) (j2 >> 32)) - 0.5f, b2.h.b(j2) - 0.5f), fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O0(o oVar) {
        l1.d dVar;
        boolean o02 = m0.b.o0(4);
        d.c U0 = U0();
        l1.d dVar2 = 0;
        if (!o02 && (U0 = U0.f16828l) == null) {
            dVar = dVar2;
            if (dVar != null) {
                h1(oVar);
                return;
            }
            LayoutNode layoutNode = this.f3499o;
            layoutNode.getClass();
            m0.b.b1(layoutNode).getSharedDrawScope().b(oVar, v8.b.M(this.f12642k), this, dVar);
            return;
        }
        d.c V0 = V0(o02);
        while (true) {
            if (V0 != null && (V0.f16827k & 4) != 0) {
                if ((V0.f16826j & 4) != 0) {
                    if (V0 instanceof l1.d) {
                        dVar2 = V0;
                    }
                    dVar2 = (l1.d) dVar2;
                } else if (V0 == U0) {
                    break;
                } else {
                    V0 = V0.f16829m;
                }
            } else {
                break;
            }
        }
        dVar = dVar2;
        if (dVar != null) {
        }
    }

    @Override // j1.h
    public final boolean P() {
        return U0().f16830o;
    }

    public final NodeCoordinator P0(NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode = this.f3499o;
        LayoutNode layoutNode2 = nodeCoordinator.f3499o;
        if (layoutNode2 == layoutNode) {
            d.c U0 = nodeCoordinator.U0();
            d.c cVar = U0().f16825i;
            if (cVar.f16830o) {
                for (d.c cVar2 = cVar.f16828l; cVar2 != null; cVar2 = cVar2.f16828l) {
                    if ((cVar2.f16826j & 2) != 0 && cVar2 == U0) {
                        return nodeCoordinator;
                    }
                }
                return this;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        LayoutNode layoutNode3 = layoutNode2;
        while (layoutNode3.f3421q > layoutNode.f3421q) {
            layoutNode3 = layoutNode3.p();
            g.c(layoutNode3);
        }
        LayoutNode layoutNode4 = layoutNode;
        while (layoutNode4.f3421q > layoutNode3.f3421q) {
            layoutNode4 = layoutNode4.p();
            g.c(layoutNode4);
        }
        while (layoutNode3 != layoutNode4) {
            layoutNode3 = layoutNode3.p();
            layoutNode4 = layoutNode4.p();
            if (layoutNode3 == null || layoutNode4 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNode4 == layoutNode) {
            return this;
        }
        if (layoutNode3 != layoutNode2) {
            return layoutNode3.J.f15779b;
        }
        return nodeCoordinator;
    }

    public final long Q0(long j2) {
        long j10 = this.f3510z;
        float b5 = u0.c.b(j2);
        int i10 = b2.g.c;
        long s10 = a1.c.s(b5 - ((int) (j10 >> 32)), u0.c.c(j2) - b2.g.a(j10));
        z zVar = this.F;
        if (zVar != null) {
            return zVar.b(s10, true);
        }
        return s10;
    }

    public final l1.a R0() {
        return this.f3499o.K.f3452k;
    }

    public final long S0() {
        return this.f3504t.g0(this.f3499o.f3430z.c());
    }

    @Override // j1.h
    public final long T(long j2) {
        if (P()) {
            for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.f3501q) {
                j2 = nodeCoordinator.l1(j2);
            }
            return j2;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final NodeCoordinator T0() {
        if (P()) {
            return this.f3499o.J.c.f3501q;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    @Override // u7.l
    public final n U(o oVar) {
        boolean z10;
        o oVar2 = oVar;
        g.f(oVar2, "canvas");
        LayoutNode layoutNode = this.f3499o;
        if (layoutNode.A) {
            m0.b.b1(layoutNode).getSnapshotObserver().b(this, H, new NodeCoordinator$invoke$1(this, oVar2));
            z10 = false;
        } else {
            z10 = true;
        }
        this.E = z10;
        return n.f16010a;
    }

    public abstract d.c U0();

    public final d.c V0(boolean z10) {
        d.c U0;
        v vVar = this.f3499o.J;
        if (vVar.c == this) {
            return vVar.f15781e;
        }
        if (z10) {
            NodeCoordinator nodeCoordinator = this.f3501q;
            if (nodeCoordinator != null && (U0 = nodeCoordinator.U0()) != null) {
                return U0.f16829m;
            }
        } else {
            NodeCoordinator nodeCoordinator2 = this.f3501q;
            if (nodeCoordinator2 != null) {
                return nodeCoordinator2.U0();
            }
        }
        return null;
    }

    public final <T extends l1.b> void W0(T t10, c<T> cVar, long j2, f<T> fVar, boolean z10, boolean z11) {
        if (t10 == null) {
            Z0(cVar, j2, fVar, z10, z11);
            return;
        }
        NodeCoordinator$hit$1 nodeCoordinator$hit$1 = new NodeCoordinator$hit$1(this, t10, cVar, j2, fVar, z10, z11);
        fVar.getClass();
        fVar.d(t10, -1.0f, z11, nodeCoordinator$hit$1);
    }

    public final <T extends l1.b> void X0(T t10, c<T> cVar, long j2, f<T> fVar, boolean z10, boolean z11, float f10) {
        if (t10 == null) {
            Z0(cVar, j2, fVar, z10, z11);
        } else {
            fVar.d(t10, f10, z11, new NodeCoordinator$hitNear$1(this, t10, cVar, j2, fVar, z10, z11, f10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T extends l1.b> void Y0(c<T> cVar, long j2, f<T> fVar, boolean z10, boolean z11) {
        d.c cVar2;
        boolean z12;
        float L0;
        boolean z13;
        boolean z14;
        boolean z15;
        g.f(cVar, "hitTestSource");
        g.f(fVar, "hitTestResult");
        int a10 = cVar.a();
        boolean o02 = m0.b.o0(a10);
        d.c U0 = U0();
        if (!o02 && (U0 = U0.f16828l) == null) {
            cVar2 = null;
            boolean z16 = true;
            boolean z17 = false;
            if (n1(j2)) {
                if (z10) {
                    float L02 = L0(j2, S0());
                    if (!Float.isInfinite(L02) && !Float.isNaN(L02)) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        if (fVar.f15731k != a1.c.B0(fVar)) {
                            if (m0.b.I(fVar.c(), m0.b.n(L02, false)) <= 0) {
                                z16 = false;
                            }
                        }
                        if (z16) {
                            L0 = L02;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (cVar2 == null) {
                Z0(cVar, j2, fVar, z10, z11);
                return;
            } else {
                float b5 = u0.c.b(j2);
                float c10 = u0.c.c(j2);
                if (b5 >= 0.0f && c10 >= 0.0f && b5 < q0() && c10 < n0()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    W0(cVar2, cVar, j2, fVar, z10, z11);
                    return;
                }
                if (!z10) {
                    L0 = Float.POSITIVE_INFINITY;
                } else {
                    L0 = L0(j2, S0());
                }
                if (!Float.isInfinite(L0) && !Float.isNaN(L0)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    if (fVar.f15731k == a1.c.B0(fVar)) {
                        z14 = z11;
                    } else {
                        z14 = z11;
                        if (m0.b.I(fVar.c(), m0.b.n(L0, z14)) <= 0) {
                            z16 = false;
                        }
                    }
                    if (z16) {
                        z17 = z14;
                    }
                }
                k1(cVar2, cVar, j2, fVar, z10, z11, L0);
                return;
            }
            X0(cVar2, cVar, j2, fVar, z10, z17, L0);
        }
        cVar2 = V0(o02);
        while (cVar2 != null && (cVar2.f16827k & a10) != 0) {
            if ((cVar2.f16826j & a10) != 0) {
                break;
            } else if (cVar2 == U0) {
                break;
            } else {
                cVar2 = cVar2.f16829m;
            }
        }
        cVar2 = null;
        boolean z162 = true;
        boolean z172 = false;
        if (n1(j2)) {
        }
        X0(cVar2, cVar, j2, fVar, z10, z172, L0);
    }

    public <T extends l1.b> void Z0(c<T> cVar, long j2, f<T> fVar, boolean z10, boolean z11) {
        g.f(cVar, "hitTestSource");
        g.f(fVar, "hitTestResult");
        NodeCoordinator nodeCoordinator = this.f3500p;
        if (nodeCoordinator != null) {
            nodeCoordinator.Y0(cVar, nodeCoordinator.Q0(j2), fVar, z10, z11);
        }
    }

    public final void a1() {
        z zVar = this.F;
        if (zVar != null) {
            zVar.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.f3501q;
        if (nodeCoordinator != null) {
            nodeCoordinator.a1();
        }
    }

    public final boolean b1() {
        if (this.F == null || this.f3506v > 0.0f) {
            NodeCoordinator nodeCoordinator = this.f3501q;
            if (nodeCoordinator != null) {
                return nodeCoordinator.b1();
            }
            return false;
        }
        return true;
    }

    public final long c1(h hVar, long j2) {
        j1.n nVar;
        NodeCoordinator nodeCoordinator;
        g.f(hVar, "sourceCoordinates");
        if (hVar instanceof j1.n) {
            nVar = (j1.n) hVar;
        } else {
            nVar = null;
        }
        if (nVar == null || (nodeCoordinator = nVar.f12659i.f15760o) == null) {
            nodeCoordinator = (NodeCoordinator) hVar;
        }
        NodeCoordinator P0 = P0(nodeCoordinator);
        while (nodeCoordinator != P0) {
            j2 = nodeCoordinator.l1(j2);
            nodeCoordinator = nodeCoordinator.f3501q;
            g.c(nodeCoordinator);
        }
        return I0(P0, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d1(l<? super u, n> lVar) {
        boolean z10;
        boolean P;
        z zVar;
        b0 b0Var;
        l<? super u, n> lVar2 = this.f3503s;
        LayoutNode layoutNode = this.f3499o;
        if (lVar2 == lVar && g.a(this.f3504t, layoutNode.f3427w) && this.f3505u == layoutNode.f3429y) {
            z10 = false;
            this.f3503s = lVar;
            this.f3504t = layoutNode.f3427w;
            this.f3505u = layoutNode.f3429y;
            P = P();
            u7.a<n> aVar = this.D;
            if (!P && lVar != null) {
                if (this.F == null) {
                    z n = m0.b.b1(layoutNode).n(aVar, this);
                    n.d(this.f12642k);
                    n.g(this.f3510z);
                    this.F = n;
                    m1();
                    layoutNode.O = true;
                    ((NodeCoordinator$invalidateParentLayer$1) aVar).k0();
                    return;
                } else if (z10) {
                    m1();
                    return;
                } else {
                    return;
                }
            }
            zVar = this.F;
            if (zVar != null) {
                zVar.destroy();
                layoutNode.O = true;
                ((NodeCoordinator$invalidateParentLayer$1) aVar).k0();
                if (P() && (b0Var = layoutNode.f3420p) != null) {
                    b0Var.o(layoutNode);
                }
            }
            this.F = null;
            this.E = false;
        }
        z10 = true;
        this.f3503s = lVar;
        this.f3504t = layoutNode.f3427w;
        this.f3505u = layoutNode.f3429y;
        P = P();
        u7.a<n> aVar2 = this.D;
        if (!P) {
        }
        zVar = this.F;
        if (zVar != null) {
        }
        this.F = null;
        this.E = false;
    }

    public void e1() {
        z zVar = this.F;
        if (zVar != null) {
            zVar.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1() {
        boolean z10;
        d.c cVar;
        boolean z11;
        boolean o02 = m0.b.o0(128);
        d.c V0 = V0(o02);
        if (V0 != null) {
            z10 = true;
            if ((V0.f16825i.f16827k & 128) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (!z10) {
                    p0.f g10 = SnapshotKt.g((p0.f) SnapshotKt.f2939b.d(), null, false);
                    try {
                        p0.f i10 = g10.i();
                        if (o02) {
                            cVar = U0();
                        } else {
                            cVar = U0().f16828l;
                            if (cVar == null) {
                                n nVar = n.f16010a;
                                p0.f.o(i10);
                                g10.c();
                                return;
                            }
                        }
                        for (d.c V02 = V0(o02); V02 != null && (V02.f16827k & 128) != 0; V02 = V02.f16829m) {
                            if ((V02.f16826j & 128) != 0 && (V02 instanceof l1.j)) {
                                ((l1.j) V02).b(this.f12642k);
                            }
                            if (V02 == cVar) {
                                break;
                            }
                        }
                        n nVar2 = n.f16010a;
                        p0.f.o(i10);
                        g10.c();
                        return;
                    } catch (Throwable th) {
                        g10.c();
                        throw th;
                    }
                }
                return;
            }
        }
        z10 = false;
        if (!z10) {
        }
    }

    public final void g1() {
        l1.r rVar = this.f3508x;
        boolean o02 = m0.b.o0(128);
        if (rVar != null) {
            d.c U0 = U0();
            if (!o02 && (U0 = U0.f16828l) == null) {
            }
            for (d.c V0 = V0(o02); V0 != null && (V0.f16827k & 128) != 0; V0 = V0.f16829m) {
                if ((V0.f16826j & 128) != 0 && (V0 instanceof l1.j)) {
                    ((l1.j) V0).g(rVar.f15764s);
                }
                if (V0 == U0) {
                    break;
                }
            }
        }
        d.c U02 = U0();
        if (!o02 && (U02 = U02.f16828l) == null) {
            return;
        }
        for (d.c V02 = V0(o02); V02 != null && (V02.f16827k & 128) != 0; V02 = V02.f16829m) {
            if ((V02.f16826j & 128) != 0 && (V02 instanceof l1.j)) {
                ((l1.j) V02).o(this);
            }
            if (V02 == U02) {
                return;
            }
        }
    }

    @Override // b2.b
    public final float getDensity() {
        return this.f3499o.f3427w.getDensity();
    }

    @Override // j1.g
    public final LayoutDirection getLayoutDirection() {
        return this.f3499o.f3429y;
    }

    public void h1(o oVar) {
        g.f(oVar, "canvas");
        NodeCoordinator nodeCoordinator = this.f3500p;
        if (nodeCoordinator != null) {
            nodeCoordinator.M0(oVar);
        }
    }

    public final void i1(u0.b bVar, boolean z10, boolean z11) {
        z zVar = this.F;
        if (zVar != null) {
            if (this.f3502r) {
                if (z11) {
                    long S0 = S0();
                    float d5 = u0.f.d(S0) / 2.0f;
                    float b5 = u0.f.b(S0) / 2.0f;
                    long j2 = this.f12642k;
                    bVar.a(-d5, -b5, ((int) (j2 >> 32)) + d5, b2.h.b(j2) + b5);
                } else if (z10) {
                    long j10 = this.f12642k;
                    bVar.a(0.0f, 0.0f, (int) (j10 >> 32), b2.h.b(j10));
                }
                if (bVar.b()) {
                    return;
                }
            }
            zVar.f(bVar, false);
        }
        long j11 = this.f3510z;
        int i10 = b2.g.c;
        float f10 = (int) (j11 >> 32);
        bVar.f17718a += f10;
        bVar.c += f10;
        float a10 = b2.g.a(j11);
        bVar.f17719b += a10;
        bVar.f17720d += a10;
    }

    @Override // j1.h
    public final long j(long j2) {
        return m0.b.b1(this.f3499o).i(T(j2));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j1(r rVar) {
        boolean z10;
        LinkedHashMap linkedHashMap;
        g.f(rVar, "value");
        r rVar2 = this.f3507w;
        if (rVar != rVar2) {
            this.f3507w = rVar;
            if (rVar2 == null || rVar.b() != rVar2.b() || rVar.a() != rVar2.a()) {
                int b5 = rVar.b();
                int a10 = rVar.a();
                z zVar = this.F;
                if (zVar != null) {
                    zVar.d(v8.b.f(b5, a10));
                } else {
                    NodeCoordinator nodeCoordinator = this.f3501q;
                    if (nodeCoordinator != null) {
                        nodeCoordinator.a1();
                    }
                }
                LayoutNode layoutNode = this.f3499o;
                b0 b0Var = layoutNode.f3420p;
                if (b0Var != null) {
                    b0Var.o(layoutNode);
                }
                v0(v8.b.f(b5, a10));
                boolean o02 = m0.b.o0(4);
                d.c U0 = U0();
                if (!o02 && (U0 = U0.f16828l) == null) {
                }
                for (d.c V0 = V0(o02); V0 != null && (V0.f16827k & 4) != 0; V0 = V0.f16829m) {
                    if ((V0.f16826j & 4) != 0 && (V0 instanceof l1.d)) {
                        ((l1.d) V0).l();
                    }
                    if (V0 == U0) {
                        break;
                    }
                }
            }
            LinkedHashMap linkedHashMap2 = this.f3509y;
            if (linkedHashMap2 != null && !linkedHashMap2.isEmpty()) {
                z10 = false;
                if ((z10 || (!rVar.f().isEmpty())) && !g.a(rVar.f(), this.f3509y)) {
                    ((LayoutNodeLayoutDelegate.MeasurePassDelegate) R0()).f3479t.g();
                    linkedHashMap = this.f3509y;
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap();
                        this.f3509y = linkedHashMap;
                    }
                    linkedHashMap.clear();
                    linkedHashMap.putAll(rVar.f());
                }
                return;
            }
            z10 = true;
            if (z10) {
            }
            ((LayoutNodeLayoutDelegate.MeasurePassDelegate) R0()).f3479t.g();
            linkedHashMap = this.f3509y;
            if (linkedHashMap == null) {
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(rVar.f());
        }
    }

    public final <T extends l1.b> void k1(T t10, c<T> cVar, long j2, f<T> fVar, boolean z10, boolean z11, float f10) {
        if (t10 == null) {
            Z0(cVar, j2, fVar, z10, z11);
        } else if (cVar.b(t10)) {
            NodeCoordinator$speculativeHit$1 nodeCoordinator$speculativeHit$1 = new NodeCoordinator$speculativeHit$1(this, t10, cVar, j2, fVar, z10, z11, f10);
            fVar.getClass();
            if (fVar.f15731k == a1.c.B0(fVar)) {
                fVar.d(t10, f10, z11, nodeCoordinator$speculativeHit$1);
                if (fVar.f15731k + 1 == a1.c.B0(fVar)) {
                    fVar.g();
                    return;
                }
                return;
            }
            long c10 = fVar.c();
            int i10 = fVar.f15731k;
            fVar.f15731k = a1.c.B0(fVar);
            fVar.d(t10, f10, z11, nodeCoordinator$speculativeHit$1);
            if (fVar.f15731k + 1 < a1.c.B0(fVar) && m0.b.I(c10, fVar.c()) > 0) {
                int i11 = fVar.f15731k + 1;
                int i12 = i10 + 1;
                Object[] objArr = fVar.f15729i;
                n7.i.b2(objArr, objArr, i12, i11, fVar.f15732l);
                long[] jArr = fVar.f15730j;
                int i13 = fVar.f15732l;
                g.f(jArr, "<this>");
                System.arraycopy(jArr, i11, jArr, i12, i13 - i11);
                fVar.f15731k = ((fVar.f15732l + i10) - fVar.f15731k) - 1;
            }
            fVar.g();
            fVar.f15731k = i10;
        } else {
            k1(v0.p.c(t10, cVar.a()), cVar, j2, fVar, z10, z11, f10);
        }
    }

    public final long l1(long j2) {
        z zVar = this.F;
        if (zVar != null) {
            j2 = zVar.b(j2, false);
        }
        long j10 = this.f3510z;
        float b5 = u0.c.b(j2);
        int i10 = b2.g.c;
        return a1.c.s(b5 + ((int) (j10 >> 32)), u0.c.c(j2) + b2.g.a(j10));
    }

    public final void m1() {
        NodeCoordinator nodeCoordinator;
        e0 e0Var;
        LayoutNode layoutNode;
        z zVar = this.F;
        e0 e0Var2 = I;
        boolean z10 = false;
        LayoutNode layoutNode2 = this.f3499o;
        if (zVar != null) {
            l<? super u, n> lVar = this.f3503s;
            if (lVar != null) {
                e0Var2.f18090i = 1.0f;
                e0Var2.f18091j = 1.0f;
                e0Var2.f18092k = 1.0f;
                e0Var2.f18093l = 0.0f;
                e0Var2.f18094m = 0.0f;
                e0Var2.n = 0.0f;
                long j2 = v0.v.f18139a;
                e0Var2.f18095o = j2;
                e0Var2.f18096p = j2;
                e0Var2.f18097q = 0.0f;
                e0Var2.f18098r = 0.0f;
                e0Var2.f18099s = 0.0f;
                e0Var2.f18100t = 8.0f;
                e0Var2.f18101u = l0.f18123a;
                e0Var2.f18102v = v0.c0.f18087a;
                e0Var2.f18103w = false;
                b2.b bVar = layoutNode2.f3427w;
                g.f(bVar, "<set-?>");
                e0Var2.f18104x = bVar;
                m0.b.b1(layoutNode2).getSnapshotObserver().b(this, G, new NodeCoordinator$updateLayerParameters$1(lVar));
                i iVar = this.C;
                if (iVar == null) {
                    iVar = new i();
                    this.C = iVar;
                }
                float f10 = e0Var2.f18090i;
                iVar.f15742a = f10;
                float f11 = e0Var2.f18091j;
                iVar.f15743b = f11;
                float f12 = e0Var2.f18093l;
                iVar.c = f12;
                float f13 = e0Var2.f18094m;
                iVar.f15744d = f13;
                float f14 = e0Var2.f18097q;
                iVar.f15745e = f14;
                float f15 = e0Var2.f18098r;
                iVar.f15746f = f15;
                float f16 = e0Var2.f18099s;
                iVar.f15747g = f16;
                float f17 = e0Var2.f18100t;
                iVar.f15748h = f17;
                long j10 = e0Var2.f18101u;
                iVar.f15749i = j10;
                e0Var = e0Var2;
                layoutNode = layoutNode2;
                zVar.a(f10, f11, e0Var2.f18092k, f12, f13, e0Var2.n, f14, f15, f16, f17, j10, e0Var2.f18102v, e0Var2.f18103w, e0Var2.f18095o, e0Var2.f18096p, layoutNode2.f3429y, layoutNode2.f3427w);
                nodeCoordinator = this;
                nodeCoordinator.f3502r = e0Var.f18103w;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            nodeCoordinator = this;
            e0Var = e0Var2;
            layoutNode = layoutNode2;
            if (nodeCoordinator.f3503s == null) {
                z10 = true;
            }
            if (!z10) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        nodeCoordinator.f3506v = e0Var.f18092k;
        LayoutNode layoutNode3 = layoutNode;
        b0 b0Var = layoutNode3.f3420p;
        if (b0Var != null) {
            b0Var.o(layoutNode3);
        }
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [T, java.lang.Object] */
    @Override // j1.f
    public final Object n() {
        boolean z10;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        d.c U0 = U0();
        LayoutNode layoutNode = this.f3499o;
        b2.b bVar = layoutNode.f3427w;
        for (d.c cVar = layoutNode.J.f15780d; cVar != null; cVar = cVar.f16828l) {
            if (cVar != U0) {
                if ((cVar.f16826j & 64) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (cVar instanceof d0)) {
                    ref$ObjectRef.f13060i = ((d0) cVar).j(bVar, ref$ObjectRef.f13060i);
                }
            }
        }
        return ref$ObjectRef.f13060i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n1(long j2) {
        boolean z10;
        boolean z11;
        boolean z12;
        float b5 = u0.c.b(j2);
        if (!Float.isInfinite(b5) && !Float.isNaN(b5)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float c10 = u0.c.c(j2);
            if (!Float.isInfinite(c10) && !Float.isNaN(c10)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                z11 = true;
                if (z11) {
                    return false;
                }
                z zVar = this.F;
                if (zVar == null || !this.f3502r || zVar.i(j2)) {
                    return true;
                }
                return false;
            }
        }
        z11 = false;
        if (z11) {
        }
    }

    @Override // j1.h
    public final long p() {
        return this.f12642k;
    }

    @Override // j1.b0
    public void s0(long j2, float f10, l<? super u, n> lVar) {
        boolean z10;
        d1(lVar);
        long j10 = this.f3510z;
        int i10 = b2.g.c;
        if (j10 == j2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f3510z = j2;
            LayoutNode layoutNode = this.f3499o;
            layoutNode.K.f3452k.x0();
            z zVar = this.F;
            if (zVar != null) {
                zVar.g(j2);
            } else {
                NodeCoordinator nodeCoordinator = this.f3501q;
                if (nodeCoordinator != null) {
                    nodeCoordinator.a1();
                }
            }
            q.F0(this);
            b0 b0Var = layoutNode.f3420p;
            if (b0Var != null) {
                b0Var.o(layoutNode);
            }
        }
        this.A = f10;
    }

    @Override // j1.h
    public final u0.d t(h hVar, boolean z10) {
        j1.n nVar;
        NodeCoordinator nodeCoordinator;
        g.f(hVar, "sourceCoordinates");
        if (P()) {
            if (hVar.P()) {
                if (hVar instanceof j1.n) {
                    nVar = (j1.n) hVar;
                } else {
                    nVar = null;
                }
                if (nVar == null || (nodeCoordinator = nVar.f12659i.f15760o) == null) {
                    nodeCoordinator = (NodeCoordinator) hVar;
                }
                NodeCoordinator P0 = P0(nodeCoordinator);
                u0.b bVar = this.B;
                if (bVar == null) {
                    bVar = new u0.b();
                    this.B = bVar;
                }
                bVar.f17718a = 0.0f;
                bVar.f17719b = 0.0f;
                bVar.c = (int) (hVar.p() >> 32);
                bVar.f17720d = b2.h.b(hVar.p());
                while (nodeCoordinator != P0) {
                    nodeCoordinator.i1(bVar, z10, false);
                    if (bVar.b()) {
                        return u0.d.f17725e;
                    }
                    nodeCoordinator = nodeCoordinator.f3501q;
                    g.c(nodeCoordinator);
                }
                H0(P0, bVar, z10);
                return new u0.d(bVar.f17718a, bVar.f17719b, bVar.c, bVar.f17720d);
            }
            throw new IllegalStateException(("LayoutCoordinates " + hVar + " is not attached!").toString());
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    @Override // l1.c0
    public final boolean w() {
        return this.F != null && P();
    }

    @Override // b2.b
    public final float y() {
        return this.f3499o.f3427w.y();
    }

    @Override // l1.q
    public final q y0() {
        return this.f3500p;
    }

    @Override // l1.q
    public final h z0() {
        return this;
    }
}
