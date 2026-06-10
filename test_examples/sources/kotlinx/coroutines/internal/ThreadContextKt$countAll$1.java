package kotlinx.coroutines.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.m1;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "countOrElement", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext$a;)Ljava/lang/Object;", "<no name provided>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ThreadContextKt$countAll$1 extends Lambda implements u7.p<Object, CoroutineContext.a, Object> {

    /* renamed from: j  reason: collision with root package name */
    public static final ThreadContextKt$countAll$1 f15466j = new ThreadContextKt$countAll$1();

    public ThreadContextKt$countAll$1() {
        super(2);
    }

    @Override // u7.p
    public final Object R(Object obj, CoroutineContext.a aVar) {
        Integer num;
        int i10;
        CoroutineContext.a aVar2 = aVar;
        if (aVar2 instanceof m1) {
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 1;
            }
            if (i10 == 0) {
                return aVar2;
            }
            return Integer.valueOf(i10 + 1);
        }
        return obj;
    }
}
