package q4;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import d.x;
import java.util.concurrent.Callable;
import n4.g;
import w4.i;
import w4.j;
import w4.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f16917a = g.f("Alarms");

    /* renamed from: q4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0213a {
        public static void a(AlarmManager alarmManager, int i10, long j2, PendingIntent pendingIntent) {
            alarmManager.setExact(i10, j2, pendingIntent);
        }
    }

    public static void a(Context context, l lVar, int i10) {
        int i11;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = androidx.work.impl.background.systemalarm.a.f6241m;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        androidx.work.impl.background.systemalarm.a.d(intent, lVar);
        if (Build.VERSION.SDK_INT >= 23) {
            i11 = 603979776;
        } else {
            i11 = 536870912;
        }
        PendingIntent service = PendingIntent.getService(context, i10, intent, i11);
        if (service != null && alarmManager != null) {
            g d5 = g.d();
            d5.a(f16917a, "Cancelling existing alarm with (workSpecId, systemId) (" + lVar + ", " + i10 + ")");
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, WorkDatabase workDatabase, l lVar, long j2) {
        int intValue;
        j t10 = workDatabase.t();
        i a10 = t10.a(lVar);
        if (a10 != null) {
            intValue = a10.c;
            a(context, lVar, intValue);
        } else {
            final x xVar = new x(workDatabase);
            Object o10 = ((WorkDatabase) xVar.f10337a).o(new Callable() { // from class: x4.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    d.x xVar2 = d.x.this;
                    v7.g.f(xVar2, "this$0");
                    return Integer.valueOf(ma.i.i((WorkDatabase) xVar2.f10337a, "next_alarm_manager_id"));
                }
            });
            v7.g.e(o10, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
            intValue = ((Number) o10).intValue();
            t10.c(new i(lVar.f18327b, intValue, lVar.f18326a));
        }
        c(context, lVar, intValue, j2);
    }

    public static void c(Context context, l lVar, int i10, long j2) {
        int i11;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 23) {
            i11 = 201326592;
        } else {
            i11 = 134217728;
        }
        String str = androidx.work.impl.background.systemalarm.a.f6241m;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        androidx.work.impl.background.systemalarm.a.d(intent, lVar);
        PendingIntent service = PendingIntent.getService(context, i10, intent, i11);
        if (alarmManager != null) {
            C0213a.a(alarmManager, 0, j2, service);
        }
    }
}
