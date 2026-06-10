package androidx.compose.ui.platform;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ComposeView$Content$1 extends Lambda implements u7.p<g0.d, Integer, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ComposeView f3698j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f3699k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeView$Content$1(ComposeView composeView, int i10) {
        super(2);
        this.f3698j = composeView;
        this.f3699k = i10;
    }

    @Override // u7.p
    public final m7.n R(g0.d dVar, Integer num) {
        num.intValue();
        this.f3698j.a(dVar, this.f3699k | 1);
        return m7.n.f16010a;
    }
}
