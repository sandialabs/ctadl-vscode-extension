package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class k extends ReplacementSpan {

    /* renamed from: j  reason: collision with root package name */
    public final i f5012j;

    /* renamed from: i  reason: collision with root package name */
    public final Paint.FontMetricsInt f5011i = new Paint.FontMetricsInt();

    /* renamed from: k  reason: collision with root package name */
    public float f5013k = 1.0f;

    public k(i iVar) {
        if (iVar != null) {
            this.f5012j = iVar;
            return;
        }
        throw new NullPointerException("metadata cannot be null");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        short s10;
        Paint.FontMetricsInt fontMetricsInt2 = this.f5011i;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        i iVar = this.f5012j;
        p3.a c = iVar.c();
        int a10 = c.a(14);
        short s11 = 0;
        if (a10 != 0) {
            s10 = c.f16751b.getShort(a10 + c.f16750a);
        } else {
            s10 = 0;
        }
        this.f5013k = abs / s10;
        p3.a c10 = iVar.c();
        int a11 = c10.a(14);
        if (a11 != 0) {
            c10.f16751b.getShort(a11 + c10.f16750a);
        }
        p3.a c11 = iVar.c();
        int a12 = c11.a(12);
        if (a12 != 0) {
            s11 = c11.f16751b.getShort(a12 + c11.f16750a);
        }
        short s12 = (short) (s11 * this.f5013k);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s12;
    }
}
