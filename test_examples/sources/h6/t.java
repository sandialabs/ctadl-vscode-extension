package h6;

import a3.j0;
import a3.v0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.p0;
import com.google.android.material.textfield.TextInputLayout;
import com.noto.R;
import java.util.Locale;
import java.util.WeakHashMap;
import r2.a;

/* loaded from: classes.dex */
public final class t extends androidx.appcompat.widget.d {

    /* renamed from: m  reason: collision with root package name */
    public final p0 f11519m;
    public final AccessibilityManager n;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f11520o;

    /* renamed from: p  reason: collision with root package name */
    public final int f11521p;

    /* renamed from: q  reason: collision with root package name */
    public final float f11522q;

    /* renamed from: r  reason: collision with root package name */
    public int f11523r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f11524s;

    /* loaded from: classes.dex */
    public class a<T> extends ArrayAdapter<String> {

        /* renamed from: i  reason: collision with root package name */
        public ColorStateList f11525i;

        /* renamed from: j  reason: collision with root package name */
        public ColorStateList f11526j;

        public a(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            b();
        }

        public final void b() {
            boolean z10;
            ColorStateList colorStateList;
            boolean z11;
            boolean z12;
            t tVar = t.this;
            ColorStateList colorStateList2 = tVar.f11524s;
            if (colorStateList2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ColorStateList colorStateList3 = null;
            if (!z10) {
                colorStateList = null;
            } else {
                int[] iArr = {16842919};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            }
            this.f11526j = colorStateList;
            if (tVar.f11523r != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (tVar.f11524s != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    int[] iArr2 = {16843623, -16842919};
                    int[] iArr3 = {16842913, -16842919};
                    colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{q2.a.b(tVar.f11524s.getColorForState(iArr3, 0), tVar.f11523r), q2.a.b(tVar.f11524s.getColorForState(iArr2, 0), tVar.f11523r), tVar.f11523r});
                }
            }
            this.f11525i = colorStateList3;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            boolean z10;
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                t tVar = t.this;
                RippleDrawable rippleDrawable = null;
                if (tVar.getText().toString().contentEquals(textView.getText())) {
                    if (tVar.f11523r != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        ColorDrawable colorDrawable = new ColorDrawable(tVar.f11523r);
                        if (this.f11526j != null) {
                            a.b.h(colorDrawable, this.f11525i);
                            rippleDrawable = new RippleDrawable(this.f11526j, colorDrawable, null);
                        } else {
                            rippleDrawable = colorDrawable;
                        }
                    }
                }
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                j0.d.q(textView, rippleDrawable);
            }
            return view2;
        }
    }

    public t(Context context, AttributeSet attributeSet) {
        super(i6.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, 0);
        this.f11520o = new Rect();
        Context context2 = getContext();
        TypedArray d5 = u5.j.d(context2, attributeSet, a1.b.c0, R.attr.autoCompleteTextViewStyle, 2132083479, new int[0]);
        if (d5.hasValue(0) && d5.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f11521p = d5.getResourceId(2, R.layout.mtrl_auto_complete_simple_item);
        this.f11522q = d5.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.f11523r = d5.getColor(3, 0);
        this.f11524s = x5.c.a(context2, d5, 4);
        this.n = (AccessibilityManager) context2.getSystemService("accessibility");
        p0 p0Var = new p0(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f11519m = p0Var;
        p0Var.G = true;
        androidx.appcompat.widget.s sVar = p0Var.H;
        sVar.setFocusable(true);
        p0Var.f1078w = this;
        sVar.setInputMethodMode(2);
        p0Var.p(getAdapter());
        p0Var.f1079x = new s(this);
        if (d5.hasValue(5)) {
            setSimpleItems(d5.getResourceId(5, 0));
        }
        d5.recycle();
    }

    public static void a(t tVar, Object obj) {
        tVar.setText(tVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        boolean z10;
        AccessibilityManager accessibilityManager = this.n;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f11519m.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b5 = b();
        if (b5 != null && b5.K) {
            return b5.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f11522q;
    }

    public int getSimpleItemSelectedColor() {
        return this.f11523r;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f11524s;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b5 = b();
        if (b5 != null && b5.K && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11519m.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int selectedItemPosition;
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b5 = b();
            int i12 = 0;
            if (adapter != null && b5 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                p0 p0Var = this.f11519m;
                if (!p0Var.c()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = p0Var.f1067k.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i13 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i12) {
                        view = null;
                        i12 = itemViewType;
                    }
                    view = adapter.getView(max, view, b5);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i13 = Math.max(i13, view.getMeasuredWidth());
                }
                Drawable f10 = p0Var.f();
                if (f10 != null) {
                    Rect rect = this.f11520o;
                    f10.getPadding(rect);
                    i13 += rect.left + rect.right;
                }
                i12 = b5.getEndIconView().getMeasuredWidth() + i13;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i12), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        boolean z11;
        AccessibilityManager accessibilityManager = this.n;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f11519m.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        p0 p0Var = this.f11519m;
        if (p0Var != null) {
            p0Var.i(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f11519m.f1080y = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        TextInputLayout b5 = b();
        if (b5 != null) {
            b5.q();
        }
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f11523r = i10;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).b();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f11524s = colorStateList;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).b();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new a(getContext(), this.f11521p, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        boolean z10;
        AccessibilityManager accessibilityManager = this.n;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f11519m.a();
        } else {
            super.showDropDown();
        }
    }
}
