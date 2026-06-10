package k4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Comparator;
import n2.a;

/* loaded from: classes.dex */
public final class b extends ViewGroup {
    public static final int[] C = {16842931};
    public ArrayList A;
    public int B;

    /* renamed from: i  reason: collision with root package name */
    public Parcelable f12871i;

    /* renamed from: j  reason: collision with root package name */
    public int f12872j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f12873k;

    /* renamed from: l  reason: collision with root package name */
    public int f12874l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f12875m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public int f12876o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12877p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f12878q;

    /* renamed from: r  reason: collision with root package name */
    public int f12879r;

    /* renamed from: s  reason: collision with root package name */
    public float f12880s;

    /* renamed from: t  reason: collision with root package name */
    public float f12881t;

    /* renamed from: u  reason: collision with root package name */
    public float f12882u;

    /* renamed from: v  reason: collision with root package name */
    public int f12883v;

    /* renamed from: w  reason: collision with root package name */
    public VelocityTracker f12884w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f12885x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList f12886y;

    /* renamed from: z  reason: collision with root package name */
    public f f12887z;

    /* loaded from: classes.dex */
    public static class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            cVar.getClass();
            cVar2.getClass();
            return 0;
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: k4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public @interface InterfaceC0139b {
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    /* loaded from: classes.dex */
    public static class d extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f12888a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12889b;

        public d() {
            super(-1, -1);
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.C);
            this.f12889b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(b bVar);
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(int i10);
    }

    /* loaded from: classes.dex */
    public static class g extends h3.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public int f12890k;

        /* renamed from: l  reason: collision with root package name */
        public Parcelable f12891l;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new g[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? g.class.getClassLoader() : classLoader;
            this.f12890k = parcel.readInt();
            this.f12891l = parcel.readParcelable(classLoader);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f12890k + "}";
        }

        @Override // h3.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f11358i, i10);
            parcel.writeInt(this.f12890k);
            parcel.writeParcelable(this.f12891l, i10);
        }
    }

    static {
        new a();
    }

    public static boolean b(int i10, int i11, int i12, View view, boolean z10) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && b(i10, i14 - childAt.getLeft(), i13 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.n != z10) {
            this.n = z10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i10) {
        boolean z10;
        View findNextFocus;
        View findFocus = findFocus();
        boolean z11 = false;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z10 = false;
                        break;
                    } else if (parent == this) {
                        z10 = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z10) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                }
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
            if (findNextFocus != null && findNextFocus != findFocus) {
                if (i10 != 17) {
                    int i11 = c(findNextFocus).left;
                    int i12 = c(findFocus).left;
                    if (findFocus != null && i11 >= i12) {
                    }
                    z11 = findNextFocus.requestFocus();
                } else if (i10 == 66) {
                    int i13 = c(findNextFocus).left;
                    int i14 = c(findFocus).left;
                    if (findFocus != null && i13 <= i14) {
                    }
                    z11 = findNextFocus.requestFocus();
                }
            }
            if (z11) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
            }
            return z11;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        if (findNextFocus != null) {
            if (i10 != 17) {
            }
        }
        if (z11) {
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12).getVisibility() == 0) {
                    throw null;
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10).getVisibility() == 0) {
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        boolean z10;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new d();
        }
        d dVar = (d) layoutParams;
        boolean z11 = dVar.f12888a;
        if (view.getClass().getAnnotation(InterfaceC0139b.class) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        dVar.f12888a = z12;
        if (this.f12875m) {
            if (!z12) {
                addViewInLayout(view, i10, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i10, layoutParams);
    }

    public final Rect c(View view) {
        Rect rect = new Rect();
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        while (true) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || parent == this) {
                break;
            }
            view = (ViewGroup) parent;
            rect.left = view.getLeft() + rect.left;
            rect.right = view.getRight() + rect.right;
            rect.top = view.getTop() + rect.top;
            rect.bottom = view.getBottom() + rect.bottom;
        }
        return rect;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052 A[ORIG_RETURN, RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        int i10;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            z10 = a(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            z10 = a(1);
                        }
                    }
                } else if (!keyEvent.hasModifiers(2)) {
                    i10 = 66;
                    z10 = a(i10);
                }
            } else if (!keyEvent.hasModifiers(2)) {
                i10 = 17;
                z10 = a(i10);
            }
            if (!z10) {
                return true;
            }
            return false;
        }
        z10 = false;
        if (!z10) {
        }
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt(i10).getVisibility() == 0) {
                throw null;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (getOverScrollMode() == 0) {
            throw null;
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f12873k;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new d();
    }

    public k4.a getAdapter() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        throw null;
    }

    public int getCurrentItem() {
        return 0;
    }

    public int getOffscreenPageLimit() {
        return this.f12876o;
    }

    public int getPageMargin() {
        return this.f12872j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12885x = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f12872j > 0 && this.f12873k != null) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        boolean z10;
        int action = motionEvent.getAction() & 255;
        int i10 = 0;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.f12877p) {
                    return true;
                }
                if (this.f12878q) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f12883v) {
                            if (actionIndex == 0) {
                                i10 = 1;
                            }
                            this.f12880s = motionEvent.getX(i10);
                            this.f12883v = motionEvent.getPointerId(i10);
                            VelocityTracker velocityTracker = this.f12884w;
                            if (velocityTracker != null) {
                                velocityTracker.clear();
                            }
                        }
                    }
                } else {
                    int i11 = this.f12883v;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        float x3 = motionEvent.getX(findPointerIndex);
                        float f11 = x3 - this.f12880s;
                        float abs = Math.abs(f11);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y10 - this.f12882u);
                        int i12 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                        if (i12 != 0) {
                            float f12 = this.f12880s;
                            if ((f12 < this.f12879r && i12 > 0) || (f12 > getWidth() - this.f12879r && f11 < 0.0f)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10 && b((int) f11, (int) x3, (int) y10, this, false)) {
                                this.f12880s = x3;
                                this.f12878q = true;
                                return false;
                            }
                        }
                        float f13 = 0;
                        if (abs > f13 && abs * 0.5f > abs2) {
                            this.f12877p = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            float f14 = this.f12881t;
                            if (i12 > 0) {
                                f10 = f14 + f13;
                            } else {
                                f10 = f14 - f13;
                            }
                            this.f12880s = f10;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f13) {
                            this.f12878q = true;
                        }
                        if (this.f12877p) {
                            this.f12880s = x3;
                            getScrollX();
                            getClientWidth();
                            throw null;
                        }
                    }
                }
                if (this.f12884w == null) {
                    this.f12884w = VelocityTracker.obtain();
                }
                this.f12884w.addMovement(motionEvent);
                return this.f12877p;
            }
            float x10 = motionEvent.getX();
            this.f12881t = x10;
            this.f12880s = x10;
            this.f12882u = motionEvent.getY();
            this.f12883v = motionEvent.getPointerId(0);
            this.f12878q = false;
            throw null;
        }
        this.f12883v = -1;
        this.f12877p = false;
        this.f12878q = false;
        VelocityTracker velocityTracker2 = this.f12884w;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f12884w = null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int max;
        int i14;
        int max2;
        int i15;
        int childCount = getChildCount();
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.f12888a) {
                    int i19 = dVar.f12889b;
                    int i20 = i19 & 7;
                    int i21 = i19 & 112;
                    if (i20 != 1) {
                        if (i20 != 3) {
                            if (i20 != 5) {
                                i14 = paddingLeft;
                            } else {
                                max = (i16 - paddingRight) - childAt.getMeasuredWidth();
                                paddingRight += childAt.getMeasuredWidth();
                            }
                        } else {
                            i14 = childAt.getMeasuredWidth() + paddingLeft;
                        }
                        if (i21 == 16) {
                            if (i21 != 48) {
                                if (i21 != 80) {
                                    i15 = paddingTop;
                                } else {
                                    max2 = (i17 - paddingBottom) - childAt.getMeasuredHeight();
                                    paddingBottom += childAt.getMeasuredHeight();
                                }
                            } else {
                                i15 = childAt.getMeasuredHeight() + paddingTop;
                            }
                            int i22 = paddingLeft + scrollX;
                            childAt.layout(i22, paddingTop, childAt.getMeasuredWidth() + i22, childAt.getMeasuredHeight() + paddingTop);
                            paddingTop = i15;
                            paddingLeft = i14;
                        } else {
                            max2 = Math.max((i17 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i23 = max2;
                        i15 = paddingTop;
                        paddingTop = i23;
                        int i222 = paddingLeft + scrollX;
                        childAt.layout(i222, paddingTop, childAt.getMeasuredWidth() + i222, childAt.getMeasuredHeight() + paddingTop);
                        paddingTop = i15;
                        paddingLeft = i14;
                    } else {
                        max = Math.max((i16 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i24 = max;
                    i14 = paddingLeft;
                    paddingLeft = i24;
                    if (i21 == 16) {
                    }
                    int i232 = max2;
                    i15 = paddingTop;
                    paddingTop = i232;
                    int i2222 = paddingLeft + scrollX;
                    childAt.layout(i2222, paddingTop, childAt.getMeasuredWidth() + i2222, childAt.getMeasuredHeight() + paddingTop);
                    paddingTop = i15;
                    paddingLeft = i14;
                }
            }
        }
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt2 = getChildAt(i25);
            if (childAt2.getVisibility() != 8 && !((d) childAt2.getLayoutParams()).f12888a) {
                throw null;
            }
        }
        if (!this.f12885x) {
            this.f12885x = false;
            return;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        d dVar;
        d dVar2;
        boolean z10;
        int i12;
        int i13;
        int i14;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.f12879r = Math.min(measuredWidth / 10, 0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i15 = 0;
        while (true) {
            int i16 = 1073741824;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8 && (dVar2 = (d) childAt.getLayoutParams()) != null && dVar2.f12888a) {
                int i17 = dVar2.f12889b;
                int i18 = i17 & 7;
                int i19 = i17 & 112;
                boolean z11 = true;
                if (i19 != 48 && i19 != 80) {
                    z10 = false;
                    if (i18 != 3 && i18 != 5) {
                        z11 = false;
                    }
                    if (z10) {
                        r7 = z11 ? 1073741824 : Integer.MIN_VALUE;
                        i12 = Integer.MIN_VALUE;
                    } else {
                        i12 = 1073741824;
                    }
                    i13 = ((ViewGroup.LayoutParams) dVar2).width;
                    if (i13 == -2) {
                        if (i13 == -1) {
                            i13 = paddingLeft;
                        }
                        i12 = 1073741824;
                    } else {
                        i13 = paddingLeft;
                    }
                    i14 = ((ViewGroup.LayoutParams) dVar2).height;
                    if (i14 != -2) {
                        i14 = measuredHeight;
                        i16 = r7;
                    } else if (i14 == -1) {
                        i14 = measuredHeight;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13, i12), View.MeasureSpec.makeMeasureSpec(i14, i16));
                    if (!z10) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z11) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
                z10 = true;
                if (i18 != 3) {
                    z11 = false;
                }
                if (z10) {
                }
                i13 = ((ViewGroup.LayoutParams) dVar2).width;
                if (i13 == -2) {
                }
                i14 = ((ViewGroup.LayoutParams) dVar2).height;
                if (i14 != -2) {
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13, i12), View.MeasureSpec.makeMeasureSpec(i14, i16));
                if (!z10) {
                }
            }
            i15++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f12874l = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f12875m = false;
        int childCount2 = getChildCount();
        for (int i20 = 0; i20 < childCount2; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8 && ((dVar = (d) childAt2.getLayoutParams()) == null || !dVar.f12888a)) {
                dVar.getClass();
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * 0.0f), 1073741824), this.f12874l);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = 1;
            i13 = childCount;
            i11 = 0;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i13) {
            if (getChildAt(i11).getVisibility() != 0) {
                i11 += i12;
            } else {
                throw null;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f11358i);
        this.f12871i = gVar.f12891l;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.f12890k = 0;
        return gVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            if (i12 > 0) {
                throw null;
            }
            throw null;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f12875m) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(k4.a aVar) {
        ArrayList arrayList = this.A;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.A.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.A.get(i10)).a(this);
        }
    }

    public void setCurrentItem(int i10) {
        setScrollingCacheEnabled(false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f12876o) {
            this.f12876o = i10;
        }
    }

    @Deprecated
    public void setOnPageChangeListener(f fVar) {
        this.f12887z = fVar;
    }

    public void setPageMargin(int i10) {
        this.f12872j = i10;
        if (getWidth() > 0) {
            throw null;
        }
        throw null;
    }

    public void setPageMarginDrawable(int i10) {
        Context context = getContext();
        Object obj = n2.a.f16069a;
        setPageMarginDrawable(a.b.b(context, i10));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f12873k = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.B == i10) {
            return;
        }
        this.B = i10;
        f fVar = this.f12887z;
        if (fVar != null) {
            fVar.a(i10);
        }
        ArrayList arrayList = this.f12886y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar2 = (f) this.f12886y.get(i11);
                if (fVar2 != null) {
                    fVar2.a(i10);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f12873k) {
            return false;
        }
        return true;
    }
}
