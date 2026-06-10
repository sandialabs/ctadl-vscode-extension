package s1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class l extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17262a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f17263b;

    public l(boolean z10, boolean z11) {
        this.f17262a = z10;
        this.f17263b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        v7.g.f(textPaint, "textPaint");
        textPaint.setUnderlineText(this.f17262a);
        textPaint.setStrikeThruText(this.f17263b);
    }
}
