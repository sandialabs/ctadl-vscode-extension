package y3;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import c4.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class l extends c.a {

    /* renamed from: b  reason: collision with root package name */
    public y3.a f18863b;
    public final a c;

    /* renamed from: d  reason: collision with root package name */
    public final String f18864d;

    /* renamed from: e  reason: collision with root package name */
    public final String f18865e;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f18866a;

        public a(int i10) {
            this.f18866a = i10;
        }

        public abstract void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public abstract void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public abstract void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public abstract void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public abstract void e();

        public abstract void f(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public abstract b g(FrameworkSQLiteDatabase frameworkSQLiteDatabase);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f18867a;

        /* renamed from: b  reason: collision with root package name */
        public final String f18868b;

        public b(String str, boolean z10) {
            this.f18867a = z10;
            this.f18868b = str;
        }
    }

    public l(y3.a aVar, a aVar2, String str, String str2) {
        super(aVar2.f18866a);
        this.f18863b = aVar;
        this.c = aVar2;
        this.f18864d = str;
        this.f18865e = str2;
    }

    @Override // c4.c.a
    public final void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
    }

    @Override // c4.c.a
    public final void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        Cursor c = frameworkSQLiteDatabase.c("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (c.moveToFirst()) {
                if (c.getInt(0) == 0) {
                    z10 = true;
                }
            }
            m0.b.D(c, null);
            a aVar = this.c;
            aVar.a(frameworkSQLiteDatabase);
            if (!z10) {
                b g10 = aVar.g(frameworkSQLiteDatabase);
                if (!g10.f18867a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f18868b);
                }
            }
            g(frameworkSQLiteDatabase);
            aVar.c(frameworkSQLiteDatabase);
        } finally {
        }
    }

    @Override // c4.c.a
    public final void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i10, int i11) {
        f(frameworkSQLiteDatabase, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    @Override // c4.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        boolean z10;
        b g10;
        String str;
        Cursor c = frameworkSQLiteDatabase.c("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (c.moveToFirst()) {
                if (c.getInt(0) != 0) {
                    z10 = true;
                    m0.b.D(c, null);
                    a aVar = this.c;
                    if (!z10) {
                        Cursor n = frameworkSQLiteDatabase.n(new c4.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            if (n.moveToFirst()) {
                                str = n.getString(0);
                            } else {
                                str = null;
                            }
                            m0.b.D(n, null);
                            String str2 = this.f18864d;
                            if (!v7.g.a(str2, str) && !v7.g.a(this.f18865e, str)) {
                                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + str2 + ", found: " + str);
                            }
                        } finally {
                        }
                    } else {
                        if (aVar.g(frameworkSQLiteDatabase).f18867a) {
                            aVar.e();
                            g(frameworkSQLiteDatabase);
                        } else {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f18868b);
                        }
                    }
                    aVar.d(frameworkSQLiteDatabase);
                    this.f18863b = null;
                }
            }
            z10 = false;
            m0.b.D(c, null);
            a aVar2 = this.c;
            if (!z10) {
            }
            aVar2.d(frameworkSQLiteDatabase);
            this.f18863b = null;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (r6 > r15) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
        if (r10 < r6) goto L39;
     */
    @Override // c4.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i10, int i11) {
        boolean z10;
        boolean z11;
        Iterable<z3.b> iterable;
        Set keySet;
        boolean z12;
        boolean z13;
        y3.a aVar = this.f18863b;
        a aVar2 = this.c;
        boolean z14 = false;
        if (aVar != null) {
            RoomDatabase.c cVar = aVar.f18812d;
            cVar.getClass();
            if (i10 == i11) {
                iterable = EmptyList.f12981i;
            } else {
                if (i11 > i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList = new ArrayList();
                int i12 = i10;
                do {
                    if (z10) {
                        if (i12 < i11) {
                            z11 = true;
                        }
                        z11 = false;
                    }
                    if (z11) {
                        TreeMap treeMap = (TreeMap) cVar.f6057a.get(Integer.valueOf(i12));
                        if (treeMap == null) {
                            break;
                        }
                        if (z10) {
                            keySet = treeMap.descendingKeySet();
                        } else {
                            keySet = treeMap.keySet();
                        }
                        Iterator it = keySet.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Integer num = (Integer) it.next();
                                if (z10) {
                                    int i13 = i12 + 1;
                                    v7.g.e(num, "targetVersion");
                                    int intValue = num.intValue();
                                    if (i13 <= intValue && intValue <= i11) {
                                        z13 = true;
                                        continue;
                                    }
                                    z13 = false;
                                    continue;
                                } else {
                                    v7.g.e(num, "targetVersion");
                                    int intValue2 = num.intValue();
                                    if (i11 <= intValue2) {
                                    }
                                    z13 = false;
                                    continue;
                                }
                                if (z13) {
                                    Object obj = treeMap.get(num);
                                    v7.g.c(obj);
                                    arrayList.add(obj);
                                    i12 = num.intValue();
                                    z12 = true;
                                    continue;
                                    break;
                                }
                            } else {
                                z12 = false;
                                continue;
                                break;
                            }
                        }
                    } else {
                        iterable = arrayList;
                        break;
                    }
                } while (z12);
                iterable = null;
            }
            if (iterable != null) {
                aVar2.f(frameworkSQLiteDatabase);
                for (z3.b bVar : iterable) {
                    bVar.a(frameworkSQLiteDatabase);
                }
                b g10 = aVar2.g(frameworkSQLiteDatabase);
                if (g10.f18867a) {
                    aVar2.e();
                    g(frameworkSQLiteDatabase);
                    z14 = true;
                } else {
                    throw new IllegalStateException("Migration didn't properly handle: " + g10.f18868b);
                }
            }
        }
        if (!z14) {
            y3.a aVar3 = this.f18863b;
            if (aVar3 != null && !aVar3.a(i10, i11)) {
                aVar2.b(frameworkSQLiteDatabase);
                aVar2.a(frameworkSQLiteDatabase);
                return;
            }
            throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
    }

    public final void g(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.f18864d;
        v7.g.f(str, "hash");
        frameworkSQLiteDatabase.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }
}
