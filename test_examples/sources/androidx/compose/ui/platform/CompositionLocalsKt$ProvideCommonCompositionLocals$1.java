package androidx.compose.ui.platform;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CompositionLocalsKt$ProvideCommonCompositionLocals$1 extends Lambda implements u7.p<g0.d, Integer, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ l1.b0 f3732j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ d1 f3733k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ u7.p<g0.d, Integer, m7.n> f3734l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f3735m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CompositionLocalsKt$ProvideCommonCompositionLocals$1(l1.b0 b0Var, d1 d1Var, u7.p<? super g0.d, ? super Integer, m7.n> pVar, int i10) {
        super(2);
        this.f3732j = b0Var;
        this.f3733k = d1Var;
        this.f3734l = pVar;
        this.f3735m = i10;
    }

    @Override // u7.p
    public final m7.n R(g0.d dVar, Integer num) {
        num.intValue();
        d1 d1Var = this.f3733k;
        u7.p<g0.d, Integer, m7.n> pVar = this.f3734l;
        CompositionLocalsKt.a(this.f3732j, d1Var, pVar, dVar, this.f3735m | 1);
        return m7.n.f16010a;
    }
}
