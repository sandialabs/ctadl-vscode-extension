package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f7401a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f7402b;
    public final /* synthetic */ TabLayout.e c;

    public b(TabLayout.e eVar, View view, View view2) {
        this.c = eVar;
        this.f7401a = view;
        this.f7402b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.c(this.f7401a, this.f7402b, valueAnimator.getAnimatedFraction());
    }
}
