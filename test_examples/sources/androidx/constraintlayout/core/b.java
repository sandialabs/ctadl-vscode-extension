package androidx.constraintlayout.core;

import androidx.activity.e;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b implements c.a {

    /* renamed from: d  reason: collision with root package name */
    public a f4197d;

    /* renamed from: a  reason: collision with root package name */
    public SolverVariable f4195a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f4196b = 0.0f;
    public final ArrayList<SolverVariable> c = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f4198e = false;

    /* loaded from: classes.dex */
    public interface a {
        float a(int i10);

        float b(SolverVariable solverVariable, boolean z10);

        int c();

        void clear();

        float d(SolverVariable solverVariable);

        boolean e(SolverVariable solverVariable);

        float f(b bVar, boolean z10);

        void g(SolverVariable solverVariable, float f10);

        SolverVariable h(int i10);

        void i(SolverVariable solverVariable, float f10, boolean z10);

        void j(float f10);

        void k();
    }

    public b() {
    }

    public b(d2.a aVar) {
        this.f4197d = new androidx.constraintlayout.core.a(this, aVar);
    }

    @Override // androidx.constraintlayout.core.c.a
    public SolverVariable a(boolean[] zArr) {
        return f(zArr, null);
    }

    public final void b(c cVar, int i10) {
        this.f4197d.g(cVar.k(i10), 1.0f);
        this.f4197d.g(cVar.k(i10), -1.0f);
    }

    public final void c(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f4196b = i10;
        }
        if (z10) {
            this.f4197d.g(solverVariable, 1.0f);
            this.f4197d.g(solverVariable2, -1.0f);
            this.f4197d.g(solverVariable3, -1.0f);
            return;
        }
        this.f4197d.g(solverVariable, -1.0f);
        this.f4197d.g(solverVariable2, 1.0f);
        this.f4197d.g(solverVariable3, 1.0f);
    }

    public final void d(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f4196b = i10;
        }
        if (z10) {
            this.f4197d.g(solverVariable, 1.0f);
            this.f4197d.g(solverVariable2, -1.0f);
            this.f4197d.g(solverVariable3, 1.0f);
            return;
        }
        this.f4197d.g(solverVariable, -1.0f);
        this.f4197d.g(solverVariable2, 1.0f);
        this.f4197d.g(solverVariable3, -1.0f);
    }

    public boolean e() {
        return this.f4195a == null && this.f4196b == 0.0f && this.f4197d.c() == 0;
    }

    public final SolverVariable f(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int c = this.f4197d.c();
        SolverVariable solverVariable2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < c; i10++) {
            float a10 = this.f4197d.a(i10);
            if (a10 < 0.0f) {
                SolverVariable h10 = this.f4197d.h(i10);
                if ((zArr == null || !zArr[h10.f4171j]) && h10 != solverVariable && (((type = h10.f4177q) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && a10 < f10)) {
                    f10 = a10;
                    solverVariable2 = h10;
                }
            }
        }
        return solverVariable2;
    }

    public final void g(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f4195a;
        if (solverVariable2 != null) {
            this.f4197d.g(solverVariable2, -1.0f);
            this.f4195a.f4172k = -1;
            this.f4195a = null;
        }
        float b5 = this.f4197d.b(solverVariable, true) * (-1.0f);
        this.f4195a = solverVariable;
        if (b5 == 1.0f) {
            return;
        }
        this.f4196b /= b5;
        this.f4197d.j(b5);
    }

    public final void h(c cVar, SolverVariable solverVariable, boolean z10) {
        if (solverVariable != null && solverVariable.n) {
            float d5 = this.f4197d.d(solverVariable);
            this.f4196b = (solverVariable.f4174m * d5) + this.f4196b;
            this.f4197d.b(solverVariable, z10);
            if (z10) {
                solverVariable.b(this);
            }
            if (this.f4197d.c() == 0) {
                this.f4198e = true;
                cVar.f4201a = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z10) {
        float f10 = this.f4197d.f(bVar, z10);
        this.f4196b = (bVar.f4196b * f10) + this.f4196b;
        if (z10) {
            bVar.f4195a.b(this);
        }
        if (this.f4195a == null || this.f4197d.c() != 0) {
            return;
        }
        this.f4198e = true;
        cVar.f4201a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String str;
        boolean z10;
        float a10;
        int i10;
        StringBuilder sb;
        String str2;
        StringBuilder sb2;
        if (this.f4195a == null) {
            str = "0";
        } else {
            str = "" + this.f4195a;
        }
        String l2 = a4.b.l(str, " = ");
        if (this.f4196b != 0.0f) {
            l2 = l2 + this.f4196b;
            z10 = true;
        } else {
            z10 = false;
        }
        int c = this.f4197d.c();
        for (int i11 = 0; i11 < c; i11++) {
            SolverVariable h10 = this.f4197d.h(i11);
            if (h10 != null && (this.f4197d.a(i11)) != 0.0f) {
                String solverVariable = h10.toString();
                if (!z10) {
                    if (a10 < 0.0f) {
                        sb = new StringBuilder();
                        sb.append(l2);
                        str2 = "- ";
                        sb.append(str2);
                        l2 = sb.toString();
                        a10 *= -1.0f;
                    }
                    if (a10 == 1.0f) {
                        sb2 = new StringBuilder();
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append(l2);
                        sb2.append(a10);
                        l2 = " ";
                    }
                    l2 = e.k(sb2, l2, solverVariable);
                    z10 = true;
                } else {
                    sb = new StringBuilder();
                    sb.append(l2);
                    if (i10 > 0) {
                        sb.append(" + ");
                        l2 = sb.toString();
                        if (a10 == 1.0f) {
                        }
                        l2 = e.k(sb2, l2, solverVariable);
                        z10 = true;
                    } else {
                        str2 = " - ";
                        sb.append(str2);
                        l2 = sb.toString();
                        a10 *= -1.0f;
                        if (a10 == 1.0f) {
                        }
                        l2 = e.k(sb2, l2, solverVariable);
                        z10 = true;
                    }
                }
            }
        }
        if (!z10) {
            return a4.b.l(l2, "0.0");
        }
        return l2;
    }
}
