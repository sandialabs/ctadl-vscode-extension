package p6;

import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* loaded from: classes.dex */
public final class j extends z3.b {
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final z3.a f16771d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i10) {
        super(14, 15);
        this.c = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                this.f16771d = new m0.b();
                return;
            }
            super(26, 27);
            this.f16771d = new d();
            return;
        }
        super(20, 21);
        this.f16771d = new c();
    }

    @Override // z3.b
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        int i10 = this.c;
        z3.a aVar = this.f16771d;
        switch (i10) {
            case 0:
                frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `_new_libraries` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `position` INTEGER NOT NULL, `color` INTEGER NOT NULL, `creation_date` TEXT NOT NULL, `layout_manager` INTEGER NOT NULL DEFAULT 0, `note_preview_size` INTEGER NOT NULL DEFAULT 15, `is_archived` INTEGER NOT NULL DEFAULT 0, `is_pinned` INTEGER NOT NULL DEFAULT 0, `is_show_note_creation_date` INTEGER NOT NULL DEFAULT 0, `is_set_new_note_cursor_on_title` INTEGER NOT NULL DEFAULT 0, `sorting` INTEGER NOT NULL DEFAULT 1, `sorting_order` INTEGER NOT NULL DEFAULT 1)");
                frameworkSQLiteDatabase.g("INSERT INTO `_new_libraries` (`id`,`title`,`position`,`color`,`creation_date`,`layout_manager`,`note_preview_size`,`is_archived`,`is_pinned`,`is_show_note_creation_date`,`is_set_new_note_cursor_on_title`,`sorting`,`sorting_order`) SELECT `id`,`title`,`position`,`color`,`creation_date`,`layout_manager`,`note_preview_size`,`is_archived`,`is_pinned`,`is_show_note_creation_date`,`is_set_new_note_cursor_on_title`,`sorting`,`sorting_order` FROM `libraries`");
                frameworkSQLiteDatabase.g("DROP TABLE `libraries`");
                frameworkSQLiteDatabase.g("ALTER TABLE `_new_libraries` RENAME TO `libraries`");
                aVar.f(frameworkSQLiteDatabase);
                return;
            case 1:
                frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `_new_libraries` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `position` INTEGER NOT NULL, `color` INTEGER NOT NULL, `creation_date` TEXT NOT NULL, `layout` INTEGER NOT NULL DEFAULT 0, `note_preview_size` INTEGER NOT NULL DEFAULT 15, `is_archived` INTEGER NOT NULL DEFAULT 0, `is_pinned` INTEGER NOT NULL DEFAULT 0, `is_show_note_creation_date` INTEGER NOT NULL DEFAULT 0, `is_set_new_note_cursor_on_title` INTEGER NOT NULL DEFAULT 0, `sorting` INTEGER NOT NULL DEFAULT 1, `sorting_order` INTEGER NOT NULL DEFAULT 1, `grouping` INTEGER NOT NULL DEFAULT 0)");
                frameworkSQLiteDatabase.g("INSERT INTO `_new_libraries` (`id`,`title`,`position`,`color`,`creation_date`,`layout`,`note_preview_size`,`is_archived`,`is_pinned`,`is_show_note_creation_date`,`is_set_new_note_cursor_on_title`,`sorting`,`sorting_order`,`grouping`) SELECT `id`,`title`,`position`,`color`,`creation_date`,`layout_manager`,`note_preview_size`,`is_archived`,`is_pinned`,`is_show_note_creation_date`,`is_set_new_note_cursor_on_title`,`sorting`,`sorting_order`,`grouping` FROM `libraries`");
                frameworkSQLiteDatabase.g("DROP TABLE `libraries`");
                frameworkSQLiteDatabase.g("ALTER TABLE `_new_libraries` RENAME TO `libraries`");
                aVar.f(frameworkSQLiteDatabase);
                return;
            default:
                frameworkSQLiteDatabase.g("ALTER TABLE `libraries` RENAME TO `folders`");
                frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `_new_notes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `folder_id` INTEGER NOT NULL, `title` TEXT NOT NULL, `body` TEXT NOT NULL, `position` INTEGER NOT NULL, `creation_date` TEXT NOT NULL, `is_pinned` INTEGER NOT NULL, `is_archived` INTEGER NOT NULL, `reminder_date` TEXT, `is_vaulted` INTEGER NOT NULL DEFAULT 0, `access_date` TEXT DEFAULT NULL, FOREIGN KEY(`folder_id`) REFERENCES `folders`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                frameworkSQLiteDatabase.g("INSERT INTO `_new_notes` (`id`,`folder_id`,`title`,`body`,`position`,`creation_date`,`is_pinned`,`is_archived`,`reminder_date`,`is_vaulted`,`access_date`) SELECT `id`,`library_id`,`title`,`body`,`position`,`creation_date`,`is_pinned`,`is_archived`,`reminder_date`,`is_vaulted`,`access_date` FROM `notes`");
                frameworkSQLiteDatabase.g("DROP TABLE `notes`");
                frameworkSQLiteDatabase.g("ALTER TABLE `_new_notes` RENAME TO `notes`");
                v8.b.s(frameworkSQLiteDatabase, "notes");
                frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `_new_labels` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `folder_id` INTEGER NOT NULL, `title` TEXT NOT NULL, `color` INTEGER NOT NULL, `position` INTEGER NOT NULL DEFAULT 0, FOREIGN KEY(`folder_id`) REFERENCES `folders`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                frameworkSQLiteDatabase.g("INSERT INTO `_new_labels` (`id`,`folder_id`,`title`,`color`,`position`) SELECT `id`,`library_id`,`title`,`color`,`position` FROM `labels`");
                frameworkSQLiteDatabase.g("DROP TABLE `labels`");
                frameworkSQLiteDatabase.g("ALTER TABLE `_new_labels` RENAME TO `labels`");
                v8.b.s(frameworkSQLiteDatabase, "labels");
                aVar.f(frameworkSQLiteDatabase);
                return;
        }
    }
}
