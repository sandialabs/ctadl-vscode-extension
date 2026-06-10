package j$.util.concurrent;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class e extends AbstractC0263b implements Iterator, j$.util.Iterator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e(m[] mVarArr, int i10, int i11, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i10, i11, concurrentHashMap);
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
        m mVar = this.f12157b;
        if (mVar != null) {
            Object obj = mVar.f12151b;
            Object obj2 = mVar.c;
            this.f12140j = mVar;
            e();
            return new l(obj, obj2, this.f12139i);
        }
        throw new NoSuchElementException();
    }
}
