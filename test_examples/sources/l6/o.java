package l6;

import a3.j0;
import a3.v0;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;
import com.noto.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o implements q {

    /* renamed from: a  reason: collision with root package name */
    public final int f15830a;

    public o(int i10) {
        this.f15830a = i10;
    }

    public static ObjectAnimator c(View view, float f10, float f11, float f12) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f10, f11));
        ofPropertyValuesHolder.addListener(new m(view, f12));
        return ofPropertyValuesHolder;
    }

    public static ObjectAnimator d(View view, float f10, float f11, float f12) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f10, f11));
        ofPropertyValuesHolder.addListener(new n(view, f12));
        return ofPropertyValuesHolder;
    }

    @Override // l6.q
    public final Animator a(ViewGroup viewGroup, View view) {
        float f10;
        float f11;
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int i10 = this.f15830a;
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 48) {
                    if (i10 != 80) {
                        boolean z10 = false;
                        if (i10 != 8388611) {
                            if (i10 == 8388613) {
                                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                                if (j0.e.d(viewGroup) == 1) {
                                    z10 = true;
                                }
                                if (z10) {
                                }
                            } else {
                                throw new IllegalArgumentException(androidx.activity.e.g("Invalid slide direction: ", i10));
                            }
                        } else {
                            WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                            if (j0.e.d(viewGroup) == 1) {
                                z10 = true;
                            }
                            if (z10) {
                            }
                        }
                        return c(view, f10, translationX, translationX);
                    }
                    f11 = dimensionPixelSize + translationY;
                } else {
                    f11 = translationY - dimensionPixelSize;
                }
                return d(view, f11, translationY, translationY);
            }
            f10 = translationX - dimensionPixelSize;
            return c(view, f10, translationX, translationX);
        }
        f10 = dimensionPixelSize + translationX;
        return c(view, f10, translationX, translationX);
    }

    @Override // l6.q
    public final Animator b(ViewGroup viewGroup, View view) {
        float f10;
        float f11;
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int i10 = this.f15830a;
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 48) {
                    if (i10 != 80) {
                        boolean z10 = false;
                        if (i10 != 8388611) {
                            if (i10 == 8388613) {
                                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                                if (j0.e.d(viewGroup) == 1) {
                                    z10 = true;
                                }
                                if (z10) {
                                }
                            } else {
                                throw new IllegalArgumentException(androidx.activity.e.g("Invalid slide direction: ", i10));
                            }
                        } else {
                            WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                            if (j0.e.d(viewGroup) == 1) {
                                z10 = true;
                            }
                            if (z10) {
                            }
                        }
                        return c(view, translationX, f10, translationX);
                    }
                    f11 = translationY - dimensionPixelSize;
                } else {
                    f11 = dimensionPixelSize + translationY;
                }
                return d(view, translationY, f11, translationY);
            }
            f10 = dimensionPixelSize + translationX;
            return c(view, translationX, f10, translationX);
        }
        f10 = translationX - dimensionPixelSize;
        return c(view, translationX, f10, translationX);
    }
}
