package l1;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import q0.d;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final h0.e<LayoutNode> f15791a = new h0.e<>(new LayoutNode[16]);

    public static void a(LayoutNode layoutNode) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.K;
        if (layoutNodeLayoutDelegate.f3444b == LayoutNode.LayoutState.Idle && !layoutNodeLayoutDelegate.f3445d && !layoutNodeLayoutDelegate.c && layoutNode.A) {
            d.c cVar = layoutNode.J.f15781e;
            if ((cVar.f16827k & 256) != 0) {
                while (cVar != null) {
                    if ((cVar.f16826j & 256) != 0 && (cVar instanceof e)) {
                        e eVar = (e) cVar;
                        eVar.r(v0.p.D(eVar, 256));
                    }
                    if ((cVar.f16827k & 256) == 0) {
                        break;
                    }
                    cVar = cVar.f16829m;
                }
            }
        }
        int i10 = 0;
        layoutNode.Q = false;
        h0.e<LayoutNode> r3 = layoutNode.r();
        int i11 = r3.f11334k;
        if (i11 > 0) {
            LayoutNode[] layoutNodeArr = r3.f11332i;
            v7.g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                a(layoutNodeArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }
}
