package t1;

import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.collections.c;
import m7.n;
import v7.g;
import v7.l;

/* loaded from: classes.dex */
public final class a<K, V> {

    /* renamed from: d  reason: collision with root package name */
    public int f17556d;

    /* renamed from: f  reason: collision with root package name */
    public int f17558f;

    /* renamed from: g  reason: collision with root package name */
    public int f17559g;

    /* renamed from: a  reason: collision with root package name */
    public final m0.b f17554a = new m0.b(0);

    /* renamed from: e  reason: collision with root package name */
    public final int f17557e = 16;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<K, V> f17555b = new HashMap<>(0, 0.75f);
    public final LinkedHashSet<K> c = new LinkedHashSet<>();

    public final V a(K k3) {
        synchronized (this.f17554a) {
            V v3 = this.f17555b.get(k3);
            if (v3 == null) {
                this.f17559g++;
                return null;
            }
            this.c.remove(k3);
            this.c.add(k3);
            this.f17558f++;
            return v3;
        }
    }

    public final V b(K k3, V v3) {
        V put;
        if (k3 == null || v3 == null) {
            throw null;
        }
        synchronized (this.f17554a) {
            this.f17556d = d() + 1;
            put = this.f17555b.put(k3, v3);
            if (put != null) {
                this.f17556d = d() - 1;
            }
            if (this.c.contains(k3)) {
                this.c.remove(k3);
            }
            this.c.add(k3);
        }
        e(this.f17557e);
        return put;
    }

    public final V c(K k3) {
        V remove;
        k3.getClass();
        synchronized (this.f17554a) {
            remove = this.f17555b.remove(k3);
            this.c.remove(k3);
            if (remove != null) {
                this.f17556d = d() - 1;
            }
            n nVar = n.f16010a;
        }
        return remove;
    }

    public final int d() {
        int i10;
        synchronized (this.f17554a) {
            i10 = this.f17556d;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(int i10) {
        Object obj;
        V v3;
        while (true) {
            synchronized (this.f17554a) {
                if (d() < 0 || ((this.f17555b.isEmpty() && d() != 0) || this.f17555b.isEmpty() != this.c.isEmpty())) {
                    break;
                }
                if (d() <= i10 || this.f17555b.isEmpty()) {
                    obj = null;
                    v3 = null;
                } else {
                    obj = c.m2(this.c);
                    v3 = this.f17555b.get(obj);
                    if (v3 == null) {
                        throw new IllegalStateException("inconsistent state");
                    }
                    HashMap<K, V> hashMap = this.f17555b;
                    l.b(hashMap);
                    hashMap.remove(obj);
                    LinkedHashSet<K> linkedHashSet = this.c;
                    l.a(linkedHashSet);
                    linkedHashSet.remove(obj);
                    int d5 = d();
                    g.c(obj);
                    this.f17556d = d5 - 1;
                }
                n nVar = n.f16010a;
            }
            if (obj == null && v3 == null) {
                return;
            }
            g.c(obj);
            g.c(v3);
        }
    }

    public final String toString() {
        String str;
        synchronized (this.f17554a) {
            int i10 = this.f17558f;
            int i11 = this.f17559g + i10;
            str = "LruCache[maxSize=" + this.f17557e + ",hits=" + this.f17558f + ",misses=" + this.f17559g + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
        }
        return str;
    }
}
