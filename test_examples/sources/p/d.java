package p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p.g;

/* loaded from: classes.dex */
public final class d<E> implements Collection<E>, Set<E> {

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f16543m = new int[0];
    public static final Object[] n = new Object[0];

    /* renamed from: o  reason: collision with root package name */
    public static Object[] f16544o;

    /* renamed from: p  reason: collision with root package name */
    public static int f16545p;

    /* renamed from: q  reason: collision with root package name */
    public static Object[] f16546q;

    /* renamed from: r  reason: collision with root package name */
    public static int f16547r;

    /* renamed from: i  reason: collision with root package name */
    public int[] f16548i;

    /* renamed from: j  reason: collision with root package name */
    public Object[] f16549j;

    /* renamed from: k  reason: collision with root package name */
    public int f16550k;

    /* renamed from: l  reason: collision with root package name */
    public c f16551l;

    public d() {
        this(0);
    }

    public d(int i10) {
        if (i10 == 0) {
            this.f16548i = f16543m;
            this.f16549j = n;
        } else {
            c(i10);
        }
        this.f16550k = 0;
    }

    public static void d(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (d.class) {
                if (f16547r < 10) {
                    objArr[0] = f16546q;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f16546q = objArr;
                    f16547r++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (d.class) {
                if (f16545p < 10) {
                    objArr[0] = f16544o;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f16544o = objArr;
                    f16545p++;
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        int i10;
        int g10;
        if (e10 == null) {
            g10 = h();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            g10 = g(hashCode, e10);
        }
        if (g10 >= 0) {
            return false;
        }
        int i11 = ~g10;
        int i12 = this.f16550k;
        int[] iArr = this.f16548i;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f16549j;
            c(i13);
            int[] iArr2 = this.f16548i;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f16549j, 0, objArr.length);
            }
            d(iArr, objArr, this.f16550k);
        }
        int i14 = this.f16550k;
        if (i11 < i14) {
            int[] iArr3 = this.f16548i;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f16549j;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f16550k - i11);
        }
        this.f16548i[i11] = i10;
        this.f16549j[i11] = e10;
        this.f16550k++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f16550k;
        int[] iArr = this.f16548i;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f16549j;
            c(size);
            int i10 = this.f16550k;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f16548i, 0, i10);
                System.arraycopy(objArr, 0, this.f16549j, 0, this.f16550k);
            }
            d(iArr, objArr, this.f16550k);
        }
        for (E e10 : collection) {
            z10 |= add(e10);
        }
        return z10;
    }

    public final void c(int i10) {
        if (i10 == 8) {
            synchronized (d.class) {
                Object[] objArr = f16546q;
                if (objArr != null) {
                    this.f16549j = objArr;
                    f16546q = (Object[]) objArr[0];
                    this.f16548i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f16547r--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (d.class) {
                Object[] objArr2 = f16544o;
                if (objArr2 != null) {
                    this.f16549j = objArr2;
                    f16544o = (Object[]) objArr2[0];
                    this.f16548i = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f16545p--;
                    return;
                }
            }
        }
        this.f16548i = new int[i10];
        this.f16549j = new Object[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f16550k;
        if (i10 != 0) {
            d(this.f16548i, this.f16549j, i10);
            this.f16548i = f16543m;
            this.f16549j = n;
            this.f16550k = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f16550k != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f16550k; i10++) {
                try {
                    if (!set.contains(this.f16549j[i10])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int g(int i10, Object obj) {
        int i11 = this.f16550k;
        if (i11 == 0) {
            return -1;
        }
        int p10 = ma.i.p(i11, i10, this.f16548i);
        if (p10 >= 0 && !obj.equals(this.f16549j[p10])) {
            int i12 = p10 + 1;
            while (i12 < i11 && this.f16548i[i12] == i10) {
                if (obj.equals(this.f16549j[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = p10 - 1; i13 >= 0 && this.f16548i[i13] == i10; i13--) {
                if (obj.equals(this.f16549j[i13])) {
                    return i13;
                }
            }
            return ~i12;
        }
        return p10;
    }

    public final int h() {
        int i10 = this.f16550k;
        if (i10 == 0) {
            return -1;
        }
        int p10 = ma.i.p(i10, 0, this.f16548i);
        if (p10 >= 0 && this.f16549j[p10] != null) {
            int i11 = p10 + 1;
            while (i11 < i10 && this.f16548i[i11] == 0) {
                if (this.f16549j[i11] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = p10 - 1; i12 >= 0 && this.f16548i[i12] == 0; i12--) {
                if (this.f16549j[i12] == null) {
                    return i12;
                }
            }
            return ~i11;
        }
        return p10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f16548i;
        int i10 = this.f16550k;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public final int indexOf(Object obj) {
        return obj == null ? h() : g(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f16550k <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        if (this.f16551l == null) {
            this.f16551l = new c(this);
        }
        c cVar = this.f16551l;
        if (cVar.f16562b == null) {
            cVar.f16562b = new g.c();
        }
        return (Iterator<E>) cVar.f16562b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            s(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f16550k - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f16549j[i10])) {
                s(i10);
                z10 = true;
            }
        }
        return z10;
    }

    public final void s(int i10) {
        Object[] objArr = this.f16549j;
        Object obj = objArr[i10];
        int i11 = this.f16550k;
        if (i11 <= 1) {
            d(this.f16548i, objArr, i11);
            this.f16548i = f16543m;
            this.f16549j = n;
            this.f16550k = 0;
            return;
        }
        int[] iArr = this.f16548i;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            int i12 = i11 - 1;
            this.f16550k = i12;
            if (i10 < i12) {
                int i13 = i10 + 1;
                System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                Object[] objArr2 = this.f16549j;
                System.arraycopy(objArr2, i13, objArr2, i10, this.f16550k - i10);
            }
            this.f16549j[this.f16550k] = null;
            return;
        }
        c(i11 > 8 ? i11 + (i11 >> 1) : 8);
        this.f16550k--;
        if (i10 > 0) {
            System.arraycopy(iArr, 0, this.f16548i, 0, i10);
            System.arraycopy(objArr, 0, this.f16549j, 0, i10);
        }
        int i14 = this.f16550k;
        if (i10 < i14) {
            int i15 = i10 + 1;
            System.arraycopy(iArr, i15, this.f16548i, i10, i14 - i10);
            System.arraycopy(objArr, i15, this.f16549j, i10, this.f16550k - i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f16550k;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i10 = this.f16550k;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f16549j, 0, objArr, 0, i10);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f16550k) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f16550k));
        }
        System.arraycopy(this.f16549j, 0, tArr, 0, this.f16550k);
        int length = tArr.length;
        int i10 = this.f16550k;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16550k * 14);
        sb.append('{');
        for (int i10 = 0; i10 < this.f16550k; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object obj = this.f16549j[i10];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
