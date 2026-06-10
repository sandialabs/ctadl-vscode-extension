package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.b;
import u0.d;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/node/LayoutNode;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/Boolean;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class NodeLocationHolder$compareTo$child1$1 extends Lambda implements l<LayoutNode, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ d f3932j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeLocationHolder$compareTo$child1$1(d dVar) {
        super(1);
        this.f3932j = dVar;
    }

    @Override // u7.l
    public final Boolean U(LayoutNode layoutNode) {
        boolean z10;
        LayoutNode layoutNode2 = layoutNode;
        g.f(layoutNode2, "it");
        NodeCoordinator b02 = b.b0(layoutNode2);
        if (b02.P()) {
            if (!g.a(this.f3932j, b.y(b02))) {
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
