package n7;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class h extends a<Integer> implements RandomAccess {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int[] f16124i;

    public h(int[] iArr) {
        this.f16124i = iArr;
    }

    @Override // kotlin.collections.AbstractCollection
    public final int c() {
        return this.f16124i.length;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f16124i;
        v7.g.f(iArr, "<this>");
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (intValue == iArr[i10]) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
            return false;
        }
        return true;
    }

    @Override // n7.a, java.util.List
    public final Object get(int i10) {
        return Integer.valueOf(this.f16124i[i10]);
    }

    @Override // n7.a, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f16124i;
        v7.g.f(iArr, "<this>");
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (intValue == iArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f16124i.length == 0;
    }

    @Override // n7.a, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f16124i;
        v7.g.f(iArr, "<this>");
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i10 = length - 1;
            if (intValue == iArr[length]) {
                return length;
            }
            if (i10 < 0) {
                return -1;
            }
            length = i10;
        }
    }
}
