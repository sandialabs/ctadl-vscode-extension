package w5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f18392a;

    public f(g gVar) {
        this.f18392a = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        g gVar = this.f18392a;
        gVar.c();
        i4.c cVar = gVar.f18404k;
        if (cVar != null) {
            cVar.a((n) gVar.f12607a);
        }
    }
}
