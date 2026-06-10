package p;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class f<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<K, V> f16557a;

    /* renamed from: b  reason: collision with root package name */
    public int f16558b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public int f16559d;

    /* renamed from: e  reason: collision with root package name */
    public int f16560e;

    public f(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.c = i10;
        this.f16557a = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final V a(K k3) {
        if (k3 != null) {
            synchronized (this) {
                V v3 = this.f16557a.get(k3);
                if (v3 != null) {
                    this.f16559d++;
                    return v3;
                }
                this.f16560e++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final V b(K k3, V v3) {
        V put;
        if (k3 != null) {
            synchronized (this) {
                this.f16558b++;
                put = this.f16557a.put(k3, v3);
                if (put != null) {
                    this.f16558b--;
                }
            }
            c(this.c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i10) {
        while (true) {
            synchronized (this) {
                if (this.f16558b >= 0 && (!this.f16557a.isEmpty() || this.f16558b == 0)) {
                    if (this.f16558b <= i10 || this.f16557a.isEmpty()) {
                        break;
                    }
                    Map.Entry<K, V> next = this.f16557a.entrySet().iterator().next();
                    K key = next.getKey();
                    next.getValue();
                    this.f16557a.remove(key);
                    this.f16558b--;
                } else {
                    break;
                }
            }
        }
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        i10 = this.f16559d;
        i11 = this.f16560e + i10;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.c), Integer.valueOf(this.f16559d), Integer.valueOf(this.f16560e), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }
}
