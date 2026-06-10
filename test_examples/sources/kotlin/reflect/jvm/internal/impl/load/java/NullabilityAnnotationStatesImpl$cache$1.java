package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class NullabilityAnnotationStatesImpl$cache$1 extends Lambda implements l<h9.c, T> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NullabilityAnnotationStatesImpl<T> f13624j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NullabilityAnnotationStatesImpl$cache$1(NullabilityAnnotationStatesImpl<T> nullabilityAnnotationStatesImpl) {
        super(1);
        this.f13624j = nullabilityAnnotationStatesImpl;
    }

    @Override // u7.l
    public final Object U(h9.c cVar) {
        Object next;
        h9.c cVar2 = cVar;
        g.e(cVar2, "it");
        Map<h9.c, T> map = this.f13624j.f13623b;
        g.f(map, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean z10 = true;
            h9.c cVar3 = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            h9.c cVar4 = (h9.c) entry.getKey();
            if (!g.a(cVar2, cVar4)) {
                g.f(cVar4, "packageName");
                if (!cVar2.d()) {
                    cVar3 = cVar2.e();
                }
                if (!g.a(cVar3, cVar4)) {
                    z10 = false;
                }
            }
            if (z10) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!(!linkedHashMap.isEmpty())) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                int length = kotlin.reflect.jvm.internal.impl.name.a.b((h9.c) ((Map.Entry) next).getKey(), cVar2).b().length();
                do {
                    Object next2 = it2.next();
                    int length2 = kotlin.reflect.jvm.internal.impl.name.a.b((h9.c) ((Map.Entry) next2).getKey(), cVar2).b().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it2.hasNext());
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 == null) {
            return null;
        }
        return entry2.getValue();
    }
}
