package k0;

import java.util.Map;

/* loaded from: classes.dex */
public final class u<K, V> extends t<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        int i10 = this.f12863k + 2;
        this.f12863k = i10;
        Object[] objArr = this.f12861i;
        return new a(objArr[i10 - 2], objArr[i10 - 1]);
    }
}
