package p;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class h<K, V> {

    /* renamed from: l  reason: collision with root package name */
    public static Object[] f16575l;

    /* renamed from: m  reason: collision with root package name */
    public static int f16576m;
    public static Object[] n;

    /* renamed from: o  reason: collision with root package name */
    public static int f16577o;

    /* renamed from: i  reason: collision with root package name */
    public int[] f16578i;

    /* renamed from: j  reason: collision with root package name */
    public Object[] f16579j;

    /* renamed from: k  reason: collision with root package name */
    public int f16580k;

    public h() {
        this.f16578i = ma.i.f16038e;
        this.f16579j = ma.i.f16040g;
        this.f16580k = 0;
    }

    public h(int i10) {
        if (i10 == 0) {
            this.f16578i = ma.i.f16038e;
            this.f16579j = ma.i.f16040g;
        } else {
            a(i10);
        }
        this.f16580k = 0;
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (h.class) {
                Object[] objArr = n;
                if (objArr != null) {
                    this.f16579j = objArr;
                    n = (Object[]) objArr[0];
                    this.f16578i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f16577o--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (h.class) {
                Object[] objArr2 = f16575l;
                if (objArr2 != null) {
                    this.f16579j = objArr2;
                    f16575l = (Object[]) objArr2[0];
                    this.f16578i = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f16576m--;
                    return;
                }
            }
        }
        this.f16578i = new int[i10];
        this.f16579j = new Object[i10 << 1];
    }

    public static void c(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                if (f16577o < 10) {
                    objArr[0] = n;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    n = objArr;
                    f16577o++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (h.class) {
                if (f16576m < 10) {
                    objArr[0] = f16575l;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f16575l = objArr;
                    f16576m++;
                }
            }
        }
    }

    public final void b(int i10) {
        int i11 = this.f16580k;
        int[] iArr = this.f16578i;
        if (iArr.length < i10) {
            Object[] objArr = this.f16579j;
            a(i10);
            if (this.f16580k > 0) {
                System.arraycopy(iArr, 0, this.f16578i, 0, i11);
                System.arraycopy(objArr, 0, this.f16579j, 0, i11 << 1);
            }
            c(iArr, objArr, i11);
        }
        if (this.f16580k != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i10 = this.f16580k;
        if (i10 > 0) {
            int[] iArr = this.f16578i;
            Object[] objArr = this.f16579j;
            this.f16578i = ma.i.f16038e;
            this.f16579j = ma.i.f16040g;
            this.f16580k = 0;
            c(iArr, objArr, i10);
        }
        if (this.f16580k > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i10, Object obj) {
        int i11 = this.f16580k;
        if (i11 == 0) {
            return -1;
        }
        try {
            int p10 = ma.i.p(i11, i10, this.f16578i);
            if (p10 < 0) {
                return p10;
            }
            if (obj.equals(this.f16579j[p10 << 1])) {
                return p10;
            }
            int i12 = p10 + 1;
            while (i12 < i11 && this.f16578i[i12] == i10) {
                if (obj.equals(this.f16579j[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = p10 - 1; i13 >= 0 && this.f16578i[i13] == i10; i13--) {
                if (obj.equals(this.f16579j[i13 << 1])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f16580k != hVar.f16580k) {
                return false;
            }
            for (int i10 = 0; i10 < this.f16580k; i10++) {
                try {
                    K i11 = i(i10);
                    V k3 = k(i10);
                    Object orDefault = hVar.getOrDefault(i11, null);
                    if (k3 == null) {
                        if (orDefault != null || !hVar.containsKey(i11)) {
                            return false;
                        }
                    } else if (!k3.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f16580k != map.size()) {
                return false;
            }
            for (int i12 = 0; i12 < this.f16580k; i12++) {
                try {
                    K i13 = i(i12);
                    V k10 = k(i12);
                    Object obj2 = map.get(i13);
                    if (k10 == null) {
                        if (obj2 != null || !map.containsKey(i13)) {
                            return false;
                        }
                    } else if (!k10.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i10 = this.f16580k;
        if (i10 == 0) {
            return -1;
        }
        try {
            int p10 = ma.i.p(i10, 0, this.f16578i);
            if (p10 < 0) {
                return p10;
            }
            if (this.f16579j[p10 << 1] == null) {
                return p10;
            }
            int i11 = p10 + 1;
            while (i11 < i10 && this.f16578i[i11] == 0) {
                if (this.f16579j[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = p10 - 1; i12 >= 0 && this.f16578i[i12] == 0; i12--) {
                if (this.f16579j[i12 << 1] == null) {
                    return i12;
                }
            }
            return ~i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int g(Object obj) {
        int i10 = this.f16580k * 2;
        Object[] objArr = this.f16579j;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final V getOrDefault(Object obj, V v3) {
        int e10 = e(obj);
        return e10 >= 0 ? (V) this.f16579j[(e10 << 1) + 1] : v3;
    }

    public final int hashCode() {
        int[] iArr = this.f16578i;
        Object[] objArr = this.f16579j;
        int i10 = this.f16580k;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public final K i(int i10) {
        return (K) this.f16579j[i10 << 1];
    }

    public final boolean isEmpty() {
        return this.f16580k <= 0;
    }

    public final V j(int i10) {
        Object[] objArr = this.f16579j;
        int i11 = i10 << 1;
        V v3 = (V) objArr[i11 + 1];
        int i12 = this.f16580k;
        int i13 = 0;
        if (i12 <= 1) {
            c(this.f16578i, objArr, i12);
            this.f16578i = ma.i.f16038e;
            this.f16579j = ma.i.f16040g;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f16578i;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    int i16 = i14 - i10;
                    System.arraycopy(iArr, i15, iArr, i10, i16);
                    Object[] objArr2 = this.f16579j;
                    System.arraycopy(objArr2, i15 << 1, objArr2, i11, i16 << 1);
                }
                Object[] objArr3 = this.f16579j;
                int i17 = i14 << 1;
                objArr3[i17] = null;
                objArr3[i17 + 1] = null;
            } else {
                a(i12 > 8 ? i12 + (i12 >> 1) : 8);
                if (i12 != this.f16580k) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f16578i, 0, i10);
                    System.arraycopy(objArr, 0, this.f16579j, 0, i11);
                }
                if (i10 < i14) {
                    int i18 = i10 + 1;
                    int i19 = i14 - i10;
                    System.arraycopy(iArr, i18, this.f16578i, i10, i19);
                    System.arraycopy(objArr, i18 << 1, this.f16579j, i11, i19 << 1);
                }
            }
            i13 = i14;
        }
        if (i12 == this.f16580k) {
            this.f16580k = i13;
            return v3;
        }
        throw new ConcurrentModificationException();
    }

    public final V k(int i10) {
        return (V) this.f16579j[(i10 << 1) + 1];
    }

    public final V put(K k3, V v3) {
        int i10;
        int d5;
        int i11 = this.f16580k;
        if (k3 == null) {
            d5 = f();
            i10 = 0;
        } else {
            int hashCode = k3.hashCode();
            i10 = hashCode;
            d5 = d(hashCode, k3);
        }
        if (d5 >= 0) {
            int i12 = (d5 << 1) + 1;
            Object[] objArr = this.f16579j;
            V v10 = (V) objArr[i12];
            objArr[i12] = v3;
            return v10;
        }
        int i13 = ~d5;
        int[] iArr = this.f16578i;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            Object[] objArr2 = this.f16579j;
            a(i14);
            if (i11 != this.f16580k) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f16578i;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f16579j, 0, objArr2.length);
            }
            c(iArr, objArr2, i11);
        }
        if (i13 < i11) {
            int[] iArr3 = this.f16578i;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f16579j;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f16580k - i13) << 1);
        }
        int i16 = this.f16580k;
        if (i11 == i16) {
            int[] iArr4 = this.f16578i;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f16579j;
                int i17 = i13 << 1;
                objArr4[i17] = k3;
                objArr4[i17 + 1] = v3;
                this.f16580k = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k3, V v3) {
        V orDefault = getOrDefault(k3, null);
        if (orDefault == null) {
            return put(k3, v3);
        }
        return orDefault;
    }

    public final V remove(Object obj) {
        int e10 = e(obj);
        if (e10 >= 0) {
            return j(e10);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int e10 = e(obj);
        if (e10 >= 0) {
            V k3 = k(e10);
            if (obj2 == k3 || (obj2 != null && obj2.equals(k3))) {
                j(e10);
                return true;
            }
            return false;
        }
        return false;
    }

    public final V replace(K k3, V v3) {
        int e10 = e(k3);
        if (e10 >= 0) {
            int i10 = (e10 << 1) + 1;
            Object[] objArr = this.f16579j;
            V v10 = (V) objArr[i10];
            objArr[i10] = v3;
            return v10;
        }
        return null;
    }

    public final int size() {
        return this.f16580k;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16580k * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f16580k; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            K i11 = i(i10);
            if (i11 != this) {
                sb.append(i11);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V k3 = k(i10);
            if (k3 != this) {
                sb.append(k3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean replace(K k3, V v3, V v10) {
        int e10 = e(k3);
        if (e10 >= 0) {
            V k10 = k(e10);
            if (k10 == v3 || (v3 != null && v3.equals(k10))) {
                int i10 = (e10 << 1) + 1;
                Object[] objArr = this.f16579j;
                Object obj = objArr[i10];
                objArr[i10] = v10;
                return true;
            }
            return false;
        }
        return false;
    }
}
