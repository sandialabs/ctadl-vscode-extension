package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.n0;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/n0;", "Lm7/n;", "invoke", "(Landroidx/compose/ui/platform/n0;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class SizeKt$createFillWidthModifier$1 extends Lambda implements l<n0, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ float f1963j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$createFillWidthModifier$1(float f10) {
        super(1);
        this.f1963j = f10;
    }

    @Override // u7.l
    public final n U(n0 n0Var) {
        n0 n0Var2 = n0Var;
        g.f(n0Var2, "$this$$receiver");
        n0Var2.f3861a.b(Float.valueOf(this.f1963j), "fraction");
        return n.f16010a;
    }
}
