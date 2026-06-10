package d4;

import android.database.sqlite.SQLiteStatement;
import c4.f;
import y3.j;

/* loaded from: classes.dex */
public final class d extends j implements f {

    /* renamed from: k  reason: collision with root package name */
    public final SQLiteStatement f10397k;

    public d(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f10397k = sQLiteStatement;
    }

    @Override // c4.f
    public final long Q() {
        return this.f10397k.executeInsert();
    }

    @Override // c4.f
    public final int k() {
        return this.f10397k.executeUpdateDelete();
    }
}
