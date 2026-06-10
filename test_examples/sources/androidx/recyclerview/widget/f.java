package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.b0 f5845a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f5846b;
    public final /* synthetic */ View c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f5847d;

    public f(View view, ViewPropertyAnimator viewPropertyAnimator, e eVar, RecyclerView.b0 b0Var) {
        this.f5847d = eVar;
        this.f5845a = b0Var;
        this.f5846b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f5846b.setListener(null);
        this.c.setAlpha(1.0f);
        e eVar = this.f5847d;
        RecyclerView.b0 b0Var = this.f5845a;
        eVar.h(b0Var);
        eVar.f5824q.remove(b0Var);
        eVar.s();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f5847d.getClass();
    }
}
