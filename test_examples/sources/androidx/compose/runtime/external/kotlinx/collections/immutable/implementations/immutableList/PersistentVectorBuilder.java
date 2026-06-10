package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import j0.d;
import j0.f;
import j0.h;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import m0.b;
import n7.c;
import n7.i;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class PersistentVectorBuilder<E> extends c<E> implements Collection {

    /* renamed from: i  reason: collision with root package name */
    public i0.c<? extends E> f2878i;

    /* renamed from: j  reason: collision with root package name */
    public Object[] f2879j;

    /* renamed from: k  reason: collision with root package name */
    public Object[] f2880k;

    /* renamed from: l  reason: collision with root package name */
    public int f2881l;

    /* renamed from: m  reason: collision with root package name */
    public b f2882m;
    public Object[] n;

    /* renamed from: o  reason: collision with root package name */
    public Object[] f2883o;

    /* renamed from: p  reason: collision with root package name */
    public int f2884p;

    public PersistentVectorBuilder(i0.c<? extends E> cVar, Object[] objArr, Object[] objArr2, int i10) {
        g.f(cVar, "vector");
        g.f(objArr2, "vectorTail");
        this.f2878i = cVar;
        this.f2879j = objArr;
        this.f2880k = objArr2;
        this.f2881l = i10;
        this.f2882m = new b();
        this.n = objArr;
        this.f2883o = objArr2;
        this.f2884p = cVar.size();
    }

    public static void s(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    public final Object[] A(int i10, Object[] objArr) {
        if (x(objArr)) {
            i.b2(objArr, objArr, i10, 0, 32 - i10);
            return objArr;
        }
        Object[] B = B();
        i.b2(objArr, B, i10, 0, 32 - i10);
        return B;
    }

    public final Object[] B() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f2882m;
        return objArr;
    }

    public final Object[] C(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f2882m;
        return objArr;
    }

    public final Object[] D(int i10, int i11, Object[] objArr) {
        boolean z10;
        if (i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 == 0) {
                return objArr;
            }
            int i12 = (i10 >> i11) & 31;
            Object obj = objArr[i12];
            g.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object D = D(i10, i11 - 5, (Object[]) obj);
            if (i12 < 31) {
                int i13 = i12 + 1;
                if (objArr[i13] != null) {
                    if (x(objArr)) {
                        Arrays.fill(objArr, i13, 32, (Object) null);
                    }
                    Object[] B = B();
                    i.b2(objArr, B, 0, 0, i13);
                    objArr = B;
                }
            }
            if (D != objArr[i12]) {
                Object[] z11 = z(objArr);
                z11[i12] = D;
                return z11;
            }
            return objArr;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final Object[] E(Object[] objArr, int i10, int i11, j0.c cVar) {
        Object[] E;
        int i12 = ((i11 - 1) >> i10) & 31;
        if (i10 == 5) {
            cVar.f12625b = objArr[i12];
            E = null;
        } else {
            Object obj = objArr[i12];
            g.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            E = E((Object[]) obj, i10 - 5, i11, cVar);
        }
        if (E == null && i12 == 0) {
            return null;
        }
        Object[] z10 = z(objArr);
        z10[i12] = E;
        return z10;
    }

    public final void F(int i10, int i11, Object[] objArr) {
        if (i11 == 0) {
            this.n = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f2883o = objArr;
            this.f2884p = i10;
            this.f2881l = i11;
            return;
        }
        j0.c cVar = new j0.c((Object) null);
        g.c(objArr);
        Object[] E = E(objArr, i11, i10, cVar);
        g.c(E);
        Object obj = cVar.f12625b;
        g.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f2883o = (Object[]) obj;
        this.f2884p = i10;
        if (E[1] == null) {
            this.n = (Object[]) E[0];
            i11 -= 5;
        } else {
            this.n = E;
        }
        this.f2881l = i11;
    }

    public final Object[] G(Object[] objArr, int i10, int i11, Iterator<Object[]> it) {
        if (it.hasNext()) {
            if (i11 >= 0) {
                if (i11 == 0) {
                    return it.next();
                }
                Object[] z10 = z(objArr);
                int i12 = (i10 >> i11) & 31;
                int i13 = i11 - 5;
                z10[i12] = G((Object[]) z10[i12], i10, i13, it);
                while (true) {
                    i12++;
                    if (i12 >= 32 || !it.hasNext()) {
                        break;
                    }
                    z10[i12] = G((Object[]) z10[i12], 0, i13, it);
                }
                return z10;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final Object[] H(Object[] objArr, int i10, Object[][] objArr2) {
        v7.a K0 = b.K0(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f2881l;
        Object[] G = i11 < (1 << i12) ? G(objArr, i10, i12, K0) : z(objArr);
        while (K0.hasNext()) {
            this.f2881l += 5;
            G = C(G);
            int i13 = this.f2881l;
            G(G, 1 << i13, i13, K0);
        }
        return G;
    }

    public final void I(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f2884p >> 5;
        int i11 = this.f2881l;
        if (i10 > (1 << i11)) {
            this.n = J(this.f2881l + 5, C(objArr), objArr2);
            this.f2883o = objArr3;
            this.f2881l += 5;
        } else {
            if (objArr == null) {
                this.n = objArr2;
            } else {
                this.n = J(i11, objArr, objArr2);
            }
            this.f2883o = objArr3;
        }
        this.f2884p++;
    }

    public final Object[] J(int i10, Object[] objArr, Object[] objArr2) {
        int c = ((c() - 1) >> i10) & 31;
        Object[] z10 = z(objArr);
        if (i10 == 5) {
            z10[c] = objArr2;
        } else {
            z10[c] = J(i10 - 5, (Object[]) z10[c], objArr2);
        }
        return z10;
    }

    public final int K(l lVar, Object[] objArr, int i10, int i11, j0.c cVar, ArrayList arrayList, ArrayList arrayList2) {
        Object[] B;
        if (x(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = cVar.f12625b;
        g.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj2 = objArr[i12];
            if (!((Boolean) lVar.U(obj2)).booleanValue()) {
                if (i11 == 32) {
                    if (!arrayList.isEmpty()) {
                        B = (Object[]) arrayList.remove(arrayList.size() - 1);
                    } else {
                        B = B();
                    }
                    objArr3 = B;
                    i11 = 0;
                }
                objArr3[i11] = obj2;
                i11++;
            }
        }
        cVar.f12625b = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i11;
    }

    public final int L(l<? super E, Boolean> lVar, Object[] objArr, int i10, j0.c cVar) {
        Object[] objArr2 = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (lVar.U(obj).booleanValue()) {
                if (!z10) {
                    objArr2 = z(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArr2[i11] = obj;
                i11++;
            }
        }
        cVar.f12625b = objArr2;
        return i11;
    }

    public final int M(l<? super E, Boolean> lVar, int i10, j0.c cVar) {
        int L = L(lVar, this.f2883o, i10, cVar);
        if (L == i10) {
            return i10;
        }
        Object obj = cVar.f12625b;
        g.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, L, i10, (Object) null);
        this.f2883o = objArr;
        this.f2884p -= i10 - L;
        return L;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean N(l<? super E, Boolean> lVar) {
        Object[] G;
        boolean z10;
        int i10;
        int T = T();
        Object[] objArr = null;
        j0.c cVar = new j0.c((Object) null);
        boolean z11 = false;
        if (this.n == null) {
            if (M(lVar, T, cVar) != T) {
                z11 = true;
            }
            if (z11) {
                ((AbstractList) this).modCount++;
            }
            return z11;
        }
        j0.a y10 = y(0);
        int i11 = 32;
        while (i11 == 32 && y10.hasNext()) {
            i11 = L(lVar, (Object[]) y10.next(), 32, cVar);
        }
        if (i11 == 32) {
            int M = M(lVar, T, cVar);
            if (M == 0) {
                F(this.f2884p, this.f2881l, this.n);
            }
            if (M != T) {
            }
            if (z11) {
            }
            return z11;
        }
        int i12 = (y10.f12621i - 1) << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i13 = i11;
        while (y10.hasNext()) {
            i13 = K(lVar, (Object[]) y10.next(), 32, i13, cVar, arrayList2, arrayList);
            i12 = i12;
        }
        int i14 = i12;
        int K = K(lVar, this.f2883o, T, i13, cVar, arrayList2, arrayList);
        Object obj = cVar.f12625b;
        g.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Arrays.fill(objArr2, K, 32, (Object) null);
        if (arrayList.isEmpty()) {
            G = this.n;
            g.c(G);
        } else {
            G = G(this.n, i14, this.f2881l, arrayList.iterator());
        }
        int size = i14 + (arrayList.size() << 5);
        if ((size & 31) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (size == 0) {
                this.f2881l = 0;
            } else {
                int i15 = size - 1;
                while (true) {
                    i10 = this.f2881l;
                    if ((i15 >> i10) != 0) {
                        break;
                    }
                    this.f2881l = i10 - 5;
                    Object[] objArr3 = G[0];
                    g.d(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    G = objArr3;
                }
                objArr = D(i15, i10, G);
            }
            this.n = objArr;
            this.f2883o = objArr2;
            this.f2884p = size + K;
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
        z11 = true;
        if (z11) {
        }
        return z11;
    }

    public final Object[] O(Object[] objArr, int i10, int i11, j0.c cVar) {
        int i12 = 31;
        int i13 = (i11 >> i10) & 31;
        if (i10 == 0) {
            Object obj = objArr[i13];
            Object[] z10 = z(objArr);
            i.b2(objArr, z10, i13, i13 + 1, 32);
            z10[31] = cVar.f12625b;
            cVar.f12625b = obj;
            return z10;
        }
        if (objArr[31] == null) {
            i12 = 31 & ((Q() - 1) >> i10);
        }
        Object[] z11 = z(objArr);
        int i14 = i10 - 5;
        int i15 = i13 + 1;
        if (i15 <= i12) {
            while (true) {
                Object obj2 = z11[i12];
                g.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                z11[i12] = O((Object[]) obj2, i14, 0, cVar);
                if (i12 == i15) {
                    break;
                }
                i12--;
            }
        }
        Object obj3 = z11[i13];
        g.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        z11[i13] = O((Object[]) obj3, i14, i11, cVar);
        return z11;
    }

    public final Object P(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f2884p - i10;
        if (i13 == 1) {
            Object obj = this.f2883o[0];
            F(i10, i11, objArr);
            return obj;
        }
        Object[] objArr2 = this.f2883o;
        Object obj2 = objArr2[i12];
        Object[] z10 = z(objArr2);
        i.b2(objArr2, z10, i12, i12 + 1, i13);
        z10[i13 - 1] = null;
        this.n = objArr;
        this.f2883o = z10;
        this.f2884p = (i10 + i13) - 1;
        this.f2881l = i11;
        return obj2;
    }

    public final int Q() {
        if (c() <= 32) {
            return 0;
        }
        return (c() - 1) & (-32);
    }

    public final Object[] R(Object[] objArr, int i10, int i11, E e10, j0.c cVar) {
        int i12 = (i11 >> i10) & 31;
        Object[] z10 = z(objArr);
        if (i10 == 0) {
            if (z10 != objArr) {
                ((AbstractList) this).modCount++;
            }
            cVar.f12625b = z10[i12];
            z10[i12] = e10;
            return z10;
        }
        Object obj = z10[i12];
        g.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        z10[i12] = R((Object[]) obj, i10 - 5, i11, e10, cVar);
        return z10;
    }

    public final void S(Collection<? extends E> collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] B;
        if (!(i12 >= 1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Object[] z10 = z(objArr);
        objArr2[0] = z10;
        int i13 = i10 & 31;
        int size = ((collection.size() + i10) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            i.b2(z10, objArr3, size + 1, i13, i11);
        } else {
            int i15 = (i14 - 32) + 1;
            if (i12 == 1) {
                B = z10;
            } else {
                B = B();
                i12--;
                objArr2[i12] = B;
            }
            int i16 = i11 - i15;
            i.b2(z10, objArr3, 0, i16, i11);
            i.b2(z10, B, size + 1, i13, i16);
            objArr3 = B;
        }
        Iterator<? extends E> it = collection.iterator();
        s(z10, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            Object[] B2 = B();
            s(B2, 0, it);
            objArr2[i17] = B2;
        }
        s(objArr3, 0, it);
    }

    public final int T() {
        int i10 = this.f2884p;
        return i10 <= 32 ? i10 : i10 - ((i10 - 1) & (-32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        a1.c.W(i10, c());
        if (i10 == c()) {
            add(e10);
            return;
        }
        ((AbstractList) this).modCount++;
        int Q = Q();
        if (i10 >= Q) {
            w(this.n, i10 - Q, e10);
            return;
        }
        j0.c cVar = new j0.c((Object) null);
        Object[] objArr = this.n;
        g.c(objArr);
        w(v(objArr, this.f2881l, i10, e10, cVar), 0, cVar.f12625b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        Object[] B;
        g.f(collection, "elements");
        a1.c.W(i10, this.f2884p);
        if (i10 == this.f2884p) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = ((collection.size() + (this.f2884p - i11)) - 1) / 32;
        if (size == 0) {
            int i12 = i10 & 31;
            Object[] objArr = this.f2883o;
            Object[] z10 = z(objArr);
            i.b2(objArr, z10, (((collection.size() + i10) - 1) & 31) + 1, i12, T());
            s(z10, i12, collection.iterator());
            this.f2883o = z10;
        } else {
            Object[][] objArr2 = new Object[size];
            int T = T();
            int size2 = collection.size() + this.f2884p;
            if (size2 > 32) {
                size2 -= (size2 - 1) & (-32);
            }
            if (i10 >= Q()) {
                B = B();
                S(collection, i10, this.f2883o, T, objArr2, size, B);
            } else if (size2 > T) {
                int i13 = size2 - T;
                B = A(i13, this.f2883o);
                u(collection, i10, i13, objArr2, size, B);
            } else {
                Object[] objArr3 = this.f2883o;
                B = B();
                int i14 = T - size2;
                i.b2(objArr3, B, 0, i14, T);
                int i15 = 32 - i14;
                Object[] A = A(i15, this.f2883o);
                int i16 = size - 1;
                objArr2[i16] = A;
                u(collection, i10, i15, objArr2, i16, A);
            }
            this.n = H(this.n, i11, objArr2);
            this.f2883o = B;
        }
        this.f2884p = collection.size() + this.f2884p;
        return true;
    }

    @Override // n7.c
    public final int c() {
        return this.f2884p;
    }

    @Override // n7.c
    public final E d(int i10) {
        a1.c.V(i10, c());
        ((AbstractList) this).modCount++;
        int Q = Q();
        if (i10 >= Q) {
            return (E) P(this.n, Q, this.f2881l, i10 - Q);
        }
        j0.c cVar = new j0.c(this.f2883o[0]);
        Object[] objArr = this.n;
        g.c(objArr);
        P(O(objArr, this.f2881l, i10, cVar), Q, this.f2881l, 0);
        return (E) cVar.f12625b;
    }

    public final i0.c<E> g() {
        d dVar;
        boolean z10;
        Object[] objArr = this.n;
        if (objArr == this.f2879j && this.f2883o == this.f2880k) {
            dVar = this.f2878i;
        } else {
            this.f2882m = new b();
            this.f2879j = objArr;
            Object[] objArr2 = this.f2883o;
            this.f2880k = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    dVar = a.f2886j;
                } else {
                    Object[] copyOf = Arrays.copyOf(this.f2883o, c());
                    g.e(copyOf, "copyOf(this, newSize)");
                    dVar = new a(copyOf);
                }
            } else {
                g.c(objArr);
                dVar = new d(objArr, this.f2883o, c(), this.f2881l);
            }
        }
        this.f2878i = dVar;
        return (i0.c<E>) dVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        Object[] objArr;
        a1.c.V(i10, c());
        if (Q() <= i10) {
            objArr = this.f2883o;
        } else {
            objArr = this.n;
            g.c(objArr);
            for (int i11 = this.f2881l; i11 > 0; i11 -= 5) {
                Object obj = objArr[(i10 >> i11) & 31];
                g.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i10 & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i10) {
        a1.c.W(i10, c());
        return new f(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        g.f(collection, "elements");
        return N(new PersistentVectorBuilder$removeAll$1(collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        a1.c.V(i10, c());
        if (Q() <= i10) {
            Object[] z10 = z(this.f2883o);
            if (z10 != this.f2883o) {
                ((AbstractList) this).modCount++;
            }
            int i11 = i10 & 31;
            E e11 = (E) z10[i11];
            z10[i11] = e10;
            this.f2883o = z10;
            return e11;
        }
        j0.c cVar = new j0.c((Object) null);
        Object[] objArr = this.n;
        g.c(objArr);
        this.n = R(objArr, this.f2881l, i10, e10, cVar);
        return (E) cVar.f12625b;
    }

    public final int t() {
        return ((AbstractList) this).modCount;
    }

    public final void u(Collection<? extends E> collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.n != null) {
            int i13 = i10 >> 5;
            j0.a y10 = y(Q() >> 5);
            int i14 = i12;
            Object[] objArr3 = objArr2;
            while (y10.f12621i - 1 != i13) {
                Object[] objArr4 = (Object[]) y10.previous();
                i.b2(objArr4, objArr3, 0, 32 - i11, 32);
                objArr3 = A(i11, objArr4);
                i14--;
                objArr[i14] = objArr3;
            }
            Object[] objArr5 = (Object[]) y10.previous();
            int Q = i12 - (((Q() >> 5) - 1) - i13);
            if (Q < i12) {
                objArr2 = objArr[Q];
                g.c(objArr2);
            }
            S(collection, i10, objArr5, 32, objArr, Q, objArr2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final Object[] v(Object[] objArr, int i10, int i11, Object obj, j0.c cVar) {
        Object obj2;
        int i12 = (i11 >> i10) & 31;
        if (i10 == 0) {
            cVar.f12625b = objArr[31];
            Object[] z10 = z(objArr);
            i.b2(objArr, z10, i12 + 1, i12, 31);
            z10[i12] = obj;
            return z10;
        }
        Object[] z11 = z(objArr);
        int i13 = i10 - 5;
        Object obj3 = z11[i12];
        g.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        z11[i12] = v((Object[]) obj3, i13, i11, obj, cVar);
        while (true) {
            i12++;
            if (i12 >= 32 || (obj2 = z11[i12]) == null) {
                break;
            }
            z11[i12] = v((Object[]) obj2, i13, 0, cVar.f12625b, cVar);
        }
        return z11;
    }

    public final void w(Object[] objArr, int i10, E e10) {
        int T = T();
        Object[] z10 = z(this.f2883o);
        if (T < 32) {
            i.b2(this.f2883o, z10, i10 + 1, i10, T);
            z10[i10] = e10;
            this.n = objArr;
            this.f2883o = z10;
            this.f2884p++;
            return;
        }
        Object[] objArr2 = this.f2883o;
        Object obj = objArr2[31];
        i.b2(objArr2, z10, i10 + 1, i10, 31);
        z10[i10] = e10;
        I(objArr, z10, C(obj));
    }

    public final boolean x(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f2882m;
    }

    public final j0.a y(int i10) {
        if (this.n != null) {
            int Q = Q() >> 5;
            a1.c.W(i10, Q);
            int i11 = this.f2881l;
            if (i11 == 0) {
                Object[] objArr = this.n;
                g.c(objArr);
                return new j0.g(i10, objArr);
            }
            Object[] objArr2 = this.n;
            g.c(objArr2);
            return new h(objArr2, i10, Q, i11 / 5);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final Object[] z(Object[] objArr) {
        if (objArr == null) {
            return B();
        }
        if (x(objArr)) {
            return objArr;
        }
        Object[] B = B();
        int length = objArr.length;
        i.d2(objArr, B, 0, 0, length > 32 ? 32 : length, 6);
        return B;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        ((AbstractList) this).modCount++;
        int T = T();
        if (T < 32) {
            Object[] z10 = z(this.f2883o);
            z10[T] = e10;
            this.f2883o = z10;
            this.f2884p = c() + 1;
        } else {
            I(this.n, this.f2883o, C(e10));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        g.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int T = T();
        Iterator<? extends E> it = collection.iterator();
        if (32 - T >= collection.size()) {
            Object[] z10 = z(this.f2883o);
            s(z10, T, it);
            this.f2883o = z10;
        } else {
            int size = ((collection.size() + T) - 1) / 32;
            Object[][] objArr = new Object[size];
            Object[] z11 = z(this.f2883o);
            s(z11, T, it);
            objArr[0] = z11;
            for (int i10 = 1; i10 < size; i10++) {
                Object[] B = B();
                s(B, 0, it);
                objArr[i10] = B;
            }
            this.n = H(this.n, Q(), objArr);
            Object[] B2 = B();
            s(B2, 0, it);
            this.f2883o = B2;
        }
        this.f2884p = collection.size() + this.f2884p;
        return true;
    }
}
