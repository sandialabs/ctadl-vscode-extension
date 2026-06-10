package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.g0;
import g0.m0;
import g0.n0;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
@q7.c(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$2", f = "ProduceState.kt", l = {119}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SnapshotStateKt__ProduceStateKt$produceState$2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f2829m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ p<m0<Object>, p7.c<? super n>, Object> f2830o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ g0<Object> f2831p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateKt__ProduceStateKt$produceState$2(p<? super m0<Object>, ? super p7.c<? super n>, ? extends Object> pVar, g0<Object> g0Var, p7.c<? super SnapshotStateKt__ProduceStateKt$produceState$2> cVar) {
        super(2, cVar);
        this.f2830o = pVar;
        this.f2831p = g0Var;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((SnapshotStateKt__ProduceStateKt$produceState$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        SnapshotStateKt__ProduceStateKt$produceState$2 snapshotStateKt__ProduceStateKt$produceState$2 = new SnapshotStateKt__ProduceStateKt$produceState$2(this.f2830o, this.f2831p, cVar);
        snapshotStateKt__ProduceStateKt$produceState$2.n = obj;
        return snapshotStateKt__ProduceStateKt$produceState$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2829m;
        if (i10 == 0) {
            m0.b.n1(obj);
            n0 n0Var = new n0(this.f2831p, ((x) this.n).j());
            this.f2829m = 1;
            if (this.f2830o.R(n0Var, this) == coroutineSingletons) {
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
