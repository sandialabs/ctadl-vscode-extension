package h9;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import n7.l;

/* loaded from: classes.dex */
public final class i {
    static {
        new c("java.lang").c(e.k("annotation"));
    }

    public static final b a(String str) {
        c cVar = h.f11581a;
        return new b(h.f11581a, e.k(str));
    }

    public static final b b(String str) {
        c cVar = h.f11581a;
        return new b(h.c, e.k(str));
    }

    public static final LinkedHashMap c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> entrySet = linkedHashMap.entrySet();
        int O0 = m0.b.O0(l.Z1(entrySet, 10));
        if (O0 < 16) {
            O0 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(O0);
        for (Map.Entry entry : entrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
        return linkedHashMap2;
    }

    public static final b d(e eVar) {
        c cVar = h.f11581a;
        b bVar = h.f11588i;
        c h10 = bVar.h();
        return new b(h10, e.k(eVar.i() + bVar.j().i()));
    }

    public static final void e(String str) {
        c cVar = h.f11581a;
        new b(h.f11583d, e.k(str));
    }

    public static final b f(String str) {
        c cVar = h.f11581a;
        return new b(h.f11582b, e.k(str));
    }

    public static final b g(b bVar) {
        c cVar = h.f11581a;
        c cVar2 = h.f11581a;
        return new b(cVar2, e.k("U" + bVar.j().i()));
    }
}
