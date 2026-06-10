package v0;

import android.graphics.Canvas;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f18128a = new q();

    public final void a(Canvas canvas, boolean z10) {
        v7.g.f(canvas, "canvas");
        if (z10) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
