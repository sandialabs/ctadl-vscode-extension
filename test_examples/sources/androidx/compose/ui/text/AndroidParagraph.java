package androidx.compose.ui.text;

import a2.d;
import a2.f;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.ui.text.android.b;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import b2.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import p1.d;
import p1.h;
import p1.k;
import p1.p;
import q1.q;
import s1.c;
import v0.g0;
import v0.m;
import v0.o;
import v7.g;

/* loaded from: classes.dex */
public final class AndroidParagraph implements d {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.compose.ui.text.platform.a f3984a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3985b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final b f3986d;

    /* renamed from: e  reason: collision with root package name */
    public final CharSequence f3987e;

    /* renamed from: f  reason: collision with root package name */
    public final List<u0.d> f3988f;

    /* JADX WARN: Code restructure failed: missing block: B:217:0x0286, code lost:
        if ((r0.length == 0) != false) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x016b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x028e A[LOOP:1: B:220:0x028c->B:221:0x028e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0105  */
    /* JADX WARN: Type inference failed for: r0v45, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AndroidParagraph(androidx.compose.ui.text.platform.a aVar, int i10, boolean z10, long j2) {
        boolean z11;
        f fVar;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i11;
        int i12;
        a1.b bVar;
        a1.b bVar2;
        int i13;
        a2.d dVar;
        d.a aVar2;
        boolean z17;
        boolean z18;
        boolean z19;
        int i14;
        d.b bVar3;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        int i15;
        d.c cVar;
        boolean z24;
        boolean z25;
        int i16;
        TextUtils.TruncateAt truncateAt;
        b p10;
        z1.a[] aVarArr;
        CharSequence charSequence;
        List<u0.d> list;
        u0.d dVar2;
        float f10;
        int i17;
        int i18;
        f fVar2;
        this.f3984a = aVar;
        this.f3985b = i10;
        this.c = j2;
        if (!(b2.a.g(j2) == 0 && b2.a.h(j2) == 0)) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
        }
        p pVar = aVar.f4150b;
        if (z10 && !i.a(pVar.f16703a.f16677h, a1.b.b0(0)) && !i.a(pVar.f16703a.f16677h, i.c) && (fVar2 = pVar.f16704b.f16664a) != null) {
            int i19 = fVar2.f99a;
            if (!(i19 == 5)) {
                if (!(i19 == 4)) {
                    z11 = true;
                    CharSequence charSequence2 = aVar.f4155h;
                    SpannableString spannableString = charSequence2;
                    if (z11) {
                        if (charSequence2.length() == 0) {
                            spannableString = charSequence2;
                        } else {
                            SpannableString spannableString2 = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : new SpannableString(charSequence2);
                            androidx.compose.ui.text.platform.extensions.a.f(spannableString2, new c(), spannableString2.length() - 1, spannableString2.length() - 1);
                            spannableString = spannableString2;
                        }
                    }
                    this.f3987e = spannableString;
                    h hVar = pVar.f16704b;
                    fVar = hVar.f16664a;
                    if (fVar != null && fVar.f99a == 1) {
                        z12 = true;
                        if (z12) {
                            if (fVar != null && fVar.f99a == 2) {
                                z13 = true;
                                if (z13) {
                                    if (fVar != null && fVar.f99a == 3) {
                                        z14 = true;
                                        if (z14) {
                                            if (fVar != null && fVar.f99a == 5) {
                                                z15 = true;
                                                if (!z15) {
                                                    if (fVar != null && fVar.f99a == 6) {
                                                        z16 = true;
                                                        if (z16) {
                                                            i11 = 1;
                                                        }
                                                    }
                                                    z16 = false;
                                                    if (z16) {
                                                    }
                                                }
                                                i11 = 0;
                                            }
                                            z15 = false;
                                            if (!z15) {
                                            }
                                            i11 = 0;
                                        } else {
                                            i11 = 2;
                                        }
                                    }
                                    z14 = false;
                                    if (z14) {
                                    }
                                } else {
                                    i11 = 4;
                                }
                            }
                            z13 = false;
                            if (z13) {
                            }
                        } else {
                            i11 = 3;
                        }
                        if (fVar != null) {
                            i12 = 0;
                        } else {
                            i12 = fVar.f99a == 4 ? 1 : 0;
                        }
                        bVar = a1.b.f25f;
                        bVar2 = hVar.f16668f;
                        if (g.a(bVar2, bVar)) {
                            g.a(bVar2, a1.b.f23e);
                            i13 = 0;
                        } else {
                            i13 = Build.VERSION.SDK_INT <= 32 ? 1 : 3;
                        }
                        dVar = pVar.f16704b.f16667e;
                        aVar2 = dVar == null ? new d.a(dVar.f94a) : null;
                        if (aVar2 != null && aVar2.f96a == 1) {
                            z17 = true;
                            if (!z17) {
                                if (aVar2 != null && aVar2.f96a == 2) {
                                    z18 = true;
                                    if (z18) {
                                        if (aVar2 != null && aVar2.f96a == 3) {
                                            z19 = true;
                                            if (z19) {
                                                i14 = 2;
                                            }
                                        }
                                        z19 = false;
                                        if (z19) {
                                        }
                                    } else {
                                        i14 = 1;
                                    }
                                    bVar3 = dVar == null ? new d.b(dVar.f95b) : null;
                                    if (bVar3 != null && bVar3.f97a == 1) {
                                        z20 = true;
                                        if (!z20) {
                                            if (bVar3 != null && bVar3.f97a == 2) {
                                                z21 = true;
                                                if (z21) {
                                                    if (bVar3 != null && bVar3.f97a == 3) {
                                                        z22 = true;
                                                        if (z22) {
                                                            if (bVar3 != null && bVar3.f97a == 4) {
                                                                z23 = true;
                                                                if (z23) {
                                                                    i15 = 3;
                                                                }
                                                            }
                                                            z23 = false;
                                                            if (z23) {
                                                            }
                                                        } else {
                                                            i15 = 2;
                                                        }
                                                    }
                                                    z22 = false;
                                                    if (z22) {
                                                    }
                                                } else {
                                                    i15 = 1;
                                                }
                                                cVar = dVar == null ? new d.c(dVar.c) : null;
                                                if (cVar != null && cVar.f98a == 1) {
                                                    z24 = true;
                                                    if (!z24) {
                                                        if (cVar != null && cVar.f98a == 2) {
                                                            z25 = true;
                                                            if (z25) {
                                                                i16 = 1;
                                                                truncateAt = z10 ? TextUtils.TruncateAt.END : null;
                                                                p10 = p(i11, i12, truncateAt, i10, i13, i14, i15, i16);
                                                                if (z10 && p10.a() > b2.a.e(j2) && i10 > 1) {
                                                                    int e10 = b2.a.e(j2);
                                                                    i17 = 0;
                                                                    while (true) {
                                                                        i18 = p10.f4071e;
                                                                        if (i17 < i18) {
                                                                            i17 = i18;
                                                                            break;
                                                                        } else if (p10.c(i17) > e10) {
                                                                            break;
                                                                        } else {
                                                                            i17++;
                                                                        }
                                                                    }
                                                                    if (i17 >= 0 && i17 != this.f3985b) {
                                                                        p10 = p(i11, i12, truncateAt, i17 >= 1 ? 1 : i17, i13, i14, i15, i16);
                                                                    }
                                                                }
                                                                this.f3986d = p10;
                                                                x1.a aVar3 = this.f3984a.f4154g;
                                                                k kVar = pVar.f16703a;
                                                                aVar3.a(kVar.f16671a.d(), a1.c.v(b(), a()), kVar.f16671a.n());
                                                                if (p10.h() instanceof Spanned) {
                                                                    aVarArr = (z1.a[]) ((Spanned) p10.h()).getSpans(0, p10.h().length(), z1.a.class);
                                                                    g.e(aVarArr, "brushSpans");
                                                                }
                                                                aVarArr = new z1.a[0];
                                                                for (z1.a aVar4 : aVarArr) {
                                                                    aVar4.f19112k = new u0.f(a1.c.v(b(), a()));
                                                                }
                                                                charSequence = this.f3987e;
                                                                if (!(charSequence instanceof Spanned)) {
                                                                    list = EmptyList.f12981i;
                                                                } else {
                                                                    Object[] spans = ((Spanned) charSequence).getSpans(0, charSequence.length(), s1.i.class);
                                                                    g.e(spans, "getSpans(0, length, PlaceholderSpan::class.java)");
                                                                    ArrayList arrayList = new ArrayList(spans.length);
                                                                    for (Object obj : spans) {
                                                                        s1.i iVar = (s1.i) obj;
                                                                        Spanned spanned = (Spanned) charSequence;
                                                                        int spanStart = spanned.getSpanStart(iVar);
                                                                        int spanEnd = spanned.getSpanEnd(iVar);
                                                                        int d5 = this.f3986d.d(spanStart);
                                                                        boolean z26 = d5 >= this.f3985b;
                                                                        boolean z27 = this.f3986d.f4070d.getEllipsisCount(d5) > 0 && spanEnd > this.f3986d.f4070d.getEllipsisStart(d5);
                                                                        Layout layout = this.f3986d.f4070d;
                                                                        boolean z28 = spanEnd > (layout.getEllipsisStart(d5) == 0 ? layout.getLineEnd(d5) : layout.getText().length());
                                                                        if (!z27 && !z28 && !z26) {
                                                                            int ordinal = (this.f3986d.f4070d.isRtlCharAt(spanStart) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr).ordinal();
                                                                            if (ordinal == 0) {
                                                                                f10 = this.f3986d.f(spanStart, false);
                                                                            } else if (ordinal != 1) {
                                                                                throw new NoWhenBranchMatchedException();
                                                                            } else {
                                                                                f10 = this.f3986d.f(spanStart, false) - iVar.c();
                                                                            }
                                                                            float b5 = this.f3986d.b(d5) - iVar.b();
                                                                            dVar2 = new u0.d(f10, b5, iVar.c() + f10, iVar.b() + b5);
                                                                            arrayList.add(dVar2);
                                                                        }
                                                                        dVar2 = null;
                                                                        arrayList.add(dVar2);
                                                                    }
                                                                    list = arrayList;
                                                                }
                                                                this.f3988f = list;
                                                                kotlin.a.a(LazyThreadSafetyMode.NONE, new AndroidParagraph$wordBoundary$2(this));
                                                            }
                                                        }
                                                        z25 = false;
                                                        if (z25) {
                                                        }
                                                    }
                                                    i16 = 0;
                                                    if (z10) {
                                                    }
                                                    p10 = p(i11, i12, truncateAt, i10, i13, i14, i15, i16);
                                                    if (z10) {
                                                        int e102 = b2.a.e(j2);
                                                        i17 = 0;
                                                        while (true) {
                                                            i18 = p10.f4071e;
                                                            if (i17 < i18) {
                                                            }
                                                            i17++;
                                                        }
                                                        if (i17 >= 0) {
                                                            p10 = p(i11, i12, truncateAt, i17 >= 1 ? 1 : i17, i13, i14, i15, i16);
                                                        }
                                                    }
                                                    this.f3986d = p10;
                                                    x1.a aVar32 = this.f3984a.f4154g;
                                                    k kVar2 = pVar.f16703a;
                                                    aVar32.a(kVar2.f16671a.d(), a1.c.v(b(), a()), kVar2.f16671a.n());
                                                    if (p10.h() instanceof Spanned) {
                                                    }
                                                    aVarArr = new z1.a[0];
                                                    while (r2 < r1) {
                                                    }
                                                    charSequence = this.f3987e;
                                                    if (!(charSequence instanceof Spanned)) {
                                                    }
                                                    this.f3988f = list;
                                                    kotlin.a.a(LazyThreadSafetyMode.NONE, new AndroidParagraph$wordBoundary$2(this));
                                                }
                                                z24 = false;
                                                if (!z24) {
                                                }
                                                i16 = 0;
                                                if (z10) {
                                                }
                                                p10 = p(i11, i12, truncateAt, i10, i13, i14, i15, i16);
                                                if (z10) {
                                                }
                                                this.f3986d = p10;
                                                x1.a aVar322 = this.f3984a.f4154g;
                                                k kVar22 = pVar.f16703a;
                                                aVar322.a(kVar22.f16671a.d(), a1.c.v(b(), a()), kVar22.f16671a.n());
                                                if (p10.h() instanceof Spanned) {
                                                }
                                                aVarArr = new z1.a[0];
                                                while (r2 < r1) {
                                                }
                                                charSequence = this.f3987e;
                                                if (!(charSequence instanceof Spanned)) {
                                                }
                                                this.f3988f = list;
                                                kotlin.a.a(LazyThreadSafetyMode.NONE, new AndroidParagraph$wordBoundary$2(this));
                                            }
                                            z21 = false;
                                            if (z21) {
                                            }
                                            if (dVar == null) {
                                            }
                                            if (cVar != null) {
                                                z24 = true;
                                                if (!z24) {
                                                }
                                                i16 = 0;
                                                if (z10) {
                                                }
                                                p10 = p(i11, i12, truncateAt, i10, i13, i14, i15, i16);
                                                if (z10) {
                                                }
                                                this.f3986d = p10;
                                                x1.a aVar3222 = this.f3984a.f4154g;
                                                k kVar222 = pVar.f16703a;
                                                aVar3222.a(kVar222.f16671a.d(), a1.c.v(b(), a()), kVar222.f16671a.n());
                                                if (p10.h() instanceof Spanned) {
                                                }
                                                aVarArr = new z1.a[0];
                                                while (r2 < r1) {
                                                }
                                                charSequence = this.f3987e;
                                                if (!(charSequence instanceof Spanned)) {
                                                }
                                                this.f3988f = list;
                                                kotlin.a.a(LazyThreadSafetyMode.NONE, new AndroidParagraph$wordBoundary$2(this));
                                            }
                                            z24 = false;
                                            if (!z24) {
                                            }
                                            i16 = 0;
                                            if (z10) {
                                            }
                                            p10 = p(i11, i12, truncateAt, i10, i13, i14, i15, i16);
                                            if (z10) {
                                            }
                                            this.f3986d = p10;
                                            x1.a aVar32222 = this.f3984a.f4154g;
                                            k kVar2222 = pVar.f16703a;
                                            aVar32222.a(kVar2222.f16671a.d(), a1.c.v(b(), a()), kVar2222.f16671a.n());
                                            if (p10.h() instanceof Spanned) {
                                            }
                                            aVarArr = new z1.a[0];
                                            while (r2 < r1) {
                                            }
                                            charSequence = this.f3987e;
                                            if (!(charSequence instanceof Spanned)) {
                                            }
                                            this.f3988f = list;
                                            kotlin.a.a(LazyThreadSafetyMode.NONE, new AndroidParagraph$wordBoundary$2(this));
                                        }
                                        i15 = 0;
                                        if (dVar == null) {
                                        }
                                        if (cVar != null) {
                                        }
                                        z24 = false;
                                        if (!z24) {
                                        }
                                        i16 = 0;
                                        if (z10) {
                                        }
                                        p10 = p(i11, i12, truncateAt, i10, i13, i14, i15, i16);
                                        if (z10) {
                                        }
                                        this.f3986d = p10;
                                        x1.a aVar322222 = this.f3984a.f4154g;
                                        k kVar22222 = pVar.f16703a;
                                        aVar322222.a(kVar22222.f16671a.d(), a1.c.v(b(), a()), kVar22222.f16671a.n());
                                        if (p10.h() instanceof Spanned) {
                                        }
                                        aVarArr = new z1.a[0];
                                        while (r2 < r1) {
                                        }
                                        charSequence = this.f3987e;
                                        if (!(charSequence instanceof Spanned)) {
                                        }
                                        this.f3988f = list;
                                        kotlin.a.a(LazyThreadSafetyMode.NONE, new AndroidParagraph$wordBoundary$2(this));
                                    }
                                    z20 = false;
                                    if (!z20) {
                                    }
                                    i15 = 0;
                                    if (dVar == null) {
                                    }
                                    if (cVar != null) {
                                    }
                                    z24 = false;
                                    if (!z24) {
                                    }
                                    i16 = 0;
                                    if (z10) {
                                    }
                                    p10 = p(i11, i12, truncateAt, i10, i13, i14, i15, i16);
                                    if (z10) {
                                    }
                                    this.f3986d = p10;
                                    x1.a aVar3222222 = this.f3984a.f4154g;
                                    k kVar222222 = pVar.f16703a;
                                    aVar3222222.a(kVar222222.f16671a.d(), a1.c.v(b(), a()), kVar222222.f16671a.n());
                                    if (p10.h() instanceof Spanned) {
                                    }
                                    aVarArr = new z1.a[0];
                                    while (r2 < r1) {
                                    }
                                    charSequence = this.f3987e;
                                    if (!(charSequence instanceof Spanned)) {
                                    }
                                    this.f3988f = list;
                                    kotlin.a.a(LazyThreadSafetyMode.NONE, new AndroidParagraph$wordBoundary$2(this));
                                }
                                z18 = false;
                                if (z18) {
                                }
                                if (dVar == null) {
                                }
                                if (bVar3 != null) {
                                    z20 = true;
                                    if (!z20) {
                                    }
                                    i15 = 0;
                                    if (dVar == null) {
                                    }
                                    if (cVar != null) {
                                    }
                                    z24 = false;
                                    if (!z24) {
                                    }
                                    i16 = 0;
                                    if (z10) {
                                    }
                                    p10 = p(i11, i12, truncateAt, i10, i13, i14, i15, i16);
                                    if (z10) {
                                    }
                                    this.f3986d = p10;
                                    x1.a aVar32222222 = this.f3984a.f4154g;
                                    k kVar2222222 = pVar.f16703a;
                                    aVar32222222.a(kVar2222222.f16671a.d(), a1.c.v(b(), a()), kVar2222222.f16671a.n());
                                    if (p10.h() instanceof Spanned) {
                                    }
                                    aVarArr = new z1.a[0];
                                    while (r2 < r1) {
                                    }
                                    charSequence = this.f3987e;
                                    if (!(charSequence instanceof Spanned)) {
                                    }
                                    this.f3988f = list;
                                    kotlin.a.a(LazyThreadSafetyMode.NONE, new AndroidParagraph$wordBoundary$2(this));
                                }
                                z20 = false;
                                if (!z20) {
                                }
                                i15 = 0;
                                if (dVar == null) {
                                }
                                if (cVar != null) {
                                }
                                z24 = false;
                                if (!z24) {
                                }
                                i16 = 0;
                                if (z10) {
                                }
                                p10 = p(i11, i12, truncateAt, i10, i13, i14, i15, i16);
                                if (z10) {
                                }
                                this.f3986d = p10;
                                x1.a aVar322222222 = this.f3984a.f4154g;
                                k kVar22222222 = pVar.f16703a;
                                aVar322222222.a(kVar22222222.f16671a.d(), a1.c.v(b(), a()), kVar22222222.f16671a.n());
                                if (p10.h() instanceof Spanned) {
                                }
                                aVarArr = new z1.a[0];
                                while (r2 < r1) {
                                }
                                charSequence = this.f3987e;
                                if (!(charSequence instanceof Spanned)) {
                                }
                                this.f3988f = list;
                                kotlin.a.a(LazyThreadSafetyMode.NONE, new AndroidParagraph$wordBoundary$2(this));
                            }
                            i14 = 0;
                            if (dVar == null) {
                            }
                            if (bVar3 != null) {
                            }
                            z20 = false;
                            if (!z20) {
                            }
                            i15 = 0;
                            if (dVar == null) {
                            }
                            if (cVar != null) {
                            }
                            z24 = false;
                            if (!z24) {
                            }
                            i16 = 0;
                            if (z10) {
                            }
                            p10 = p(i11, i12, truncateAt, i10, i13, i14, i15, i16);
                            if (z10) {
                            }
                            this.f3986d = p10;
                            x1.a aVar3222222222 = this.f3984a.f4154g;
                            k kVar222222222 = pVar.f16703a;
                            aVar3222222222.a(kVar222222222.f16671a.d(), a1.c.v(b(), a()), kVar222222222.f16671a.n());
                            if (p10.h() instanceof Spanned) {
                            }
                            aVarArr = new z1.a[0];
                            while (r2 < r1) {
                            }
                            charSequence = this.f3987e;
                            if (!(charSequence instanceof Spanned)) {
                            }
                            this.f3988f = list;
                            kotlin.a.a(LazyThreadSafetyMode.NONE, new AndroidParagraph$wordBoundary$2(this));
                        }
                        z17 = false;
                        if (!z17) {
                        }
                        i14 = 0;
                        if (dVar == null) {
                        }
                        if (bVar3 != null) {
                        }
                        z20 = false;
                        if (!z20) {
                        }
                        i15 = 0;
                        if (dVar == null) {
                        }
                        if (cVar != null) {
                        }
                        z24 = false;
                        if (!z24) {
                        }
                        i16 = 0;
                        if (z10) {
                        }
                        p10 = p(i11, i12, truncateAt, i10, i13, i14, i15, i16);
                        if (z10) {
                        }
                        this.f3986d = p10;
                        x1.a aVar32222222222 = this.f3984a.f4154g;
                        k kVar2222222222 = pVar.f16703a;
                        aVar32222222222.a(kVar2222222222.f16671a.d(), a1.c.v(b(), a()), kVar2222222222.f16671a.n());
                        if (p10.h() instanceof Spanned) {
                        }
                        aVarArr = new z1.a[0];
                        while (r2 < r1) {
                        }
                        charSequence = this.f3987e;
                        if (!(charSequence instanceof Spanned)) {
                        }
                        this.f3988f = list;
                        kotlin.a.a(LazyThreadSafetyMode.NONE, new AndroidParagraph$wordBoundary$2(this));
                    }
                    z12 = false;
                    if (z12) {
                    }
                    if (fVar != null) {
                    }
                    bVar = a1.b.f25f;
                    bVar2 = hVar.f16668f;
                    if (g.a(bVar2, bVar)) {
                    }
                    dVar = pVar.f16704b.f16667e;
                    if (dVar == null) {
                    }
                    if (aVar2 != null) {
                        z17 = true;
                        if (!z17) {
                        }
                        i14 = 0;
                        if (dVar == null) {
                        }
                        if (bVar3 != null) {
                        }
                        z20 = false;
                        if (!z20) {
                        }
                        i15 = 0;
                        if (dVar == null) {
                        }
                        if (cVar != null) {
                        }
                        z24 = false;
                        if (!z24) {
                        }
                        i16 = 0;
                        if (z10) {
                        }
                        p10 = p(i11, i12, truncateAt, i10, i13, i14, i15, i16);
                        if (z10) {
                        }
                        this.f3986d = p10;
                        x1.a aVar322222222222 = this.f3984a.f4154g;
                        k kVar22222222222 = pVar.f16703a;
                        aVar322222222222.a(kVar22222222222.f16671a.d(), a1.c.v(b(), a()), kVar22222222222.f16671a.n());
                        if (p10.h() instanceof Spanned) {
                        }
                        aVarArr = new z1.a[0];
                        while (r2 < r1) {
                        }
                        charSequence = this.f3987e;
                        if (!(charSequence instanceof Spanned)) {
                        }
                        this.f3988f = list;
                        kotlin.a.a(LazyThreadSafetyMode.NONE, new AndroidParagraph$wordBoundary$2(this));
                    }
                    z17 = false;
                    if (!z17) {
                    }
                    i14 = 0;
                    if (dVar == null) {
                    }
                    if (bVar3 != null) {
                    }
                    z20 = false;
                    if (!z20) {
                    }
                    i15 = 0;
                    if (dVar == null) {
                    }
                    if (cVar != null) {
                    }
                    z24 = false;
                    if (!z24) {
                    }
                    i16 = 0;
                    if (z10) {
                    }
                    p10 = p(i11, i12, truncateAt, i10, i13, i14, i15, i16);
                    if (z10) {
                    }
                    this.f3986d = p10;
                    x1.a aVar3222222222222 = this.f3984a.f4154g;
                    k kVar222222222222 = pVar.f16703a;
                    aVar3222222222222.a(kVar222222222222.f16671a.d(), a1.c.v(b(), a()), kVar222222222222.f16671a.n());
                    if (p10.h() instanceof Spanned) {
                    }
                    aVarArr = new z1.a[0];
                    while (r2 < r1) {
                    }
                    charSequence = this.f3987e;
                    if (!(charSequence instanceof Spanned)) {
                    }
                    this.f3988f = list;
                    kotlin.a.a(LazyThreadSafetyMode.NONE, new AndroidParagraph$wordBoundary$2(this));
                }
            }
        }
        z11 = false;
        CharSequence charSequence22 = aVar.f4155h;
        SpannableString spannableString3 = charSequence22;
        if (z11) {
        }
        this.f3987e = spannableString3;
        h hVar2 = pVar.f16704b;
        fVar = hVar2.f16664a;
        if (fVar != null) {
            z12 = true;
            if (z12) {
            }
            if (fVar != null) {
            }
            bVar = a1.b.f25f;
            bVar2 = hVar2.f16668f;
            if (g.a(bVar2, bVar)) {
            }
            dVar = pVar.f16704b.f16667e;
            if (dVar == null) {
            }
            if (aVar2 != null) {
            }
            z17 = false;
            if (!z17) {
            }
            i14 = 0;
            if (dVar == null) {
            }
            if (bVar3 != null) {
            }
            z20 = false;
            if (!z20) {
            }
            i15 = 0;
            if (dVar == null) {
            }
            if (cVar != null) {
            }
            z24 = false;
            if (!z24) {
            }
            i16 = 0;
            if (z10) {
            }
            p10 = p(i11, i12, truncateAt, i10, i13, i14, i15, i16);
            if (z10) {
            }
            this.f3986d = p10;
            x1.a aVar32222222222222 = this.f3984a.f4154g;
            k kVar2222222222222 = pVar.f16703a;
            aVar32222222222222.a(kVar2222222222222.f16671a.d(), a1.c.v(b(), a()), kVar2222222222222.f16671a.n());
            if (p10.h() instanceof Spanned) {
            }
            aVarArr = new z1.a[0];
            while (r2 < r1) {
            }
            charSequence = this.f3987e;
            if (!(charSequence instanceof Spanned)) {
            }
            this.f3988f = list;
            kotlin.a.a(LazyThreadSafetyMode.NONE, new AndroidParagraph$wordBoundary$2(this));
        }
        z12 = false;
        if (z12) {
        }
        if (fVar != null) {
        }
        bVar = a1.b.f25f;
        bVar2 = hVar2.f16668f;
        if (g.a(bVar2, bVar)) {
        }
        dVar = pVar.f16704b.f16667e;
        if (dVar == null) {
        }
        if (aVar2 != null) {
        }
        z17 = false;
        if (!z17) {
        }
        i14 = 0;
        if (dVar == null) {
        }
        if (bVar3 != null) {
        }
        z20 = false;
        if (!z20) {
        }
        i15 = 0;
        if (dVar == null) {
        }
        if (cVar != null) {
        }
        z24 = false;
        if (!z24) {
        }
        i16 = 0;
        if (z10) {
        }
        p10 = p(i11, i12, truncateAt, i10, i13, i14, i15, i16);
        if (z10) {
        }
        this.f3986d = p10;
        x1.a aVar322222222222222 = this.f3984a.f4154g;
        k kVar22222222222222 = pVar.f16703a;
        aVar322222222222222.a(kVar22222222222222.f16671a.d(), a1.c.v(b(), a()), kVar22222222222222.f16671a.n());
        if (p10.h() instanceof Spanned) {
        }
        aVarArr = new z1.a[0];
        while (r2 < r1) {
        }
        charSequence = this.f3987e;
        if (!(charSequence instanceof Spanned)) {
        }
        this.f3988f = list;
        kotlin.a.a(LazyThreadSafetyMode.NONE, new AndroidParagraph$wordBoundary$2(this));
    }

    @Override // p1.d
    public final float a() {
        return this.f3986d.a();
    }

    @Override // p1.d
    public final float b() {
        return b2.a.f(this.c);
    }

    @Override // p1.d
    public final u0.d c(int i10) {
        boolean z10;
        float g10;
        float g11;
        float f10;
        float f11;
        b bVar = this.f3986d;
        int d5 = bVar.d(i10);
        float e10 = bVar.e(d5);
        float c = bVar.c(d5);
        Layout layout = bVar.f4070d;
        if (layout.getParagraphDirection(d5) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean isRtlCharAt = layout.isRtlCharAt(i10);
        if (z10 && !isRtlCharAt) {
            g10 = bVar.f(i10, false);
            g11 = bVar.f(i10 + 1, true);
        } else {
            if (z10 && isRtlCharAt) {
                f10 = bVar.g(i10, false);
                f11 = bVar.g(i10 + 1, true);
            } else if (isRtlCharAt) {
                f10 = bVar.f(i10, false);
                f11 = bVar.f(i10 + 1, true);
            } else {
                g10 = bVar.g(i10, false);
                g11 = bVar.g(i10 + 1, true);
            }
            float f12 = f10;
            g10 = f11;
            g11 = f12;
        }
        RectF rectF = new RectF(g10, e10, g11, c);
        return new u0.d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // p1.d
    public final List<u0.d> d() {
        return this.f3988f;
    }

    @Override // p1.d
    public final int e(int i10) {
        return this.f3986d.f4070d.getLineStart(i10);
    }

    @Override // p1.d
    public final int f(int i10, boolean z10) {
        b bVar = this.f3986d;
        if (z10) {
            Layout layout = bVar.f4070d;
            if (layout.getEllipsisStart(i10) == 0) {
                return layout.getLineVisibleEnd(i10);
            }
            return layout.getEllipsisStart(i10) + layout.getLineStart(i10);
        }
        Layout layout2 = bVar.f4070d;
        if (layout2.getEllipsisStart(i10) == 0) {
            return layout2.getLineEnd(i10);
        }
        return layout2.getText().length();
    }

    @Override // p1.d
    public final void g(o oVar, long j2, g0 g0Var, a2.g gVar) {
        x1.a aVar = this.f3984a.f4154g;
        aVar.b(j2);
        aVar.c(g0Var);
        aVar.d(gVar);
        q(oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    @Override // p1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(o oVar, m mVar, float f10, g0 g0Var, a2.g gVar, androidx.datastore.preferences.protobuf.k kVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        Paint.Join join;
        int i10;
        boolean z13;
        boolean z14;
        Paint.Cap cap;
        x1.a aVar = this.f3984a.f4154g;
        aVar.a(mVar, a1.c.v(b(), a()), f10);
        aVar.c(g0Var);
        aVar.d(gVar);
        if (kVar != null && !g.a(aVar.f18569e, kVar)) {
            aVar.f18569e = kVar;
            if (g.a(kVar, x0.h.f18561i)) {
                aVar.setStyle(Paint.Style.FILL);
            } else if (kVar instanceof x0.i) {
                aVar.setStyle(Paint.Style.STROKE);
                x0.i iVar = (x0.i) kVar;
                aVar.setStrokeWidth(iVar.f18562i);
                aVar.setStrokeMiter(iVar.f18563j);
                boolean z15 = false;
                int i11 = iVar.f18565l;
                if (i11 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (i11 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        join = Paint.Join.ROUND;
                    } else {
                        if (i11 == 2) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            join = Paint.Join.BEVEL;
                        }
                    }
                    aVar.setStrokeJoin(join);
                    i10 = iVar.f18564k;
                    if (i10 != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        if (i10 == 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            cap = Paint.Cap.ROUND;
                        } else {
                            if (i10 == 2) {
                                z15 = true;
                            }
                            if (z15) {
                                cap = Paint.Cap.SQUARE;
                            }
                        }
                        aVar.setStrokeCap(cap);
                        aVar.setPathEffect(null);
                    }
                    cap = Paint.Cap.BUTT;
                    aVar.setStrokeCap(cap);
                    aVar.setPathEffect(null);
                }
                join = Paint.Join.MITER;
                aVar.setStrokeJoin(join);
                i10 = iVar.f18564k;
                if (i10 != 0) {
                }
                if (!z13) {
                }
                cap = Paint.Cap.BUTT;
                aVar.setStrokeCap(cap);
                aVar.setPathEffect(null);
            }
        }
        q(oVar);
    }

    @Override // p1.d
    public final ResolvedTextDirection i(int i10) {
        b bVar = this.f3986d;
        if (bVar.f4070d.getParagraphDirection(bVar.d(i10)) == 1) {
            return ResolvedTextDirection.Ltr;
        }
        return ResolvedTextDirection.Rtl;
    }

    @Override // p1.d
    public final float j(int i10) {
        return this.f3986d.e(i10);
    }

    @Override // p1.d
    public final float k() {
        b bVar = this.f3986d;
        return bVar.b(bVar.f4071e - 1);
    }

    @Override // p1.d
    public final int l(float f10) {
        b bVar = this.f3986d;
        return bVar.f4070d.getLineForVertical(bVar.f4072f + ((int) f10));
    }

    @Override // p1.d
    public final int m(int i10) {
        return this.f3986d.d(i10);
    }

    @Override // p1.d
    public final float n() {
        return this.f3986d.b(0);
    }

    @Override // p1.d
    public final int o(long j2) {
        float f10;
        b bVar = this.f3986d;
        int lineForVertical = bVar.f4070d.getLineForVertical(bVar.f4072f + ((int) u0.c.c(j2)));
        float b5 = u0.c.b(j2);
        float f11 = -1;
        if (lineForVertical == bVar.f4071e - 1) {
            f10 = bVar.f4074h + bVar.f4075i;
        } else {
            f10 = 0.0f;
        }
        return bVar.f4070d.getOffsetForHorizontal(lineForVertical, (f10 * f11) + b5);
    }

    public final b p(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16) {
        CharSequence charSequence = this.f3987e;
        float b5 = b();
        androidx.compose.ui.text.platform.a aVar = this.f3984a;
        x1.a aVar2 = aVar.f4154g;
        int i17 = aVar.f4158k;
        androidx.compose.ui.text.android.a aVar3 = aVar.f4156i;
        g.f(aVar.f4150b, "<this>");
        return new b(charSequence, b5, aVar2, i10, truncateAt, i17, i12, i14, i15, i16, i13, i11, aVar3);
    }

    public final void q(o oVar) {
        Canvas canvas = v0.d.f18088a;
        Canvas canvas2 = ((v0.c) oVar).f18085a;
        b bVar = this.f3986d;
        if (bVar.c) {
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, b(), a());
        }
        g.f(canvas2, "canvas");
        int i10 = bVar.f4072f;
        if (i10 != 0) {
            canvas2.translate(0.0f, i10);
        }
        q qVar = bVar.f4079m;
        qVar.getClass();
        qVar.f16867a = canvas2;
        bVar.f4070d.draw(qVar);
        if (i10 != 0) {
            canvas2.translate(0.0f, (-1) * i10);
        }
        if (bVar.c) {
            canvas2.restore();
        }
    }
}
