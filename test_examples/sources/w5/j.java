package w5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f18414a;

    public j(l lVar) {
        this.f18414a = lVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        l lVar = this.f18414a;
        ArrayList arrayList = lVar.n;
        if (arrayList != null && !lVar.f18422o) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((i4.c) it.next()).b(lVar);
            }
        }
    }
}
