package s1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class e extends MetricAffectingSpan {

    /* renamed from: i  reason: collision with root package name */
    public final float f17240i;

    public e(float f10) {
        this.f17240i = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        v7.g.f(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f17240i);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        v7.g.f(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f17240i);
    }
}
