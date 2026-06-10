package p0;

import androidx.compose.runtime.snapshots.SnapshotKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p0.o;

/* loaded from: classes.dex */
public final class j<K, V> extends k<K, V, K> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o<K, V> oVar) {
        super(oVar);
        v7.g.f(oVar, "map");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        p.a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        v7.g.f(collection, "elements");
        p.a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f16610i.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        v7.g.f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!this.f16610i.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        o<K, V> oVar = this.f16610i;
        return new u(oVar, ((i0.b) oVar.a().c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f16610i.remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        boolean z10;
        v7.g.f(collection, "elements");
        while (true) {
            for (Object obj : collection) {
                z10 = this.f16610i.remove(obj) != null || z10;
            }
            return z10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        i0.d<K, ? extends V> dVar;
        int i10;
        boolean z10;
        f i11;
        v7.g.f(collection, "elements");
        Set Q2 = kotlin.collections.c.Q2(collection);
        o<K, V> oVar = this.f16610i;
        boolean z11 = false;
        do {
            synchronized (p.f16617a) {
                o.a aVar = oVar.f16612i;
                v7.g.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                o.a aVar2 = (o.a) SnapshotKt.h(aVar);
                dVar = aVar2.c;
                i10 = aVar2.f16616d;
                m7.n nVar = m7.n.f16010a;
            }
            v7.g.c(dVar);
            k0.e builder = dVar.builder();
            Iterator<Map.Entry<K, V>> it = oVar.f16613j.iterator();
            while (true) {
                z10 = true;
                if (!((t) it).hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) ((s) it).next();
                if (!Q2.contains(entry.getKey())) {
                    builder.remove(entry.getKey());
                    z11 = true;
                }
            }
            m7.n nVar2 = m7.n.f16010a;
            k0.c<K, V> a10 = builder.a();
            if (v7.g.a(a10, dVar)) {
                break;
            }
            synchronized (p.f16617a) {
                o.a aVar3 = oVar.f16612i;
                v7.g.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (SnapshotKt.c) {
                    i11 = SnapshotKt.i();
                    o.a aVar4 = (o.a) SnapshotKt.s(aVar3, oVar, i11);
                    if (aVar4.f16616d == i10) {
                        aVar4.c(a10);
                        aVar4.f16616d++;
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.l(i11, oVar);
            }
        } while (!z10);
        return z11;
    }
}
