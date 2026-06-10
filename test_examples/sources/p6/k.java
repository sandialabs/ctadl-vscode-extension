package p6;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* loaded from: classes.dex */
public final class k extends z3.b {
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final z3.a f16772d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i10) {
        super(15, 16);
        this.c = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.f16772d = new ma.i();
                    return;
                }
                super(24, 25);
                this.f16772d = new o9.a();
                return;
            }
            super(21, 22);
            this.f16772d = new f();
            return;
        }
        super(18, 19);
        this.f16772d = new e();
    }

    @Override // z3.b
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        int i10 = this.c;
        z3.a aVar = this.f16772d;
        switch (i10) {
            case 0:
                frameworkSQLiteDatabase.g("DROP TABLE `labels`");
                frameworkSQLiteDatabase.g("DROP TABLE `noto_labels`");
                aVar.f(frameworkSQLiteDatabase);
                return;
            case 1:
                frameworkSQLiteDatabase.g("ALTER TABLE `noto_labels` RENAME TO `note_labels`");
                aVar.f(frameworkSQLiteDatabase);
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `_new_libraries` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `position` INTEGER NOT NULL, `color` INTEGER NOT NULL, `creation_date` TEXT NOT NULL, `layout` INTEGER NOT NULL DEFAULT 0, `note_preview_size` INTEGER NOT NULL DEFAULT 15, `is_archived` INTEGER NOT NULL DEFAULT 0, `is_pinned` INTEGER NOT NULL DEFAULT 0, `is_show_note_creation_date` INTEGER NOT NULL DEFAULT 0, `is_set_new_note_cursor_on_title` INTEGER NOT NULL DEFAULT 0, `sorting_type` INTEGER NOT NULL DEFAULT 1, `sorting_order` INTEGER NOT NULL DEFAULT 1, `grouping` INTEGER NOT NULL DEFAULT 0)");
                frameworkSQLiteDatabase.g("INSERT INTO `_new_libraries` (`id`,`title`,`position`,`color`,`creation_date`,`layout`,`note_preview_size`,`is_archived`,`is_pinned`,`is_show_note_creation_date`,`is_set_new_note_cursor_on_title`,`sorting_type`,`sorting_order`,`grouping`) SELECT `id`,`title`,`position`,`color`,`creation_date`,`layout`,`note_preview_size`,`is_archived`,`is_pinned`,`is_show_note_creation_date`,`is_set_new_note_cursor_on_title`,`sorting`,`sorting_order`,`grouping` FROM `libraries`");
                frameworkSQLiteDatabase.g("DROP TABLE `libraries`");
                frameworkSQLiteDatabase.g("ALTER TABLE `_new_libraries` RENAME TO `libraries`");
                aVar.f(frameworkSQLiteDatabase);
                return;
            default:
                frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `_new_libraries` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `position` INTEGER NOT NULL, `color` INTEGER NOT NULL, `creation_date` TEXT NOT NULL, `layout` INTEGER NOT NULL DEFAULT 0, `note_preview_size` INTEGER NOT NULL DEFAULT 15, `is_archived` INTEGER NOT NULL DEFAULT 0, `is_pinned` INTEGER NOT NULL DEFAULT 0, `is_show_note_creation_date` INTEGER NOT NULL DEFAULT 0, `new_note_cursor_position` INTEGER NOT NULL DEFAULT 0, `sorting_type` INTEGER NOT NULL DEFAULT 1, `sorting_order` INTEGER NOT NULL DEFAULT 1, `grouping` INTEGER NOT NULL DEFAULT 0, `is_vaulted` INTEGER NOT NULL DEFAULT 0)");
                frameworkSQLiteDatabase.g("INSERT INTO `_new_libraries` (`id`,`title`,`position`,`color`,`creation_date`,`layout`,`note_preview_size`,`is_archived`,`is_pinned`,`is_show_note_creation_date`,`new_note_cursor_position`,`sorting_type`,`sorting_order`,`grouping`,`is_vaulted`) SELECT `id`,`title`,`position`,`color`,`creation_date`,`layout`,`note_preview_size`,`is_archived`,`is_pinned`,`is_show_note_creation_date`,`is_set_new_note_cursor_on_title`,`sorting_type`,`sorting_order`,`grouping`,`is_vaulted` FROM `libraries`");
                frameworkSQLiteDatabase.g("DROP TABLE `libraries`");
                frameworkSQLiteDatabase.g("ALTER TABLE `_new_libraries` RENAME TO `libraries`");
                aVar.f(frameworkSQLiteDatabase);
                return;
        }
    }
}
