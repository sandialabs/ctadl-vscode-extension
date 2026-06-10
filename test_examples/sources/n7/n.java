package n7;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class n extends m {
    public static final int e2(int i10, List list) {
        if (new b8.i(0, a1.c.B0(list)).s(i10)) {
            return a1.c.B0(list) - i10;
        }
        StringBuilder o10 = a4.b.o("Element index ", i10, " must be in range [");
        o10.append(new b8.i(0, a1.c.B0(list)));
        o10.append("].");
        throw new IndexOutOfBoundsException(o10.toString());
    }

    public static final void f2(Iterable iterable, Collection collection) {
        v7.g.f(collection, "<this>");
        v7.g.f(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        for (Object obj : iterable) {
            collection.add(obj);
        }
    }
}
