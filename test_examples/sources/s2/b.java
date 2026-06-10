package s2;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17266a;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i10, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i10, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        public static FingerprintManager.CryptoObject b(Object obj) {
            FingerprintManager.CryptoObject cryptoObject;
            cryptoObject = ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
            return cryptoObject;
        }

        public static FingerprintManager c(Context context) {
            Object systemService;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 == 23) {
                systemService = context.getSystemService(FingerprintManager.class);
            } else if (i10 <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return null;
            } else {
                systemService = context.getSystemService(FingerprintManager.class);
            }
            return (FingerprintManager) systemService;
        }

        public static boolean d(Object obj) {
            boolean hasEnrolledFingerprints;
            hasEnrolledFingerprints = ((FingerprintManager) obj).hasEnrolledFingerprints();
            return hasEnrolledFingerprints;
        }

        public static boolean e(Object obj) {
            boolean isHardwareDetected;
            isHardwareDetected = ((FingerprintManager) obj).isHardwareDetected();
            return isHardwareDetected;
        }

        public static c f(Object obj) {
            Cipher cipher;
            Signature signature;
            Mac mac;
            Mac mac2;
            Signature signature2;
            Cipher cipher2;
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            cipher = cryptoObject.getCipher();
            if (cipher != null) {
                cipher2 = cryptoObject.getCipher();
                return new c(cipher2);
            }
            signature = cryptoObject.getSignature();
            if (signature != null) {
                signature2 = cryptoObject.getSignature();
                return new c(signature2);
            }
            mac = cryptoObject.getMac();
            if (mac != null) {
                mac2 = cryptoObject.getMac();
                return new c(mac2);
            }
            return null;
        }

        public static FingerprintManager.CryptoObject g(c cVar) {
            if (cVar == null) {
                return null;
            }
            Cipher cipher = cVar.f17268b;
            if (cipher != null) {
                return new FingerprintManager.CryptoObject(cipher);
            }
            Signature signature = cVar.f17267a;
            if (signature != null) {
                return new FingerprintManager.CryptoObject(signature);
            }
            Mac mac = cVar.c;
            if (mac != null) {
                return new FingerprintManager.CryptoObject(mac);
            }
            return null;
        }
    }

    /* renamed from: s2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0220b {
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Signature f17267a;

        /* renamed from: b  reason: collision with root package name */
        public final Cipher f17268b;
        public final Mac c;

        public c(Signature signature) {
            this.f17267a = signature;
            this.f17268b = null;
            this.c = null;
        }

        public c(Cipher cipher) {
            this.f17268b = cipher;
            this.f17267a = null;
            this.c = null;
        }

        public c(Mac mac) {
            this.c = mac;
            this.f17268b = null;
            this.f17267a = null;
        }
    }

    public b(Context context) {
        this.f17266a = context;
    }
}
