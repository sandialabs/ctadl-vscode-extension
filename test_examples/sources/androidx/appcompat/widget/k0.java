package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.noto.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import r2.a;

/* loaded from: classes.dex */
public class k0 extends ListView {

    /* renamed from: i  reason: collision with root package name */
    public final Rect f987i;

    /* renamed from: j  reason: collision with root package name */
    public int f988j;

    /* renamed from: k  reason: collision with root package name */
    public int f989k;

    /* renamed from: l  reason: collision with root package name */
    public int f990l;

    /* renamed from: m  reason: collision with root package name */
    public int f991m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public d f992o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f993p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f994q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f995r;

    /* renamed from: s  reason: collision with root package name */
    public e3.e f996s;

    /* renamed from: t  reason: collision with root package name */
    public f f997t;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final Method f998a;

        /* renamed from: b  reason: collision with root package name */
        public static final Method f999b;
        public static final Method c;

        /* renamed from: d  reason: collision with root package name */
        public static final boolean f1000d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f998a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f999b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f1000d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends f.c {

        /* renamed from: j  reason: collision with root package name */
        public boolean f1001j;

        public d(Drawable drawable) {
            super(drawable);
            this.f1001j = true;
        }

        @Override // f.c, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f1001j) {
                super.draw(canvas);
            }
        }

        @Override // f.c, android.graphics.drawable.Drawable
        public final void setHotspot(float f10, float f11) {
            if (this.f1001j) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // f.c, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f1001j) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // f.c, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f1001j) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // f.c, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z10, boolean z11) {
            if (this.f1001j) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public static final Field f1002a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f1002a = field;
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            k0 k0Var = k0.this;
            k0Var.f997t = null;
            k0Var.drawableStateChanged();
        }
    }

    public k0(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f987i = new Rect();
        this.f988j = 0;
        this.f989k = 0;
        this.f990l = 0;
        this.f991m = 0;
        this.f994q = z10;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z10) {
        d dVar = this.f992o;
        if (dVar != null) {
            dVar.f1001j = z10;
        }
    }

    public final int a(int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i12 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i12;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i13 = 0;
        for (int i14 = 0; i14 < count; i14++) {
            int itemViewType = adapter.getItemViewType(i14);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i14, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            view.measure(i10, i15 > 0 ? View.MeasureSpec.makeMeasureSpec(i15, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i14 > 0) {
                i12 += dividerHeight;
            }
            i12 += view.getMeasuredHeight();
            if (i12 >= i11) {
                return i11;
            }
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0143 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z15 = false;
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z10 = true;
                    if (z10 || z15) {
                        this.f995r = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.n - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (!z10) {
                        if (this.f996s == null) {
                            this.f996s = new e3.e(this);
                        }
                        e3.e eVar = this.f996s;
                        boolean z16 = eVar.f10622x;
                        eVar.f10622x = true;
                        eVar.onTouch(this, motionEvent);
                    } else {
                        e3.e eVar2 = this.f996s;
                        if (eVar2 != null) {
                            if (eVar2.f10622x) {
                                eVar2.d();
                            }
                            eVar2.f10622x = false;
                        }
                    }
                    return z10;
                }
                z10 = false;
                if (z10) {
                }
                this.f995r = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.n - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (!z10) {
                }
                return z10;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i10);
        if (findPointerIndex >= 0) {
            int x3 = (int) motionEvent.getX(findPointerIndex);
            int y10 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x3, y10);
            if (pointToPosition == -1) {
                z15 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f10 = x3;
                float f11 = y10;
                this.f995r = true;
                a.a(this, f10, f11);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i11 = this.n;
                if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.n = pointToPosition;
                a.a(childAt3, f10 - childAt3.getLeft(), f11 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                if (selector != null && pointToPosition != -1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f987i;
                rect.set(left, top, right, bottom);
                rect.left -= this.f988j;
                rect.top -= this.f989k;
                rect.right += this.f990l;
                rect.bottom += this.f991m;
                if (v2.a.a()) {
                    z12 = c.a(this);
                } else {
                    Field field = e.f1002a;
                    if (field != null) {
                        try {
                            z12 = field.getBoolean(this);
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        }
                    }
                    z12 = false;
                }
                if (childAt3.isEnabled() != z12) {
                    boolean z17 = !z12;
                    if (v2.a.a()) {
                        c.b(this, z17);
                    } else {
                        Field field2 = e.f1002a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z17));
                            } catch (IllegalAccessException e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z11) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    if (getVisibility() == 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z13 = false;
                    selector.setVisible(z14, false);
                    a.b.e(selector, exactCenterX, exactCenterY);
                } else {
                    z13 = false;
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    a.b.e(selector2, f10, f11);
                }
                setSelectorEnabled(z13);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z10 = true;
                z15 = false;
            }
            if (z10) {
            }
            this.f995r = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.n - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (!z10) {
            }
            return z10;
        }
        z10 = false;
        if (z10) {
        }
        this.f995r = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.n - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (!z10) {
        }
        return z10;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f987i;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f997t != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.f995r && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (!this.f994q && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (!this.f994q && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (!this.f994q && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f994q && this.f993p) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f997t = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onHoverEvent(MotionEvent motionEvent) {
        Drawable selector;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f997t == null) {
            f fVar = new f();
            this.f997t = fVar;
            post(fVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i10 >= 30 && b.f1000d) {
                    try {
                        b.f998a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        b.f999b.invoke(this, Integer.valueOf(pointToPosition));
                        b.c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e10) {
                        e = e10;
                        e.printStackTrace();
                        selector = getSelector();
                        if (selector != null) {
                            selector.setState(getDrawableState());
                        }
                        return onHoverEvent;
                    } catch (InvocationTargetException e11) {
                        e = e11;
                        e.printStackTrace();
                        selector = getSelector();
                        if (selector != null) {
                        }
                        return onHoverEvent;
                    }
                } else {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
            }
            selector = getSelector();
            if (selector != null && this.f995r && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.n = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f997t;
        if (fVar != null) {
            k0 k0Var = k0.this;
            k0Var.f997t = null;
            k0Var.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f993p = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f992o = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f988j = rect.left;
        this.f989k = rect.top;
        this.f990l = rect.right;
        this.f991m = rect.bottom;
    }
}
