package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;

/* loaded from: classes.dex */
public final class k1 extends j0 {
    public k1(Context context) {
        super(context);
    }

    @Override // androidx.compose.ui.platform.j0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        v7.g.f(canvas, "canvas");
    }

    public final void dispatchGetDisplayList() {
    }
}
