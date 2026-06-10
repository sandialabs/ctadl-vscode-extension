package d;

import a3.l;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.noto.R;
import d.w;

/* loaded from: classes.dex */
public class r extends androidx.activity.h implements g {

    /* renamed from: k  reason: collision with root package name */
    public k f10316k;

    /* renamed from: l  reason: collision with root package name */
    public final q f10317l;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [d.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(Context context, int i10) {
        super(context, r2);
        int i11;
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i11 = typedValue.resourceId;
        } else {
            i11 = i10;
        }
        this.f10317l = new l.a() { // from class: d.q
            @Override // a3.l.a
            public final boolean a(KeyEvent keyEvent) {
                return r.this.f(keyEvent);
            }
        };
        j c = c();
        if (i10 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i10 = typedValue2.resourceId;
        }
        ((k) c).c0 = i10;
        c.q();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().c(view, layoutParams);
    }

    @Override // d.g
    public final void b() {
    }

    public final j c() {
        if (this.f10316k == null) {
            w.a aVar = j.f10246i;
            this.f10316k = new k(getContext(), getWindow(), this, this);
        }
        return this.f10316k;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().r();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a3.l.b(this.f10317l, getWindow().getDecorView(), this, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i10) {
        return (T) c().g(i10);
    }

    @Override // d.g
    public final void h() {
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().n();
    }

    @Override // d.g
    public final void j() {
    }

    @Override // androidx.activity.h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().m();
        super.onCreate(bundle);
        c().q();
    }

    @Override // androidx.activity.h, android.app.Dialog
    public final void onStop() {
        super.onStop();
        c().u();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        c().x(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        c().y(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().z(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        super.setTitle(i10);
        c().C(getContext().getString(i10));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().C(charSequence);
    }
}
