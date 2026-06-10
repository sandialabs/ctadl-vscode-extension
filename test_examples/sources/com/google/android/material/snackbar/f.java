package com.google.android.material.snackbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f7340i;

    public f(BaseTransientBottomBar baseTransientBottomBar) {
        this.f7340i = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BaseTransientBottomBar baseTransientBottomBar = this.f7340i;
        BaseTransientBottomBar.f fVar = baseTransientBottomBar.f7302i;
        if (fVar == null) {
            return;
        }
        ViewParent parent = fVar.getParent();
        BaseTransientBottomBar.f fVar2 = baseTransientBottomBar.f7302i;
        if (parent != null) {
            fVar2.setVisibility(0);
        }
        if (fVar2.getAnimationMode() == 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(baseTransientBottomBar.f7297d);
            ofFloat.addUpdateListener(new a(baseTransientBottomBar));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
            ofFloat2.setInterpolator(baseTransientBottomBar.f7299f);
            ofFloat2.addUpdateListener(new b(baseTransientBottomBar));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setDuration(baseTransientBottomBar.f7295a);
            animatorSet.addListener(new e6.g(baseTransientBottomBar));
            animatorSet.start();
            return;
        }
        int height = fVar2.getHeight();
        ViewGroup.LayoutParams layoutParams = fVar2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        fVar2.setTranslationY(height);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height, 0);
        valueAnimator.setInterpolator(baseTransientBottomBar.f7298e);
        valueAnimator.setDuration(baseTransientBottomBar.c);
        valueAnimator.addListener(new e6.b(baseTransientBottomBar));
        valueAnimator.addUpdateListener(new c(baseTransientBottomBar, height));
        valueAnimator.start();
    }
}
