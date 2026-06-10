package ga;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final u7.a<T> f11297a;

    /* renamed from: b  reason: collision with root package name */
    public final u7.l<T, T> f11298b;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, w7.a, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public T f11299i;

        /* renamed from: j  reason: collision with root package name */
        public int f11300j = -2;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ g<T> f11301k;

        public a(g<T> gVar) {
            this.f11301k = gVar;
        }

        public final void a() {
            T U;
            int i10;
            int i11 = this.f11300j;
            g<T> gVar = this.f11301k;
            if (i11 == -2) {
                U = gVar.f11297a.k0();
            } else {
                u7.l<T, T> lVar = gVar.f11298b;
                T t10 = this.f11299i;
                v7.g.c(t10);
                U = lVar.U(t10);
            }
            this.f11299i = U;
            if (U == null) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            this.f11300j = i10;
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
            if (this.f11300j < 0) {
                a();
            }
            return this.f11300j == 1;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            if (this.f11300j < 0) {
                a();
            }
            if (this.f11300j != 0) {
                T t10 = this.f11299i;
                v7.g.d(t10, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f11300j = -1;
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
    public g(u7.a<? extends T> aVar, u7.l<? super T, ? extends T> lVar) {
        v7.g.f(lVar, "getNextValue");
        this.f11297a = aVar;
        this.f11298b = lVar;
    }

    @Override // ga.h
    public final java.util.Iterator<T> iterator() {
        return new a(this);
    }
}
