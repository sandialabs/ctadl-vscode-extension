package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class m extends f implements SubMenu {
    public final h A;

    /* renamed from: z  reason: collision with root package name */
    public final f f693z;

    public m(Context context, f fVar, h hVar) {
        super(context);
        this.f693z = fVar;
        this.A = hVar;
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean d(h hVar) {
        return this.f693z.d(hVar);
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean e(f fVar, MenuItem menuItem) {
        if (!super.e(fVar, menuItem) && !this.f693z.e(fVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean f(h hVar) {
        return this.f693z.f(hVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // androidx.appcompat.view.menu.f
    public final String j() {
        int i10;
        h hVar = this.A;
        if (hVar != null) {
            i10 = hVar.f638a;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            return null;
        }
        return androidx.activity.e.g("android:menu:actionviewstates:", i10);
    }

    @Override // androidx.appcompat.view.menu.f
    public final f k() {
        return this.f693z.k();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean m() {
        return this.f693z.m();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean n() {
        return this.f693z.n();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean o() {
        return this.f693z.o();
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final void setGroupDividerEnabled(boolean z10) {
        this.f693z.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        u(0, null, i10, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        u(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.A.setIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f693z.setQwertyMode(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }
}
