package sa;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements Iterator<String>, w7.a, j$.util.Iterator {

    /* renamed from: i  reason: collision with root package name */
    public int f17527i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e f17528j;

    public f(e eVar) {
        this.f17528j = eVar;
        this.f17527i = eVar.c();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super String> consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f17527i > 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        e eVar = this.f17528j;
        int c = eVar.c();
        int i10 = this.f17527i;
        this.f17527i = i10 - 1;
        return eVar.d(c - i10);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
