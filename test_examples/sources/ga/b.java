package ga;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b<T> implements h<T>, c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f11281a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11282b;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, w7.a, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final Iterator<T> f11283i;

        /* renamed from: j  reason: collision with root package name */
        public int f11284j;

        public a(b<T> bVar) {
            this.f11283i = bVar.f11281a.iterator();
            this.f11284j = bVar.f11282b;
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
            java.util.Iterator<T> it;
            while (true) {
                int i10 = this.f11284j;
                it = this.f11283i;
                if (i10 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f11284j--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            java.util.Iterator<T> it;
            while (true) {
                int i10 = this.f11284j;
                it = this.f11283i;
                if (i10 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f11284j--;
            }
            return it.next();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(h<? extends T> hVar, int i10) {
        v7.g.f(hVar, "sequence");
        this.f11281a = hVar;
        this.f11282b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // ga.c
    public final h a() {
        int i10 = this.f11282b + 1;
        return i10 < 0 ? new b(this, 1) : new b(this.f11281a, i10);
    }

    @Override // ga.h
    public final java.util.Iterator<T> iterator() {
        return new a(this);
    }
}
