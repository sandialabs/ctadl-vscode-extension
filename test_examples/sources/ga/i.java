package ga;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class i<T> extends j<T> implements Iterator<T>, p7.c<m7.n>, w7.a, j$.util.Iterator {

    /* renamed from: i  reason: collision with root package name */
    public int f11302i;

    /* renamed from: j  reason: collision with root package name */
    public T f11303j;

    /* renamed from: k  reason: collision with root package name */
    public Iterator<? extends T> f11304k;

    /* renamed from: l  reason: collision with root package name */
    public p7.c<? super m7.n> f11305l;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ga.j
    public final void a(Object obj, p7.c cVar) {
        this.f11303j = obj;
        this.f11302i = 3;
        this.f11305l = cVar;
        v7.g.f(cVar, "frame");
    }

    @Override // ga.j
    public final Object c(Iterator<? extends T> it, p7.c<? super m7.n> cVar) {
        if (!it.hasNext()) {
            return m7.n.f16010a;
        }
        this.f11304k = it;
        this.f11302i = 2;
        this.f11305l = cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        v7.g.f(cVar, "frame");
        return coroutineSingletons;
    }

    public final RuntimeException d() {
        int i10 = this.f11302i;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f11302i);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    @Override // p7.c
    public final CoroutineContext f() {
        return EmptyCoroutineContext.f13021i;
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
        while (true) {
            int i10 = this.f11302i;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw d();
                }
                java.util.Iterator<? extends T> it = this.f11304k;
                v7.g.c(it);
                if (it.hasNext()) {
                    this.f11302i = 2;
                    return true;
                }
                this.f11304k = null;
            }
            this.f11302i = 5;
            p7.c<? super m7.n> cVar = this.f11305l;
            v7.g.c(cVar);
            this.f11305l = null;
            cVar.t(m7.n.f16010a);
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final T next() {
        int i10 = this.f11302i;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f11302i = 0;
                    T t10 = this.f11303j;
                    this.f11303j = null;
                    return t10;
                }
                throw d();
            }
            this.f11302i = 1;
            java.util.Iterator<? extends T> it = this.f11304k;
            v7.g.c(it);
            return it.next();
        } else if (hasNext()) {
            return next();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p7.c
    public final void t(Object obj) {
        m0.b.n1(obj);
        this.f11302i = 4;
    }
}
