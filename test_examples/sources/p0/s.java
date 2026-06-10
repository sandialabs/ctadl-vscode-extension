package p0;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class s<K, V> extends t<K, V> implements Iterator<Map.Entry<K, V>>, w7.a, j$.util.Iterator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(o<K, V> oVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(oVar, it);
        v7.g.f(oVar, "map");
        v7.g.f(it, "iterator");
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        a();
        if (this.f16627l != null) {
            return new r(this);
        }
        throw new IllegalStateException();
    }
}
