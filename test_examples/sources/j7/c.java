package j7;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import j7.a;
import java.util.ArrayList;
import v7.g;

/* loaded from: classes.dex */
public final class c extends a.C0137a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f12736a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a.b f12737b;
    public final /* synthetic */ ViewPropertyAnimator c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f12738d;

    public c(a aVar, a.b bVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f12736a = aVar;
        this.f12737b = bVar;
        this.c = viewPropertyAnimator;
        this.f12738d = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g.f(animator, "animator");
        this.c.setListener(null);
        View view = this.f12738d;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        a.b bVar = this.f12737b;
        RecyclerView.b0 b0Var = bVar.f12715b;
        a aVar = this.f12736a;
        aVar.h(b0Var);
        RecyclerView.b0 b0Var2 = bVar.f12715b;
        if (b0Var2 != null) {
            ArrayList<RecyclerView.b0> arrayList = aVar.f12713r;
            g.c(b0Var2);
            arrayList.remove(b0Var2);
        }
        aVar.s();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        g.f(animator, "animator");
        RecyclerView.b0 b0Var = this.f12737b.f12715b;
        this.f12736a.getClass();
    }
}
