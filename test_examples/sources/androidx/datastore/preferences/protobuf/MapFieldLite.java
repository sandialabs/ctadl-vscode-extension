package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.u;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: j  reason: collision with root package name */
    public static final MapFieldLite f4819j;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4820i;

    static {
        MapFieldLite mapFieldLite = new MapFieldLite();
        f4819j = mapFieldLite;
        mapFieldLite.f4820i = false;
    }

    private MapFieldLite() {
        this.f4820i = true;
    }

    public MapFieldLite(Map<K, V> map) {
        super(map);
        this.f4820i = true;
    }

    public static int a(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = u.f4942a;
            int length = bArr.length;
            int i10 = length;
            for (int i11 = 0; i11 < 0 + length; i11++) {
                i10 = (i10 * 31) + bArr[i11];
            }
            if (i10 == 0) {
                return 1;
            }
            return i10;
        } else if (!(obj instanceof u.a)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void b() {
        if (this.f4820i) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final MapFieldLite<K, V> c() {
        return isEmpty() ? new MapFieldLite<>() : new MapFieldLite<>(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        boolean z10;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this != map) {
            if (size() == map.size()) {
                for (Map.Entry<K, V> entry : entrySet()) {
                    if (map.containsKey(entry.getKey())) {
                        V value = entry.getValue();
                        Object obj2 = map.get(entry.getKey());
                        if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                            equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                            continue;
                        } else {
                            equals = value.equals(obj2);
                            continue;
                        }
                        if (!equals) {
                        }
                    }
                }
            }
            z10 = false;
            if (z10) {
                return false;
            }
            return true;
        }
        z10 = true;
        if (z10) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i10 += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i10;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k3, V v3) {
        b();
        Charset charset = u.f4942a;
        k3.getClass();
        v3.getClass();
        return (V) super.put(k3, v3);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        b();
        for (K k3 : map.keySet()) {
            Charset charset = u.f4942a;
            k3.getClass();
            map.get(k3).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        return (V) super.remove(obj);
    }
}
