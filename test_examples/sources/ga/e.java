package ga;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f11286a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11287b;
    public final u7.l<T, Boolean> c;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, w7.a, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final Iterator<T> f11288i;

        /* renamed from: j  reason: collision with root package name */
        public int f11289j = -1;

        /* renamed from: k  reason: collision with root package name */
        public T f11290k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ e<T> f11291l;

        public a(e<T> eVar) {
            this.f11291l = eVar;
            this.f11288i = eVar.f11286a.iterator();
        }

        public final void a() {
            int i10;
            while (true) {
                Iterator<T> it = this.f11288i;
                if (it.hasNext()) {
                    T next = it.next();
                    e<T> eVar = this.f11291l;
                    if (eVar.c.U(next).booleanValue() == eVar.f11287b) {
                        this.f11290k = next;
                        i10 = 1;
                        break;
                    }
                } else {
                    i10 = 0;
                    break;
                }
            }
            this.f11289j = i10;
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
            if (this.f11289j == -1) {
                a();
            }
            return this.f11289j == 1;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            if (this.f11289j == -1) {
                a();
            }
            if (this.f11289j != 0) {
                T t10 = this.f11290k;
                this.f11290k = null;
                this.f11289j = -1;
                return t10;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(h<? extends T> hVar, boolean z10, u7.l<? super T, Boolean> lVar) {
        v7.g.f(lVar, "predicate");
        this.f11286a = hVar;
        this.f11287b = z10;
        this.c = lVar;
    }

    @Override // ga.h
    public final java.util.Iterator<T> iterator() {
        return new a(this);
    }
}
