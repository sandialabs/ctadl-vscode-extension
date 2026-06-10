package k0;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h<K, V> implements Iterator<Map.Entry<K, V>>, w7.a, j$.util.Iterator {

    /* renamed from: i  reason: collision with root package name */
    public final f<K, V, Map.Entry<K, V>> f12849i;

    public h(e<K, V> eVar) {
        v7.g.f(eVar, "builder");
        t[] tVarArr = new t[8];
        for (int i10 = 0; i10 < 8; i10++) {
            tVarArr[i10] = new w(this);
        }
        this.f12849i = new f<>(eVar, tVarArr);
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
    public final boolean hasNext() {
        return this.f12849i.f12838k;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        return this.f12849i.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.f12849i.remove();
    }
}
