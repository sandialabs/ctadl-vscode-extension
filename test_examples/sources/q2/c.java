package q2;

import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<z2.c<Rect, Rect>> f16874a = new ThreadLocal<>();

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(Paint paint, String str) {
            boolean hasGlyph;
            hasGlyph = paint.hasGlyph(str);
            return hasGlyph;
        }
    }
}
