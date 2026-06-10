package androidx.compose.animation.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "t", "invoke", "(D)Ljava/lang/Double;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
final class SpringEstimationKt$estimateOverDamped$fnPrime$1 extends Lambda implements l<Double, Double> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ double f1303j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ double f1304k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ double f1305l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ double f1306m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpringEstimationKt$estimateOverDamped$fnPrime$1(double d5, double d10, double d11, double d12) {
        super(1);
        this.f1303j = d5;
        this.f1304k = d10;
        this.f1305l = d11;
        this.f1306m = d12;
    }

    @Override // u7.l
    public final Double U(Double d5) {
        double doubleValue = d5.doubleValue();
        double d10 = this.f1303j;
        double d11 = this.f1304k;
        double exp = Math.exp(d11 * doubleValue) * d10 * d11;
        double d12 = this.f1305l;
        double d13 = this.f1306m;
        return Double.valueOf((Math.exp(d13 * doubleValue) * d12 * d13) + exp);
    }
}
