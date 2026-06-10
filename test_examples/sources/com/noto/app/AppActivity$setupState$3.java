package com.noto.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.m;
import androidx.navigation.s;
import com.noto.R;
import com.noto.app.vault.VaultReceiver;
import f7.f;
import f7.h;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m2.m;
import m2.o;
import m7.n;
import q7.c;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isVaultOpen", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.AppActivity$setupState$3", f = "AppActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AppActivity$setupState$3 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f7535m;
    public final /* synthetic */ AppActivity n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppActivity$setupState$3(AppActivity appActivity, p7.c<? super AppActivity$setupState$3> cVar) {
        super(2, cVar);
        this.n = appActivity;
    }

    @Override // u7.p
    public final Object R(Boolean bool, p7.c<? super n> cVar) {
        return ((AppActivity$setupState$3) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        AppActivity$setupState$3 appActivity$setupState$3 = new AppActivity$setupState$3(this.n, cVar);
        appActivity$setupState$3.f7535m = ((Boolean) obj).booleanValue();
        return appActivity$setupState$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        boolean z10 = this.f7535m;
        AppActivity appActivity = this.n;
        if (z10) {
            int i10 = AppActivity.N;
            NotificationManager v3 = appActivity.v();
            g.f(v3, "<this>");
            Intent intent = new Intent(appActivity, VaultReceiver.class);
            int i11 = h.f10949a;
            m mVar = new m(q.f(appActivity, R.string.close_vault, new Object[0]), PendingIntent.getBroadcast(appActivity, 0, intent, i11));
            androidx.navigation.m mVar2 = new androidx.navigation.m(appActivity);
            mVar2.c = new s(appActivity, new m.a()).c(R.navigation.nav_graph);
            if (mVar2.f5508d != 0) {
                mVar2.b();
            }
            mVar2.f5508d = R.id.mainVaultFragment;
            if (mVar2.c != null) {
                mVar2.b();
            }
            mVar2.f5507b.setComponent(f.d(appActivity));
            PendingIntent d5 = mVar2.a().d(i11);
            o oVar = new o(appActivity, "Vault");
            oVar.f15940e = o.b(q.f(appActivity, R.string.vault_is_open, new Object[0]));
            oVar.f15942g = d5;
            oVar.f15938b.add(mVar);
            oVar.f15950p = "status";
            oVar.f15956v.icon = R.drawable.ic_round_shield_24;
            oVar.f15943h = -1;
            oVar.c(2);
            Notification a10 = oVar.a();
            g.e(a10, "Builder(context, VaultCh…ng(true)\n        .build()");
            v3.notify(-1, a10);
        } else {
            int i12 = AppActivity.N;
            NotificationManager v10 = appActivity.v();
            g.f(v10, "<this>");
            v10.cancel(-1);
        }
        return n.f16010a;
    }
}
