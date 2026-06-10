package c2;

import a1.c;
import a3.v;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.q;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import b2.b;
import m7.n;
import q0.d;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup implements v {

    /* renamed from: i  reason: collision with root package name */
    public View f6517i;

    /* renamed from: j  reason: collision with root package name */
    public u7.a<n> f6518j;

    /* renamed from: k  reason: collision with root package name */
    public d f6519k;

    /* renamed from: l  reason: collision with root package name */
    public l<? super d, n> f6520l;

    /* renamed from: m  reason: collision with root package name */
    public b f6521m;
    public l<? super b, n> n;

    /* renamed from: o  reason: collision with root package name */
    public q f6522o;

    /* renamed from: p  reason: collision with root package name */
    public b4.d f6523p;

    /* renamed from: q  reason: collision with root package name */
    public l<? super Boolean, n> f6524q;

    /* renamed from: r  reason: collision with root package name */
    public int f6525r;

    /* renamed from: s  reason: collision with root package name */
    public int f6526s;

    @Override // a3.u
    public final void f(View view, View view2, int i10, int i11) {
        g.f(view, "child");
        g.f(view2, "target");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(null);
        throw null;
    }

    public final b getDensity() {
        return this.f6521m;
    }

    public final LayoutNode getLayoutNode() {
        return null;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f6517i;
        return (view == null || (layoutParams = view.getLayoutParams()) == null) ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final q getLifecycleOwner() {
        return this.f6522o;
    }

    public final d getModifier() {
        return this.f6519k;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        throw null;
    }

    public final l<b, n> getOnDensityChanged$ui_release() {
        return this.n;
    }

    public final l<d, n> getOnModifierChanged$ui_release() {
        return this.f6520l;
    }

    public final l<Boolean, n> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f6524q;
    }

    public final b4.d getSavedStateRegistryOwner() {
        return this.f6523p;
    }

    public final u7.a<n> getUpdate() {
        return this.f6518j;
    }

    public final View getView() {
        return this.f6517i;
    }

    @Override // a3.u
    public final void i(View view, int i10) {
        g.f(view, "target");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        throw null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        View view = this.f6517i;
        return view != null ? view.isNestedScrollingEnabled() : super.isNestedScrollingEnabled();
    }

    @Override // a3.u
    public final void j(View view, int i10, int i11, int[] iArr, int i12) {
        g.f(view, "target");
        if (isNestedScrollingEnabled()) {
            float f10 = i10;
            float f11 = -1;
            c.s(f10 * f11, i11 * f11);
            throw null;
        }
    }

    @Override // a3.v
    public final void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        g.f(view, "target");
        if (isNestedScrollingEnabled()) {
            float f10 = i10;
            float f11 = -1;
            c.s(f10 * f11, i11 * f11);
            c.s(i12 * f11, i13 * f11);
            throw null;
        }
    }

    @Override // a3.u
    public final void n(View view, int i10, int i11, int i12, int i13, int i14) {
        g.f(view, "target");
        if (isNestedScrollingEnabled()) {
            float f10 = i10;
            float f11 = -1;
            c.s(f10 * f11, i11 * f11);
            c.s(i12 * f11, i13 * f11);
            throw null;
        }
    }

    @Override // a3.u
    public final boolean o(View view, View view2, int i10, int i11) {
        g.f(view, "child");
        g.f(view2, "target");
        return ((i10 & 2) == 0 && (i10 & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        g.f(view, "child");
        g.f(view2, "target");
        super.onDescendantInvalidated(view, view2);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f6517i;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View view = this.f6517i;
        if (view != null) {
            view.measure(i10, i11);
        }
        View view2 = this.f6517i;
        int measuredWidth = view2 != null ? view2.getMeasuredWidth() : 0;
        View view3 = this.f6517i;
        setMeasuredDimension(measuredWidth, view3 != null ? view3.getMeasuredHeight() : 0);
        this.f6525r = i10;
        this.f6526s = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        g.f(view, "target");
        if (isNestedScrollingEnabled()) {
            a1.b.h(f10 * (-1.0f), f11 * (-1.0f));
            throw null;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        g.f(view, "target");
        if (isNestedScrollingEnabled()) {
            a1.b.h(f10 * (-1.0f), f11 * (-1.0f));
            throw null;
        }
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (Build.VERSION.SDK_INT < 23 && i10 == 0) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        l<? super Boolean, n> lVar = this.f6524q;
        if (lVar != null) {
            lVar.U(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(b bVar) {
        g.f(bVar, "value");
        if (bVar != this.f6521m) {
            this.f6521m = bVar;
            l<? super b, n> lVar = this.n;
            if (lVar != null) {
                lVar.U(bVar);
            }
        }
    }

    public final void setLifecycleOwner(q qVar) {
        if (qVar != this.f6522o) {
            this.f6522o = qVar;
            ViewTreeLifecycleOwner.b(this, qVar);
        }
    }

    public final void setModifier(d dVar) {
        g.f(dVar, "value");
        if (dVar != this.f6519k) {
            this.f6519k = dVar;
            l<? super d, n> lVar = this.f6520l;
            if (lVar != null) {
                lVar.U(dVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(l<? super b, n> lVar) {
        this.n = lVar;
    }

    public final void setOnModifierChanged$ui_release(l<? super d, n> lVar) {
        this.f6520l = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(l<? super Boolean, n> lVar) {
        this.f6524q = lVar;
    }

    public final void setSavedStateRegistryOwner(b4.d dVar) {
        if (dVar != this.f6523p) {
            this.f6523p = dVar;
            ViewTreeSavedStateRegistryOwner.b(this, dVar);
        }
    }

    public final void setUpdate(u7.a<n> aVar) {
        g.f(aVar, "value");
        this.f6518j = aVar;
        throw null;
    }

    public final void setView$ui_release(View view) {
        if (view != this.f6517i) {
            this.f6517i = view;
            removeAllViewsInLayout();
            if (view == null) {
                return;
            }
            addView(view);
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
