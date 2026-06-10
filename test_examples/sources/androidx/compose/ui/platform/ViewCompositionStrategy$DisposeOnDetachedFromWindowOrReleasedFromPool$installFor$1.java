package androidx.compose.ui.platform;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1 extends Lambda implements u7.a<m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AbstractComposeView f3760j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ g1 f3761k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ g3.a f3762l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(AbstractComposeView abstractComposeView, g1 g1Var, h1 h1Var) {
        super(0);
        this.f3760j = abstractComposeView;
        this.f3761k = g1Var;
        this.f3762l = h1Var;
    }

    @Override // u7.a
    public final m7.n k0() {
        AbstractComposeView abstractComposeView = this.f3760j;
        abstractComposeView.removeOnAttachStateChangeListener(this.f3761k);
        g3.a aVar = this.f3762l;
        v7.g.f(aVar, "listener");
        a1.b.Y(abstractComposeView).f11221a.remove(aVar);
        return m7.n.f16010a;
    }
}
