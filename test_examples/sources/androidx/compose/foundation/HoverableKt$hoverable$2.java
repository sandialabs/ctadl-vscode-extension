package androidx.compose.foundation;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import g0.g0;
import g0.p;
import g0.s;
import g1.k;
import g1.v;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m7.n;
import q0.d;
import u.f;
import u.h;
import u.j;
import u7.l;
import u7.q;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class HoverableKt$hoverable$2 extends Lambda implements q<q0.d, g0.d, Integer, q0.d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ j f1504j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f1505k;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements l<g0.q, p> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ g0<f> f1506j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ j f1507k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g0<f> g0Var, j jVar) {
            super(1);
            this.f1506j = g0Var;
            this.f1507k = jVar;
        }

        @Override // u7.l
        public final p U(g0.q qVar) {
            g.f(qVar, "$this$DisposableEffect");
            return new s.l(this.f1506j, this.f1507k);
        }
    }

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    @q7.c(c = "androidx.compose.foundation.HoverableKt$hoverable$2$2", f = "Hoverable.kt", l = {88}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends SuspendLambda implements u7.p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f1508m;
        public final /* synthetic */ boolean n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ g0<f> f1509o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ j f1510p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z10, g0<f> g0Var, j jVar, p7.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.n = z10;
            this.f1509o = g0Var;
            this.f1510p = jVar;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass2) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass2(this.n, this.f1509o, this.f1510p, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f1508m;
            if (i10 == 0) {
                m0.b.n1(obj);
                if (!this.n) {
                    this.f1508m = 1;
                    if (HoverableKt$hoverable$2.b(this.f1510p, this.f1509o, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m0.b.n1(obj);
            }
            return n.f16010a;
        }
    }

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    @q7.c(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", f = "Hoverable.kt", l = {102}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass3 extends SuspendLambda implements u7.p<v, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f1511m;
        public /* synthetic */ Object n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ x f1512o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ j f1513p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ g0<f> f1514q;

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
        @q7.c(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1", f = "Hoverable.kt", l = {104}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements u7.p<g1.c, p7.c<? super n>, Object> {

            /* renamed from: k  reason: collision with root package name */
            public int f1515k;

            /* renamed from: l  reason: collision with root package name */
            public /* synthetic */ Object f1516l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ CoroutineContext f1517m;
            public final /* synthetic */ x n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ j f1518o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ g0<f> f1519p;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
            @q7.c(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1", f = "Hoverable.kt", l = {106}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00121 extends SuspendLambda implements u7.p<x, p7.c<? super n>, Object> {

                /* renamed from: m  reason: collision with root package name */
                public int f1520m;
                public final /* synthetic */ j n;

                /* renamed from: o  reason: collision with root package name */
                public final /* synthetic */ g0<f> f1521o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00121(j jVar, g0<f> g0Var, p7.c<? super C00121> cVar) {
                    super(2, cVar);
                    this.n = jVar;
                    this.f1521o = g0Var;
                }

                @Override // u7.p
                public final Object R(x xVar, p7.c<? super n> cVar) {
                    return ((C00121) a(xVar, cVar)).k(n.f16010a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final p7.c<n> a(Object obj, p7.c<?> cVar) {
                    return new C00121(this.n, this.f1521o, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object k(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f1520m;
                    if (i10 == 0) {
                        m0.b.n1(obj);
                        this.f1520m = 1;
                        if (HoverableKt$hoverable$2.a(this.n, this.f1521o, this) == coroutineSingletons) {
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

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
            @q7.c(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2", f = "Hoverable.kt", l = {107}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2 extends SuspendLambda implements u7.p<x, p7.c<? super n>, Object> {

                /* renamed from: m  reason: collision with root package name */
                public int f1522m;
                public final /* synthetic */ g0<f> n;

                /* renamed from: o  reason: collision with root package name */
                public final /* synthetic */ j f1523o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(j jVar, g0 g0Var, p7.c cVar) {
                    super(2, cVar);
                    this.n = g0Var;
                    this.f1523o = jVar;
                }

                @Override // u7.p
                public final Object R(x xVar, p7.c<? super n> cVar) {
                    return ((AnonymousClass2) a(xVar, cVar)).k(n.f16010a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final p7.c<n> a(Object obj, p7.c<?> cVar) {
                    return new AnonymousClass2(this.f1523o, this.n, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object k(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f1522m;
                    if (i10 == 0) {
                        m0.b.n1(obj);
                        this.f1522m = 1;
                        if (HoverableKt$hoverable$2.b(this.f1523o, this.n, this) == coroutineSingletons) {
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
            public AnonymousClass1(CoroutineContext coroutineContext, x xVar, j jVar, g0<f> g0Var, p7.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.f1517m = coroutineContext;
                this.n = xVar;
                this.f1518o = jVar;
                this.f1519p = g0Var;
            }

            @Override // u7.p
            public final Object R(g1.c cVar, p7.c<? super n> cVar2) {
                return ((AnonymousClass1) a(cVar, cVar2)).k(n.f16010a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final p7.c<n> a(Object obj, p7.c<?> cVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f1517m, this.n, this.f1518o, this.f1519p, cVar);
                anonymousClass1.f1516l = obj;
                return anonymousClass1;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0038 -> B:15:0x003d). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object k(Object obj) {
                g1.c cVar;
                AnonymousClass1 anonymousClass1;
                Object A;
                boolean z10;
                u7.p anonymousClass2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f1515k;
                if (i10 != 0) {
                    if (i10 == 1) {
                        m0.b.n1(obj);
                        g1.c cVar2 = (g1.c) this.f1516l;
                        CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                        AnonymousClass1 anonymousClass12 = this;
                        int i11 = ((k) obj).f11160b;
                        boolean z11 = false;
                        if (i11 != 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        g0<f> g0Var = anonymousClass12.f1519p;
                        j jVar = anonymousClass12.f1518o;
                        if (z10) {
                            if (i11 == 5) {
                                z11 = true;
                            }
                            if (z11) {
                                anonymousClass2 = new AnonymousClass2(jVar, g0Var, null);
                            }
                            anonymousClass1 = anonymousClass12;
                            coroutineSingletons = coroutineSingletons2;
                            cVar = cVar2;
                            if (a1.b.h0(anonymousClass1.f1517m)) {
                                anonymousClass1.f1516l = cVar;
                                anonymousClass1.f1515k = 1;
                                A = cVar.A(PointerEventPass.Main, anonymousClass1);
                                if (A == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                                anonymousClass12 = anonymousClass1;
                                obj = A;
                                cVar2 = cVar;
                                coroutineSingletons2 = coroutineSingletons3;
                                int i112 = ((k) obj).f11160b;
                                boolean z112 = false;
                                if (i112 != 4) {
                                }
                                g0<f> g0Var2 = anonymousClass12.f1519p;
                                j jVar2 = anonymousClass12.f1518o;
                                if (z10) {
                                    anonymousClass2 = new C00121(jVar2, g0Var2, null);
                                }
                            } else {
                                return n.f16010a;
                            }
                        }
                        m0.b.M0(anonymousClass12.n, null, null, anonymousClass2, 3);
                        anonymousClass1 = anonymousClass12;
                        coroutineSingletons = coroutineSingletons2;
                        cVar = cVar2;
                        if (a1.b.h0(anonymousClass1.f1517m)) {
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    cVar = (g1.c) this.f1516l;
                    anonymousClass1 = this;
                    if (a1.b.h0(anonymousClass1.f1517m)) {
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(x xVar, j jVar, g0<f> g0Var, p7.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.f1512o = xVar;
            this.f1513p = jVar;
            this.f1514q = g0Var;
        }

        @Override // u7.p
        public final Object R(v vVar, p7.c<? super n> cVar) {
            return ((AnonymousClass3) a(vVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f1512o, this.f1513p, this.f1514q, cVar);
            anonymousClass3.n = obj;
            return anonymousClass3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f1511m;
            if (i10 != 0) {
                if (i10 == 1) {
                    m0.b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                m0.b.n1(obj);
                CoroutineContext coroutineContext = this.f13036j;
                g.c(coroutineContext);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineContext, this.f1512o, this.f1513p, this.f1514q, null);
                this.f1511m = 1;
                if (((v) this.n).Q(anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableKt$hoverable$2(j jVar, boolean z10) {
        super(3);
        this.f1504j = jVar;
        this.f1505k = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j jVar, g0 g0Var, p7.c cVar) {
        HoverableKt$hoverable$2$invoke$emitEnter$1 hoverableKt$hoverable$2$invoke$emitEnter$1;
        int i10;
        f fVar;
        if (cVar instanceof HoverableKt$hoverable$2$invoke$emitEnter$1) {
            hoverableKt$hoverable$2$invoke$emitEnter$1 = (HoverableKt$hoverable$2$invoke$emitEnter$1) cVar;
            int i11 = hoverableKt$hoverable$2$invoke$emitEnter$1.f1526o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hoverableKt$hoverable$2$invoke$emitEnter$1.f1526o = i11 - Integer.MIN_VALUE;
                Object obj = hoverableKt$hoverable$2$invoke$emitEnter$1.n;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = hoverableKt$hoverable$2$invoke$emitEnter$1.f1526o;
                if (i10 == 0) {
                    if (i10 == 1) {
                        fVar = hoverableKt$hoverable$2$invoke$emitEnter$1.f1525m;
                        g0Var = hoverableKt$hoverable$2$invoke$emitEnter$1.f1524l;
                        m0.b.n1(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    if (((f) g0Var.getValue()) == null) {
                        f fVar2 = new f();
                        hoverableKt$hoverable$2$invoke$emitEnter$1.f1524l = g0Var;
                        hoverableKt$hoverable$2$invoke$emitEnter$1.f1525m = fVar2;
                        hoverableKt$hoverable$2$invoke$emitEnter$1.f1526o = 1;
                        if (jVar.a(fVar2, hoverableKt$hoverable$2$invoke$emitEnter$1) != obj2) {
                            fVar = fVar2;
                        } else {
                            return obj2;
                        }
                    }
                    return n.f16010a;
                }
                g0Var.setValue(fVar);
                return n.f16010a;
            }
        }
        hoverableKt$hoverable$2$invoke$emitEnter$1 = new HoverableKt$hoverable$2$invoke$emitEnter$1(cVar);
        Object obj3 = hoverableKt$hoverable$2$invoke$emitEnter$1.n;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = hoverableKt$hoverable$2$invoke$emitEnter$1.f1526o;
        if (i10 == 0) {
        }
        g0Var.setValue(fVar);
        return n.f16010a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(j jVar, g0 g0Var, p7.c cVar) {
        HoverableKt$hoverable$2$invoke$emitExit$1 hoverableKt$hoverable$2$invoke$emitExit$1;
        int i10;
        if (cVar instanceof HoverableKt$hoverable$2$invoke$emitExit$1) {
            hoverableKt$hoverable$2$invoke$emitExit$1 = (HoverableKt$hoverable$2$invoke$emitExit$1) cVar;
            int i11 = hoverableKt$hoverable$2$invoke$emitExit$1.n;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hoverableKt$hoverable$2$invoke$emitExit$1.n = i11 - Integer.MIN_VALUE;
                Object obj = hoverableKt$hoverable$2$invoke$emitExit$1.f1528m;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = hoverableKt$hoverable$2$invoke$emitExit$1.n;
                if (i10 == 0) {
                    if (i10 == 1) {
                        g0Var = hoverableKt$hoverable$2$invoke$emitExit$1.f1527l;
                        m0.b.n1(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    f fVar = (f) g0Var.getValue();
                    if (fVar != null) {
                        h gVar = new u.g(fVar);
                        hoverableKt$hoverable$2$invoke$emitExit$1.f1527l = g0Var;
                        hoverableKt$hoverable$2$invoke$emitExit$1.n = 1;
                        if (jVar.a(gVar, hoverableKt$hoverable$2$invoke$emitExit$1) == obj2) {
                            return obj2;
                        }
                    }
                    return n.f16010a;
                }
                g0Var.setValue(null);
                return n.f16010a;
            }
        }
        hoverableKt$hoverable$2$invoke$emitExit$1 = new HoverableKt$hoverable$2$invoke$emitExit$1(cVar);
        Object obj3 = hoverableKt$hoverable$2$invoke$emitExit$1.f1528m;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = hoverableKt$hoverable$2$invoke$emitExit$1.n;
        if (i10 == 0) {
        }
        g0Var.setValue(null);
        return n.f16010a;
    }

    @Override // u7.q
    public final q0.d O(q0.d dVar, g0.d dVar2, Integer num) {
        g0.d dVar3 = dVar2;
        num.intValue();
        g.f(dVar, "$this$composed");
        dVar3.f(1294013553);
        dVar3.f(773894976);
        dVar3.f(-492369756);
        Object g10 = dVar3.g();
        d.a.C0120a c0120a = d.a.f11039a;
        if (g10 == c0120a) {
            g0.k kVar = new g0.k(s.e(EmptyCoroutineContext.f13021i, dVar3));
            dVar3.q(kVar);
            g10 = kVar;
        }
        dVar3.u();
        x xVar = ((g0.k) g10).f11060a;
        dVar3.u();
        dVar3.f(-492369756);
        Object g11 = dVar3.g();
        if (g11 == c0120a) {
            g11 = a1.c.V0(null);
            dVar3.q(g11);
        }
        dVar3.u();
        g0 g0Var = (g0) g11;
        j jVar = this.f1504j;
        s.a(jVar, new AnonymousClass1(g0Var, jVar), dVar3);
        boolean z10 = this.f1505k;
        s.c(Boolean.valueOf(z10), new AnonymousClass2(z10, g0Var, jVar, null), dVar3);
        q0.d dVar4 = d.a.f16824i;
        if (z10) {
            dVar4 = SuspendingPointerInputFilterKt.b(dVar4, jVar, new AnonymousClass3(xVar, jVar, g0Var, null));
        }
        dVar3.u();
        return dVar4;
    }
}
