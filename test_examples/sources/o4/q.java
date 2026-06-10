package o4;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* loaded from: classes.dex */
public final class q extends z3.b {
    public final /* synthetic */ int c = 1;

    /* renamed from: d  reason: collision with root package name */
    public final Context f16341d;

    public q(Context context) {
        super(9, 10);
        this.f16341d = context;
    }

    @Override // z3.b
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        int i10 = this.c;
        Context context = this.f16341d;
        switch (i10) {
            case 0:
                if (this.f19116b >= 10) {
                    frameworkSQLiteDatabase.a(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j2 = 0;
                    long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                        j2 = 1;
                    }
                    frameworkSQLiteDatabase.e();
                    try {
                        frameworkSQLiteDatabase.a(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                        frameworkSQLiteDatabase.a(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        frameworkSQLiteDatabase.x();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i11 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i12 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    frameworkSQLiteDatabase.e();
                    try {
                        frameworkSQLiteDatabase.a(new Object[]{"next_job_scheduler_id", Integer.valueOf(i11)});
                        frameworkSQLiteDatabase.a(new Object[]{"next_alarm_manager_id", Integer.valueOf(i12)});
                        sharedPreferences2.edit().clear().apply();
                        frameworkSQLiteDatabase.x();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public q(Context context, int i10, int i11) {
        super(i10, i11);
        this.f16341d = context;
    }
}
