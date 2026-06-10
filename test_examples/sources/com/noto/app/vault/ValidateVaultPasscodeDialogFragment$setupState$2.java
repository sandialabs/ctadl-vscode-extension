package com.noto.app.vault;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import s6.m0;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isScrolling", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.vault.ValidateVaultPasscodeDialogFragment$setupState$2", f = "ValidateVaultPasscodeDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ValidateVaultPasscodeDialogFragment$setupState$2 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f9921m;
    public final /* synthetic */ m0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateVaultPasscodeDialogFragment$setupState$2(m0 m0Var, p7.c<? super ValidateVaultPasscodeDialogFragment$setupState$2> cVar) {
        super(2, cVar);
        this.n = m0Var;
    }

    @Override // u7.p
    public final Object R(Boolean bool, p7.c<? super n> cVar) {
        return ((ValidateVaultPasscodeDialogFragment$setupState$2) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ValidateVaultPasscodeDialogFragment$setupState$2 validateVaultPasscodeDialogFragment$setupState$2 = new ValidateVaultPasscodeDialogFragment$setupState$2(this.n, cVar);
        validateVaultPasscodeDialogFragment$setupState$2.f9921m = ((Boolean) obj).booleanValue();
        return validateVaultPasscodeDialogFragment$setupState$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        this.n.c.f17311b.setSelected(this.f9921m);
        return n.f16010a;
    }
}
