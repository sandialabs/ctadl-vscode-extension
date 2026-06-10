package androidx.appcompat.widget;

import a3.j0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c;
import com.noto.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {
    public boolean A;
    public final int B;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f703q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f704r;

    /* renamed from: s  reason: collision with root package name */
    public View f705s;

    /* renamed from: t  reason: collision with root package name */
    public View f706t;

    /* renamed from: u  reason: collision with root package name */
    public View f707u;

    /* renamed from: v  reason: collision with root package name */
    public LinearLayout f708v;

    /* renamed from: w  reason: collision with root package name */
    public TextView f709w;

    /* renamed from: x  reason: collision with root package name */
    public TextView f710x;

    /* renamed from: y  reason: collision with root package name */
    public final int f711y;

    /* renamed from: z  reason: collision with root package name */
    public final int f712z;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ i.a f713i;

        public a(i.a aVar) {
            this.f713i = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f713i.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.n, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = e.a.a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
        j0.d.q(this, drawable);
        this.f711y = obtainStyledAttributes.getResourceId(5, 0);
        this.f712z = obtainStyledAttributes.getResourceId(4, 0);
        this.f830m = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.B = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(i.a aVar) {
        View view;
        c cVar;
        androidx.appcompat.view.menu.k kVar;
        androidx.appcompat.view.menu.k kVar2;
        View view2 = this.f705s;
        if (view2 == null) {
            view = LayoutInflater.from(getContext()).inflate(this.B, (ViewGroup) this, false);
            this.f705s = view;
        } else {
            if (view2.getParent() == null) {
                view = this.f705s;
            }
            View findViewById = this.f705s.findViewById(R.id.action_mode_close_button);
            this.f706t = findViewById;
            findViewById.setOnClickListener(new a(aVar));
            androidx.appcompat.view.menu.f e10 = aVar.e();
            cVar = this.f829l;
            if (cVar != null) {
                cVar.c();
                c.a aVar2 = cVar.B;
                if (aVar2 != null && aVar2.b()) {
                    aVar2.f671j.dismiss();
                }
            }
            c cVar2 = new c(getContext());
            this.f829l = cVar2;
            cVar2.f865t = true;
            cVar2.f866u = true;
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
            e10.b(this.f829l, this.f827j);
            c cVar3 = this.f829l;
            kVar = cVar3.f574p;
            if (kVar == null) {
                androidx.appcompat.view.menu.k kVar3 = (androidx.appcompat.view.menu.k) cVar3.f571l.inflate(cVar3.n, (ViewGroup) this, false);
                cVar3.f574p = kVar3;
                kVar3.b(cVar3.f570k);
                cVar3.f();
            }
            kVar2 = cVar3.f574p;
            if (kVar != kVar2) {
                ((ActionMenuView) kVar2).setPresenter(cVar3);
            }
            ActionMenuView actionMenuView = (ActionMenuView) kVar2;
            this.f828k = actionMenuView;
            WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
            j0.d.q(actionMenuView, null);
            addView(this.f828k, layoutParams);
        }
        addView(view);
        View findViewById2 = this.f705s.findViewById(R.id.action_mode_close_button);
        this.f706t = findViewById2;
        findViewById2.setOnClickListener(new a(aVar));
        androidx.appcompat.view.menu.f e102 = aVar.e();
        cVar = this.f829l;
        if (cVar != null) {
        }
        c cVar22 = new c(getContext());
        this.f829l = cVar22;
        cVar22.f865t = true;
        cVar22.f866u = true;
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -1);
        e102.b(this.f829l, this.f827j);
        c cVar32 = this.f829l;
        kVar = cVar32.f574p;
        if (kVar == null) {
        }
        kVar2 = cVar32.f574p;
        if (kVar != kVar2) {
        }
        ActionMenuView actionMenuView2 = (ActionMenuView) kVar2;
        this.f828k = actionMenuView2;
        WeakHashMap<View, a3.v0> weakHashMap2 = a3.j0.f188a;
        j0.d.q(actionMenuView2, null);
        addView(this.f828k, layoutParams2);
    }

    public final void g() {
        if (this.f708v == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f708v = linearLayout;
            this.f709w = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f710x = (TextView) this.f708v.findViewById(R.id.action_bar_subtitle);
            int i10 = this.f711y;
            if (i10 != 0) {
                this.f709w.setTextAppearance(getContext(), i10);
            }
            int i11 = this.f712z;
            if (i11 != 0) {
                this.f710x.setTextAppearance(getContext(), i11);
            }
        }
        this.f709w.setText(this.f703q);
        this.f710x.setText(this.f704r);
        boolean z10 = !TextUtils.isEmpty(this.f703q);
        boolean z11 = !TextUtils.isEmpty(this.f704r);
        int i12 = 0;
        this.f710x.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.f708v;
        if (!z10 && !z11) {
            i12 = 8;
        }
        linearLayout2.setVisibility(i12);
        if (this.f708v.getParent() == null) {
            addView(this.f708v);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f704r;
    }

    public CharSequence getTitle() {
        return this.f703q;
    }

    public final void h() {
        removeAllViews();
        this.f707u = null;
        this.f828k = null;
        this.f829l = null;
        View view = this.f706t;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f829l;
        if (cVar != null) {
            cVar.c();
            c.a aVar = this.f829l.B;
            if (aVar != null && aVar.b()) {
                aVar.f671j.dismiss();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean a10 = n1.a(this);
        int paddingRight = a10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f705s;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f705s.getLayoutParams();
            int i14 = a10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = a10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = a10 ? paddingRight - i14 : paddingRight + i14;
            int d5 = androidx.appcompat.widget.a.d(i16, paddingTop, paddingTop2, this.f705s, a10) + i16;
            paddingRight = a10 ? d5 - i15 : d5 + i15;
        }
        LinearLayout linearLayout = this.f708v;
        if (linearLayout != null && this.f707u == null && linearLayout.getVisibility() != 8) {
            paddingRight += androidx.appcompat.widget.a.d(paddingRight, paddingTop, paddingTop2, this.f708v, a10);
        }
        View view2 = this.f707u;
        if (view2 != null) {
            androidx.appcompat.widget.a.d(paddingRight, paddingTop, paddingTop2, view2, a10);
        }
        int paddingLeft = a10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f828k;
        if (actionMenuView != null) {
            androidx.appcompat.widget.a.d(paddingLeft, paddingTop, paddingTop2, actionMenuView, !a10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 1073741824;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i10);
        int i13 = this.f830m;
        if (i13 <= 0) {
            i13 = View.MeasureSpec.getSize(i11);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i14 = i13 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
        View view = this.f705s;
        if (view != null) {
            int c = androidx.appcompat.widget.a.c(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f705s.getLayoutParams();
            paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f828k;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = androidx.appcompat.widget.a.c(this.f828k, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f708v;
        if (linearLayout != null && this.f707u == null) {
            if (this.A) {
                this.f708v.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f708v.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f708v.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = androidx.appcompat.widget.a.c(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f707u;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = i15 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i15 >= 0) {
                paddingLeft = Math.min(i15, paddingLeft);
            }
            int i17 = layoutParams.height;
            if (i17 == -2) {
                i12 = Integer.MIN_VALUE;
            }
            if (i17 >= 0) {
                i14 = Math.min(i17, i14);
            }
            this.f707u.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i16), View.MeasureSpec.makeMeasureSpec(i14, i12));
        }
        if (this.f830m <= 0) {
            int childCount = getChildCount();
            i13 = 0;
            for (int i18 = 0; i18 < childCount; i18++) {
                int measuredHeight = getChildAt(i18).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > i13) {
                    i13 = measuredHeight;
                }
            }
        }
        setMeasuredDimension(size, i13);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i10) {
        this.f830m = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f707u;
        if (view2 != null) {
            removeView(view2);
        }
        this.f707u = view;
        if (view != null && (linearLayout = this.f708v) != null) {
            removeView(linearLayout);
            this.f708v = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f704r = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f703q = charSequence;
        g();
        a3.j0.q(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.A) {
            requestLayout();
        }
        this.A = z10;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
