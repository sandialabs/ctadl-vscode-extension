package g0;

import androidx.compose.runtime.ComposerKt;
import g0.d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    public final x0 f11090a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f11091b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final Object[] f11092d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11093e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11094f;

    /* renamed from: g  reason: collision with root package name */
    public int f11095g;

    /* renamed from: h  reason: collision with root package name */
    public int f11096h;

    /* renamed from: i  reason: collision with root package name */
    public int f11097i;

    /* renamed from: j  reason: collision with root package name */
    public int f11098j;

    /* renamed from: k  reason: collision with root package name */
    public int f11099k;

    /* renamed from: l  reason: collision with root package name */
    public int f11100l;

    public w0(x0 x0Var) {
        v7.g.f(x0Var, "table");
        this.f11090a = x0Var;
        this.f11091b = x0Var.f11103i;
        int i10 = x0Var.f11104j;
        this.c = i10;
        this.f11092d = x0Var.f11105k;
        this.f11093e = x0Var.f11106l;
        this.f11096h = i10;
        this.f11097i = -1;
    }

    public final b a(int i10) {
        ArrayList<b> arrayList = this.f11090a.f11109p;
        int o12 = a1.c.o1(arrayList, i10, this.c);
        if (o12 < 0) {
            b bVar = new b(i10);
            arrayList.add(-(o12 + 1), bVar);
            return bVar;
        }
        b bVar2 = arrayList.get(o12);
        v7.g.e(bVar2, "get(location)");
        return bVar2;
    }

    public final Object b(int[] iArr, int i10) {
        int p02;
        if (a1.c.B(iArr, i10)) {
            int i11 = i10 * 5;
            if (i11 >= iArr.length) {
                p02 = iArr.length;
            } else {
                p02 = a1.c.p0(iArr[i11 + 1] >> 29) + iArr[i11 + 4];
            }
            return this.f11092d[p02];
        }
        return d.a.f11039a;
    }

    public final void c() {
        boolean z10 = true;
        this.f11094f = true;
        x0 x0Var = this.f11090a;
        x0Var.getClass();
        int i10 = x0Var.f11107m;
        if (i10 <= 0) {
            z10 = false;
        }
        if (z10) {
            x0Var.f11107m = i10 - 1;
        } else {
            ComposerKt.c("Unexpected reader close()".toString());
            throw null;
        }
    }

    public final void d() {
        boolean z10;
        int i10;
        if (this.f11098j == 0) {
            if (this.f11095g == this.f11096h) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int[] iArr = this.f11091b;
                int i11 = iArr[(this.f11097i * 5) + 2];
                this.f11097i = i11;
                if (i11 < 0) {
                    i10 = this.c;
                } else {
                    i10 = i11 + iArr[(i11 * 5) + 3];
                }
                this.f11096h = i10;
                return;
            }
            ComposerKt.c("endGroup() not called at the end of a group".toString());
            throw null;
        }
    }

    public final Object e() {
        int i10 = this.f11095g;
        if (i10 < this.f11096h) {
            return b(this.f11091b, i10);
        }
        return 0;
    }

    public final int f() {
        int i10 = this.f11095g;
        if (i10 < this.f11096h) {
            return this.f11091b[i10 * 5];
        }
        return 0;
    }

    public final Object g(int i10, int i11) {
        int i12;
        int[] iArr = this.f11091b;
        int H = a1.c.H(iArr, i10);
        int i13 = i10 + 1;
        if (i13 < this.c) {
            i12 = iArr[(i13 * 5) + 4];
        } else {
            i12 = this.f11093e;
        }
        int i14 = H + i11;
        if (i14 < i12) {
            return this.f11092d[i14];
        }
        return d.a.f11039a;
    }

    public final int h(int i10) {
        return a1.c.A(this.f11091b, i10);
    }

    public final boolean i(int i10) {
        return a1.c.D(this.f11091b, i10);
    }

    public final Object j(int i10) {
        int[] iArr = this.f11091b;
        if (a1.c.D(iArr, i10)) {
            if (a1.c.D(iArr, i10)) {
                return this.f11092d[iArr[(i10 * 5) + 4]];
            }
            return d.a.f11039a;
        }
        return null;
    }

    public final int k(int i10) {
        return a1.c.F(this.f11091b, i10);
    }

    public final Object l(int[] iArr, int i10) {
        boolean z10;
        int i11 = i10 * 5;
        int i12 = iArr[i11 + 1];
        if ((536870912 & i12) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return this.f11092d[a1.c.p0(i12 >> 30) + iArr[i11 + 4]];
        }
        return null;
    }

    public final int m(int i10) {
        return this.f11091b[(i10 * 5) + 2];
    }

    public final void n(int i10) {
        boolean z10;
        int i11;
        if (this.f11098j == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f11095g = i10;
            int[] iArr = this.f11091b;
            int i12 = this.c;
            if (i10 < i12) {
                i11 = iArr[(i10 * 5) + 2];
            } else {
                i11 = -1;
            }
            this.f11097i = i11;
            if (i11 < 0) {
                this.f11096h = i12;
            } else {
                this.f11096h = a1.c.A(iArr, i11) + i11;
            }
            this.f11099k = 0;
            this.f11100l = 0;
            return;
        }
        ComposerKt.c("Cannot reposition while in an empty region".toString());
        throw null;
    }

    public final int o() {
        boolean z10;
        int i10 = 1;
        if (this.f11098j == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i11 = this.f11095g;
            int[] iArr = this.f11091b;
            if (!a1.c.D(iArr, i11)) {
                i10 = a1.c.F(iArr, this.f11095g);
            }
            int i12 = this.f11095g;
            this.f11095g = iArr[(i12 * 5) + 3] + i12;
            return i10;
        }
        ComposerKt.c("Cannot skip while in an empty region".toString());
        throw null;
    }

    public final void p() {
        if (this.f11098j == 0) {
            this.f11095g = this.f11096h;
        } else {
            ComposerKt.c("Cannot skip the enclosing group while in an empty region".toString());
            throw null;
        }
    }

    public final void q() {
        boolean z10;
        int i10;
        if (this.f11098j <= 0) {
            int i11 = this.f11095g;
            int[] iArr = this.f11091b;
            if (iArr[(i11 * 5) + 2] == this.f11097i) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f11097i = i11;
                this.f11096h = iArr[(i11 * 5) + 3] + i11;
                int i12 = i11 + 1;
                this.f11095g = i12;
                this.f11099k = a1.c.H(iArr, i11);
                if (i11 >= this.c - 1) {
                    i10 = this.f11093e;
                } else {
                    i10 = iArr[(i12 * 5) + 4];
                }
                this.f11100l = i10;
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f11095g);
        sb.append(", key=");
        sb.append(f());
        sb.append(", parent=");
        sb.append(this.f11097i);
        sb.append(", end=");
        return androidx.activity.e.h(sb, this.f11096h, ')');
    }
}
