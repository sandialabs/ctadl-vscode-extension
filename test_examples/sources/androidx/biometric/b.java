package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.n;
import androidx.biometric.p;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public BiometricPrompt.AuthenticationCallback f1181a;

    /* renamed from: b  reason: collision with root package name */
    public androidx.biometric.a f1182b;
    public final c c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: androidx.biometric.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0010a extends BiometricPrompt.AuthenticationCallback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c f1183a;

            public C0010a(c cVar) {
                this.f1183a = cVar;
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationError(int i10, CharSequence charSequence) {
                this.f1183a.a(i10, charSequence);
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationFailed() {
                this.f1183a.b();
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                BiometricPrompt.CryptoObject b5;
                PresentationSession b10;
                IdentityCredential b11;
                BiometricPrompt.c cVar = null;
                if (authenticationResult != null && (b5 = a.b(authenticationResult)) != null) {
                    Cipher d5 = p.a.d(b5);
                    if (d5 != null) {
                        cVar = new BiometricPrompt.c(d5);
                    } else {
                        Signature f10 = p.a.f(b5);
                        if (f10 != null) {
                            cVar = new BiometricPrompt.c(f10);
                        } else {
                            Mac e10 = p.a.e(b5);
                            if (e10 != null) {
                                cVar = new BiometricPrompt.c(e10);
                            } else {
                                int i10 = Build.VERSION.SDK_INT;
                                if (i10 >= 30 && (b11 = p.b.b(b5)) != null) {
                                    cVar = new BiometricPrompt.c(b11);
                                } else if (i10 >= 33 && (b10 = p.c.b(b5)) != null) {
                                    cVar = new BiometricPrompt.c(b10);
                                }
                            }
                        }
                    }
                }
                int i11 = Build.VERSION.SDK_INT;
                int i12 = -1;
                if (i11 >= 30) {
                    if (authenticationResult != null) {
                        i12 = C0011b.a(authenticationResult);
                    }
                } else if (i11 != 29) {
                    i12 = 2;
                }
                this.f1183a.c(new BiometricPrompt.b(cVar, i12));
            }
        }

        public static BiometricPrompt.AuthenticationCallback a(c cVar) {
            return new C0010a(cVar);
        }

        public static BiometricPrompt.CryptoObject b(BiometricPrompt.AuthenticationResult authenticationResult) {
            BiometricPrompt.CryptoObject cryptoObject;
            cryptoObject = authenticationResult.getCryptoObject();
            return cryptoObject;
        }
    }

    /* renamed from: androidx.biometric.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0011b {
        public static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
            int authenticationType;
            authenticationType = authenticationResult.getAuthenticationType();
            return authenticationType;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public void a(int i10, CharSequence charSequence) {
            throw null;
        }

        public void b() {
            throw null;
        }

        public void c(BiometricPrompt.b bVar) {
            throw null;
        }
    }

    public b(n.a aVar) {
        this.c = aVar;
    }
}
