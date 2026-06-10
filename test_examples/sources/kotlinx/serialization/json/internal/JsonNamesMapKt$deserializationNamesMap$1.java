package kotlinx.serialization.json.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import sa.e;
import va.m;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JsonNamesMapKt$deserializationNamesMap$1 extends Lambda implements u7.a<Map<String, ? extends Integer>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e f15679j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ va.a f15680k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonNamesMapKt$deserializationNamesMap$1(e eVar, va.a aVar) {
        super(0);
        this.f15679j = eVar;
        this.f15680k = aVar;
    }

    @Override // u7.a
    public final Map<String, ? extends Integer> k0() {
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e eVar = this.f15679j;
        b.c(eVar, this.f15680k);
        int c = eVar.c();
        for (int i10 = 0; i10 < c; i10++) {
            List<Annotation> g10 = eVar.g(i10);
            ArrayList arrayList = new ArrayList();
            for (Object obj : g10) {
                if (obj instanceof m) {
                    arrayList.add(obj);
                }
            }
            m mVar = (m) kotlin.collections.c.E2(arrayList);
            if (mVar != null && (names = mVar.names()) != null) {
                for (String str : names) {
                    if (!linkedHashMap.containsKey(str)) {
                        linkedHashMap.put(str, Integer.valueOf(i10));
                    } else {
                        StringBuilder p10 = a4.b.p("The suggested name '", str, "' for property ");
                        p10.append(eVar.d(i10));
                        p10.append(" is already one of the names for property ");
                        p10.append(eVar.d(((Number) kotlin.collections.d.L1(str, linkedHashMap)).intValue()));
                        p10.append(" in ");
                        p10.append(eVar);
                        throw new JsonException(p10.toString());
                    }
                }
                continue;
            }
        }
        if (linkedHashMap.isEmpty()) {
            return kotlin.collections.d.K1();
        }
        return linkedHashMap;
    }
}
