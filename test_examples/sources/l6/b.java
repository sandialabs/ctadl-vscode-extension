package l6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f15812a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f15813b;

    public b(View view, float f10) {
        this.f15812a = view;
        this.f15813b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f15812a.setAlpha(this.f15813b);
    }
}
