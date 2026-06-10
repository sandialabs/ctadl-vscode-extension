package androidx.compose.ui.platform;

import android.content.res.Configuration;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Configuration;", "it", "Lm7/n;", "invoke", "(Landroid/content/res/Configuration;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class AndroidComposeView$configurationChangeObserver$1 extends Lambda implements u7.l<Configuration, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public static final AndroidComposeView$configurationChangeObserver$1 f3603j = new AndroidComposeView$configurationChangeObserver$1();

    public AndroidComposeView$configurationChangeObserver$1() {
        super(1);
    }

    @Override // u7.l
    public final m7.n U(Configuration configuration) {
        v7.g.f(configuration, "it");
        return m7.n.f16010a;
    }
}
