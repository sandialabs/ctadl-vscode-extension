package kotlinx.serialization.descriptors;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SerialDescriptorImpl$toString$1 extends Lambda implements l<Integer, CharSequence> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SerialDescriptorImpl f15607j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerialDescriptorImpl$toString$1(SerialDescriptorImpl serialDescriptorImpl) {
        super(1);
        this.f15607j = serialDescriptorImpl;
    }

    @Override // u7.l
    public final CharSequence U(Integer num) {
        int intValue = num.intValue();
        StringBuilder sb = new StringBuilder();
        SerialDescriptorImpl serialDescriptorImpl = this.f15607j;
        sb.append(serialDescriptorImpl.f15599f[intValue]);
        sb.append(": ");
        sb.append(serialDescriptorImpl.f15600g[intValue].b());
        return sb.toString();
    }
}
