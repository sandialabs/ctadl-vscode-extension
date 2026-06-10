package androidx.compose.foundation;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollState$scrollableState$1 extends Lambda implements l<Float, Float> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ScrollState f1587j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollState$scrollableState$1(ScrollState scrollState) {
        super(1);
        this.f1587j = scrollState;
    }

    @Override // u7.l
    public final Float U(Float f10) {
        boolean z10;
        float floatValue = f10.floatValue();
        ScrollState scrollState = this.f1587j;
        float d5 = scrollState.d() + floatValue + scrollState.f1583d;
        float b02 = a1.c.b0(d5, 0.0f, ((Number) scrollState.c.getValue()).intValue());
        if (d5 == b02) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = !z10;
        float d10 = b02 - scrollState.d();
        int g12 = m0.b.g1(d10);
        scrollState.f1581a.setValue(Integer.valueOf(scrollState.d() + g12));
        scrollState.f1583d = d10 - g12;
        if (z11) {
            floatValue = d10;
        }
        return Float.valueOf(floatValue);
    }
}
