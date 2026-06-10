package com.noto.app.vault;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.c;
import androidx.biometric.k;
import androidx.biometric.n;
import androidx.biometric.w;
import androidx.biometric.x;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.s;
import androidx.fragment.app.z;
import androidx.lifecycle.d0;
import androidx.navigation.NavController;
import androidx.navigation.i;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.noto.R;
import com.noto.app.util.ModelUtilsKt;
import com.noto.app.util.ViewUtilsKt;
import com.noto.app.vault.ValidateVaultPasscodeDialogFragment;
import f7.q;
import java.util.concurrent.Executor;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m7.e;
import n2.a;
import o6.b;
import s6.m0;
import v2.f;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/vault/ValidateVaultPasscodeDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ValidateVaultPasscodeDialogFragment extends b {

    /* renamed from: v0  reason: collision with root package name */
    public static final /* synthetic */ int f9914v0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public final e f9915u0;

    /* loaded from: classes.dex */
    public static final class a extends BiometricPrompt.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ m0 f9918b;

        public a(m0 m0Var) {
            this.f9918b = m0Var;
        }

        @Override // androidx.biometric.BiometricPrompt.a
        public final void a(BiometricPrompt.b bVar) {
            g.f(bVar, "result");
            int i10 = ValidateVaultPasscodeDialogFragment.f9914v0;
            ValidateVaultPasscodeDialogFragment.this.g0(this.f9918b);
        }
    }

    public ValidateVaultPasscodeDialogFragment() {
        super(false, 1, null);
        this.f9915u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new ValidateVaultPasscodeDialogFragment$special$$inlined$viewModel$default$1(this));
    }

    public final void g0(m0 m0Var) {
        i g10;
        d0 a10;
        s c = c();
        if (c != null) {
            TextInputEditText textInputEditText = m0Var.f17421b;
            g.e(textInputEditText, "et");
            ViewUtilsKt.h(c, textInputEditText);
        }
        NavController g11 = ViewUtilsKt.g(this);
        if (g11 == null || (g10 = g11.g()) == null || (a10 = g10.a()) == null) {
            return;
        }
        a10.e(Boolean.TRUE, "IsPasscodeValid");
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0178, code lost:
        if (new androidx.biometric.l(new androidx.biometric.l.c(r0)).a() != 0) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0(m0 m0Var) {
        Executor fVar;
        n nVar;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        Context j2 = j();
        if (j2 != null) {
            boolean z13 = false;
            String f10 = q.f(j2, R.string.validate, new Object[0]);
            String f11 = q.f(j2, R.string.use_passcode, new Object[0]);
            if (!TextUtils.isEmpty(f10)) {
                if (c.b(255)) {
                    boolean a10 = c.a(255);
                    if (TextUtils.isEmpty(f11) && !a10) {
                        throw new IllegalArgumentException("Negative text must be set and non-empty.");
                    }
                    if (!TextUtils.isEmpty(f11) && a10) {
                        throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
                    }
                    BiometricPrompt.d dVar = new BiometricPrompt.d(f10, f11, 255);
                    Context S = S();
                    Object obj = n2.a.f16069a;
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 28) {
                        fVar = a.e.a(S);
                    } else {
                        fVar = new f(new Handler(S.getMainLooper()));
                    }
                    BiometricPrompt biometricPrompt = new BiometricPrompt(this, fVar, new a(m0Var));
                    z zVar = biometricPrompt.f1169a;
                    if (zVar == null) {
                        str = "Unable to start authentication. Client fragment manager was null.";
                    } else if (zVar.O()) {
                        str = "Unable to start authentication. Called after onSaveInstanceState().";
                    } else {
                        k kVar = (k) biometricPrompt.f1169a.E("androidx.biometric.BiometricFragment");
                        if (kVar == null) {
                            boolean z14 = biometricPrompt.f1170b;
                            k kVar2 = new k();
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("host_activity", z14);
                            kVar2.W(bundle);
                            z zVar2 = biometricPrompt.f1169a;
                            zVar2.getClass();
                            androidx.fragment.app.a aVar = new androidx.fragment.app.a(zVar2);
                            aVar.e(0, kVar2, "androidx.biometric.BiometricFragment", 1);
                            aVar.d(true);
                            z zVar3 = biometricPrompt.f1169a;
                            zVar3.y(true);
                            zVar3.F();
                            kVar = kVar2;
                        }
                        n nVar2 = kVar.f1203d0;
                        nVar2.f1214f = dVar;
                        if (i10 >= 23) {
                        }
                        String str2 = null;
                        nVar2.f1215g = null;
                        if (kVar.c0()) {
                            nVar = kVar.f1203d0;
                            str2 = kVar.q(R.string.confirm_device_credential_password);
                        } else {
                            nVar = kVar.f1203d0;
                        }
                        nVar.f1219k = str2;
                        Context j10 = kVar.j();
                        if (i10 == 29) {
                            Bundle bundle2 = kVar.n;
                            Context j11 = kVar.j();
                            if (i10 >= 23 && j11 != null && j11.getPackageManager() != null && w.a(j11.getPackageManager())) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!bundle2.getBoolean("has_fingerprint", z10)) {
                                Bundle bundle3 = kVar.n;
                                Context j12 = kVar.j();
                                if (i10 >= 29 && j12 != null && j12.getPackageManager() != null && x.a(j12.getPackageManager())) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (!bundle3.getBoolean("has_face", z11)) {
                                    Bundle bundle4 = kVar.n;
                                    Context j13 = kVar.j();
                                    if (i10 >= 29 && j13 != null && j13.getPackageManager() != null && x.b(j13.getPackageManager())) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (!bundle4.getBoolean("has_iris", z12)) {
                                        z13 = true;
                                        n nVar3 = kVar.f1203d0;
                                        if (!z13) {
                                            nVar3.n = true;
                                            kVar.e0();
                                            return;
                                        } else if (nVar3.f1223p) {
                                            kVar.f1204e0.postDelayed(new k.f(kVar), 600L);
                                            return;
                                        } else {
                                            kVar.k0();
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        if (kVar.c0()) {
                        }
                        n nVar32 = kVar.f1203d0;
                        if (!z13) {
                        }
                    }
                    Log.e("BiometricPromptCompat", str);
                    return;
                }
                throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": BIOMETRIC_WEAK");
            }
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
    }

    public final void j0(m0 m0Var) {
        Context j2;
        int i10;
        String str;
        String valueOf = String.valueOf(m0Var.f17421b.getText());
        if (ha.i.T0(valueOf)) {
            j2 = j();
            if (j2 != null) {
                i10 = R.string.passcode_empty_message;
                str = q.f(j2, i10, new Object[0]);
            }
            str = null;
        } else if (g.a(ModelUtilsKt.t(valueOf), ((com.noto.app.settings.c) this.f9915u0.getValue()).f9672r.getValue())) {
            g0(m0Var);
            return;
        } else {
            j2 = j();
            if (j2 != null) {
                i10 = R.string.invalid_passcode;
                str = q.f(j2, i10, new Object[0]);
            }
            str = null;
        }
        m0Var.f17422d.setError(str);
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.validate_vault_passcode_dialog_fragment, viewGroup, false);
        int i10 = R.id.btn_use_bio;
        MaterialButton materialButton = (MaterialButton) a1.b.O(inflate, R.id.btn_use_bio);
        if (materialButton != null) {
            i10 = R.id.btn_validate;
            MaterialButton materialButton2 = (MaterialButton) a1.b.O(inflate, R.id.btn_validate);
            if (materialButton2 != null) {
                i10 = R.id.et;
                TextInputEditText textInputEditText = (TextInputEditText) a1.b.O(inflate, R.id.et);
                if (textInputEditText != null) {
                    i10 = R.id.ll;
                    if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
                        NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                        View O = a1.b.O(inflate, R.id.tb);
                        if (O != null) {
                            s6.c a10 = s6.c.a(O);
                            TextInputLayout textInputLayout = (TextInputLayout) a1.b.O(inflate, R.id.til);
                            if (textInputLayout != null) {
                                final m0 m0Var = new m0(nestedScrollView, materialButton, materialButton2, textInputEditText, nestedScrollView, a10, textInputLayout);
                                Context j2 = j();
                                if (j2 != null) {
                                    str = q.f(j2, R.string.enter_vault_passcode, new Object[0]);
                                } else {
                                    str = null;
                                }
                                a10.c.setText(str);
                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ValidateVaultPasscodeDialogFragment$setupState$1(m0Var, this, null), ((com.noto.app.settings.c) this.f9915u0.getValue()).f9674t), ma.i.z(this));
                                g.e(nestedScrollView, "nsv");
                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ValidateVaultPasscodeDialogFragment$setupState$2(m0Var, null), ViewUtilsKt.k(nestedScrollView)), ma.i.z(this));
                                textInputEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: g7.a
                                    @Override // android.widget.TextView.OnEditorActionListener
                                    public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                                        int i12 = ValidateVaultPasscodeDialogFragment.f9914v0;
                                        ValidateVaultPasscodeDialogFragment validateVaultPasscodeDialogFragment = ValidateVaultPasscodeDialogFragment.this;
                                        g.f(validateVaultPasscodeDialogFragment, "this$0");
                                        m0 m0Var2 = m0Var;
                                        g.f(m0Var2, "$this_setupListeners");
                                        if (i11 == 6) {
                                            validateVaultPasscodeDialogFragment.j0(m0Var2);
                                            return true;
                                        }
                                        return false;
                                    }
                                });
                                materialButton2.setOnClickListener(new View.OnClickListener() { // from class: g7.b
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i11 = ValidateVaultPasscodeDialogFragment.f9914v0;
                                        ValidateVaultPasscodeDialogFragment validateVaultPasscodeDialogFragment = ValidateVaultPasscodeDialogFragment.this;
                                        g.f(validateVaultPasscodeDialogFragment, "this$0");
                                        m0 m0Var2 = m0Var;
                                        g.f(m0Var2, "$this_setupListeners");
                                        validateVaultPasscodeDialogFragment.j0(m0Var2);
                                    }
                                });
                                materialButton.setOnClickListener(new View.OnClickListener() { // from class: g7.c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i11 = ValidateVaultPasscodeDialogFragment.f9914v0;
                                        ValidateVaultPasscodeDialogFragment validateVaultPasscodeDialogFragment = ValidateVaultPasscodeDialogFragment.this;
                                        g.f(validateVaultPasscodeDialogFragment, "this$0");
                                        m0 m0Var2 = m0Var;
                                        g.f(m0Var2, "$this_setupListeners");
                                        validateVaultPasscodeDialogFragment.h0(m0Var2);
                                    }
                                });
                                g.e(nestedScrollView, "root");
                                return nestedScrollView;
                            }
                            i10 = R.id.til;
                        } else {
                            i10 = R.id.tb;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
