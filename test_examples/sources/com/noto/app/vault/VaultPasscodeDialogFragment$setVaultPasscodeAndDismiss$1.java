package com.noto.app.vault;

import android.content.Context;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import com.google.android.material.textfield.TextInputEditText;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import s6.r0;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class VaultPasscodeDialogFragment$setVaultPasscodeAndDismiss$1 extends Lambda implements l<Throwable, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ VaultPasscodeDialogFragment f9925j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ r0 f9926k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultPasscodeDialogFragment$setVaultPasscodeAndDismiss$1(r0 r0Var, VaultPasscodeDialogFragment vaultPasscodeDialogFragment) {
        super(1);
        this.f9925j = vaultPasscodeDialogFragment;
        this.f9926k = r0Var;
    }

    @Override // u7.l
    public final n U(Throwable th) {
        View view;
        Throwable th2 = th;
        VaultPasscodeDialogFragment vaultPasscodeDialogFragment = this.f9925j;
        Fragment fragment = vaultPasscodeDialogFragment.C;
        if (fragment != null) {
            view = fragment.M;
        } else {
            view = null;
        }
        View view2 = view;
        Context j2 = vaultPasscodeDialogFragment.j();
        if (j2 != null && view2 != null) {
            ViewUtilsKt.w(view2, q.f(j2, R.string.vault_passcode_has_changed, new Object[0]), Integer.valueOf((int) R.drawable.ic_round_password_24), null, null, 28);
        }
        s c = vaultPasscodeDialogFragment.c();
        r0 r0Var = this.f9926k;
        if (c != null) {
            TextInputEditText textInputEditText = r0Var.f17464b;
            g.e(textInputEditText, "etNewPasscode");
            ViewUtilsKt.h(c, textInputEditText);
        }
        s c10 = vaultPasscodeDialogFragment.c();
        if (c10 != null) {
            TextInputEditText textInputEditText2 = r0Var.f17463a;
            g.e(textInputEditText2, "etCurrentPasscode");
            ViewUtilsKt.h(c10, textInputEditText2);
        }
        vaultPasscodeDialogFragment.Z();
        return n.f16010a;
    }
}
