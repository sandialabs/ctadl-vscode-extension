package u5;

import a3.j0;
import a3.v0;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        j0.h.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
