package n7;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class m extends l {
    public static final <T> void d2(List<T> list, Comparator<? super T> comparator) {
        v7.g.f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
