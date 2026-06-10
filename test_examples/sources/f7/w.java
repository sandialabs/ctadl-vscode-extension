package f7;

import android.text.TextPaint;
import android.text.style.URLSpan;

/* loaded from: classes.dex */
public final class w extends URLSpan {
    public w(String str) {
        super(str);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        v7.g.f(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
