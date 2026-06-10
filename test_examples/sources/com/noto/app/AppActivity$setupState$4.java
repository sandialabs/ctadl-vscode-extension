package com.noto.app;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.VaultTimeout;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.e;
import m7.n;
import n4.h;
import n4.j;
import q7.c;
import u7.r;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"", "isVaultOpen", "Lcom/noto/app/domain/model/VaultTimeout;", "vaultTimeout", "scheduledVaultTimeout", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.AppActivity$setupState$4", f = "AppActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AppActivity$setupState$4 extends SuspendLambda implements r<Boolean, VaultTimeout, VaultTimeout, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f7536m;
    public /* synthetic */ VaultTimeout n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ VaultTimeout f7537o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ AppActivity f7538p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppActivity$setupState$4(AppActivity appActivity, p7.c<? super AppActivity$setupState$4> cVar) {
        super(4, cVar);
        this.f7538p = appActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        AppViewModel q10;
        VaultTimeout vaultTimeout;
        b.n1(obj);
        boolean z10 = this.f7536m;
        VaultTimeout vaultTimeout2 = this.n;
        if (vaultTimeout2 != this.f7537o) {
            AppActivity appActivity = this.f7538p;
            ((j) appActivity.L.getValue()).a();
            if (z10) {
                int ordinal = vaultTimeout2.ordinal();
                e eVar = appActivity.L;
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            q10 = appActivity.q();
                            vaultTimeout = null;
                        } else {
                            j jVar = (j) eVar.getValue();
                            h s10 = AppActivity.s(appActivity, 12L, TimeUnit.HOURS);
                            jVar.getClass();
                            jVar.b(Collections.singletonList(s10));
                            q10 = appActivity.q();
                            vaultTimeout = VaultTimeout.After12Hours;
                        }
                    } else {
                        j jVar2 = (j) eVar.getValue();
                        h s11 = AppActivity.s(appActivity, 4L, TimeUnit.HOURS);
                        jVar2.getClass();
                        jVar2.b(Collections.singletonList(s11));
                        q10 = appActivity.q();
                        vaultTimeout = VaultTimeout.After4Hours;
                    }
                } else {
                    j jVar3 = (j) eVar.getValue();
                    h s12 = AppActivity.s(appActivity, 1L, TimeUnit.HOURS);
                    jVar3.getClass();
                    jVar3.b(Collections.singletonList(s12));
                    q10 = appActivity.q();
                    vaultTimeout = VaultTimeout.After1Hour;
                }
                q10.f(vaultTimeout);
            }
        }
        return n.f16010a;
    }

    @Override // u7.r
    public final Object l0(Boolean bool, VaultTimeout vaultTimeout, VaultTimeout vaultTimeout2, p7.c<? super n> cVar) {
        boolean booleanValue = bool.booleanValue();
        AppActivity$setupState$4 appActivity$setupState$4 = new AppActivity$setupState$4(this.f7538p, cVar);
        appActivity$setupState$4.f7536m = booleanValue;
        appActivity$setupState$4.n = vaultTimeout;
        appActivity$setupState$4.f7537o = vaultTimeout2;
        return appActivity$setupState$4.k(n.f16010a);
    }
}
