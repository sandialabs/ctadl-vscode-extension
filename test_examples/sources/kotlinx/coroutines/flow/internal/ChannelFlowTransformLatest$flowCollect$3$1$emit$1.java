package kotlinx.coroutines.flow.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.u0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {30}, m = "emit")
/* loaded from: classes.dex */
public final class ChannelFlowTransformLatest$flowCollect$3$1$emit$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1 f15385l;

    /* renamed from: m  reason: collision with root package name */
    public Object f15386m;
    public u0 n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object f15387o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1<T> f15388p;

    /* renamed from: q  reason: collision with root package name */
    public int f15389q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest$flowCollect$3$1$emit$1(ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1<? super T> anonymousClass1, p7.c<? super ChannelFlowTransformLatest$flowCollect$3$1$emit$1> cVar) {
        super(cVar);
        this.f15388p = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f15387o = obj;
        this.f15389q |= Integer.MIN_VALUE;
        return this.f15388p.c(null, this);
    }
}
