package n0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f16061a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f16062b;
    public final Object[] c;

    public a(int i10, long[] jArr, Object[] objArr) {
        this.f16061a = i10;
        this.f16062b = jArr;
        this.c = objArr;
    }

    public final int a(long j2) {
        int i10 = this.f16061a - 1;
        if (i10 != -1) {
            long[] jArr = this.f16062b;
            int i11 = 0;
            if (i10 == 0) {
                long j10 = jArr[0];
                if (j10 == j2) {
                    return 0;
                }
                return j10 > j2 ? -2 : -1;
            }
            while (i11 <= i10) {
                int i12 = (i11 + i10) >>> 1;
                int i13 = ((jArr[i12] - j2) > 0L ? 1 : ((jArr[i12] - j2) == 0L ? 0 : -1));
                if (i13 < 0) {
                    i11 = i12 + 1;
                } else if (i13 <= 0) {
                    return i12;
                } else {
                    i10 = i12 - 1;
                }
            }
            return -(i11 + 1);
        }
        return -1;
    }

    public final a b(long j2, Object obj) {
        long[] jArr;
        int i10;
        Object[] objArr = this.c;
        int length = objArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            if (i12 >= length) {
                break;
            }
            if (objArr[i12] == null) {
                z10 = false;
            }
            if (z10) {
                i13++;
            }
            i12++;
        }
        int i14 = i13 + 1;
        long[] jArr2 = new long[i14];
        Object[] objArr2 = new Object[i14];
        if (i14 > 1) {
            int i15 = 0;
            while (true) {
                jArr = this.f16062b;
                i10 = this.f16061a;
                if (i11 >= i14 || i15 >= i10) {
                    break;
                }
                long j10 = jArr[i15];
                Object obj2 = objArr[i15];
                if (j10 > j2) {
                    jArr2[i11] = j2;
                    objArr2[i11] = obj;
                    i11++;
                    break;
                }
                if (obj2 != null) {
                    jArr2[i11] = j10;
                    objArr2[i11] = obj2;
                    i11++;
                }
                i15++;
            }
            if (i15 == i10) {
                int i16 = i14 - 1;
                jArr2[i16] = j2;
                objArr2[i16] = obj;
            } else {
                while (i11 < i14) {
                    long j11 = jArr[i15];
                    Object obj3 = objArr[i15];
                    if (obj3 != null) {
                        jArr2[i11] = j11;
                        objArr2[i11] = obj3;
                        i11++;
                    }
                    i15++;
                }
            }
        } else {
            jArr2[0] = j2;
            objArr2[0] = obj;
        }
        return new a(i14, jArr2, objArr2);
    }
}
