package da;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: i  reason: collision with root package name */
    public static final e f10481i = new e();

    /* loaded from: classes.dex */
    public static final class a implements Iterator, w7.a, j$.util.Iterator {
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
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // da.b
    public final int c() {
        return 0;
    }

    @Override // da.b
    public final void d(int i10, Object obj) {
        Void r22 = (Void) obj;
        throw new IllegalStateException();
    }

    @Override // da.b
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return null;
    }

    @Override // da.b, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new a();
    }
}
