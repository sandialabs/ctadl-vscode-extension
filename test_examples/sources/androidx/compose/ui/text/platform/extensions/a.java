package androidx.compose.ui.text.platform.extensions;

import a1.c;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import b2.b;
import b2.i;
import b2.j;
import java.util.ArrayList;
import java.util.Arrays;
import p1.a;
import p1.k;
import p1.p;
import s1.e;
import s1.l;
import v0.f0;
import v0.g0;
import v0.i0;
import v0.m;
import v0.r;
import v7.g;
import w1.f;

/* loaded from: classes.dex */
public final class a {
    public static final float a(long j2, float f10, b bVar) {
        long b5 = i.b(j2);
        if (j.a(b5, 4294967296L)) {
            return bVar.i0(j2);
        }
        if (j.a(b5, 8589934592L)) {
            return i.c(j2) * f10;
        }
        return Float.NaN;
    }

    public static final void b(SpannableString spannableString, long j2, int i10, int i11) {
        boolean z10;
        if (j2 != r.f18133g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f(spannableString, new BackgroundColorSpan(c.I1(j2)), i10, i11);
        }
    }

    public static final void c(SpannableString spannableString, long j2, int i10, int i11) {
        boolean z10;
        if (j2 != r.f18133g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f(spannableString, new ForegroundColorSpan(c.I1(j2)), i10, i11);
        }
    }

    public static final void d(SpannableString spannableString, long j2, b bVar, int i10, int i11) {
        g.f(bVar, "density");
        long b5 = i.b(j2);
        if (j.a(b5, 4294967296L)) {
            f(spannableString, new AbsoluteSizeSpan(m0.b.g1(bVar.i0(j2)), false), i10, i11);
        } else if (j.a(b5, 8589934592L)) {
            f(spannableString, new RelativeSizeSpan(i.c(j2)), i10, i11);
        }
    }

    public static final void e(SpannableString spannableString, w1.c cVar, int i10, int i11) {
        w1.b bVar;
        Object localeSpan;
        if (cVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = y1.a.f18786a.a(cVar);
            } else {
                if (cVar.isEmpty()) {
                    bVar = new w1.b(f.f18259a.a().get(0));
                } else {
                    bVar = cVar.f18257i.get(0);
                }
                localeSpan = new LocaleSpan(v8.b.L(bVar));
            }
            f(spannableString, localeSpan, i10, i11);
        }
    }

    public static final void f(Spannable spannable, Object obj, int i10, int i11) {
        g.f(spannable, "<this>");
        g.f(obj, "span");
        spannable.setSpan(obj, i10, i11, 33);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        r0.add(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028c A[LOOP:2: B:124:0x028a->B:125:0x028c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(SpannableString spannableString, p pVar, ArrayList arrayList, b bVar, u7.r rVar) {
        boolean z10;
        k kVar;
        int size;
        int i10;
        int size2;
        int i11;
        int i12;
        MetricAffectingSpan metricAffectingSpan;
        boolean z11;
        boolean z12;
        boolean z13;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size3 = arrayList.size();
        int i13 = 0;
        while (true) {
            boolean z14 = true;
            if (i13 >= size3) {
                break;
            }
            Object obj = arrayList.get(i13);
            a.C0207a c0207a = (a.C0207a) obj;
            if (!m0.b.w0((k) c0207a.f16645a) && ((k) c0207a.f16645a).f16674e == null) {
                z14 = false;
            }
            i13++;
        }
        k kVar2 = pVar.f16703a;
        if (!m0.b.w0(kVar2) && kVar2.f16674e == null) {
            z10 = false;
            if (!z10) {
                kVar = new k(0L, 0L, kVar2.c, kVar2.f16673d, kVar2.f16674e, kVar2.f16675f, null, 0L, null, null, null, 0L, null, null, 16323);
            } else {
                kVar = null;
            }
            SpannableExtensions_androidKt$setFontAttributes$1 spannableExtensions_androidKt$setFontAttributes$1 = new SpannableExtensions_androidKt$setFontAttributes$1(spannableString, rVar);
            if (arrayList2.size() > 1) {
                if (!arrayList2.isEmpty()) {
                    k kVar3 = (k) ((a.C0207a) arrayList2.get(0)).f16645a;
                    if (kVar != null) {
                        kVar3 = kVar.c(kVar3);
                    }
                    spannableExtensions_androidKt$setFontAttributes$1.O(kVar3, Integer.valueOf(((a.C0207a) arrayList2.get(0)).f16646b), Integer.valueOf(((a.C0207a) arrayList2.get(0)).c));
                }
            } else {
                int size4 = arrayList2.size();
                int i14 = size4 * 2;
                Integer[] numArr = new Integer[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    numArr[i15] = 0;
                }
                int size5 = arrayList2.size();
                for (int i16 = 0; i16 < size5; i16++) {
                    a.C0207a c0207a2 = (a.C0207a) arrayList2.get(i16);
                    numArr[i16] = Integer.valueOf(c0207a2.f16646b);
                    numArr[i16 + size4] = Integer.valueOf(c0207a2.c);
                }
                Integer[] numArr2 = numArr;
                if (numArr2.length > 1) {
                    Arrays.sort(numArr2);
                }
                int intValue = ((Number) kotlin.collections.b.l2(numArr)).intValue();
                for (int i17 = 0; i17 < i14; i17++) {
                    int intValue2 = numArr[i17].intValue();
                    if (intValue2 != intValue) {
                        int size6 = arrayList2.size();
                        k kVar4 = kVar;
                        for (int i18 = 0; i18 < size6; i18++) {
                            a.C0207a c0207a3 = (a.C0207a) arrayList2.get(i18);
                            int i19 = c0207a3.f16646b;
                            int i20 = c0207a3.c;
                            if (i19 != i20 && p1.b.b(intValue, intValue2, i19, i20)) {
                                k kVar5 = (k) c0207a3.f16645a;
                                if (kVar4 != null) {
                                    kVar5 = kVar4.c(kVar5);
                                }
                                kVar4 = kVar5;
                            }
                        }
                        if (kVar4 != null) {
                            spannableExtensions_androidKt$setFontAttributes$1.O(kVar4, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                        }
                        intValue = intValue2;
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            size = arrayList.size();
            for (i10 = 0; i10 < size; i10++) {
                a.C0207a c0207a4 = (a.C0207a) arrayList.get(i10);
                int i21 = c0207a4.f16646b;
                if (i21 >= 0 && i21 < spannableString.length() && (i12 = c0207a4.c) > i21 && i12 <= spannableString.length()) {
                    int i22 = c0207a4.f16646b;
                    int i23 = c0207a4.c;
                    k kVar6 = (k) c0207a4.f16645a;
                    a2.a aVar = kVar6.f16678i;
                    if (aVar != null) {
                        f(spannableString, new s1.a(aVar.f89a), i22, i23);
                    }
                    c(spannableString, kVar6.a(), i22, i23);
                    androidx.compose.ui.text.style.a aVar2 = kVar6.f16671a;
                    m d5 = aVar2.d();
                    float n = aVar2.n();
                    if (d5 != null) {
                        if (d5 instanceof i0) {
                            c(spannableString, ((i0) d5).f18118a, i22, i23);
                        } else if (d5 instanceof f0) {
                            f(spannableString, new z1.a((f0) d5, n), i22, i23);
                        }
                    }
                    a2.g gVar = kVar6.f16682m;
                    if (gVar != null) {
                        int i24 = gVar.f102a;
                        if ((1 | i24) == i24) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((2 | i24) == i24) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        f(spannableString, new l(z12, z13), i22, i23);
                    }
                    d(spannableString, kVar6.f16672b, bVar, i22, i23);
                    String str = kVar6.f16676g;
                    if (str != null) {
                        f(spannableString, new s1.b(str), i22, i23);
                    }
                    a2.i iVar = kVar6.f16679j;
                    if (iVar != null) {
                        f(spannableString, new ScaleXSpan(iVar.f104a), i22, i23);
                        f(spannableString, new s1.k(iVar.f105b), i22, i23);
                    }
                    e(spannableString, kVar6.f16680k, i22, i23);
                    b(spannableString, kVar6.f16681l, i22, i23);
                    g0 g0Var = kVar6.n;
                    if (g0Var != null) {
                        int I1 = c.I1(g0Var.f18113a);
                        long j2 = g0Var.f18114b;
                        float b5 = u0.c.b(j2);
                        float c = u0.c.c(j2);
                        float f10 = g0Var.c;
                        if (f10 == 0.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            f10 = Float.MIN_VALUE;
                        }
                        f(spannableString, new s1.j(I1, b5, c, f10), i22, i23);
                    }
                    long j10 = kVar6.f16677h;
                    long b10 = i.b(j10);
                    if (j.a(b10, 4294967296L)) {
                        metricAffectingSpan = new s1.f(bVar.i0(j10));
                    } else if (j.a(b10, 8589934592L)) {
                        metricAffectingSpan = new e(i.c(j10));
                    } else {
                        metricAffectingSpan = null;
                    }
                    if (metricAffectingSpan != null) {
                        arrayList3.add(new y1.b(i22, i23, metricAffectingSpan));
                    }
                }
            }
            size2 = arrayList3.size();
            for (i11 = 0; i11 < size2; i11++) {
                y1.b bVar2 = (y1.b) arrayList3.get(i11);
                f(spannableString, bVar2.f18787a, bVar2.f18788b, bVar2.c);
            }
        }
        z10 = true;
        if (!z10) {
        }
        SpannableExtensions_androidKt$setFontAttributes$1 spannableExtensions_androidKt$setFontAttributes$12 = new SpannableExtensions_androidKt$setFontAttributes$1(spannableString, rVar);
        if (arrayList2.size() > 1) {
        }
        ArrayList arrayList32 = new ArrayList();
        size = arrayList.size();
        while (i10 < size) {
        }
        size2 = arrayList32.size();
        while (i11 < size2) {
        }
    }
}
