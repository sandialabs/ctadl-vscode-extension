package l6;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class c implements q {

    /* renamed from: a  reason: collision with root package name */
    public float f15814a = 1.0f;

    public static ValueAnimator c(View view, float f10, float f11, float f12, float f13) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(view, f10, f11, f12));
        ofFloat.addListener(new b(view, f13));
        return ofFloat;
    }

    @Override // l6.q
    public final Animator a(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, this.f15814a, alpha);
    }

    @Override // l6.q
    public final Animator b(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, alpha, 0.0f, 1.0f, alpha);
    }
}
