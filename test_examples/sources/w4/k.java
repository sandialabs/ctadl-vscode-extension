package w4;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f18323a;

    /* renamed from: b  reason: collision with root package name */
    public final a f18324b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final c f18325d;

    /* loaded from: classes.dex */
    public class a extends y3.c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // y3.c
        public final void e(c4.f fVar, Object obj) {
            i iVar = (i) obj;
            String str = iVar.f18321a;
            if (str == null) {
                fVar.o(1);
            } else {
                fVar.F(str, 1);
            }
            fVar.r(iVar.f18322b, 2);
            fVar.r(iVar.c, 3);
        }
    }

    /* loaded from: classes.dex */
    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    /* loaded from: classes.dex */
    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public k(RoomDatabase roomDatabase) {
        this.f18323a = roomDatabase;
        this.f18324b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.f18325d = new c(roomDatabase);
    }

    @Override // w4.j
    public final i a(l lVar) {
        v7.g.f(lVar, "id");
        return f(lVar.f18326a, lVar.f18327b);
    }

    @Override // w4.j
    public final ArrayList b() {
        y3.m c10 = y3.m.c("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        RoomDatabase roomDatabase = this.f18323a;
        roomDatabase.b();
        Cursor B = v8.b.B(roomDatabase, c10);
        try {
            ArrayList arrayList = new ArrayList(B.getCount());
            while (B.moveToNext()) {
                arrayList.add(B.isNull(0) ? null : B.getString(0));
            }
            return arrayList;
        } finally {
            B.close();
            c10.h();
        }
    }

    @Override // w4.j
    public final void c(i iVar) {
        RoomDatabase roomDatabase = this.f18323a;
        roomDatabase.b();
        roomDatabase.c();
        try {
            this.f18324b.g(iVar);
            roomDatabase.p();
        } finally {
            roomDatabase.k();
        }
    }

    @Override // w4.j
    public final void d(l lVar) {
        g(lVar.f18326a, lVar.f18327b);
    }

    @Override // w4.j
    public final void e(String str) {
        RoomDatabase roomDatabase = this.f18323a;
        roomDatabase.b();
        c cVar = this.f18325d;
        c4.f a10 = cVar.a();
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
            cVar.d(a10);
        }
    }

    public final i f(String str, int i10) {
        y3.m c10 = y3.m.c("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            c10.o(1);
        } else {
            c10.F(str, 1);
        }
        c10.r(i10, 2);
        RoomDatabase roomDatabase = this.f18323a;
        roomDatabase.b();
        Cursor B = v8.b.B(roomDatabase, c10);
        try {
            int U = a1.b.U(B, "work_spec_id");
            int U2 = a1.b.U(B, "generation");
            int U3 = a1.b.U(B, "system_id");
            i iVar = null;
            String string = null;
            if (B.moveToFirst()) {
                if (!B.isNull(U)) {
                    string = B.getString(U);
                }
                iVar = new i(B.getInt(U2), B.getInt(U3), string);
            }
            return iVar;
        } finally {
            B.close();
            c10.h();
        }
    }

    public final void g(String str, int i10) {
        RoomDatabase roomDatabase = this.f18323a;
        roomDatabase.b();
        b bVar = this.c;
        c4.f a10 = bVar.a();
        if (str == null) {
            a10.o(1);
        } else {
            a10.F(str, 1);
        }
        a10.r(i10, 2);
        roomDatabase.c();
        try {
            a10.k();
            roomDatabase.p();
        } finally {
            roomDatabase.k();
            bVar.d(a10);
        }
    }
}
