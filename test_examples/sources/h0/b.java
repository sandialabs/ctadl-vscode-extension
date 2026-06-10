package h0;

import n7.i;
import v7.g;

/* loaded from: classes.dex */
public final class b<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f11323a = new Object[16];

    /* renamed from: b  reason: collision with root package name */
    public Object[] f11324b = new Object[16];
    public int c;

    public final int a(Object obj) {
        int identityHashCode = System.identityHashCode(obj);
        int i10 = this.c - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj2 = this.f11323a[i12];
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i11 = i12 + 1;
            } else if (identityHashCode2 <= identityHashCode) {
                if (obj == obj2) {
                    return i12;
                } else {
                    for (int i13 = i12 - 1; -1 < i13; i13--) {
                        Object obj3 = this.f11323a[i13];
                        if (obj3 != obj) {
                            if (System.identityHashCode(obj3) != identityHashCode) {
                                break;
                            }
                        } else {
                            return i13;
                        }
                    }
                    int i14 = i12 + 1;
                    int i15 = this.c;
                    while (true) {
                        if (i14 < i15) {
                            Object obj4 = this.f11323a[i14];
                            if (obj4 == obj) {
                                return i14;
                            }
                            if (System.identityHashCode(obj4) != identityHashCode) {
                                break;
                            }
                            i14++;
                        } else {
                            i14 = this.c;
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

    public final Value b(Key key) {
        g.f(key, "key");
        int a10 = a(key);
        if (a10 >= 0) {
            return (Value) this.f11324b[a10];
        }
        return null;
    }

    public final void c(Key key, Value value) {
        g.f(key, "key");
        int a10 = a(key);
        if (a10 >= 0) {
            this.f11324b[a10] = value;
            return;
        }
        int i10 = -(a10 + 1);
        int i11 = this.c;
        Object[] objArr = this.f11323a;
        boolean z10 = i11 == objArr.length;
        Object[] objArr2 = z10 ? new Object[i11 * 2] : objArr;
        int i12 = i10 + 1;
        i.b2(objArr, objArr2, i12, i10, i11);
        if (z10) {
            i.d2(this.f11323a, objArr2, 0, 0, i10, 6);
        }
        objArr2[i10] = key;
        this.f11323a = objArr2;
        Object[] objArr3 = z10 ? new Object[this.c * 2] : this.f11324b;
        i.b2(this.f11324b, objArr3, i12, i10, this.c);
        if (z10) {
            i.d2(this.f11324b, objArr3, 0, 0, i10, 6);
        }
        objArr3[i10] = value;
        this.f11324b = objArr3;
        this.c++;
    }
}
