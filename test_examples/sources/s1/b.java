package s1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: i  reason: collision with root package name */
    public final String f17238i;

    public b(String str) {
        this.f17238i = str;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        v7.g.f(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f17238i);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        v7.g.f(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f17238i);
    }
}
