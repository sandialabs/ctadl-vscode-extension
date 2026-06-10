package l6;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class l implements q {
    public final boolean c;

    /* renamed from: a  reason: collision with root package name */
    public float f15823a = 1.1f;

    /* renamed from: b  reason: collision with root package name */
    public float f15824b = 0.8f;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15825d = true;

    public l(boolean z10) {
        this.c = z10;
    }

    public static ObjectAnimator c(View view, float f10, float f11) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.SCALE_X, scaleX * f10, scaleX * f11), PropertyValuesHolder.ofFloat(View.SCALE_Y, f10 * scaleY, f11 * scaleY));
        ofPropertyValuesHolder.addListener(new k(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @Override // l6.q
    public final Animator a(ViewGroup viewGroup, View view) {
        return c(view, this.c ? this.f15824b : this.f15823a, 1.0f);
    }

    @Override // l6.q
    public final Animator b(ViewGroup viewGroup, View view) {
        if (this.f15825d) {
            return c(view, 1.0f, this.c ? this.f15823a : this.f15824b);
        }
        return null;
    }
}
