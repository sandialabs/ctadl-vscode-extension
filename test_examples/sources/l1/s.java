package l1;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.TreeSet;
import androidx.compose.ui.unit.LayoutDirection;
import j1.b0;
import kotlin.NoWhenBranchMatchedException;
import l1.b0;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final LayoutNode f15767a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.compose.ui.node.a f15768b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final y f15769d;

    /* renamed from: e  reason: collision with root package name */
    public final h0.e<b0.a> f15770e;

    /* renamed from: f  reason: collision with root package name */
    public final long f15771f;

    /* renamed from: g  reason: collision with root package name */
    public final h0.e<a> f15772g;

    /* renamed from: h  reason: collision with root package name */
    public b2.a f15773h;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final LayoutNode f15774a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f15775b;
        public final boolean c;

        public a(LayoutNode layoutNode, boolean z10, boolean z11) {
            v7.g.f(layoutNode, "node");
            this.f15774a = layoutNode;
            this.f15775b = z10;
            this.c = z11;
        }
    }

    public s(LayoutNode layoutNode) {
        v7.g.f(layoutNode, "root");
        this.f15767a = layoutNode;
        this.f15768b = new androidx.compose.ui.node.a();
        this.f15769d = new y();
        this.f15770e = new h0.e<>(new b0.a[16]);
        this.f15771f = 1L;
        this.f15772g = new h0.e<>(new a[16]);
    }

    public static boolean e(LayoutNode layoutNode) {
        boolean z10;
        p pVar;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.K;
        if (!layoutNodeLayoutDelegate.f3448g) {
            return false;
        }
        if (layoutNode.F != LayoutNode.UsageByParent.InMeasureBlock) {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.f3453l;
            if (lookaheadPassDelegate != null && (pVar = lookaheadPassDelegate.f3459s) != null && pVar.f()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final void a(boolean z10) {
        y yVar = this.f15769d;
        if (z10) {
            yVar.getClass();
            LayoutNode layoutNode = this.f15767a;
            v7.g.f(layoutNode, "rootNode");
            h0.e<LayoutNode> eVar = yVar.f15791a;
            eVar.g();
            eVar.b(layoutNode);
            layoutNode.Q = true;
        }
        x xVar = x.f15790a;
        h0.e<LayoutNode> eVar2 = yVar.f15791a;
        eVar2.p(xVar);
        int i10 = eVar2.f11334k;
        if (i10 > 0) {
            int i11 = i10 - 1;
            LayoutNode[] layoutNodeArr = eVar2.f11332i;
            v7.g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode2 = layoutNodeArr[i11];
                if (layoutNode2.Q) {
                    y.a(layoutNode2);
                }
                i11--;
            } while (i11 >= 0);
            eVar2.g();
        }
        eVar2.g();
    }

    public final boolean b(LayoutNode layoutNode, b2.a aVar) {
        b2.a aVar2;
        boolean z02;
        j0.c cVar = layoutNode.f3428x;
        if (cVar == null) {
            return false;
        }
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.K;
        if (aVar != null) {
            if (cVar != null) {
                LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.f3453l;
                v7.g.c(lookaheadPassDelegate);
                z02 = lookaheadPassDelegate.z0(aVar.f6336a);
            }
            z02 = false;
        } else {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate2 = layoutNodeLayoutDelegate.f3453l;
            if (lookaheadPassDelegate2 != null) {
                aVar2 = lookaheadPassDelegate2.f3455o;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null && cVar != null) {
                v7.g.c(lookaheadPassDelegate2);
                z02 = lookaheadPassDelegate2.z0(aVar2.f6336a);
            }
            z02 = false;
        }
        LayoutNode p10 = layoutNode.p();
        if (z02 && p10 != null) {
            if (p10.f3428x == null) {
                n(p10, false);
            } else {
                LayoutNode.UsageByParent usageByParent = layoutNode.F;
                if (usageByParent == LayoutNode.UsageByParent.InMeasureBlock) {
                    l(p10, false);
                } else if (usageByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                    k(p10, false);
                }
            }
        }
        return z02;
    }

    public final boolean c(LayoutNode layoutNode, b2.a aVar) {
        b2.a aVar2;
        boolean G;
        if (aVar != null) {
            G = layoutNode.G(aVar);
        } else {
            LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = layoutNode.K.f3452k;
            if (measurePassDelegate.f3473m) {
                aVar2 = new b2.a(measurePassDelegate.f12643l);
            } else {
                aVar2 = null;
            }
            G = layoutNode.G(aVar2);
        }
        LayoutNode p10 = layoutNode.p();
        if (G && p10 != null) {
            LayoutNode.UsageByParent usageByParent = layoutNode.E;
            if (usageByParent == LayoutNode.UsageByParent.InMeasureBlock) {
                n(p10, false);
            } else if (usageByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                m(p10, false);
            }
        }
        return G;
    }

    public final void d(LayoutNode layoutNode) {
        v7.g.f(layoutNode, "layoutNode");
        androidx.compose.ui.node.a aVar = this.f15768b;
        if (aVar.f3550a.isEmpty()) {
            return;
        }
        if (this.c) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.K;
            if (!layoutNodeLayoutDelegate.c) {
                h0.e<LayoutNode> r3 = layoutNode.r();
                int i10 = r3.f11334k;
                if (i10 > 0) {
                    LayoutNode[] layoutNodeArr = r3.f11332i;
                    v7.g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    int i11 = 0;
                    do {
                        LayoutNode layoutNode2 = layoutNodeArr[i11];
                        if (layoutNode2.K.c && aVar.b(layoutNode2)) {
                            i(layoutNode2);
                        }
                        if (!layoutNode2.K.c) {
                            d(layoutNode2);
                        }
                        i11++;
                    } while (i11 < i10);
                    if (!layoutNodeLayoutDelegate.c && aVar.b(layoutNode)) {
                        i(layoutNode);
                        return;
                    }
                    return;
                } else if (!layoutNodeLayoutDelegate.c) {
                    return;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Finally extract failed */
    public final boolean f(u7.a<m7.n> aVar) {
        boolean z10;
        androidx.compose.ui.node.a aVar2 = this.f15768b;
        LayoutNode layoutNode = this.f15767a;
        if (layoutNode.z()) {
            if (layoutNode.A) {
                if (!this.c) {
                    int i10 = 0;
                    if (this.f15773h != null) {
                        this.c = true;
                        try {
                            boolean isEmpty = aVar2.f3550a.isEmpty();
                            TreeSet<LayoutNode> treeSet = aVar2.f3550a;
                            if (!isEmpty) {
                                z10 = false;
                                while (!treeSet.isEmpty()) {
                                    LayoutNode first = treeSet.first();
                                    v7.g.e(first, "node");
                                    aVar2.b(first);
                                    boolean i11 = i(first);
                                    if (first == layoutNode && i11) {
                                        z10 = true;
                                    }
                                }
                                if (aVar != null) {
                                    aVar.k0();
                                }
                            } else {
                                z10 = false;
                            }
                            this.c = false;
                        } catch (Throwable th) {
                            this.c = false;
                            throw th;
                        }
                    } else {
                        z10 = false;
                    }
                    h0.e<b0.a> eVar = this.f15770e;
                    int i12 = eVar.f11334k;
                    if (i12 > 0) {
                        b0.a[] aVarArr = eVar.f11332i;
                        v7.g.d(aVarArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                        do {
                            aVarArr[i10].a();
                            i10++;
                        } while (i10 < i12);
                        eVar.g();
                        return z10;
                    }
                    eVar.g();
                    return z10;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void g() {
        LayoutNode layoutNode = this.f15767a;
        if (layoutNode.z()) {
            if (layoutNode.A) {
                if (!this.c) {
                    if (this.f15773h != null) {
                        this.c = true;
                        try {
                            h(layoutNode);
                            this.c = false;
                            return;
                        } catch (Throwable th) {
                            this.c = false;
                            throw th;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(LayoutNode layoutNode) {
        boolean z10;
        j(layoutNode);
        h0.e<LayoutNode> r3 = layoutNode.r();
        int i10 = r3.f11334k;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = r3.f11332i;
            v7.g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                LayoutNode layoutNode2 = layoutNodeArr[i11];
                if (layoutNode2.E != LayoutNode.UsageByParent.InMeasureBlock && !layoutNode2.K.f3452k.f3479t.f()) {
                    z10 = false;
                    if (z10) {
                        h(layoutNode2);
                    }
                    i11++;
                }
                z10 = true;
                if (z10) {
                }
                i11++;
            } while (i11 < i10);
            j(layoutNode);
        }
        j(layoutNode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x006d, code lost:
        r0 = r12.f15773h;
        v7.g.c(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(LayoutNode layoutNode) {
        boolean z10;
        boolean c;
        LayoutNode.UsageByParent usageByParent;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        p pVar;
        boolean z14;
        boolean z15 = layoutNode.A;
        ?? r22 = 0;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.K;
        if (!z15) {
            if (layoutNodeLayoutDelegate.c) {
                if (layoutNode.E != LayoutNode.UsageByParent.InMeasureBlock && !layoutNodeLayoutDelegate.f3452k.f3479t.f()) {
                    z14 = false;
                    if (z14) {
                        z11 = true;
                        if (!z11 && !v7.g.a(layoutNode.A(), Boolean.TRUE) && !e(layoutNode)) {
                            if (!layoutNodeLayoutDelegate.f3452k.f3479t.f()) {
                                LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate2 = layoutNodeLayoutDelegate.f3453l;
                                if (lookaheadPassDelegate2 != null && (pVar = lookaheadPassDelegate2.f3459s) != null && pVar.f()) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (!z13) {
                                    z12 = false;
                                    if (!z12) {
                                        return false;
                                    }
                                }
                            }
                            z12 = true;
                            if (!z12) {
                            }
                        }
                    }
                }
                z14 = true;
                if (z14) {
                }
            }
            z11 = false;
            if (!z11) {
                if (!layoutNodeLayoutDelegate.f3452k.f3479t.f()) {
                }
                z12 = true;
                if (!z12) {
                }
            }
        }
        boolean z16 = layoutNodeLayoutDelegate.f3447f;
        LayoutNode layoutNode2 = this.f15767a;
        androidx.compose.ui.node.b bVar = null;
        if (!z16 && !layoutNodeLayoutDelegate.c) {
            c = false;
            z10 = false;
            usageByParent = LayoutNode.UsageByParent.NotUsed;
            if ((!z10 || layoutNodeLayoutDelegate.f3448g) && v7.g.a(layoutNode.A(), Boolean.TRUE)) {
                if (layoutNode.G == usageByParent) {
                    layoutNode.i();
                }
                lookaheadPassDelegate = layoutNodeLayoutDelegate.f3453l;
                v7.g.c(lookaheadPassDelegate);
                if (!lookaheadPassDelegate.n) {
                    lookaheadPassDelegate.s0(lookaheadPassDelegate.f3456p, 0.0f, null);
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            if (layoutNodeLayoutDelegate.f3445d && layoutNode.A) {
                LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = layoutNodeLayoutDelegate.f3452k;
                if (layoutNode == layoutNode2) {
                    if (layoutNode.G == usageByParent) {
                        layoutNode.i();
                    }
                    b0.a.C0134a c0134a = b0.a.f12644a;
                    int q02 = measurePassDelegate.q0();
                    LayoutDirection layoutDirection = layoutNode.f3429y;
                    LayoutNode p10 = layoutNode.p();
                    if (p10 != null) {
                        bVar = p10.J.f15779b;
                    }
                    j1.h hVar = b0.a.f12646d;
                    c0134a.getClass();
                    int i11 = b0.a.c;
                    LayoutDirection layoutDirection2 = b0.a.f12645b;
                    b0.a.c = q02;
                    b0.a.f12645b = layoutDirection;
                    boolean i12 = b0.a.C0134a.i(c0134a, bVar);
                    b0.a.f(c0134a, measurePassDelegate, 0, 0);
                    if (bVar != null) {
                        bVar.n = i12;
                    }
                    b0.a.c = i11;
                    b0.a.f12645b = layoutDirection2;
                    b0.a.f12646d = hVar;
                } else {
                    if (layoutNode.G == usageByParent) {
                        layoutNode.i();
                    }
                    try {
                        layoutNode.R = true;
                        if (measurePassDelegate.n) {
                            measurePassDelegate.y0(measurePassDelegate.f3475p, measurePassDelegate.f3477r, measurePassDelegate.f3476q);
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } finally {
                        layoutNode.R = false;
                    }
                }
                y yVar = this.f15769d;
                yVar.getClass();
                yVar.f15791a.b(layoutNode);
                layoutNode.Q = true;
            }
            h0.e<a> eVar = this.f15772g;
            if (eVar.j()) {
                int i13 = eVar.f11334k;
                if (i13 > 0) {
                    a[] aVarArr = eVar.f11332i;
                    v7.g.d(aVarArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    do {
                        a aVar = aVarArr[r22];
                        if (aVar.f15774a.z()) {
                            boolean z17 = aVar.f15775b;
                            boolean z18 = aVar.c;
                            LayoutNode layoutNode3 = aVar.f15774a;
                            if (!z17) {
                                n(layoutNode3, z18);
                            } else {
                                l(layoutNode3, z18);
                            }
                        }
                        i10 = r22 + 1;
                        r22 = i10;
                    } while (i10 < i13);
                    eVar.g();
                } else {
                    eVar.g();
                }
            }
            return c;
        }
        b2.a aVar2 = null;
        if (layoutNodeLayoutDelegate.f3447f) {
            z10 = b(layoutNode, aVar2);
        } else {
            z10 = false;
        }
        c = c(layoutNode, aVar2);
        usageByParent = LayoutNode.UsageByParent.NotUsed;
        if (!z10) {
        }
        if (layoutNode.G == usageByParent) {
        }
        lookaheadPassDelegate = layoutNodeLayoutDelegate.f3453l;
        v7.g.c(lookaheadPassDelegate);
        if (!lookaheadPassDelegate.n) {
        }
    }

    public final void j(LayoutNode layoutNode) {
        b2.a aVar;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.K;
        if (!layoutNodeLayoutDelegate.c && !layoutNodeLayoutDelegate.f3447f) {
            return;
        }
        if (layoutNode == this.f15767a) {
            aVar = this.f15773h;
            v7.g.c(aVar);
        } else {
            aVar = null;
        }
        if (layoutNode.K.f3447f) {
            b(layoutNode, aVar);
        }
        c(layoutNode, aVar);
    }

    public final boolean k(LayoutNode layoutNode, boolean z10) {
        boolean z11;
        boolean z12;
        v7.g.f(layoutNode, "layoutNode");
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.K;
        int ordinal = layoutNodeLayoutDelegate.f3444b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return false;
                }
                if (ordinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        if ((layoutNodeLayoutDelegate.f3447f || layoutNodeLayoutDelegate.f3448g) && !z10) {
            return false;
        }
        layoutNodeLayoutDelegate.f3448g = true;
        layoutNodeLayoutDelegate.f3449h = true;
        layoutNodeLayoutDelegate.f3445d = true;
        layoutNodeLayoutDelegate.f3446e = true;
        if (v7.g.a(layoutNode.A(), Boolean.TRUE)) {
            LayoutNode p10 = layoutNode.p();
            if (p10 != null && p10.K.f3447f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (p10 != null && p10.K.f3448g) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    this.f15768b.a(layoutNode);
                }
            }
        }
        if (this.c) {
            return false;
        }
        return true;
    }

    public final boolean l(LayoutNode layoutNode, boolean z10) {
        boolean z11;
        boolean z12;
        v7.g.f(layoutNode, "layoutNode");
        if (layoutNode.f3428x != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.K;
            int ordinal = layoutNodeLayoutDelegate.f3444b.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return false;
                }
                if (ordinal != 2 && ordinal != 3) {
                    if (ordinal == 4) {
                        if (layoutNodeLayoutDelegate.f3447f && !z10) {
                            return false;
                        }
                        layoutNodeLayoutDelegate.f3447f = true;
                        layoutNodeLayoutDelegate.c = true;
                        if (v7.g.a(layoutNode.A(), Boolean.TRUE) || e(layoutNode)) {
                            LayoutNode p10 = layoutNode.p();
                            if (p10 != null && p10.K.f3447f) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                this.f15768b.a(layoutNode);
                            }
                        }
                        if (this.c) {
                            return false;
                        }
                        return true;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            this.f15772g.b(new a(layoutNode, true, z10));
            return false;
        }
        throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout".toString());
    }

    public final boolean m(LayoutNode layoutNode, boolean z10) {
        boolean z11;
        boolean z12;
        v7.g.f(layoutNode, "layoutNode");
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.K;
        int ordinal = layoutNodeLayoutDelegate.f3444b.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
            return false;
        }
        if (ordinal == 4) {
            if (z10 || (!layoutNodeLayoutDelegate.c && !layoutNodeLayoutDelegate.f3445d)) {
                layoutNodeLayoutDelegate.f3445d = true;
                layoutNodeLayoutDelegate.f3446e = true;
                if (layoutNode.A) {
                    LayoutNode p10 = layoutNode.p();
                    if (p10 != null && p10.K.f3445d) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        if (p10 != null && p10.K.c) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            this.f15768b.a(layoutNode);
                        }
                    }
                }
                if (this.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
        if (r7 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(LayoutNode layoutNode, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        v7.g.f(layoutNode, "layoutNode");
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.K;
        int ordinal = layoutNodeLayoutDelegate.f3444b.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return false;
        }
        if (ordinal != 2 && ordinal != 3) {
            if (ordinal == 4) {
                if (layoutNodeLayoutDelegate.c && !z10) {
                    return false;
                }
                layoutNodeLayoutDelegate.c = true;
                if (!layoutNode.A) {
                    if (layoutNode.E != LayoutNode.UsageByParent.InMeasureBlock && !layoutNodeLayoutDelegate.f3452k.f3479t.f()) {
                        z12 = false;
                        if (!z12) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                    z12 = true;
                    if (!z12) {
                    }
                }
                LayoutNode p10 = layoutNode.p();
                if (p10 != null && p10.K.c) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    this.f15768b.a(layoutNode);
                }
                if (this.c) {
                    return false;
                }
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        this.f15772g.b(new a(layoutNode, false, z10));
        return false;
    }

    public final void o(long j2) {
        boolean b5;
        b2.a aVar = this.f15773h;
        if (aVar == null) {
            b5 = false;
        } else {
            b5 = b2.a.b(aVar.f6336a, j2);
        }
        if (!b5) {
            if (!this.c) {
                this.f15773h = new b2.a(j2);
                LayoutNode layoutNode = this.f15767a;
                layoutNode.K.c = true;
                this.f15768b.a(layoutNode);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
