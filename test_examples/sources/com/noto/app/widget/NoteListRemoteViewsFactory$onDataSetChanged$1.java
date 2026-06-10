package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.FilteringType;
import com.noto.app.util.ModelUtilsKt;
import com.noto.app.widget.NoteListRemoteViewsFactory$onDataSetChanged$1;
import ja.x;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import m0.b;
import m7.n;
import q7.c;
import u6.d;
import u6.e;
import u7.p;
import v7.g;
import x6.h0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.NoteListRemoteViewsFactory$onDataSetChanged$1", f = "NoteListRemoteViewsFactory.kt", l = {42, 43, 46, 50, 53, 62}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NoteListRemoteViewsFactory$onDataSetChanged$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public Object f10050m;
    public List n;

    /* renamed from: o  reason: collision with root package name */
    public List f10051o;

    /* renamed from: p  reason: collision with root package name */
    public NoteListRemoteViewsFactory f10052p;

    /* renamed from: q  reason: collision with root package name */
    public int f10053q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ NoteListRemoteViewsFactory f10054r;

    /* loaded from: classes.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return a1.c.g0(Boolean.valueOf(((h0) t11).f18683a.f17626g), Boolean.valueOf(((h0) t10).f18683a.f17626g));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListRemoteViewsFactory$onDataSetChanged$1(NoteListRemoteViewsFactory noteListRemoteViewsFactory, p7.c<? super NoteListRemoteViewsFactory$onDataSetChanged$1> cVar) {
        super(2, cVar);
        this.f10054r = noteListRemoteViewsFactory;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((NoteListRemoteViewsFactory$onDataSetChanged$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new NoteListRemoteViewsFactory$onDataSetChanged$1(this.f10054r, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0166 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        NoteListRemoteViewsFactory noteListRemoteViewsFactory;
        NoteListRemoteViewsFactory noteListRemoteViewsFactory2;
        Object a10;
        final List list;
        ArrayList arrayList;
        List list2;
        NoteListRemoteViewsFactory noteListRemoteViewsFactory3;
        ArrayList arrayList2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f10053q;
        NoteListRemoteViewsFactory noteListRemoteViewsFactory4 = this.f10054r;
        switch (i10) {
            case 0:
                b.n1(obj);
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(((u6.a) noteListRemoteViewsFactory4.f10023j.getValue()).d(noteListRemoteViewsFactory4.f10028p));
                this.f10050m = noteListRemoteViewsFactory4;
                this.f10053q = 1;
                obj = FlowKt__ReduceKt.a(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                noteListRemoteViewsFactory = noteListRemoteViewsFactory4;
                noteListRemoteViewsFactory.f10029q = (t6.a) obj;
                kotlinx.coroutines.flow.b f10 = ((e) noteListRemoteViewsFactory4.n.getValue()).f(noteListRemoteViewsFactory4.f10028p, noteListRemoteViewsFactory4.f10027o);
                this.f10050m = noteListRemoteViewsFactory4;
                this.f10053q = 2;
                obj = FlowKt__ReduceKt.a(f10, this);
                if (obj != coroutineSingletons) {
                    return coroutineSingletons;
                }
                noteListRemoteViewsFactory2 = noteListRemoteViewsFactory4;
                noteListRemoteViewsFactory2.f10030r = (List) obj;
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(((u6.b) noteListRemoteViewsFactory4.f10025l.getValue()).e(noteListRemoteViewsFactory4.f10028p));
                this.f10050m = null;
                this.f10053q = 3;
                obj = FlowKt__ReduceKt.a(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$12, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                List list3 = (List) obj;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list3) {
                    t6.c cVar = (t6.c) obj2;
                    List<Long> list4 = noteListRemoteViewsFactory4.f10030r;
                    if (list4 != null) {
                        if (list4.contains(new Long(cVar.f17615a))) {
                            arrayList3.add(obj2);
                        }
                    } else {
                        g.l("labelIds");
                        throw null;
                    }
                }
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$13 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(((u6.c) noteListRemoteViewsFactory4.f10026m.getValue()).b());
                this.f10050m = list3;
                this.n = arrayList3;
                this.f10053q = 4;
                a10 = FlowKt__ReduceKt.a(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$13, this);
                if (a10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list = list3;
                arrayList = arrayList3;
                obj = a10;
                list2 = (List) obj;
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$14 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(((e) noteListRemoteViewsFactory4.n.getValue()).l0(noteListRemoteViewsFactory4.f10027o));
                this.f10050m = list;
                this.n = arrayList;
                this.f10051o = list2;
                this.f10052p = noteListRemoteViewsFactory4;
                this.f10053q = 5;
                obj = FlowKt__ReduceKt.a(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$14, this);
                if (obj != coroutineSingletons) {
                    return coroutineSingletons;
                }
                noteListRemoteViewsFactory3 = noteListRemoteViewsFactory4;
                arrayList2 = arrayList;
                final List list5 = list2;
                final ArrayList arrayList4 = arrayList2;
                noteListRemoteViewsFactory3.f10032t = (FilteringType) obj;
                final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$15 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(((d) noteListRemoteViewsFactory4.f10024k.getValue()).d(noteListRemoteViewsFactory4.f10028p));
                final NoteListRemoteViewsFactory noteListRemoteViewsFactory5 = this.f10054r;
                kotlinx.coroutines.flow.b<List<? extends h0>> bVar = new kotlinx.coroutines.flow.b<List<? extends h0>>() { // from class: com.noto.app.widget.NoteListRemoteViewsFactory$onDataSetChanged$1$invokeSuspend$$inlined$map$1

                    /* renamed from: com.noto.app.widget.NoteListRemoteViewsFactory$onDataSetChanged$1$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                    /* loaded from: classes.dex */
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                        /* renamed from: i  reason: collision with root package name */
                        public final /* synthetic */ kotlinx.coroutines.flow.c f10038i;

                        /* renamed from: j  reason: collision with root package name */
                        public final /* synthetic */ List f10039j;

                        /* renamed from: k  reason: collision with root package name */
                        public final /* synthetic */ List f10040k;

                        /* renamed from: l  reason: collision with root package name */
                        public final /* synthetic */ List f10041l;

                        /* renamed from: m  reason: collision with root package name */
                        public final /* synthetic */ NoteListRemoteViewsFactory f10042m;

                        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                        @c(c = "com.noto.app.widget.NoteListRemoteViewsFactory$onDataSetChanged$1$invokeSuspend$$inlined$map$1$2", f = "NoteListRemoteViewsFactory.kt", l = {223}, m = "emit")
                        /* renamed from: com.noto.app.widget.NoteListRemoteViewsFactory$onDataSetChanged$1$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
                        /* loaded from: classes.dex */
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* renamed from: l  reason: collision with root package name */
                            public /* synthetic */ Object f10043l;

                            /* renamed from: m  reason: collision with root package name */
                            public int f10044m;

                            public AnonymousClass1(p7.c cVar) {
                                super(cVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object k(Object obj) {
                                this.f10043l = obj;
                                this.f10044m |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.c(null, this);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.c cVar, List list, List list2, List list3, NoteListRemoteViewsFactory noteListRemoteViewsFactory) {
                            this.f10038i = cVar;
                            this.f10039j = list;
                            this.f10040k = list2;
                            this.f10041l = list3;
                            this.f10042m = noteListRemoteViewsFactory;
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
                            ArrayList x3;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i11 = anonymousClass1.f10044m;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.f10044m = i11 - Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.f10043l;
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i10 = anonymousClass1.f10044m;
                                    if (i10 == 0) {
                                        if (i10 == 1) {
                                            b.n1(obj2);
                                        } else {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } else {
                                        b.n1(obj2);
                                        x3 = ModelUtilsKt.x((List) obj, this.f10039j, this.f10040k, new long[0]);
                                        NoteListRemoteViewsFactory noteListRemoteViewsFactory = this.f10042m;
                                        FilteringType filteringType = noteListRemoteViewsFactory.f10032t;
                                        if (filteringType != null) {
                                            ArrayList i12 = ModelUtilsKt.i(x3, this.f10041l, filteringType);
                                            t6.a aVar = noteListRemoteViewsFactory.f10029q;
                                            if (aVar != null) {
                                                List G2 = kotlin.collections.c.G2(ModelUtilsKt.B(i12, aVar.f17603m, aVar.n), new NoteListRemoteViewsFactory$onDataSetChanged$1.a());
                                                anonymousClass1.f10044m = 1;
                                                if (this.f10038i.c(G2, anonymousClass1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                            } else {
                                                g.l("folder");
                                                throw null;
                                            }
                                        } else {
                                            g.l("filteringType");
                                            throw null;
                                        }
                                    }
                                    return n.f16010a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(cVar);
                            Object obj22 = anonymousClass1.f10043l;
                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f10044m;
                            if (i10 == 0) {
                            }
                            return n.f16010a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.b
                    public final Object a(kotlinx.coroutines.flow.c<? super List<? extends h0>> cVar2, p7.c cVar3) {
                        Object a11 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$15.a(new AnonymousClass2(cVar2, list, list5, arrayList4, noteListRemoteViewsFactory5), cVar3);
                        return a11 == CoroutineSingletons.COROUTINE_SUSPENDED ? a11 : n.f16010a;
                    }
                };
                this.f10050m = noteListRemoteViewsFactory4;
                this.n = null;
                this.f10051o = null;
                this.f10052p = null;
                this.f10053q = 6;
                obj = FlowKt__ReduceKt.a(bVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                noteListRemoteViewsFactory4.f10031s = (List) obj;
                return n.f16010a;
            case 1:
                noteListRemoteViewsFactory = (NoteListRemoteViewsFactory) this.f10050m;
                b.n1(obj);
                noteListRemoteViewsFactory.f10029q = (t6.a) obj;
                kotlinx.coroutines.flow.b f102 = ((e) noteListRemoteViewsFactory4.n.getValue()).f(noteListRemoteViewsFactory4.f10028p, noteListRemoteViewsFactory4.f10027o);
                this.f10050m = noteListRemoteViewsFactory4;
                this.f10053q = 2;
                obj = FlowKt__ReduceKt.a(f102, this);
                if (obj != coroutineSingletons) {
                }
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                noteListRemoteViewsFactory2 = (NoteListRemoteViewsFactory) this.f10050m;
                b.n1(obj);
                noteListRemoteViewsFactory2.f10030r = (List) obj;
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$122 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(((u6.b) noteListRemoteViewsFactory4.f10025l.getValue()).e(noteListRemoteViewsFactory4.f10028p));
                this.f10050m = null;
                this.f10053q = 3;
                obj = FlowKt__ReduceKt.a(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$122, this);
                if (obj == coroutineSingletons) {
                }
                List list32 = (List) obj;
                ArrayList arrayList32 = new ArrayList();
                while (r4.hasNext()) {
                }
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$132 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(((u6.c) noteListRemoteViewsFactory4.f10026m.getValue()).b());
                this.f10050m = list32;
                this.n = arrayList32;
                this.f10053q = 4;
                a10 = FlowKt__ReduceKt.a(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$132, this);
                if (a10 == coroutineSingletons) {
                }
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                b.n1(obj);
                List list322 = (List) obj;
                ArrayList arrayList322 = new ArrayList();
                while (r4.hasNext()) {
                }
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1322 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(((u6.c) noteListRemoteViewsFactory4.f10026m.getValue()).b());
                this.f10050m = list322;
                this.n = arrayList322;
                this.f10053q = 4;
                a10 = FlowKt__ReduceKt.a(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1322, this);
                if (a10 == coroutineSingletons) {
                }
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                ?? r1 = this.n;
                b.n1(obj);
                arrayList = r1;
                list = (List) this.f10050m;
                list2 = (List) obj;
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$142 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(((e) noteListRemoteViewsFactory4.n.getValue()).l0(noteListRemoteViewsFactory4.f10027o));
                this.f10050m = list;
                this.n = arrayList;
                this.f10051o = list2;
                this.f10052p = noteListRemoteViewsFactory4;
                this.f10053q = 5;
                obj = FlowKt__ReduceKt.a(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$142, this);
                if (obj != coroutineSingletons) {
                }
                break;
            case 5:
                noteListRemoteViewsFactory3 = this.f10052p;
                list2 = this.f10051o;
                ?? r52 = this.n;
                list = (List) this.f10050m;
                b.n1(obj);
                arrayList2 = r52;
                final List list52 = list2;
                final List arrayList42 = arrayList2;
                noteListRemoteViewsFactory3.f10032t = (FilteringType) obj;
                final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$152 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(((d) noteListRemoteViewsFactory4.f10024k.getValue()).d(noteListRemoteViewsFactory4.f10028p));
                final NoteListRemoteViewsFactory noteListRemoteViewsFactory52 = this.f10054r;
                kotlinx.coroutines.flow.b<List<? extends h0>> bVar2 = new kotlinx.coroutines.flow.b<List<? extends h0>>() { // from class: com.noto.app.widget.NoteListRemoteViewsFactory$onDataSetChanged$1$invokeSuspend$$inlined$map$1

                    /* renamed from: com.noto.app.widget.NoteListRemoteViewsFactory$onDataSetChanged$1$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                    /* loaded from: classes.dex */
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                        /* renamed from: i  reason: collision with root package name */
                        public final /* synthetic */ kotlinx.coroutines.flow.c f10038i;

                        /* renamed from: j  reason: collision with root package name */
                        public final /* synthetic */ List f10039j;

                        /* renamed from: k  reason: collision with root package name */
                        public final /* synthetic */ List f10040k;

                        /* renamed from: l  reason: collision with root package name */
                        public final /* synthetic */ List f10041l;

                        /* renamed from: m  reason: collision with root package name */
                        public final /* synthetic */ NoteListRemoteViewsFactory f10042m;

                        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                        @c(c = "com.noto.app.widget.NoteListRemoteViewsFactory$onDataSetChanged$1$invokeSuspend$$inlined$map$1$2", f = "NoteListRemoteViewsFactory.kt", l = {223}, m = "emit")
                        /* renamed from: com.noto.app.widget.NoteListRemoteViewsFactory$onDataSetChanged$1$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
                        /* loaded from: classes.dex */
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* renamed from: l  reason: collision with root package name */
                            public /* synthetic */ Object f10043l;

                            /* renamed from: m  reason: collision with root package name */
                            public int f10044m;

                            public AnonymousClass1(p7.c cVar) {
                                super(cVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object k(Object obj) {
                                this.f10043l = obj;
                                this.f10044m |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.c(null, this);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.c cVar, List list, List list2, List list3, NoteListRemoteViewsFactory noteListRemoteViewsFactory) {
                            this.f10038i = cVar;
                            this.f10039j = list;
                            this.f10040k = list2;
                            this.f10041l = list3;
                            this.f10042m = noteListRemoteViewsFactory;
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
                            ArrayList x3;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i11 = anonymousClass1.f10044m;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.f10044m = i11 - Integer.MIN_VALUE;
                                    Object obj22 = anonymousClass1.f10043l;
                                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i10 = anonymousClass1.f10044m;
                                    if (i10 == 0) {
                                        if (i10 == 1) {
                                            b.n1(obj22);
                                        } else {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } else {
                                        b.n1(obj22);
                                        x3 = ModelUtilsKt.x((List) obj, this.f10039j, this.f10040k, new long[0]);
                                        NoteListRemoteViewsFactory noteListRemoteViewsFactory = this.f10042m;
                                        FilteringType filteringType = noteListRemoteViewsFactory.f10032t;
                                        if (filteringType != null) {
                                            ArrayList i12 = ModelUtilsKt.i(x3, this.f10041l, filteringType);
                                            t6.a aVar = noteListRemoteViewsFactory.f10029q;
                                            if (aVar != null) {
                                                List G2 = kotlin.collections.c.G2(ModelUtilsKt.B(i12, aVar.f17603m, aVar.n), new NoteListRemoteViewsFactory$onDataSetChanged$1.a());
                                                anonymousClass1.f10044m = 1;
                                                if (this.f10038i.c(G2, anonymousClass1) == coroutineSingletons2) {
                                                    return coroutineSingletons2;
                                                }
                                            } else {
                                                g.l("folder");
                                                throw null;
                                            }
                                        } else {
                                            g.l("filteringType");
                                            throw null;
                                        }
                                    }
                                    return n.f16010a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(cVar);
                            Object obj222 = anonymousClass1.f10043l;
                            CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f10044m;
                            if (i10 == 0) {
                            }
                            return n.f16010a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.b
                    public final Object a(kotlinx.coroutines.flow.c<? super List<? extends h0>> cVar2, p7.c cVar3) {
                        Object a11 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$152.a(new AnonymousClass2(cVar2, list, list52, arrayList42, noteListRemoteViewsFactory52), cVar3);
                        return a11 == CoroutineSingletons.COROUTINE_SUSPENDED ? a11 : n.f16010a;
                    }
                };
                this.f10050m = noteListRemoteViewsFactory4;
                this.n = null;
                this.f10051o = null;
                this.f10052p = null;
                this.f10053q = 6;
                obj = FlowKt__ReduceKt.a(bVar2, this);
                if (obj == coroutineSingletons) {
                }
                noteListRemoteViewsFactory4.f10031s = (List) obj;
                return n.f16010a;
            case 6:
                noteListRemoteViewsFactory4 = (NoteListRemoteViewsFactory) this.f10050m;
                b.n1(obj);
                noteListRemoteViewsFactory4.f10031s = (List) obj;
                return n.f16010a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
