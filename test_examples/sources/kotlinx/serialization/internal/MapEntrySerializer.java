package kotlinx.serialization.internal;

import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.b;
import qa.b;
import sa.e;
import ua.p0;
import v7.g;

/* loaded from: classes.dex */
public final class MapEntrySerializer<K, V> extends p0<K, V, Map.Entry<? extends K, ? extends V>> {
    public final SerialDescriptorImpl c;

    /* loaded from: classes.dex */
    public static final class a<K, V> implements Map.Entry<K, V>, w7.a {

        /* renamed from: i  reason: collision with root package name */
        public final K f15626i;

        /* renamed from: j  reason: collision with root package name */
        public final V f15627j;

        public a(K k3, V v3) {
            this.f15626i = k3;
            this.f15627j = v3;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (g.a(this.f15626i, aVar.f15626i) && g.a(this.f15627j, aVar.f15627j)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f15626i;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f15627j;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int i10 = 0;
            K k3 = this.f15626i;
            int hashCode = (k3 == null ? 0 : k3.hashCode()) * 31;
            V v3 = this.f15627j;
            if (v3 != null) {
                i10 = v3.hashCode();
            }
            return hashCode + i10;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final String toString() {
            return "MapEntry(key=" + this.f15626i + ", value=" + this.f15627j + ')';
        }
    }

    public MapEntrySerializer(b<K> bVar, b<V> bVar2) {
        super(bVar, bVar2);
        this.c = kotlinx.serialization.descriptors.a.c("kotlin.collections.Map.Entry", b.c.f15611a, new e[0], new MapEntrySerializer$descriptor$1(bVar, bVar2));
    }

    @Override // qa.b, qa.e, qa.a
    public final e a() {
        return this.c;
    }

    @Override // ua.p0
    public final Object f(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        g.f(entry, "<this>");
        return entry.getKey();
    }

    @Override // ua.p0
    public final Object g(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        g.f(entry, "<this>");
        return entry.getValue();
    }

    @Override // ua.p0
    public final Object h(Object obj, Object obj2) {
        return new a(obj, obj2);
    }
}
