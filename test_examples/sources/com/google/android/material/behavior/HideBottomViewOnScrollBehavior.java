package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.noto.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet<b> f6821a;

    /* renamed from: b  reason: collision with root package name */
    public int f6822b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f6823d;

    /* renamed from: e  reason: collision with root package name */
    public TimeInterpolator f6824e;

    /* renamed from: f  reason: collision with root package name */
    public int f6825f;

    /* renamed from: g  reason: collision with root package name */
    public int f6826g;

    /* renamed from: h  reason: collision with root package name */
    public int f6827h;

    /* renamed from: i  reason: collision with root package name */
    public ViewPropertyAnimator f6828i;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f6828i = null;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    public HideBottomViewOnScrollBehavior() {
        this.f6821a = new LinkedHashSet<>();
        this.f6825f = 0;
        this.f6826g = 2;
        this.f6827h = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6821a = new LinkedHashSet<>();
        this.f6825f = 0;
        this.f6826g = 2;
        this.f6827h = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, V v3, int i10) {
        this.f6825f = v3.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v3.getLayoutParams()).bottomMargin;
        this.f6822b = v5.a.c(v3.getContext(), R.attr.motionDurationLong2, 225);
        this.c = v5.a.c(v3.getContext(), R.attr.motionDurationMedium4, 175);
        this.f6823d = v5.a.d(v3.getContext(), R.attr.motionEasingEmphasizedInterpolator, e5.a.f10649d);
        this.f6824e = v5.a.d(v3.getContext(), R.attr.motionEasingEmphasizedInterpolator, e5.a.c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int[] iArr) {
        if (i10 > 0) {
            t(view);
        } else if (i10 < 0) {
            u(view);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v3, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public final void s(V v3, int i10, long j2, TimeInterpolator timeInterpolator) {
        this.f6828i = v3.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j2).setListener(new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(View view) {
        boolean z10;
        if (this.f6826g == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f6828i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f6826g = 1;
        Iterator<b> it = this.f6821a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        s(view, this.f6825f + this.f6827h, this.c, this.f6824e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(View view) {
        boolean z10;
        if (this.f6826g == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f6828i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f6826g = 2;
        Iterator<b> it = this.f6821a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        s(view, 0, this.f6822b, this.f6823d);
    }
}
