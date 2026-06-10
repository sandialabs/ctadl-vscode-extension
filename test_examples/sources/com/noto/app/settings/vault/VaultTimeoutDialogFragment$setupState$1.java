package com.noto.app.settings.vault;

import android.widget.RadioButton;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.VaultTimeout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import s6.q0;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/noto/app/domain/model/VaultTimeout;", "timeout", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.settings.vault.VaultTimeoutDialogFragment$setupState$1", f = "VaultTimeoutDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class VaultTimeoutDialogFragment$setupState$1 extends SuspendLambda implements p<VaultTimeout, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9798m;
    public final /* synthetic */ q0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultTimeoutDialogFragment$setupState$1(q0 q0Var, p7.c<? super VaultTimeoutDialogFragment$setupState$1> cVar) {
        super(2, cVar);
        this.n = q0Var;
    }

    @Override // u7.p
    public final Object R(VaultTimeout vaultTimeout, p7.c<? super n> cVar) {
        return ((VaultTimeoutDialogFragment$setupState$1) a(vaultTimeout, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        VaultTimeoutDialogFragment$setupState$1 vaultTimeoutDialogFragment$setupState$1 = new VaultTimeoutDialogFragment$setupState$1(this.n, cVar);
        vaultTimeoutDialogFragment$setupState$1.f9798m = obj;
        return vaultTimeoutDialogFragment$setupState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        RadioButton radioButton;
        b.n1(obj);
        int ordinal = ((VaultTimeout) this.f9798m).ordinal();
        q0 q0Var = this.n;
        if (ordinal == 0) {
            radioButton = q0Var.f17459d;
        } else if (ordinal == 1) {
            radioButton = q0Var.f17460e;
        } else if (ordinal == 2) {
            radioButton = q0Var.f17458b;
        } else if (ordinal == 3) {
            radioButton = q0Var.c;
        } else if (ordinal != 4) {
            return n.f16010a;
        } else {
            radioButton = q0Var.f17457a;
        }
        radioButton.setChecked(true);
        return n.f16010a;
    }
}
