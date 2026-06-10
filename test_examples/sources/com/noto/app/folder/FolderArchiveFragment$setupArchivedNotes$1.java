package com.noto.app.folder;

import android.content.Context;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.domain.model.Font;
import com.noto.app.domain.model.GroupingOrder;
import com.noto.app.domain.model.NoteListSortingType;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.domain.model.SortingOrder;
import com.noto.app.util.EpoxyUtilsKt$buildNotesModels$4$2$2;
import com.noto.app.util.ModelUtilsKt;
import com.noto.app.util.ViewUtilsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import x6.h0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/epoxy/m;", "Lm7/n;", "invoke", "(Lcom/airbnb/epoxy/m;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FolderArchiveFragment$setupArchivedNotes$1 extends Lambda implements u7.l<com.airbnb.epoxy.m, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FolderArchiveFragment f8317j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ List<h0> f8318k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ t6.a f8319l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Font f8320m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderArchiveFragment$setupArchivedNotes$1(FolderArchiveFragment folderArchiveFragment, List<h0> list, t6.a aVar, Font font) {
        super(1);
        this.f8317j = folderArchiveFragment;
        this.f8318k = list;
        this.f8319l = aVar;
        this.f8320m = font;
    }

    public static void a(FolderArchiveFragment folderArchiveFragment, h0 h0Var) {
        v7.g.f(folderArchiveFragment, "this$0");
        v7.g.f(h0Var, "$archivedNoteModel");
        NavController g10 = ViewUtilsKt.g(folderArchiveFragment);
        if (g10 != null) {
            t6.d dVar = h0Var.f18683a;
            ViewUtilsKt.o(g10, v8.b.g(dVar.f17622b, dVar.f17621a, null, new long[0], 124), null);
        }
    }

    public static void b(FolderArchiveFragment folderArchiveFragment, h0 h0Var) {
        v7.g.f(folderArchiveFragment, "this$0");
        v7.g.f(h0Var, "$archivedNoteModel");
        NavController g10 = ViewUtilsKt.g(folderArchiveFragment);
        if (g10 != null) {
            t6.d dVar = h0Var.f18683a;
            ViewUtilsKt.o(g10, new x6.d(dVar.f17622b, dVar.f17621a, false, false, new long[0]), null);
        }
    }

    @Override // u7.l
    public final m7.n U(com.airbnb.epoxy.m mVar) {
        String str;
        Context context;
        Iterator it;
        com.airbnb.epoxy.m mVar2 = mVar;
        v7.g.f(mVar2, "$this$withModels");
        final FolderArchiveFragment folderArchiveFragment = this.f8317j;
        Context j2 = folderArchiveFragment.j();
        if (j2 != null) {
            List<h0> list = this.f8318k;
            if (list.isEmpty()) {
                o6.i iVar = new o6.i();
                iVar.E();
                iVar.F(f7.q.f(j2, R.string.archive_is_empty, new Object[0]));
                mVar2.add(iVar);
            } else {
                t6.a aVar = this.f8319l;
                int ordinal = aVar.f17604o.ordinal();
                String str2 = "";
                Font font = this.f8320m;
                boolean z10 = aVar.f17601k;
                int i10 = aVar.f17598h;
                SortingOrder sortingOrder = aVar.n;
                NoteListSortingType noteListSortingType = aVar.f17603m;
                NotoColor notoColor = aVar.f17595e;
                if (ordinal != 0) {
                    GroupingOrder groupingOrder = aVar.f17605p;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                Iterator<T> it2 = ModelUtilsKt.q(list, noteListSortingType, sortingOrder, groupingOrder).iterator();
                                while (it2.hasNext()) {
                                    Pair pair = (Pair) it2.next();
                                    na.d dVar = (na.d) pair.f12962i;
                                    o6.g gVar = new o6.g();
                                    gVar.m(Integer.valueOf(dVar.a()));
                                    gVar.H(f7.g.b(dVar));
                                    gVar.F(notoColor);
                                    mVar2.add(gVar);
                                    for (final h0 h0Var : (List) pair.f12963j) {
                                        r rVar = new r();
                                        rVar.Q(h0Var.f18683a.f17621a);
                                        rVar.W(h0Var);
                                        rVar.P(font);
                                        rVar.c0("");
                                        rVar.b0(i10);
                                        rVar.V(z10);
                                        rVar.O(notoColor);
                                        rVar.R(false);
                                        rVar.X(new a(folderArchiveFragment, 1, h0Var));
                                        rVar.Z(new View.OnLongClickListener() { // from class: com.noto.app.folder.b
                                            @Override // android.view.View.OnLongClickListener
                                            public final boolean onLongClick(View view) {
                                                int i11 = r3;
                                                h0 h0Var2 = h0Var;
                                                FolderArchiveFragment folderArchiveFragment2 = folderArchiveFragment;
                                                switch (i11) {
                                                    case 0:
                                                        FolderArchiveFragment$setupArchivedNotes$1.b(folderArchiveFragment2, h0Var2);
                                                        return true;
                                                    default:
                                                        FolderArchiveFragment$setupArchivedNotes$1.b(folderArchiveFragment2, h0Var2);
                                                        return true;
                                                }
                                            }
                                        });
                                        rVar.Y(new w6.f(1));
                                        mVar2.add(rVar);
                                    }
                                }
                            }
                        } else {
                            Iterator it3 = ModelUtilsKt.s(list, noteListSortingType, sortingOrder, groupingOrder).iterator();
                            while (it3.hasNext()) {
                                Pair pair2 = (Pair) it3.next();
                                List<t6.c> list2 = (List) pair2.f12962i;
                                List<h0> list3 = (List) pair2.f12963j;
                                if (list2.isEmpty()) {
                                    o6.g gVar2 = new o6.g();
                                    gVar2.l("without_label");
                                    gVar2.H(f7.q.f(j2, R.string.without_label, new Object[0]));
                                    gVar2.F(notoColor);
                                    x6.a aVar2 = new x6.a(folderArchiveFragment);
                                    gVar2.p();
                                    gVar2.f16369p = aVar2;
                                    mVar2.add(gVar2);
                                    context = j2;
                                    it = it3;
                                } else {
                                    o6.g gVar3 = new o6.g();
                                    ArrayList arrayList = new ArrayList(n7.l.Z1(list2, 10));
                                    for (t6.c cVar : list2) {
                                        arrayList.add(Long.valueOf(cVar.f17615a));
                                        j2 = j2;
                                        it3 = it3;
                                    }
                                    context = j2;
                                    it = it3;
                                    Long[] lArr = (Long[]) arrayList.toArray(new Long[0]);
                                    gVar3.m((Number[]) Arrays.copyOf(lArr, lArr.length));
                                    gVar3.H(kotlin.collections.c.t2(list2, " • ", null, null, EpoxyUtilsKt$buildNotesModels$4$2$2.f9815j, 30));
                                    gVar3.F(notoColor);
                                    x6.b bVar = new x6.b(list2, folderArchiveFragment);
                                    gVar3.p();
                                    gVar3.f16369p = bVar;
                                    mVar2.add(gVar3);
                                }
                                for (final h0 h0Var2 : list3) {
                                    r rVar2 = new r();
                                    rVar2.Q(h0Var2.f18683a.f17621a);
                                    rVar2.W(h0Var2);
                                    rVar2.P(font);
                                    rVar2.c0("");
                                    rVar2.b0(i10);
                                    rVar2.V(z10);
                                    rVar2.O(notoColor);
                                    rVar2.R(false);
                                    rVar2.X(new View.OnClickListener() { // from class: com.noto.app.folder.d
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i11 = r3;
                                            h0 h0Var3 = h0Var2;
                                            FolderArchiveFragment folderArchiveFragment2 = folderArchiveFragment;
                                            switch (i11) {
                                                case 0:
                                                    FolderArchiveFragment$setupArchivedNotes$1.a(folderArchiveFragment2, h0Var3);
                                                    return;
                                                case 1:
                                                    FolderArchiveFragment$setupArchivedNotes$1.a(folderArchiveFragment2, h0Var3);
                                                    return;
                                                default:
                                                    FolderArchiveFragment$setupArchivedNotes$1.a(folderArchiveFragment2, h0Var3);
                                                    return;
                                            }
                                        }
                                    });
                                    rVar2.Z(new View.OnLongClickListener() { // from class: com.noto.app.folder.b
                                        @Override // android.view.View.OnLongClickListener
                                        public final boolean onLongClick(View view) {
                                            int i11 = r3;
                                            h0 h0Var22 = h0Var2;
                                            FolderArchiveFragment folderArchiveFragment2 = folderArchiveFragment;
                                            switch (i11) {
                                                case 0:
                                                    FolderArchiveFragment$setupArchivedNotes$1.b(folderArchiveFragment2, h0Var22);
                                                    return true;
                                                default:
                                                    FolderArchiveFragment$setupArchivedNotes$1.b(folderArchiveFragment2, h0Var22);
                                                    return true;
                                            }
                                        }
                                    });
                                    rVar2.Y(new w6.f(0));
                                    mVar2.add(rVar2);
                                }
                                j2 = context;
                                it3 = it;
                            }
                        }
                    } else {
                        Iterator<T> it4 = ModelUtilsKt.r(list, noteListSortingType, sortingOrder, groupingOrder).iterator();
                        while (it4.hasNext()) {
                            Pair pair3 = (Pair) it4.next();
                            na.d dVar2 = (na.d) pair3.f12962i;
                            o6.g gVar4 = new o6.g();
                            gVar4.m(Integer.valueOf(dVar2.a()));
                            gVar4.H(f7.g.b(dVar2));
                            gVar4.F(notoColor);
                            mVar2.add(gVar4);
                            for (final h0 h0Var3 : (List) pair3.f12963j) {
                                r rVar3 = new r();
                                rVar3.Q(h0Var3.f18683a.f17621a);
                                rVar3.W(h0Var3);
                                rVar3.P(font);
                                rVar3.c0("");
                                rVar3.b0(i10);
                                rVar3.V(z10);
                                rVar3.O(notoColor);
                                rVar3.R(false);
                                rVar3.X(new View.OnClickListener() { // from class: com.noto.app.folder.d
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i11 = r3;
                                        h0 h0Var32 = h0Var3;
                                        FolderArchiveFragment folderArchiveFragment2 = folderArchiveFragment;
                                        switch (i11) {
                                            case 0:
                                                FolderArchiveFragment$setupArchivedNotes$1.a(folderArchiveFragment2, h0Var32);
                                                return;
                                            case 1:
                                                FolderArchiveFragment$setupArchivedNotes$1.a(folderArchiveFragment2, h0Var32);
                                                return;
                                            default:
                                                FolderArchiveFragment$setupArchivedNotes$1.a(folderArchiveFragment2, h0Var32);
                                                return;
                                        }
                                    }
                                });
                                rVar3.Z(new View.OnLongClickListener() { // from class: com.noto.app.folder.c
                                    @Override // android.view.View.OnLongClickListener
                                    public final boolean onLongClick(View view) {
                                        int i11 = r3;
                                        h0 h0Var4 = h0Var3;
                                        FolderArchiveFragment folderArchiveFragment2 = folderArchiveFragment;
                                        switch (i11) {
                                            case 0:
                                                FolderArchiveFragment$setupArchivedNotes$1.b(folderArchiveFragment2, h0Var4);
                                                return true;
                                            case 1:
                                                FolderArchiveFragment$setupArchivedNotes$1.b(folderArchiveFragment2, h0Var4);
                                                return true;
                                            default:
                                                FolderArchiveFragment$setupArchivedNotes$1.b(folderArchiveFragment2, h0Var4);
                                                return true;
                                        }
                                    }
                                });
                                rVar3.Y(new w6.f(2));
                                mVar2.add(rVar3);
                            }
                        }
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        if (((h0) obj).f18683a.f17626g) {
                            arrayList2.add(obj);
                        }
                    }
                    List<h0> B = ModelUtilsKt.B(arrayList2, noteListSortingType, sortingOrder);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list) {
                        if (!((h0) obj2).f18683a.f17626g) {
                            arrayList3.add(obj2);
                        }
                    }
                    List<h0> B2 = ModelUtilsKt.B(arrayList3, noteListSortingType, sortingOrder);
                    if (!(!B.isEmpty())) {
                        str = "";
                    } else {
                        o6.g gVar5 = new o6.g();
                        gVar5.l("pinned");
                        gVar5.H(f7.q.f(j2, R.string.pinned, new Object[0]));
                        gVar5.F(notoColor);
                        mVar2.add(gVar5);
                        for (final h0 h0Var4 : B) {
                            r rVar4 = new r();
                            String str3 = str2;
                            rVar4.Q(h0Var4.f18683a.f17621a);
                            rVar4.W(h0Var4);
                            rVar4.P(font);
                            rVar4.c0(str3);
                            rVar4.b0(i10);
                            rVar4.V(z10);
                            rVar4.O(notoColor);
                            rVar4.R(false);
                            rVar4.X(new a(folderArchiveFragment, 0, h0Var4));
                            rVar4.Z(new View.OnLongClickListener() { // from class: com.noto.app.folder.c
                                @Override // android.view.View.OnLongClickListener
                                public final boolean onLongClick(View view) {
                                    int i11 = r3;
                                    h0 h0Var42 = h0Var4;
                                    FolderArchiveFragment folderArchiveFragment2 = folderArchiveFragment;
                                    switch (i11) {
                                        case 0:
                                            FolderArchiveFragment$setupArchivedNotes$1.b(folderArchiveFragment2, h0Var42);
                                            return true;
                                        case 1:
                                            FolderArchiveFragment$setupArchivedNotes$1.b(folderArchiveFragment2, h0Var42);
                                            return true;
                                        default:
                                            FolderArchiveFragment$setupArchivedNotes$1.b(folderArchiveFragment2, h0Var42);
                                            return true;
                                    }
                                }
                            });
                            rVar4.Y(new w6.f(0));
                            mVar2.add(rVar4);
                            str2 = str3;
                        }
                        str = str2;
                        if (!B2.isEmpty()) {
                            o6.g gVar6 = new o6.g();
                            gVar6.l("notes");
                            gVar6.H(f7.q.f(j2, R.string.notes, new Object[0]));
                            gVar6.F(notoColor);
                            mVar2.add(gVar6);
                        }
                    }
                    for (final h0 h0Var5 : B2) {
                        r rVar5 = new r();
                        rVar5.Q(h0Var5.f18683a.f17621a);
                        rVar5.W(h0Var5);
                        rVar5.P(font);
                        rVar5.c0(str);
                        rVar5.b0(i10);
                        rVar5.V(z10);
                        rVar5.O(notoColor);
                        rVar5.R(false);
                        rVar5.X(new View.OnClickListener() { // from class: com.noto.app.folder.d
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i11 = r3;
                                h0 h0Var32 = h0Var5;
                                FolderArchiveFragment folderArchiveFragment2 = folderArchiveFragment;
                                switch (i11) {
                                    case 0:
                                        FolderArchiveFragment$setupArchivedNotes$1.a(folderArchiveFragment2, h0Var32);
                                        return;
                                    case 1:
                                        FolderArchiveFragment$setupArchivedNotes$1.a(folderArchiveFragment2, h0Var32);
                                        return;
                                    default:
                                        FolderArchiveFragment$setupArchivedNotes$1.a(folderArchiveFragment2, h0Var32);
                                        return;
                                }
                            }
                        });
                        rVar5.Z(new View.OnLongClickListener() { // from class: com.noto.app.folder.c
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                int i11 = r3;
                                h0 h0Var42 = h0Var5;
                                FolderArchiveFragment folderArchiveFragment2 = folderArchiveFragment;
                                switch (i11) {
                                    case 0:
                                        FolderArchiveFragment$setupArchivedNotes$1.b(folderArchiveFragment2, h0Var42);
                                        return true;
                                    case 1:
                                        FolderArchiveFragment$setupArchivedNotes$1.b(folderArchiveFragment2, h0Var42);
                                        return true;
                                    default:
                                        FolderArchiveFragment$setupArchivedNotes$1.b(folderArchiveFragment2, h0Var42);
                                        return true;
                                }
                            }
                        });
                        rVar5.Y(new w6.f(1));
                        mVar2.add(rVar5);
                    }
                }
            }
            m7.n nVar = m7.n.f16010a;
        }
        return m7.n.f16010a;
    }
}
