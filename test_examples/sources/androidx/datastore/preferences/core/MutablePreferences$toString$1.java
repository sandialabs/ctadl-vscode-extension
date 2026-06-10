package androidx.datastore.preferences.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m3.a;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "Lm3/a$a;", "", "entry", "", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class MutablePreferences$toString$1 extends Lambda implements l<Map.Entry<a.C0185a<?>, Object>, CharSequence> {

    /* renamed from: j  reason: collision with root package name */
    public static final MutablePreferences$toString$1 f4769j = new MutablePreferences$toString$1();

    public MutablePreferences$toString$1() {
        super(1);
    }

    @Override // u7.l
    public final CharSequence U(Map.Entry<a.C0185a<?>, Object> entry) {
        Map.Entry<a.C0185a<?>, Object> entry2 = entry;
        g.f(entry2, "entry");
        return "  " + entry2.getKey().f15975a + " = " + entry2.getValue();
    }
}
