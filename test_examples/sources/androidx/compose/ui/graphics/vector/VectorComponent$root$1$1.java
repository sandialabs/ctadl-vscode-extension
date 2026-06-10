package androidx.compose.ui.graphics.vector;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class VectorComponent$root$1$1 extends Lambda implements a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ VectorComponent f3172j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorComponent$root$1$1(VectorComponent vectorComponent) {
        super(0);
        this.f3172j = vectorComponent;
    }

    @Override // u7.a
    public final n k0() {
        VectorComponent vectorComponent = this.f3172j;
        vectorComponent.c = true;
        vectorComponent.f3164e.k0();
        return n.f16010a;
    }
}
