package g0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11085a;

    /* renamed from: b  reason: collision with root package name */
    public Object f11086b;
    public int c;

    public v() {
        this.f11085a = 0;
        this.f11086b = new int[10];
    }

    public final int a() {
        switch (this.f11085a) {
            case 0:
                int i10 = this.c - 1;
                this.c = i10;
                return ((int[]) this.f11086b)[i10];
            default:
                int i11 = this.c - 1;
                this.c = i11;
                return ((int[]) this.f11086b)[i11];
        }
    }

    public final void b(int i10) {
        int i11 = this.c;
        Object obj = this.f11086b;
        if (i11 >= ((int[]) obj).length) {
            int[] copyOf = Arrays.copyOf((int[]) obj, ((int[]) obj).length * 2);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            this.f11086b = copyOf;
        }
        int i12 = this.c;
        this.c = i12 + 1;
        ((int[]) this.f11086b)[i12] = i10;
    }

    public final void c(int i10, int i11, int i12) {
        int i13 = this.c;
        int i14 = i13 + 3;
        Object obj = this.f11086b;
        if (i14 >= ((int[]) obj).length) {
            int[] copyOf = Arrays.copyOf((int[]) obj, ((int[]) obj).length * 2);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            this.f11086b = copyOf;
        }
        int[] iArr = (int[]) this.f11086b;
        iArr[i13 + 0] = i10 + i12;
        iArr[i13 + 1] = i11 + i12;
        iArr[i13 + 2] = i12;
        this.c = i14;
    }

    public final void d(int i10, int i11, int i12, int i13) {
        int i14 = this.c;
        int i15 = i14 + 4;
        Object obj = this.f11086b;
        if (i15 >= ((int[]) obj).length) {
            int[] copyOf = Arrays.copyOf((int[]) obj, ((int[]) obj).length * 2);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            this.f11086b = copyOf;
        }
        int[] iArr = (int[]) this.f11086b;
        iArr[i14 + 0] = i10;
        iArr[i14 + 1] = i11;
        iArr[i14 + 2] = i12;
        iArr[i14 + 3] = i13;
        this.c = i15;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0028 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(int i10, int i11) {
        boolean z10;
        if (i10 < i11) {
            int i12 = i10 - 3;
            for (int i13 = i10; i13 < i11; i13 += 3) {
                int[] iArr = (int[]) this.f11086b;
                int i14 = iArr[i13];
                int i15 = iArr[i11];
                if (i14 >= i15 && (i14 != i15 || iArr[i13 + 1] > iArr[i11 + 1])) {
                    z10 = false;
                    if (!z10) {
                        i12 += 3;
                        g(i12, i13);
                    }
                }
                z10 = true;
                if (!z10) {
                }
            }
            int i16 = i12 + 3;
            g(i16, i11);
            e(i10, i16 - 3);
            e(i16 + 3, i11);
        }
    }

    public final void f(Object obj) {
        int i10 = this.c;
        Object[] objArr = (Object[]) this.f11086b;
        if (i10 < objArr.length) {
            objArr[i10] = obj;
            this.c = i10 + 1;
        }
    }

    public final void g(int i10, int i11) {
        int[] iArr = (int[]) this.f11086b;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = i10 + 1;
        int i14 = i11 + 1;
        int i15 = iArr[i13];
        iArr[i13] = iArr[i14];
        iArr[i14] = i15;
        int i16 = i10 + 2;
        int i17 = i11 + 2;
        int i18 = iArr[i16];
        iArr[i16] = iArr[i17];
        iArr[i17] = i18;
    }

    public v(int i10, int i11) {
        this.f11085a = i11;
        if (i11 != 2) {
            this.f11086b = new int[i10];
        } else if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        } else {
            this.f11086b = new Object[i10];
        }
    }
}
