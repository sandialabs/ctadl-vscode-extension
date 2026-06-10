package a7;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.noto.app.note.NoteFragment;

/* loaded from: classes.dex */
public final class n extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NoteFragment f324a;

    public n(NoteFragment noteFragment) {
        this.f324a = noteFragment;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        v7.g.f(motionEvent, "e1");
        v7.g.f(motionEvent2, "e2");
        float x3 = motionEvent.getX();
        float x10 = motionEvent2.getX();
        if (Math.abs(x10 - x3) > 0.0f) {
            NoteFragment noteFragment = this.f324a;
            if (x10 > x3) {
                int i10 = NoteFragment.f9026f0;
                noteFragment.b0().k();
            } else {
                int i11 = NoteFragment.f9026f0;
                noteFragment.b0().p();
            }
            return true;
        }
        return false;
    }
}
