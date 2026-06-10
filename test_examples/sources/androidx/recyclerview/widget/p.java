package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.n;

/* loaded from: classes.dex */
public final class p implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n.f f5979a;

    public p(n.f fVar) {
        this.f5979a = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5979a.f5975m = valueAnimator.getAnimatedFraction();
    }
}
