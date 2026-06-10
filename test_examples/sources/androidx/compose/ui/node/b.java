package androidx.compose.ui.node;

import android.graphics.Paint;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import h0.e;
import j0.c;
import j1.b0;
import j1.p;
import j1.q;
import l1.e0;
import l1.r;
import l1.v;
import m7.n;
import q0.d;
import u7.l;
import v0.f;
import v0.o;
import v0.u;
import v7.g;

/* loaded from: classes.dex */
public final class b extends NodeCoordinator {
    public static final f N;
    public final C0024b M;

    /* loaded from: classes.dex */
    public final class a extends r {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, c cVar) {
            super(bVar, cVar);
            g.f(cVar, "scope");
        }

        @Override // l1.r
        public final void I0() {
            NodeCoordinator nodeCoordinator = this.f15760o;
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = nodeCoordinator.f3499o.K.f3453l;
            g.c(lookaheadPassDelegate);
            if (!lookaheadPassDelegate.f3457q) {
                lookaheadPassDelegate.f3457q = true;
                if (!lookaheadPassDelegate.f3458r) {
                    lookaheadPassDelegate.A0();
                }
            }
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate2 = nodeCoordinator.f3499o.K.f3453l;
            g.c(lookaheadPassDelegate2);
            lookaheadPassDelegate2.x();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
        @Override // j1.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final b0 b(long j2) {
            boolean z10;
            w0(j2);
            NodeCoordinator nodeCoordinator = this.f15760o;
            e<LayoutNode> r3 = nodeCoordinator.f3499o.r();
            int i10 = r3.f11334k;
            if (i10 > 0) {
                LayoutNode[] layoutNodeArr = r3.f11332i;
                g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i11 = 0;
                do {
                    LayoutNode layoutNode = layoutNodeArr[i11];
                    LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
                    layoutNode.getClass();
                    layoutNode.F = usageByParent;
                    i11++;
                } while (i11 < i10);
                LayoutNode layoutNode2 = nodeCoordinator.f3499o;
                q qVar = layoutNode2.f3425u;
                LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNode2.K.f3453l;
                g.c(lookaheadPassDelegate);
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                layoutNodeLayoutDelegate.f3443a.n();
                z10 = lookaheadPassDelegate.f3461u;
                e<p> eVar = lookaheadPassDelegate.f3460t;
                if (!z10) {
                    m0.b.s(layoutNodeLayoutDelegate.f3443a, eVar, LayoutNodeLayoutDelegate$LookaheadPassDelegate$childMeasurables$2.f3464j);
                    lookaheadPassDelegate.f3461u = false;
                }
                r.H0(this, qVar.a(this, eVar.e(), j2));
                return this;
            }
            LayoutNode layoutNode22 = nodeCoordinator.f3499o;
            q qVar2 = layoutNode22.f3425u;
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate2 = layoutNode22.K.f3453l;
            g.c(lookaheadPassDelegate2);
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = LayoutNodeLayoutDelegate.this;
            layoutNodeLayoutDelegate2.f3443a.n();
            z10 = lookaheadPassDelegate2.f3461u;
            e<p> eVar2 = lookaheadPassDelegate2.f3460t;
            if (!z10) {
            }
            r.H0(this, qVar2.a(this, eVar2.e(), j2));
            return this;
        }

        @Override // l1.q
        public final int x0(j1.a aVar) {
            int i10;
            g.f(aVar, "alignmentLine");
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.f15760o.f3499o.K.f3453l;
            g.c(lookaheadPassDelegate);
            boolean z10 = lookaheadPassDelegate.f3454m;
            l1.p pVar = lookaheadPassDelegate.f3459s;
            if (!z10) {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                if (layoutNodeLayoutDelegate.f3444b == LayoutNode.LayoutState.LookaheadMeasuring) {
                    pVar.f3376f = true;
                    if (pVar.f3373b) {
                        layoutNodeLayoutDelegate.f3448g = true;
                        layoutNodeLayoutDelegate.f3449h = true;
                    }
                } else {
                    pVar.f3377g = true;
                }
            }
            r rVar = lookaheadPassDelegate.o().f3508x;
            if (rVar != null) {
                rVar.n = true;
            }
            lookaheadPassDelegate.x();
            r rVar2 = lookaheadPassDelegate.o().f3508x;
            if (rVar2 != null) {
                rVar2.n = false;
            }
            Integer num = (Integer) pVar.f3379i.get(aVar);
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = Integer.MIN_VALUE;
            }
            this.f15766u.put(aVar, Integer.valueOf(i10));
            return i10;
        }
    }

    /* renamed from: androidx.compose.ui.node.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0024b extends d.c {
        public final String toString() {
            return "<tail>";
        }
    }

    static {
        f fVar = new f();
        fVar.f(v0.r.f18130d);
        Paint paint = fVar.f18105a;
        g.f(paint, "<this>");
        paint.setStrokeWidth(1.0f);
        fVar.i(1);
        N = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LayoutNode layoutNode) {
        super(layoutNode);
        g.f(layoutNode, "layoutNode");
        C0024b c0024b = new C0024b();
        this.M = c0024b;
        c0024b.n = this;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final r K0(c cVar) {
        g.f(cVar, "scope");
        return new a(this, cVar);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final d.c U0() {
        return this.M;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.node.NodeCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T extends l1.b> void Z0(NodeCoordinator.c<T> cVar, long j2, l1.f<T> fVar, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        LayoutNode[] layoutNodeArr;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        g.f(cVar, "hitTestSource");
        g.f(fVar, "hitTestResult");
        LayoutNode layoutNode = this.f3499o;
        if (cVar.d(layoutNode)) {
            if (n1(j2)) {
                z12 = z11;
                z13 = true;
            } else if (z10) {
                float L0 = L0(j2, S0());
                if (!Float.isInfinite(L0) && !Float.isNaN(L0)) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    z13 = true;
                    z12 = false;
                }
            }
            if (!z13) {
                int i10 = fVar.f15731k;
                e<LayoutNode> q10 = layoutNode.q();
                int i11 = q10.f11334k;
                if (i11 > 0) {
                    LayoutNode[] layoutNodeArr2 = q10.f11332i;
                    g.d(layoutNodeArr2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    int i12 = i11 - 1;
                    while (true) {
                        LayoutNode layoutNode2 = layoutNodeArr2[i12];
                        if (layoutNode2.A) {
                            layoutNodeArr = layoutNodeArr2;
                            cVar.c(layoutNode2, j2, fVar, z10, z12);
                            long c = fVar.c();
                            if (Float.intBitsToFloat((int) (c >> 32)) < 0.0f && m0.b.E0(c)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (!z15) {
                                z16 = true;
                            } else {
                                d.c V0 = layoutNode2.J.c.V0(m0.b.o0(16));
                                if (V0 != null) {
                                    d.c cVar2 = V0.f16825i;
                                    if (cVar2.f16830o) {
                                        if ((cVar2.f16827k & 16) != 0) {
                                            while (true) {
                                                cVar2 = cVar2.f16829m;
                                                if (cVar2 == null) {
                                                    break;
                                                } else if ((cVar2.f16826j & 16) != 0 && (cVar2 instanceof e0)) {
                                                    ((e0) cVar2).h();
                                                }
                                            }
                                        }
                                    } else {
                                        throw new IllegalStateException("Check failed.".toString());
                                    }
                                }
                                z16 = false;
                            }
                            if (!z16) {
                                z14 = true;
                                if (!z14 || i12 - 1 < 0) {
                                    break;
                                }
                                layoutNodeArr2 = layoutNodeArr;
                            }
                        } else {
                            layoutNodeArr = layoutNodeArr2;
                        }
                        z14 = false;
                        if (!z14) {
                            break;
                            break;
                        }
                        layoutNodeArr2 = layoutNodeArr;
                    }
                }
                fVar.f15731k = i10;
                return;
            }
            return;
        }
        z12 = z11;
        z13 = false;
        if (!z13) {
        }
    }

    @Override // j1.p
    public final b0 b(long j2) {
        w0(j2);
        LayoutNode layoutNode = this.f3499o;
        e<LayoutNode> r3 = layoutNode.r();
        int i10 = r3.f11334k;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = r3.f11332i;
            g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                LayoutNode layoutNode2 = layoutNodeArr[i11];
                LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
                layoutNode2.getClass();
                layoutNode2.E = usageByParent;
                i11++;
            } while (i11 < i10);
            j1(layoutNode.f3425u.a(this, layoutNode.m(), j2));
            f1();
            return this;
        }
        j1(layoutNode.f3425u.a(this, layoutNode.m(), j2));
        f1();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.node.NodeCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h1(o oVar) {
        g.f(oVar, "canvas");
        LayoutNode layoutNode = this.f3499o;
        l1.b0 b12 = m0.b.b1(layoutNode);
        e<LayoutNode> q10 = layoutNode.q();
        int i10 = q10.f11334k;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = q10.f11332i;
            g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                LayoutNode layoutNode2 = layoutNodeArr[i11];
                if (layoutNode2.A) {
                    layoutNode2.l(oVar);
                }
                i11++;
            } while (i11 < i10);
            if (!b12.getShowLayoutBounds()) {
                N0(oVar, N);
            }
        } else if (!b12.getShowLayoutBounds()) {
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, j1.b0
    public final void s0(long j2, float f10, l<? super u, n> lVar) {
        boolean z10;
        super.s0(j2, f10, lVar);
        if (this.f15759m) {
            return;
        }
        g1();
        LayoutNode layoutNode = this.f3499o;
        LayoutNode p10 = layoutNode.p();
        v vVar = layoutNode.J;
        b bVar = vVar.f15779b;
        float f11 = bVar.A;
        NodeCoordinator nodeCoordinator = vVar.c;
        while (nodeCoordinator != bVar) {
            g.d(nodeCoordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            l1.l lVar2 = (l1.l) nodeCoordinator;
            f11 += lVar2.A;
            nodeCoordinator = lVar2.f3500p;
        }
        boolean z11 = false;
        if (f11 == layoutNode.L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            layoutNode.L = f11;
            if (p10 != null) {
                p10.F();
            }
            if (p10 != null) {
                p10.u();
            }
        }
        if (!layoutNode.A) {
            if (p10 != null) {
                p10.u();
            }
            layoutNode.B();
        }
        if (p10 != null) {
            if (!layoutNode.R && p10.K.f3444b == LayoutNode.LayoutState.LayingOut) {
                if (layoutNode.B == Integer.MAX_VALUE) {
                    z11 = true;
                }
                if (z11) {
                    int i10 = p10.D;
                    layoutNode.B = i10;
                    p10.D = i10 + 1;
                } else {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
            }
        } else {
            layoutNode.B = 0;
        }
        layoutNode.K.f3452k.x();
    }

    @Override // l1.q
    public final int x0(j1.a aVar) {
        g.f(aVar, "alignmentLine");
        r rVar = this.f3508x;
        if (rVar != null) {
            return rVar.x0(aVar);
        }
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = (LayoutNodeLayoutDelegate.MeasurePassDelegate) R0();
        boolean z10 = measurePassDelegate.f3474o;
        l1.n nVar = measurePassDelegate.f3479t;
        if (!z10) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.f3444b == LayoutNode.LayoutState.Measuring) {
                nVar.f3376f = true;
                if (nVar.f3373b) {
                    layoutNodeLayoutDelegate.f3445d = true;
                    layoutNodeLayoutDelegate.f3446e = true;
                }
            } else {
                nVar.f3377g = true;
            }
        }
        measurePassDelegate.o().n = true;
        measurePassDelegate.x();
        measurePassDelegate.o().n = false;
        Integer num = (Integer) nVar.f3379i.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
