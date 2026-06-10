package androidx.compose.ui.text.input;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import m7.e;
import v1.b;
import v7.g;

/* loaded from: classes.dex */
public final class InputMethodManagerImpl implements b {

    /* renamed from: a  reason: collision with root package name */
    public final e f4129a;

    public InputMethodManagerImpl(Context context) {
        this.f4129a = a.a(LazyThreadSafetyMode.NONE, new InputMethodManagerImpl$imm$2(context));
    }

    @Override // v1.b
    public final void a(IBinder iBinder) {
        ((InputMethodManager) this.f4129a.getValue()).hideSoftInputFromWindow(iBinder, 0);
    }

    @Override // v1.b
    public final void b(View view) {
        g.f(view, "view");
        ((InputMethodManager) this.f4129a.getValue()).showSoftInput(view, 0);
    }

    @Override // v1.b
    public final void c(View view) {
        g.f(view, "view");
        ((InputMethodManager) this.f4129a.getValue()).restartInput(view);
    }
}
