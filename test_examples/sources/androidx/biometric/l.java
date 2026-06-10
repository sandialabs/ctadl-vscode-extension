package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.util.Log;
import androidx.biometric.v;
import s2.b;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final d f1209a;

    /* renamed from: b  reason: collision with root package name */
    public final BiometricManager f1210b;
    public final s2.b c;

    /* loaded from: classes.dex */
    public static class a {
        public static int a(BiometricManager biometricManager) {
            int canAuthenticate;
            canAuthenticate = biometricManager.canAuthenticate();
            return canAuthenticate;
        }

        public static BiometricManager b(Context context) {
            Object systemService;
            systemService = context.getSystemService(BiometricManager.class);
            return (BiometricManager) systemService;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static int a(BiometricManager biometricManager, int i10) {
            int canAuthenticate;
            canAuthenticate = biometricManager.canAuthenticate(i10);
            return canAuthenticate;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements d {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1211a;

        public c(Context context) {
            this.f1211a = context.getApplicationContext();
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    public l(c cVar) {
        BiometricManager biometricManager;
        this.f1209a = cVar;
        int i10 = Build.VERSION.SDK_INT;
        Context context = cVar.f1211a;
        if (i10 >= 29) {
            biometricManager = a.b(context);
        } else {
            biometricManager = null;
        }
        this.f1210b = biometricManager;
        this.c = i10 <= 29 ? new s2.b(context) : null;
    }

    public final int a() {
        boolean z10;
        boolean a10;
        boolean a11;
        int i10 = Build.VERSION.SDK_INT;
        BiometricManager biometricManager = this.f1210b;
        int i11 = 1;
        if (i10 >= 30) {
            if (biometricManager == null) {
                Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                return 1;
            }
            return b.a(biometricManager, 255);
        } else if (!androidx.biometric.c.b(255)) {
            return -2;
        } else {
            d dVar = this.f1209a;
            c cVar = (c) dVar;
            int i12 = 0;
            if (v.a(cVar.f1211a) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                boolean a12 = androidx.biometric.c.a(255);
                Context context = cVar.f1211a;
                if (a12) {
                    KeyguardManager a13 = v.a(context);
                    if (a13 == null) {
                        a11 = false;
                    } else if (i10 >= 23) {
                        a11 = v.b.b(a13);
                    } else {
                        a11 = v.a.a(a13);
                    }
                    if (a11) {
                        return 0;
                    }
                    return 11;
                } else if (i10 == 29) {
                    if (biometricManager == null) {
                        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                    } else {
                        i11 = a.a(biometricManager);
                    }
                    return i11;
                } else if (i10 == 28) {
                    if (i10 < 23 || context == null || context.getPackageManager() == null || !w.a(context.getPackageManager())) {
                        i11 = 0;
                    }
                    if (i11 != 0) {
                        KeyguardManager a14 = v.a(((c) dVar).f1211a);
                        if (a14 == null) {
                            a10 = false;
                        } else if (i10 >= 23) {
                            a10 = v.b.b(a14);
                        } else {
                            a10 = v.a.a(a14);
                        }
                        if (!a10) {
                            return b();
                        }
                        if (b() != 0) {
                            i12 = -1;
                        }
                        return i12;
                    }
                } else {
                    return b();
                }
            }
            return 12;
        }
    }

    public final int b() {
        boolean z10;
        FingerprintManager c10;
        FingerprintManager c11;
        boolean z11 = true;
        s2.b bVar = this.c;
        if (bVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        int i10 = Build.VERSION.SDK_INT;
        Context context = bVar.f17266a;
        if (i10 >= 23 && (c11 = b.a.c(context)) != null && b.a.e(c11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return 12;
        }
        if (i10 < 23 || (c10 = b.a.c(context)) == null || !b.a.d(c10)) {
            z11 = false;
        }
        if (z11) {
            return 0;
        }
        return 11;
    }
}
