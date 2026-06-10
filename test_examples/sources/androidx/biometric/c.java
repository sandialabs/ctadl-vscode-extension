package androidx.biometric;

import android.os.Build;

/* loaded from: classes.dex */
public final class c {
    public static boolean a(int i10) {
        return (i10 & 32768) != 0;
    }

    public static boolean b(int i10) {
        if (i10 == 15 || i10 == 255) {
            return true;
        }
        if (i10 == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        } else if (i10 != 32783) {
            return i10 == 33023 || i10 == 0;
        } else {
            int i11 = Build.VERSION.SDK_INT;
            return i11 < 28 || i11 > 29;
        }
    }
}
