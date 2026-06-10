package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.i0;
import com.noto.app.domain.model.FilteringType;
import com.noto.app.domain.model.Font;
import com.noto.app.domain.model.Grouping;
import com.noto.app.domain.model.NoteListSortingType;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.folder.FolderViewModel;
import com.noto.app.util.ModelUtilsKt;
import ja.k1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.s;
import kotlinx.coroutines.flow.t;
import kotlinx.coroutines.flow.u;
import n6.c;
import n7.x;
import u7.s;
import x6.h0;

/* loaded from: classes.dex */
public final class FolderViewModel extends i0 {
    public boolean A;

    /* renamed from: d  reason: collision with root package name */
    public final u6.a f8425d;

    /* renamed from: e  reason: collision with root package name */
    public final u6.d f8426e;

    /* renamed from: f  reason: collision with root package name */
    public final u6.b f8427f;

    /* renamed from: g  reason: collision with root package name */
    public final u6.c f8428g;

    /* renamed from: h  reason: collision with root package name */
    public final u6.e f8429h;

    /* renamed from: i  reason: collision with root package name */
    public final long f8430i;

    /* renamed from: j  reason: collision with root package name */
    public final long[] f8431j;

    /* renamed from: k  reason: collision with root package name */
    public final StateFlowImpl f8432k;

    /* renamed from: l  reason: collision with root package name */
    public final StateFlowImpl f8433l;

    /* renamed from: m  reason: collision with root package name */
    public final StateFlowImpl f8434m;
    public final StateFlowImpl n;

    /* renamed from: o  reason: collision with root package name */
    public final StateFlowImpl f8435o;

    /* renamed from: p  reason: collision with root package name */
    public final kotlinx.coroutines.flow.m f8436p;

    /* renamed from: q  reason: collision with root package name */
    public final StateFlowImpl f8437q;

    /* renamed from: r  reason: collision with root package name */
    public final StateFlowImpl f8438r;

    /* renamed from: s  reason: collision with root package name */
    public final StateFlowImpl f8439s;

    /* renamed from: t  reason: collision with root package name */
    public final kotlinx.coroutines.flow.m f8440t;

    /* renamed from: u  reason: collision with root package name */
    public final StateFlowImpl f8441u;

    /* renamed from: v  reason: collision with root package name */
    public final kotlinx.coroutines.flow.m f8442v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f8443w;

    /* renamed from: x  reason: collision with root package name */
    public final kotlinx.coroutines.flow.m f8444x;

    /* renamed from: y  reason: collision with root package name */
    public final StateFlowImpl f8445y;

    /* renamed from: z  reason: collision with root package name */
    public int f8446z;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/c;", "Lt6/a;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @q7.c(c = "com.noto.app.folder.FolderViewModel$1", f = "FolderViewModel.kt", l = {96}, m = "invokeSuspend")
    /* renamed from: com.noto.app.folder.FolderViewModel$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements u7.p<kotlinx.coroutines.flow.c<? super t6.a>, p7.c<? super m7.n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f8453m;
        public /* synthetic */ Object n;

        public AnonymousClass1(p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // u7.p
        public final Object R(kotlinx.coroutines.flow.c<? super t6.a> cVar, p7.c<? super m7.n> cVar2) {
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
            int i10 = this.f8453m;
            if (i10 == 0) {
                m0.b.n1(obj);
                t6.a aVar = new t6.a(0L, null, 2097143);
                this.f8453m = 1;
                if (((kotlinx.coroutines.flow.c) this.n).c(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m0.b.n1(obj);
            }
            return m7.n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u008a@"}, d2 = {"Lt6/a;", "folder", "", "folders", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @q7.c(c = "com.noto.app.folder.FolderViewModel$2", f = "FolderViewModel.kt", l = {102}, m = "invokeSuspend")
    /* renamed from: com.noto.app.folder.FolderViewModel$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements u7.q<t6.a, List<? extends t6.a>, p7.c<? super m7.n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f8454m;
        public /* synthetic */ Object n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ List f8455o;

        public AnonymousClass2(p7.c<? super AnonymousClass2> cVar) {
            super(3, cVar);
        }

        @Override // u7.q
        public final Object O(t6.a aVar, List<? extends t6.a> list, p7.c<? super m7.n> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
            anonymousClass2.n = aVar;
            anonymousClass2.f8455o = list;
            return anonymousClass2.k(m7.n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            kotlinx.coroutines.flow.k kVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f8454m;
            if (i10 != 0) {
                if (i10 == 1) {
                    kVar = (kotlinx.coroutines.flow.k) this.n;
                    m0.b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                m0.b.n1(obj);
                t6.a aVar = (t6.a) this.n;
                List list = this.f8455o;
                FolderViewModel folderViewModel = FolderViewModel.this;
                StateFlowImpl stateFlowImpl = folderViewModel.f8437q;
                stateFlowImpl.setValue(FolderViewModel.p((List) a1.b.m(stateFlowImpl).getValue(), aVar.f17595e));
                folderViewModel.f8432k.setValue(FolderViewModel.o(aVar, list));
                Long l2 = aVar.f17593b;
                if (l2 != null) {
                    kotlinx.coroutines.flow.b<t6.a> d5 = folderViewModel.f8425d.d(l2.longValue());
                    StateFlowImpl stateFlowImpl2 = folderViewModel.f8433l;
                    this.n = stateFlowImpl2;
                    this.f8454m = 1;
                    obj = FlowKt__ReduceKt.c(d5, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    kVar = stateFlowImpl2;
                }
                return m7.n.f16010a;
            }
            kVar.setValue(obj);
            return m7.n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\t\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0000H\u008a@"}, d2 = {"", "Lt6/d;", "notes", "archivedNotes", "Lt6/c;", "labels", "Lt6/e;", "noteLabels", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @q7.c(c = "com.noto.app.folder.FolderViewModel$3", f = "FolderViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.folder.FolderViewModel$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements s<List<? extends t6.d>, List<? extends t6.d>, List<? extends t6.c>, List<? extends t6.e>, p7.c<? super m7.n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ List f8457m;
        public /* synthetic */ List n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ List f8458o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ List f8459p;

        /* renamed from: com.noto.app.folder.FolderViewModel$3$a */
        /* loaded from: classes.dex */
        public static final class a<T> implements Comparator {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ FolderViewModel f8461a;

            public a(FolderViewModel folderViewModel) {
                this.f8461a = folderViewModel;
            }

            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                FolderViewModel folderViewModel = this.f8461a;
                return a1.c.g0(Integer.valueOf(kotlin.collections.b.o2(((h0) t10).f18683a.f17621a, folderViewModel.f8431j)), Integer.valueOf(kotlin.collections.b.o2(((h0) t11).f18683a.f17621a, folderViewModel.f8431j)));
            }
        }

        public AnonymousClass3(p7.c<? super AnonymousClass3> cVar) {
            super(5, cVar);
        }

        @Override // u7.s
        public final Object V(List<? extends t6.d> list, List<? extends t6.d> list2, List<? extends t6.c> list3, List<? extends t6.e> list4, p7.c<? super m7.n> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(cVar);
            anonymousClass3.f8457m = list;
            anonymousClass3.n = list2;
            anonymousClass3.f8458o = list3;
            anonymousClass3.f8459p = list4;
            return anonymousClass3.k(m7.n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            ArrayList x3;
            m0.b.n1(obj);
            List list = this.f8457m;
            List list2 = this.n;
            List list3 = this.f8458o;
            List list4 = this.f8459p;
            FolderViewModel folderViewModel = FolderViewModel.this;
            folderViewModel.f8434m.setValue(new c.b(kotlin.collections.c.G2(ModelUtilsKt.x(list, list3, list4, folderViewModel.f8431j), new a(folderViewModel))));
            x3 = ModelUtilsKt.x(list2, list3, list4, new long[0]);
            folderViewModel.n.setValue(new c.b(x3));
            return m7.n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Ly6/h;", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @q7.c(c = "com.noto.app.folder.FolderViewModel$5", f = "FolderViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.folder.FolderViewModel$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends SuspendLambda implements u7.p<List<? extends y6.h>, p7.c<? super m7.n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f8462m;

        public AnonymousClass5(p7.c<? super AnonymousClass5> cVar) {
            super(2, cVar);
        }

        @Override // u7.p
        public final Object R(List<? extends y6.h> list, p7.c<? super m7.n> cVar) {
            return ((AnonymousClass5) a(list, cVar)).k(m7.n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(cVar);
            anonymousClass5.f8462m = obj;
            return anonymousClass5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            m0.b.n1(obj);
            FolderViewModel.this.f8435o.setValue((List) this.f8462m);
            return m7.n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Ln6/c;", "", "Lx6/h0;", "notesState", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @q7.c(c = "com.noto.app.folder.FolderViewModel$6", f = "FolderViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.folder.FolderViewModel$6  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends SuspendLambda implements u7.p<n6.c<? extends List<? extends h0>>, p7.c<? super m7.n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f8463m;

        public AnonymousClass6(p7.c<? super AnonymousClass6> cVar) {
            super(2, cVar);
        }

        @Override // u7.p
        public final Object R(n6.c<? extends List<? extends h0>> cVar, p7.c<? super m7.n> cVar2) {
            return ((AnonymousClass6) a(cVar, cVar2)).k(m7.n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(cVar);
            anonymousClass6.f8463m = obj;
            return anonymousClass6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            boolean z10;
            m0.b.n1(obj);
            Iterable<h0> iterable = (Iterable) n6.d.a((n6.c) this.f8463m, EmptyList.f12981i);
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (h0 h0Var : iterable) {
                    if (h0Var.c) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (z10) {
                FolderViewModel.this.i();
            }
            return m7.n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Ln6/c;", "", "Lx6/h0;", "state", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @q7.c(c = "com.noto.app.folder.FolderViewModel$7", f = "FolderViewModel.kt", l = {145, 148}, m = "invokeSuspend")
    /* renamed from: com.noto.app.folder.FolderViewModel$7  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends SuspendLambda implements u7.p<n6.c<? extends List<? extends h0>>, p7.c<? super m7.n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f8464m;
        public /* synthetic */ Object n;

        public AnonymousClass7(p7.c<? super AnonymousClass7> cVar) {
            super(2, cVar);
        }

        @Override // u7.p
        public final Object R(n6.c<? extends List<? extends h0>> cVar, p7.c<? super m7.n> cVar2) {
            return ((AnonymousClass7) a(cVar, cVar2)).k(m7.n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(cVar);
            anonymousClass7.n = obj;
            return anonymousClass7;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
        /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007d -> B:28:0x0080). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object k(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r8.f8464m
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L27
                if (r1 == r4) goto L1e
                if (r1 != r3) goto L16
                java.lang.Object r1 = r8.n
                java.util.List r1 = (java.util.List) r1
                m0.b.n1(r9)
                r9 = r8
                goto L80
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                java.lang.Object r1 = r8.n
                java.util.List r1 = (java.util.List) r1
                m0.b.n1(r9)
                r9 = r8
                goto L6f
            L27:
                m0.b.n1(r9)
                java.lang.Object r9 = r8.n
                n6.c r9 = (n6.c) r9
                kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.f12981i
                java.lang.Object r9 = n6.d.a(r9, r1)
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r9 = r9.iterator()
            L3f:
                boolean r5 = r9.hasNext()
                if (r5 == 0) goto L54
                java.lang.Object r5 = r9.next()
                r6 = r5
                x6.h0 r6 = (x6.h0) r6
                boolean r6 = r6.c
                if (r6 == 0) goto L3f
                r1.add(r5)
                goto L3f
            L54:
                boolean r9 = r1.isEmpty()
                r9 = r9 ^ r4
                if (r9 == 0) goto L9a
                r9 = r8
            L5c:
                com.noto.app.folder.FolderViewModel r5 = com.noto.app.folder.FolderViewModel.this
                boolean r5 = r5.A
                if (r5 == 0) goto L73
                r9.n = r1
                r9.f8464m = r4
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r5 = m0.b.S(r5, r9)
                if (r5 != r0) goto L6f
                return r0
            L6f:
                com.noto.app.folder.FolderViewModel r5 = com.noto.app.folder.FolderViewModel.this
                r5.A = r2
            L73:
                r9.n = r1
                r9.f8464m = r3
                r5 = 2000(0x7d0, double:9.88E-321)
                java.lang.Object r5 = m0.b.S(r5, r9)
                if (r5 != r0) goto L80
                return r0
            L80:
                com.noto.app.folder.FolderViewModel r5 = com.noto.app.folder.FolderViewModel.this
                int r6 = r5.f8446z
                int r7 = a1.c.B0(r1)
                if (r6 != r7) goto L8c
                r6 = 0
                goto L8f
            L8c:
                int r6 = r5.f8446z
                int r6 = r6 + r4
            L8f:
                java.lang.Integer r7 = new java.lang.Integer
                r7.<init>(r6)
                kotlinx.coroutines.flow.StateFlowImpl r5 = r5.f8445y
                r5.setValue(r7)
                goto L5c
            L9a:
                m7.n r9 = m7.n.f16010a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.noto.app.folder.FolderViewModel.AnonymousClass7.k(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return a1.c.g0(Integer.valueOf(((t6.c) t10).f17618e), Integer.valueOf(((t6.c) t11).f17618e));
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return a1.c.g0(Integer.valueOf(((h0) t10).f18685d), Integer.valueOf(((h0) t11).f18685d));
        }
    }

    public FolderViewModel(u6.a aVar, u6.d dVar, u6.b bVar, u6.c cVar, u6.e eVar, long j2, long[] jArr) {
        v7.g.f(aVar, "folderRepository");
        v7.g.f(dVar, "noteRepository");
        v7.g.f(bVar, "labelRepository");
        v7.g.f(cVar, "noteLabelRepository");
        v7.g.f(eVar, "settingsRepository");
        this.f8425d = aVar;
        this.f8426e = dVar;
        this.f8427f = bVar;
        this.f8428g = cVar;
        this.f8429h = eVar;
        this.f8430i = j2;
        this.f8431j = jArr;
        this.f8432k = kotlinx.coroutines.flow.f.a(new t6.a(0L, null, 2097143));
        this.f8433l = kotlinx.coroutines.flow.f.a(null);
        c.a aVar2 = c.a.f16110a;
        this.f8434m = kotlinx.coroutines.flow.f.a(aVar2);
        this.n = kotlinx.coroutines.flow.f.a(aVar2);
        this.f8435o = kotlinx.coroutines.flow.f.a(EmptyList.f12981i);
        this.f8436p = a1.b.C0(eVar.h(), a1.b.d0(this), s.a.f15450b, Font.Nunito);
        NotoColor[] values = NotoColor.values();
        int O0 = m0.b.O0(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(O0 < 16 ? 16 : O0);
        for (NotoColor notoColor : values) {
            linkedHashMap.put(notoColor, Boolean.FALSE);
        }
        this.f8437q = kotlinx.coroutines.flow.f.a(x.Q1(linkedHashMap));
        Boolean bool = Boolean.FALSE;
        this.f8438r = kotlinx.coroutines.flow.f.a(bool);
        this.f8439s = kotlinx.coroutines.flow.f.a("");
        kotlinx.coroutines.flow.b<Boolean> P = this.f8429h.P();
        ja.x d02 = a1.b.d0(this);
        t tVar = s.a.f15449a;
        this.f8440t = a1.b.C0(P, d02, tVar, Boolean.TRUE);
        this.f8441u = kotlinx.coroutines.flow.f.a(bool);
        this.f8442v = a1.b.C0(this.f8429h.x(), a1.b.d0(this), tVar, bool);
        this.f8443w = true;
        this.f8444x = a1.b.C0(new kotlinx.coroutines.flow.i(m(), l(), new FolderViewModel$selectionLabels$1(this, null)), a1.b.d0(this), tVar, EmptyList.f12981i);
        StateFlowImpl a10 = kotlinx.coroutines.flow.f.a(0);
        this.f8445y = a10;
        this.f8446z = ((Number) a10.getValue()).intValue();
        kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new AnonymousClass1(null), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.f8425d.d(this.f8430i))), this.f8425d.c(), new AnonymousClass2(null)), a1.b.d0(this));
        kotlinx.coroutines.flow.f.b(a1.b.A(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.f8426e.d(this.f8430i)), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.f8426e.a(this.f8430i)), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.f8427f.e(this.f8430i)), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.f8428g.b()), new AnonymousClass3(null)), a1.b.d0(this));
        final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.f8427f.e(this.f8430i));
        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass5(null), new kotlinx.coroutines.flow.b<List<? extends y6.h>>() { // from class: com.noto.app.folder.FolderViewModel$special$$inlined$map$1

            /* renamed from: com.noto.app.folder.FolderViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.c f8449i;

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ FolderViewModel f8450j;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.folder.FolderViewModel$special$$inlined$map$1$2", f = "FolderViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.folder.FolderViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f8451l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f8452m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f8451l = obj;
                        this.f8452m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.c cVar, FolderViewModel folderViewModel) {
                    this.f8449i = cVar;
                    this.f8450j = folderViewModel;
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
                    boolean z10;
                    T t10;
                    boolean z11;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f8452m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f8452m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f8451l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f8452m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                List<t6.c> G2 = kotlin.collections.c.G2((List) obj, new FolderViewModel.a());
                                ArrayList arrayList = new ArrayList(n7.l.Z1(G2, 10));
                                for (t6.c cVar2 : G2) {
                                    Iterator<T> it = ((Iterable) ((kotlinx.coroutines.flow.m) this.f8450j.l()).getValue()).iterator();
                                    while (true) {
                                        z10 = false;
                                        if (it.hasNext()) {
                                            t10 = it.next();
                                            if (((y6.h) t10).f18912a.f17615a == cVar2.f17615a) {
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
                                            t10 = null;
                                            break;
                                        }
                                    }
                                    y6.h hVar = (y6.h) t10;
                                    if (hVar != null) {
                                        z10 = hVar.f18913b;
                                    }
                                    arrayList.add(new y6.h(cVar2, z10));
                                }
                                anonymousClass1.f8452m = 1;
                                if (this.f8449i.c(arrayList, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return m7.n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f8451l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f8452m;
                    if (i10 == 0) {
                    }
                    return m7.n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(kotlinx.coroutines.flow.c<? super List<? extends y6.h>> cVar2, p7.c cVar3) {
                Object a11 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.a(new AnonymousClass2(cVar2, this), cVar3);
                return a11 == CoroutineSingletons.COROUTINE_SUSPENDED ? a11 : m7.n.f16010a;
            }
        }), a1.b.d0(this));
        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass6(null), m()), a1.b.d0(this));
        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass7(null), m()), a1.b.d0(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        r0.add(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t6.a o(t6.a aVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z10 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Long l2 = ((t6.a) next).f17593b;
            long j2 = aVar.f17592a;
            if (l2 != null && l2.longValue() == j2) {
                z10 = true;
            }
        }
        ArrayList arrayList2 = new ArrayList(n7.l.Z1(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Pair(o((t6.a) it2.next(), list), 0));
        }
        return t6.a.a(aVar, null, null, 0, null, null, 0, false, false, false, null, null, null, null, null, false, 0, null, null, arrayList2, 1048575);
    }

    public static ArrayList p(List list, NotoColor notoColor) {
        boolean z10;
        ArrayList arrayList = new ArrayList(n7.l.Z1(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A a10 = ((Pair) it.next()).f12962i;
            if (a10 == notoColor) {
                z10 = true;
            } else {
                z10 = false;
            }
            arrayList.add(new Pair(a10, Boolean.valueOf(z10)));
        }
        return arrayList;
    }

    public final k1 d() {
        return m0.b.M0(a1.b.d0(this), null, null, new FolderViewModel$archiveSelectedNotes$1(this, null), 3);
    }

    public final void e() {
        Iterable<y6.h> iterable = (Iterable) ((kotlinx.coroutines.flow.m) l()).getValue();
        ArrayList arrayList = new ArrayList(n7.l.Z1(iterable, 10));
        for (y6.h hVar : iterable) {
            arrayList.add(y6.h.a(hVar, false));
        }
        this.f8435o.setValue(arrayList);
    }

    public final k1 f(long j2) {
        return m0.b.M0(a1.b.d0(this), null, null, new FolderViewModel$copySelectedNotes$1(this, j2, null), 3);
    }

    public final k1 g() {
        return m0.b.M0(a1.b.d0(this), null, null, new FolderViewModel$deleteSelectedNotes$1(this, null), 3);
    }

    public final void h(long j2) {
        m0.b.M0(a1.b.d0(this), null, null, new FolderViewModel$deselectLabelForSelectedNotes$1(this, j2, null), 3);
    }

    public final void i() {
        Object bVar;
        this.f8441u.setValue(Boolean.FALSE);
        n6.c cVar = (n6.c) ((kotlinx.coroutines.flow.m) m()).getValue();
        if (cVar instanceof c.a) {
            bVar = c.a.f16110a;
        } else if (cVar instanceof c.b) {
            List<h0> list = (List) ((c.b) cVar).f16111a;
            ArrayList arrayList = new ArrayList(n7.l.Z1(list, 10));
            for (h0 h0Var : list) {
                arrayList.add(h0.a(h0Var, null, false, -1, 3));
            }
            bVar = new c.b(arrayList);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f8434m.setValue(bVar);
    }

    public final k1 j() {
        return m0.b.M0(a1.b.d0(this), null, null, new FolderViewModel$duplicateSelectedNotes$1(this, null), 3);
    }

    public final u<t6.a> k() {
        return a1.b.m(this.f8432k);
    }

    public final u<List<y6.h>> l() {
        return a1.b.m(this.f8435o);
    }

    public final u<n6.c<List<h0>>> m() {
        return a1.b.m(this.f8434m);
    }

    public final List<h0> n() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) n6.d.a((n6.c) ((kotlinx.coroutines.flow.m) m()).getValue(), EmptyList.f12981i)) {
            if (((h0) obj).c) {
                arrayList.add(obj);
            }
        }
        return kotlin.collections.c.G2(arrayList, new b());
    }

    public final k1 q() {
        return m0.b.M0(a1.b.d0(this), null, null, new FolderViewModel$mergeSelectedNotes$1(this, null), 3);
    }

    public final k1 r(long j2) {
        return m0.b.M0(a1.b.d0(this), null, null, new FolderViewModel$moveSelectedNotes$1(this, j2, null), 3);
    }

    public final k1 s() {
        return m0.b.M0(a1.b.d0(this), null, null, new FolderViewModel$pinSelectedNotes$1(this, null), 3);
    }

    public final void t(long j2) {
        m0.b.M0(a1.b.d0(this), null, null, new FolderViewModel$selectLabelForSelectedNotes$1(this, j2, null), 3);
    }

    public final void u(long j2) {
        Object bVar;
        n6.c cVar = (n6.c) ((kotlinx.coroutines.flow.m) m()).getValue();
        if (cVar instanceof c.a) {
            bVar = c.a.f16110a;
        } else if (cVar instanceof c.b) {
            List<h0> list = (List) ((c.b) cVar).f16111a;
            Iterator it = list.iterator();
            if (it.hasNext()) {
                int i10 = ((h0) it.next()).f18685d;
                while (it.hasNext()) {
                    int i11 = ((h0) it.next()).f18685d;
                    if (i10 < i11) {
                        i10 = i11;
                    }
                }
                int i12 = i10 + 1;
                ArrayList arrayList = new ArrayList(n7.l.Z1(list, 10));
                for (h0 h0Var : list) {
                    if (h0Var.f18683a.f17621a == j2) {
                        h0Var = h0.a(h0Var, null, true, i12, 3);
                    }
                    arrayList.add(h0Var);
                }
                bVar = new c.b(arrayList);
            } else {
                throw new NoSuchElementException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f8434m.setValue(bVar);
    }

    public final k1 v() {
        return m0.b.M0(a1.b.d0(this), null, null, new FolderViewModel$unpinSelectedNotes$1(this, null), 3);
    }

    public final k1 w(FilteringType filteringType) {
        return m0.b.M0(a1.b.d0(this), null, null, new FolderViewModel$updateFiltering$1(this, filteringType, null), 3);
    }

    public final k1 x(Grouping grouping) {
        return m0.b.M0(a1.b.d0(this), null, null, new FolderViewModel$updateGroupingType$1(this, grouping, null), 3);
    }

    public final k1 y(NoteListSortingType noteListSortingType) {
        return m0.b.M0(a1.b.d0(this), null, null, new FolderViewModel$updateSortingType$1(noteListSortingType, this, null), 3);
    }
}
