package androidx.compose.foundation;

import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import g0.g0;
import g0.p;
import g0.s;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import m7.n;
import o1.o;
import q0.d;
import s.h;
import s.i;
import t0.k;
import u.j;
import u7.l;
import u7.q;
import v7.g;
import w.a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class FocusableKt$focusable$2 extends Lambda implements q<q0.d, g0.d, Integer, q0.d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ j f1469j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f1470k;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements l<g0.q, p> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ g0<u.d> f1471j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ j f1472k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g0<u.d> g0Var, j jVar) {
            super(1);
            this.f1471j = g0Var;
            this.f1472k = jVar;
        }

        @Override // u7.l
        public final p U(g0.q qVar) {
            g.f(qVar, "$this$DisposableEffect");
            return new h(this.f1471j, this.f1472k);
        }
    }

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends Lambda implements l<g0.q, p> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ boolean f1473j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ x f1474k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ g0<u.d> f1475l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ j f1476m;

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
        @q7.c(c = "androidx.compose.foundation.FocusableKt$focusable$2$2$1", f = "Focusable.kt", l = {105}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$2$1  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass1 extends SuspendLambda implements u7.p<x, p7.c<? super n>, Object> {

            /* renamed from: m  reason: collision with root package name */
            public g0 f1477m;
            public int n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ g0<u.d> f1478o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ j f1479p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(j jVar, g0 g0Var, p7.c cVar) {
                super(2, cVar);
                this.f1478o = g0Var;
                this.f1479p = jVar;
            }

            @Override // u7.p
            public final Object R(x xVar, p7.c<? super n> cVar) {
                return ((AnonymousClass1) a(xVar, cVar)).k(n.f16010a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final p7.c<n> a(Object obj, p7.c<?> cVar) {
                return new AnonymousClass1(this.f1479p, this.f1478o, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object k(Object obj) {
                g0<u.d> g0Var;
                g0<u.d> g0Var2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.n;
                if (i10 == 0) {
                    m0.b.n1(obj);
                    g0Var = this.f1478o;
                    u.d value = g0Var.getValue();
                    if (value != null) {
                        u.e eVar = new u.e(value);
                        j jVar = this.f1479p;
                        if (jVar != null) {
                            this.f1477m = g0Var;
                            this.n = 1;
                            if (jVar.a(eVar, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            g0Var2 = g0Var;
                        }
                        g0Var.setValue(null);
                    }
                    return n.f16010a;
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    g0Var2 = this.f1477m;
                    m0.b.n1(obj);
                }
                g0Var = g0Var2;
                g0Var.setValue(null);
                return n.f16010a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z10, x xVar, g0<u.d> g0Var, j jVar) {
            super(1);
            this.f1473j = z10;
            this.f1474k = xVar;
            this.f1475l = g0Var;
            this.f1476m = jVar;
        }

        @Override // u7.l
        public final p U(g0.q qVar) {
            g.f(qVar, "$this$DisposableEffect");
            if (!this.f1473j) {
                m0.b.M0(this.f1474k, null, null, new AnonymousClass1(this.f1476m, this.f1475l, null), 3);
            }
            return new i();
        }
    }

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$3  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass3 extends Lambda implements l<o, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ g0<Boolean> f1480j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ FocusRequester f1481k;

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$3$1  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass1 extends Lambda implements u7.a<Boolean> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ FocusRequester f1482j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ g0<Boolean> f1483k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(g0 g0Var, FocusRequester focusRequester) {
                super(0);
                this.f1482j = focusRequester;
                this.f1483k = g0Var;
            }

            @Override // u7.a
            public final Boolean k0() {
                this.f1482j.b();
                return Boolean.valueOf(FocusableKt$focusable$2.a(this.f1483k));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(g0<Boolean> g0Var, FocusRequester focusRequester) {
            super(1);
            this.f1480j = g0Var;
            this.f1481k = focusRequester;
        }

        @Override // u7.l
        public final n U(o oVar) {
            o oVar2 = oVar;
            g.f(oVar2, "$this$semantics");
            g0<Boolean> g0Var = this.f1480j;
            boolean a10 = FocusableKt$focusable$2.a(g0Var);
            o1.n.c.a(oVar2, o1.n.f16212a[4], Boolean.valueOf(a10));
            oVar2.c(o1.i.n, new o1.a(null, new AnonymousClass1(g0Var, this.f1481k)));
            return n.f16010a;
        }
    }

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$4  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass4 extends Lambda implements l<w.a, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ g0<w.a> f1484j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(g0<w.a> g0Var) {
            super(1);
            this.f1484j = g0Var;
        }

        @Override // u7.l
        public final n U(w.a aVar) {
            this.f1484j.setValue(aVar);
            return n.f16010a;
        }
    }

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass5 extends Lambda implements l<k, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ x f1485j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ g0<Boolean> f1486k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ x.d f1487l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ g0<w.a> f1488m;
        public final /* synthetic */ g0<u.d> n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ j f1489o;

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
        @q7.c(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$1", f = "Focusable.kt", l = {144}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$1  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass1 extends SuspendLambda implements u7.p<x, p7.c<? super n>, Object> {

            /* renamed from: m  reason: collision with root package name */
            public int f1490m;
            public final /* synthetic */ x.d n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ g0<w.a> f1491o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(x.d dVar, g0<w.a> g0Var, p7.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.n = dVar;
                this.f1491o = g0Var;
            }

            @Override // u7.p
            public final Object R(x xVar, p7.c<? super n> cVar) {
                return ((AnonymousClass1) a(xVar, cVar)).k(n.f16010a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final p7.c<n> a(Object obj, p7.c<?> cVar) {
                return new AnonymousClass1(this.n, this.f1491o, cVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object k(Object obj) {
                a.InterfaceC0234a interfaceC0234a;
                Throwable th;
                a.InterfaceC0234a interfaceC0234a2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f1490m;
                if (i10 != 0) {
                    if (i10 == 1) {
                        interfaceC0234a = null;
                        try {
                            m0.b.n1(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            if (interfaceC0234a != null) {
                            }
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    try {
                        w.a value = this.f1491o.getValue();
                        if (value != null) {
                            interfaceC0234a2 = value.a();
                        } else {
                            interfaceC0234a2 = null;
                        }
                        try {
                            x.d dVar = this.n;
                            this.f1490m = 1;
                            if (dVar.a(null, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            interfaceC0234a = interfaceC0234a2;
                        } catch (Throwable th3) {
                            th = th3;
                            interfaceC0234a = interfaceC0234a2;
                            if (interfaceC0234a != null) {
                                interfaceC0234a.a();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        interfaceC0234a = null;
                        th = th4;
                    }
                }
                if (interfaceC0234a != null) {
                    interfaceC0234a.a();
                }
                return n.f16010a;
            }
        }

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
        @q7.c(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$2", f = "Focusable.kt", l = {152, 156}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$2  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass2 extends SuspendLambda implements u7.p<x, p7.c<? super n>, Object> {

            /* renamed from: m  reason: collision with root package name */
            public Object f1492m;
            public int n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ g0<u.d> f1493o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ j f1494p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(j jVar, g0 g0Var, p7.c cVar) {
                super(2, cVar);
                this.f1493o = g0Var;
                this.f1494p = jVar;
            }

            @Override // u7.p
            public final Object R(x xVar, p7.c<? super n> cVar) {
                return ((AnonymousClass2) a(xVar, cVar)).k(n.f16010a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final p7.c<n> a(Object obj, p7.c<?> cVar) {
                return new AnonymousClass2(this.f1494p, this.f1493o, cVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object k(Object obj) {
                g0<u.d> g0Var;
                u.d dVar;
                u.d dVar2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.n;
                j jVar = this.f1494p;
                g0<u.d> g0Var2 = this.f1493o;
                if (i10 == 0) {
                    m0.b.n1(obj);
                    u.d value = g0Var2.getValue();
                    if (value != null) {
                        u.e eVar = new u.e(value);
                        if (jVar != null) {
                            this.f1492m = g0Var2;
                            this.n = 1;
                            if (jVar.a(eVar, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        g0Var = g0Var2;
                    }
                    dVar = new u.d();
                    if (jVar != null) {
                        this.f1492m = dVar;
                        this.n = 2;
                        if (jVar.a(dVar, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        dVar2 = dVar;
                        dVar = dVar2;
                    }
                    g0Var2.setValue(dVar);
                    return n.f16010a;
                } else if (i10 != 1) {
                    if (i10 == 2) {
                        dVar2 = (u.d) this.f1492m;
                        m0.b.n1(obj);
                        dVar = dVar2;
                        g0Var2.setValue(dVar);
                        return n.f16010a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    g0Var = (g0) this.f1492m;
                    m0.b.n1(obj);
                }
                g0Var.setValue(null);
                dVar = new u.d();
                if (jVar != null) {
                }
                g0Var2.setValue(dVar);
                return n.f16010a;
            }
        }

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
        @q7.c(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$3", f = "Focusable.kt", l = {163}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$3  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass3 extends SuspendLambda implements u7.p<x, p7.c<? super n>, Object> {

            /* renamed from: m  reason: collision with root package name */
            public g0 f1495m;
            public int n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ g0<u.d> f1496o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ j f1497p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(j jVar, g0 g0Var, p7.c cVar) {
                super(2, cVar);
                this.f1496o = g0Var;
                this.f1497p = jVar;
            }

            @Override // u7.p
            public final Object R(x xVar, p7.c<? super n> cVar) {
                return ((AnonymousClass3) a(xVar, cVar)).k(n.f16010a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final p7.c<n> a(Object obj, p7.c<?> cVar) {
                return new AnonymousClass3(this.f1497p, this.f1496o, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object k(Object obj) {
                g0<u.d> g0Var;
                g0<u.d> g0Var2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.n;
                if (i10 == 0) {
                    m0.b.n1(obj);
                    g0Var = this.f1496o;
                    u.d value = g0Var.getValue();
                    if (value != null) {
                        u.e eVar = new u.e(value);
                        j jVar = this.f1497p;
                        if (jVar != null) {
                            this.f1495m = g0Var;
                            this.n = 1;
                            if (jVar.a(eVar, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            g0Var2 = g0Var;
                        }
                        g0Var.setValue(null);
                    }
                    return n.f16010a;
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    g0Var2 = this.f1495m;
                    m0.b.n1(obj);
                }
                g0Var = g0Var2;
                g0Var.setValue(null);
                return n.f16010a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(x xVar, g0<Boolean> g0Var, x.d dVar, g0<w.a> g0Var2, g0<u.d> g0Var3, j jVar) {
            super(1);
            this.f1485j = xVar;
            this.f1486k = g0Var;
            this.f1487l = dVar;
            this.f1488m = g0Var2;
            this.n = g0Var3;
            this.f1489o = jVar;
        }

        @Override // u7.l
        public final n U(k kVar) {
            u7.p anonymousClass3;
            k kVar2 = kVar;
            g.f(kVar2, "it");
            Boolean valueOf = Boolean.valueOf(kVar2.a());
            g0<Boolean> g0Var = this.f1486k;
            g0Var.setValue(valueOf);
            boolean a10 = FocusableKt$focusable$2.a(g0Var);
            x xVar = this.f1485j;
            j jVar = this.f1489o;
            g0<u.d> g0Var2 = this.n;
            if (a10) {
                m0.b.M0(xVar, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this.f1487l, this.f1488m, null), 1);
                anonymousClass3 = new AnonymousClass2(jVar, g0Var2, null);
            } else {
                anonymousClass3 = new AnonymousClass3(jVar, g0Var2, null);
            }
            m0.b.M0(xVar, null, null, anonymousClass3, 3);
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableKt$focusable$2(j jVar, boolean z10) {
        super(3);
        this.f1469j = jVar;
        this.f1470k = z10;
    }

    public static final boolean a(g0<Boolean> g0Var) {
        return g0Var.getValue().booleanValue();
    }

    @Override // u7.q
    public final q0.d O(q0.d dVar, g0.d dVar2, Integer num) {
        q0.d dVar3;
        g0.d dVar4 = dVar2;
        num.intValue();
        g.f(dVar, "$this$composed");
        dVar4.f(1871352361);
        dVar4.f(773894976);
        dVar4.f(-492369756);
        Object g10 = dVar4.g();
        d.a.C0120a c0120a = d.a.f11039a;
        if (g10 == c0120a) {
            g0.k kVar = new g0.k(s.e(EmptyCoroutineContext.f13021i, dVar4));
            dVar4.q(kVar);
            g10 = kVar;
        }
        dVar4.u();
        x xVar = ((g0.k) g10).f11060a;
        dVar4.u();
        dVar4.f(-492369756);
        Object g11 = dVar4.g();
        if (g11 == c0120a) {
            g11 = a1.c.V0(null);
            dVar4.q(g11);
        }
        dVar4.u();
        g0 g0Var = (g0) g11;
        dVar4.f(-492369756);
        Object g12 = dVar4.g();
        if (g12 == c0120a) {
            g12 = a1.c.V0(null);
            dVar4.q(g12);
        }
        dVar4.u();
        g0 g0Var2 = (g0) g12;
        dVar4.f(-492369756);
        Object g13 = dVar4.g();
        if (g13 == c0120a) {
            g13 = a1.c.V0(Boolean.FALSE);
            dVar4.q(g13);
        }
        dVar4.u();
        g0 g0Var3 = (g0) g13;
        dVar4.f(-492369756);
        Object g14 = dVar4.g();
        if (g14 == c0120a) {
            g14 = new FocusRequester();
            dVar4.q(g14);
        }
        dVar4.u();
        FocusRequester focusRequester = (FocusRequester) g14;
        dVar4.f(-492369756);
        Object g15 = dVar4.g();
        if (g15 == c0120a) {
            g15 = new BringIntoViewRequesterImpl();
            dVar4.q(g15);
        }
        dVar4.u();
        x.d dVar5 = (x.d) g15;
        j jVar = this.f1469j;
        s.a(jVar, new AnonymousClass1(g0Var, jVar), dVar4);
        boolean z10 = this.f1470k;
        s.a(Boolean.valueOf(z10), new AnonymousClass2(z10, xVar, g0Var, jVar), dVar4);
        q0.d dVar6 = d.a.f16824i;
        if (z10) {
            if (a(g0Var3)) {
                dVar4.f(-492369756);
                Object g16 = dVar4.g();
                if (g16 == c0120a) {
                    g16 = new s.j();
                    dVar4.q(g16);
                }
                dVar4.u();
                dVar3 = (q0.d) g16;
            } else {
                dVar3 = dVar6;
            }
            dVar6 = FocusModifierKt.a(FocusChangedModifierKt.a(FocusRequesterModifierKt.a(BringIntoViewRequesterKt.a(InspectableValueKt.a(m0.b.j1(dVar6, false, new AnonymousClass3(g0Var3, focusRequester)), InspectableValueKt.f3744a, new s.s(new AnonymousClass4(g0Var2))), dVar5), focusRequester).Z(dVar3), new AnonymousClass5(xVar, g0Var3, dVar5, g0Var2, g0Var, this.f1469j)));
        }
        dVar4.u();
        return dVar6;
    }
}
