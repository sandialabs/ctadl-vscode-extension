package m2;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* loaded from: classes.dex */
public final class h {
    public static void a(AlarmManager alarmManager, int i10, long j2, PendingIntent pendingIntent) {
        alarmManager.setAndAllowWhileIdle(i10, j2, pendingIntent);
    }

    public static void b(AlarmManager alarmManager, int i10, long j2, PendingIntent pendingIntent) {
        alarmManager.setExactAndAllowWhileIdle(i10, j2, pendingIntent);
    }
}
