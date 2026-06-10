package u5;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ View f17824i;

    public l(EditText editText) {
        this.f17824i = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f17824i;
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
    }
}
