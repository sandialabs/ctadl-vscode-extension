package kotlinx.coroutines.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.m1;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lja/m1;", "found", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Lja/m1;Lkotlin/coroutines/CoroutineContext$a;)Lja/m1;", "<no name provided>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ThreadContextKt$findOne$1 extends Lambda implements u7.p<m1<?>, CoroutineContext.a, m1<?>> {

    /* renamed from: j  reason: collision with root package name */
    public static final ThreadContextKt$findOne$1 f15467j = new ThreadContextKt$findOne$1();

    public ThreadContextKt$findOne$1() {
        super(2);
    }

    @Override // u7.p
    public final m1<?> R(m1<?> m1Var, CoroutineContext.a aVar) {
        m1<?> m1Var2 = m1Var;
        CoroutineContext.a aVar2 = aVar;
        if (m1Var2 == null) {
            if (aVar2 instanceof m1) {
                return (m1) aVar2;
            }
            return null;
        }
        return m1Var2;
    }
}
