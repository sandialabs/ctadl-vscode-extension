package androidx.compose.ui.node;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/node/LayoutNode;", "", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
final class DepthSortedSet$mapOfOriginalDepth$2 extends Lambda implements u7.a<Map<LayoutNode, Integer>> {

    /* renamed from: j  reason: collision with root package name */
    public static final DepthSortedSet$mapOfOriginalDepth$2 f3413j = new DepthSortedSet$mapOfOriginalDepth$2();

    public DepthSortedSet$mapOfOriginalDepth$2() {
        super(0);
    }

    @Override // u7.a
    public final Map<LayoutNode, Integer> k0() {
        return new LinkedHashMap();
    }
}
