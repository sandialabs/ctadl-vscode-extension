package a7;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.navigation.NavController;
import com.noto.app.note.NoteFragment;
import com.noto.app.util.ViewUtilsKt;

/* loaded from: classes.dex */
public final class l extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NoteFragment f314a;

    public l(NoteFragment noteFragment) {
        this.f314a = noteFragment;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        v7.g.f(motionEvent, "e1");
        v7.g.f(motionEvent2, "e2");
        if (Math.abs(motionEvent2.getY() - motionEvent.getY()) <= 100.0f) {
            return false;
        }
        NavController g10 = ViewUtilsKt.g(this.f314a);
        if (g10 != null) {
            ViewUtilsKt.o(g10, new v(false), null);
        }
        return true;
    }
}
