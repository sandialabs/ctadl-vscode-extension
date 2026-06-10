package kotlinx.serialization.descriptors;

import a1.c;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SerialDescriptorImpl$_hashCode$2 extends Lambda implements u7.a<Integer> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SerialDescriptorImpl f15606j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerialDescriptorImpl$_hashCode$2(SerialDescriptorImpl serialDescriptorImpl) {
        super(0);
        this.f15606j = serialDescriptorImpl;
    }

    @Override // u7.a
    public final Integer k0() {
        SerialDescriptorImpl serialDescriptorImpl = this.f15606j;
        return Integer.valueOf(c.J0(serialDescriptorImpl, serialDescriptorImpl.f15604k));
    }
}
