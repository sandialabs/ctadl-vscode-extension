package com.airbnb.epoxy;

import androidx.recyclerview.widget.k;
import java.util.ArrayDeque;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final List<? extends r<?>> f6647a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends r<?>> f6648b;
    public final k.d c;

    public j(List<? extends r<?>> list, List<? extends r<?>> list2, k.d dVar) {
        this.f6647a = list;
        this.f6648b = list2;
        this.c = dVar;
    }

    public final void a(androidx.recyclerview.widget.s sVar) {
        androidx.recyclerview.widget.c cVar;
        int[] iArr;
        k.b bVar;
        k.d dVar;
        int i10;
        List<k.c> list;
        int i11;
        int i12;
        k.d dVar2 = this.c;
        if (dVar2 != null) {
            if (sVar instanceof androidx.recyclerview.widget.c) {
                cVar = (androidx.recyclerview.widget.c) sVar;
            } else {
                cVar = new androidx.recyclerview.widget.c(sVar);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            List<k.c> list2 = dVar2.f5876a;
            int size = list2.size() - 1;
            int i13 = dVar2.f5879e;
            int i14 = dVar2.f5880f;
            int i15 = i13;
            while (size >= 0) {
                k.c cVar2 = list2.get(size);
                int i16 = cVar2.f5874a;
                int i17 = cVar2.c;
                int i18 = i16 + i17;
                int i19 = cVar2.f5875b;
                int i20 = i17 + i19;
                while (true) {
                    iArr = dVar2.f5877b;
                    bVar = dVar2.f5878d;
                    if (i15 <= i18) {
                        break;
                    }
                    i15--;
                    int i21 = iArr[i15];
                    if ((i21 & 12) != 0) {
                        list = list2;
                        int i22 = i21 >> 4;
                        i11 = i14;
                        i12 = i18;
                        k.f a10 = k.d.a(arrayDeque, i22, false);
                        if (a10 != null) {
                            int i23 = (i13 - a10.f5883b) - 1;
                            cVar.b(i15, i23);
                            if ((i21 & 4) != 0) {
                                cVar.d(i23, 1, bVar.b(i15, i22));
                            }
                        } else {
                            arrayDeque.add(new k.f(i15, (i13 - i15) - 1, true));
                        }
                    } else {
                        list = list2;
                        i11 = i14;
                        i12 = i18;
                        cVar.a(i15, 1);
                        i13--;
                    }
                    list2 = list;
                    i14 = i11;
                    i18 = i12;
                }
                List<k.c> list3 = list2;
                int i24 = i14;
                while (i14 > i20) {
                    i14--;
                    int i25 = dVar2.c[i14];
                    if ((i25 & 12) != 0) {
                        int i26 = i25 >> 4;
                        dVar = dVar2;
                        i10 = i19;
                        k.f a11 = k.d.a(arrayDeque, i26, true);
                        if (a11 == null) {
                            arrayDeque.add(new k.f(i14, i13 - i15, false));
                        } else {
                            cVar.b((i13 - a11.f5883b) - 1, i15);
                            if ((i25 & 4) != 0) {
                                cVar.d(i15, 1, bVar.b(i26, i14));
                            }
                        }
                    } else {
                        dVar = dVar2;
                        i10 = i19;
                        cVar.c(i15, 1);
                        i13++;
                    }
                    dVar2 = dVar;
                    i19 = i10;
                }
                k.d dVar3 = dVar2;
                int i27 = i19;
                i15 = cVar2.f5874a;
                int i28 = i15;
                int i29 = i27;
                for (int i30 = 0; i30 < i17; i30++) {
                    if ((iArr[i28] & 15) == 2) {
                        cVar.d(i28, 1, bVar.b(i28, i29));
                    }
                    i28++;
                    i29++;
                }
                size--;
                list2 = list3;
                dVar2 = dVar3;
                i14 = i27;
            }
            cVar.e();
            return;
        }
        List<? extends r<?>> list4 = this.f6648b;
        boolean isEmpty = list4.isEmpty();
        List<? extends r<?>> list5 = this.f6647a;
        if (isEmpty && !list5.isEmpty()) {
            sVar.a(0, list5.size());
        } else if (!list4.isEmpty() && list5.isEmpty()) {
            sVar.c(0, list4.size());
        }
    }
}
