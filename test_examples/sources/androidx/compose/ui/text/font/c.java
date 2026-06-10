package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.ArrayList;
import ma.i;
import u1.l;
import v7.g;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<Paint> f4128a = new ThreadLocal<>();

    public static Typeface a(Typeface typeface, l lVar, Context context) {
        g.f(lVar, "variationSettings");
        if (typeface == null) {
            return null;
        }
        ArrayList arrayList = lVar.f17750a;
        if (arrayList.isEmpty()) {
            return typeface;
        }
        ThreadLocal<Paint> threadLocal = f4128a;
        Paint paint = threadLocal.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(m0.b.W(arrayList, null, new TypefaceCompatApi26$toAndroidString$1(i.c(context)), 31));
        return paint.getTypeface();
    }
}
