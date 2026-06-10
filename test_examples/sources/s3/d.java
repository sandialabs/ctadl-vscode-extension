package s3;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f17269a;

    /* renamed from: b  reason: collision with root package name */
    public final float f17270b;

    public d(float[] fArr) {
        this.f17269a = fArr;
        this.f17270b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f17269a;
        int min = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f17270b;
        float f12 = fArr[min];
        return a4.b.f(fArr[min + 1], f12, (f10 - (min * f11)) / f11, f12);
    }
}
