package l6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f15819a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f15820b;

    public e(View view, float f10) {
        this.f15819a = view;
        this.f15820b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f15819a.setAlpha(this.f15820b);
    }
}
