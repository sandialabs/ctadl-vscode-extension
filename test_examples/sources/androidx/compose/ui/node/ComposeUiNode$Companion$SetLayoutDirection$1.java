package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/unit/LayoutDirection;", "it", "Lm7/n;", "invoke", "(Landroidx/compose/ui/node/ComposeUiNode;Landroidx/compose/ui/unit/LayoutDirection;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposeUiNode$Companion$SetLayoutDirection$1 extends Lambda implements p<ComposeUiNode, LayoutDirection, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final ComposeUiNode$Companion$SetLayoutDirection$1 f3408j = new ComposeUiNode$Companion$SetLayoutDirection$1();

    public ComposeUiNode$Companion$SetLayoutDirection$1() {
        super(2);
    }

    @Override // u7.p
    public final n R(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
        ComposeUiNode composeUiNode2 = composeUiNode;
        LayoutDirection layoutDirection2 = layoutDirection;
        g.f(composeUiNode2, "$this$null");
        g.f(layoutDirection2, "it");
        composeUiNode2.d(layoutDirection2);
        return n.f16010a;
    }
}
