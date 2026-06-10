package kotlin.collections;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010&\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003 \u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "K", "V", "it", "", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AbstractMap$toString$1 extends Lambda implements l<Map.Entry<? extends K, ? extends V>, CharSequence> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AbstractMap<K, V> f12978j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractMap$toString$1(AbstractMap<K, ? extends V> abstractMap) {
        super(1);
        this.f12978j = abstractMap;
    }

    @Override // u7.l
    public final CharSequence U(Object obj) {
        String valueOf;
        Map.Entry entry = (Map.Entry) obj;
        g.f(entry, "it");
        Object obj2 = this.f12978j;
        obj2.getClass();
        StringBuilder sb = new StringBuilder();
        Object key = entry.getKey();
        String str = "(this Map)";
        if (key == obj2) {
            valueOf = "(this Map)";
        } else {
            valueOf = String.valueOf(key);
        }
        sb.append(valueOf);
        sb.append('=');
        Object value = entry.getValue();
        if (value != obj2) {
            str = String.valueOf(value);
        }
        sb.append(str);
        return sb.toString();
    }
}
