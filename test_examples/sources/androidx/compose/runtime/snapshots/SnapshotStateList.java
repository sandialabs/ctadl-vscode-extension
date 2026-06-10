package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import i0.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import ma.i;
import p0.f;
import p0.n;
import p0.q;
import p0.w;
import p0.x;
import p0.y;
import u7.l;
import v7.g;
import w7.b;

/* loaded from: classes.dex */
public final class SnapshotStateList<T> implements List<T>, w, b {

    /* renamed from: i  reason: collision with root package name */
    public a f2954i = new a(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a.f2886j);

    /* loaded from: classes.dex */
    public static final class a<T> extends x {
        public c<? extends T> c;

        /* renamed from: d  reason: collision with root package name */
        public int f2955d;

        public a(c<? extends T> cVar) {
            g.f(cVar, "list");
            this.c = cVar;
        }

        @Override // p0.x
        public final void a(x xVar) {
            synchronized (n.f16611a) {
                this.c = ((a) xVar).c;
                this.f2955d = ((a) xVar).f2955d;
                m7.n nVar = m7.n.f16010a;
            }
        }

        @Override // p0.x
        public final x b() {
            return new a(this.c);
        }

        public final void c(c<? extends T> cVar) {
            g.f(cVar, "<set-?>");
            this.c = cVar;
        }
    }

    @Override // java.util.List
    public final void add(int i10, T t10) {
        int i11;
        c<? extends T> cVar;
        f i12;
        boolean z10;
        do {
            Object obj = n.f16611a;
            synchronized (obj) {
                a aVar = this.f2954i;
                g.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) SnapshotKt.h(aVar);
                i11 = aVar2.f2955d;
                cVar = aVar2.c;
                m7.n nVar = m7.n.f16010a;
            }
            g.c(cVar);
            c<? extends T> add = cVar.add(i10, (int) t10);
            if (g.a(add, cVar)) {
                return;
            }
            synchronized (obj) {
                a aVar3 = this.f2954i;
                g.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.c) {
                    i12 = SnapshotKt.i();
                    a aVar4 = (a) SnapshotKt.s(aVar3, this, i12);
                    if (aVar4.f2955d == i11) {
                        aVar4.c(add);
                        z10 = true;
                        aVar4.f2955d++;
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.l(i12, this);
            }
        } while (!z10);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends T> collection) {
        g.f(collection, "elements");
        return u(new SnapshotStateList$addAll$1(i10, collection));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        int i10;
        c<? extends T> cVar;
        boolean z10;
        f i11;
        g.f(collection, "elements");
        do {
            Object obj = n.f16611a;
            synchronized (obj) {
                a aVar = this.f2954i;
                g.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) SnapshotKt.h(aVar);
                i10 = aVar2.f2955d;
                cVar = aVar2.c;
                m7.n nVar = m7.n.f16010a;
            }
            g.c(cVar);
            c<? extends T> addAll = cVar.addAll((Collection<? extends Object>) collection);
            z10 = false;
            if (g.a(addAll, cVar)) {
                return false;
            }
            synchronized (obj) {
                a aVar3 = this.f2954i;
                g.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.c) {
                    i11 = SnapshotKt.i();
                    a aVar4 = (a) SnapshotKt.s(aVar3, this, i11);
                    if (aVar4.f2955d == i10) {
                        aVar4.c(addAll);
                        aVar4.f2955d++;
                        z10 = true;
                    }
                }
                SnapshotKt.l(i11, this);
            }
        } while (!z10);
        return true;
    }

    public final int c() {
        a aVar = this.f2954i;
        g.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) SnapshotKt.h(aVar)).f2955d;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        f i10;
        synchronized (n.f16611a) {
            a aVar = this.f2954i;
            g.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.c) {
                i10 = SnapshotKt.i();
                a aVar2 = (a) SnapshotKt.s(aVar, this, i10);
                aVar2.c(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a.f2886j);
                aVar2.f2955d++;
            }
            SnapshotKt.l(i10, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return s().c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        g.f(collection, "elements");
        return s().c.containsAll(collection);
    }

    @Override // p0.w
    public final x d() {
        return this.f2954i;
    }

    @Override // p0.w
    public final /* synthetic */ x g(x xVar, x xVar2, x xVar3) {
        return null;
    }

    @Override // java.util.List
    public final T get(int i10) {
        return s().c.get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return s().c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return s().c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return s().c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new q(this, 0);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i10) {
        return new q(this, i10);
    }

    @Override // java.util.List
    public final T remove(int i10) {
        int i11;
        c<? extends T> cVar;
        f i12;
        boolean z10;
        T t10 = get(i10);
        do {
            Object obj = n.f16611a;
            synchronized (obj) {
                a aVar = this.f2954i;
                g.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) SnapshotKt.h(aVar);
                i11 = aVar2.f2955d;
                cVar = aVar2.c;
                m7.n nVar = m7.n.f16010a;
            }
            g.c(cVar);
            c<? extends T> p10 = cVar.p(i10);
            if (g.a(p10, cVar)) {
                break;
            }
            synchronized (obj) {
                a aVar3 = this.f2954i;
                g.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.c) {
                    i12 = SnapshotKt.i();
                    a aVar4 = (a) SnapshotKt.s(aVar3, this, i12);
                    if (aVar4.f2955d == i11) {
                        aVar4.c(p10);
                        z10 = true;
                        aVar4.f2955d++;
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.l(i12, this);
            }
        } while (!z10);
        return t10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        int i10;
        c<? extends T> cVar;
        boolean z10;
        f i11;
        g.f(collection, "elements");
        do {
            Object obj = n.f16611a;
            synchronized (obj) {
                a aVar = this.f2954i;
                g.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) SnapshotKt.h(aVar);
                i10 = aVar2.f2955d;
                cVar = aVar2.c;
                m7.n nVar = m7.n.f16010a;
            }
            g.c(cVar);
            c<? extends T> removeAll = cVar.removeAll((Collection<? extends Object>) collection);
            z10 = false;
            if (g.a(removeAll, cVar)) {
                return false;
            }
            synchronized (obj) {
                a aVar3 = this.f2954i;
                g.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.c) {
                    i11 = SnapshotKt.i();
                    a aVar4 = (a) SnapshotKt.s(aVar3, this, i11);
                    if (aVar4.f2955d == i10) {
                        aVar4.c(removeAll);
                        aVar4.f2955d++;
                        z10 = true;
                    }
                }
                SnapshotKt.l(i11, this);
            }
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        g.f(collection, "elements");
        return u(new SnapshotStateList$retainAll$1(collection));
    }

    public final a<T> s() {
        a aVar = this.f2954i;
        g.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (a) SnapshotKt.p(aVar, this);
    }

    @Override // java.util.List
    public final T set(int i10, T t10) {
        int i11;
        c<? extends T> cVar;
        f i12;
        boolean z10;
        T t11 = get(i10);
        do {
            Object obj = n.f16611a;
            synchronized (obj) {
                a aVar = this.f2954i;
                g.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) SnapshotKt.h(aVar);
                i11 = aVar2.f2955d;
                cVar = aVar2.c;
                m7.n nVar = m7.n.f16010a;
            }
            g.c(cVar);
            c<? extends T> cVar2 = cVar.set(i10, (int) t10);
            if (g.a(cVar2, cVar)) {
                break;
            }
            synchronized (obj) {
                a aVar3 = this.f2954i;
                g.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.c) {
                    i12 = SnapshotKt.i();
                    a aVar4 = (a) SnapshotKt.s(aVar3, this, i12);
                    if (aVar4.f2955d == i11) {
                        aVar4.c(cVar2);
                        z10 = true;
                        aVar4.f2955d++;
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.l(i12, this);
            }
        } while (!z10);
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return s().c.size();
    }

    @Override // java.util.List
    public final List<T> subList(int i10, int i11) {
        boolean z10 = true;
        if (!(i10 >= 0 && i10 <= i11) || i11 > size()) {
            z10 = false;
        }
        if (z10) {
            return new y(this, i10, i11);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // p0.w
    public final void t(x xVar) {
        xVar.f16630b = this.f2954i;
        this.f2954i = (a) xVar;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return i.O(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        g.f(tArr, "array");
        return (T[]) i.P(this, tArr);
    }

    public final boolean u(l<? super List<T>, Boolean> lVar) {
        int i10;
        c<? extends T> cVar;
        Boolean U;
        f i11;
        boolean z10;
        do {
            Object obj = n.f16611a;
            synchronized (obj) {
                a aVar = this.f2954i;
                g.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) SnapshotKt.h(aVar);
                i10 = aVar2.f2955d;
                cVar = aVar2.c;
                m7.n nVar = m7.n.f16010a;
            }
            g.c(cVar);
            PersistentVectorBuilder builder = cVar.builder();
            U = lVar.U(builder);
            c<? extends T> g10 = builder.g();
            if (g.a(g10, cVar)) {
                break;
            }
            synchronized (obj) {
                a aVar3 = this.f2954i;
                g.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.c) {
                    i11 = SnapshotKt.i();
                    a aVar4 = (a) SnapshotKt.s(aVar3, this, i11);
                    if (aVar4.f2955d == i10) {
                        aVar4.c(g10);
                        z10 = true;
                        aVar4.f2955d++;
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.l(i11, this);
            }
        } while (!z10);
        return U.booleanValue();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t10) {
        int i10;
        c<? extends T> cVar;
        boolean z10;
        f i11;
        do {
            Object obj = n.f16611a;
            synchronized (obj) {
                a aVar = this.f2954i;
                g.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) SnapshotKt.h(aVar);
                i10 = aVar2.f2955d;
                cVar = aVar2.c;
                m7.n nVar = m7.n.f16010a;
            }
            g.c(cVar);
            c<? extends T> add = cVar.add((c<? extends T>) t10);
            z10 = false;
            if (g.a(add, cVar)) {
                return false;
            }
            synchronized (obj) {
                a aVar3 = this.f2954i;
                g.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.c) {
                    i11 = SnapshotKt.i();
                    a aVar4 = (a) SnapshotKt.s(aVar3, this, i11);
                    if (aVar4.f2955d == i10) {
                        aVar4.c(add);
                        aVar4.f2955d++;
                        z10 = true;
                    }
                }
                SnapshotKt.l(i11, this);
            }
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        c<? extends T> cVar;
        boolean z10;
        f i11;
        do {
            Object obj2 = n.f16611a;
            synchronized (obj2) {
                a aVar = this.f2954i;
                g.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) SnapshotKt.h(aVar);
                i10 = aVar2.f2955d;
                cVar = aVar2.c;
                m7.n nVar = m7.n.f16010a;
            }
            g.c(cVar);
            c<? extends T> remove = cVar.remove((c<? extends T>) obj);
            z10 = false;
            if (g.a(remove, cVar)) {
                return false;
            }
            synchronized (obj2) {
                a aVar3 = this.f2954i;
                g.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.c) {
                    i11 = SnapshotKt.i();
                    a aVar4 = (a) SnapshotKt.s(aVar3, this, i11);
                    if (aVar4.f2955d == i10) {
                        aVar4.c(remove);
                        aVar4.f2955d++;
                        z10 = true;
                    }
                }
                SnapshotKt.l(i11, this);
            }
        } while (!z10);
        return true;
    }
}
