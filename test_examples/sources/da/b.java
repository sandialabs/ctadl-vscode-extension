package da;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class b<T> implements Iterable<T>, w7.a {
    public abstract int c();

    public abstract void d(int i10, T t10);

    public abstract T get(int i10);

    @Override // java.lang.Iterable
    public abstract Iterator<T> iterator();
}
