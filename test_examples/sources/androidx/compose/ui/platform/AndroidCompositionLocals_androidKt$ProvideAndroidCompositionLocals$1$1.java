package androidx.compose.ui.platform;

import android.content.res.Configuration;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1 extends Lambda implements u7.l<Configuration, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g0.g0<Configuration> f3666j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1(g0.g0<Configuration> g0Var) {
        super(1);
        this.f3666j = g0Var;
    }

    @Override // u7.l
    public final m7.n U(Configuration configuration) {
        Configuration configuration2 = configuration;
        v7.g.f(configuration2, "it");
        this.f3666j.setValue(configuration2);
        return m7.n.f16010a;
    }
}
