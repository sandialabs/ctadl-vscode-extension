package fa;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import v7.g;
import v7.l;

/* loaded from: classes.dex */
public final class d<T> extends AbstractSet<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f11017k = 0;

    /* renamed from: i  reason: collision with root package name */
    public Object f11018i;

    /* renamed from: j  reason: collision with root package name */
    public int f11019j;

    /* loaded from: classes.dex */
    public static final class a<T> implements Iterator<T>, w7.a, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final v7.a f11020i;

        public a(T[] tArr) {
            this.f11020i = m0.b.K0(tArr);
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
            return this.f11020i.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            return (T) this.f11020i.next();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> implements java.util.Iterator<T>, w7.a, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final T f11021i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f11022j = true;

        public b(T t10) {
            this.f11021i = t10;
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
            return this.f11022j;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            if (this.f11022j) {
                this.f11022j = false;
                return this.f11021i;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(T t10) {
        boolean z10;
        Object[] objArr;
        int i10 = this.f11019j;
        if (i10 == 0) {
            this.f11018i = t10;
        } else if (i10 == 1) {
            if (g.a(this.f11018i, t10)) {
                return false;
            }
            this.f11018i = new Object[]{this.f11018i, t10};
        } else if (i10 < 5) {
            Object obj = this.f11018i;
            g.d(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr2 = (Object[]) obj;
            if (kotlin.collections.b.p2(t10, objArr2) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return false;
            }
            int i11 = this.f11019j;
            if (i11 == 4) {
                Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
                g.f(copyOf, "elements");
                LinkedHashSet linkedHashSet = new LinkedHashSet(m0.b.O0(copyOf.length));
                kotlin.collections.b.u2(linkedHashSet, copyOf);
                linkedHashSet.add(t10);
                objArr = linkedHashSet;
            } else {
                Object[] copyOf2 = Arrays.copyOf(objArr2, i11 + 1);
                g.e(copyOf2, "copyOf(this, newSize)");
                copyOf2[copyOf2.length - 1] = t10;
                objArr = copyOf2;
            }
            this.f11018i = objArr;
        } else {
            Object obj2 = this.f11018i;
            g.d(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!l.c(obj2).add(t10)) {
                return false;
            }
        }
        this.f11019j++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f11018i = null;
        this.f11019j = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i10 = this.f11019j;
        if (i10 == 0) {
            return false;
        }
        if (i10 == 1) {
            return g.a(this.f11018i, obj);
        }
        if (i10 < 5) {
            Object obj2 = this.f11018i;
            g.d(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (kotlin.collections.b.p2(obj, (Object[]) obj2) < 0) {
                return false;
            }
            return true;
        }
        Object obj3 = this.f11018i;
        g.d(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<T> iterator() {
        Set c;
        int i10 = this.f11019j;
        if (i10 == 0) {
            c = Collections.emptySet();
        } else if (i10 == 1) {
            return new b(this.f11018i);
        } else {
            if (i10 < 5) {
                Object obj = this.f11018i;
                g.d(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
                return new a((Object[]) obj);
            }
            Object obj2 = this.f11018i;
            g.d(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            c = l.c(obj2);
        }
        return c.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11019j;
    }
}
