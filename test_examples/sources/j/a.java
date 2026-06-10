package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import n2.a;
import r2.a;

/* loaded from: classes.dex */
public final class a implements t2.b {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f12593a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f12594b;
    public Intent c;

    /* renamed from: d  reason: collision with root package name */
    public char f12595d;

    /* renamed from: f  reason: collision with root package name */
    public char f12597f;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f12599h;

    /* renamed from: i  reason: collision with root package name */
    public final Context f12600i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f12601j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f12602k;

    /* renamed from: e  reason: collision with root package name */
    public int f12596e = 4096;

    /* renamed from: g  reason: collision with root package name */
    public int f12598g = 4096;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f12603l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f12604m = null;
    public boolean n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12605o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f12606p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f12600i = context;
        this.f12593a = charSequence;
    }

    @Override // t2.b
    public final t2.b a(a3.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // t2.b
    public final a3.b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f12599h;
        if (drawable != null) {
            if (this.n || this.f12605o) {
                Drawable g10 = r2.a.g(drawable);
                this.f12599h = g10;
                Drawable mutate = g10.mutate();
                this.f12599h = mutate;
                if (this.n) {
                    a.b.h(mutate, this.f12603l);
                }
                if (this.f12605o) {
                    a.b.i(this.f12599h, this.f12604m);
                }
            }
        }
    }

    @Override // t2.b, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // t2.b, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // t2.b, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // t2.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f12598g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f12597f;
    }

    @Override // t2.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f12601j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f12599h;
    }

    @Override // t2.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f12603l;
    }

    @Override // t2.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f12604m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // t2.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f12596e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f12595d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f12593a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f12594b;
        return charSequence != null ? charSequence : this.f12593a;
    }

    @Override // t2.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f12602k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // t2.b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f12606p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f12606p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f12606p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f12606p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // t2.b, android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f12597f = Character.toLowerCase(c);
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i10) {
        this.f12597f = Character.toLowerCase(c);
        this.f12598g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f12606p = (z10 ? 1 : 0) | (this.f12606p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.f12606p = (z10 ? 2 : 0) | (this.f12606p & (-3));
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f12601j = charSequence;
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final t2.b setContentDescription(CharSequence charSequence) {
        this.f12601j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f12606p = (z10 ? 16 : 0) | (this.f12606p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        Object obj = n2.a.f16069a;
        this.f12599h = a.b.b(this.f12600i, i10);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f12599h = drawable;
        c();
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f12603l = colorStateList;
        this.n = true;
        c();
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f12604m = mode;
        this.f12605o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f12595d = c;
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i10) {
        this.f12595d = c;
        this.f12596e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c10) {
        this.f12595d = c;
        this.f12597f = Character.toLowerCase(c10);
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c10, int i10, int i11) {
        this.f12595d = c;
        this.f12596e = KeyEvent.normalizeMetaState(i10);
        this.f12597f = Character.toLowerCase(c10);
        this.f12598g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // t2.b, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f12593a = this.f12600i.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f12593a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f12594b = charSequence;
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f12602k = charSequence;
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final t2.b setTooltipText(CharSequence charSequence) {
        this.f12602k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        this.f12606p = (this.f12606p & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
