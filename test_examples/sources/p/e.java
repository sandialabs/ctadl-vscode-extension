package p;

/* loaded from: classes.dex */
public class e<E> implements Cloneable {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f16552m = new Object();

    /* renamed from: i  reason: collision with root package name */
    public boolean f16553i;

    /* renamed from: j  reason: collision with root package name */
    public long[] f16554j;

    /* renamed from: k  reason: collision with root package name */
    public Object[] f16555k;

    /* renamed from: l  reason: collision with root package name */
    public int f16556l;

    public e() {
        this(10);
    }

    public e(int i10) {
        this.f16553i = false;
        if (i10 == 0) {
            this.f16554j = ma.i.f16039f;
            this.f16555k = ma.i.f16040g;
            return;
        }
        int i11 = i10 * 8;
        int i12 = 4;
        while (true) {
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 8;
        this.f16554j = new long[i14];
        this.f16555k = new Object[i14];
    }

    public final void J(long j2, E e10) {
        int q10 = ma.i.q(this.f16554j, this.f16556l, j2);
        if (q10 >= 0) {
            this.f16555k[q10] = e10;
            return;
        }
        int i10 = ~q10;
        int i11 = this.f16556l;
        if (i10 < i11) {
            Object[] objArr = this.f16555k;
            if (objArr[i10] == f16552m) {
                this.f16554j[i10] = j2;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f16553i && i11 >= this.f16554j.length) {
            f();
            i10 = ~ma.i.q(this.f16554j, this.f16556l, j2);
        }
        int i12 = this.f16556l;
        if (i12 >= this.f16554j.length) {
            int i13 = (i12 + 1) * 8;
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
            int i16 = i13 / 8;
            long[] jArr = new long[i16];
            Object[] objArr2 = new Object[i16];
            long[] jArr2 = this.f16554j;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f16555k;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f16554j = jArr;
            this.f16555k = objArr2;
        }
        int i17 = this.f16556l - i10;
        if (i17 != 0) {
            long[] jArr3 = this.f16554j;
            int i18 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i18, i17);
            Object[] objArr4 = this.f16555k;
            System.arraycopy(objArr4, i10, objArr4, i18, this.f16556l - i10);
        }
        this.f16554j[i10] = j2;
        this.f16555k[i10] = e10;
        this.f16556l++;
    }

    public final void K(long j2) {
        int q10 = ma.i.q(this.f16554j, this.f16556l, j2);
        if (q10 >= 0) {
            Object[] objArr = this.f16555k;
            Object obj = objArr[q10];
            Object obj2 = f16552m;
            if (obj != obj2) {
                objArr[q10] = obj2;
                this.f16553i = true;
            }
        }
    }

    public final int L() {
        if (this.f16553i) {
            f();
        }
        return this.f16556l;
    }

    public final E M(int i10) {
        if (this.f16553i) {
            f();
        }
        return (E) this.f16555k[i10];
    }

    public final void c(long j2, Long l2) {
        int i10 = this.f16556l;
        if (i10 != 0 && j2 <= this.f16554j[i10 - 1]) {
            J(j2, l2);
            return;
        }
        if (this.f16553i && i10 >= this.f16554j.length) {
            f();
        }
        int i11 = this.f16556l;
        if (i11 >= this.f16554j.length) {
            int i12 = (i11 + 1) * 8;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 8;
            long[] jArr = new long[i15];
            Object[] objArr = new Object[i15];
            long[] jArr2 = this.f16554j;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f16555k;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f16554j = jArr;
            this.f16555k = objArr;
        }
        this.f16554j[i11] = j2;
        this.f16555k[i11] = l2;
        this.f16556l = i11 + 1;
    }

    public final void d() {
        int i10 = this.f16556l;
        Object[] objArr = this.f16555k;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f16556l = 0;
        this.f16553i = false;
    }

    /* renamed from: e */
    public final e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f16554j = (long[]) this.f16554j.clone();
            eVar.f16555k = (Object[]) this.f16555k.clone();
            return eVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void f() {
        int i10 = this.f16556l;
        long[] jArr = this.f16554j;
        Object[] objArr = this.f16555k;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f16552m) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f16553i = false;
        this.f16556l = i11;
    }

    public final Object h(long j2, Long l2) {
        Object obj;
        int q10 = ma.i.q(this.f16554j, this.f16556l, j2);
        return (q10 < 0 || (obj = this.f16555k[q10]) == f16552m) ? l2 : obj;
    }

    public final long t(int i10) {
        if (this.f16553i) {
            f();
        }
        return this.f16554j[i10];
    }

    public final String toString() {
        if (L() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16556l * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f16556l; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(t(i10));
            sb.append('=');
            E M = M(i10);
            if (M != this) {
                sb.append(M);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
