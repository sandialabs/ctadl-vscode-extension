package kotlinx.serialization.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "i", "", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PluginGeneratedSerialDescriptor$toString$1 extends Lambda implements l<Integer, CharSequence> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ PluginGeneratedSerialDescriptor f15647j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginGeneratedSerialDescriptor$toString$1(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        super(1);
        this.f15647j = pluginGeneratedSerialDescriptor;
    }

    @Override // u7.l
    public final CharSequence U(Integer num) {
        int intValue = num.intValue();
        StringBuilder sb = new StringBuilder();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.f15647j;
        sb.append(pluginGeneratedSerialDescriptor.f15638e[intValue]);
        sb.append(": ");
        sb.append(pluginGeneratedSerialDescriptor.j(intValue).b());
        return sb.toString();
    }
}
