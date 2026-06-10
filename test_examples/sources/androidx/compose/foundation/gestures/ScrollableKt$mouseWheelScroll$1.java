package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.g1;
import g1.k;
import g1.o;
import g1.v;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import t.h;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lg1/v;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1", f = "Scrollable.kt", l = {271}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ScrollableKt$mouseWheelScroll$1 extends SuspendLambda implements p<v, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f1787m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ h f1788o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ g1<ScrollingLogic> f1789p;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lg1/c;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
    @q7.c(c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1", f = "Scrollable.kt", l = {273}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<g1.c, p7.c<? super n>, Object> {

        /* renamed from: k  reason: collision with root package name */
        public int f1790k;

        /* renamed from: l  reason: collision with root package name */
        public /* synthetic */ Object f1791l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ h f1792m;
        public final /* synthetic */ g1<ScrollingLogic> n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(h hVar, g1<ScrollingLogic> g1Var, p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f1792m = hVar;
            this.n = g1Var;
        }

        @Override // u7.p
        public final Object R(g1.c cVar, p7.c<? super n> cVar2) {
            return ((AnonymousClass1) a(cVar, cVar2)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f1792m, this.n, cVar);
            anonymousClass1.f1791l = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0053 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0030 -> B:13:0x0035). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object k(Object obj) {
            g1.c cVar;
            AnonymousClass1 anonymousClass1;
            Object a10;
            boolean z10;
            boolean z11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f1790k;
            if (i10 != 0) {
                if (i10 == 1) {
                    m0.b.n1(obj);
                    g1.c cVar2 = (g1.c) this.f1791l;
                    CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                    AnonymousClass1 anonymousClass12 = this;
                    k kVar = (k) obj;
                    List<o> list = kVar.f11159a;
                    int size = list.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            if (!(!list.get(i11).b())) {
                                z10 = false;
                                break;
                            }
                            i11++;
                        } else {
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        cVar2.p();
                        long e10 = anonymousClass12.f1792m.e(cVar2, kVar);
                        ScrollingLogic value = anonymousClass12.n.getValue();
                        float d5 = value.d(e10);
                        if (value.f1812b) {
                            d5 *= -1;
                        }
                        if (value.f1813d.b(d5) == 0.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            List<o> list2 = kVar.f11159a;
                            int size2 = list2.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                list2.get(i12).a();
                            }
                        }
                    }
                    anonymousClass1 = anonymousClass12;
                    coroutineSingletons = coroutineSingletons2;
                    cVar = cVar2;
                    anonymousClass1.f1791l = cVar;
                    anonymousClass1.f1790k = 1;
                    a10 = ScrollableKt.a(cVar, anonymousClass1);
                    if (a10 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                    anonymousClass12 = anonymousClass1;
                    obj = a10;
                    cVar2 = cVar;
                    coroutineSingletons2 = coroutineSingletons3;
                    k kVar2 = (k) obj;
                    List<o> list3 = kVar2.f11159a;
                    int size3 = list3.size();
                    int i112 = 0;
                    while (true) {
                        if (i112 < size3) {
                        }
                        i112++;
                    }
                    if (z10) {
                    }
                    anonymousClass1 = anonymousClass12;
                    coroutineSingletons = coroutineSingletons2;
                    cVar = cVar2;
                    anonymousClass1.f1791l = cVar;
                    anonymousClass1.f1790k = 1;
                    a10 = ScrollableKt.a(cVar, anonymousClass1);
                    if (a10 == coroutineSingletons) {
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                m0.b.n1(obj);
                cVar = (g1.c) this.f1791l;
                anonymousClass1 = this;
                anonymousClass1.f1791l = cVar;
                anonymousClass1.f1790k = 1;
                a10 = ScrollableKt.a(cVar, anonymousClass1);
                if (a10 == coroutineSingletons) {
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$mouseWheelScroll$1(h hVar, g1<ScrollingLogic> g1Var, p7.c<? super ScrollableKt$mouseWheelScroll$1> cVar) {
        super(2, cVar);
        this.f1788o = hVar;
        this.f1789p = g1Var;
    }

    @Override // u7.p
    public final Object R(v vVar, p7.c<? super n> cVar) {
        return ((ScrollableKt$mouseWheelScroll$1) a(vVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ScrollableKt$mouseWheelScroll$1 scrollableKt$mouseWheelScroll$1 = new ScrollableKt$mouseWheelScroll$1(this.f1788o, this.f1789p, cVar);
        scrollableKt$mouseWheelScroll$1.n = obj;
        return scrollableKt$mouseWheelScroll$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1787m;
        if (i10 == 0) {
            m0.b.n1(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f1788o, this.f1789p, null);
            this.f1787m = 1;
            if (((v) this.n).Q(anonymousClass1, this) == coroutineSingletons) {
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
