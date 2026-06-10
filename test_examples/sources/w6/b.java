package w6;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.navigation.NavController;
import com.noto.app.filtered.FilteredFragment;
import com.noto.app.util.ViewUtilsKt;

/* loaded from: classes.dex */
public final class b extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FilteredFragment f18432a;

    public b(FilteredFragment filteredFragment) {
        this.f18432a = filteredFragment;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        v7.g.f(motionEvent, "e1");
        v7.g.f(motionEvent2, "e2");
        if (Math.abs(motionEvent2.getY() - motionEvent.getY()) <= 100.0f) {
            return false;
        }
        NavController g10 = ViewUtilsKt.g(this.f18432a);
        if (g10 != null) {
            ViewUtilsKt.o(g10, new n(false), null);
        }
        return true;
    }
}
