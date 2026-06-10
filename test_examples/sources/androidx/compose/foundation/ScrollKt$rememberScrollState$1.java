package androidx.compose.foundation;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollKt$rememberScrollState$1 extends Lambda implements u7.a<ScrollState> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f1562j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollKt$rememberScrollState$1(int i10) {
        super(0);
        this.f1562j = i10;
    }

    @Override // u7.a
    public final ScrollState k0() {
        return new ScrollState(this.f1562j);
    }
}
