package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f7523a;

    public a(View view) {
        this.f7523a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7523a.invalidate();
    }
}
