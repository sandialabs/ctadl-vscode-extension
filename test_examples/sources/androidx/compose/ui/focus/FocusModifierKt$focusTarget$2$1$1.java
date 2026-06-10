package androidx.compose.ui.focus;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import t0.c;
import u7.a;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
final class FocusModifierKt$focusTarget$2$1$1 extends Lambda implements a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FocusModifier f3036j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusModifierKt$focusTarget$2$1$1(FocusModifier focusModifier) {
        super(0);
        this.f3036j = focusModifier;
    }

    @Override // u7.a
    public final n k0() {
        FocusModifier focusModifier = this.f3036j;
        g.f(focusModifier, "<this>");
        c cVar = focusModifier.n;
        if (cVar != null) {
            cVar.d();
        }
        return n.f16010a;
    }
}
