package kotlinx.coroutines.flow.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.m;
import ja.u0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "count", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(ILkotlin/coroutines/CoroutineContext$a;)Ljava/lang/Integer;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SafeCollector_commonKt$checkContext$result$1 extends Lambda implements p<Integer, CoroutineContext.a, Integer> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SafeCollector<?> f15417j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeCollector_commonKt$checkContext$result$1(SafeCollector<?> safeCollector) {
        super(2);
        this.f15417j = safeCollector;
    }

    @Override // u7.p
    public final Integer R(Integer num, CoroutineContext.a aVar) {
        int intValue = num.intValue();
        CoroutineContext.a aVar2 = aVar;
        CoroutineContext.b<?> key = aVar2.getKey();
        CoroutineContext.a a10 = this.f15417j.f15411m.a(key);
        int i10 = u0.c;
        if (key != u0.b.f12806i) {
            if (aVar2 != a10) {
                intValue = Integer.MIN_VALUE;
            }
            intValue++;
        } else {
            u0 u0Var = (u0) a10;
            u0 u0Var2 = (u0) aVar2;
            while (true) {
                if (u0Var2 == null) {
                    u0Var2 = null;
                    break;
                } else if (u0Var2 == u0Var || !(u0Var2 instanceof kotlinx.coroutines.internal.p)) {
                    break;
                } else {
                    m h02 = ((kotlinx.coroutines.internal.p) u0Var2).h0();
                    if (h02 != null) {
                        u0Var2 = h02.getParent();
                    } else {
                        u0Var2 = null;
                    }
                }
            }
            if (u0Var2 == u0Var) {
                if (u0Var == null) {
                }
                intValue++;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + u0Var2 + ", expected child of " + u0Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
            }
        }
        return Integer.valueOf(intValue);
    }
}
