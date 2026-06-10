package u5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f17812a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public ValueAnimator f17813b = null;
    public final a c = new a();

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            g gVar = g.this;
            if (gVar.f17813b == animator) {
                gVar.f17813b = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public b(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.c);
        this.f17812a.add(bVar);
    }
}
