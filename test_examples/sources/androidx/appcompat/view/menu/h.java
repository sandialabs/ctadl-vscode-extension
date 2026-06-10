package androidx.appcompat.view.menu;

import a3.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import r2.a;

/* loaded from: classes.dex */
public final class h implements t2.b {
    public a3.b A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a  reason: collision with root package name */
    public final int f638a;

    /* renamed from: b  reason: collision with root package name */
    public final int f639b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f640d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f641e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f642f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f643g;

    /* renamed from: h  reason: collision with root package name */
    public char f644h;

    /* renamed from: j  reason: collision with root package name */
    public char f646j;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f648l;
    public final f n;

    /* renamed from: o  reason: collision with root package name */
    public m f650o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f651p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f652q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f653r;

    /* renamed from: y  reason: collision with root package name */
    public int f660y;

    /* renamed from: z  reason: collision with root package name */
    public View f661z;

    /* renamed from: i  reason: collision with root package name */
    public int f645i = 4096;

    /* renamed from: k  reason: collision with root package name */
    public int f647k = 4096;

    /* renamed from: m  reason: collision with root package name */
    public int f649m = 0;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f654s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f655t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f656u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f657v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f658w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f659x = 16;
    public boolean C = false;

    /* loaded from: classes.dex */
    public class a implements b.a {
        public a() {
        }
    }

    public h(f fVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.n = fVar;
        this.f638a = i11;
        this.f639b = i10;
        this.c = i12;
        this.f640d = i13;
        this.f641e = charSequence;
        this.f660y = i14;
    }

    public static void c(int i10, int i11, String str, StringBuilder sb) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    @Override // t2.b
    public final t2.b a(a3.b bVar) {
        a3.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.f138a = null;
        }
        this.f661z = null;
        this.A = bVar;
        this.n.p(true);
        a3.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    @Override // t2.b
    public final a3.b b() {
        return this.A;
    }

    @Override // t2.b, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f660y & 8) == 0) {
            return false;
        }
        if (this.f661z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f658w && (this.f656u || this.f657v)) {
            drawable = r2.a.g(drawable).mutate();
            if (this.f656u) {
                a.b.h(drawable, this.f654s);
            }
            if (this.f657v) {
                a.b.i(drawable, this.f655t);
            }
            this.f658w = false;
        }
        return drawable;
    }

    public final boolean e() {
        a3.b bVar;
        if ((this.f660y & 8) != 0) {
            if (this.f661z == null && (bVar = this.A) != null) {
                this.f661z = bVar.d(this);
            }
            return this.f661z != null;
        }
        return false;
    }

    @Override // t2.b, android.view.MenuItem
    public final boolean expandActionView() {
        if (e()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.B;
            if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
                return false;
            }
            return this.n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        this.f659x = z10 ? this.f659x | 32 : this.f659x & (-33);
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // t2.b, android.view.MenuItem
    public final View getActionView() {
        View view = this.f661z;
        if (view != null) {
            return view;
        }
        a3.b bVar = this.A;
        if (bVar != null) {
            View d5 = bVar.d(this);
            this.f661z = d5;
            return d5;
        }
        return null;
    }

    @Override // t2.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f647k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f646j;
    }

    @Override // t2.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f652q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f639b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f648l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f649m;
        if (i10 != 0) {
            Drawable a10 = e.a.a(this.n.f613a, i10);
            this.f649m = 0;
            this.f648l = a10;
            return d(a10);
        }
        return null;
    }

    @Override // t2.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f654s;
    }

    @Override // t2.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f655t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f643g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f638a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // t2.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f645i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f644h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f650o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f641e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f642f;
        return charSequence != null ? charSequence : this.f641e;
    }

    @Override // t2.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f653r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f650o != null;
    }

    @Override // t2.b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f659x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f659x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f659x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        a3.b bVar = this.A;
        return (bVar == null || !bVar.g()) ? (this.f659x & 8) == 0 : (this.f659x & 8) == 0 && this.A.b();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // t2.b, android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        f fVar = this.n;
        Context context = fVar.f613a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f661z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f638a) > 0) {
            inflate.setId(i11);
        }
        fVar.f622k = true;
        fVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f646j == c) {
            return this;
        }
        this.f646j = Character.toLowerCase(c);
        this.n.p(false);
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i10) {
        if (this.f646j == c && this.f647k == i10) {
            return this;
        }
        this.f646j = Character.toLowerCase(c);
        this.f647k = KeyEvent.normalizeMetaState(i10);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f659x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f659x = i11;
        if (i10 != i11) {
            this.n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f659x;
        int i12 = i11 & 4;
        f fVar = this.n;
        int i13 = 2;
        if (i12 != 0) {
            fVar.getClass();
            ArrayList<h> arrayList = fVar.f617f;
            int size = arrayList.size();
            fVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                h hVar = arrayList.get(i14);
                if (hVar.f639b == this.f639b) {
                    boolean z12 = true;
                    if ((hVar.f659x & 4) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && hVar.isCheckable()) {
                        if (hVar != this) {
                            z12 = false;
                        }
                        int i15 = hVar.f659x;
                        int i16 = i15 & (-3);
                        if (z12) {
                            i10 = 2;
                        } else {
                            i10 = 0;
                        }
                        int i17 = i10 | i16;
                        hVar.f659x = i17;
                        if (i15 != i17) {
                            hVar.n.p(false);
                        }
                    }
                }
            }
            fVar.v();
        } else {
            int i18 = i11 & (-3);
            if (!z10) {
                i13 = 0;
            }
            int i19 = i13 | i18;
            this.f659x = i19;
            if (i11 != i19) {
                fVar.p(false);
            }
        }
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final t2.b setContentDescription(CharSequence charSequence) {
        this.f652q = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f659x = z10 ? this.f659x | 16 : this.f659x & (-17);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f648l = null;
        this.f649m = i10;
        this.f658w = true;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f649m = 0;
        this.f648l = drawable;
        this.f658w = true;
        this.n.p(false);
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f654s = colorStateList;
        this.f656u = true;
        this.f658w = true;
        this.n.p(false);
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f655t = mode;
        this.f657v = true;
        this.f658w = true;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f643g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f644h == c) {
            return this;
        }
        this.f644h = c;
        this.n.p(false);
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i10) {
        if (this.f644h == c && this.f645i == i10) {
            return this;
        }
        this.f644h = c;
        this.f645i = KeyEvent.normalizeMetaState(i10);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f651p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c10) {
        this.f644h = c;
        this.f646j = Character.toLowerCase(c10);
        this.n.p(false);
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c10, int i10, int i11) {
        this.f644h = c;
        this.f645i = KeyEvent.normalizeMetaState(i10);
        this.f646j = Character.toLowerCase(c10);
        this.f647k = KeyEvent.normalizeMetaState(i11);
        this.n.p(false);
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f660y = i10;
        f fVar = this.n;
        fVar.f622k = true;
        fVar.p(true);
    }

    @Override // t2.b, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.n.f613a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f641e = charSequence;
        this.n.p(false);
        m mVar = this.f650o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f642f = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // t2.b, android.view.MenuItem
    public final t2.b setTooltipText(CharSequence charSequence) {
        this.f653r = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10;
        int i11 = this.f659x;
        int i12 = i11 & (-9);
        boolean z11 = false;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f659x = i13;
        if (i11 != i13) {
            z11 = true;
        }
        if (z11) {
            f fVar = this.n;
            fVar.f619h = true;
            fVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f641e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // t2.b, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f661z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f638a) > 0) {
            view.setId(i10);
        }
        f fVar = this.n;
        fVar.f622k = true;
        fVar.p(true);
        return this;
    }
}
