package androidx.biometric;

import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class x {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.face");
    }

    public static boolean b(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.iris");
    }
}
