package r6;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class s implements n {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f17114a;

    /* renamed from: b  reason: collision with root package name */
    public final a f17115b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final c f17116d;

    /* loaded from: classes.dex */
    public class a extends y3.c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "INSERT OR ABORT INTO `notes` (`id`,`folder_id`,`title`,`body`,`position`,`creation_date`,`is_pinned`,`is_archived`,`reminder_date`,`is_vaulted`,`access_date`,`scrolling_position`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // y3.c
        public final void e(c4.f fVar, Object obj) {
            t6.d dVar = (t6.d) obj;
            fVar.r(dVar.f17621a, 1);
            fVar.r(dVar.f17622b, 2);
            String str = dVar.c;
            if (str == null) {
                fVar.o(3);
            } else {
                fVar.F(str, 3);
            }
            String str2 = dVar.f17623d;
            if (str2 == null) {
                fVar.o(4);
            } else {
                fVar.F(str2, 4);
            }
            fVar.r(dVar.f17624e, 5);
            String b5 = p6.a.b(dVar.f17625f);
            if (b5 == null) {
                fVar.o(6);
            } else {
                fVar.F(b5, 6);
            }
            fVar.r(dVar.f17626g ? 1L : 0L, 7);
            fVar.r(dVar.f17627h ? 1L : 0L, 8);
            String b10 = p6.a.b(dVar.f17628i);
            if (b10 == null) {
                fVar.o(9);
            } else {
                fVar.F(b10, 9);
            }
            fVar.r(dVar.f17629j ? 1L : 0L, 10);
            String b11 = p6.a.b(dVar.f17630k);
            if (b11 == null) {
                fVar.o(11);
            } else {
                fVar.F(b11, 11);
            }
            fVar.r(dVar.f17631l, 12);
        }
    }

    /* loaded from: classes.dex */
    public class b extends y3.c {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "DELETE FROM `notes` WHERE `id` = ?";
        }

        @Override // y3.c
        public final void e(c4.f fVar, Object obj) {
            fVar.r(((t6.d) obj).f17621a, 1);
        }
    }

    /* loaded from: classes.dex */
    public class c extends y3.c {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "UPDATE OR ABORT `notes` SET `id` = ?,`folder_id` = ?,`title` = ?,`body` = ?,`position` = ?,`creation_date` = ?,`is_pinned` = ?,`is_archived` = ?,`reminder_date` = ?,`is_vaulted` = ?,`access_date` = ?,`scrolling_position` = ? WHERE `id` = ?";
        }

        @Override // y3.c
        public final void e(c4.f fVar, Object obj) {
            t6.d dVar = (t6.d) obj;
            fVar.r(dVar.f17621a, 1);
            fVar.r(dVar.f17622b, 2);
            String str = dVar.c;
            if (str == null) {
                fVar.o(3);
            } else {
                fVar.F(str, 3);
            }
            String str2 = dVar.f17623d;
            if (str2 == null) {
                fVar.o(4);
            } else {
                fVar.F(str2, 4);
            }
            fVar.r(dVar.f17624e, 5);
            String b5 = p6.a.b(dVar.f17625f);
            if (b5 == null) {
                fVar.o(6);
            } else {
                fVar.F(b5, 6);
            }
            fVar.r(dVar.f17626g ? 1L : 0L, 7);
            fVar.r(dVar.f17627h ? 1L : 0L, 8);
            String b10 = p6.a.b(dVar.f17628i);
            if (b10 == null) {
                fVar.o(9);
            } else {
                fVar.F(b10, 9);
            }
            fVar.r(dVar.f17629j ? 1L : 0L, 10);
            String b11 = p6.a.b(dVar.f17630k);
            if (b11 == null) {
                fVar.o(11);
            } else {
                fVar.F(b11, 11);
            }
            fVar.r(dVar.f17631l, 12);
            fVar.r(dVar.f17621a, 13);
        }
    }

    /* loaded from: classes.dex */
    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "DELETE FROM notes";
        }
    }

    /* loaded from: classes.dex */
    public class e implements Callable<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t6.d f17117a;

        public e(t6.d dVar) {
            this.f17117a = dVar;
        }

        @Override // java.util.concurrent.Callable
        public final Long call() {
            s sVar = s.this;
            RoomDatabase roomDatabase = sVar.f17114a;
            roomDatabase.c();
            try {
                long h10 = sVar.f17115b.h(this.f17117a);
                roomDatabase.p();
                return Long.valueOf(h10);
            } finally {
                roomDatabase.k();
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements Callable<m7.n> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t6.d f17119a;

        public f(t6.d dVar) {
            this.f17119a = dVar;
        }

        @Override // java.util.concurrent.Callable
        public final m7.n call() {
            s sVar = s.this;
            RoomDatabase roomDatabase = sVar.f17114a;
            roomDatabase.c();
            try {
                sVar.c.f(this.f17119a);
                roomDatabase.p();
                return m7.n.f16010a;
            } finally {
                roomDatabase.k();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements Callable<m7.n> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t6.d f17121a;

        public g(t6.d dVar) {
            this.f17121a = dVar;
        }

        @Override // java.util.concurrent.Callable
        public final m7.n call() {
            s sVar = s.this;
            RoomDatabase roomDatabase = sVar.f17114a;
            roomDatabase.c();
            try {
                sVar.f17116d.f(this.f17121a);
                roomDatabase.p();
                return m7.n.f16010a;
            } finally {
                roomDatabase.k();
            }
        }
    }

    public s(RoomDatabase roomDatabase) {
        this.f17114a = roomDatabase;
        this.f17115b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.f17116d = new c(roomDatabase);
        new d(roomDatabase);
    }

    @Override // v6.c
    public final kotlinx.coroutines.flow.n a(long j2) {
        y3.m c10 = y3.m.c("SELECT * FROM notes WHERE folder_id = ? AND is_archived = 1 ORDER BY id DESC", 1);
        c10.r(j2, 1);
        p pVar = new p(this, c10);
        return androidx.room.b.a(this.f17114a, new String[]{"notes"}, pVar);
    }

    @Override // v6.c
    public final Object b(t6.d dVar, p7.c<? super m7.n> cVar) {
        return androidx.room.b.b(this.f17114a, new f(dVar), cVar);
    }

    @Override // v6.c
    public final Object c(t6.d dVar, p7.c<? super m7.n> cVar) {
        return androidx.room.b.b(this.f17114a, new g(dVar), cVar);
    }

    @Override // v6.c
    public final kotlinx.coroutines.flow.n d(long j2) {
        y3.m c10 = y3.m.c("SELECT * FROM notes WHERE folder_id = ? AND is_archived = 0 ORDER BY id DESC", 1);
        c10.r(j2, 1);
        o oVar = new o(this, c10);
        return androidx.room.b.a(this.f17114a, new String[]{"notes"}, oVar);
    }

    @Override // v6.c
    public final kotlinx.coroutines.flow.n e() {
        t tVar = new t(this, y3.m.c("SELECT * FROM notes ORDER BY id DESC", 0));
        return androidx.room.b.a(this.f17114a, new String[]{"notes"}, tVar);
    }

    @Override // v6.c
    public final kotlinx.coroutines.flow.n f(long j2) {
        y3.m c10 = y3.m.c("SELECT * FROM notes WHERE id = ?", 1);
        c10.r(j2, 1);
        q qVar = new q(this, c10);
        return androidx.room.b.a(this.f17114a, new String[]{"notes"}, qVar);
    }

    @Override // v6.c
    public final kotlinx.coroutines.flow.n g() {
        r rVar = new r(this, y3.m.c("SELECT folder_id, COUNT(*) as notesCount FROM notes WHERE is_archived = 0 GROUP BY folder_id", 0));
        return androidx.room.b.a(this.f17114a, new String[]{"notes"}, rVar);
    }

    @Override // v6.c
    public final Object h(t6.d dVar, p7.c<? super Long> cVar) {
        return androidx.room.b.b(this.f17114a, new e(dVar), cVar);
    }
}
