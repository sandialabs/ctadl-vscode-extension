package t5;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import b6.k;
import b6.l;

/* loaded from: classes.dex */
public final class a extends Drawable {

    /* renamed from: b  reason: collision with root package name */
    public final Paint f17576b;

    /* renamed from: h  reason: collision with root package name */
    public float f17581h;

    /* renamed from: i  reason: collision with root package name */
    public int f17582i;

    /* renamed from: j  reason: collision with root package name */
    public int f17583j;

    /* renamed from: k  reason: collision with root package name */
    public int f17584k;

    /* renamed from: l  reason: collision with root package name */
    public int f17585l;

    /* renamed from: m  reason: collision with root package name */
    public int f17586m;

    /* renamed from: o  reason: collision with root package name */
    public k f17587o;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f17588p;

    /* renamed from: a  reason: collision with root package name */
    public final l f17575a = l.a.f6466a;
    public final Path c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f17577d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final RectF f17578e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final RectF f17579f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    public final C0225a f17580g = new C0225a();
    public boolean n = true;

    /* renamed from: t5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0225a extends Drawable.ConstantState {
        public C0225a() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return a.this;
        }
    }

    public a(k kVar) {
        this.f17587o = kVar;
        Paint paint = new Paint(1);
        this.f17576b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10 = this.n;
        Paint paint = this.f17576b;
        Rect rect = this.f17577d;
        if (z10) {
            copyBounds(rect);
            float height = this.f17581h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{q2.a.b(this.f17582i, this.f17586m), q2.a.b(this.f17583j, this.f17586m), q2.a.b(q2.a.d(this.f17583j, 0), this.f17586m), q2.a.b(q2.a.d(this.f17585l, 0), this.f17586m), q2.a.b(this.f17585l, this.f17586m), q2.a.b(this.f17584k, this.f17586m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f17578e;
        rectF.set(rect);
        b6.c cVar = this.f17587o.f6436e;
        RectF rectF2 = this.f17579f;
        rectF2.set(getBounds());
        float min = Math.min(cVar.a(rectF2), rectF.width() / 2.0f);
        k kVar = this.f17587o;
        rectF2.set(getBounds());
        if (kVar.d(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f17580g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f17581h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        k kVar = this.f17587o;
        RectF rectF = this.f17579f;
        rectF.set(getBounds());
        if (kVar.d(rectF)) {
            b6.c cVar = this.f17587o.f6436e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), cVar.a(rectF));
            return;
        }
        Rect rect = this.f17577d;
        copyBounds(rect);
        RectF rectF2 = this.f17578e;
        rectF2.set(rect);
        k kVar2 = this.f17587o;
        Path path = this.c;
        this.f17575a.a(kVar2, 1.0f, rectF2, null, path);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            outline.setPath(path);
        } else if (i10 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        k kVar = this.f17587o;
        RectF rectF = this.f17579f;
        rectF.set(getBounds());
        if (kVar.d(rectF)) {
            int round = Math.round(this.f17581h);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f17588p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f17588p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f17586m)) != this.f17586m) {
            this.n = true;
            this.f17586m = colorForState;
        }
        if (this.n) {
            invalidateSelf();
        }
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f17576b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17576b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
