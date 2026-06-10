package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.b;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import g0.v;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: p  reason: collision with root package name */
    public static boolean f4199p = false;

    /* renamed from: q  reason: collision with root package name */
    public static int f4200q = 1000;
    public final d c;

    /* renamed from: f  reason: collision with root package name */
    public b[] f4205f;

    /* renamed from: l  reason: collision with root package name */
    public final d2.a f4211l;

    /* renamed from: o  reason: collision with root package name */
    public b f4213o;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4201a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f4202b = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f4203d = 32;

    /* renamed from: e  reason: collision with root package name */
    public int f4204e = 32;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4206g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean[] f4207h = new boolean[32];

    /* renamed from: i  reason: collision with root package name */
    public int f4208i = 1;

    /* renamed from: j  reason: collision with root package name */
    public int f4209j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f4210k = 32;

    /* renamed from: m  reason: collision with root package name */
    public SolverVariable[] f4212m = new SolverVariable[f4200q];
    public int n = 0;

    /* loaded from: classes.dex */
    public interface a {
        SolverVariable a(boolean[] zArr);
    }

    public c() {
        this.f4205f = null;
        this.f4205f = new b[32];
        t();
        d2.a aVar = new d2.a(0);
        this.f4211l = aVar;
        this.c = new d(aVar);
        this.f4213o = new b(aVar);
    }

    public static int o(ConstraintAnchor constraintAnchor) {
        SolverVariable solverVariable = constraintAnchor.f4227i;
        if (solverVariable != null) {
            return (int) (solverVariable.f4174m + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final SolverVariable a(SolverVariable.Type type) {
        v vVar = (v) this.f4211l.c;
        int i10 = vVar.c;
        SolverVariable solverVariable = null;
        if (i10 > 0) {
            int i11 = i10 - 1;
            ?? r3 = (Object[]) vVar.f11086b;
            ?? r42 = r3[i11];
            r3[i11] = 0;
            vVar.c = i11;
            solverVariable = r42;
        }
        SolverVariable solverVariable2 = solverVariable;
        if (solverVariable2 == null) {
            solverVariable2 = new SolverVariable(type);
        } else {
            solverVariable2.i();
        }
        solverVariable2.f4177q = type;
        int i12 = this.n;
        int i13 = f4200q;
        if (i12 >= i13) {
            int i14 = i13 * 2;
            f4200q = i14;
            this.f4212m = (SolverVariable[]) Arrays.copyOf(this.f4212m, i14);
        }
        SolverVariable[] solverVariableArr = this.f4212m;
        int i15 = this.n;
        this.n = i15 + 1;
        solverVariableArr[i15] = solverVariable2;
        return solverVariable2;
    }

    public final void b(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, float f10, SolverVariable solverVariable3, SolverVariable solverVariable4, int i11, int i12) {
        int i13;
        float f11;
        b m10 = m();
        if (solverVariable2 == solverVariable3) {
            m10.f4197d.g(solverVariable, 1.0f);
            m10.f4197d.g(solverVariable4, 1.0f);
            m10.f4197d.g(solverVariable2, -2.0f);
        } else {
            if (f10 == 0.5f) {
                m10.f4197d.g(solverVariable, 1.0f);
                m10.f4197d.g(solverVariable2, -1.0f);
                m10.f4197d.g(solverVariable3, -1.0f);
                m10.f4197d.g(solverVariable4, 1.0f);
                if (i10 > 0 || i11 > 0) {
                    i13 = (-i10) + i11;
                    f11 = i13;
                }
            } else if (f10 <= 0.0f) {
                m10.f4197d.g(solverVariable, -1.0f);
                m10.f4197d.g(solverVariable2, 1.0f);
                f11 = i10;
            } else if (f10 >= 1.0f) {
                m10.f4197d.g(solverVariable4, -1.0f);
                m10.f4197d.g(solverVariable3, 1.0f);
                i13 = -i11;
                f11 = i13;
            } else {
                float f12 = 1.0f - f10;
                m10.f4197d.g(solverVariable, f12 * 1.0f);
                m10.f4197d.g(solverVariable2, f12 * (-1.0f));
                m10.f4197d.g(solverVariable3, (-1.0f) * f10);
                m10.f4197d.g(solverVariable4, 1.0f * f10);
                if (i10 > 0 || i11 > 0) {
                    m10.f4196b = (i11 * f10) + ((-i10) * f12);
                }
            }
            m10.f4196b = f11;
        }
        if (i12 != 8) {
            m10.b(this, i12);
        }
        c(m10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x01bc, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c4, code lost:
        if (r5.f4180t <= 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ee, code lost:
        if (r5.f4180t <= 1) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(b bVar) {
        boolean z10;
        ArrayList<SolverVariable> arrayList;
        SolverVariable.Type type;
        boolean z11;
        boolean z12;
        SolverVariable solverVariable;
        SolverVariable f10;
        boolean z13;
        boolean z14;
        boolean z15 = true;
        if (this.f4209j + 1 >= this.f4210k || this.f4208i + 1 >= this.f4204e) {
            p();
        }
        if (!bVar.f4198e) {
            if (this.f4205f.length != 0) {
                boolean z16 = false;
                while (!z16) {
                    int c = bVar.f4197d.c();
                    int i10 = 0;
                    while (true) {
                        arrayList = bVar.c;
                        if (i10 >= c) {
                            break;
                        }
                        SolverVariable h10 = bVar.f4197d.h(i10);
                        if (h10.f4172k != -1 || h10.n) {
                            arrayList.add(h10);
                        }
                        i10++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i11 = 0; i11 < size; i11++) {
                            SolverVariable solverVariable2 = arrayList.get(i11);
                            if (solverVariable2.n) {
                                bVar.h(this, solverVariable2, true);
                            } else {
                                bVar.i(this, this.f4205f[solverVariable2.f4172k], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z16 = true;
                    }
                }
                if (bVar.f4195a != null && bVar.f4197d.c() == 0) {
                    bVar.f4198e = true;
                    this.f4201a = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f11 = bVar.f4196b;
            if (f11 < 0.0f) {
                bVar.f4196b = f11 * (-1.0f);
                bVar.f4197d.k();
            }
            int c10 = bVar.f4197d.c();
            int i12 = 0;
            SolverVariable solverVariable3 = null;
            SolverVariable solverVariable4 = null;
            float f12 = 0.0f;
            boolean z17 = false;
            float f13 = 0.0f;
            boolean z18 = false;
            while (true) {
                type = SolverVariable.Type.UNRESTRICTED;
                if (i12 >= c10) {
                    break;
                }
                float a10 = bVar.f4197d.a(i12);
                SolverVariable h11 = bVar.f4197d.h(i12);
                if (h11.f4177q == type) {
                    if (solverVariable3 == null) {
                        if (h11.f4180t <= 1) {
                            z17 = true;
                        }
                        z17 = false;
                    } else if (f12 <= a10) {
                        if (!z17) {
                            if (h11.f4180t <= 1) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                f12 = a10;
                                solverVariable3 = h11;
                                z17 = true;
                            }
                        }
                    }
                    f12 = a10;
                    solverVariable3 = h11;
                } else if (solverVariable3 == null && a10 < 0.0f) {
                    if (solverVariable4 == null) {
                        if (h11.f4180t <= 1) {
                            z18 = true;
                        }
                        z18 = false;
                    } else if (f13 <= a10) {
                        if (!z18) {
                            if (h11.f4180t <= 1) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                f13 = a10;
                                solverVariable4 = h11;
                                z18 = true;
                            }
                        }
                    }
                    f13 = a10;
                    solverVariable4 = h11;
                }
                i12++;
            }
            if (solverVariable3 == null) {
                solverVariable3 = solverVariable4;
            }
            if (solverVariable3 == null) {
                z11 = true;
            } else {
                bVar.g(solverVariable3);
                z11 = false;
            }
            if (bVar.f4197d.c() == 0) {
                bVar.f4198e = true;
            }
            if (z11) {
                if (this.f4208i + 1 >= this.f4204e) {
                    p();
                }
                SolverVariable a11 = a(SolverVariable.Type.SLACK);
                int i13 = this.f4202b + 1;
                this.f4202b = i13;
                this.f4208i++;
                a11.f4171j = i13;
                d2.a aVar = this.f4211l;
                ((SolverVariable[]) aVar.f10383d)[i13] = a11;
                bVar.f4195a = a11;
                int i14 = this.f4209j;
                i(bVar);
                if (this.f4209j == i14 + 1) {
                    b bVar2 = this.f4213o;
                    bVar2.getClass();
                    bVar2.f4195a = null;
                    bVar2.f4197d.clear();
                    for (int i15 = 0; i15 < bVar.f4197d.c(); i15++) {
                        bVar2.f4197d.i(bVar.f4197d.h(i15), bVar.f4197d.a(i15), true);
                    }
                    s(this.f4213o);
                    if (a11.f4172k == -1) {
                        if (bVar.f4195a == a11 && (f10 = bVar.f(null, a11)) != null) {
                            bVar.g(f10);
                        }
                        if (!bVar.f4198e) {
                            bVar.f4195a.k(this, bVar);
                        }
                        ((v) aVar.f10382b).f(bVar);
                        this.f4209j--;
                    }
                    z12 = true;
                    solverVariable = bVar.f4195a;
                    if (solverVariable != null || (solverVariable.f4177q != type && bVar.f4196b < 0.0f)) {
                        z15 = false;
                    }
                    z10 = z12;
                }
            }
            z12 = false;
            solverVariable = bVar.f4195a;
            if (solverVariable != null) {
            }
            z15 = false;
            z10 = z12;
        } else {
            z10 = false;
        }
        if (!z10) {
            i(bVar);
        }
    }

    public final void d(SolverVariable solverVariable, int i10) {
        b m10;
        b.a aVar;
        float f10;
        int i11 = solverVariable.f4172k;
        if (i11 == -1) {
            solverVariable.j(this, i10);
            for (int i12 = 0; i12 < this.f4202b + 1; i12++) {
                SolverVariable solverVariable2 = ((SolverVariable[]) this.f4211l.f10383d)[i12];
            }
            return;
        }
        if (i11 != -1) {
            b bVar = this.f4205f[i11];
            if (!bVar.f4198e) {
                if (bVar.f4197d.c() == 0) {
                    bVar.f4198e = true;
                } else {
                    m10 = m();
                    if (i10 < 0) {
                        m10.f4196b = i10 * (-1);
                        aVar = m10.f4197d;
                        f10 = 1.0f;
                    } else {
                        m10.f4196b = i10;
                        aVar = m10.f4197d;
                        f10 = -1.0f;
                    }
                    aVar.g(solverVariable, f10);
                }
            }
            bVar.f4196b = i10;
            return;
        }
        m10 = m();
        m10.f4195a = solverVariable;
        float f11 = i10;
        solverVariable.f4174m = f11;
        m10.f4196b = f11;
        m10.f4198e = true;
        c(m10);
    }

    public final void e(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        if (i11 == 8 && solverVariable2.n && solverVariable.f4172k == -1) {
            solverVariable.j(this, solverVariable2.f4174m + i10);
            return;
        }
        b m10 = m();
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            m10.f4196b = i10;
        }
        if (!z10) {
            m10.f4197d.g(solverVariable, -1.0f);
            m10.f4197d.g(solverVariable2, 1.0f);
        } else {
            m10.f4197d.g(solverVariable, 1.0f);
            m10.f4197d.g(solverVariable2, -1.0f);
        }
        if (i11 != 8) {
            m10.b(this, i11);
        }
        c(m10);
    }

    public final void f(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        b m10 = m();
        SolverVariable n = n();
        n.f4173l = 0;
        m10.c(solverVariable, solverVariable2, n, i10);
        if (i11 != 8) {
            m10.f4197d.g(k(i11), (int) (m10.f4197d.d(n) * (-1.0f)));
        }
        c(m10);
    }

    public final void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        b m10 = m();
        SolverVariable n = n();
        n.f4173l = 0;
        m10.d(solverVariable, solverVariable2, n, i10);
        if (i11 != 8) {
            m10.f4197d.g(k(i11), (int) (m10.f4197d.d(n) * (-1.0f)));
        }
        c(m10);
    }

    public final void h(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f10) {
        b m10 = m();
        m10.f4197d.g(solverVariable, -1.0f);
        m10.f4197d.g(solverVariable2, 1.0f);
        m10.f4197d.g(solverVariable3, f10);
        m10.f4197d.g(solverVariable4, -f10);
        c(m10);
    }

    public final void i(b bVar) {
        int i10;
        if (bVar.f4198e) {
            bVar.f4195a.j(this, bVar.f4196b);
        } else {
            b[] bVarArr = this.f4205f;
            int i11 = this.f4209j;
            bVarArr[i11] = bVar;
            SolverVariable solverVariable = bVar.f4195a;
            solverVariable.f4172k = i11;
            this.f4209j = i11 + 1;
            solverVariable.k(this, bVar);
        }
        if (this.f4201a) {
            int i12 = 0;
            while (i12 < this.f4209j) {
                if (this.f4205f[i12] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f4205f[i12];
                if (bVar2 != null && bVar2.f4198e) {
                    bVar2.f4195a.j(this, bVar2.f4196b);
                    ((v) this.f4211l.f10382b).f(bVar2);
                    this.f4205f[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f4209j;
                        if (i13 >= i10) {
                            break;
                        }
                        b[] bVarArr2 = this.f4205f;
                        int i15 = i13 - 1;
                        b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        SolverVariable solverVariable2 = bVar3.f4195a;
                        if (solverVariable2.f4172k == i13) {
                            solverVariable2.f4172k = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f4205f[i14] = null;
                    }
                    this.f4209j = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f4201a = false;
        }
    }

    public final void j() {
        for (int i10 = 0; i10 < this.f4209j; i10++) {
            b bVar = this.f4205f[i10];
            bVar.f4195a.f4174m = bVar.f4196b;
        }
    }

    public final SolverVariable k(int i10) {
        if (this.f4208i + 1 >= this.f4204e) {
            p();
        }
        SolverVariable a10 = a(SolverVariable.Type.ERROR);
        int i11 = this.f4202b + 1;
        this.f4202b = i11;
        this.f4208i++;
        a10.f4171j = i11;
        a10.f4173l = i10;
        ((SolverVariable[]) this.f4211l.f10383d)[i11] = a10;
        d dVar = this.c;
        dVar.f4217i.f4218a = a10;
        float[] fArr = a10.f4176p;
        Arrays.fill(fArr, 0.0f);
        fArr[a10.f4173l] = 1.0f;
        dVar.j(a10);
        return a10;
    }

    public final SolverVariable l(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f4208i + 1 >= this.f4204e) {
            p();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.f4227i;
            if (solverVariable == null) {
                constraintAnchor.k();
                solverVariable = constraintAnchor.f4227i;
            }
            int i10 = solverVariable.f4171j;
            d2.a aVar = this.f4211l;
            if (i10 == -1 || i10 > this.f4202b || ((SolverVariable[]) aVar.f10383d)[i10] == null) {
                if (i10 != -1) {
                    solverVariable.i();
                }
                int i11 = this.f4202b + 1;
                this.f4202b = i11;
                this.f4208i++;
                solverVariable.f4171j = i11;
                solverVariable.f4177q = SolverVariable.Type.UNRESTRICTED;
                ((SolverVariable[]) aVar.f10383d)[i11] = solverVariable;
            }
        }
        return solverVariable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final b m() {
        b bVar;
        d2.a aVar = this.f4211l;
        v vVar = (v) aVar.f10382b;
        int i10 = vVar.c;
        if (i10 > 0) {
            int i11 = i10 - 1;
            ?? r42 = (Object[]) vVar.f11086b;
            ?? r52 = r42[i11];
            r42[i11] = 0;
            vVar.c = i11;
            bVar = r52;
        } else {
            bVar = null;
        }
        b bVar2 = bVar;
        if (bVar2 == null) {
            return new b(aVar);
        }
        bVar2.f4195a = null;
        bVar2.f4197d.clear();
        bVar2.f4196b = 0.0f;
        bVar2.f4198e = false;
        return bVar2;
    }

    public final SolverVariable n() {
        if (this.f4208i + 1 >= this.f4204e) {
            p();
        }
        SolverVariable a10 = a(SolverVariable.Type.SLACK);
        int i10 = this.f4202b + 1;
        this.f4202b = i10;
        this.f4208i++;
        a10.f4171j = i10;
        ((SolverVariable[]) this.f4211l.f10383d)[i10] = a10;
        return a10;
    }

    public final void p() {
        int i10 = this.f4203d * 2;
        this.f4203d = i10;
        this.f4205f = (b[]) Arrays.copyOf(this.f4205f, i10);
        d2.a aVar = this.f4211l;
        aVar.f10383d = (SolverVariable[]) Arrays.copyOf((SolverVariable[]) aVar.f10383d, this.f4203d);
        int i11 = this.f4203d;
        this.f4207h = new boolean[i11];
        this.f4204e = i11;
        this.f4210k = i11;
    }

    public final void q() {
        d dVar = this.c;
        if (dVar.e()) {
            j();
            return;
        }
        if (this.f4206g) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f4209j) {
                    z10 = true;
                    break;
                } else if (!this.f4205f[i10].f4198e) {
                    break;
                } else {
                    i10++;
                }
            }
            if (z10) {
                j();
                return;
            }
        }
        r(dVar);
    }

    public final void r(d dVar) {
        SolverVariable.Type type;
        float f10;
        int i10;
        boolean z10;
        int i11 = 0;
        while (true) {
            int i12 = this.f4209j;
            type = SolverVariable.Type.UNRESTRICTED;
            f10 = 0.0f;
            i10 = 1;
            if (i11 < i12) {
                b bVar = this.f4205f[i11];
                if (bVar.f4195a.f4177q != type && bVar.f4196b < 0.0f) {
                    z10 = true;
                    break;
                }
                i11++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            boolean z11 = false;
            int i13 = 0;
            while (!z11) {
                i13 += i10;
                float f11 = Float.MAX_VALUE;
                int i14 = 0;
                int i15 = -1;
                int i16 = -1;
                int i17 = 0;
                while (i14 < this.f4209j) {
                    b bVar2 = this.f4205f[i14];
                    if (bVar2.f4195a.f4177q != type && !bVar2.f4198e && bVar2.f4196b < f10) {
                        int c = bVar2.f4197d.c();
                        int i18 = 0;
                        while (i18 < c) {
                            SolverVariable h10 = bVar2.f4197d.h(i18);
                            float d5 = bVar2.f4197d.d(h10);
                            if (d5 > f10) {
                                for (int i19 = 0; i19 < 9; i19++) {
                                    float f12 = h10.f4175o[i19] / d5;
                                    if ((f12 < f11 && i19 == i17) || i19 > i17) {
                                        i16 = h10.f4171j;
                                        i17 = i19;
                                        f11 = f12;
                                        i15 = i14;
                                    }
                                }
                            }
                            i18++;
                            f10 = 0.0f;
                        }
                    }
                    i14++;
                    f10 = 0.0f;
                }
                if (i15 != -1) {
                    b bVar3 = this.f4205f[i15];
                    bVar3.f4195a.f4172k = -1;
                    bVar3.g(((SolverVariable[]) this.f4211l.f10383d)[i16]);
                    SolverVariable solverVariable = bVar3.f4195a;
                    solverVariable.f4172k = i15;
                    solverVariable.k(this, bVar3);
                } else {
                    z11 = true;
                }
                if (i13 > this.f4208i / 2) {
                    z11 = true;
                }
                f10 = 0.0f;
                i10 = 1;
            }
        }
        s(dVar);
        j();
    }

    public final void s(b bVar) {
        for (int i10 = 0; i10 < this.f4208i; i10++) {
            this.f4207h[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            i11++;
            if (i11 >= this.f4208i * 2) {
                return;
            }
            SolverVariable solverVariable = bVar.f4195a;
            if (solverVariable != null) {
                this.f4207h[solverVariable.f4171j] = true;
            }
            SolverVariable a10 = bVar.a(this.f4207h);
            if (a10 != null) {
                boolean[] zArr = this.f4207h;
                int i12 = a10.f4171j;
                if (zArr[i12]) {
                    return;
                }
                zArr[i12] = true;
            }
            if (a10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f4209j; i14++) {
                    b bVar2 = this.f4205f[i14];
                    if (bVar2.f4195a.f4177q != SolverVariable.Type.UNRESTRICTED && !bVar2.f4198e && bVar2.f4197d.e(a10)) {
                        float d5 = bVar2.f4197d.d(a10);
                        if (d5 < 0.0f) {
                            float f11 = (-bVar2.f4196b) / d5;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    b bVar3 = this.f4205f[i13];
                    bVar3.f4195a.f4172k = -1;
                    bVar3.g(a10);
                    SolverVariable solverVariable2 = bVar3.f4195a;
                    solverVariable2.f4172k = i13;
                    solverVariable2.k(this, bVar3);
                }
            } else {
                z10 = true;
            }
        }
    }

    public final void t() {
        for (int i10 = 0; i10 < this.f4209j; i10++) {
            b bVar = this.f4205f[i10];
            if (bVar != null) {
                ((v) this.f4211l.f10382b).f(bVar);
            }
            this.f4205f[i10] = null;
        }
    }

    public final void u() {
        d2.a aVar;
        int i10 = 0;
        while (true) {
            aVar = this.f4211l;
            SolverVariable[] solverVariableArr = (SolverVariable[]) aVar.f10383d;
            if (i10 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i10];
            if (solverVariable != null) {
                solverVariable.i();
            }
            i10++;
        }
        v vVar = (v) aVar.c;
        SolverVariable[] solverVariableArr2 = this.f4212m;
        int i11 = this.n;
        vVar.getClass();
        if (i11 > solverVariableArr2.length) {
            i11 = solverVariableArr2.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            SolverVariable solverVariable2 = solverVariableArr2[i12];
            int i13 = vVar.c;
            Object[] objArr = (Object[]) vVar.f11086b;
            if (i13 < objArr.length) {
                objArr[i13] = solverVariable2;
                vVar.c = i13 + 1;
            }
        }
        this.n = 0;
        Arrays.fill((SolverVariable[]) aVar.f10383d, (Object) null);
        this.f4202b = 0;
        d dVar = this.c;
        dVar.f4216h = 0;
        dVar.f4196b = 0.0f;
        this.f4208i = 1;
        for (int i14 = 0; i14 < this.f4209j; i14++) {
            b bVar = this.f4205f[i14];
        }
        t();
        this.f4209j = 0;
        this.f4213o = new b(aVar);
    }
}
