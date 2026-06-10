package p0;

import androidx.compose.runtime.snapshots.SnapshotKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.o;
import w7.c;

/* loaded from: classes.dex */
public final class i<K, V> extends k<K, V, Map.Entry<K, V>> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o<K, V> oVar) {
        super(oVar);
        v7.g.f(oVar, "map");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        v7.g.f((Map.Entry) obj, "element");
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
        boolean z10;
        if ((obj instanceof Map.Entry) && (!(obj instanceof w7.a) || (obj instanceof c.a))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        v7.g.f(entry, "element");
        return v7.g.a(this.f16610i.get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        v7.g.f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        o<K, V> oVar = this.f16610i;
        return new s(oVar, ((i0.b) oVar.a().c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        boolean z10;
        if ((obj instanceof Map.Entry) && (!(obj instanceof w7.a) || (obj instanceof c.a))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        v7.g.f(entry, "element");
        if (this.f16610i.remove(entry.getKey()) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        boolean z10;
        v7.g.f(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            while (it.hasNext()) {
                z10 = this.f16610i.remove(((Map.Entry) it.next()).getKey()) != null || z10;
            }
            return z10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x005e A[SYNTHETIC] */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean retainAll(Collection<? extends Object> collection) {
        i0.d<K, ? extends V> dVar;
        int i10;
        boolean z10;
        f i11;
        boolean z11;
        v7.g.f(collection, "elements");
        int O0 = m0.b.O0(n7.l.Z1(collection, 10));
        if (O0 < 16) {
            O0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(O0);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        o<K, V> oVar = this.f16610i;
        boolean z12 = false;
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
            Iterator<Map.Entry<K, V>> it2 = oVar.f16613j.iterator();
            while (true) {
                z10 = true;
                if (!((t) it2).hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) ((s) it2).next();
                if (linkedHashMap.containsKey(entry2.getKey()) && v7.g.a(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    z11 = false;
                    if (!z11) {
                        builder.remove(entry2.getKey());
                        z12 = true;
                    }
                }
                z11 = true;
                if (!z11) {
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
        return z12;
    }
}
