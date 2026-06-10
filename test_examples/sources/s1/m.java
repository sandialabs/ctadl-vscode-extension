package s1;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class m extends MetricAffectingSpan {

    /* renamed from: i  reason: collision with root package name */
    public final Typeface f17264i;

    public m(Typeface typeface) {
        v7.g.f(typeface, "typeface");
        this.f17264i = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        v7.g.f(textPaint, "ds");
        textPaint.setTypeface(this.f17264i);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        v7.g.f(textPaint, "paint");
        textPaint.setTypeface(this.f17264i);
    }
}
