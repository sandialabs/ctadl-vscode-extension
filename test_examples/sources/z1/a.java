package z1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import u0.f;
import v0.f0;
import v8.b;

/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: i  reason: collision with root package name */
    public final f0 f19110i;

    /* renamed from: j  reason: collision with root package name */
    public final float f19111j;

    /* renamed from: k  reason: collision with root package name */
    public f f19112k;

    public a(f0 f0Var, float f10) {
        this.f19110i = f0Var;
        this.f19111j = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            if (this.f19112k != null) {
                textPaint.setShader(this.f19110i.b());
            }
            b.F(textPaint, this.f19111j);
        }
    }
}
