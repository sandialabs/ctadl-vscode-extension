package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.u;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class r extends c<Float> implements RandomAccess, r0 {

    /* renamed from: j  reason: collision with root package name */
    public float[] f4932j;

    /* renamed from: k  reason: collision with root package name */
    public int f4933k;

    static {
        new r(0, new float[0]).f4845i = false;
    }

    public r() {
        this(0, new float[10]);
    }

    public r(int i10, float[] fArr) {
        this.f4932j = fArr;
        this.f4933k = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f4933k)) {
            StringBuilder o10 = a4.b.o("Index:", i10, ", Size:");
            o10.append(this.f4933k);
            throw new IndexOutOfBoundsException(o10.toString());
        }
        float[] fArr = this.f4932j;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f4932j, i10, fArr2, i10 + 1, this.f4933k - i10);
            this.f4932j = fArr2;
        }
        this.f4932j[i10] = floatValue;
        this.f4933k++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        c();
        Charset charset = u.f4942a;
        collection.getClass();
        if (!(collection instanceof r)) {
            return super.addAll(collection);
        }
        r rVar = (r) collection;
        int i10 = rVar.f4933k;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f4933k;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f4932j;
            if (i12 > fArr.length) {
                this.f4932j = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(rVar.f4932j, 0, this.f4932j, this.f4933k, rVar.f4933k);
            this.f4933k = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void d(float f10) {
        c();
        int i10 = this.f4933k;
        float[] fArr = this.f4932j;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f4932j = fArr2;
        }
        float[] fArr3 = this.f4932j;
        int i11 = this.f4933k;
        this.f4933k = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f4933k != rVar.f4933k) {
                return false;
            }
            float[] fArr = rVar.f4932j;
            for (int i10 = 0; i10 < this.f4933k; i10++) {
                if (Float.floatToIntBits(this.f4932j[i10]) != Float.floatToIntBits(fArr[i10])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final void g(int i10) {
        if (i10 >= 0 && i10 < this.f4933k) {
            return;
        }
        StringBuilder o10 = a4.b.o("Index:", i10, ", Size:");
        o10.append(this.f4933k);
        throw new IndexOutOfBoundsException(o10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return Float.valueOf(this.f4932j[i10]);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4933k; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f4932j[i11]);
        }
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.u.c
    public final u.c k(int i10) {
        if (i10 >= this.f4933k) {
            return new r(this.f4933k, Arrays.copyOf(this.f4932j, i10));
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        c();
        g(i10);
        float[] fArr = this.f4932j;
        float f10 = fArr[i10];
        if (i10 < this.f4933k - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f4933k--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f4933k; i10++) {
            if (obj.equals(Float.valueOf(this.f4932j[i10]))) {
                float[] fArr = this.f4932j;
                System.arraycopy(fArr, i10 + 1, fArr, i10, (this.f4933k - i10) - 1);
                this.f4933k--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f4932j;
        System.arraycopy(fArr, i11, fArr, i10, this.f4933k - i11);
        this.f4933k -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        c();
        g(i10);
        float[] fArr = this.f4932j;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4933k;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Float) obj).floatValue());
        return true;
    }
}
