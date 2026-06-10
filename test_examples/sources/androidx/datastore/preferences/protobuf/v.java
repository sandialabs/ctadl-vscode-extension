package androidx.datastore.preferences.protobuf;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class v extends w {

    /* loaded from: classes.dex */
    public static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: i  reason: collision with root package name */
        public final Map.Entry<K, v> f4947i;

        public a() {
            throw null;
        }

        public a(Map.Entry entry) {
            this.f4947i = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f4947i.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            v value = this.f4947i.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (obj instanceof i0) {
                v value = this.f4947i.getValue();
                i0 i0Var = value.f4949a;
                value.f4950b = null;
                value.f4949a = (i0) obj;
                return i0Var;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* loaded from: classes.dex */
    public static class b<K> implements Iterator<Map.Entry<K, Object>>, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final Iterator<Map.Entry<K, Object>> f4948i;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f4948i = it;
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
            return this.f4948i.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f4948i.next();
            return next.getValue() instanceof v ? new a(next) : next;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            this.f4948i.remove();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.w
    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.w
    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
