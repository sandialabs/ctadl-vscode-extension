package h0;

import n7.i;
import v7.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f11321a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f11322b = new Object[4];
    public int[] c = new int[4];

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
        r0 = -(r4 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(int i10, Object obj) {
        int i11;
        g.f(obj, "key");
        int i12 = this.f11321a;
        if (i12 > 0) {
            int i13 = i12 - 1;
            int identityHashCode = System.identityHashCode(obj);
            int i14 = 0;
            while (true) {
                if (i14 <= i13) {
                    i11 = (i14 + i13) >>> 1;
                    Object obj2 = this.f11322b[i11];
                    int identityHashCode2 = System.identityHashCode(obj2);
                    if (identityHashCode2 < identityHashCode) {
                        i14 = i11 + 1;
                    } else if (identityHashCode2 > identityHashCode) {
                        i13 = i11 - 1;
                    } else if (obj2 != obj) {
                        int i15 = i11 - 1;
                        while (-1 < i15) {
                            Object obj3 = this.f11322b[i15];
                            if (obj3 == obj) {
                                break;
                            } else if (System.identityHashCode(obj3) != identityHashCode) {
                                break;
                            } else {
                                i15--;
                            }
                        }
                        i11++;
                        int i16 = this.f11321a;
                        while (true) {
                            if (i11 < i16) {
                                Object obj4 = this.f11322b[i11];
                                if (obj4 == obj) {
                                    break;
                                } else if (System.identityHashCode(obj4) != identityHashCode) {
                                    break;
                                } else {
                                    i11++;
                                }
                            } else {
                                i11 = this.f11321a;
                                break;
                            }
                        }
                    }
                } else {
                    i11 = -(i14 + 1);
                    break;
                }
            }
            if (i11 >= 0) {
                int[] iArr = this.c;
                int i17 = iArr[i11];
                iArr[i11] = i10;
                return i17;
            }
        } else {
            i11 = -1;
        }
        int i18 = -(i11 + 1);
        int i19 = this.f11321a;
        Object[] objArr = this.f11322b;
        if (i19 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr2 = new int[objArr.length * 2];
            int i20 = i18 + 1;
            i.b2(objArr, objArr2, i20, i18, i19);
            i.a2(i20, i18, this.f11321a, this.c, iArr2);
            i.d2(this.f11322b, objArr2, 0, 0, i18, 6);
            i.c2(this.c, iArr2, i18, 6);
            this.f11322b = objArr2;
            this.c = iArr2;
        } else {
            int i21 = i18 + 1;
            i.b2(objArr, objArr, i21, i18, i19);
            int[] iArr3 = this.c;
            i.a2(i21, i18, this.f11321a, iArr3, iArr3);
        }
        this.f11322b[i18] = obj;
        this.c[i18] = i10;
        this.f11321a++;
        return -1;
    }
}
