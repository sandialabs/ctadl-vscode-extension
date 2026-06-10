package r2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import r2.a;

/* loaded from: classes.dex */
public class d extends Drawable implements Drawable.Callback, c, b {

    /* renamed from: o  reason: collision with root package name */
    public static final PorterDuff.Mode f17048o = PorterDuff.Mode.SRC_IN;

    /* renamed from: i  reason: collision with root package name */
    public int f17049i;

    /* renamed from: j  reason: collision with root package name */
    public PorterDuff.Mode f17050j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f17051k;

    /* renamed from: l  reason: collision with root package name */
    public f f17052l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f17053m;
    public Drawable n;

    public d(Drawable drawable) {
        this.f17052l = new f(this.f17052l);
        a(drawable);
    }

    @Override // r2.c
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.n = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.f17052l;
            if (fVar != null) {
                fVar.f17056b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // r2.c
    public final Drawable b() {
        return this.n;
    }

    public boolean c() {
        throw null;
    }

    public final boolean d(int[] iArr) {
        if (c()) {
            f fVar = this.f17052l;
            ColorStateList colorStateList = fVar.c;
            PorterDuff.Mode mode = fVar.f17057d;
            if (colorStateList == null || mode == null) {
                this.f17051k = false;
                clearColorFilter();
            } else {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f17051k || colorForState != this.f17049i || mode != this.f17050j) {
                    setColorFilter(colorForState, mode);
                    this.f17049i = colorForState;
                    this.f17050j = mode;
                    this.f17051k = true;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.n.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f17052l;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.n.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z10;
        f fVar = this.f17052l;
        if (fVar != null) {
            if (fVar.f17056b != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                fVar.f17055a = getChangingConfigurations();
                return this.f17052l;
            }
            return null;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.n.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.n.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.n.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return a.b(this.n);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.n.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.n.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.n.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.n.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.n.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.n.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return a.C0214a.d(this.n);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        f fVar;
        ColorStateList colorStateList = (!c() || (fVar = this.f17052l) == null) ? null : fVar.c;
        return (colorStateList != null && colorStateList.isStateful()) || this.n.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.n.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f17053m && super.mutate() == this) {
            this.f17052l = new f(this.f17052l);
            Drawable drawable = this.n;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f17052l;
            if (fVar != null) {
                Drawable drawable2 = this.n;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                fVar.f17056b = constantState;
            }
            this.f17053m = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        return a.c(this.n, i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        return this.n.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.n.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        a.C0214a.e(this.n, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i10) {
        this.n.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.n.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        this.n.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z10) {
        this.n.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        boolean state = this.n.setState(iArr);
        if (!d(iArr) && !state) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f17052l.c = colorStateList;
        d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f17052l.f17057d = mode;
        d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        if (!super.setVisible(z10, z11) && !this.n.setVisible(z10, z11)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public d(f fVar, Resources resources) {
        Drawable.ConstantState constantState;
        this.f17052l = fVar;
        if (fVar == null || (constantState = fVar.f17056b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }
}
