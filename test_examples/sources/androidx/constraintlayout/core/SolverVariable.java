package androidx.constraintlayout.core;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class SolverVariable implements Comparable<SolverVariable> {

    /* renamed from: i  reason: collision with root package name */
    public boolean f4170i;

    /* renamed from: m  reason: collision with root package name */
    public float f4174m;

    /* renamed from: q  reason: collision with root package name */
    public Type f4177q;

    /* renamed from: j  reason: collision with root package name */
    public int f4171j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f4172k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f4173l = 0;
    public boolean n = false;

    /* renamed from: o  reason: collision with root package name */
    public final float[] f4175o = new float[9];

    /* renamed from: p  reason: collision with root package name */
    public final float[] f4176p = new float[9];

    /* renamed from: r  reason: collision with root package name */
    public b[] f4178r = new b[16];

    /* renamed from: s  reason: collision with root package name */
    public int f4179s = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f4180t = 0;

    /* loaded from: classes.dex */
    public enum Type {
        UNRESTRICTED,
        /* JADX INFO: Fake field, exist only in values array */
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type) {
        this.f4177q = type;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f4179s;
            if (i10 >= i11) {
                b[] bVarArr = this.f4178r;
                if (i11 >= bVarArr.length) {
                    this.f4178r = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f4178r;
                int i12 = this.f4179s;
                bVarArr2[i12] = bVar;
                this.f4179s = i12 + 1;
                return;
            } else if (this.f4178r[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void b(b bVar) {
        int i10 = this.f4179s;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f4178r[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f4178r;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f4179s--;
                return;
            }
            i11++;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(SolverVariable solverVariable) {
        return this.f4171j - solverVariable.f4171j;
    }

    public final void i() {
        this.f4177q = Type.UNKNOWN;
        this.f4173l = 0;
        this.f4171j = -1;
        this.f4172k = -1;
        this.f4174m = 0.0f;
        this.n = false;
        int i10 = this.f4179s;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f4178r[i11] = null;
        }
        this.f4179s = 0;
        this.f4180t = 0;
        this.f4170i = false;
        Arrays.fill(this.f4176p, 0.0f);
    }

    public final void j(c cVar, float f10) {
        this.f4174m = f10;
        this.n = true;
        int i10 = this.f4179s;
        this.f4172k = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f4178r[i11].h(cVar, this, false);
        }
        this.f4179s = 0;
    }

    public final void k(c cVar, b bVar) {
        int i10 = this.f4179s;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f4178r[i11].i(cVar, bVar, false);
        }
        this.f4179s = 0;
    }

    public final String toString() {
        return "" + this.f4171j;
    }
}
