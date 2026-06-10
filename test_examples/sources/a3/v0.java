package a3;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<View> f217a;

    /* loaded from: classes.dex */
    public static class a {
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public v0(View view) {
        this.f217a = new WeakReference<>(view);
    }

    public final void a(float f10) {
        View view = this.f217a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = this.f217a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j2) {
        View view = this.f217a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    public final void d(w0 w0Var) {
        View view = this.f217a.get();
        if (view != null) {
            if (w0Var != null) {
                view.animate().setListener(new u0(w0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = this.f217a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
