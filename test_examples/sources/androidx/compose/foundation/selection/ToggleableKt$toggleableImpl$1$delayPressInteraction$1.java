package androidx.compose.foundation.selection;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class ToggleableKt$toggleableImpl$1$delayPressInteraction$1 extends Lambda implements u7.a<Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g0<Boolean> f2065j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ u7.a<Boolean> f2066k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleableKt$toggleableImpl$1$delayPressInteraction$1(g0<Boolean> g0Var, u7.a<Boolean> aVar) {
        super(0);
        this.f2065j = g0Var;
        this.f2066k = aVar;
    }

    @Override // u7.a
    public final Boolean k0() {
        boolean z10;
        if (!this.f2065j.getValue().booleanValue() && !this.f2066k.k0().booleanValue()) {
            z10 = false;
            return Boolean.valueOf(z10);
        }
        z10 = true;
        return Boolean.valueOf(z10);
    }
}
