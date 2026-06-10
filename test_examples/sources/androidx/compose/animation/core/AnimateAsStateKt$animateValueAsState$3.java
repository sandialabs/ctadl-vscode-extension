package androidx.compose.animation.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.g1;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import la.e;
import la.f;
import m7.n;
import r.d;
import u7.l;
import u7.p;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
@q7.c(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", l = {417}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnimateAsStateKt$animateValueAsState$3 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public e f1269m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object f1270o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ la.c<Object> f1271p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ a<Object, Object> f1272q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ g1<d<Object>> f1273r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ g1<l<Object, n>> f1274s;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
    @q7.c(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {426}, m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f1275m;
        public final /* synthetic */ Object n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ a<Object, Object> f1276o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ g1<d<Object>> f1277p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ g1<l<Object, n>> f1278q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Object obj, a<Object, Object> aVar, g1<? extends d<Object>> g1Var, g1<? extends l<Object, n>> g1Var2, p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.n = obj;
            this.f1276o = aVar;
            this.f1277p = g1Var;
            this.f1278q = g1Var2;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass1) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass1(this.n, this.f1276o, this.f1277p, this.f1278q, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f1275m;
            a<Object, Object> aVar = this.f1276o;
            if (i10 != 0) {
                if (i10 == 1) {
                    m0.b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                m0.b.n1(obj);
                T value = aVar.f1356e.getValue();
                Object obj2 = this.n;
                if (!g.a(obj2, value)) {
                    int i11 = b.f1364a;
                    this.f1275m = 1;
                    if (a.a(aVar, obj2, this.f1277p.getValue(), this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return n.f16010a;
            }
            int i12 = b.f1364a;
            l<Object, n> value2 = this.f1278q.getValue();
            if (value2 != null) {
                value2.U(aVar.c());
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimateAsStateKt$animateValueAsState$3(la.c<Object> cVar, a<Object, Object> aVar, g1<? extends d<Object>> g1Var, g1<? extends l<Object, n>> g1Var2, p7.c<? super AnimateAsStateKt$animateValueAsState$3> cVar2) {
        super(2, cVar2);
        this.f1271p = cVar;
        this.f1272q = aVar;
        this.f1273r = g1Var;
        this.f1274s = g1Var2;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((AnimateAsStateKt$animateValueAsState$3) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        AnimateAsStateKt$animateValueAsState$3 animateAsStateKt$animateValueAsState$3 = new AnimateAsStateKt$animateValueAsState$3(this.f1271p, this.f1272q, this.f1273r, this.f1274s, cVar);
        animateAsStateKt$animateValueAsState$3.f1270o = obj;
        return animateAsStateKt$animateValueAsState$3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:12:0x0040). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        AnimateAsStateKt$animateValueAsState$3 animateAsStateKt$animateValueAsState$3;
        x xVar;
        e<Object> eVar;
        Object a10;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.n;
        if (i10 != 0) {
            if (i10 == 1) {
                eVar = this.f1269m;
                xVar = (x) this.f1270o;
                m0.b.n1(obj);
                a10 = obj;
                animateAsStateKt$animateValueAsState$3 = this;
                if (((Boolean) a10).booleanValue()) {
                    Object next = eVar.next();
                    Object E = animateAsStateKt$animateValueAsState$3.f1271p.E();
                    if (E instanceof f.b) {
                        E = null;
                    }
                    if (E == null) {
                        obj2 = next;
                    } else {
                        obj2 = E;
                    }
                    m0.b.M0(xVar, null, null, new AnonymousClass1(obj2, animateAsStateKt$animateValueAsState$3.f1272q, animateAsStateKt$animateValueAsState$3.f1273r, animateAsStateKt$animateValueAsState$3.f1274s, null), 3);
                    animateAsStateKt$animateValueAsState$3.f1270o = xVar;
                    animateAsStateKt$animateValueAsState$3.f1269m = eVar;
                    animateAsStateKt$animateValueAsState$3.n = 1;
                    a10 = eVar.a(animateAsStateKt$animateValueAsState$3);
                    if (a10 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) a10).booleanValue()) {
                        return n.f16010a;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            e<Object> it = this.f1271p.iterator();
            animateAsStateKt$animateValueAsState$3 = this;
            xVar = (x) this.f1270o;
            eVar = it;
            animateAsStateKt$animateValueAsState$3.f1270o = xVar;
            animateAsStateKt$animateValueAsState$3.f1269m = eVar;
            animateAsStateKt$animateValueAsState$3.n = 1;
            a10 = eVar.a(animateAsStateKt$animateValueAsState$3);
            if (a10 == coroutineSingletons) {
            }
            if (((Boolean) a10).booleanValue()) {
            }
        }
    }
}
