package x4;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final String f18607a;

    static {
        String f10 = n4.g.f("WakeLocks");
        v7.g.e(f10, "tagWithPrefix(\"WakeLocks\")");
        f18607a = f10;
    }

    public static final PowerManager.WakeLock a(Context context, String str) {
        v7.g.f(context, "context");
        v7.g.f(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        v7.g.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String concat = "WorkManager: ".concat(str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, concat);
        synchronized (t.f18608a) {
            t.f18609b.put(newWakeLock, concat);
        }
        v7.g.e(newWakeLock, "wakeLock");
        return newWakeLock;
    }
}
