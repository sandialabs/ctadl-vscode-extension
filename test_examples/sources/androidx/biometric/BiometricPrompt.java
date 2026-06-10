package androidx.biometric;

import android.annotation.SuppressLint;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.z;
import androidx.lifecycle.k0;
import androidx.lifecycle.n0;
import com.noto.app.vault.ValidateVaultPasscodeDialogFragment;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class BiometricPrompt {

    /* renamed from: a  reason: collision with root package name */
    public z f1169a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1170b;

    /* loaded from: classes.dex */
    public static class ResetCallbackObserver implements androidx.lifecycle.e {

        /* renamed from: i  reason: collision with root package name */
        public final WeakReference<n> f1171i;

        public ResetCallbackObserver(n nVar) {
            this.f1171i = new WeakReference<>(nVar);
        }

        @Override // androidx.lifecycle.e
        public final void b(androidx.lifecycle.q qVar) {
        }

        @Override // androidx.lifecycle.e
        public final void d(androidx.lifecycle.q qVar) {
        }

        @Override // androidx.lifecycle.e
        public final void h(androidx.lifecycle.q qVar) {
        }

        @Override // androidx.lifecycle.e
        public final void m(androidx.lifecycle.q qVar) {
        }

        @Override // androidx.lifecycle.e
        public final void onDestroy(androidx.lifecycle.q qVar) {
            WeakReference<n> weakReference = this.f1171i;
            if (weakReference.get() != null) {
                weakReference.get().f1213e = null;
            }
        }

        @Override // androidx.lifecycle.e
        public final void v(androidx.lifecycle.q qVar) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
        public void a(b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final c f1172a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1173b;

        public b(c cVar, int i10) {
            this.f1172a = cVar;
            this.f1173b = i10;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Signature f1174a;

        /* renamed from: b  reason: collision with root package name */
        public final Cipher f1175b;
        public final Mac c;

        /* renamed from: d  reason: collision with root package name */
        public final IdentityCredential f1176d;

        /* renamed from: e  reason: collision with root package name */
        public final PresentationSession f1177e;

        public c(IdentityCredential identityCredential) {
            this.f1174a = null;
            this.f1175b = null;
            this.c = null;
            this.f1176d = identityCredential;
            this.f1177e = null;
        }

        public c(PresentationSession presentationSession) {
            this.f1174a = null;
            this.f1175b = null;
            this.c = null;
            this.f1176d = null;
            this.f1177e = presentationSession;
        }

        public c(Signature signature) {
            this.f1174a = signature;
            this.f1175b = null;
            this.c = null;
            this.f1176d = null;
            this.f1177e = null;
        }

        public c(Cipher cipher) {
            this.f1174a = null;
            this.f1175b = cipher;
            this.c = null;
            this.f1176d = null;
            this.f1177e = null;
        }

        public c(Mac mac) {
            this.f1174a = null;
            this.f1175b = null;
            this.c = mac;
            this.f1176d = null;
            this.f1177e = null;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f1178a;

        /* renamed from: b  reason: collision with root package name */
        public final CharSequence f1179b;
        public final int c;

        public d(CharSequence charSequence, CharSequence charSequence2, int i10) {
            this.f1178a = charSequence;
            this.f1179b = charSequence2;
            this.c = i10;
        }
    }

    @SuppressLint({"LambdaLast"})
    public BiometricPrompt(Fragment fragment, Executor executor, ValidateVaultPasscodeDialogFragment.a aVar) {
        if (fragment != null) {
            if (executor != null) {
                z h10 = fragment.h();
                n nVar = (n) new k0(fragment).a(n.class);
                fragment.U.a(new ResetCallbackObserver(nVar));
                this.f1170b = false;
                this.f1169a = h10;
                nVar.f1212d = executor;
                nVar.f1213e = aVar;
                return;
            }
            throw new IllegalArgumentException("Executor must not be null.");
        }
        throw new IllegalArgumentException("Fragment must not be null.");
    }

    public static n a(Fragment fragment, boolean z10) {
        n0 n0Var;
        if (z10) {
            n0Var = fragment.c();
        } else {
            n0Var = null;
        }
        if (n0Var == null) {
            n0Var = fragment.C;
        }
        if (n0Var != null) {
            return (n) new k0(n0Var).a(n.class);
        }
        throw new IllegalStateException("view model not found");
    }
}
