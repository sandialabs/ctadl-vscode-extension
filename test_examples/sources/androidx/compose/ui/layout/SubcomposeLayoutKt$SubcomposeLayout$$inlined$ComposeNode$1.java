package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SubcomposeLayoutKt$SubcomposeLayout$$inlined$ComposeNode$1 extends Lambda implements u7.a<LayoutNode> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ u7.a f3330j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutKt$SubcomposeLayout$$inlined$ComposeNode$1(u7.a aVar) {
        super(0);
        this.f3330j = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
    @Override // u7.a
    public final LayoutNode k0() {
        return this.f3330j.k0();
    }
}
