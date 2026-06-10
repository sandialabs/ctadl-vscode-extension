package androidx.compose.animation.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "t", "invoke", "(D)Ljava/lang/Double;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
final class SpringEstimationKt$estimateOverDamped$fn$1 extends Lambda implements l<Double, Double> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ double f1299j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ double f1300k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ double f1301l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ double f1302m;
    public final /* synthetic */ double n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpringEstimationKt$estimateOverDamped$fn$1(double d5, double d10, double d11, double d12, double d13) {
        super(1);
        this.f1299j = d5;
        this.f1300k = d10;
        this.f1301l = d11;
        this.f1302m = d12;
        this.n = d13;
    }

    @Override // u7.l
    public final Double U(Double d5) {
        double doubleValue = d5.doubleValue();
        return Double.valueOf((Math.exp(this.f1302m * doubleValue) * this.f1301l) + (Math.exp(this.f1300k * doubleValue) * this.f1299j) + this.n);
    }
}
