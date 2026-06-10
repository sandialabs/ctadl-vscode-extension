package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7146a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f7147b;
    public final /* synthetic */ d.g c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f7148d;

    public b(d dVar, boolean z10, a aVar) {
        this.f7148d = dVar;
        this.f7147b = z10;
        this.c = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7146a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        d dVar = this.f7148d;
        dVar.f7166r = 0;
        dVar.f7161l = null;
        if (!this.f7146a) {
            boolean z10 = this.f7147b;
            if (z10) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            dVar.f7170v.b(i10, z10);
            d.g gVar = this.c;
            if (gVar != null) {
                a aVar = (a) gVar;
                aVar.f7144a.a(aVar.f7145b);
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        d dVar = this.f7148d;
        dVar.f7170v.b(0, this.f7147b);
        dVar.f7166r = 1;
        dVar.f7161l = animator;
        this.f7146a = false;
    }
}
