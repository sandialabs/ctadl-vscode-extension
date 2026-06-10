package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f7149a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.g f7150b;
    public final /* synthetic */ d c;

    public c(d dVar, boolean z10, a aVar) {
        this.c = dVar;
        this.f7149a = z10;
        this.f7150b = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.c;
        dVar.f7166r = 0;
        dVar.f7161l = null;
        d.g gVar = this.f7150b;
        if (gVar != null) {
            ((a) gVar).f7144a.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        d dVar = this.c;
        dVar.f7170v.b(0, this.f7149a);
        dVar.f7166r = 2;
        dVar.f7161l = animator;
    }
}
