package androidx.compose.ui.graphics.colorspace;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ColorSpaces$ExtendedSrgb$2 extends Lambda implements l<Double, Double> {

    /* renamed from: j  reason: collision with root package name */
    public static final ColorSpaces$ExtendedSrgb$2 f3116j = new ColorSpaces$ExtendedSrgb$2();

    public ColorSpaces$ExtendedSrgb$2() {
        super(1);
    }

    @Override // u7.l
    public final Double U(Double d5) {
        double d10;
        double d11;
        double doubleValue = d5.doubleValue();
        if (doubleValue < 0.0d) {
            d10 = -doubleValue;
        } else {
            d10 = doubleValue;
        }
        if (d10 >= 0.04045d) {
            d11 = Math.pow((0.9478672985781991d * d10) + 0.05213270142180095d, 2.4d);
        } else {
            d11 = d10 * 0.07739938080495357d;
        }
        return Double.valueOf(Math.copySign(d11, doubleValue));
    }
}
