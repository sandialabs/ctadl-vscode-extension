package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.datastore.preferences.PreferencesProto$Value;
import c4.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.r;
import v7.g;
import y3.j;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "Landroid/database/sqlite/SQLiteCursor;", "<anonymous parameter 0>", "Landroid/database/sqlite/SQLiteDatabase;", "masterQuery", "Landroid/database/sqlite/SQLiteCursorDriver;", "editTable", "", "sqLiteQuery", "Landroid/database/sqlite/SQLiteQuery;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FrameworkSQLiteDatabase$query$cursorFactory$1 extends Lambda implements r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e f6069j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteDatabase$query$cursorFactory$1(e eVar) {
        super(4);
        this.f6069j = eVar;
    }

    @Override // u7.r
    public final SQLiteCursor l0(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        SQLiteQuery sQLiteQuery2 = sQLiteQuery;
        g.c(sQLiteQuery2);
        this.f6069j.b(new j(sQLiteQuery2));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery2);
    }
}
