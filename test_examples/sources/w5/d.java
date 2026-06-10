package w5;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class d extends m<h> {
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public float f18388d;

    /* renamed from: e  reason: collision with root package name */
    public float f18389e;

    /* renamed from: f  reason: collision with root package name */
    public float f18390f;

    public d(h hVar) {
        super(hVar);
        this.c = 1;
    }

    @Override // w5.m
    public final void a(Canvas canvas, Paint paint, float f10, float f11, int i10) {
        if (f10 == f11) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(this.f18388d);
        float f12 = this.c;
        float f13 = f10 * 360.0f * f12;
        if (f11 < f10) {
            f11 += 1.0f;
        }
        float f14 = (f11 - f10) * 360.0f * f12;
        float f15 = this.f18390f;
        float f16 = -f15;
        canvas.drawArc(new RectF(f16, f16, f15, f15), f13, f14, false, paint);
        if (this.f18389e > 0.0f && Math.abs(f14) < 360.0f) {
            paint.setStyle(Paint.Style.FILL);
            float f17 = this.f18388d;
            float f18 = this.f18389e;
            canvas.save();
            canvas.rotate(f13);
            float f19 = this.f18390f;
            float f20 = f17 / 2.0f;
            canvas.drawRoundRect(new RectF(f19 - f20, f18, f19 + f20, -f18), f18, f18, paint);
            canvas.restore();
            float f21 = this.f18388d;
            float f22 = this.f18389e;
            canvas.save();
            canvas.rotate(f13 + f14);
            float f23 = this.f18390f;
            float f24 = f21 / 2.0f;
            canvas.drawRoundRect(new RectF(f23 - f24, f22, f23 + f24, -f22), f22, f22, paint);
            canvas.restore();
        }
    }

    @Override // w5.m
    public final void b(Canvas canvas, Paint paint) {
        int C = a1.b.C(((h) this.f18426a).f18385d, this.f18427b.f18425r);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(C);
        paint.setStrokeWidth(this.f18388d);
        float f10 = this.f18390f;
        canvas.drawArc(new RectF(-f10, -f10, f10, f10), 0.0f, 360.0f, false, paint);
    }

    public final int d() {
        S s10 = this.f18426a;
        return (((h) s10).f18406h * 2) + ((h) s10).f18405g;
    }
}
