package i5;

import android.animation.ValueAnimator;
import b6.g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f11810a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f11810a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g gVar = this.f11810a.f6891i;
        if (gVar != null) {
            gVar.o(floatValue);
        }
    }
}
