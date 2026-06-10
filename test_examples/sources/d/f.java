package d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.m1;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.noto.R;
import d.w;
import m2.b;
import m2.l;

/* loaded from: classes.dex */
public class f extends androidx.fragment.app.s implements g {
    public k E;

    public f() {
        this.f415m.f6385b.c("androidx:appcompat", new d(this));
        l(new e(this));
    }

    private void m() {
        ViewTreeLifecycleOwner.b(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        v7.g.f(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        ViewTreeSavedStateRegistryOwner.b(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        v7.g.f(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        p().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(p().f(context));
    }

    @Override // d.g
    public final void b() {
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((k) p()).T();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // m2.k, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((k) p()).T();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final <T extends View> T findViewById(int i10) {
        return (T) p().g(i10);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        return p().l();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i10 = m1.f1039a;
        return super.getResources();
    }

    @Override // d.g
    public final void h() {
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        p().n();
    }

    @Override // d.g
    public final void j() {
    }

    @Override // androidx.fragment.app.s
    public final void o() {
        p().n();
    }

    @Override // androidx.fragment.app.s, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p().p();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        p().r();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.s, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        Intent a10;
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        k kVar = (k) p();
        kVar.T();
        b0 b0Var = kVar.f10278w;
        if (menuItem.getItemId() == 16908332 && b0Var != null && (b0Var.f10213e.p() & 4) != 0 && (a10 = m2.l.a(this)) != null) {
            if (l.a.c(this, a10)) {
                m2.w wVar = new m2.w(this);
                Intent a11 = m2.l.a(this);
                if (a11 == null) {
                    a11 = m2.l.a(this);
                }
                if (a11 != null) {
                    ComponentName component = a11.getComponent();
                    if (component == null) {
                        component = a11.resolveActivity(wVar.f15974j.getPackageManager());
                    }
                    wVar.c(component);
                    wVar.f15973i.add(a11);
                }
                wVar.g();
                try {
                    int i11 = m2.b.f15908b;
                    b.a.a(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            l.a.b(this, a10);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.fragment.app.s, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((k) p()).N();
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        p().s();
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    public final void onStart() {
        super.onStart();
        p().t();
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    public final void onStop() {
        super.onStop();
        p().u();
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        p().C(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((k) p()).T();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final j p() {
        if (this.E == null) {
            w.a aVar = j.f10246i;
            this.E = new k(this, null, this, this);
        }
        return this.E;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i10) {
        m();
        p().x(i10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        m();
        p().y(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        p().z(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        super.setTheme(i10);
        p().B(i10);
    }
}
