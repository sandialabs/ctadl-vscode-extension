package u1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f17750a;

    public l(k... kVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (k kVar : kVarArr) {
            String c = kVar.c();
            Object obj = linkedHashMap.get(c);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c, obj);
            }
            ((List) obj).add(kVar);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            boolean z10 = true;
            if (list.size() != 1) {
                z10 = false;
            }
            if (z10) {
                n7.n.f2(list, arrayList);
            } else {
                throw new IllegalArgumentException(androidx.activity.e.j(a4.b.p("'", str, "' must be unique. Actual [ ["), kotlin.collections.c.t2(list, null, null, null, null, 63), ']').toString());
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f17750a = arrayList2;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size && !((k) arrayList2.get(i10)).a(); i10++) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && v7.g.a(this.f17750a, ((l) obj).f17750a);
    }

    public final int hashCode() {
        return this.f17750a.hashCode();
    }
}
