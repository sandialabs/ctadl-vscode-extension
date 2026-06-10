package n9;

import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue;
import v7.g;

/* loaded from: classes.dex */
public abstract class a implements Comparable<a> {
    public abstract void a();

    public abstract void b();

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        a aVar2 = aVar;
        g.f(aVar2, "other");
        a();
        DeprecationLevelValue deprecationLevelValue = DeprecationLevelValue.ERROR;
        aVar2.a();
        int compareTo = deprecationLevelValue.compareTo(deprecationLevelValue);
        if (compareTo == 0) {
            b();
        }
        return compareTo;
    }
}
