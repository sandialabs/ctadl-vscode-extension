package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class c extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f16164a;
    public final RectF c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f16166d;

    /* renamed from: e  reason: collision with root package name */
    public float f16167e;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f16170h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuffColorFilter f16171i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f16172j;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16168f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16169g = true;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuff.Mode f16173k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f16165b = new Paint(5);

    public c(float f10, ColorStateList colorStateList) {
        this.f16164a = f10;
        b(colorStateList);
        this.c = new RectF();
        this.f16166d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f16170h = colorStateList;
        this.f16165b.setColor(colorStateList.getColorForState(getState(), this.f16170h.getDefaultColor()));
    }

    public final void c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f16166d;
        rect2.set(rect);
        if (this.f16168f) {
            float a10 = d.a(this.f16167e, this.f16164a, this.f16169g);
            float f10 = this.f16167e;
            float f11 = this.f16164a;
            if (this.f16169g) {
                f10 = (float) (((1.0d - d.f16174a) * f11) + f10);
            }
            rect2.inset((int) Math.ceil(f10), (int) Math.ceil(a10));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f16165b;
        if (this.f16171i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f16171i);
            z10 = true;
        }
        RectF rectF = this.c;
        float f10 = this.f16164a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f16166d, this.f16164a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f16172j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f16170h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f16170h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f16165b;
        boolean z10 = colorForState != paint.getColor();
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f16172j;
        if (colorStateList2 == null || (mode = this.f16173k) == null) {
            return z10;
        }
        this.f16171i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f16165b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f16165b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f16172j = colorStateList;
        this.f16171i = a(colorStateList, this.f16173k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f16173k = mode;
        this.f16171i = a(this.f16172j, mode);
        invalidateSelf();
    }
}
