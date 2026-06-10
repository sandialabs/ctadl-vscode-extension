package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.b0 f5862a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f5863b;
    public final /* synthetic */ View c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5864d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f5865e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f5866f;

    public h(e eVar, RecyclerView.b0 b0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f5866f = eVar;
        this.f5862a = b0Var;
        this.f5863b = i10;
        this.c = view;
        this.f5864d = i11;
        this.f5865e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f5863b;
        View view = this.c;
        if (i10 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f5864d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f5865e.setListener(null);
        e eVar = this.f5866f;
        RecyclerView.b0 b0Var = this.f5862a;
        eVar.h(b0Var);
        eVar.f5823p.remove(b0Var);
        eVar.s();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f5866f.getClass();
    }
}
