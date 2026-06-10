package androidx.compose.ui.focus;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "destination", "Landroidx/compose/ui/focus/FocusModifier;", "invoke", "(Landroidx/compose/ui/focus/FocusModifier;)Ljava/lang/Boolean;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FocusManagerImpl$moveFocus$foundNextItem$1 extends Lambda implements l<FocusModifier, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FocusModifier f3015j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusManagerImpl$moveFocus$foundNextItem$1(FocusModifier focusModifier) {
        super(1);
        this.f3015j = focusModifier;
    }

    @Override // u7.l
    public final Boolean U(FocusModifier focusModifier) {
        FocusModifier focusModifier2 = focusModifier;
        g.f(focusModifier2, "destination");
        if (g.a(focusModifier2, this.f3015j)) {
            return Boolean.FALSE;
        }
        if (focusModifier2.f3017j != null) {
            FocusTransactionsKt.e(focusModifier2);
            return Boolean.TRUE;
        }
        throw new IllegalStateException("Focus search landed at the root.".toString());
    }
}
