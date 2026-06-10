package j7;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import j7.a;
import v7.g;

/* loaded from: classes.dex */
public final class d extends a.C0137a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f12739a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.b0 f12740b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f12741d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f12742e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f12743f;

    public d(a aVar, RecyclerView.b0 b0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f12739a = aVar;
        this.f12740b = b0Var;
        this.c = i10;
        this.f12741d = view;
        this.f12742e = i11;
        this.f12743f = viewPropertyAnimator;
    }

    @Override // j7.a.C0137a, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        g.f(animator, "animator");
        int i10 = this.c;
        View view = this.f12741d;
        if (i10 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f12742e != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g.f(animator, "animator");
        this.f12743f.setListener(null);
        a aVar = this.f12739a;
        RecyclerView.b0 b0Var = this.f12740b;
        aVar.h(b0Var);
        aVar.f12711p.remove(b0Var);
        aVar.s();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        g.f(animator, "animator");
        this.f12739a.getClass();
    }
}
