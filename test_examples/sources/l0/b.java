package l0;

import androidx.compose.runtime.Recomposer;
import java.util.Iterator;
import k0.s;
import n7.e;
import v7.g;

/* loaded from: classes.dex */
public final class b<E> extends e<E> implements i0.e<E> {

    /* renamed from: l  reason: collision with root package name */
    public static final b f15720l;

    /* renamed from: i  reason: collision with root package name */
    public final Object f15721i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f15722j;

    /* renamed from: k  reason: collision with root package name */
    public final k0.c<E, a> f15723k;

    static {
        a1.c cVar = a1.c.U;
        k0.c cVar2 = k0.c.f12833k;
        g.d(cVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        f15720l = new b(cVar, cVar, cVar2);
    }

    public b(Object obj, Object obj2, k0.c<E, a> cVar) {
        this.f15721i = obj;
        this.f15722j = obj2;
        this.f15723k = cVar;
    }

    @Override // kotlin.collections.AbstractCollection
    public final int c() {
        k0.c<E, a> cVar = this.f15723k;
        cVar.getClass();
        return cVar.f12835j;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f15723k.containsKey(obj);
    }

    @Override // i0.e
    public final b e(Recomposer.c cVar) {
        k0.c<E, a> cVar2 = this.f15723k;
        if (cVar2.containsKey(cVar)) {
            return this;
        }
        if (isEmpty()) {
            return new b(cVar, cVar, cVar2.a(cVar, new a()));
        }
        Object obj = this.f15722j;
        a aVar = cVar2.get(obj);
        g.c(aVar);
        return new b(this.f15721i, cVar, cVar2.a(obj, new a(aVar.f15718a, cVar)).a(cVar, new a(obj, a1.c.U)));
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new c(this.f15721i, this.f15723k);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, i0.c
    public final b remove(Object obj) {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj2;
        k0.c<E, a> cVar = this.f15723k;
        a aVar = cVar.get(obj);
        if (aVar == null) {
            return this;
        }
        boolean z13 = false;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        s<E, a> sVar = cVar.f12834i;
        s<E, a> v3 = sVar.v(i10, 0, obj);
        if (sVar != v3) {
            if (v3 == null) {
                cVar = k0.c.f12833k;
                g.d(cVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            } else {
                cVar = new k0.c<>(v3, cVar.f12835j - 1);
            }
        }
        a1.c cVar2 = a1.c.U;
        Object obj3 = aVar.f15718a;
        if (obj3 != cVar2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj4 = aVar.f15719b;
        if (z10) {
            a aVar2 = cVar.get(obj3);
            g.c(aVar2);
            cVar = cVar.a(obj3, new a(aVar2.f15718a, obj4));
        }
        if (obj4 != cVar2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            a aVar3 = cVar.get(obj4);
            g.c(aVar3);
            cVar = cVar.a(obj4, new a(obj3, aVar3.f15719b));
        }
        if (obj3 != cVar2) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            obj2 = obj4;
        } else {
            obj2 = this.f15721i;
        }
        if (obj4 != cVar2) {
            z13 = true;
        }
        if (z13) {
            obj3 = this.f15722j;
        }
        return new b(obj2, obj3, cVar);
    }
}
