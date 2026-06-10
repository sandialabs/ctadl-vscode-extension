package g1;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f11150a = new h();

    public final long a(MotionEvent motionEvent, int i10) {
        float rawX;
        float rawY;
        v7.g.f(motionEvent, "motionEvent");
        rawX = motionEvent.getRawX(i10);
        rawY = motionEvent.getRawY(i10);
        return a1.c.s(rawX, rawY);
    }
}
