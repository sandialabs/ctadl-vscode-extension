package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class p extends k {
    public p(i iVar) {
        super(iVar);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        f.a().getClass();
        i iVar = this.f5012j;
        n nVar = iVar.f5003b;
        Typeface typeface = nVar.f5025d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        int i15 = iVar.f5002a * 2;
        canvas.drawText(nVar.f5024b, i15, 2, f10, i13, paint);
        paint.setTypeface(typeface2);
    }
}
