package d6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewOverlay;
import java.util.Iterator;
import u5.n;

/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f10436a;

    public d(c cVar) {
        this.f10436a = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        c cVar = this.f10436a;
        j0.c d5 = n.d(cVar);
        Iterator it = cVar.f10418s.iterator();
        while (it.hasNext()) {
            ((ViewOverlay) d5.f12625b).remove((j6.a) it.next());
        }
    }
}
