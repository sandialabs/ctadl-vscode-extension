package l6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class m extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f15826a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f15827b;

    public m(View view, float f10) {
        this.f15826a = view;
        this.f15827b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f15826a.setTranslationX(this.f15827b);
    }
}
