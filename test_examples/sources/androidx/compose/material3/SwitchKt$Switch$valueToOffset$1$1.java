package androidx.compose.material3;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchKt$Switch$valueToOffset$1$1 extends Lambda implements l<Boolean, Float> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ float f2558j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ float f2559k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$valueToOffset$1$1(float f10, float f11) {
        super(1);
        this.f2558j = f10;
        this.f2559k = f11;
    }

    @Override // u7.l
    public final Float U(Boolean bool) {
        float f10;
        if (bool.booleanValue()) {
            f10 = this.f2558j;
        } else {
            f10 = this.f2559k;
        }
        return Float.valueOf(f10);
    }
}
