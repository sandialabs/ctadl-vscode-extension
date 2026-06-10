package e5;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f10647a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final s3.b f10648b = new s3.b();
    public static final s3.a c = new s3.a();

    /* renamed from: d  reason: collision with root package name */
    public static final s3.c f10649d = new s3.c();

    /* renamed from: e  reason: collision with root package name */
    public static final DecelerateInterpolator f10650e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12, float f13, float f14) {
        return f14 <= f12 ? f10 : f14 >= f13 ? f11 : a4.b.f(f11, f10, (f14 - f12) / (f13 - f12), f10);
    }

    public static int b(float f10, int i10, int i11) {
        return Math.round(f10 * (i11 - i10)) + i10;
    }
}
