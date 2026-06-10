package com.noto.app.folder;

import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import s6.c0;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements View.OnTouchListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f8715i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f8716j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f8717k;

    public /* synthetic */ n(Object obj, int i10, Object obj2) {
        this.f8715i = i10;
        this.f8716j = obj;
        this.f8717k = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Drawable background;
        int i10 = this.f8715i;
        Object obj = this.f8717k;
        Object obj2 = this.f8716j;
        switch (i10) {
            case 0:
            case 1:
                return FolderFragment$setupNotesAndLabels$1.c((s6.i) obj2, (FolderFragment) obj, view, motionEvent);
            default:
                GestureDetector gestureDetector = (GestureDetector) obj2;
                c0 c0Var = (c0) obj;
                v7.g.f(gestureDetector, "$gestureDetector");
                v7.g.f(c0Var, "$this_with");
                gestureDetector.onTouchEvent(motionEvent);
                int action = motionEvent.getAction();
                LinearLayout linearLayout = c0Var.f17315d;
                if (action == 0) {
                    Drawable background2 = linearLayout.getBackground();
                    if (background2 != null) {
                        background2.setState(new int[]{16842919, 16842910});
                        return false;
                    }
                    return false;
                }
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (background = linearLayout.getBackground()) != null) {
                    background.setState(new int[]{-16842919, -16842910});
                    return false;
                }
                return false;
        }
    }
}
