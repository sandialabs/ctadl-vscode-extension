package h4;

import a3.j0;
import a3.v0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d extends a0 {

    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f11380a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f11381b = false;

        public a(View view) {
            this.f11380a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            v vVar = t.f11432a;
            View view = this.f11380a;
            vVar.a2(view, 1.0f);
            if (this.f11381b) {
                view.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            View view = this.f11380a;
            if (j0.d.h(view) && view.getLayerType() == 0) {
                this.f11381b = true;
                view.setLayerType(2, null);
            }
        }
    }

    public d() {
    }

    public d(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.F = i10;
    }

    @Override // h4.a0
    public final Animator L(ViewGroup viewGroup, View view, q qVar) {
        float f10;
        Float f11;
        float f12 = 0.0f;
        if (qVar != null && (f11 = (Float) qVar.f11426a.get("android:fade:transitionAlpha")) != null) {
            f10 = f11.floatValue();
        } else {
            f10 = 0.0f;
        }
        if (f10 != 1.0f) {
            f12 = f10;
        }
        return N(view, f12, 1.0f);
    }

    @Override // h4.a0
    public final Animator M(ViewGroup viewGroup, View view, q qVar) {
        float f10;
        Float f11;
        t.f11432a.getClass();
        if (qVar != null && (f11 = (Float) qVar.f11426a.get("android:fade:transitionAlpha")) != null) {
            f10 = f11.floatValue();
        } else {
            f10 = 1.0f;
        }
        return N(view, f10, 0.0f);
    }

    public final ObjectAnimator N(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        t.f11432a.a2(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, t.f11433b, f11);
        ofFloat.addListener(new a(view));
        a(new c(view));
        return ofFloat;
    }

    @Override // h4.a0, h4.j
    public final void i(q qVar) {
        J(qVar);
        qVar.f11426a.put("android:fade:transitionAlpha", Float.valueOf(t.f11432a.Z1(qVar.f11427b)));
    }
}
