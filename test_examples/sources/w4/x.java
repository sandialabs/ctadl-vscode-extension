package w4;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class x implements w {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f18366a;

    /* renamed from: b  reason: collision with root package name */
    public final a f18367b;

    /* loaded from: classes.dex */
    public class a extends y3.c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // y3.c
        public final void e(c4.f fVar, Object obj) {
            v vVar = (v) obj;
            String str = vVar.f18364a;
            if (str == null) {
                fVar.o(1);
            } else {
                fVar.F(str, 1);
            }
            String str2 = vVar.f18365b;
            if (str2 == null) {
                fVar.o(2);
            } else {
                fVar.F(str2, 2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public x(RoomDatabase roomDatabase) {
        this.f18366a = roomDatabase;
        this.f18367b = new a(roomDatabase);
        new b(roomDatabase);
    }

    @Override // w4.w
    public final void a(String str, Set<String> set) {
        v7.g.f(set, "tags");
        for (String str2 : set) {
            c(new v(str2, str));
        }
    }

    @Override // w4.w
    public final ArrayList b(String str) {
        y3.m c = y3.m.c("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            c.o(1);
        } else {
            c.F(str, 1);
        }
        RoomDatabase roomDatabase = this.f18366a;
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

    public final void c(v vVar) {
        RoomDatabase roomDatabase = this.f18366a;
        roomDatabase.b();
        roomDatabase.c();
        try {
            this.f18367b.g(vVar);
            roomDatabase.p();
        } finally {
            roomDatabase.k();
        }
    }
}
