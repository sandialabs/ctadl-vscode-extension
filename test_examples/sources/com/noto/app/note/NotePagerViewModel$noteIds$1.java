package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.NoteListSortingType;
import com.noto.app.domain.model.SortingOrder;
import com.noto.app.util.ModelUtilsKt;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import u7.q;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"", "Lt6/d;", "notes", "Lt6/a;", "folder", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NotePagerViewModel$noteIds$1", f = "NotePagerViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NotePagerViewModel$noteIds$1 extends SuspendLambda implements q<List<? extends t6.d>, t6.a, p7.c<? super List<? extends t6.d>>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ List f9154m;
    public /* synthetic */ t6.a n;

    public NotePagerViewModel$noteIds$1(p7.c<? super NotePagerViewModel$noteIds$1> cVar) {
        super(3, cVar);
    }

    @Override // u7.q
    public final Object O(List<? extends t6.d> list, t6.a aVar, p7.c<? super List<? extends t6.d>> cVar) {
        NotePagerViewModel$noteIds$1 notePagerViewModel$noteIds$1 = new NotePagerViewModel$noteIds$1(cVar);
        notePagerViewModel$noteIds$1.f9154m = list;
        notePagerViewModel$noteIds$1.n = aVar;
        return notePagerViewModel$noteIds$1.k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        Comparator kVar;
        m0.b.n1(obj);
        List list = this.f9154m;
        t6.a aVar = this.n;
        NoteListSortingType noteListSortingType = aVar.f17603m;
        int i10 = ModelUtilsKt.f9848a;
        v7.g.f(list, "<this>");
        v7.g.f(noteListSortingType, "sortingType");
        SortingOrder sortingOrder = aVar.n;
        v7.g.f(sortingOrder, "sortingOrder");
        f7.j jVar = new f7.j();
        int ordinal = sortingOrder.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                kVar = new f7.l(jVar, noteListSortingType);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            kVar = new f7.k(jVar, noteListSortingType);
        }
        return kotlin.collections.c.G2(list, kVar);
    }
}
