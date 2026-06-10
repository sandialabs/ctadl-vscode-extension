package androidx.fragment.app;

import a3.b1;
import a3.j0;
import a3.v0;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.noto.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<View> f5069i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<View> f5070j;

    /* renamed from: k  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f5071k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5072l;

    public FragmentContainerView(Context context) {
        super(context);
        this.f5072l = true;
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        this.f5072l = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m0.b.f15894g);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
            }
        }
    }

    public final void a(View view) {
        ArrayList<View> arrayList = this.f5070j;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f5069i == null) {
            this.f5069i = new ArrayList<>();
        }
        this.f5069i.add(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        Fragment fragment;
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            fragment = (Fragment) tag;
        } else {
            fragment = null;
        }
        if (fragment != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        Fragment fragment;
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            fragment = (Fragment) tag;
        } else {
            fragment = null;
        }
        if (fragment != null) {
            return super.addViewInLayout(view, i10, layoutParams, z10);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        b1 b1Var;
        b1 i10 = b1.i(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f5071k;
        if (onApplyWindowInsetsListener != null) {
            b1Var = b1.i(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            WeakHashMap<View, v0> weakHashMap = a3.j0.f188a;
            WindowInsets h10 = i10.h();
            if (h10 != null) {
                WindowInsets b5 = j0.h.b(this, h10);
                if (!b5.equals(h10)) {
                    i10 = b1.i(this, b5);
                }
            }
            b1Var = i10;
        }
        if (!b1Var.f140a.n()) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                WeakHashMap<View, v0> weakHashMap2 = a3.j0.f188a;
                WindowInsets h11 = b1Var.h();
                if (h11 != null) {
                    WindowInsets a10 = j0.h.a(childAt, h11);
                    if (!a10.equals(h11)) {
                        b1.i(childAt, a10);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f5072l && this.f5069i != null) {
            for (int i10 = 0; i10 < this.f5069i.size(); i10++) {
                super.drawChild(canvas, this.f5069i.get(i10), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        ArrayList<View> arrayList;
        if (!this.f5072l || (arrayList = this.f5069i) == null || arrayList.size() <= 0 || !this.f5069i.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f5070j;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f5069i;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f5072l = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        if (z10) {
            a(view);
        }
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        a(getChildAt(i10));
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViewsInLayout(i10, i11);
    }

    public void setDrawDisappearingViewsLast(boolean z10) {
        this.f5072l = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f5071k = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f5070j == null) {
                this.f5070j = new ArrayList<>();
            }
            this.f5070j.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, z zVar) {
        super(context, attributeSet);
        View view;
        this.f5072l = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m0.b.f15894g);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment D = zVar.D(id);
        if (classAttribute != null && D == null) {
            if (id <= 0) {
                throw new IllegalStateException(a4.b.m("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            v H = zVar.H();
            context.getClassLoader();
            Fragment a10 = H.a(classAttribute);
            a10.B(context, attributeSet, null);
            a aVar = new a(zVar);
            aVar.f5177p = true;
            a10.L = this;
            aVar.e(getId(), a10, string, 1);
            if (!aVar.f5169g) {
                aVar.f5170h = false;
                aVar.f5098q.z(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = zVar.c.e().iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            Fragment fragment = f0Var.c;
            if (fragment.E == getId() && (view = fragment.M) != null && view.getParent() == null) {
                fragment.L = this;
                f0Var.b();
            }
        }
    }
}
