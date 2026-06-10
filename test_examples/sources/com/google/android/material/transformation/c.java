package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import n5.d;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f7526a;

    public c(d dVar) {
        this.f7526a = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f7526a;
        d.C0192d revealInfo = dVar.getRevealInfo();
        revealInfo.c = Float.MAX_VALUE;
        dVar.setRevealInfo(revealInfo);
    }
}
