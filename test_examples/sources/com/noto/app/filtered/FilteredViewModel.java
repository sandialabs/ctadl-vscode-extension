package com.noto.app.filtered;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.i0;
import com.noto.app.domain.model.Font;
import com.noto.app.util.ModelUtilsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.m;
import kotlinx.coroutines.flow.s;
import m7.n;
import n6.c;
import n7.l;
import n7.x;
import u6.a;
import u6.b;
import u6.c;
import u6.d;
import u6.e;
import u7.t;
import v7.g;
import x6.h0;

/* loaded from: classes.dex */
public final class FilteredViewModel extends i0 {

    /* renamed from: d  reason: collision with root package name */
    public final a f8288d;

    /* renamed from: e  reason: collision with root package name */
    public final d f8289e;

    /* renamed from: f  reason: collision with root package name */
    public final b f8290f;

    /* renamed from: g  reason: collision with root package name */
    public final c f8291g;

    /* renamed from: h  reason: collision with root package name */
    public final e f8292h;

    /* renamed from: i  reason: collision with root package name */
    public final FilteredItemModel f8293i;

    /* renamed from: j  reason: collision with root package name */
    public final StateFlowImpl f8294j;

    /* renamed from: k  reason: collision with root package name */
    public final StateFlowImpl f8295k;

    /* renamed from: l  reason: collision with root package name */
    public final StateFlowImpl f8296l;

    /* renamed from: m  reason: collision with root package name */
    public final StateFlowImpl f8297m;
    public final m n;

    /* renamed from: o  reason: collision with root package name */
    public final StateFlowImpl f8298o;

    /* renamed from: p  reason: collision with root package name */
    public final StateFlowImpl f8299p;

    /* renamed from: q  reason: collision with root package name */
    public final m f8300q;

    /* renamed from: r  reason: collision with root package name */
    public final m f8301r;

    /* renamed from: s  reason: collision with root package name */
    public final m f8302s;

    @Metadata(d1 = {"\u0000(\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\f\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00002\u0006\u0010\n\u001a\u00020\tH\u008a@"}, d2 = {"", "Lt6/a;", "folders", "Lt6/d;", "notes", "Lt6/c;", "labels", "Lt6/e;", "noteLabels", "", "searchTerm", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @q7.c(c = "com.noto.app.filtered.FilteredViewModel$1", f = "FilteredViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.filtered.FilteredViewModel$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements t<List<? extends t6.a>, List<? extends t6.d>, List<? extends t6.c>, List<? extends t6.e>, String, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ List f8303m;
        public /* synthetic */ List n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ List f8304o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ List f8305p;

        /* renamed from: q  reason: collision with root package name */
        public /* synthetic */ String f8306q;

        /* renamed from: com.noto.app.filtered.FilteredViewModel$1$a */
        /* loaded from: classes.dex */
        public static final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return a1.c.g0((na.d) t11, (na.d) t10);
            }
        }

        /* renamed from: com.noto.app.filtered.FilteredViewModel$1$b */
        /* loaded from: classes.dex */
        public static final class b<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return a1.c.g0((na.d) t11, (na.d) t10);
            }
        }

        /* renamed from: com.noto.app.filtered.FilteredViewModel$1$c */
        /* loaded from: classes.dex */
        public static final class c<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return a1.c.g0(Integer.valueOf(((t6.a) ((Pair) t10).f12962i).f17594d), Integer.valueOf(((t6.a) ((Pair) t11).f12962i).f17594d));
            }
        }

        /* renamed from: com.noto.app.filtered.FilteredViewModel$1$d */
        /* loaded from: classes.dex */
        public static final class d<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return a1.c.g0(Integer.valueOf(((t6.a) ((Pair) t10).f12962i).f17594d), Integer.valueOf(((t6.a) ((Pair) t11).f12962i).f17594d));
            }
        }

        /* renamed from: com.noto.app.filtered.FilteredViewModel$1$e */
        /* loaded from: classes.dex */
        public static final class e<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return a1.c.g0(Boolean.valueOf(ModelUtilsKt.u((t6.a) ((Pair) t11).f12962i)), Boolean.valueOf(ModelUtilsKt.u((t6.a) ((Pair) t10).f12962i)));
            }
        }

        /* renamed from: com.noto.app.filtered.FilteredViewModel$1$f */
        /* loaded from: classes.dex */
        public static final class f<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return a1.c.g0(Boolean.valueOf(ModelUtilsKt.u((t6.a) ((Pair) t11).f12962i)), Boolean.valueOf(ModelUtilsKt.u((t6.a) ((Pair) t10).f12962i)));
            }
        }

        /* renamed from: com.noto.app.filtered.FilteredViewModel$1$g */
        /* loaded from: classes.dex */
        public static final class g<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return a1.c.g0(((h0) ((Pair) t11).f12963j).f18683a.f17630k, ((h0) ((Pair) t10).f12963j).f18683a.f17630k);
            }
        }

        /* renamed from: com.noto.app.filtered.FilteredViewModel$1$h */
        /* loaded from: classes.dex */
        public static final class h<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return a1.c.g0(((h0) ((Pair) t11).f12963j).f18683a.f17630k, ((h0) ((Pair) t10).f12963j).f18683a.f17630k);
            }
        }

        public AnonymousClass1(p7.c<? super AnonymousClass1> cVar) {
            super(6, cVar);
        }

        @Override // u7.t
        public final Object E(List<? extends t6.a> list, List<? extends t6.d> list2, List<? extends t6.c> list3, List<? extends t6.e> list4, String str, p7.c<? super n> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.f8303m = list;
            anonymousClass1.n = list2;
            anonymousClass1.f8304o = list3;
            anonymousClass1.f8305p = list4;
            anonymousClass1.f8306q = str;
            return anonymousClass1.k(n.f16010a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:133:0x02bc, code lost:
            r3.add(new kotlin.Pair(r6, r4));
         */
        /* JADX WARN: Code restructure failed: missing block: B:207:0x0481, code lost:
            r3.add(new kotlin.Pair(r6, r4));
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object k(Object obj) {
            c.b bVar;
            Object obj2;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            boolean z20;
            boolean z21;
            boolean z22;
            boolean z23;
            boolean z24;
            na.d dVar;
            Object obj3;
            boolean z25;
            boolean z26;
            boolean z27;
            boolean z28;
            boolean z29;
            m0.b.n1(obj);
            List list = this.f8303m;
            List<t6.d> list2 = this.n;
            List list3 = this.f8304o;
            List list4 = this.f8305p;
            String str = this.f8306q;
            FilteredViewModel filteredViewModel = FilteredViewModel.this;
            int ordinal = filteredViewModel.f8293i.ordinal();
            StateFlowImpl stateFlowImpl = filteredViewModel.f8294j;
            StateFlowImpl stateFlowImpl2 = filteredViewModel.f8296l;
            int i10 = 16;
            if (ordinal != 0) {
                StateFlowImpl stateFlowImpl3 = filteredViewModel.f8295k;
                StateFlowImpl stateFlowImpl4 = filteredViewModel.f8297m;
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            int O0 = m0.b.O0(l.Z1(list, 10));
                            if (O0 >= 16) {
                                i10 = O0;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                            for (Object obj4 : list) {
                                Boolean bool = (Boolean) ((Map) filteredViewModel.e().getValue()).get((t6.a) obj4);
                                if (bool != null) {
                                    z29 = bool.booleanValue();
                                } else {
                                    z29 = true;
                                }
                                linkedHashMap.put(obj4, Boolean.valueOf(z29));
                            }
                            stateFlowImpl2.setValue(linkedHashMap);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj5 : list2) {
                                t6.d dVar2 = (t6.d) obj5;
                                if (!list.isEmpty()) {
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        if (((t6.a) it.next()).f17592a == dVar2.f17622b) {
                                            z26 = true;
                                            continue;
                                        } else {
                                            z26 = false;
                                            continue;
                                        }
                                        if (z26) {
                                            z27 = true;
                                            break;
                                        }
                                    }
                                }
                                z27 = false;
                                if (z27 && dVar2.f17627h) {
                                    z28 = true;
                                } else {
                                    z28 = false;
                                }
                                if (z28) {
                                    arrayList.add(obj5);
                                }
                            }
                            ArrayList d5 = ModelUtilsKt.d(ModelUtilsKt.x(arrayList, list3, list4, new long[0]), str);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            Iterator it2 = d5.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                h0 h0Var = (h0) next;
                                Iterator it3 = list.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        obj3 = it3.next();
                                        if (((t6.a) obj3).f17592a == h0Var.f18683a.f17622b) {
                                            z25 = true;
                                            continue;
                                        } else {
                                            z25 = false;
                                            continue;
                                        }
                                        if (z25) {
                                            break;
                                        }
                                    } else {
                                        obj3 = null;
                                        break;
                                    }
                                }
                                t6.a aVar = (t6.a) obj3;
                                Object obj6 = linkedHashMap2.get(aVar);
                                if (obj6 == null) {
                                    obj6 = new ArrayList();
                                    linkedHashMap2.put(aVar, obj6);
                                }
                                ((List) obj6).add(next);
                            }
                            LinkedHashMap e10 = ModelUtilsKt.e(linkedHashMap2);
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Map.Entry entry : e10.entrySet()) {
                                if (!((List) entry.getValue()).isEmpty()) {
                                    linkedHashMap3.put(entry.getKey(), entry.getValue());
                                }
                            }
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap(m0.b.O0(linkedHashMap3.size()));
                            for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                                linkedHashMap4.put(entry2.getKey(), ModelUtilsKt.B((List) entry2.getValue(), ((t6.a) entry2.getKey()).f17603m, ((t6.a) entry2.getKey()).n));
                            }
                            bVar = new c.b(kotlin.collections.d.N1(kotlin.collections.c.G2(kotlin.collections.c.G2(x.Q1(linkedHashMap4), new d()), new f())));
                        } else {
                            return n.f16010a;
                        }
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        for (t6.d dVar3 : list2) {
                            na.c cVar = dVar3.f17628i;
                            if (cVar != null) {
                                dVar = f7.g.e(cVar);
                            } else {
                                dVar = null;
                            }
                            if (dVar != null) {
                                arrayList2.add(dVar);
                            }
                        }
                        int O02 = m0.b.O0(l.Z1(arrayList2, 10));
                        if (O02 >= 16) {
                            i10 = O02;
                        }
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap(i10);
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            Object next2 = it4.next();
                            Boolean bool2 = (Boolean) ((Map) filteredViewModel.d().getValue()).get((na.d) next2);
                            if (bool2 != null) {
                                z24 = bool2.booleanValue();
                            } else {
                                z24 = true;
                            }
                            linkedHashMap5.put(next2, Boolean.valueOf(z24));
                        }
                        stateFlowImpl4.setValue(linkedHashMap5);
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj7 : list2) {
                            t6.d dVar4 = (t6.d) obj7;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator it5 = list.iterator();
                                while (it5.hasNext()) {
                                    if (((t6.a) it5.next()).f17592a == dVar4.f17622b) {
                                        z21 = true;
                                    } else {
                                        z21 = false;
                                    }
                                    if (z21) {
                                        z22 = true;
                                        break;
                                    }
                                }
                            }
                            z22 = false;
                            if (z22 && dVar4.f17628i != null) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            if (z23) {
                                arrayList3.add(obj7);
                            }
                        }
                        ArrayList d10 = ModelUtilsKt.d(ModelUtilsKt.x(arrayList3, list3, list4, new long[0]), str);
                        ArrayList arrayList4 = new ArrayList(l.Z1(d10, 10));
                        Iterator it6 = d10.iterator();
                        while (it6.hasNext()) {
                            h0 h0Var2 = (h0) it6.next();
                            Iterator it7 = list.iterator();
                            while (it7.hasNext()) {
                                Object next3 = it7.next();
                                if (((t6.a) next3).f17592a == h0Var2.f18683a.f17622b) {
                                    z20 = true;
                                    continue;
                                } else {
                                    z20 = false;
                                    continue;
                                }
                                if (z20) {
                                    break;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                        Iterator it8 = arrayList4.iterator();
                        while (it8.hasNext()) {
                            Object next4 = it8.next();
                            na.d e11 = f7.g.e(((h0) ((Pair) next4).f12963j).f18683a.f17630k);
                            Object obj8 = linkedHashMap6.get(e11);
                            if (obj8 == null) {
                                obj8 = new ArrayList();
                                linkedHashMap6.put(e11, obj8);
                            }
                            ((List) obj8).add(next4);
                        }
                        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                        for (Map.Entry entry3 : linkedHashMap6.entrySet()) {
                            if (!((List) entry3.getValue()).isEmpty()) {
                                linkedHashMap7.put(entry3.getKey(), entry3.getValue());
                            }
                        }
                        LinkedHashMap linkedHashMap8 = new LinkedHashMap(m0.b.O0(linkedHashMap7.size()));
                        for (Map.Entry entry4 : linkedHashMap7.entrySet()) {
                            linkedHashMap8.put(entry4.getKey(), kotlin.collections.c.G2((Iterable) entry4.getValue(), new h()));
                        }
                        bVar = new c.b(m0.b.B1(linkedHashMap8, new b()));
                    }
                } else {
                    ArrayList arrayList5 = new ArrayList(l.Z1(list2, 10));
                    for (t6.d dVar5 : list2) {
                        arrayList5.add(f7.g.e(dVar5.f17630k));
                    }
                    int O03 = m0.b.O0(l.Z1(arrayList5, 10));
                    if (O03 >= 16) {
                        i10 = O03;
                    }
                    LinkedHashMap linkedHashMap9 = new LinkedHashMap(i10);
                    Iterator it9 = arrayList5.iterator();
                    while (it9.hasNext()) {
                        Object next5 = it9.next();
                        Boolean bool3 = (Boolean) ((Map) filteredViewModel.d().getValue()).get((na.d) next5);
                        if (bool3 != null) {
                            z19 = bool3.booleanValue();
                        } else {
                            z19 = true;
                        }
                        linkedHashMap9.put(next5, Boolean.valueOf(z19));
                    }
                    stateFlowImpl4.setValue(linkedHashMap9);
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj9 : list2) {
                        t6.d dVar6 = (t6.d) obj9;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                if (((t6.a) it10.next()).f17592a == dVar6.f17622b) {
                                    z16 = true;
                                    continue;
                                } else {
                                    z16 = false;
                                    continue;
                                }
                                if (z16) {
                                    z17 = true;
                                    break;
                                }
                            }
                        }
                        z17 = false;
                        if (z17 && ModelUtilsKt.v(dVar6)) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            arrayList6.add(obj9);
                        }
                    }
                    ArrayList d11 = ModelUtilsKt.d(ModelUtilsKt.x(arrayList6, list3, list4, new long[0]), str);
                    ArrayList arrayList7 = new ArrayList(l.Z1(d11, 10));
                    Iterator it11 = d11.iterator();
                    while (it11.hasNext()) {
                        h0 h0Var3 = (h0) it11.next();
                        Iterator it12 = list.iterator();
                        while (it12.hasNext()) {
                            Object next6 = it12.next();
                            if (((t6.a) next6).f17592a == h0Var3.f18683a.f17622b) {
                                z15 = true;
                                continue;
                            } else {
                                z15 = false;
                                continue;
                            }
                            if (z15) {
                                break;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                    Iterator it13 = arrayList7.iterator();
                    while (it13.hasNext()) {
                        Object next7 = it13.next();
                        na.d e12 = f7.g.e(((h0) ((Pair) next7).f12963j).f18683a.f17630k);
                        Object obj10 = linkedHashMap10.get(e12);
                        if (obj10 == null) {
                            obj10 = new ArrayList();
                            linkedHashMap10.put(e12, obj10);
                        }
                        ((List) obj10).add(next7);
                    }
                    LinkedHashMap linkedHashMap11 = new LinkedHashMap();
                    for (Map.Entry entry5 : linkedHashMap10.entrySet()) {
                        if (!((List) entry5.getValue()).isEmpty()) {
                            linkedHashMap11.put(entry5.getKey(), entry5.getValue());
                        }
                    }
                    LinkedHashMap linkedHashMap12 = new LinkedHashMap(m0.b.O0(linkedHashMap11.size()));
                    for (Map.Entry entry6 : linkedHashMap11.entrySet()) {
                        linkedHashMap12.put(entry6.getKey(), kotlin.collections.c.G2((Iterable) entry6.getValue(), new g()));
                    }
                    bVar = new c.b(m0.b.B1(linkedHashMap12, new a()));
                }
                stateFlowImpl = stateFlowImpl3;
            } else {
                int O04 = m0.b.O0(l.Z1(list, 10));
                if (O04 >= 16) {
                    i10 = O04;
                }
                LinkedHashMap linkedHashMap13 = new LinkedHashMap(i10);
                for (Object obj11 : list) {
                    Boolean bool4 = (Boolean) ((Map) filteredViewModel.e().getValue()).get((t6.a) obj11);
                    if (bool4 != null) {
                        z14 = bool4.booleanValue();
                    } else {
                        z14 = true;
                    }
                    linkedHashMap13.put(obj11, Boolean.valueOf(z14));
                }
                stateFlowImpl2.setValue(linkedHashMap13);
                ArrayList arrayList8 = new ArrayList();
                for (Object obj12 : list2) {
                    t6.d dVar7 = (t6.d) obj12;
                    if (!list.isEmpty()) {
                        Iterator it14 = list.iterator();
                        while (it14.hasNext()) {
                            if (((t6.a) it14.next()).f17592a == dVar7.f17622b) {
                                z11 = true;
                                continue;
                            } else {
                                z11 = false;
                                continue;
                            }
                            if (z11) {
                                z12 = true;
                                break;
                            }
                        }
                    }
                    z12 = false;
                    if (z12 && !dVar7.f17627h) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        arrayList8.add(obj12);
                    }
                }
                ArrayList d12 = ModelUtilsKt.d(ModelUtilsKt.x(arrayList8, list3, list4, new long[0]), str);
                LinkedHashMap linkedHashMap14 = new LinkedHashMap();
                Iterator it15 = d12.iterator();
                while (it15.hasNext()) {
                    Object next8 = it15.next();
                    h0 h0Var4 = (h0) next8;
                    Iterator it16 = list.iterator();
                    while (true) {
                        if (it16.hasNext()) {
                            obj2 = it16.next();
                            if (((t6.a) obj2).f17592a == h0Var4.f18683a.f17622b) {
                                z10 = true;
                                continue;
                            } else {
                                z10 = false;
                                continue;
                            }
                            if (z10) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    t6.a aVar2 = (t6.a) obj2;
                    Object obj13 = linkedHashMap14.get(aVar2);
                    if (obj13 == null) {
                        obj13 = new ArrayList();
                        linkedHashMap14.put(aVar2, obj13);
                    }
                    ((List) obj13).add(next8);
                }
                LinkedHashMap e13 = ModelUtilsKt.e(linkedHashMap14);
                LinkedHashMap linkedHashMap15 = new LinkedHashMap();
                for (Map.Entry entry7 : e13.entrySet()) {
                    if (!((List) entry7.getValue()).isEmpty()) {
                        linkedHashMap15.put(entry7.getKey(), entry7.getValue());
                    }
                }
                LinkedHashMap linkedHashMap16 = new LinkedHashMap(m0.b.O0(linkedHashMap15.size()));
                for (Map.Entry entry8 : linkedHashMap15.entrySet()) {
                    linkedHashMap16.put(entry8.getKey(), ModelUtilsKt.B((List) entry8.getValue(), ((t6.a) entry8.getKey()).f17603m, ((t6.a) entry8.getKey()).n));
                }
                bVar = new c.b(kotlin.collections.d.N1(kotlin.collections.c.G2(kotlin.collections.c.G2(x.Q1(linkedHashMap16), new c()), new e())));
            }
            stateFlowImpl.setValue(bVar);
            return n.f16010a;
        }
    }

    public FilteredViewModel(a aVar, d dVar, b bVar, u6.c cVar, e eVar, FilteredItemModel filteredItemModel) {
        g.f(aVar, "folderRepository");
        g.f(dVar, "noteRepository");
        g.f(bVar, "labelRepository");
        g.f(cVar, "noteLabelRepository");
        g.f(eVar, "settingsRepository");
        this.f8288d = aVar;
        this.f8289e = dVar;
        this.f8290f = bVar;
        this.f8291g = cVar;
        this.f8292h = eVar;
        this.f8293i = filteredItemModel;
        c.a aVar2 = c.a.f16110a;
        this.f8294j = f.a(aVar2);
        this.f8295k = f.a(aVar2);
        this.f8296l = f.a(kotlin.collections.d.K1());
        this.f8297m = f.a(kotlin.collections.d.K1());
        this.n = a1.b.C0(eVar.h(), a1.b.d0(this), s.a.f15450b, Font.Nunito);
        Boolean bool = Boolean.FALSE;
        this.f8298o = f.a(bool);
        StateFlowImpl a10 = f.a("");
        this.f8299p = a10;
        kotlinx.coroutines.flow.b<Boolean> P = eVar.P();
        ja.x d02 = a1.b.d0(this);
        kotlinx.coroutines.flow.t tVar = s.a.f15449a;
        this.f8300q = a1.b.C0(P, d02, tVar, Boolean.TRUE);
        this.f8301r = a1.b.C0(eVar.m0(filteredItemModel), a1.b.d0(this), tVar, 0);
        this.f8302s = a1.b.C0(eVar.x(), a1.b.d0(this), tVar, bool);
        f.b(new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3(new kotlinx.coroutines.flow.b[]{aVar.h(), dVar.e(), bVar.d(), cVar.b(), a1.b.m(a10)}, new AnonymousClass1(null)), a1.b.d0(this));
    }

    public final m d() {
        return a1.b.m(this.f8297m);
    }

    public final m e() {
        return a1.b.m(this.f8296l);
    }
}
