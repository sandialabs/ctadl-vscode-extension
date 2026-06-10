package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.b0 f5854a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f5855b;
    public final /* synthetic */ ViewPropertyAnimator c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f5856d;

    public g(View view, ViewPropertyAnimator viewPropertyAnimator, e eVar, RecyclerView.b0 b0Var) {
        this.f5856d = eVar;
        this.f5854a = b0Var;
        this.f5855b = view;
        this.c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f5855b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.setListener(null);
        e eVar = this.f5856d;
        RecyclerView.b0 b0Var = this.f5854a;
        eVar.h(b0Var);
        eVar.f5822o.remove(b0Var);
        eVar.s();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f5856d.getClass();
    }
}
