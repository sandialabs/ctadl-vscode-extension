package o4;

import android.os.Build;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* loaded from: classes.dex */
public final class h extends z3.b {
    public static final h c = new h();

    public h() {
        super(3, 4);
    }

    @Override // z3.b
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        if (Build.VERSION.SDK_INT >= 23) {
            frameworkSQLiteDatabase.g("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
        }
    }
}
