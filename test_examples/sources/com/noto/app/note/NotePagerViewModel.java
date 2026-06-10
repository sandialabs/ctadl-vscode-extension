package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.i0;
import com.noto.app.domain.model.ScreenBrightnessLevel;
import com.noto.app.note.NotePagerViewModel;
import ja.x;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.s;
import kotlinx.coroutines.flow.t;

/* loaded from: classes.dex */
public final class NotePagerViewModel extends i0 {

    /* renamed from: d  reason: collision with root package name */
    public final u6.a f9136d;

    /* renamed from: e  reason: collision with root package name */
    public final u6.d f9137e;

    /* renamed from: f  reason: collision with root package name */
    public final u6.e f9138f;

    /* renamed from: g  reason: collision with root package name */
    public final long[] f9139g;

    /* renamed from: h  reason: collision with root package name */
    public final kotlinx.coroutines.flow.m f9140h;

    /* renamed from: i  reason: collision with root package name */
    public final kotlinx.coroutines.flow.m f9141i;

    /* renamed from: j  reason: collision with root package name */
    public final kotlinx.coroutines.flow.m f9142j;

    /* renamed from: k  reason: collision with root package name */
    public final kotlinx.coroutines.flow.m f9143k;

    /* renamed from: l  reason: collision with root package name */
    public final kotlinx.coroutines.flow.m f9144l;

    /* renamed from: m  reason: collision with root package name */
    public final kotlinx.coroutines.flow.m f9145m;
    public final StateFlowImpl n;

    /* renamed from: o  reason: collision with root package name */
    public final StateFlowImpl f9146o;

    /* loaded from: classes.dex */
    public static final class a<T> implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            long longValue = ((Number) t10).longValue();
            NotePagerViewModel notePagerViewModel = NotePagerViewModel.this;
            return a1.c.g0(Integer.valueOf(kotlin.collections.b.o2(longValue, notePagerViewModel.f9139g)), Integer.valueOf(kotlin.collections.b.o2(((Number) t11).longValue(), notePagerViewModel.f9139g)));
        }
    }

    public NotePagerViewModel(u6.a aVar, u6.d dVar, u6.e eVar, long j2, long j10, long[] jArr) {
        v7.g.f(aVar, "folderRepository");
        v7.g.f(dVar, "noteRepository");
        v7.g.f(eVar, "settingsRepository");
        v7.g.f(jArr, "selectedNoteIds");
        this.f9136d = aVar;
        this.f9137e = dVar;
        this.f9138f = eVar;
        this.f9139g = jArr;
        FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(aVar.d(j2));
        x d02 = a1.b.d0(this);
        t tVar = s.a.f15449a;
        kotlinx.coroutines.flow.m C0 = a1.b.C0(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, d02, tVar, new t6.a(0L, null, 2097143));
        this.f9140h = C0;
        final kotlinx.coroutines.flow.i iVar = new kotlinx.coroutines.flow.i(dVar.d(j2), C0, new NotePagerViewModel$noteIds$1(null));
        this.f9141i = a1.b.C0(new kotlinx.coroutines.flow.b<List<? extends Long>>() { // from class: com.noto.app.note.NotePagerViewModel$special$$inlined$map$1

            /* renamed from: com.noto.app.note.NotePagerViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.c f9149i;

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ NotePagerViewModel f9150j;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.note.NotePagerViewModel$special$$inlined$map$1$2", f = "NotePagerViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.note.NotePagerViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f9151l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f9152m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f9151l = obj;
                        this.f9152m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.c cVar, NotePagerViewModel notePagerViewModel) {
                    this.f9149i = cVar;
                    this.f9150j = notePagerViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    NotePagerViewModel notePagerViewModel;
                    boolean z10;
                    boolean j2;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f9152m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f9152m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f9151l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f9152m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                List<t6.d> list = (List) obj;
                                ArrayList arrayList = new ArrayList(n7.l.Z1(list, 10));
                                for (t6.d dVar : list) {
                                    arrayList.add(new Long(dVar.f17621a));
                                }
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<T> it = arrayList.iterator();
                                while (true) {
                                    boolean hasNext = it.hasNext();
                                    notePagerViewModel = this.f9150j;
                                    if (!hasNext) {
                                        break;
                                    }
                                    T next = it.next();
                                    long longValue = ((Number) next).longValue();
                                    long[] jArr = notePagerViewModel.f9139g;
                                    if (jArr.length == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        j2 = true;
                                    } else {
                                        j2 = kotlin.collections.b.j2(longValue, jArr);
                                    }
                                    if (j2) {
                                        arrayList2.add(next);
                                    }
                                }
                                List G2 = kotlin.collections.c.G2(arrayList2, new NotePagerViewModel.a());
                                anonymousClass1.f9152m = 1;
                                if (this.f9149i.c(G2, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return m7.n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f9151l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f9152m;
                    if (i10 == 0) {
                    }
                    return m7.n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(kotlinx.coroutines.flow.c<? super List<? extends Long>> cVar, p7.c cVar2) {
                Object a10 = iVar.a(new AnonymousClass2(cVar, this), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
            }
        }, a1.b.d0(this), tVar, EmptyList.f12981i);
        this.f9142j = a1.b.C0(eVar.p(), a1.b.d0(this), tVar, Boolean.FALSE);
        kotlinx.coroutines.flow.b<Boolean> Q = eVar.Q();
        x d03 = a1.b.d0(this);
        Boolean bool = Boolean.TRUE;
        this.f9143k = a1.b.C0(Q, d03, tVar, bool);
        this.f9144l = a1.b.C0(eVar.g(), a1.b.d0(this), tVar, bool);
        this.f9145m = a1.b.C0(eVar.M(), a1.b.d0(this), tVar, ScreenBrightnessLevel.System);
        this.n = kotlinx.coroutines.flow.f.a(Long.valueOf(j10));
        this.f9146o = kotlinx.coroutines.flow.f.a(0);
    }
}
