package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.f;

/* loaded from: classes.dex */
public final class d implements f.d {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f4977b = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f4978a;

    public d() {
        TextPaint textPaint = new TextPaint();
        this.f4978a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
