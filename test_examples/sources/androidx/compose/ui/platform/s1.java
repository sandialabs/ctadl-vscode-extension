package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;

/* loaded from: classes.dex */
public final class s1 implements View.OnAttachStateChangeListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ View f3903i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Recomposer f3904j;

    public s1(View view, Recomposer recomposer) {
        this.f3903i = view;
        this.f3904j = recomposer;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        v7.g.f(view, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        v7.g.f(view, "v");
        this.f3903i.removeOnAttachStateChangeListener(this);
        this.f3904j.w();
    }
}
