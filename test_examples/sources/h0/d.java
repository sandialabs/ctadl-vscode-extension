package h0;

import java.util.Arrays;
import n7.i;
import v7.g;

/* loaded from: classes.dex */
public final class d<T> {

    /* renamed from: a  reason: collision with root package name */
    public int[] f11329a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f11330b;
    public c<T>[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f11331d;

    public d() {
        int[] iArr = new int[50];
        for (int i10 = 0; i10 < 50; i10++) {
            iArr[i10] = i10;
        }
        this.f11329a = iArr;
        this.f11330b = new Object[50];
        this.c = new c[50];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Object obj, Object obj2) {
        int i10;
        c<T> cVar;
        g.f(obj, "value");
        g.f(obj2, "scope");
        if (this.f11331d > 0) {
            i10 = d(obj);
            if (i10 >= 0) {
                cVar = g(i10);
                cVar.add(obj2);
            }
        } else {
            i10 = -1;
        }
        int i11 = -(i10 + 1);
        int i12 = this.f11331d;
        int[] iArr = this.f11329a;
        if (i12 < iArr.length) {
            int i13 = iArr[i12];
            this.f11330b[i13] = obj;
            cVar = this.c[i13];
            if (cVar == null) {
                cVar = new c<>();
                this.c[i13] = cVar;
            }
            int i14 = this.f11331d;
            if (i11 < i14) {
                int[] iArr2 = this.f11329a;
                i.a2(i11 + 1, i11, i14, iArr2, iArr2);
            }
            this.f11329a[i11] = i13;
            this.f11331d++;
        } else {
            int length = iArr.length * 2;
            Object[] copyOf = Arrays.copyOf(this.c, length);
            g.e(copyOf, "copyOf(this, newSize)");
            this.c = (c[]) copyOf;
            c<T> cVar2 = new c<>();
            this.c[i12] = cVar2;
            Object[] copyOf2 = Arrays.copyOf(this.f11330b, length);
            g.e(copyOf2, "copyOf(this, newSize)");
            this.f11330b = copyOf2;
            copyOf2[i12] = obj;
            int[] iArr3 = new int[length];
            int i15 = this.f11331d;
            while (true) {
                i15++;
                if (i15 >= length) {
                    break;
                }
                iArr3[i15] = i15;
            }
            int i16 = this.f11331d;
            if (i11 < i16) {
                i.a2(i11 + 1, i11, i16, this.f11329a, iArr3);
            }
            iArr3[i11] = i12;
            if (i11 > 0) {
                i.c2(this.f11329a, iArr3, i11, 6);
            }
            this.f11329a = iArr3;
            this.f11331d++;
            cVar = cVar2;
        }
        cVar.add(obj2);
    }

    public final void b() {
        int length = this.c.length;
        for (int i10 = 0; i10 < length; i10++) {
            c<T> cVar = this.c[i10];
            if (cVar != null) {
                cVar.clear();
            }
            this.f11329a[i10] = i10;
            this.f11330b[i10] = null;
        }
        this.f11331d = 0;
    }

    public final boolean c(Object obj) {
        g.f(obj, "element");
        return d(obj) >= 0;
    }

    public final int d(Object obj) {
        int identityHashCode = System.identityHashCode(obj);
        int i10 = this.f11331d - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj2 = this.f11330b[this.f11329a[i12]];
            g.c(obj2);
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i11 = i12 + 1;
            } else if (identityHashCode2 <= identityHashCode) {
                if (obj == obj2) {
                    return i12;
                } else {
                    for (int i13 = i12 - 1; -1 < i13; i13--) {
                        Object obj3 = this.f11330b[this.f11329a[i13]];
                        g.c(obj3);
                        if (obj3 != obj) {
                            if (System.identityHashCode(obj3) != identityHashCode) {
                                break;
                            }
                        } else {
                            return i13;
                        }
                    }
                    int i14 = i12 + 1;
                    int i15 = this.f11331d;
                    while (true) {
                        if (i14 < i15) {
                            Object obj4 = this.f11330b[this.f11329a[i14]];
                            g.c(obj4);
                            if (obj4 == obj) {
                                return i14;
                            }
                            if (System.identityHashCode(obj4) != identityHashCode) {
                                break;
                            }
                            i14++;
                        } else {
                            i14 = this.f11331d;
                            break;
                        }
                    }
                    return -(i14 + 1);
                }
            } else {
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public final boolean e(Object obj, T t10) {
        int i10;
        c<T> cVar;
        g.f(obj, "value");
        int d5 = d(obj);
        if (d5 < 0 || (cVar = this.c[(i10 = this.f11329a[d5])]) == null) {
            return false;
        }
        boolean remove = cVar.remove(t10);
        if (cVar.f11325i == 0) {
            int i11 = d5 + 1;
            int i12 = this.f11331d;
            if (i11 < i12) {
                int[] iArr = this.f11329a;
                i.a2(d5, i11, i12, iArr, iArr);
            }
            int[] iArr2 = this.f11329a;
            int i13 = this.f11331d - 1;
            iArr2[i13] = i10;
            this.f11330b[i10] = null;
            this.f11331d = i13;
        }
        return remove;
    }

    public final void f(T t10) {
        g.f(t10, "scope");
        int i10 = this.f11331d;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = this.f11329a[i12];
            c<T> cVar = this.c[i13];
            g.c(cVar);
            cVar.remove(t10);
            if (cVar.f11325i > 0) {
                if (i11 != i12) {
                    int[] iArr = this.f11329a;
                    int i14 = iArr[i11];
                    iArr[i11] = i13;
                    iArr[i12] = i14;
                }
                i11++;
            }
        }
        int i15 = this.f11331d;
        for (int i16 = i11; i16 < i15; i16++) {
            this.f11330b[this.f11329a[i16]] = null;
        }
        this.f11331d = i11;
    }

    public final c<T> g(int i10) {
        c<T> cVar = this.c[this.f11329a[i10]];
        g.c(cVar);
        return cVar;
    }
}
