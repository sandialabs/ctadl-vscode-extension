package a3;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class a0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: i  reason: collision with root package name */
    public final View f111i;

    /* renamed from: j  reason: collision with root package name */
    public ViewTreeObserver f112j;

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f113k;

    public a0(View view, Runnable runnable) {
        this.f111i = view;
        this.f112j = view.getViewTreeObserver();
        this.f113k = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        a0 a0Var = new a0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(a0Var);
        view.addOnAttachStateChangeListener(a0Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver;
        boolean isAlive = this.f112j.isAlive();
        View view = this.f111i;
        if (isAlive) {
            viewTreeObserver = this.f112j;
        } else {
            viewTreeObserver = view.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
        this.f113k.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f112j = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f112j.isAlive();
        View view2 = this.f111i;
        (isAlive ? this.f112j : view2.getViewTreeObserver()).removeOnPreDrawListener(this);
        view2.removeOnAttachStateChangeListener(this);
    }
}
