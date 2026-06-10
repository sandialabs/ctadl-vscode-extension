package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import n4.g;
import o4.a0;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f6237a = g.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        g d5 = g.d();
        String str = f6237a;
        d5.a(str, "Received intent " + intent);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                a0 d10 = a0.d(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                d10.getClass();
                synchronized (a0.f16279m) {
                    d10.f16287i = goAsync;
                    if (d10.f16286h) {
                        goAsync.finish();
                        d10.f16287i = null;
                    }
                }
                return;
            } catch (IllegalStateException e10) {
                g.d().c(f6237a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
                return;
            }
        }
        String str2 = a.f6241m;
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_RESCHEDULE");
        context.startService(intent2);
    }
}
