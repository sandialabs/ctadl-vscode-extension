package kotlinx.coroutines;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import u7.p;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {100}, m = "withTimeoutOrNull")
/* loaded from: classes.dex */
public final class TimeoutKt$withTimeoutOrNull$1<T> extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public p f15158l;

    /* renamed from: m  reason: collision with root package name */
    public Ref$ObjectRef f15159m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public int f15160o;

    public TimeoutKt$withTimeoutOrNull$1(p7.c<? super TimeoutKt$withTimeoutOrNull$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.n = obj;
        this.f15160o |= Integer.MIN_VALUE;
        return TimeoutKt.b(0L, null, this);
    }
}
