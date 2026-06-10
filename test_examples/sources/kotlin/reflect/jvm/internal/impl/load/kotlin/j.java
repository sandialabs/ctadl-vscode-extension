package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class j {
    public static String[] a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static LinkedHashSet b(String str, String... strArr) {
        v7.g.f(str, "internalName");
        v7.g.f(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet c(String str, String... strArr) {
        v7.g.f(strArr, "signatures");
        return b("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet d(String str, String... strArr) {
        return b("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static String e(String str, ArrayList arrayList, String str2) {
        v7.g.f(str, "name");
        v7.g.f(str2, "ret");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(kotlin.collections.c.t2(arrayList, "", null, null, SignatureBuildingComponents$jvmDescriptor$1.f13923j, 30));
        sb.append(')');
        if (str2.length() > 1) {
            str2 = "L" + str2 + ';';
        }
        sb.append(str2);
        return sb.toString();
    }

    public static String f(String str, String str2) {
        v7.g.f(str, "internalName");
        v7.g.f(str2, "jvmDescriptor");
        return str + '.' + str2;
    }
}
