package androidx.sqlite.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import c4.a;
import c4.b;
import c4.e;
import c4.f;
import d4.d;
import java.util.List;
import u7.r;
import v7.g;
import y3.j;

/* loaded from: classes.dex */
public final class FrameworkSQLiteDatabase implements b {

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f6065k = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f6066l = new String[0];

    /* renamed from: i  reason: collision with root package name */
    public final SQLiteDatabase f6067i;

    /* renamed from: j  reason: collision with root package name */
    public final List<Pair<String, String>> f6068j;

    public FrameworkSQLiteDatabase(SQLiteDatabase sQLiteDatabase) {
        g.f(sQLiteDatabase, "delegate");
        this.f6067i = sQLiteDatabase;
        this.f6068j = sQLiteDatabase.getAttachedDbs();
    }

    @Override // c4.b
    public final void B() {
        this.f6067i.beginTransactionNonExclusive();
    }

    @Override // c4.b
    public final int K(ContentValues contentValues, Object[] objArr) {
        int i10 = 0;
        if (contentValues.size() != 0) {
            int size = contentValues.size();
            int length = objArr.length + size;
            Object[] objArr2 = new Object[length];
            StringBuilder sb = new StringBuilder("UPDATE ");
            sb.append(f6065k[3]);
            sb.append("WorkSpec SET ");
            for (String str : contentValues.keySet()) {
                sb.append(i10 > 0 ? "," : "");
                sb.append(str);
                objArr2[i10] = contentValues.get(str);
                sb.append("=?");
                i10++;
            }
            for (int i11 = size; i11 < length; i11++) {
                objArr2[i11] = objArr[i11 - size];
            }
            if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
            }
            String sb2 = sb.toString();
            g.e(sb2, "StringBuilder().apply(builderAction).toString()");
            f l2 = l(sb2);
            a.C0054a.a((j) l2, objArr2);
            return ((d) l2).k();
        }
        throw new IllegalArgumentException("Empty values".toString());
    }

    public final void a(Object[] objArr) {
        this.f6067i.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final String b() {
        return this.f6067i.getPath();
    }

    public final Cursor c(String str) {
        g.f(str, "query");
        return n(new a(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6067i.close();
    }

    @Override // c4.b
    public final void d() {
        this.f6067i.endTransaction();
    }

    @Override // c4.b
    public final void e() {
        this.f6067i.beginTransaction();
    }

    @Override // c4.b
    public final Cursor f(final e eVar, CancellationSignal cancellationSignal) {
        g.f(eVar, "query");
        String a10 = eVar.a();
        String[] strArr = f6066l;
        g.c(cancellationSignal);
        SQLiteDatabase.CursorFactory cursorFactory = new SQLiteDatabase.CursorFactory() { // from class: d4.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                e eVar2 = e.this;
                g.f(eVar2, "$query");
                g.c(sQLiteQuery);
                eVar2.b(new j(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        };
        SQLiteDatabase sQLiteDatabase = this.f6067i;
        g.f(sQLiteDatabase, "sQLiteDatabase");
        g.f(a10, "sql");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, a10, strArr, null, cancellationSignal);
        g.e(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    @Override // c4.b
    public final void g(String str) {
        g.f(str, "sql");
        this.f6067i.execSQL(str);
    }

    @Override // c4.b
    public final boolean isOpen() {
        return this.f6067i.isOpen();
    }

    @Override // c4.b
    public final f l(String str) {
        g.f(str, "sql");
        SQLiteStatement compileStatement = this.f6067i.compileStatement(str);
        g.e(compileStatement, "delegate.compileStatement(sql)");
        return new d(compileStatement);
    }

    @Override // c4.b
    public final Cursor n(e eVar) {
        g.f(eVar, "query");
        final FrameworkSQLiteDatabase$query$cursorFactory$1 frameworkSQLiteDatabase$query$cursorFactory$1 = new FrameworkSQLiteDatabase$query$cursorFactory$1(eVar);
        Cursor rawQueryWithFactory = this.f6067i.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: d4.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                r rVar = r.this;
                g.f(rVar, "$tmp0");
                return (Cursor) rVar.l0(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, eVar.a(), f6066l, null);
        g.e(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // c4.b
    public final boolean s() {
        return this.f6067i.inTransaction();
    }

    @Override // c4.b
    public final boolean t() {
        SQLiteDatabase sQLiteDatabase = this.f6067i;
        g.f(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @Override // c4.b
    public final void x() {
        this.f6067i.setTransactionSuccessful();
    }
}
