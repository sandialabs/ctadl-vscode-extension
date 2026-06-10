package o4;

import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* loaded from: classes.dex */
public final class e extends z3.b {
    public static final e c = new e();

    public e() {
        super(12, 13);
    }

    @Override // z3.b
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.g("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        frameworkSQLiteDatabase.g("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
