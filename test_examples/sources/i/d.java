package i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import i.a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class d extends a implements f.a {

    /* renamed from: k  reason: collision with root package name */
    public final Context f11623k;

    /* renamed from: l  reason: collision with root package name */
    public final ActionBarContextView f11624l;

    /* renamed from: m  reason: collision with root package name */
    public final a.InterfaceC0126a f11625m;
    public WeakReference<View> n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f11626o;

    /* renamed from: p  reason: collision with root package name */
    public final androidx.appcompat.view.menu.f f11627p;

    public d(Context context, ActionBarContextView actionBarContextView, a.InterfaceC0126a interfaceC0126a) {
        this.f11623k = context;
        this.f11624l = actionBarContextView;
        this.f11625m = interfaceC0126a;
        androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(actionBarContextView.getContext());
        fVar.f623l = 1;
        this.f11627p = fVar;
        fVar.f616e = this;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        return this.f11625m.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
        i();
        androidx.appcompat.widget.c cVar = this.f11624l.f829l;
        if (cVar != null) {
            cVar.l();
        }
    }

    @Override // i.a
    public final void c() {
        if (this.f11626o) {
            return;
        }
        this.f11626o = true;
        this.f11625m.c(this);
    }

    @Override // i.a
    public final View d() {
        WeakReference<View> weakReference = this.n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // i.a
    public final androidx.appcompat.view.menu.f e() {
        return this.f11627p;
    }

    @Override // i.a
    public final MenuInflater f() {
        return new f(this.f11624l.getContext());
    }

    @Override // i.a
    public final CharSequence g() {
        return this.f11624l.getSubtitle();
    }

    @Override // i.a
    public final CharSequence h() {
        return this.f11624l.getTitle();
    }

    @Override // i.a
    public final void i() {
        this.f11625m.d(this, this.f11627p);
    }

    @Override // i.a
    public final boolean j() {
        return this.f11624l.A;
    }

    @Override // i.a
    public final void k(View view) {
        this.f11624l.setCustomView(view);
        this.n = view != null ? new WeakReference<>(view) : null;
    }

    @Override // i.a
    public final void l(int i10) {
        m(this.f11623k.getString(i10));
    }

    @Override // i.a
    public final void m(CharSequence charSequence) {
        this.f11624l.setSubtitle(charSequence);
    }

    @Override // i.a
    public final void n(int i10) {
        o(this.f11623k.getString(i10));
    }

    @Override // i.a
    public final void o(CharSequence charSequence) {
        this.f11624l.setTitle(charSequence);
    }

    @Override // i.a
    public final void p(boolean z10) {
        this.f11617j = z10;
        this.f11624l.setTitleOptional(z10);
    }
}
