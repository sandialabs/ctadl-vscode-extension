package w4;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f18330a;

    /* renamed from: b  reason: collision with root package name */
    public final a f18331b;

    /* loaded from: classes.dex */
    public class a extends y3.c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // y3.c
        public final void e(c4.f fVar, Object obj) {
            m mVar = (m) obj;
            String str = mVar.f18328a;
            if (str == null) {
                fVar.o(1);
            } else {
                fVar.F(str, 1);
            }
            String str2 = mVar.f18329b;
            if (str2 == null) {
                fVar.o(2);
            } else {
                fVar.F(str2, 2);
            }
        }
    }

    public o(RoomDatabase roomDatabase) {
        this.f18330a = roomDatabase;
        this.f18331b = new a(roomDatabase);
    }

    @Override // w4.n
    public final void a(m mVar) {
        RoomDatabase roomDatabase = this.f18330a;
        roomDatabase.b();
        roomDatabase.c();
        try {
            this.f18331b.g(mVar);
            roomDatabase.p();
        } finally {
            roomDatabase.k();
        }
    }

    @Override // w4.n
    public final ArrayList b(String str) {
        y3.m c = y3.m.c("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            c.o(1);
        } else {
            c.F(str, 1);
        }
        RoomDatabase roomDatabase = this.f18330a;
        roomDatabase.b();
        Cursor B = v8.b.B(roomDatabase, c);
        try {
            ArrayList arrayList = new ArrayList(B.getCount());
            while (B.moveToNext()) {
                arrayList.add(B.isNull(0) ? null : B.getString(0));
            }
            return arrayList;
        } finally {
            B.close();
            c.h();
        }
    }
}
