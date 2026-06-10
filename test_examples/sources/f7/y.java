package f7;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class y implements View.OnTouchListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ GestureDetector f10962i;

    public y(GestureDetector gestureDetector) {
        this.f10962i = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f10962i.onTouchEvent(motionEvent);
        return false;
    }
}
