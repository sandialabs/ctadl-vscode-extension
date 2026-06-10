package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.u0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {386, 398, 403}, m = "collect")
/* loaded from: classes.dex */
public final class StateFlowImpl$collect$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public StateFlowImpl f15344l;

    /* renamed from: m  reason: collision with root package name */
    public c f15345m;
    public v n;

    /* renamed from: o  reason: collision with root package name */
    public u0 f15346o;

    /* renamed from: p  reason: collision with root package name */
    public Object f15347p;

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Object f15348q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ StateFlowImpl<T> f15349r;

    /* renamed from: s  reason: collision with root package name */
    public int f15350s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateFlowImpl$collect$1(StateFlowImpl<T> stateFlowImpl, p7.c<? super StateFlowImpl$collect$1> cVar) {
        super(cVar);
        this.f15349r = stateFlowImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f15348q = obj;
        this.f15350s |= Integer.MIN_VALUE;
        return this.f15349r.a(null, this);
    }
}
