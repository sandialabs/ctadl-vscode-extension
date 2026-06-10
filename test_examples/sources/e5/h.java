package e5;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final long f10659a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10660b;
    public final TimeInterpolator c;

    /* renamed from: d  reason: collision with root package name */
    public int f10661d;

    /* renamed from: e  reason: collision with root package name */
    public int f10662e;

    public h(long j2) {
        this.f10659a = 0L;
        this.f10660b = 300L;
        this.c = null;
        this.f10661d = 0;
        this.f10662e = 1;
        this.f10659a = j2;
        this.f10660b = 150L;
    }

    public h(long j2, long j10, TimeInterpolator timeInterpolator) {
        this.f10659a = 0L;
        this.f10660b = 300L;
        this.c = null;
        this.f10661d = 0;
        this.f10662e = 1;
        this.f10659a = j2;
        this.f10660b = j10;
        this.c = timeInterpolator;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f10659a);
        animator.setDuration(this.f10660b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f10661d);
            valueAnimator.setRepeatMode(this.f10662e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : a.f10648b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f10659a != hVar.f10659a || this.f10660b != hVar.f10660b || this.f10661d != hVar.f10661d || this.f10662e != hVar.f10662e) {
            return false;
        }
        return b().getClass().equals(hVar.b().getClass());
    }

    public final int hashCode() {
        long j2 = this.f10659a;
        long j10 = this.f10660b;
        return ((((b().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31) + this.f10661d) * 31) + this.f10662e;
    }

    public final String toString() {
        return "\n" + h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f10659a + " duration: " + this.f10660b + " interpolator: " + b().getClass() + " repeatCount: " + this.f10661d + " repeatMode: " + this.f10662e + "}\n";
    }
}
