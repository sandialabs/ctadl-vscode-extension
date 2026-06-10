package androidx.compose.ui.node;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Lm7/n;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class OwnerSnapshotObserver$onCommitAffectingLookaheadLayout$1 extends Lambda implements l<LayoutNode, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final OwnerSnapshotObserver$onCommitAffectingLookaheadLayout$1 f3547j = new OwnerSnapshotObserver$onCommitAffectingLookaheadLayout$1();

    public OwnerSnapshotObserver$onCommitAffectingLookaheadLayout$1() {
        super(1);
    }

    @Override // u7.l
    public final n U(LayoutNode layoutNode) {
        LayoutNode layoutNode2 = layoutNode;
        g.f(layoutNode2, "layoutNode");
        if (layoutNode2.z()) {
            layoutNode2.J(false);
        }
        return n.f16010a;
    }
}
