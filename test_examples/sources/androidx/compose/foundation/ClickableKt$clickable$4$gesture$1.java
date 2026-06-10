package androidx.compose.foundation;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.g0;
import g0.g1;
import g1.v;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m7.n;
import t.g;
import u.j;
import u.m;
import u7.l;
import u7.p;
import u7.q;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1", f = "Clickable.kt", l = {142}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ClickableKt$clickable$4$gesture$1 extends SuspendLambda implements p<v, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f1432m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ boolean f1433o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ j f1434p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ g0<m> f1435q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ g1<u7.a<Boolean>> f1436r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ g1<u7.a<n>> f1437s;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    @q7.c(c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1", f = "Clickable.kt", l = {145}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements q<g, u0.c, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f1438m;
        public /* synthetic */ g n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ long f1439o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ boolean f1440p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ j f1441q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ g0<m> f1442r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ g1<u7.a<Boolean>> f1443s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(boolean z10, j jVar, g0<m> g0Var, g1<? extends u7.a<Boolean>> g1Var, p7.c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.f1440p = z10;
            this.f1441q = jVar;
            this.f1442r = g0Var;
            this.f1443s = g1Var;
        }

        @Override // u7.q
        public final Object O(g gVar, u0.c cVar, p7.c<? super n> cVar2) {
            long j2 = cVar.f17724a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f1440p, this.f1441q, this.f1442r, this.f1443s, cVar2);
            anonymousClass1.n = gVar;
            anonymousClass1.f1439o = j2;
            return anonymousClass1.k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f1438m;
            if (i10 == 0) {
                m0.b.n1(obj);
                g gVar = this.n;
                long j2 = this.f1439o;
                if (this.f1440p) {
                    j jVar = this.f1441q;
                    g0<m> g0Var = this.f1442r;
                    g1<u7.a<Boolean>> g1Var = this.f1443s;
                    this.f1438m = 1;
                    if (ClickableKt.e(gVar, j2, jVar, g0Var, g1Var, this) == coroutineSingletons) {
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
    /* renamed from: androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements l<u0.c, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ boolean f1444j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ g1<u7.a<n>> f1445k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(g1 g1Var, boolean z10) {
            super(1);
            this.f1444j = z10;
            this.f1445k = g1Var;
        }

        @Override // u7.l
        public final n U(u0.c cVar) {
            long j2 = cVar.f17724a;
            if (this.f1444j) {
                this.f1445k.getValue().k0();
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ClickableKt$clickable$4$gesture$1(boolean z10, j jVar, g0<m> g0Var, g1<? extends u7.a<Boolean>> g1Var, g1<? extends u7.a<n>> g1Var2, p7.c<? super ClickableKt$clickable$4$gesture$1> cVar) {
        super(2, cVar);
        this.f1433o = z10;
        this.f1434p = jVar;
        this.f1435q = g0Var;
        this.f1436r = g1Var;
        this.f1437s = g1Var2;
    }

    @Override // u7.p
    public final Object R(v vVar, p7.c<? super n> cVar) {
        return ((ClickableKt$clickable$4$gesture$1) a(vVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ClickableKt$clickable$4$gesture$1 clickableKt$clickable$4$gesture$1 = new ClickableKt$clickable$4$gesture$1(this.f1433o, this.f1434p, this.f1435q, this.f1436r, this.f1437s, cVar);
        clickableKt$clickable$4$gesture$1.n = obj;
        return clickableKt$clickable$4$gesture$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1432m;
        if (i10 == 0) {
            m0.b.n1(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f1433o, this.f1434p, this.f1435q, this.f1436r, null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f1437s, this.f1433o);
            this.f1432m = 1;
            if (TapGestureDetectorKt.b((v) this.n, anonymousClass1, anonymousClass2, this) == coroutineSingletons) {
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
