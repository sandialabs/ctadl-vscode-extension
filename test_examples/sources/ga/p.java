package ga;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p<T, R> implements h<R> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f11315a;

    /* renamed from: b  reason: collision with root package name */
    public final u7.l<T, R> f11316b;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<R>, w7.a, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final Iterator<T> f11317i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ p<T, R> f11318j;

        public a(p<T, R> pVar) {
            this.f11318j = pVar;
            this.f11317i = pVar.f11315a.iterator();
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
            return this.f11317i.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final R next() {
            return this.f11318j.f11316b.U(this.f11317i.next());
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(h<? extends T> hVar, u7.l<? super T, ? extends R> lVar) {
        v7.g.f(lVar, "transformer");
        this.f11315a = hVar;
        this.f11316b = lVar;
    }

    @Override // ga.h
    public final java.util.Iterator<R> iterator() {
        return new a(this);
    }
}
