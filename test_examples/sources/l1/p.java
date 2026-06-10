package l1;

import androidx.compose.ui.node.AlignmentLines;
import androidx.compose.ui.node.NodeCoordinator;
import java.util.Map;

/* loaded from: classes.dex */
public final class p extends AlignmentLines {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(a aVar) {
        super(aVar);
        v7.g.f(aVar, "alignmentLinesOwner");
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public final long b(NodeCoordinator nodeCoordinator, long j2) {
        v7.g.f(nodeCoordinator, "$this$calculatePositionInParent");
        r rVar = nodeCoordinator.f3508x;
        v7.g.c(rVar);
        long j10 = rVar.f15762q;
        return u0.c.f(a1.c.s((int) (j10 >> 32), b2.g.a(j10)), j2);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public final Map<j1.a, Integer> c(NodeCoordinator nodeCoordinator) {
        v7.g.f(nodeCoordinator, "<this>");
        r rVar = nodeCoordinator.f3508x;
        v7.g.c(rVar);
        return rVar.C0().f();
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public final int d(NodeCoordinator nodeCoordinator, j1.a aVar) {
        v7.g.f(aVar, "alignmentLine");
        r rVar = nodeCoordinator.f3508x;
        v7.g.c(rVar);
        return rVar.f0(aVar);
    }
}
