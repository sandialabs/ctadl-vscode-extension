package androidx.work.impl;

import a4.a;
import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import c4.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o4.y;
import o4.z;
import v8.b;
import w4.c;
import w4.e;
import w4.g;
import w4.h;
import w4.j;
import w4.k;
import w4.n;
import w4.o;
import w4.q;
import w4.r;
import w4.t;
import w4.u;
import w4.w;
import w4.x;
import y3.f;
import y3.l;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: m  reason: collision with root package name */
    public volatile u f6225m;
    public volatile c n;

    /* renamed from: o  reason: collision with root package name */
    public volatile x f6226o;

    /* renamed from: p  reason: collision with root package name */
    public volatile k f6227p;

    /* renamed from: q  reason: collision with root package name */
    public volatile o f6228q;

    /* renamed from: r  reason: collision with root package name */
    public volatile r f6229r;

    /* renamed from: s  reason: collision with root package name */
    public volatile g f6230s;

    /* loaded from: classes.dex */
    public class a extends l.a {
        public a() {
            super(16);
        }

        @Override // y3.l.a
        public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            frameworkSQLiteDatabase.g("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            frameworkSQLiteDatabase.g("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            frameworkSQLiteDatabase.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            frameworkSQLiteDatabase.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            frameworkSQLiteDatabase.g("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            frameworkSQLiteDatabase.g("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            frameworkSQLiteDatabase.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
        }

        @Override // y3.l.a
        public final void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            frameworkSQLiteDatabase.g("DROP TABLE IF EXISTS `Dependency`");
            frameworkSQLiteDatabase.g("DROP TABLE IF EXISTS `WorkSpec`");
            frameworkSQLiteDatabase.g("DROP TABLE IF EXISTS `WorkTag`");
            frameworkSQLiteDatabase.g("DROP TABLE IF EXISTS `SystemIdInfo`");
            frameworkSQLiteDatabase.g("DROP TABLE IF EXISTS `WorkName`");
            frameworkSQLiteDatabase.g("DROP TABLE IF EXISTS `WorkProgress`");
            frameworkSQLiteDatabase.g("DROP TABLE IF EXISTS `Preference`");
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            List<? extends RoomDatabase.b> list = workDatabase_Impl.f6032g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    workDatabase_Impl.f6032g.get(i10).getClass();
                }
            }
        }

        @Override // y3.l.a
        public final void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            List<? extends RoomDatabase.b> list = workDatabase_Impl.f6032g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    workDatabase_Impl.f6032g.get(i10).getClass();
                }
            }
        }

        @Override // y3.l.a
        public final void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            WorkDatabase_Impl.this.f6027a = frameworkSQLiteDatabase;
            frameworkSQLiteDatabase.g("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.l(frameworkSQLiteDatabase);
            List<? extends RoomDatabase.b> list = WorkDatabase_Impl.this.f6032g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    WorkDatabase_Impl.this.f6032g.get(i10).a(frameworkSQLiteDatabase);
                }
            }
        }

        @Override // y3.l.a
        public final void e() {
        }

        @Override // y3.l.a
        public final void f(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            b.r(frameworkSQLiteDatabase);
        }

        @Override // y3.l.a
        public final l.b g(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new a.C0004a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new a.C0004a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new a.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new a.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            a4.a aVar = new a4.a("Dependency", hashMap, hashSet, hashSet2);
            a4.a a10 = a4.a.a(frameworkSQLiteDatabase, "Dependency");
            if (!aVar.equals(a10)) {
                return new l.b("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + aVar + "\n Found:\n" + a10, false);
            }
            HashMap hashMap2 = new HashMap(27);
            hashMap2.put("id", new a.C0004a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("state", new a.C0004a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new a.C0004a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new a.C0004a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new a.C0004a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new a.C0004a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new a.C0004a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new a.C0004a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new a.C0004a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new a.C0004a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new a.C0004a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new a.C0004a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("last_enqueue_time", new a.C0004a("last_enqueue_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new a.C0004a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new a.C0004a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new a.C0004a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new a.C0004a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_count", new a.C0004a("period_count", "INTEGER", true, 0, "0", 1));
            hashMap2.put("generation", new a.C0004a("generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("required_network_type", new a.C0004a("required_network_type", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_charging", new a.C0004a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new a.C0004a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new a.C0004a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new a.C0004a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new a.C0004a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new a.C0004a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new a.C0004a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new a.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new a.d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            a4.a aVar2 = new a4.a("WorkSpec", hashMap2, hashSet3, hashSet4);
            a4.a a11 = a4.a.a(frameworkSQLiteDatabase, "WorkSpec");
            if (!aVar2.equals(a11)) {
                return new l.b("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + aVar2 + "\n Found:\n" + a11, false);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new a.C0004a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new a.C0004a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new a.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            a4.a aVar3 = new a4.a("WorkTag", hashMap3, hashSet5, hashSet6);
            a4.a a12 = a4.a.a(frameworkSQLiteDatabase, "WorkTag");
            if (!aVar3.equals(a12)) {
                return new l.b("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + aVar3 + "\n Found:\n" + a12, false);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new a.C0004a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("generation", new a.C0004a("generation", "INTEGER", true, 2, "0", 1));
            hashMap4.put("system_id", new a.C0004a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            a4.a aVar4 = new a4.a("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            a4.a a13 = a4.a.a(frameworkSQLiteDatabase, "SystemIdInfo");
            if (!aVar4.equals(a13)) {
                return new l.b("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + aVar4 + "\n Found:\n" + a13, false);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new a.C0004a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new a.C0004a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new a.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            a4.a aVar5 = new a4.a("WorkName", hashMap5, hashSet8, hashSet9);
            a4.a a14 = a4.a.a(frameworkSQLiteDatabase, "WorkName");
            if (!aVar5.equals(a14)) {
                return new l.b("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + aVar5 + "\n Found:\n" + a14, false);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new a.C0004a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new a.C0004a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            a4.a aVar6 = new a4.a("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            a4.a a15 = a4.a.a(frameworkSQLiteDatabase, "WorkProgress");
            if (!aVar6.equals(a15)) {
                return new l.b("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + aVar6 + "\n Found:\n" + a15, false);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new a.C0004a("key", "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new a.C0004a("long_value", "INTEGER", false, 0, null, 1));
            a4.a aVar7 = new a4.a("Preference", hashMap7, new HashSet(0), new HashSet(0));
            a4.a a16 = a4.a.a(frameworkSQLiteDatabase, "Preference");
            if (aVar7.equals(a16)) {
                return new l.b(null, true);
            }
            return new l.b("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + aVar7 + "\n Found:\n" + a16, false);
        }
    }

    @Override // androidx.room.RoomDatabase
    public final f d() {
        return new f(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    public final c4.c e(y3.a aVar) {
        l lVar = new l(aVar, new a(), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e");
        Context context = aVar.f18810a;
        v7.g.f(context, "context");
        return aVar.c.f(new c.b(context, aVar.f18811b, lVar, false, false));
    }

    @Override // androidx.room.RoomDatabase
    public final List f(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new y(0), new z(0));
    }

    @Override // androidx.room.RoomDatabase
    public final Set<Class<? extends z3.a>> h() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map<Class<?>, List<Class<?>>> i() {
        HashMap hashMap = new HashMap();
        hashMap.put(t.class, Collections.emptyList());
        hashMap.put(w4.b.class, Collections.emptyList());
        hashMap.put(w.class, Collections.emptyList());
        hashMap.put(j.class, Collections.emptyList());
        hashMap.put(n.class, Collections.emptyList());
        hashMap.put(q.class, Collections.emptyList());
        hashMap.put(e.class, Collections.emptyList());
        hashMap.put(h.class, Collections.emptyList());
        return hashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final w4.b r() {
        w4.c cVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new w4.c(this);
            }
            cVar = this.n;
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e s() {
        g gVar;
        if (this.f6230s != null) {
            return this.f6230s;
        }
        synchronized (this) {
            if (this.f6230s == null) {
                this.f6230s = new g(this);
            }
            gVar = this.f6230s;
        }
        return gVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final j t() {
        k kVar;
        if (this.f6227p != null) {
            return this.f6227p;
        }
        synchronized (this) {
            if (this.f6227p == null) {
                this.f6227p = new k(this);
            }
            kVar = this.f6227p;
        }
        return kVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final n u() {
        o oVar;
        if (this.f6228q != null) {
            return this.f6228q;
        }
        synchronized (this) {
            if (this.f6228q == null) {
                this.f6228q = new o(this);
            }
            oVar = this.f6228q;
        }
        return oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final q v() {
        r rVar;
        if (this.f6229r != null) {
            return this.f6229r;
        }
        synchronized (this) {
            if (this.f6229r == null) {
                this.f6229r = new r(this);
            }
            rVar = this.f6229r;
        }
        return rVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final t w() {
        u uVar;
        if (this.f6225m != null) {
            return this.f6225m;
        }
        synchronized (this) {
            if (this.f6225m == null) {
                this.f6225m = new u(this);
            }
            uVar = this.f6225m;
        }
        return uVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final w x() {
        x xVar;
        if (this.f6226o != null) {
            return this.f6226o;
        }
        synchronized (this) {
            if (this.f6226o == null) {
                this.f6226o = new x(this);
            }
            xVar = this.f6226o;
        }
        return xVar;
    }
}
