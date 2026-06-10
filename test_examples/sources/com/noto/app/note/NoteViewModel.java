package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.i0;
import com.noto.app.domain.model.Font;
import com.noto.app.util.ModelUtilsKt;
import ja.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StartedLazily;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.s;
import kotlinx.coroutines.flow.u;
import u7.q;

/* loaded from: classes.dex */
public final class NoteViewModel extends i0 {

    /* renamed from: d  reason: collision with root package name */
    public final u6.a f9258d;

    /* renamed from: e  reason: collision with root package name */
    public final u6.d f9259e;

    /* renamed from: f  reason: collision with root package name */
    public final u6.b f9260f;

    /* renamed from: g  reason: collision with root package name */
    public final u6.c f9261g;

    /* renamed from: h  reason: collision with root package name */
    public final u6.e f9262h;

    /* renamed from: i  reason: collision with root package name */
    public final long f9263i;

    /* renamed from: j  reason: collision with root package name */
    public final long f9264j;

    /* renamed from: k  reason: collision with root package name */
    public final String f9265k;

    /* renamed from: l  reason: collision with root package name */
    public long[] f9266l;

    /* renamed from: m  reason: collision with root package name */
    public final StateFlowImpl f9267m;
    public final kotlinx.coroutines.flow.p n;

    /* renamed from: o  reason: collision with root package name */
    public final kotlinx.coroutines.flow.p f9268o;

    /* renamed from: p  reason: collision with root package name */
    public final StateFlowImpl f9269p;

    /* renamed from: q  reason: collision with root package name */
    public final kotlinx.coroutines.flow.m f9270q;

    /* renamed from: r  reason: collision with root package name */
    public final kotlinx.coroutines.flow.m f9271r;

    /* renamed from: s  reason: collision with root package name */
    public final StateFlowImpl f9272s;

    /* renamed from: t  reason: collision with root package name */
    public final kotlinx.coroutines.flow.m f9273t;

    /* renamed from: u  reason: collision with root package name */
    public final StateFlowImpl f9274u;

    /* renamed from: v  reason: collision with root package name */
    public final StateFlowImpl f9275v;

    /* renamed from: w  reason: collision with root package name */
    public int f9276w;

    /* renamed from: x  reason: collision with root package name */
    public int f9277x;

    /* renamed from: y  reason: collision with root package name */
    public int f9278y;

    /* renamed from: z  reason: collision with root package name */
    public int f9279z;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/c;", "Lt6/d;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @q7.c(c = "com.noto.app.note.NoteViewModel$1", f = "NoteViewModel.kt", l = {64}, m = "invokeSuspend")
    /* renamed from: com.noto.app.note.NoteViewModel$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements u7.p<kotlinx.coroutines.flow.c<? super t6.d>, p7.c<? super m7.n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f9280m;
        public /* synthetic */ Object n;

        public AnonymousClass1(p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // u7.p
        public final Object R(kotlinx.coroutines.flow.c<? super t6.d> cVar, p7.c<? super m7.n> cVar2) {
            return ((AnonymousClass1) a(cVar, cVar2)).k(m7.n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.n = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f9280m;
            if (i10 != 0) {
                if (i10 == 1) {
                    m0.b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                m0.b.n1(obj);
                NoteViewModel noteViewModel = NoteViewModel.this;
                long j2 = noteViewModel.f9264j;
                long j10 = noteViewModel.f9263i;
                String str = noteViewModel.f9265k;
                t6.d dVar = new t6.d(j2, j10, ModelUtilsKt.k(str), ModelUtilsKt.C(str), false, 4064);
                this.f9280m = 1;
                if (((kotlinx.coroutines.flow.c) this.n).c(dVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return m7.n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/d;", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @q7.c(c = "com.noto.app.note.NoteViewModel$2", f = "NoteViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.note.NoteViewModel$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements u7.p<t6.d, p7.c<? super m7.n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f9282m;

        public AnonymousClass2(p7.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // u7.p
        public final Object R(t6.d dVar, p7.c<? super m7.n> cVar) {
            return ((AnonymousClass2) a(dVar, cVar)).k(m7.n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
            anonymousClass2.f9282m = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            m0.b.n1(obj);
            NoteViewModel.this.f9267m.setValue((t6.d) this.f9282m);
            return m7.n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0000\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@"}, d2 = {"", "Lt6/c;", "labels", "Lt6/e;", "noteLabels", "", "", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @q7.c(c = "com.noto.app.note.NoteViewModel$3", f = "NoteViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.note.NoteViewModel$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements q<List<? extends t6.c>, List<? extends t6.e>, p7.c<? super Map<t6.c, ? extends Boolean>>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ List f9283m;
        public /* synthetic */ List n;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<List<Pair<t6.c, Boolean>>> f9285p;

        /* renamed from: com.noto.app.note.NoteViewModel$3$a */
        /* loaded from: classes.dex */
        public static final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return a1.c.g0(Integer.valueOf(((t6.c) ((Pair) t10).f12962i).f17618e), Integer.valueOf(((t6.c) ((Pair) t11).f12962i).f17618e));
            }
        }

        /* renamed from: com.noto.app.note.NoteViewModel$3$b */
        /* loaded from: classes.dex */
        public static final class b<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return a1.c.g0(Integer.valueOf(((t6.c) ((Pair) t10).f12962i).f17618e), Integer.valueOf(((t6.c) ((Pair) t11).f12962i).f17618e));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Ref$ObjectRef<List<Pair<t6.c, Boolean>>> ref$ObjectRef, p7.c<? super AnonymousClass3> cVar) {
            super(3, cVar);
            this.f9285p = ref$ObjectRef;
        }

        @Override // u7.q
        public final Object O(List<? extends t6.c> list, List<? extends t6.e> list2, p7.c<? super Map<t6.c, ? extends Boolean>> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f9285p, cVar);
            anonymousClass3.f9283m = list;
            anonymousClass3.n = list2;
            return anonymousClass3.k(m7.n.f16010a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:84:0x0153, code lost:
            r2.add(r10);
         */
        /* JADX WARN: Removed duplicated region for block: B:95:0x018e  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x019f  */
        /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List, T] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object k(Object obj) {
            boolean z10;
            boolean z11;
            boolean z12;
            ArrayList arrayList;
            ?? G2;
            Iterator it;
            boolean z13;
            boolean z14;
            boolean z15;
            NoteViewModel noteViewModel;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            boolean z20;
            m0.b.n1(obj);
            List list = this.f9283m;
            List list2 = this.n;
            ArrayList arrayList2 = new ArrayList(n7.l.Z1(list, 10));
            Iterator it2 = list.iterator();
            while (true) {
                boolean z21 = false;
                if (!it2.hasNext()) {
                    break;
                }
                t6.c cVar = (t6.c) it2.next();
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = list2.iterator();
                while (true) {
                    boolean hasNext = it3.hasNext();
                    noteViewModel = NoteViewModel.this;
                    if (!hasNext) {
                        break;
                    }
                    Object next = it3.next();
                    if (((t6.e) next).f17635b == ((t6.d) noteViewModel.h().getValue()).f17621a) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    if (z20) {
                        arrayList3.add(next);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        if (((t6.e) it4.next()).c == cVar.f17615a) {
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
                if (!z17) {
                    long[] jArr = noteViewModel.f9266l;
                    int length = jArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            if (jArr[i10] == cVar.f17615a) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (z19) {
                                z18 = true;
                                break;
                            }
                            i10++;
                        } else {
                            z18 = false;
                            break;
                        }
                    }
                    if (!z18) {
                        arrayList2.add(new Pair(cVar, Boolean.valueOf(z21)));
                    }
                }
                z21 = true;
                arrayList2.add(new Pair(cVar, Boolean.valueOf(z21)));
            }
            Ref$ObjectRef<List<Pair<t6.c, Boolean>>> ref$ObjectRef = this.f9285p;
            List<Pair<t6.c, Boolean>> list3 = ref$ObjectRef.f13060i;
            if (list3 == null) {
                list3 = EmptyList.f12981i;
            }
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it5 = list3.iterator();
                while (it5.hasNext()) {
                    Pair pair = (Pair) it5.next();
                    Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        t6.c cVar2 = (t6.c) ((Pair) it6.next()).f12962i;
                        long j2 = cVar2.f17615a;
                        t6.c cVar3 = (t6.c) pair.f12962i;
                        if (j2 == cVar3.f17615a) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (z10) {
                            if (cVar3.f17618e != cVar2.f17618e) {
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
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            z12 = false;
            List<Pair<t6.c, Boolean>> list4 = ref$ObjectRef.f13060i;
            if (list4 != null && !z12) {
                List<Pair<t6.c, Boolean>> list5 = list4;
                arrayList = new ArrayList(n7.l.Z1(list5, 10));
                Iterator<T> it7 = list5.iterator();
                while (it7.hasNext()) {
                    Pair pair2 = (Pair) it7.next();
                    Iterator it8 = arrayList2.iterator();
                    while (it8.hasNext()) {
                        Pair pair3 = (Pair) it8.next();
                        if (((t6.c) pair3.f12962i).f17615a == ((t6.c) pair2.f12962i).f17615a) {
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
                G2 = kotlin.collections.c.G2(arrayList, new a());
                ref$ObjectRef.f13060i = G2;
                EmptyList emptyList = G2;
                if (G2 == 0) {
                    emptyList = EmptyList.f12981i;
                }
                ArrayList arrayList4 = new ArrayList();
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    Pair pair4 = (Pair) next2;
                    List<Pair<t6.c, Boolean>> list6 = ref$ObjectRef.f13060i;
                    if (list6 == null) {
                        list6 = EmptyList.f12981i;
                    }
                    if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                        Iterator<T> it9 = list6.iterator();
                        while (it9.hasNext()) {
                            if (((t6.c) ((Pair) it9.next()).f12962i).f17615a == ((t6.c) pair4.f12962i).f17615a) {
                                z13 = true;
                                continue;
                            } else {
                                z13 = false;
                                continue;
                            }
                            if (z13) {
                                z14 = true;
                                break;
                            }
                        }
                    }
                    z14 = false;
                    if (!z14) {
                        arrayList4.add(next2);
                    }
                }
                return kotlin.collections.d.N1(kotlin.collections.c.z2(kotlin.collections.c.G2(arrayList4, new b()), emptyList));
            }
            arrayList = new ArrayList();
            Iterator it10 = arrayList2.iterator();
            while (it10.hasNext()) {
                Object next3 = it10.next();
                if (((Boolean) ((Pair) next3).f12963j).booleanValue()) {
                    arrayList.add(next3);
                }
            }
            G2 = kotlin.collections.c.G2(arrayList, new a());
            ref$ObjectRef.f13060i = G2;
            EmptyList emptyList2 = G2;
            if (G2 == 0) {
            }
            ArrayList arrayList42 = new ArrayList();
            it = arrayList2.iterator();
            while (it.hasNext()) {
            }
            return kotlin.collections.d.N1(kotlin.collections.c.z2(kotlin.collections.c.G2(arrayList42, new b()), emptyList2));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, d2 = {"", "Lt6/c;", "", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @q7.c(c = "com.noto.app.note.NoteViewModel$4", f = "NoteViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.note.NoteViewModel$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends SuspendLambda implements u7.p<Map<t6.c, ? extends Boolean>, p7.c<? super m7.n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f9286m;

        public AnonymousClass4(p7.c<? super AnonymousClass4> cVar) {
            super(2, cVar);
        }

        @Override // u7.p
        public final Object R(Map<t6.c, ? extends Boolean> map, p7.c<? super m7.n> cVar) {
            return ((AnonymousClass4) a(map, cVar)).k(m7.n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(cVar);
            anonymousClass4.f9286m = obj;
            return anonymousClass4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            m0.b.n1(obj);
            NoteViewModel noteViewModel = NoteViewModel.this;
            noteViewModel.f9272s.setValue((Map) this.f9286m);
            noteViewModel.f9266l = new long[0];
            return m7.n.f16010a;
        }
    }

    public NoteViewModel(u6.a aVar, u6.d dVar, u6.b bVar, u6.c cVar, u6.e eVar, long j2, long j10, String str, long[] jArr) {
        v7.g.f(aVar, "folderRepository");
        v7.g.f(dVar, "noteRepository");
        v7.g.f(bVar, "labelRepository");
        v7.g.f(cVar, "noteLabelRepository");
        v7.g.f(eVar, "settingsRepository");
        this.f9258d = aVar;
        this.f9259e = dVar;
        this.f9260f = bVar;
        this.f9261g = cVar;
        this.f9262h = eVar;
        this.f9263i = j2;
        this.f9264j = j10;
        this.f9265k = str;
        this.f9266l = jArr;
        this.f9267m = kotlinx.coroutines.flow.f.a(new t6.d(j10, j2, null, null, false, 4076));
        this.n = kotlinx.coroutines.flow.e.b(Integer.MAX_VALUE, 0, null, 6);
        this.f9268o = kotlinx.coroutines.flow.e.b(Integer.MAX_VALUE, 0, null, 6);
        Boolean bool = Boolean.FALSE;
        this.f9269p = kotlinx.coroutines.flow.f.a(bool);
        FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(aVar.d(j2));
        x d02 = a1.b.d0(this);
        StartedLazily startedLazily = s.a.f15450b;
        this.f9270q = a1.b.C0(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, d02, startedLazily, new t6.a(0L, null, 2097143));
        this.f9271r = a1.b.C0(eVar.h(), a1.b.d0(this), startedLazily, Font.Nunito);
        this.f9272s = kotlinx.coroutines.flow.f.a(kotlin.collections.d.K1());
        this.f9273t = a1.b.C0(eVar.P(), a1.b.d0(this), s.a.f15449a, Boolean.TRUE);
        this.f9274u = kotlinx.coroutines.flow.f.a(bool);
        this.f9275v = kotlinx.coroutines.flow.f.a(bool);
        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(null), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new AnonymousClass1(null), dVar.f(j10)))), a1.b.d0(this));
        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass4(null), new kotlinx.coroutines.flow.i(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(bVar.e(j2)), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(cVar.b()), new AnonymousClass3(new Ref$ObjectRef(), null))), a1.b.d0(this));
    }

    public static Triple g(String str, List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (v7.g.a(((Triple) it.next()).f12974k, str)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        return (Triple) list.get(a1.c.c0(i10 + 1, 0, a1.c.B0(list)));
    }

    public static Triple i(String str, List list) {
        int i10;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (v7.g.a(((Triple) listIterator.previous()).f12974k, str)) {
                    i10 = listIterator.nextIndex();
                    break;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        return (Triple) list.get(a1.c.c0(i10 - 1, 0, a1.c.B0(list)));
    }

    public final void d(String str, String str2, boolean z10) {
        v7.g.f(str, "title");
        v7.g.f(str2, "body");
        m0.b.M0(a1.b.d0(this), null, null, new NoteViewModel$createOrUpdateNote$1(this, str, str2, z10, null), 3);
    }

    public final kotlinx.coroutines.flow.l e() {
        return new kotlinx.coroutines.flow.l(this.f9268o, null);
    }

    public final u<Map<t6.c, Boolean>> f() {
        return a1.b.m(this.f9272s);
    }

    public final kotlinx.coroutines.flow.m h() {
        return a1.b.m(this.f9267m);
    }

    public final kotlinx.coroutines.flow.l j() {
        return new kotlinx.coroutines.flow.l(this.n, null);
    }

    public final Triple<Integer, Integer, String> k() {
        Triple<Integer, Integer, String> g10 = g(((t6.d) h().getValue()).f17623d, e().b());
        m();
        n(g10.f12974k);
        return g10;
    }

    public final Triple<Integer, Integer, String> l() {
        Triple<Integer, Integer, String> g10 = g(((t6.d) h().getValue()).c, j().b());
        m();
        o(g10.f12974k);
        return g10;
    }

    public final void m() {
        this.f9269p.setValue(Boolean.TRUE);
    }

    public final void n(String str) {
        v7.g.f(str, "body");
        this.f9267m.setValue(t6.d.a((t6.d) h().getValue(), 0L, 0L, null, str, 0, false, false, null, null, 0, 4087));
    }

    public final void o(String str) {
        v7.g.f(str, "title");
        this.f9267m.setValue(t6.d.a((t6.d) h().getValue(), 0L, 0L, str, null, 0, false, false, null, null, 0, 4091));
    }

    public final Triple<Integer, Integer, String> p() {
        Triple<Integer, Integer, String> i10 = i(((t6.d) h().getValue()).f17623d, e().b());
        m();
        n(i10.f12974k);
        return i10;
    }

    public final Triple<Integer, Integer, String> q() {
        Triple<Integer, Integer, String> i10 = i(((t6.d) h().getValue()).c, j().b());
        m();
        o(i10.f12974k);
        return i10;
    }
}
