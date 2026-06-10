package androidx.compose.ui.platform;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc1/a;", "it", "", "invoke-iuPiT84", "(I)Ljava/lang/Boolean;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class AndroidComposeView$_inputModeManager$1 extends Lambda implements u7.l<c1.a, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f3600j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$_inputModeManager$1(AndroidComposeView androidComposeView) {
        super(1);
        this.f3600j = androidComposeView;
    }

    @Override // u7.l
    public final Boolean U(c1.a aVar) {
        boolean z10;
        boolean z11;
        int i10 = aVar.f6514a;
        boolean z12 = false;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidComposeView androidComposeView = this.f3600j;
        if (z10) {
            z12 = androidComposeView.isInTouchMode();
        } else {
            if (i10 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (androidComposeView.isInTouchMode()) {
                    z12 = androidComposeView.requestFocusFromTouch();
                } else {
                    z12 = true;
                }
            }
        }
        return Boolean.valueOf(z12);
    }
}
