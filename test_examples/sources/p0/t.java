package p0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class t<K, V> {

    /* renamed from: i  reason: collision with root package name */
    public final o<K, V> f16624i;

    /* renamed from: j  reason: collision with root package name */
    public final Iterator<Map.Entry<K, V>> f16625j;

    /* renamed from: k  reason: collision with root package name */
    public int f16626k;

    /* renamed from: l  reason: collision with root package name */
    public Map.Entry<? extends K, ? extends V> f16627l;

    /* renamed from: m  reason: collision with root package name */
    public Map.Entry<? extends K, ? extends V> f16628m;

    /* JADX WARN: Multi-variable type inference failed */
    public t(o<K, V> oVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        v7.g.f(oVar, "map");
        v7.g.f(it, "iterator");
        this.f16624i = oVar;
        this.f16625j = it;
        this.f16626k = oVar.a().f16616d;
        a();
    }

    public final void a() {
        this.f16627l = this.f16628m;
        Iterator<Map.Entry<K, V>> it = this.f16625j;
        this.f16628m = (Map.Entry<? extends K, ? extends V>) (it.hasNext() ? (Map.Entry<K, V>) ((Map.Entry) it.next()) : (Map.Entry<? extends K, ? extends V>) null);
    }

    public final boolean hasNext() {
        return this.f16628m != null;
    }

    public final void remove() {
        o<K, V> oVar = this.f16624i;
        if (oVar.a().f16616d == this.f16626k) {
            Map.Entry<? extends K, ? extends V> entry = this.f16627l;
            if (entry != null) {
                oVar.remove(entry.getKey());
                this.f16627l = null;
                m7.n nVar = m7.n.f16010a;
                this.f16626k = oVar.a().f16616d;
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
