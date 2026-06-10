package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
class R2 extends AbstractC0345e implements Consumer, Iterable {

    /* renamed from: e  reason: collision with root package name */
    protected Object[] f12374e = new Object[1 << 4];

    /* renamed from: f  reason: collision with root package name */
    protected Object[][] f12375f;

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        long length;
        int i10 = this.f12456b;
        Object[] objArr = this.f12374e;
        if (i10 == objArr.length) {
            if (this.f12375f == null) {
                Object[][] objArr2 = new Object[8];
                this.f12375f = objArr2;
                this.f12457d = new long[8];
                objArr2[0] = objArr;
            }
            int i11 = this.c;
            int i12 = i11 + 1;
            Object[][] objArr3 = this.f12375f;
            if (i12 >= objArr3.length || objArr3[i12] == null) {
                if (i11 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr3[i11].length + this.f12457d[i11];
                }
                s(length + 1);
            }
            this.f12456b = 0;
            int i13 = this.c + 1;
            this.c = i13;
            this.f12374e = this.f12375f[i13];
        }
        Object[] objArr4 = this.f12374e;
        int i14 = this.f12456b;
        this.f12456b = i14 + 1;
        objArr4[i14] = obj;
    }

    @Override // j$.util.stream.AbstractC0345e
    public final void clear() {
        Object[][] objArr = this.f12375f;
        if (objArr != null) {
            this.f12374e = objArr[0];
            int i10 = 0;
            while (true) {
                Object[] objArr2 = this.f12374e;
                if (i10 >= objArr2.length) {
                    break;
                }
                objArr2[i10] = null;
                i10++;
            }
            this.f12375f = null;
            this.f12457d = null;
        } else {
            for (int i11 = 0; i11 < this.f12456b; i11++) {
                this.f12374e[i11] = null;
            }
        }
        this.f12456b = 0;
        this.c = 0;
    }

    @Override // j$.util.function.Consumer
    public final Consumer e(Consumer consumer) {
        consumer.getClass();
        return new j$.util.concurrent.u(3, this, consumer);
    }

    public void forEach(Consumer consumer) {
        for (int i10 = 0; i10 < this.c; i10++) {
            for (Object obj : this.f12375f[i10]) {
                consumer.accept(obj);
            }
        }
        for (int i11 = 0; i11 < this.f12456b; i11++) {
            consumer.accept(this.f12374e[i11]);
        }
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.d0.i(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(long j2) {
        long length;
        Object[][] objArr;
        int i10;
        int i11 = this.c;
        if (i11 == 0) {
            length = this.f12374e.length;
        } else {
            length = this.f12375f[i11].length + this.f12457d[i11];
        }
        if (j2 <= length) {
            return;
        }
        if (this.f12375f == null) {
            Object[][] objArr2 = new Object[8];
            this.f12375f = objArr2;
            this.f12457d = new long[8];
            objArr2[0] = this.f12374e;
        }
        while (true) {
            i11++;
            if (j2 <= length) {
                return;
            }
            Object[][] objArr3 = this.f12375f;
            if (i11 >= objArr3.length) {
                int length2 = objArr3.length * 2;
                this.f12375f = (Object[][]) Arrays.copyOf(objArr3, length2);
                this.f12457d = Arrays.copyOf(this.f12457d, length2);
            }
            int i12 = this.f12455a;
            if (i11 != 0 && i11 != 1) {
                i12 = Math.min((i12 + i11) - 1, 30);
            }
            int i13 = 1 << i12;
            this.f12375f[i11] = new Object[i13];
            long[] jArr = this.f12457d;
            jArr[i11] = jArr[i11 - 1] + objArr[i10].length;
            length += i13;
        }
    }

    @Override // java.lang.Iterable
    public Spliterator spliterator() {
        return new I2(this, 0, this.c, 0, this.f12456b);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        forEach(new C0325a(8, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }
}
