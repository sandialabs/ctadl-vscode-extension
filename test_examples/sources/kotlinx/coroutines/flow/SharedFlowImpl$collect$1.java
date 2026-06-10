package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.u0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {373, 380, 383}, m = "collect$suspendImpl")
/* loaded from: classes.dex */
public final class SharedFlowImpl$collect$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public p f15321l;

    /* renamed from: m  reason: collision with root package name */
    public c f15322m;
    public q n;

    /* renamed from: o  reason: collision with root package name */
    public u0 f15323o;

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f15324p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ p<Object> f15325q;

    /* renamed from: r  reason: collision with root package name */
    public int f15326r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedFlowImpl$collect$1(p<Object> pVar, p7.c<? super SharedFlowImpl$collect$1> cVar) {
        super(cVar);
        this.f15325q = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f15324p = obj;
        this.f15326r |= Integer.MIN_VALUE;
        p.n(this.f15325q, null, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
