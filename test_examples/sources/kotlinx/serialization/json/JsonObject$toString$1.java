package kotlinx.serialization.json;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;
import wa.v;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lkotlinx/serialization/json/b;", "<name for destructuring parameter 0>", "", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class JsonObject$toString$1 extends Lambda implements l<Map.Entry<? extends String, ? extends b>, CharSequence> {

    /* renamed from: j  reason: collision with root package name */
    public static final JsonObject$toString$1 f15675j = new JsonObject$toString$1();

    public JsonObject$toString$1() {
        super(1);
    }

    @Override // u7.l
    public final CharSequence U(Map.Entry<? extends String, ? extends b> entry) {
        Map.Entry<? extends String, ? extends b> entry2 = entry;
        g.f(entry2, "<name for destructuring parameter 0>");
        StringBuilder sb = new StringBuilder();
        v.a(entry2.getKey(), sb);
        sb.append(':');
        sb.append(entry2.getValue());
        String sb2 = sb.toString();
        g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
