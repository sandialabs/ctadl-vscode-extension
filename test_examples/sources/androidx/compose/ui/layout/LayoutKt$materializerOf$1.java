package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import g0.t0;
import g0.v0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.q;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg0/v0;", "Landroidx/compose/ui/node/ComposeUiNode;", "Lm7/n;", "invoke-Deg8D_g", "(Lg0/d;Lg0/d;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class LayoutKt$materializerOf$1 extends Lambda implements q<v0<ComposeUiNode>, d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ q0.d f3320j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutKt$materializerOf$1(q0.d dVar) {
        super(3);
        this.f3320j = dVar;
    }

    @Override // u7.q
    public final n O(v0<ComposeUiNode> v0Var, d dVar, Integer num) {
        d dVar2 = v0Var.f11087a;
        num.intValue();
        g.f(dVar2, "$this$null");
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        q0.d b5 = ComposedModifierKt.b(dVar, this.f3320j);
        dVar2.f(509942095);
        ComposeUiNode.f3400a.getClass();
        a1.c.s1(dVar2, b5, ComposeUiNode.Companion.c);
        dVar2.u();
        return n.f16010a;
    }
}
