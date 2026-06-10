package p0;

import androidx.compose.runtime.snapshots.SnapshotKt;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class o<K, V> implements Map<K, V>, w, w7.c {

    /* renamed from: i  reason: collision with root package name */
    public a f16612i = new a(a1.c.h1());

    /* renamed from: j  reason: collision with root package name */
    public final i f16613j = new i(this);

    /* renamed from: k  reason: collision with root package name */
    public final j f16614k = new j(this);

    /* renamed from: l  reason: collision with root package name */
    public final l f16615l = new l(this);

    /* loaded from: classes.dex */
    public static final class a<K, V> extends x {
        public i0.d<K, ? extends V> c;

        /* renamed from: d  reason: collision with root package name */
        public int f16616d;

        public a(i0.d<K, ? extends V> dVar) {
            v7.g.f(dVar, "map");
            this.c = dVar;
        }

        @Override // p0.x
        public final void a(x xVar) {
            a aVar = (a) xVar;
            synchronized (p.f16617a) {
                this.c = aVar.c;
                this.f16616d = aVar.f16616d;
                m7.n nVar = m7.n.f16010a;
            }
        }

        @Override // p0.x
        public final x b() {
            return new a(this.c);
        }

        public final void c(i0.d<K, ? extends V> dVar) {
            v7.g.f(dVar, "<set-?>");
            this.c = dVar;
        }
    }

    public final a<K, V> a() {
        a aVar = this.f16612i;
        v7.g.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) SnapshotKt.p(aVar, this);
    }

    @Override // java.util.Map
    public final void clear() {
        f i10;
        a aVar = this.f16612i;
        v7.g.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        k0.c h12 = a1.c.h1();
        if (h12 != ((a) SnapshotKt.h(aVar)).c) {
            synchronized (p.f16617a) {
                a aVar2 = this.f16612i;
                v7.g.d(aVar2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (SnapshotKt.c) {
                    i10 = SnapshotKt.i();
                    a aVar3 = (a) SnapshotKt.s(aVar2, this, i10);
                    aVar3.c = h12;
                    aVar3.f16616d++;
                }
                SnapshotKt.l(i10, this);
            }
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return a().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return a().c.containsValue(obj);
    }

    @Override // p0.w
    public final x d() {
        return this.f16612i;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.f16613j;
    }

    @Override // p0.w
    public final /* synthetic */ x g(x xVar, x xVar2, x xVar3) {
        return null;
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return a().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return a().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.f16614k;
    }

    @Override // java.util.Map
    public final V put(K k3, V v3) {
        i0.d<K, ? extends V> dVar;
        int i10;
        V v10;
        f i11;
        boolean z10;
        do {
            Object obj = p.f16617a;
            synchronized (obj) {
                a aVar = this.f16612i;
                v7.g.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) SnapshotKt.h(aVar);
                dVar = aVar2.c;
                i10 = aVar2.f16616d;
                m7.n nVar = m7.n.f16010a;
            }
            v7.g.c(dVar);
            k0.e builder = dVar.builder();
            v10 = (V) builder.put(k3, v3);
            k0.c<K, V> a10 = builder.a();
            if (v7.g.a(a10, dVar)) {
                break;
            }
            synchronized (obj) {
                a aVar3 = this.f16612i;
                v7.g.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (SnapshotKt.c) {
                    i11 = SnapshotKt.i();
                    a aVar4 = (a) SnapshotKt.s(aVar3, this, i11);
                    if (aVar4.f16616d == i10) {
                        aVar4.c(a10);
                        z10 = true;
                        aVar4.f16616d++;
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.l(i11, this);
            }
        } while (!z10);
        return v10;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        i0.d<K, ? extends V> dVar;
        int i10;
        f i11;
        boolean z10;
        v7.g.f(map, "from");
        do {
            Object obj = p.f16617a;
            synchronized (obj) {
                a aVar = this.f16612i;
                v7.g.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) SnapshotKt.h(aVar);
                dVar = aVar2.c;
                i10 = aVar2.f16616d;
                m7.n nVar = m7.n.f16010a;
            }
            v7.g.c(dVar);
            k0.e builder = dVar.builder();
            builder.putAll(map);
            k0.c<K, V> a10 = builder.a();
            if (!v7.g.a(a10, dVar)) {
                synchronized (obj) {
                    a aVar3 = this.f16612i;
                    v7.g.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    synchronized (SnapshotKt.c) {
                        i11 = SnapshotKt.i();
                        a aVar4 = (a) SnapshotKt.s(aVar3, this, i11);
                        if (aVar4.f16616d == i10) {
                            aVar4.c(a10);
                            z10 = true;
                            aVar4.f16616d++;
                        } else {
                            z10 = false;
                        }
                    }
                    SnapshotKt.l(i11, this);
                }
            } else {
                return;
            }
        } while (!z10);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        i0.d<K, ? extends V> dVar;
        int i10;
        V v3;
        f i11;
        boolean z10;
        do {
            Object obj2 = p.f16617a;
            synchronized (obj2) {
                a aVar = this.f16612i;
                v7.g.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) SnapshotKt.h(aVar);
                dVar = aVar2.c;
                i10 = aVar2.f16616d;
                m7.n nVar = m7.n.f16010a;
            }
            v7.g.c(dVar);
            k0.e builder = dVar.builder();
            v3 = (V) builder.remove(obj);
            k0.c<K, V> a10 = builder.a();
            if (v7.g.a(a10, dVar)) {
                break;
            }
            synchronized (obj2) {
                a aVar3 = this.f16612i;
                v7.g.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (SnapshotKt.c) {
                    i11 = SnapshotKt.i();
                    a aVar4 = (a) SnapshotKt.s(aVar3, this, i11);
                    if (aVar4.f16616d == i10) {
                        aVar4.c(a10);
                        z10 = true;
                        aVar4.f16616d++;
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.l(i11, this);
            }
        } while (!z10);
        return v3;
    }

    @Override // java.util.Map
    public final int size() {
        return a().c.size();
    }

    @Override // p0.w
    public final void t(x xVar) {
        this.f16612i = (a) xVar;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.f16615l;
    }
}
