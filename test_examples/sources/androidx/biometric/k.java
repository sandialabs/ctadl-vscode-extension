package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.e1;
import androidx.appcompat.widget.j1;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.b;
import androidx.biometric.n;
import androidx.biometric.o;
import androidx.biometric.v;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.z;
import com.noto.R;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import s2.b;
import v2.d;

/* loaded from: classes.dex */
public class k extends Fragment {

    /* renamed from: f0  reason: collision with root package name */
    public static final /* synthetic */ int f1202f0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public n f1203d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Handler f1204e0 = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public static class a {
        public static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(android.hardware.biometrics.BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, authenticationCallback);
        }

        public static void b(android.hardware.biometrics.BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, authenticationCallback);
        }

        public static android.hardware.biometrics.BiometricPrompt c(BiometricPrompt.Builder builder) {
            android.hardware.biometrics.BiometricPrompt build;
            build = builder.build();
            return build;
        }

        public static BiometricPrompt.Builder d(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        public static void e(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        public static void f(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static void a(BiometricPrompt.Builder builder, boolean z10) {
            builder.setConfirmationRequired(z10);
        }

        public static void b(BiometricPrompt.Builder builder, boolean z10) {
            builder.setDeviceCredentialAllowed(z10);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static void a(BiometricPrompt.Builder builder, int i10) {
            builder.setAllowedAuthenticators(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class e implements Executor {

        /* renamed from: i  reason: collision with root package name */
        public final Handler f1205i = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f1205i.post(runnable);
        }
    }

    /* loaded from: classes.dex */
    public static class f implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final WeakReference<k> f1206i;

        public f(k kVar) {
            this.f1206i = new WeakReference<>(kVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<k> weakReference = this.f1206i;
            if (weakReference.get() != null) {
                weakReference.get().k0();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class g implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final WeakReference<n> f1207i;

        public g(n nVar) {
            this.f1207i = new WeakReference<>(nVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<n> weakReference = this.f1207i;
            if (weakReference.get() != null) {
                weakReference.get().f1223p = false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class h implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final WeakReference<n> f1208i;

        public h(n nVar) {
            this.f1208i = new WeakReference<>(nVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<n> weakReference = this.f1208i;
            if (weakReference.get() != null) {
                weakReference.get().f1224q = false;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void G() {
        this.K = true;
        if (Build.VERSION.SDK_INT == 29 && androidx.biometric.c.a(this.f1203d0.d())) {
            n nVar = this.f1203d0;
            nVar.f1224q = true;
            this.f1204e0.postDelayed(new h(nVar), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void H() {
        boolean z10 = true;
        this.K = true;
        if (Build.VERSION.SDK_INT < 29 && !this.f1203d0.f1222o) {
            androidx.fragment.app.s c10 = c();
            if (c10 == null || !c10.isChangingConfigurations()) {
                z10 = false;
            }
            if (!z10) {
                Z(0);
            }
        }
    }

    public final void Z(int i10) {
        if (i10 != 3 && this.f1203d0.f1224q) {
            return;
        }
        if (d0()) {
            this.f1203d0.f1220l = i10;
            if (i10 == 1) {
                g0(10, a1.c.x0(j(), 10));
            }
        }
        n nVar = this.f1203d0;
        if (nVar.f1217i == null) {
            nVar.f1217i = new o();
        }
        o oVar = nVar.f1217i;
        CancellationSignal cancellationSignal = oVar.f1238b;
        if (cancellationSignal != null) {
            try {
                o.b.a(cancellationSignal);
            } catch (NullPointerException e10) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e10);
            }
            oVar.f1238b = null;
        }
        v2.d dVar = oVar.c;
        if (dVar != null) {
            try {
                dVar.a();
            } catch (NullPointerException e11) {
                Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e11);
            }
            oVar.c = null;
        }
    }

    public final void a0() {
        b0();
        n nVar = this.f1203d0;
        boolean z10 = false;
        nVar.f1221m = false;
        if (!nVar.f1222o && s()) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(l());
            aVar.i(this);
            aVar.d(true);
        }
        Context j2 = j();
        if (j2 != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29) {
                z10 = q.a(R.array.delay_showing_prompt_models, j2, str);
            }
            if (z10) {
                n nVar2 = this.f1203d0;
                nVar2.f1223p = true;
                this.f1204e0.postDelayed(new g(nVar2), 600L);
            }
        }
    }

    public final void b0() {
        this.f1203d0.f1221m = false;
        if (s()) {
            z l2 = l();
            r rVar = (r) l2.E("androidx.biometric.FingerprintDialogFragment");
            if (rVar != null) {
                if (rVar.s()) {
                    rVar.a0(true, false);
                    return;
                }
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(l2);
                aVar.i(rVar);
                aVar.d(true);
            }
        }
    }

    public final boolean c0() {
        return Build.VERSION.SDK_INT <= 28 && androidx.biometric.c.a(this.f1203d0.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            return true;
        }
        Context j2 = j();
        if (j2 != null && this.f1203d0.f1215g != null) {
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
            if (i10 == 28) {
                if (!q.c(R.array.crypto_fingerprint_fallback_vendors, j2, str)) {
                    if (q.b(R.array.crypto_fingerprint_fallback_prefixes, j2, str2)) {
                    }
                }
                z13 = true;
                if (z13) {
                    z10 = true;
                    if (!z10) {
                        return true;
                    }
                    if (i10 == 28) {
                        Bundle bundle = this.n;
                        Context j10 = j();
                        if (i10 >= 23 && j10 != null && j10.getPackageManager() != null && w.a(j10.getPackageManager())) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!bundle.getBoolean("has_fingerprint", z12)) {
                            z11 = true;
                            if (!z11) {
                                return true;
                            }
                            return false;
                        }
                    }
                    z11 = false;
                    if (!z11) {
                    }
                }
            }
            z13 = false;
            if (z13) {
            }
        }
        z10 = false;
        if (!z10) {
        }
    }

    public final void e0() {
        KeyguardManager keyguardManager;
        CharSequence charSequence;
        String q10;
        int i10;
        Context j2 = j();
        if (j2 != null) {
            keyguardManager = v.a(j2);
        } else {
            keyguardManager = null;
        }
        if (keyguardManager == null) {
            q10 = q(R.string.generic_error_no_keyguard);
            i10 = 12;
        } else {
            n nVar = this.f1203d0;
            BiometricPrompt.d dVar = nVar.f1214f;
            if (dVar != null) {
                charSequence = dVar.f1178a;
            } else {
                charSequence = null;
            }
            nVar.getClass();
            this.f1203d0.getClass();
            Intent a10 = a.a(keyguardManager, charSequence, null);
            if (a10 == null) {
                q10 = q(R.string.generic_error_no_device_credential);
                i10 = 14;
            } else {
                this.f1203d0.f1222o = true;
                if (d0()) {
                    b0();
                }
                a10.setFlags(134742016);
                if (this.A != null) {
                    z l2 = l();
                    if (l2.f5292v != null) {
                        l2.f5295y.addLast(new z.l(this.f5040m));
                        l2.f5292v.a(a10);
                        return;
                    }
                    l2.f5286p.getClass();
                    throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
                }
                throw new IllegalStateException("Fragment " + this + " not attached to Activity");
            }
        }
        f0(i10, q10);
    }

    public final void f0(int i10, CharSequence charSequence) {
        g0(i10, charSequence);
        a0();
    }

    public final void g0(int i10, CharSequence charSequence) {
        n nVar = this.f1203d0;
        if (nVar.f1222o) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!nVar.n) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            nVar.n = false;
            Executor executor = nVar.f1212d;
            if (executor == null) {
                executor = new n.b();
            }
            executor.execute(new androidx.biometric.e(i10, 0, this, charSequence));
        }
    }

    public final void h0(BiometricPrompt.b bVar) {
        n nVar = this.f1203d0;
        if (!nVar.n) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            nVar.n = false;
            Executor executor = nVar.f1212d;
            if (executor == null) {
                executor = new n.b();
            }
            executor.execute(new androidx.biometric.f(this, 0, bVar));
        }
        a0();
    }

    public final void j0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = q(R.string.default_error_msg);
        }
        this.f1203d0.h(2);
        this.f1203d0.g(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k0() {
        boolean z10;
        String str;
        boolean z11;
        boolean z12;
        int i10;
        FingerprintManager c10;
        boolean b5;
        String str2;
        b.c cVar;
        n nVar;
        o oVar;
        n nVar2;
        androidx.biometric.b bVar;
        FingerprintManager c11;
        FingerprintManager c12;
        boolean z13;
        boolean z14;
        if (!this.f1203d0.f1221m) {
            if (j() == null) {
                Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
                return;
            }
            n nVar3 = this.f1203d0;
            nVar3.f1221m = true;
            nVar3.n = true;
            int i11 = Build.VERSION.SDK_INT;
            Context j2 = j();
            if (j2 != null) {
                String str3 = Build.MANUFACTURER;
                if (i11 != 29) {
                    z13 = false;
                } else {
                    z13 = !q.c(R.array.keyguard_biometric_and_credential_exclude_vendors, j2, str3);
                }
                if (z13) {
                    int d5 = this.f1203d0.d();
                    if ((d5 & 255) == 255) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14 && androidx.biometric.c.a(d5)) {
                        this.f1203d0.f1225r = true;
                        z10 = true;
                        if (!z10) {
                            e0();
                            return;
                        }
                        CharSequence charSequence = null;
                        CancellationSignal cancellationSignal = null;
                        if (d0()) {
                            Context applicationContext = S().getApplicationContext();
                            if (i11 >= 23 && (c12 = b.a.c(applicationContext)) != null && b.a.e(c12)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                i10 = 12;
                            } else {
                                if (i11 >= 23 && (c10 = b.a.c(applicationContext)) != null && b.a.d(c10)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (!z12) {
                                    i10 = 11;
                                } else {
                                    i10 = 0;
                                }
                            }
                            if (i10 != 0) {
                                f0(i10, a1.c.x0(applicationContext, i10));
                                return;
                            } else if (s()) {
                                this.f1203d0.f1231x = true;
                                String str4 = Build.MODEL;
                                if (i11 != 28) {
                                    b5 = false;
                                } else {
                                    b5 = q.b(R.array.hide_fingerprint_instantly_prefixes, applicationContext, str4);
                                }
                                if (!b5) {
                                    this.f1204e0.postDelayed(new j1(1, this), 500L);
                                    boolean z15 = this.n.getBoolean("host_activity", true);
                                    r rVar = new r();
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("host_activity", z15);
                                    rVar.W(bundle);
                                    rVar.f0(l(), "androidx.biometric.FingerprintDialogFragment");
                                }
                                n nVar4 = this.f1203d0;
                                nVar4.f1220l = 0;
                                BiometricPrompt.c cVar2 = nVar4.f1215g;
                                try {
                                    if (cVar2 != null) {
                                        Cipher cipher = cVar2.f1175b;
                                        if (cipher != null) {
                                            cVar = new b.c(cipher);
                                        } else {
                                            Signature signature = cVar2.f1174a;
                                            if (signature != null) {
                                                cVar = new b.c(signature);
                                            } else {
                                                Mac mac = cVar2.c;
                                                if (mac != null) {
                                                    cVar = new b.c(mac);
                                                } else {
                                                    if (i11 >= 30 && cVar2.f1176d != null) {
                                                        str2 = "Identity credential is not supported by FingerprintManager.";
                                                    } else {
                                                        str2 = (i11 >= 33 && cVar2.f1177e != null) ? "Presentation session is not supported by FingerprintManager." : "Presentation session is not supported by FingerprintManager.";
                                                    }
                                                    Log.e("CryptoObjectUtils", str2);
                                                }
                                            }
                                        }
                                        nVar = this.f1203d0;
                                        if (nVar.f1217i == null) {
                                            nVar.f1217i = new o();
                                        }
                                        oVar = nVar.f1217i;
                                        if (oVar.c == null) {
                                            oVar.f1237a.getClass();
                                            oVar.c = new v2.d();
                                        }
                                        v2.d dVar = oVar.c;
                                        nVar2 = this.f1203d0;
                                        if (nVar2.f1216h == null) {
                                            nVar2.f1216h = new androidx.biometric.b(new n.a(nVar2));
                                        }
                                        bVar = nVar2.f1216h;
                                        if (bVar.f1182b == null) {
                                            bVar.f1182b = new androidx.biometric.a(bVar);
                                        }
                                        androidx.biometric.a aVar = bVar.f1182b;
                                        if (Build.VERSION.SDK_INT < 23 && (c11 = b.a.c(applicationContext)) != null) {
                                            if (dVar != null) {
                                                synchronized (dVar) {
                                                    if (dVar.c == null) {
                                                        CancellationSignal b10 = d.a.b();
                                                        dVar.c = b10;
                                                        if (dVar.f18144a) {
                                                            d.a.a(b10);
                                                        }
                                                    }
                                                    cancellationSignal = dVar.c;
                                                }
                                            }
                                            b.a.a(c11, b.a.g(cVar), cancellationSignal, 0, new s2.a(aVar), null);
                                            return;
                                        }
                                        return;
                                    }
                                    if (Build.VERSION.SDK_INT < 23) {
                                        return;
                                    }
                                    return;
                                } catch (NullPointerException e10) {
                                    Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e10);
                                    f0(1, a1.c.x0(applicationContext, 1));
                                    return;
                                }
                                cVar = null;
                                nVar = this.f1203d0;
                                if (nVar.f1217i == null) {
                                }
                                oVar = nVar.f1217i;
                                if (oVar.c == null) {
                                }
                                v2.d dVar2 = oVar.c;
                                nVar2 = this.f1203d0;
                                if (nVar2.f1216h == null) {
                                }
                                bVar = nVar2.f1216h;
                                if (bVar.f1182b == null) {
                                }
                                androidx.biometric.a aVar2 = bVar.f1182b;
                            } else {
                                return;
                            }
                        } else {
                            BiometricPrompt.Builder d10 = b.d(S().getApplicationContext());
                            n nVar5 = this.f1203d0;
                            BiometricPrompt.d dVar3 = nVar5.f1214f;
                            if (dVar3 != null) {
                                charSequence = dVar3.f1178a;
                            }
                            nVar5.getClass();
                            this.f1203d0.getClass();
                            if (charSequence != null) {
                                b.f(d10, charSequence);
                            }
                            CharSequence e11 = this.f1203d0.e();
                            if (!TextUtils.isEmpty(e11)) {
                                Executor executor = this.f1203d0.f1212d;
                                if (executor == null) {
                                    executor = new n.b();
                                }
                                n nVar6 = this.f1203d0;
                                if (nVar6.f1218j == null) {
                                    nVar6.f1218j = new n.c(nVar6);
                                }
                                b.e(d10, e11, executor, nVar6.f1218j);
                            }
                            if (i11 >= 29) {
                                BiometricPrompt.d dVar4 = this.f1203d0.f1214f;
                                c.a(d10, true);
                            }
                            int d11 = this.f1203d0.d();
                            if (i11 >= 30) {
                                d.a(d10, d11);
                            } else if (i11 >= 29) {
                                c.b(d10, androidx.biometric.c.a(d11));
                            }
                            android.hardware.biometrics.BiometricPrompt c13 = b.c(d10);
                            Context j10 = j();
                            BiometricPrompt.CryptoObject a10 = p.a(this.f1203d0.f1215g);
                            n nVar7 = this.f1203d0;
                            if (nVar7.f1217i == null) {
                                nVar7.f1217i = new o();
                            }
                            o oVar2 = nVar7.f1217i;
                            if (oVar2.f1238b == null) {
                                oVar2.f1237a.getClass();
                                oVar2.f1238b = o.b.b();
                            }
                            CancellationSignal cancellationSignal2 = oVar2.f1238b;
                            e eVar = new e();
                            n nVar8 = this.f1203d0;
                            if (nVar8.f1216h == null) {
                                nVar8.f1216h = new androidx.biometric.b(new n.a(nVar8));
                            }
                            androidx.biometric.b bVar2 = nVar8.f1216h;
                            if (bVar2.f1181a == null) {
                                bVar2.f1181a = b.a.a(bVar2.c);
                            }
                            BiometricPrompt.AuthenticationCallback authenticationCallback = bVar2.f1181a;
                            try {
                                if (a10 == null) {
                                    b.b(c13, cancellationSignal2, eVar, authenticationCallback);
                                } else {
                                    b.a(c13, a10, cancellationSignal2, eVar, authenticationCallback);
                                }
                                return;
                            } catch (NullPointerException e12) {
                                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e12);
                                if (j10 != null) {
                                    str = j10.getString(R.string.default_error_msg);
                                } else {
                                    str = "";
                                }
                                f0(1, str);
                                return;
                            }
                        }
                    }
                }
            }
            z10 = false;
            if (!z10) {
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void t(int i10, int i11, Intent intent) {
        super.t(i10, i11, intent);
        int i12 = 1;
        if (i10 == 1) {
            n nVar = this.f1203d0;
            nVar.f1222o = false;
            if (i11 == -1) {
                if (nVar.f1225r) {
                    nVar.f1225r = false;
                    i12 = -1;
                }
                h0(new BiometricPrompt.b(null, i12));
                return;
            }
            f0(10, q(R.string.generic_error_user_canceled));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void w(Bundle bundle) {
        super.w(bundle);
        if (this.f1203d0 == null) {
            this.f1203d0 = BiometricPrompt.a(this, this.n.getBoolean("host_activity", true));
        }
        n nVar = this.f1203d0;
        androidx.fragment.app.s c10 = c();
        nVar.getClass();
        new WeakReference(c10);
        n nVar2 = this.f1203d0;
        if (nVar2.f1226s == null) {
            nVar2.f1226s = new androidx.lifecycle.v<>();
        }
        nVar2.f1226s.d(this, new androidx.lifecycle.w(this) { // from class: androidx.biometric.g

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ k f1194b;

            {
                this.f1194b = this;
            }

            @Override // androidx.lifecycle.w
            public final void b(Object obj) {
                int i10 = r2;
                k kVar = this.f1194b;
                switch (i10) {
                    case 0:
                        BiometricPrompt.b bVar = (BiometricPrompt.b) obj;
                        int i11 = k.f1202f0;
                        if (bVar != null) {
                            kVar.h0(bVar);
                            n nVar3 = kVar.f1203d0;
                            if (nVar3.f1226s == null) {
                                nVar3.f1226s = new androidx.lifecycle.v<>();
                            }
                            n.j(nVar3.f1226s, null);
                            return;
                        }
                        kVar.getClass();
                        return;
                    default:
                        int i12 = k.f1202f0;
                        kVar.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            if (kVar.d0()) {
                                kVar.j0(kVar.q(R.string.fingerprint_not_recognized));
                            }
                            n nVar4 = kVar.f1203d0;
                            if (!nVar4.n) {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            } else {
                                Executor executor = nVar4.f1212d;
                                if (executor == null) {
                                    executor = new n.b();
                                }
                                executor.execute(new e1(1, kVar));
                            }
                            n nVar5 = kVar.f1203d0;
                            if (nVar5.f1229v == null) {
                                nVar5.f1229v = new androidx.lifecycle.v<>();
                            }
                            n.j(nVar5.f1229v, Boolean.FALSE);
                            return;
                        }
                        return;
                }
            }
        });
        n nVar3 = this.f1203d0;
        if (nVar3.f1227t == null) {
            nVar3.f1227t = new androidx.lifecycle.v<>();
        }
        nVar3.f1227t.d(this, new androidx.lifecycle.w(this) { // from class: androidx.biometric.h

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ k f1196b;

            {
                this.f1196b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
            @Override // androidx.lifecycle.w
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void b(Object obj) {
                boolean z10;
                boolean b5;
                boolean z11;
                KeyguardManager a10;
                boolean a11;
                int i10 = r2;
                final k kVar = this.f1196b;
                int i11 = 0;
                switch (i10) {
                    case 0:
                        d dVar = (d) obj;
                        int i12 = k.f1202f0;
                        kVar.getClass();
                        if (dVar != null) {
                            final int i13 = dVar.f1184a;
                            switch (i13) {
                                case 1:
                                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                                case 5:
                                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                case 8:
                                case ma.i.f16046m /* 9 */:
                                case ma.i.f16047o /* 10 */:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case ma.i.f16049q /* 15 */:
                                    z10 = true;
                                    break;
                                case 6:
                                default:
                                    z10 = false;
                                    break;
                            }
                            if (!z10) {
                                i13 = 8;
                            }
                            Context j2 = kVar.j();
                            int i14 = Build.VERSION.SDK_INT;
                            if (i14 < 29) {
                                if (i13 != 7 && i13 != 9) {
                                    z11 = false;
                                    if (z11 && j2 != null) {
                                        a10 = v.a(j2);
                                        if (a10 != null) {
                                            a11 = false;
                                        } else if (i14 >= 23) {
                                            a11 = v.b.b(a10);
                                        } else {
                                            a11 = v.a.a(a10);
                                        }
                                        if (a11 && c.a(kVar.f1203d0.d())) {
                                            kVar.e0();
                                            kVar.f1203d0.f(null);
                                            return;
                                        }
                                    }
                                }
                                z11 = true;
                                if (z11) {
                                    a10 = v.a(j2);
                                    if (a10 != null) {
                                    }
                                    if (a11) {
                                        kVar.e0();
                                        kVar.f1203d0.f(null);
                                        return;
                                    }
                                }
                            }
                            boolean d02 = kVar.d0();
                            final CharSequence charSequence = dVar.f1185b;
                            if (d02) {
                                if (charSequence == null) {
                                    charSequence = a1.c.x0(kVar.j(), i13);
                                }
                                if (i13 == 5) {
                                    int i15 = kVar.f1203d0.f1220l;
                                    if (i15 == 0 || i15 == 3) {
                                        kVar.g0(i13, charSequence);
                                    }
                                    kVar.a0();
                                } else {
                                    if (kVar.f1203d0.f1231x) {
                                        kVar.f0(i13, charSequence);
                                    } else {
                                        kVar.j0(charSequence);
                                        Handler handler = kVar.f1204e0;
                                        Runnable runnable = new Runnable() { // from class: androidx.biometric.j
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i16 = k.f1202f0;
                                                k.this.f0(i13, charSequence);
                                            }
                                        };
                                        Context j10 = kVar.j();
                                        if (j10 != null) {
                                            String str = Build.MODEL;
                                            if (i14 != 28) {
                                                b5 = false;
                                            } else {
                                                b5 = q.b(R.array.hide_fingerprint_instantly_prefixes, j10, str);
                                            }
                                            if (b5) {
                                                handler.postDelayed(runnable, i11);
                                            }
                                        }
                                        i11 = 2000;
                                        handler.postDelayed(runnable, i11);
                                    }
                                    kVar.f1203d0.f1231x = true;
                                }
                            } else {
                                if (charSequence == null) {
                                    charSequence = kVar.q(R.string.default_error_msg) + " " + i13;
                                }
                                kVar.f0(i13, charSequence);
                            }
                            kVar.f1203d0.f(null);
                            return;
                        }
                        return;
                    default:
                        int i16 = k.f1202f0;
                        kVar.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            if (kVar.c0()) {
                                kVar.e0();
                            } else {
                                CharSequence e10 = kVar.f1203d0.e();
                                if (e10 == null) {
                                    e10 = kVar.q(R.string.default_error_msg);
                                }
                                kVar.f0(13, e10);
                                kVar.Z(2);
                            }
                            kVar.f1203d0.i(false);
                            return;
                        }
                        return;
                }
            }
        });
        n nVar4 = this.f1203d0;
        if (nVar4.f1228u == null) {
            nVar4.f1228u = new androidx.lifecycle.v<>();
        }
        nVar4.f1228u.d(this, new androidx.lifecycle.w(this) { // from class: androidx.biometric.i

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ k f1198b;

            {
                this.f1198b = this;
            }

            @Override // androidx.lifecycle.w
            public final void b(Object obj) {
                int i10 = r2;
                k kVar = this.f1198b;
                switch (i10) {
                    case 0:
                        CharSequence charSequence = (CharSequence) obj;
                        int i11 = k.f1202f0;
                        if (charSequence != null) {
                            if (kVar.d0()) {
                                kVar.j0(charSequence);
                            }
                            kVar.f1203d0.f(null);
                            return;
                        }
                        kVar.getClass();
                        return;
                    default:
                        int i12 = k.f1202f0;
                        kVar.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            kVar.Z(1);
                            kVar.a0();
                            n nVar5 = kVar.f1203d0;
                            if (nVar5.f1232y == null) {
                                nVar5.f1232y = new androidx.lifecycle.v<>();
                            }
                            n.j(nVar5.f1232y, Boolean.FALSE);
                            return;
                        }
                        return;
                }
            }
        });
        n nVar5 = this.f1203d0;
        if (nVar5.f1229v == null) {
            nVar5.f1229v = new androidx.lifecycle.v<>();
        }
        nVar5.f1229v.d(this, new androidx.lifecycle.w(this) { // from class: androidx.biometric.g

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ k f1194b;

            {
                this.f1194b = this;
            }

            @Override // androidx.lifecycle.w
            public final void b(Object obj) {
                int i10 = r2;
                k kVar = this.f1194b;
                switch (i10) {
                    case 0:
                        BiometricPrompt.b bVar = (BiometricPrompt.b) obj;
                        int i11 = k.f1202f0;
                        if (bVar != null) {
                            kVar.h0(bVar);
                            n nVar32 = kVar.f1203d0;
                            if (nVar32.f1226s == null) {
                                nVar32.f1226s = new androidx.lifecycle.v<>();
                            }
                            n.j(nVar32.f1226s, null);
                            return;
                        }
                        kVar.getClass();
                        return;
                    default:
                        int i12 = k.f1202f0;
                        kVar.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            if (kVar.d0()) {
                                kVar.j0(kVar.q(R.string.fingerprint_not_recognized));
                            }
                            n nVar42 = kVar.f1203d0;
                            if (!nVar42.n) {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            } else {
                                Executor executor = nVar42.f1212d;
                                if (executor == null) {
                                    executor = new n.b();
                                }
                                executor.execute(new e1(1, kVar));
                            }
                            n nVar52 = kVar.f1203d0;
                            if (nVar52.f1229v == null) {
                                nVar52.f1229v = new androidx.lifecycle.v<>();
                            }
                            n.j(nVar52.f1229v, Boolean.FALSE);
                            return;
                        }
                        return;
                }
            }
        });
        n nVar6 = this.f1203d0;
        if (nVar6.f1230w == null) {
            nVar6.f1230w = new androidx.lifecycle.v<>();
        }
        nVar6.f1230w.d(this, new androidx.lifecycle.w(this) { // from class: androidx.biometric.h

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ k f1196b;

            {
                this.f1196b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
            @Override // androidx.lifecycle.w
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void b(Object obj) {
                boolean z10;
                boolean b5;
                boolean z11;
                KeyguardManager a10;
                boolean a11;
                int i10 = r2;
                final k kVar = this.f1196b;
                int i11 = 0;
                switch (i10) {
                    case 0:
                        d dVar = (d) obj;
                        int i12 = k.f1202f0;
                        kVar.getClass();
                        if (dVar != null) {
                            final int i13 = dVar.f1184a;
                            switch (i13) {
                                case 1:
                                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                                case 5:
                                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                case 8:
                                case ma.i.f16046m /* 9 */:
                                case ma.i.f16047o /* 10 */:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case ma.i.f16049q /* 15 */:
                                    z10 = true;
                                    break;
                                case 6:
                                default:
                                    z10 = false;
                                    break;
                            }
                            if (!z10) {
                                i13 = 8;
                            }
                            Context j2 = kVar.j();
                            int i14 = Build.VERSION.SDK_INT;
                            if (i14 < 29) {
                                if (i13 != 7 && i13 != 9) {
                                    z11 = false;
                                    if (z11 && j2 != null) {
                                        a10 = v.a(j2);
                                        if (a10 != null) {
                                            a11 = false;
                                        } else if (i14 >= 23) {
                                            a11 = v.b.b(a10);
                                        } else {
                                            a11 = v.a.a(a10);
                                        }
                                        if (a11 && c.a(kVar.f1203d0.d())) {
                                            kVar.e0();
                                            kVar.f1203d0.f(null);
                                            return;
                                        }
                                    }
                                }
                                z11 = true;
                                if (z11) {
                                    a10 = v.a(j2);
                                    if (a10 != null) {
                                    }
                                    if (a11) {
                                        kVar.e0();
                                        kVar.f1203d0.f(null);
                                        return;
                                    }
                                }
                            }
                            boolean d02 = kVar.d0();
                            final CharSequence charSequence = dVar.f1185b;
                            if (d02) {
                                if (charSequence == null) {
                                    charSequence = a1.c.x0(kVar.j(), i13);
                                }
                                if (i13 == 5) {
                                    int i15 = kVar.f1203d0.f1220l;
                                    if (i15 == 0 || i15 == 3) {
                                        kVar.g0(i13, charSequence);
                                    }
                                    kVar.a0();
                                } else {
                                    if (kVar.f1203d0.f1231x) {
                                        kVar.f0(i13, charSequence);
                                    } else {
                                        kVar.j0(charSequence);
                                        Handler handler = kVar.f1204e0;
                                        Runnable runnable = new Runnable() { // from class: androidx.biometric.j
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i16 = k.f1202f0;
                                                k.this.f0(i13, charSequence);
                                            }
                                        };
                                        Context j10 = kVar.j();
                                        if (j10 != null) {
                                            String str = Build.MODEL;
                                            if (i14 != 28) {
                                                b5 = false;
                                            } else {
                                                b5 = q.b(R.array.hide_fingerprint_instantly_prefixes, j10, str);
                                            }
                                            if (b5) {
                                                handler.postDelayed(runnable, i11);
                                            }
                                        }
                                        i11 = 2000;
                                        handler.postDelayed(runnable, i11);
                                    }
                                    kVar.f1203d0.f1231x = true;
                                }
                            } else {
                                if (charSequence == null) {
                                    charSequence = kVar.q(R.string.default_error_msg) + " " + i13;
                                }
                                kVar.f0(i13, charSequence);
                            }
                            kVar.f1203d0.f(null);
                            return;
                        }
                        return;
                    default:
                        int i16 = k.f1202f0;
                        kVar.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            if (kVar.c0()) {
                                kVar.e0();
                            } else {
                                CharSequence e10 = kVar.f1203d0.e();
                                if (e10 == null) {
                                    e10 = kVar.q(R.string.default_error_msg);
                                }
                                kVar.f0(13, e10);
                                kVar.Z(2);
                            }
                            kVar.f1203d0.i(false);
                            return;
                        }
                        return;
                }
            }
        });
        n nVar7 = this.f1203d0;
        if (nVar7.f1232y == null) {
            nVar7.f1232y = new androidx.lifecycle.v<>();
        }
        nVar7.f1232y.d(this, new androidx.lifecycle.w(this) { // from class: androidx.biometric.i

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ k f1198b;

            {
                this.f1198b = this;
            }

            @Override // androidx.lifecycle.w
            public final void b(Object obj) {
                int i10 = r2;
                k kVar = this.f1198b;
                switch (i10) {
                    case 0:
                        CharSequence charSequence = (CharSequence) obj;
                        int i11 = k.f1202f0;
                        if (charSequence != null) {
                            if (kVar.d0()) {
                                kVar.j0(charSequence);
                            }
                            kVar.f1203d0.f(null);
                            return;
                        }
                        kVar.getClass();
                        return;
                    default:
                        int i12 = k.f1202f0;
                        kVar.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            kVar.Z(1);
                            kVar.a0();
                            n nVar52 = kVar.f1203d0;
                            if (nVar52.f1232y == null) {
                                nVar52.f1232y = new androidx.lifecycle.v<>();
                            }
                            n.j(nVar52.f1232y, Boolean.FALSE);
                            return;
                        }
                        return;
                }
            }
        });
    }
}
