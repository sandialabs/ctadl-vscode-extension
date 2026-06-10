package p1;

import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final m f16696a;

    /* renamed from: b  reason: collision with root package name */
    public final c f16697b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final float f16698d;

    /* renamed from: e  reason: collision with root package name */
    public final float f16699e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f16700f;

    public n(m mVar, c cVar, long j2) {
        float n;
        this.f16696a = mVar;
        this.f16697b = cVar;
        this.c = j2;
        ArrayList arrayList = cVar.f16655h;
        float f10 = 0.0f;
        if (arrayList.isEmpty()) {
            n = 0.0f;
        } else {
            n = ((e) arrayList.get(0)).f16656a.n();
        }
        this.f16698d = n;
        ArrayList arrayList2 = cVar.f16655h;
        if (!arrayList2.isEmpty()) {
            e eVar = (e) kotlin.collections.c.v2(arrayList2);
            f10 = eVar.f16660f + eVar.f16656a.k();
        }
        this.f16699e = f10;
        this.f16700f = cVar.f16654g;
    }

    public static int a(n nVar, int i10) {
        c cVar = nVar.f16697b;
        cVar.c(i10);
        ArrayList arrayList = cVar.f16655h;
        e eVar = (e) arrayList.get(v0.p.o(i10, arrayList));
        return eVar.f16656a.f(i10 - eVar.f16658d, false) + eVar.f16657b;
    }

    public final int b(int i10) {
        int n;
        c cVar = this.f16697b;
        int length = cVar.f16649a.f3995a.length();
        ArrayList arrayList = cVar.f16655h;
        if (i10 >= length) {
            n = a1.c.B0(arrayList);
        } else if (i10 < 0) {
            n = 0;
        } else {
            n = v0.p.n(i10, arrayList);
        }
        e eVar = (e) arrayList.get(n);
        d dVar = eVar.f16656a;
        int i11 = eVar.f16657b;
        return dVar.m(a1.c.c0(i10, i11, eVar.c) - i11) + eVar.f16658d;
    }

    public final int c(float f10) {
        int p10;
        c cVar = this.f16697b;
        ArrayList arrayList = cVar.f16655h;
        if (f10 <= 0.0f) {
            p10 = 0;
        } else if (f10 >= cVar.f16652e) {
            p10 = a1.c.B0(arrayList);
        } else {
            p10 = v0.p.p(arrayList, f10);
        }
        e eVar = (e) arrayList.get(p10);
        int i10 = eVar.c;
        int i11 = eVar.f16657b;
        if (i10 - i11 == 0) {
            return Math.max(0, i11 - 1);
        }
        return eVar.f16656a.l(f10 - eVar.f16660f) + eVar.f16658d;
    }

    public final int d(int i10) {
        c cVar = this.f16697b;
        cVar.c(i10);
        ArrayList arrayList = cVar.f16655h;
        e eVar = (e) arrayList.get(v0.p.o(i10, arrayList));
        return eVar.f16656a.e(i10 - eVar.f16658d) + eVar.f16657b;
    }

    public final float e(int i10) {
        c cVar = this.f16697b;
        cVar.c(i10);
        ArrayList arrayList = cVar.f16655h;
        e eVar = (e) arrayList.get(v0.p.o(i10, arrayList));
        return eVar.f16656a.j(i10 - eVar.f16658d) + eVar.f16660f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (v7.g.a(this.f16696a, nVar.f16696a) && v7.g.a(this.f16697b, nVar.f16697b) && b2.h.a(this.c, nVar.c)) {
                if (this.f16698d == nVar.f16698d) {
                    return ((this.f16699e > nVar.f16699e ? 1 : (this.f16699e == nVar.f16699e ? 0 : -1)) == 0) && v7.g.a(this.f16700f, nVar.f16700f);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int f(long j2) {
        int p10;
        c cVar = this.f16697b;
        cVar.getClass();
        float c = u0.c.c(j2);
        ArrayList arrayList = cVar.f16655h;
        if (c <= 0.0f) {
            p10 = 0;
        } else if (u0.c.c(j2) >= cVar.f16652e) {
            p10 = a1.c.B0(arrayList);
        } else {
            p10 = v0.p.p(arrayList, u0.c.c(j2));
        }
        e eVar = (e) arrayList.get(p10);
        int i10 = eVar.c;
        int i11 = eVar.f16657b;
        if (i10 - i11 == 0) {
            return Math.max(0, i11 - 1);
        }
        return eVar.f16656a.o(a1.c.s(u0.c.b(j2), u0.c.c(j2) - eVar.f16660f)) + i11;
    }

    public final ResolvedTextDirection g(int i10) {
        boolean z10;
        int n;
        c cVar = this.f16697b;
        MultiParagraphIntrinsics multiParagraphIntrinsics = cVar.f16649a;
        if (i10 >= 0 && i10 <= multiParagraphIntrinsics.f3995a.f16641i.length()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int length = multiParagraphIntrinsics.f3995a.length();
            ArrayList arrayList = cVar.f16655h;
            if (i10 == length) {
                n = a1.c.B0(arrayList);
            } else {
                n = v0.p.n(i10, arrayList);
            }
            e eVar = (e) arrayList.get(n);
            d dVar = eVar.f16656a;
            int i11 = eVar.f16657b;
            return dVar.i(a1.c.c0(i10, i11, eVar.c) - i11);
        }
        StringBuilder o10 = a4.b.o("offset(", i10, ") is out of bounds [0, ");
        o10.append(multiParagraphIntrinsics.f3995a.length());
        o10.append(']');
        throw new IllegalArgumentException(o10.toString().toString());
    }

    public final int hashCode() {
        int hashCode = this.f16697b.hashCode();
        long j2 = this.c;
        float f10 = this.f16698d;
        return this.f16700f.hashCode() + androidx.activity.e.e(this.f16699e, androidx.activity.e.e(f10, (((int) (j2 ^ (j2 >>> 32))) + ((hashCode + (this.f16696a.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f16696a + ", multiParagraph=" + this.f16697b + ", size=" + ((Object) b2.h.c(this.c)) + ", firstBaseline=" + this.f16698d + ", lastBaseline=" + this.f16699e + ", placeholderRects=" + this.f16700f + ')';
    }
}
