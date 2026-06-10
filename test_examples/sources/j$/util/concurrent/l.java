package j$.util.concurrent;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class l implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    final Object f12148a;

    /* renamed from: b  reason: collision with root package name */
    Object f12149b;
    final ConcurrentHashMap c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f12148a = obj;
        this.f12149b = obj2;
        this.c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f12148a) || key.equals(obj2)) && (value == (obj3 = this.f12149b) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12148a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12149b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f12148a.hashCode() ^ this.f12149b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f12149b;
        this.f12149b = obj;
        this.c.put(this.f12148a, obj);
        return obj2;
    }

    public final String toString() {
        return this.f12148a + "=" + this.f12149b;
    }
}
