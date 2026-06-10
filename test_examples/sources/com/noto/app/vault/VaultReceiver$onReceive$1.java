package com.noto.app.vault;

import android.app.NotificationManager;
import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u6.e;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.vault.VaultReceiver$onReceive$1", f = "VaultReceiver.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class VaultReceiver$onReceive$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f9931m;
    public final /* synthetic */ Context n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ VaultReceiver f9932o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultReceiver$onReceive$1(Context context, VaultReceiver vaultReceiver, p7.c<? super VaultReceiver$onReceive$1> cVar) {
        super(2, cVar);
        this.n = context;
        this.f9932o = vaultReceiver;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((VaultReceiver$onReceive$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new VaultReceiver$onReceive$1(this.n, this.f9932o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9931m;
        if (i10 != 0) {
            if (i10 == 1) {
                b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.n1(obj);
            NotificationManager notificationManager = null;
            Context context = this.n;
            if (context != null) {
                obj2 = context.getSystemService("notification");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof NotificationManager) {
                notificationManager = obj2;
            }
            if (notificationManager != null) {
                notificationManager.cancel(-1);
            }
            this.f9931m = 1;
            if (((e) this.f9932o.f9929i.getValue()).J(false, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}
