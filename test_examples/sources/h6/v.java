package h6;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.noto.R;

/* loaded from: classes.dex */
public final class v extends o {

    /* renamed from: e  reason: collision with root package name */
    public final int f11528e;

    /* renamed from: f  reason: collision with root package name */
    public EditText f11529f;

    /* renamed from: g  reason: collision with root package name */
    public final b f11530g;

    public v(com.google.android.material.textfield.a aVar, int i10) {
        super(aVar);
        this.f11528e = R.drawable.design_password_eye;
        this.f11530g = new b(2, this);
        if (i10 != 0) {
            this.f11528e = i10;
        }
    }

    @Override // h6.o
    public final void b() {
        q();
    }

    @Override // h6.o
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // h6.o
    public final int d() {
        return this.f11528e;
    }

    @Override // h6.o
    public final View.OnClickListener f() {
        return this.f11530g;
    }

    @Override // h6.o
    public final boolean k() {
        return true;
    }

    @Override // h6.o
    public final boolean l() {
        EditText editText = this.f11529f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // h6.o
    public final void m(EditText editText) {
        this.f11529f = editText;
        q();
    }

    @Override // h6.o
    public final void r() {
        boolean z10;
        EditText editText = this.f11529f;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f11529f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // h6.o
    public final void s() {
        EditText editText = this.f11529f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
