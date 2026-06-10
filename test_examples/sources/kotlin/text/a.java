package kotlin.text;

import a1.c;
import ha.i;
import ha.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n7.l;
import v7.g;

/* loaded from: classes.dex */
public class a extends a1.b {
    public static final String N0(String str) {
        int i10;
        Comparable comparable;
        int i11;
        String str2;
        g.f(str, "<this>");
        List<String> h12 = b.h1(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : h12) {
            if (!i.T0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(l.Z1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            int length = str3.length();
            while (true) {
                if (i10 < length) {
                    if (!a1.b.o0(str3.charAt(i10))) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 == -1) {
                i10 = str3.length();
            }
            arrayList2.add(Integer.valueOf(i10));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = 0;
        }
        int size = (h12.size() * 0) + str.length();
        StringsKt__IndentKt$getIndentFunction$1 stringsKt__IndentKt$getIndentFunction$1 = StringsKt__IndentKt$getIndentFunction$1.f15130j;
        int B0 = c.B0(h12);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : h12) {
            int i12 = i10 + 1;
            if (i10 >= 0) {
                String str4 = (String) obj2;
                if ((i10 == 0 || i10 == B0) && i.T0(str4)) {
                    str2 = null;
                } else {
                    str2 = (String) stringsKt__IndentKt$getIndentFunction$1.U(j.x1(str4, i11));
                }
                if (str2 != null) {
                    arrayList3.add(str2);
                }
                i10 = i12;
            } else {
                c.F1();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(size);
        kotlin.collections.c.s2(arrayList3, sb, "\n", null, null, null, 124);
        String sb2 = sb.toString();
        g.e(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }
}
