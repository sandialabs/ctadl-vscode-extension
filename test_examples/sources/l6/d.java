package l6;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f15815a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f15816b;
    public final /* synthetic */ float c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ float f15817d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ float f15818e;

    public d(View view, float f10, float f11, float f12, float f13) {
        this.f15815a = view;
        this.f15816b = f10;
        this.c = f11;
        this.f15817d = f12;
        this.f15818e = f13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i10 = p.f15831a;
        float f10 = this.f15817d;
        float f11 = this.f15816b;
        if (floatValue >= f10) {
            float f12 = this.f15818e;
            float f13 = this.c;
            if (floatValue > f12) {
                f11 = f13;
            } else {
                f11 = a4.b.f(f13, f11, (floatValue - f10) / (f12 - f10), f11);
            }
        }
        this.f15815a.setAlpha(f11);
    }
}
