package l1;

import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class c implements Comparator<LayoutNode> {
    @Override // java.util.Comparator
    public final int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
        LayoutNode layoutNode3 = layoutNode;
        LayoutNode layoutNode4 = layoutNode2;
        v7.g.f(layoutNode3, "l1");
        v7.g.f(layoutNode4, "l2");
        int h10 = v7.g.h(layoutNode3.f3421q, layoutNode4.f3421q);
        if (h10 == 0) {
            return v7.g.h(layoutNode3.hashCode(), layoutNode4.hashCode());
        }
        return h10;
    }
}
