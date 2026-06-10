package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f7497i;

    public a(ClockFaceView clockFaceView) {
        this.f7497i = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f7497i;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.B.f7485l) - clockFaceView.J;
        if (height != clockFaceView.f7500z) {
            clockFaceView.f7500z = height;
            clockFaceView.k();
            int i10 = clockFaceView.f7500z;
            ClockHandView clockHandView = clockFaceView.B;
            clockHandView.f7492t = i10;
            clockHandView.invalidate();
        }
        return true;
    }
}
