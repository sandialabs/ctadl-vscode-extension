package r6;

import androidx.room.RoomDatabase;
import com.noto.app.domain.model.NotoColor;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f17091a;

    /* renamed from: b  reason: collision with root package name */
    public final a f17092b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final c f17093d;

    /* loaded from: classes.dex */
    public class a extends y3.c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "INSERT OR ABORT INTO `labels` (`id`,`folder_id`,`title`,`color`,`position`) VALUES (nullif(?, 0),?,?,?,?)";
        }

        @Override // y3.c
        public final void e(c4.f fVar, Object obj) {
            t6.c cVar = (t6.c) obj;
            fVar.r(cVar.f17615a, 1);
            fVar.r(cVar.f17616b, 2);
            String str = cVar.c;
            if (str == null) {
                fVar.o(3);
            } else {
                fVar.F(str, 3);
            }
            NotoColor notoColor = cVar.f17617d;
            v7.g.f(notoColor, "notoColor");
            fVar.r(notoColor.ordinal(), 4);
            fVar.r(cVar.f17618e, 5);
        }
    }

    /* loaded from: classes.dex */
    public class b extends y3.c {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "DELETE FROM `labels` WHERE `id` = ?";
        }

        @Override // y3.c
        public final void e(c4.f fVar, Object obj) {
            fVar.r(((t6.c) obj).f17615a, 1);
        }
    }

    /* loaded from: classes.dex */
    public class c extends y3.c {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "UPDATE OR ABORT `labels` SET `id` = ?,`folder_id` = ?,`title` = ?,`color` = ?,`position` = ? WHERE `id` = ?";
        }

        @Override // y3.c
        public final void e(c4.f fVar, Object obj) {
            t6.c cVar = (t6.c) obj;
            fVar.r(cVar.f17615a, 1);
            fVar.r(cVar.f17616b, 2);
            String str = cVar.c;
            if (str == null) {
                fVar.o(3);
            } else {
                fVar.F(str, 3);
            }
            NotoColor notoColor = cVar.f17617d;
            v7.g.f(notoColor, "notoColor");
            fVar.r(notoColor.ordinal(), 4);
            fVar.r(cVar.f17618e, 5);
            fVar.r(cVar.f17615a, 6);
        }
    }

    /* loaded from: classes.dex */
    public class d implements Callable<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t6.c f17094a;

        public d(t6.c cVar) {
            this.f17094a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final Long call() {
            j jVar = j.this;
            RoomDatabase roomDatabase = jVar.f17091a;
            roomDatabase.c();
            try {
                long h10 = jVar.f17092b.h(this.f17094a);
                roomDatabase.p();
                return Long.valueOf(h10);
            } finally {
                roomDatabase.k();
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements Callable<m7.n> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t6.c f17096a;

        public e(t6.c cVar) {
            this.f17096a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final m7.n call() {
            j jVar = j.this;
            RoomDatabase roomDatabase = jVar.f17091a;
            roomDatabase.c();
            try {
                jVar.c.f(this.f17096a);
                roomDatabase.p();
                return m7.n.f16010a;
            } finally {
                roomDatabase.k();
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements Callable<m7.n> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t6.c f17098a;

        public f(t6.c cVar) {
            this.f17098a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final m7.n call() {
            j jVar = j.this;
            RoomDatabase roomDatabase = jVar.f17091a;
            roomDatabase.c();
            try {
                jVar.f17093d.f(this.f17098a);
                roomDatabase.p();
                return m7.n.f16010a;
            } finally {
                roomDatabase.k();
            }
        }
    }

    public j(RoomDatabase roomDatabase) {
        this.f17091a = roomDatabase;
        this.f17092b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.f17093d = new c(roomDatabase);
    }

    @Override // v6.b
    public final Object a(t6.c cVar, p7.c<? super m7.n> cVar2) {
        return androidx.room.b.b(this.f17091a, new e(cVar), cVar2);
    }

    @Override // v6.b
    public final kotlinx.coroutines.flow.n b(long j2) {
        y3.m c10 = y3.m.c("SELECT * FROM labels WHERE id = ?", 1);
        c10.r(j2, 1);
        m mVar = new m(this, c10);
        return androidx.room.b.a(this.f17091a, new String[]{"labels"}, mVar);
    }

    @Override // v6.b
    public final Object c(t6.c cVar, p7.c<? super m7.n> cVar2) {
        return androidx.room.b.b(this.f17091a, new f(cVar), cVar2);
    }

    @Override // v6.b
    public final kotlinx.coroutines.flow.n d() {
        k kVar = new k(this, y3.m.c("SELECT * FROM labels", 0));
        return androidx.room.b.a(this.f17091a, new String[]{"labels"}, kVar);
    }

    @Override // v6.b
    public final kotlinx.coroutines.flow.n e(long j2) {
        y3.m c10 = y3.m.c("SELECT * FROM labels WHERE folder_id = ?", 1);
        c10.r(j2, 1);
        l lVar = new l(this, c10);
        return androidx.room.b.a(this.f17091a, new String[]{"labels"}, lVar);
    }

    @Override // v6.b
    public final Object f(t6.c cVar, p7.c<? super Long> cVar2) {
        return androidx.room.b.b(this.f17091a, new d(cVar), cVar2);
    }
}
