package k0;

import java.util.Map;

/* loaded from: classes.dex */
public class a<K, V> implements Map.Entry<K, V>, w7.a {

    /* renamed from: i  reason: collision with root package name */
    public final K f12829i;

    /* renamed from: j  reason: collision with root package name */
    public final V f12830j;

    public a(K k3, V v3) {
        this.f12829i = k3;
        this.f12830j = v3;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && v7.g.a(entry.getKey(), this.f12829i) && v7.g.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f12829i;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f12830j;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K k3 = this.f12829i;
        int hashCode = k3 != null ? k3.hashCode() : 0;
        V value = getValue();
        return (value != null ? value.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12829i);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
