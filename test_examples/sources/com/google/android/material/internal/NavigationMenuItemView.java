package com.google.android.material.internal;

import a3.j0;
import a3.v0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.n0;
import b3.g;
import com.noto.R;
import e3.h;
import java.util.WeakHashMap;
import p2.f;
import r2.a;
import u5.e;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends e implements k.a {
    public static final int[] N = {16842912};
    public int D;
    public boolean E;
    public boolean F;
    public final CheckedTextView G;
    public FrameLayout H;
    public h I;
    public ColorStateList J;
    public boolean K;
    public Drawable L;
    public final a M;

    /* loaded from: classes.dex */
    public class a extends a3.a {
        public a() {
        }

        @Override // a3.a
        public final void d(View view, g gVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f108a;
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f6357a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.F);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.M = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.G = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        j0.p(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.H == null) {
                this.H = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.H.removeAllViews();
            this.H.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) {
        int i10;
        n0.a aVar;
        int i11;
        StateListDrawable stateListDrawable;
        this.I = hVar;
        int i12 = hVar.f638a;
        if (i12 > 0) {
            setId(i12);
        }
        if (hVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        boolean z10 = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(N, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.d.q(this, stateListDrawable);
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.f641e);
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.f652q);
        i1.a(this, hVar.f653r);
        h hVar2 = this.I;
        if (hVar2.f641e != null || hVar2.getIcon() != null || this.I.getActionView() == null) {
            z10 = false;
        }
        CheckedTextView checkedTextView = this.G;
        if (z10) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.H;
            if (frameLayout != null) {
                aVar = (n0.a) frameLayout.getLayoutParams();
                i11 = -1;
            } else {
                return;
            }
        } else {
            checkedTextView.setVisibility(0);
            FrameLayout frameLayout2 = this.H;
            if (frameLayout2 != null) {
                aVar = (n0.a) frameLayout2.getLayoutParams();
                i11 = -2;
            } else {
                return;
            }
        }
        ((LinearLayout.LayoutParams) aVar).width = i11;
        this.H.setLayoutParams(aVar);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        h hVar = this.I;
        if (hVar != null && hVar.isCheckable() && this.I.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, N);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.F != z10) {
            this.F = z10;
            this.M.h(this.G, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.G;
        checkedTextView.setChecked(z10);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z10 ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.K) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = r2.a.g(drawable).mutate();
                a.b.h(drawable, this.J);
            }
            int i10 = this.D;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.E) {
            if (this.L == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = f.f16726a;
                Drawable a10 = f.a.a(resources, R.drawable.navigation_empty_icon, theme);
                this.L = a10;
                if (a10 != null) {
                    int i11 = this.D;
                    a10.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.L;
        }
        h.b.e(this.G, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.G.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.D = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.J = colorStateList;
        this.K = colorStateList != null;
        androidx.appcompat.view.menu.h hVar = this.I;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.G.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.E = z10;
    }

    public void setTextAppearance(int i10) {
        e3.h.e(this.G, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.G.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.G.setText(charSequence);
    }
}
