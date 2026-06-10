package j$.util.concurrent;

import j$.util.AbstractC0261c;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.stream.AbstractC0421w0;
import j$.util.stream.Stream;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t extends c implements Collection {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.List, j$.util.List
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.concurrent.c, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12141a.containsValue(obj);
    }

    @Override // j$.util.Collection
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        m[] mVarArr = this.f12141a.f12128a;
        if (mVarArr == null) {
            return;
        }
        q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
        while (true) {
            m e10 = qVar.e();
            if (e10 == null) {
                return;
            }
            consumer.accept(e10.c);
        }
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // j$.util.concurrent.c, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f12141a;
        m[] mVarArr = concurrentHashMap.f12128a;
        int length = mVarArr == null ? 0 : mVarArr.length;
        return new i(mVarArr, length, length, concurrentHashMap, 1);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        Stream v12;
        v12 = AbstractC0421w0.v1(AbstractC0261c.t(this), true);
        return v12;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        Stream v12;
        v12 = AbstractC0421w0.v1(AbstractC0261c.t(this), true);
        return Stream.Wrapper.convert(v12);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean remove(Object obj) {
        AbstractC0263b abstractC0263b;
        if (obj != null) {
            Iterator it = iterator();
            do {
                abstractC0263b = (AbstractC0263b) it;
                if (!abstractC0263b.hasNext()) {
                    return false;
                }
            } while (!obj.equals(((i) it).next()));
            abstractC0263b.remove();
            return true;
        }
        return false;
    }

    @Override // j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return Collection.CC.$default$removeIf(this, Predicate.VivifiedWrapper.convert(predicate));
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.List, j$.util.List
    public final Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f12141a;
        long l2 = concurrentHashMap.l();
        m[] mVarArr = concurrentHashMap.f12128a;
        int length = mVarArr == null ? 0 : mVarArr.length;
        long j2 = 0;
        if (l2 >= 0) {
            j2 = l2;
        }
        return new k(mVarArr, length, 0, length, j2, 1);
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.List, j$.util.List
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        Stream v12;
        v12 = AbstractC0421w0.v1(AbstractC0261c.t(this), false);
        return v12;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        Stream v12;
        v12 = AbstractC0421w0.v1(AbstractC0261c.t(this), false);
        return Stream.Wrapper.convert(v12);
    }

    @Override // j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) IntFunction.VivifiedWrapper.convert(intFunction).apply(0));
        return array;
    }
}
