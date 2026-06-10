package com.noto.app.vault;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.s;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import s6.r0;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "passcode", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.vault.VaultPasscodeDialogFragment$setupState$1", f = "VaultPasscodeDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class VaultPasscodeDialogFragment$setupState$1 extends SuspendLambda implements p<String, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9927m;
    public final /* synthetic */ r0 n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ VaultPasscodeDialogFragment f9928o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultPasscodeDialogFragment$setupState$1(r0 r0Var, VaultPasscodeDialogFragment vaultPasscodeDialogFragment, p7.c<? super VaultPasscodeDialogFragment$setupState$1> cVar) {
        super(2, cVar);
        this.n = r0Var;
        this.f9928o = vaultPasscodeDialogFragment;
    }

    @Override // u7.p
    public final Object R(String str, p7.c<? super n> cVar) {
        return ((VaultPasscodeDialogFragment$setupState$1) a(str, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        VaultPasscodeDialogFragment$setupState$1 vaultPasscodeDialogFragment$setupState$1 = new VaultPasscodeDialogFragment$setupState$1(this.n, this.f9928o, cVar);
        vaultPasscodeDialogFragment$setupState$1.f9927m = obj;
        return vaultPasscodeDialogFragment$setupState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        TextInputEditText textInputEditText;
        s c;
        String str;
        b.n1(obj);
        String str2 = (String) this.f9927m;
        VaultPasscodeDialogFragment vaultPasscodeDialogFragment = this.f9928o;
        r0 r0Var = this.n;
        if (str2 == null) {
            MaterialTextView materialTextView = r0Var.f17466e;
            g.e(materialTextView, "tvCurrentPasscode");
            materialTextView.setVisibility(8);
            TextInputLayout textInputLayout = r0Var.c;
            g.e(textInputLayout, "tilCurrentPasscode");
            textInputLayout.setVisibility(8);
            textInputEditText = r0Var.f17464b;
            textInputEditText.requestFocus();
            c = vaultPasscodeDialogFragment.c();
            if (c != null) {
                str = "etNewPasscode";
                g.e(textInputEditText, str);
                ViewUtilsKt.v(c, textInputEditText);
            }
        } else {
            MaterialTextView materialTextView2 = r0Var.f17466e;
            g.e(materialTextView2, "tvCurrentPasscode");
            materialTextView2.setVisibility(0);
            TextInputLayout textInputLayout2 = r0Var.c;
            g.e(textInputLayout2, "tilCurrentPasscode");
            textInputLayout2.setVisibility(0);
            textInputEditText = r0Var.f17463a;
            textInputEditText.requestFocus();
            c = vaultPasscodeDialogFragment.c();
            if (c != null) {
                str = "etCurrentPasscode";
                g.e(textInputEditText, str);
                ViewUtilsKt.v(c, textInputEditText);
            }
        }
        return n.f16010a;
    }
}
