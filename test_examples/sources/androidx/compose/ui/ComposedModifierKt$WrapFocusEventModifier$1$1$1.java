package androidx.compose.ui;

import androidx.compose.ui.focus.FocusStateImpl;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import t0.c;
import u7.a;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ComposedModifierKt$WrapFocusEventModifier$1$1$1 extends Lambda implements a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ c f2991j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposedModifierKt$WrapFocusEventModifier$1$1$1(c cVar) {
        super(0);
        this.f2991j = cVar;
    }

    @Override // u7.a
    public final n k0() {
        boolean z10;
        c cVar = this.f2991j;
        if (cVar.f17546l.f11334k == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cVar.f17543i.U(FocusStateImpl.Inactive);
        }
        return n.f16010a;
    }
}
