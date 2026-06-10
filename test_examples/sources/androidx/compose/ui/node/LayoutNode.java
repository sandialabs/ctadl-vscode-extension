package androidx.compose.ui.node;

import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.b;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import b2.f;
import h0.e;
import j1.q;
import j1.r;
import j1.t;
import java.util.List;
import kotlin.Metadata;
import l1.a0;
import l1.b0;
import l1.c0;
import l1.e0;
import l1.h;
import l1.j;
import l1.k;
import l1.m;
import l1.u;
import l1.v;
import l1.w;
import l1.z;
import m7.n;
import q0.d;
import u7.l;
import v0.o;
import v0.p;
import v7.g;

/* loaded from: classes.dex */
public final class LayoutNode implements c0, ComposeUiNode, b0.a {
    public static final b S = new b();
    public static final u7.a<LayoutNode> T = LayoutNode$Companion$Constructor$1.f3431j;
    public static final a U = new a();
    public static final m V = new m(0);
    public boolean A;
    public int B;
    public int C;
    public int D;
    public UsageByParent E;
    public UsageByParent F;
    public UsageByParent G;
    public UsageByParent H;
    public boolean I;
    public final v J;
    public final LayoutNodeLayoutDelegate K;
    public float L;
    public androidx.compose.ui.layout.b M;
    public NodeCoordinator N;
    public boolean O;
    public q0.d P;
    public boolean Q;
    public boolean R;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f3414i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3415j;

    /* renamed from: k  reason: collision with root package name */
    public int f3416k;

    /* renamed from: l  reason: collision with root package name */
    public final u f3417l;

    /* renamed from: m  reason: collision with root package name */
    public e<LayoutNode> f3418m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public LayoutNode f3419o;

    /* renamed from: p  reason: collision with root package name */
    public b0 f3420p;

    /* renamed from: q  reason: collision with root package name */
    public int f3421q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3422r;

    /* renamed from: s  reason: collision with root package name */
    public final e<LayoutNode> f3423s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3424t;

    /* renamed from: u  reason: collision with root package name */
    public q f3425u;

    /* renamed from: v  reason: collision with root package name */
    public final h f3426v;

    /* renamed from: w  reason: collision with root package name */
    public b2.b f3427w;

    /* renamed from: x  reason: collision with root package name */
    public j0.c f3428x;

    /* renamed from: y  reason: collision with root package name */
    public LayoutDirection f3429y;

    /* renamed from: z  reason: collision with root package name */
    public j1 f3430z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "ui_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* loaded from: classes.dex */
    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "ui_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* loaded from: classes.dex */
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* loaded from: classes.dex */
    public static final class a implements j1 {
        @Override // androidx.compose.ui.platform.j1
        public final long a() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.j1
        public final float b() {
            return 16.0f;
        }

        @Override // androidx.compose.ui.platform.j1
        public final long c() {
            int i10 = f.c;
            return f.f6342a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends c {
        public b() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // j1.q
        public final r a(t tVar, List list, long j2) {
            g.f(tVar, "$this$measure");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c implements q {
        public c(String str) {
            g.f(str, "error");
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3442a;

        static {
            int[] iArr = new int[LayoutState.values().length];
            iArr[4] = 1;
            f3442a = iArr;
        }
    }

    public LayoutNode() {
        this(3, false, 0);
    }

    public LayoutNode(int i10, boolean z10) {
        this.f3414i = z10;
        this.f3415j = i10;
        this.f3417l = new u(new e(new LayoutNode[16]), new LayoutNode$_foldedChildren$1(this));
        this.f3423s = new e<>(new LayoutNode[16]);
        this.f3424t = true;
        this.f3425u = S;
        this.f3426v = new h(this);
        this.f3427w = new b2.c(1.0f, 1.0f);
        this.f3429y = LayoutDirection.Ltr;
        this.f3430z = U;
        this.B = Integer.MAX_VALUE;
        this.C = Integer.MAX_VALUE;
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.E = usageByParent;
        this.F = usageByParent;
        this.G = usageByParent;
        this.H = usageByParent;
        this.J = new v(this);
        this.K = new LayoutNodeLayoutDelegate(this);
        this.O = true;
        this.P = d.a.f16824i;
    }

    public static void N(LayoutNode layoutNode) {
        g.f(layoutNode, "it");
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.K;
        if (d.f3442a[layoutNodeLayoutDelegate.f3444b.ordinal()] == 1) {
            if (layoutNodeLayoutDelegate.c) {
                layoutNode.M(true);
                return;
            } else if (layoutNodeLayoutDelegate.f3445d) {
                layoutNode.L(true);
                return;
            } else if (layoutNodeLayoutDelegate.f3447f) {
                layoutNode.K(true);
                return;
            } else if (layoutNodeLayoutDelegate.f3448g) {
                layoutNode.J(true);
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException("Unexpected state " + layoutNodeLayoutDelegate.f3444b);
    }

    public final Boolean A() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.K.f3453l;
        if (lookaheadPassDelegate != null) {
            return Boolean.valueOf(lookaheadPassDelegate.f3457q);
        }
        return null;
    }

    public final void B() {
        boolean z10 = this.A;
        this.A = true;
        if (!z10) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.K;
            if (layoutNodeLayoutDelegate.c) {
                M(true);
            } else if (layoutNodeLayoutDelegate.f3447f) {
                K(true);
            }
        }
        v vVar = this.J;
        NodeCoordinator nodeCoordinator = vVar.f15779b.f3500p;
        for (NodeCoordinator nodeCoordinator2 = vVar.c; !g.a(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f3500p) {
            if (nodeCoordinator2.E) {
                nodeCoordinator2.a1();
            }
        }
        e<LayoutNode> r3 = r();
        int i10 = r3.f11334k;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = r3.f11332i;
            g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                LayoutNode layoutNode = layoutNodeArr[i11];
                if (layoutNode.B != Integer.MAX_VALUE) {
                    layoutNode.B();
                    N(layoutNode);
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public final void C() {
        if (this.A) {
            int i10 = 0;
            this.A = false;
            e<LayoutNode> r3 = r();
            int i11 = r3.f11334k;
            if (i11 > 0) {
                LayoutNode[] layoutNodeArr = r3.f11332i;
                g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    layoutNodeArr[i10].C();
                    i10++;
                } while (i10 < i11);
            }
        }
    }

    public final void D(int i10, int i11, int i12) {
        int i13;
        if (i10 == i11) {
            return;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            if (i10 > i11) {
                i13 = i10 + i14;
            } else {
                i13 = i10;
            }
            int i15 = i10 > i11 ? i11 + i14 : (i11 + i12) - 2;
            u uVar = this.f3417l;
            Object n = ((e) uVar.f15776a).n(i13);
            ((u7.a) uVar.f15777b).k0();
            ((e) uVar.f15776a).a(i15, (LayoutNode) n);
            ((u7.a) uVar.f15777b).k0();
        }
        F();
        y();
        x();
    }

    public final void E(LayoutNode layoutNode) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
        if (layoutNode.K.f3451j > 0) {
            this.K.c(layoutNodeLayoutDelegate.f3451j - 1);
        }
        if (this.f3420p != null) {
            layoutNode.k();
        }
        layoutNode.f3419o = null;
        layoutNode.J.c.f3501q = null;
        if (layoutNode.f3414i) {
            this.f3416k--;
            e eVar = (e) layoutNode.f3417l.f15776a;
            int i10 = eVar.f11334k;
            if (i10 > 0) {
                Object[] objArr = eVar.f11332i;
                g.d(objArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i11 = 0;
                do {
                    ((LayoutNode) objArr[i11]).J.c.f3501q = null;
                    i11++;
                } while (i11 < i10);
            }
        }
        y();
        F();
    }

    public final void F() {
        if (!this.f3414i) {
            this.f3424t = true;
            return;
        }
        LayoutNode p10 = p();
        if (p10 != null) {
            p10.F();
        }
    }

    public final boolean G(b2.a aVar) {
        if (aVar != null) {
            if (this.G == UsageByParent.NotUsed) {
                h();
            }
            return this.K.f3452k.z0(aVar.f6336a);
        }
        return false;
    }

    public final void H() {
        u uVar = this.f3417l;
        int i10 = ((e) uVar.f15776a).f11334k - 1;
        while (true) {
            Object obj = uVar.f15776a;
            if (-1 < i10) {
                E((LayoutNode) ((e) obj).f11332i[i10]);
                i10--;
            } else {
                ((e) obj).g();
                ((u7.a) uVar.f15777b).k0();
                return;
            }
        }
    }

    public final void I(int i10, int i11) {
        boolean z10;
        if (i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i12 = (i11 + i10) - 1;
            if (i10 > i12) {
                return;
            }
            while (true) {
                u uVar = this.f3417l;
                Object n = ((e) uVar.f15776a).n(i12);
                ((u7.a) uVar.f15777b).k0();
                E((LayoutNode) n);
                if (i12 != i10) {
                    i12--;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException(a4.b.i("count (", i11, ") must be greater than 0").toString());
        }
    }

    public final void J(boolean z10) {
        b0 b0Var;
        if (this.f3414i || (b0Var = this.f3420p) == null) {
            return;
        }
        b0Var.e(this, true, z10);
    }

    public final void K(boolean z10) {
        boolean z11;
        LayoutNode p10;
        if (this.f3428x != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            b0 b0Var = this.f3420p;
            if (b0Var != null && !this.f3422r && !this.f3414i) {
                b0Var.c(this, true, z10);
                LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.K.f3453l;
                g.c(lookaheadPassDelegate);
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                LayoutNode p11 = layoutNodeLayoutDelegate.f3443a.p();
                UsageByParent usageByParent = layoutNodeLayoutDelegate.f3443a.G;
                if (p11 != null && usageByParent != UsageByParent.NotUsed) {
                    while (p11.G == usageByParent && (p10 = p11.p()) != null) {
                        p11 = p10;
                    }
                    int ordinal = usageByParent.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            p11.J(z10);
                            return;
                        }
                        throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                    }
                    p11.K(z10);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout".toString());
    }

    public final void L(boolean z10) {
        b0 b0Var;
        if (this.f3414i || (b0Var = this.f3420p) == null) {
            return;
        }
        int i10 = a0.f15727a;
        b0Var.e(this, false, z10);
    }

    public final void M(boolean z10) {
        b0 b0Var;
        LayoutNode p10;
        if (this.f3422r || this.f3414i || (b0Var = this.f3420p) == null) {
            return;
        }
        int i10 = a0.f15727a;
        b0Var.c(this, false, z10);
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
        LayoutNode p11 = layoutNodeLayoutDelegate.f3443a.p();
        UsageByParent usageByParent = layoutNodeLayoutDelegate.f3443a.G;
        if (p11 != null && usageByParent != UsageByParent.NotUsed) {
            while (p11.G == usageByParent && (p10 = p11.p()) != null) {
                p11 = p10;
            }
            int ordinal = usageByParent.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    p11.L(z10);
                    return;
                }
                throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
            }
            p11.M(z10);
        }
    }

    public final void O() {
        e<LayoutNode> r3 = r();
        int i10 = r3.f11334k;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = r3.f11332i;
            g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                LayoutNode layoutNode = layoutNodeArr[i11];
                UsageByParent usageByParent = layoutNode.H;
                layoutNode.G = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.O();
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public final boolean P() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        d.c cVar = this.J.f15781e;
        int i10 = cVar.f16827k;
        if ((4 & i10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((i10 & 2) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                return true;
            }
        }
        while (cVar != null) {
            if ((cVar.f16826j & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && (cVar instanceof k) && p.D(cVar, 2).F != null) {
                return false;
            }
            if ((cVar.f16826j & 4) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                return true;
            }
            cVar = cVar.f16829m;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate;
        if (this.f3416k > 0 && this.n) {
            int i10 = 0;
            this.n = false;
            e<LayoutNode> eVar = this.f3418m;
            if (eVar == null) {
                eVar = new e<>(new LayoutNode[16]);
                this.f3418m = eVar;
            }
            eVar.g();
            e eVar2 = (e) this.f3417l.f15776a;
            int i11 = eVar2.f11334k;
            if (i11 > 0) {
                Object[] objArr = eVar2.f11332i;
                g.d(objArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    LayoutNode layoutNode = (LayoutNode) objArr[i10];
                    if (layoutNode.f3414i) {
                        eVar.c(eVar.f11334k, layoutNode.r());
                    } else {
                        eVar.b(layoutNode);
                    }
                    i10++;
                } while (i10 < i11);
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.K;
                layoutNodeLayoutDelegate.f3452k.f3481v = true;
                lookaheadPassDelegate = layoutNodeLayoutDelegate.f3453l;
                if (lookaheadPassDelegate == null) {
                    lookaheadPassDelegate.f3461u = true;
                    return;
                }
                return;
            }
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = this.K;
            layoutNodeLayoutDelegate2.f3452k.f3481v = true;
            lookaheadPassDelegate = layoutNodeLayoutDelegate2.f3453l;
            if (lookaheadPassDelegate == null) {
            }
        }
    }

    @Override // l1.b0.a
    public final void a() {
        d.c cVar;
        v vVar = this.J;
        androidx.compose.ui.node.b bVar = vVar.f15779b;
        boolean o02 = m0.b.o0(128);
        if (o02) {
            cVar = bVar.M;
        } else {
            cVar = bVar.M.f16828l;
            if (cVar == null) {
                return;
            }
        }
        l<NodeCoordinator, n> lVar = NodeCoordinator.G;
        for (d.c V0 = bVar.V0(o02); V0 != null && (V0.f16827k & 128) != 0; V0 = V0.f16829m) {
            if ((V0.f16826j & 128) != 0 && (V0 instanceof j)) {
                ((j) V0).o(vVar.f15779b);
            }
            if (V0 == cVar) {
                return;
            }
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void b(q qVar) {
        g.f(qVar, "value");
        if (!g.a(this.f3425u, qVar)) {
            this.f3425u = qVar;
            h hVar = this.f3426v;
            hVar.getClass();
            hVar.f15741a.setValue(qVar);
            x();
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void c(j1 j1Var) {
        g.f(j1Var, "<set-?>");
        this.f3430z = j1Var;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void d(LayoutDirection layoutDirection) {
        g.f(layoutDirection, "value");
        if (this.f3429y != layoutDirection) {
            this.f3429y = layoutDirection;
            x();
            LayoutNode p10 = p();
            if (p10 != null) {
                p10.u();
            }
            v();
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void e(b2.b bVar) {
        g.f(bVar, "value");
        if (!g.a(this.f3427w, bVar)) {
            this.f3427w = bVar;
            x();
            LayoutNode p10 = p();
            if (p10 != null) {
                p10.u();
            }
            v();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0265 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a4 A[LOOP:6: B:119:0x0263->B:135:0x02a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x02d6 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x02b1 A[EDGE_INSN: B:387:0x02b1->B:137:0x02b1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x03b6 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x038f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v51 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(q0.d dVar) {
        boolean z10;
        boolean z11;
        b.C0024b c0024b;
        String str;
        int i10;
        b.C0024b c0024b2;
        boolean z12;
        v vVar;
        NodeCoordinator nodeCoordinator;
        e<d.b> eVar;
        e<d.b> eVar2;
        b.C0024b c0024b3;
        Object obj;
        boolean z13;
        e<d.b> eVar3;
        v vVar2;
        boolean z14;
        d.c cVar;
        w.a aVar;
        boolean z15;
        boolean z16;
        boolean z17;
        LayoutNode p10;
        LayoutNode p11;
        l1.r rVar;
        j0.c cVar2;
        androidx.compose.ui.node.b bVar;
        boolean z18;
        l1.l lVar;
        String str2;
        b.C0024b c0024b4;
        String str3;
        boolean z19;
        boolean z20;
        int i11;
        boolean z21;
        int i12;
        int i13;
        g0.v vVar3;
        g0.v vVar4;
        int i14;
        int i15;
        int i16;
        boolean z22;
        g0.v vVar5;
        g0.v vVar6;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        int i17;
        int i18;
        boolean z27;
        boolean z28;
        boolean z29;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z30;
        char c10;
        boolean z31;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        d.b bVar2;
        d.b bVar3;
        boolean z32;
        char c11;
        boolean z33;
        boolean z34;
        boolean z35;
        char c12;
        q0.d dVar2;
        q0.d dVar3 = dVar;
        g.f(dVar3, "value");
        if (g.a(dVar3, this.P)) {
            return;
        }
        if (this.f3414i && this.P != d.a.f16824i) {
            z10 = false;
            if (!z10) {
                this.P = dVar3;
                boolean P = P();
                v vVar7 = this.J;
                NodeCoordinator nodeCoordinator2 = vVar7.c;
                d.c cVar3 = vVar7.f15781e;
                w.a aVar2 = w.f15789a;
                if (cVar3 != aVar2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    cVar3.f16828l = aVar2;
                    aVar2.f16829m = cVar3;
                    vVar7.f15781e = aVar2;
                    e<d.b> eVar4 = vVar7.f15782f;
                    if (eVar4 == null) {
                        eVar4 = new e<>(new d.b[16]);
                    }
                    e<d.b> eVar5 = eVar4;
                    e<d.b> eVar6 = vVar7.f15783g;
                    if (eVar6 == null) {
                        eVar6 = new e<>(new d.b[16]);
                    }
                    e<d.b> eVar7 = eVar6;
                    e eVar8 = new e(new q0.d[eVar7.f11334k]);
                    loop0: while (true) {
                        eVar8.b(dVar3);
                        while (eVar8.j()) {
                            dVar2 = (q0.d) eVar8.n(eVar8.f11334k - 1);
                            if (dVar2 instanceof CombinedModifier) {
                                break;
                            } else if (dVar2 instanceof d.b) {
                                eVar7.b(dVar2);
                            } else {
                                dVar2.x(new NodeChainKt$fillVector$1(eVar7));
                            }
                        }
                        CombinedModifier combinedModifier = (CombinedModifier) dVar2;
                        eVar8.b(combinedModifier.f2986j);
                        dVar3 = combinedModifier.f2985i;
                    }
                    int i33 = eVar7.f11334k;
                    int i34 = eVar5.f11334k;
                    String str4 = "next";
                    b.C0024b c0024b5 = vVar7.f15780d;
                    if (i33 == i34) {
                        d.c cVar4 = c0024b5.f16828l;
                        int i35 = i34 - 1;
                        z13 = false;
                        int i36 = 0;
                        while (cVar4 != null && i35 >= 0) {
                            d.b bVar4 = eVar5.f11332i[i35];
                            d.b bVar5 = eVar7.f11332i[i35];
                            g.f(bVar4, "prev");
                            g.f(bVar5, str4);
                            if (g.a(bVar4, bVar5)) {
                                c0024b = c0024b5;
                                str = str4;
                                c12 = 2;
                            } else {
                                c0024b = c0024b5;
                                str = str4;
                                if (bVar4.getClass() == bVar5.getClass()) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                if (z35) {
                                    c12 = 1;
                                } else {
                                    c12 = 0;
                                }
                            }
                            if (c12 != 0) {
                                if (c12 == 1) {
                                    d.c c13 = v.c(bVar4, bVar5, cVar4);
                                    if (!z13 && cVar4 == c13) {
                                        z13 = false;
                                        cVar4 = c13;
                                    }
                                    z13 = true;
                                    cVar4 = c13;
                                }
                                i35--;
                                i36 |= cVar4.f16826j;
                                cVar4.f16827k = i36;
                                cVar4 = cVar4.f16828l;
                                str4 = str;
                                c0024b5 = c0024b;
                            } else {
                                i35++;
                                cVar4 = cVar4.f16829m;
                                break;
                            }
                        }
                        c0024b = c0024b5;
                        str = str4;
                        b.C0024b c0024b6 = cVar4;
                        i33 = i35;
                        if (i33 > 0) {
                            if (c0024b6 != null) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            if (z34) {
                                c0024b2 = c0024b6;
                                i10 = i33;
                            } else {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                        } else {
                            z12 = P;
                            vVar2 = vVar7;
                            nodeCoordinator = nodeCoordinator2;
                            eVar = eVar5;
                            eVar3 = eVar7;
                            c0024b3 = c0024b;
                            z14 = false;
                            obj = "Check failed.";
                            vVar2.f15782f = eVar3;
                            eVar.g();
                            vVar2.f15783g = eVar;
                            cVar = vVar2.f15781e;
                            aVar = w.f15789a;
                            if (cVar == aVar) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                d.c cVar5 = aVar.f16829m;
                                if (cVar5 == null) {
                                    cVar5 = c0024b3;
                                }
                                vVar2.f15781e = cVar5;
                                cVar5.f16828l = null;
                                aVar.f16829m = null;
                                if (cVar5 != aVar) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z16) {
                                    NodeCoordinator nodeCoordinator3 = vVar2.f15779b;
                                    LayoutNode layoutNode = vVar2.f15778a;
                                    if (z14) {
                                        l1.l lVar2 = nodeCoordinator3;
                                        for (d.c cVar6 = c0024b3.f16828l; cVar6 != null; cVar6 = cVar6.f16828l) {
                                            if ((cVar6.f16826j & 2) != 0) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            if (z18 && (cVar6 instanceof k)) {
                                                if (cVar6.f16830o) {
                                                    NodeCoordinator nodeCoordinator4 = cVar6.n;
                                                    g.d(nodeCoordinator4, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                                                    l1.l lVar3 = (l1.l) nodeCoordinator4;
                                                    k kVar = lVar3.M;
                                                    lVar3.M = (k) cVar6;
                                                    lVar = lVar3;
                                                    if (kVar != cVar6) {
                                                        lVar3.e1();
                                                        lVar = lVar3;
                                                    }
                                                } else {
                                                    l1.l lVar4 = new l1.l(layoutNode, (k) cVar6);
                                                    cVar6.n = lVar4;
                                                    lVar = lVar4;
                                                }
                                                lVar2.f3501q = lVar;
                                                lVar.f3500p = lVar2;
                                                lVar2 = lVar;
                                            } else {
                                                cVar6.n = lVar2;
                                            }
                                        }
                                        LayoutNode p12 = layoutNode.p();
                                        if (p12 != null) {
                                            bVar = p12.J.f15779b;
                                        } else {
                                            bVar = null;
                                        }
                                        lVar2.f3501q = bVar;
                                        vVar2.c = lVar2;
                                    }
                                    if (z13 && layoutNode.z()) {
                                        vVar2.a();
                                    }
                                    NodeCoordinator nodeCoordinator5 = nodeCoordinator3.f3500p;
                                    for (NodeCoordinator nodeCoordinator6 = vVar2.c; !g.a(nodeCoordinator6, nodeCoordinator5) && nodeCoordinator6 != null; nodeCoordinator6 = nodeCoordinator6.f3500p) {
                                        z zVar = nodeCoordinator6.F;
                                        if (zVar != null) {
                                            zVar.invalidate();
                                        }
                                        j0.c cVar7 = this.f3428x;
                                        if (cVar7 != null) {
                                            l1.r rVar2 = nodeCoordinator6.f3508x;
                                            if (rVar2 != null) {
                                                cVar2 = rVar2.f15761p;
                                            } else {
                                                cVar2 = null;
                                            }
                                            if (!g.a(cVar7, cVar2)) {
                                                rVar = nodeCoordinator6.K0(cVar7);
                                            } else {
                                                rVar = nodeCoordinator6.f3508x;
                                            }
                                        } else {
                                            rVar = null;
                                        }
                                        nodeCoordinator6.f3508x = rVar;
                                    }
                                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.K;
                                    LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = layoutNodeLayoutDelegate.f3452k;
                                    Object obj2 = measurePassDelegate.f3478s;
                                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = LayoutNodeLayoutDelegate.this;
                                    boolean z36 = !g.a(obj2, layoutNodeLayoutDelegate2.a().n());
                                    measurePassDelegate.f3478s = layoutNodeLayoutDelegate2.a().n();
                                    LayoutNode layoutNode2 = layoutNodeLayoutDelegate.f3443a;
                                    if (z36 && (p11 = layoutNode2.p()) != null) {
                                        p11.M(false);
                                    }
                                    LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.f3453l;
                                    if (lookaheadPassDelegate != null) {
                                        Object obj3 = lookaheadPassDelegate.f3462v;
                                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate3 = LayoutNodeLayoutDelegate.this;
                                        l1.r rVar3 = layoutNodeLayoutDelegate3.a().f3508x;
                                        g.c(rVar3);
                                        boolean z37 = !g.a(obj3, rVar3.n());
                                        l1.r rVar4 = layoutNodeLayoutDelegate3.a().f3508x;
                                        g.c(rVar4);
                                        lookaheadPassDelegate.f3462v = rVar4.n();
                                        if (z37) {
                                            z17 = true;
                                            if (z17) {
                                                boolean b5 = LayoutNodeLayoutDelegate.b(layoutNode2);
                                                LayoutNode p13 = layoutNode2.p();
                                                if (b5) {
                                                    if (p13 != null) {
                                                        p13.M(false);
                                                    }
                                                } else if (p13 != null) {
                                                    p13.K(false);
                                                }
                                            }
                                            if ((!z12 || P()) && (p10 = p()) != null) {
                                                p10.u();
                                            }
                                            if (g.a(nodeCoordinator, nodeCoordinator3) || !g.a(vVar2.c, nodeCoordinator3)) {
                                                x();
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    z17 = false;
                                    if (z17) {
                                    }
                                    if (!z12) {
                                    }
                                    p10.u();
                                    if (g.a(nodeCoordinator, nodeCoordinator3)) {
                                    }
                                    x();
                                    return;
                                }
                                throw new IllegalStateException(obj.toString());
                            }
                            throw new IllegalStateException(obj.toString());
                        }
                    } else {
                        c0024b = c0024b5;
                        str = "next";
                        if (i34 == 0) {
                            d.c cVar8 = c0024b;
                            int i37 = 0;
                            for (int i38 = i33 - 1; i38 >= 0; i38--) {
                                cVar8 = v.b(eVar7.f11332i[i38], cVar8);
                                i37 |= cVar8.f16826j;
                                cVar8.f16827k = i37;
                            }
                            z12 = P;
                            vVar = vVar7;
                            nodeCoordinator = nodeCoordinator2;
                            eVar = eVar5;
                            eVar2 = eVar7;
                            c0024b3 = c0024b;
                            obj = "Check failed.";
                            vVar2 = vVar;
                            eVar3 = eVar2;
                            z14 = true;
                            z13 = true;
                            vVar2.f15782f = eVar3;
                            eVar.g();
                            vVar2.f15783g = eVar;
                            cVar = vVar2.f15781e;
                            aVar = w.f15789a;
                            if (cVar == aVar) {
                            }
                            if (z15) {
                            }
                        } else {
                            i10 = i34;
                            c0024b2 = c0024b;
                        }
                    }
                    v.a aVar3 = vVar7.f15784h;
                    if (aVar3 == null) {
                        b.C0024b c0024b7 = c0024b;
                        nodeCoordinator = nodeCoordinator2;
                        obj = "Check failed.";
                        str3 = str;
                        c0024b4 = c0024b7;
                        z12 = P;
                        str2 = "prev";
                        aVar3 = new v.a(vVar7, c0024b2, c0024b2.f16827k, eVar5, eVar7);
                        vVar7.f15784h = aVar3;
                    } else {
                        z12 = P;
                        str2 = "prev";
                        nodeCoordinator = nodeCoordinator2;
                        c0024b4 = c0024b;
                        obj = "Check failed.";
                        str3 = str;
                        g.f(c0024b2, "<set-?>");
                        aVar3.f15785a = c0024b2;
                        aVar3.f15786b = c0024b2.f16827k;
                        aVar3.c = eVar5;
                        aVar3.f15787d = eVar7;
                    }
                    int i39 = ((i10 + i33) + 1) / 2;
                    g0.v vVar8 = new g0.v(i39 * 3, 1);
                    g0.v vVar9 = new g0.v(i39 * 4, 1);
                    vVar9.d(0, i10, 0, i33);
                    int i40 = (i39 * 2) + 1;
                    int[] iArr = new int[i40];
                    int[] iArr2 = new int[i40];
                    int[] iArr3 = new int[5];
                    while (true) {
                        c0024b3 = c0024b4;
                        if (vVar9.c != 0) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (!z19) {
                            break;
                        }
                        int a10 = vVar9.a();
                        int a11 = vVar9.a();
                        e<d.b> eVar9 = eVar5;
                        int a12 = vVar9.a();
                        v vVar10 = vVar7;
                        int a13 = vVar9.a();
                        e<d.b> eVar10 = eVar7;
                        int i41 = a12 - a13;
                        int i42 = i33;
                        int i43 = a10 - a11;
                        int i44 = i10;
                        if (i41 >= 1 && i43 >= 1) {
                            int i45 = ((i41 + i43) + 1) / 2;
                            int i46 = i40 / 2;
                            int i47 = i46 + 1;
                            iArr[i47] = a13;
                            iArr2[i47] = a12;
                            i13 = i40;
                            int i48 = 0;
                            while (i48 < i45) {
                                int i49 = i41 - i43;
                                int i50 = i43;
                                int i51 = i45;
                                if (Math.abs(i49) % 2 == 1) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                int i52 = -i48;
                                int i53 = i41;
                                int i54 = i52;
                                while (true) {
                                    if (i54 <= i48) {
                                        if (i54 != i52) {
                                            if (i54 != i48) {
                                                vVar4 = vVar9;
                                                vVar3 = vVar8;
                                                if (iArr[i54 + 1 + i46] > iArr[(i54 - 1) + i46]) {
                                                }
                                            } else {
                                                vVar3 = vVar8;
                                                vVar4 = vVar9;
                                            }
                                            i28 = iArr[(i54 - 1) + i46];
                                            i27 = i28 + 1;
                                            i29 = ((i27 - a13) + a11) - i54;
                                            if (i48 != 0 && i27 == i28) {
                                                i30 = i29 - 1;
                                                i18 = a11;
                                                i31 = i29;
                                                while (i27 < a12 && i31 < a10) {
                                                    i17 = a13;
                                                    bVar2 = aVar3.c.f11332i[i27];
                                                    i12 = a10;
                                                    bVar3 = aVar3.f15787d.f11332i[i31];
                                                    w.a aVar4 = w.f15789a;
                                                    g.f(bVar2, str2);
                                                    g.f(bVar3, str3);
                                                    if (!g.a(bVar2, bVar3)) {
                                                        c11 = 2;
                                                    } else {
                                                        if (bVar2.getClass() == bVar3.getClass()) {
                                                            z32 = true;
                                                        } else {
                                                            z32 = false;
                                                        }
                                                        if (z32) {
                                                            c11 = 1;
                                                        } else {
                                                            c11 = 0;
                                                        }
                                                    }
                                                    if (c11 == 0) {
                                                        z33 = true;
                                                    } else {
                                                        z33 = false;
                                                    }
                                                    if (z33) {
                                                        break;
                                                    }
                                                    i27++;
                                                    i31++;
                                                    a13 = i17;
                                                    a10 = i12;
                                                }
                                                i12 = a10;
                                                i17 = a13;
                                                iArr[i46 + i54] = i27;
                                                if (!z26 && (i32 = i49 - i54) >= i52 + 1 && i32 <= i48 - 1 && iArr2[i46 + i32] <= i27) {
                                                    iArr3[0] = i28;
                                                    iArr3[1] = i30;
                                                    iArr3[2] = i27;
                                                    iArr3[3] = i31;
                                                    iArr3[4] = 0;
                                                    z27 = true;
                                                    break;
                                                }
                                                i54 += 2;
                                                a11 = i18;
                                                vVar9 = vVar4;
                                                vVar8 = vVar3;
                                                a13 = i17;
                                                a10 = i12;
                                            }
                                            i30 = i29;
                                            i18 = a11;
                                            i31 = i30;
                                            while (i27 < a12) {
                                                i17 = a13;
                                                bVar2 = aVar3.c.f11332i[i27];
                                                i12 = a10;
                                                bVar3 = aVar3.f15787d.f11332i[i31];
                                                w.a aVar42 = w.f15789a;
                                                g.f(bVar2, str2);
                                                g.f(bVar3, str3);
                                                if (!g.a(bVar2, bVar3)) {
                                                }
                                                if (c11 == 0) {
                                                }
                                                if (z33) {
                                                }
                                            }
                                            i12 = a10;
                                            i17 = a13;
                                            iArr[i46 + i54] = i27;
                                            if (!z26) {
                                            }
                                            i54 += 2;
                                            a11 = i18;
                                            vVar9 = vVar4;
                                            vVar8 = vVar3;
                                            a13 = i17;
                                            a10 = i12;
                                        } else {
                                            vVar3 = vVar8;
                                            vVar4 = vVar9;
                                        }
                                        i28 = iArr[i54 + 1 + i46];
                                        i27 = i28;
                                        i29 = ((i27 - a13) + a11) - i54;
                                        if (i48 != 0) {
                                            i30 = i29 - 1;
                                            i18 = a11;
                                            i31 = i29;
                                            while (i27 < a12) {
                                            }
                                            i12 = a10;
                                            i17 = a13;
                                            iArr[i46 + i54] = i27;
                                            if (!z26) {
                                            }
                                            i54 += 2;
                                            a11 = i18;
                                            vVar9 = vVar4;
                                            vVar8 = vVar3;
                                            a13 = i17;
                                            a10 = i12;
                                        }
                                        i30 = i29;
                                        i18 = a11;
                                        i31 = i30;
                                        while (i27 < a12) {
                                        }
                                        i12 = a10;
                                        i17 = a13;
                                        iArr[i46 + i54] = i27;
                                        if (!z26) {
                                        }
                                        i54 += 2;
                                        a11 = i18;
                                        vVar9 = vVar4;
                                        vVar8 = vVar3;
                                        a13 = i17;
                                        a10 = i12;
                                    } else {
                                        i12 = a10;
                                        vVar3 = vVar8;
                                        vVar4 = vVar9;
                                        i17 = a13;
                                        i18 = a11;
                                        z27 = false;
                                        break;
                                    }
                                }
                                if (z27) {
                                    i16 = a12;
                                    i15 = i18;
                                    i14 = i17;
                                } else {
                                    if (i49 % 2 == 0) {
                                        z28 = true;
                                    } else {
                                        z28 = false;
                                    }
                                    int i55 = i52;
                                    while (true) {
                                        if (i55 <= i48) {
                                            if (i55 != i52 && (i55 == i48 || iArr2[i55 + 1 + i46] >= iArr2[(i55 - 1) + i46])) {
                                                i19 = iArr2[(i55 - 1) + i46];
                                                i20 = i19 - 1;
                                                i21 = i12 - ((a12 - i20) - i55);
                                                if (i48 != 0 && i20 == i19) {
                                                    i22 = i21 + 1;
                                                    i23 = i17;
                                                    while (true) {
                                                        if (i20 <= i23) {
                                                            i16 = a12;
                                                            int i56 = i18;
                                                            if (i21 > i56) {
                                                                i25 = i20 - 1;
                                                                i26 = i21 - 1;
                                                                i15 = i56;
                                                                d.b bVar6 = aVar3.c.f11332i[i25];
                                                                i14 = i23;
                                                                d.b bVar7 = aVar3.f15787d.f11332i[i26];
                                                                w.a aVar5 = w.f15789a;
                                                                g.f(bVar6, str2);
                                                                g.f(bVar7, str3);
                                                                if (g.a(bVar6, bVar7)) {
                                                                    c10 = 2;
                                                                } else {
                                                                    if (bVar6.getClass() == bVar7.getClass()) {
                                                                        z30 = true;
                                                                    } else {
                                                                        z30 = false;
                                                                    }
                                                                    if (z30) {
                                                                        c10 = 1;
                                                                    } else {
                                                                        c10 = 0;
                                                                    }
                                                                }
                                                                if (c10 != 0) {
                                                                    z31 = true;
                                                                } else {
                                                                    z31 = false;
                                                                }
                                                                if (!z31) {
                                                                    break;
                                                                }
                                                                i20 = i25;
                                                                a12 = i16;
                                                                i21 = i26;
                                                                i18 = i15;
                                                                i23 = i14;
                                                            } else {
                                                                i15 = i56;
                                                                i14 = i23;
                                                                break;
                                                            }
                                                        } else {
                                                            i16 = a12;
                                                            i14 = i23;
                                                            i15 = i18;
                                                            break;
                                                        }
                                                    }
                                                    iArr2[i46 + i55] = i20;
                                                    if (!z28 && (i24 = i49 - i55) >= i52 && i24 <= i48 && iArr[i46 + i24] >= i20) {
                                                        iArr3[0] = i20;
                                                        iArr3[1] = i21;
                                                        iArr3[2] = i19;
                                                        iArr3[3] = i22;
                                                        iArr3[4] = 1;
                                                        z29 = true;
                                                        break;
                                                    }
                                                    i55 += 2;
                                                    a12 = i16;
                                                    i18 = i15;
                                                    i17 = i14;
                                                }
                                                i22 = i21;
                                                i23 = i17;
                                                while (true) {
                                                    if (i20 <= i23) {
                                                    }
                                                    i20 = i25;
                                                    a12 = i16;
                                                    i21 = i26;
                                                    i18 = i15;
                                                    i23 = i14;
                                                }
                                                iArr2[i46 + i55] = i20;
                                                if (!z28) {
                                                }
                                                i55 += 2;
                                                a12 = i16;
                                                i18 = i15;
                                                i17 = i14;
                                            }
                                            i19 = iArr2[i55 + 1 + i46];
                                            i20 = i19;
                                            i21 = i12 - ((a12 - i20) - i55);
                                            if (i48 != 0) {
                                                i22 = i21 + 1;
                                                i23 = i17;
                                                while (true) {
                                                    if (i20 <= i23) {
                                                    }
                                                    i20 = i25;
                                                    a12 = i16;
                                                    i21 = i26;
                                                    i18 = i15;
                                                    i23 = i14;
                                                }
                                                iArr2[i46 + i55] = i20;
                                                if (!z28) {
                                                }
                                                i55 += 2;
                                                a12 = i16;
                                                i18 = i15;
                                                i17 = i14;
                                            }
                                            i22 = i21;
                                            i23 = i17;
                                            while (true) {
                                                if (i20 <= i23) {
                                                }
                                                i20 = i25;
                                                a12 = i16;
                                                i21 = i26;
                                                i18 = i15;
                                                i23 = i14;
                                            }
                                            iArr2[i46 + i55] = i20;
                                            if (!z28) {
                                            }
                                            i55 += 2;
                                            a12 = i16;
                                            i18 = i15;
                                            i17 = i14;
                                        } else {
                                            i16 = a12;
                                            i15 = i18;
                                            i14 = i17;
                                            z29 = false;
                                            break;
                                        }
                                    }
                                    if (!z29) {
                                        i48++;
                                        i45 = i51;
                                        i43 = i50;
                                        i41 = i53;
                                        vVar9 = vVar4;
                                        vVar8 = vVar3;
                                        a12 = i16;
                                        a10 = i12;
                                        a11 = i15;
                                        a13 = i14;
                                    }
                                }
                                z22 = true;
                                break;
                            }
                            i12 = a10;
                            vVar3 = vVar8;
                            vVar4 = vVar9;
                            i14 = a13;
                            i15 = a11;
                            i16 = a12;
                            z22 = false;
                            if (!z22) {
                                if (Math.min(iArr3[2] - iArr3[0], iArr3[3] - iArr3[1]) > 0) {
                                    int i57 = iArr3[3];
                                    int i58 = iArr3[1];
                                    int i59 = i57 - i58;
                                    int i60 = iArr3[2];
                                    int i61 = iArr3[0];
                                    int i62 = i60 - i61;
                                    if (i59 != i62) {
                                        z23 = true;
                                    } else {
                                        z23 = false;
                                    }
                                    if (z23) {
                                        if (iArr3[4] != 0) {
                                            z24 = true;
                                        } else {
                                            z24 = false;
                                        }
                                        if (!z24) {
                                            if (i59 > i62) {
                                                z25 = true;
                                            } else {
                                                z25 = false;
                                            }
                                            if (z25) {
                                                i58++;
                                            } else {
                                                i61++;
                                            }
                                        }
                                        vVar6 = vVar3;
                                        vVar6.c(i61, i58, Math.min(i62, i59));
                                    } else {
                                        vVar6 = vVar3;
                                        vVar6.c(i61, i58, i62);
                                    }
                                } else {
                                    vVar6 = vVar3;
                                }
                                vVar5 = vVar4;
                                vVar5.d(i14, iArr3[0], i15, iArr3[1]);
                                vVar5.d(iArr3[2], i16, iArr3[3], i12);
                            } else {
                                vVar5 = vVar4;
                                vVar6 = vVar3;
                            }
                            c0024b4 = c0024b3;
                            vVar9 = vVar5;
                            vVar8 = vVar6;
                            eVar5 = eVar9;
                            vVar7 = vVar10;
                            eVar7 = eVar10;
                            i33 = i42;
                            i10 = i44;
                            i40 = i13;
                        }
                        i12 = a10;
                        i13 = i40;
                        vVar3 = vVar8;
                        vVar4 = vVar9;
                        i14 = a13;
                        i15 = a11;
                        i16 = a12;
                        z22 = false;
                        if (!z22) {
                        }
                        c0024b4 = c0024b3;
                        vVar9 = vVar5;
                        vVar8 = vVar6;
                        eVar5 = eVar9;
                        vVar7 = vVar10;
                        eVar7 = eVar10;
                        i33 = i42;
                        i10 = i44;
                        i40 = i13;
                    }
                    int i63 = i33;
                    int i64 = i10;
                    g0.v vVar11 = vVar8;
                    vVar = vVar7;
                    eVar = eVar5;
                    eVar2 = eVar7;
                    int i65 = vVar11.c;
                    if (i65 % 3 == 0) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    if (z20) {
                        if (i65 > 3) {
                            i11 = 0;
                            vVar11.e(0, i65 - 3);
                        } else {
                            i11 = 0;
                        }
                        int i66 = i63;
                        vVar11.c(i64, i66, i11);
                        int i67 = i64;
                        while (true) {
                            if (vVar11.c != 0) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            if (!z21) {
                                break;
                            }
                            int a14 = vVar11.a();
                            int a15 = vVar11.a();
                            int a16 = vVar11.a();
                            while (i67 > a16) {
                                i67--;
                                aVar3.b();
                            }
                            while (i66 > a15) {
                                i66--;
                                aVar3.a(i66);
                            }
                            while (true) {
                                int i68 = a14 - 1;
                                if (a14 > 0) {
                                    i67--;
                                    i66--;
                                    aVar3.c(i67, i66);
                                    a14 = i68;
                                }
                            }
                        }
                        while (i67 > 0) {
                            i67--;
                            aVar3.b();
                        }
                        while (i66 > 0) {
                            i66--;
                            aVar3.a(i66);
                        }
                        vVar2 = vVar;
                        eVar3 = eVar2;
                        z14 = true;
                        z13 = true;
                        vVar2.f15782f = eVar3;
                        eVar.g();
                        vVar2.f15783g = eVar;
                        cVar = vVar2.f15781e;
                        aVar = w.f15789a;
                        if (cVar == aVar) {
                        }
                        if (z15) {
                        }
                    } else {
                        throw new IllegalStateException(obj.toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
            }
        }
        z10 = true;
        if (!z10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(b0 b0Var) {
        boolean z10;
        boolean z11;
        int i10;
        NodeCoordinator nodeCoordinator;
        NodeCoordinator nodeCoordinator2;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate;
        l1.r rVar;
        j0.c cVar;
        b0 b0Var2;
        g.f(b0Var, "owner");
        int i11 = 0;
        if (this.f3420p == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            LayoutNode layoutNode = this.f3419o;
            if (layoutNode != null && !g.a(layoutNode.f3420p, b0Var)) {
                z11 = false;
                String str = null;
                if (z11) {
                    StringBuilder sb = new StringBuilder("Attaching to a different owner(");
                    sb.append(b0Var);
                    sb.append(") than the parent's owner(");
                    LayoutNode p10 = p();
                    if (p10 != null) {
                        b0Var2 = p10.f3420p;
                    } else {
                        b0Var2 = null;
                    }
                    sb.append(b0Var2);
                    sb.append("). This tree: ");
                    sb.append(j(0));
                    sb.append(" Parent tree: ");
                    LayoutNode layoutNode2 = this.f3419o;
                    if (layoutNode2 != null) {
                        str = layoutNode2.j(0);
                    }
                    sb.append(str);
                    throw new IllegalStateException(sb.toString().toString());
                }
                LayoutNode p11 = p();
                if (p11 == null) {
                    this.A = true;
                }
                this.f3420p = b0Var;
                if (p11 != null) {
                    i10 = p11.f3421q;
                } else {
                    i10 = -1;
                }
                this.f3421q = i10 + 1;
                if (p.r(this) != null) {
                    b0Var.l();
                }
                b0Var.t(this);
                j0.c cVar2 = (p11 == null || (cVar2 = p11.f3428x) == null) ? null : null;
                boolean a10 = g.a(cVar2, this.f3428x);
                v vVar = this.J;
                if (!a10) {
                    this.f3428x = cVar2;
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.K;
                    if (cVar2 != null) {
                        layoutNodeLayoutDelegate.getClass();
                        lookaheadPassDelegate = new LayoutNodeLayoutDelegate.LookaheadPassDelegate(cVar2);
                    } else {
                        lookaheadPassDelegate = null;
                    }
                    layoutNodeLayoutDelegate.f3453l = lookaheadPassDelegate;
                    NodeCoordinator nodeCoordinator3 = vVar.f15779b.f3500p;
                    for (NodeCoordinator nodeCoordinator4 = vVar.c; !g.a(nodeCoordinator4, nodeCoordinator3) && nodeCoordinator4 != null; nodeCoordinator4 = nodeCoordinator4.f3500p) {
                        if (cVar2 != null) {
                            l1.r rVar2 = nodeCoordinator4.f3508x;
                            if (rVar2 != null) {
                                cVar = rVar2.f15761p;
                            } else {
                                cVar = null;
                            }
                            if (!g.a(cVar2, cVar)) {
                                rVar = nodeCoordinator4.K0(cVar2);
                            } else {
                                rVar = nodeCoordinator4.f3508x;
                            }
                        } else {
                            rVar = null;
                        }
                        nodeCoordinator4.f3508x = rVar;
                    }
                }
                vVar.a();
                e eVar = (e) this.f3417l.f15776a;
                int i12 = eVar.f11334k;
                if (i12 > 0) {
                    Object[] objArr = eVar.f11332i;
                    g.d(objArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    do {
                        ((LayoutNode) objArr[i11]).g(b0Var);
                        i11++;
                    } while (i11 < i12);
                    x();
                    if (p11 != null) {
                        p11.x();
                    }
                    nodeCoordinator2 = vVar.f15779b.f3500p;
                    for (nodeCoordinator = vVar.c; !g.a(nodeCoordinator, nodeCoordinator2) && nodeCoordinator != null; nodeCoordinator = nodeCoordinator.f3500p) {
                        nodeCoordinator.d1(nodeCoordinator.f3503s);
                    }
                    return;
                }
                x();
                if (p11 != null) {
                }
                nodeCoordinator2 = vVar.f15779b.f3500p;
                while (!g.a(nodeCoordinator, nodeCoordinator2)) {
                    nodeCoordinator.d1(nodeCoordinator.f3503s);
                }
                return;
            }
            z11 = true;
            String str2 = null;
            if (z11) {
            }
        } else {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + j(0)).toString());
        }
    }

    public final void h() {
        this.H = this.G;
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.G = usageByParent;
        e<LayoutNode> r3 = r();
        int i10 = r3.f11334k;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = r3.f11332i;
            g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                LayoutNode layoutNode = layoutNodeArr[i11];
                if (layoutNode.G != usageByParent) {
                    layoutNode.h();
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public final void i() {
        this.H = this.G;
        this.G = UsageByParent.NotUsed;
        e<LayoutNode> r3 = r();
        int i10 = r3.f11334k;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = r3.f11332i;
            g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                LayoutNode layoutNode = layoutNodeArr[i11];
                if (layoutNode.G == UsageByParent.InLayoutBlock) {
                    layoutNode.i();
                }
                i11++;
            } while (i11 < i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String j(int i10) {
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        e<LayoutNode> r3 = r();
        int i12 = r3.f11334k;
        if (i12 > 0) {
            LayoutNode[] layoutNodeArr = r3.f11332i;
            g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i13 = 0;
            do {
                sb.append(layoutNodeArr[i13].j(i10 + 1));
                i13++;
            } while (i13 < i12);
            String sb2 = sb.toString();
            g.e(sb2, "tree.toString()");
            if (i10 != 0) {
                String substring = sb2.substring(0, sb2.length() - 1);
                g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
            return sb2;
        }
        String sb22 = sb.toString();
        g.e(sb22, "tree.toString()");
        if (i10 != 0) {
        }
    }

    public final void k() {
        l1.p pVar;
        b0 b0Var = this.f3420p;
        String str = null;
        if (b0Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            LayoutNode p10 = p();
            if (p10 != null) {
                str = p10.j(0);
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString().toString());
        }
        LayoutNode p11 = p();
        if (p11 != null) {
            p11.u();
            p11.x();
            this.E = UsageByParent.NotUsed;
        }
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.K;
        l1.n nVar = layoutNodeLayoutDelegate.f3452k.f3479t;
        nVar.f3373b = true;
        nVar.c = false;
        nVar.f3375e = false;
        nVar.f3374d = false;
        nVar.f3376f = false;
        nVar.f3377g = false;
        nVar.f3378h = null;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.f3453l;
        if (lookaheadPassDelegate != null && (pVar = lookaheadPassDelegate.f3459s) != null) {
            pVar.f3373b = true;
            pVar.c = false;
            pVar.f3375e = false;
            pVar.f3374d = false;
            pVar.f3376f = false;
            pVar.f3377g = false;
            pVar.f3378h = null;
        }
        v vVar = this.J;
        NodeCoordinator nodeCoordinator = vVar.f15779b.f3500p;
        for (NodeCoordinator nodeCoordinator2 = vVar.c; !g.a(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f3500p) {
            nodeCoordinator2.d1(nodeCoordinator2.f3503s);
            LayoutNode p12 = nodeCoordinator2.f3499o.p();
            if (p12 != null) {
                p12.u();
            }
        }
        if (p.r(this) != null) {
            b0Var.l();
        }
        for (d.c cVar = vVar.f15780d; cVar != null; cVar = cVar.f16828l) {
            if (cVar.f16830o) {
                cVar.p();
            }
        }
        b0Var.r(this);
        this.f3420p = null;
        this.f3421q = 0;
        e eVar = (e) this.f3417l.f15776a;
        int i10 = eVar.f11334k;
        if (i10 > 0) {
            Object[] objArr = eVar.f11332i;
            g.d(objArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                ((LayoutNode) objArr[i11]).k();
                i11++;
            } while (i11 < i10);
            this.B = Integer.MAX_VALUE;
            this.C = Integer.MAX_VALUE;
            this.A = false;
        }
        this.B = Integer.MAX_VALUE;
        this.C = Integer.MAX_VALUE;
        this.A = false;
    }

    public final void l(o oVar) {
        g.f(oVar, "canvas");
        this.J.c.M0(oVar);
    }

    public final List<j1.p> m() {
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = this.K.f3452k;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
        layoutNodeLayoutDelegate.f3443a.Q();
        boolean z10 = measurePassDelegate.f3481v;
        e<j1.p> eVar = measurePassDelegate.f3480u;
        if (z10) {
            m0.b.s(layoutNodeLayoutDelegate.f3443a, eVar, LayoutNodeLayoutDelegate$MeasurePassDelegate$childMeasurables$1.f3483j);
            measurePassDelegate.f3481v = false;
        }
        return eVar.e();
    }

    public final List<LayoutNode> n() {
        return r().e();
    }

    public final List<LayoutNode> o() {
        return ((e) this.f3417l.f15776a).e();
    }

    public final LayoutNode p() {
        LayoutNode layoutNode = this.f3419o;
        boolean z10 = false;
        if (layoutNode != null && layoutNode.f3414i) {
            z10 = true;
        }
        if (z10) {
            if (layoutNode != null) {
                return layoutNode.p();
            }
            return null;
        }
        return layoutNode;
    }

    public final e<LayoutNode> q() {
        boolean z10 = this.f3424t;
        e<LayoutNode> eVar = this.f3423s;
        if (z10) {
            eVar.g();
            eVar.c(eVar.f11334k, r());
            eVar.p(V);
            this.f3424t = false;
        }
        return eVar;
    }

    public final e<LayoutNode> r() {
        Q();
        if (this.f3416k == 0) {
            return (e) this.f3417l.f15776a;
        }
        e<LayoutNode> eVar = this.f3418m;
        g.c(eVar);
        return eVar;
    }

    public final void s(long j2, l1.f<e0> fVar, boolean z10, boolean z11) {
        g.f(fVar, "hitTestResult");
        v vVar = this.J;
        vVar.c.Y0(NodeCoordinator.K, vVar.c.Q0(j2), fVar, z10, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(int i10, LayoutNode layoutNode) {
        boolean z10;
        boolean z11;
        b0 b0Var;
        e eVar;
        int i11;
        g.f(layoutNode, "instance");
        int i12 = 0;
        if (layoutNode.f3419o == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        androidx.compose.ui.node.b bVar = null;
        String str = null;
        if (!z10) {
            StringBuilder sb = new StringBuilder("Cannot insert ");
            sb.append(layoutNode);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(j(0));
            sb.append(" Other tree: ");
            LayoutNode layoutNode2 = layoutNode.f3419o;
            if (layoutNode2 != null) {
                str = layoutNode2.j(0);
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (layoutNode.f3420p == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            layoutNode.f3419o = this;
            u uVar = this.f3417l;
            ((e) uVar.f15776a).a(i10, layoutNode);
            ((u7.a) uVar.f15777b).k0();
            F();
            boolean z12 = this.f3414i;
            boolean z13 = layoutNode.f3414i;
            if (z13) {
                if (!z12) {
                    this.f3416k++;
                } else {
                    throw new IllegalArgumentException("Virtual LayoutNode can't be added into a virtual parent".toString());
                }
            }
            y();
            NodeCoordinator nodeCoordinator = layoutNode.J.c;
            v vVar = this.J;
            if (z12) {
                LayoutNode layoutNode3 = this.f3419o;
                if (layoutNode3 != null) {
                    bVar = layoutNode3.J.f15779b;
                }
            } else {
                bVar = vVar.f15779b;
            }
            nodeCoordinator.f3501q = bVar;
            if (z13 && (i11 = (eVar = (e) layoutNode.f3417l.f15776a).f11334k) > 0) {
                T[] tArr = eVar.f11332i;
                g.d(tArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    ((LayoutNode) tArr[i12]).J.c.f3501q = vVar.f15779b;
                    i12++;
                } while (i12 < i11);
                b0Var = this.f3420p;
                if (b0Var != null) {
                }
                if (layoutNode.K.f3451j <= 0) {
                }
            } else {
                b0Var = this.f3420p;
                if (b0Var != null) {
                    layoutNode.g(b0Var);
                }
                if (layoutNode.K.f3451j <= 0) {
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.K;
                    layoutNodeLayoutDelegate.c(layoutNodeLayoutDelegate.f3451j + 1);
                }
            }
        } else {
            throw new IllegalStateException(("Cannot insert " + layoutNode + " because it already has an owner. This tree: " + j(0) + " Other tree: " + layoutNode.j(0)).toString());
        }
    }

    public final String toString() {
        return m0.b.l1(this) + " children: " + n().size() + " measurePolicy: " + this.f3425u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
        r0.a1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u() {
        z zVar;
        if (this.O) {
            v vVar = this.J;
            NodeCoordinator nodeCoordinator = vVar.f15779b;
            NodeCoordinator nodeCoordinator2 = vVar.c.f3501q;
            this.N = null;
            while (true) {
                if (g.a(nodeCoordinator, nodeCoordinator2)) {
                    break;
                }
                if (nodeCoordinator != null) {
                    zVar = nodeCoordinator.F;
                } else {
                    zVar = null;
                }
                if (zVar != null) {
                    this.N = nodeCoordinator;
                    break;
                } else if (nodeCoordinator != null) {
                    nodeCoordinator = nodeCoordinator.f3501q;
                } else {
                    nodeCoordinator = null;
                }
            }
        }
        NodeCoordinator nodeCoordinator3 = this.N;
        if (nodeCoordinator3 != null && nodeCoordinator3.F == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        LayoutNode p10 = p();
        if (p10 != null) {
            p10.u();
        }
    }

    public final void v() {
        v vVar = this.J;
        NodeCoordinator nodeCoordinator = vVar.c;
        androidx.compose.ui.node.b bVar = vVar.f15779b;
        while (nodeCoordinator != bVar) {
            g.d(nodeCoordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            l1.l lVar = (l1.l) nodeCoordinator;
            z zVar = lVar.F;
            if (zVar != null) {
                zVar.invalidate();
            }
            nodeCoordinator = lVar.f3500p;
        }
        z zVar2 = vVar.f15779b.F;
        if (zVar2 != null) {
            zVar2.invalidate();
        }
    }

    @Override // l1.c0
    public final boolean w() {
        return z();
    }

    public final void x() {
        if (this.f3428x != null) {
            K(false);
        } else {
            M(false);
        }
    }

    public final void y() {
        LayoutNode p10;
        if (this.f3416k > 0) {
            this.n = true;
        }
        if (this.f3414i && (p10 = p()) != null) {
            p10.n = true;
        }
    }

    public final boolean z() {
        return this.f3420p != null;
    }

    public LayoutNode(int i10, boolean z10, int i11) {
        this((i10 & 2) != 0 ? o1.l.f16209k.addAndGet(1) : 0, (i10 & 1) != 0 ? false : z10);
    }
}
