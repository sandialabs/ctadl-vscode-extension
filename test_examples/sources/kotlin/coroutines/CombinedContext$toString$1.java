package kotlin.coroutines;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "acc", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/CoroutineContext$a;)Ljava/lang/String;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CombinedContext$toString$1 extends Lambda implements p<String, CoroutineContext.a, String> {

    /* renamed from: j  reason: collision with root package name */
    public static final CombinedContext$toString$1 f13019j = new CombinedContext$toString$1();

    public CombinedContext$toString$1() {
        super(2);
    }

    @Override // u7.p
    public final String R(String str, CoroutineContext.a aVar) {
        boolean z10;
        String str2 = str;
        CoroutineContext.a aVar2 = aVar;
        g.f(str2, "acc");
        g.f(aVar2, "element");
        if (str2.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return aVar2.toString();
        }
        return str2 + ", " + aVar2;
    }
}
