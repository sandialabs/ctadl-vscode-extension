package k;

import android.os.Looper;
import androidx.datastore.preferences.protobuf.k;

/* loaded from: classes.dex */
public final class c extends k {

    /* renamed from: j  reason: collision with root package name */
    public static volatile c f12822j;

    /* renamed from: k  reason: collision with root package name */
    public static final b f12823k = new b(0);

    /* renamed from: i  reason: collision with root package name */
    public final d f12824i = new d();

    public static c L0() {
        if (f12822j != null) {
            return f12822j;
        }
        synchronized (c.class) {
            if (f12822j == null) {
                f12822j = new c();
            }
        }
        return f12822j;
    }

    public final void M0(Runnable runnable) {
        d dVar = this.f12824i;
        if (dVar.f12827k == null) {
            synchronized (dVar.f12825i) {
                if (dVar.f12827k == null) {
                    dVar.f12827k = d.L0(Looper.getMainLooper());
                }
            }
        }
        dVar.f12827k.post(runnable);
    }
}
