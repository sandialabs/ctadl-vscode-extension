package q0;

import androidx.compose.ui.unit.LayoutDirection;
import b2.h;
import ma.i;
import q0.a;
import v7.g;

/* loaded from: classes.dex */
public final class b implements q0.a {

    /* renamed from: b  reason: collision with root package name */
    public final float f16819b;
    public final float c;

    /* loaded from: classes.dex */
    public static final class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final float f16820a;

        public a(float f10) {
            this.f16820a = f10;
        }

        @Override // q0.a.b
        public final int a(int i10, LayoutDirection layoutDirection) {
            g.f(layoutDirection, "layoutDirection");
            float f10 = (i10 + 0) / 2.0f;
            LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
            float f11 = this.f16820a;
            if (layoutDirection != layoutDirection2) {
                f11 *= -1;
            }
            return m0.b.g1((1 + f11) * f10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && g.a(Float.valueOf(this.f16820a), Float.valueOf(((a) obj).f16820a));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f16820a);
        }

        public final String toString() {
            return a4.b.n(new StringBuilder("Horizontal(bias="), this.f16820a, ')');
        }
    }

    /* renamed from: q0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0211b implements a.c {

        /* renamed from: a  reason: collision with root package name */
        public final float f16821a;

        public C0211b(float f10) {
            this.f16821a = f10;
        }

        @Override // q0.a.c
        public final int a(int i10) {
            return m0.b.g1((1 + this.f16821a) * ((i10 + 0) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0211b) && g.a(Float.valueOf(this.f16821a), Float.valueOf(((C0211b) obj).f16821a));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f16821a);
        }

        public final String toString() {
            return a4.b.n(new StringBuilder("Vertical(bias="), this.f16821a, ')');
        }
    }

    public b(float f10, float f11) {
        this.f16819b = f10;
        this.c = f11;
    }

    @Override // q0.a
    public final long a(long j2, long j10, LayoutDirection layoutDirection) {
        g.f(layoutDirection, "layoutDirection");
        float f10 = (((int) (j10 >> 32)) - ((int) (j2 >> 32))) / 2.0f;
        float b5 = (h.b(j10) - h.b(j2)) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f11 = this.f16819b;
        if (layoutDirection != layoutDirection2) {
            f11 *= -1;
        }
        float f12 = 1;
        return i.g(m0.b.g1((f11 + f12) * f10), m0.b.g1((f12 + this.c) * b5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return g.a(Float.valueOf(this.f16819b), Float.valueOf(bVar.f16819b)) && g.a(Float.valueOf(this.c), Float.valueOf(bVar.c));
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c) + (Float.floatToIntBits(this.f16819b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f16819b);
        sb.append(", verticalBias=");
        return a4.b.n(sb, this.c, ')');
    }
}
