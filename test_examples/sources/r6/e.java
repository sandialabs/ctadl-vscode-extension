package r6;

import android.database.Cursor;
import com.noto.app.domain.model.FilteringType;
import com.noto.app.domain.model.Grouping;
import com.noto.app.domain.model.GroupingOrder;
import com.noto.app.domain.model.Layout;
import com.noto.app.domain.model.NewNoteCursorPosition;
import com.noto.app.domain.model.NoteListSortingType;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.domain.model.SortingOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class e implements Callable<List<t6.a>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y3.m f17076a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f17077b;

    public e(g gVar, y3.m mVar) {
        this.f17077b = gVar;
        this.f17076a = mVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<t6.a> call() {
        int i10;
        boolean z10;
        Cursor B = v8.b.B(this.f17077b.f17080a, this.f17076a);
        try {
            int U = a1.b.U(B, "id");
            int U2 = a1.b.U(B, "parent_id");
            int U3 = a1.b.U(B, "title");
            int U4 = a1.b.U(B, "position");
            int U5 = a1.b.U(B, "color");
            int U6 = a1.b.U(B, "creation_date");
            int U7 = a1.b.U(B, "layout");
            int U8 = a1.b.U(B, "note_preview_size");
            int U9 = a1.b.U(B, "is_archived");
            int U10 = a1.b.U(B, "is_pinned");
            int U11 = a1.b.U(B, "is_show_note_creation_date");
            int U12 = a1.b.U(B, "new_note_cursor_position");
            int U13 = a1.b.U(B, "sorting_type");
            int U14 = a1.b.U(B, "sorting_order");
            int U15 = a1.b.U(B, "grouping");
            int U16 = a1.b.U(B, "grouping_order");
            int U17 = a1.b.U(B, "is_vaulted");
            int U18 = a1.b.U(B, "scrolling_position");
            int U19 = a1.b.U(B, "filtering_type");
            int U20 = a1.b.U(B, "open_notes_in");
            int i11 = U14;
            ArrayList arrayList = new ArrayList(B.getCount());
            while (B.moveToNext()) {
                long j2 = B.getLong(U);
                String str = null;
                Long valueOf = B.isNull(U2) ? null : Long.valueOf(B.getLong(U2));
                String string = B.isNull(U3) ? null : B.getString(U3);
                int i12 = B.getInt(U4);
                NotoColor T = ma.i.T(B.getInt(U5));
                if (!B.isNull(U6)) {
                    str = B.getString(U6);
                }
                na.c a10 = p6.a.a(str);
                if (a10 == null) {
                    throw new IllegalStateException("Expected non-null kotlinx.datetime.Instant, but it was null.");
                }
                Layout v12 = m0.b.v1(B.getInt(U7));
                int i13 = B.getInt(U8);
                boolean z11 = B.getInt(U9) != 0;
                boolean z12 = B.getInt(U10) != 0;
                boolean z13 = B.getInt(U11) != 0;
                NewNoteCursorPosition w12 = m0.b.w1(B.getInt(U12));
                NoteListSortingType x12 = m0.b.x1(B.getInt(U13));
                int i14 = U;
                int i15 = i11;
                SortingOrder U21 = ma.i.U(B.getInt(i15));
                i11 = i15;
                int i16 = U15;
                Grouping u12 = m0.b.u1(B.getInt(i16));
                U15 = i16;
                int i17 = U16;
                GroupingOrder S = ma.i.S(B.getInt(i17));
                U16 = i17;
                int i18 = U17;
                if (B.getInt(i18) != 0) {
                    U17 = i18;
                    i10 = U18;
                    z10 = true;
                } else {
                    U17 = i18;
                    i10 = U18;
                    z10 = false;
                }
                int i19 = B.getInt(i10);
                U18 = i10;
                int i20 = U19;
                FilteringType R = ma.i.R(B.getInt(i20));
                U19 = i20;
                int i21 = U20;
                U20 = i21;
                arrayList.add(new t6.a(j2, valueOf, string, i12, T, a10, v12, i13, z11, z12, z13, w12, x12, U21, u12, S, z10, R, i19, m0.b.y1(B.getInt(i21))));
                U = i14;
            }
            return arrayList;
        } finally {
            B.close();
        }
    }

    public final void finalize() {
        this.f17076a.h();
    }
}
