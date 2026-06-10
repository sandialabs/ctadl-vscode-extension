package p5;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: i  reason: collision with root package name */
    public final Dialog f16767i;

    /* renamed from: j  reason: collision with root package name */
    public final int f16768j;

    /* renamed from: k  reason: collision with root package name */
    public final int f16769k;

    /* renamed from: l  reason: collision with root package name */
    public final int f16770l;

    public a(Dialog dialog, Rect rect) {
        this.f16767i = dialog;
        this.f16768j = rect.left;
        this.f16769k = rect.top;
        this.f16770l = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f16768j;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f16769k;
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f16770l;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f16767i.onTouchEvent(obtain);
    }
}
