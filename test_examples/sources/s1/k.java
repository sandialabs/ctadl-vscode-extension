package s1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class k extends MetricAffectingSpan {

    /* renamed from: i  reason: collision with root package name */
    public final float f17261i;

    public k(float f10) {
        this.f17261i = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        v7.g.f(textPaint, "textPaint");
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f17261i);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        v7.g.f(textPaint, "textPaint");
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f17261i);
    }
}
