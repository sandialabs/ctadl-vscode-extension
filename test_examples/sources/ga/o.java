package ga;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class o<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f11309a;

    /* renamed from: b  reason: collision with root package name */
    public final u7.l<T, Boolean> f11310b;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, w7.a, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final Iterator<T> f11311i;

        /* renamed from: j  reason: collision with root package name */
        public int f11312j = -1;

        /* renamed from: k  reason: collision with root package name */
        public T f11313k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ o<T> f11314l;

        public a(o<T> oVar) {
            this.f11314l = oVar;
            this.f11311i = oVar.f11309a.iterator();
        }

        public final void a() {
            Iterator<T> it = this.f11311i;
            if (it.hasNext()) {
                T next = it.next();
                if (this.f11314l.f11310b.U(next).booleanValue()) {
                    this.f11312j = 1;
                    this.f11313k = next;
                    return;
                }
            }
            this.f11312j = 0;
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
            if (this.f11312j == -1) {
                a();
            }
            return this.f11312j == 1;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            if (this.f11312j == -1) {
                a();
            }
            if (this.f11312j != 0) {
                T t10 = this.f11313k;
                this.f11313k = null;
                this.f11312j = -1;
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
    public o(h<? extends T> hVar, u7.l<? super T, Boolean> lVar) {
        this.f11309a = hVar;
        this.f11310b = lVar;
    }

    @Override // ga.h
    public final java.util.Iterator<T> iterator() {
        return new a(this);
    }
}
