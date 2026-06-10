package kotlin.reflect.jvm.internal.impl.protobuf;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends i9.b {

    /* loaded from: classes.dex */
    public static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: i  reason: collision with root package name */
        public final Map.Entry<K, g> f14572i;

        public a(Map.Entry entry) {
            this.f14572i = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f14572i.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            g value = this.f14572i.getValue();
            if (value == null) {
                return null;
            }
            return value.a();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (obj instanceof h) {
                g value = this.f14572i.getValue();
                h hVar = value.f11839b;
                value.f11839b = (h) obj;
                value.f11838a = true;
                return hVar;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* loaded from: classes.dex */
    public static class b<K> implements Iterator<Map.Entry<K, Object>>, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final Iterator<Map.Entry<K, Object>> f14573i;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f14573i = it;
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
            return this.f14573i.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f14573i.next();
            return next.getValue() instanceof g ? new a(next) : next;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            this.f14573i.remove();
        }
    }

    public final h a() {
        if (this.f11839b == null) {
            synchronized (this) {
                if (this.f11839b == null) {
                    try {
                        this.f11839b = null;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return this.f11839b;
    }

    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
