package p;

/* loaded from: classes.dex */
public final class i<E> implements Cloneable {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f16581m = new Object();

    /* renamed from: i  reason: collision with root package name */
    public boolean f16582i = false;

    /* renamed from: j  reason: collision with root package name */
    public int[] f16583j;

    /* renamed from: k  reason: collision with root package name */
    public Object[] f16584k;

    /* renamed from: l  reason: collision with root package name */
    public int f16585l;

    public i() {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f16583j = new int[i13];
        this.f16584k = new Object[i13];
    }

    public final void a(int i10, E e10) {
        int i11 = this.f16585l;
        if (i11 != 0 && i10 <= this.f16583j[i11 - 1]) {
            f(i10, e10);
            return;
        }
        if (this.f16582i && i11 >= this.f16583j.length) {
            d();
        }
        int i12 = this.f16585l;
        if (i12 >= this.f16583j.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] iArr = new int[i16];
            Object[] objArr = new Object[i16];
            int[] iArr2 = this.f16583j;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f16584k;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f16583j = iArr;
            this.f16584k = objArr;
        }
        this.f16583j[i12] = i10;
        this.f16584k[i12] = e10;
        this.f16585l = i12 + 1;
    }

    /* renamed from: b */
    public final i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f16583j = (int[]) this.f16583j.clone();
            iVar.f16584k = (Object[]) this.f16584k.clone();
            return iVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean c(int i10) {
        if (this.f16582i) {
            d();
        }
        return ma.i.p(this.f16585l, i10, this.f16583j) >= 0;
    }

    public final void d() {
        int i10 = this.f16585l;
        int[] iArr = this.f16583j;
        Object[] objArr = this.f16584k;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f16581m) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f16582i = false;
        this.f16585l = i11;
    }

    public final Object e(int i10, Integer num) {
        Object obj;
        int p10 = ma.i.p(this.f16585l, i10, this.f16583j);
        return (p10 < 0 || (obj = this.f16584k[p10]) == f16581m) ? num : obj;
    }

    public final void f(int i10, E e10) {
        int p10 = ma.i.p(this.f16585l, i10, this.f16583j);
        if (p10 >= 0) {
            this.f16584k[p10] = e10;
            return;
        }
        int i11 = ~p10;
        int i12 = this.f16585l;
        if (i11 < i12) {
            Object[] objArr = this.f16584k;
            if (objArr[i11] == f16581m) {
                this.f16583j[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f16582i && i12 >= this.f16583j.length) {
            d();
            i11 = ~ma.i.p(this.f16585l, i10, this.f16583j);
        }
        int i13 = this.f16585l;
        if (i13 >= this.f16583j.length) {
            int i14 = (i13 + 1) * 4;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 4;
            int[] iArr = new int[i17];
            Object[] objArr2 = new Object[i17];
            int[] iArr2 = this.f16583j;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f16584k;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f16583j = iArr;
            this.f16584k = objArr2;
        }
        int i18 = this.f16585l - i11;
        if (i18 != 0) {
            int[] iArr3 = this.f16583j;
            int i19 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i19, i18);
            Object[] objArr4 = this.f16584k;
            System.arraycopy(objArr4, i11, objArr4, i19, this.f16585l - i11);
        }
        this.f16583j[i11] = i10;
        this.f16584k[i11] = e10;
        this.f16585l++;
    }

    public final int h() {
        if (this.f16582i) {
            d();
        }
        return this.f16585l;
    }

    public final E i(int i10) {
        if (this.f16582i) {
            d();
        }
        return (E) this.f16584k[i10];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16585l * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f16585l; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            if (this.f16582i) {
                d();
            }
            sb.append(this.f16583j[i10]);
            sb.append('=');
            E i11 = i(i10);
            if (i11 != this) {
                sb.append(i11);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
