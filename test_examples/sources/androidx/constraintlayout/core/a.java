package androidx.constraintlayout.core;

import androidx.constraintlayout.core.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements b.a {

    /* renamed from: b  reason: collision with root package name */
    public final b f4187b;
    public final d2.a c;

    /* renamed from: a  reason: collision with root package name */
    public int f4186a = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f4188d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f4189e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f4190f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f4191g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f4192h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f4193i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4194j = false;

    public a(b bVar, d2.a aVar) {
        this.f4187b = bVar;
        this.c = aVar;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float a(int i10) {
        int i11 = this.f4192h;
        for (int i12 = 0; i11 != -1 && i12 < this.f4186a; i12++) {
            if (i12 == i10) {
                return this.f4191g[i11];
            }
            i11 = this.f4190f[i11];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float b(SolverVariable solverVariable, boolean z10) {
        int i10 = this.f4192h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f4186a) {
            if (this.f4189e[i10] == solverVariable.f4171j) {
                if (i10 == this.f4192h) {
                    this.f4192h = this.f4190f[i10];
                } else {
                    int[] iArr = this.f4190f;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    solverVariable.b(this.f4187b);
                }
                solverVariable.f4180t--;
                this.f4186a--;
                this.f4189e[i10] = -1;
                if (this.f4194j) {
                    this.f4193i = i10;
                }
                return this.f4191g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f4190f[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final int c() {
        return this.f4186a;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void clear() {
        int i10 = this.f4192h;
        for (int i11 = 0; i10 != -1 && i11 < this.f4186a; i11++) {
            SolverVariable solverVariable = ((SolverVariable[]) this.c.f10383d)[this.f4189e[i10]];
            if (solverVariable != null) {
                solverVariable.b(this.f4187b);
            }
            i10 = this.f4190f[i10];
        }
        this.f4192h = -1;
        this.f4193i = -1;
        this.f4194j = false;
        this.f4186a = 0;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float d(SolverVariable solverVariable) {
        int i10 = this.f4192h;
        for (int i11 = 0; i10 != -1 && i11 < this.f4186a; i11++) {
            if (this.f4189e[i10] == solverVariable.f4171j) {
                return this.f4191g[i10];
            }
            i10 = this.f4190f[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final boolean e(SolverVariable solverVariable) {
        int i10 = this.f4192h;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f4186a; i11++) {
            if (this.f4189e[i10] == solverVariable.f4171j) {
                return true;
            }
            i10 = this.f4190f[i10];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float f(b bVar, boolean z10) {
        float d5 = d(bVar.f4195a);
        b(bVar.f4195a, z10);
        b.a aVar = bVar.f4197d;
        int c = aVar.c();
        for (int i10 = 0; i10 < c; i10++) {
            SolverVariable h10 = aVar.h(i10);
            i(h10, aVar.d(h10) * d5, z10);
        }
        return d5;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void g(SolverVariable solverVariable, float f10) {
        if (f10 == 0.0f) {
            b(solverVariable, true);
            return;
        }
        int i10 = this.f4192h;
        b bVar = this.f4187b;
        if (i10 == -1) {
            this.f4192h = 0;
            this.f4191g[0] = f10;
            this.f4189e[0] = solverVariable.f4171j;
            this.f4190f[0] = -1;
            solverVariable.f4180t++;
            solverVariable.a(bVar);
            this.f4186a++;
            if (this.f4194j) {
                return;
            }
            int i11 = this.f4193i + 1;
            this.f4193i = i11;
            int[] iArr = this.f4189e;
            if (i11 >= iArr.length) {
                this.f4194j = true;
                this.f4193i = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f4186a; i13++) {
            int i14 = this.f4189e[i10];
            int i15 = solverVariable.f4171j;
            if (i14 == i15) {
                this.f4191g[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f4190f[i10];
        }
        int i16 = this.f4193i;
        int i17 = i16 + 1;
        if (this.f4194j) {
            int[] iArr2 = this.f4189e;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f4189e;
        if (i16 >= iArr3.length && this.f4186a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f4189e;
                if (i18 >= iArr4.length) {
                    break;
                } else if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr5 = this.f4189e;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f4188d * 2;
            this.f4188d = i19;
            this.f4194j = false;
            this.f4193i = i16 - 1;
            this.f4191g = Arrays.copyOf(this.f4191g, i19);
            this.f4189e = Arrays.copyOf(this.f4189e, this.f4188d);
            this.f4190f = Arrays.copyOf(this.f4190f, this.f4188d);
        }
        this.f4189e[i16] = solverVariable.f4171j;
        this.f4191g[i16] = f10;
        int[] iArr6 = this.f4190f;
        if (i12 != -1) {
            iArr6[i16] = iArr6[i12];
            iArr6[i12] = i16;
        } else {
            iArr6[i16] = this.f4192h;
            this.f4192h = i16;
        }
        solverVariable.f4180t++;
        solverVariable.a(bVar);
        int i20 = this.f4186a + 1;
        this.f4186a = i20;
        if (!this.f4194j) {
            this.f4193i++;
        }
        int[] iArr7 = this.f4189e;
        if (i20 >= iArr7.length) {
            this.f4194j = true;
        }
        if (this.f4193i >= iArr7.length) {
            this.f4194j = true;
            this.f4193i = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final SolverVariable h(int i10) {
        int i11 = this.f4192h;
        for (int i12 = 0; i11 != -1 && i12 < this.f4186a; i12++) {
            if (i12 == i10) {
                return ((SolverVariable[]) this.c.f10383d)[this.f4189e[i11]];
            }
            i11 = this.f4190f[i11];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void i(SolverVariable solverVariable, float f10, boolean z10) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i10 = this.f4192h;
            b bVar = this.f4187b;
            if (i10 == -1) {
                this.f4192h = 0;
                this.f4191g[0] = f10;
                this.f4189e[0] = solverVariable.f4171j;
                this.f4190f[0] = -1;
                solverVariable.f4180t++;
                solverVariable.a(bVar);
                this.f4186a++;
                if (this.f4194j) {
                    return;
                }
                int i11 = this.f4193i + 1;
                this.f4193i = i11;
                int[] iArr = this.f4189e;
                if (i11 >= iArr.length) {
                    this.f4194j = true;
                    this.f4193i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f4186a; i13++) {
                int i14 = this.f4189e[i10];
                int i15 = solverVariable.f4171j;
                if (i14 == i15) {
                    float[] fArr = this.f4191g;
                    float f11 = fArr[i10] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i10] = f11;
                    if (f11 == 0.0f) {
                        if (i10 == this.f4192h) {
                            this.f4192h = this.f4190f[i10];
                        } else {
                            int[] iArr2 = this.f4190f;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            solverVariable.b(bVar);
                        }
                        if (this.f4194j) {
                            this.f4193i = i10;
                        }
                        solverVariable.f4180t--;
                        this.f4186a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f4190f[i10];
            }
            int i16 = this.f4193i;
            int i17 = i16 + 1;
            if (this.f4194j) {
                int[] iArr3 = this.f4189e;
                if (iArr3[i16] != -1) {
                    i16 = iArr3.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr4 = this.f4189e;
            if (i16 >= iArr4.length && this.f4186a < iArr4.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr5 = this.f4189e;
                    if (i18 >= iArr5.length) {
                        break;
                    } else if (iArr5[i18] == -1) {
                        i16 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int[] iArr6 = this.f4189e;
            if (i16 >= iArr6.length) {
                i16 = iArr6.length;
                int i19 = this.f4188d * 2;
                this.f4188d = i19;
                this.f4194j = false;
                this.f4193i = i16 - 1;
                this.f4191g = Arrays.copyOf(this.f4191g, i19);
                this.f4189e = Arrays.copyOf(this.f4189e, this.f4188d);
                this.f4190f = Arrays.copyOf(this.f4190f, this.f4188d);
            }
            this.f4189e[i16] = solverVariable.f4171j;
            this.f4191g[i16] = f10;
            int[] iArr7 = this.f4190f;
            if (i12 != -1) {
                iArr7[i16] = iArr7[i12];
                iArr7[i12] = i16;
            } else {
                iArr7[i16] = this.f4192h;
                this.f4192h = i16;
            }
            solverVariable.f4180t++;
            solverVariable.a(bVar);
            this.f4186a++;
            if (!this.f4194j) {
                this.f4193i++;
            }
            int i20 = this.f4193i;
            int[] iArr8 = this.f4189e;
            if (i20 >= iArr8.length) {
                this.f4194j = true;
                this.f4193i = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void j(float f10) {
        int i10 = this.f4192h;
        for (int i11 = 0; i10 != -1 && i11 < this.f4186a; i11++) {
            float[] fArr = this.f4191g;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f4190f[i10];
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void k() {
        int i10 = this.f4192h;
        for (int i11 = 0; i10 != -1 && i11 < this.f4186a; i11++) {
            float[] fArr = this.f4191g;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f4190f[i10];
        }
    }

    public final String toString() {
        int i10 = this.f4192h;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f4186a; i11++) {
            str = (a4.b.l(str, " -> ") + this.f4191g[i10] + " : ") + ((SolverVariable[]) this.c.f10383d)[this.f4189e[i10]];
            i10 = this.f4190f[i10];
        }
        return str;
    }
}
