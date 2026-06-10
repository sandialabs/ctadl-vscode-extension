package androidx.compose.foundation;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.g0;
import g0.g1;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import u.j;
import u.m;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", l = {406, 409}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ClickableKt$handlePressInteraction$2$delayJob$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public m f1462m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ g1<u7.a<Boolean>> f1463o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ long f1464p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ j f1465q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ g0<m> f1466r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ClickableKt$handlePressInteraction$2$delayJob$1(g1<? extends u7.a<Boolean>> g1Var, long j2, j jVar, g0<m> g0Var, p7.c<? super ClickableKt$handlePressInteraction$2$delayJob$1> cVar) {
        super(2, cVar);
        this.f1463o = g1Var;
        this.f1464p = j2;
        this.f1465q = jVar;
        this.f1466r = g0Var;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((ClickableKt$handlePressInteraction$2$delayJob$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new ClickableKt$handlePressInteraction$2$delayJob$1(this.f1463o, this.f1464p, this.f1465q, this.f1466r, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m mVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.n;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    mVar = this.f1462m;
                    m0.b.n1(obj);
                    this.f1466r.setValue(mVar);
                    return n.f16010a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m0.b.n1(obj);
        } else {
            m0.b.n1(obj);
            if (this.f1463o.getValue().k0().booleanValue()) {
                long j2 = c.f1596a;
                this.n = 1;
                if (m0.b.S(j2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        m mVar2 = new m(this.f1464p);
        this.f1462m = mVar2;
        this.n = 2;
        if (this.f1465q.a(mVar2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        mVar = mVar2;
        this.f1466r.setValue(mVar);
        return n.f16010a;
    }
}
