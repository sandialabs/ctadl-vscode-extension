package x5;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

/* loaded from: classes.dex */
public final class f {
    public static Typeface a(Configuration configuration, Typeface typeface) {
        int i10;
        int i11;
        int weight;
        int i12;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = configuration.fontWeightAdjustment;
            if (i10 != Integer.MAX_VALUE) {
                i11 = configuration.fontWeightAdjustment;
                if (i11 == 0 || typeface == null) {
                    return null;
                }
                weight = typeface.getWeight();
                i12 = configuration.fontWeightAdjustment;
                create = Typeface.create(typeface, v8.b.n(i12 + weight, 1, 1000), typeface.isItalic());
                return create;
            }
            return null;
        }
        return null;
    }
}
