package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.datastore.preferences.PreferencesProto$Value;
import j1.f0;
import j1.m;
import j1.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function2;", "Lj1/f0;", "Lb2/a;", "Lj1/r;", "it", "Lm7/n;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;Lu7/p;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SubcomposeLayoutState$setMeasurePolicy$1 extends Lambda implements p<LayoutNode, p<? super f0, ? super b2.a, ? extends r>, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ c f3342j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setMeasurePolicy$1(c cVar) {
        super(2);
        this.f3342j = cVar;
    }

    @Override // u7.p
    public final n R(LayoutNode layoutNode, p<? super f0, ? super b2.a, ? extends r> pVar) {
        LayoutNode layoutNode2 = layoutNode;
        p<? super f0, ? super b2.a, ? extends r> pVar2 = pVar;
        g.f(layoutNode2, "$this$null");
        g.f(pVar2, "it");
        b a10 = this.f3342j.a();
        layoutNode2.b(new m(a10, pVar2, a10.f3354l));
        return n.f16010a;
    }
}
