package e6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f10665a;

    public c(BaseTransientBottomBar baseTransientBottomBar, int i10) {
        this.f10665a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10665a.d();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f10665a;
        h hVar = baseTransientBottomBar.f7303j;
        int i10 = baseTransientBottomBar.f7296b;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) hVar;
        snackbarContentLayout.f7331i.setAlpha(1.0f);
        long j2 = i10;
        ViewPropertyAnimator duration = snackbarContentLayout.f7331i.animate().alpha(0.0f).setDuration(j2);
        TimeInterpolator timeInterpolator = snackbarContentLayout.f7333k;
        long j10 = 0;
        duration.setInterpolator(timeInterpolator).setStartDelay(j10).start();
        if (snackbarContentLayout.f7332j.getVisibility() == 0) {
            snackbarContentLayout.f7332j.setAlpha(1.0f);
            snackbarContentLayout.f7332j.animate().alpha(0.0f).setDuration(j2).setInterpolator(timeInterpolator).setStartDelay(j10).start();
        }
    }
}
