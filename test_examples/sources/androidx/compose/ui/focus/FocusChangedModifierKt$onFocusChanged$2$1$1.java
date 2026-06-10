package androidx.compose.ui.focus;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import t0.k;
import u7.l;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
final class FocusChangedModifierKt$onFocusChanged$2$1$1 extends Lambda implements l<k, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g0<k> f3007j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ l<k, n> f3008k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FocusChangedModifierKt$onFocusChanged$2$1$1(g0<k> g0Var, l<? super k, n> lVar) {
        super(1);
        this.f3007j = g0Var;
        this.f3008k = lVar;
    }

    @Override // u7.l
    public final n U(k kVar) {
        k kVar2 = kVar;
        g.f(kVar2, "it");
        g0<k> g0Var = this.f3007j;
        if (!g.a(g0Var.getValue(), kVar2)) {
            g0Var.setValue(kVar2);
            this.f3008k.U(kVar2);
        }
        return n.f16010a;
    }
}
