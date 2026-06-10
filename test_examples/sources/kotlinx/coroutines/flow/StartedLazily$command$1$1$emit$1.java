package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.StartedLazily$command$1;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {158}, m = "emit")
/* loaded from: classes.dex */
public final class StartedLazily$command$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public /* synthetic */ Object f15335l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ StartedLazily$command$1.AnonymousClass1<T> f15336m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StartedLazily$command$1$1$emit$1(StartedLazily$command$1.AnonymousClass1<? super T> anonymousClass1, p7.c<? super StartedLazily$command$1$1$emit$1> cVar) {
        super(cVar);
        this.f15336m = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f15335l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.f15336m.a(0, this);
    }
}
