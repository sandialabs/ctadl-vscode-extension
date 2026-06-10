package androidx.compose.foundation;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/ScrollState;", "it", "", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollState$Companion$Saver$2 extends Lambda implements l<Integer, ScrollState> {

    /* renamed from: j  reason: collision with root package name */
    public static final ScrollState$Companion$Saver$2 f1586j = new ScrollState$Companion$Saver$2();

    public ScrollState$Companion$Saver$2() {
        super(1);
    }

    @Override // u7.l
    public final ScrollState U(Integer num) {
        return new ScrollState(num.intValue());
    }
}
