package androidx.compose.ui.platform;

import android.view.View;

/* loaded from: classes.dex */
public final class q1 implements View.OnAttachStateChangeListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ja.u0 f3878i;

    public q1(ja.k1 k1Var) {
        this.f3878i = k1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        v7.g.f(view, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        v7.g.f(view, "v");
        view.removeOnAttachStateChangeListener(this);
        this.f3878i.c(null);
    }
}
