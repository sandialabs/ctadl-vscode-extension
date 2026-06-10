package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.datastore.preferences.PreferencesProto$Value;
import g1.o;
import g1.v;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import t.g;
import u7.l;
import u7.p;
import u7.q;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lg1/v;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {206}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$detectTapAndPress$2 extends SuspendLambda implements p<v, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f1841m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ PressGestureScopeImpl f1842o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ q<g, u0.c, p7.c<? super n>, Object> f1843p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ l<u0.c, n> f1844q;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
    @q7.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {208}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f1845m;
        public /* synthetic */ Object n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ PressGestureScopeImpl f1846o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ v f1847p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ q<g, u0.c, p7.c<? super n>, Object> f1848q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ l<u0.c, n> f1849r;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lg1/c;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
        @q7.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {210, 216}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00171 extends RestrictedSuspendLambda implements p<g1.c, p7.c<? super n>, Object> {

            /* renamed from: k  reason: collision with root package name */
            public int f1850k;

            /* renamed from: l  reason: collision with root package name */
            public /* synthetic */ Object f1851l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ q<g, u0.c, p7.c<? super n>, Object> f1852m;
            public final /* synthetic */ x n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ PressGestureScopeImpl f1853o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ l<u0.c, n> f1854p;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
            @q7.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1$1", f = "TapGestureDetector.kt", l = {213}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00181 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

                /* renamed from: m  reason: collision with root package name */
                public int f1855m;
                public final /* synthetic */ q<g, u0.c, p7.c<? super n>, Object> n;

                /* renamed from: o  reason: collision with root package name */
                public final /* synthetic */ PressGestureScopeImpl f1856o;

                /* renamed from: p  reason: collision with root package name */
                public final /* synthetic */ o f1857p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C00181(q<? super g, ? super u0.c, ? super p7.c<? super n>, ? extends Object> qVar, PressGestureScopeImpl pressGestureScopeImpl, o oVar, p7.c<? super C00181> cVar) {
                    super(2, cVar);
                    this.n = qVar;
                    this.f1856o = pressGestureScopeImpl;
                    this.f1857p = oVar;
                }

                @Override // u7.p
                public final Object R(x xVar, p7.c<? super n> cVar) {
                    return ((C00181) a(xVar, cVar)).k(n.f16010a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final p7.c<n> a(Object obj, p7.c<?> cVar) {
                    return new C00181(this.n, this.f1856o, this.f1857p, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object k(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f1855m;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            m0.b.n1(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        m0.b.n1(obj);
                        u0.c cVar = new u0.c(this.f1857p.c);
                        this.f1855m = 1;
                        if (this.n.O(this.f1856o, cVar, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00171(q<? super g, ? super u0.c, ? super p7.c<? super n>, ? extends Object> qVar, x xVar, PressGestureScopeImpl pressGestureScopeImpl, l<? super u0.c, n> lVar, p7.c<? super C00171> cVar) {
                super(2, cVar);
                this.f1852m = qVar;
                this.n = xVar;
                this.f1853o = pressGestureScopeImpl;
                this.f1854p = lVar;
            }

            @Override // u7.p
            public final Object R(g1.c cVar, p7.c<? super n> cVar2) {
                return ((C00171) a(cVar, cVar2)).k(n.f16010a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final p7.c<n> a(Object obj, p7.c<?> cVar) {
                C00171 c00171 = new C00171(this.f1852m, this.n, this.f1853o, this.f1854p, cVar);
                c00171.f1851l = obj;
                return c00171;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object k(Object obj) {
                g1.c cVar;
                o oVar;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f1850k;
                PressGestureScopeImpl pressGestureScopeImpl = this.f1853o;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            m0.b.n1(obj);
                            oVar = (o) obj;
                            if (oVar != null) {
                                pressGestureScopeImpl.f1766k = true;
                                pressGestureScopeImpl.f1767l.a(null);
                            } else {
                                oVar.a();
                                pressGestureScopeImpl.f1765j = true;
                                pressGestureScopeImpl.f1767l.a(null);
                                l<u0.c, n> lVar = this.f1854p;
                                if (lVar != null) {
                                    lVar.U(new u0.c(oVar.c));
                                }
                            }
                            return n.f16010a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (g1.c) this.f1851l;
                    m0.b.n1(obj);
                } else {
                    m0.b.n1(obj);
                    cVar = (g1.c) this.f1851l;
                    this.f1851l = cVar;
                    this.f1850k = 1;
                    obj = TapGestureDetectorKt.a(cVar, PointerEventPass.Main, true, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                o oVar2 = (o) obj;
                oVar2.a();
                q<g, u0.c, p7.c<? super n>, Object> qVar = TapGestureDetectorKt.f1836a;
                q<g, u0.c, p7.c<? super n>, Object> qVar2 = this.f1852m;
                if (qVar2 != qVar) {
                    m0.b.M0(this.n, null, null, new C00181(qVar2, pressGestureScopeImpl, oVar2, null), 3);
                }
                this.f1851l = null;
                this.f1850k = 2;
                obj = TapGestureDetectorKt.c(cVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                oVar = (o) obj;
                if (oVar != null) {
                }
                return n.f16010a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(PressGestureScopeImpl pressGestureScopeImpl, v vVar, q<? super g, ? super u0.c, ? super p7.c<? super n>, ? extends Object> qVar, l<? super u0.c, n> lVar, p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f1846o = pressGestureScopeImpl;
            this.f1847p = vVar;
            this.f1848q = qVar;
            this.f1849r = lVar;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass1) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f1846o, this.f1847p, this.f1848q, this.f1849r, cVar);
            anonymousClass1.n = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f1845m;
            if (i10 != 0) {
                if (i10 == 1) {
                    m0.b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                m0.b.n1(obj);
                x xVar = (x) this.n;
                PressGestureScopeImpl pressGestureScopeImpl = this.f1846o;
                pressGestureScopeImpl.f1767l.c(null);
                pressGestureScopeImpl.f1765j = false;
                pressGestureScopeImpl.f1766k = false;
                C00171 c00171 = new C00171(this.f1848q, xVar, this.f1846o, this.f1849r, null);
                this.f1845m = 1;
                if (this.f1847p.Q(c00171, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TapGestureDetectorKt$detectTapAndPress$2(PressGestureScopeImpl pressGestureScopeImpl, q<? super g, ? super u0.c, ? super p7.c<? super n>, ? extends Object> qVar, l<? super u0.c, n> lVar, p7.c<? super TapGestureDetectorKt$detectTapAndPress$2> cVar) {
        super(2, cVar);
        this.f1842o = pressGestureScopeImpl;
        this.f1843p = qVar;
        this.f1844q = lVar;
    }

    @Override // u7.p
    public final Object R(v vVar, p7.c<? super n> cVar) {
        return ((TapGestureDetectorKt$detectTapAndPress$2) a(vVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.f1842o, this.f1843p, this.f1844q, cVar);
        tapGestureDetectorKt$detectTapAndPress$2.n = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1841m;
        if (i10 == 0) {
            m0.b.n1(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f1842o, (v) this.n, this.f1843p, this.f1844q, null);
            this.f1841m = 1;
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
