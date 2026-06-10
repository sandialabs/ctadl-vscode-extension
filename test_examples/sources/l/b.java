package l;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: i  reason: collision with root package name */
    public c<K, V> f15705i;

    /* renamed from: j  reason: collision with root package name */
    public c<K, V> f15706j;

    /* renamed from: k  reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f15707k = new WeakHashMap<>();

    /* renamed from: l  reason: collision with root package name */
    public int f15708l = 0;

    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // l.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f15712l;
        }

        @Override // l.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f15711k;
        }
    }

    /* renamed from: l.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0178b<K, V> extends e<K, V> {
        public C0178b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // l.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f15711k;
        }

        @Override // l.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f15712l;
        }
    }

    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: i  reason: collision with root package name */
        public final K f15709i;

        /* renamed from: j  reason: collision with root package name */
        public final V f15710j;

        /* renamed from: k  reason: collision with root package name */
        public c<K, V> f15711k;

        /* renamed from: l  reason: collision with root package name */
        public c<K, V> f15712l;

        public c(K k3, V v3) {
            this.f15709i = k3;
            this.f15710j = v3;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f15709i.equals(cVar.f15709i) && this.f15710j.equals(cVar.f15710j);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f15709i;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f15710j;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f15709i.hashCode() ^ this.f15710j.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v3) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f15709i + "=" + this.f15710j;
        }
    }

    /* loaded from: classes.dex */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: i  reason: collision with root package name */
        public c<K, V> f15713i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f15714j = true;

        public d() {
        }

        @Override // l.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f15713i;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f15712l;
                this.f15713i = cVar3;
                this.f15714j = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f15714j) {
                return b.this.f15705i != null;
            }
            c<K, V> cVar = this.f15713i;
            return (cVar == null || cVar.f15711k == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar;
            if (this.f15714j) {
                this.f15714j = false;
                cVar = b.this.f15705i;
            } else {
                c<K, V> cVar2 = this.f15713i;
                cVar = cVar2 != null ? cVar2.f15711k : null;
            }
            this.f15713i = cVar;
            return cVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: i  reason: collision with root package name */
        public c<K, V> f15716i;

        /* renamed from: j  reason: collision with root package name */
        public c<K, V> f15717j;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f15716i = cVar2;
            this.f15717j = cVar;
        }

        @Override // l.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f15716i == cVar && cVar == this.f15717j) {
                this.f15717j = null;
                this.f15716i = null;
            }
            c<K, V> cVar3 = this.f15716i;
            if (cVar3 == cVar) {
                this.f15716i = b(cVar3);
            }
            c<K, V> cVar4 = this.f15717j;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f15716i;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = c(cVar4);
                }
                this.f15717j = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f15717j != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar;
            c<K, V> cVar2 = this.f15717j;
            c<K, V> cVar3 = this.f15716i;
            if (cVar2 != cVar3 && cVar3 != null) {
                cVar = c(cVar2);
                this.f15717j = cVar;
                return cVar2;
            }
            cVar = null;
            this.f15717j = cVar;
            return cVar2;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f<K, V> {
        public abstract void a(c<K, V> cVar);
    }

    public c<K, V> c(K k3) {
        c<K, V> cVar = this.f15705i;
        while (cVar != null && !cVar.f15709i.equals(k3)) {
            cVar = cVar.f15711k;
        }
        return cVar;
    }

    public V d(K k3, V v3) {
        c<K, V> c10 = c(k3);
        if (c10 != null) {
            return c10.f15710j;
        }
        c<K, V> cVar = new c<>(k3, v3);
        this.f15708l++;
        c<K, V> cVar2 = this.f15706j;
        if (cVar2 == null) {
            this.f15705i = cVar;
        } else {
            cVar2.f15711k = cVar;
            cVar.f15712l = cVar2;
        }
        this.f15706j = cVar;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((l.b.e) r7).hasNext() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f15708l != bVar.f15708l) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public V g(K k3) {
        c<K, V> c10 = c(k3);
        if (c10 == null) {
            return null;
        }
        this.f15708l--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.f15707k;
        if (!weakHashMap.isEmpty()) {
            for (f<K, V> fVar : weakHashMap.keySet()) {
                fVar.a(c10);
            }
        }
        c<K, V> cVar = c10.f15712l;
        c<K, V> cVar2 = c10.f15711k;
        if (cVar != null) {
            cVar.f15711k = cVar2;
        } else {
            this.f15705i = cVar2;
        }
        c<K, V> cVar3 = c10.f15711k;
        if (cVar3 != null) {
            cVar3.f15712l = cVar;
        } else {
            this.f15706j = cVar;
        }
        c10.f15711k = null;
        c10.f15712l = null;
        return c10.f15710j;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i10;
            }
            i10 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f15705i, this.f15706j);
        this.f15707k.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
