package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import u7.p;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final i f1998a = new i();

    /* renamed from: b  reason: collision with root package name */
    public static final c f1999b = new c();
    public static final j c = new j();

    /* renamed from: d  reason: collision with root package name */
    public static final a f2000d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final C0019b f2001e = new C0019b();

    /* renamed from: f  reason: collision with root package name */
    public static final f f2002f;

    /* loaded from: classes.dex */
    public static final class a implements k {
        @Override // androidx.compose.foundation.layout.b.k
        public final float a() {
            return 0;
        }

        @Override // androidx.compose.foundation.layout.b.k
        public final void c(b2.b bVar, int i10, int[] iArr, int[] iArr2) {
            v7.g.f(bVar, "<this>");
            v7.g.f(iArr, "sizes");
            v7.g.f(iArr2, "outPositions");
            b.c(i10, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* renamed from: androidx.compose.foundation.layout.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0019b implements d, k {

        /* renamed from: a  reason: collision with root package name */
        public final float f2003a = 0;

        @Override // androidx.compose.foundation.layout.b.d, androidx.compose.foundation.layout.b.k
        public final float a() {
            return this.f2003a;
        }

        @Override // androidx.compose.foundation.layout.b.d
        public final void b(int i10, b2.b bVar, LayoutDirection layoutDirection, int[] iArr, int[] iArr2) {
            boolean z10;
            v7.g.f(bVar, "<this>");
            v7.g.f(iArr, "sizes");
            v7.g.f(layoutDirection, "layoutDirection");
            v7.g.f(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                i iVar = b.f1998a;
                z10 = false;
            } else {
                i iVar2 = b.f1998a;
                z10 = true;
            }
            b.a(i10, iArr, iArr2, z10);
        }

        @Override // androidx.compose.foundation.layout.b.k
        public final void c(b2.b bVar, int i10, int[] iArr, int[] iArr2) {
            v7.g.f(bVar, "<this>");
            v7.g.f(iArr, "sizes");
            v7.g.f(iArr2, "outPositions");
            b.a(i10, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Center";
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements d {
        @Override // androidx.compose.foundation.layout.b.d, androidx.compose.foundation.layout.b.k
        public final float a() {
            return 0;
        }

        @Override // androidx.compose.foundation.layout.b.d
        public final void b(int i10, b2.b bVar, LayoutDirection layoutDirection, int[] iArr, int[] iArr2) {
            v7.g.f(bVar, "<this>");
            v7.g.f(iArr, "sizes");
            v7.g.f(layoutDirection, "layoutDirection");
            v7.g.f(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                b.c(i10, iArr, iArr2, false);
            } else {
                b.b(iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#End";
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        float a();

        void b(int i10, b2.b bVar, LayoutDirection layoutDirection, int[] iArr, int[] iArr2);
    }

    /* loaded from: classes.dex */
    public static final class e implements d, k {

        /* renamed from: a  reason: collision with root package name */
        public final float f2004a = 0;

        @Override // androidx.compose.foundation.layout.b.d, androidx.compose.foundation.layout.b.k
        public final float a() {
            return this.f2004a;
        }

        @Override // androidx.compose.foundation.layout.b.d
        public final void b(int i10, b2.b bVar, LayoutDirection layoutDirection, int[] iArr, int[] iArr2) {
            boolean z10;
            v7.g.f(bVar, "<this>");
            v7.g.f(iArr, "sizes");
            v7.g.f(layoutDirection, "layoutDirection");
            v7.g.f(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                i iVar = b.f1998a;
                z10 = false;
            } else {
                i iVar2 = b.f1998a;
                z10 = true;
            }
            b.d(i10, iArr, iArr2, z10);
        }

        @Override // androidx.compose.foundation.layout.b.k
        public final void c(b2.b bVar, int i10, int[] iArr, int[] iArr2) {
            v7.g.f(bVar, "<this>");
            v7.g.f(iArr, "sizes");
            v7.g.f(iArr2, "outPositions");
            b.d(i10, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements d, k {

        /* renamed from: a  reason: collision with root package name */
        public final float f2005a = 0;

        @Override // androidx.compose.foundation.layout.b.d, androidx.compose.foundation.layout.b.k
        public final float a() {
            return this.f2005a;
        }

        @Override // androidx.compose.foundation.layout.b.d
        public final void b(int i10, b2.b bVar, LayoutDirection layoutDirection, int[] iArr, int[] iArr2) {
            boolean z10;
            v7.g.f(bVar, "<this>");
            v7.g.f(iArr, "sizes");
            v7.g.f(layoutDirection, "layoutDirection");
            v7.g.f(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                i iVar = b.f1998a;
                z10 = false;
            } else {
                i iVar2 = b.f1998a;
                z10 = true;
            }
            b.e(i10, iArr, iArr2, z10);
        }

        @Override // androidx.compose.foundation.layout.b.k
        public final void c(b2.b bVar, int i10, int[] iArr, int[] iArr2) {
            v7.g.f(bVar, "<this>");
            v7.g.f(iArr, "sizes");
            v7.g.f(iArr2, "outPositions");
            b.e(i10, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements d, k {

        /* renamed from: a  reason: collision with root package name */
        public final float f2006a = 0;

        @Override // androidx.compose.foundation.layout.b.d, androidx.compose.foundation.layout.b.k
        public final float a() {
            return this.f2006a;
        }

        @Override // androidx.compose.foundation.layout.b.d
        public final void b(int i10, b2.b bVar, LayoutDirection layoutDirection, int[] iArr, int[] iArr2) {
            boolean z10;
            v7.g.f(bVar, "<this>");
            v7.g.f(iArr, "sizes");
            v7.g.f(layoutDirection, "layoutDirection");
            v7.g.f(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                i iVar = b.f1998a;
                z10 = false;
            } else {
                i iVar2 = b.f1998a;
                z10 = true;
            }
            b.f(i10, iArr, iArr2, z10);
        }

        @Override // androidx.compose.foundation.layout.b.k
        public final void c(b2.b bVar, int i10, int[] iArr, int[] iArr2) {
            v7.g.f(bVar, "<this>");
            v7.g.f(iArr, "sizes");
            v7.g.f(iArr2, "outPositions");
            b.f(i10, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* loaded from: classes.dex */
    public static final class h implements d, k {

        /* renamed from: a  reason: collision with root package name */
        public final float f2007a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2008b;
        public final p<Integer, LayoutDirection, Integer> c;

        /* renamed from: d  reason: collision with root package name */
        public final float f2009d;

        public h() {
            throw null;
        }

        public h(float f10, p pVar) {
            this.f2007a = f10;
            this.f2008b = true;
            this.c = pVar;
            this.f2009d = f10;
        }

        @Override // androidx.compose.foundation.layout.b.d, androidx.compose.foundation.layout.b.k
        public final float a() {
            return this.f2009d;
        }

        @Override // androidx.compose.foundation.layout.b.d
        public final void b(int i10, b2.b bVar, LayoutDirection layoutDirection, int[] iArr, int[] iArr2) {
            int i11;
            int i12;
            v7.g.f(bVar, "<this>");
            v7.g.f(iArr, "sizes");
            v7.g.f(layoutDirection, "layoutDirection");
            v7.g.f(iArr2, "outPositions");
            if (iArr.length == 0) {
                return;
            }
            int a02 = bVar.a0(this.f2007a);
            boolean z10 = this.f2008b && layoutDirection == LayoutDirection.Rtl;
            i iVar = b.f1998a;
            if (z10) {
                i11 = 0;
                i12 = 0;
                for (int length = iArr.length - 1; -1 < length; length--) {
                    int i13 = iArr[length];
                    int min = Math.min(i11, i10 - i13);
                    iArr2[length] = min;
                    i12 = Math.min(a02, (i10 - min) - i13);
                    i11 = iArr2[length] + i13 + i12;
                }
            } else {
                int length2 = iArr.length;
                int i14 = 0;
                i11 = 0;
                i12 = 0;
                int i15 = 0;
                while (i14 < length2) {
                    int i16 = iArr[i14];
                    int min2 = Math.min(i11, i10 - i16);
                    iArr2[i15] = min2;
                    int min3 = Math.min(a02, (i10 - min2) - i16);
                    int i17 = iArr2[i15] + i16 + min3;
                    i14++;
                    i15++;
                    i12 = min3;
                    i11 = i17;
                }
            }
            int i18 = i11 - i12;
            p<Integer, LayoutDirection, Integer> pVar = this.c;
            if (pVar == null || i18 >= i10) {
                return;
            }
            int intValue = pVar.R(Integer.valueOf(i10 - i18), layoutDirection).intValue();
            int length3 = iArr2.length;
            for (int i19 = 0; i19 < length3; i19++) {
                iArr2[i19] = iArr2[i19] + intValue;
            }
        }

        @Override // androidx.compose.foundation.layout.b.k
        public final void c(b2.b bVar, int i10, int[] iArr, int[] iArr2) {
            v7.g.f(bVar, "<this>");
            v7.g.f(iArr, "sizes");
            v7.g.f(iArr2, "outPositions");
            b(i10, bVar, LayoutDirection.Ltr, iArr, iArr2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return b2.d.a(this.f2007a, hVar.f2007a) && this.f2008b == hVar.f2008b && v7.g.a(this.c, hVar.c);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode;
            int floatToIntBits = Float.floatToIntBits(this.f2007a) * 31;
            boolean z10 = this.f2008b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int i11 = (floatToIntBits + i10) * 31;
            p<Integer, LayoutDirection, Integer> pVar = this.c;
            if (pVar == null) {
                hashCode = 0;
            } else {
                hashCode = pVar.hashCode();
            }
            return i11 + hashCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2008b ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) b2.d.b(this.f2007a));
            sb.append(", ");
            sb.append(this.c);
            sb.append(')');
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class i implements d {
        @Override // androidx.compose.foundation.layout.b.d, androidx.compose.foundation.layout.b.k
        public final float a() {
            return 0;
        }

        @Override // androidx.compose.foundation.layout.b.d
        public final void b(int i10, b2.b bVar, LayoutDirection layoutDirection, int[] iArr, int[] iArr2) {
            v7.g.f(bVar, "<this>");
            v7.g.f(iArr, "sizes");
            v7.g.f(layoutDirection, "layoutDirection");
            v7.g.f(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                b.b(iArr, iArr2, false);
            } else {
                b.c(i10, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#Start";
        }
    }

    /* loaded from: classes.dex */
    public static final class j implements k {
        @Override // androidx.compose.foundation.layout.b.k
        public final float a() {
            return 0;
        }

        @Override // androidx.compose.foundation.layout.b.k
        public final void c(b2.b bVar, int i10, int[] iArr, int[] iArr2) {
            v7.g.f(bVar, "<this>");
            v7.g.f(iArr, "sizes");
            v7.g.f(iArr2, "outPositions");
            b.b(iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Top";
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        float a();

        void c(b2.b bVar, int i10, int[] iArr, int[] iArr2);
    }

    static {
        new g();
        f2002f = new f();
        new e();
    }

    public static void a(int i10, int[] iArr, int[] iArr2, boolean z10) {
        v7.g.f(iArr, "size");
        v7.g.f(iArr2, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f10 = (i10 - i12) / 2;
        if (z10) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i14 = iArr[length];
                iArr2[length] = m0.b.g1(f10);
                f10 += i14;
            }
            return;
        }
        int length2 = iArr.length;
        int i15 = 0;
        while (i11 < length2) {
            int i16 = iArr[i11];
            iArr2[i15] = m0.b.g1(f10);
            f10 += i16;
            i11++;
            i15++;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z10) {
        v7.g.f(iArr, "size");
        v7.g.f(iArr2, "outPosition");
        int i10 = 0;
        if (z10) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i11 = iArr[length];
                iArr2[length] = i10;
                i10 += i11;
            }
            return;
        }
        int length2 = iArr.length;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            int i14 = iArr[i10];
            iArr2[i12] = i13;
            i13 += i14;
            i10++;
            i12++;
        }
    }

    public static void c(int i10, int[] iArr, int[] iArr2, boolean z10) {
        v7.g.f(iArr, "size");
        v7.g.f(iArr2, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        int i14 = i10 - i12;
        if (z10) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i15 = iArr[length];
                iArr2[length] = i14;
                i14 += i15;
            }
            return;
        }
        int length2 = iArr.length;
        int i16 = 0;
        while (i11 < length2) {
            int i17 = iArr[i11];
            iArr2[i16] = i14;
            i14 += i17;
            i11++;
            i16++;
        }
    }

    public static void d(int i10, int[] iArr, int[] iArr2, boolean z10) {
        v7.g.f(iArr, "size");
        v7.g.f(iArr2, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = (iArr.length == 0) ^ true ? (i10 - i12) / iArr.length : 0.0f;
        float f10 = length / 2;
        if (z10) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = m0.b.g1(f10);
                f10 += i14 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = iArr[i11];
            iArr2[i15] = m0.b.g1(f10);
            f10 += i16 + length;
            i11++;
            i15++;
        }
    }

    public static void e(int i10, int[] iArr, int[] iArr2, boolean z10) {
        v7.g.f(iArr, "size");
        v7.g.f(iArr2, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f10 = 0.0f;
        float length = iArr.length > 1 ? (i10 - i12) / (iArr.length - 1) : 0.0f;
        if (z10) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = m0.b.g1(f10);
                f10 += i14 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = iArr[i11];
            iArr2[i15] = m0.b.g1(f10);
            f10 += i16 + length;
            i11++;
            i15++;
        }
    }

    public static void f(int i10, int[] iArr, int[] iArr2, boolean z10) {
        v7.g.f(iArr, "size");
        v7.g.f(iArr2, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = (i10 - i12) / (iArr.length + 1);
        if (z10) {
            float f10 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = m0.b.g1(f10);
                f10 += i14 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f11 = length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = iArr[i11];
            iArr2[i15] = m0.b.g1(f11);
            f11 += i16 + length;
            i11++;
            i15++;
        }
    }

    public static h g(float f10) {
        return new h(f10, Arrangement$spacedBy$1.f1885j);
    }
}
