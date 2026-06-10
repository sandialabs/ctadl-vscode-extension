package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.datastore.preferences.PreferencesProto$Value;
import j1.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "it", "Lj1/p;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)Lj1/p;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
final class LayoutNodeLayoutDelegate$LookaheadPassDelegate$childMeasurables$2 extends Lambda implements l<LayoutNode, p> {

    /* renamed from: j  reason: collision with root package name */
    public static final LayoutNodeLayoutDelegate$LookaheadPassDelegate$childMeasurables$2 f3464j = new LayoutNodeLayoutDelegate$LookaheadPassDelegate$childMeasurables$2();

    public LayoutNodeLayoutDelegate$LookaheadPassDelegate$childMeasurables$2() {
        super(1);
    }

    @Override // u7.l
    public final p U(LayoutNode layoutNode) {
        LayoutNode layoutNode2 = layoutNode;
        g.f(layoutNode2, "it");
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNode2.K.f3453l;
        g.c(lookaheadPassDelegate);
        return lookaheadPassDelegate;
    }
}
