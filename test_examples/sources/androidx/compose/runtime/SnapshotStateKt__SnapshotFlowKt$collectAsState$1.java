package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.m0;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
@q7.c(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", l = {65, 66}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1 extends SuspendLambda implements p<m0<Object>, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f2835m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f2836o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.b<Object> f2837p;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
    @q7.c(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", l = {67}, m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f2838m;
        public final /* synthetic */ kotlinx.coroutines.flow.b<Object> n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ m0<Object> f2839o;

        /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2$a */
        /* loaded from: classes.dex */
        public static final class a implements kotlinx.coroutines.flow.c<Object> {

            /* renamed from: i  reason: collision with root package name */
            public final /* synthetic */ m0<Object> f2840i;

            public a(m0<Object> m0Var) {
                this.f2840i = m0Var;
            }

            @Override // kotlinx.coroutines.flow.c
            public final Object c(Object obj, p7.c<? super n> cVar) {
                this.f2840i.setValue(obj);
                return n.f16010a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(kotlinx.coroutines.flow.b<Object> bVar, m0<Object> m0Var, p7.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.n = bVar;
            this.f2839o = m0Var;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass2) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass2(this.n, this.f2839o, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f2838m;
            if (i10 == 0) {
                m0.b.n1(obj);
                a aVar = new a(this.f2839o);
                this.f2838m = 1;
                if (this.n.a(aVar, this) == coroutineSingletons) {
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

    /* loaded from: classes.dex */
    public static final class a implements kotlinx.coroutines.flow.c<Object> {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ m0<Object> f2841i;

        public a(m0<Object> m0Var) {
            this.f2841i = m0Var;
        }

        @Override // kotlinx.coroutines.flow.c
        public final Object c(Object obj, p7.c<? super n> cVar) {
            this.f2841i.setValue(obj);
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$collectAsState$1(CoroutineContext coroutineContext, kotlinx.coroutines.flow.b<Object> bVar, p7.c<? super SnapshotStateKt__SnapshotFlowKt$collectAsState$1> cVar) {
        super(2, cVar);
        this.f2836o = coroutineContext;
        this.f2837p = bVar;
    }

    @Override // u7.p
    public final Object R(m0<Object> m0Var, p7.c<? super n> cVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1) a(m0Var, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(this.f2836o, this.f2837p, cVar);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1.n = obj;
        return snapshotStateKt__SnapshotFlowKt$collectAsState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2835m;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m0.b.n1(obj);
        } else {
            m0.b.n1(obj);
            m0 m0Var = (m0) this.n;
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f13021i;
            CoroutineContext coroutineContext = this.f2836o;
            boolean a10 = v7.g.a(coroutineContext, emptyCoroutineContext);
            kotlinx.coroutines.flow.b<Object> bVar = this.f2837p;
            if (a10) {
                a aVar = new a(m0Var);
                this.f2835m = 1;
                if (bVar.a(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(bVar, m0Var, null);
                this.f2835m = 2;
                if (m0.b.I1(this, coroutineContext, anonymousClass2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return n.f16010a;
    }
}
