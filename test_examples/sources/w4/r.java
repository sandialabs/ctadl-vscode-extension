package w4;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f18332a;

    /* renamed from: b  reason: collision with root package name */
    public final b f18333b;
    public final c c;

    /* loaded from: classes.dex */
    public class a extends y3.c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // y3.c
        public final void e(c4.f fVar, Object obj) {
            ((p) obj).getClass();
            fVar.o(1);
            byte[] b5 = androidx.work.b.b(null);
            if (b5 == null) {
                fVar.o(2);
            } else {
                fVar.E(2, b5);
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
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* loaded from: classes.dex */
    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "DELETE FROM WorkProgress";
        }
    }

    public r(RoomDatabase roomDatabase) {
        this.f18332a = roomDatabase;
        new a(roomDatabase);
        this.f18333b = new b(roomDatabase);
        this.c = new c(roomDatabase);
    }

    @Override // w4.q
    public final void a(String str) {
        RoomDatabase roomDatabase = this.f18332a;
        roomDatabase.b();
        b bVar = this.f18333b;
        c4.f a10 = bVar.a();
        if (str == null) {
            a10.o(1);
        } else {
            a10.F(str, 1);
        }
        roomDatabase.c();
        try {
            a10.k();
            roomDatabase.p();
        } finally {
            roomDatabase.k();
            bVar.d(a10);
        }
    }

    @Override // w4.q
    public final void b() {
        RoomDatabase roomDatabase = this.f18332a;
        roomDatabase.b();
        c cVar = this.c;
        c4.f a10 = cVar.a();
        roomDatabase.c();
        try {
            a10.k();
            roomDatabase.p();
        } finally {
            roomDatabase.k();
            cVar.d(a10);
        }
    }
}
