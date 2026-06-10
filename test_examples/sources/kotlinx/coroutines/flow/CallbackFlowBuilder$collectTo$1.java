package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {336}, m = "collectTo")
/* loaded from: classes.dex */
public final class CallbackFlowBuilder$collectTo$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public la.k f15208l;

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f15209m;
    public final /* synthetic */ CallbackFlowBuilder<T> n;

    /* renamed from: o  reason: collision with root package name */
    public int f15210o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackFlowBuilder$collectTo$1(CallbackFlowBuilder<T> callbackFlowBuilder, p7.c<? super CallbackFlowBuilder$collectTo$1> cVar) {
        super(cVar);
        this.n = callbackFlowBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f15209m = obj;
        this.f15210o |= Integer.MIN_VALUE;
        return this.n.c(null, this);
    }
}
