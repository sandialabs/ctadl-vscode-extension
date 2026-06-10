package da;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class a<K, V> implements Iterable<V>, w7.a {

    /* renamed from: da.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0107a<K, V, T extends V> {

        /* renamed from: a  reason: collision with root package name */
        public final c8.b<? extends K> f10474a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10475b;

        public AbstractC0107a(c8.b<? extends K> bVar, int i10) {
            this.f10474a = bVar;
            this.f10475b = i10;
        }
    }

    public abstract b<V> c();

    public final boolean isEmpty() {
        if (((d) this).f10480i.c() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return c().iterator();
    }
}
