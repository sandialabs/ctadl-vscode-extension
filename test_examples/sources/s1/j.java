package s1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    public final int f17258a;

    /* renamed from: b  reason: collision with root package name */
    public final float f17259b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f17260d;

    public j(int i10, float f10, float f11, float f12) {
        this.f17258a = i10;
        this.f17259b = f10;
        this.c = f11;
        this.f17260d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        v7.g.f(textPaint, "tp");
        textPaint.setShadowLayer(this.f17260d, this.f17259b, this.c, this.f17258a);
    }
}
