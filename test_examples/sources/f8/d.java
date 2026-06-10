package f8;

import java.util.Comparator;
import kotlin.reflect.KParameter;

/* loaded from: classes.dex */
public final class d<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        return a1.c.g0(((KParameter) t10).getName(), ((KParameter) t11).getName());
    }
}
