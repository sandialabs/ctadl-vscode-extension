package kotlinx.coroutines;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import u7.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$a;", "it", "Lkotlinx/coroutines/d;", "invoke", "(Lkotlin/coroutines/CoroutineContext$a;)Lkotlinx/coroutines/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class ExecutorCoroutineDispatcher$Key$1 extends Lambda implements l<CoroutineContext.a, d> {

    /* renamed from: j  reason: collision with root package name */
    public static final ExecutorCoroutineDispatcher$Key$1 f15155j = new ExecutorCoroutineDispatcher$Key$1();

    public ExecutorCoroutineDispatcher$Key$1() {
        super(1);
    }

    @Override // u7.l
    public final d U(CoroutineContext.a aVar) {
        CoroutineContext.a aVar2 = aVar;
        if (aVar2 instanceof d) {
            return (d) aVar2;
        }
        return null;
    }
}
