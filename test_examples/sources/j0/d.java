package j0;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import java.util.Arrays;
import java.util.ListIterator;
import n7.i;
import u7.l;

/* loaded from: classes.dex */
public final class d<E> extends AbstractPersistentList<E> {

    /* renamed from: i  reason: collision with root package name */
    public final Object[] f12626i;

    /* renamed from: j  reason: collision with root package name */
    public final Object[] f12627j;

    /* renamed from: k  reason: collision with root package name */
    public final int f12628k;

    /* renamed from: l  reason: collision with root package name */
    public final int f12629l;

    public d(Object[] objArr, Object[] objArr2, int i10, int i11) {
        boolean z10;
        v7.g.f(objArr, "root");
        v7.g.f(objArr2, "tail");
        this.f12626i = objArr;
        this.f12627j = objArr2;
        this.f12628k = i10;
        this.f12629l = i11;
        if (c() > 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + c()).toString());
    }

    public static Object[] z(int i10, int i11, Object obj, Object[] objArr) {
        int i12 = (i11 >> i10) & 31;
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        v7.g.e(copyOf, "copyOf(this, newSize)");
        if (i10 == 0) {
            copyOf[i12] = obj;
        } else {
            Object obj2 = copyOf[i12];
            v7.g.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[i12] = z(i10 - 5, i11, obj, (Object[]) obj2);
        }
        return copyOf;
    }

    @Override // n7.a, java.util.List, i0.c
    public final i0.c<E> add(int i10, E e10) {
        a1.c.W(i10, c());
        if (i10 == c()) {
            return add((d<E>) e10);
        }
        int y10 = y();
        if (i10 >= y10) {
            return s(this.f12626i, i10 - y10, e10);
        }
        c cVar = new c((Object) null);
        return s(g(this.f12626i, this.f12629l, i10, e10, cVar), 0, cVar.f12625b);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int c() {
        return this.f12628k;
    }

    @Override // i0.c
    /* renamed from: d */
    public final PersistentVectorBuilder<E> builder() {
        return new PersistentVectorBuilder<>(this, this.f12626i, this.f12627j, this.f12629l);
    }

    public final Object[] g(Object[] objArr, int i10, int i11, Object obj, c cVar) {
        Object[] objArr2;
        int i12 = (i11 >> i10) & 31;
        if (i10 == 0) {
            if (i12 == 0) {
                objArr2 = new Object[32];
            } else {
                Object[] copyOf = Arrays.copyOf(objArr, 32);
                v7.g.e(copyOf, "copyOf(this, newSize)");
                objArr2 = copyOf;
            }
            i.b2(objArr, objArr2, i12 + 1, i12, 31);
            cVar.f12625b = objArr[31];
            objArr2[i12] = obj;
            return objArr2;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        v7.g.e(copyOf2, "copyOf(this, newSize)");
        int i13 = i10 - 5;
        Object obj2 = objArr[i12];
        v7.g.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[i12] = g((Object[]) obj2, i13, i11, obj, cVar);
        while (true) {
            i12++;
            if (i12 >= 32 || copyOf2[i12] == null) {
                break;
            }
            Object obj3 = objArr[i12];
            v7.g.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[i12] = g((Object[]) obj3, i13, 0, cVar.f12625b, cVar);
        }
        return copyOf2;
    }

    @Override // n7.a, java.util.List
    public final E get(int i10) {
        Object[] objArr;
        a1.c.V(i10, c());
        if (y() <= i10) {
            objArr = this.f12627j;
        } else {
            objArr = this.f12626i;
            for (int i11 = this.f12629l; i11 > 0; i11 -= 5) {
                Object obj = objArr[(i10 >> i11) & 31];
                v7.g.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i10 & 31];
    }

    @Override // i0.c
    public final i0.c<E> l(l<? super E, Boolean> lVar) {
        PersistentVectorBuilder<E> builder = builder();
        builder.N(lVar);
        return builder.g();
    }

    @Override // n7.a, java.util.List
    public final ListIterator<E> listIterator(int i10) {
        a1.c.W(i10, c());
        Object[] objArr = this.f12626i;
        Object[] objArr2 = this.f12627j;
        v7.g.d(objArr2, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector>");
        return new e(objArr, objArr2, i10, c(), (this.f12629l / 5) + 1);
    }

    @Override // i0.c
    public final i0.c<E> p(int i10) {
        a1.c.V(i10, this.f12628k);
        int y10 = y();
        Object[] objArr = this.f12626i;
        int i11 = this.f12629l;
        return i10 >= y10 ? x(objArr, y10, i11, i10 - y10) : x(w(objArr, i11, i10, new c(this.f12627j[0])), y10, i11, 0);
    }

    public final d<E> s(Object[] objArr, int i10, Object obj) {
        int y10 = y();
        int i11 = this.f12628k;
        int i12 = i11 - y10;
        Object[] objArr2 = this.f12627j;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        v7.g.e(copyOf, "copyOf(this, newSize)");
        if (i12 < 32) {
            i.b2(objArr2, copyOf, i10 + 1, i10, i12);
            copyOf[i10] = obj;
            return new d<>(objArr, copyOf, i11 + 1, this.f12629l);
        }
        Object obj2 = objArr2[31];
        i.b2(objArr2, copyOf, i10 + 1, i10, i12 - 1);
        copyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return u(objArr, copyOf, objArr3);
    }

    @Override // n7.a, java.util.List, i0.c
    public final i0.c<E> set(int i10, E e10) {
        int i11 = this.f12628k;
        a1.c.V(i10, i11);
        int y10 = y();
        Object[] objArr = this.f12627j;
        Object[] objArr2 = this.f12626i;
        int i12 = this.f12629l;
        if (y10 <= i10) {
            Object[] copyOf = Arrays.copyOf(objArr, 32);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            copyOf[i10 & 31] = e10;
            return new d(objArr2, copyOf, i11, i12);
        }
        return new d(z(i12, i10, e10, objArr2), objArr, i11, i12);
    }

    public final Object[] t(Object[] objArr, int i10, int i11, c cVar) {
        Object[] t10;
        int i12 = (i11 >> i10) & 31;
        if (i10 == 5) {
            cVar.f12625b = objArr[i12];
            t10 = null;
        } else {
            Object obj = objArr[i12];
            v7.g.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            t10 = t((Object[]) obj, i10 - 5, i11, cVar);
        }
        if (t10 == null && i12 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        v7.g.e(copyOf, "copyOf(this, newSize)");
        copyOf[i12] = t10;
        return copyOf;
    }

    public final d<E> u(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f12628k;
        int i11 = i10 >> 5;
        int i12 = this.f12629l;
        if (i11 > (1 << i12)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            int i13 = i12 + 5;
            return new d<>(v(i13, objArr4, objArr2), objArr3, i10 + 1, i13);
        }
        return new d<>(v(i12, objArr, objArr2), objArr3, i10 + 1, i12);
    }

    public final Object[] v(int i10, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int c = ((c() - 1) >> i10) & 31;
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            v7.g.e(objArr3, "copyOf(this, newSize)");
        } else {
            objArr3 = new Object[32];
        }
        if (i10 == 5) {
            objArr3[c] = objArr2;
        } else {
            objArr3[c] = v(i10 - 5, (Object[]) objArr3[c], objArr2);
        }
        return objArr3;
    }

    public final Object[] w(Object[] objArr, int i10, int i11, c cVar) {
        Object[] copyOf;
        int i12 = 31;
        int i13 = (i11 >> i10) & 31;
        if (i10 == 0) {
            if (i13 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                v7.g.e(copyOf, "copyOf(this, newSize)");
            }
            i.b2(objArr, copyOf, i13, i13 + 1, 32);
            copyOf[31] = cVar.f12625b;
            cVar.f12625b = objArr[i13];
            return copyOf;
        }
        if (objArr[31] == null) {
            i12 = 31 & ((y() - 1) >> i10);
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        v7.g.e(copyOf2, "copyOf(this, newSize)");
        int i14 = i10 - 5;
        int i15 = i13 + 1;
        if (i15 <= i12) {
            while (true) {
                Object obj = copyOf2[i12];
                v7.g.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[i12] = w((Object[]) obj, i14, 0, cVar);
                if (i12 == i15) {
                    break;
                }
                i12--;
            }
        }
        Object obj2 = copyOf2[i13];
        v7.g.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[i13] = w((Object[]) obj2, i14, i11, cVar);
        return copyOf2;
    }

    public final AbstractPersistentList x(Object[] objArr, int i10, int i11, int i12) {
        d dVar;
        int i13 = this.f12628k - i10;
        if (i13 == 1) {
            if (i11 == 0) {
                if (objArr.length == 33) {
                    objArr = Arrays.copyOf(objArr, 32);
                    v7.g.e(objArr, "copyOf(this, newSize)");
                }
                return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a(objArr);
            }
            c cVar = new c((Object) null);
            Object[] t10 = t(objArr, i11, i10 - 1, cVar);
            v7.g.c(t10);
            Object obj = cVar.f12625b;
            v7.g.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object[] objArr2 = (Object[]) obj;
            if (t10[1] == null) {
                Object obj2 = t10[0];
                v7.g.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                dVar = new d((Object[]) obj2, objArr2, i10, i11 - 5);
            } else {
                dVar = new d(t10, objArr2, i10, i11);
            }
            return dVar;
        }
        Object[] objArr3 = this.f12627j;
        Object[] copyOf = Arrays.copyOf(objArr3, 32);
        v7.g.e(copyOf, "copyOf(this, newSize)");
        int i14 = i13 - 1;
        if (i12 < i14) {
            i.b2(objArr3, copyOf, i12, i12 + 1, i13);
        }
        copyOf[i14] = null;
        return new d(objArr, copyOf, (i10 + i13) - 1, i11);
    }

    public final int y() {
        return (c() - 1) & (-32);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, i0.c
    public final i0.c<E> add(E e10) {
        int y10 = y();
        int i10 = this.f12628k;
        int i11 = i10 - y10;
        Object[] objArr = this.f12627j;
        Object[] objArr2 = this.f12626i;
        if (i11 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = e10;
            return u(objArr2, objArr, objArr3);
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        v7.g.e(copyOf, "copyOf(this, newSize)");
        copyOf[i11] = e10;
        return new d(objArr2, copyOf, i10 + 1, this.f12629l);
    }
}
