package androidx.compose.ui.text.input;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.a;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/inputmethod/InputMethodManager;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class InputMethodManagerImpl$imm$2 extends Lambda implements a<InputMethodManager> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Context f4130j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputMethodManagerImpl$imm$2(Context context) {
        super(0);
        this.f4130j = context;
    }

    @Override // u7.a
    public final InputMethodManager k0() {
        Object systemService = this.f4130j.getSystemService("input_method");
        g.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }
}
