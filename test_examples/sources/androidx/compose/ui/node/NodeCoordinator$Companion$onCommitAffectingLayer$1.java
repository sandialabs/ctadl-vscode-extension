package androidx.compose.ui.node;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import l1.z;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Lm7/n;", "invoke", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class NodeCoordinator$Companion$onCommitAffectingLayer$1 extends Lambda implements l<NodeCoordinator, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final NodeCoordinator$Companion$onCommitAffectingLayer$1 f3511j = new NodeCoordinator$Companion$onCommitAffectingLayer$1();

    public NodeCoordinator$Companion$onCommitAffectingLayer$1() {
        super(1);
    }

    @Override // u7.l
    public final n U(NodeCoordinator nodeCoordinator) {
        NodeCoordinator nodeCoordinator2 = nodeCoordinator;
        g.f(nodeCoordinator2, "coordinator");
        z zVar = nodeCoordinator2.F;
        if (zVar != null) {
            zVar.invalidate();
        }
        return n.f16010a;
    }
}
