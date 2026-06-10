package ga;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f<T, R, E> implements h<E> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f11292a;

    /* renamed from: b  reason: collision with root package name */
    public final u7.l<T, R> f11293b;
    public final u7.l<R, Iterator<E>> c;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<E>, w7.a, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final Iterator<T> f11294i;

        /* renamed from: j  reason: collision with root package name */
        public Iterator<? extends E> f11295j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ f<T, R, E> f11296k;

        public a(f<T, R, E> fVar) {
            this.f11296k = fVar;
            this.f11294i = fVar.f11292a.iterator();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a() {
            boolean z10;
            Iterator<? extends E> it = this.f11295j;
            if (it != null && !it.hasNext()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f11295j = null;
            }
            while (true) {
                if (this.f11295j != null) {
                    break;
                }
                Iterator<T> it2 = this.f11294i;
                if (!it2.hasNext()) {
                    return false;
                }
                T next = it2.next();
                f<T, R, E> fVar = this.f11296k;
                Iterator<E> U = fVar.c.U(fVar.f11293b.U(next));
                if (U.hasNext()) {
                    this.f11295j = U;
                    break;
                }
            }
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
            return a();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final E next() {
            if (a()) {
                java.util.Iterator<? extends E> it = this.f11295j;
                v7.g.c(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(h<? extends T> hVar, u7.l<? super T, ? extends R> lVar, u7.l<? super R, ? extends java.util.Iterator<? extends E>> lVar2) {
        v7.g.f(hVar, "sequence");
        v7.g.f(lVar, "transformer");
        v7.g.f(lVar2, "iterator");
        this.f11292a = hVar;
        this.f11293b = lVar;
        this.c = lVar2;
    }

    @Override // ga.h
    public final java.util.Iterator<E> iterator() {
        return new a(this);
    }
}
