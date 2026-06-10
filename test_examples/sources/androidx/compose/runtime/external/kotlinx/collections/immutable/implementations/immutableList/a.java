package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import i0.c;
import j0.d;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.collections.b;
import n7.i;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class a<E> extends AbstractPersistentList<E> implements i0.a<E> {

    /* renamed from: j  reason: collision with root package name */
    public static final a f2886j = new a(new Object[0]);

    /* renamed from: i  reason: collision with root package name */
    public final Object[] f2887i;

    public a(Object[] objArr) {
        this.f2887i = objArr;
    }

    @Override // n7.a, java.util.List, i0.c
    public final c<E> add(int i10, E e10) {
        Object[] objArr = this.f2887i;
        a1.c.W(i10, objArr.length);
        Object[] objArr2 = this.f2887i;
        if (i10 == objArr2.length) {
            return add((a<E>) e10);
        }
        if (objArr2.length < 32) {
            Object[] objArr3 = new Object[objArr2.length + 1];
            i.d2(objArr2, objArr3, 0, 0, i10, 6);
            i.b2(objArr2, objArr3, i10 + 1, i10, objArr.length);
            objArr3[i10] = e10;
            return new a(objArr3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        g.e(copyOf, "copyOf(this, size)");
        i.b2(objArr2, copyOf, i10 + 1, i10, objArr.length - 1);
        copyOf[i10] = e10;
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr2[31];
        return new d(copyOf, objArr4, objArr.length + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, i0.c
    public final c<E> addAll(Collection<? extends E> collection) {
        g.f(collection, "elements");
        Object[] objArr = this.f2887i;
        if (collection.size() + objArr.length <= 32) {
            Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
            g.e(copyOf, "copyOf(this, newSize)");
            int length = objArr.length;
            for (E e10 : collection) {
                copyOf[length] = e10;
                length++;
            }
            return new a(copyOf);
        }
        PersistentVectorBuilder builder = builder();
        builder.addAll(collection);
        return builder.g();
    }

    @Override // i0.c
    public final PersistentVectorBuilder builder() {
        return new PersistentVectorBuilder(this, null, this.f2887i, 0);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int c() {
        return this.f2887i.length;
    }

    @Override // n7.a, java.util.List
    public final E get(int i10) {
        a1.c.V(i10, c());
        return (E) this.f2887i[i10];
    }

    @Override // n7.a, java.util.List
    public final int indexOf(Object obj) {
        return b.p2(obj, this.f2887i);
    }

    @Override // i0.c
    public final c<E> l(l<? super E, Boolean> lVar) {
        Object[] objArr = this.f2887i;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z10 = false;
        for (int i10 = 0; i10 < length2; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) ((AbstractPersistentList$removeAll$1) lVar).U(obj)).booleanValue()) {
                if (!z10) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    g.e(objArr2, "copyOf(this, size)");
                    z10 = true;
                    length = i10;
                }
            } else if (z10) {
                objArr2[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        if (length == 0) {
            return f2886j;
        }
        return new a(i.f2(0, length, objArr2));
    }

    @Override // n7.a, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f2887i;
        g.f(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i10 = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i10 < 0) {
                    return -1;
                }
                length = i10;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i11 = length2 - 1;
                if (g.a(obj, objArr[length2])) {
                    return length2;
                }
                if (i11 < 0) {
                    return -1;
                }
                length2 = i11;
            }
        }
    }

    @Override // n7.a, java.util.List
    public final ListIterator<E> listIterator(int i10) {
        a1.c.W(i10, c());
        Object[] objArr = this.f2887i;
        g.d(objArr, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector>");
        return new j0.b(i10, c(), objArr);
    }

    @Override // i0.c
    public final c<E> p(int i10) {
        Object[] objArr = this.f2887i;
        a1.c.V(i10, objArr.length);
        if (objArr.length == 1) {
            return f2886j;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        g.e(copyOf, "copyOf(this, newSize)");
        i.b2(objArr, copyOf, i10, i10 + 1, objArr.length);
        return new a(copyOf);
    }

    @Override // n7.a, java.util.List, i0.c
    public final c<E> set(int i10, E e10) {
        a1.c.V(i10, c());
        Object[] objArr = this.f2887i;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        g.e(copyOf, "copyOf(this, size)");
        copyOf[i10] = e10;
        return new a(copyOf);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, i0.c
    public final c<E> add(E e10) {
        Object[] objArr = this.f2887i;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            g.e(copyOf, "copyOf(this, newSize)");
            copyOf[objArr.length] = e10;
            return new a(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = e10;
        return new d(objArr, objArr2, objArr.length + 1, 0);
    }
}
