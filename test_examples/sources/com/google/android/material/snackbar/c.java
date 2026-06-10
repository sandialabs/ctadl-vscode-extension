package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f7337a;

    public c(BaseTransientBottomBar baseTransientBottomBar, int i10) {
        this.f7337a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        s3.b bVar = BaseTransientBottomBar.f7290v;
        this.f7337a.f7302i.setTranslationY(intValue);
    }
}
