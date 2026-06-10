package f9;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import n7.a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f10973a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10974b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10975d;

    /* renamed from: e  reason: collision with root package name */
    public final List<Integer> f10976e;

    public a(int... iArr) {
        int i10;
        int i11;
        List<Integer> list;
        v7.g.f(iArr, "numbers");
        this.f10973a = iArr;
        Integer n22 = kotlin.collections.b.n2(iArr, 0);
        if (n22 != null) {
            i10 = n22.intValue();
        } else {
            i10 = -1;
        }
        this.f10974b = i10;
        Integer n23 = kotlin.collections.b.n2(iArr, 1);
        if (n23 != null) {
            i11 = n23.intValue();
        } else {
            i11 = -1;
        }
        this.c = i11;
        Integer n24 = kotlin.collections.b.n2(iArr, 2);
        this.f10975d = n24 != null ? n24.intValue() : -1;
        if (iArr.length > 3) {
            if (iArr.length <= 1024) {
                list = kotlin.collections.c.L2(new a.d(new n7.h(iArr), 3, iArr.length));
            } else {
                throw new IllegalArgumentException(androidx.activity.e.h(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
            }
        } else {
            list = EmptyList.f12981i;
        }
        this.f10976e = list;
    }

    public final boolean a(int i10, int i11, int i12) {
        int i13 = this.f10974b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.c;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.f10975d >= i12;
    }

    public final boolean b(a aVar) {
        v7.g.f(aVar, "ourVersion");
        int i10 = this.c;
        int i11 = aVar.c;
        int i12 = aVar.f10974b;
        int i13 = this.f10974b;
        if (i13 == 0) {
            if (i12 == 0 && i10 == i11) {
                return true;
            }
        } else if (i13 == i12 && i10 <= i11) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj != null && v7.g.a(getClass(), obj.getClass())) {
            a aVar = (a) obj;
            if (this.f10974b == aVar.f10974b && this.c == aVar.c && this.f10975d == aVar.f10975d && v7.g.a(this.f10976e, aVar.f10976e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f10974b;
        int i11 = (i10 * 31) + this.c + i10;
        int i12 = (i11 * 31) + this.f10975d + i11;
        return this.f10976e.hashCode() + (i12 * 31) + i12;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int[] iArr = this.f10973a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            if (!(i11 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList.isEmpty() ? "unknown" : kotlin.collections.c.t2(arrayList, ".", null, null, null, 62);
    }
}
