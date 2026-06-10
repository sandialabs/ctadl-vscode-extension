package g1;

import android.util.Log;
import android.view.MotionEvent;
import com.airbnb.epoxy.o0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q implements o0 {

    /* renamed from: b  reason: collision with root package name */
    public long f11176b;
    public final Object c;

    /* renamed from: d  reason: collision with root package name */
    public Object f11177d;

    public /* synthetic */ q(long j2, ArrayList arrayList, MotionEvent motionEvent) {
        v7.g.f(arrayList, "pointers");
        v7.g.f(motionEvent, "motionEvent");
        this.f11176b = j2;
        this.c = arrayList;
        this.f11177d = motionEvent;
    }

    public q(String str) {
        this.c = str;
        this.f11176b = -1L;
        this.f11177d = null;
    }

    @Override // com.airbnb.epoxy.o0
    public final void a(String str) {
        if (this.f11176b != -1) {
            throw new IllegalStateException("Timer was already started");
        }
        this.f11176b = System.nanoTime();
        this.f11177d = str;
    }

    @Override // com.airbnb.epoxy.o0
    public final void stop() {
        if (this.f11176b != -1) {
            Log.d((String) this.c, String.format(androidx.activity.e.k(new StringBuilder(), (String) this.f11177d, ": %.3fms"), Float.valueOf(((float) (System.nanoTime() - this.f11176b)) / 1000000.0f)));
            this.f11176b = -1L;
            this.f11177d = null;
            return;
        }
        throw new IllegalStateException("Timer was not started");
    }
}
