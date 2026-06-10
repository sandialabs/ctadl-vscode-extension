package androidx.compose.ui.layout;

import androidx.compose.ui.layout.b;
import androidx.compose.ui.node.LayoutNode;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SubcomposeLayoutKt$SubcomposeLayout$4 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ c f3335j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutKt$SubcomposeLayout$4(c cVar) {
        super(0);
        this.f3335j = cVar;
    }

    @Override // u7.a
    public final n k0() {
        b a10 = this.f3335j.a();
        for (Map.Entry entry : a10.f3347e.entrySet()) {
            ((b.a) entry.getValue()).f3357d = true;
        }
        LayoutNode layoutNode = a10.f3344a;
        if (!layoutNode.K.c) {
            layoutNode.M(false);
        }
        return n.f16010a;
    }
}
