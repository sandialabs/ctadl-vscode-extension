package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import c4.b;
import c4.c;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import m7.e;
import v7.g;

/* loaded from: classes.dex */
public final class FrameworkSQLiteOpenHelper implements c {

    /* renamed from: i  reason: collision with root package name */
    public final Context f6070i;

    /* renamed from: j  reason: collision with root package name */
    public final String f6071j;

    /* renamed from: k  reason: collision with root package name */
    public final c.a f6072k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f6073l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f6074m;
    public final e<OpenHelper> n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f6075o;

    /* loaded from: classes.dex */
    public static final class OpenHelper extends SQLiteOpenHelper {

        /* renamed from: p  reason: collision with root package name */
        public static final /* synthetic */ int f6076p = 0;

        /* renamed from: i  reason: collision with root package name */
        public final Context f6077i;

        /* renamed from: j  reason: collision with root package name */
        public final a f6078j;

        /* renamed from: k  reason: collision with root package name */
        public final c.a f6079k;

        /* renamed from: l  reason: collision with root package name */
        public final boolean f6080l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f6081m;
        public final e4.a n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f6082o;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "sqlite-framework_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
        /* loaded from: classes.dex */
        public static final class CallbackException extends RuntimeException {

            /* renamed from: i  reason: collision with root package name */
            public final CallbackName f6083i;

            /* renamed from: j  reason: collision with root package name */
            public final Throwable f6084j;

            public CallbackException(CallbackName callbackName, Throwable th) {
                super(th);
                this.f6083i = callbackName;
                this.f6084j = th;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.f6084j;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "", "sqlite-framework_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
        /* loaded from: classes.dex */
        public enum CallbackName {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* loaded from: classes.dex */
        public static final class a {
            public static FrameworkSQLiteDatabase a(a aVar, SQLiteDatabase sQLiteDatabase) {
                g.f(aVar, "refHolder");
                g.f(sQLiteDatabase, "sqLiteDatabase");
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = aVar.f6090a;
                if (frameworkSQLiteDatabase == null || !g.a(frameworkSQLiteDatabase.f6067i, sQLiteDatabase)) {
                    FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = new FrameworkSQLiteDatabase(sQLiteDatabase);
                    aVar.f6090a = frameworkSQLiteDatabase2;
                    return frameworkSQLiteDatabase2;
                }
                return frameworkSQLiteDatabase;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(Context context, String str, final a aVar, final c.a aVar2, boolean z10) {
            super(context, str, null, aVar2.f6528a, new DatabaseErrorHandler() { // from class: d4.c
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    String b5;
                    g.f(c.a.this, "$callback");
                    FrameworkSQLiteOpenHelper.a aVar3 = aVar;
                    g.f(aVar3, "$dbRef");
                    int i10 = FrameworkSQLiteOpenHelper.OpenHelper.f6076p;
                    g.e(sQLiteDatabase, "dbObj");
                    FrameworkSQLiteDatabase a10 = FrameworkSQLiteOpenHelper.OpenHelper.a.a(aVar3, sQLiteDatabase);
                    Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + a10 + ".path");
                    if (!a10.isOpen()) {
                        b5 = a10.b();
                        if (b5 == null) {
                            return;
                        }
                    } else {
                        List<Pair<String, String>> list = null;
                        try {
                            try {
                                list = a10.f6068j;
                            } catch (Throwable th) {
                                if (list != null) {
                                    Iterator<T> it = list.iterator();
                                    while (it.hasNext()) {
                                        Object obj = ((Pair) it.next()).second;
                                        g.e(obj, "p.second");
                                        c.a.a((String) obj);
                                    }
                                } else {
                                    String b10 = a10.b();
                                    if (b10 != null) {
                                        c.a.a(b10);
                                    }
                                }
                                throw th;
                            }
                        } catch (SQLiteException unused) {
                        }
                        try {
                            a10.close();
                        } catch (IOException unused2) {
                        }
                        if (list != null) {
                            Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                Object obj2 = ((Pair) it2.next()).second;
                                g.e(obj2, "p.second");
                                c.a.a((String) obj2);
                            }
                            return;
                        }
                        b5 = a10.b();
                        if (b5 == null) {
                            return;
                        }
                    }
                    c.a.a(b5);
                }
            });
            g.f(context, "context");
            g.f(aVar2, "callback");
            this.f6077i = context;
            this.f6078j = aVar;
            this.f6079k = aVar2;
            this.f6080l = z10;
            if (str == null) {
                str = UUID.randomUUID().toString();
                g.e(str, "randomUUID().toString()");
            }
            File cacheDir = context.getCacheDir();
            g.e(cacheDir, "context.cacheDir");
            this.n = new e4.a(str, cacheDir, false);
        }

        public final b a(boolean z10) {
            e4.a aVar = this.n;
            try {
                aVar.a((this.f6082o || getDatabaseName() == null) ? false : true);
                this.f6081m = false;
                SQLiteDatabase h10 = h(z10);
                if (this.f6081m) {
                    close();
                    return a(z10);
                }
                return b(h10);
            } finally {
                aVar.b();
            }
        }

        public final FrameworkSQLiteDatabase b(SQLiteDatabase sQLiteDatabase) {
            g.f(sQLiteDatabase, "sqLiteDatabase");
            return a.a(this.f6078j, sQLiteDatabase);
        }

        public final SQLiteDatabase c(boolean z10) {
            SQLiteDatabase writableDatabase = z10 ? getWritableDatabase() : getReadableDatabase();
            g.e(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            e4.a aVar = this.n;
            try {
                aVar.a(aVar.f10644a);
                super.close();
                this.f6078j.f6090a = null;
                this.f6082o = false;
            } finally {
                aVar.b();
            }
        }

        public final SQLiteDatabase h(boolean z10) {
            File parentFile;
            String databaseName = getDatabaseName();
            Context context = this.f6077i;
            if (databaseName != null && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return c(z10);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return c(z10);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof CallbackException) {
                        CallbackException callbackException = th;
                        int ordinal = callbackException.f6083i.ordinal();
                        Throwable th2 = callbackException.f6084j;
                        if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                            throw th2;
                        }
                        if (!(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                    } else if (!(th instanceof SQLiteException)) {
                        throw th;
                    } else {
                        if (databaseName == null || !this.f6080l) {
                            throw th;
                        }
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        return c(z10);
                    } catch (CallbackException e10) {
                        throw e10.f6084j;
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            g.f(sQLiteDatabase, "db");
            try {
                this.f6079k.b(b(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            g.f(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.f6079k.c(b(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            g.f(sQLiteDatabase, "db");
            this.f6081m = true;
            try {
                this.f6079k.d(b(sQLiteDatabase), i10, i11);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            g.f(sQLiteDatabase, "db");
            if (!this.f6081m) {
                try {
                    this.f6079k.e(b(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new CallbackException(CallbackName.ON_OPEN, th);
                }
            }
            this.f6082o = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            g.f(sQLiteDatabase, "sqLiteDatabase");
            this.f6081m = true;
            try {
                this.f6079k.f(b(sQLiteDatabase), i10, i11);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_UPGRADE, th);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public FrameworkSQLiteDatabase f6090a = null;
    }

    public FrameworkSQLiteOpenHelper(Context context, String str, c.a aVar, boolean z10, boolean z11) {
        g.f(context, "context");
        g.f(aVar, "callback");
        this.f6070i = context;
        this.f6071j = str;
        this.f6072k = aVar;
        this.f6073l = z10;
        this.f6074m = z11;
        this.n = kotlin.a.b(new FrameworkSQLiteOpenHelper$lazyDelegate$1(this));
    }

    @Override // c4.c
    public final b L() {
        return this.n.getValue().a(true);
    }

    @Override // c4.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e<OpenHelper> eVar = this.n;
        if (eVar.a()) {
            eVar.getValue().close();
        }
    }

    @Override // c4.c
    public final String getDatabaseName() {
        return this.f6071j;
    }

    @Override // c4.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        e<OpenHelper> eVar = this.n;
        if (eVar.a()) {
            OpenHelper value = eVar.getValue();
            g.f(value, "sQLiteOpenHelper");
            value.setWriteAheadLoggingEnabled(z10);
        }
        this.f6075o = z10;
    }
}
