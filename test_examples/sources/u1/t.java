package u1;

import android.content.Context;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final t f17766a = new t();

    public final Typeface a(Context context, s sVar) {
        Typeface font;
        v7.g.f(context, "context");
        v7.g.f(sVar, "font");
        font = context.getResources().getFont(sVar.f17762a);
        v7.g.e(font, "context.resources.getFont(font.resId)");
        return font;
    }
}
