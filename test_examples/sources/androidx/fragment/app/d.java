package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.l;

/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f5131a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f5132b;
    public final /* synthetic */ boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ SpecialEffectsController.Operation f5133d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ l.a f5134e;

    public d(ViewGroup viewGroup, View view, boolean z10, SpecialEffectsController.Operation operation, l.a aVar) {
        this.f5131a = viewGroup;
        this.f5132b = view;
        this.c = z10;
        this.f5133d = operation;
        this.f5134e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f5131a;
        View view = this.f5132b;
        viewGroup.endViewTransition(view);
        if (this.c) {
            this.f5133d.f5077a.a(view);
        }
        this.f5134e.a();
    }
}
