package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import n4.g;
import o4.a0;
import x4.l;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f6233a = g.f("ConstrntProxyUpdtRecvr");

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Intent f6234i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Context f6235j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f6236k;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f6234i = intent;
            this.f6235j = context;
            this.f6236k = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.f6236k;
            Context context = this.f6235j;
            Intent intent = this.f6234i;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                g.d().a(ConstraintProxyUpdateReceiver.f6233a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                l.a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                l.a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                l.a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                l.a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            g d5 = g.d();
            d5.a(f6233a, "Ignoring unknown action " + str);
            return;
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        ((y4.b) a0.d(context).f16282d).a(new a(intent, context, goAsync));
    }
}
