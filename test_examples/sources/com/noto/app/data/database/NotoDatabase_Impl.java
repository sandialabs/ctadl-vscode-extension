package com.noto.app.data.database;

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
import p6.h;
import p6.i;
import p6.k;
import r6.g;
import r6.j;
import r6.n;
import r6.s;
import r6.u;
import r6.v;
import v8.b;
import y3.f;
import y3.l;

/* loaded from: classes.dex */
public final class NotoDatabase_Impl extends NotoDatabase {

    /* renamed from: o  reason: collision with root package name */
    public volatile s f7687o;

    /* renamed from: p  reason: collision with root package name */
    public volatile g f7688p;

    /* renamed from: q  reason: collision with root package name */
    public volatile j f7689q;

    /* renamed from: r  reason: collision with root package name */
    public volatile v f7690r;

    /* loaded from: classes.dex */
    public class a extends l.a {
        public a() {
            super(32);
        }

        @Override // y3.l.a
        public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `folders` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `parent_id` INTEGER DEFAULT NULL, `title` TEXT NOT NULL, `position` INTEGER NOT NULL, `color` INTEGER NOT NULL, `creation_date` TEXT NOT NULL, `layout` INTEGER NOT NULL DEFAULT 0, `note_preview_size` INTEGER NOT NULL DEFAULT 15, `is_archived` INTEGER NOT NULL DEFAULT 0, `is_pinned` INTEGER NOT NULL DEFAULT 0, `is_show_note_creation_date` INTEGER NOT NULL DEFAULT 0, `new_note_cursor_position` INTEGER NOT NULL DEFAULT 0, `sorting_type` INTEGER NOT NULL DEFAULT 1, `sorting_order` INTEGER NOT NULL DEFAULT 1, `grouping` INTEGER NOT NULL DEFAULT 0, `grouping_order` INTEGER NOT NULL DEFAULT 1, `is_vaulted` INTEGER NOT NULL DEFAULT 0, `scrolling_position` INTEGER NOT NULL DEFAULT 0, `filtering_type` INTEGER NOT NULL DEFAULT 0, `open_notes_in` INTEGER NOT NULL DEFAULT 0)");
            frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `notes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `folder_id` INTEGER NOT NULL, `title` TEXT NOT NULL, `body` TEXT NOT NULL, `position` INTEGER NOT NULL, `creation_date` TEXT NOT NULL, `is_pinned` INTEGER NOT NULL, `is_archived` INTEGER NOT NULL, `reminder_date` TEXT, `is_vaulted` INTEGER NOT NULL DEFAULT 0, `access_date` TEXT NOT NULL DEFAULT 'creation_date', `scrolling_position` INTEGER NOT NULL DEFAULT 0, FOREIGN KEY(`folder_id`) REFERENCES `folders`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `labels` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `folder_id` INTEGER NOT NULL, `title` TEXT NOT NULL, `color` INTEGER NOT NULL, `position` INTEGER NOT NULL DEFAULT 0, FOREIGN KEY(`folder_id`) REFERENCES `folders`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `note_labels` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `note_id` INTEGER NOT NULL, `label_id` INTEGER NOT NULL, FOREIGN KEY(`note_id`) REFERENCES `notes`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`label_id`) REFERENCES `labels`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            frameworkSQLiteDatabase.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3a285afd7c3eba7b1ccc8f0859651838')");
        }

        @Override // y3.l.a
        public final void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            frameworkSQLiteDatabase.g("DROP TABLE IF EXISTS `folders`");
            frameworkSQLiteDatabase.g("DROP TABLE IF EXISTS `notes`");
            frameworkSQLiteDatabase.g("DROP TABLE IF EXISTS `labels`");
            frameworkSQLiteDatabase.g("DROP TABLE IF EXISTS `note_labels`");
            NotoDatabase_Impl notoDatabase_Impl = NotoDatabase_Impl.this;
            List<? extends RoomDatabase.b> list = notoDatabase_Impl.f6032g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    notoDatabase_Impl.f6032g.get(i10).getClass();
                }
            }
        }

        @Override // y3.l.a
        public final void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            NotoDatabase_Impl notoDatabase_Impl = NotoDatabase_Impl.this;
            List<? extends RoomDatabase.b> list = notoDatabase_Impl.f6032g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    notoDatabase_Impl.f6032g.get(i10).getClass();
                }
            }
        }

        @Override // y3.l.a
        public final void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            NotoDatabase_Impl.this.f6027a = frameworkSQLiteDatabase;
            frameworkSQLiteDatabase.g("PRAGMA foreign_keys = ON");
            NotoDatabase_Impl.this.l(frameworkSQLiteDatabase);
            List<? extends RoomDatabase.b> list = NotoDatabase_Impl.this.f6032g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    NotoDatabase_Impl.this.f6032g.get(i10).a(frameworkSQLiteDatabase);
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
            HashMap hashMap = new HashMap(20);
            hashMap.put("id", new a.C0004a("id", "INTEGER", true, 1, null, 1));
            hashMap.put("parent_id", new a.C0004a("parent_id", "INTEGER", false, 0, "NULL", 1));
            hashMap.put("title", new a.C0004a("title", "TEXT", true, 0, null, 1));
            hashMap.put("position", new a.C0004a("position", "INTEGER", true, 0, null, 1));
            hashMap.put("color", new a.C0004a("color", "INTEGER", true, 0, null, 1));
            hashMap.put("creation_date", new a.C0004a("creation_date", "TEXT", true, 0, null, 1));
            hashMap.put("layout", new a.C0004a("layout", "INTEGER", true, 0, "0", 1));
            hashMap.put("note_preview_size", new a.C0004a("note_preview_size", "INTEGER", true, 0, "15", 1));
            hashMap.put("is_archived", new a.C0004a("is_archived", "INTEGER", true, 0, "0", 1));
            hashMap.put("is_pinned", new a.C0004a("is_pinned", "INTEGER", true, 0, "0", 1));
            hashMap.put("is_show_note_creation_date", new a.C0004a("is_show_note_creation_date", "INTEGER", true, 0, "0", 1));
            hashMap.put("new_note_cursor_position", new a.C0004a("new_note_cursor_position", "INTEGER", true, 0, "0", 1));
            hashMap.put("sorting_type", new a.C0004a("sorting_type", "INTEGER", true, 0, "1", 1));
            hashMap.put("sorting_order", new a.C0004a("sorting_order", "INTEGER", true, 0, "1", 1));
            hashMap.put("grouping", new a.C0004a("grouping", "INTEGER", true, 0, "0", 1));
            hashMap.put("grouping_order", new a.C0004a("grouping_order", "INTEGER", true, 0, "1", 1));
            hashMap.put("is_vaulted", new a.C0004a("is_vaulted", "INTEGER", true, 0, "0", 1));
            hashMap.put("scrolling_position", new a.C0004a("scrolling_position", "INTEGER", true, 0, "0", 1));
            hashMap.put("filtering_type", new a.C0004a("filtering_type", "INTEGER", true, 0, "0", 1));
            hashMap.put("open_notes_in", new a.C0004a("open_notes_in", "INTEGER", true, 0, "0", 1));
            a4.a aVar = new a4.a("folders", hashMap, new HashSet(0), new HashSet(0));
            a4.a a10 = a4.a.a(frameworkSQLiteDatabase, "folders");
            if (!aVar.equals(a10)) {
                return new l.b("folders(com.noto.app.domain.model.Folder).\n Expected:\n" + aVar + "\n Found:\n" + a10, false);
            }
            HashMap hashMap2 = new HashMap(12);
            hashMap2.put("id", new a.C0004a("id", "INTEGER", true, 1, null, 1));
            hashMap2.put("folder_id", new a.C0004a("folder_id", "INTEGER", true, 0, null, 1));
            hashMap2.put("title", new a.C0004a("title", "TEXT", true, 0, null, 1));
            hashMap2.put("body", new a.C0004a("body", "TEXT", true, 0, null, 1));
            hashMap2.put("position", new a.C0004a("position", "INTEGER", true, 0, null, 1));
            hashMap2.put("creation_date", new a.C0004a("creation_date", "TEXT", true, 0, null, 1));
            hashMap2.put("is_pinned", new a.C0004a("is_pinned", "INTEGER", true, 0, null, 1));
            hashMap2.put("is_archived", new a.C0004a("is_archived", "INTEGER", true, 0, null, 1));
            hashMap2.put("reminder_date", new a.C0004a("reminder_date", "TEXT", false, 0, null, 1));
            hashMap2.put("is_vaulted", new a.C0004a("is_vaulted", "INTEGER", true, 0, "0", 1));
            hashMap2.put("access_date", new a.C0004a("access_date", "TEXT", true, 0, "'creation_date'", 1));
            hashMap2.put("scrolling_position", new a.C0004a("scrolling_position", "INTEGER", true, 0, "0", 1));
            HashSet hashSet = new HashSet(1);
            hashSet.add(new a.b("folders", "CASCADE", "NO ACTION", Arrays.asList("folder_id"), Arrays.asList("id")));
            a4.a aVar2 = new a4.a("notes", hashMap2, hashSet, new HashSet(0));
            a4.a a11 = a4.a.a(frameworkSQLiteDatabase, "notes");
            if (!aVar2.equals(a11)) {
                return new l.b("notes(com.noto.app.domain.model.Note).\n Expected:\n" + aVar2 + "\n Found:\n" + a11, false);
            }
            HashMap hashMap3 = new HashMap(5);
            hashMap3.put("id", new a.C0004a("id", "INTEGER", true, 1, null, 1));
            hashMap3.put("folder_id", new a.C0004a("folder_id", "INTEGER", true, 0, null, 1));
            hashMap3.put("title", new a.C0004a("title", "TEXT", true, 0, null, 1));
            hashMap3.put("color", new a.C0004a("color", "INTEGER", true, 0, null, 1));
            hashMap3.put("position", new a.C0004a("position", "INTEGER", true, 0, "0", 1));
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new a.b("folders", "CASCADE", "NO ACTION", Arrays.asList("folder_id"), Arrays.asList("id")));
            a4.a aVar3 = new a4.a("labels", hashMap3, hashSet2, new HashSet(0));
            a4.a a12 = a4.a.a(frameworkSQLiteDatabase, "labels");
            if (!aVar3.equals(a12)) {
                return new l.b("labels(com.noto.app.domain.model.Label).\n Expected:\n" + aVar3 + "\n Found:\n" + a12, false);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("id", new a.C0004a("id", "INTEGER", true, 1, null, 1));
            hashMap4.put("note_id", new a.C0004a("note_id", "INTEGER", true, 0, null, 1));
            hashMap4.put("label_id", new a.C0004a("label_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(2);
            hashSet3.add(new a.b("notes", "CASCADE", "NO ACTION", Arrays.asList("note_id"), Arrays.asList("id")));
            hashSet3.add(new a.b("labels", "CASCADE", "NO ACTION", Arrays.asList("label_id"), Arrays.asList("id")));
            a4.a aVar4 = new a4.a("note_labels", hashMap4, hashSet3, new HashSet(0));
            a4.a a13 = a4.a.a(frameworkSQLiteDatabase, "note_labels");
            if (aVar4.equals(a13)) {
                return new l.b(null, true);
            }
            return new l.b("note_labels(com.noto.app.domain.model.NoteLabel).\n Expected:\n" + aVar4 + "\n Found:\n" + a13, false);
        }
    }

    @Override // androidx.room.RoomDatabase
    public final f d() {
        return new f(this, new HashMap(0), new HashMap(0), "folders", "notes", "labels", "note_labels");
    }

    @Override // androidx.room.RoomDatabase
    public final c e(y3.a aVar) {
        l lVar = new l(aVar, new a(), "3a285afd7c3eba7b1ccc8f0859651838", "f7a0703ce64fcf5cba10517c31c719b7");
        Context context = aVar.f18810a;
        v7.g.f(context, "context");
        return aVar.c.f(new c.b(context, aVar.f18811b, lVar, false, false));
    }

    @Override // androidx.room.RoomDatabase
    public final List f(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new h(6), new i(4), new y(4), new h(7), new h(0), new i(0), new y(1), new z(1), new p6.j(0), new k(0), new h(1), new i(1), new k(1), new h(2), new p6.j(1), new k(2), new h(3), new i(2), new k(3), new h(4), new p6.j(2), new y(2), new h(5), new i(3), new y(3));
    }

    @Override // androidx.room.RoomDatabase
    public final Set<Class<? extends z3.a>> h() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map<Class<?>, List<Class<?>>> i() {
        HashMap hashMap = new HashMap();
        hashMap.put(n.class, Collections.emptyList());
        hashMap.put(r6.a.class, Collections.emptyList());
        hashMap.put(r6.i.class, Collections.emptyList());
        hashMap.put(u.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.noto.app.data.database.NotoDatabase
    public final r6.a r() {
        g gVar;
        if (this.f7688p != null) {
            return this.f7688p;
        }
        synchronized (this) {
            if (this.f7688p == null) {
                this.f7688p = new g(this);
            }
            gVar = this.f7688p;
        }
        return gVar;
    }

    @Override // com.noto.app.data.database.NotoDatabase
    public final r6.i s() {
        j jVar;
        if (this.f7689q != null) {
            return this.f7689q;
        }
        synchronized (this) {
            if (this.f7689q == null) {
                this.f7689q = new j(this);
            }
            jVar = this.f7689q;
        }
        return jVar;
    }

    @Override // com.noto.app.data.database.NotoDatabase
    public final n t() {
        s sVar;
        if (this.f7687o != null) {
            return this.f7687o;
        }
        synchronized (this) {
            if (this.f7687o == null) {
                this.f7687o = new s(this);
            }
            sVar = this.f7687o;
        }
        return sVar;
    }

    @Override // com.noto.app.data.database.NotoDatabase
    public final u u() {
        v vVar;
        if (this.f7690r != null) {
            return this.f7690r;
        }
        synchronized (this) {
            if (this.f7690r == null) {
                this.f7690r = new v(this);
            }
            vVar = this.f7690r;
        }
        return vVar;
    }
}
