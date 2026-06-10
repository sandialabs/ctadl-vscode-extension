package a7;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import com.noto.app.util.CustomEditText;

/* loaded from: classes.dex */
public final class o extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s6.b0 f327a;

    public o(s6.b0 b0Var) {
        this.f327a = b0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        v7.g.f(motionEvent, "e");
        s6.b0 b0Var = this.f327a;
        b0Var.f17297d.requestFocus();
        CustomEditText customEditText = b0Var.f17297d;
        v7.g.e(customEditText, "etNoteBody");
        Object systemService = customEditText.getContext().getSystemService("input_method");
        v7.g.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(customEditText, 1);
        return super.onSingleTapUp(motionEvent);
    }
}
