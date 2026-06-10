package androidx.compose.ui.graphics.colorspace;

import a1.c;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class Rgb$oetf$1 extends Lambda implements l<Double, Double> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Rgb f3137j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb$oetf$1(Rgb rgb) {
        super(1);
        this.f3137j = rgb;
    }

    @Override // u7.l
    public final Double U(Double d5) {
        double doubleValue = d5.doubleValue();
        Rgb rgb = this.f3137j;
        return Double.valueOf(c.a0(rgb.f3125k.U(Double.valueOf(doubleValue)).doubleValue(), rgb.f3119e, rgb.f3120f));
    }
}
