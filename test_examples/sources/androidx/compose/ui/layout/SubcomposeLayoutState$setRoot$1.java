package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.datastore.preferences.PreferencesProto$Value;
import j1.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/layout/c;", "it", "Lm7/n;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/c;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SubcomposeLayoutState$setRoot$1 extends Lambda implements p<LayoutNode, c, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ c f3343j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setRoot$1(c cVar) {
        super(2);
        this.f3343j = cVar;
    }

    @Override // u7.p
    public final n R(LayoutNode layoutNode, c cVar) {
        LayoutNode layoutNode2 = layoutNode;
        g.f(layoutNode2, "$this$null");
        g.f(cVar, "it");
        b bVar = layoutNode2.M;
        c cVar2 = this.f3343j;
        if (bVar == null) {
            bVar = new b(layoutNode2, cVar2.f3363a);
            layoutNode2.M = bVar;
        }
        cVar2.f3364b = bVar;
        cVar2.a().b();
        b a10 = cVar2.a();
        g0 g0Var = cVar2.f3363a;
        g.f(g0Var, "value");
        if (a10.c != g0Var) {
            a10.c = g0Var;
            a10.a(0);
        }
        return n.f16010a;
    }
}
