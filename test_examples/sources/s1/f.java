package s1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class f extends MetricAffectingSpan {

    /* renamed from: i  reason: collision with root package name */
    public final float f17241i;

    public f(float f10) {
        this.f17241i = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        v7.g.f(textPaint, "textPaint");
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            textPaint.setLetterSpacing(this.f17241i / textScaleX);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        boolean z10;
        v7.g.f(textPaint, "textPaint");
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            textPaint.setLetterSpacing(this.f17241i / textScaleX);
        }
    }
}
