package androidx.compose.ui.platform;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3 extends Lambda implements u7.p<g0.d, Integer, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f3668j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ y f3669k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ u7.p<g0.d, Integer, m7.n> f3670l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f3671m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3(AndroidComposeView androidComposeView, y yVar, u7.p<? super g0.d, ? super Integer, m7.n> pVar, int i10) {
        super(2);
        this.f3668j = androidComposeView;
        this.f3669k = yVar;
        this.f3670l = pVar;
        this.f3671m = i10;
    }

    @Override // u7.p
    public final m7.n R(g0.d dVar, Integer num) {
        g0.d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return m7.n.f16010a;
        }
        u7.q<g0.c<?>, g0.z0, g0.t0, m7.n> qVar = ComposerKt.f2737a;
        y yVar = this.f3669k;
        u7.p<g0.d, Integer, m7.n> pVar = this.f3670l;
        CompositionLocalsKt.a(this.f3668j, yVar, pVar, dVar2, ((this.f3671m << 3) & 896) | 72);
        return m7.n.f16010a;
    }
}
