package com.noto.app.main;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.airbnb.epoxy.e0;
import com.airbnb.epoxy.m;
import com.noto.R;
import com.noto.app.domain.model.FolderListSortingType;
import com.noto.app.filtered.FilteredItemModel;
import com.noto.app.util.ModelUtilsKt;
import com.robinhood.ticker.TickerView;
import f7.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m7.e;
import m7.n;
import n6.c;
import s6.x;
import t6.d;
import u7.l;
import v7.g;
import w6.t;
import z6.f;
import z6.k;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/epoxy/m;", "Lm7/n;", "invoke", "(Lcom/airbnb/epoxy/m;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MainFragment$setupFolders$1 extends Lambda implements l<m, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MainFragment f8857j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ n6.c<List<Pair<t6.a, Integer>>> f8858k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ FolderListSortingType f8859l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ x f8860m;
    public final /* synthetic */ List<d> n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ boolean f8861o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MainFragment$setupFolders$1(MainFragment mainFragment, n6.c<? extends List<Pair<t6.a, Integer>>> cVar, FolderListSortingType folderListSortingType, x xVar, List<d> list, boolean z10) {
        super(1);
        this.f8857j = mainFragment;
        this.f8858k = cVar;
        this.f8859l = folderListSortingType;
        this.f8860m = xVar;
        this.n = list;
        this.f8861o = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0289 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0221 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0222  */
    @Override // u7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n U(m mVar) {
        String str;
        Object obj;
        boolean z10;
        String str2;
        int i10;
        int i11;
        Long l2;
        boolean z11;
        Iterator it;
        int i12;
        boolean z12;
        Long l4;
        boolean z13;
        int i13;
        Long l7;
        boolean z14;
        ArrayList arrayList;
        Iterator it2;
        Iterator it3;
        boolean z15;
        m mVar2 = mVar;
        g.f(mVar2, "$this$withModels");
        MainFragment mainFragment = this.f8857j;
        mainFragment.f8845w0 = mVar2;
        c.b bVar = (c.b) this.f8858k;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : (Iterable) bVar.f16111a) {
            if (!ModelUtilsKt.u((t6.a) ((Pair) obj2).f12962i)) {
                arrayList2.add(obj2);
            }
        }
        Iterator it4 = ((Iterable) bVar.f16111a).iterator();
        while (true) {
            str = null;
            if (it4.hasNext()) {
                obj = it4.next();
                if (ModelUtilsKt.u((t6.a) ((Pair) obj).f12962i)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Pair pair = (Pair) obj;
        boolean z16 = true;
        if (this.f8859l == FolderListSortingType.Manual) {
            z10 = true;
        } else {
            z10 = false;
        }
        int c = ModelUtilsKt.c(arrayList2);
        x xVar = this.f8860m;
        TickerView tickerView = xVar.f17483d;
        Context j2 = mainFragment.j();
        if (j2 != null) {
            str2 = q.e(j2, R.plurals.folders_count, c, Integer.valueOf(c));
        } else {
            str2 = null;
        }
        tickerView.setText(str2);
        Context j10 = mainFragment.j();
        if (j10 != null) {
            str = q.e(j10, R.plurals.folders_count, c, Integer.valueOf(c));
        }
        xVar.f17484e.setText(str);
        Context j11 = mainFragment.j();
        if (j11 != null) {
            boolean z17 = this.f8861o;
            x xVar2 = this.f8860m;
            e0 e0Var = new e0(R.layout.vertical_linear_layout_group);
            e0Var.l("header");
            e0 e0Var2 = new e0(R.layout.horizontal_linear_layout_group);
            e0Var2.l("sub_header_1");
            e0Var2.f6688i = new a4.b(0);
            t tVar = new t();
            tVar.l("all");
            tVar.I(FilteredItemModel.All);
            List<d> list = this.n;
            boolean z18 = list instanceof Collection;
            if (z18 && list.isEmpty()) {
                i10 = 0;
            } else {
                int i14 = 0;
                for (d dVar : list) {
                    if ((!dVar.f17627h) && (i14 = i14 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
                i10 = i14;
            }
            tVar.p();
            tVar.f18478m = i10;
            tVar.H(z17);
            List<Long> list2 = FilteredItemModel.f8281k;
            e eVar = mainFragment.f8847y0;
            Long l10 = (Long) eVar.getValue();
            if (l10 != null && -2 == l10.longValue()) {
                tVar.G(z16);
                tVar.J(new a(mainFragment, 0));
                e0Var2.add(tVar);
                t tVar2 = new t();
                tVar2.l("recent");
                tVar2.I(FilteredItemModel.Recent);
                if (!z18 && list.isEmpty()) {
                    i11 = 0;
                } else {
                    i11 = 0;
                    for (d dVar2 : list) {
                        if (ModelUtilsKt.v(dVar2) && (i11 = i11 + 1) < 0) {
                            throw new ArithmeticException("Count overflow has happened.");
                        }
                    }
                }
                tVar2.p();
                tVar2.f18478m = i11;
                tVar2.H(z17);
                List<Long> list3 = FilteredItemModel.f8281k;
                l2 = (Long) eVar.getValue();
                if (l2 != null && -3 == l2.longValue()) {
                    z11 = true;
                    tVar2.G(z11);
                    tVar2.J(new b(mainFragment, 0));
                    e0Var2.add(tVar2);
                    e0Var.add(e0Var2);
                    e0 e0Var3 = new e0(R.layout.horizontal_linear_layout_group);
                    e0Var3.l("sub_header_2");
                    e0Var3.f6688i = new a4.b(1);
                    t tVar3 = new t();
                    tVar3.l("scheduled");
                    tVar3.I(FilteredItemModel.Scheduled);
                    if (!z18 && list.isEmpty()) {
                        i12 = 0;
                    } else {
                        it = list.iterator();
                        i12 = 0;
                        while (it.hasNext()) {
                            Iterator it5 = it;
                            if (((d) it.next()).f17628i != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12 && (i12 = i12 + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                            it = it5;
                        }
                    }
                    tVar3.p();
                    tVar3.f18478m = i12;
                    tVar3.H(z17);
                    List<Long> list4 = FilteredItemModel.f8281k;
                    l4 = (Long) eVar.getValue();
                    if (l4 != null && -5 == l4.longValue()) {
                        z13 = true;
                        tVar3.G(z13);
                        tVar3.J(new a(mainFragment, 1));
                        e0Var3.add(tVar3);
                        t tVar4 = new t();
                        tVar4.l("archived");
                        tVar4.I(FilteredItemModel.Archived);
                        if (!z18 && list.isEmpty()) {
                            i13 = 0;
                        } else {
                            i13 = 0;
                            for (d dVar3 : list) {
                                if (dVar3.f17627h && (i13 = i13 + 1) < 0) {
                                    throw new ArithmeticException("Count overflow has happened.");
                                }
                            }
                        }
                        tVar4.p();
                        tVar4.f18478m = i13;
                        tVar4.H(z17);
                        List<Long> list5 = FilteredItemModel.f8281k;
                        l7 = (Long) eVar.getValue();
                        if (l7 != null && -6 == l7.longValue()) {
                            z14 = true;
                            tVar4.G(z14);
                            tVar4.J(new b(mainFragment, 1));
                            e0Var3.add(tVar4);
                            e0Var.add(e0Var3);
                            mVar2.add(e0Var);
                            if (pair != null) {
                                f fVar = new f();
                                t6.a aVar = (t6.a) pair.f12962i;
                                fVar.M(aVar.f17592a);
                                fVar.L(aVar);
                                fVar.Q(((Number) pair.f12963j).intValue());
                                fVar.N(z10);
                                fVar.P(z17);
                                Long l11 = (Long) eVar.getValue();
                                if (l11 != null && aVar.f17592a == l11.longValue()) {
                                    z15 = true;
                                    fVar.O(z15);
                                    fVar.R(new c(mainFragment, pair, 0));
                                    fVar.T(new k(mainFragment, pair, 0));
                                    fVar.S(new w6.f(1));
                                    mVar2.add(fVar);
                                    n nVar = n.f16010a;
                                }
                                z15 = false;
                                fVar.O(z15);
                                fVar.R(new c(mainFragment, pair, 0));
                                fVar.T(new k(mainFragment, pair, 0));
                                fVar.S(new w6.f(1));
                                mVar2.add(fVar);
                                n nVar2 = n.f16010a;
                            }
                            arrayList = new ArrayList();
                            it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                if (((t6.a) ((Pair) next).f12962i).f17600j) {
                                    arrayList.add(next);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                Object next2 = it3.next();
                                if (!((t6.a) ((Pair) next2).f12962i).f17600j) {
                                    arrayList3.add(next2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                o6.g gVar = new o6.g();
                                gVar.l("pinned");
                                gVar.H(q.f(j11, R.string.pinned, new Object[0]));
                                mVar2.add(gVar);
                                ModelUtilsKt.l(arrayList, 1, new MainFragment$setupFolders$1$1$3$1(mVar2, z10, z17, mainFragment, xVar2));
                                if (!arrayList3.isEmpty()) {
                                    o6.g gVar2 = new o6.g();
                                    gVar2.l("libraries");
                                    gVar2.H(q.f(j11, R.string.folders, new Object[0]));
                                    mVar2.add(gVar2);
                                }
                            }
                            ModelUtilsKt.l(arrayList3, 1, new MainFragment$setupFolders$1$1$3$1(mVar2, z10, z17, mainFragment, xVar2));
                            n nVar3 = n.f16010a;
                        }
                        z14 = false;
                        tVar4.G(z14);
                        tVar4.J(new b(mainFragment, 1));
                        e0Var3.add(tVar4);
                        e0Var.add(e0Var3);
                        mVar2.add(e0Var);
                        if (pair != null) {
                        }
                        arrayList = new ArrayList();
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                        }
                        ArrayList arrayList32 = new ArrayList();
                        it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                        }
                        if (!arrayList.isEmpty()) {
                        }
                        ModelUtilsKt.l(arrayList32, 1, new MainFragment$setupFolders$1$1$3$1(mVar2, z10, z17, mainFragment, xVar2));
                        n nVar32 = n.f16010a;
                    }
                    z13 = false;
                    tVar3.G(z13);
                    tVar3.J(new a(mainFragment, 1));
                    e0Var3.add(tVar3);
                    t tVar42 = new t();
                    tVar42.l("archived");
                    tVar42.I(FilteredItemModel.Archived);
                    if (!z18) {
                    }
                    i13 = 0;
                    while (r5.hasNext()) {
                    }
                    tVar42.p();
                    tVar42.f18478m = i13;
                    tVar42.H(z17);
                    List<Long> list52 = FilteredItemModel.f8281k;
                    l7 = (Long) eVar.getValue();
                    if (l7 != null) {
                        z14 = true;
                        tVar42.G(z14);
                        tVar42.J(new b(mainFragment, 1));
                        e0Var3.add(tVar42);
                        e0Var.add(e0Var3);
                        mVar2.add(e0Var);
                        if (pair != null) {
                        }
                        arrayList = new ArrayList();
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                        }
                        ArrayList arrayList322 = new ArrayList();
                        it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                        }
                        if (!arrayList.isEmpty()) {
                        }
                        ModelUtilsKt.l(arrayList322, 1, new MainFragment$setupFolders$1$1$3$1(mVar2, z10, z17, mainFragment, xVar2));
                        n nVar322 = n.f16010a;
                    }
                    z14 = false;
                    tVar42.G(z14);
                    tVar42.J(new b(mainFragment, 1));
                    e0Var3.add(tVar42);
                    e0Var.add(e0Var3);
                    mVar2.add(e0Var);
                    if (pair != null) {
                    }
                    arrayList = new ArrayList();
                    it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                    }
                    ArrayList arrayList3222 = new ArrayList();
                    it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                    ModelUtilsKt.l(arrayList3222, 1, new MainFragment$setupFolders$1$1$3$1(mVar2, z10, z17, mainFragment, xVar2));
                    n nVar3222 = n.f16010a;
                }
                z11 = false;
                tVar2.G(z11);
                tVar2.J(new b(mainFragment, 0));
                e0Var2.add(tVar2);
                e0Var.add(e0Var2);
                e0 e0Var32 = new e0(R.layout.horizontal_linear_layout_group);
                e0Var32.l("sub_header_2");
                e0Var32.f6688i = new a4.b(1);
                t tVar32 = new t();
                tVar32.l("scheduled");
                tVar32.I(FilteredItemModel.Scheduled);
                if (!z18) {
                }
                it = list.iterator();
                i12 = 0;
                while (it.hasNext()) {
                }
                tVar32.p();
                tVar32.f18478m = i12;
                tVar32.H(z17);
                List<Long> list42 = FilteredItemModel.f8281k;
                l4 = (Long) eVar.getValue();
                if (l4 != null) {
                    z13 = true;
                    tVar32.G(z13);
                    tVar32.J(new a(mainFragment, 1));
                    e0Var32.add(tVar32);
                    t tVar422 = new t();
                    tVar422.l("archived");
                    tVar422.I(FilteredItemModel.Archived);
                    if (!z18) {
                    }
                    i13 = 0;
                    while (r5.hasNext()) {
                    }
                    tVar422.p();
                    tVar422.f18478m = i13;
                    tVar422.H(z17);
                    List<Long> list522 = FilteredItemModel.f8281k;
                    l7 = (Long) eVar.getValue();
                    if (l7 != null) {
                    }
                    z14 = false;
                    tVar422.G(z14);
                    tVar422.J(new b(mainFragment, 1));
                    e0Var32.add(tVar422);
                    e0Var.add(e0Var32);
                    mVar2.add(e0Var);
                    if (pair != null) {
                    }
                    arrayList = new ArrayList();
                    it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                    }
                    ArrayList arrayList32222 = new ArrayList();
                    it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                    ModelUtilsKt.l(arrayList32222, 1, new MainFragment$setupFolders$1$1$3$1(mVar2, z10, z17, mainFragment, xVar2));
                    n nVar32222 = n.f16010a;
                }
                z13 = false;
                tVar32.G(z13);
                tVar32.J(new a(mainFragment, 1));
                e0Var32.add(tVar32);
                t tVar4222 = new t();
                tVar4222.l("archived");
                tVar4222.I(FilteredItemModel.Archived);
                if (!z18) {
                }
                i13 = 0;
                while (r5.hasNext()) {
                }
                tVar4222.p();
                tVar4222.f18478m = i13;
                tVar4222.H(z17);
                List<Long> list5222 = FilteredItemModel.f8281k;
                l7 = (Long) eVar.getValue();
                if (l7 != null) {
                }
                z14 = false;
                tVar4222.G(z14);
                tVar4222.J(new b(mainFragment, 1));
                e0Var32.add(tVar4222);
                e0Var.add(e0Var32);
                mVar2.add(e0Var);
                if (pair != null) {
                }
                arrayList = new ArrayList();
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                ArrayList arrayList322222 = new ArrayList();
                it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                }
                if (!arrayList.isEmpty()) {
                }
                ModelUtilsKt.l(arrayList322222, 1, new MainFragment$setupFolders$1$1$3$1(mVar2, z10, z17, mainFragment, xVar2));
                n nVar322222 = n.f16010a;
            }
            z16 = false;
            tVar.G(z16);
            tVar.J(new a(mainFragment, 0));
            e0Var2.add(tVar);
            t tVar22 = new t();
            tVar22.l("recent");
            tVar22.I(FilteredItemModel.Recent);
            if (!z18) {
            }
            i11 = 0;
            while (r9.hasNext()) {
            }
            tVar22.p();
            tVar22.f18478m = i11;
            tVar22.H(z17);
            List<Long> list32 = FilteredItemModel.f8281k;
            l2 = (Long) eVar.getValue();
            if (l2 != null) {
                z11 = true;
                tVar22.G(z11);
                tVar22.J(new b(mainFragment, 0));
                e0Var2.add(tVar22);
                e0Var.add(e0Var2);
                e0 e0Var322 = new e0(R.layout.horizontal_linear_layout_group);
                e0Var322.l("sub_header_2");
                e0Var322.f6688i = new a4.b(1);
                t tVar322 = new t();
                tVar322.l("scheduled");
                tVar322.I(FilteredItemModel.Scheduled);
                if (!z18) {
                }
                it = list.iterator();
                i12 = 0;
                while (it.hasNext()) {
                }
                tVar322.p();
                tVar322.f18478m = i12;
                tVar322.H(z17);
                List<Long> list422 = FilteredItemModel.f8281k;
                l4 = (Long) eVar.getValue();
                if (l4 != null) {
                }
                z13 = false;
                tVar322.G(z13);
                tVar322.J(new a(mainFragment, 1));
                e0Var322.add(tVar322);
                t tVar42222 = new t();
                tVar42222.l("archived");
                tVar42222.I(FilteredItemModel.Archived);
                if (!z18) {
                }
                i13 = 0;
                while (r5.hasNext()) {
                }
                tVar42222.p();
                tVar42222.f18478m = i13;
                tVar42222.H(z17);
                List<Long> list52222 = FilteredItemModel.f8281k;
                l7 = (Long) eVar.getValue();
                if (l7 != null) {
                }
                z14 = false;
                tVar42222.G(z14);
                tVar42222.J(new b(mainFragment, 1));
                e0Var322.add(tVar42222);
                e0Var.add(e0Var322);
                mVar2.add(e0Var);
                if (pair != null) {
                }
                arrayList = new ArrayList();
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                ArrayList arrayList3222222 = new ArrayList();
                it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                }
                if (!arrayList.isEmpty()) {
                }
                ModelUtilsKt.l(arrayList3222222, 1, new MainFragment$setupFolders$1$1$3$1(mVar2, z10, z17, mainFragment, xVar2));
                n nVar3222222 = n.f16010a;
            }
            z11 = false;
            tVar22.G(z11);
            tVar22.J(new b(mainFragment, 0));
            e0Var2.add(tVar22);
            e0Var.add(e0Var2);
            e0 e0Var3222 = new e0(R.layout.horizontal_linear_layout_group);
            e0Var3222.l("sub_header_2");
            e0Var3222.f6688i = new a4.b(1);
            t tVar3222 = new t();
            tVar3222.l("scheduled");
            tVar3222.I(FilteredItemModel.Scheduled);
            if (!z18) {
            }
            it = list.iterator();
            i12 = 0;
            while (it.hasNext()) {
            }
            tVar3222.p();
            tVar3222.f18478m = i12;
            tVar3222.H(z17);
            List<Long> list4222 = FilteredItemModel.f8281k;
            l4 = (Long) eVar.getValue();
            if (l4 != null) {
            }
            z13 = false;
            tVar3222.G(z13);
            tVar3222.J(new a(mainFragment, 1));
            e0Var3222.add(tVar3222);
            t tVar422222 = new t();
            tVar422222.l("archived");
            tVar422222.I(FilteredItemModel.Archived);
            if (!z18) {
            }
            i13 = 0;
            while (r5.hasNext()) {
            }
            tVar422222.p();
            tVar422222.f18478m = i13;
            tVar422222.H(z17);
            List<Long> list522222 = FilteredItemModel.f8281k;
            l7 = (Long) eVar.getValue();
            if (l7 != null) {
            }
            z14 = false;
            tVar422222.G(z14);
            tVar422222.J(new b(mainFragment, 1));
            e0Var3222.add(tVar422222);
            e0Var.add(e0Var3222);
            mVar2.add(e0Var);
            if (pair != null) {
            }
            arrayList = new ArrayList();
            it2 = arrayList2.iterator();
            while (it2.hasNext()) {
            }
            ArrayList arrayList32222222 = new ArrayList();
            it3 = arrayList2.iterator();
            while (it3.hasNext()) {
            }
            if (!arrayList.isEmpty()) {
            }
            ModelUtilsKt.l(arrayList32222222, 1, new MainFragment$setupFolders$1$1$3$1(mVar2, z10, z17, mainFragment, xVar2));
            n nVar32222222 = n.f16010a;
        }
        return n.f16010a;
    }
}
