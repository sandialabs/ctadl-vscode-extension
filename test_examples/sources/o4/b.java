package o4;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* loaded from: classes.dex */
public final class b extends RoomDatabase.b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f16289a = new b();

    @Override // androidx.room.RoomDatabase.b
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.e();
        try {
            frameworkSQLiteDatabase.g("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - w.f16354a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            frameworkSQLiteDatabase.x();
        } finally {
            frameworkSQLiteDatabase.d();
        }
    }
}
