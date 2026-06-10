package p6;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* loaded from: classes.dex */
public final class i extends z3.b {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i10) {
        super(11, 12);
        this.c = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    } else {
                        super(7, 8);
                        return;
                    }
                }
                super(29, 30);
                return;
            }
            super(23, 24);
            return;
        }
        super(17, 18);
    }

    @Override // z3.b
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        switch (this.c) {
            case 0:
                frameworkSQLiteDatabase.g("ALTER TABLE `libraries` ADD COLUMN `sorting` INTEGER NOT NULL DEFAULT 1");
                frameworkSQLiteDatabase.g("ALTER TABLE `libraries` ADD COLUMN `sorting_order` INTEGER NOT NULL DEFAULT 1");
                return;
            case 1:
                frameworkSQLiteDatabase.g("ALTER TABLE `labels` ADD COLUMN `position` INTEGER NOT NULL DEFAULT 0");
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                frameworkSQLiteDatabase.g("ALTER TABLE `notes` ADD COLUMN `access_date` TEXT DEFAULT NULL");
                return;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                frameworkSQLiteDatabase.g("ALTER TABLE `folders` ADD COLUMN `filtering_type` INTEGER NOT NULL DEFAULT 0");
                return;
            default:
                frameworkSQLiteDatabase.g("ALTER TABLE `libraries` ADD COLUMN `note_preview_size` INTEGER NOT NULL DEFAULT 15");
                return;
        }
    }
}
