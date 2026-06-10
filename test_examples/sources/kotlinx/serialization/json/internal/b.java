package kotlinx.serialization.json.internal;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.b;
import kotlinx.serialization.json.internal.a;
import sa.e;
import v7.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a.C0177a<Map<String, Integer>> f15697a = new a.C0177a<>();

    public static final int a(String str, e eVar, va.a aVar) {
        g.f(eVar, "<this>");
        g.f(aVar, "json");
        g.f(str, "name");
        c(eVar, aVar);
        int a10 = eVar.a(str);
        if (a10 != -3) {
            return a10;
        }
        if (!aVar.f18191a.f18219l) {
            return a10;
        }
        a.C0177a<Map<String, Integer>> c0177a = f15697a;
        JsonNamesMapKt$deserializationNamesMap$1 jsonNamesMapKt$deserializationNamesMap$1 = new JsonNamesMapKt$deserializationNamesMap$1(eVar, aVar);
        a aVar2 = aVar.c;
        aVar2.getClass();
        Object a11 = aVar2.a(eVar, c0177a);
        if (a11 == null) {
            a11 = jsonNamesMapKt$deserializationNamesMap$1.k0();
            ConcurrentHashMap concurrentHashMap = aVar2.f15696a;
            Object obj = concurrentHashMap.get(eVar);
            if (obj == null) {
                obj = new ConcurrentHashMap(2);
                concurrentHashMap.put(eVar, obj);
            }
            ((Map) obj).put(c0177a, a11);
        }
        Integer num = (Integer) ((Map) a11).get(str);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    public static final int b(e eVar, va.a aVar, String str, String str2) {
        g.f(eVar, "<this>");
        g.f(aVar, "json");
        g.f(str, "name");
        g.f(str2, "suffix");
        int a10 = a(str, eVar, aVar);
        if (a10 != -3) {
            return a10;
        }
        throw new SerializationException(eVar.b() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final void c(e eVar, va.a aVar) {
        g.f(eVar, "<this>");
        g.f(aVar, "json");
        if (g.a(eVar.h(), b.a.f15609a)) {
            aVar.f18191a.getClass();
        }
    }
}
