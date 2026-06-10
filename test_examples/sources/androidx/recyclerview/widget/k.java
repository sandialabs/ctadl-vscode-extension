package androidx.recyclerview.widget;

import com.airbnb.epoxy.c;
import com.airbnb.epoxy.n;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5873a = new a();

    /* loaded from: classes.dex */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            return cVar.f5874a - cVar2.f5874a;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract boolean a(int i10, int i11);

        public abstract com.airbnb.epoxy.i b(int i10, int i11);
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f5874a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5875b;
        public final int c;

        public c(int i10, int i11, int i12) {
            this.f5874a = i10;
            this.f5875b = i11;
            this.c = i12;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final List<c> f5876a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f5877b;
        public final int[] c;

        /* renamed from: d  reason: collision with root package name */
        public final b f5878d;

        /* renamed from: e  reason: collision with root package name */
        public final int f5879e;

        /* renamed from: f  reason: collision with root package name */
        public final int f5880f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f5881g;

        public d(c.a aVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
            c cVar;
            b bVar;
            int[] iArr3;
            int[] iArr4;
            int i10;
            c cVar2;
            int i11;
            int i12;
            int i13;
            this.f5876a = arrayList;
            this.f5877b = iArr;
            this.c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f5878d = aVar;
            int size = aVar.f6627a.size();
            this.f5879e = size;
            int size2 = aVar.f6628b.size();
            this.f5880f = size2;
            this.f5881g = true;
            if (arrayList.isEmpty()) {
                cVar = null;
            } else {
                cVar = (c) arrayList.get(0);
            }
            if (cVar == null || cVar.f5874a != 0 || cVar.f5875b != 0) {
                arrayList.add(0, new c(0, 0, 0));
            }
            arrayList.add(new c(size, size2, 0));
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                bVar = this.f5878d;
                iArr3 = this.c;
                iArr4 = this.f5877b;
                if (!hasNext) {
                    break;
                }
                c cVar3 = (c) it.next();
                for (int i14 = 0; i14 < cVar3.c; i14++) {
                    int i15 = cVar3.f5874a + i14;
                    int i16 = cVar3.f5875b + i14;
                    c.a aVar2 = (c.a) bVar;
                    ((n.a) aVar2.c).getClass();
                    if (aVar2.f6627a.get(i15).equals(aVar2.f6628b.get(i16))) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    iArr4[i15] = (i16 << 4) | i13;
                    iArr3[i16] = (i15 << 4) | i13;
                }
            }
            if (this.f5881g) {
                Iterator it2 = arrayList.iterator();
                int i17 = 0;
                while (it2.hasNext()) {
                    c cVar4 = (c) it2.next();
                    while (true) {
                        i10 = cVar4.f5874a;
                        if (i17 < i10) {
                            if (iArr4[i17] == 0) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                int i19 = 0;
                                while (true) {
                                    if (i18 < size3) {
                                        cVar2 = (c) arrayList.get(i18);
                                        while (true) {
                                            i11 = cVar2.f5875b;
                                            if (i19 < i11) {
                                                if (iArr3[i19] == 0 && bVar.a(i17, i19)) {
                                                    c.a aVar3 = (c.a) bVar;
                                                    ((n.a) aVar3.c).getClass();
                                                    if (aVar3.f6627a.get(i17).equals(aVar3.f6628b.get(i19))) {
                                                        i12 = 8;
                                                    } else {
                                                        i12 = 4;
                                                    }
                                                    iArr4[i17] = (i19 << 4) | i12;
                                                    iArr3[i19] = i12 | (i17 << 4);
                                                } else {
                                                    i19++;
                                                }
                                            }
                                        }
                                    }
                                    i19 = cVar2.c + i11;
                                    i18++;
                                }
                            }
                            i17++;
                        }
                    }
                    i17 = cVar4.c + i10;
                }
            }
        }

        public static f a(ArrayDeque arrayDeque, int i10, boolean z10) {
            f fVar;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = (f) it.next();
                if (fVar.f5882a == i10 && fVar.c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                int i11 = fVar2.f5883b;
                fVar2.f5883b = z10 ? i11 - 1 : i11 + 1;
            }
            return fVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<T> {
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f5882a;

        /* renamed from: b  reason: collision with root package name */
        public int f5883b;
        public final boolean c;

        public f(int i10, int i11, boolean z10) {
            this.f5882a = i10;
            this.f5883b = i11;
            this.c = z10;
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public int f5884a;

        /* renamed from: b  reason: collision with root package name */
        public int f5885b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f5886d;

        public g() {
        }

        public g(int i10, int i11) {
            this.f5884a = 0;
            this.f5885b = i10;
            this.c = 0;
            this.f5886d = i11;
        }
    }

    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public int f5887a;

        /* renamed from: b  reason: collision with root package name */
        public int f5888b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f5889d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5890e;
    }
}
