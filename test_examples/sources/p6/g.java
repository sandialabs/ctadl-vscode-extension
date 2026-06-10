package p6;

import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* loaded from: classes.dex */
public final class g extends z3.b {
    public static final g c = new g();

    public g() {
        super(30, 31);
    }

    @Override // z3.b
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.e();
        try {
            frameworkSQLiteDatabase.g("CREATE TABLE notes_tmp(\n   id INTEGER NOT NULL PRIMARY KEY, \n   folder_id INTEGER NOT NULL REFERENCES folders(id) ON DELETE CASCADE,\n   title TEXT NOT NULL,\n   body TEXT NOT NULL,\n   position INTEGER NOT NULL,\n   creation_date TEXT NOT NULL,\n   is_pinned INTEGER NOT NULL DEFAULT 0,\n   is_archived INTEGER NOT NULL DEFAULT 0,\n   reminder_date TEXT DEFAULT NULL,\n   is_vaulted INTEGER NOT NULL DEFAULT 0,\n   access_date TEXT     NOT NULL DEFAULT 'creation_date',\n   scrolling_position INTEGER NOT NULL DEFAULT 0\n);");
            frameworkSQLiteDatabase.g("INSERT INTO notes_tmp \nSELECT \n id, folder_id, title, body, position, creation_date,\n is_pinned, is_archived, reminder_date,\n is_vaulted,\n CASE WHEN access_date IS NULL THEN creation_date ELSE access_date END,\n scrolling_position FROM notes;");
            frameworkSQLiteDatabase.g("DROP TABLE notes;");
            frameworkSQLiteDatabase.g("ALTER TABLE notes_tmp RENAME TO notes;");
            frameworkSQLiteDatabase.x();
        } finally {
            frameworkSQLiteDatabase.d();
        }
    }
}
