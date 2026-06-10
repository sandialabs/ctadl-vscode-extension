package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableKt;
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
import q7.c;
import t.g;
import u.j;
import u.m;
import u7.l;
import u7.p;
import u7.q;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@c(c = "androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$gestures$1", f = "Toggleable.kt", l = {270}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ToggleableKt$toggleableImpl$1$gestures$1 extends SuspendLambda implements p<v, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f2067m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ boolean f2068o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ j f2069p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ g0<m> f2070q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ g1<u7.a<Boolean>> f2071r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ g1<u7.a<n>> f2072s;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    @c(c = "androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$gestures$1$1", f = "Toggleable.kt", l = {273}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$gestures$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements q<g, u0.c, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f2073m;
        public /* synthetic */ g n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ long f2074o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ boolean f2075p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ j f2076q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ g0<m> f2077r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ g1<u7.a<Boolean>> f2078s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(boolean z10, j jVar, g0<m> g0Var, g1<? extends u7.a<Boolean>> g1Var, p7.c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.f2075p = z10;
            this.f2076q = jVar;
            this.f2077r = g0Var;
            this.f2078s = g1Var;
        }

        @Override // u7.q
        public final Object O(g gVar, u0.c cVar, p7.c<? super n> cVar2) {
            long j2 = cVar.f17724a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f2075p, this.f2076q, this.f2077r, this.f2078s, cVar2);
            anonymousClass1.n = gVar;
            anonymousClass1.f2074o = j2;
            return anonymousClass1.k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f2073m;
            if (i10 == 0) {
                m0.b.n1(obj);
                g gVar = this.n;
                long j2 = this.f2074o;
                if (this.f2075p) {
                    j jVar = this.f2076q;
                    g0<m> g0Var = this.f2077r;
                    g1<u7.a<Boolean>> g1Var = this.f2078s;
                    this.f2073m = 1;
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
    /* renamed from: androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$gestures$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements l<u0.c, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ boolean f2079j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ g1<u7.a<n>> f2080k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(g1 g1Var, boolean z10) {
            super(1);
            this.f2079j = z10;
            this.f2080k = g1Var;
        }

        @Override // u7.l
        public final n U(u0.c cVar) {
            long j2 = cVar.f17724a;
            if (this.f2079j) {
                this.f2080k.getValue().k0();
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ToggleableKt$toggleableImpl$1$gestures$1(boolean z10, j jVar, g0<m> g0Var, g1<? extends u7.a<Boolean>> g1Var, g1<? extends u7.a<n>> g1Var2, p7.c<? super ToggleableKt$toggleableImpl$1$gestures$1> cVar) {
        super(2, cVar);
        this.f2068o = z10;
        this.f2069p = jVar;
        this.f2070q = g0Var;
        this.f2071r = g1Var;
        this.f2072s = g1Var2;
    }

    @Override // u7.p
    public final Object R(v vVar, p7.c<? super n> cVar) {
        return ((ToggleableKt$toggleableImpl$1$gestures$1) a(vVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ToggleableKt$toggleableImpl$1$gestures$1 toggleableKt$toggleableImpl$1$gestures$1 = new ToggleableKt$toggleableImpl$1$gestures$1(this.f2068o, this.f2069p, this.f2070q, this.f2071r, this.f2072s, cVar);
        toggleableKt$toggleableImpl$1$gestures$1.n = obj;
        return toggleableKt$toggleableImpl$1$gestures$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2067m;
        if (i10 == 0) {
            m0.b.n1(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f2068o, this.f2069p, this.f2070q, this.f2071r, null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f2072s, this.f2068o);
            this.f2067m = 1;
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
