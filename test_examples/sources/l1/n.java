package l1;

import androidx.compose.ui.node.AlignmentLines;
import androidx.compose.ui.node.NodeCoordinator;
import java.util.Map;

/* loaded from: classes.dex */
public final class n extends AlignmentLines {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a aVar) {
        super(aVar);
        v7.g.f(aVar, "alignmentLinesOwner");
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public final long b(NodeCoordinator nodeCoordinator, long j2) {
        v7.g.f(nodeCoordinator, "$this$calculatePositionInParent");
        return nodeCoordinator.l1(j2);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public final Map<j1.a, Integer> c(NodeCoordinator nodeCoordinator) {
        v7.g.f(nodeCoordinator, "<this>");
        return nodeCoordinator.C0().f();
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public final int d(NodeCoordinator nodeCoordinator, j1.a aVar) {
        v7.g.f(aVar, "alignmentLine");
        return nodeCoordinator.f0(aVar);
    }
}
