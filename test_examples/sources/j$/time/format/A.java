package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class A {

    /* renamed from: a  reason: collision with root package name */
    private final Map f11901a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap f11902b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(Map map) {
        Comparator comparator;
        Comparator comparator2;
        this.f11901a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                int i10 = B.c;
                hashMap2.put((String) entry2.getValue(), new AbstractMap.SimpleImmutableEntry((String) entry2.getValue(), (Long) entry2.getKey()));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            comparator2 = B.f11904b;
            Collections.sort(arrayList2, comparator2);
            hashMap.put((G) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        comparator = B.f11904b;
        Collections.sort(arrayList, comparator);
        this.f11902b = hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(long j2, G g10) {
        Map map = (Map) this.f11901a.get(g10);
        if (map != null) {
            return (String) map.get(Long.valueOf(j2));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator b(G g10) {
        List list = (List) this.f11902b.get(g10);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
