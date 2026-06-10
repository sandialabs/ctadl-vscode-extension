package com.noto.app.main;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.i0;
import com.noto.app.domain.model.FolderListSortingType;
import com.noto.app.domain.model.SortingOrder;
import com.noto.app.util.ModelUtilsKt;
import ja.k1;
import ja.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2;
import kotlinx.coroutines.flow.StartedLazily;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.m;
import kotlinx.coroutines.flow.s;
import kotlinx.coroutines.flow.t;
import m7.n;
import n6.c;
import n7.l;
import u6.d;
import u6.e;
import v7.g;

/* loaded from: classes.dex */
public final class MainViewModel extends i0 {

    /* renamed from: d  reason: collision with root package name */
    public final u6.a f8905d;

    /* renamed from: e  reason: collision with root package name */
    public final d f8906e;

    /* renamed from: f  reason: collision with root package name */
    public final e f8907f;

    /* renamed from: g  reason: collision with root package name */
    public final m f8908g;

    /* renamed from: h  reason: collision with root package name */
    public final m f8909h;

    /* renamed from: i  reason: collision with root package name */
    public final m f8910i;

    /* renamed from: j  reason: collision with root package name */
    public final m f8911j;

    /* renamed from: k  reason: collision with root package name */
    public final m f8912k;

    /* renamed from: l  reason: collision with root package name */
    public final m f8913l;

    /* renamed from: m  reason: collision with root package name */
    public final m f8914m;
    public final m n;

    /* renamed from: o  reason: collision with root package name */
    public final m f8915o;

    public MainViewModel(u6.a aVar, d dVar, e eVar) {
        g.f(aVar, "folderRepository");
        g.f(dVar, "noteRepository");
        g.f(eVar, "settingsRepository");
        this.f8905d = aVar;
        this.f8906e = dVar;
        this.f8907f = eVar;
        kotlinx.coroutines.flow.b<FolderListSortingType> o10 = eVar.o();
        x d02 = a1.b.d0(this);
        StartedLazily startedLazily = s.a.f15450b;
        m C0 = a1.b.C0(o10, d02, startedLazily, FolderListSortingType.CreationDate);
        this.f8908g = C0;
        m C02 = a1.b.C0(eVar.N(), a1.b.d0(this), startedLazily, SortingOrder.Descending);
        this.f8909h = C02;
        final FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 A = a1.b.A(aVar.e(), dVar.h(), C0, C02, new MainViewModel$folders$1(this, null));
        kotlinx.coroutines.flow.b<c.b<List<? extends Pair<? extends t6.a, ? extends Integer>>>> bVar = new kotlinx.coroutines.flow.b<c.b<List<? extends Pair<? extends t6.a, ? extends Integer>>>>() { // from class: com.noto.app.main.MainViewModel$special$$inlined$map$1

            /* renamed from: com.noto.app.main.MainViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.c f8917i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.main.MainViewModel$special$$inlined$map$1$2", f = "MainViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.main.MainViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f8918l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f8919m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f8918l = obj;
                        this.f8919m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                    this.f8917i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f8919m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f8919m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f8918l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f8919m;
                            if (i10 != 0) {
                                m0.b.n1(obj2);
                                c.b bVar = new c.b((List) obj);
                                anonymousClass1.f8919m = 1;
                                if (this.f8917i.c(bVar, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                m0.b.n1(obj2);
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f8918l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f8919m;
                    if (i10 != 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(kotlinx.coroutines.flow.c<? super c.b<List<? extends Pair<? extends t6.a, ? extends Integer>>>> cVar, p7.c cVar2) {
                Object a10 = A.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        x d03 = a1.b.d0(this);
        c.a aVar2 = c.a.f16110a;
        this.f8910i = a1.b.C0(bVar, d03, startedLazily, aVar2);
        final FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 A2 = a1.b.A(aVar.a(), dVar.h(), C0, C02, new MainViewModel$archivedFolders$1(this, null));
        this.f8911j = a1.b.C0(new kotlinx.coroutines.flow.b<c.b<List<? extends Pair<? extends t6.a, ? extends Integer>>>>() { // from class: com.noto.app.main.MainViewModel$special$$inlined$map$2

            /* renamed from: com.noto.app.main.MainViewModel$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.c f8921i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.main.MainViewModel$special$$inlined$map$2$2", f = "MainViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.main.MainViewModel$special$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f8922l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f8923m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f8922l = obj;
                        this.f8923m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                    this.f8921i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f8923m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f8923m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f8922l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f8923m;
                            if (i10 != 0) {
                                m0.b.n1(obj2);
                                c.b bVar = new c.b((List) obj);
                                anonymousClass1.f8923m = 1;
                                if (this.f8921i.c(bVar, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                m0.b.n1(obj2);
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f8922l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f8923m;
                    if (i10 != 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(kotlinx.coroutines.flow.c<? super c.b<List<? extends Pair<? extends t6.a, ? extends Integer>>>> cVar, p7.c cVar2) {
                Object a10 = A2.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, a1.b.d0(this), startedLazily, aVar2);
        final FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 A3 = a1.b.A(aVar.g(), dVar.h(), C0, C02, new MainViewModel$vaultedFolders$1(this, null));
        this.f8912k = a1.b.C0(new kotlinx.coroutines.flow.b<c.b<List<? extends Pair<? extends t6.a, ? extends Integer>>>>() { // from class: com.noto.app.main.MainViewModel$special$$inlined$map$3

            /* renamed from: com.noto.app.main.MainViewModel$special$$inlined$map$3$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.c f8925i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.main.MainViewModel$special$$inlined$map$3$2", f = "MainViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.main.MainViewModel$special$$inlined$map$3$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f8926l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f8927m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f8926l = obj;
                        this.f8927m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                    this.f8925i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f8927m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f8927m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f8926l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f8927m;
                            if (i10 != 0) {
                                m0.b.n1(obj2);
                                c.b bVar = new c.b((List) obj);
                                anonymousClass1.f8927m = 1;
                                if (this.f8925i.c(bVar, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                m0.b.n1(obj2);
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f8926l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f8927m;
                    if (i10 != 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(kotlinx.coroutines.flow.c<? super c.b<List<? extends Pair<? extends t6.a, ? extends Integer>>>> cVar, p7.c cVar2) {
                Object a10 = A3.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, a1.b.d0(this), startedLazily, aVar2);
        kotlinx.coroutines.flow.b<Boolean> A4 = eVar.A();
        x d04 = a1.b.d0(this);
        t tVar = s.a.f15449a;
        this.f8913l = a1.b.C0(A4, d04, tVar, Boolean.FALSE);
        this.f8914m = a1.b.C0(eVar.j0(), a1.b.d0(this), tVar, null);
        this.n = a1.b.C0(eVar.z(), a1.b.d0(this), startedLazily, Boolean.TRUE);
        this.f8915o = a1.b.C0(new i(dVar.e(), aVar.h(), new MainViewModel$allNotes$1(null)), a1.b.d0(this), startedLazily, EmptyList.f12981i);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(ArrayList arrayList, List list, List list2, FolderListSortingType folderListSortingType, SortingOrder sortingOrder) {
        Object obj;
        int i10;
        boolean z10;
        boolean z11;
        ArrayList arrayList2 = new ArrayList(l.Z1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t6.a aVar = (t6.a) it.next();
            Iterator it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (((t6.b) obj).f17613a == aVar.f17592a) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                    if (z11) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            t6.b bVar = (t6.b) obj;
            if (bVar != null) {
                i10 = bVar.f17614b;
            } else {
                i10 = 0;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                Long l2 = ((t6.a) obj2).f17593b;
                long j2 = aVar.f17592a;
                if (l2 != null && l2.longValue() == j2) {
                    z10 = true;
                    if (!z10) {
                        arrayList3.add(obj2);
                    }
                }
                z10 = false;
                if (!z10) {
                }
            }
            arrayList2.add(new Pair(t6.a.a(aVar, null, null, 0, null, null, 0, false, false, false, null, null, null, null, null, false, 0, null, null, ModelUtilsKt.A(d(arrayList3, list, list2, folderListSortingType, sortingOrder), folderListSortingType, sortingOrder), 1048575), Integer.valueOf(i10)));
        }
        return arrayList2;
    }

    public final k1 e(SortingOrder sortingOrder) {
        return m0.b.M0(a1.b.d0(this), null, null, new MainViewModel$updateSortingOrder$1(this, sortingOrder, null), 3);
    }

    public final k1 f(FolderListSortingType folderListSortingType) {
        return m0.b.M0(a1.b.d0(this), null, null, new MainViewModel$updateSortingType$1(this, folderListSortingType, null), 3);
    }
}
