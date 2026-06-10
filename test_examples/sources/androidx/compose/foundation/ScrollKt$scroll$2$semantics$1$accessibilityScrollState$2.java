package androidx.compose.foundation;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2 extends Lambda implements u7.a<Float> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ScrollState f1579j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2(ScrollState scrollState) {
        super(0);
        this.f1579j = scrollState;
    }

    @Override // u7.a
    public final Float k0() {
        return Float.valueOf(((Number) this.f1579j.c.getValue()).intValue());
    }
}
