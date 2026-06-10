package androidx.compose.ui.text.input;

import android.view.inputmethod.BaseInputConnection;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/inputmethod/BaseInputConnection;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
final class TextInputServiceAndroid$baseInputConnection$2 extends Lambda implements a<BaseInputConnection> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TextInputServiceAndroid f4141j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroid$baseInputConnection$2(TextInputServiceAndroid textInputServiceAndroid) {
        super(0);
        this.f4141j = textInputServiceAndroid;
    }

    @Override // u7.a
    public final BaseInputConnection k0() {
        return new BaseInputConnection(this.f4141j.f4135a, false);
    }
}
