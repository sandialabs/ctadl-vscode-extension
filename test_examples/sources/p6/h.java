package p6;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* loaded from: classes.dex */
public final class h extends z3.b {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i10) {
        super(10, 11);
        this.c = i10;
        switch (i10) {
            case 1:
                super(16, 17);
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                super(19, 20);
                return;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                super(22, 23);
                return;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                super(25, 26);
                return;
            case 5:
                super(28, 29);
                return;
            case 6:
                super(6, 7);
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                super(9, 10);
                return;
            default:
                return;
        }
    }

    @Override // z3.b
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        switch (this.c) {
            case 0:
                frameworkSQLiteDatabase.g("ALTER TABLE `libraries` ADD COLUMN `is_show_note_creation_date` INTEGER NOT NULL DEFAULT 0");
                return;
            case 1:
                frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `labels` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `library_id` INTEGER NOT NULL, `title` TEXT NOT NULL, `color` INTEGER NOT NULL, FOREIGN KEY(`library_id`) REFERENCES `libraries`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `noto_labels` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `note_id` INTEGER NOT NULL, `label_id` INTEGER NOT NULL, FOREIGN KEY(`note_id`) REFERENCES `notes`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`label_id`) REFERENCES `labels`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                frameworkSQLiteDatabase.g("ALTER TABLE `libraries` ADD COLUMN `grouping` INTEGER NOT NULL DEFAULT 0");
                return;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                frameworkSQLiteDatabase.g("ALTER TABLE `notes` ADD COLUMN `is_vaulted` INTEGER NOT NULL DEFAULT 0");
                frameworkSQLiteDatabase.g("ALTER TABLE `libraries` ADD COLUMN `is_vaulted` INTEGER NOT NULL DEFAULT 0");
                return;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                frameworkSQLiteDatabase.g("ALTER TABLE `libraries` ADD COLUMN `parent_id` INTEGER DEFAULT NULL");
                return;
            case 5:
                frameworkSQLiteDatabase.g("ALTER TABLE `folders` ADD COLUMN `scrolling_position` INTEGER NOT NULL DEFAULT 0");
                frameworkSQLiteDatabase.g("ALTER TABLE `notes` ADD COLUMN `scrolling_position` INTEGER NOT NULL DEFAULT 0");
                return;
            case 6:
                frameworkSQLiteDatabase.g("ALTER TABLE `libraries` ADD COLUMN `layout_manager` INTEGER NOT NULL DEFAULT 0");
                return;
            default:
                frameworkSQLiteDatabase.g("ALTER TABLE `libraries` ADD COLUMN `is_pinned` INTEGER NOT NULL DEFAULT 0");
                return;
        }
    }
}
