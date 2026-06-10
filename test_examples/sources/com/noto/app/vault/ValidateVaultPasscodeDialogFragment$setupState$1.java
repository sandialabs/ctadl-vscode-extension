package com.noto.app.vault;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.s;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import s6.m0;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isBioAuthEnabled", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.vault.ValidateVaultPasscodeDialogFragment$setupState$1", f = "ValidateVaultPasscodeDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ValidateVaultPasscodeDialogFragment$setupState$1 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f9919m;
    public final /* synthetic */ m0 n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ValidateVaultPasscodeDialogFragment f9920o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateVaultPasscodeDialogFragment$setupState$1(m0 m0Var, ValidateVaultPasscodeDialogFragment validateVaultPasscodeDialogFragment, p7.c<? super ValidateVaultPasscodeDialogFragment$setupState$1> cVar) {
        super(2, cVar);
        this.n = m0Var;
        this.f9920o = validateVaultPasscodeDialogFragment;
    }

    @Override // u7.p
    public final Object R(Boolean bool, p7.c<? super n> cVar) {
        return ((ValidateVaultPasscodeDialogFragment$setupState$1) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ValidateVaultPasscodeDialogFragment$setupState$1 validateVaultPasscodeDialogFragment$setupState$1 = new ValidateVaultPasscodeDialogFragment$setupState$1(this.n, this.f9920o, cVar);
        validateVaultPasscodeDialogFragment$setupState$1.f9919m = ((Boolean) obj).booleanValue();
        return validateVaultPasscodeDialogFragment$setupState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        boolean z10 = this.f9919m;
        ValidateVaultPasscodeDialogFragment validateVaultPasscodeDialogFragment = this.f9920o;
        m0 m0Var = this.n;
        if (z10) {
            MaterialButton materialButton = m0Var.f17420a;
            g.e(materialButton, "btnUseBio");
            materialButton.setVisibility(0);
            int i10 = ValidateVaultPasscodeDialogFragment.f9914v0;
            validateVaultPasscodeDialogFragment.h0(m0Var);
        } else {
            MaterialButton materialButton2 = m0Var.f17420a;
            g.e(materialButton2, "btnUseBio");
            materialButton2.setVisibility(8);
            TextInputEditText textInputEditText = m0Var.f17421b;
            textInputEditText.requestFocus();
            s c = validateVaultPasscodeDialogFragment.c();
            if (c != null) {
                g.e(textInputEditText, "et");
                ViewUtilsKt.v(c, textInputEditText);
            }
        }
        return n.f16010a;
    }
}
