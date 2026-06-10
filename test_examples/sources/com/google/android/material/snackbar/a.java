package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f7335a;

    public a(BaseTransientBottomBar baseTransientBottomBar) {
        this.f7335a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7335a.f7302i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
