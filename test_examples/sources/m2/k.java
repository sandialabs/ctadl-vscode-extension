package m2;

import a3.l;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;

/* loaded from: classes.dex */
public class k extends Activity implements androidx.lifecycle.q, l.a {

    /* renamed from: i  reason: collision with root package name */
    public final androidx.lifecycle.r f15926i;

    public k() {
        new p.h();
        this.f15926i = new androidx.lifecycle.r(this);
    }

    @Override // a3.l.a
    public final boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !a3.l.a(decorView, keyEvent)) {
            return a3.l.b(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !a3.l.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public androidx.lifecycle.r i0() {
        return this.f15926i;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = b0.f5365j;
        b0.b.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        androidx.lifecycle.r rVar = this.f15926i;
        rVar.getClass();
        rVar.e("markState");
        rVar.h(state);
        super.onSaveInstanceState(bundle);
    }
}
