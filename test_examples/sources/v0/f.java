package v0;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* loaded from: classes.dex */
public final class f implements y {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f18105a = new Paint(7);

    /* renamed from: b  reason: collision with root package name */
    public int f18106b = 3;
    public Shader c;

    /* renamed from: d  reason: collision with root package name */
    public s f18107d;

    @Override // v0.y
    public final Paint a() {
        return this.f18105a;
    }

    public final float b() {
        Paint paint = this.f18105a;
        v7.g.f(paint, "<this>");
        return paint.getAlpha() / 255.0f;
    }

    public final long c() {
        Paint paint = this.f18105a;
        v7.g.f(paint, "<this>");
        long color = paint.getColor() << 32;
        int i10 = r.f18134h;
        return color;
    }

    public final void d(float f10) {
        Paint paint = this.f18105a;
        v7.g.f(paint, "<this>");
        paint.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public final void e(int i10) {
        this.f18106b = i10;
        Paint paint = this.f18105a;
        v7.g.f(paint, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            m0.f18125a.a(paint, i10);
        } else {
            paint.setXfermode(new PorterDuffXfermode(a1.c.N1(i10)));
        }
    }

    public final void f(long j2) {
        Paint paint = this.f18105a;
        v7.g.f(paint, "$this$setNativeColor");
        paint.setColor(a1.c.I1(j2));
    }

    public final void g(s sVar) {
        ColorFilter colorFilter;
        this.f18107d = sVar;
        Paint paint = this.f18105a;
        v7.g.f(paint, "<this>");
        if (sVar != null) {
            colorFilter = sVar.f18136a;
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
    }

    public final void h(Shader shader) {
        this.c = shader;
        Paint paint = this.f18105a;
        v7.g.f(paint, "<this>");
        paint.setShader(shader);
    }

    public final void i(int i10) {
        Paint.Style style;
        Paint paint = this.f18105a;
        v7.g.f(paint, "$this$setNativeStyle");
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }
}
