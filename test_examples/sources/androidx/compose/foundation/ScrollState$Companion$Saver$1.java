package androidx.compose.foundation;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import o0.g;
import u7.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo0/g;", "Landroidx/compose/foundation/ScrollState;", "it", "", "invoke", "(Lo0/g;Landroidx/compose/foundation/ScrollState;)Ljava/lang/Integer;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ScrollState$Companion$Saver$1 extends Lambda implements p<g, ScrollState, Integer> {

    /* renamed from: j  reason: collision with root package name */
    public static final ScrollState$Companion$Saver$1 f1585j = new ScrollState$Companion$Saver$1();

    public ScrollState$Companion$Saver$1() {
        super(2);
    }

    @Override // u7.p
    public final Integer R(g gVar, ScrollState scrollState) {
        ScrollState scrollState2 = scrollState;
        v7.g.f(gVar, "$this$Saver");
        v7.g.f(scrollState2, "it");
        return Integer.valueOf(scrollState2.d());
    }
}
