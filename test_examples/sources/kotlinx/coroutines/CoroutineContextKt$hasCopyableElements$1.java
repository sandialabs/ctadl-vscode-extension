package kotlinx.coroutines;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.v;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import u7.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "result", "Lkotlin/coroutines/CoroutineContext$a;", "it", "invoke", "(ZLkotlin/coroutines/CoroutineContext$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class CoroutineContextKt$hasCopyableElements$1 extends Lambda implements p<Boolean, CoroutineContext.a, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public static final CoroutineContextKt$hasCopyableElements$1 f15146j = new CoroutineContextKt$hasCopyableElements$1();

    public CoroutineContextKt$hasCopyableElements$1() {
        super(2);
    }

    @Override // u7.p
    public final Boolean R(Boolean bool, CoroutineContext.a aVar) {
        boolean z10;
        CoroutineContext.a aVar2 = aVar;
        if (!bool.booleanValue() && !(aVar2 instanceof v)) {
            z10 = false;
            return Boolean.valueOf(z10);
        }
        z10 = true;
        return Boolean.valueOf(z10);
    }
}
