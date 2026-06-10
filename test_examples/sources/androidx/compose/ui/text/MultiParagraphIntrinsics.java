package androidx.compose.ui.text;

import a1.c;
import a2.f;
import b2.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import m7.e;
import p1.a;
import p1.g;
import p1.h;
import p1.j;
import p1.k;
import p1.p;
import u1.e;

/* loaded from: classes.dex */
public final class MultiParagraphIntrinsics implements g {

    /* renamed from: a  reason: collision with root package name */
    public final p1.a f3995a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a.C0207a<j>> f3996b;
    public final e c;

    /* renamed from: d  reason: collision with root package name */
    public final e f3997d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f3998e;

    /* JADX WARN: Removed duplicated region for block: B:40:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0245 A[EDGE_INSN: B:88:0x0245->B:66:0x0245 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultiParagraphIntrinsics(p1.a aVar, p pVar, List<a.C0207a<j>> list, b bVar, e.a aVar2) {
        String str;
        String str2;
        int i10;
        int i11;
        ArrayList arrayList;
        List<a.C0207a<k>> list2;
        int size;
        int i12;
        h hVar;
        List<a.C0207a<j>> list3;
        int size2;
        int i13;
        int i14;
        int size3;
        int i15;
        boolean z10;
        boolean z11;
        boolean z12;
        p1.a aVar3 = aVar;
        p pVar2 = pVar;
        v7.g.f(aVar3, "annotatedString");
        v7.g.f(list, "placeholders");
        v7.g.f(bVar, "density");
        v7.g.f(aVar2, "fontFamilyResolver");
        this.f3995a = aVar3;
        this.f3996b = list;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = kotlin.a.a(lazyThreadSafetyMode, new MultiParagraphIntrinsics$minIntrinsicWidth$2(this));
        this.f3997d = kotlin.a.a(lazyThreadSafetyMode, new MultiParagraphIntrinsics$maxIntrinsicWidth$2(this));
        int i16 = p1.b.f16648a;
        h hVar2 = pVar2.f16704b;
        v7.g.f(hVar2, "defaultParagraphStyle");
        String str3 = aVar3.f16641i;
        int length = str3.length();
        ArrayList arrayList2 = new ArrayList();
        List<a.C0207a<h>> list4 = aVar3.f16643k;
        int size4 = list4.size();
        int i17 = 0;
        int i18 = 0;
        while (i17 < size4) {
            a.C0207a<h> c0207a = list4.get(i17);
            h hVar3 = c0207a.f16645a;
            int i19 = c0207a.f16646b;
            List<a.C0207a<h>> list5 = list4;
            if (i19 != i18) {
                arrayList2.add(new a.C0207a(i18, i19, hVar2));
            }
            h a10 = hVar2.a(hVar3);
            int i20 = c0207a.c;
            arrayList2.add(new a.C0207a(i19, i20, a10));
            i17++;
            list4 = list5;
            i18 = i20;
        }
        if (i18 != length) {
            arrayList2.add(new a.C0207a(i18, length, hVar2));
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new a.C0207a(0, 0, hVar2));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size5 = arrayList2.size();
        int i21 = 0;
        while (i21 < size5) {
            a.C0207a c0207a2 = (a.C0207a) arrayList2.get(i21);
            int i22 = c0207a2.f16646b;
            int i23 = c0207a2.c;
            if (i22 != i23) {
                str = str3.substring(i22, i23);
                v7.g.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = "";
            }
            String str4 = str;
            if (i22 == i23) {
                list2 = EmptyList.f12981i;
            } else {
                List<a.C0207a<k>> list6 = aVar3.f16642j;
                if (i22 == 0 && i23 >= str3.length()) {
                    list2 = list6;
                } else {
                    ArrayList arrayList4 = new ArrayList(list6.size());
                    int size6 = list6.size();
                    str2 = str3;
                    int i24 = 0;
                    while (i24 < size6) {
                        int i25 = size6;
                        a.C0207a<k> c0207a3 = list6.get(i24);
                        List<a.C0207a<k>> list7 = list6;
                        a.C0207a<k> c0207a4 = c0207a3;
                        int i26 = i21;
                        if (p1.b.b(i22, i23, c0207a4.f16646b, c0207a4.c)) {
                            arrayList4.add(c0207a3);
                        }
                        i24++;
                        size6 = i25;
                        list6 = list7;
                        i21 = i26;
                    }
                    i10 = i21;
                    ArrayList arrayList5 = new ArrayList(arrayList4.size());
                    int size7 = arrayList4.size();
                    int i27 = 0;
                    while (i27 < size7) {
                        a.C0207a c0207a5 = (a.C0207a) arrayList4.get(i27);
                        ArrayList arrayList6 = arrayList4;
                        arrayList5.add(new a.C0207a(c.c0(c0207a5.f16646b, i22, i23) - i22, c.c0(c0207a5.c, i22, i23) - i22, c0207a5.f16645a));
                        i27++;
                        size7 = size7;
                        arrayList4 = arrayList6;
                        size5 = size5;
                    }
                    i11 = size5;
                    arrayList = arrayList5;
                    EmptyList emptyList = EmptyList.f12981i;
                    v7.g.f(arrayList, "spanStyles");
                    v7.g.f(emptyList, "paragraphStyles");
                    v7.g.f(emptyList, "annotations");
                    List G2 = kotlin.collections.c.G2(emptyList, new a.b());
                    size = G2.size();
                    int i28 = -1;
                    i12 = 0;
                    while (i12 < size) {
                        a.C0207a c0207a6 = (a.C0207a) G2.get(i12);
                        if (c0207a6.f16646b >= i28) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            int length2 = str4.length();
                            int i29 = c0207a6.c;
                            if (i29 <= length2) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                i12++;
                                i28 = i29;
                            } else {
                                throw new IllegalArgumentException(("ParagraphStyle range [" + c0207a6.f16646b + ", " + i29 + ") is out of boundary").toString());
                            }
                        } else {
                            throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
                        }
                    }
                    hVar = (h) c0207a2.f16645a;
                    if (hVar.f16665b != null) {
                        a2.h hVar4 = hVar2.f16665b;
                        f fVar = hVar.f16664a;
                        long j2 = hVar.c;
                        a2.j jVar = hVar.f16666d;
                        hVar.getClass();
                        hVar = new h(fVar, hVar4, j2, jVar, null, hVar.f16667e, hVar.f16668f);
                    }
                    p pVar3 = new p(pVar2.f16703a, hVar2.a(hVar));
                    list3 = this.f3996b;
                    ArrayList arrayList7 = new ArrayList(list3.size());
                    size2 = list3.size();
                    i13 = 0;
                    while (true) {
                        i14 = c0207a2.f16646b;
                        if (i13 < size2) {
                            break;
                        }
                        a.C0207a<j> c0207a7 = list3.get(i13);
                        List<a.C0207a<j>> list8 = list3;
                        a.C0207a<j> c0207a8 = c0207a7;
                        h hVar5 = hVar2;
                        if (p1.b.b(i14, i23, c0207a8.f16646b, c0207a8.c)) {
                            arrayList7.add(c0207a7);
                        }
                        i13++;
                        list3 = list8;
                        hVar2 = hVar5;
                    }
                    h hVar6 = hVar2;
                    ArrayList arrayList8 = new ArrayList(arrayList7.size());
                    i15 = 0;
                    for (size3 = arrayList7.size(); i15 < size3; size3 = size3) {
                        a.C0207a c0207a9 = (a.C0207a) arrayList7.get(i15);
                        int i30 = c0207a9.f16646b;
                        int i31 = c0207a9.c;
                        if (i14 <= i30 && i31 <= i23) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            arrayList8.add(new a.C0207a(i30 - i14, i31 - i14, c0207a9.f16645a));
                            i15++;
                        } else {
                            throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
                        }
                    }
                    arrayList3.add(new p1.f(new androidx.compose.ui.text.platform.a(pVar3, aVar2, bVar, str4, arrayList, arrayList8), i14, i23));
                    i21 = i10 + 1;
                    aVar3 = aVar;
                    pVar2 = pVar;
                    str3 = str2;
                    size5 = i11;
                    hVar2 = hVar6;
                }
            }
            str2 = str3;
            i10 = i21;
            i11 = size5;
            arrayList = list2;
            EmptyList emptyList2 = EmptyList.f12981i;
            v7.g.f(arrayList, "spanStyles");
            v7.g.f(emptyList2, "paragraphStyles");
            v7.g.f(emptyList2, "annotations");
            List G22 = kotlin.collections.c.G2(emptyList2, new a.b());
            size = G22.size();
            int i282 = -1;
            i12 = 0;
            while (i12 < size) {
            }
            hVar = (h) c0207a2.f16645a;
            if (hVar.f16665b != null) {
            }
            p pVar32 = new p(pVar2.f16703a, hVar2.a(hVar));
            list3 = this.f3996b;
            ArrayList arrayList72 = new ArrayList(list3.size());
            size2 = list3.size();
            i13 = 0;
            while (true) {
                i14 = c0207a2.f16646b;
                if (i13 < size2) {
                }
                i13++;
                list3 = list8;
                hVar2 = hVar5;
            }
            h hVar62 = hVar2;
            ArrayList arrayList82 = new ArrayList(arrayList72.size());
            i15 = 0;
            while (i15 < size3) {
            }
            arrayList3.add(new p1.f(new androidx.compose.ui.text.platform.a(pVar32, aVar2, bVar, str4, arrayList, arrayList82), i14, i23));
            i21 = i10 + 1;
            aVar3 = aVar;
            pVar2 = pVar;
            str3 = str2;
            size5 = i11;
            hVar2 = hVar62;
        }
        this.f3998e = arrayList3;
    }

    @Override // p1.g
    public final float a() {
        return ((Number) this.c.getValue()).floatValue();
    }

    @Override // p1.g
    public final boolean b() {
        ArrayList arrayList = this.f3998e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((p1.f) arrayList.get(i10)).f16662a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // p1.g
    public final float c() {
        return ((Number) this.f3997d.getValue()).floatValue();
    }
}
