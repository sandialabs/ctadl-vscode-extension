package m2;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* loaded from: classes.dex */
public final class g {
    public static void a(AlarmManager alarmManager, int i10, long j2, PendingIntent pendingIntent) {
        alarmManager.setExact(i10, j2, pendingIntent);
    }
}
