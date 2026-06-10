package androidx.compose.ui.platform;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2 extends Lambda implements u7.l<g0.q, g0.p> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ h0 f3667j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2(h0 h0Var) {
        super(1);
        this.f3667j = h0Var;
    }

    @Override // u7.l
    public final g0.p U(g0.q qVar) {
        v7.g.f(qVar, "$this$DisposableEffect");
        return new t(this.f3667j);
    }
}
