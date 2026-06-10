package androidx.compose.ui.text.platform;

import a2.i;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.LeadingMarginSpan;
import b2.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p1.a;
import p1.g;
import p1.h;
import p1.j;
import p1.k;
import p1.p;
import u1.e;
import u1.m;
import v0.r;
import w1.c;
import w1.d;
import w1.f;
import y2.g;

/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f4149a;

    /* renamed from: b  reason: collision with root package name */
    public final p f4150b;
    public final List<a.C0207a<k>> c;

    /* renamed from: d  reason: collision with root package name */
    public final List<a.C0207a<j>> f4151d;

    /* renamed from: e  reason: collision with root package name */
    public final e.a f4152e;

    /* renamed from: f  reason: collision with root package name */
    public final b f4153f;

    /* renamed from: g  reason: collision with root package name */
    public final x1.a f4154g;

    /* renamed from: h  reason: collision with root package name */
    public final CharSequence f4155h;

    /* renamed from: i  reason: collision with root package name */
    public final androidx.compose.ui.text.android.a f4156i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f4157j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4158k;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
        if (r7 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
        if (r7 == 1) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(p pVar, e.a aVar, b bVar, String str, List list, ArrayList arrayList) {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Locale locale;
        long b5;
        c cVar;
        long j2;
        String str2;
        i iVar;
        long j10;
        long j11;
        long j12;
        a2.a aVar2;
        boolean a10;
        a2.a aVar3;
        a2.g gVar;
        a2.g gVar2;
        a2.g gVar3;
        String str3;
        float textSize;
        List<a.C0207a<j>> list2;
        b bVar2;
        boolean isEmpty;
        h hVar;
        float a11;
        int i11;
        a2.j jVar;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j13;
        float f10;
        float f11;
        boolean z15;
        w1.b bVar3;
        int i12;
        int i13;
        a aVar4 = this;
        v7.g.f(aVar, "fontFamilyResolver");
        v7.g.f(bVar, "density");
        aVar4.f4149a = str;
        aVar4.f4150b = pVar;
        aVar4.c = list;
        aVar4.f4151d = arrayList;
        aVar4.f4152e = aVar;
        aVar4.f4153f = bVar;
        x1.a aVar5 = new x1.a(bVar.getDensity());
        aVar4.f4154g = aVar5;
        ArrayList arrayList4 = new ArrayList();
        aVar4.f4157j = arrayList4;
        a2.h hVar2 = pVar.f16704b.f16665b;
        k kVar = pVar.f16703a;
        c cVar2 = kVar.f16680k;
        int i14 = 3;
        if (hVar2 != null) {
            i10 = hVar2.f103a;
        } else {
            i10 = 3;
        }
        if (i10 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (i10 == 5) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (i10 == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    i14 = 0;
                } else {
                    if (i10 == 2) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        i14 = 1;
                    } else {
                        if (i10 == 3) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            if (cVar2 != null) {
                                d dVar = cVar2.f18257i.get(0).f18256a;
                                v7.g.d(dVar, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
                                locale = ((w1.a) dVar).f18255a;
                            }
                            locale = Locale.getDefault();
                            int i15 = y2.g.f18809a;
                            int a12 = g.a.a(locale);
                            if (a12 != 0) {
                            }
                        } else {
                            throw new IllegalStateException("Invalid TextDirection.".toString());
                        }
                    }
                }
            }
            aVar4.f4158k = i14;
            AndroidParagraphIntrinsics$resolveTypeface$1 androidParagraphIntrinsics$resolveTypeface$1 = new AndroidParagraphIntrinsics$resolveTypeface$1(aVar4);
            long j14 = kVar.f16672b;
            b5 = b2.i.b(j14);
            if (!b2.j.a(b5, 4294967296L)) {
                aVar5.setTextSize(bVar.i0(j14));
            } else if (b2.j.a(b5, 8589934592L)) {
                aVar5.setTextSize(b2.i.c(j14) * aVar5.getTextSize());
            }
            if (m0.b.w0(kVar)) {
                m mVar = kVar.c;
                mVar = mVar == null ? m.n : mVar;
                u1.i iVar2 = kVar.f16673d;
                if (iVar2 != null) {
                    i12 = iVar2.f17748a;
                } else {
                    i12 = 0;
                }
                u1.j jVar2 = kVar.f16674e;
                if (jVar2 != null) {
                    i13 = jVar2.f17749a;
                } else {
                    i13 = 1;
                }
                v7.g.f(mVar, "fontWeight");
                x1.b bVar4 = new x1.b(aVar.a(kVar.f16675f, mVar, i12, i13));
                arrayList4.add(bVar4);
                Object obj = bVar4.f18571b;
                v7.g.d(obj, "null cannot be cast to non-null type android.graphics.Typeface");
                aVar5.setTypeface((Typeface) obj);
            }
            cVar = kVar.f16680k;
            if (cVar != null) {
                List<d> a13 = f.f18259a.a();
                ArrayList arrayList5 = new ArrayList(a13.size());
                int size = a13.size();
                for (int i16 = 0; i16 < size; i16++) {
                    arrayList5.add(new w1.b(a13.get(i16)));
                }
                if (!v7.g.a(cVar, new c(arrayList5))) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        y1.a.f18786a.b(aVar5, cVar);
                    } else {
                        if (cVar.isEmpty()) {
                            bVar3 = new w1.b(f.f18259a.a().get(0));
                        } else {
                            bVar3 = cVar.f18257i.get(0);
                        }
                        aVar5.setTextLocale(v8.b.L(bVar3));
                    }
                }
            }
            j2 = kVar.f16677h;
            if (b2.j.a(b2.i.b(j2), 8589934592L)) {
                aVar5.setLetterSpacing(b2.i.c(j2));
            }
            str2 = kVar.f16676g;
            if (str2 != null && !v7.g.a(str2, "")) {
                aVar5.setFontFeatureSettings(str2);
            }
            iVar = kVar.f16679j;
            if (iVar != null && !v7.g.a(iVar, i.c)) {
                aVar5.setTextScaleX(aVar5.getTextScaleX() * iVar.f104a);
                aVar5.setTextSkewX(aVar5.getTextSkewX() + iVar.f105b);
            }
            aVar5.b(kVar.a());
            androidx.compose.ui.text.style.a aVar6 = kVar.f16671a;
            aVar5.a(aVar6.d(), u0.f.c, aVar6.n());
            aVar5.c(kVar.n);
            if (b2.j.a(b2.i.b(j2), 4294967296L)) {
                if (b2.i.c(j2) == 0.0f) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    long j15 = j2;
                    j10 = r.f18132f;
                    j11 = kVar.f16681l;
                    if (r.c(j11, j10)) {
                        j12 = r.f18133g;
                    } else {
                        j12 = j11;
                    }
                    aVar2 = kVar.f16678i;
                    if (aVar2 == null) {
                        a10 = false;
                    } else {
                        a10 = v7.g.a(Float.valueOf(aVar2.f89a), Float.valueOf(0.0f));
                    }
                    if (a10) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    gVar = a2.g.f100b;
                    gVar2 = kVar.f16682m;
                    if (!v7.g.a(gVar2, gVar)) {
                        gVar3 = gVar2;
                    } else {
                        gVar3 = null;
                    }
                    k kVar2 = new k(0L, 0L, null, null, null, null, null, j15, aVar3, null, null, j12, gVar3, null, 9855);
                    str3 = aVar4.f4149a;
                    textSize = aVar4.f4154g.getTextSize();
                    p pVar2 = aVar4.f4150b;
                    ArrayList z22 = kotlin.collections.c.z2(aVar4.c, a1.c.N0(new a.C0207a(0, aVar4.f4149a.length(), kVar2)));
                    list2 = aVar4.f4151d;
                    bVar2 = aVar4.f4153f;
                    v7.g.f(str3, "text");
                    v7.g.f(pVar2, "contextTextStyle");
                    v7.g.f(list2, "placeholders");
                    v7.g.f(bVar2, "density");
                    isEmpty = z22.isEmpty();
                    hVar = pVar2.f16704b;
                    if (isEmpty || !list2.isEmpty() || !v7.g.a(hVar.f16666d, a2.j.c) || !a1.b.n0(hVar.c)) {
                        SpannableString spannableString = new SpannableString(str3);
                        hVar.getClass();
                        a11 = androidx.compose.ui.text.platform.extensions.a.a(hVar.c, textSize, bVar2);
                        if (!Float.isNaN(a11)) {
                            i11 = 0;
                            androidx.compose.ui.text.platform.extensions.a.f(spannableString, new s1.g(a11), 0, spannableString.length());
                        } else {
                            i11 = 0;
                        }
                        jVar = hVar.f16666d;
                        if (jVar != null) {
                            long b02 = a1.b.b0(i11);
                            long j16 = jVar.f106a;
                            boolean a14 = b2.i.a(j16, b02);
                            long j17 = jVar.f107b;
                            if ((!a14 || !b2.i.a(j17, a1.b.b0(i11))) && !a1.b.n0(j16) && !a1.b.n0(j17)) {
                                long b10 = b2.i.b(j16);
                                arrayList3 = z22;
                                if (b2.j.a(b10, 4294967296L)) {
                                    f10 = bVar2.i0(j16);
                                    j13 = 8589934592L;
                                } else {
                                    j13 = 8589934592L;
                                    if (b2.j.a(b10, 8589934592L)) {
                                        f10 = b2.i.c(j16) * textSize;
                                    } else {
                                        f10 = 0.0f;
                                    }
                                }
                                long b11 = b2.i.b(j17);
                                if (b2.j.a(b11, 4294967296L)) {
                                    f11 = bVar2.i0(j17);
                                } else if (b2.j.a(b11, j13)) {
                                    f11 = b2.i.c(j17) * textSize;
                                } else {
                                    f11 = 0.0f;
                                }
                                androidx.compose.ui.text.platform.extensions.a.f(spannableString, new LeadingMarginSpan.Standard((int) Math.ceil(f10), (int) Math.ceil(f11)), 0, spannableString.length());
                                arrayList2 = arrayList3;
                            }
                            arrayList3 = z22;
                            arrayList2 = arrayList3;
                        } else {
                            arrayList2 = z22;
                        }
                        androidx.compose.ui.text.platform.extensions.a.g(spannableString, pVar2, arrayList2, bVar2, androidParagraphIntrinsics$resolveTypeface$1);
                        if (list2.size() <= 0) {
                            aVar4 = this;
                            str3 = spannableString;
                        } else {
                            list2.get(0).f16645a.getClass();
                            b2.i.c(0L);
                            ma.i.A();
                            b2.i.c(0L);
                            ma.i.A();
                            bVar2.y();
                            bVar2.getDensity();
                            throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
                        }
                    }
                    aVar4.f4155h = str3;
                    aVar4.f4156i = new androidx.compose.ui.text.android.a(aVar4.f4158k, aVar4.f4154g, str3);
                    return;
                }
            }
            j2 = b2.i.c;
            long j152 = j2;
            j10 = r.f18132f;
            j11 = kVar.f16681l;
            if (r.c(j11, j10)) {
            }
            aVar2 = kVar.f16678i;
            if (aVar2 == null) {
            }
            if (a10) {
            }
            gVar = a2.g.f100b;
            gVar2 = kVar.f16682m;
            if (!v7.g.a(gVar2, gVar)) {
            }
            k kVar22 = new k(0L, 0L, null, null, null, null, null, j152, aVar3, null, null, j12, gVar3, null, 9855);
            str3 = aVar4.f4149a;
            textSize = aVar4.f4154g.getTextSize();
            p pVar22 = aVar4.f4150b;
            ArrayList z222 = kotlin.collections.c.z2(aVar4.c, a1.c.N0(new a.C0207a(0, aVar4.f4149a.length(), kVar22)));
            list2 = aVar4.f4151d;
            bVar2 = aVar4.f4153f;
            v7.g.f(str3, "text");
            v7.g.f(pVar22, "contextTextStyle");
            v7.g.f(list2, "placeholders");
            v7.g.f(bVar2, "density");
            isEmpty = z222.isEmpty();
            hVar = pVar22.f16704b;
            if (isEmpty) {
            }
            SpannableString spannableString2 = new SpannableString(str3);
            hVar.getClass();
            a11 = androidx.compose.ui.text.platform.extensions.a.a(hVar.c, textSize, bVar2);
            if (!Float.isNaN(a11)) {
            }
            jVar = hVar.f16666d;
            if (jVar != null) {
            }
            androidx.compose.ui.text.platform.extensions.a.g(spannableString2, pVar22, arrayList2, bVar2, androidParagraphIntrinsics$resolveTypeface$1);
            if (list2.size() <= 0) {
            }
        }
        i14 = 2;
        aVar4.f4158k = i14;
        AndroidParagraphIntrinsics$resolveTypeface$1 androidParagraphIntrinsics$resolveTypeface$12 = new AndroidParagraphIntrinsics$resolveTypeface$1(aVar4);
        long j142 = kVar.f16672b;
        b5 = b2.i.b(j142);
        if (!b2.j.a(b5, 4294967296L)) {
        }
        if (m0.b.w0(kVar)) {
        }
        cVar = kVar.f16680k;
        if (cVar != null) {
        }
        j2 = kVar.f16677h;
        if (b2.j.a(b2.i.b(j2), 8589934592L)) {
        }
        str2 = kVar.f16676g;
        if (str2 != null) {
            aVar5.setFontFeatureSettings(str2);
        }
        iVar = kVar.f16679j;
        if (iVar != null) {
            aVar5.setTextScaleX(aVar5.getTextScaleX() * iVar.f104a);
            aVar5.setTextSkewX(aVar5.getTextSkewX() + iVar.f105b);
        }
        aVar5.b(kVar.a());
        androidx.compose.ui.text.style.a aVar62 = kVar.f16671a;
        aVar5.a(aVar62.d(), u0.f.c, aVar62.n());
        aVar5.c(kVar.n);
        if (b2.j.a(b2.i.b(j2), 4294967296L)) {
        }
        j2 = b2.i.c;
        long j1522 = j2;
        j10 = r.f18132f;
        j11 = kVar.f16681l;
        if (r.c(j11, j10)) {
        }
        aVar2 = kVar.f16678i;
        if (aVar2 == null) {
        }
        if (a10) {
        }
        gVar = a2.g.f100b;
        gVar2 = kVar.f16682m;
        if (!v7.g.a(gVar2, gVar)) {
        }
        k kVar222 = new k(0L, 0L, null, null, null, null, null, j1522, aVar3, null, null, j12, gVar3, null, 9855);
        str3 = aVar4.f4149a;
        textSize = aVar4.f4154g.getTextSize();
        p pVar222 = aVar4.f4150b;
        ArrayList z2222 = kotlin.collections.c.z2(aVar4.c, a1.c.N0(new a.C0207a(0, aVar4.f4149a.length(), kVar222)));
        list2 = aVar4.f4151d;
        bVar2 = aVar4.f4153f;
        v7.g.f(str3, "text");
        v7.g.f(pVar222, "contextTextStyle");
        v7.g.f(list2, "placeholders");
        v7.g.f(bVar2, "density");
        isEmpty = z2222.isEmpty();
        hVar = pVar222.f16704b;
        if (isEmpty) {
        }
        SpannableString spannableString22 = new SpannableString(str3);
        hVar.getClass();
        a11 = androidx.compose.ui.text.platform.extensions.a.a(hVar.c, textSize, bVar2);
        if (!Float.isNaN(a11)) {
        }
        jVar = hVar.f16666d;
        if (jVar != null) {
        }
        androidx.compose.ui.text.platform.extensions.a.g(spannableString22, pVar222, arrayList2, bVar2, androidParagraphIntrinsics$resolveTypeface$12);
        if (list2.size() <= 0) {
        }
    }

    @Override // p1.g
    public final float a() {
        return ((Number) this.f4156i.f4067b.getValue()).floatValue();
    }

    @Override // p1.g
    public final boolean b() {
        boolean z10;
        ArrayList arrayList = this.f4157j;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            x1.b bVar = (x1.b) arrayList.get(i10);
            if (bVar.f18570a.getValue() != bVar.f18571b) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // p1.g
    public final float c() {
        return ((Number) this.f4156i.c.getValue()).floatValue();
    }
}
