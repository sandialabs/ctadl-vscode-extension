package androidx.constraintlayout.core;

import androidx.constraintlayout.core.b;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class d extends androidx.constraintlayout.core.b {

    /* renamed from: f  reason: collision with root package name */
    public SolverVariable[] f4214f;

    /* renamed from: g  reason: collision with root package name */
    public SolverVariable[] f4215g;

    /* renamed from: h  reason: collision with root package name */
    public int f4216h;

    /* renamed from: i  reason: collision with root package name */
    public final b f4217i;

    /* loaded from: classes.dex */
    public class a implements Comparator<SolverVariable> {
        @Override // java.util.Comparator
        public final int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f4171j - solverVariable2.f4171j;
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public SolverVariable f4218a;

        public b() {
        }

        public final String toString() {
            String str = "[ ";
            if (this.f4218a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f4218a.f4176p[i10] + " ";
                }
            }
            return str + "] " + this.f4218a;
        }
    }

    public d(d2.a aVar) {
        super(aVar);
        this.f4214f = new SolverVariable[128];
        this.f4215g = new SolverVariable[128];
        this.f4216h = 0;
        this.f4217i = new b();
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.c.a
    public final SolverVariable a(boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f4216h; i11++) {
            SolverVariable[] solverVariableArr = this.f4214f;
            SolverVariable solverVariable = solverVariableArr[i11];
            if (!zArr[solverVariable.f4171j]) {
                b bVar = this.f4217i;
                bVar.f4218a = solverVariable;
                boolean z10 = true;
                int i12 = 8;
                if (i10 == -1) {
                    while (i12 >= 0) {
                        float f10 = bVar.f4218a.f4176p[i12];
                        if (f10 > 0.0f) {
                            break;
                        } else if (f10 < 0.0f) {
                            break;
                        } else {
                            i12--;
                        }
                    }
                    z10 = false;
                    if (z10) {
                        i10 = i11;
                    }
                } else {
                    SolverVariable solverVariable2 = solverVariableArr[i10];
                    while (true) {
                        if (i12 < 0) {
                            break;
                        }
                        float f11 = solverVariable2.f4176p[i12];
                        float f12 = bVar.f4218a.f4176p[i12];
                        if (f12 == f11) {
                            i12--;
                        } else if (f12 < f11) {
                        }
                    }
                    z10 = false;
                    if (!z10) {
                    }
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f4214f[i10];
    }

    @Override // androidx.constraintlayout.core.b
    public final boolean e() {
        return this.f4216h == 0;
    }

    @Override // androidx.constraintlayout.core.b
    public final void i(c cVar, androidx.constraintlayout.core.b bVar, boolean z10) {
        boolean z11;
        SolverVariable solverVariable = bVar.f4195a;
        if (solverVariable == null) {
            return;
        }
        b.a aVar = bVar.f4197d;
        int c = aVar.c();
        for (int i10 = 0; i10 < c; i10++) {
            SolverVariable h10 = aVar.h(i10);
            float a10 = aVar.a(i10);
            b bVar2 = this.f4217i;
            bVar2.f4218a = h10;
            boolean z12 = h10.f4170i;
            float[] fArr = solverVariable.f4176p;
            if (z12) {
                boolean z13 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = bVar2.f4218a.f4176p;
                    float f10 = (fArr[i11] * a10) + fArr2[i11];
                    fArr2[i11] = f10;
                    if (Math.abs(f10) < 1.0E-4f) {
                        bVar2.f4218a.f4176p[i11] = 0.0f;
                    } else {
                        z13 = false;
                    }
                }
                if (z13) {
                    d.this.k(bVar2.f4218a);
                }
                z11 = false;
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f11 = fArr[i12];
                    if (f11 != 0.0f) {
                        float f12 = f11 * a10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        bVar2.f4218a.f4176p[i12] = f12;
                    } else {
                        bVar2.f4218a.f4176p[i12] = 0.0f;
                    }
                }
                z11 = true;
            }
            if (z11) {
                j(h10);
            }
            this.f4196b = (bVar.f4196b * a10) + this.f4196b;
        }
        k(solverVariable);
    }

    public final void j(SolverVariable solverVariable) {
        int i10;
        int i11 = this.f4216h + 1;
        SolverVariable[] solverVariableArr = this.f4214f;
        if (i11 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f4214f = solverVariableArr2;
            this.f4215g = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f4214f;
        int i12 = this.f4216h;
        solverVariableArr3[i12] = solverVariable;
        int i13 = i12 + 1;
        this.f4216h = i13;
        if (i13 > 1 && solverVariableArr3[i13 - 1].f4171j > solverVariable.f4171j) {
            int i14 = 0;
            while (true) {
                i10 = this.f4216h;
                if (i14 >= i10) {
                    break;
                }
                this.f4215g[i14] = this.f4214f[i14];
                i14++;
            }
            Arrays.sort(this.f4215g, 0, i10, new a());
            for (int i15 = 0; i15 < this.f4216h; i15++) {
                this.f4214f[i15] = this.f4215g[i15];
            }
        }
        solverVariable.f4170i = true;
        solverVariable.a(this);
    }

    public final void k(SolverVariable solverVariable) {
        int i10 = 0;
        while (i10 < this.f4216h) {
            if (this.f4214f[i10] == solverVariable) {
                while (true) {
                    int i11 = this.f4216h;
                    if (i10 >= i11 - 1) {
                        this.f4216h = i11 - 1;
                        solverVariable.f4170i = false;
                        return;
                    }
                    SolverVariable[] solverVariableArr = this.f4214f;
                    int i12 = i10 + 1;
                    solverVariableArr[i10] = solverVariableArr[i12];
                    i10 = i12;
                }
            } else {
                i10++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b
    public final String toString() {
        String str = " goal -> (" + this.f4196b + ") : ";
        for (int i10 = 0; i10 < this.f4216h; i10++) {
            SolverVariable solverVariable = this.f4214f[i10];
            b bVar = this.f4217i;
            bVar.f4218a = solverVariable;
            str = str + bVar + " ";
        }
        return str;
    }
}
