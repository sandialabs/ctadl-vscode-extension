package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f7336a;

    public b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f7336a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BaseTransientBottomBar baseTransientBottomBar = this.f7336a;
        baseTransientBottomBar.f7302i.setScaleX(floatValue);
        baseTransientBottomBar.f7302i.setScaleY(floatValue);
    }
}
