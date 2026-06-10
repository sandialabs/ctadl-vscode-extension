package r6;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class v implements u {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f17125a;

    /* renamed from: b  reason: collision with root package name */
    public final a f17126b;
    public final b c;

    /* loaded from: classes.dex */
    public class a extends y3.c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "INSERT OR ABORT INTO `note_labels` (`id`,`note_id`,`label_id`) VALUES (nullif(?, 0),?,?)";
        }

        @Override // y3.c
        public final void e(c4.f fVar, Object obj) {
            t6.e eVar = (t6.e) obj;
            fVar.r(eVar.f17634a, 1);
            fVar.r(eVar.f17635b, 2);
            fVar.r(eVar.c, 3);
        }
    }

    /* loaded from: classes.dex */
    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "DELETE FROM note_labels WHERE note_id = ? AND label_id = ?";
        }
    }

    /* loaded from: classes.dex */
    public class c implements Callable<m7.n> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t6.e f17127a;

        public c(t6.e eVar) {
            this.f17127a = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final m7.n call() {
            v vVar = v.this;
            RoomDatabase roomDatabase = vVar.f17125a;
            roomDatabase.c();
            try {
                vVar.f17126b.g(this.f17127a);
                roomDatabase.p();
                return m7.n.f16010a;
            } finally {
                roomDatabase.k();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements Callable<m7.n> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f17129a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f17130b;

        public d(long j2, long j10) {
            this.f17129a = j2;
            this.f17130b = j10;
        }

        @Override // java.util.concurrent.Callable
        public final m7.n call() {
            v vVar = v.this;
            b bVar = vVar.c;
            c4.f a10 = bVar.a();
            a10.r(this.f17129a, 1);
            a10.r(this.f17130b, 2);
            RoomDatabase roomDatabase = vVar.f17125a;
            roomDatabase.c();
            try {
                a10.k();
                roomDatabase.p();
                return m7.n.f16010a;
            } finally {
                roomDatabase.k();
                bVar.d(a10);
            }
        }
    }

    public v(RoomDatabase roomDatabase) {
        this.f17125a = roomDatabase;
        this.f17126b = new a(roomDatabase);
        this.c = new b(roomDatabase);
    }

    @Override // v6.d
    public final Object a(long j2, long j10, p7.c<? super m7.n> cVar) {
        return androidx.room.b.b(this.f17125a, new d(j2, j10), cVar);
    }

    @Override // v6.d
    public final kotlinx.coroutines.flow.n b() {
        w wVar = new w(this, y3.m.c("SELECT * FROM note_labels", 0));
        return androidx.room.b.a(this.f17125a, new String[]{"note_labels"}, wVar);
    }

    @Override // v6.d
    public final Object c(t6.e eVar, p7.c<? super m7.n> cVar) {
        return androidx.room.b.b(this.f17125a, new c(eVar), cVar);
    }
}
