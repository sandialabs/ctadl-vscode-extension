package kotlinx.coroutines;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.v;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import u7.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "result", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$a;)Lkotlin/coroutines/CoroutineContext;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class CoroutineContextKt$foldCopies$1 extends Lambda implements p<CoroutineContext, CoroutineContext.a, CoroutineContext> {

    /* renamed from: j  reason: collision with root package name */
    public static final CoroutineContextKt$foldCopies$1 f15143j = new CoroutineContextKt$foldCopies$1();

    public CoroutineContextKt$foldCopies$1() {
        super(2);
    }

    @Override // u7.p
    public final CoroutineContext R(CoroutineContext coroutineContext, CoroutineContext.a aVar) {
        CoroutineContext coroutineContext2 = coroutineContext;
        CoroutineContext.a aVar2 = aVar;
        if (aVar2 instanceof v) {
            aVar2 = ((v) aVar2).p();
        }
        return coroutineContext2.m(aVar2);
    }
}
