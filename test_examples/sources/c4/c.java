package c4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import ha.i;
import java.io.Closeable;
import java.io.File;
import v7.g;

/* loaded from: classes.dex */
public interface c extends Closeable {

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f6528a;

        public a(int i10) {
            this.f6528a = i10;
        }

        public static void a(String str) {
            int i10;
            boolean z10;
            if (!i.S0(str, ":memory:")) {
                boolean z11 = true;
                int length = str.length() - 1;
                int i11 = 0;
                boolean z12 = false;
                while (i11 <= length) {
                    if (!z12) {
                        i10 = i11;
                    } else {
                        i10 = length;
                    }
                    if (g.h(str.charAt(i10), 32) <= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z12) {
                        if (!z10) {
                            z12 = true;
                        } else {
                            i11++;
                        }
                    } else if (!z10) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (str.subSequence(i11, length + 1).toString().length() != 0) {
                    z11 = false;
                }
                if (!z11) {
                    Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                    try {
                        SQLiteDatabase.deleteDatabase(new File(str));
                    } catch (Exception e10) {
                        Log.w("SupportSQLite", "delete failed: ", e10);
                    }
                }
            }
        }

        public abstract void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public abstract void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public abstract void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i10, int i11);

        public abstract void e(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public abstract void f(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i10, int i11);
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f6529a;

        /* renamed from: b  reason: collision with root package name */
        public final String f6530b;
        public final a c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f6531d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f6532e;

        public b(Context context, String str, a aVar, boolean z10, boolean z11) {
            g.f(context, "context");
            this.f6529a = context;
            this.f6530b = str;
            this.c = aVar;
            this.f6531d = z10;
            this.f6532e = z11;
        }
    }

    /* renamed from: c4.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0055c {
        c f(b bVar);
    }

    c4.b L();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
