package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import androidx.biometric.BiometricPrompt;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class p {

    /* loaded from: classes.dex */
    public static class a {
        public static BiometricPrompt.CryptoObject a(Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        public static BiometricPrompt.CryptoObject b(Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }

        public static BiometricPrompt.CryptoObject c(Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }

        public static Cipher d(BiometricPrompt.CryptoObject cryptoObject) {
            Cipher cipher;
            cipher = cryptoObject.getCipher();
            return cipher;
        }

        public static Mac e(BiometricPrompt.CryptoObject cryptoObject) {
            Mac mac;
            mac = cryptoObject.getMac();
            return mac;
        }

        public static Signature f(BiometricPrompt.CryptoObject cryptoObject) {
            Signature signature;
            signature = cryptoObject.getSignature();
            return signature;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static BiometricPrompt.CryptoObject a(IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        public static IdentityCredential b(BiometricPrompt.CryptoObject cryptoObject) {
            IdentityCredential identityCredential;
            identityCredential = cryptoObject.getIdentityCredential();
            return identityCredential;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static BiometricPrompt.CryptoObject a(PresentationSession presentationSession) {
            return new BiometricPrompt.CryptoObject(presentationSession);
        }

        public static PresentationSession b(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getPresentationSession();
        }
    }

    public static BiometricPrompt.CryptoObject a(BiometricPrompt.c cVar) {
        PresentationSession presentationSession;
        IdentityCredential identityCredential;
        if (cVar == null) {
            return null;
        }
        Cipher cipher = cVar.f1175b;
        if (cipher != null) {
            return a.b(cipher);
        }
        Signature signature = cVar.f1174a;
        if (signature != null) {
            return a.a(signature);
        }
        Mac mac = cVar.c;
        if (mac != null) {
            return a.c(mac);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || (identityCredential = cVar.f1176d) == null) {
            if (i10 < 33 || (presentationSession = cVar.f1177e) == null) {
                return null;
            }
            return c.a(presentationSession);
        }
        return b.a(identityCredential);
    }
}
