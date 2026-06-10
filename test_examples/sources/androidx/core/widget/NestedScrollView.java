package androidx.core.widget;

import a3.j0;
import a3.s;
import a3.t;
import a3.v;
import a3.v0;
import a3.w;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import b3.g;
import b3.i;
import com.noto.R;
import e3.c;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements v, s {
    public static final float J = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final a K = new a();
    public static final int[] L = {16843130};
    public final int[] A;
    public final int[] B;
    public int C;
    public int D;
    public d E;
    public final w F;
    public final t G;
    public float H;
    public c I;

    /* renamed from: i  reason: collision with root package name */
    public final float f4635i;

    /* renamed from: j  reason: collision with root package name */
    public long f4636j;

    /* renamed from: k  reason: collision with root package name */
    public final Rect f4637k;

    /* renamed from: l  reason: collision with root package name */
    public OverScroller f4638l;

    /* renamed from: m  reason: collision with root package name */
    public final EdgeEffect f4639m;
    public final EdgeEffect n;

    /* renamed from: o  reason: collision with root package name */
    public int f4640o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4641p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4642q;

    /* renamed from: r  reason: collision with root package name */
    public View f4643r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4644s;

    /* renamed from: t  reason: collision with root package name */
    public VelocityTracker f4645t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4646u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4647v;

    /* renamed from: w  reason: collision with root package name */
    public int f4648w;

    /* renamed from: x  reason: collision with root package name */
    public int f4649x;

    /* renamed from: y  reason: collision with root package name */
    public int f4650y;

    /* renamed from: z  reason: collision with root package name */
    public int f4651z;

    /* loaded from: classes.dex */
    public static class a extends a3.a {
        @Override // a3.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            boolean z10;
            super.c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            i.c(accessibilityEvent, nestedScrollView.getScrollX());
            i.d(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // a3.a
        public final void d(View view, g gVar) {
            int scrollRange;
            this.f108a.onInitializeAccessibilityNodeInfo(view, gVar.f6357a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            gVar.i(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                gVar.o(true);
                if (nestedScrollView.getScrollY() > 0) {
                    gVar.b(g.a.f6363i);
                    gVar.b(g.a.f6367m);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    gVar.b(g.a.f6362h);
                    gVar.b(g.a.f6368o);
                }
            }
        }

        @Override // a3.a
        public final boolean g(View view, int i10, Bundle bundle) {
            if (super.g(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 != 8192 && i10 != 16908344) {
                    if (i10 != 16908346) {
                        return false;
                    }
                } else {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.u(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                    return true;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.u(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(NestedScrollView nestedScrollView, int i10);
    }

    /* loaded from: classes.dex */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: i  reason: collision with root package name */
        public int f4652i;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f4652i = parcel.readInt();
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f4652i + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f4652i);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f4637k = new Rect();
        this.f4641p = true;
        this.f4642q = false;
        this.f4643r = null;
        this.f4644s = false;
        this.f4647v = true;
        this.f4651z = -1;
        this.A = new int[2];
        this.B = new int[2];
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            edgeEffect = c.b.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f4639m = edgeEffect;
        if (i10 >= 31) {
            edgeEffect2 = c.b.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.n = edgeEffect2;
        this.f4635i = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f4638l = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f4648w = viewConfiguration.getScaledTouchSlop();
        this.f4649x = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4650y = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.F = new w();
        this.G = new t(this);
        setNestedScrollingEnabled(true);
        j0.p(this, K);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.H == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.H = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.H;
    }

    public static boolean k(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, view2);
    }

    public final boolean a(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && l(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.f4637k;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            c(b(rect));
            findNextFocus.requestFocus(i10);
        } else {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            c(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && (!l(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i11) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        } else if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public final void c(int i10) {
        if (i10 != 0) {
            if (this.f4647v) {
                u(0, i10, false);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i10;
        if (this.f4638l.isFinished()) {
            return;
        }
        this.f4638l.computeScrollOffset();
        int currY = this.f4638l.getCurrY();
        int i11 = currY - this.D;
        int height = getHeight();
        EdgeEffect edgeEffect = this.n;
        EdgeEffect edgeEffect2 = this.f4639m;
        if (i11 > 0 && e3.c.a(edgeEffect2) != 0.0f) {
            round = Math.round(e3.c.b(edgeEffect2, ((-i11) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
            if (round != i11) {
                edgeEffect2.finish();
            }
        } else {
            if (i11 < 0 && e3.c.a(edgeEffect) != 0.0f) {
                float f10 = height;
                round = Math.round(e3.c.b(edgeEffect, (i11 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
                if (round != i11) {
                    edgeEffect.finish();
                }
            }
            this.D = currY;
            int[] iArr = this.B;
            boolean z10 = false;
            iArr[1] = 0;
            this.G.c(0, i11, 1, iArr, null);
            i10 = i11 - iArr[1];
            int scrollRange = getScrollRange();
            if (i10 != 0) {
                int scrollY = getScrollY();
                r(i10, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i12 = i10 - scrollY2;
                iArr[1] = 0;
                this.G.e(0, scrollY2, 0, i12, this.A, 1, iArr);
                i10 = i12 - iArr[1];
            }
            if (i10 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z10 = true;
                }
                if (z10) {
                    if (i10 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f4638l.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f4638l.getCurrVelocity());
                    }
                }
                this.f4638l.abortAnimation();
                x(1);
            }
            if (this.f4638l.isFinished()) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                j0.d.k(this);
                return;
            }
            x(1);
            return;
        }
        i11 -= round;
        this.D = currY;
        int[] iArr2 = this.B;
        boolean z102 = false;
        iArr2[1] = 0;
        this.G.c(0, i11, 1, iArr2, null);
        i10 = i11 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (i10 != 0) {
        }
        if (i10 != 0) {
        }
        if (this.f4638l.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final void d() {
        this.f4644s = false;
        VelocityTracker velocityTracker = this.f4645t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4645t = null;
        }
        x(0);
        this.f4639m.onRelease();
        this.n.onRelease();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !e(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.G.a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.G.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.G.c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.G.e(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f4639m;
        int i11 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i10 = getPaddingLeft() + 0;
            } else {
                i10 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i10, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                j0.d.k(this);
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.n;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (b.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i11 = 0 + getPaddingLeft();
            }
            if (b.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i11 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                j0.d.k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        Rect rect = this.f4637k;
        rect.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                z10 = true;
                if (z10) {
                    if (!isFocused() || keyEvent.getKeyCode() == 4) {
                        return false;
                    }
                    View findFocus = findFocus();
                    if (findFocus == this) {
                        findFocus = null;
                    }
                    View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                    if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                        return true;
                    }
                    return false;
                } else if (keyEvent.getAction() != 0) {
                    return false;
                } else {
                    int keyCode = keyEvent.getKeyCode();
                    int i10 = 33;
                    if (keyCode != 19) {
                        if (keyCode != 20) {
                            if (keyCode != 62) {
                                return false;
                            }
                            if (!keyEvent.isShiftPressed()) {
                                i10 = 130;
                            }
                            if (i10 == 130) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            int height = getHeight();
                            if (z11) {
                                rect.top = getScrollY() + height;
                                int childCount = getChildCount();
                                if (childCount > 0) {
                                    View childAt2 = getChildAt(childCount - 1);
                                    int paddingBottom = getPaddingBottom() + childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                                    if (rect.top + height > paddingBottom) {
                                        rect.top = paddingBottom - height;
                                    }
                                }
                            } else {
                                int scrollY = getScrollY() - height;
                                rect.top = scrollY;
                                if (scrollY < 0) {
                                    rect.top = 0;
                                }
                            }
                            int i11 = rect.top;
                            int i12 = height + i11;
                            rect.bottom = i12;
                            s(i10, i11, i12);
                            return false;
                        } else if (!keyEvent.isAltPressed()) {
                            return a(130);
                        } else {
                            return h(130);
                        }
                    } else if (!keyEvent.isAltPressed()) {
                        return a(33);
                    } else {
                        return h(33);
                    }
                }
            }
        }
        z10 = false;
        if (z10) {
        }
    }

    @Override // a3.u
    public final void f(View view, View view2, int i10, int i11) {
        w wVar = this.F;
        if (i11 == 1) {
            wVar.f219b = i10;
        } else {
            wVar.f218a = i10;
        }
        this.G.g(2, i11);
    }

    public final void g(int i10) {
        if (getChildCount() > 0) {
            this.f4638l.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.G.g(2, 1);
            this.D = getScrollY();
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.d.k(this);
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        w wVar = this.F;
        return wVar.f219b | wVar.f218a;
    }

    public int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public final boolean h(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f4637k;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.top = rect.bottom - height;
        }
        return s(i10, rect.top, rect.bottom);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.G.f(0) != null;
    }

    @Override // a3.u
    public final void i(View view, int i10) {
        w wVar = this.F;
        if (i10 == 1) {
            wVar.f219b = 0;
        } else {
            wVar.f218a = 0;
        }
        x(i10);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.G.f212d;
    }

    @Override // a3.u
    public final void j(View view, int i10, int i11, int[] iArr, int i12) {
        this.G.c(i10, i11, i12, iArr, null);
    }

    public final boolean l(View view, int i10, int i11) {
        Rect rect = this.f4637k;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11;
    }

    @Override // a3.v
    public final void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        p(i13, i14, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // a3.u
    public final void n(View view, int i10, int i11, int i12, int i13, int i14) {
        p(i13, i14, null);
    }

    @Override // a3.u
    public final boolean o(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4642q = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = 0;
        if (motionEvent.getAction() == 8 && !this.f4644s) {
            if (a1.b.l0(motionEvent, 2)) {
                i10 = 9;
            } else if (a1.b.l0(motionEvent, 4194304)) {
                i10 = 26;
            } else {
                f10 = 0.0f;
                if (f10 != 0.0f) {
                    int scrollRange = getScrollRange();
                    int scrollY = getScrollY();
                    int verticalScrollFactorCompat = scrollY - ((int) (f10 * getVerticalScrollFactorCompat()));
                    if (verticalScrollFactorCompat < 0) {
                        int overScrollMode = getOverScrollMode();
                        if (overScrollMode != 0 && (overScrollMode != 1 || getScrollRange() <= 0)) {
                            z13 = false;
                            if (!z13 && !a1.b.l0(motionEvent, 8194)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (!z14) {
                                float height = (-verticalScrollFactorCompat) / getHeight();
                                EdgeEffect edgeEffect = this.f4639m;
                                e3.c.b(edgeEffect, height, 0.5f);
                                edgeEffect.onRelease();
                                invalidate();
                                z12 = 1;
                            } else {
                                verticalScrollFactorCompat = 0;
                                i11 = verticalScrollFactorCompat;
                                z12 = 0;
                            }
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        z14 = false;
                        if (!z14) {
                        }
                    } else {
                        if (verticalScrollFactorCompat > scrollRange) {
                            int overScrollMode2 = getOverScrollMode();
                            if (overScrollMode2 != 0 && (overScrollMode2 != 1 || getScrollRange() <= 0)) {
                                z10 = false;
                                if (!z10 && !a1.b.l0(motionEvent, 8194)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    float height2 = (verticalScrollFactorCompat - scrollRange) / getHeight();
                                    EdgeEffect edgeEffect2 = this.n;
                                    e3.c.b(edgeEffect2, height2, 0.5f);
                                    edgeEffect2.onRelease();
                                    invalidate();
                                    i11 = 1;
                                }
                                z12 = i11;
                                i11 = scrollRange;
                            }
                            z10 = true;
                            if (!z10) {
                            }
                            z11 = false;
                            if (z11) {
                            }
                            z12 = i11;
                            i11 = scrollRange;
                        }
                        i11 = verticalScrollFactorCompat;
                        z12 = 0;
                    }
                    if (i11 != scrollY) {
                        super.scrollTo(getScrollX(), i11);
                        return true;
                    }
                    return z12;
                }
            }
            f10 = motionEvent.getAxisValue(i10);
            if (f10 != 0.0f) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        boolean z11 = true;
        if (action == 2 && this.f4644s) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 6) {
                            q(motionEvent);
                        }
                    }
                } else {
                    int i11 = this.f4651z;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f4640o) > this.f4648w && (2 & getNestedScrollAxes()) == 0) {
                                this.f4644s = true;
                                this.f4640o = y10;
                                if (this.f4645t == null) {
                                    this.f4645t = VelocityTracker.obtain();
                                }
                                this.f4645t.addMovement(motionEvent);
                                this.C = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.f4644s = false;
            this.f4651z = -1;
            VelocityTracker velocityTracker = this.f4645t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f4645t = null;
            }
            if (this.f4638l.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                j0.d.k(this);
            }
            x(0);
        } else {
            int y11 = (int) motionEvent.getY();
            int x3 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y11 >= childAt.getTop() - scrollY && y11 < childAt.getBottom() - scrollY && x3 >= childAt.getLeft() && x3 < childAt.getRight()) {
                    z10 = true;
                    if (z10) {
                        if (!w(motionEvent) && this.f4638l.isFinished()) {
                            z11 = false;
                        }
                        this.f4644s = z11;
                        VelocityTracker velocityTracker2 = this.f4645t;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.f4645t = null;
                        }
                    } else {
                        this.f4640o = y11;
                        this.f4651z = motionEvent.getPointerId(0);
                        VelocityTracker velocityTracker3 = this.f4645t;
                        if (velocityTracker3 == null) {
                            this.f4645t = VelocityTracker.obtain();
                        } else {
                            velocityTracker3.clear();
                        }
                        this.f4645t.addMovement(motionEvent);
                        this.f4638l.computeScrollOffset();
                        if (!w(motionEvent) && this.f4638l.isFinished()) {
                            z11 = false;
                        }
                        this.f4644s = z11;
                        this.G.g(2, 0);
                    }
                }
            }
            z10 = false;
            if (z10) {
            }
        }
        return this.f4644s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
        scrollTo(getScrollX(), r2);
     */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = 0;
        this.f4641p = false;
        View view = this.f4643r;
        if (view != null && k(view, this)) {
            View view2 = this.f4643r;
            Rect rect = this.f4637k;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int b5 = b(rect);
            if (b5 != 0) {
                scrollBy(0, b5);
            }
        }
        this.f4643r = null;
        if (!this.f4642q) {
            if (this.E != null) {
                scrollTo(getScrollX(), this.E.f4652i);
                this.E = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i14 = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i14 && scrollY >= 0) {
                i15 = paddingTop + scrollY > i14 ? i14 - paddingTop : scrollY;
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f4642q = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f4646u && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        g((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        j(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        p(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        f(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View findNextFocusFromRect;
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (rect == null) {
            findNextFocusFromRect = focusFinder.findNextFocus(this, null, i10);
        } else {
            findNextFocusFromRect = focusFinder.findNextFocusFromRect(this, rect, i10);
        }
        if (findNextFocusFromRect == null || (true ^ l(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.E = dVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f4652i = getScrollY();
        return dVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        c cVar = this.I;
        if (cVar != null) {
            cVar.a(this, i11);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !l(findFocus, 0, i13)) {
            return;
        }
        Rect rect = this.f4637k;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        c(b(rect));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x024f, code lost:
        if (t(r10, r2) != false) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        boolean z10;
        int i10;
        float b5;
        EdgeEffect edgeEffect;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (this.f4645t == null) {
            this.f4645t = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f10 = 0.0f;
        obtain.offsetLocation(0.0f, this.C);
        t tVar = this.G;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect2 = this.n;
            EdgeEffect edgeEffect3 = this.f4639m;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                q(motionEvent);
                                this.f4640o = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f4651z));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f4640o = (int) motionEvent.getY(actionIndex);
                            this.f4651z = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.f4644s && getChildCount() > 0 && this.f4638l.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            WeakHashMap<View, v0> weakHashMap = j0.f188a;
                            j0.d.k(this);
                        }
                        this.f4651z = -1;
                        d();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f4651z);
                    if (findPointerIndex == -1) {
                        Log.e("NestedScrollView", "Invalid pointerId=" + this.f4651z + " in onTouchEvent");
                    } else {
                        int y10 = (int) motionEvent.getY(findPointerIndex);
                        int i11 = this.f4640o - y10;
                        float x3 = motionEvent.getX(findPointerIndex) / getWidth();
                        float height = i11 / getHeight();
                        if (e3.c.a(edgeEffect3) != 0.0f) {
                            b5 = -e3.c.b(edgeEffect3, -height, x3);
                            if (e3.c.a(edgeEffect3) == 0.0f) {
                                edgeEffect = edgeEffect3;
                                edgeEffect.onRelease();
                            }
                            f10 = b5;
                        } else if (e3.c.a(edgeEffect2) != 0.0f) {
                            b5 = e3.c.b(edgeEffect2, height, 1.0f - x3);
                            if (e3.c.a(edgeEffect2) == 0.0f) {
                                edgeEffect = edgeEffect2;
                                edgeEffect.onRelease();
                            }
                            f10 = b5;
                        }
                        int round = Math.round(f10 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        int i12 = i11 - round;
                        if (!this.f4644s && Math.abs(i12) > this.f4648w) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f4644s = true;
                            int i13 = this.f4648w;
                            i12 = i12 > 0 ? i12 - i13 : i12 + i13;
                        }
                        if (this.f4644s) {
                            boolean c10 = this.G.c(0, i12, 0, this.B, this.A);
                            int[] iArr = this.B;
                            int[] iArr2 = this.A;
                            if (c10) {
                                i12 -= iArr[1];
                                this.C += iArr2[1];
                            }
                            this.f4640o = y10 - iArr2[1];
                            int scrollY = getScrollY();
                            int scrollRange = getScrollRange();
                            int overScrollMode = getOverScrollMode();
                            if (overScrollMode != 0 && (overScrollMode != 1 || scrollRange <= 0)) {
                                z11 = false;
                                if (r(i12, 0, getScrollY(), scrollRange)) {
                                    if (tVar.f(0) != null) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (!z14) {
                                        z12 = true;
                                        int scrollY2 = getScrollY() - scrollY;
                                        iArr[1] = 0;
                                        this.G.e(0, scrollY2, 0, i12 - scrollY2, this.A, 0, iArr);
                                        int i14 = this.f4640o;
                                        int i15 = iArr2[1];
                                        this.f4640o = i14 - i15;
                                        this.C += i15;
                                        if (z11) {
                                            int i16 = i12 - iArr[1];
                                            int i17 = scrollY + i16;
                                            if (i17 < 0) {
                                                e3.c.b(edgeEffect3, (-i16) / getHeight(), motionEvent.getX(findPointerIndex) / getWidth());
                                                if (!edgeEffect2.isFinished()) {
                                                    edgeEffect2.onRelease();
                                                }
                                            } else if (i17 > scrollRange) {
                                                e3.c.b(edgeEffect2, i16 / getHeight(), 1.0f - (motionEvent.getX(findPointerIndex) / getWidth()));
                                                if (!edgeEffect3.isFinished()) {
                                                    edgeEffect3.onRelease();
                                                }
                                            }
                                            if (!edgeEffect3.isFinished() || !edgeEffect2.isFinished()) {
                                                WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                                                j0.d.k(this);
                                                z13 = false;
                                                if (z13) {
                                                    this.f4645t.clear();
                                                }
                                            }
                                        }
                                        z13 = z12;
                                        if (z13) {
                                        }
                                    }
                                }
                                z12 = false;
                                int scrollY22 = getScrollY() - scrollY;
                                iArr[1] = 0;
                                this.G.e(0, scrollY22, 0, i12 - scrollY22, this.A, 0, iArr);
                                int i142 = this.f4640o;
                                int i152 = iArr2[1];
                                this.f4640o = i142 - i152;
                                this.C += i152;
                                if (z11) {
                                }
                                z13 = z12;
                                if (z13) {
                                }
                            }
                            z11 = true;
                            if (r(i12, 0, getScrollY(), scrollRange)) {
                            }
                            z12 = false;
                            int scrollY222 = getScrollY() - scrollY;
                            iArr[1] = 0;
                            this.G.e(0, scrollY222, 0, i12 - scrollY222, this.A, 0, iArr);
                            int i1422 = this.f4640o;
                            int i1522 = iArr2[1];
                            this.f4640o = i1422 - i1522;
                            this.C += i1522;
                            if (z11) {
                            }
                            z13 = z12;
                            if (z13) {
                            }
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker = this.f4645t;
                velocityTracker.computeCurrentVelocity(1000, this.f4650y);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f4651z);
                if (Math.abs(yVelocity) >= this.f4649x) {
                    if (e3.c.a(edgeEffect3) != 0.0f) {
                        if (t(edgeEffect3, yVelocity)) {
                            i10 = yVelocity;
                            edgeEffect2 = edgeEffect3;
                            edgeEffect2.onAbsorb(i10);
                        } else {
                            i10 = -yVelocity;
                            g(i10);
                        }
                    } else if (e3.c.a(edgeEffect2) != 0.0f) {
                        i10 = -yVelocity;
                    } else {
                        z10 = false;
                        if (!z10) {
                            int i18 = -yVelocity;
                            float f11 = i18;
                            if (!dispatchNestedPreFling(0.0f, f11)) {
                                dispatchNestedFling(0.0f, f11, true);
                                g(i18);
                            }
                        }
                    }
                    z10 = true;
                    if (!z10) {
                    }
                } else if (this.f4638l.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap<View, v0> weakHashMap3 = j0.f188a;
                    j0.d.k(this);
                }
                this.f4651z = -1;
                d();
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.f4644s && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f4638l.isFinished()) {
                this.f4638l.abortAnimation();
                x(1);
            }
            this.f4640o = (int) motionEvent.getY();
            this.f4651z = motionEvent.getPointerId(0);
            tVar.g(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f4645t;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.G.d(scrollY2, i10 - scrollY2, i11, iArr);
    }

    public final void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4651z) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f4640o = (int) motionEvent.getY(i10);
            this.f4651z = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f4645t;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        boolean z12;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i14 = i11 + 0;
        int i15 = i12 + i10;
        int i16 = i13 + 0;
        if (i14 <= 0 && i14 >= 0) {
            z10 = false;
            if (i15 <= i16) {
                i15 = i16;
            } else if (i15 < 0) {
                i15 = 0;
            } else {
                z11 = false;
                if (z11) {
                    if (this.G.f(1) != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        this.f4638l.springBack(i14, i15, 0, 0, 0, getScrollRange());
                    }
                }
                onOverScrolled(i14, i15, z10, z11);
                if (!z10 && !z11) {
                    return false;
                }
            }
            z11 = true;
            if (z11) {
            }
            onOverScrolled(i14, i15, z10, z11);
            return !z10 ? true : true;
        }
        z10 = true;
        i14 = 0;
        if (i15 <= i16) {
        }
        z11 = true;
        if (z11) {
        }
        onOverScrolled(i14, i15, z10, z11);
        if (!z10) {
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f4641p) {
            Rect rect = this.f4637k;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int b5 = b(rect);
            if (b5 != 0) {
                scrollBy(0, b5);
            }
        } else {
            this.f4643r = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        boolean z11;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int b5 = b(rect);
        if (b5 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (z10) {
                scrollBy(0, b5);
            } else {
                u(0, b5, false);
            }
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.f4645t) != null) {
            velocityTracker.recycle();
            this.f4645t = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f4641p = true;
        super.requestLayout();
    }

    public final boolean s(int i10, int i11, int i12) {
        boolean z10;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        int height = getHeight();
        int scrollY = getScrollY();
        int i14 = height + scrollY;
        if (i10 == 33) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z14 = false;
        for (int i15 = 0; i15 < size; i15++) {
            View view2 = focusables.get(i15);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                if (i11 < top && bottom < i12) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (view == null) {
                    view = view2;
                    z14 = z12;
                } else {
                    if ((z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom())) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z14) {
                        if (z12 && z13) {
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z14 = true;
                    } else {
                        if (!z13) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i11 >= scrollY && i12 <= i14) {
            z11 = false;
        } else {
            if (z10) {
                i13 = i11 - scrollY;
            } else {
                i13 = i12 - i14;
            }
            c(i13);
            z11 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i10);
        }
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width < width2 && i10 >= 0) {
                if (width + i10 > width2) {
                    i10 = width2 - width;
                }
                if (height < height2 && i11 >= 0) {
                    if (height + i11 > height2) {
                        i11 = height2 - height;
                    }
                    if (i10 == getScrollX() || i11 != getScrollY()) {
                        super.scrollTo(i10, i11);
                    }
                    return;
                }
                i11 = 0;
                if (i10 == getScrollX()) {
                }
                super.scrollTo(i10, i11);
            }
            i10 = 0;
            if (height < height2) {
                if (height + i11 > height2) {
                }
                if (i10 == getScrollX()) {
                }
                super.scrollTo(i10, i11);
            }
            i11 = 0;
            if (i10 == getScrollX()) {
            }
            super.scrollTo(i10, i11);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f4646u) {
            this.f4646u = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        t tVar = this.G;
        if (tVar.f212d) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.i.z(tVar.c);
        }
        tVar.f212d = z10;
    }

    public void setOnScrollChangeListener(c cVar) {
        this.I = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f4647v = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.G.g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        x(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float a10 = e3.c.a(edgeEffect) * getHeight();
        float f10 = this.f4635i * 0.015f;
        double log = Math.log((Math.abs(-i10) * 0.35f) / f10);
        double d5 = J;
        if (((float) (Math.exp((d5 / (d5 - 1.0d)) * log) * f10)) < a10) {
            return true;
        }
        return false;
    }

    public final void u(int i10, int i11, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f4636j > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f4638l;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z10) {
                this.G.g(2, 1);
            } else {
                x(1);
            }
            this.D = getScrollY();
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.d.k(this);
        } else {
            if (!this.f4638l.isFinished()) {
                this.f4638l.abortAnimation();
                x(1);
            }
            scrollBy(i10, i11);
        }
        this.f4636j = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void v(int i10) {
        u(0 - getScrollX(), i10 - getScrollY(), false);
    }

    public final boolean w(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f4639m;
        if (e3.c.a(edgeEffect) != 0.0f) {
            e3.c.b(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.n;
        if (e3.c.a(edgeEffect2) != 0.0f) {
            e3.c.b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z10;
    }

    public final void x(int i10) {
        this.G.h(i10);
    }
}
