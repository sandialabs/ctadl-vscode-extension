package w4;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f18319a;

    /* renamed from: b  reason: collision with root package name */
    public final f f18320b;

    public g(WorkDatabase workDatabase) {
        this.f18319a = workDatabase;
        this.f18320b = new f(workDatabase);
    }

    @Override // w4.e
    public final Long a(String str) {
        Long l2;
        y3.m c = y3.m.c("SELECT long_value FROM Preference where `key`=?", 1);
        c.F(str, 1);
        RoomDatabase roomDatabase = this.f18319a;
        roomDatabase.b();
        Cursor B = v8.b.B(roomDatabase, c);
        try {
            if (B.moveToFirst() && !B.isNull(0)) {
                l2 = Long.valueOf(B.getLong(0));
                return l2;
            }
            l2 = null;
            return l2;
        } finally {
            B.close();
            c.h();
        }
    }

    @Override // w4.e
    public final void b(d dVar) {
        RoomDatabase roomDatabase = this.f18319a;
        roomDatabase.b();
        roomDatabase.c();
        try {
            this.f18320b.g(dVar);
            roomDatabase.p();
        } finally {
            roomDatabase.k();
        }
    }
}
