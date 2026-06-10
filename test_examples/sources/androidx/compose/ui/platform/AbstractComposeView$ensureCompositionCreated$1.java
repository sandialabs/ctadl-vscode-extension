package androidx.compose.ui.platform;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "(Lg0/d;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class AbstractComposeView$ensureCompositionCreated$1 extends Lambda implements u7.p<g0.d, Integer, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AbstractComposeView f3557j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractComposeView$ensureCompositionCreated$1(AbstractComposeView abstractComposeView) {
        super(2);
        this.f3557j = abstractComposeView;
    }

    @Override // u7.p
    public final m7.n R(g0.d dVar, Integer num) {
        g0.d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return m7.n.f16010a;
        }
        u7.q<g0.c<?>, g0.z0, g0.t0, m7.n> qVar = ComposerKt.f2737a;
        this.f3557j.a(dVar2, 8);
        return m7.n.f16010a;
    }
}
