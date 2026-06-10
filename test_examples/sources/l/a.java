package l;

import java.util.HashMap;
import l.b;

/* loaded from: classes.dex */
public final class a<K, V> extends b<K, V> {

    /* renamed from: m  reason: collision with root package name */
    public final HashMap<K, b.c<K, V>> f15704m = new HashMap<>();

    @Override // l.b
    public final b.c<K, V> c(K k3) {
        return this.f15704m.get(k3);
    }

    @Override // l.b
    public final V d(K k3, V v3) {
        b.c<K, V> c = c(k3);
        if (c != null) {
            return c.f15710j;
        }
        HashMap<K, b.c<K, V>> hashMap = this.f15704m;
        b.c<K, V> cVar = new b.c<>(k3, v3);
        this.f15708l++;
        b.c<K, V> cVar2 = this.f15706j;
        if (cVar2 == null) {
            this.f15705i = cVar;
        } else {
            cVar2.f15711k = cVar;
            cVar.f15712l = cVar2;
        }
        this.f15706j = cVar;
        hashMap.put(k3, cVar);
        return null;
    }

    @Override // l.b
    public final V g(K k3) {
        V v3 = (V) super.g(k3);
        this.f15704m.remove(k3);
        return v3;
    }
}
