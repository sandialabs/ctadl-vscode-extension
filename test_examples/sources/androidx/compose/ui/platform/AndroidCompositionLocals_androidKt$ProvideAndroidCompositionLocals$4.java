package androidx.compose.ui.platform;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4 extends Lambda implements u7.p<g0.d, Integer, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f3672j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ u7.p<g0.d, Integer, m7.n> f3673k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f3674l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4(AndroidComposeView androidComposeView, u7.p<? super g0.d, ? super Integer, m7.n> pVar, int i10) {
        super(2);
        this.f3672j = androidComposeView;
        this.f3673k = pVar;
        this.f3674l = i10;
    }

    @Override // u7.p
    public final m7.n R(g0.d dVar, Integer num) {
        num.intValue();
        AndroidCompositionLocals_androidKt.a(this.f3672j, this.f3673k, dVar, this.f3674l | 1);
        return m7.n.f16010a;
    }
}
