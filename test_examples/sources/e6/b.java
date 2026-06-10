package e6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f10664a;

    public b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f10664a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10664a.e();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f10664a;
        h hVar = baseTransientBottomBar.f7303j;
        int i10 = baseTransientBottomBar.c;
        int i11 = baseTransientBottomBar.f7295a;
        int i12 = i10 - i11;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) hVar;
        snackbarContentLayout.f7331i.setAlpha(0.0f);
        long j2 = i11;
        ViewPropertyAnimator duration = snackbarContentLayout.f7331i.animate().alpha(1.0f).setDuration(j2);
        TimeInterpolator timeInterpolator = snackbarContentLayout.f7333k;
        long j10 = i12;
        duration.setInterpolator(timeInterpolator).setStartDelay(j10).start();
        if (snackbarContentLayout.f7332j.getVisibility() == 0) {
            snackbarContentLayout.f7332j.setAlpha(0.0f);
            snackbarContentLayout.f7332j.animate().alpha(1.0f).setDuration(j2).setInterpolator(timeInterpolator).setStartDelay(j10).start();
        }
    }
}
