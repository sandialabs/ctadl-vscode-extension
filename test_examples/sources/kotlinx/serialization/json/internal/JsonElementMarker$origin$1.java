package kotlinx.serialization.json.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import sa.e;
import u7.p;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements p<e, Integer, Boolean> {
    public JsonElementMarker$origin$1(Object obj) {
        super(2, obj, JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z");
    }

    @Override // u7.p
    public final Boolean R(e eVar, Integer num) {
        boolean z10;
        e eVar2 = eVar;
        int intValue = num.intValue();
        g.f(eVar2, "p0");
        JsonElementMarker jsonElementMarker = (JsonElementMarker) this.f13048j;
        jsonElementMarker.getClass();
        if (!eVar2.k(intValue) && eVar2.j(intValue).f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        jsonElementMarker.f15678b = z10;
        return Boolean.valueOf(z10);
    }
}
