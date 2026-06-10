package kotlin.collections;

import ga.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import n7.f;
import n7.i;
import n7.s;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public class b extends i {

    /* loaded from: classes.dex */
    public static final class a implements h<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object[] f12991a;

        public a(Object[] objArr) {
            this.f12991a = objArr;
        }

        @Override // ga.h
        public final Iterator<T> iterator() {
            return m0.b.K0(this.f12991a);
        }
    }

    public static final <T> h<T> i2(T[] tArr) {
        return tArr.length == 0 ? ga.d.f11285a : new a(tArr);
    }

    public static final boolean j2(long j2, long[] jArr) {
        g.f(jArr, "<this>");
        return o2(j2, jArr) >= 0;
    }

    public static final ArrayList k2(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> T l2(T[] tArr) {
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    public static final <T> T m2(T[] tArr) {
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static final Integer n2(int[] iArr, int i10) {
        g.f(iArr, "<this>");
        if (i10 >= 0 && i10 <= iArr.length - 1) {
            return Integer.valueOf(iArr[i10]);
        }
        return null;
    }

    public static final int o2(long j2, long[] jArr) {
        g.f(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j2 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int p2(Object obj, Object[] objArr) {
        g.f(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (g.a(obj, objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static String q2(Object[] objArr, String str, String str2, String str3, l lVar, int i10) {
        int i11;
        String str4;
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) != 0) {
            str3 = "";
        }
        if ((i10 & 8) != 0) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        if ((i10 & 16) != 0) {
            str4 = "...";
        } else {
            str4 = null;
        }
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        g.f(str, "separator");
        g.f(str2, "prefix");
        g.f(str3, "postfix");
        g.f(str4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i12 = 0;
        for (Object obj : objArr) {
            i12++;
            if (i12 > 1) {
                sb.append((CharSequence) str);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            a1.b.k(sb, obj, lVar);
        }
        if (i11 >= 0 && i12 > i11) {
            sb.append((CharSequence) str4);
        }
        sb.append((CharSequence) str3);
        String sb2 = sb.toString();
        g.e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final <T> T r2(T[] tArr) {
        boolean z10;
        if (tArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return tArr[tArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> T s2(T[] tArr) {
        g.f(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length == 1) {
                return tArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> List<T> t2(T[] tArr, Comparator<? super T> comparator) {
        boolean z10;
        g.f(tArr, "<this>");
        if (tArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            tArr = (T[]) Arrays.copyOf(tArr, tArr.length);
            g.e(tArr, "copyOf(this, size)");
            if (tArr.length > 1) {
                Arrays.sort(tArr, comparator);
            }
        }
        return i.Z1(tArr);
    }

    public static final void u2(LinkedHashSet linkedHashSet, Object[] objArr) {
        g.f(objArr, "<this>");
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }

    public static final int[] v2(Integer[] numArr) {
        g.f(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = numArr[i10].intValue();
        }
        return iArr;
    }

    public static final <T> List<T> w2(T[] tArr) {
        g.f(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new f(tArr, false));
            }
            return a1.c.N0(tArr[0]);
        }
        return EmptyList.f12981i;
    }

    public static final <T> Set<T> x2(T[] tArr) {
        g.f(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(m0.b.O0(tArr.length));
                u2(linkedHashSet, tArr);
                return linkedHashSet;
            }
            return a1.c.v1(tArr[0]);
        }
        return EmptySet.f12983i;
    }

    public static final s y2(Object[] objArr) {
        g.f(objArr, "<this>");
        return new s(new ArraysKt___ArraysKt$withIndex$1(objArr));
    }

    public static final ArrayList z2(Object[] objArr, Object[] objArr2) {
        g.f(objArr, "<this>");
        g.f(objArr2, "other");
        int min = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(new Pair(objArr[i10], objArr2[i10]));
        }
        return arrayList;
    }
}
