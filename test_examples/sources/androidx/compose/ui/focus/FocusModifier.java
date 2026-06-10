package androidx.compose.ui.focus;

import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import d1.a;
import h0.e;
import j1.b;
import j1.x;
import k1.d;
import k1.f;
import k1.g;
import l1.b0;
import l1.c0;
import m7.n;
import t0.c;
import t0.h;
import t0.j;
import u7.l;
import u7.p;

/* loaded from: classes.dex */
public final class FocusModifier extends o0 implements d, f<FocusModifier>, c0, x {

    /* renamed from: y  reason: collision with root package name */
    public static final l<FocusModifier, n> f3016y = FocusModifier$Companion$RefreshFocusProperties$1.f3031j;

    /* renamed from: j  reason: collision with root package name */
    public FocusModifier f3017j;

    /* renamed from: k  reason: collision with root package name */
    public final e<FocusModifier> f3018k;

    /* renamed from: l  reason: collision with root package name */
    public FocusStateImpl f3019l;

    /* renamed from: m  reason: collision with root package name */
    public FocusModifier f3020m;
    public c n;

    /* renamed from: o  reason: collision with root package name */
    public a<i1.a> f3021o;

    /* renamed from: p  reason: collision with root package name */
    public g f3022p;

    /* renamed from: q  reason: collision with root package name */
    public b f3023q;

    /* renamed from: r  reason: collision with root package name */
    public h f3024r;

    /* renamed from: s  reason: collision with root package name */
    public final FocusPropertiesImpl f3025s;

    /* renamed from: t  reason: collision with root package name */
    public j f3026t;

    /* renamed from: u  reason: collision with root package name */
    public NodeCoordinator f3027u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3028v;

    /* renamed from: w  reason: collision with root package name */
    public e1.c f3029w;

    /* renamed from: x  reason: collision with root package name */
    public final e<e1.c> f3030x;

    public FocusModifier() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FocusModifier(int i10) {
        super(r0);
        FocusStateImpl focusStateImpl = FocusStateImpl.Inactive;
        l<n0, n> lVar = InspectableValueKt.f3744a;
        v7.g.f(lVar, "inspectorInfo");
        this.f3018k = new e<>(new FocusModifier[16]);
        this.f3019l = focusStateImpl;
        this.f3025s = new FocusPropertiesImpl();
        this.f3030x = new e<>(new e1.c[16]);
    }

    @Override // k1.d
    public final void T(g gVar) {
        e<FocusModifier> eVar;
        e<FocusModifier> eVar2;
        int ordinal;
        NodeCoordinator nodeCoordinator;
        LayoutNode layoutNode;
        b0 b0Var;
        t0.d focusManager;
        v7.g.f(gVar, "scope");
        this.f3022p = gVar;
        FocusModifier focusModifier = (FocusModifier) gVar.i(FocusModifierKt.f3032a);
        if (!v7.g.a(focusModifier, this.f3017j)) {
            if (focusModifier == null && (((ordinal = this.f3019l.ordinal()) == 0 || ordinal == 2) && (nodeCoordinator = this.f3027u) != null && (layoutNode = nodeCoordinator.f3499o) != null && (b0Var = layoutNode.f3420p) != null && (focusManager = b0Var.getFocusManager()) != null)) {
                focusManager.b(true);
            }
            FocusModifier focusModifier2 = this.f3017j;
            if (focusModifier2 != null && (eVar2 = focusModifier2.f3018k) != null) {
                eVar2.l(this);
            }
            if (focusModifier != null && (eVar = focusModifier.f3018k) != null) {
                eVar.b(this);
            }
        }
        this.f3017j = focusModifier;
        c cVar = (c) gVar.i(FocusEventModifierKt.f3009a);
        if (!v7.g.a(cVar, this.n)) {
            c cVar2 = this.n;
            if (cVar2 != null) {
                cVar2.e(this);
            }
            if (cVar != null) {
                cVar.a(this);
            }
        }
        this.n = cVar;
        j jVar = (j) gVar.i(FocusRequesterModifierKt.f3057a);
        if (!v7.g.a(jVar, this.f3026t)) {
            j jVar2 = this.f3026t;
            if (jVar2 != null) {
                jVar2.e(this);
            }
            if (jVar != null) {
                jVar.a(this);
            }
        }
        this.f3026t = jVar;
        this.f3021o = (a) gVar.i(RotaryInputModifierKt.f3309a);
        this.f3023q = (b) gVar.i(BeyondBoundsLayoutKt.f3316a);
        this.f3029w = (e1.c) gVar.i(KeyInputModifierKt.f3249a);
        this.f3024r = (h) gVar.i(FocusPropertiesKt.f3049a);
        FocusPropertiesKt.a(this);
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    public final void c(FocusStateImpl focusStateImpl) {
        this.f3019l = focusStateImpl;
        c cVar = this.n;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // k1.f
    public final k1.h<FocusModifier> getKey() {
        return FocusModifierKt.f3032a;
    }

    @Override // k1.f
    public final FocusModifier getValue() {
        return this;
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    @Override // j1.x
    public final void o(NodeCoordinator nodeCoordinator) {
        v7.g.f(nodeCoordinator, "coordinates");
        boolean z10 = this.f3027u == null;
        this.f3027u = nodeCoordinator;
        if (z10) {
            FocusPropertiesKt.a(this);
        }
        if (this.f3028v) {
            this.f3028v = false;
            FocusTransactionsKt.e(this);
        }
    }

    @Override // l1.c0
    public final boolean w() {
        return this.f3017j != null;
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }
}
