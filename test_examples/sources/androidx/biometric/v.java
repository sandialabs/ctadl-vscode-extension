package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class v {

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(KeyguardManager keyguardManager) {
            return keyguardManager.isKeyguardSecure();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static KeyguardManager a(Context context) {
            Object systemService;
            systemService = context.getSystemService(KeyguardManager.class);
            return (KeyguardManager) systemService;
        }

        public static boolean b(KeyguardManager keyguardManager) {
            boolean isDeviceSecure;
            isDeviceSecure = keyguardManager.isDeviceSecure();
            return isDeviceSecure;
        }
    }

    public static KeyguardManager a(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.a(context);
        }
        Object systemService = context.getSystemService("keyguard");
        if (systemService instanceof KeyguardManager) {
            return (KeyguardManager) systemService;
        }
        return null;
    }
}
