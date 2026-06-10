package s1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* renamed from: i  reason: collision with root package name */
    public Paint.FontMetricsInt f17254i;

    /* renamed from: j  reason: collision with root package name */
    public int f17255j;

    /* renamed from: k  reason: collision with root package name */
    public int f17256k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f17257l;

    public i() {
        throw null;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f17254i;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        v7.g.l("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.f17257l) {
            return this.f17256k;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public final int c() {
        if (this.f17257l) {
            return this.f17255j;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        v7.g.f(canvas, "canvas");
        v7.g.f(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        v7.g.f(paint, "paint");
        boolean z10 = true;
        this.f17257l = true;
        paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        v7.g.e(fontMetricsInt2, "paint.fontMetricsInt");
        this.f17254i = fontMetricsInt2;
        if (a().descent <= a().ascent) {
            z10 = false;
        }
        if (z10) {
            this.f17255j = m0.b.C(0.0f);
            this.f17256k = m0.b.C(0.0f);
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = a().ascent;
                fontMetricsInt.descent = a().descent;
                fontMetricsInt.leading = a().leading;
                if (fontMetricsInt.ascent > (-b())) {
                    fontMetricsInt.ascent = -b();
                }
                fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
            }
            return c();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
    }
}
