package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lg0/g;", "it", "Lm7/n;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;Lg0/g;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SubcomposeLayoutState$setCompositionContext$1 extends Lambda implements p<LayoutNode, g, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ c f3341j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setCompositionContext$1(c cVar) {
        super(2);
        this.f3341j = cVar;
    }

    @Override // u7.p
    public final n R(LayoutNode layoutNode, g gVar) {
        g gVar2 = gVar;
        v7.g.f(layoutNode, "$this$null");
        v7.g.f(gVar2, "it");
        this.f3341j.a().f3345b = gVar2;
        return n.f16010a;
    }
}
