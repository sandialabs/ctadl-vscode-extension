package p0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public int f16606a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f16607b = new int[16];
    public int[] c = new int[16];

    /* renamed from: d  reason: collision with root package name */
    public int[] f16608d;

    /* renamed from: e  reason: collision with root package name */
    public int f16609e;

    public h() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.f16608d = iArr;
    }

    public final int a(int i10) {
        int i11 = this.f16606a + 1;
        int[] iArr = this.f16607b;
        int length = iArr.length;
        if (i11 > length) {
            int i12 = length * 2;
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            n7.i.c2(iArr, iArr2, 0, 14);
            n7.i.c2(this.c, iArr3, 0, 14);
            this.f16607b = iArr2;
            this.c = iArr3;
        }
        int i13 = this.f16606a;
        this.f16606a = i13 + 1;
        int length2 = this.f16608d.length;
        if (this.f16609e >= length2) {
            int i14 = length2 * 2;
            int[] iArr4 = new int[i14];
            int i15 = 0;
            while (i15 < i14) {
                int i16 = i15 + 1;
                iArr4[i15] = i16;
                i15 = i16;
            }
            n7.i.c2(this.f16608d, iArr4, 0, 14);
            this.f16608d = iArr4;
        }
        int i17 = this.f16609e;
        int[] iArr5 = this.f16608d;
        this.f16609e = iArr5[i17];
        int[] iArr6 = this.f16607b;
        iArr6[i13] = i10;
        this.c[i13] = i17;
        iArr5[i17] = i13;
        int i18 = iArr6[i13];
        while (i13 > 0) {
            int i19 = ((i13 + 1) >> 1) - 1;
            if (iArr6[i19] <= i18) {
                break;
            }
            b(i19, i13);
            i13 = i19;
        }
        return i17;
    }

    public final void b(int i10, int i11) {
        int[] iArr = this.f16607b;
        int[] iArr2 = this.c;
        int[] iArr3 = this.f16608d;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = iArr2[i10];
        iArr2[i10] = iArr2[i11];
        iArr2[i11] = i13;
        iArr3[iArr2[i10]] = i10;
        iArr3[iArr2[i11]] = i11;
    }
}
