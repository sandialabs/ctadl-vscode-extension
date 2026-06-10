package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import b2.k;
import g0.d;
import g0.g0;
import g0.g1;
import g0.s;
import g1.o;
import g1.v;
import ja.x;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import m7.n;
import q0.d;
import t.a;
import t.e;
import t.f;
import u.j;
import u7.l;
import u7.p;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class DraggableKt$draggable$9 extends Lambda implements q<d, g0.d, Integer, d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, f> f1707j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ j f1708k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ u7.a<Boolean> f1709l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ l<o, Boolean> f1710m;
    public final /* synthetic */ q<x, u0.c, p7.c<? super n>, Object> n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ q<x, Float, p7.c<? super n>, Object> f1711o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Orientation f1712p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ boolean f1713q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ boolean f1714r;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements l<g0.q, g0.p> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ g0<u.b> f1715j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ j f1716k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g0<u.b> g0Var, j jVar) {
            super(1);
            this.f1715j = g0Var;
            this.f1716k = jVar;
        }

        @Override // u7.l
        public final g0.p U(g0.q qVar) {
            g.f(qVar, "$this$DisposableEffect");
            return new t.b(this.f1715j, this.f1716k);
        }
    }

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    @q7.c(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", f = "Draggable.kt", l = {237, 239, 241, 251, 253, 257}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public Ref$ObjectRef f1717m;
        public Ref$ObjectRef n;

        /* renamed from: o  reason: collision with root package name */
        public int f1718o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f1719p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ la.c<t.a> f1720q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ f f1721r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ g1<DragLogic> f1722s;

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
        @q7.c(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", f = "Draggable.kt", l = {246}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00152 extends SuspendLambda implements p<e, p7.c<? super n>, Object> {

            /* renamed from: m  reason: collision with root package name */
            public Ref$ObjectRef f1723m;
            public int n;

            /* renamed from: o  reason: collision with root package name */
            public /* synthetic */ Object f1724o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef<t.a> f1725p;

            /* renamed from: q  reason: collision with root package name */
            public final /* synthetic */ la.c<t.a> f1726q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00152(Ref$ObjectRef<t.a> ref$ObjectRef, la.c<t.a> cVar, p7.c<? super C00152> cVar2) {
                super(2, cVar2);
                this.f1725p = ref$ObjectRef;
                this.f1726q = cVar;
            }

            @Override // u7.p
            public final Object R(e eVar, p7.c<? super n> cVar) {
                return ((C00152) a(eVar, cVar)).k(n.f16010a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final p7.c<n> a(Object obj, p7.c<?> cVar) {
                C00152 c00152 = new C00152(this.f1725p, this.f1726q, cVar);
                c00152.f1724o = obj;
                return c00152;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0054 -> B:23:0x005a). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object k(Object obj) {
                e eVar;
                C00152 c00152;
                t.a aVar;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.n;
                if (i10 == 0) {
                    m0.b.n1(obj);
                    eVar = (e) this.f1724o;
                    c00152 = this;
                    Ref$ObjectRef<t.a> ref$ObjectRef = c00152.f1725p;
                    aVar = ref$ObjectRef.f13060i;
                    if (aVar instanceof a.d) {
                    }
                    return n.f16010a;
                } else if (i10 == 1) {
                    Ref$ObjectRef<t.a> ref$ObjectRef2 = this.f1723m;
                    m0.b.n1(obj);
                    e eVar2 = (e) this.f1724o;
                    Ref$ObjectRef<t.a> ref$ObjectRef3 = ref$ObjectRef2;
                    CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                    C00152 c001522 = this;
                    T t10 = obj;
                    ref$ObjectRef3.f13060i = t10;
                    c00152 = c001522;
                    coroutineSingletons = coroutineSingletons2;
                    eVar = eVar2;
                    Ref$ObjectRef<t.a> ref$ObjectRef4 = c00152.f1725p;
                    aVar = ref$ObjectRef4.f13060i;
                    if (!(aVar instanceof a.d) || (aVar instanceof a.C0223a)) {
                        return n.f16010a;
                    }
                    a.b bVar = aVar instanceof a.b ? (a.b) aVar : null;
                    if (bVar != null) {
                        eVar.a(bVar.f17533a, bVar.f17534b);
                    }
                    c00152.f1724o = eVar;
                    c00152.f1723m = ref$ObjectRef4;
                    c00152.n = 1;
                    Object L = c00152.f1726q.L(c00152);
                    if (L == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                    c001522 = c00152;
                    t10 = L;
                    eVar2 = eVar;
                    ref$ObjectRef3 = ref$ObjectRef4;
                    coroutineSingletons2 = coroutineSingletons3;
                    ref$ObjectRef3.f13060i = t10;
                    c00152 = c001522;
                    coroutineSingletons = coroutineSingletons2;
                    eVar = eVar2;
                    Ref$ObjectRef<t.a> ref$ObjectRef42 = c00152.f1725p;
                    aVar = ref$ObjectRef42.f13060i;
                    if (aVar instanceof a.d) {
                    }
                    return n.f16010a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(la.c<t.a> cVar, f fVar, g1<DragLogic> g1Var, p7.c<? super AnonymousClass2> cVar2) {
            super(2, cVar2);
            this.f1720q = cVar;
            this.f1721r = fVar;
            this.f1722s = g1Var;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass2) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f1720q, this.f1721r, this.f1722s, cVar);
            anonymousClass2.f1719p = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:24|25|26|27|(2:32|(2:34|(1:36)))(2:29|(1:31))|8|(2:45|46)(0)) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00cd A[Catch: CancellationException -> 0x00f2, TryCatch #1 {CancellationException -> 0x00f2, blocks: (B:36:0x00bf, B:38:0x00cd, B:41:0x00dd, B:43:0x00e1), top: B:57:0x00bf }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00dd A[Catch: CancellationException -> 0x00f2, TryCatch #1 {CancellationException -> 0x00f2, blocks: (B:36:0x00bf, B:38:0x00cd, B:41:0x00dd, B:43:0x00e1), top: B:57:0x00bf }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0107 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00da -> B:20:0x005b). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00df -> B:20:0x005b). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ec -> B:20:0x005b). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0105 -> B:20:0x005b). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0108 -> B:20:0x005b). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object k(Object obj) {
            x xVar;
            x xVar2;
            Ref$ObjectRef ref$ObjectRef;
            Ref$ObjectRef ref$ObjectRef2;
            CoroutineSingletons coroutineSingletons;
            AnonymousClass2 anonymousClass2;
            x xVar3;
            Ref$ObjectRef ref$ObjectRef3;
            AnonymousClass2 anonymousClass22;
            x xVar4;
            T t10;
            f fVar;
            C00152 c00152;
            T t11;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            switch (this.f1718o) {
                case 0:
                    m0.b.n1(obj);
                    xVar = (x) this.f1719p;
                    anonymousClass22 = this;
                    xVar4 = xVar;
                    if (!a1.b.g0(xVar4)) {
                        Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                        anonymousClass22.f1719p = xVar4;
                        anonymousClass22.f1717m = ref$ObjectRef4;
                        anonymousClass22.n = ref$ObjectRef4;
                        anonymousClass22.f1718o = 1;
                        Object L = anonymousClass22.f1720q.L(anonymousClass22);
                        if (L == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        xVar2 = xVar4;
                        ref$ObjectRef = ref$ObjectRef4;
                        coroutineSingletons = coroutineSingletons2;
                        anonymousClass2 = anonymousClass22;
                        t11 = L;
                        ref$ObjectRef2 = ref$ObjectRef;
                        ref$ObjectRef2.f13060i = t11;
                        if (!(ref$ObjectRef.f13060i instanceof a.c)) {
                            anonymousClass2.f1719p = xVar2;
                            anonymousClass2.f1717m = ref$ObjectRef;
                            anonymousClass2.n = null;
                            anonymousClass2.f1718o = 2;
                            if (anonymousClass2.f1722s.getValue().b(xVar2, (a.c) ref$ObjectRef.f13060i, anonymousClass2) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            xVar3 = xVar2;
                            try {
                            } catch (CancellationException unused) {
                                anonymousClass22 = anonymousClass2;
                                coroutineSingletons2 = coroutineSingletons;
                                xVar4 = xVar3;
                                anonymousClass22.f1719p = xVar4;
                                anonymousClass22.f1717m = null;
                                anonymousClass22.f1718o = 6;
                                if (anonymousClass22.f1722s.getValue().a(xVar4, anonymousClass22) == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                                if (!a1.b.g0(xVar4)) {
                                }
                            }
                            fVar = anonymousClass2.f1721r;
                            c00152 = new C00152(ref$ObjectRef, anonymousClass2.f1720q, null);
                            anonymousClass2.f1719p = xVar3;
                            anonymousClass2.f1717m = ref$ObjectRef;
                            anonymousClass2.f1718o = 3;
                            if (fVar.b(c00152, anonymousClass2) != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            anonymousClass22 = anonymousClass2;
                            coroutineSingletons2 = coroutineSingletons;
                            ref$ObjectRef3 = ref$ObjectRef;
                            xVar4 = xVar3;
                            DragLogic value = anonymousClass22.f1722s.getValue();
                            t10 = ref$ObjectRef3.f13060i;
                            if (t10 instanceof a.d) {
                                anonymousClass22.f1719p = xVar4;
                                anonymousClass22.f1717m = null;
                                anonymousClass22.f1718o = 4;
                                if (value.c(xVar4, (a.d) t10, anonymousClass22) == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                            } else if (t10 instanceof a.C0223a) {
                                anonymousClass22.f1719p = xVar4;
                                anonymousClass22.f1717m = null;
                                anonymousClass22.f1718o = 5;
                                if (value.a(xVar4, anonymousClass22) == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                            }
                            if (!a1.b.g0(xVar4)) {
                                return n.f16010a;
                            }
                        } else {
                            anonymousClass22 = anonymousClass2;
                            coroutineSingletons2 = coroutineSingletons;
                            xVar4 = xVar2;
                            if (!a1.b.g0(xVar4)) {
                            }
                        }
                    }
                case 1:
                    Ref$ObjectRef ref$ObjectRef5 = this.n;
                    Ref$ObjectRef ref$ObjectRef6 = this.f1717m;
                    m0.b.n1(obj);
                    xVar2 = (x) this.f1719p;
                    ref$ObjectRef = ref$ObjectRef6;
                    ref$ObjectRef2 = ref$ObjectRef5;
                    coroutineSingletons = coroutineSingletons2;
                    anonymousClass2 = this;
                    t11 = obj;
                    ref$ObjectRef2.f13060i = t11;
                    if (!(ref$ObjectRef.f13060i instanceof a.c)) {
                    }
                    break;
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    Ref$ObjectRef ref$ObjectRef7 = this.f1717m;
                    xVar3 = (x) this.f1719p;
                    m0.b.n1(obj);
                    ref$ObjectRef = ref$ObjectRef7;
                    coroutineSingletons = coroutineSingletons2;
                    anonymousClass2 = this;
                    fVar = anonymousClass2.f1721r;
                    c00152 = new C00152(ref$ObjectRef, anonymousClass2.f1720q, null);
                    anonymousClass2.f1719p = xVar3;
                    anonymousClass2.f1717m = ref$ObjectRef;
                    anonymousClass2.f1718o = 3;
                    if (fVar.b(c00152, anonymousClass2) != coroutineSingletons) {
                    }
                    break;
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    ref$ObjectRef3 = this.f1717m;
                    xVar3 = (x) this.f1719p;
                    try {
                        m0.b.n1(obj);
                        anonymousClass22 = this;
                    } catch (CancellationException unused2) {
                        xVar = xVar3;
                        anonymousClass22 = this;
                        xVar4 = xVar;
                        anonymousClass22.f1719p = xVar4;
                        anonymousClass22.f1717m = null;
                        anonymousClass22.f1718o = 6;
                        if (anonymousClass22.f1722s.getValue().a(xVar4, anonymousClass22) == coroutineSingletons2) {
                        }
                        if (!a1.b.g0(xVar4)) {
                        }
                    }
                    xVar4 = xVar3;
                    DragLogic value2 = anonymousClass22.f1722s.getValue();
                    t10 = ref$ObjectRef3.f13060i;
                    if (t10 instanceof a.d) {
                    }
                    if (!a1.b.g0(xVar4)) {
                    }
                    break;
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                case 5:
                    xVar = (x) this.f1719p;
                    try {
                        m0.b.n1(obj);
                        anonymousClass22 = this;
                        xVar4 = xVar;
                    } catch (CancellationException unused3) {
                        anonymousClass22 = this;
                        xVar4 = xVar;
                        anonymousClass22.f1719p = xVar4;
                        anonymousClass22.f1717m = null;
                        anonymousClass22.f1718o = 6;
                        if (anonymousClass22.f1722s.getValue().a(xVar4, anonymousClass22) == coroutineSingletons2) {
                        }
                        if (!a1.b.g0(xVar4)) {
                        }
                    }
                    if (!a1.b.g0(xVar4)) {
                    }
                    break;
                case 6:
                    xVar = (x) this.f1719p;
                    m0.b.n1(obj);
                    anonymousClass22 = this;
                    xVar4 = xVar;
                    if (!a1.b.g0(xVar4)) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    @q7.c(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3", f = "Draggable.kt", l = {263}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass3 extends SuspendLambda implements p<v, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f1727m;
        public /* synthetic */ Object n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ boolean f1728o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ g1<l<o, Boolean>> f1729p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ g1<u7.a<Boolean>> f1730q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ Orientation f1731r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ la.c<t.a> f1732s;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ boolean f1733t;

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
        @q7.c(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1", f = "Draggable.kt", l = {265}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

            /* renamed from: m  reason: collision with root package name */
            public int f1734m;
            public /* synthetic */ Object n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ v f1735o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ g1<l<o, Boolean>> f1736p;

            /* renamed from: q  reason: collision with root package name */
            public final /* synthetic */ g1<u7.a<Boolean>> f1737q;

            /* renamed from: r  reason: collision with root package name */
            public final /* synthetic */ Orientation f1738r;

            /* renamed from: s  reason: collision with root package name */
            public final /* synthetic */ la.c<t.a> f1739s;

            /* renamed from: t  reason: collision with root package name */
            public final /* synthetic */ boolean f1740t;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
            @q7.c(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1", f = "Draggable.kt", l = {268, 276}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00161 extends RestrictedSuspendLambda implements p<g1.c, p7.c<? super n>, Object> {

                /* renamed from: k  reason: collision with root package name */
                public h1.e f1741k;

                /* renamed from: l  reason: collision with root package name */
                public la.c f1742l;

                /* renamed from: m  reason: collision with root package name */
                public Orientation f1743m;
                public x n;

                /* renamed from: o  reason: collision with root package name */
                public boolean f1744o;

                /* renamed from: p  reason: collision with root package name */
                public int f1745p;

                /* renamed from: q  reason: collision with root package name */
                public /* synthetic */ Object f1746q;

                /* renamed from: r  reason: collision with root package name */
                public final /* synthetic */ x f1747r;

                /* renamed from: s  reason: collision with root package name */
                public final /* synthetic */ g1<l<o, Boolean>> f1748s;

                /* renamed from: t  reason: collision with root package name */
                public final /* synthetic */ g1<u7.a<Boolean>> f1749t;

                /* renamed from: u  reason: collision with root package name */
                public final /* synthetic */ Orientation f1750u;

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ la.c<t.a> f1751v;

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ boolean f1752w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C00161(x xVar, g1<? extends l<? super o, Boolean>> g1Var, g1<? extends u7.a<Boolean>> g1Var2, Orientation orientation, la.c<t.a> cVar, boolean z10, p7.c<? super C00161> cVar2) {
                    super(2, cVar2);
                    this.f1747r = xVar;
                    this.f1748s = g1Var;
                    this.f1749t = g1Var2;
                    this.f1750u = orientation;
                    this.f1751v = cVar;
                    this.f1752w = z10;
                }

                @Override // u7.p
                public final Object R(g1.c cVar, p7.c<? super n> cVar2) {
                    return ((C00161) a(cVar, cVar2)).k(n.f16010a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final p7.c<n> a(Object obj, p7.c<?> cVar) {
                    C00161 c00161 = new C00161(this.f1747r, this.f1748s, this.f1749t, this.f1750u, this.f1751v, this.f1752w, cVar);
                    c00161.f1746q = obj;
                    return c00161;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(6:(1:32)|33|34|35|36|(1:38)(9:39|9|10|(0)(0)|19|20|21|22|(2:57|58)(0))) */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x00e0, code lost:
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x00e5, code lost:
                    r9 = r2;
                    r7 = r5;
                    r2 = r13;
                    r5 = r17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:57:0x00f0, code lost:
                    r7.F(t.a.C0223a.f17532a);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:59:0x00f7, code lost:
                    throw r0;
                 */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x00f0  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x00f7 A[Catch: all -> 0x0025, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0025, blocks: (B:7:0x001c, B:32:0x00ad, B:55:0x00ea, B:59:0x00f7), top: B:72:0x001c }] */
                /* JADX WARN: Removed duplicated region for block: B:62:0x00fe  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0103  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a5 -> B:70:0x00ad). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00f0 -> B:58:0x00f5). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x00fe -> B:63:0x0100). Please submit an issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object k(Object obj) {
                    g1.c cVar;
                    C00161 c00161;
                    la.c<t.a> cVar2;
                    C00161 c001612;
                    CancellationException e10;
                    CoroutineSingletons coroutineSingletons;
                    Object obj2;
                    g1.c cVar3;
                    h1.e eVar;
                    Pair pair;
                    Orientation orientation;
                    x xVar;
                    Object b5;
                    t.a aVar;
                    float b10;
                    int i10;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.f1745p;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                boolean z10 = this.f1744o;
                                x xVar2 = this.n;
                                Orientation orientation2 = this.f1743m;
                                la.c<t.a> cVar4 = this.f1742l;
                                h1.e eVar2 = this.f1741k;
                                g1.c cVar5 = (g1.c) this.f1746q;
                                try {
                                    try {
                                        m0.b.n1(obj);
                                        c001612 = this;
                                        orientation = orientation2;
                                        b5 = obj;
                                    } catch (Throwable th) {
                                        th = th;
                                        cVar2 = cVar4;
                                        cVar2.F(a.C0223a.f17532a);
                                        throw th;
                                    }
                                } catch (CancellationException e11) {
                                    e10 = e11;
                                    c001612 = this;
                                    if (a1.b.g0(xVar2)) {
                                    }
                                }
                                try {
                                } catch (CancellationException e12) {
                                    e10 = e12;
                                    if (a1.b.g0(xVar2)) {
                                    }
                                }
                                if (!((Boolean) b5).booleanValue()) {
                                    long a10 = eVar2.a();
                                    if (orientation == Orientation.Vertical) {
                                        b10 = k.c(a10);
                                    } else {
                                        b10 = k.b(a10);
                                    }
                                    if (z10) {
                                        i10 = -1;
                                    } else {
                                        i10 = 1;
                                    }
                                    aVar = new a.d(b10 * i10);
                                } else {
                                    aVar = a.C0223a.f17532a;
                                }
                                cVar4.F(aVar);
                                cVar = cVar5;
                                c00161 = c001612;
                                if (a1.b.g0(c00161.f1747r)) {
                                    h1.e eVar3 = new h1.e();
                                    g1<l<o, Boolean>> g1Var = c00161.f1748s;
                                    g1<u7.a<Boolean>> g1Var2 = c00161.f1749t;
                                    Orientation orientation3 = c00161.f1750u;
                                    c00161.f1746q = cVar;
                                    c00161.f1741k = eVar3;
                                    c00161.f1742l = null;
                                    c00161.f1743m = null;
                                    c00161.n = null;
                                    c00161.f1745p = 1;
                                    obj2 = DraggableKt.a(cVar, g1Var, g1Var2, eVar3, orientation3, c00161);
                                    if (obj2 == coroutineSingletons2) {
                                        return coroutineSingletons2;
                                    }
                                    coroutineSingletons = coroutineSingletons2;
                                    c001612 = c00161;
                                    cVar3 = cVar;
                                    eVar = eVar3;
                                    pair = (Pair) obj2;
                                    if (pair == null) {
                                        cVar2 = c001612.f1751v;
                                        orientation = c001612.f1750u;
                                        x xVar3 = c001612.f1747r;
                                        boolean z11 = c001612.f1752w;
                                        try {
                                            try {
                                            } catch (CancellationException e13) {
                                                e10 = e13;
                                                xVar = xVar3;
                                            }
                                            c001612.f1746q = cVar3;
                                            c001612.f1741k = eVar;
                                            c001612.f1742l = cVar2;
                                            c001612.f1743m = orientation;
                                            c001612.n = xVar3;
                                            c001612.f1744o = z11;
                                            c001612.f1745p = 2;
                                            xVar = xVar3;
                                            b5 = DraggableKt.b(cVar3, pair, eVar, cVar2, z11, orientation, c001612);
                                            if (b5 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            eVar2 = eVar;
                                            cVar5 = cVar3;
                                            cVar4 = cVar2;
                                            coroutineSingletons2 = coroutineSingletons;
                                            z10 = z11;
                                            xVar2 = xVar;
                                            if (!((Boolean) b5).booleanValue()) {
                                            }
                                            cVar4.F(aVar);
                                            cVar = cVar5;
                                            c00161 = c001612;
                                            if (a1.b.g0(c00161.f1747r)) {
                                                return n.f16010a;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cVar2.F(a.C0223a.f17532a);
                                            throw th;
                                        }
                                    } else {
                                        cVar = cVar3;
                                        coroutineSingletons2 = coroutineSingletons;
                                        c00161 = c001612;
                                        if (a1.b.g0(c00161.f1747r)) {
                                        }
                                    }
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            eVar = this.f1741k;
                            m0.b.n1(obj);
                            c001612 = this;
                            coroutineSingletons = coroutineSingletons2;
                            cVar3 = (g1.c) this.f1746q;
                            obj2 = obj;
                            pair = (Pair) obj2;
                            if (pair == null) {
                            }
                        }
                    } else {
                        m0.b.n1(obj);
                        cVar = (g1.c) this.f1746q;
                        c00161 = this;
                        if (a1.b.g0(c00161.f1747r)) {
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(v vVar, g1<? extends l<? super o, Boolean>> g1Var, g1<? extends u7.a<Boolean>> g1Var2, Orientation orientation, la.c<t.a> cVar, boolean z10, p7.c<? super AnonymousClass1> cVar2) {
                super(2, cVar2);
                this.f1735o = vVar;
                this.f1736p = g1Var;
                this.f1737q = g1Var2;
                this.f1738r = orientation;
                this.f1739s = cVar;
                this.f1740t = z10;
            }

            @Override // u7.p
            public final Object R(x xVar, p7.c<? super n> cVar) {
                return ((AnonymousClass1) a(xVar, cVar)).k(n.f16010a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final p7.c<n> a(Object obj, p7.c<?> cVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f1735o, this.f1736p, this.f1737q, this.f1738r, this.f1739s, this.f1740t, cVar);
                anonymousClass1.n = obj;
                return anonymousClass1;
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object k(Object obj) {
                x xVar;
                CancellationException e10;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f1734m;
                if (i10 == 0) {
                    m0.b.n1(obj);
                    x xVar2 = (x) this.n;
                    try {
                        v vVar = this.f1735o;
                        C00161 c00161 = new C00161(xVar2, this.f1736p, this.f1737q, this.f1738r, this.f1739s, this.f1740t, null);
                        this.n = xVar2;
                        this.f1734m = 1;
                        if (vVar.Q(c00161, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (CancellationException e11) {
                        xVar = xVar2;
                        e10 = e11;
                        if (!a1.b.g0(xVar)) {
                            throw e10;
                        }
                        return n.f16010a;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xVar = (x) this.n;
                    try {
                        m0.b.n1(obj);
                    } catch (CancellationException e12) {
                        e10 = e12;
                        if (!a1.b.g0(xVar)) {
                        }
                        return n.f16010a;
                    }
                }
                return n.f16010a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(boolean z10, g1<? extends l<? super o, Boolean>> g1Var, g1<? extends u7.a<Boolean>> g1Var2, Orientation orientation, la.c<t.a> cVar, boolean z11, p7.c<? super AnonymousClass3> cVar2) {
            super(2, cVar2);
            this.f1728o = z10;
            this.f1729p = g1Var;
            this.f1730q = g1Var2;
            this.f1731r = orientation;
            this.f1732s = cVar;
            this.f1733t = z11;
        }

        @Override // u7.p
        public final Object R(v vVar, p7.c<? super n> cVar) {
            return ((AnonymousClass3) a(vVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f1728o, this.f1729p, this.f1730q, this.f1731r, this.f1732s, this.f1733t, cVar);
            anonymousClass3.n = obj;
            return anonymousClass3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f1727m;
            if (i10 == 0) {
                m0.b.n1(obj);
                v vVar = (v) this.n;
                if (!this.f1728o) {
                    return n.f16010a;
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(vVar, this.f1729p, this.f1730q, this.f1731r, this.f1732s, this.f1733t, null);
                this.f1727m = 1;
                if (a1.b.H(anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m0.b.n1(obj);
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableKt$draggable$9(Orientation orientation, j jVar, u7.a aVar, l lVar, p pVar, q qVar, q qVar2, boolean z10, boolean z11) {
        super(3);
        this.f1707j = pVar;
        this.f1708k = jVar;
        this.f1709l = aVar;
        this.f1710m = lVar;
        this.n = qVar;
        this.f1711o = qVar2;
        this.f1712p = orientation;
        this.f1713q = z10;
        this.f1714r = z11;
    }

    @Override // u7.q
    public final d O(d dVar, g0.d dVar2, Integer num) {
        g0.d dVar3 = dVar2;
        num.intValue();
        g.f(dVar, "$this$composed");
        dVar3.f(-1487259950);
        f R = this.f1707j.R(dVar3, 0);
        dVar3.f(-492369756);
        Object g10 = dVar3.g();
        d.a.C0120a c0120a = d.a.f11039a;
        if (g10 == c0120a) {
            g10 = a1.c.V0(null);
            dVar3.q(g10);
        }
        dVar3.u();
        g0 g0Var = (g0) g10;
        j jVar = this.f1708k;
        s.a(jVar, new AnonymousClass1(g0Var, jVar), dVar3);
        dVar3.f(-492369756);
        Object g11 = dVar3.g();
        if (g11 == c0120a) {
            g11 = a1.b.f(Integer.MAX_VALUE, null, 6);
            dVar3.q(g11);
        }
        dVar3.u();
        la.c cVar = (la.c) g11;
        g0 l12 = a1.c.l1(this.f1709l, dVar3);
        g0 l13 = a1.c.l1(this.f1710m, dVar3);
        s.c(R, new AnonymousClass2(cVar, R, a1.c.l1(new DragLogic(this.n, this.f1711o, g0Var, jVar), dVar3), null), dVar3);
        q0.d c = SuspendingPointerInputFilterKt.c(new Object[]{this.f1712p, Boolean.valueOf(this.f1713q), Boolean.valueOf(this.f1714r)}, new AnonymousClass3(this.f1713q, l13, l12, this.f1712p, cVar, this.f1714r, null));
        dVar3.u();
        return c;
    }
}
