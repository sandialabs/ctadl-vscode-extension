package g0;

import androidx.compose.runtime.ComposerKt;
import g0.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a  reason: collision with root package name */
    public final x0 f11119a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f11120b;
    public Object[] c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<b> f11121d;

    /* renamed from: e  reason: collision with root package name */
    public int f11122e;

    /* renamed from: f  reason: collision with root package name */
    public int f11123f;

    /* renamed from: g  reason: collision with root package name */
    public int f11124g;

    /* renamed from: h  reason: collision with root package name */
    public int f11125h;

    /* renamed from: i  reason: collision with root package name */
    public int f11126i;

    /* renamed from: j  reason: collision with root package name */
    public int f11127j;

    /* renamed from: k  reason: collision with root package name */
    public int f11128k;

    /* renamed from: l  reason: collision with root package name */
    public int f11129l;

    /* renamed from: m  reason: collision with root package name */
    public int f11130m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public final v f11131o;

    /* renamed from: p  reason: collision with root package name */
    public final v f11132p;

    /* renamed from: q  reason: collision with root package name */
    public final v f11133q;

    /* renamed from: r  reason: collision with root package name */
    public int f11134r;

    /* renamed from: s  reason: collision with root package name */
    public int f11135s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f11136t;

    /* renamed from: u  reason: collision with root package name */
    public l0 f11137u;

    /* loaded from: classes.dex */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x017f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final List a(z0 z0Var, int i10, z0 z0Var2, boolean z10, boolean z11) {
            boolean z12;
            int i11;
            int i12;
            int E;
            int E2;
            EmptyList emptyList;
            boolean z13;
            int F;
            boolean z14;
            int i13;
            int i14;
            boolean z15;
            int o10 = z0Var.o(i10);
            int i15 = i10 + o10;
            int g10 = z0Var.g(z0Var.f11120b, z0Var.n(i10));
            int g11 = z0Var.g(z0Var.f11120b, z0Var.n(i15));
            int i16 = g11 - g10;
            if (i10 >= 0) {
                if ((z0Var.f11120b[(z0Var.n(i10) * 5) + 1] & 201326592) != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    z12 = true;
                    z0Var2.q(o10);
                    z0Var2.r(i16, z0Var2.f11134r);
                    if (z0Var.f11122e < i15) {
                        z0Var.v(i15);
                    }
                    if (z0Var.f11127j < g11) {
                        z0Var.w(g11, i15);
                    }
                    int[] iArr = z0Var2.f11120b;
                    int i17 = z0Var2.f11134r;
                    int i18 = i17 * 5;
                    n7.i.a2(i18, i10 * 5, i15 * 5, z0Var.f11120b, iArr);
                    Object[] objArr = z0Var2.c;
                    int i19 = z0Var2.f11125h;
                    n7.i.b2(z0Var.c, objArr, i19, g10, g11);
                    int i20 = z0Var2.f11135s;
                    iArr[i18 + 2] = i20;
                    int i21 = i17 - i10;
                    i11 = i17 + o10;
                    int g12 = i19 - z0Var2.g(iArr, i17);
                    int i22 = z0Var2.f11129l;
                    int i23 = z0Var2.f11128k;
                    int length = objArr.length;
                    int i24 = i22;
                    boolean z16 = z12;
                    i12 = i17;
                    while (i12 < i11) {
                        if (i12 != i17) {
                            int i25 = (i12 * 5) + 2;
                            iArr[i25] = iArr[i25] + i21;
                        }
                        int i26 = i19;
                        int g13 = z0Var2.g(iArr, i12) + g12;
                        if (i24 < i12) {
                            i13 = i11;
                            i14 = 0;
                        } else {
                            i13 = i11;
                            i14 = z0Var2.f11127j;
                        }
                        if (g13 > i14) {
                            g13 = -(((length - i23) - g13) + 1);
                        }
                        iArr[(i12 * 5) + 4] = g13;
                        if (i12 == i24) {
                            i24++;
                        }
                        i12++;
                        i11 = i13;
                        i19 = i26;
                    }
                    int i27 = i19;
                    int i28 = i11;
                    z0Var2.f11129l = i24;
                    E = a1.c.E(z0Var.f11121d, i10, z0Var.m());
                    E2 = a1.c.E(z0Var.f11121d, i15, z0Var.m());
                    if (E >= E2) {
                        ArrayList<b> arrayList = z0Var.f11121d;
                        ArrayList arrayList2 = new ArrayList(E2 - E);
                        for (int i29 = E; i29 < E2; i29++) {
                            b bVar = arrayList.get(i29);
                            v7.g.e(bVar, "sourceAnchors[anchorIndex]");
                            b bVar2 = bVar;
                            bVar2.f11033a += i21;
                            arrayList2.add(bVar2);
                        }
                        z0Var2.f11121d.addAll(a1.c.E(z0Var2.f11121d, z0Var2.f11134r, z0Var2.m()), arrayList2);
                        arrayList.subList(E, E2).clear();
                        emptyList = arrayList2;
                    } else {
                        emptyList = EmptyList.f12981i;
                    }
                    int z17 = z0Var.z(i10);
                    if (!z10) {
                        if (z17 >= 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            z0Var.K();
                            z0Var.a(z17 - z0Var.f11134r);
                            z0Var.K();
                        }
                        z0Var.a(i10 - z0Var.f11134r);
                        z13 = z0Var.C();
                        if (z14) {
                            z0Var.H();
                            z0Var.i();
                            z0Var.H();
                            z0Var.i();
                        }
                    } else {
                        boolean D = z0Var.D(i10, o10);
                        z0Var.E(g10, i16, i10 - 1);
                        z13 = D;
                    }
                    if (!(!z13)) {
                        int i30 = z0Var2.n;
                        if (a1.c.D(iArr, i17)) {
                            F = 1;
                        } else {
                            F = a1.c.F(iArr, i17);
                        }
                        z0Var2.n = i30 + F;
                        if (z11) {
                            z0Var2.f11134r = i28;
                            z0Var2.f11125h = i27 + i16;
                        }
                        if (z16) {
                            z0Var2.O(i20);
                        }
                        return emptyList;
                    }
                    ComposerKt.c("Unexpectedly removed anchors".toString());
                    throw null;
                }
            }
            z12 = false;
            z0Var2.q(o10);
            z0Var2.r(i16, z0Var2.f11134r);
            if (z0Var.f11122e < i15) {
            }
            if (z0Var.f11127j < g11) {
            }
            int[] iArr2 = z0Var2.f11120b;
            int i172 = z0Var2.f11134r;
            int i182 = i172 * 5;
            n7.i.a2(i182, i10 * 5, i15 * 5, z0Var.f11120b, iArr2);
            Object[] objArr2 = z0Var2.c;
            int i192 = z0Var2.f11125h;
            n7.i.b2(z0Var.c, objArr2, i192, g10, g11);
            int i202 = z0Var2.f11135s;
            iArr2[i182 + 2] = i202;
            int i212 = i172 - i10;
            i11 = i172 + o10;
            int g122 = i192 - z0Var2.g(iArr2, i172);
            int i222 = z0Var2.f11129l;
            int i232 = z0Var2.f11128k;
            int length2 = objArr2.length;
            int i242 = i222;
            boolean z162 = z12;
            i12 = i172;
            while (i12 < i11) {
            }
            int i272 = i192;
            int i282 = i11;
            z0Var2.f11129l = i242;
            E = a1.c.E(z0Var.f11121d, i10, z0Var.m());
            E2 = a1.c.E(z0Var.f11121d, i15, z0Var.m());
            if (E >= E2) {
            }
            int z172 = z0Var.z(i10);
            if (!z10) {
            }
            if (!(!z13)) {
            }
        }
    }

    static {
        new a();
    }

    public z0(x0 x0Var) {
        v7.g.f(x0Var, "table");
        this.f11119a = x0Var;
        int[] iArr = x0Var.f11103i;
        this.f11120b = iArr;
        Object[] objArr = x0Var.f11105k;
        this.c = objArr;
        this.f11121d = x0Var.f11109p;
        int i10 = x0Var.f11104j;
        this.f11122e = i10;
        this.f11123f = (iArr.length / 5) - i10;
        this.f11124g = i10;
        int i11 = x0Var.f11106l;
        this.f11127j = i11;
        this.f11128k = objArr.length - i11;
        this.f11129l = i10;
        this.f11131o = new v();
        this.f11132p = new v();
        this.f11133q = new v();
        this.f11135s = -1;
    }

    public static void t(z0 z0Var) {
        int i10 = z0Var.f11135s;
        int n = z0Var.n(i10);
        int[] iArr = z0Var.f11120b;
        boolean z10 = true;
        int i11 = (n * 5) + 1;
        int i12 = iArr[i11];
        if ((i12 & 134217728) == 0) {
            z10 = false;
        }
        if (!z10) {
            iArr[i11] = i12 | 134217728;
            if (!a1.c.z(iArr, n)) {
                z0Var.O(z0Var.z(i10));
            }
        }
    }

    public final int A(int[] iArr, int i10) {
        int i11 = iArr[(n(i10) * 5) + 2];
        if (i11 <= -2) {
            return m() + i11 + 2;
        }
        return i11;
    }

    public final void B() {
        boolean z10;
        boolean z11;
        boolean z12;
        l0 l0Var = this.f11137u;
        if (l0Var != null) {
            while (!((List) l0Var.f11061b).isEmpty()) {
                int f10 = l0Var.f();
                int n = n(f10);
                int i10 = f10 + 1;
                int o10 = o(f10) + f10;
                while (true) {
                    z10 = false;
                    if (i10 < o10) {
                        if ((this.f11120b[(n(i10) * 5) + 1] & 201326592) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            z11 = true;
                            break;
                        }
                        i10 += o(i10);
                    } else {
                        z11 = false;
                        break;
                    }
                }
                if (a1.c.z(this.f11120b, n) != z11) {
                    z10 = true;
                }
                if (z10) {
                    int[] iArr = this.f11120b;
                    int i11 = (n * 5) + 1;
                    if (z11) {
                        iArr[i11] = iArr[i11] | 67108864;
                    } else {
                        iArr[i11] = iArr[i11] & (-67108865);
                    }
                    int z13 = z(f10);
                    if (z13 >= 0) {
                        l0Var.a(z13);
                    }
                }
            }
        }
    }

    public final boolean C() {
        boolean z10;
        if (this.f11130m == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i10 = this.f11134r;
            int i11 = this.f11125h;
            int G = G();
            l0 l0Var = this.f11137u;
            if (l0Var != null) {
                while (true) {
                    Object obj = l0Var.f11061b;
                    if (!(!((List) obj).isEmpty()) || ((Number) kotlin.collections.c.n2((List) obj)).intValue() < i10) {
                        break;
                    }
                    l0Var.f();
                }
            }
            boolean D = D(i10, this.f11134r - i10);
            E(i11, this.f11125h - i11, i10 - 1);
            this.f11134r = i10;
            this.f11125h = i11;
            this.n -= G;
            return D;
        }
        ComposerKt.c("Cannot remove group while inserting".toString());
        throw null;
    }

    public final boolean D(int i10, int i11) {
        boolean z10;
        boolean z11 = false;
        if (i11 <= 0) {
            return false;
        }
        ArrayList<b> arrayList = this.f11121d;
        v(i10);
        if (!arrayList.isEmpty()) {
            int i12 = i11 + i10;
            int E = a1.c.E(this.f11121d, i12, (this.f11120b.length / 5) - this.f11123f);
            if (E >= this.f11121d.size()) {
                E--;
            }
            int i13 = E + 1;
            int i14 = 0;
            while (E >= 0) {
                b bVar = this.f11121d.get(E);
                v7.g.e(bVar, "anchors[index]");
                b bVar2 = bVar;
                int c = c(bVar2);
                if (c < i10) {
                    break;
                }
                if (c < i12) {
                    bVar2.f11033a = Integer.MIN_VALUE;
                    if (i14 == 0) {
                        i14 = E + 1;
                    }
                    i13 = E;
                }
                E--;
            }
            if (i13 < i14) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f11121d.subList(i13, i14).clear();
            }
        } else {
            z10 = false;
        }
        this.f11122e = i10;
        this.f11123f += i11;
        int i15 = this.f11129l;
        if (i15 > i10) {
            this.f11129l = Math.max(i10, i15 - i11);
        }
        int i16 = this.f11124g;
        if (i16 >= this.f11122e) {
            this.f11124g = i16 - i11;
        }
        int i17 = this.f11135s;
        if (i17 >= 0 && a1.c.z(this.f11120b, n(i17))) {
            z11 = true;
        }
        if (z11) {
            O(this.f11135s);
        }
        return z10;
    }

    public final void E(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f11128k;
            int i14 = i10 + i11;
            w(i14, i12);
            this.f11127j = i10;
            this.f11128k = i13 + i11;
            n7.i.g2(i10, i14, this.c);
            int i15 = this.f11126i;
            if (i15 >= i10) {
                this.f11126i = i15 - i11;
            }
        }
    }

    public final Object F(int i10, Object obj) {
        int J = J(this.f11120b, n(this.f11134r));
        boolean z10 = true;
        int g10 = g(this.f11120b, n(this.f11134r + 1));
        int i11 = J + i10;
        if (i11 < J || i11 >= g10) {
            z10 = false;
        }
        if (z10) {
            int h10 = h(i11);
            Object[] objArr = this.c;
            Object obj2 = objArr[h10];
            objArr[h10] = obj;
            return obj2;
        }
        StringBuilder o10 = a4.b.o("Write to an invalid slot index ", i10, " for group ");
        o10.append(this.f11134r);
        ComposerKt.c(o10.toString().toString());
        throw null;
    }

    public final int G() {
        int n = n(this.f11134r);
        int A = a1.c.A(this.f11120b, n) + this.f11134r;
        this.f11134r = A;
        this.f11125h = g(this.f11120b, n(A));
        if (a1.c.D(this.f11120b, n)) {
            return 1;
        }
        return a1.c.F(this.f11120b, n);
    }

    public final void H() {
        int i10 = this.f11124g;
        this.f11134r = i10;
        this.f11125h = g(this.f11120b, n(i10));
    }

    public final Object I(int i10, int i11) {
        int J = J(this.f11120b, n(i10));
        boolean z10 = true;
        int g10 = g(this.f11120b, n(i10 + 1));
        int i12 = i11 + J;
        if (J > i12 || i12 >= g10) {
            z10 = false;
        }
        if (z10) {
            return this.c[h(i12)];
        }
        return d.a.f11039a;
    }

    public final int J(int[] iArr, int i10) {
        if (i10 >= this.f11120b.length / 5) {
            return this.c.length - this.f11128k;
        }
        int H = a1.c.H(iArr, i10);
        int i11 = this.f11128k;
        int length = this.c.length;
        if (H < 0) {
            return (length - i11) + H + 1;
        }
        return H;
    }

    public final void K() {
        if (!(this.f11130m == 0)) {
            ComposerKt.c("Key must be supplied when inserting".toString());
            throw null;
        }
        d.a.C0120a c0120a = d.a.f11039a;
        L(0, c0120a, false, c0120a);
    }

    public final void L(int i10, Object obj, boolean z10, Object obj2) {
        boolean z11;
        int A;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 1;
        if (this.f11130m > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f11133q.b(this.n);
        d.a.C0120a c0120a = d.a.f11039a;
        if (z11) {
            q(1);
            int i16 = this.f11134r;
            int n = n(i16);
            if (obj != c0120a) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (z10 || obj2 == c0120a) {
                i15 = 0;
            }
            int[] iArr = this.f11120b;
            int i17 = this.f11135s;
            int i18 = this.f11125h;
            if (z10) {
                i12 = 1073741824;
            } else {
                i12 = 0;
            }
            if (i11 != 0) {
                i13 = 536870912;
            } else {
                i13 = 0;
            }
            if (i15 != 0) {
                i14 = 268435456;
            } else {
                i14 = 0;
            }
            int i19 = n * 5;
            iArr[i19 + 0] = i10;
            iArr[i19 + 1] = i12 | i13 | i14;
            iArr[i19 + 2] = i17;
            iArr[i19 + 3] = 0;
            iArr[i19 + 4] = i18;
            this.f11126i = i18;
            int i20 = (z10 ? 1 : 0) + i11 + i15;
            if (i20 > 0) {
                r(i20, i16);
                Object[] objArr = this.c;
                int i21 = this.f11125h;
                if (z10) {
                    objArr[i21] = obj2;
                    i21++;
                }
                if (i11 != 0) {
                    objArr[i21] = obj;
                    i21++;
                }
                if (i15 != 0) {
                    objArr[i21] = obj2;
                    i21++;
                }
                this.f11125h = i21;
            }
            this.n = 0;
            A = i16 + 1;
            this.f11135s = i16;
            this.f11134r = A;
        } else {
            this.f11131o.b(this.f11135s);
            this.f11132p.b(((this.f11120b.length / 5) - this.f11123f) - this.f11124g);
            int i22 = this.f11134r;
            int n10 = n(i22);
            if (!v7.g.a(obj2, c0120a)) {
                if (z10) {
                    P(this.f11134r, obj2);
                } else {
                    N(obj2);
                }
            }
            this.f11125h = J(this.f11120b, n10);
            this.f11126i = g(this.f11120b, n(this.f11134r + 1));
            this.n = a1.c.F(this.f11120b, n10);
            this.f11135s = i22;
            this.f11134r = i22 + 1;
            A = i22 + a1.c.A(this.f11120b, n10);
        }
        this.f11124g = A;
    }

    public final void M(Object obj) {
        boolean z10;
        if (this.f11130m > 0) {
            r(1, this.f11135s);
        }
        Object[] objArr = this.c;
        int i10 = this.f11125h;
        this.f11125h = i10 + 1;
        Object obj2 = objArr[h(i10)];
        int i11 = this.f11125h;
        if (i11 <= this.f11126i) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.c[h(i11 - 1)] = obj;
        } else {
            ComposerKt.c("Writing to an invalid slot".toString());
            throw null;
        }
    }

    public final void N(Object obj) {
        int n = n(this.f11134r);
        if (a1.c.B(this.f11120b, n)) {
            this.c[h(d(this.f11120b, n))] = obj;
        } else {
            ComposerKt.c("Updating the data of a group that was not created with a data slot".toString());
            throw null;
        }
    }

    public final void O(int i10) {
        if (i10 >= 0) {
            l0 l0Var = this.f11137u;
            if (l0Var == null) {
                l0Var = new l0();
                this.f11137u = l0Var;
            }
            l0Var.a(i10);
        }
    }

    public final void P(int i10, Object obj) {
        boolean z10;
        int n = n(i10);
        int[] iArr = this.f11120b;
        if (n < iArr.length && a1.c.D(iArr, n)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.c[h(g(this.f11120b, n))] = obj;
            return;
        }
        ComposerKt.c(("Updating the node of a group at " + i10 + " that was not created with as a node group").toString());
        throw null;
    }

    public final void a(int i10) {
        boolean z10 = false;
        if (!(i10 >= 0)) {
            ComposerKt.c("Cannot seek backwards".toString());
            throw null;
        }
        if (!(this.f11130m <= 0)) {
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f11134r + i10;
        if (i11 >= this.f11135s && i11 <= this.f11124g) {
            z10 = true;
        }
        if (z10) {
            this.f11134r = i11;
            int g10 = g(this.f11120b, n(i11));
            this.f11125h = g10;
            this.f11126i = g10;
            return;
        }
        ComposerKt.c(("Cannot seek outside the current group (" + this.f11135s + '-' + this.f11124g + ')').toString());
        throw null;
    }

    public final b b(int i10) {
        ArrayList<b> arrayList = this.f11121d;
        int o12 = a1.c.o1(arrayList, i10, m());
        if (o12 < 0) {
            if (i10 > this.f11122e) {
                i10 = -(m() - i10);
            }
            b bVar = new b(i10);
            arrayList.add(-(o12 + 1), bVar);
            return bVar;
        }
        b bVar2 = arrayList.get(o12);
        v7.g.e(bVar2, "get(location)");
        return bVar2;
    }

    public final int c(b bVar) {
        v7.g.f(bVar, "anchor");
        int i10 = bVar.f11033a;
        if (i10 < 0) {
            return i10 + m();
        }
        return i10;
    }

    public final int d(int[] iArr, int i10) {
        return a1.c.p0(iArr[(i10 * 5) + 1] >> 29) + g(iArr, i10);
    }

    public final void e() {
        int i10 = this.f11130m;
        this.f11130m = i10 + 1;
        if (i10 == 0) {
            this.f11132p.b(((this.f11120b.length / 5) - this.f11123f) - this.f11124g);
        }
    }

    public final void f() {
        boolean z10 = true;
        this.f11136t = true;
        if (this.f11131o.c != 0) {
            z10 = false;
        }
        if (z10) {
            v(m());
            w(this.c.length - this.f11128k, this.f11122e);
            B();
        }
        int[] iArr = this.f11120b;
        int i10 = this.f11122e;
        Object[] objArr = this.c;
        int i11 = this.f11127j;
        ArrayList<b> arrayList = this.f11121d;
        x0 x0Var = this.f11119a;
        x0Var.getClass();
        v7.g.f(iArr, "groups");
        v7.g.f(objArr, "slots");
        v7.g.f(arrayList, "anchors");
        if (x0Var.n) {
            x0Var.n = false;
            x0Var.f11103i = iArr;
            x0Var.f11104j = i10;
            x0Var.f11105k = objArr;
            x0Var.f11106l = i11;
            x0Var.f11109p = arrayList;
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }

    public final int g(int[] iArr, int i10) {
        if (i10 >= this.f11120b.length / 5) {
            return this.c.length - this.f11128k;
        }
        int i11 = iArr[(i10 * 5) + 4];
        int i12 = this.f11128k;
        int length = this.c.length;
        if (i11 < 0) {
            return (length - i12) + i11 + 1;
        }
        return i11;
    }

    public final int h(int i10) {
        return i10 < this.f11127j ? i10 : i10 + this.f11128k;
    }

    public final void i() {
        boolean z10;
        int i10;
        int i11 = 1;
        int i12 = 0;
        if (this.f11130m > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i13 = this.f11134r;
        int i14 = this.f11124g;
        int i15 = this.f11135s;
        int n = n(i15);
        int i16 = this.n;
        int i17 = i13 - i15;
        boolean D = a1.c.D(this.f11120b, n);
        v vVar = this.f11133q;
        if (z10) {
            a1.c.I(n, i17, this.f11120b);
            a1.c.J(n, i16, this.f11120b);
            int a10 = vVar.a();
            if (!D) {
                i11 = i16;
            }
            this.n = a10 + i11;
            this.f11135s = A(this.f11120b, i15);
            return;
        }
        if (i13 != i14) {
            i11 = 0;
        }
        if (i11 != 0) {
            int A = a1.c.A(this.f11120b, n);
            int F = a1.c.F(this.f11120b, n);
            a1.c.I(n, i17, this.f11120b);
            a1.c.J(n, i16, this.f11120b);
            int a11 = this.f11131o.a();
            this.f11124g = ((this.f11120b.length / 5) - this.f11123f) - this.f11132p.a();
            this.f11135s = a11;
            int A2 = A(this.f11120b, i15);
            int a12 = vVar.a();
            this.n = a12;
            if (A2 == a11) {
                if (!D) {
                    i12 = i16 - F;
                }
                this.n = a12 + i12;
                return;
            }
            int i18 = i17 - A;
            if (D) {
                i10 = 0;
            } else {
                i10 = i16 - F;
            }
            if (i18 != 0 || i10 != 0) {
                while (A2 != 0 && A2 != a11 && (i10 != 0 || i18 != 0)) {
                    int n10 = n(A2);
                    if (i18 != 0) {
                        a1.c.I(n10, a1.c.A(this.f11120b, n10) + i18, this.f11120b);
                    }
                    if (i10 != 0) {
                        int[] iArr = this.f11120b;
                        a1.c.J(n10, a1.c.F(iArr, n10) + i10, iArr);
                    }
                    if (a1.c.D(this.f11120b, n10)) {
                        i10 = 0;
                    }
                    A2 = A(this.f11120b, A2);
                }
            }
            this.n += i10;
            return;
        }
        ComposerKt.c("Expected to be at the end of a group".toString());
        throw null;
    }

    public final void j() {
        boolean z10;
        int i10 = this.f11130m;
        boolean z11 = false;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i11 = i10 - 1;
            this.f11130m = i11;
            if (i11 == 0) {
                if (this.f11133q.c == this.f11131o.c) {
                    z11 = true;
                }
                if (z11) {
                    this.f11124g = ((this.f11120b.length / 5) - this.f11123f) - this.f11132p.a();
                    return;
                } else {
                    ComposerKt.c("startGroup/endGroup mismatch while inserting".toString());
                    throw null;
                }
            }
            return;
        }
        throw new IllegalStateException("Unbalanced begin/end insert".toString());
    }

    public final void k(int i10) {
        boolean z10 = false;
        if (!(this.f11130m <= 0)) {
            ComposerKt.c("Cannot call ensureStarted() while inserting".toString());
            throw null;
        }
        int i11 = this.f11135s;
        if (i11 != i10) {
            if (i10 >= i11 && i10 < this.f11124g) {
                z10 = true;
            }
            if (!z10) {
                ComposerKt.c(("Started group at " + i10 + " must be a subgroup of the group at " + i11).toString());
                throw null;
            }
            int i12 = this.f11134r;
            int i13 = this.f11125h;
            int i14 = this.f11126i;
            this.f11134r = i10;
            K();
            this.f11134r = i12;
            this.f11125h = i13;
            this.f11126i = i14;
        }
    }

    public final void l(int i10, int i11, int i12) {
        if (i10 >= this.f11122e) {
            i10 = -((m() - i10) + 2);
        }
        while (i12 < i11) {
            this.f11120b[(n(i12) * 5) + 2] = i10;
            int A = a1.c.A(this.f11120b, n(i12)) + i12;
            l(i12, A, i12 + 1);
            i12 = A;
        }
    }

    public final int m() {
        return (this.f11120b.length / 5) - this.f11123f;
    }

    public final int n(int i10) {
        return i10 < this.f11122e ? i10 : i10 + this.f11123f;
    }

    public final int o(int i10) {
        return a1.c.A(this.f11120b, n(i10));
    }

    public final boolean p(int i10, int i11) {
        int i12;
        int length;
        if (i11 == this.f11135s) {
            length = this.f11124g;
        } else {
            v vVar = this.f11131o;
            int i13 = vVar.c;
            if (i13 > 0) {
                i12 = ((int[]) vVar.f11086b)[i13 - 1];
            } else {
                i12 = 0;
            }
            if (i11 <= i12) {
                int i14 = 0;
                while (true) {
                    if (i14 < i13) {
                        if (((int[]) vVar.f11086b)[i14] == i11) {
                            break;
                        }
                        i14++;
                    } else {
                        i14 = -1;
                        break;
                    }
                }
                if (i14 >= 0) {
                    length = ((this.f11120b.length / 5) - this.f11123f) - ((int[]) this.f11132p.f11086b)[i14];
                }
            }
            length = o(i11) + i11;
        }
        if (i10 <= i11 || i10 >= length) {
            return false;
        }
        return true;
    }

    public final void q(int i10) {
        int i11;
        if (i10 > 0) {
            int i12 = this.f11134r;
            v(i12);
            int i13 = this.f11122e;
            int i14 = this.f11123f;
            int[] iArr = this.f11120b;
            int length = iArr.length / 5;
            int i15 = length - i14;
            int i16 = 0;
            if (i14 < i10) {
                int max = Math.max(Math.max(length * 2, i15 + i10), 32);
                int[] iArr2 = new int[max * 5];
                int i17 = max - i15;
                n7.i.a2(0, 0, i13 * 5, iArr, iArr2);
                n7.i.a2((i13 + i17) * 5, (i14 + i13) * 5, length * 5, iArr, iArr2);
                this.f11120b = iArr2;
                i14 = i17;
            }
            int i18 = this.f11124g;
            if (i18 >= i13) {
                this.f11124g = i18 + i10;
            }
            int i19 = i13 + i10;
            this.f11122e = i19;
            this.f11123f = i14 - i10;
            if (i15 > 0) {
                i11 = g(this.f11120b, n(i12 + i10));
            } else {
                i11 = 0;
            }
            if (this.f11129l >= i13) {
                i16 = this.f11127j;
            }
            int i20 = this.f11128k;
            int length2 = this.c.length;
            if (i11 > i16) {
                i11 = -(((length2 - i20) - i11) + 1);
            }
            for (int i21 = i13; i21 < i19; i21++) {
                this.f11120b[(i21 * 5) + 4] = i11;
            }
            int i22 = this.f11129l;
            if (i22 >= i13) {
                this.f11129l = i22 + i10;
            }
        }
    }

    public final void r(int i10, int i11) {
        if (i10 > 0) {
            w(this.f11125h, i11);
            int i12 = this.f11127j;
            int i13 = this.f11128k;
            if (i13 < i10) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i14 = length - i13;
                int max = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[max];
                for (int i15 = 0; i15 < max; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = max - i14;
                n7.i.b2(objArr, objArr2, 0, 0, i12);
                n7.i.b2(objArr, objArr2, i12 + i16, i13 + i12, length);
                this.c = objArr2;
                i13 = i16;
            }
            int i17 = this.f11126i;
            if (i17 >= i12) {
                this.f11126i = i17 + i10;
            }
            this.f11127j = i12 + i10;
            this.f11128k = i13 - i10;
        }
    }

    public final boolean s(int i10) {
        return a1.c.D(this.f11120b, n(i10));
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f11134r + " end=" + this.f11124g + " size = " + m() + " gap=" + this.f11122e + '-' + (this.f11122e + this.f11123f) + ')';
    }

    public final void u(x0 x0Var, int i10) {
        boolean z10;
        v7.g.f(x0Var, "table");
        if (this.f11130m > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ComposerKt.f(z10);
        if (i10 == 0 && this.f11134r == 0 && this.f11119a.f11104j == 0) {
            int[] iArr = this.f11120b;
            Object[] objArr = this.c;
            ArrayList<b> arrayList = this.f11121d;
            int[] iArr2 = x0Var.f11103i;
            int i11 = x0Var.f11104j;
            Object[] objArr2 = x0Var.f11105k;
            int i12 = x0Var.f11106l;
            this.f11120b = iArr2;
            this.c = objArr2;
            this.f11121d = x0Var.f11109p;
            this.f11122e = i11;
            this.f11123f = (iArr2.length / 5) - i11;
            this.f11127j = i12;
            this.f11128k = objArr2.length - i12;
            this.f11129l = i11;
            v7.g.f(iArr, "groups");
            v7.g.f(objArr, "slots");
            v7.g.f(arrayList, "anchors");
            x0Var.f11103i = iArr;
            x0Var.f11104j = 0;
            x0Var.f11105k = objArr;
            x0Var.f11106l = 0;
            x0Var.f11109p = arrayList;
            return;
        }
        z0 t10 = x0Var.t();
        try {
            a.a(t10, i10, this, true, true);
        } finally {
            t10.f();
        }
    }

    public final void v(int i10) {
        int m10;
        int i11;
        int i12 = this.f11123f;
        int i13 = this.f11122e;
        if (i13 != i10) {
            boolean z10 = true;
            if (!this.f11121d.isEmpty()) {
                int length = (this.f11120b.length / 5) - this.f11123f;
                if (i13 < i10) {
                    for (int E = a1.c.E(this.f11121d, i13, length); E < this.f11121d.size(); E++) {
                        b bVar = this.f11121d.get(E);
                        v7.g.e(bVar, "anchors[index]");
                        b bVar2 = bVar;
                        int i14 = bVar2.f11033a;
                        if (i14 >= 0 || (i11 = i14 + length) >= i10) {
                            break;
                        }
                        bVar2.f11033a = i11;
                    }
                } else {
                    for (int E2 = a1.c.E(this.f11121d, i10, length); E2 < this.f11121d.size(); E2++) {
                        b bVar3 = this.f11121d.get(E2);
                        v7.g.e(bVar3, "anchors[index]");
                        b bVar4 = bVar3;
                        int i15 = bVar4.f11033a;
                        if (i15 < 0) {
                            break;
                        }
                        bVar4.f11033a = -(length - i15);
                    }
                }
            }
            if (i12 > 0) {
                int[] iArr = this.f11120b;
                int i16 = i10 * 5;
                int i17 = i12 * 5;
                int i18 = i13 * 5;
                if (i10 < i13) {
                    n7.i.a2(i17 + i16, i16, i18, iArr, iArr);
                } else {
                    n7.i.a2(i18, i18 + i17, i16 + i17, iArr, iArr);
                }
            }
            if (i10 < i13) {
                i13 = i10 + i12;
            }
            int length2 = this.f11120b.length / 5;
            if (i13 >= length2) {
                z10 = false;
            }
            ComposerKt.f(z10);
            while (i13 < length2) {
                int i19 = (i13 * 5) + 2;
                int i20 = this.f11120b[i19];
                if (i20 > -2) {
                    m10 = i20;
                } else {
                    m10 = m() + i20 + 2;
                }
                if (m10 >= i10) {
                    m10 = -((m() - m10) + 2);
                }
                if (m10 != i20) {
                    this.f11120b[i19] = m10;
                }
                i13++;
                if (i13 == i10) {
                    i13 += i12;
                }
            }
        }
        this.f11122e = i10;
    }

    public final void w(int i10, int i11) {
        boolean z10;
        boolean z11;
        int i12 = this.f11128k;
        int i13 = this.f11127j;
        int i14 = this.f11129l;
        if (i13 != i10) {
            Object[] objArr = this.c;
            if (i10 < i13) {
                n7.i.b2(objArr, objArr, i10 + i12, i10, i13);
            } else {
                n7.i.b2(objArr, objArr, i13, i13 + i12, i10 + i12);
            }
            n7.i.g2(i10, i10 + i12, objArr);
        }
        int min = Math.min(i11 + 1, m());
        if (i14 != min) {
            int length = this.c.length - i12;
            if (min < i14) {
                int n = n(min);
                int n10 = n(i14);
                int i15 = this.f11122e;
                while (n < n10) {
                    int[] iArr = this.f11120b;
                    int i16 = (n * 5) + 4;
                    int i17 = iArr[i16];
                    if (i17 >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        iArr[i16] = -((length - i17) + 1);
                        n++;
                        if (n == i15) {
                            n += this.f11123f;
                        }
                    } else {
                        ComposerKt.c("Unexpected anchor value, expected a positive anchor".toString());
                        throw null;
                    }
                }
            } else {
                int n11 = n(i14);
                int n12 = n(min);
                while (n11 < n12) {
                    int[] iArr2 = this.f11120b;
                    int i18 = (n11 * 5) + 4;
                    int i19 = iArr2[i18];
                    if (i19 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        iArr2[i18] = i19 + length + 1;
                        n11++;
                        if (n11 == this.f11122e) {
                            n11 += this.f11123f;
                        }
                    } else {
                        ComposerKt.c("Unexpected anchor value, expected a negative anchor".toString());
                        throw null;
                    }
                }
            }
            this.f11129l = min;
        }
        this.f11127j = i10;
    }

    public final void x(b bVar, z0 z0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        int F;
        boolean z13;
        v7.g.f(bVar, "anchor");
        boolean z14 = false;
        if (z0Var.f11130m > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ComposerKt.f(z10);
        if (this.f11130m == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ComposerKt.f(z11);
        ComposerKt.f(bVar.a());
        int c = c(bVar) + 1;
        int i10 = this.f11134r;
        if (i10 <= c && c < this.f11124g) {
            z12 = true;
        } else {
            z12 = false;
        }
        ComposerKt.f(z12);
        int z15 = z(c);
        int o10 = o(c);
        if (s(c)) {
            F = 1;
        } else {
            F = a1.c.F(this.f11120b, n(c));
        }
        a.a(this, c, z0Var, false, false);
        O(z15);
        if (F > 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        while (z15 >= i10) {
            int n = n(z15);
            int[] iArr = this.f11120b;
            a1.c.I(n, a1.c.A(iArr, n) - o10, iArr);
            if (z13) {
                if (a1.c.D(this.f11120b, n)) {
                    z13 = false;
                } else {
                    int[] iArr2 = this.f11120b;
                    a1.c.J(n, a1.c.F(iArr2, n) - F, iArr2);
                }
            }
            z15 = z(z15);
        }
        if (z13) {
            if (this.n >= F) {
                z14 = true;
            }
            ComposerKt.f(z14);
            this.n -= F;
        }
    }

    public final Object y(int i10) {
        int n = n(i10);
        if (a1.c.D(this.f11120b, n)) {
            return this.c[h(g(this.f11120b, n))];
        }
        return null;
    }

    public final int z(int i10) {
        return A(this.f11120b, i10);
    }
}
