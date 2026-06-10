package kotlinx.serialization.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.b;
import sa.e;
import ua.f0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lsa/e;", "invoke", "()[Lsa/e;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PluginGeneratedSerialDescriptor$typeParameterDescriptors$2 extends Lambda implements u7.a<e[]> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ PluginGeneratedSerialDescriptor f15648j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginGeneratedSerialDescriptor$typeParameterDescriptors$2(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        super(0);
        this.f15648j = pluginGeneratedSerialDescriptor;
    }

    @Override // u7.a
    public final e[] k0() {
        ArrayList arrayList;
        f0<?> f0Var = this.f15648j.f15636b;
        if (f0Var != null) {
            f0Var.d();
            arrayList = new ArrayList(0);
        } else {
            arrayList = null;
        }
        return b.H(arrayList);
    }
}
