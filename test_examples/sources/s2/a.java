package s2;

import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.n;
import androidx.lifecycle.v;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import s2.b;

/* loaded from: classes.dex */
public final class a extends FingerprintManager.AuthenticationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.AbstractC0220b f17265a;

    public a(androidx.biometric.a aVar) {
        this.f17265a = aVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((androidx.biometric.a) this.f17265a).f1180a.c.a(i10, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        ((androidx.biometric.a) this.f17265a).f1180a.c.b();
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference<n> weakReference = ((n.a) ((androidx.biometric.a) this.f17265a).f1180a.c).f1234a;
        if (weakReference.get() != null) {
            n nVar = weakReference.get();
            if (nVar.f1228u == null) {
                nVar.f1228u = new v<>();
            }
            n.j(nVar.f1228u, charSequence);
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        BiometricPrompt.c cVar;
        b.AbstractC0220b abstractC0220b = this.f17265a;
        b.c f10 = b.a.f(b.a.b(authenticationResult));
        androidx.biometric.a aVar = (androidx.biometric.a) abstractC0220b;
        aVar.getClass();
        if (f10 != null) {
            Cipher cipher = f10.f17268b;
            if (cipher != null) {
                cVar = new BiometricPrompt.c(cipher);
            } else {
                Signature signature = f10.f17267a;
                if (signature != null) {
                    cVar = new BiometricPrompt.c(signature);
                } else {
                    Mac mac = f10.c;
                    if (mac != null) {
                        cVar = new BiometricPrompt.c(mac);
                    }
                }
            }
            aVar.f1180a.c.c(new BiometricPrompt.b(cVar, 2));
        }
        cVar = null;
        aVar.f1180a.c.c(new BiometricPrompt.b(cVar, 2));
    }
}
