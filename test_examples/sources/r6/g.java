package r6;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import com.noto.app.domain.model.FilteringType;
import com.noto.app.domain.model.Grouping;
import com.noto.app.domain.model.GroupingOrder;
import com.noto.app.domain.model.Layout;
import com.noto.app.domain.model.NewNoteCursorPosition;
import com.noto.app.domain.model.NoteListSortingType;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.domain.model.OpenNotesIn;
import com.noto.app.domain.model.SortingOrder;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class g implements r6.a {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f17080a;

    /* renamed from: b  reason: collision with root package name */
    public final a f17081b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final c f17082d;

    /* loaded from: classes.dex */
    public class a extends y3.c {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "INSERT OR ABORT INTO `folders` (`id`,`parent_id`,`title`,`position`,`color`,`creation_date`,`layout`,`note_preview_size`,`is_archived`,`is_pinned`,`is_show_note_creation_date`,`new_note_cursor_position`,`sorting_type`,`sorting_order`,`grouping`,`grouping_order`,`is_vaulted`,`scrolling_position`,`filtering_type`,`open_notes_in`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // y3.c
        public final void e(c4.f fVar, Object obj) {
            t6.a aVar = (t6.a) obj;
            fVar.r(aVar.f17592a, 1);
            Long l2 = aVar.f17593b;
            if (l2 == null) {
                fVar.o(2);
            } else {
                fVar.r(l2.longValue(), 2);
            }
            String str = aVar.c;
            if (str == null) {
                fVar.o(3);
            } else {
                fVar.F(str, 3);
            }
            fVar.r(aVar.f17594d, 4);
            NotoColor notoColor = aVar.f17595e;
            v7.g.f(notoColor, "notoColor");
            fVar.r(notoColor.ordinal(), 5);
            String b5 = p6.a.b(aVar.f17596f);
            if (b5 == null) {
                fVar.o(6);
            } else {
                fVar.F(b5, 6);
            }
            Layout layout = aVar.f17597g;
            v7.g.f(layout, "layout");
            fVar.r(layout.ordinal(), 7);
            fVar.r(aVar.f17598h, 8);
            fVar.r(aVar.f17599i ? 1L : 0L, 9);
            fVar.r(aVar.f17600j ? 1L : 0L, 10);
            fVar.r(aVar.f17601k ? 1L : 0L, 11);
            NewNoteCursorPosition newNoteCursorPosition = aVar.f17602l;
            v7.g.f(newNoteCursorPosition, "position");
            fVar.r(newNoteCursorPosition.ordinal(), 12);
            NoteListSortingType noteListSortingType = aVar.f17603m;
            v7.g.f(noteListSortingType, "sortingType");
            fVar.r(noteListSortingType.ordinal(), 13);
            SortingOrder sortingOrder = aVar.n;
            v7.g.f(sortingOrder, "sortingOrder");
            fVar.r(sortingOrder.ordinal(), 14);
            Grouping grouping = aVar.f17604o;
            v7.g.f(grouping, "grouping");
            fVar.r(grouping.ordinal(), 15);
            GroupingOrder groupingOrder = aVar.f17605p;
            v7.g.f(groupingOrder, "groupingOrder");
            fVar.r(groupingOrder.ordinal(), 16);
            fVar.r(aVar.f17606q ? 1L : 0L, 17);
            fVar.r(aVar.f17607r, 18);
            FilteringType filteringType = aVar.f17608s;
            v7.g.f(filteringType, "filteringType");
            fVar.r(filteringType.ordinal(), 19);
            OpenNotesIn openNotesIn = aVar.f17609t;
            v7.g.f(openNotesIn, "openNotesIn");
            fVar.r(openNotesIn.ordinal(), 20);
        }
    }

    /* loaded from: classes.dex */
    public class b extends y3.c {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "DELETE FROM `folders` WHERE `id` = ?";
        }

        @Override // y3.c
        public final void e(c4.f fVar, Object obj) {
            fVar.r(((t6.a) obj).f17592a, 1);
        }
    }

    /* loaded from: classes.dex */
    public class c extends y3.c {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "UPDATE OR ABORT `folders` SET `id` = ?,`parent_id` = ?,`title` = ?,`position` = ?,`color` = ?,`creation_date` = ?,`layout` = ?,`note_preview_size` = ?,`is_archived` = ?,`is_pinned` = ?,`is_show_note_creation_date` = ?,`new_note_cursor_position` = ?,`sorting_type` = ?,`sorting_order` = ?,`grouping` = ?,`grouping_order` = ?,`is_vaulted` = ?,`scrolling_position` = ?,`filtering_type` = ?,`open_notes_in` = ? WHERE `id` = ?";
        }

        @Override // y3.c
        public final void e(c4.f fVar, Object obj) {
            t6.a aVar = (t6.a) obj;
            fVar.r(aVar.f17592a, 1);
            Long l2 = aVar.f17593b;
            if (l2 == null) {
                fVar.o(2);
            } else {
                fVar.r(l2.longValue(), 2);
            }
            String str = aVar.c;
            if (str == null) {
                fVar.o(3);
            } else {
                fVar.F(str, 3);
            }
            fVar.r(aVar.f17594d, 4);
            NotoColor notoColor = aVar.f17595e;
            v7.g.f(notoColor, "notoColor");
            fVar.r(notoColor.ordinal(), 5);
            String b5 = p6.a.b(aVar.f17596f);
            if (b5 == null) {
                fVar.o(6);
            } else {
                fVar.F(b5, 6);
            }
            Layout layout = aVar.f17597g;
            v7.g.f(layout, "layout");
            fVar.r(layout.ordinal(), 7);
            fVar.r(aVar.f17598h, 8);
            fVar.r(aVar.f17599i ? 1L : 0L, 9);
            fVar.r(aVar.f17600j ? 1L : 0L, 10);
            fVar.r(aVar.f17601k ? 1L : 0L, 11);
            NewNoteCursorPosition newNoteCursorPosition = aVar.f17602l;
            v7.g.f(newNoteCursorPosition, "position");
            fVar.r(newNoteCursorPosition.ordinal(), 12);
            NoteListSortingType noteListSortingType = aVar.f17603m;
            v7.g.f(noteListSortingType, "sortingType");
            fVar.r(noteListSortingType.ordinal(), 13);
            SortingOrder sortingOrder = aVar.n;
            v7.g.f(sortingOrder, "sortingOrder");
            fVar.r(sortingOrder.ordinal(), 14);
            Grouping grouping = aVar.f17604o;
            v7.g.f(grouping, "grouping");
            fVar.r(grouping.ordinal(), 15);
            GroupingOrder groupingOrder = aVar.f17605p;
            v7.g.f(groupingOrder, "groupingOrder");
            fVar.r(groupingOrder.ordinal(), 16);
            fVar.r(aVar.f17606q ? 1L : 0L, 17);
            fVar.r(aVar.f17607r, 18);
            FilteringType filteringType = aVar.f17608s;
            v7.g.f(filteringType, "filteringType");
            fVar.r(filteringType.ordinal(), 19);
            OpenNotesIn openNotesIn = aVar.f17609t;
            v7.g.f(openNotesIn, "openNotesIn");
            fVar.r(openNotesIn.ordinal(), 20);
            fVar.r(aVar.f17592a, 21);
        }
    }

    /* loaded from: classes.dex */
    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "DELETE FROM folders";
        }
    }

    /* loaded from: classes.dex */
    public class e implements Callable<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t6.a f17083a;

        public e(t6.a aVar) {
            this.f17083a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final Long call() {
            g gVar = g.this;
            RoomDatabase roomDatabase = gVar.f17080a;
            roomDatabase.c();
            try {
                long h10 = gVar.f17081b.h(this.f17083a);
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
        public final /* synthetic */ t6.a f17085a;

        public f(t6.a aVar) {
            this.f17085a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final m7.n call() {
            g gVar = g.this;
            RoomDatabase roomDatabase = gVar.f17080a;
            roomDatabase.c();
            try {
                gVar.c.f(this.f17085a);
                roomDatabase.p();
                return m7.n.f16010a;
            } finally {
                roomDatabase.k();
            }
        }
    }

    /* renamed from: r6.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class CallableC0215g implements Callable<m7.n> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t6.a f17087a;

        public CallableC0215g(t6.a aVar) {
            this.f17087a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final m7.n call() {
            g gVar = g.this;
            RoomDatabase roomDatabase = gVar.f17080a;
            roomDatabase.c();
            try {
                gVar.f17082d.f(this.f17087a);
                roomDatabase.p();
                return m7.n.f16010a;
            } finally {
                roomDatabase.k();
            }
        }
    }

    public g(RoomDatabase roomDatabase) {
        this.f17080a = roomDatabase;
        this.f17081b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.f17082d = new c(roomDatabase);
        new d(roomDatabase);
    }

    @Override // v6.a
    public final kotlinx.coroutines.flow.n a() {
        r6.d dVar = new r6.d(this, y3.m.c("SELECT * FROM folders WHERE is_archived = 1 AND is_vaulted = 0", 0));
        return androidx.room.b.a(this.f17080a, new String[]{"folders"}, dVar);
    }

    @Override // v6.a
    public final Object b(t6.a aVar, p7.c<? super m7.n> cVar) {
        return androidx.room.b.b(this.f17080a, new f(aVar), cVar);
    }

    @Override // v6.a
    public final kotlinx.coroutines.flow.n c() {
        h hVar = new h(this, y3.m.c("SELECT * FROM folders", 0));
        return androidx.room.b.a(this.f17080a, new String[]{"folders"}, hVar);
    }

    @Override // v6.a
    public final kotlinx.coroutines.flow.n d(long j2) {
        y3.m c10 = y3.m.c("SELECT * FROM folders WHERE id = ?", 1);
        c10.r(j2, 1);
        r6.f fVar = new r6.f(this, c10);
        return androidx.room.b.a(this.f17080a, new String[]{"folders"}, fVar);
    }

    @Override // v6.a
    public final kotlinx.coroutines.flow.n e() {
        r6.c cVar = new r6.c(this, y3.m.c("SELECT * FROM folders WHERE is_archived = 0 AND is_vaulted = 0", 0));
        return androidx.room.b.a(this.f17080a, new String[]{"folders"}, cVar);
    }

    @Override // v6.a
    public final Object f(t6.a aVar, p7.c<? super m7.n> cVar) {
        return androidx.room.b.b(this.f17080a, new CallableC0215g(aVar), cVar);
    }

    @Override // v6.a
    public final kotlinx.coroutines.flow.n g() {
        r6.e eVar = new r6.e(this, y3.m.c("SELECT * FROM folders WHERE is_vaulted = 1 AND is_archived = 0", 0));
        return androidx.room.b.a(this.f17080a, new String[]{"folders"}, eVar);
    }

    @Override // v6.a
    public final kotlinx.coroutines.flow.n h() {
        r6.b bVar = new r6.b(this, y3.m.c("SELECT * FROM folders WHERE is_vaulted = 0", 0));
        return androidx.room.b.a(this.f17080a, new String[]{"folders"}, bVar);
    }

    @Override // v6.a
    public final Object i(t6.a aVar, p7.c<? super Long> cVar) {
        return androidx.room.b.b(this.f17080a, new e(aVar), cVar);
    }
}
