package x4;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import n4.g;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final String f18593a;

    static {
        String f10 = n4.g.f("ProcessUtils");
        v7.g.e(f10, "tagWithPrefix(\"ProcessUtils\")");
        f18593a = f10;
    }

    public static final boolean a(Context context, androidx.work.a aVar) {
        String str;
        Object obj;
        boolean z10;
        v7.g.f(context, "context");
        v7.g.f(aVar, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            str = a.f18576a.a();
        } else {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, n4.j.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                v7.g.c(invoke);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th) {
                if (((g.a) n4.g.d()).c <= 3) {
                    Log.d(f18593a, "Unable to check ActivityThread for processName", th);
                }
            }
            int myPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            v7.g.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<T> it = runningAppProcesses.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (z10) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                if (runningAppProcessInfo != null) {
                    str = runningAppProcessInfo.processName;
                }
            }
            str = null;
        }
        return v7.g.a(str, context.getApplicationInfo().processName);
    }
}
