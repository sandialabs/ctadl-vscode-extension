package l6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f15821a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f15822b;
    public final /* synthetic */ float c;

    public k(View view, float f10, float f11) {
        this.f15821a = view;
        this.f15822b = f10;
        this.c = f11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f10 = this.f15822b;
        View view = this.f15821a;
        view.setScaleX(f10);
        view.setScaleY(this.c);
    }
}
