package androidx.compose.material3;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TextKt$ProvideTextStyle$1 extends Lambda implements p<g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ p1.p f2575j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2576k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f2577l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextKt$ProvideTextStyle$1(p1.p pVar, p<? super g0.d, ? super Integer, n> pVar2, int i10) {
        super(2);
        this.f2575j = pVar;
        this.f2576k = pVar2;
        this.f2577l = i10;
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        num.intValue();
        TextKt.a(this.f2575j, this.f2576k, dVar, this.f2577l | 1);
        return n.f16010a;
    }
}
