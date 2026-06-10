package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c;
import com.noto.R;
import d.k;

/* loaded from: classes.dex */
public final class h1 implements i0 {

    /* renamed from: a  reason: collision with root package name */
    public final Toolbar f947a;

    /* renamed from: b  reason: collision with root package name */
    public int f948b;
    public v0 c;

    /* renamed from: d  reason: collision with root package name */
    public View f949d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f950e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f951f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f952g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f953h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f954i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f955j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f956k;

    /* renamed from: l  reason: collision with root package name */
    public Window.Callback f957l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f958m;
    public c n;

    /* renamed from: o  reason: collision with root package name */
    public int f959o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f960p;

    public h1(Toolbar toolbar) {
        boolean z10;
        Drawable drawable;
        this.f959o = 0;
        this.f947a = toolbar;
        this.f954i = toolbar.getTitle();
        this.f955j = toolbar.getSubtitle();
        if (this.f954i != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f953h = z10;
        this.f952g = toolbar.getNavigationIcon();
        String str = null;
        d1 m10 = d1.m(toolbar.getContext(), null, a1.b.f35k, R.attr.actionBarStyle);
        this.f960p = m10.e(15);
        CharSequence k3 = m10.k(27);
        if (!TextUtils.isEmpty(k3)) {
            this.f953h = true;
            this.f954i = k3;
            if ((this.f948b & 8) != 0) {
                toolbar.setTitle(k3);
                if (this.f953h) {
                    a3.j0.q(toolbar.getRootView(), k3);
                }
            }
        }
        CharSequence k10 = m10.k(25);
        if (!TextUtils.isEmpty(k10)) {
            this.f955j = k10;
            if ((this.f948b & 8) != 0) {
                toolbar.setSubtitle(k10);
            }
        }
        Drawable e10 = m10.e(20);
        if (e10 != null) {
            this.f951f = e10;
            v();
        }
        Drawable e11 = m10.e(17);
        if (e11 != null) {
            setIcon(e11);
        }
        if (this.f952g == null && (drawable = this.f960p) != null) {
            this.f952g = drawable;
            if ((this.f948b & 4) == 0) {
                drawable = null;
            }
            toolbar.setNavigationIcon(drawable);
        }
        n(m10.h(10, 0));
        int i10 = m10.i(9, 0);
        if (i10 != 0) {
            View inflate = LayoutInflater.from(toolbar.getContext()).inflate(i10, (ViewGroup) toolbar, false);
            View view = this.f949d;
            if (view != null && (this.f948b & 16) != 0) {
                toolbar.removeView(view);
            }
            this.f949d = inflate;
            if (inflate != null && (this.f948b & 16) != 0) {
                toolbar.addView(inflate);
            }
            n(this.f948b | 16);
        }
        int layoutDimension = m10.f903b.getLayoutDimension(13, 0);
        if (layoutDimension > 0) {
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            layoutParams.height = layoutDimension;
            toolbar.setLayoutParams(layoutParams);
        }
        int c = m10.c(7, -1);
        int c10 = m10.c(3, -1);
        if (c >= 0 || c10 >= 0) {
            int max = Math.max(c, 0);
            int max2 = Math.max(c10, 0);
            if (toolbar.B == null) {
                toolbar.B = new u0();
            }
            toolbar.B.a(max, max2);
        }
        int i11 = m10.i(28, 0);
        if (i11 != 0) {
            Context context = toolbar.getContext();
            toolbar.f805t = i11;
            e0 e0Var = toolbar.f796j;
            if (e0Var != null) {
                e0Var.setTextAppearance(context, i11);
            }
        }
        int i12 = m10.i(26, 0);
        if (i12 != 0) {
            Context context2 = toolbar.getContext();
            toolbar.f806u = i12;
            e0 e0Var2 = toolbar.f797k;
            if (e0Var2 != null) {
                e0Var2.setTextAppearance(context2, i12);
            }
        }
        int i13 = m10.i(22, 0);
        if (i13 != 0) {
            toolbar.setPopupTheme(i13);
        }
        m10.n();
        if (R.string.abc_action_bar_up_description != this.f959o) {
            this.f959o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i14 = this.f959o;
                if (i14 != 0) {
                    str = f().getString(i14);
                }
                this.f956k = str;
                if ((this.f948b & 4) != 0) {
                    if (TextUtils.isEmpty(str)) {
                        toolbar.setNavigationContentDescription(this.f959o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f956k);
                    }
                }
            }
        }
        this.f956k = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new f1(this));
    }

    @Override // androidx.appcompat.widget.i0
    public final boolean a() {
        boolean z10;
        ActionMenuView actionMenuView = this.f947a.f795i;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.B;
        if (cVar != null && cVar.g()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.i0
    public final void b() {
        this.f958m = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.widget.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        boolean z10;
        boolean z11;
        ActionMenuView actionMenuView = this.f947a.f795i;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.B;
        if (cVar != null) {
            if (cVar.C == null && !cVar.g()) {
                z11 = false;
                if (z11) {
                    z10 = true;
                    if (z10) {
                        return false;
                    }
                    return true;
                }
            }
            z11 = true;
            if (z11) {
            }
        }
        z10 = false;
        if (z10) {
        }
    }

    @Override // androidx.appcompat.widget.i0
    public final void collapseActionView() {
        androidx.appcompat.view.menu.h hVar;
        Toolbar.f fVar = this.f947a.U;
        if (fVar == null) {
            hVar = null;
        } else {
            hVar = fVar.f817j;
        }
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    @Override // androidx.appcompat.widget.i0
    public final boolean d() {
        boolean z10;
        ActionMenuView actionMenuView = this.f947a.f795i;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.B;
        if (cVar != null && cVar.c()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.i0
    public final boolean e() {
        boolean z10;
        ActionMenuView actionMenuView = this.f947a.f795i;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.B;
        if (cVar != null && cVar.l()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.i0
    public final Context f() {
        return this.f947a.getContext();
    }

    @Override // androidx.appcompat.widget.i0
    public final void g(androidx.appcompat.view.menu.f fVar, k.b bVar) {
        c cVar = this.n;
        Toolbar toolbar = this.f947a;
        if (cVar == null) {
            this.n = new c(toolbar.getContext());
        }
        c cVar2 = this.n;
        cVar2.f572m = bVar;
        if (fVar != null || toolbar.f795i != null) {
            toolbar.e();
            androidx.appcompat.view.menu.f fVar2 = toolbar.f795i.f734x;
            if (fVar2 != fVar) {
                if (fVar2 != null) {
                    fVar2.r(toolbar.T);
                    fVar2.r(toolbar.U);
                }
                if (toolbar.U == null) {
                    toolbar.U = new Toolbar.f();
                }
                cVar2.f870y = true;
                if (fVar != null) {
                    fVar.b(cVar2, toolbar.f803r);
                    fVar.b(toolbar.U, toolbar.f803r);
                } else {
                    cVar2.e(toolbar.f803r, null);
                    toolbar.U.e(toolbar.f803r, null);
                    cVar2.f();
                    toolbar.U.f();
                }
                toolbar.f795i.setPopupTheme(toolbar.f804s);
                toolbar.f795i.setPresenter(cVar2);
                toolbar.T = cVar2;
                toolbar.s();
            }
        }
    }

    @Override // androidx.appcompat.widget.i0
    public final CharSequence getTitle() {
        return this.f947a.getTitle();
    }

    @Override // androidx.appcompat.widget.i0
    public final boolean h() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f947a;
        if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f795i) != null && actionMenuView.A) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.i0
    public final void i() {
        c cVar;
        ActionMenuView actionMenuView = this.f947a.f795i;
        if (actionMenuView != null && (cVar = actionMenuView.B) != null) {
            cVar.c();
            c.a aVar = cVar.B;
            if (aVar != null && aVar.b()) {
                aVar.f671j.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.i0
    public final a3.v0 j(long j2, int i10) {
        a3.v0 a10 = a3.j0.a(this.f947a);
        a10.a(i10 == 0 ? 1.0f : 0.0f);
        a10.c(j2);
        a10.d(new g1(this, i10));
        return a10;
    }

    @Override // androidx.appcompat.widget.i0
    public final void k(int i10) {
        this.f947a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.i0
    public final void l() {
    }

    @Override // androidx.appcompat.widget.i0
    public final boolean m() {
        Toolbar.f fVar = this.f947a.U;
        if (fVar != null && fVar.f817j != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.i0
    public final void n(int i10) {
        View view;
        Drawable drawable;
        int i11 = this.f948b ^ i10;
        this.f948b = i10;
        if (i11 != 0) {
            int i12 = i11 & 4;
            CharSequence charSequence = null;
            Toolbar toolbar = this.f947a;
            if (i12 != 0) {
                if ((i10 & 4) != 0 && (i10 & 4) != 0) {
                    if (TextUtils.isEmpty(this.f956k)) {
                        toolbar.setNavigationContentDescription(this.f959o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f956k);
                    }
                }
                if ((this.f948b & 4) != 0) {
                    drawable = this.f952g;
                    if (drawable == null) {
                        drawable = this.f960p;
                    }
                } else {
                    drawable = null;
                }
                toolbar.setNavigationIcon(drawable);
            }
            if ((i11 & 3) != 0) {
                v();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    toolbar.setTitle(this.f954i);
                    charSequence = this.f955j;
                } else {
                    toolbar.setTitle((CharSequence) null);
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i11 & 16) != 0 && (view = this.f949d) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.i0
    public final void o() {
        v0 v0Var = this.c;
        if (v0Var != null) {
            ViewParent parent = v0Var.getParent();
            Toolbar toolbar = this.f947a;
            if (parent == toolbar) {
                toolbar.removeView(this.c);
            }
        }
        this.c = null;
    }

    @Override // androidx.appcompat.widget.i0
    public final int p() {
        return this.f948b;
    }

    @Override // androidx.appcompat.widget.i0
    public final void q(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = e.a.a(f(), i10);
        } else {
            drawable = null;
        }
        this.f951f = drawable;
        v();
    }

    @Override // androidx.appcompat.widget.i0
    public final void r() {
    }

    @Override // androidx.appcompat.widget.i0
    public final void s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.i0
    public final void setIcon(int i10) {
        setIcon(i10 != 0 ? e.a.a(f(), i10) : null);
    }

    @Override // androidx.appcompat.widget.i0
    public final void setIcon(Drawable drawable) {
        this.f950e = drawable;
        v();
    }

    @Override // androidx.appcompat.widget.i0
    public final void setWindowCallback(Window.Callback callback) {
        this.f957l = callback;
    }

    @Override // androidx.appcompat.widget.i0
    public final void setWindowTitle(CharSequence charSequence) {
        if (!this.f953h) {
            this.f954i = charSequence;
            if ((this.f948b & 8) != 0) {
                Toolbar toolbar = this.f947a;
                toolbar.setTitle(charSequence);
                if (this.f953h) {
                    a3.j0.q(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.i0
    public final void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.i0
    public final void u(boolean z10) {
        this.f947a.setCollapsible(z10);
    }

    public final void v() {
        Drawable drawable;
        int i10 = this.f948b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f951f) == null) {
            drawable = this.f950e;
        }
        this.f947a.setLogo(drawable);
    }
}
