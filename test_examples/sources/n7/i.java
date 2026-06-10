package n7;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class i extends a1.c {
    public static final <T> List<T> Z1(T[] tArr) {
        v7.g.f(tArr, "<this>");
        List<T> asList = Arrays.asList(tArr);
        v7.g.e(asList, "asList(this)");
        return asList;
    }

    public static final void a2(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        v7.g.f(iArr, "<this>");
        v7.g.f(iArr2, "destination");
        System.arraycopy(iArr, i11, iArr2, i10, i12 - i11);
    }

    public static final void b2(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        v7.g.f(objArr, "<this>");
        v7.g.f(objArr2, "destination");
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
    }

    public static /* synthetic */ void c2(int[] iArr, int[] iArr2, int i10, int i11) {
        if ((i11 & 8) != 0) {
            i10 = iArr.length;
        }
        a2(0, 0, i10, iArr, iArr2);
    }

    public static /* synthetic */ void d2(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        b2(objArr, objArr2, i10, i11, i12);
    }

    public static final float[] e2(float[] fArr, int i10, int i11) {
        a1.c.n0(i11, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i10, i11);
        v7.g.e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static final Object[] f2(int i10, int i11, Object[] objArr) {
        v7.g.f(objArr, "<this>");
        a1.c.n0(i11, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        v7.g.e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static final void g2(int i10, int i11, Object[] objArr) {
        v7.g.f(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, (Object) null);
    }

    public static void h2(Object[] objArr, kotlinx.coroutines.internal.r rVar) {
        int length = objArr.length;
        v7.g.f(objArr, "<this>");
        Arrays.fill(objArr, 0, length, rVar);
    }
}
