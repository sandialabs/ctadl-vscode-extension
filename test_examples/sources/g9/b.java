package g9;

import ha.i;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f11267a = kotlin.collections.c.t2(a1.c.O0('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f11268b;

    static {
        int i10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List O0 = a1.c.O0("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int E0 = a1.c.E0(0, O0.size() - 1, 2);
        if (E0 >= 0) {
            int i11 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f11267a;
                sb.append(str);
                sb.append('/');
                sb.append((String) O0.get(i11));
                linkedHashMap.put(sb.toString(), O0.get(i11 + 1));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(androidx.activity.e.k(sb2, (String) O0.get(i11), "Array"), "[" + ((String) O0.get(i10)));
                if (i11 == E0) {
                    break;
                }
                i11 += 2;
            }
        }
        linkedHashMap.put(f11267a + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : a1.c.O0("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : a1.c.O0("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i12 = 0; i12 < 23; i12++) {
            String g10 = androidx.activity.e.g("Function", i12);
            StringBuilder sb3 = new StringBuilder();
            String str4 = f11267a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i12);
            a(linkedHashMap, g10, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i12, str4 + "/reflect/KFunction");
        }
        for (String str5 : a1.c.O0("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, a4.b.l(str5, ".Companion"), f11267a + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f11268b = linkedHashMap;
    }

    public static final void a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(f11267a + '/' + str, "L" + str2 + ';');
    }

    public static final String b(String str) {
        v7.g.f(str, "classId");
        String str2 = (String) f11268b.get(str);
        if (str2 == null) {
            return "L" + i.V0(str, '.', '$') + ';';
        }
        return str2;
    }
}
