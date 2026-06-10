package com.google.android.material.timepicker;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import b3.g;
import com.noto.R;

/* loaded from: classes.dex */
public final class b extends a3.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f7498d;

    public b(ClockFaceView clockFaceView) {
        this.f7498d = clockFaceView;
    }

    @Override // a3.a
    public final void d(View view, g gVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f108a;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f6357a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            TextView textView = this.f7498d.F.get(intValue - 1);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(textView);
            }
        }
        gVar.k(g.c.a(0, 1, intValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        gVar.b(g.a.f6359e);
    }

    @Override // a3.a
    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = this.f7498d;
            view.getHitRect(clockFaceView.C);
            float centerX = clockFaceView.C.centerX();
            float centerY = clockFaceView.C.centerY();
            clockFaceView.B.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockFaceView.B.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.g(view, i10, bundle);
    }
}
