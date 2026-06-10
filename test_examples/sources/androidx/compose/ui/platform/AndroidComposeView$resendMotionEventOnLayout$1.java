package androidx.compose.ui.platform;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class AndroidComposeView$resendMotionEventOnLayout$1 extends Lambda implements u7.a<m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f3606j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$resendMotionEventOnLayout$1(AndroidComposeView androidComposeView) {
        super(0);
        this.f3606j = androidComposeView;
    }

    @Override // u7.a
    public final m7.n k0() {
        int actionMasked;
        AndroidComposeView androidComposeView = this.f3606j;
        MotionEvent motionEvent = androidComposeView.f3577o0;
        if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
            androidComposeView.f3579p0 = SystemClock.uptimeMillis();
            androidComposeView.post(androidComposeView.f3585s0);
        }
        return m7.n.f16010a;
    }
}
