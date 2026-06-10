package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* loaded from: classes.dex */
public final class f implements View.OnTouchListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ GestureDetector f7503i;

    public f(GestureDetector gestureDetector) {
        this.f7503i = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f7503i.onTouchEvent(motionEvent);
        }
        return false;
    }
}
