package o1;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsNode;
import l1.h0;
import v0.p;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final LayoutNode f16211a;

    public m(LayoutNode layoutNode) {
        v7.g.f(layoutNode, "rootNode");
        this.f16211a = layoutNode;
    }

    public final SemanticsNode a() {
        h0 r3 = p.r(this.f16211a);
        v7.g.c(r3);
        return new SemanticsNode(r3, false, p.E(r3));
    }
}
