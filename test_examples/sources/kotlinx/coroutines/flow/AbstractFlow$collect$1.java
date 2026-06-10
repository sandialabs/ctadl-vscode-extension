package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
/* loaded from: classes.dex */
public final class AbstractFlow$collect$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public SafeCollector f15204l;

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f15205m;
    public final /* synthetic */ AbstractFlow<T> n;

    /* renamed from: o  reason: collision with root package name */
    public int f15206o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractFlow$collect$1(AbstractFlow<T> abstractFlow, p7.c<? super AbstractFlow$collect$1> cVar) {
        super(cVar);
        this.n = abstractFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f15205m = obj;
        this.f15206o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
