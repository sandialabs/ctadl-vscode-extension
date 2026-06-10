package h6;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f11486a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.material.textfield.a f11487b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f11488d;

    public o(com.google.android.material.textfield.a aVar) {
        this.f11486a = aVar.f7456i;
        this.f11487b = aVar;
        this.c = aVar.getContext();
        this.f11488d = aVar.f7461o;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public b3.d h() {
        return null;
    }

    public boolean i(int i10) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof n;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(b3.g gVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z10) {
    }

    public final void q() {
        this.f11487b.e(false);
    }

    public void r() {
    }

    public void s() {
    }
}
