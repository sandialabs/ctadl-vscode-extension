package com.google.android.material.floatingactionbutton;

import a3.j0;
import a3.v0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import e5.g;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* loaded from: classes.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f7123a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f7124b;
        public final boolean c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f7124b = false;
            this.c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.X);
            this.f7124b = obtainStyledAttributes.getBoolean(0, false);
            this.c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ boolean a(View view, Rect rect) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.f4599h == 0) {
                fVar.f4599h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z10;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f) {
                    z10 = ((CoordinatorLayout.f) layoutParams).f4593a instanceof BottomSheetBehavior;
                } else {
                    z10 = false;
                }
                if (z10) {
                    t(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            boolean z10;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> e10 = coordinatorLayout.e(extendedFloatingActionButton);
            int size = e10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view2 = e10.get(i11);
                if (view2 instanceof AppBarLayout) {
                    s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        z10 = ((CoordinatorLayout.f) layoutParams).f4593a instanceof BottomSheetBehavior;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        t(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.r(extendedFloatingActionButton, i10);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10;
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            boolean z11 = this.f7124b;
            int i10 = 1;
            boolean z12 = this.c;
            int i11 = 0;
            if ((z11 || z12) && fVar.f4597f == appBarLayout.getId()) {
                z10 = true;
                if (z10) {
                    return;
                }
                if (this.f7123a == null) {
                    this.f7123a = new Rect();
                }
                Rect rect = this.f7123a;
                ThreadLocal<Matrix> threadLocal = u5.c.f17803a;
                rect.set(0, 0, appBarLayout.getWidth(), appBarLayout.getHeight());
                u5.c.b(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    if (z12) {
                        i10 = 2;
                    }
                    ExtendedFloatingActionButton.e(extendedFloatingActionButton, i10);
                    throw null;
                }
                if (z12) {
                    i11 = 3;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, i11);
                throw null;
            }
            z10 = false;
            if (z10) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void t(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10;
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            boolean z11 = this.f7124b;
            int i10 = 1;
            int i11 = 0;
            boolean z12 = this.c;
            if ((z11 || z12) && fVar.f4597f == view.getId()) {
                z10 = true;
                if (z10) {
                    return;
                }
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    if (z12) {
                        i10 = 2;
                    }
                    ExtendedFloatingActionButton.e(extendedFloatingActionButton, i10);
                    throw null;
                }
                if (z12) {
                    i11 = 3;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, i11);
                throw null;
            }
            z10 = false;
            if (z10) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class a extends Property<View, Float> {
        public a() {
            super(Float.class, "width");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            View view2 = view;
            view2.getLayoutParams().width = f10.intValue();
            view2.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class b extends Property<View, Float> {
        public b() {
            super(Float.class, "height");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            View view2 = view;
            view2.getLayoutParams().height = f10.intValue();
            view2.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class c extends Property<View, Float> {
        public c() {
            super(Float.class, "paddingStart");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            return Float.valueOf(j0.e.f(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            View view2 = view;
            int intValue = f10.intValue();
            int paddingTop = view2.getPaddingTop();
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.e.k(view2, intValue, paddingTop, j0.e.e(view2), view2.getPaddingBottom());
        }
    }

    /* loaded from: classes.dex */
    public class d extends Property<View, Float> {
        public d() {
            super(Float.class, "paddingEnd");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            return Float.valueOf(j0.e.e(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            View view2 = view;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.e.k(view2, j0.e.f(view2), view2.getPaddingTop(), f10.intValue(), view2.getPaddingBottom());
        }
    }

    static {
        new a();
        new b();
        new c();
        new d();
    }

    public static void e(ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(e.g("Unknown strategy type: ", i10));
        }
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public g getExtendMotionSpec() {
        throw null;
    }

    public g getHideMotionSpec() {
        throw null;
    }

    public g getShowMotionSpec() {
        throw null;
    }

    public g getShrinkMotionSpec() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
    }

    public void setExtendMotionSpec(g gVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(g.b(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (z10) {
            throw null;
        }
    }

    public void setHideMotionSpec(g gVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(g.b(getContext(), i10));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    public void setShowMotionSpec(g gVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(g.b(getContext(), i10));
    }

    public void setShrinkMotionSpec(g gVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(g.b(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }
}
