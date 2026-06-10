package da;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import y9.c0;

/* loaded from: classes.dex */
public final class h<T> extends b<T> {

    /* renamed from: i  reason: collision with root package name */
    public final T f10483i;

    /* renamed from: j  reason: collision with root package name */
    public final int f10484j;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, w7.a, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public boolean f10485i = true;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ h<T> f10486j;

        public a(h<T> hVar) {
            this.f10486j = hVar;
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
            return this.f10485i;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            if (this.f10485i) {
                this.f10485i = false;
                return this.f10486j.f10483i;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(int i10, c0 c0Var) {
        this.f10483i = c0Var;
        this.f10484j = i10;
    }

    @Override // da.b
    public final int c() {
        return 1;
    }

    @Override // da.b
    public final void d(int i10, T t10) {
        throw new IllegalStateException();
    }

    @Override // da.b
    public final T get(int i10) {
        if (i10 == this.f10484j) {
            return this.f10483i;
        }
        return null;
    }

    @Override // da.b, java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        return new a(this);
    }
}
