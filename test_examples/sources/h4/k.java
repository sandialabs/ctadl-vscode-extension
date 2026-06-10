package h4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p.b f11413a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f11414b;

    public k(j jVar, p.b bVar) {
        this.f11414b = jVar;
        this.f11413a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f11413a.remove(animator);
        this.f11414b.f11403u.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f11414b.f11403u.add(animator);
    }
}
