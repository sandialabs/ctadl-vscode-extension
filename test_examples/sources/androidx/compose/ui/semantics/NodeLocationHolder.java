package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.b;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import u0.d;
import v7.g;

/* loaded from: classes.dex */
public final class NodeLocationHolder implements Comparable<NodeLocationHolder> {

    /* renamed from: m  reason: collision with root package name */
    public static ComparisonStrategy f3924m = ComparisonStrategy.Stripe;

    /* renamed from: i  reason: collision with root package name */
    public final LayoutNode f3925i;

    /* renamed from: j  reason: collision with root package name */
    public final LayoutNode f3926j;

    /* renamed from: k  reason: collision with root package name */
    public final d f3927k;

    /* renamed from: l  reason: collision with root package name */
    public final LayoutDirection f3928l;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "", "ui_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* loaded from: classes.dex */
    public enum ComparisonStrategy {
        Stripe,
        Location
    }

    public NodeLocationHolder(LayoutNode layoutNode, LayoutNode layoutNode2) {
        d dVar;
        g.f(layoutNode, "subtreeRoot");
        this.f3925i = layoutNode;
        this.f3926j = layoutNode2;
        this.f3928l = layoutNode.f3429y;
        b bVar = layoutNode.J.f15779b;
        NodeCoordinator b02 = m0.b.b0(layoutNode2);
        if (bVar.P() && b02.P()) {
            dVar = bVar.t(b02, true);
        } else {
            dVar = null;
        }
        this.f3927k = dVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(NodeLocationHolder nodeLocationHolder) {
        boolean z10;
        boolean z11;
        g.f(nodeLocationHolder, "other");
        d dVar = this.f3927k;
        if (dVar == null) {
            return 1;
        }
        d dVar2 = nodeLocationHolder.f3927k;
        if (dVar2 == null) {
            return -1;
        }
        ComparisonStrategy comparisonStrategy = f3924m;
        ComparisonStrategy comparisonStrategy2 = ComparisonStrategy.Stripe;
        float f10 = dVar.f17727b;
        float f11 = dVar2.f17727b;
        if (comparisonStrategy == comparisonStrategy2) {
            if (dVar.f17728d - f11 <= 0.0f) {
                return -1;
            }
            if (f10 - dVar2.f17728d >= 0.0f) {
                return 1;
            }
        }
        boolean z12 = false;
        if (this.f3928l == LayoutDirection.Ltr) {
            int i10 = ((dVar.f17726a - dVar2.f17726a) > 0.0f ? 1 : ((dVar.f17726a - dVar2.f17726a) == 0.0f ? 0 : -1));
            if (i10 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (i10 >= 0) {
                    return 1;
                }
                return -1;
            }
        } else {
            int i11 = ((dVar.c - dVar2.c) > 0.0f ? 1 : ((dVar.c - dVar2.c) == 0.0f ? 0 : -1));
            if (i11 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (i11 < 0) {
                    return 1;
                }
                return -1;
            }
        }
        int i12 = ((f10 - f11) > 0.0f ? 1 : ((f10 - f11) == 0.0f ? 0 : -1));
        if (i12 == 0) {
            z12 = true;
        }
        if (!z12) {
            if (i12 >= 0) {
                return 1;
            }
            return -1;
        }
        LayoutNode layoutNode = this.f3926j;
        d y10 = m0.b.y(m0.b.b0(layoutNode));
        LayoutNode layoutNode2 = nodeLocationHolder.f3926j;
        d y11 = m0.b.y(m0.b.b0(layoutNode2));
        LayoutNode c0 = m0.b.c0(layoutNode, new NodeLocationHolder$compareTo$child1$1(y10));
        LayoutNode c02 = m0.b.c0(layoutNode2, new NodeLocationHolder$compareTo$child2$1(y11));
        if (c0 != null && c02 != null) {
            return new NodeLocationHolder(this.f3925i, c0).compareTo(new NodeLocationHolder(nodeLocationHolder.f3925i, c02));
        }
        if (c0 != null) {
            return 1;
        }
        if (c02 != null) {
            return -1;
        }
        int compare = LayoutNode.V.compare(layoutNode, layoutNode2);
        if (compare != 0) {
            return -compare;
        }
        return layoutNode.f3415j - layoutNode2.f3415j;
    }
}
