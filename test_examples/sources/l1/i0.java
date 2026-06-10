package l1;

import androidx.compose.ui.node.LayoutNode;

/* loaded from: classes.dex */
public final class i0 extends g0.a<LayoutNode> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(LayoutNode layoutNode) {
        super(layoutNode);
        v7.g.f(layoutNode, "root");
    }

    @Override // g0.c
    public final void b(int i10, Object obj) {
        LayoutNode layoutNode = (LayoutNode) obj;
        v7.g.f(layoutNode, "instance");
        ((LayoutNode) this.c).t(i10, layoutNode);
    }

    @Override // g0.c
    public final void e(int i10, Object obj) {
        v7.g.f((LayoutNode) obj, "instance");
    }

    @Override // g0.a, g0.c
    public final void f() {
        b0 b0Var = ((LayoutNode) this.f11026a).f3420p;
        if (b0Var != null) {
            b0Var.j();
        }
    }

    @Override // g0.c
    public final void g(int i10, int i11, int i12) {
        ((LayoutNode) this.c).D(i10, i11, i12);
    }

    @Override // g0.c
    public final void h(int i10, int i11) {
        ((LayoutNode) this.c).I(i10, i11);
    }

    @Override // g0.a
    public final void j() {
        ((LayoutNode) this.f11026a).H();
    }
}
