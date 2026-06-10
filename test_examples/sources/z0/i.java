package z0;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class i extends k implements Iterable<k>, w7.a {

    /* renamed from: i  reason: collision with root package name */
    public final String f19069i;

    /* renamed from: j  reason: collision with root package name */
    public final float f19070j;

    /* renamed from: k  reason: collision with root package name */
    public final float f19071k;

    /* renamed from: l  reason: collision with root package name */
    public final float f19072l;

    /* renamed from: m  reason: collision with root package name */
    public final float f19073m;
    public final float n;

    /* renamed from: o  reason: collision with root package name */
    public final float f19074o;

    /* renamed from: p  reason: collision with root package name */
    public final float f19075p;

    /* renamed from: q  reason: collision with root package name */
    public final List<d> f19076q;

    /* renamed from: r  reason: collision with root package name */
    public final List<k> f19077r;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<k>, w7.a, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final Iterator<k> f19078i;

        public a(i iVar) {
            this.f19078i = iVar.f19077r.iterator();
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super k> consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f19078i.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            return this.f19078i.next();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public i() {
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, j.f19079a, EmptyList.f12981i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof i)) {
            i iVar = (i) obj;
            if (v7.g.a(this.f19069i, iVar.f19069i)) {
                if (this.f19070j == iVar.f19070j) {
                    if (this.f19071k == iVar.f19071k) {
                        if (this.f19072l == iVar.f19072l) {
                            if (this.f19073m == iVar.f19073m) {
                                if (this.n == iVar.n) {
                                    if (this.f19074o == iVar.f19074o) {
                                        return ((this.f19075p > iVar.f19075p ? 1 : (this.f19075p == iVar.f19075p ? 0 : -1)) == 0) && v7.g.a(this.f19076q, iVar.f19076q) && v7.g.a(this.f19077r, iVar.f19077r);
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int e10 = androidx.activity.e.e(this.f19075p, androidx.activity.e.e(this.f19074o, androidx.activity.e.e(this.n, androidx.activity.e.e(this.f19073m, androidx.activity.e.e(this.f19072l, androidx.activity.e.e(this.f19071k, androidx.activity.e.e(this.f19070j, this.f19069i.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        return this.f19077r.hashCode() + ((this.f19076q.hashCode() + e10) * 31);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<k> iterator() {
        return new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends d> list, List<? extends k> list2) {
        v7.g.f(str, "name");
        v7.g.f(list, "clipPathData");
        v7.g.f(list2, "children");
        this.f19069i = str;
        this.f19070j = f10;
        this.f19071k = f11;
        this.f19072l = f12;
        this.f19073m = f13;
        this.n = f14;
        this.f19074o = f15;
        this.f19075p = f16;
        this.f19076q = list;
        this.f19077r = list2;
    }
}
