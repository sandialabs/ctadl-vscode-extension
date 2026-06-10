package i4;

import android.animation.TypeEvaluator;

/* loaded from: classes.dex */
public final class g implements TypeEvaluator {

    /* renamed from: a  reason: collision with root package name */
    public static final g f11750a = new g();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f11 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float f12 = a4.b.f(((intValue2 >> 24) & 255) / 255.0f, f11, f10, f11);
        float f13 = a4.b.f(pow4, pow, f10, pow);
        float f14 = a4.b.f((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d), pow2, f10, pow2);
        float f15 = a4.b.f((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d), pow3, f10, pow3);
        int round = Math.round(((float) Math.pow(f13, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow(f15, 0.45454545454545453d)) * 255.0f) | round | (Math.round(f12 * 255.0f) << 24) | (Math.round(((float) Math.pow(f14, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
