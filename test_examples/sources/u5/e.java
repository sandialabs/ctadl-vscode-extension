package u5;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.n0;

/* loaded from: classes.dex */
public class e extends n0 {
    public int A;
    public final boolean B;
    public boolean C;

    /* renamed from: x  reason: collision with root package name */
    public Drawable f17809x;

    /* renamed from: y  reason: collision with root package name */
    public final Rect f17810y;

    /* renamed from: z  reason: collision with root package name */
    public final Rect f17811z;

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        this.f17810y = new Rect();
        this.f17811z = new Rect();
        this.A = 119;
        this.B = true;
        this.C = false;
        TypedArray d5 = j.d(context, attributeSet, a1.b.f18a0, 0, 0, new int[0]);
        this.A = d5.getInt(1, this.A);
        Drawable drawable = d5.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.B = d5.getBoolean(2, true);
        d5.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f17809x;
        if (drawable != null) {
            if (this.C) {
                this.C = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z10 = this.B;
                Rect rect = this.f17810y;
                if (z10) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i10 = this.A;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f17811z;
                Gravity.apply(i10, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f17809x;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f17809x;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f17809x.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f17809x;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f17809x;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.n0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.C = z10 | this.C;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.C = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f17809x;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f17809x);
            }
            this.f17809x = drawable;
            this.C = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.A == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.A != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.A = i10;
            if (i10 == 119 && this.f17809x != null) {
                this.f17809x.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f17809x) {
            return false;
        }
        return true;
    }
}
