package androidx.appcompat.widget;

import a3.j0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.noto.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: i  reason: collision with root package name */
    public boolean f694i;

    /* renamed from: j  reason: collision with root package name */
    public v0 f695j;

    /* renamed from: k  reason: collision with root package name */
    public View f696k;

    /* renamed from: l  reason: collision with root package name */
    public View f697l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f698m;
    public Drawable n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f699o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f700p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f701q;

    /* renamed from: r  reason: collision with root package name */
    public final int f702r;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
        if (r3.f699o == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this);
        WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
        j0.d.q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.f35k);
        boolean z10 = false;
        this.f698m = obtainStyledAttributes.getDrawable(0);
        this.n = obtainStyledAttributes.getDrawable(2);
        this.f702r = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f700p = true;
            this.f699o = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f700p) {
            if (this.f698m == null && this.n == null) {
                z10 = true;
            }
        }
        setWillNotDraw(z10);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f698m;
        if (drawable != null && drawable.isStateful()) {
            this.f698m.setState(getDrawableState());
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null && drawable2.isStateful()) {
            this.n.setState(getDrawableState());
        }
        Drawable drawable3 = this.f699o;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f699o.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f695j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f698m;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f699o;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f696k = findViewById(R.id.action_bar);
        this.f697l = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f694i && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z10, i10, i11, i12, i13);
        v0 v0Var = this.f695j;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (v0Var == null || v0Var.getVisibility() == 8) ? false : true;
        if (v0Var != null && v0Var.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i14 = ((FrameLayout.LayoutParams) v0Var.getLayoutParams()).bottomMargin;
            v0Var.layout(i10, (measuredHeight - v0Var.getMeasuredHeight()) - i14, i12, measuredHeight - i14);
        }
        if (this.f700p) {
            Drawable drawable3 = this.f699o;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = false;
            }
        } else {
            if (this.f698m != null) {
                if (this.f696k.getVisibility() == 0) {
                    drawable2 = this.f698m;
                    left = this.f696k.getLeft();
                    top = this.f696k.getTop();
                    right = this.f696k.getRight();
                    view = this.f696k;
                } else {
                    View view2 = this.f697l;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f698m.setBounds(0, 0, 0, 0);
                        z12 = true;
                    } else {
                        drawable2 = this.f698m;
                        left = this.f697l.getLeft();
                        top = this.f697l.getTop();
                        right = this.f697l.getRight();
                        view = this.f697l;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z12 = true;
            }
            this.f701q = z13;
            if (!z13 || (drawable = this.n) == null) {
                z11 = z12;
            } else {
                drawable.setBounds(v0Var.getLeft(), v0Var.getTop(), v0Var.getRight(), v0Var.getBottom());
            }
        }
        if (z11) {
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0067, code lost:
        r0 = r6.f697l;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        View view;
        int i12;
        int i13;
        if (this.f696k == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i13 = this.f702r) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i13, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f696k == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        v0 v0Var = this.f695j;
        if (v0Var != null && v0Var.getVisibility() != 8 && mode != 1073741824) {
            View view2 = this.f696k;
            boolean z11 = true;
            int i14 = 0;
            if (view2 != null && view2.getVisibility() != 8 && view2.getMeasuredHeight() != 0) {
                z10 = false;
                if (z10) {
                    view = this.f696k;
                } else {
                    View view3 = this.f697l;
                    if (view3 != null && view3.getVisibility() != 8 && view3.getMeasuredHeight() != 0) {
                        z11 = false;
                    }
                    if (mode == Integer.MIN_VALUE) {
                        i12 = View.MeasureSpec.getSize(i11);
                    } else {
                        i12 = Integer.MAX_VALUE;
                    }
                    setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f695j) + i14, i12));
                }
                i14 = a(view);
                if (mode == Integer.MIN_VALUE) {
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f695j) + i14, i12));
            }
            z10 = true;
            if (z10) {
            }
            i14 = a(view);
            if (mode == Integer.MIN_VALUE) {
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f695j) + i14, i12));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f698m;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f698m);
        }
        this.f698m = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f696k;
            if (view != null) {
                this.f698m.setBounds(view.getLeft(), this.f696k.getTop(), this.f696k.getRight(), this.f696k.getBottom());
            }
        }
        boolean z10 = true;
        if (this.f700p) {
            if (this.f699o == null) {
            }
            z10 = false;
        } else {
            if (this.f698m == null && this.n == null) {
            }
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r4.f699o == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f699o;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f699o);
        }
        this.f699o = drawable;
        boolean z10 = this.f700p;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.f699o) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10) {
            if (this.f698m == null && this.n == null) {
                z11 = true;
            }
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r4.n == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setStackedBackground(Drawable drawable) {
        boolean z10;
        Drawable drawable2;
        Drawable drawable3 = this.n;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.n);
        }
        this.n = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f701q && (drawable2 = this.n) != null) {
                drawable2.setBounds(this.f695j.getLeft(), this.f695j.getTop(), this.f695j.getRight(), this.f695j.getBottom());
            }
        }
        if (this.f700p) {
            if (this.f699o == null) {
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.f698m == null) {
            }
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(v0 v0Var) {
        v0 v0Var2 = this.f695j;
        if (v0Var2 != null) {
            removeView(v0Var2);
        }
        this.f695j = v0Var;
        if (v0Var != null) {
            addView(v0Var);
            ViewGroup.LayoutParams layoutParams = v0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            v0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f694i = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f698m;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f699o;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f698m;
        boolean z10 = this.f700p;
        return (drawable == drawable2 && !z10) || (drawable == this.n && this.f701q) || ((drawable == this.f699o && z10) || super.verifyDrawable(drawable));
    }
}
