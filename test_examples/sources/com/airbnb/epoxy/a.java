package com.airbnb.epoxy;

import androidx.recyclerview.widget.k;
import com.airbnb.epoxy.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ c.a f6608i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f6609j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ List f6610k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ List f6611l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ c f6612m;

    public a(c cVar, c.a aVar, int i10, List list, List list2) {
        this.f6612m = cVar;
        this.f6608i = aVar;
        this.f6609j = i10;
        this.f6610k = list;
        this.f6611l = list2;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x01a1 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x017f A[EDGE_INSN: B:147:0x017f->B:82:0x017f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0178 A[LOOP:5: B:74:0x0164->B:80:0x0178, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0185  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        k.g gVar;
        k.h hVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        k.g gVar2;
        k.g gVar3;
        boolean z10;
        k.c cVar;
        boolean z11;
        int i10;
        int i11;
        int i12;
        boolean z12;
        int i13;
        k.h hVar2;
        boolean z13;
        k.h hVar3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z14;
        c.a aVar = this.f6608i;
        int size = aVar.f6627a.size();
        int size2 = aVar.f6628b.size();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new k.g(size, size2));
        int i25 = size + size2;
        int i26 = 1;
        int i27 = (((i25 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i27];
        int i28 = i27 / 2;
        int[] iArr2 = new int[i27];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            k.g gVar4 = (k.g) arrayList6.remove(arrayList6.size() - i26);
            int i29 = gVar4.f5885b;
            int i30 = gVar4.f5884a;
            int i31 = i29 - i30;
            if (i31 >= i26 && (i12 = gVar4.f5886d - gVar4.c) >= i26) {
                int i32 = ((i12 + i31) + i26) / 2;
                int i33 = i26 + i28;
                iArr[i33] = i30;
                iArr2[i33] = i29;
                int i34 = 0;
                while (i34 < i32) {
                    if (Math.abs((gVar4.f5885b - gVar4.f5884a) - (gVar4.f5886d - gVar4.c)) % 2 == i26) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    int i35 = (gVar4.f5885b - gVar4.f5884a) - (gVar4.f5886d - gVar4.c);
                    int i36 = -i34;
                    int i37 = i36;
                    while (true) {
                        if (i37 <= i34) {
                            if (i37 != i36) {
                                if (i37 != i34) {
                                    i13 = i32;
                                    if (iArr[i37 + 1 + i28] > iArr[(i37 - 1) + i28]) {
                                    }
                                } else {
                                    i13 = i32;
                                }
                                i22 = iArr[(i37 - 1) + i28];
                                i21 = i22 + 1;
                                arrayList = arrayList6;
                                i23 = ((i21 - gVar4.f5884a) + gVar4.c) - i37;
                                if (i34 != 0 && i21 == i22) {
                                    i24 = i23 - 1;
                                    arrayList2 = arrayList7;
                                    while (i21 < gVar4.f5885b && i23 < gVar4.f5886d && aVar.a(i21, i23)) {
                                        i21++;
                                        i23++;
                                    }
                                    iArr[i37 + i28] = i21;
                                    if (!z12) {
                                        int i38 = i35 - i37;
                                        z14 = z12;
                                        if (i38 >= i36 + 1 && i38 <= i34 - 1 && iArr2[i38 + i28] <= i21) {
                                            hVar2 = new k.h();
                                            hVar2.f5887a = i22;
                                            hVar2.f5888b = i24;
                                            hVar2.c = i21;
                                            hVar2.f5889d = i23;
                                            hVar2.f5890e = false;
                                            break;
                                        }
                                    } else {
                                        z14 = z12;
                                    }
                                    i37 += 2;
                                    arrayList6 = arrayList;
                                    i32 = i13;
                                    arrayList7 = arrayList2;
                                    z12 = z14;
                                }
                                i24 = i23;
                                arrayList2 = arrayList7;
                                while (i21 < gVar4.f5885b) {
                                    i21++;
                                    i23++;
                                }
                                iArr[i37 + i28] = i21;
                                if (!z12) {
                                }
                                i37 += 2;
                                arrayList6 = arrayList;
                                i32 = i13;
                                arrayList7 = arrayList2;
                                z12 = z14;
                            } else {
                                i13 = i32;
                            }
                            i22 = iArr[i37 + 1 + i28];
                            i21 = i22;
                            arrayList = arrayList6;
                            i23 = ((i21 - gVar4.f5884a) + gVar4.c) - i37;
                            if (i34 != 0) {
                                i24 = i23 - 1;
                                arrayList2 = arrayList7;
                                while (i21 < gVar4.f5885b) {
                                }
                                iArr[i37 + i28] = i21;
                                if (!z12) {
                                }
                                i37 += 2;
                                arrayList6 = arrayList;
                                i32 = i13;
                                arrayList7 = arrayList2;
                                z12 = z14;
                            }
                            i24 = i23;
                            arrayList2 = arrayList7;
                            while (i21 < gVar4.f5885b) {
                            }
                            iArr[i37 + i28] = i21;
                            if (!z12) {
                            }
                            i37 += 2;
                            arrayList6 = arrayList;
                            i32 = i13;
                            arrayList7 = arrayList2;
                            z12 = z14;
                        } else {
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            i13 = i32;
                            hVar2 = null;
                            break;
                        }
                    }
                    if (hVar2 != null) {
                        hVar = hVar2;
                        gVar = gVar4;
                        break;
                    }
                    int i39 = (gVar4.f5885b - gVar4.f5884a) - (gVar4.f5886d - gVar4.c);
                    if (i39 % 2 == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    int i40 = i36;
                    while (true) {
                        if (i40 <= i34) {
                            if (i40 != i36 && (i40 == i34 || iArr2[i40 + 1 + i28] >= iArr2[(i40 - 1) + i28])) {
                                i14 = iArr2[(i40 - 1) + i28];
                                i15 = i14 - 1;
                                i16 = gVar4.f5886d - ((gVar4.f5885b - i15) - i40);
                                if (i34 != 0 && i15 == i14) {
                                    i17 = i16 + 1;
                                    while (i15 > gVar4.f5884a && i16 > gVar4.c) {
                                        i19 = i15 - 1;
                                        gVar = gVar4;
                                        i20 = i16 - 1;
                                        if (aVar.a(i19, i20)) {
                                            break;
                                        }
                                        i15 = i19;
                                        i16 = i20;
                                        gVar4 = gVar;
                                    }
                                    gVar = gVar4;
                                    iArr2[i40 + i28] = i15;
                                    if (!z13 && (i18 = i39 - i40) >= i36 && i18 <= i34 && iArr[i18 + i28] >= i15) {
                                        hVar3 = new k.h();
                                        hVar3.f5887a = i15;
                                        hVar3.f5888b = i16;
                                        hVar3.c = i14;
                                        hVar3.f5889d = i17;
                                        hVar3.f5890e = true;
                                        break;
                                    }
                                    i40 += 2;
                                    gVar4 = gVar;
                                }
                                i17 = i16;
                                while (i15 > gVar4.f5884a) {
                                    i19 = i15 - 1;
                                    gVar = gVar4;
                                    i20 = i16 - 1;
                                    if (aVar.a(i19, i20)) {
                                    }
                                }
                                gVar = gVar4;
                                iArr2[i40 + i28] = i15;
                                if (!z13) {
                                }
                                i40 += 2;
                                gVar4 = gVar;
                            }
                            i14 = iArr2[i40 + 1 + i28];
                            i15 = i14;
                            i16 = gVar4.f5886d - ((gVar4.f5885b - i15) - i40);
                            if (i34 != 0) {
                                i17 = i16 + 1;
                                while (i15 > gVar4.f5884a) {
                                }
                                gVar = gVar4;
                                iArr2[i40 + i28] = i15;
                                if (!z13) {
                                }
                                i40 += 2;
                                gVar4 = gVar;
                            }
                            i17 = i16;
                            while (i15 > gVar4.f5884a) {
                            }
                            gVar = gVar4;
                            iArr2[i40 + i28] = i15;
                            if (!z13) {
                            }
                            i40 += 2;
                            gVar4 = gVar;
                        } else {
                            gVar = gVar4;
                            hVar3 = null;
                            break;
                        }
                    }
                    if (hVar3 != null) {
                        hVar = hVar3;
                        break;
                    }
                    i34++;
                    arrayList6 = arrayList;
                    i32 = i13;
                    arrayList7 = arrayList2;
                    gVar4 = gVar;
                    i26 = 1;
                }
            }
            arrayList = arrayList6;
            arrayList2 = arrayList7;
            gVar = gVar4;
            hVar = null;
            if (hVar != null) {
                if (Math.min(hVar.c - hVar.f5887a, hVar.f5889d - hVar.f5888b) > 0) {
                    int i41 = hVar.f5889d;
                    int i42 = hVar.f5888b;
                    int i43 = i41 - i42;
                    int i44 = hVar.c;
                    int i45 = hVar.f5887a;
                    int i46 = i44 - i45;
                    if (i43 != i46) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        if (hVar.f5890e) {
                            cVar = new k.c(i45, i42, Math.min(i44 - i45, i41 - i42));
                        } else {
                            if (i43 > i46) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                i11 = i42 + 1;
                                i10 = i45;
                            } else {
                                i10 = i45 + 1;
                                i11 = i42;
                            }
                            cVar = new k.c(i10, i11, Math.min(i44 - i45, i41 - i42));
                        }
                    } else {
                        cVar = new k.c(i45, i42, i46);
                    }
                    arrayList5.add(cVar);
                }
                if (arrayList2.isEmpty()) {
                    gVar2 = new k.g();
                    arrayList4 = arrayList2;
                    gVar3 = gVar;
                    i26 = 1;
                } else {
                    i26 = 1;
                    arrayList4 = arrayList2;
                    gVar2 = (k.g) arrayList4.remove(arrayList2.size() - 1);
                    gVar3 = gVar;
                }
                gVar2.f5884a = gVar3.f5884a;
                gVar2.c = gVar3.c;
                gVar2.f5885b = hVar.f5887a;
                gVar2.f5886d = hVar.f5888b;
                arrayList3 = arrayList;
                arrayList3.add(gVar2);
                gVar3.f5885b = gVar3.f5885b;
                gVar3.f5886d = gVar3.f5886d;
                gVar3.f5884a = hVar.c;
                gVar3.c = hVar.f5889d;
                arrayList3.add(gVar3);
            } else {
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                i26 = 1;
                arrayList4.add(gVar);
            }
            ArrayList arrayList8 = arrayList3;
            arrayList7 = arrayList4;
            arrayList6 = arrayList8;
        }
        Collections.sort(arrayList5, androidx.recyclerview.widget.k.f5873a);
        k.d dVar = new k.d(aVar, arrayList5, iArr, iArr2);
        List list = this.f6611l;
        List list2 = this.f6610k;
        j jVar = new j(list, list2, dVar);
        c cVar2 = this.f6612m;
        cVar2.getClass();
        j0.f6650k.execute(new b(this.f6609j, cVar2, jVar, list2));
    }
}
