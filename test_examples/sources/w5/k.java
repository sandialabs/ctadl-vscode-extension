package w5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f18415a;

    public k(l lVar) {
        this.f18415a = lVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        l lVar = this.f18415a;
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        ArrayList arrayList = lVar.n;
        if (arrayList != null && !lVar.f18422o) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((i4.c) it.next()).a(lVar);
            }
        }
    }
}
