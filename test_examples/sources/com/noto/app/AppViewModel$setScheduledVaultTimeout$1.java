package com.noto.app;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.VaultTimeout;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u6.e;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.AppViewModel$setScheduledVaultTimeout$1", f = "AppViewModel.kt", l = {86}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AppViewModel$setScheduledVaultTimeout$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f7574m;
    public final /* synthetic */ AppViewModel n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ VaultTimeout f7575o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppViewModel$setScheduledVaultTimeout$1(AppViewModel appViewModel, VaultTimeout vaultTimeout, p7.c<? super AppViewModel$setScheduledVaultTimeout$1> cVar) {
        super(2, cVar);
        this.n = appViewModel;
        this.f7575o = vaultTimeout;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((AppViewModel$setScheduledVaultTimeout$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new AppViewModel$setScheduledVaultTimeout$1(this.n, this.f7575o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f7574m;
        if (i10 != 0) {
            if (i10 == 1) {
                b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.n1(obj);
            e eVar = this.n.f7546f;
            this.f7574m = 1;
            if (eVar.B(this.f7575o, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}
