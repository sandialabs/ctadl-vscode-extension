package o4;

import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* loaded from: classes.dex */
public final class z extends z3.b {
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final z3.a f16357d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i10) {
        super(14, 15);
        this.c = i10;
        if (i10 != 1) {
            this.f16357d = new ja.y();
            return;
        }
        super(13, 14);
        this.f16357d = new p6.b();
    }

    @Override // z3.b
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        int i10 = this.c;
        z3.a aVar = this.f16357d;
        switch (i10) {
            case 0:
                frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                frameworkSQLiteDatabase.g("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                frameworkSQLiteDatabase.g("DROP TABLE `WorkSpec`");
                frameworkSQLiteDatabase.g("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                frameworkSQLiteDatabase.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                frameworkSQLiteDatabase.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                aVar.f(frameworkSQLiteDatabase);
                return;
            default:
                frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `_new_notes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `library_id` INTEGER NOT NULL, `title` TEXT NOT NULL, `body` TEXT NOT NULL, `position` INTEGER NOT NULL, `creation_date` TEXT NOT NULL, `is_pinned` INTEGER NOT NULL, `is_archived` INTEGER NOT NULL, `reminder_date` TEXT, FOREIGN KEY(`library_id`) REFERENCES `libraries`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                frameworkSQLiteDatabase.g("INSERT INTO `_new_notes` (`id`,`library_id`,`title`,`body`,`position`,`creation_date`,`is_pinned`,`is_archived`,`reminder_date`) SELECT `id`,`library_id`,`title`,`body`,`position`,`creation_date`,`is_starred`,`is_archived`,`reminder_date` FROM `notes`");
                frameworkSQLiteDatabase.g("DROP TABLE `notes`");
                frameworkSQLiteDatabase.g("ALTER TABLE `_new_notes` RENAME TO `notes`");
                v8.b.s(frameworkSQLiteDatabase, "notes");
                aVar.f(frameworkSQLiteDatabase);
                return;
        }
    }
}
