package k0;

import java.util.Map;
import java.util.NoSuchElementException;
import w7.c;

/* loaded from: classes.dex */
public final class b<K, V> extends a<K, V> implements c.a {

    /* renamed from: k  reason: collision with root package name */
    public final h<K, V> f12831k;

    /* renamed from: l  reason: collision with root package name */
    public V f12832l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h<K, V> hVar, K k3, V v3) {
        super(k3, v3);
        v7.g.f(hVar, "parentIterator");
        this.f12831k = hVar;
        this.f12832l = v3;
    }

    @Override // k0.a, java.util.Map.Entry
    public final V getValue() {
        return this.f12832l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k0.a, java.util.Map.Entry
    public final V setValue(V v3) {
        int i10;
        V v10 = this.f12832l;
        this.f12832l = v3;
        f<K, V, Map.Entry<K, V>> fVar = this.f12831k.f12849i;
        e<K, V> eVar = fVar.f12844l;
        K k3 = this.f12829i;
        if (eVar.containsKey(k3)) {
            boolean z10 = fVar.f12838k;
            if (z10) {
                if (z10) {
                    t tVar = fVar.f12836i[fVar.f12837j];
                    Object obj = tVar.f12861i[tVar.f12863k];
                    eVar.put(k3, v3);
                    if (obj != null) {
                        i10 = obj.hashCode();
                    } else {
                        i10 = 0;
                    }
                    fVar.c(i10, eVar.f12841k, obj, 0);
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                eVar.put(k3, v3);
            }
            fVar.f12846o = eVar.f12843m;
        }
        return v10;
    }
}
