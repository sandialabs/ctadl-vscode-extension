package o;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class d extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public static final double f16174a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f16175b = 0;

    public static float a(float f10, float f11, boolean z10) {
        float f12 = f10 * 1.5f;
        if (z10) {
            return (float) (((1.0d - f16174a) * f11) + f12);
        }
        return f12;
    }
}
