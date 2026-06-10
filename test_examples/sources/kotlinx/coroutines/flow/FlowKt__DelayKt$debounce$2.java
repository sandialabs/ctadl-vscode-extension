package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Long;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class FlowKt__DelayKt$debounce$2 extends Lambda implements u7.l<Object, Long> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ long f15224j = 250;

    public FlowKt__DelayKt$debounce$2() {
        super(1);
    }

    @Override // u7.l
    public final Long U(Object obj) {
        return Long.valueOf(this.f15224j);
    }
}
