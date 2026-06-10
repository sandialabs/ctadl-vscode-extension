package kotlin.coroutines;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import p7.d;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "acc", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$a;)Lkotlin/coroutines/CoroutineContext;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CoroutineContext$plus$1 extends Lambda implements p<CoroutineContext, CoroutineContext.a, CoroutineContext> {

    /* renamed from: j  reason: collision with root package name */
    public static final CoroutineContext$plus$1 f13020j = new CoroutineContext$plus$1();

    public CoroutineContext$plus$1() {
        super(2);
    }

    @Override // u7.p
    public final CoroutineContext R(CoroutineContext coroutineContext, CoroutineContext.a aVar) {
        CombinedContext combinedContext;
        CoroutineContext coroutineContext2 = coroutineContext;
        CoroutineContext.a aVar2 = aVar;
        g.f(coroutineContext2, "acc");
        g.f(aVar2, "element");
        CoroutineContext N = coroutineContext2.N(aVar2.getKey());
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f13021i;
        if (N != emptyCoroutineContext) {
            int i10 = d.f16776f;
            d.a aVar3 = d.a.f16777i;
            d dVar = (d) N.a(aVar3);
            if (dVar == null) {
                combinedContext = new CombinedContext(aVar2, N);
            } else {
                CoroutineContext N2 = N.N(aVar3);
                if (N2 == emptyCoroutineContext) {
                    return new CombinedContext(dVar, aVar2);
                }
                combinedContext = new CombinedContext(dVar, new CombinedContext(aVar2, N2));
            }
            return combinedContext;
        }
        return aVar2;
    }
}
