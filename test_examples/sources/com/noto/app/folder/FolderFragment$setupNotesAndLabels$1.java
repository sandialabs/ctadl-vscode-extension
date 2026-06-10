package com.noto.app.folder;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;
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
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import n6.c;
import x6.a0;
import x6.h0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/epoxy/m;", "Lm7/n;", "invoke", "(Lcom/airbnb/epoxy/m;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FolderFragment$setupNotesAndLabels$1 extends Lambda implements u7.l<com.airbnb.epoxy.m, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FolderFragment f8391j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ List<y6.h> f8392k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ t6.a f8393l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ List<h0> f8394m;
    public final /* synthetic */ Font n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ String f8395o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ boolean f8396p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ s6.i f8397q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderFragment$setupNotesAndLabels$1(FolderFragment folderFragment, List<y6.h> list, t6.a aVar, List<h0> list2, Font font, String str, boolean z10, s6.i iVar) {
        super(1);
        this.f8391j = folderFragment;
        this.f8392k = list;
        this.f8393l = aVar;
        this.f8394m = list2;
        this.n = font;
        this.f8395o = str;
        this.f8396p = z10;
        this.f8397q = iVar;
    }

    public static void a(t6.a aVar, FolderFragment folderFragment, h0 h0Var, long[] jArr) {
        NavController g10;
        androidx.navigation.o n;
        v7.g.f(aVar, "$folder");
        v7.g.f(folderFragment, "this$0");
        v7.g.f(h0Var, "$model");
        v7.g.f(jArr, "$noteIds");
        int ordinal = aVar.f17609t.ordinal();
        t6.d dVar = h0Var.f18683a;
        if (ordinal != 0) {
            if (ordinal == 1 && (g10 = ViewUtilsKt.g(folderFragment)) != null) {
                n = new a0(dVar.f17622b, dVar.f17621a, jArr);
            } else {
                return;
            }
        } else {
            g10 = ViewUtilsKt.g(folderFragment);
            if (g10 != null) {
                n = ma.i.n(dVar.f17622b, dVar.f17621a, null, jArr, 124);
            } else {
                return;
            }
        }
        ViewUtilsKt.o(g10, n, null);
    }

    public static void b(FolderFragment folderFragment, h0 h0Var) {
        v7.g.f(folderFragment, "this$0");
        v7.g.f(h0Var, "$model");
        int i10 = FolderFragment.f8358k0;
        folderFragment.a0().u(h0Var.f18683a.f17621a);
    }

    public static boolean c(s6.i iVar, FolderFragment folderFragment, View view, MotionEvent motionEvent) {
        RecyclerView.b0 D;
        androidx.recyclerview.widget.n nVar;
        v7.g.f(iVar, "$this_setupNotesAndLabels");
        v7.g.f(folderFragment, "this$0");
        if (motionEvent.getAction() == 0 && (D = iVar.f17374g.D(view)) != null && (nVar = folderFragment.f8362g0) != null) {
            nVar.t(D);
        }
        return view.performClick();
    }

    public static void d(FolderFragment folderFragment, h0 h0Var) {
        Object bVar;
        v7.g.f(folderFragment, "this$0");
        v7.g.f(h0Var, "$model");
        int i10 = FolderFragment.f8358k0;
        FolderViewModel a02 = folderFragment.a0();
        long j2 = h0Var.f18683a.f17621a;
        StateFlowImpl stateFlowImpl = a02.f8434m;
        n6.c cVar = (n6.c) ((kotlinx.coroutines.flow.m) a02.m()).getValue();
        if (cVar instanceof c.a) {
            bVar = c.a.f16110a;
        } else if (cVar instanceof c.b) {
            List<h0> list = (List) ((c.b) cVar).f16111a;
            ArrayList arrayList = new ArrayList(n7.l.Z1(list, 10));
            for (h0 h0Var2 : list) {
                if (h0Var2.f18683a.f17621a == j2) {
                    h0Var2 = h0.a(h0Var2, null, false, -1, 3);
                }
                arrayList.add(h0Var2);
            }
            bVar = new c.b(arrayList);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        stateFlowImpl.setValue(bVar);
    }

    public static void e(FolderFragment folderFragment, h0 h0Var, long[] jArr) {
        v7.g.f(folderFragment, "this$0");
        v7.g.f(h0Var, "$model");
        v7.g.f(jArr, "$noteIds");
        NavController g10 = ViewUtilsKt.g(folderFragment);
        if (g10 != null) {
            t6.d dVar = h0Var.f18683a;
            ViewUtilsKt.o(g10, ma.i.m(dVar.f17622b, dVar.f17621a, true, false, jArr, 16), null);
        }
    }

    @Override // u7.l
    public final m7.n U(com.airbnb.epoxy.m mVar) {
        int i10;
        t6.a aVar;
        NoteListSortingType noteListSortingType;
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        com.airbnb.epoxy.m mVar2 = mVar;
        v7.g.f(mVar2, "$this$withModels");
        FolderFragment folderFragment = this.f8391j;
        folderFragment.f8361f0 = mVar2;
        com.noto.app.label.a aVar2 = new com.noto.app.label.a();
        aVar2.J();
        List<y6.h> list = this.f8392k;
        aVar2.K(list);
        final t6.a aVar3 = this.f8393l;
        aVar2.I(aVar3.f17595e);
        aVar2.L(new x6.n(0, folderFragment));
        aVar2.M(new FolderFragment$setupNotesAndLabels$1$1$2(list, folderFragment));
        aVar2.N(new FolderFragment$setupNotesAndLabels$1$1$3(folderFragment));
        aVar2.O(new x6.o(0, folderFragment));
        mVar2.add(aVar2);
        Context j2 = folderFragment.j();
        if (j2 != null) {
            final FolderFragment folderFragment2 = this.f8391j;
            List<h0> list2 = this.f8394m;
            if (list2.isEmpty()) {
                o6.i iVar = new o6.i();
                iVar.E();
                iVar.F(f7.q.f(j2, R.string.no_notes_found, new Object[0]));
                mVar2.add(iVar);
            } else {
                int ordinal = aVar3.f17604o.ordinal();
                NoteListSortingType noteListSortingType2 = NoteListSortingType.Manual;
                Font font = this.n;
                String str2 = this.f8395o;
                boolean z16 = this.f8396p;
                final s6.i iVar2 = this.f8397q;
                boolean z17 = aVar3.f17601k;
                int i11 = aVar3.f17598h;
                SortingOrder sortingOrder = aVar3.n;
                NoteListSortingType noteListSortingType3 = aVar3.f17603m;
                NotoColor notoColor = aVar3.f17595e;
                if (ordinal != 0) {
                    Context context = j2;
                    GroupingOrder groupingOrder = aVar3.f17605p;
                    s6.i iVar3 = iVar2;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                Iterator it = ModelUtilsKt.q(list2, noteListSortingType3, sortingOrder, groupingOrder).iterator();
                                while (it.hasNext()) {
                                    Pair pair = (Pair) it.next();
                                    na.d dVar = (na.d) pair.f12962i;
                                    List<h0> list3 = (List) pair.f12963j;
                                    o6.g gVar = new o6.g();
                                    Iterator it2 = it;
                                    gVar.m(Integer.valueOf(dVar.a()));
                                    gVar.H(f7.g.b(dVar));
                                    gVar.F(notoColor);
                                    mVar2.add(gVar);
                                    ArrayList arrayList = new ArrayList(n7.l.Z1(list3, 10));
                                    for (h0 h0Var : list3) {
                                        arrayList.add(Long.valueOf(h0Var.f18683a.f17621a));
                                    }
                                    final long[] M2 = kotlin.collections.c.M2(arrayList);
                                    Iterator it3 = list3.iterator();
                                    while (it3.hasNext()) {
                                        final h0 h0Var2 = (h0) it3.next();
                                        r rVar = new r();
                                        Iterator it4 = it3;
                                        rVar.Q(h0Var2.f18683a.f17621a);
                                        rVar.W(h0Var2);
                                        rVar.P(font);
                                        rVar.O(notoColor);
                                        rVar.b0(i11);
                                        rVar.V(z17);
                                        rVar.c0(str2);
                                        if (noteListSortingType3 == noteListSortingType2) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        rVar.R(z15);
                                        rVar.T(z16);
                                        int i12 = i11;
                                        final t6.a aVar4 = aVar3;
                                        NoteListSortingType noteListSortingType4 = noteListSortingType3;
                                        rVar.X(new View.OnClickListener() { // from class: com.noto.app.folder.l
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i13 = r5;
                                                FolderFragment folderFragment3 = folderFragment2;
                                                t6.a aVar5 = aVar4;
                                                long[] jArr = M2;
                                                h0 h0Var3 = h0Var2;
                                                switch (i13) {
                                                    case 0:
                                                        FolderFragment$setupNotesAndLabels$1.a(aVar5, folderFragment3, h0Var3, jArr);
                                                        return;
                                                    default:
                                                        FolderFragment$setupNotesAndLabels$1.a(aVar5, folderFragment3, h0Var3, jArr);
                                                        return;
                                                }
                                            }
                                        });
                                        rVar.Z(new View.OnLongClickListener() { // from class: com.noto.app.folder.m
                                            @Override // android.view.View.OnLongClickListener
                                            public final boolean onLongClick(View view) {
                                                int i13 = r4;
                                                FolderFragment folderFragment3 = folderFragment2;
                                                long[] jArr = M2;
                                                h0 h0Var3 = h0Var2;
                                                switch (i13) {
                                                    case 0:
                                                        FolderFragment$setupNotesAndLabels$1.e(folderFragment3, h0Var3, jArr);
                                                        return true;
                                                    default:
                                                        FolderFragment$setupNotesAndLabels$1.e(folderFragment3, h0Var3, jArr);
                                                        return true;
                                                }
                                            }
                                        });
                                        final s6.i iVar4 = iVar3;
                                        rVar.Y(new View.OnTouchListener() { // from class: com.noto.app.folder.p
                                            @Override // android.view.View.OnTouchListener
                                            public final boolean onTouch(View view, MotionEvent motionEvent) {
                                                int i13 = r3;
                                                FolderFragment folderFragment3 = folderFragment2;
                                                s6.i iVar5 = iVar4;
                                                switch (i13) {
                                                    case 0:
                                                        return FolderFragment$setupNotesAndLabels$1.c(iVar5, folderFragment3, view, motionEvent);
                                                    default:
                                                        return FolderFragment$setupNotesAndLabels$1.c(iVar5, folderFragment3, view, motionEvent);
                                                }
                                            }
                                        });
                                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.noto.app.folder.k
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i13 = r3;
                                                h0 h0Var3 = h0Var2;
                                                FolderFragment folderFragment3 = folderFragment2;
                                                switch (i13) {
                                                    case 0:
                                                        FolderFragment$setupNotesAndLabels$1.d(folderFragment3, h0Var3);
                                                        return;
                                                    case 1:
                                                        FolderFragment$setupNotesAndLabels$1.b(folderFragment3, h0Var3);
                                                        return;
                                                    default:
                                                        FolderFragment$setupNotesAndLabels$1.d(folderFragment3, h0Var3);
                                                        return;
                                                }
                                            }
                                        };
                                        rVar.p();
                                        rVar.f8599y = onClickListener;
                                        o oVar = new o(2, folderFragment2, h0Var2);
                                        rVar.p();
                                        rVar.f8600z = oVar;
                                        mVar2.add(rVar);
                                        iVar3 = iVar4;
                                        font = font;
                                        it3 = it4;
                                        i11 = i12;
                                        z16 = z16;
                                        str2 = str2;
                                        aVar3 = aVar3;
                                        noteListSortingType2 = noteListSortingType2;
                                        noteListSortingType3 = noteListSortingType4;
                                    }
                                    t6.a aVar5 = aVar3;
                                    it = it2;
                                }
                            }
                        } else {
                            int i13 = i11;
                            boolean z18 = z16;
                            String str3 = str2;
                            NoteListSortingType noteListSortingType5 = noteListSortingType2;
                            s6.i iVar5 = iVar3;
                            Iterator it5 = ModelUtilsKt.s(list2, noteListSortingType3, sortingOrder, groupingOrder).iterator();
                            while (it5.hasNext()) {
                                Pair pair2 = (Pair) it5.next();
                                List<t6.c> list4 = (List) pair2.f12962i;
                                List<h0> list5 = (List) pair2.f12963j;
                                if (list4.isEmpty()) {
                                    o6.g gVar2 = new o6.g();
                                    gVar2.l("without_label");
                                    Context context2 = context;
                                    gVar2.H(f7.q.f(context2, R.string.without_label, new Object[0]));
                                    gVar2.F(notoColor);
                                    x6.p pVar = new x6.p(folderFragment2);
                                    gVar2.p();
                                    gVar2.f16369p = pVar;
                                    mVar2.add(gVar2);
                                    context = context2;
                                } else {
                                    Context context3 = context;
                                    o6.g gVar3 = new o6.g();
                                    ArrayList arrayList2 = new ArrayList(n7.l.Z1(list4, 10));
                                    for (t6.c cVar : list4) {
                                        arrayList2.add(Long.valueOf(cVar.f17615a));
                                        context3 = context3;
                                    }
                                    context = context3;
                                    Long[] lArr = (Long[]) arrayList2.toArray(new Long[0]);
                                    gVar3.m((Number[]) Arrays.copyOf(lArr, lArr.length));
                                    gVar3.H(kotlin.collections.c.t2(list4, " • ", null, null, EpoxyUtilsKt$buildNotesModels$4$2$2.f9815j, 30));
                                    gVar3.F(notoColor);
                                    x6.q qVar = new x6.q(list4, folderFragment2);
                                    gVar3.p();
                                    gVar3.f16369p = qVar;
                                    mVar2.add(gVar3);
                                }
                                ArrayList arrayList3 = new ArrayList(n7.l.Z1(list5, 10));
                                for (h0 h0Var3 : list5) {
                                    arrayList3.add(Long.valueOf(h0Var3.f18683a.f17621a));
                                }
                                final long[] M22 = kotlin.collections.c.M2(arrayList3);
                                Iterator it6 = list5.iterator();
                                while (it6.hasNext()) {
                                    final h0 h0Var4 = (h0) it6.next();
                                    r rVar2 = new r();
                                    rVar2.Q(h0Var4.f18683a.f17621a);
                                    rVar2.W(h0Var4);
                                    rVar2.P(font);
                                    rVar2.O(notoColor);
                                    int i14 = i13;
                                    rVar2.b0(i14);
                                    rVar2.V(z17);
                                    String str4 = str3;
                                    rVar2.c0(str4);
                                    NoteListSortingType noteListSortingType6 = noteListSortingType5;
                                    if (noteListSortingType3 == noteListSortingType6) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    rVar2.R(z14);
                                    boolean z19 = z18;
                                    rVar2.T(z19);
                                    final s6.i iVar6 = iVar5;
                                    Iterator it7 = it6;
                                    rVar2.X(new View.OnClickListener() { // from class: com.noto.app.folder.l
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i132 = r5;
                                            FolderFragment folderFragment3 = folderFragment2;
                                            t6.a aVar52 = aVar3;
                                            long[] jArr = M22;
                                            h0 h0Var32 = h0Var4;
                                            switch (i132) {
                                                case 0:
                                                    FolderFragment$setupNotesAndLabels$1.a(aVar52, folderFragment3, h0Var32, jArr);
                                                    return;
                                                default:
                                                    FolderFragment$setupNotesAndLabels$1.a(aVar52, folderFragment3, h0Var32, jArr);
                                                    return;
                                            }
                                        }
                                    });
                                    rVar2.Z(new View.OnLongClickListener() { // from class: com.noto.app.folder.m
                                        @Override // android.view.View.OnLongClickListener
                                        public final boolean onLongClick(View view) {
                                            int i132 = r4;
                                            FolderFragment folderFragment3 = folderFragment2;
                                            long[] jArr = M22;
                                            h0 h0Var32 = h0Var4;
                                            switch (i132) {
                                                case 0:
                                                    FolderFragment$setupNotesAndLabels$1.e(folderFragment3, h0Var32, jArr);
                                                    return true;
                                                default:
                                                    FolderFragment$setupNotesAndLabels$1.e(folderFragment3, h0Var32, jArr);
                                                    return true;
                                            }
                                        }
                                    });
                                    rVar2.Y(new View.OnTouchListener() { // from class: com.noto.app.folder.p
                                        @Override // android.view.View.OnTouchListener
                                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                                            int i132 = r3;
                                            FolderFragment folderFragment3 = folderFragment2;
                                            s6.i iVar52 = iVar6;
                                            switch (i132) {
                                                case 0:
                                                    return FolderFragment$setupNotesAndLabels$1.c(iVar52, folderFragment3, view, motionEvent);
                                                default:
                                                    return FolderFragment$setupNotesAndLabels$1.c(iVar52, folderFragment3, view, motionEvent);
                                            }
                                        }
                                    });
                                    o oVar2 = new o(1, folderFragment2, h0Var4);
                                    rVar2.p();
                                    rVar2.f8599y = oVar2;
                                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.noto.app.folder.j
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i15 = r3;
                                            h0 h0Var5 = h0Var4;
                                            FolderFragment folderFragment3 = folderFragment2;
                                            switch (i15) {
                                                case 0:
                                                    FolderFragment$setupNotesAndLabels$1.b(folderFragment3, h0Var5);
                                                    return;
                                                case 1:
                                                    FolderFragment$setupNotesAndLabels$1.d(folderFragment3, h0Var5);
                                                    return;
                                                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                                                    FolderFragment$setupNotesAndLabels$1.d(folderFragment3, h0Var5);
                                                    return;
                                                default:
                                                    FolderFragment$setupNotesAndLabels$1.b(folderFragment3, h0Var5);
                                                    return;
                                            }
                                        }
                                    };
                                    rVar2.p();
                                    rVar2.f8600z = onClickListener2;
                                    mVar2.add(rVar2);
                                    iVar5 = iVar6;
                                    z17 = z17;
                                    it5 = it5;
                                    it6 = it7;
                                    z18 = z19;
                                    noteListSortingType5 = noteListSortingType6;
                                    str3 = str4;
                                    i13 = i14;
                                }
                            }
                        }
                    } else {
                        int i15 = i11;
                        boolean z20 = z16;
                        String str5 = str2;
                        NoteListSortingType noteListSortingType7 = noteListSortingType2;
                        boolean z21 = z17;
                        Iterator it8 = ModelUtilsKt.r(list2, noteListSortingType3, sortingOrder, groupingOrder).iterator();
                        while (it8.hasNext()) {
                            Pair pair3 = (Pair) it8.next();
                            na.d dVar2 = (na.d) pair3.f12962i;
                            List<h0> list6 = (List) pair3.f12963j;
                            o6.g gVar4 = new o6.g();
                            gVar4.m(Integer.valueOf(dVar2.a()));
                            gVar4.H(f7.g.b(dVar2));
                            gVar4.F(notoColor);
                            mVar2.add(gVar4);
                            ArrayList arrayList4 = new ArrayList(n7.l.Z1(list6, 10));
                            for (h0 h0Var5 : list6) {
                                arrayList4.add(Long.valueOf(h0Var5.f18683a.f17621a));
                            }
                            final long[] M23 = kotlin.collections.c.M2(arrayList4);
                            Iterator it9 = list6.iterator();
                            while (it9.hasNext()) {
                                final h0 h0Var6 = (h0) it9.next();
                                r rVar3 = new r();
                                rVar3.Q(h0Var6.f18683a.f17621a);
                                rVar3.W(h0Var6);
                                rVar3.P(font);
                                rVar3.O(notoColor);
                                int i16 = i15;
                                rVar3.b0(i16);
                                boolean z22 = z21;
                                rVar3.V(z22);
                                String str6 = str5;
                                rVar3.c0(str6);
                                NoteListSortingType noteListSortingType8 = noteListSortingType7;
                                if (noteListSortingType3 == noteListSortingType8) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                rVar3.R(z13);
                                boolean z23 = z20;
                                rVar3.T(z23);
                                Iterator it10 = it8;
                                rVar3.X(new View.OnClickListener() { // from class: com.noto.app.folder.l
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i132 = r5;
                                        FolderFragment folderFragment3 = folderFragment2;
                                        t6.a aVar52 = aVar3;
                                        long[] jArr = M23;
                                        h0 h0Var32 = h0Var6;
                                        switch (i132) {
                                            case 0:
                                                FolderFragment$setupNotesAndLabels$1.a(aVar52, folderFragment3, h0Var32, jArr);
                                                return;
                                            default:
                                                FolderFragment$setupNotesAndLabels$1.a(aVar52, folderFragment3, h0Var32, jArr);
                                                return;
                                        }
                                    }
                                });
                                rVar3.Z(new View.OnLongClickListener() { // from class: com.noto.app.folder.m
                                    @Override // android.view.View.OnLongClickListener
                                    public final boolean onLongClick(View view) {
                                        int i132 = r4;
                                        FolderFragment folderFragment3 = folderFragment2;
                                        long[] jArr = M23;
                                        h0 h0Var32 = h0Var6;
                                        switch (i132) {
                                            case 0:
                                                FolderFragment$setupNotesAndLabels$1.e(folderFragment3, h0Var32, jArr);
                                                return true;
                                            default:
                                                FolderFragment$setupNotesAndLabels$1.e(folderFragment3, h0Var32, jArr);
                                                return true;
                                        }
                                    }
                                });
                                rVar3.Y(new n(iVar3, 0, folderFragment2));
                                o oVar3 = new o(0, folderFragment2, h0Var6);
                                rVar3.p();
                                rVar3.f8599y = oVar3;
                                View.OnClickListener onClickListener3 = new View.OnClickListener() { // from class: com.noto.app.folder.j
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i152 = r3;
                                        h0 h0Var52 = h0Var6;
                                        FolderFragment folderFragment3 = folderFragment2;
                                        switch (i152) {
                                            case 0:
                                                FolderFragment$setupNotesAndLabels$1.b(folderFragment3, h0Var52);
                                                return;
                                            case 1:
                                                FolderFragment$setupNotesAndLabels$1.d(folderFragment3, h0Var52);
                                                return;
                                            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                                                FolderFragment$setupNotesAndLabels$1.d(folderFragment3, h0Var52);
                                                return;
                                            default:
                                                FolderFragment$setupNotesAndLabels$1.b(folderFragment3, h0Var52);
                                                return;
                                        }
                                    }
                                };
                                rVar3.p();
                                rVar3.f8600z = onClickListener3;
                                mVar2.add(rVar3);
                                it8 = it10;
                                it9 = it9;
                                i15 = i16;
                                z20 = z23;
                                noteListSortingType7 = noteListSortingType8;
                                str5 = str6;
                                z21 = z22;
                            }
                        }
                    }
                } else {
                    int i17 = i11;
                    boolean z24 = z16;
                    String str7 = str2;
                    t6.a aVar6 = aVar3;
                    boolean z25 = z17;
                    NoteListSortingType noteListSortingType9 = noteListSortingType2;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : list2) {
                        if (((h0) obj).f18683a.f17626g) {
                            arrayList5.add(obj);
                        }
                    }
                    List<h0> B = ModelUtilsKt.B(arrayList5, noteListSortingType3, sortingOrder);
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (!((h0) obj2).f18683a.f17626g) {
                            arrayList6.add(obj2);
                        }
                    }
                    List<h0> B2 = ModelUtilsKt.B(arrayList6, noteListSortingType3, sortingOrder);
                    if (!B.isEmpty()) {
                        o6.g gVar5 = new o6.g();
                        gVar5.l("pinned");
                        gVar5.H(f7.q.f(j2, R.string.pinned, new Object[0]));
                        gVar5.F(notoColor);
                        mVar2.add(gVar5);
                        ArrayList arrayList7 = new ArrayList(n7.l.Z1(B, 10));
                        for (h0 h0Var7 : B) {
                            arrayList7.add(Long.valueOf(h0Var7.f18683a.f17621a));
                        }
                        final long[] M24 = kotlin.collections.c.M2(arrayList7);
                        Iterator it11 = B.iterator();
                        while (it11.hasNext()) {
                            final h0 h0Var8 = (h0) it11.next();
                            r rVar4 = new r();
                            rVar4.Q(h0Var8.f18683a.f17621a);
                            rVar4.W(h0Var8);
                            rVar4.P(font);
                            rVar4.O(notoColor);
                            int i18 = i17;
                            rVar4.b0(i18);
                            boolean z26 = z25;
                            rVar4.V(z26);
                            String str8 = str7;
                            rVar4.c0(str8);
                            NoteListSortingType noteListSortingType10 = noteListSortingType9;
                            Iterator it12 = it11;
                            if (noteListSortingType3 == noteListSortingType10) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            rVar4.R(z12);
                            rVar4.T(z24);
                            final t6.a aVar7 = aVar6;
                            rVar4.X(new View.OnClickListener() { // from class: com.noto.app.folder.q
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    FolderFragment$setupNotesAndLabels$1.a(t6.a.this, folderFragment2, h0Var8, M24);
                                }
                            });
                            rVar4.Z(new View.OnLongClickListener() { // from class: com.noto.app.folder.h
                                @Override // android.view.View.OnLongClickListener
                                public final boolean onLongClick(View view) {
                                    FolderFragment$setupNotesAndLabels$1.e(FolderFragment.this, h0Var8, M24);
                                    return true;
                                }
                            });
                            rVar4.Y(new View.OnTouchListener() { // from class: com.noto.app.folder.i
                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    return FolderFragment$setupNotesAndLabels$1.c(s6.i.this, folderFragment2, view, motionEvent);
                                }
                            });
                            View.OnClickListener onClickListener4 = new View.OnClickListener() { // from class: com.noto.app.folder.j
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i152 = r3;
                                    h0 h0Var52 = h0Var8;
                                    FolderFragment folderFragment3 = folderFragment2;
                                    switch (i152) {
                                        case 0:
                                            FolderFragment$setupNotesAndLabels$1.b(folderFragment3, h0Var52);
                                            return;
                                        case 1:
                                            FolderFragment$setupNotesAndLabels$1.d(folderFragment3, h0Var52);
                                            return;
                                        case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                                            FolderFragment$setupNotesAndLabels$1.d(folderFragment3, h0Var52);
                                            return;
                                        default:
                                            FolderFragment$setupNotesAndLabels$1.b(folderFragment3, h0Var52);
                                            return;
                                    }
                                }
                            };
                            rVar4.p();
                            rVar4.f8599y = onClickListener4;
                            View.OnClickListener onClickListener5 = new View.OnClickListener() { // from class: com.noto.app.folder.k
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i132 = r3;
                                    h0 h0Var32 = h0Var8;
                                    FolderFragment folderFragment3 = folderFragment2;
                                    switch (i132) {
                                        case 0:
                                            FolderFragment$setupNotesAndLabels$1.d(folderFragment3, h0Var32);
                                            return;
                                        case 1:
                                            FolderFragment$setupNotesAndLabels$1.b(folderFragment3, h0Var32);
                                            return;
                                        default:
                                            FolderFragment$setupNotesAndLabels$1.d(folderFragment3, h0Var32);
                                            return;
                                    }
                                }
                            };
                            rVar4.p();
                            rVar4.f8600z = onClickListener5;
                            mVar2.add(rVar4);
                            aVar6 = aVar7;
                            str7 = str8;
                            i17 = i18;
                            z25 = z26;
                            it11 = it12;
                            M24 = M24;
                            noteListSortingType9 = noteListSortingType10;
                        }
                        i10 = i17;
                        aVar = aVar6;
                        noteListSortingType = noteListSortingType9;
                        str = str7;
                        z10 = z25;
                        if (!B2.isEmpty()) {
                            o6.g gVar6 = new o6.g();
                            gVar6.l("notes");
                            gVar6.H(f7.q.f(j2, R.string.notes, new Object[0]));
                            gVar6.F(notoColor);
                            mVar2.add(gVar6);
                        }
                    } else {
                        i10 = i17;
                        aVar = aVar6;
                        noteListSortingType = noteListSortingType9;
                        str = str7;
                        z10 = z25;
                    }
                    ArrayList arrayList8 = new ArrayList(n7.l.Z1(B2, 10));
                    for (h0 h0Var9 : B2) {
                        arrayList8.add(Long.valueOf(h0Var9.f18683a.f17621a));
                    }
                    final long[] M25 = kotlin.collections.c.M2(arrayList8);
                    for (final h0 h0Var10 : B2) {
                        r rVar5 = new r();
                        rVar5.Q(h0Var10.f18683a.f17621a);
                        rVar5.W(h0Var10);
                        rVar5.P(font);
                        rVar5.O(notoColor);
                        rVar5.b0(i10);
                        rVar5.V(z10);
                        rVar5.c0(str);
                        NoteListSortingType noteListSortingType11 = noteListSortingType;
                        if (noteListSortingType3 == noteListSortingType11) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        rVar5.R(z11);
                        boolean z27 = z24;
                        rVar5.T(z27);
                        final t6.a aVar8 = aVar;
                        NotoColor notoColor2 = notoColor;
                        rVar5.X(new View.OnClickListener() { // from class: com.noto.app.folder.l
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i132 = r5;
                                FolderFragment folderFragment3 = folderFragment2;
                                t6.a aVar52 = aVar8;
                                long[] jArr = M25;
                                h0 h0Var32 = h0Var10;
                                switch (i132) {
                                    case 0:
                                        FolderFragment$setupNotesAndLabels$1.a(aVar52, folderFragment3, h0Var32, jArr);
                                        return;
                                    default:
                                        FolderFragment$setupNotesAndLabels$1.a(aVar52, folderFragment3, h0Var32, jArr);
                                        return;
                                }
                            }
                        });
                        rVar5.Z(new View.OnLongClickListener() { // from class: com.noto.app.folder.m
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                int i132 = r4;
                                FolderFragment folderFragment3 = folderFragment2;
                                long[] jArr = M25;
                                h0 h0Var32 = h0Var10;
                                switch (i132) {
                                    case 0:
                                        FolderFragment$setupNotesAndLabels$1.e(folderFragment3, h0Var32, jArr);
                                        return true;
                                    default:
                                        FolderFragment$setupNotesAndLabels$1.e(folderFragment3, h0Var32, jArr);
                                        return true;
                                }
                            }
                        });
                        rVar5.Y(new n(iVar2, 1, folderFragment2));
                        View.OnClickListener onClickListener6 = new View.OnClickListener() { // from class: com.noto.app.folder.j
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i152 = r3;
                                h0 h0Var52 = h0Var10;
                                FolderFragment folderFragment3 = folderFragment2;
                                switch (i152) {
                                    case 0:
                                        FolderFragment$setupNotesAndLabels$1.b(folderFragment3, h0Var52);
                                        return;
                                    case 1:
                                        FolderFragment$setupNotesAndLabels$1.d(folderFragment3, h0Var52);
                                        return;
                                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                                        FolderFragment$setupNotesAndLabels$1.d(folderFragment3, h0Var52);
                                        return;
                                    default:
                                        FolderFragment$setupNotesAndLabels$1.b(folderFragment3, h0Var52);
                                        return;
                                }
                            }
                        };
                        rVar5.p();
                        rVar5.f8599y = onClickListener6;
                        View.OnClickListener onClickListener7 = new View.OnClickListener() { // from class: com.noto.app.folder.k
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i132 = r3;
                                h0 h0Var32 = h0Var10;
                                FolderFragment folderFragment3 = folderFragment2;
                                switch (i132) {
                                    case 0:
                                        FolderFragment$setupNotesAndLabels$1.d(folderFragment3, h0Var32);
                                        return;
                                    case 1:
                                        FolderFragment$setupNotesAndLabels$1.b(folderFragment3, h0Var32);
                                        return;
                                    default:
                                        FolderFragment$setupNotesAndLabels$1.d(folderFragment3, h0Var32);
                                        return;
                                }
                            }
                        };
                        rVar5.p();
                        rVar5.f8600z = onClickListener7;
                        mVar2.add(rVar5);
                        z24 = z27;
                        noteListSortingType = noteListSortingType11;
                        aVar = aVar;
                        notoColor = notoColor2;
                        str = str;
                    }
                }
            }
            m7.n nVar = m7.n.f16010a;
        }
        return m7.n.f16010a;
    }
}
