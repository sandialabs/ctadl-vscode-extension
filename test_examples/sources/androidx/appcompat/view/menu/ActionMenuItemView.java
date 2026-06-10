package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.m0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends e0 implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: p  reason: collision with root package name */
    public h f538p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f539q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f540r;

    /* renamed from: s  reason: collision with root package name */
    public f.b f541s;

    /* renamed from: t  reason: collision with root package name */
    public a f542t;

    /* renamed from: u  reason: collision with root package name */
    public b f543u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f544v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f545w;

    /* renamed from: x  reason: collision with root package name */
    public final int f546x;

    /* renamed from: y  reason: collision with root package name */
    public int f547y;

    /* renamed from: z  reason: collision with root package name */
    public final int f548z;

    /* loaded from: classes.dex */
    public class a extends m0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.m0
        public final j.f b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.f543u;
            if (bVar == null || (aVar = androidx.appcompat.widget.c.this.B) == null) {
                return null;
            }
            return aVar.a();
        }

        @Override // androidx.appcompat.widget.m0
        public final boolean c() {
            j.f b5;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            f.b bVar = actionMenuItemView.f541s;
            return bVar != null && bVar.a(actionMenuItemView.f538p) && (b5 = b()) != null && b5.c();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f544v = m();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.f39m, 0, 0);
        this.f546x = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f548z = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f547y = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean a() {
        return l();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean b() {
        return l() && this.f538p.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) {
        int i10;
        this.f538p = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitleCondensed());
        setId(hVar.f638a);
        if (hVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.f542t == null) {
            this.f542t = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f538p;
    }

    public final boolean l() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean m() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480 && ((i10 < 640 || i11 < 480) && configuration.orientation != 2)) {
            return false;
        }
        return true;
    }

    public final void n() {
        CharSequence charSequence;
        boolean z10;
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.f539q);
        if (this.f540r != null) {
            if ((this.f538p.f660y & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || (!this.f544v && !this.f545w)) {
                z11 = false;
            }
        }
        boolean z13 = z12 & z11;
        CharSequence charSequence2 = null;
        if (z13) {
            charSequence = this.f539q;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence3 = this.f538p.f652q;
        if (TextUtils.isEmpty(charSequence3)) {
            if (z13) {
                charSequence3 = null;
            } else {
                charSequence3 = this.f538p.f641e;
            }
        }
        setContentDescription(charSequence3);
        CharSequence charSequence4 = this.f538p.f653r;
        if (TextUtils.isEmpty(charSequence4)) {
            if (!z13) {
                charSequence2 = this.f538p.f641e;
            }
            i1.a(this, charSequence2);
            return;
        }
        i1.a(this, charSequence4);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f.b bVar = this.f541s;
        if (bVar != null) {
            bVar.a(this.f538p);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f544v = m();
        n();
    }

    @Override // androidx.appcompat.widget.e0, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean l2 = l();
        if (l2 && (i12 = this.f547y) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.f546x;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i13) : i13;
        if (mode != 1073741824 && i13 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i11);
        }
        if (l2 || this.f540r == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f540r.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f538p.hasSubMenu() && (aVar = this.f542t) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f545w != z10) {
            this.f545w = z10;
            h hVar = this.f538p;
            if (hVar != null) {
                f fVar = hVar.n;
                fVar.f622k = true;
                fVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f540r = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f548z;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        n();
    }

    public void setItemInvoker(f.b bVar) {
        this.f541s = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f547y = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f543u = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f539q = charSequence;
        n();
    }
}
