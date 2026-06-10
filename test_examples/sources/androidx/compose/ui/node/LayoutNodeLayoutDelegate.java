package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import b2.g;
import b2.h;
import h0.e;
import j0.c;
import j1.b0;
import j1.p;
import java.util.List;
import l1.r;
import m7.n;
import u7.l;
import v0.u;

/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final LayoutNode f3443a;

    /* renamed from: b  reason: collision with root package name */
    public LayoutNode.LayoutState f3444b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3445d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3446e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3447f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3448g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3449h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3450i;

    /* renamed from: j  reason: collision with root package name */
    public int f3451j;

    /* renamed from: k  reason: collision with root package name */
    public final MeasurePassDelegate f3452k;

    /* renamed from: l  reason: collision with root package name */
    public LookaheadPassDelegate f3453l;

    /* loaded from: classes.dex */
    public final class LookaheadPassDelegate extends b0 implements p, l1.a {

        /* renamed from: m  reason: collision with root package name */
        public boolean f3454m;
        public boolean n;

        /* renamed from: o  reason: collision with root package name */
        public b2.a f3455o;

        /* renamed from: r  reason: collision with root package name */
        public boolean f3458r;

        /* renamed from: v  reason: collision with root package name */
        public Object f3462v;

        /* renamed from: p  reason: collision with root package name */
        public long f3456p = g.f6344b;

        /* renamed from: q  reason: collision with root package name */
        public boolean f3457q = true;

        /* renamed from: s  reason: collision with root package name */
        public final l1.p f3459s = new l1.p(this);

        /* renamed from: t  reason: collision with root package name */
        public final e<p> f3460t = new e<>(new p[16]);

        /* renamed from: u  reason: collision with root package name */
        public boolean f3461u = true;

        public LookaheadPassDelegate(c cVar) {
            this.f3462v = LayoutNodeLayoutDelegate.this.f3452k.f3478s;
        }

        public final void A0() {
            e<LayoutNode> r3 = LayoutNodeLayoutDelegate.this.f3443a.r();
            int i10 = r3.f11334k;
            if (i10 > 0) {
                LayoutNode[] layoutNodeArr = r3.f11332i;
                v7.g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i11 = 0;
                do {
                    LayoutNode layoutNode = layoutNodeArr[i11];
                    layoutNode.getClass();
                    LayoutNode.N(layoutNode);
                    LookaheadPassDelegate lookaheadPassDelegate = layoutNode.K.f3453l;
                    v7.g.c(lookaheadPassDelegate);
                    lookaheadPassDelegate.A0();
                    i11++;
                } while (i11 < i10);
            }
        }

        @Override // l1.a
        public final boolean B() {
            return this.f3457q;
        }

        @Override // l1.a
        public final void Z() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f3443a;
            LayoutNode.b bVar = LayoutNode.S;
            layoutNode.K(false);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
        @Override // j1.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final b0 b(long j2) {
            boolean z10;
            LayoutNode.UsageByParent usageByParent;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f3443a;
            LayoutNode p10 = layoutNode.p();
            LayoutNode.UsageByParent usageByParent2 = LayoutNode.UsageByParent.NotUsed;
            if (p10 != null) {
                if (layoutNode.F != usageByParent2 && !layoutNode.I) {
                    z10 = false;
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = p10.K;
                    if (!z10) {
                        int ordinal = layoutNodeLayoutDelegate2.f3444b.ordinal();
                        if (ordinal != 0 && ordinal != 1) {
                            if (ordinal != 2 && ordinal != 3) {
                                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + layoutNodeLayoutDelegate2.f3444b);
                            }
                            usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                        } else {
                            usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                        }
                        layoutNode.F = usageByParent;
                    } else {
                        throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + layoutNode.F + ". Parent state " + layoutNodeLayoutDelegate2.f3444b + '.').toString());
                    }
                }
                z10 = true;
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate22 = p10.K;
                if (!z10) {
                }
            } else {
                layoutNode.F = usageByParent2;
            }
            LayoutNode layoutNode2 = layoutNodeLayoutDelegate.f3443a;
            if (layoutNode2.G == usageByParent2) {
                layoutNode2.h();
            }
            z0(j2);
            return this;
        }

        @Override // l1.a
        public final AlignmentLines f() {
            return this.f3459s;
        }

        @Override // j1.u
        public final int f0(j1.a aVar) {
            LayoutNode.LayoutState layoutState;
            v7.g.f(aVar, "alignmentLine");
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode p10 = layoutNodeLayoutDelegate.f3443a.p();
            LayoutNode.LayoutState layoutState2 = null;
            if (p10 != null) {
                layoutState = p10.K.f3444b;
            } else {
                layoutState = null;
            }
            LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.LookaheadMeasuring;
            l1.p pVar = this.f3459s;
            if (layoutState == layoutState3) {
                pVar.c = true;
            } else {
                LayoutNode p11 = layoutNodeLayoutDelegate.f3443a.p();
                if (p11 != null) {
                    layoutState2 = p11.K.f3444b;
                }
                if (layoutState2 == LayoutNode.LayoutState.LookaheadLayingOut) {
                    pVar.f3374d = true;
                }
            }
            this.f3454m = true;
            r rVar = layoutNodeLayoutDelegate.a().f3508x;
            v7.g.c(rVar);
            int f02 = rVar.f0(aVar);
            this.f3454m = false;
            return f02;
        }

        @Override // j1.f
        public final Object n() {
            return this.f3462v;
        }

        @Override // j1.b0
        public final int n0() {
            r rVar = LayoutNodeLayoutDelegate.this.a().f3508x;
            v7.g.c(rVar);
            return rVar.n0();
        }

        @Override // l1.a
        public final b o() {
            return LayoutNodeLayoutDelegate.this.f3443a.J.f15779b;
        }

        @Override // j1.b0
        public final int q0() {
            r rVar = LayoutNodeLayoutDelegate.this.a().f3508x;
            v7.g.c(rVar);
            return rVar.q0();
        }

        @Override // l1.a
        public final void r(l<? super l1.a, n> lVar) {
            v7.g.f(lVar, "block");
            List<LayoutNode> n = LayoutNodeLayoutDelegate.this.f3443a.n();
            int size = n.size();
            for (int i10 = 0; i10 < size; i10++) {
                LookaheadPassDelegate lookaheadPassDelegate = n.get(i10).K.f3453l;
                v7.g.c(lookaheadPassDelegate);
                lVar.U(lookaheadPassDelegate);
            }
        }

        @Override // l1.a
        public final void requestLayout() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f3443a;
            LayoutNode.b bVar = LayoutNode.S;
            layoutNode.J(false);
        }

        @Override // j1.b0
        public final void s0(long j2, float f10, l<? super u, n> lVar) {
            l<LayoutNode, n> lVar2;
            LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            layoutNodeLayoutDelegate.f3444b = layoutState;
            boolean z10 = true;
            this.n = true;
            long j10 = this.f3456p;
            int i10 = g.c;
            if (j2 != j10) {
                z10 = false;
            }
            if (!z10) {
                y0();
            }
            this.f3459s.f3377g = false;
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f3443a;
            l1.b0 b12 = m0.b.b1(layoutNode);
            if (layoutNodeLayoutDelegate.f3450i) {
                layoutNodeLayoutDelegate.f3450i = false;
                layoutNodeLayoutDelegate.c(layoutNodeLayoutDelegate.f3451j - 1);
            }
            OwnerSnapshotObserver snapshotObserver = b12.getSnapshotObserver();
            LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$1 layoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$1 = new LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$1(layoutNodeLayoutDelegate, j2);
            snapshotObserver.getClass();
            v7.g.f(layoutNode, "node");
            if (layoutNode.f3428x != null) {
                lVar2 = snapshotObserver.f3541f;
            } else {
                lVar2 = snapshotObserver.f3540e;
            }
            snapshotObserver.b(layoutNode, lVar2, layoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$1);
            this.f3456p = j2;
            layoutNodeLayoutDelegate.f3444b = LayoutNode.LayoutState.Idle;
        }

        @Override // l1.a
        public final l1.a v() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
            LayoutNode p10 = LayoutNodeLayoutDelegate.this.f3443a.p();
            if (p10 != null && (layoutNodeLayoutDelegate = p10.K) != null) {
                return layoutNodeLayoutDelegate.f3453l;
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
        @Override // l1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void x() {
            r rVar;
            l<LayoutNode, n> lVar;
            e<LayoutNode> r3;
            int i10;
            l1.p pVar = this.f3459s;
            pVar.i();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            boolean z10 = layoutNodeLayoutDelegate.f3448g;
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f3443a;
            if (z10 && (i10 = (r3 = layoutNode.r()).f11334k) > 0) {
                LayoutNode[] layoutNodeArr = r3.f11332i;
                v7.g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i11 = 0;
                do {
                    LayoutNode layoutNode2 = layoutNodeArr[i11];
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode2.K;
                    if (layoutNodeLayoutDelegate2.f3447f && layoutNode2.F == LayoutNode.UsageByParent.InMeasureBlock) {
                        LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate2.f3453l;
                        v7.g.c(lookaheadPassDelegate);
                        b2.a aVar = this.f3455o;
                        v7.g.c(aVar);
                        if (lookaheadPassDelegate.z0(aVar.f6336a)) {
                            layoutNode.K(false);
                        }
                    }
                    i11++;
                } while (i11 < i10);
                rVar = o().f3508x;
                v7.g.c(rVar);
                if (!layoutNodeLayoutDelegate.f3449h) {
                }
                layoutNodeLayoutDelegate.f3448g = false;
                LayoutNode.LayoutState layoutState = layoutNodeLayoutDelegate.f3444b;
                layoutNodeLayoutDelegate.f3444b = LayoutNode.LayoutState.LookaheadLayingOut;
                OwnerSnapshotObserver snapshotObserver = m0.b.b1(layoutNode).getSnapshotObserver();
                LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1 layoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1 = new LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1(this, layoutNodeLayoutDelegate, rVar);
                snapshotObserver.getClass();
                v7.g.f(layoutNode, "node");
                if (layoutNode.f3428x == null) {
                }
                snapshotObserver.b(layoutNode, lVar, layoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1);
                layoutNodeLayoutDelegate.f3444b = layoutState;
                if (layoutNodeLayoutDelegate.f3450i) {
                    requestLayout();
                }
                layoutNodeLayoutDelegate.f3449h = false;
                if (pVar.f3374d) {
                }
                if (!pVar.f3373b) {
                }
                return;
            }
            rVar = o().f3508x;
            v7.g.c(rVar);
            if (!layoutNodeLayoutDelegate.f3449h || (!this.f3454m && !rVar.n && layoutNodeLayoutDelegate.f3448g)) {
                layoutNodeLayoutDelegate.f3448g = false;
                LayoutNode.LayoutState layoutState2 = layoutNodeLayoutDelegate.f3444b;
                layoutNodeLayoutDelegate.f3444b = LayoutNode.LayoutState.LookaheadLayingOut;
                OwnerSnapshotObserver snapshotObserver2 = m0.b.b1(layoutNode).getSnapshotObserver();
                LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1 layoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$12 = new LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1(this, layoutNodeLayoutDelegate, rVar);
                snapshotObserver2.getClass();
                v7.g.f(layoutNode, "node");
                if (layoutNode.f3428x == null) {
                    lVar = snapshotObserver2.f3542g;
                } else {
                    lVar = snapshotObserver2.f3539d;
                }
                snapshotObserver2.b(layoutNode, lVar, layoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$12);
                layoutNodeLayoutDelegate.f3444b = layoutState2;
                if (layoutNodeLayoutDelegate.f3450i && rVar.n) {
                    requestLayout();
                }
                layoutNodeLayoutDelegate.f3449h = false;
            }
            if (pVar.f3374d) {
                pVar.f3375e = true;
            }
            if (!pVar.f3373b && pVar.f()) {
                pVar.h();
            }
        }

        public final void x0() {
            int i10 = 0;
            this.f3457q = false;
            e<LayoutNode> r3 = LayoutNodeLayoutDelegate.this.f3443a.r();
            int i11 = r3.f11334k;
            if (i11 > 0) {
                LayoutNode[] layoutNodeArr = r3.f11332i;
                v7.g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    LookaheadPassDelegate lookaheadPassDelegate = layoutNodeArr[i10].K.f3453l;
                    v7.g.c(lookaheadPassDelegate);
                    lookaheadPassDelegate.x0();
                    i10++;
                } while (i10 < i11);
            }
        }

        public final void y0() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.f3451j > 0) {
                List<LayoutNode> n = layoutNodeLayoutDelegate.f3443a.n();
                int size = n.size();
                for (int i10 = 0; i10 < size; i10++) {
                    LayoutNode layoutNode = n.get(i10);
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode.K;
                    if (layoutNodeLayoutDelegate2.f3450i && !layoutNodeLayoutDelegate2.f3445d) {
                        layoutNode.J(false);
                    }
                    LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate2.f3453l;
                    if (lookaheadPassDelegate != null) {
                        lookaheadPassDelegate.y0();
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean z0(long j2) {
            boolean z10;
            r rVar;
            boolean z11;
            l<LayoutNode, n> lVar;
            boolean b5;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode p10 = layoutNodeLayoutDelegate.f3443a.p();
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f3443a;
            if (!layoutNode.I && (p10 == null || !p10.I)) {
                z10 = false;
                layoutNode.I = z10;
                if (!layoutNode.K.f3447f) {
                    b2.a aVar = this.f3455o;
                    if (aVar == null) {
                        b5 = false;
                    } else {
                        b5 = b2.a.b(aVar.f6336a, j2);
                    }
                    if (b5) {
                        return false;
                    }
                }
                this.f3455o = new b2.a(j2);
                this.f3459s.f3376f = false;
                r(LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$1.f3472j);
                rVar = layoutNodeLayoutDelegate.a().f3508x;
                if (rVar == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    long f10 = v8.b.f(rVar.f12640i, rVar.f12641j);
                    layoutNodeLayoutDelegate.f3444b = LayoutNode.LayoutState.LookaheadMeasuring;
                    layoutNodeLayoutDelegate.f3447f = false;
                    OwnerSnapshotObserver snapshotObserver = m0.b.b1(layoutNode).getSnapshotObserver();
                    LayoutNodeLayoutDelegate$performLookaheadMeasure$1 layoutNodeLayoutDelegate$performLookaheadMeasure$1 = new LayoutNodeLayoutDelegate$performLookaheadMeasure$1(layoutNodeLayoutDelegate, j2);
                    snapshotObserver.getClass();
                    if (layoutNode.f3428x != null) {
                        lVar = snapshotObserver.f3538b;
                    } else {
                        lVar = snapshotObserver.c;
                    }
                    snapshotObserver.b(layoutNode, lVar, layoutNodeLayoutDelegate$performLookaheadMeasure$1);
                    layoutNodeLayoutDelegate.f3448g = true;
                    layoutNodeLayoutDelegate.f3449h = true;
                    if (LayoutNodeLayoutDelegate.b(layoutNode)) {
                        layoutNodeLayoutDelegate.f3445d = true;
                        layoutNodeLayoutDelegate.f3446e = true;
                    } else {
                        layoutNodeLayoutDelegate.c = true;
                    }
                    layoutNodeLayoutDelegate.f3444b = LayoutNode.LayoutState.Idle;
                    v0(v8.b.f(rVar.f12640i, rVar.f12641j));
                    if (((int) (f10 >> 32)) != rVar.f12640i || h.b(f10) != rVar.f12641j) {
                        return true;
                    }
                    return false;
                }
                throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
            }
            z10 = true;
            layoutNode.I = z10;
            if (!layoutNode.K.f3447f) {
            }
            this.f3455o = new b2.a(j2);
            this.f3459s.f3376f = false;
            r(LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$1.f3472j);
            rVar = layoutNodeLayoutDelegate.a().f3508x;
            if (rVar == null) {
            }
            if (!z11) {
            }
        }
    }

    /* loaded from: classes.dex */
    public final class MeasurePassDelegate extends b0 implements p, l1.a {

        /* renamed from: m  reason: collision with root package name */
        public boolean f3473m;
        public boolean n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f3474o;

        /* renamed from: q  reason: collision with root package name */
        public l<? super u, n> f3476q;

        /* renamed from: r  reason: collision with root package name */
        public float f3477r;

        /* renamed from: s  reason: collision with root package name */
        public Object f3478s;

        /* renamed from: p  reason: collision with root package name */
        public long f3475p = g.f6344b;

        /* renamed from: t  reason: collision with root package name */
        public final l1.n f3479t = new l1.n(this);

        /* renamed from: u  reason: collision with root package name */
        public final e<p> f3480u = new e<>(new p[16]);

        /* renamed from: v  reason: collision with root package name */
        public boolean f3481v = true;

        public MeasurePassDelegate() {
        }

        @Override // l1.a
        public final boolean B() {
            return LayoutNodeLayoutDelegate.this.f3443a.A;
        }

        @Override // l1.a
        public final void Z() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f3443a;
            LayoutNode.b bVar = LayoutNode.S;
            layoutNode.M(false);
        }

        @Override // j1.p
        public final b0 b(long j2) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f3443a;
            LayoutNode.UsageByParent usageByParent2 = layoutNode.G;
            LayoutNode.UsageByParent usageByParent3 = LayoutNode.UsageByParent.NotUsed;
            if (usageByParent2 == usageByParent3) {
                layoutNode.h();
            }
            LayoutNode layoutNode2 = layoutNodeLayoutDelegate.f3443a;
            boolean z10 = true;
            if (LayoutNodeLayoutDelegate.b(layoutNode2)) {
                this.f3473m = true;
                w0(j2);
                layoutNode2.getClass();
                layoutNode2.F = usageByParent3;
                LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.f3453l;
                v7.g.c(lookaheadPassDelegate);
                lookaheadPassDelegate.b(j2);
            }
            LayoutNode p10 = layoutNode2.p();
            if (p10 != null) {
                if (layoutNode2.E != usageByParent3 && !layoutNode2.I) {
                    z10 = false;
                }
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = p10.K;
                if (z10) {
                    int ordinal = layoutNodeLayoutDelegate2.f3444b.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 2) {
                            usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                        } else {
                            throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + layoutNodeLayoutDelegate2.f3444b);
                        }
                    } else {
                        usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                    }
                    layoutNode2.E = usageByParent;
                } else {
                    throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + layoutNode2.E + ". Parent state " + layoutNodeLayoutDelegate2.f3444b + '.').toString());
                }
            } else {
                layoutNode2.E = usageByParent3;
            }
            z0(j2);
            return this;
        }

        @Override // l1.a
        public final AlignmentLines f() {
            return this.f3479t;
        }

        @Override // j1.u
        public final int f0(j1.a aVar) {
            LayoutNode.LayoutState layoutState;
            v7.g.f(aVar, "alignmentLine");
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode p10 = layoutNodeLayoutDelegate.f3443a.p();
            LayoutNode.LayoutState layoutState2 = null;
            if (p10 != null) {
                layoutState = p10.K.f3444b;
            } else {
                layoutState = null;
            }
            LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.Measuring;
            l1.n nVar = this.f3479t;
            if (layoutState == layoutState3) {
                nVar.c = true;
            } else {
                LayoutNode p11 = layoutNodeLayoutDelegate.f3443a.p();
                if (p11 != null) {
                    layoutState2 = p11.K.f3444b;
                }
                if (layoutState2 == LayoutNode.LayoutState.LayingOut) {
                    nVar.f3374d = true;
                }
            }
            this.f3474o = true;
            int f02 = layoutNodeLayoutDelegate.a().f0(aVar);
            this.f3474o = false;
            return f02;
        }

        @Override // j1.f
        public final Object n() {
            return this.f3478s;
        }

        @Override // j1.b0
        public final int n0() {
            return LayoutNodeLayoutDelegate.this.a().n0();
        }

        @Override // l1.a
        public final b o() {
            return LayoutNodeLayoutDelegate.this.f3443a.J.f15779b;
        }

        @Override // j1.b0
        public final int q0() {
            return LayoutNodeLayoutDelegate.this.a().q0();
        }

        @Override // l1.a
        public final void r(l<? super l1.a, n> lVar) {
            v7.g.f(lVar, "block");
            List<LayoutNode> n = LayoutNodeLayoutDelegate.this.f3443a.n();
            int size = n.size();
            for (int i10 = 0; i10 < size; i10++) {
                lVar.U(n.get(i10).K.f3452k);
            }
        }

        @Override // l1.a
        public final void requestLayout() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f3443a;
            LayoutNode.b bVar = LayoutNode.S;
            layoutNode.L(false);
        }

        @Override // j1.b0
        public final void s0(long j2, float f10, l<? super u, n> lVar) {
            boolean z10;
            long j10 = this.f3475p;
            int i10 = g.c;
            if (j2 == j10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                x0();
            }
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (LayoutNodeLayoutDelegate.b(layoutNodeLayoutDelegate.f3443a)) {
                b0.a.C0134a c0134a = b0.a.f12644a;
                LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.f3453l;
                v7.g.c(lookaheadPassDelegate);
                b0.a.c(c0134a, lookaheadPassDelegate, (int) (j2 >> 32), g.a(j2));
            }
            layoutNodeLayoutDelegate.f3444b = LayoutNode.LayoutState.LayingOut;
            y0(j2, f10, lVar);
            layoutNodeLayoutDelegate.f3444b = LayoutNode.LayoutState.Idle;
        }

        @Override // l1.a
        public final l1.a v() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
            LayoutNode p10 = LayoutNodeLayoutDelegate.this.f3443a.p();
            if (p10 != null && (layoutNodeLayoutDelegate = p10.K) != null) {
                return layoutNodeLayoutDelegate.f3452k;
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
        @Override // l1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void x() {
            e<LayoutNode> r3;
            int i10;
            b2.a aVar;
            l1.n nVar = this.f3479t;
            nVar.i();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            boolean z10 = layoutNodeLayoutDelegate.f3445d;
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f3443a;
            if (z10 && (i10 = (r3 = layoutNode.r()).f11334k) > 0) {
                LayoutNode[] layoutNodeArr = r3.f11332i;
                v7.g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i11 = 0;
                do {
                    LayoutNode layoutNode2 = layoutNodeArr[i11];
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode2.K;
                    if (layoutNodeLayoutDelegate2.c && layoutNode2.E == LayoutNode.UsageByParent.InMeasureBlock) {
                        MeasurePassDelegate measurePassDelegate = layoutNodeLayoutDelegate2.f3452k;
                        if (measurePassDelegate.f3473m) {
                            aVar = new b2.a(measurePassDelegate.f12643l);
                        } else {
                            aVar = null;
                        }
                        if (layoutNode2.G(aVar)) {
                            layoutNode.M(false);
                        }
                    }
                    i11++;
                } while (i11 < i10);
                if (!layoutNodeLayoutDelegate.f3446e) {
                }
                layoutNodeLayoutDelegate.f3445d = false;
                LayoutNode.LayoutState layoutState = layoutNodeLayoutDelegate.f3444b;
                layoutNodeLayoutDelegate.f3444b = LayoutNode.LayoutState.LayingOut;
                OwnerSnapshotObserver snapshotObserver = m0.b.b1(layoutNode).getSnapshotObserver();
                LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1 layoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1 = new LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1(layoutNodeLayoutDelegate, this, layoutNode);
                snapshotObserver.getClass();
                snapshotObserver.b(layoutNode, snapshotObserver.f3539d, layoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1);
                layoutNodeLayoutDelegate.f3444b = layoutState;
                if (o().n) {
                    requestLayout();
                }
                layoutNodeLayoutDelegate.f3446e = false;
                if (nVar.f3374d) {
                }
                if (!nVar.f3373b) {
                }
                return;
            }
            if (!layoutNodeLayoutDelegate.f3446e || (!this.f3474o && !o().n && layoutNodeLayoutDelegate.f3445d)) {
                layoutNodeLayoutDelegate.f3445d = false;
                LayoutNode.LayoutState layoutState2 = layoutNodeLayoutDelegate.f3444b;
                layoutNodeLayoutDelegate.f3444b = LayoutNode.LayoutState.LayingOut;
                OwnerSnapshotObserver snapshotObserver2 = m0.b.b1(layoutNode).getSnapshotObserver();
                LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1 layoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$12 = new LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1(layoutNodeLayoutDelegate, this, layoutNode);
                snapshotObserver2.getClass();
                snapshotObserver2.b(layoutNode, snapshotObserver2.f3539d, layoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$12);
                layoutNodeLayoutDelegate.f3444b = layoutState2;
                if (o().n && layoutNodeLayoutDelegate.f3450i) {
                    requestLayout();
                }
                layoutNodeLayoutDelegate.f3446e = false;
            }
            if (nVar.f3374d) {
                nVar.f3375e = true;
            }
            if (!nVar.f3373b && nVar.f()) {
                nVar.h();
            }
        }

        public final void x0() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.f3451j > 0) {
                List<LayoutNode> n = layoutNodeLayoutDelegate.f3443a.n();
                int size = n.size();
                for (int i10 = 0; i10 < size; i10++) {
                    LayoutNode layoutNode = n.get(i10);
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode.K;
                    if (layoutNodeLayoutDelegate2.f3450i && !layoutNodeLayoutDelegate2.f3445d) {
                        layoutNode.L(false);
                    }
                    layoutNodeLayoutDelegate2.f3452k.x0();
                }
            }
        }

        public final void y0(long j2, float f10, l<? super u, n> lVar) {
            this.f3475p = j2;
            this.f3477r = f10;
            this.f3476q = lVar;
            this.n = true;
            this.f3479t.f3377g = false;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.f3450i) {
                layoutNodeLayoutDelegate.f3450i = false;
                layoutNodeLayoutDelegate.c(layoutNodeLayoutDelegate.f3451j - 1);
            }
            OwnerSnapshotObserver snapshotObserver = m0.b.b1(layoutNodeLayoutDelegate.f3443a).getSnapshotObserver();
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f3443a;
            LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinator$1 layoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinator$1 = new LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinator$1(lVar, layoutNodeLayoutDelegate, j2, f10);
            snapshotObserver.getClass();
            v7.g.f(layoutNode, "node");
            snapshotObserver.b(layoutNode, snapshotObserver.f3540e, layoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinator$1);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean z0(long j2) {
            boolean z10;
            LayoutNode.LayoutState layoutState;
            LayoutNode.LayoutState layoutState2;
            boolean z11;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            l1.b0 b12 = m0.b.b1(layoutNodeLayoutDelegate.f3443a);
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f3443a;
            LayoutNode p10 = layoutNode.p();
            boolean z12 = true;
            if (!layoutNode.I && (p10 == null || !p10.I)) {
                z10 = false;
                layoutNode.I = z10;
                if (!layoutNode.K.c && b2.a.b(this.f12643l, j2)) {
                    b12.p(layoutNode);
                    layoutNode.O();
                    return false;
                }
                this.f3479t.f3376f = false;
                r(LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$1.f3493j);
                this.f3473m = true;
                long j10 = layoutNodeLayoutDelegate.a().f12642k;
                w0(j2);
                layoutState = layoutNodeLayoutDelegate.f3444b;
                layoutState2 = LayoutNode.LayoutState.Idle;
                if (layoutState != layoutState2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.Measuring;
                    layoutNodeLayoutDelegate.f3444b = layoutState3;
                    layoutNodeLayoutDelegate.c = false;
                    OwnerSnapshotObserver snapshotObserver = m0.b.b1(layoutNode).getSnapshotObserver();
                    LayoutNodeLayoutDelegate$performMeasure$2 layoutNodeLayoutDelegate$performMeasure$2 = new LayoutNodeLayoutDelegate$performMeasure$2(layoutNodeLayoutDelegate, j2);
                    snapshotObserver.getClass();
                    snapshotObserver.b(layoutNode, snapshotObserver.c, layoutNodeLayoutDelegate$performMeasure$2);
                    if (layoutNodeLayoutDelegate.f3444b == layoutState3) {
                        layoutNodeLayoutDelegate.f3445d = true;
                        layoutNodeLayoutDelegate.f3446e = true;
                        layoutNodeLayoutDelegate.f3444b = layoutState2;
                    }
                    if (h.a(layoutNodeLayoutDelegate.a().f12642k, j10) && layoutNodeLayoutDelegate.a().f12640i == this.f12640i && layoutNodeLayoutDelegate.a().f12641j == this.f12641j) {
                        z12 = false;
                    }
                    v0(v8.b.f(layoutNodeLayoutDelegate.a().f12640i, layoutNodeLayoutDelegate.a().f12641j));
                    return z12;
                }
                throw new IllegalStateException("layout state is not idle before measure starts".toString());
            }
            z10 = true;
            layoutNode.I = z10;
            if (!layoutNode.K.c) {
                b12.p(layoutNode);
                layoutNode.O();
                return false;
            }
            this.f3479t.f3376f = false;
            r(LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$1.f3493j);
            this.f3473m = true;
            long j102 = layoutNodeLayoutDelegate.a().f12642k;
            w0(j2);
            layoutState = layoutNodeLayoutDelegate.f3444b;
            layoutState2 = LayoutNode.LayoutState.Idle;
            if (layoutState != layoutState2) {
            }
            if (!z11) {
            }
        }
    }

    public LayoutNodeLayoutDelegate(LayoutNode layoutNode) {
        v7.g.f(layoutNode, "layoutNode");
        this.f3443a = layoutNode;
        this.f3444b = LayoutNode.LayoutState.Idle;
        this.f3452k = new MeasurePassDelegate();
    }

    public static boolean b(LayoutNode layoutNode) {
        LayoutNode layoutNode2;
        c cVar = layoutNode.f3428x;
        if (cVar != null) {
            layoutNode2 = (LayoutNode) cVar.f12625b;
        } else {
            layoutNode2 = null;
        }
        return v7.g.a(layoutNode2, layoutNode);
    }

    public final NodeCoordinator a() {
        return this.f3443a.J.c;
    }

    public final void c(int i10) {
        int i11 = this.f3451j;
        this.f3451j = i10;
        if ((i11 == 0) != (i10 == 0)) {
            LayoutNode p10 = this.f3443a.p();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = p10 != null ? p10.K : null;
            if (layoutNodeLayoutDelegate != null) {
                layoutNodeLayoutDelegate.c(i10 == 0 ? layoutNodeLayoutDelegate.f3451j - 1 : layoutNodeLayoutDelegate.f3451j + 1);
            }
        }
    }
}
