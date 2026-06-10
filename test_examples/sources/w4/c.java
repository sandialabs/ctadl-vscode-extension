package w4;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f18315a;

    /* renamed from: b  reason: collision with root package name */
    public final a f18316b;

    /* loaded from: classes.dex */
    public class a extends y3.c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // y3.c
        public final void e(c4.f fVar, Object obj) {
            w4.a aVar = (w4.a) obj;
            String str = aVar.f18313a;
            if (str == null) {
                fVar.o(1);
            } else {
                fVar.F(str, 1);
            }
            String str2 = aVar.f18314b;
            if (str2 == null) {
                fVar.o(2);
            } else {
                fVar.F(str2, 2);
            }
        }
    }

    public c(RoomDatabase roomDatabase) {
        this.f18315a = roomDatabase;
        this.f18316b = new a(roomDatabase);
    }

    @Override // w4.b
    public final boolean a(String str) {
        boolean z10 = true;
        y3.m c = y3.m.c("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            c.o(1);
        } else {
            c.F(str, 1);
        }
        RoomDatabase roomDatabase = this.f18315a;
        roomDatabase.b();
        Cursor B = v8.b.B(roomDatabase, c);
        try {
            boolean z11 = false;
            if (B.moveToFirst()) {
                if (B.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            B.close();
            c.h();
        }
    }

    @Override // w4.b
    public final boolean b(String str) {
        boolean z10 = true;
        y3.m c = y3.m.c("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c.o(1);
        } else {
            c.F(str, 1);
        }
        RoomDatabase roomDatabase = this.f18315a;
        roomDatabase.b();
        Cursor B = v8.b.B(roomDatabase, c);
        try {
            boolean z11 = false;
            if (B.moveToFirst()) {
                if (B.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            B.close();
            c.h();
        }
    }

    @Override // w4.b
    public final ArrayList c(String str) {
        y3.m c = y3.m.c("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c.o(1);
        } else {
            c.F(str, 1);
        }
        RoomDatabase roomDatabase = this.f18315a;
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

    @Override // w4.b
    public final void d(w4.a aVar) {
        RoomDatabase roomDatabase = this.f18315a;
        roomDatabase.b();
        roomDatabase.c();
        try {
            this.f18316b.g(aVar);
            roomDatabase.p();
        } finally {
            roomDatabase.k();
        }
    }
}
