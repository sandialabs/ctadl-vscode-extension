package l6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f15828a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f15829b;

    public n(View view, float f10) {
        this.f15828a = view;
        this.f15829b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f15828a.setTranslationY(this.f15829b);
    }
}
